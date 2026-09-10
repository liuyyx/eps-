#!/usr/bin/env python3
"""明文串指纹配对：jar 混淆类 ↔ 26.1.2 源码类。

原理：部分字符串未加密（如 'epsilon_custom_sky'/'ISO-8859-1'/'toString'），
jar 类里的明文字面量与源码类里的字面量做双向 Jaccard，产出候选对。
输出 work/string_candidates.json：{obf: [{src, jac, common:[...]}...]}
"""
import os, re, json, sys
from collections import defaultdict

JAR = 'work/out/com/github/epsilon'
SRC = '旧版本的源代码'
JUNK = {'toString','valueOf','equals','hashCode','clone','iterator','length','String',
        'java.lang.String','name','value','values','ordinal','getClass','notify','wait',
        'main','apply','get','accept','test','run','call','of','empty','copyOf','format'}
IGNORE_PKG = ('com/github/slmpc', 'com/github/epsilon')  # 外部库仍收，仅作参考

str_re = re.compile(r'"((?:[^"\\\n]|\\.){2,80})"')

def literals(text):
    out = set()
    for m in str_re.finditer(text):
        v = m.group(1)
        if v.startswith(('\\u', '\\n', '\\t')) and len(v) < 6:
            continue
        if v in JUNK or len(v) < 3:
            continue
        if v.isdigit():
            continue
        out.add(v)
    return out

# jar 顶层类
jar = {}
for f in os.listdir(JAR):
    if not f.endswith('.java') or not os.path.isfile(os.path.join(JAR, f)):
        continue
    n = f[:-5]
    jar[n] = literals(open(os.path.join(JAR, f), encoding='utf-8', errors='replace').read())

# 源码类
src = {}
for b, ds, fs in os.walk(SRC):
    for f in fs:
        if not f.endswith('.java'):
            continue
        p = os.path.join(b, f)
        try:
            txt = open(p, encoding='utf-8', errors='replace').read()
        except Exception:
            continue
        src[f[:-5]] = literals(txt)

# 反向索引: 字面量 -> src 类
inv = defaultdict(set)
for s, ls in src.items():
    for l in ls:
        inv[l].add(s)

cm = json.load(open('work/class_map.json', encoding='utf-8'))
out = {}
for n, ls in jar.items():
    if n in cm or not ls:
        continue
    score = defaultdict(lambda: [0, []])
    for l in ls:
        for s in inv.get(l, ()):
            score[s][0] += 1
            score[s][1].append(l)
    cands = []
    for s, (c, common) in score.items():
        sl = src.get(s, set())
        jac = c / max(1, len(ls | sl))
        # 也记双边覆盖率，长串更值钱
        if c >= 2 or any(len(x) >= 12 for x in common):
            cands.append({'src': s, 'common': sorted(common)[:8], 'jac': round(jac, 3), 'n': c})
    cands.sort(key=lambda x: (-x['n'], -x['jac']))
    if cands:
        out[n] = cands[:3]

json.dump(out, open('work/string_candidates.json', 'w'), ensure_ascii=False, indent=1)
print(f'jar 顶层类 {len(jar)} | 源码类 {len(src)} | 产出候选 {len(out)}')
mult = sum(1 for v in out.values() if v and v[0]['n'] >= 3)
print(f'其中 top 候选 ≥3 共同串: {mult}')
for n in list(out)[:12]:
    c = out[n][0]
    print(f"  {n:5s} -> {c['src']:28s} n={c['n']} jac={c['jac']} {c['common'][:3]}")
