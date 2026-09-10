# eps+ · Epsilon 26.2 客户端反混淆还原

对 `epsilon-fabric-26.2-2026.10.7.jar`（Minecraft 26.2 客户端，混淆版）的**类身份还原**工作区。

> **成果**：从 1012 个混淆类中识别出 **595 个真实身份**（A 439 / A− 76 / B 80），
> **模块覆盖率 90/121 = 74%**，顶层类 595/926 = 64%。

---

## 目录

- [背景](#背景)
- [方法论](#方法论)
- [成果](#成果)
- [目录结构](#目录结构)
- [复现](#复现)
- [免责声明](#免责声明)

---

## 背景

目标 jar 经二次混淆：类名扁平为 `A`–`zz`、方法体经 `hi` 引擎加密分发（`hi.a("key", this, …)`）、
带 `@me.sofurry.NiurenDEOBF` 反反混淆标记。字符串明文不在 class 文件中。

公开参考源码 `NekoyaHouse/Epsilon@26.2.x`（2026.8.2）与 jar 已分叉，只能作相似度字典。

## 方法论

按可靠性排序的五条路径（工具全部开源在本仓库 `work/`）：

| # | 方法 | 工具 | 说明 |
|---|---|---|---|
| 1 | **官方未混淆 jar 字典** | `official_match.py` / 批次 | GitHub Releases 的 `epsilon-fabric-26.2-2026.8.1.jar` **未混淆**（477 类），与目标同代码线 → 真值字典（贡献最大） |
| 2 | **mixin 逐方法映射** | `solve_by_official.py` | mixin 类名/方法名两边明文 → 同方法内引用集合对应 + 共现投票迭代传播 |
| 3 | **枚举常量明文匹配** | `enum_match.py` | 枚举常量名未被混淆 → 集合匹配即强证据 |
| 4 | **MC-import 唯一指纹** | `mc_unique.py` | 某组罕见 MC 类在全源树仅被一个类引用 → 唯一指纹 |
| 5 | **内联 XOR 字符串解密** | `xor_strings.py` | 部分字符串以 `<clinit>` 内联 XOR 解密（如 `S`→`Item Physics`） |

**质量门**（`merge_decode.py`）：无本地字典佐证的推测名不入库（转 `role_notes.json`）、
被否决条目黑名单、身份唯一性检查、最高置信重算。

## 成果

| 指标 | 数值 |
|---|---|
| 识别总数 | **595**（A 439 / A− 76 / B 80） |
| 模块覆盖 | **90/121 = 74%** |
| 顶层类覆盖 | **595/926 = 64%** |

**解出的关键锚点**：`e`=Module、`Dl`=Setting、`v8`=SettingHost、`vy`=EventBus、`hi`=解密分发器、
`_Q`=UiTree.UiNode（31 个 record 的密封基接口）、`yM`=Render2DCommand、`vY`=Category。

**大型族**：`UiTree.*`（22 个 UiNode 实现）、`Render2DCommand.*`、`Render2DScheduler.*`、
TTF 字体系统（TtfFontLoader/TtfFontFile/TtfGlyphAtlas/…）、渲染器族（RoundRectRenderer/TriangleRenderer/…）。

主输出：[`work/class_map.json`](work/class_map.json)（595 条，含逐条证据与置信分级）、
[`work/IDENTITY_REPORT.md`](work/IDENTITY_REPORT.md)。

**诚实边界**：剩余 31 个模块为 26.2-2026.10.7 相对官方 8.1 的新增，或 SeQL 解密基础设施
（`role_notes.json` 记录所有"有角色无类名"项，未用臆造名污染映射表）。

## 目录结构

```
work/
├── out/                # 目标 jar 的 CFR 反编译产物（1012 个 .java，混淆名）
├── class_map.json      # ★ 595 条识别映射（混淆名→真实身份+证据+置信）
├── IDENTITY_REPORT.md  # 身份识别报告
├── decode/             # 各批次识别结果（340 个 JSON）
├── batches*/           # 并行识别批次输入
├── unidentified.json   # 未识别清单 + 白盒线索
├── role_notes.json     # 有角色无类名的诚实记录
├── anchor_map.json     # mixin 锚点映射（59 条）
├── obf_class_signatures.json # 926 顶层混淆类结构签名
└── *.py                # 方法论工具（6 个）
```

## 复现

```bash
# 1. 目标 jar 反编译
java -jar cfr.jar epsilon-fabric-26.2-2026.10.7.jar --outputdir work/out

# 2. 官方未混淆 jar 作字典（关键）
curl -skLO https://github.com/NekoyaHouse/Epsilon/releases/download/2026.8.1/epsilon-fabric-26.2-2026.8.1.jar
java -jar cfr.jar epsilon-fabric-26.2-2026.8.1.jar --outputdir work/official26

# 3. 自动方法
python work/enum_match.py        # 枚举常量明文匹配
python work/mc_unique.py         # MC-import 唯一指纹
python work/solve_by_official.py # mixin 逐方法映射
python work/xor_strings.py       # 内联 XOR 解密

# 4. 合并与门控
python work/merge_decode.py      # 门控合并（推测名不入库等）
```

## 免责声明

本项目**仅用于逆向工程学习与研究**，不包含任何 Epsilon 的原始 jar、二进制或鉴权绕过工具
（`eps-authbypass.jar` 明确不在范围内）。所有反编译产物版权归原作者所有；
如权利人认为不妥，请联系删除。
