/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.player.RemotePlayer
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.WalkAnimationState
 *  net.minecraft.world.entity.player.Player
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.d9;
import com.github.epsilon.hi;
import com.github.epsilon.lH;
import com.github.epsilon.uz;
import com.github.epsilon.yL;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.WalkAnimationState;
import net.minecraft.world.entity.player.Player;

final class _i
extends RemotePlayer {
    private final float f;
    private double p;
    final uz X;
    private final float U;
    private final double w;
    private final float u;
    private static final long[] a;
    private static final Integer[] b;

    public Component belowNameDisplay() {
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private _i(uz var1_1, Player var2_2) {
        v0 = Dl.S();
        v1 = var1_1;
        Objects.requireNonNull(v1);
        this.X = v1;
        super((ClientLevel)hi.a("\u00e9", (Object)uz.S(new Object[]{var1_1}), (long)430579852159213241L), new GameProfile(var2_2.getGameProfile().id(), var2_2.getGameProfile().name()));
        var3_3 = v0;
        v2 = var1_1;
        v3 = hi.a("\u00e9", (Object)v2, (long)1253601970195539049L);
        hi.a("\u00f2", (Object)v2, (int)(v3 + true), (long)1253601970195539049L);
        hi.a("\u00a5", (Object)this, (int)v3, (long)1121087542568759658L);
        v4 = hi.a("G", (Object)new Object[]{var1_1}, (long)1104476310168430069L);
        if (!var3_3) ** GOTO lbl18
        if (hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)v4, (long)430579852159213241L), (long)364929717497510628L), (long)898791947289103478L) != false) {
            v5 /* !! */  = (CallSite)1.0f;
        } else {
            v4 = hi.a("G", (Object)new Object[]{var1_1}, (long)490092953209942203L);
lbl18:
            // 2 sources

            v5 /* !! */  = hi.a("\u00a5", (Object)_i.o("iFAnjcN1GPgM9O7d", getDeltaTracker(), (Minecraft)v4), (boolean)true, (long)796171081241421004L);
        }
        var4_4 = v5 /* !! */ ;
        this.U = (float)_i.o("iFAnjcN1GPgM9O7d", position(float ), (WalkAnimationState)hi.a("\u00e9", (Object)var2_2, (long)410378720779626023L), (float)var4_4);
        this.u = (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)var2_2, (long)410378720779626023L), (float)var4_4, (long)493382440162360503L);
        this.f = (float)hi.a("\u00a5", (Object)var2_2, (float)var4_4, (long)747259147288445072L);
        this.w = (double)hi.a("\u00a5", (Object)var2_2, (long)473036431630206163L);
        hi.a("\u00a5", (Object)this, (Object)var2_2, (long)1013316819325987301L);
        _i.o("iFAnjcN1GPgM9O7d", setOldPosAndRot(), (_i)this);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)var2_2, (long)1297062149741108411L), (long)1222132614887109872L);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)1222132614887109872L), (long)1308892960156359671L);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)var2_2, (long)528835322426248533L), (long)574778194196844700L);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)574778194196844700L), (long)507157947433202092L);
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (long)875609780383070329L), (Object)hi.a("\u00a5", (Object)var2_2, (long)954710336753579911L), (long)403697797134586656L);
        hi.a("\u00a5", (Object)this, (Object)hi.a("\u00a5", (Object)var2_2, (long)411603101896400350L), (long)1327245038143371750L);
        hi.a("\u00f2", (Object)this, (InteractionHand)hi.a("\u00e9", (Object)var2_2, (long)1056867549007792002L), (long)980897203889426201L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean K(Object[] var1_1) {
        block36: {
            block37: {
                block40: {
                    block39: {
                        block38: {
                            var2_2 = (d9)var1_1[0];
                            var3_3 = Dl.t();
                            var14_4 = _i.o("iFAnjcN1GPgM9O7d", max(int int ), (int)(_i.a(29484, 2839865254942596217L) - _i.a(18551, 8264378109308692335L) - _i.a(27508, 4812890634819880035L) ^ _i.a(2207, 3936027612418156462L)), (int)_i.a(31999, 6193519223229404150L)) + _i.a(26121, 268631730214979892L);
                            if (var3_3) ** GOTO lbl-1000
                            v0 /* !! */  = var14_4;
                            if (var3_3 != false) return (boolean)v0 /* !! */ ;
                            switch (v0 /* !! */ ) {
                                default: lbl-1000:
                                // 2 sources

                                {
                                    var4_5 = hi.a("\u00a5", (Object)_i.o("iFAnjcN1GPgM9O7d", getDeltaTracker(), (Minecraft)_i.o("iFAnjcN1GPgM9O7d", Q(com.github.epsilon.uz ), (uz)hi.a("\u00e9", (Object)this, (long)968868474798019605L))), (long)525704291177296093L) / 20.0f;
                                    v1 = this;
                                    hi.a("\u00f2", (Object)v1, (double)(hi.a("\u00e9", (Object)v1, (long)1035671712546926079L) + (double)var4_5), (long)1035671712546926079L);
                                    cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)1035671712546926079L) - hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)939773715122377385L), (long)789438897355831922L)), (long)637262500311742568L);
                                    v2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                    if (var3_3) break block38;
                                    if (v2 <= 0) break;
                                    break block39;
                                }
                                case -299813296: {
                                    break block36;
                                }
                            }
                            v2 = var14_4 = (reference)((_i.a(11991, 7679960329308832129L) / 5 * _i.a(25271, 8432615144019283347L) ^ _i.a(4619, 7418801876088470795L)) * _i.a(25592, 1901655234682801383L) ^ _i.a(25685, 4137165362721639295L));
                        }
                        if (!var3_3) break block40;
                    }
                    var14_4 = (reference)((_i.a(5522, 7717171255802215069L) ^ _i.a(15669, 4131621344423186972L)) + _i.a(21339, 2118238961003134044L));
                    if (!var3_3) break block40;
                    ** GOTO lbl126
