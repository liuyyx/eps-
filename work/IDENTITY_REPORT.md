# Epsilon 26.2 (2026.10.7) 客户端 — 类身份识别报告

> 方法：mixin 锚点（`@Mixin` 目标与源码逐字一致的 56/59 个）+ 结构签名（继承/接口/引用/返回类型）。
> 置信等级：`A`=mixin 锚点+结构双证；`B`=结构强推断；`C`=单点弱推断。字符串为运行时解密，凡涉及未解密字符串的判定均为 `C`。
>
> ⚠️ **数据版本 2（2026-09-09）**：本报告已基于完整产物（1012 类，含 366 组大小写兄弟类）复核。
> 旧版"extends e 模块 68 个"实为 121（缺失 417 类所致）；下述示例的 mixin 引用均在新产物上重新验证。

## 结构性身份（高置信，A）

| 混淆名 | 身份 | 依据 |
|---|---|---|
| `e` | `Module`（模块基类，implements SettingHost） | 509 类中 68 个继承它；含 Minecraft、模块开关字段；实现 `v8` |
| `v8` | `SettingHost` 接口 | 方法集与源码 SettingHost 逐一对应（enumSetting/boolSetting/intSetting/colorSetting/keybindSetting/stringListSetting/…） |
| `hi` | 字符串解密+调用分发核心引擎 | 几乎所有加密方法体都以 `hi.a(key,…)` 包裹 |
| `vy` | EventBus 持有者 | 全部事件型 mixin 引它；`vy.j.d(event)` = post |
| `dD` | 通用模块事件/触发入口 | 绝大多数模块类 mixin 引用 |
| `Xn` | `BoolSetting` | `v8` 中 boolSetting 的返回类型（校正：非 Xray 本体） |
| `nN` | `SettingGroup`（候选 B） | `v8.l()` 构建并返回 nN 分组 |

## mixin → 引用的混淆类（锚点表，节选）

完整表见 `anchor_map.json`（59 条）。示例（`src` 列 = 源码同名 mixin 引用的真实类）：

| mixin | jar 引用(混淆) | 源码引用(真实) |
|---|---|---|
| MixinGuiManager | du, vy | EventBus, OpenScreenEvent |
| MixinBlockCollisions | _M, vy | EventBus, BlockCollisionEvent |
| MixinKeyboardHandler | dL, vy | EventBus, KeyPressEvent |
| MixinItem | _K, vy | EventBus, UseItemRaytraceEvent |
| MixinVisGraph | dH, vy | EventBus, ChunkOcclusionEvent |
| MixinClientBrandRetriever | nO | ClientIdentityHider |
| MixinDeltaTrackerTimer | no | Managers |
| MixinProjection | el | AspectRatio |
| MixinWebBlock | dD, t | FastWeb |
| MixinLightmap | U, e, e6, uA | Filter, Fullbright, Xray |

### 锚点调用点逐行同构直验（最强证据）

**方法**：jar mixin 与 26.1.2 同名源码 mixin 逐行对照。jar 静态实例字段+方法调用
（`X.Y.m(...)` 加密分发）↔ src `模块.INSTANCE.方法(...)` 精确配对。混淆保序，多模块
mixin 按注入点逐一消歧。凡 src 无对应逻辑的 26.2 新增注入点一律标 C 不下注。

