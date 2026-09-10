#!/usr/bin/env python3
"""用官方未混淆 26.2 jar 做真值字典，通过 mixin 逐方法引用对求解混淆映射。

原理：
  mixin 类名与方法名在两边均明文 → 同一 mixin 的同一方法内，
  官方引用的 epsilon 类集合 与 我方引用的混淆类集合 存在对应关系。
  以已知映射为种子，迭代求解 |未匹配官方|==1 且 |未匹配我方|==1 的方法，直到收敛。

输出 work/official_map.json: {obf: {identity, evidence}}
"""
import os, re, json
from collections import defaultdict, Counter

OFF = 'work/official26/com/github/epsilon'
MY = 'work/out/com/github/epsilon'

# 官方类名全集
off_classes = set()
for b, ds, fs in os.walk(OFF):
    for f in fs:
        if f.endswith('.java'):
            off_classes.add(f[:-5])

# 我方 jar 顶层类名全集（含混淆名）
my_classes = {f[:-5] for f in os.listdir(MY) if f.endswith('.java') and os.path.isfile(os.path.join(MY, f))}
cm = json.load(open('work/class_map.json', encoding='utf-8'))
known = {}          # 混淆名 -> 真实名
for k, v in cm.items():
    if k.startswith('mixins/'):
        continue
    known[k] = v['identity'].split('$')[0].split('(')[0].split('.')[0].strip()
known['dD'] = 'Constants'      # 已知锚点
known['vy'] = 'EventBus'
known['hi'] = 'hi'

JUNK = {'INSTANCE', 'Constants', 'NONE', 'TRUE', 'FALSE', 'NULL'}


def method_eps_refs(path, official):
    """返回 {方法名: set(引用的 epsilon 类名)}"""
    t = open(path, encoding='utf-8', errors='replace').read()
    body = re.sub(r'^import .*$', '', t, flags=re.M)
    out = {}
    for m in re.finditer(r'\n    (?:(?:public|private|protected|static|final|synchronized|abstract|native)\s+)+[\w<>\[\],.$?]+\s+(\w+)\s*\(([^)]*)\)\s*(?:throws [\w, .]+)?\s*\{', body):
        name = m.group(1)
        i = body.find('{', m.end() - 1)
        depth = 0; j = i
        while j < len(body):
            if body[j] == '{': depth += 1
            elif body[j] == '}':
                depth -= 1
                if depth == 0: break
            j += 1
        seg = body[i:j]
        if official:
            refs = {r for r in re.findall(r'\b([A-Z]\w*)\b', seg) if r in off_classes}
            refs |= {r for r in re.findall(r'com\.github\.epsilon\.(\w+)', seg)}
        else:
            refs = {r for r in re.findall(r'\b([A-Za-z_$][\w$]*)\b', seg) if r in my_classes}
            refs |= set(re.findall(r'com\.github\.epsilon\.(\w+)', seg))
        out.setdefault(name, set()).update(refs)
    return out


common = sorted(set(f[:-5] for f in os.listdir(MY + '/mixins') if f.endswith('.java')) &
                set(f[:-5] for f in os.listdir(OFF + '/mixins') if f.endswith('.java')))
method_pairs = []
for mx in common:
    o = method_eps_refs(f'{OFF}/mixins/{mx}.java', True)
    m = method_eps_refs(f'{MY}/mixins/{mx}.java', False)
    for name in set(o) & set(m):
        O = {x for x in o[name] if x in off_classes and x not in JUNK}
        M = {x for x in m[name] if x and x not in JUNK}
        if O and M:
            method_pairs.append((mx, name, O, M))

solved = {}
changed = True
rounds = 0
while changed and rounds < 30:
    changed = False; rounds += 1
    # 共现投票：对每对未匹配组合计分（1-vs-1 加权更高）
    votes = defaultdict(float)
    for mx, name, O, M in method_pairs:
        known_true = {known[k] for k in known}
        Ou = {x for x in O if x not in known_true}
        Mu = {x for x in M if x not in known}
        if len(Ou) == 1 and len(Mu) == 1:
            t = next(iter(Ou)); o = next(iter(Mu))
            votes[(o, t)] += 5.0
        elif Ou and Mu and len(Ou) <= 4 and len(Mu) <= 4:
            for t in Ou:
                for o in Mu:
                    votes[(o, t)] += 1.0
    # 取每对（我方/官方）最高分；要求显著领先
    by_o = defaultdict(list); by_t = defaultdict(list)
    for (o, t), v in votes.items():
        by_o[o].append((v, t)); by_t[t].append((v, o))
    for o, lst in by_o.items():
        if o in known: continue
        lst.sort(reverse=True)
        if len(lst) >= 2 and lst[0][0] < 2 * lst[1][0]:
            continue
        if lst[0][0] < 1.0:
            continue
        t = lst[0][1]
        # 官方侧唯一性
        ol = sorted(by_t[t], reverse=True)
        if len(ol) >= 2 and ol[0][1] != o and ol[0][0] >= lst[0][0]:
            continue
        known[o] = t
        second = lst[1][0] if len(lst) > 1 else 0.0
        solved[o] = {'identity': t, 'evidence': f'共现投票 {lst[0][0]:.1f}（次高 {second:.1f}）'}
        changed = True

json.dump(solved, open('work/official_map.json', 'w'), ensure_ascii=False, indent=1)
print(f'迭代 {rounds} 轮 | 新解出 {len(solved)} 个映射 | 已知 {len(known)}')
for k, v in list(solved.items())[:25]:
    print(f"  {k:6s} = {v['identity']:28s} ({v['evidence'][:60]})")
