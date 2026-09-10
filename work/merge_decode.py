#!/usr/bin/env python3
"""合并 work/decode/*.json 到 work/class_map.json。

- 冲突（同一 obf 不同 identity）：保留置信更高者；同级记录 conflict 到 work/decode_conflicts.json
- 已存在键：仅在置信更高时更新（并记 note）
用法：python work/merge_decode.py [--dry]
"""
import json, glob, os, re, sys
from collections import Counter

ORDER = {'A': 5, 'A-': 4, 'B': 3, 'C': 2, '?': 1}

# src 类名集合（含内嵌类），用于验证 identity 是否可本地核实
SRC = '旧版本的源代码'
SRC_NAMES = set()
_SELF = os.path.dirname(os.path.abspath(__file__))
for _b, _ds, _fs in os.walk(os.path.join(_SELF, '..', SRC)):
    for _f in _fs:
        if _f.endswith('.java'):
            SRC_NAMES.add(_f[:-5])
            try:
                _t = open(os.path.join(_b, _f), encoding='utf-8', errors='replace').read()
                for _m in re.finditer(r'(?:class|interface|enum|record)[ \t]+(\w+)', _t):
                    SRC_NAMES.add(_m.group(1))
            except Exception:
                pass

# 官方未混淆 26.2 jar 类名（同为合法身份来源）
_OFF = os.path.join(_SELF, '..', 'work', 'official26', 'com', 'github', 'epsilon')
if os.path.isdir(_OFF):
    for _b, _ds, _fs in os.walk(_OFF):
        if os.sep + 'mixins' in _b + os.sep:
            continue
        for _f in _fs:
            if _f.endswith('.java'):
                SRC_NAMES.add(_f[:-5])

def verifiable(identity):
    base = identity.split('$')[0].split('.')[0].split('(')[0].strip()
    return base in SRC_NAMES
dry = '--dry' in sys.argv
cm = json.load(open('work/class_map.json', encoding='utf-8'))
batch_files = sorted(glob.glob('work/decode/*.json'))
new, upd, conflicts, skipped = [], [], [], []
rejected_again = []
role_notes = []
# 被否决条目：若 agent 又给出相同旧 identity，则跳过（不许复活）
_rej = json.load(open('work/rejected_mappings.json', encoding='utf-8')) if os.path.exists('work/rejected_mappings.json') else []
REJECTED = {(r['obf'], r['old']) for r in _rej if 'obf' in r and 'old' in r}

for f in batch_files:
    try:
        d = json.load(open(f, encoding='utf-8'))
    except Exception as e:
        print('跳过(解析失败)', f, e); continue
    src_tag = os.path.basename(f)[:-5]
    for k, v in (d.get('results') or {}).items():
        idn = v.get('identity'); conf = v.get('conf', 'C')
        if (k, idn) in REJECTED:
            rejected_again.append(k); continue
        if not idn:
            continue
        # 门控：无本地 src 佐证的推测名不得作为身份写库，降为角色记录
        if idn.startswith('Mixin'):   # Mixin* 不是我方类的身份
            role_notes.append({'obf': k, 'claimed': idn, 'conf': conf, 'from': os.path.basename(f)[:-5],
                               'reason': 'Mixin* 非身份（误配）', 'evidence': (v.get('evidence') or '')[:120]})
            continue
        if conf == 'C':   # C 级=仅角色推测 → 一律不入库
            role_notes.append({'obf': k, 'claimed': idn, 'conf': conf,
                               'from': os.path.basename(f)[:-5], 'reason': 'C 级推测不入库',
                               'evidence': (v.get('evidence') or '')[:150]})
            continue
        if not verifiable(idn):
            role_notes.append({'obf': k, 'claimed': idn, 'conf': conf,
                               'from': os.path.basename(f)[:-5], 'evidence': (v.get('evidence') or '')[:200]})
            continue
        ev = (v.get('evidence') or '')[:600]
        if k in cm:
            if cm[k].get("pinned"):
                skipped.append(k); continue
            old = cm[k]
            if ORDER.get(conf, 0) > ORDER.get(old.get('conf', '?'), 0) and old['identity'] != idn:
                conflicts.append({'obf': k, 'kept': old['identity'], 'kept_conf': old['conf'],
                                  'dropped': idn, 'dropped_conf': conf, 'from': src_tag})
                skipped.append(k)
            elif old['identity'] == idn and ORDER.get(conf, 0) > ORDER.get(old.get('conf', '?'), 0):
                cm[k]['conf'] = conf
                cm[k]['evidence'] = (cm[k]['evidence'] + ' || 复核(' + src_tag + '): ' + ev)[:900]
                upd.append(k)
            else:
                skipped.append(k)
        else:
            cm[k] = {'identity': idn, 'kind': v.get('kind', 'class'), 'conf': conf, 'evidence': ev}
            new.append(k)

# 身份唯一性检查：同一 identity 不应映射到多个 obf
from collections import defaultdict as _dd
_byid = _dd(list)
for k, v in cm.items():
    _byid[v['identity']].append(k)
dups = {i: ks for i, ks in _byid.items() if len(ks) > 1}
json.dump(dups, open('work/identity_duplicates.json', 'w'), ensure_ascii=False, indent=1)
json.dump(conflicts, open('work/decode_conflicts.json', 'w'), ensure_ascii=False, indent=1)
if role_notes:
    _prev = json.load(open('work/role_notes.json', encoding='utf-8')) if os.path.exists('work/role_notes.json') else []
    _seen = {(r['obf'], r['claimed']) for r in _prev}
    _prev += [r for r in role_notes if (r['obf'], r['claimed']) not in _seen]
    json.dump(_prev, open('work/role_notes.json', 'w'), ensure_ascii=False, indent=1)
if not dry:
    json.dump(cm, open('work/class_map.json', 'w'), ensure_ascii=False, indent=1)
print(f'新增 {len(new)} | 更新 {len(upd)} | 冲突 {len(conflicts)} | 跳过/一致 {len(skipped)} | 否决复活 {len(rejected_again)} | 推测名降级 {len(role_notes)}')
print('置信分布:', dict(Counter(v['conf'] for v in cm.values())), '总', len(cm))
if conflicts:
    print('冲突样例:', conflicts[:5])
if dups:
    print('⚠️ 身份重复:', {i: ks for i, ks in list(dups.items())[:8]})