| 混淆 | 识别 | 证据 |
|---|---|---|
| t | FastWeb | MixinWebBlock 同构：`entity==dD.d.player && t.J.l()` ≡ `mc.player && FastWeb.INSTANCE.cobweb()` |
| nO | ClientIdentityHider | 双 mixin（Connection、ClientBrandRetriever）；引用集与源码一致（A-） |
| U | Xray | MixinBlock 同构：`U.W`≡`Xray.INSTANCE`、`u.N()`≡`isEnabled()`、`u.a.z()`≡`wallHack.getValue()`、`u.C(block)`≡`isCheckableOre`；MixinLightmap `U.W.N()`≡`Xray.INSTANCE.isEnabled()`。**升级：上批指纹否定错误，mixin 同构为铁证** |
| uA | Fullbright | MixinLightmap 同构：`uA.W.I()`≡`Fullbright.INSTANCE.isGammaMode()` |
| e6 | Filter | MixinLightmap 同构：`e6.c.X()`≡`Filter.INSTANCE.isLightMapMode()`、`e6.c.f().getRGB()`≡`getLightMapColor().getRGB()` |
| u | Shaders | MixinAvatarRenderer applyShadersHandArmOutline 同构：`u.H`≡`Shaders.INSTANCE`、`W.z()`≡`shouldRenderHands()`、`r(d)`≡`outlineColor.getValue().getRGB()`；MixinChestRenderer/GameRenderer 佐证 |
| uj | ElytraFly | MixinAvatarRenderer spoofFallFlyingTicks 同构：`uj.a.A()`≡`ElytraFly.INSTANCE.isArmorMode()`；MixinHumanoidMobRenderer src=ElytraFly 佐证 |
| e_ | HandsView | MixinAvatarRenderer applyThirdPersonBlockingPose 同构：`e_.k`≡`HandsView.INSTANCE`、`y(entity,arm)`≡`shouldApplyThirdPersonBlockingAnim` |
| i | FreeCamera | MixinCamera/MixinChunkBorderRenderer/MixinCompassAngleState/MixinOptions 多同构：`i.N`≡`FreeCamera.INSTANCE` |
| W | CameraClip | MixinCamera 同构：`W.h`≡`CameraClip.INSTANCE`、`y.z()`≡`distance.getValue()`、`O.z()`≡`action.getValue()`、`j()/Q()/J()`≡`updateActionCamera/getCameraPos/resetCameraPos` |
| eZ | SneakTweak | MixinCamera hookSneakTweakCameraTick 同构：`eZ.d.V()`≡`shouldSnapCameraEyeHeight()`、`Q(f)`≡`getCameraSmoothingModifier`；MixinAvatar src=SneakTweak 佐证 |
| L | NoRotate | MixinClientPacketListener handleMovePlayer 首尾夹持 +1e-6 防旋转（A-，src 同名逻辑） |
| C | Chams | MixinCapeLayer/EquipmentLayerRenderer/ItemInHandLayer/ItemStackLayerRenderState 全同构（src 引用 Chams.INSTANCE） |

| z2 | ShaderHolder | MixinGameRenderer/ItemInHandRenderer/OutputTarget 四 mixin 同构（outline 捕获/释放三链） |
| uc | ClientSetting | MixinMinecraft onUpdateTitle 同构：customTitle/customIcon/useMainMenu/replaceMinecraftFont 聚合 |
| ew | MultiTask | MixinMinecraft 双 WrapOperation：`!ew.d.N()`≡`!MultiTask.INSTANCE.isEnabled()` |
| B | UseCooldown | MixinMinecraft onStartUseItem：cooldown intSetting(0,0,4,1) 逐值一致 |
| e0 | GameAnimation | jar MixinHud（=src MixinGui，MC26.2 Gui→Hud 更名）：extractItemHotbar 选择框坐标缓动 |
| yt | HudEditorScreen | MixinGuiRenderer：`yt.L.D()`≡`HudEditorScreen.INSTANCE.renderPendingHudElements()`；常量 SNAP/PADDING 一致 |
| iS | WelcomeScreen | MixinTitleScreen init 首启分支：`(Screen)iS.Y`≡`WelcomeScreen.INSTANCE` |
| vc | MainMenuScreen | MixinTitleScreen init 第二分支：`vc.l`≡`MainMenuScreen.INSTANCE` |
| eB | CrystalChams | MixinEntityRenderer：EndCrystal shouldRender 取消，2 Color+2 Double 设置谱一致 |
| s | JumpCooldown | MixinLivingEntity aiStep noJumpDelay PUTFIELD redirect：cooldown IntSetting |
| et | BreakCooldown | MixinMultiPlayerGameMode 三 WrapOperation：cooldown intSetting(0,0,5,1) 逐值一致 |
| Xr | EntityRenderStateAccessor | MixinLivingEntityRenderer modifyRenderType：epsilon$getEntity 接口一致 |
| lM/_p | ClientSetting$TitleMode/IconMode | Dx<lM> customTitle / Dx<_p> customIcon 枚举 |
| dv/da/_S | TravelEvent/AttackSlowDownEvent/UseItemEvent | MixinPlayer/MultiPlayerGameMode 事件重构点（26.2 无参化/临时旋转） |
| Z | NameTags | MixinEntityRenderer extractNameTags 玩家名牌隐藏（B，26.2 钩子迁移） |

