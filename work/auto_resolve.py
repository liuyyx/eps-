#!/usr/bin/env python3
"""身份重复自动裁决：同一 identity 被多个 obf 占用时保留最优者。

规则：conf 高者胜（A>A->B>C）；同级则证据更具体者胜（长度+含 src_path/字段模式）。
被裁者移出 class_map，写入 work/decode_conflicts.json 供终审。
pinned 条目视为最高优先（人工已裁决）。
"""
import json, os, re

ORDER = {'A': 5, 'A-': 4, 'B': 3, 'C': 2, '?': 1}
cm = json.load(open('work/class_map.json', encoding='utf-8'))
conf = json.load(open('work/decode_conflicts.json', encoding='utf-8')) if os.path.exists('work/decode_conflicts.json') else []


def specificity(v):
    ev = v.get('evidence') or ''
    sc = len(ev)
    for kw in ('字段', '逐一', '同构', '唯一', 'record', 'MC imports', '常量'):
        if kw in ev:
            sc += 40
    return sc


from collections import defaultdict
groups = defaultdict(list)
for k, v in cm.items():
    groups[v['identity']].append(k)

resolved, dropped = [], []
for idn, keys in groups.items():
    if len(keys) < 2:
        continue
    keys.sort(key=lambda k: (1 if cm[k].get('pinned') else 0, ORDER.get(cm[k]['conf'], 0), specificity(cm[k])), reverse=True)
    keep, losers = keys[0], keys[1:]
    for l in losers:
        dropped.append({'identity': idn, 'kept': keep, 'kept_conf': cm[keep]['conf'], 'kept_ev': (cm[keep].get('evidence') or '')[:150],
                        'dropped': l, 'dropped_conf': cm[l]['conf'], 'dropped_ev': (cm[l].get('evidence') or '')[:150]})
        del cm[l]
    resolved.append({'identity': idn, 'kept': keep, 'dropped': losers})

# 默认只报告，不修改 class_map（避免启发式误删）；--apply 才落盘
if '--apply' in __import__('sys').argv:
    json.dump(cm, open('work/class_map.json', 'w'), ensure_ascii=False, indent=1)
    conf.extend(dropped)
    json.dump(conf, open('work/decode_conflicts.json', 'w'), ensure_ascii=False, indent=1)
json.dump(resolved, open('work/identity_duplicates.json', 'w'), ensure_ascii=False, indent=1)
print(f'重复身份组 {len(resolved)}（仅报告，未改动；--apply 才落盘）')
for r in resolved[:10]:
    print(f"   {r['identity']:28s} 保留 {r['kept']}({cm[r['kept']]['conf']}) 移出 {r['dropped']}")
print('总条目:', len(cm))
