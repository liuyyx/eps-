#!/usr/bin/env python3
"""官方 26.2 jar（未混淆）↔ 我方 26.2 jar（混淆）全类结构指纹匹配。

特征（混淆不变）：
  - MC imports 集合（明文）
  - 字段类型序列中出现的 java/MC 类型（String/List/Map/int/float/Color/Vec3/...）
  - 方法数 / 字段数 / extends 的 MC 类
评分：MC imports Jaccard 为主，结构规模做筛选。
用法：python work/official_match.py [--verify]
  --verify: 只在已识别的 469 个上跑，报告准确率
"""
import os, re, json, sys
from collections import Counter

OFF = 'work/official26/com/github/epsilon'
MY = 'work/out/com/github/epsilon'
mc_re = re.compile(r'import\s+(net\.minecraft\.[\w.]+);')
field_re = re.compile(r'^\s{4}(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?([\w$.<>,\[\]]+)\s+(\w+)\s*[;=]', re.M)
meth_re = re.compile(r'\n    (?:(?:public|private|protected|static|final|synchronized|abstract|native)\s+)+[\w<>\[\],.$?]+\s+(\w+)\s*\(')
JAVA_TYPES = {'String','List','Map','Set','int','long','float','double','boolean','byte','short','char','Integer','Long','Float','Double','Boolean','Object','ArrayList','HashMap','HashSet','Deque','Queue','Optional','UUID','Path','File','Pattern','Color','Vec3','AABB','BlockPos','ItemStack','Level','Player','Entity','Identifier','Component','Matrix4f','Vector3f','ByteBuffer','Consumer','Supplier','Function','Predicate'}

def feats(path):
    t = open(path, encoding='utf-8', errors='replace').read()
    mc = {m.split('.')[-1] for m in mc_re.findall(t)}
    fields = field_re.findall(t)
    ftypes = {f[0].split('<')[0].strip() for f in fields if f[0].split('<')[0].strip() in JAVA_TYPES}
    fmeth = meth_re.findall(t)
    m = re.search(r'\bclass\s+\w+([^{]*)\{', t)
    ext = ''
    if m:
        e = re.search(r'extends\s+([\w.]+)', m.group(1))
        ext = e.group(1).split('.')[-1] if e else ''
    return {'mc': mc, 'ftypes': ftypes, 'nf': len(fields), 'nm': len(fmeth), 'ext': ext,
            'lines': len(t.splitlines())}

# 官方
off = {}
for b, ds, fs in os.walk(OFF):
    for f in fs:
        if f.endswith('.java'):
            off[f[:-5]] = feats(os.path.join(b, f))
# 我方
my = {}
for f in os.listdir(MY):
    if f.endswith('.java') and os.path.isfile(os.path.join(MY, f)):
        my[f[:-5]] = feats(os.path.join(MY, f))

cm = json.load(open('work/class_map.json', encoding='utf-8'))
known = {k: v['identity'].split('$')[0].split('.').pop().strip() for k, v in cm.items() if not k.startswith('mixins/')}
known_true = set(known.values())

verify = '--verify' in sys.argv
targets = {k: v for k, v in my.items() if k in known} if verify else {k: v for k, v in my.items() if k not in known and k not in off}
pool = dict(off) if verify else {k: v for k, v in off.items() if k not in known_true}

res = []
for obf, mf in targets.items():
    best = []
    for on, of in pool.items():
        inter = mf['mc'] & of['mc']
        if not inter and (mf['mc'] or of['mc']):
            continue
        j = len(inter) / max(1, len(mf['mc'] | of['mc']))
        sc = j * 3 + (2 if mf['ext'] == of['ext'] and mf['ext'] else 0) + len(mf['ftypes'] & of['ftypes']) * 0.15
        # 规模过滤
        if of['nm'] and abs(mf['nm'] - of['nm']) / max(1, of['nm']) > 0.6:
            continue
        if of['nf'] and abs(mf['nf'] - of['nf']) / max(1, of['nf']) > 0.8:
            continue
        if sc > 0:
            best.append((round(sc, 3), on, round(j, 3)))
    best.sort(reverse=True)
    if best:
        res.append((obf, best[:3]))

if verify:
    hit = sum(1 for obf, b in res if known.get(obf) == b[0][1])
    print(f'验证集 {len(res)} 个已识别类的匹配结果: top1 命中 {hit} ({hit*100//max(1,len(res))}%)')
    for obf, b in res[:15]:
        mark = '✓' if known.get(obf) == b[0][1] else '✗'
        print(f'  {mark} {obf:6s} 真值 {known.get(obf,"?"):26s} -> top1 {b[0][1]}({b[0][2]}) top2 {b[1][1] if len(b)>1 else "-"}')
else:
    json.dump({o: [{'name': n, 'score': s, 'jac': j} for s, n, j in b] for o, b in res},
              open('work/official_match.json', 'w'), ensure_ascii=False, indent=1)
    strong = [(o, b[0]) for o, b in res if b[0][0] >= 3.0]
    print(f'候选 {len(res)} | 强候选(score>=3) {len(strong)}')
    for o, (s, n, j) in strong[:25]:
        print(f'  {o:6s} -> {n:30s} score={s} jac={j}')
