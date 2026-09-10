# CHANGELOG

本文件记录 Epsilon 26.2 (2026.10.7) 客户端反混淆还原工作的进展。格式参考 Keep a Changelog。

## [Unreleased]

### 🏆 最终结果（2026-09-10，官方字典法五轮迭代）
- **识别 595 条**（A 439 / A− 76 / B 80）｜**模块 90/121 (74%)**｜顶层 595/926 (64%)
- 关键锚点：`_Q`=UiTree.UiNode（31 record 的基接口）、`yM`=Render2DCommand、`x`=Disabler、`z2`=ShaderHolder
- 官方未混淆 jar 字典法贡献巨大：从 358 → **511**（+153），模块 74 → **91**
- 解出大量内嵌类型：`UiTree.*` 系列（RectNode/ScissorNode/OutlineNode/RectGradientNode/FilledFieldNode/
  PopupCardNode/AssistChipNode/ButtonElement/RotatedTextNode/InputElement/Insets…）、
  `Render2DCommand.*`（Text/Texture/Shadow…）、`EpsilonFontGlyph.GlyphInstance`、`TtfFontLoader/TtfFontFile/
  TtfGlyphAtlas/EpsilonFontMetrics`、`FindItemResult`、`Render2DBounds`、`ModuleHolder`、
  `HudModule.HorizontalAnchor`、`MD3Theme`、`PanelElements`、`UiTheme`、`UiRenderBatch`、
  `ZealotCrystalPlus.SettingsSnapshot`、`SystemEmojiAtlas.EmojiGlyph`、`Follower.DirectionInput`、
  `Pitch40ControlState`、`PanelVisibleResolver`、`AccountType` 等
- **剩余 30 个未识别模块**（多为 26.2-2026.10.7 新增或 SeQL 解密基础设施）：
  `A G H T a e3 e4 e5 eP eQ eR eS eV ed ee ep eq ex f m n o q u0 u3 uG ua uk uv v`

### 🔑 Breakthrough (2026-09-10)：官方未混淆 26.2 jar 可用作真值字典：官方未混淆 26.2 jar 可用作真值字典
- **发现**：`NekoyaHouse/Epsilon` 的 GitHub Releases 提供 **未混淆**的官方构建产物
  （`epsilon-fabric-26.2-2026.8.1.jar`，477 类，包路径/类名/字符串全可读），
  与我方目标 jar（26.2-2026.10.7，混淆）**同属 26.2 代码线**，仅差约 2 个月。
- **价值**：官方 jar 给出 26.2 的**真实类名清单（477 类 / 104 模块）**，
  其中 290 个已被我方识别占用，**187 个明确对应我方未识别类**（AutoFirework / AutoTool / AutoSprint /
  BPS / CaptureMarkESP / ESP2D / EpsilonFontGlyph / EpsilonFontMetrics / FindItemResult / FollowerConfig …）。
- **新增工具/资产**（均为本地对照，不入 git）：
  - `work/tmp/epsilon-26.2-2026.8.1.jar`（官方 jar）、`work/tmp/cfr.jar`（CFR 0.152）
  - `work/official26/`（官方反编译产物 477 类，**未混淆**）
  - `work/solve_by_official.py`：以已知映射为种子，用 mixin 逐方法引用对做**共现投票 + 迭代传播**
    （解出 `no`=Managers、`z`=NoRender、`v`=EpsilonFontMetrics、`O`=EpsilonTextRenderable、`u2`=EpsilonFontGlyph）
  - `work/official_match.py`：官方↔我方全类结构指纹匹配器
  - `work/batches4/`：以官方源码为候选池的 58 批（457 类）
- **5 处独立验证**：公式化反向验证已识别映射（ElytraFly↔`uj`、Xray↔`U`、MasEffects↔`e8`、
  SneakTweak↔`eZ`、FreeCamera↔`i` 全部命中），证明 mixin 逐方法映射可靠。

### Added (2026-09-10 第四轮：568 类 71 批，20 并发，mimo-v2.5)
- **最终识别量 469 条**（A 343 / A− 56 / B 70）：**模块覆盖 82/121 (67%)**，顶层类 469/926 (50%)。
- 第四轮新增代表项：`Y`=Flight、`y`=SilentAim（src 仅 SilentAim 引用 SwingHandEvent，唯一指纹）、
  `X`=DoubleAnchor、`eI`=Eagle、`uE`=SafeAnchor、`ev`=SafeCrystal、`eA`=AutoTotem、`eE`=ElytraSwap、
  `_V`=GlslSandBox、`vo`=FireflyESP、`_E`=Animation、`_l`=Xray.BlockMemory、`lj`=AutoArmor.ArmorData、
  `zu`=SnapRotationManager、`zq`=TargetRequest、`vR`=RenderTargetHolder、`_W`=LegacyConfigMigrator、
  `zA`=StringListSettingWidget、`zv`=AbstractSetSettingWidget、`Xk`=PanelLayout、`yJ`=ScissorRect 等。
