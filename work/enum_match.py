#!/usr/bin/env python3
"""枚举常量名明文匹配器。

反编译产物的枚举常量名**未被混淆**（如 `public static final /* enum */ Dj IDLE;`），
src 内嵌枚举的常量同样明文 → 集合匹配即可得到强证据（A 级）。

输出 work/enum_candidates.json: {obf: {"src":..., "enum":..., "conf":"A|A-", "why":...}}
"""
import os, re, json

JAR = 'work/out/com/github/epsilon'
SRC = '旧版本的源代码'

cm = json.load(open('work/class_map.json', encoding='utf-8'))
const_re = re.compile(r'public\s+static\s+final\s+/\*\s*enum\s*\*/\s+')


def jar_enum_consts(path):
    t = open(path, encoding='utf-8', errors='replace').read()
    if 'extends Enum<' not in t:
        return []
    return re.findall(r'public\s+static\s+final\s+/\*\s*enum\s*\*/\s+\w+\s+([A-Za-z_][\w]*)\s*;', t)


# src 内嵌枚举：enclosing 类 -> {enum 名: 常量集}
src_enums = []
for b, ds, fs in os.walk(SRC):
    for f in fs:
        if not f.endswith('.java'):
            continue
        p = os.path.join(b, f)
        t = open(p, encoding='utf-8', errors='replace').read()
        for m in re.finditer(r'enum\s+(\w+)\s*(?:implements[^{]*)?\{', t):
            body = t[m.end():m.end() + 800]
            # 取到第一个 ';' 或 '}' 的常量列表
            seg = re.split(r'[;}]', body)[0]
            consts = re.findall(r'\b([A-Z][A-Z_0-9]*)\b', seg)
            consts = [c for c in consts if c not in ('String', 'Override', 'Deprecated')]
            if len(consts) >= 2:
                src_enums.append({'file': f[:-5], 'enum': m.group(1), 'consts': sorted(set(consts)),
                                  'path': p.replace('\\', '/')})

out = {}
for f in os.listdir(JAR):
    if not f.endswith('.java') or not os.path.isfile(os.path.join(JAR, f)):
        continue
    n = f[:-5]
    if n in cm:
        continue
    jc = jar_enum_consts(os.path.join(JAR, f))
    if len(jc) < 2:
        continue
    jset = set(jc)
    best = []
    for se in src_enums:
        sset = set(se['consts'])
        inter = jset & sset
        if not inter:
            continue
        # jar 常量几乎都出现在 src 枚举里，且规模接近
        cover = len(inter) / len(jset)
        jac = len(inter) / len(jset | sset)
        if cover >= 0.6 and jac >= 0.5:
            best.append({'src': se['file'], 'enum': se['enum'], 'jac': round(jac, 3),
                         'cover': round(cover, 3), 'n': len(inter), 'extra': sorted(jset - sset)})
    best.sort(key=lambda x: (-x['n'], -x['jac']))
    # 唯一性：多个 jar 类命中同一 src 枚举时降级
    if best:
        out[n] = {'cands': best[:3], 'consts': sorted(jset)}

# 唯一性过滤
from collections import defaultdict
hit = defaultdict(list)
for n, v in out.items():
    hit[(v['cands'][0]['src'], v['cands'][0]['enum'])].append(n)
final = {}
for n, v in out.items():
    c = v['cands'][0]
    uniq = len(hit[(c['src'], c['enum'])]) == 1
    final[n] = {'src': c['src'] + ('$' + c['enum'] if c['enum'] != c['src'] else ''),
                'conf': 'A' if uniq and c['cover'] >= 0.8 else ('A-' if uniq else 'B'),
                'jac': c['jac'], 'why': f"枚举常量 {c['n']} 个重合 (cover={c['cover']}, jac={c['jac']}), 唯一={uniq}, jar 独有={c['extra'][:4]}",
                'consts': v['consts'], 'others': v['cands'][1:]}

json.dump(final, open('work/enum_candidates.json', 'w'), ensure_ascii=False, indent=1)
a = [k for k, v in final.items() if v['conf'] == 'A']
print(f'枚举匹配 {len(final)} 个（A {len(a)}）')
for k, v in list(final.items())[:18]:
    print(f"  {k:6s} -> {v['src']:34s} {v['conf']:3s} {v['why'][:70]}")