> 版本分叉说明：26.2 新增注入点（如 MixinCamera onGetFluidInCamera、MixinClientPacketListener
> handleAddEntity）本地字典无对应。eC 疑为 26.2 聚合型 NoRender（去流体雾+实体过滤+特效），
> 维持 C 待 hi 解密。

## 模块候选（结构分类，B/C）

121 个类直接继承 `e`（数据修复后全量）。示例特征（引用 MC 特有 API）：

| 混淆 | 特征 MC 引用 | 候选身份(参考源码) | 置信 |
|---|---|---|---|
| a | Title/Subtitle/ActionBar 包 | `Title`-类模块 | C |
| （其余模块身份见上表与 class_map.json） | | | |

## 事件类识别（锚点交集 + 字段/构造序列双证，18 个）

方法：37 个源码 `events.impl` 事件类逐一提取字段+构造参数序列；对每个事件名取
anchor_map 中引用它的 mixin 的 jar 引用集合（去枢纽 vy/dD/e/hi），做**字段 multiset 精确匹配**，
mixin 归属消歧（同型 float 事件靠不同 mixin 区分）。无 jar 冲突。

| 混淆 | 识别 | 字段序列 | 证据 |
|---|---|---|---|
| _M | BlockCollisionEvent | BlockPos, BlockState | 锚 MixinBlockCollisions；构造(BlockState,BlockPos)+setState 逐字同构 |
| du | OpenScreenEvent | Screen | 锚 MixinGuiManager |
| yC | FireworkRotationEvent | float,float | 锚 MixinFireworkRocketEntity；yaw/pitch setter+构造序一致 |
| _K | UseItemRaytraceEvent | float,float | 锚 MixinItem |
| dN | AttackEntityEvent | Entity,Player | 锚（Entity mixin 组） |
| _z | AttackYawEvent | float | 锚 |
| zV | FallFlyingEvent | float,float | 锚 |
| nS | JumpEvent | float | 锚 |
| dL | KeyPressEvent | KeyEvent,int | 锚 MixinKeyboardHandler |
| yi | KeyboardInputEvent | bool×3,float×2 | 锚 |
| dW | MousePressEvent | int×3 | 锚 |
| dm | MouseScrollEvent | double | 锚 |
| DY | RaytraceEvent | float,float | 锚 |
| d9 | Render3DEvent | PoseStack | 锚 |
| vB | RotationAnimationEvent | float×4 | 锚 |
| dA | StartDestroyBlockEvent | BlockPos,Direction | 锚 |
| Dn | StrafeEvent | float | 锚 |
| dk | DestroyBlockEvent | BlockPos | B（与 zZ 同型待消歧） |

## 模块 MC-API 指纹互指识别（数据修复后新增，37 对）

方法：121 个 jar 模块的 `net.minecraft.*` import 集合 × 108 个 26.1.2 源码模块 import 集合
做 **双向 Jaccard 互指**（jar→src 与 src→jar 的 best match 互为对方），过滤 mc 引用数 <3，
无 src 冲突（每 src 至多一个 jar 对）。版本分叉（26.2 vs 26.1.2）致 MC API 有迁移，故：
- jac ≥ 0.6 → **A-（双指纹+语义抽查）**；0.4–0.6 → **B**；<0.4 → **C（待抽查）**