- 剩余未识别类**绝大多数为 26.2 新增**（本地 26.1.2 字典无对应）：渲染命令族（`_Q`/`yM` 密封接口的 30+ record 实现）、
  SeQL 字符串解密基础设施、Gson DTO、shader uniform record 等，已诚实归入 `role_notes.json`。
- 裁决累计：`rejected_mappings.json` 40+ 条；`unidentified.json` 更新。

### Added (2026-09-10 第三轮：93 批并行识别收尾)
- **最终识别量 358 条**：A 269 / A− 39 / B 50；**模块覆盖 74/121 (61%)**。
- 累计分片结果 `work/decode/`（S* 10 片 + B* 5 批 + C* 76 批）。
- 未识别清单与线索：`work/unidentified.json`。
- **门控修复**：`merge_decode.py` 缺 `import re` 导致 src 内嵌类型提取静默失败，使 23 条内嵌枚举/record 识别被误降级；修复后补回。
- 角色记录（有角色无类名）：`work/role_notes.json`（94+ 条）。
- 第三轮新增代表项：`x`=Disabler、`X3`=InvUtils、`X4`=TabDefinition、`yp`=AddonHolder、
  `zb`=RotationManager、`zc`=SettingWidget、`zG`=ColorWidget、`zd`=MD3Theme、`yN`=Render3DScheduler$OutlineBoxCommand、
  `yn`=LuminRenderTarget、`y9`=ModuleDetailPanel、`yA`=Hat$Mode、`ya`=FireflyESP$ColorMode、
  `XD`=HitParticles$Mode、`XC`=Fullbright$Mode、`Xb`=ZealotCrystalPlus$BreakMode、`XM`=Filter$Mode 等。
- 裁决教训（写入 `work/rejected_mappings.json`，累计 30+ 条）：
  - 纯 Jaccard 启发式会误删**强证据条目**（曾误删 `z2`=ShaderHolder、`er`=AutoKouZi），
    已加入 **A/A- 全量 pin** 保护；`adjudicate.py` 仅对未 pin 条目按 1.5× 规则裁决。
  - 无 src 佐证的推测名与 C 级条目一律不入库，转 `role_notes.json`。

### Added (2026-09-10 第二轮：93 批并行识别，模型 mimo-v2.5)
- 以 `work/batches2/`（93 批 × 8 类）并行识别剩余 744 类，产出 `work/decode/C0NN.json`。
- **识别量 185 → 298 条**（A 205 / A− 26 / B 42 / C 25）。新增高分项示例：
  - 框架/工具：`Dl`=Setting、`yx`=Dependency、`uT`=TranslateComponent、`vY`=Category（枚举常量明文）、
    `vh`=SettingRow（+8 行子类）、`eh`=HudModule、`D5`=ModuleHolder、`DC`=TranslateHolder、
    `la`=EpsilonTranslations、`iH`=EpsilonAddon、`Os`=EpsilonFabric、`gp`=Managers 分支（NotificationManager 语义）
  - 事件/总线：`dH`=ChunkOcclusionEvent、`yZ`=AfterRender3DEvent、`zm/zR`=Render2DEvent.Level/HUD、
    `dP/dQ`=PacketEvent.Receive/Send、`DK/XV/g3`=Respawn/GameJoined/GameLeftEvent 等
  - 战斗/移动：`eM`=Criticals、`uF`=AimBot、`eb`=PacketMine、`Dj`=DoubleAnchor.Phase、
    `eO`=MaceAura、`eo`=AutoArmor、`em`=SafeWalk、`eK`=InvManager、`er`=AutoKouZi、
    `un`=ZealotCrystalPlus、`lw`=AStarFollowerNavigator、`ly`=DamageUtils
  - HUD/GUI：`eg/eU`=TargetHUD 系列、`nl`=ModuleDetailPanel、`lB`=GeneralClientSettingTab、
    `io`=EnchantmentUtils、`is`=SettingLayoutPlanner$Section、`ir`=ClickSlotUtils
  - 渲染：`le`=Render3DScheduler、`dd`=LuminRenderTarget、`lR`=LuminVertexFormats、
    `gJ`=Scaffold.Mode、`iJ`=MasEffectsParticleRenderer、`ig`=GlslSandBox$SandboxInfo