lbl27:
                    // 2 sources

                    while (true) {
                        block47: {
                            block46: {
                                block45: {
                                    block44: {
                                        block43: {
                                            block42: {
                                                block41: {
                                                    var5_6 /* !! */  = v3 /* !! */ ;
                                                    hi.a("\u00f2", (Object)this, (int)((int)(hi.a("\u00e9", (Object)this, (long)1035671712546926079L) * 20.0)), (long)822169883078368897L);
                                                    var6_7 = hi.a("G", (float)((float)(hi.a("\u00e9", (Object)this, (long)1035671712546926079L) / _i.o("iFAnjcN1GPgM9O7d", doubleValue(), (Double)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)939773715122377385L), (long)789438897355831922L))))), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                                                    hi.a("\u00a5", (Object)this, (double)hi.a("\u00a5", (Object)this, (long)843838401278497000L), (double)(hi.a("\u00e9", (Object)this, (long)615196956383048412L) + hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)1262128519153759915L), (long)789438897355831922L)), (long)637262500311742568L) * _i.o("iFAnjcN1GPgM9O7d", doubleValue(), (Double)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)939773715122377385L), (long)789438897355831922L))) * (double)hi.a("\u00a5", (Object)((Float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((lH)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)742389820618305902L), (long)789438897355831922L)), (long)1141210563691722787L), (Object)hi.a("G", (float)var6_7, (long)1097085248186378937L), (long)1109315089994431641L)), (long)1263586790430806583L)), (double)hi.a("\u00a5", (Object)this, (long)1011613875966531266L), (long)933523429598546727L);
                                                    hi.a("\u00a5", (Object)this, (long)708453991169365619L);
                                                    hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)1222132614887109872L), (long)1308892960156359671L);
                                                    hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)574778194196844700L), (long)507157947433202092L);
                                                    hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)672252071630247106L), (long)795130497490308421L);
                                                    hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)672252071630247106L), (long)729571901259081541L);
                                                    var7_8 = 1.0 + hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)393398974896456855L), (long)789438897355831922L)), (long)637262500311742568L) * hi.a("\u00e9", (Object)this, (long)1035671712546926079L);
                                                    cfr_temp_1 = var7_8 - 0.0;
                                                    v4 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                    if (var3_3) break block41;
                                                    if (v4 <= 0) break block42;
                                                    v4 = (_i.a(1039, 4335881142142282550L) * _i.a(3107, 334431615508226839L) / _i.a(17613, 5672930956614855651L) - _i.a(17673, 1208401772076362330L)) * _i.a(12417, 7018875689177456525L) + _i.a(16942, 1801238280268606842L);
                                                }
                                                var14_4 = (reference)v4;
                                                if (!var3_3) break block43;
                                            }
                                            var14_4 = (reference)(_i.a(22472, 4233227047776024818L) - _i.a(30660, 718182268088146145L) ^ _i.a(21597, 195754624379124560L));
                                        }
                                        v5 /* !! */  = var14_4;
                                        if (var3_3 != false) return (boolean)v5 /* !! */ ;
                                        switch (v5 /* !! */ ) {
                                            default: {
                                                v5 /* !! */  = (CallSite)true;
                                                return (boolean)v5 /* !! */ ;
                                            }
                                            case -191569312: {
                                                var9_9 = _i.o("iFAnjcN1GPgM9O7d", getAlpha(), (Color)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)1046524242008820353L), (long)789438897355831922L)));
                                                var10_10 = _i.o("iFAnjcN1GPgM9O7d", getAlpha(), (Color)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)891577673988073251L), (long)789438897355831922L)));
                                                v6 = _i.o("iFAnjcN1GPgM9O7d", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)515998117006916337L), (long)789438897355831922L)));
                                                if (var3_3) break block44;
                                                if (v6 == false) break;
                                                break block45;
                                            }
                                            case -191569314: {
                                                throw null;
                                            }
                                        }
                                        v6 = var14_4 = hi.a("G", (int)((_i.a(14246, 3989266012168853691L) ^ _i.a(23524, 3555487917953971411L)) / _i.a(5974, 8512352900712740941L)), (int)_i.a(10491, 2419611639449126882L), (long)834203424483934088L) / _i.a(28439, 8489761369229312060L) + _i.a(25104, 7350235011975105827L);
                                    }
                                    if (!var3_3) break block46;
                                }
                                var14_4 = (reference)((_i.a(11418, 6056671400061371294L) / _i.a(19649, 5031398401344857051L) + _i.a(10855, 1668545622468953418L)) * _i.a(2401, 7314209301729617522L) - _i.a(15091, 7183933788800357825L));
                            }
                            v0 /* !! */  = var14_4;
                            if (var3_3 != false) return (boolean)v0 /* !! */ ;
                            switch (v0 /* !! */ ) {
                                default: {
                                    v7 = (float)hi.a("G", (double)0.0, (double)(1.0 - hi.a("\u00e9", (Object)this, (long)1035671712546926079L) / hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)939773715122377385L), (long)789438897355831922L)), (long)637262500311742568L)), (long)667573796910998930L);
                                    var14_4 = hi.a("G", (int)(_i.a(29973, 1945006226891627054L) / _i.a(32334, 2391655940741189997L)), (int)_i.a(10961, 3771179170528429561L), (long)834203424483934088L) * _i.a(291, 3060159641541684748L) + _i.a(7957, 4706591261156945971L);
                                    if (var3_3) {
                                        break;
                                    }
                                    break block47;
                                }
                                case 956654717: {
                                    v7 = 1.0f;
                                    if (!var3_3) break;
                                    ** GOTO lbl-1000
                                }
                                case 956654719: {
                                    break block36;
                                }
                            }
                            var14_4 = _i.o("iFAnjcN1GPgM9O7d", max(int int ), (int)(_i.a(20988, 6621603130832223939L) / _i.a(25120, 3146028658557209916L)), (int)_i.a(9635, 6749812388735945366L)) * _i.a(14087, 756268269993826309L) + _i.a(13711, 8870494741167872703L);
                        }
                        switch (var14_4) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var11_11 = v7;
                                _i.o("iFAnjcN1GPgM9O7d", epsilon$freeze(float float float ), (yL)((yL)hi.a("\u00e9", (Object)this, (long)458169170560004534L)), (float)hi.a("\u00e9", (Object)this, (long)585955751242527703L), (float)hi.a("\u00e9", (Object)this, (long)1155285071854853227L), (float)var5_6 /* !! */ );
                                v8 = new Object[2];
                                v8[1] = (int)hi.a("G", (float)((float)var9_9 * var11_11), (long)400355798406630015L);
                                v8[0] = (Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)1046524242008820353L), (long)789438897355831922L);
                                var12_12 = hi.a("\u00a5", (Object)this, (Object)v8, (long)371821000077537185L);
                                v9 = new Object[2];
                                v9[1] = (int)_i.o("iFAnjcN1GPgM9O7d", round(float ), (float)((float)var10_10 * var11_11));
                                v9[0] = (Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)968868474798019605L), (long)891577673988073251L), (long)789438897355831922L);
                                var13_13 = hi.a("\u00a5", (Object)this, (Object)v9, (long)371821000077537185L);
                                hi.a("G", (Object)_i.o("iFAnjcN1GPgM9O7d", K(), (d9)var2_2), (Object)this, (double)var7_8, (Object)var12_12, (Object)var13_13, (float)2.0f, (long)583933405669409937L);
                                return false;
                            }
                            case 818025102: 
                        }
                        return (boolean)_i.o("iFAnjcN1GPgM9O7d", M());
                    }
                }
                block24: while (true) {
                    block49: {
                        block48: {
                            switch (var14_4) {
                                case -1086845022: {
                                    v10 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)968868474798019605L)}, (long)945064682999247469L), (long)430579852159213241L), (long)364929717497510628L), (long)898791947289103478L);
                                    if (var3_3) break block48;
                                    if (v10 == false) break;
                                    break block49;
                                }
                                case -1086845025: {
                                    v3 /* !! */  = 1.0f;
                                    var14_4 = (reference)((_i.a(31348, 1500256559958938963L) ^ _i.a(2808, 1825903164980930026L)) / _i.a(11392, 6987061864106591109L) + _i.a(15908, 3184264989622145298L));
                                    if (var3_3) {
                                        break block24;
                                    }
                                    break block37;
                                }
                                case -1086845021: {
                                    v3 /* !! */  = (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)968868474798019605L)}, (long)950433034685151146L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
                                    if (!var3_3) break block24;
                                    ** GOTO lbl27
                                }
                                case -1086845023: {
                                    hi.a("G", (long)1201432730590593927L);
                                    return true;
                                }
                            }
