#!/usr/bin/env python3
"""内联 XOR 字符串解密器 v2 —— 精确变量链解析。

反编译形态：
    char[] c = "LITERAL".toCharArray();
    ...
    n2 = SEED;                       // 种子赋值
    ...
    int n6 = n2;                     // 拷贝
    c[i] = (char)(c[i] ^ (n6 ^ (switch (i % MOD) { case 0 -> K0; ... default -> KD; })));

解析：× 段 (switch % MOD + case 表) → XOR 拷贝变量 X → 其来源变量 Y → Y 的整数赋值 = SEED
输出 work/decrypted_strings.json
"""
import os, re, json, sys

JAR = 'work/out/com/github/epsilon'


def unescape(java_lit: str) -> str:
    out, i = [], 0
    simple = {'n': '\n', 't': '\t', 'r': '\r', 'b': '\b', 'f': '\f', '0': '\0',
              '\\': '\\', '"': '"', "'": "'"}
    while i < len(java_lit):
        c = java_lit[i]
        if c != '\\':
            out.append(c); i += 1; continue
        n = java_lit[i + 1] if i + 1 < len(java_lit) else ''
        if n == 'u':
            try:
                out.append(chr(int(java_lit[i + 2:i + 6], 16))); i += 6; continue
            except ValueError:
                pass
        if n in simple:
            out.append(simple[n]); i += 2; continue
        out.append(n); i += 2
    return ''.join(out)


def good_plain(s: str) -> bool:
    """判定像人类可读文本（模块名/资源路径/标识符）。"""
    if not s or len(s) < 2:
        return False
    if not all(32 <= ord(c) < 127 for c in s):
        return False
    alpha = sum(c.isalnum() or c in " -_./:&'()[]!?+,#%" for c in s)
    return alpha / len(s) > 0.9 and any(c.isalpha() for c in s)


def blocks(txt: str):
    """产出 (seed, key_table) 候选。"""
    out = []
    for m in re.finditer(r'switch\s*\((\w+)\s*%\s*(\d+)\s*\)\s*\{(.*?)\}', txt, re.S):
        mod = int(m.group(2)); body = m.group(3)
        tab = {int(k): int(v) for k, v in re.findall(r'case\s+(\d+)\s*->\s*(\d+)', body)}
        d = re.search(r'default\s*->\s*(\d+)', body)
        if d and '' not in tab:
            tab.setdefault(-1, int(d.group(1)))
        if not tab:
            continue
        n = max(mod, max(tab.keys()) + 1)
        arr = [tab.get(i, tab.get(-1)) for i in range(n)]
        if any(x is None for x in arr):
            continue
        # 找 XOR 拷贝变量: "^ (X ^" 其中 X 由 switch 决定
        seg = txt[m.end():m.end() + 400]
        xm = re.search(r'\^\s*\((\w+)\s*\^', seg) or re.search(r'\^\s*\((\w+)\s*\^', txt[max(0, m.start() - 400):m.start()])
        seed = None
        if xm:
            x = xm.group(1)
            # 排除 switch 占位变量
            ym = re.search(r'int\s+' + re.escape(x) + r'\s*=\s*(\w+)\s*;', txt)
            y = ym.group(1) if ym else x
            sm = re.findall(r'\b' + re.escape(y) + r'\s*=\s*(\d{1,5})\s*;', txt)
            if sm:
                seed = int(sm[-1])
        if seed is None:
            continue
        out.append((seed, arr))
    return out


def extract(key: str):
    p = os.path.join(JAR, key + '.java')
    if not os.path.exists(p):
        return []
    txt = open(p, encoding='utf-8', errors='replace').read()
    bl = blocks(txt)
    if not bl:
        return []
    lits = [m.group(1) for m in re.finditer(r'"((?:[^"\\]|\\.)*)"', txt)]
    seen, res = set(), []
    for lit in lits:
        raw = unescape(lit)
        if len(raw) < 2 or len(raw) > 200:
            continue
        for seed, table in bl:
            dec = ''.join(chr(ord(c) ^ (seed ^ table[i % len(table)])) for i, c in enumerate(raw))
            if good_plain(dec) and dec not in seen:
                seen.add(dec)
                res.append({'raw': lit, 'seed': seed, 'key': table, 'plain': dec})
    return res


if __name__ == '__main__':
    if '--test' in sys.argv:
        for r in extract(sys.argv[sys.argv.index('--test') + 1]):
            print(r)
        sys.exit(0)
    out = {}
    for f in os.listdir(JAR):
        if f.endswith('.java') and os.path.isfile(os.path.join(JAR, f)):
            r = extract(f[:-5])
            if r:
                out[f[:-5]] = r
    for f in os.listdir(os.path.join(JAR, 'mixins')):
        if f.endswith('.java'):
            r = extract('mixins/' + f[:-5])
            if r:
                out['mixins/' + f[:-5]] = r
    json.dump(out, open('work/decrypted_strings.json', 'w'), ensure_ascii=False, indent=1)
    tot = sum(len(v) for v in out.values())
    print(f'解出字符串的类 {len(out)} | 字符串 {tot}')
    for n, v in list(out.items())[:20]:
        print(f'  {n}: {[x["plain"] for x in v][:4]}')