- 新增工具：
  - `work/enum_match.py`：**枚举常量明文匹配**（枚举常量名未被混淆）→ 7 个 A 级。
  - `work/mc_unique.py`：多罕见 MC 类交集唯一 → 3 个 A 级（如 `io`=EnchantmentUtils）。
  - `work/adjudicate.py`：身份重复的证据裁决（MC-Jaccard / 枚举覆盖，1.5× 规则）。
  - `work/auto_resolve.py`（只报告）。
- 质量门（`work/merge_decode.py`）：
  - 无本地 src 佐证的**推测名不得作为身份入库**，降级至 `work/role_notes.json`（累计 38 条）。
  - 被否决条目黑名单防复活（累计拦截 6 条）。
  - 身份唯一性检查，输出 `work/identity_duplicates.json`。
- 裁决留痕：`work/rejected_mappings.json`（14+ 条），如 `p`=Scaffold❌→`eW`、
  `H`=Hat❌→`P`、`gA`=ColorUtils❌→`d1`、`DJ`=DoubleAnchor.Phase❌→`Dj`、`a`=AutoKouZi❌→`er`。

### Added (2026-09-10)
- **识别量 93 → 182 条**（A 118 / A− 19 / B 26 / C 19），`work/class_map.json`。
  - 框架核心族（A）：`Dl`=Setting<V>、`yx`=Setting$Dependency、`uT`=TranslateComponent、
    `DM/DV/Dx/X0/Xe/XF/XG/Xc/Xp/Xf` = DoubleSetting/ColorSetting/EnumSetting/KeybindSetting/
    RegistryListSetting(+Type)/StringListSetting/IntSetting/StringSetting/ButtonSetting、`Xn`=BoolSetting。
  - 事件族（A）：ClientTickEvent.Pre/Post、StartUseItemEvent、RightClickEvent、LevelUpdateEvent、
    GameLeftEvent、SlowdownEvent、SwingHandEvent、PlayerTickEvent.Pre/Post、SendPositionEvent、
    MoveEvent、PostSendPositionEvent、RespawnEvent、GameJoinedEvent、AfterRender3DEvent、
    ChunkOcclusionEvent、Render2DEvent.Level/HUD、PacketEvent.Receive/Send、TravelEvent、
    AttackSlowDownEvent、UseItemEvent 等。
  - 模块/组件（A/A−）：Scaffold、Hat、Inventory、GUIMove、NoFall、PacketMine、AutoMap、BlockESP、
    AutoHitCrystal、SilentRotationManager、ElytraFlightMode(+2 子类)、I18NFileGenerator、
    ModuleHolder、EpsilonAddon、MTF、AutoQueue、DropdownScreen、RegistryListSelectPopup、
    SettingRow(`vh`)+8 个子类行、PanelInputRouter、AntiBot、FriendManager、CircleESP、
    Managers、ChatComponentAccessor、BetterChat、ItemPhysics、SoundKey/SoundManager、
    LuminRenderSystem、Clientbound/ServerboundPacketManager、PacketUtils、
    Velocity、FastWeb、Xray、Fullbright、Filter、Shaders、ElytraFly、HandsView、
    CameraClip、SneakTweak、ClientIdentityHider、EntityRenderStateAccessor 等。
- **`work/xor_strings.py`**：内联 XOR 字符串解密器（实证 `S`→'Item Physics'、`L`→'No Rotate'、
  `ew`→'Multi Task'、`J`→'Anti Alias'、`l6`→'Epsilon-Executor-'、`u1`→'XIN_2B2T'、`Ow`→'theme'）。
  产出 `work/decrypted_strings.json`。
- **`work/ref_fingerprint.py`**：锚点引用向量 + MC-import 候选配对，产出 `work/ref_candidates.json`。
- **`work/merge_decode.py`**：分片结果合并器（含 pinned/冲突优先级）。
- **`work/batches2/` + `work/todo_classes.json`**：剩余 744 类切成 93 批（派发用）。
- 工具：`work/super_robust.json`（修正继承提取的权威数据源）。

### Fixed / Corrected (2026-09-10)
- **两处 Jaccard 误配作废**（`work/rejected_mappings.json`）：
  - `p`=Scaffold(B) ❌ → **`eW`=Scaffold(A)**：CropBlock/BushBlock/FlowerBlock/NetherFungusBlock/
    SlabBlock 在全 src 树**仅 Scaffold 引用**，eW 全导入（唯一指纹）。
  - `H`=Hat(B) ❌ → **`P`=Hat(A)**：全 jar **唯一**含 `double[][]` 字段的类是 P，对应 src Hat 的
    `double[][] positions = new double[181][2]` 与 `Mode{Astolfo,Sexy,Fade}`。
  - `p`/`H` 已从表中移除待重识别；`p` 疑 26.2 新增床类模块（BedBlock 全 src 树 0 引用）。
