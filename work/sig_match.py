#!/usr/bin/env python3
"""官方↔我方 方法类型签名匹配（混淆不变特征）。

混淆只改类名/方法名，不改类型。故：
  特征 = 类中所有方法的「返回类型 + 参数类型」多重集（仅保留 java/MC 类型，剔除 epsilon 自有类）
另加：注解名集合（@EventHandler/@Inject 等运行时保留）、字段类型的 java/MC 类型集合。
用法: python work/sig_match.py [--verify]
"""
import os, re, json, sys
from collections import Counter

OFF = 'work/official26/com/github/epsilon'
MY = 'work/out/com/github/epsilon'
JAVA_MC = re.compile(r'^(?:[A-Z][\w$]*|int|long|float|double|boolean|byte|short|char|void)$')
METH = re.compile(r'(?:public|private|protected)\s+(?:static\s+)?(?:final\s+)?([\w<>\[\],.$?]+)\s+(\w+)\s*\(([^)]*)\)')
ANN = re.compile(r'@(\w+)')

my_classes = {f[:-5] for f in os.listdir(MY) if f.endswith('.java') and os.path.isfile(os.path.join(MY, f))}
off_classes = set()
for b, ds, fs in os.walk(OFF):
    for f in fs:
        if f.endswith('.java'):
            off_classes.add(f[:-5])


def simple(t):
    t = t.split('<')[0].strip()
    return t.split('.')[-1].replace('[]', '')


def feats(path, own):
    """own = 本侧自有类名集合（用于剔除）"""
    t = open(path, encoding='utf-8', errors='replace').read()
    sigs = Counter()
    for ret, name, params in METH.findall(t):
        ps = []
        for p in params.split(','):
            p = p.strip()
            if not p or p == 'Object[] objectArray':
                continue
            toks = p.split()
            if len(toks) >= 1:
                ps.append(simple(toks[0]))
        r = simple(ret)
        sigs[(r, tuple(ps))] += 1
    # 只保留不含自有类名的签名
    clean = Counter()
    for (r, ps), c in sigs.items():
        if r in own or any(p in own for p in ps):
            continue
        clean[(r, tuple(ps))] += 1
    anns = {a for a in ANN.findall(t) if a not in ('Override', 'Deprecated', 'SuppressWarnings')}
    nf = len(re.findall(r'^\s{4}(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?[\w$.<>,\[\]]+\s+\w+\s*[;=]', t, re.M))
    return {'sigs': clean, 'anns': anns, 'nf': nf, 'lines': len(t.splitlines())}


off = {}
for b, ds, fs in os.walk(OFF):
    for f in fs:
        if f.endswith('.java'):
            off[f[:-5]] = feats(os.path.join(b, f), off_classes)
my = {}
for f in os.listdir(MY):
    if f.endswith('.java') and os.path.isfile(os.path.join(MY, f)):
        my[f[:-5]] = feats(os.path.join(MY, f), my_classes)

cm = json.load(open('work/class_map.json', encoding='utf-8'))
known = {k: v['identity'].split('$')[0].split('.').pop().strip() for k, v in cm.items() if not k.startswith('mixins/')}
known_true = set(known.values())
verify = '--verify' in sys.argv

targets = {k: v for k, v in my.items() if k in known} if verify else {k: v for k, v in my.items() if k not in known}
pool = dict(off) if verify else {k: v for k, v in off.items() if k not in known_true}

res = []
for obf, mf in targets.items():
    scored = []
    for on, of in pool.items():
        inter = sum((mf['sigs'] & of['sigs']).values())
        if inter == 0 and not (mf['anns'] & of['anns']):
            continue
        union = sum((mf['sigs'] | of['sigs']).values())
        j = inter / max(1, union)
        ann_j = len(mf['anns'] & of['anns']) / max(1, len(mf['anns'] | of['anns']))
        sc = j * 3 + ann_j * 0.5
        if of['nf'] and abs(mf['nf'] - of['nf']) / max(1, of['nf']) > 0.7:
            continue
        scored.append((round(sc, 3), on, round(j, 3), round(ann_j, 2), inter))
    scored.sort(reverse=True)
    if scored:
        res.append((obf, scored[:3]))

if verify:
    hit = sum(1 for obf, b in res if known.get(obf) == b[0][1])
    hit3 = sum(1 for obf, b in res if known.get(obf) in [x[1] for x in b])
    print(f'验证集 {len(res)} | top1 命中 {hit} ({hit*100//max(1,len(res))}%) | top3 {hit3} ({hit3*100//max(1,len(res))}%)')
    for obf, b in res[:12]:
        mark = '✓' if known.get(obf) == b[0][1] else ('~' if known.get(obf) in [x[1] for x in b] else '✗')
        print(f'  {mark} {obf:6s} 真值 {known.get(obf,"?"):24s} -> {b[0][1]}({b[0][2]},ann{b[0][3]},n{b[0][4]})')
else:
    json.dump({o: [{'name': n, 'score': s, 'jac': j, 'ann': a, 'n': c} for s, n, j, a, c in b] for o, b in res},
              open('work/sig_match.json', 'w'), ensure_ascii=False, indent=1)
    strong = [(o, b[0]) for o, b in res if b[0][0] >= 1.0]
    print(f'候选 {len(res)} | 强(score>=1.0) {len(strong)}')
    for o, (s, n, j, a, c) in strong[:20]:
        print(f'  {o:6s} -> {n:28s} score={s} sigjac={j} ann={a} 签名数={c}')