| 混淆 | 识别 | jac | mc数 | 证据 |
|---|---|---|---|---|
| eN | Blink | .778 | 9 | A：7/7 Packet/RemotePlayer/MovePlayer 引用全吻合；`ConcurrentLinkedQueue<Packet>`+伪 RemotePlayer+getBlinkTicks 语义逐项一致 |
| ez | HoleESP | .750 | 6 | A-（待抽查） |
| eL | HoleSnap | .714 | 6 | A-（待抽查） |
| eM | Criticals | .667 | 5 | B |
| eY | KillAura | .667 | 5 | B |
| N | Speed | .647 | 15 | B |
| g | FeetTrap | .625 | 14 | B |
| e1 | Follower | .800 | 4 | A-（待抽查） |
| k | PacketEat | .750 | 3 | A-（待抽查） |
| D | BlockHighlight | .600 | 4 | B |
| ek | KeyPearl | .600 | 4 | B |
| R | SpearKill | .600 | 3 | B |
| ec | CrystalAura | .522 | 15 | B |
| eG | AutoMend | .500 | 3 | B |
| e_ | HandsView | .500 | 4 | B |
| F | PlayerAlarms | .500 | 10 | B |
| un | ZealotCrystalPlus | .500 | 22 | B |
| ~~p~~ | ~~Scaffold~~ | .471 | 11 | ❌**作废**：真身为 eW（CropBlock/BushBlock/FlowerBlock/NetherFungusBlock/SlabBlock 全 src 仅 Scaffold 引用）；p 实为 26.2 新增床类模块（BedBlock 全 src 0 引用） |
| e2 | AutoWeapon | .467 | 9 | B |
| C | Chams | .455 | 9 | B（锚点 MixinCapeLayer/EquipmentLayerRenderer→src Chams 佐证） |
| j | GhostHand | .455 | 10 | B |
| U | Xray | .455 | 8 | **A**（升级）：MixinBlock/MixinLightmap 逐行同构 `U.W`≡`Xray.INSTANCE`、`u.C(block)`≡`isCheckableOre`；早期 C 级否定已被同构直验推翻 |
| uF | AimBot | .455 | 9 | B |
| r | CrystalBlocker | .412 | 13 | B |
| ~~H~~ | ~~Hat~~ | .400 | 3 | ❌**作废**：真身为 P（全 jar 唯一 `double[][]` 字段 == src Hat `positions[181][2]`）；H 待重识别 |
| ue | LogoutSpots | .400 | 6 | B |
| eH | Stuck | .375 | 8 | C |
| uv | AnchorBlast | .375 | 5 | C |
| e8 | MasEffects | .360 | 14 | **A**（升级）：MC import 与 src MasEffects 交集 9 个罕见类（ClientboundEntityEventPacket/GizmoStyle/WindCharge/ThrownEnderpearl/…）+ 设置分组一致 |
| eb | PacketMine | .360 | 17 | C |
| ev | TriggerBot | .353 | 10 | C |
| i | FreeCamera | .308 | 7 | B（锚点 MixinCamera/ChunkBorderRenderer/CompassAngleState→src FreeCamera 佐证） |
| eF | Phase | .286 | 15 | C |
| n | Disabler | .250 | 3 | C |
| uA | Potions | .250 | 3 | C |
| a | AutoKouZi | .200 | 5 | C |
| f | Stealer | .167 | 10 | C |

> 未入表 jar 模块 84 个：与源码模块无互指或 mc 引用 <3。识别路径：优先查 anchor_map 的 mixin→src
> 交集（锚点 src 名→jar 引用集合），再查 hi 解密（未投入）。锚点侧强佐证示例：`e8`（MasEffects，已升 A）、
> `i`（FreeCamera）、`C`（Chams）、`U`（Xray，已由 mixin 同构直验升 A）。

## 2026-09-10 批量识别更新（class_map 182 条：118A / 19A- / 26B / 19C）

### 框架核心族（A，字段逐一对应 src）
| 混淆 | 身份 | 依据 |
|---|---|---|
| `Dl` | `Setting<V>` | 9 字段类型逐一对应（v=onChanged/W=group/q=value/E=name/n=translateComponent/p=defaultValue/t=dependency + 2 bool） |
| `yx` | `Setting$Dependency` | `@FunctionalInterface interface yx{boolean n()}` ≡ src `@FunctionalInterface Dependency{boolean check()}` |
| `uT` | `TranslateComponent` | 4 方法（void/String/String/uT）≡ src i18n 接口 4 方法 |
| `Xn`/`XG`/`DM`/`DV`/`Dx`/`Xc`/`XF`/`Xe`/`X0`/`Xp` | Bool/Int/Double/Color/Enum/String/StringList/RegistryList/Keybind/Button Setting | 泛型实参 + 字段（如 `Dl<Double>`+double×3=DoubleSetting；`Dl<List<T>>`+Type/Registry/Predicate=RegistryListSetting） |
| `Xf` | `RegistryListSetting$Type` | BLOCK/ITEM/ENTITY_TYPE/SOUND_EVENT/ENCHANTMENT 常量序 |
| `vh` | `SettingRow` | `abstract class vh<T extends Dl<?>> implements AutoCloseable` + 子类 vX(Bool)/v9(Int)/vf(Double)/vg(StringList)/vD(Button)/v7(RegistryList) |