- **`e8`=MasEffects 升 A**：与 src MasEffects 共享 9 个罕见类
  （ClientboundEntityEventPacket/GizmoStyle/WindCharge/ThrownEnderpearl 等）。
- **`obf_class_signatures.json` 继承字段修正**：旧提取器漏解析跨行声明（如
  `Dx<E extends Enum<E>> extends Dl<E>` 记为 super=None）且被泛型边界 `extends Enum<E>` 抢先匹配；
  已按 `super_robust.json` 修正 24 类，`extends Dl` 族 9 → **10**（新增 `Dx`=EnumSetting）。

### Added (2026-09-09)
- 初始化本工作仓库（git init，commit 0bc88fa）。
- **全量反编译**：`epsilon-fabric-26.2-2026.10.7.jar` 中 `com.github.epsilon.*` 共 591 个类
  （509 顶层混淆 + 82 mixin + 4 fabric）100% 反编译为 `.java`（CFR 0.152），零失败。
  输出 `work/out/`，驱动 `work/decompile.js`。
- **源码↔jar 差异基线**：确认公开 `26.2.x`（2026.8.2, 07-19 归档）与 jar（2026.10.7）已分叉。
- **锚点映射表** `work/anchor_map.json`：59 条。
- **结构身份报告** `work/IDENTITY_REPORT.md`：解锁 `e`=Module、`v8`=SettingHost、
  `hi`=字符串解密分发器、`vy`=EventBus 持有者、`Xn`=BoolSetting（校正早期误判）。
  附 10 条 mixin→混淆引用示例与置信分级。
- 文档：README、AGENTS、CHANGELOG。

### Fixed / Corrected (2026-09-09)
- **⚠️ 反编译基线数据修复**（commit 3298e60）：
  - 根因：jar 顶层 **926 类中含 366 组大小写兄弟类**（`U`/`u`、`DM`/`Dm`/`dM`/`dm` 等，
    同一 lowercase 下 2–4 个独立类）。解压到大小写不敏感 NTFS 时互相覆盖，旧 `work/classes`
    仅存 595 文件——此前"591 文件 100% 覆盖"声明**不实**：缺 417 个类，且幸存产物中存在
    内容错位（磁盘 `X.class` 内部实为 `x`，旧 `X.java` 内容是 `x` 类）。
  - 修复：`work/classes`、`work/out` 启用 NTFS 大小写敏感属性（`fsutil setCaseSensitiveInfo`），
    从 jar 完整解压 1012 个 epsilon 类（926 顶层 + 82 mixin + 4 fabric），全量重反编译
    **1012/1012 成功 0 失败**；产物声明类名与文件名逐一核对一致；git 设 `core.ignorecase=false`
    使大小写兄弟类产物全部入库（index 595 → 1012 文件）。
  - `obf_class_signatures.json` 重生成：509 → **926 类**，extends `e` 模块集 68 → **121**。
  - 复核结论：旧 A 级身份（`e`=Module、`v8`=SettingHost、`hi`、`vy`、`Xn`、`nN`）不受覆盖
    影响（幸存者为小写成员且内容正确）；受影响的是此前缺失的大写成员类，现全部解锁待识别。

### Changed / Corrected
- 早期把 `Xn`/`U.W` 判为 Xray 系**证据不足**：`Xn` 实为 `boolSetting` 返回类型（`BoolSetting`）。
  已在校正后的报告中标注为 C 级，待复核。

### Not Done（诚实声明）
- **字符串/SeQL 调用层解密**：字符串以 64 位密钥在运行时经 `hi` 解密，明文不在 class 中。
  需先逆向 `hi` 解密引擎，本会话未投入（体量以周计）。
- **全量 926 类命名还原**：需逐类交叉验证，超出单会话可完成范围。已交付的工具链、
  锚点表、结构报告是可继续的基础。

### Pending / Blocked
- **eps-authbypass.jar**：功能为剥离 Epsilon 鉴权门禁，用途未获可核实说明前不处理。
- **GitHub 删库/fork**：`liuyyx/Epsilon`(private, 26.1.x) 拟删、`NekoyaHouse/Epsilon@26.2.x`
  拟 fork；需凭据（PAT / gh / 手动）方可执行，本机当前无 gh、无 token、无凭据文件。
