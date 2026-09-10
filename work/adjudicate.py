#!/usr/bin/env python3
"""身份重复的证据裁决器。

对每个重复身份组，按候选与目标 src 类的匹配度评分：
  - 普通类：MC-import Jaccard
  - 枚举：常量覆盖率（jar 常量 ∩ src 枚举常量）/ |jar 常量|
判据：最高分 ≥ 1.5× 次高 且 最高 > 0.15 → 自动裁决（高者 pinned，低者移出并入黑名单）
否则标 needs_review，不改动。
"""
import os, re, json

JAR = 'work/out/com/github/epsilon'
SRC = '旧版本的源代码'
cm = json.load(open('work/class_map.json', encoding='utf-8'))
rej = json.load(open('work/rejected_mappings.json', encoding='utf-8'))
REJ = {(r['obf'], r['old']) for r in rej}

src_paths = {}
for b, ds, fs in os.walk(SRC):
    for f in fs:
        if f.endswith('.java'):
            src_paths.setdefault(f[:-5], os.path.join(b, f))


def mcs(t):
    return set(m.split('.')[-1] for m in re.findall(r'import\s+(net\.minecraft\.[\w.]+);', t))


def enum_sets(t):
    """jar 侧的枚举常量名（明文）"""
    return set(re.findall(r'public\s+static\s+final\s+/\*\s*enum\s*\*/\s+\w+\s+([A-Za-z_][\w]*)\s*;', t))


def src_enum_consts(text, enum_name=None):
    out = set()
    for m in re.finditer(r'enum\s+(\w+)\s*(?:implements[^{]*)?\{', text):
        if enum_name and m.group(1) != enum_name:
            continue
        seg = text[m.end():m.end() + 800]
        seg = re.split(r'[;}]', seg)[0]
        out |= {c for c in re.findall(r'\b([A-Z][A-Z_0-9]*)\b', seg)}
    return out


from collections import defaultdict
groups = defaultdict(list)
for k, v in cm.items():
    groups[v['identity']].append(k)

resolved, review = [], []
for idn, keys in groups.items():
    if len(keys) < 2:
        continue
    base = idn.split('$')[0].split('.')[0].split('(')[0].strip()
    sp = src_paths.get(base)
    scores = {}
    for k in keys:
        if cm[k].get('pinned'):
            scores[k] = (99.0, 'pinned')
            continue
        t = open(os.path.join(JAR, k + '.java'), encoding='utf-8', errors='replace').read()
        sc, why = 0.0, ''
        if sp:
            st = open(sp, encoding='utf-8', errors='replace').read()
            S, M = mcs(st), mcs(t)
            if S or M:
                j = len(S & M) / max(1, len(S | M))
                sc, why = j, f'Jaccard={j:.3f}'
        je = enum_sets(t)
        if je and sp:
            st = open(sp, encoding='utf-8', errors='replace').read()
            part = idn.split('$')[1] if '$' in idn else None
            se = src_enum_consts(st, part)
            if se:
                cov = len(je & se) / len(je)
                if cov > sc:
                    sc, why = cov, f'枚举覆盖={cov:.3f}'
        scores[k] = (sc, why)
    ordered = sorted(scores.items(), key=lambda x: -x[1][0])
    best, second = ordered[0], (ordered[1] if len(ordered) > 1 else (None, (0, '')))
    ok = best[1][0] >= 99 or (best[1][0] > 0.15 and best[1][0] >= 1.5 * second[1][0])
    if ok:
        keep, losers = best[0], [k for k, _ in ordered[1:]]
        for l in losers:
            del cm[l]
            rej.append({'obf': l, 'old': idn, 'old_conf': 'A',
                        'reason': f'[证据裁决] {keep} {best[1][1]} 优于 {l} {scores[l][1]}（目标 src {base}）'})
        cm[keep]['pinned'] = True
        cm[keep]['evidence'] = (cm[keep].get('evidence') or '') + f" || [证据裁决] {best[1][1]}"
        resolved.append({'identity': idn, 'kept': keep, 'why': best[1][1], 'dropped': losers})
    else:
        review.append({'identity': idn, 'keys': keys, 'scores': {k: v[1] for k, v in ordered}})

json.dump(cm, open('work/class_map.json', 'w'), ensure_ascii=False, indent=1)
json.dump(rej, open('work/rejected_mappings.json', 'w'), ensure_ascii=False, indent=1)
json.dump(review, open('work/needs_review.json', 'w'), ensure_ascii=False, indent=1)
print(f'自动裁决 {len(resolved)} 组 | 待人工复核 {len(review)} 组 | 总 {len(cm)}')
for r in resolved:
    print(f"   ✓ {r['identity']:26s} 保留 {r['kept']} ({r['why']}) 移出 {r['dropped']}")
for r in review:
    print(f"   ? {r['identity']:26s} {r['keys']} {r['scores']}")
