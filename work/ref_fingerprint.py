#!/usr/bin/env python3
"""引用向量指纹：jar 混淆类 ↔ 源码类 候选配对（标签传播法）。

信号（加权合成）：
  1. 已知锚点引用：jar 类引用的**已识别** obf 类 → 对应 src 身份集合
     源码类引用的 src 类名集合 → 交集大小（强信号，随识别推进自动增强）
  2. MC API import 交集：双方 net.minecraft.* 导入集 Jaccard（强信号）
  3. 结构：方法数/字段数/构造参数（弱信号，仅做 tie-break）

输出 work/ref_candidates.json：{obf: [{src, score, why}...]}（top3）
"""
import os, re, json
from collections import defaultdict

JAR = 'work/out/com/github/epsilon'
SRC = '旧版本的源代码'

cm = json.load(open('work/class_map.json', encoding='utf-8'))
sig = {s['name']: s for s in json.load(open('work/obf_class_signatures.json', encoding='utf-8'))}
robust = json.load(open('work/super_robust.json', encoding='utf-8'))

# src 类索引
src_files = {}
for b, ds, fs in os.walk(SRC):
    for f in fs:
        if f.endswith('.java'):
            src_files.setdefault(f[:-5], os.path.join(b, f))
src_names = set(src_files)

word_re = re.compile(r'\b([A-Za-z_$][\w$]*)\b')
mc_imp_re = re.compile(r'import\s+(net\.minecraft\.[\w.]+);')
imp_re = re.compile(r'import\s+([\w.$]+);')

src_feat = {}
for n, p in src_files.items():
    txt = open(p, encoding='utf-8', errors='replace').read()
    refs = set(w for w in word_re.findall(txt) if w in src_names and w != n)
    mc = set(mc_imp_re.findall(txt))
    n_methods = len(re.findall(r'^\s{4}(?:public|private|protected)\s', txt, re.M))
    src_feat[n] = {'refs': refs, 'mc': mc, 'lines': len(txt.splitlines()), 'meth': n_methods}

# jar 特征
jar_feat = {}
for n, s in sig.items():
    p = os.path.join(JAR, n + '.java')
    txt = open(p, encoding='utf-8', errors='replace').read() if os.path.exists(p) else ''
    anchored = set()
    for r in (s.get('refs') or []):
        if r in cm:
            anchored.add(cm[r]['identity'].split('(')[0].split('$')[-1])
    mc = set(mc_imp_re.findall(txt))
    jar_feat[n] = {'anchored': anchored, 'mc': mc, 'lines': s['sizeLines'],
                   'kind': s['kind'], 'super': robust.get(n, {}).get('super')}

out = {}
for n, jf in jar_feat.items():
    if n in cm:
        continue
    scored = []
    for s, sf in src_feat.items():
        mc_int = jf['mc'] & sf['mc']
        mc_j = len(mc_int) / max(1, len(jf['mc'] | sf['mc'])) if (jf['mc'] or sf['mc']) else 0
        anc_int = jf['anchored'] & sf['refs']
        # 加权
        sc = 3.0 * len(anc_int) + 4.0 * mc_j
        if len(mc_int) >= 3:
            sc += 1.0
        if sc <= 0:
            continue
        why = []
        if anc_int:
            why.append('锚点引用:' + ','.join(sorted(anc_int)[:5]))
        if mc_int:
            why.append(f'MCimport:{len(mc_int)}')
        scored.append({'src': s, 'score': round(sc, 2), 'why': '; '.join(why), 'mcj': round(mc_j, 3)})
    scored.sort(key=lambda x: -x['score'])
    # 只保留有明显区分度的
    if scored and scored[0]['score'] >= 3.0:
        out[n] = scored[:3]

json.dump(out, open('work/ref_candidates.json', 'w'), ensure_ascii=False, indent=1)
strong = [k for k, v in out.items() if v[0]['score'] >= 7]
print(f'候选类 {len(out)} | 强候选(score>=7) {len(strong)}')
for k in strong[:15]:
    c = out[k][0]
    print(f"  {k:5s} -> {c['src']:30s} score={c['score']:<5} {c['why']}")
