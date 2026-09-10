#!/usr/bin/env python3
"""生成 100 个验证批次：work/batches/batch_NNN.json

每批 8 个未识别 jar 顶层类，附：
  - 结构线索：kind/super/lines/refs/anchored_refs(已识别引用)/mc_imports
  - 预置候选：ref_candidates.json 的 top3（含得分与理由）
  - 强候选标记：候选 src 唯一命中该 jar 类时标记 unique=true
"""
import os, re, json, math

JAR = 'work/out/com/github/epsilon'
cm = json.load(open('work/class_map.json', encoding='utf-8'))
sig = {s['name']: s for s in json.load(open('work/obf_class_signatures.json', encoding='utf-8'))}
robust = json.load(open('work/super_robust.json', encoding='utf-8'))
cand = json.load(open('work/ref_candidates.json', encoding='utf-8'))

# 待处理：排除已识别 + 已派给 D 系列的 57 个混入目标（仍在跑）
D_TARGETS = set()
for sl in json.load(open('work/decode_slices.json', encoding='utf-8')):
    D_TARGETS |= set(sl['targets'])

todo = [n for n in sig if n not in cm and n not in D_TARGETS and os.path.isfile(os.path.join(JAR, n + '.java'))]

# 候选唯一性：某 src 只被一个 jar 类高分命中
src_hits = {}
for n, cs in cand.items():
    if cs and cs[0]['score'] >= 7:
        src_hits.setdefault(cs[0]['src'], []).append(n)

mc_imp_re = re.compile(r'import\s+(net\.minecraft\.[\w.]+);')

def entry(n):
    s = sig[n]
    txt = open(os.path.join(JAR, n + '.java'), encoding='utf-8', errors='replace').read()
    anchored = sorted({cm[r]['identity'].split('(')[0].split('$')[-1] for r in (s.get('refs') or []) if r in cm})
    e = {
        'obf': n,
        'kind': s['kind'],
        'super': robust.get(n, {}).get('super'),
        'lines': s['sizeLines'],
        'decl_line': (re.search(r'\b(?:class|interface|enum|record)\s+' + re.escape(n) + r'\b[^{;]*', txt) or [None])[0] if re.search(r'\b(?:class|interface|enum|record)\s+' + re.escape(n) + r'\b[^{;]*', txt) else None,
        'anchored_refs': anchored,
        'refs': (s.get('refs') or [])[:14],
        'mc_imports': sorted(set(mc_imp_re.findall(txt)))[:10],
        'n_fields': len(re.findall(r'^\s{4}(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?[\w$.<>,\[\]]+\s+\w+;', txt, re.M)),
        'n_methods': len(re.findall(r'^\s{4}(?:public|private|protected)\s', txt, re.M)),
    }
    cs = cand.get(n, [])
    e['candidates'] = [
        {'src': c['src'], 'score': c['score'], 'why': c['why'],
         'unique': len(src_hits.get(c['src'], [])) == 1}
        for c in cs
    ]
    return e

# 排序：有强候选 + 唯一命中的优先
def prio(n):
    cs = cand.get(n, [])
    if not cs:
        return (3, 0)
    if cs[0]['score'] >= 7 and len(src_hits.get(cs[0]['src'], [])) == 1:
        return (0, -cs[0]['score'])
    if cs[0]['score'] >= 7:
        return (1, -cs[0]['score'])
    return (2, -cs[0]['score'])

todo.sort(key=prio)
N = 100
per = math.ceil(len(todo) / N)
os.makedirs('work/batches', exist_ok=True)
for i in range(N):
    chunk = todo[i * per:(i + 1) * per]
    if not chunk:
        break
    data = {'batch': f'B{i+1:03d}', 'n': len(chunk), 'classes': [entry(n) for n in chunk]}
    json.dump(data, open(f'work/batches/batch_{i+1:03d}.json', 'w'), ensure_ascii=False, indent=1)
print(f'待处理 {len(todo)} | 每批 {per} | 批次 {math.ceil(len(todo)/per)}')
print('前 6 批样板:')
for i in range(1, 4):
    d = json.load(open(f'work/batches/batch_{i:03d}.json', encoding='utf-8'))
    print(' ', d['batch'], [(c['obf'], (c['candidates'][0]['src'] if c['candidates'] else '-')) for c in d['classes']])