### 事件族（A，`vy.j.d(new XX(...))` + `.l()`≡isCancelled 逐行同构）
ClientTickEvent.Pre/Post、StartUseItemEvent、RightClickEvent、LevelUpdateEvent、GameLeftEvent、
SlowdownEvent、SwingHandEvent、PlayerTickEvent.Pre/Post、SendPositionEvent、MoveEvent、
PostSendPositionEvent、RespawnEvent、GameJoinedEvent、AfterRender3DEvent、ChunkOcclusionEvent、
Render2DEvent.Level/HUD、PacketEvent.Receive/Send、TravelEvent、AttackSlowDownEvent、UseItemEvent

### 模块与组件（A/A-）
Scaffold(`eW`)、Hat(`P`)、Inventory(`e7`)、GUIMove(`E`)、NoFall(`l`)、PacketMine(`eS`)、AutoMap(`uW`)、
BlockESP(`V`)、AutoHitCrystal(`ey`)、SilentRotationManager(`zC`)、ElytraFlightMode(`gt`)+`g1`/`gd`、
I18NFileGenerator(`OD`)、ModuleHolder(`D5`)、EpsilonAddon(`iH`)、MTF(`ei`)、AutoQueue(`Q`)、
DropdownScreen(`u4`)、RegistryListSelectPopup(`DG`)、PanelInputRouter(`DN`)、AntiBot(`M`)、
FriendManager(`DU`)、CircleESP(`_C`)、Criticals(`m`)、Managers(`gp`)、ChatComponentAccessor(`i8`)、
BetterChat(`I`)、ItemPhysics(`S`)、SoundKey(`iE`)/SoundManager(`lS`)、LuminRenderSystem(`dB`)、
Clientbound/ServerboundPacketManager(`OK`/`gH`)、PacketUtils(`_5`)、Velocity(`w`)、ShaderHolder(`z2`)、
ClientSetting(`uc`)、MultiTask(`ew`)、UseCooldown(`B`)、GameAnimation(`e0`)、HudEditorScreen(`yt`)、
WelcomeScreen(`iS`)、MainMenuScreen(`vc`)、JumpCooldown(`s`)、BreakCooldown(`et`)、CrystalChams(`eB`)、
EntityRenderStateAccessor(`Xr`)、EpsilonCommon(`Xh`)、TextRenderableAdapter(`Dk`)

### 裁决与作废（`work/rejected_mappings.json`）
- `p`=Scaffold(B) ❌ → `eW`=Scaffold(A)；`H`=Hat(B) ❌ → `P`=Hat(A)；`e8`=MasEffects 升 A；`U`=Xray 升 A。
- 教训：纯 Jaccard 互指会产生系统性误配（模块共享 Setting/Module 引用）；**MC import 唯一指纹**
  （某组罕见 MC 类在全 src 树只被一个类引用）与**跨类唯一结构特征**（如全 jar 唯一 `double[][]`）才是 A 级依据。

### 新增方法
- `work/xor_strings.py`：内联 XOR 明串解密（7 类，实证 `S`→'Item Physics'、`L`→'No Rotate'、`ew`→'Multi Task'、`J`→'Anti Alias'）。
- `work/ref_fingerprint.py`：锚点引用向量 + MC-import 候选配对（产出 `ref_candidates.json`，作为线索而非结论）。

## 最终统计（第四轮结束，2026-09-10）

- **识别总数 469 条**（A 343 / A− 56 / B 70），class_map.json
- **模块覆盖 82/121 (67%)**；顶层类 469/926 (51%)
- 未识别模块 39 个（绝大多数为 26.2 新增，本地 26.1.2 字典无对照）：
  `A G H O T a b c e3 e4 e5 eC eH eP eQ eR eS eV ed ee ep eq ex f h m n o p q u0 u3 uG ua uk up uv v z`
- 诚实边界：C 级与无本地 src 佐证的推测名一律不入库（`role_notes.json` 211 条角色记录）；
  被裁决作废的结论留痕于 `rejected_mappings.json`
- 质量审计：无身份重复、无 C 级残留、证据字段完整、黑名单与映射表一致

## 关键限制声明

1. 字符串明文不在 class 中，运行时经 `hi` 解密（64 位密钥）。反编译产物内**看不到**明文语义。
2. CFR 对控制流扁平化+字符串加密会产生语义混淆（已实证 `Xn` 冲突），**单锚点判定不可尽信**，需交叉验证。
3. 公开 26.2.x 源码与 jar 分叉，无逐字节真值可用。