lbl126:
                            // 2 sources

                            v10 = var14_4 = (reference)(hi.a("G", (int)(_i.a(1537, 2101060279234767104L) - _i.a(21211, 5965175159529930190L) - _i.a(13382, 3325281845980994373L)), (int)_i.a(8879, 6488096514057538983L), (long)834203424483934088L) ^ _i.a(3578, 8896872404083024603L));
                        }
                        if (!var3_3) continue;
                    }
                    var14_4 = (reference)((_i.a(28283, 9057623190038888745L) ^ _i.a(32159, 6143013318216209044L)) + _i.a(29411, 4933244806502243829L) ^ _i.a(926, 3967546112036678834L) ^ _i.a(4192, 9022100536032182082L));
                }
                var14_4 = (reference)((_i.a(27520, 5161434639849964678L) ^ _i.a(18424, 2925746874328672502L)) / _i.a(15476, 8873500226370540362L) + _i.a(24474, 5542416968623255696L));
                break block37;
                return true;
            }
            while (true) {
                switch (var14_4) {
                    default: {
                        ** continue;
                    }
                    case -1197013155: 
                }
                hi.a("G", (int)_i.a(25124, 2492209580432280836L), (long)902898246708732704L);
                var14_4 = (reference)((_i.a(28132, 1850680941725598452L) - _i.a(2419, 1582711618185438829L) - _i.a(22405, 7020824470989699261L) ^ _i.a(22860, 6671184820155708955L)) + _i.a(14651, 6161749601988875818L) - _i.a(6690, 7294688889417119030L));
            }
        }
        v0 /* !! */  = (CallSite)false;
        return (boolean)v0 /* !! */ ;
    }

    private Color k(Object[] objectArray) {
        Object object = objectArray[0];
        int n = (Integer)objectArray[1];
        return new Color((int)hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L), (int)_i.o("iFAnjcN1GPgM9O7d", getGreen(), (Color)((Color)object)), (int)hi.a("\u00a5", (Object)((Color)object), (long)505295769199362574L), (int)hi.a("G", (int)n, (int)0, (int)_i.a(8264, 5789502520731012980L), (long)1051766797435725461L));
    }

    public boolean shouldShowName() {
        return false;
    }

    public static /* bridge */ /* synthetic */ CallSite o(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4547542717695461915L;
                var6_1 = new long[70];
                var3_2 = 0;
                var4_3 = "+i\u001e\u00e0|\u00d2(Nn`*J\u00cc\u00124\u00b7\u00ecf-i\u008bw\u00e9\u00ef\u00e9\u00f3uZ\u00f0\u00d7\u008d\u0081\u00dbT\u00dc\u0090K\u00fa\n\u0084\u001d\u0091o\u00f1\u00a9/K\u008e\u0013\u00c8\u0000\u00c7\u007f\u0014e0g\u00c9\u008b\u00fa\u00abR\u00a1@\u0005\u00d9\u00b2lF!\u00dc\u00c9\u0092\u00a6\u00f11\u00f7\u00eb\u0092\u00e9\u00c0\u0085\u001f\u00f3\u0087\u00a7G-\u001av\u00dc\u008f\u001b\u001a5\u00e1E\u0005\u0015\u00a9B\u0087\u00e9\u00c6E\u0001\u00fd\u00bc\u00e0\u0098\u00b2X\u00bf\u001dK4\t\u00a4/\u0016-\u00b9\u00c3\u00c2\u00c82\u00d6,\u0001\u00f8_\u008c\u00c5\u00f5\u0088\u00dd\u000f\u00ecC\u00bc\u008f\u0006B>9\u009b\u00cf\u00ef\u00c9\u008e\u000fo\u00c5\u00f6\u00cc\u00e9\u0010\u00e7\u0089\u0095\u00a4\u00c7\u00b2}l\u00de\u001f\u00e7\u008c\u0090\u0017\u00dc|\u00f0\u001a\u00d10\u00f7Nbg\u00d2>w\u001e}\u00e3\u00bf\u00044!pz5\u00f7_\u0086\u0018\u00c7\u0098G\u00b1\u00b52\u00ad\u00c8O\u00cb\u0084\u0093\u00cf\f\u001f\nx?[$\u0086Hu\u0012\u0012\u00c1\u00ca\u0080\u0092\u00c3\u008b\u00b5\u00db\u00caVw\u00d4\u00c4\u00c1\u00d4\u00ef\u00aa\u00e1\u0083)\u00bdF\u00daEYs\u00cd\u00a6\u00e3\u00f1\u0099\u0007\u0088j\u0092L?\u00a1s:HP\u00ef\u00a1Y\b\u007femh\u00ff\u00f8>\u000f\b\u00f2{\u00e70\u00d9R\u00ff\u00d4\u00a4\u00ceZ\u00ae\u00ff\u00f4vk[\t\u0007\u00c4Lk\u00e1\u0086\u0086ds\u008d#O\u001a~v\u00c0\u00a1\u00f9.Qx\u00d6+\u00ce\u008f|\u00bf\u00b2*\r\u0019Z[\u0095B\"l\u001a\u00ca\u0098\u00ca\u007f\u00bcIWA\u0085\u0090\u009b\u008fU\u00d4|\u001f~\u00cb\n\u00a4s\u000ei{O\u00eb\n\u00acB8#\b\u00eeu\u00fa\u00ecg\u0017\tr\u00df\u008f\u0092$\u0089f\u008e\u008c\u0094\u00ee\u0081\u0002\u0081\u009a\u00c7\u0001\u00dcL\u0090\u00edHP\u001a\u001f\u0099\b\u00e6\u0012\u008c\u00b1b`\u001cAv\u001bV\u00e4\u00c6xi\u00d7,\u00dd\r\u0004W\u00a7\u00e8\u008bD\u008e\u00be\u00b6\u0015\u00f3\u00db|U\u00fag]\u00baZ\u00c7?0\u0019\u00fd\u00f0\u00d4c\u00e5\u0086\u00f8\u0002\u001c$\t\u007fa\u00e8\u00ddN\u0012\u0010y+\u00a9\u00ee\u00d7n\u00db\u009d\u00b6\u00c4\u00a5\u00e2\u0095\u00a0T+\u00ff\u00a1\u00bddt\u00d0\u00e4\u001a\u0088K\u0081\u00cb\u00fc\u00a2Ka\u0011\u0098J7\u00b8\u00ad\u00fd\u00cbgD\u00ab\u00a1w>\u00af\u00aat\u00a3<m|T\u009e\u00e1 \u000bbXv\u0082c\u00e7\u00b2\u00da5Q\u00b3\u00a3\u00f6\u0082\u00be\u00b7o\u0004\u0005Nh\u0011g\u00f5m%";
                var5_4 = "+i\u001e\u00e0|\u00d2(Nn`*J\u00cc\u00124\u00b7\u00ecf-i\u008bw\u00e9\u00ef\u00e9\u00f3uZ\u00f0\u00d7\u008d\u0081\u00dbT\u00dc\u0090K\u00fa\n\u0084\u001d\u0091o\u00f1\u00a9/K\u008e\u0013\u00c8\u0000\u00c7\u007f\u0014e0g\u00c9\u008b\u00fa\u00abR\u00a1@\u0005\u00d9\u00b2lF!\u00dc\u00c9\u0092\u00a6\u00f11\u00f7\u00eb\u0092\u00e9\u00c0\u0085\u001f\u00f3\u0087\u00a7G-\u001av\u00dc\u008f\u001b\u001a5\u00e1E\u0005\u0015\u00a9B\u0087\u00e9\u00c6E\u0001\u00fd\u00bc\u00e0\u0098\u00b2X\u00bf\u001dK4\t\u00a4/\u0016-\u00b9\u00c3\u00c2\u00c82\u00d6,\u0001\u00f8_\u008c\u00c5\u00f5\u0088\u00dd\u000f\u00ecC\u00bc\u008f\u0006B>9\u009b\u00cf\u00ef\u00c9\u008e\u000fo\u00c5\u00f6\u00cc\u00e9\u0010\u00e7\u0089\u0095\u00a4\u00c7\u00b2}l\u00de\u001f\u00e7\u008c\u0090\u0017\u00dc|\u00f0\u001a\u00d10\u00f7Nbg\u00d2>w\u001e}\u00e3\u00bf\u00044!pz5\u00f7_\u0086\u0018\u00c7\u0098G\u00b1\u00b52\u00ad\u00c8O\u00cb\u0084\u0093\u00cf\f\u001f\nx?[$\u0086Hu\u0012\u0012\u00c1\u00ca\u0080\u0092\u00c3\u008b\u00b5\u00db\u00caVw\u00d4\u00c4\u00c1\u00d4\u00ef\u00aa\u00e1\u0083)\u00bdF\u00daEYs\u00cd\u00a6\u00e3\u00f1\u0099\u0007\u0088j\u0092L?\u00a1s:HP\u00ef\u00a1Y\b\u007femh\u00ff\u00f8>\u000f\b\u00f2{\u00e70\u00d9R\u00ff\u00d4\u00a4\u00ceZ\u00ae\u00ff\u00f4vk[\t\u0007\u00c4Lk\u00e1\u0086\u0086ds\u008d#O\u001a~v\u00c0\u00a1\u00f9.Qx\u00d6+\u00ce\u008f|\u00bf\u00b2*\r\u0019Z[\u0095B\"l\u001a\u00ca\u0098\u00ca\u007f\u00bcIWA\u0085\u0090\u009b\u008fU\u00d4|\u001f~\u00cb\n\u00a4s\u000ei{O\u00eb\n\u00acB8#\b\u00eeu\u00fa\u00ecg\u0017\tr\u00df\u008f\u0092$\u0089f\u008e\u008c\u0094\u00ee\u0081\u0002\u0081\u009a\u00c7\u0001\u00dcL\u0090\u00edHP\u001a\u001f\u0099\b\u00e6\u0012\u008c\u00b1b`\u001cAv\u001bV\u00e4\u00c6xi\u00d7,\u00dd\r\u0004W\u00a7\u00e8\u008bD\u008e\u00be\u00b6\u0015\u00f3\u00db|U\u00fag]\u00baZ\u00c7?0\u0019\u00fd\u00f0\u00d4c\u00e5\u0086\u00f8\u0002\u001c$\t\u007fa\u00e8\u00ddN\u0012\u0010y+\u00a9\u00ee\u00d7n\u00db\u009d\u00b6\u00c4\u00a5\u00e2\u0095\u00a0T+\u00ff\u00a1\u00bddt\u00d0\u00e4\u001a\u0088K\u0081\u00cb\u00fc\u00a2Ka\u0011\u0098J7\u00b8\u00ad\u00fd\u00cbgD\u00ab\u00a1w>\u00af\u00aat\u00a3<m|T\u009e\u00e1 \u000bbXv\u0082c\u00e7\u00b2\u00da5Q\u00b3\u00a3\u00f6\u0082\u00be\u00b7o\u0004\u0005Nh\u0011g\u00f5m%".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u000f~\u001e\u00d61\u00c1-q\u00ef\u00c7~C\u00fd\u00ea3\u00a6";
                    var5_4 = "\u000f~\u001e\u00d61\u00c1-q\u00ef\u00c7~C\u00fd\u00ea3\u00a6".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        _i.a = var6_1;
        _i.b = new Integer[70];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F16;
        if (b[n2] == null) {
            _i.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
