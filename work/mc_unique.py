#!/usr/bin/env python3
"""MC-import 唯一指纹自动判定器。

原理（Batch004 实证有效的 A 级判据）：
  jar 类的 `net.minecraft.*` 导入集若含「罕见 MC 类」（全 src 树仅被 ≤N 个类引用），
  且这些罕见类在全 src 树中**只被一个类同时引用** → 该 src 类即其身份（唯一指纹）。

输出 work/mc_unique_candidates.json：
  {obf: {"src":..., "rare":[...], "conf":"A|A-", "why":...}}
"""
import os, re, json
from collections import defaultdict

JAR = 'work/out/com/github/epsilon'
SRC = '旧版本的源代码'
RARE_MAX = 3      # 引用数 ≤ 此值视为「罕见 MC 类」
COMMON = {'Mth', 'Vec3', 'Identifier', 'Player', 'Entity', 'Level', 'ItemStack', 'Component',
          'Matrix4f', 'BlockPos', 'Direction', 'InteractionHand', 'BlockState', 'Item', 'Block',
          'LivingEntity', 'LocalPlayer', 'AABB', 'Color', 'List', 'Screen', 'GuiGraphicsExtractor'}

mc_re = re.compile(r'import\s+(net\.minecraft\.[\w.]+);')
word = re.compile(r'\b([A-Za-z_$][\w$]*)\b')

cm = json.load(open('work/class_map.json', encoding='utf-8'))
src_names = set()
src_files = {}
for b, ds, fs in os.walk(SRC):
    for f in fs:
        if f.endswith('.java'):
            if f.startswith('Mixin'):   # src mixin 类不是「真实身份」目标，排除
                continue
            src_names.add(f[:-5]); src_files[f[:-5]] = os.path.join(b, f)

# 1) src 侧：每个 MC 简单名被哪些 src 文件引用（import 或正文出现）
mc_users = defaultdict(set)     # MC 简名 -> {src 类}
src_mc = {}                     # src 类 -> {MC 简名}
for n, p in src_files.items():
    t = open(p, encoding='utf-8', errors='replace').read()
    imps = {m.split('.')[-1] for m in mc_re.findall(t)}
    body = imps | {w for w in word.findall(t) if w in src_names}
    src_mc[n] = imps
    for i in imps:
        if i not in ('List',):
            mc_users[i].add(n)

# 2) jar 侧
out = {}
leads = {}
for f in os.listdir(JAR):
    if not f.endswith('.java') or not os.path.isfile(os.path.join(JAR, f)):
        continue
    n = f[:-5]
    if n in cm:
        continue
    t = open(os.path.join(JAR, f), encoding='utf-8', errors='replace').read()
    jar_mc = {m.split('.')[-1] for m in mc_re.findall(t)}
    rare = {c for c in jar_mc if c not in COMMON and 0 < len(mc_users.get(c, ())) <= RARE_MAX}
    if not rare:
        continue
    if len(rare) >= 2:
        cand = set(src_names)
        for c in rare:
            cand &= mc_users[c]
        if len(cand) == 1:
            s = next(iter(cand))
            out[n] = {'src': s, 'rare': sorted(rare), 'conf': 'A',
                      'why': f'{len(rare)} 个罕见 MC 类在 src 树唯一同时被 {s} 引用: {sorted(rare)}'}
            continue
    # 单罕见类不可靠（多个 jar 类会同时命中），仅作线索，不判定
    if len(rare) == 1:
        c = next(iter(rare))
        if len(mc_users[c]) == 1:
            s = next(iter(mc_users[c]))
            leads.setdefault(s, []).append((n, c))

json.dump(out, open('work/mc_unique_candidates.json', 'w'), ensure_ascii=False, indent=1)
json.dump({k: v for k, v in leads.items()}, open('work/mc_unique_leads.json', 'w'), ensure_ascii=False, indent=1)
print(f'唯一指纹候选(A) {len(out)} 个 | 单类线索(未判定) {sum(len(v) for v in leads.values())} 条')
for k, v in list(out.items())[:20]:
    print(f"  {k:6s} -> {v['src']:28s} {v['conf']:3s} {v['why'][:80]}")
