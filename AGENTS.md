# AGENTS.md — 本仓库工作约束
## 强制检查（开工前）

1. 先看 `git status --short`，不覆盖/回滚不属于本任务的改动。
2. 目标 jar 版本：`epsilon-fabric-26.2-2026.10.7.jar`（MC 26.2）。混淆特征：类名扁平为
   单/双字母（`A`–`zz`）、字符串/调用层加密（`SeQL.execute(key,…)` 模式）、带
   `@me.sofurry.NiurenDEOBF` 反反混淆标记、Unsafe 反射。Java 25（classfile major 69）。
3. 公开参考源码：`NekoyaHouse/Epsilon` 分支 `26.2.x`（2026.8.2）。它 **≠** jar 的代码版本，
   只能当相似度字典，不得当作逐字节真值。
4. 本地 `旧版本的源代码/` 是 **26.1.2**（2026.09.01），与 jar 不匹配，仅存档。

## 分层边界与目标

- 还原对象 = jar 中 `com.github.epsilon.*` 自有类。第三方/加载器/`me.sofurry.*` 非本任务目标。
- mixin 类名是**可读锚点**（mixin 配置必需），是识别混淆类的首要依据。
- 识别方法：结构签名（继承、方法签名、引用关系）+ mixin 锚点 + 公开源码相似度。禁止凭空猜名。

## 工作产物约定

- 反编译结果统一放 `work/out/`（镜像包结构），驱动 `work/decompile.js`。
- 锚点映射 `work/anchor_map.json`：jar mixin → 其引用的混淆类 + 源码同名 mixin 引用的真实类。
- 每批识别必须留下**可验证证据**（对应源码片段 / mixin 行为一致），不得只报"猜到了"。
- 本仓库不保存任何 jar/class 之外的二进制；只跟踪还原产物与脚本。

## 提交前检查

- 改动范围匹配：只提交本次还原批次相关文件。
- `git diff --check`、`git status --short`。
- 更新 README 状态表与 CHANGELOG。
