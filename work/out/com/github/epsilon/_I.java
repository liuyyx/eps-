/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4f
 *  org.joml.Quaternionfc
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.XG;
import com.github.epsilon.Xi;
import com.github.epsilon.eR;
import com.github.epsilon.hi;
import com.mojang.blaze3d.vertex.PoseStack;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;

class _I {
    private float r;
    private float Q;
    private float K;
    private float R;
    private float m;
    private float a;
    final eR E;
    private long i;
    private final float U;
    private final long j;
    private float P;
    private float y;
    private final Color w;
    private float J;
    private float M;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    private Vec3 P(float f) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)1017684372462158179L)}, (long)960641199562686404L), (long)968554650154943535L), (long)529286173586661242L);
        double d = (double)hi.a("G", (float)f, (float)hi.a("\u00e9", (Object)this, (long)550075630611812339L), (float)hi.a("\u00e9", (Object)this, (long)1118830300317153935L), (long)899322658622726380L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1300412705618690751L);
        double d2 = (double)hi.a("G", (float)f, (float)hi.a("\u00e9", (Object)this, (long)909189295325812045L), (float)hi.a("\u00e9", (Object)this, (long)593596291378468147L), (long)899322658622726380L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1294071886475894755L);
        double d3 = (double)_I.K("CgbQZ0m4lN4JN1lf", lerp(float float float ), (float)f, (float)hi.a("\u00e9", (Object)this, (long)488319467289470701L), (float)hi.a("\u00e9", (Object)this, (long)1143188240415580615L)) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1282612456329596420L);
        return new Vec3(d, d2, d3);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean M() {
        block28: {
            block31: {
                block30: {
                    block29: {
                        var1_1 = Dl.S();
                        var4_2 /* !! */  = _I.a(10193, 6050800515864658549L) * _I.a(7845, 7358780699080047392L) ^ _I.a(18775, 4251635384170409196L);
                        if (!var1_1) ** GOTO lbl-1000
                        v0 = var4_2 /* !! */ ;
                        if (var1_1 == false) return v0;
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var2_3 = _I.K("CgbQZ0m4lN4JN1lf", sqrt(double ), (double)((double)(hi.a("\u00e9", (Object)this, (long)545047084787609617L) * hi.a("\u00e9", (Object)this, (long)545047084787609617L) + hi.a("\u00e9", (Object)this, (long)1034084659473852779L) * hi.a("\u00e9", (Object)this, (long)1034084659473852779L))));
                                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)1118830300317153935L), (long)550075630611812339L);
                                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)593596291378468147L), (long)909189295325812045L);
                                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)1143188240415580615L), (long)488319467289470701L);
                                v1 = this;
                                hi.a("\u00f2", (Object)v1, (float)(hi.a("\u00e9", (Object)v1, (long)1118830300317153935L) + hi.a("\u00e9", (Object)this, (long)545047084787609617L)), (long)1118830300317153935L);
                                v2 = this;
                                hi.a("\u00f2", (Object)v2, (float)(hi.a("\u00e9", (Object)v2, (long)593596291378468147L) + hi.a("\u00e9", (Object)this, (long)961936559509290205L)), (long)593596291378468147L);
                                v3 = this;
                                hi.a("\u00f2", (Object)v3, (float)(hi.a("\u00e9", (Object)v3, (long)1143188240415580615L) + hi.a("\u00e9", (Object)this, (long)1034084659473852779L)), (long)1143188240415580615L);
                                v4 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L)), (double)((double)(hi.a("\u00e9", (Object)this, (long)593596291378468147L) - hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1017684372462158179L), (long)1247840145017922589L), (long)789438897355831922L)), (long)371266768739483732L) / 10.0f)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L)), (long)702361650549204394L);
                                if (!var1_1) break block29;
                                if (v4 /* !! */  == false) break;
                                break block30;
                            }
                            case 598874453: {
                                hi.a("G", (int)2, (long)453709928243117811L);
                                hi.a("G", (float)1.0f, (float)100.0f, (long)1060325894040809393L);
                                return false;
                            }
                        }
                        var4_2 /* !! */  = (int)(hi.a("G", (int)_I.a(26961, 483564503093955739L), (int)_I.a(13776, 1334665941810188322L), (long)834203424483934088L) / _I.a(18862, 1611490421609458694L) * _I.a(10527, 5524428508521172133L) + _I.a(7687, 729126107967601553L));
                        v4 /* !! */  = (reference)var4_2 /* !! */ ;
                    }
                    if (var1_1) break block31;
                }
                var4_2 /* !! */  = _I.a(31893, 1056004249277913442L) / _I.a(22000, 7889739640264814604L) - _I.a(25510, 8306675748406969869L) - _I.a(16769, 1116665237375869957L);
                if (var1_1) break block31;
                ** GOTO lbl135
lbl36:
                // 2 sources

                while (true) {
                    v5 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L) - var2_3), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L) - var2_3), (long)702361650549204394L);
                    if (!var1_1) ** GOTO lbl138
                    if (v5 /* !! */  != false) ** GOTO lbl137
                    ** GOTO lbl140
                    break;
                }
lbl41:
                // 2 sources

                while (true) {
                    v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1017684372462158179L), (long)1017324364461560399L), (Object)hi.a("j", (long)441303035586271029L), (long)511460060498514638L);
                    if (!var1_1) ** GOTO lbl202
                    if (v6 /* !! */  == false) ** GOTO lbl201
                    ** GOTO lbl203
                    break;
                }
lbl46:
                // 2 sources

                while (true) {
                    v7 = this;
                    hi.a("\u00f2", (Object)v7, (float)(hi.a("\u00e9", (Object)v7, (long)545047084787609617L) / 1.005f), (long)545047084787609617L);
                    v8 = this;
                    hi.a("\u00f2", (Object)v8, (float)(hi.a("\u00e9", (Object)v8, (long)961936559509290205L) / 1.005f), (long)961936559509290205L);
                    v9 = this;
                    hi.a("\u00f2", (Object)v9, (float)(hi.a("\u00e9", (Object)v9, (long)1034084659473852779L) / 1.005f), (long)1034084659473852779L);
                    cfr_temp_0 = hi.a("G", (long)658960450018995719L) - hi.a("\u00e9", (Object)this, (long)874688478584400159L) - (long)hi.a("\u00a5", (Object)((Integer)_I.K("CgbQZ0m4lN4JN1lf", z(), (XG)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1017684372462158179L), (long)502247207997826825L))), (long)1260538186742955956L) * _I.d;
                    v10 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (!var1_1) ** GOTO lbl209
                    if (v10 /* !! */  <= 0) ** GOTO lbl208
                    ** GOTO lbl210
                    break;
                }
            }
            block26: while (true) {
                block54: {
                    block53: {
                        block52: {
                            block50: {
                                block51: {
                                    block49: {
                                        block47: {
                                            block48: {
                                                block46: {
                                                    block44: {
                                                        block45: {
                                                            block43: {
                                                                block41: {
                                                                    block42: {
                                                                        block40: {
                                                                            block38: {
                                                                                block39: {
                                                                                    block37: {
                                                                                        block35: {
                                                                                            block36: {
                                                                                                block34: {
                                                                                                    block32: {
                                                                                                        block33: {
                                                                                                            switch (var4_2 /* !! */  ? 1 : 0) {
                                                                                                                default: {
                                                                                                                    hi.a("\u00f2", (Object)this, (float)(-hi.a("\u00e9", (Object)this, (long)961936559509290205L) / 1.1f), (long)961936559509290205L);
                                                                                                                    v11 = this;
                                                                                                                    hi.a("\u00f2", (Object)v11, (float)(hi.a("\u00e9", (Object)v11, (long)545047084787609617L) / 1.1f), (long)545047084787609617L);
                                                                                                                    v12 = this;
                                                                                                                    hi.a("\u00f2", (Object)v12, (float)(hi.a("\u00e9", (Object)v12, (long)1034084659473852779L) / 1.1f), (long)1034084659473852779L);
                                                                                                                    if (var1_1) break;
                                                                                                                    ** GOTO lbl36
                                                                                                                }
                                                                                                                case -1221387989: {
                                                                                                                    ** continue;
                                                                                                                }
                                                                                                                case -1221387997: {
                                                                                                                    v13 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L) + var2_3), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L) + var2_3), (long)702361650549204394L);
                                                                                                                    if (!var1_1) break block32;
                                                                                                                    if (v13 /* !! */  != false) break block33;
                                                                                                                    break block34;
                                                                                                                }
                                                                                                                case -1221387988: {
                                                                                                                    v14 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L) + var2_3), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L) - var2_3), (long)702361650549204394L);
                                                                                                                    if (!var1_1) break block35;
                                                                                                                    if (v14 /* !! */  != false) break block36;
                                                                                                                    break block37;
                                                                                                                }
                                                                                                                case -1221387993: {
                                                                                                                    v15 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L) - var2_3), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L) + var2_3), (long)702361650549204394L);
                                                                                                                    if (!var1_1) break block38;
                                                                                                                    if (v15 /* !! */  != false) break block39;
                                                                                                                    break block40;
                                                                                                                }
                                                                                                                case -1221388001: {
                                                                                                                    v16 /* !! */  = _I.K("CgbQZ0m4lN4JN1lf", Q(double double double ), (_I)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L) + var2_3), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L)));
                                                                                                                    if (!var1_1) break block41;
                                                                                                                    if (v16 /* !! */  != false) break block42;
                                                                                                                    break block43;
                                                                                                                }
                                                                                                                case -1221387987: {
                                                                                                                    v17 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L) - var2_3), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L)), (long)702361650549204394L);
                                                                                                                    if (!var1_1) break block44;
                                                                                                                    if (v17 /* !! */  != false) break block45;
                                                                                                                    break block46;
                                                                                                                }
                                                                                                                case -1221387995: {
                                                                                                                    v18 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L)), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L) + var2_3), (long)702361650549204394L);
                                                                                                                    if (!var1_1) break block47;
                                                                                                                    if (v18 /* !! */  != false) break block48;
                                                                                                                    break block49;
                                                                                                                }
                                                                                                                case -1221387990: {
                                                                                                                    v19 /* !! */  = hi.a("\u00a5", (Object)this, (double)((double)hi.a("\u00e9", (Object)this, (long)1118830300317153935L)), (double)((double)hi.a("\u00e9", (Object)this, (long)593596291378468147L)), (double)((double)hi.a("\u00e9", (Object)this, (long)1143188240415580615L) - var2_3), (long)702361650549204394L);
                                                                                                                    if (!var1_1) break block50;
                                                                                                                    if (v19 /* !! */  == false) break block51;
                                                                                                                    break block52;
                                                                                                                }
                                                                                                                case -1221387991: {
                                                                                                                    hi.a("\u00f2", (Object)this, (float)(-hi.a("\u00e9", (Object)this, (long)545047084787609617L)), (long)545047084787609617L);
                                                                                                                    hi.a("\u00f2", (Object)this, (float)(-hi.a("\u00e9", (Object)this, (long)1034084659473852779L)), (long)1034084659473852779L);
                                                                                                                    if (var1_1) break block53;
                                                                                                                    ** GOTO lbl41
                                                                                                                }
                                                                                                                case -1221387996: {
                                                                                                                    ** continue;
                                                                                                                }
                                                                                                                case -1221388000: {
                                                                                                                    v20 = this;
                                                                                                                    hi.a("\u00f2", (Object)v20, (float)(hi.a("\u00e9", (Object)v20, (long)961936559509290205L) - 0.035f), (long)961936559509290205L);
                                                                                                                    if (var1_1) break block54;
                                                                                                                    ** GOTO lbl46
                                                                                                                }
                                                                                                                case -1221387994: {
                                                                                                                    ** continue;
                                                                                                                }
                                                                                                                case -1221387999: {
                                                                                                                    v21 = true;
                                                                                                                    var4_2 /* !! */  = hi.a("G", (int)(_I.a(29658, 2572449076743493139L) + _I.a(1108, 515383861443174839L)), (int)_I.a(19456, 2961884334202218907L), (long)834203424483934088L) ^ _I.a(407, 5546873266701476974L);
                                                                                                                    if (!var1_1) {
                                                                                                                        break block26;
                                                                                                                    }
                                                                                                                    break block28;
                                                                                                                }
                                                                                                                case -1221387998: {
                                                                                                                    v21 = false;
                                                                                                                    if (var1_1) break block26;
                                                                                                                    return v21;
                                                                                                                }
                                                                                                                case -1221387986: {
                                                                                                                    hi.a("G", (long)963057718638705759L);
                                                                                                                    var4_2 /* !! */  = _I.a(20032, 7280598081622436820L) * _I.a(3925, 9178163092615899898L) ^ _I.a(14537, 4993894720023043454L);
                                                                                                                    continue block26;
                                                                                                                }
                                                                                                            }
lbl135:
                                                                                                            // 2 sources

                                                                                                            var4_2 /* !! */  = _I.a(23820, 3859281531414411485L) + _I.a(6828, 1623913087212142338L) ^ _I.a(16041, 3094098341942532931L);
                                                                                                            if (var1_1) continue;
lbl137:
                                                                                                            // 2 sources

                                                                                                            v5 /* !! */  = (CallSite)(_I.a(4855, 8062869883672475396L) / 2 - _I.a(20716, 5033413750981522742L));
lbl138:
                                                                                                            // 2 sources

                                                                                                            var4_2 /* !! */  = (int)v5 /* !! */ ;
                                                                                                            if (var1_1) continue;
lbl140:
                                                                                                            // 2 sources

                                                                                                            var4_2 /* !! */  = (int)(hi.a("G", (int)(_I.a(450, 8290606623652979779L) + _I.a(31660, 6003703774760263230L)), (int)_I.a(19238, 7439424337004228248L), (long)834203424483934088L) + _I.a(7615, 9193897476716836911L));
                                                                                                            if (var1_1) continue;
                                                                                                        }
                                                                                                        v13 /* !! */  = (CallSite)(_I.a(21309, 1636026232764528349L) / 2 - _I.a(25762, 9165260632387240269L));
                                                                                                    }
                                                                                                    var4_2 /* !! */  = (int)v13 /* !! */ ;
                                                                                                    if (var1_1) continue;
                                                                                                }
                                                                                                var4_2 /* !! */  = (hi.a("G", (int)(_I.a(31867, 2707859905475238361L) / _I.a(5099, 9208838071529158234L)), (int)_I.a(7264, 8837970313899129262L), (long)834203424483934088L) ^ _I.a(25075, 356614332674098240L)) - _I.a(20162, 1315704553493031711L);
                                                                                                if (var1_1) continue;
                                                                                            }
                                                                                            v14 /* !! */  = (CallSite)(_I.a(21309, 1636026232764528349L) / 2 - _I.a(25762, 9165260632387240269L));
                                                                                        }
                                                                                        var4_2 /* !! */  = (int)v14 /* !! */ ;
                                                                                        if (var1_1) continue;
                                                                                    }
                                                                                    var4_2 /* !! */  = (int)(_I.K("CgbQZ0m4lN4JN1lf", max(int int ), (int)(_I.a(29448, 7664130660153677536L) ^ _I.a(3680, 3556202473177426866L)), (int)_I.a(2525, 867451571935358003L)) - _I.a(4928, 2884813027157227164L) - _I.a(1956, 448739893145707024L));
                                                                                    if (var1_1) continue;
                                                                                }
                                                                                v15 /* !! */  = (CallSite)(_I.a(21309, 1636026232764528349L) / 2 - _I.a(25762, 9165260632387240269L));
                                                                            }
                                                                            var4_2 /* !! */  = (int)v15 /* !! */ ;
                                                                            if (var1_1) continue;
                                                                        }
                                                                        var4_2 /* !! */  = (_I.a(29226, 5179585408840390632L) + _I.a(14939, 9144009337757278168L)) * _I.a(21292, 112981917687445209L) * _I.a(958, 2583184608411035196L) ^ _I.a(31309, 3671699582069661668L);
                                                                        if (var1_1) continue;
                                                                    }
                                                                    v16 /* !! */  = (CallSite)(_I.a(21309, 1636026232764528349L) / 2 - _I.a(25762, 9165260632387240269L));
                                                                }
                                                                var4_2 /* !! */  = (int)v16 /* !! */ ;
                                                                if (var1_1) continue;
                                                            }
                                                            var4_2 /* !! */  = (int)(hi.a("G", (int)_I.a(11178, 8722542788747726415L), (int)_I.a(1942, 7143856741630419536L), (long)834203424483934088L) - _I.a(12875, 8374464839404525547L) + _I.a(17127, 6625831063797589820L));
                                                            if (var1_1) continue;
                                                        }
                                                        v17 /* !! */  = (CallSite)(_I.a(21309, 1636026232764528349L) / 2 - _I.a(25762, 9165260632387240269L));
                                                    }
                                                    var4_2 /* !! */  = (int)v17 /* !! */ ;
                                                    if (var1_1) continue;
                                                }
                                                var4_2 /* !! */  = _I.a(18690, 775857580513127573L) * _I.a(28377, 4962138739617188648L) + _I.a(2972, 470875198877609541L) ^ _I.a(4361, 8756650164349056128L);
                                                if (var1_1) continue;
                                            }
                                            v18 /* !! */  = (CallSite)(_I.a(21309, 1636026232764528349L) / 2 - _I.a(25762, 9165260632387240269L));
                                        }
                                        var4_2 /* !! */  = (int)v18 /* !! */ ;
                                        if (var1_1) continue;
                                    }
                                    var4_2 /* !! */  = _I.a(20692, 4782979518144574841L) / _I.a(13601, 5007309310099755203L) * _I.a(121, 5698288559568201164L) - _I.a(14490, 2702691209438731557L);
                                    if (var1_1) continue;
                                }
                                v19 /* !! */  = (CallSite)(_I.a(21584, 4287043321947550099L) + _I.a(1753, 1857671129985033087L) ^ _I.a(19679, 8635730513660635410L));
                            }
                            var4_2 /* !! */  = (int)v19 /* !! */ ;
                            if (var1_1) continue;
                        }
                        var4_2 /* !! */  = _I.a(21309, 1636026232764528349L) / 2 - _I.a(25762, 9165260632387240269L);
                        if (var1_1) continue;
                    }
                    var4_2 /* !! */  = _I.a(21584, 4287043321947550099L) + _I.a(1753, 1857671129985033087L) ^ _I.a(19679, 8635730513660635410L);
                    if (var1_1) continue;
lbl201:
                    // 2 sources

                    v6 /* !! */  = (CallSite)(var4_2 /* !! */  = (CallSite)(_I.a(12143, 627133830065490646L) / _I.a(21286, 8397301819668297419L) ^ _I.a(31702, 9023659112071749125L)));
lbl202:
                    // 2 sources

                    if (var1_1) continue;
lbl203:
                    // 2 sources

                    var4_2 /* !! */  = (int)(hi.a("G", (int)(_I.a(3155, 6381386489618868692L) / _I.a(24270, 863745660843719449L)), (int)_I.a(23806, 4083429172679014745L), (long)834203424483934088L) - _I.a(11987, 5188953130217474840L));
                    if (var1_1) continue;
                }
                var4_2 /* !! */  = _I.a(11788, 3937221398818261920L) / _I.a(29139, 2623892541822882819L) ^ _I.a(12770, 8869744362203812893L);
                if (var1_1) continue;
lbl208:
                // 2 sources

                v10 /* !! */  = var4_2 /* !! */  = (_I.a(25560, 3567302588530017852L) ^ _I.a(21413, 4305994236767401524L)) - _I.a(15106, 5098012536735178486L);
lbl209:
                // 2 sources

                if (var1_1) continue;
lbl210:
                // 2 sources

                var4_2 /* !! */  = (hi.a("G", (int)_I.a(32273, 4701320190712110072L), (int)_I.a(5495, 3579554295828066552L), (long)834203424483934088L) * _I.a(5643, 5384989279092880289L) ^ _I.a(26634, 1889801128205798881L)) - _I.a(19962, 8142856563275950114L) - _I.a(3593, 7564506416155536332L);
            }
            var4_2 /* !! */  = hi.a("G", (int)(_I.a(23154, 66831563153244083L) + _I.a(15836, 6275306556937967726L)), (int)_I.a(4613, 6657950271711688579L), (long)834203424483934088L) ^ _I.a(9245, 9190643385676202401L);
        }
        switch (var4_2 /* !! */ ) {
            default: {
                return v21;
            }
            case -561984495: 
        }
        return false;
    }

    private void V(Object[] objectArray) {
        Object object = objectArray[0];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)1017684372462158179L)}, (long)452997494986851717L), (long)968554650154943535L), (long)529286173586661242L);
        hi.a("\u00a5", (Object)((PoseStack)object), (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1127026054009023181L), (float)(-hi.a("\u00a5", (Object)callSite, (long)1213801091369692128L)), (long)1092969023430285433L), (long)1164958652490596778L);
        hi.a("\u00a5", (Object)((PoseStack)object), (Object)hi.a("\u00a5", (Object)hi.a("j", (long)477439033901842617L), (float)hi.a("\u00a5", (Object)callSite, (long)710018603518281346L), (long)1092969023430285433L), (long)1164958652490596778L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean Q(double var1_1, double var3_2, double var5_3) {
        block14: {
            block17: {
                block16: {
                    block15: {
                        var7_4 = Dl.S();
                        var9_5 /* !! */  = hi.a("G", (int)(_I.a(12193, 7378384833314064998L) + _I.a(19690, 9172163695883184490L)), (int)_I.a(12349, 8602760762681038285L), (long)834203424483934088L) - _I.a(17350, 4715250128922076790L);
                        if (!var7_4) ** GOTO lbl-1000
                        v0 /* !! */  = var9_5 /* !! */ ;
                        if (var7_4 == false) return (boolean)v0 /* !! */ ;
                        switch (v0 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var8_6 = _I.K("CgbQZ0m4lN4JN1lf", getBlockState(net.minecraft.core.BlockPos ), (ClientLevel)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)1017684372462158179L)}, (long)789851399784890642L), (long)430579852159213241L), (BlockPos)hi.a("G", (double)var1_1, (double)var3_2, (double)var5_3, (long)921489941210881726L));
                                v1 /* !! */  = hi.a("\u00a5", (Object)var8_6, (long)579740240220487884L);
                                if (!var7_4) break block15;
                                if (v1 /* !! */  != false) break;
                                break block16;
                            }
                            case 484850977: {
                                hi.a("G", (float)-1.0f, (float)10.0f, (float)1.0f, (float)0.5f, (float)0.5f, (long)412744401362924088L);
                                v0 /* !! */  = (CallSite)true;
                                return (boolean)v0 /* !! */ ;
                            }
                        }
                        v1 /* !! */  = var9_5 /* !! */  = (reference)(_I.a(7067, 3970590334072438293L) - _I.a(3788, 6937611191514311546L) + _I.a(10941, 1318034871754493742L) ^ _I.a(4972, 7882637478766458540L));
                    }
                    if (var7_4) break block17;
                }
                var9_5 /* !! */  = hi.a("G", (int)(_I.a(2132, 1928561120573500828L) + _I.a(30406, 8169297632979440458L) + _I.a(8129, 7589464354601876026L)), (int)_I.a(25873, 7329639991233036441L), (long)834203424483934088L) * _I.a(5139, 9025419185434669556L) - _I.a(20661, 1402459812672402763L);
                if (!var7_4) ** GOTO lbl53
            }
            block12: while (true) {
                block22: {
                    block20: {
                        block21: {
                            block19: {
                                block18: {
                                    switch (var9_5 /* !! */ ) {
                                        default: {
                                            v2 /* !! */  = _I.K("CgbQZ0m4lN4JN1lf", is(java.lang.Object ), (BlockState)var8_6, (Object)hi.a("j", (long)898724735523943778L));
                                            if (!var7_4) break block18;
                                            if (v2 /* !! */  != false) break;
                                            break block19;
                                        }
                                        case 462839323: {
                                            v3 /* !! */  = hi.a("\u00a5", (Object)var8_6, (Object)hi.a("j", (long)660192093904994570L), (long)1333463834707911712L);
                                            if (!var7_4) break block20;
                                            if (v3 /* !! */  != false) break block21;
                                            break block22;
                                        }
                                        case 462839320: {
                                            v4 = true;
                                            var9_5 /* !! */  = (reference)(_I.a(30100, 8716263523638988841L) * _I.a(13854, 4489895370663203775L) + _I.a(1970, 5139553135899583044L) ^ _I.a(28867, 3694209194414429536L));
                                            if (!var7_4) {
                                                break block12;
                                            }
                                            break block14;
                                        }
                                        case 462839322: {
                                            v4 = false;
                                            if (var7_4) break block12;
                                            return v4;
                                        }
                                        case 462839319: {
                                            hi.a("G", (long)510943974080801881L);
                                            hi.a("G", (long)510943974080801881L);
                                            return true;
                                        }
                                    }
lbl53:
                                    // 2 sources

                                    v2 /* !! */  = var9_5 /* !! */  = (reference)(_I.a(21596, 7462630768446140824L) - _I.a(18753, 7478840506899164309L) + _I.a(26606, 4224107060775633494L) ^ _I.a(12734, 1001972704732714066L));
                                }
                                if (var7_4) continue;
                            }
                            var9_5 /* !! */  = (reference)(((_I.a(782, 6937447153671153384L) - _I.a(3733, 4765466557148572483L)) / _I.a(15649, 205877904523761918L) + _I.a(8436, 6803557766683493646L)) * _I.a(15682, 402818788355381448L) - _I.a(29316, 1655210561891063585L));
                            if (var7_4) continue;
                        }
                        v3 /* !! */  = var9_5 /* !! */  = (reference)(_I.a(21596, 7462630768446140824L) - _I.a(18753, 7478840506899164309L) + _I.a(26606, 4224107060775633494L) ^ _I.a(12734, 1001972704732714066L));
                    }
                    if (var7_4) continue;
                }
                var9_5 /* !! */  = (reference)(_I.K("CgbQZ0m4lN4JN1lf", max(int int ), (int)((_I.a(5389, 5798837269339058421L) - _I.a(851, 1364225234052425432L)) * _I.a(13646, 6515349476391555227L)), (int)_I.a(3537, 9138494665938970654L)) - _I.a(14040, 768402407692833621L) ^ _I.a(14326, 9041356555064152675L));
            }
            var9_5 /* !! */  = (reference)(_I.a(22713, 2984095486942215527L) * _I.a(16717, 5303469522087634096L) + _I.a(20566, 5344765305983071642L) ^ _I.a(8135, 5054113911636408870L));
        }
        switch (var9_5 /* !! */ ) {
            default: {
                return v4;
            }
            case 1478160299: 
        }
        throw null;
    }

    private void D(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        Xi xi = (Xi)objectArray[1];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)1017684372462158179L)}, (long)1066482065823122912L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
        float f = 0.07f;
        CallSite callSite2 = hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1017684372462158179L), (long)1247840145017922589L), (long)789438897355831922L))), (long)371266768739483732L);
        CallSite callSite3 = _I.K("CgbQZ0m4lN4JN1lf", P(float ), (_I)this, (float)callSite);
        hi.a("\u00a5", (Object)poseStack, (long)1071718823859296201L);
        hi.a("\u00a5", (Object)poseStack, (double)hi.a("\u00e9", (Object)callSite3, (long)1300412705618690751L), (double)(hi.a("\u00e9", (Object)callSite3, (long)1294071886475894755L) + 0.1), (double)hi.a("\u00e9", (Object)callSite3, (long)1282612456329596420L), (long)620263633503696695L);
        hi.a("\u00a5", (Object)poseStack, (float)f, (float)f, (float)f, (long)1099070686459364067L);
        hi.a("\u00a5", (Object)poseStack, (float)(callSite2 / 2.0f), (float)(callSite2 / 2.0f), (float)(callSite2 / 2.0f), (long)1144003967119228143L);
        hi.a("\u00a5", (Object)this, (Object)new Object[]{poseStack}, (long)414443981903511144L);
        _I.K("CgbQZ0m4lN4JN1lf", mulPose(org.joml.Quaternionfc ), (PoseStack)poseStack, (Quaternionfc)hi.a("\u00a5", (Object)hi.a("j", (long)1210199949807736021L), (float)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1217271218193947182L), (long)1092969023430285433L));
        hi.a("\u00a5", (Object)poseStack, (float)(-callSite2 / 2.0f), (float)(-callSite2 / 2.0f), (float)(-callSite2 / 2.0f), (long)1144003967119228143L);
        CallSite callSite4 = _I.K("CgbQZ0m4lN4JN1lf", pose(), (PoseStack.Pose)hi.a("\u00a5", (Object)poseStack, (long)970332505425455960L));
        CallSite callSite5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1233585547896592583L), (long)921162811333111485L);
        _I.K("CgbQZ0m4lN4JN1lf", J(org.joml.Matrix4f float float float float float int ), (Xi)xi, (Matrix4f)callSite4, (float)0.0f, (float)callSite2, (float)0.0f, (float)0.0f, (float)1.0f, (int)callSite5);
        hi.a("\u00a5", (Object)xi, (Object)callSite4, (float)callSite2, (float)callSite2, (float)0.0f, (float)1.0f, (float)1.0f, (int)callSite5, (long)684582632005063774L);
        hi.a("\u00a5", (Object)xi, (Object)callSite4, (float)callSite2, (float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f, (int)callSite5, (long)684582632005063774L);
        hi.a("\u00a5", (Object)xi, (Object)callSite4, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (int)callSite5, (long)684582632005063774L);
        hi.a("\u00a5", (Object)poseStack, (long)1236740458305185158L);
    }

    public static /* bridge */ /* synthetic */ CallSite K(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private float v(Object[] objectArray) {
        CallSite callSite = hi.a("G", (long)658960450018995719L);
        CallSite callSite2 = hi.a("G", (float)0.0f, (float)((float)(callSite - hi.a("\u00e9", (Object)this, (long)528211334251487026L)) / 1000.0f), (long)1021203527991582354L);
        hi.a("\u00f2", (Object)this, (long)callSite, (long)528211334251487026L);
        _I _I2 = this;
        hi.a("\u00f2", (Object)_I2, (float)(hi.a("\u00e9", (Object)_I2, (long)566576290493834865L) + callSite2 * hi.a("\u00e9", (Object)this, (long)460155068468697518L)), (long)566576290493834865L);
        return (float)hi.a("\u00e9", (Object)this, (long)566576290493834865L);
    }

    private _I(eR eR2, float f, float f2, float f3, Color color, float f4, float f5) {
        eR eR3 = eR2;
        Objects.requireNonNull(eR3);
        this.E = eR3;
        hi.a("\u00f2", (Object)this, (float)f, (long)1118830300317153935L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)593596291378468147L);
        hi.a("\u00f2", (Object)this, (float)f3, (long)1143188240415580615L);
        hi.a("\u00f2", (Object)this, (float)f, (long)550075630611812339L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)909189295325812045L);
        hi.a("\u00f2", (Object)this, (float)f3, (long)488319467289470701L);
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)((float)(-hi.a("\u00a5", (Object)((Integer)((Object)_I.K("CgbQZ0m4lN4JN1lf", z(), (XG)((Object)hi.a("\u00e9", (Object)eR2, (long)1273625942316114011L))))), (long)1260538186742955956L)) / 50.0f), (float)((float)hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)eR2, (long)1273625942316114011L), (long)789438897355831922L))), (long)1260538186742955956L) / 50.0f), (long)869562683730491792L), (long)545047084787609617L);
        hi.a("\u00f2", (Object)this, (float)_I.K("CgbQZ0m4lN4JN1lf", I(float float ), (float)((float)(-hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)eR2, (long)1273625942316114011L), (long)789438897355831922L))), (long)1260538186742955956L)) / 50.0f), (float)((float)hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)eR2, (long)1273625942316114011L), (long)789438897355831922L))), (long)1260538186742955956L) / 50.0f)), (long)961936559509290205L);
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)((float)(-hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)eR2, (long)1273625942316114011L), (long)789438897355831922L))), (long)1260538186742955956L)) / 50.0f), (float)((float)_I.K("CgbQZ0m4lN4JN1lf", intValue(), (Integer)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)eR2, (long)1273625942316114011L), (long)789438897355831922L)))) / 50.0f), (long)869562683730491792L), (long)1034084659473852779L);
        hi.a("\u00f2", (Object)this, (float)f4, (long)566576290493834865L);
        this.U = f5;
        this.j = (long)hi.a("G", (long)658960450018995719L);
        this.w = color;
        hi.a("\u00f2", (Object)this, (long)hi.a("\u00e9", (Object)this, (long)874688478584400159L), (long)528211334251487026L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 5823718216344062247L;
                    var8_1 = new long[121];
                    var5_2 = 0;
                    var6_3 = "\u00fe7<\u00c7\u00ea\u00e8;\u00d2\u00fd?\u00e9s`(Y\u00f4\u00feX\u00d6@\u00dfO\u0002\u00df.\u008b\u00d5@\u0012\u0007\u0099\u0093\u0007\u0012\u0084\u00ee\u00ec,z\u00cc\u00b1\u00c4g\u00da\u00c0\u00daR[gW\n6\u00ba\u00e0I\u00c5\u000f\u00f3\u00cf\u00f6\u00fc8\u00ef-\u0010\u0001+\u00c7#\u00a1hQS\u0003p\b\u00daP\u00c5\u0015\u00c6\u00ca\u00bf\u000e\u00a0\u008f-\u001b%\u00be[\u001c\u0097\u009f\u00e6\u008c\u00ba\u00e8\u0092+\u00da\u00a9\u00f2a\u0080\u008c\u00b9\u0097/\u00f9\u00f1GM.w\u0085d9?\u00e5m\u0091\u0092'#w|\u00d7v:\u008e\u00d0k_\u00d8JP/\u00c4Z;v\u00c1\u00c20L=)(J\n\u00da(N\u00b5\u00db\u0089\u00f7\u001f\u00b0\u0002\u00ba\n\u00e7\u00a2f\u007f\u00cc\u0083RO;\u0094y<\u0011\f\u00c5\u00e9b\u00f3U\u00d2\u007f\u00d3G\u00e8\u0086\u0082\u0004\u0093N\u00c7<\n]\u0013\u0087\u00aa\u00b4\u001b\u00d1\u00b8H\u0007\f\u0084t\u009em\u0093\u00e7\u00a5$?a\u000e\u00cd3\u00d5\u00fc\u00cf\u00d9\u00fe\u0010-\u008am\u009d\u00b5a\u00e1\r\\\u009f\u00b9\u008b\u0095\u008a\u00f0+\u0089\u00de\u0018\u00f2(\u0007x;\u00c7\u00bd\u001fqe\u00b9!7/f\u00db}\u00b4'\u0095\u008fK}x\u00e3\u00ac\u00d3\u0099q\u00d56[5k\u00fcb@i\rK8B^)iL\u00bc\u00a0w0\u00b1\u0088\u00edU\u0006\u0098\u008bV\u0019]J\\\u00aa\u0088`\u00a7\u00c5Y\u0018\u00bavP\u000esi\u00b2T\u001c\u00f6\u00e9d\u00c0\u00ceL\u008f\u000f\u00c7}\u008bQi.4(\u0086\u00ed\u00a6\u00f0U\u00c2\u00c4\u00f1\u00f9\u008dJ\u00f7\u00f6GgfNE\u00b5Ae\u0097G\u00e2\u008f\u00ea\u00ba\u00ef\u00ac\u00c6\u00f7J\u00ad1Kr\u00b7D\u00fcWp\u00cfs\u0000\u00eb\u00cf[\u009f\u00e6\u00b0U[+\u00f9b\u001c@\u00c7\u00c7;\u000b\u0095\u00e8C\u0002\u00a4x\u00fe\u00ae\u00dbec2\u008f\u00a1\u000e\u009d-\u00b0\u00ec\u0000G\u00ef\u00f725\u00e7\u00fc\u007fA?\u00cd\u008d\u001f\u0098y\u008a\u001d\u00fa\u0092\u00a3\u009f*\u009b\u00ea\u0092\u007f\u0016\u00c0\u00c4\u00d2T\u00cd\u008e\u00f3\u0098Y\u00d4\u00ec\u00f5'\u00f3\u00fb(F\u001a\u0005\u0090C\u00b8\u001ej\u0084K\u00c8\u0083 \u00e7I/?\u00f5\u00d7D\b\u0002\u00c3\u0015Q\u00d3\u0098a\u00d5\u0080\u00e0\u0010\u0085^\u00f99\u00ab\"\u007fg\u00e4\u0094]\u0018+t\\\u00db\u0096\u00fa\u009f\\J\u00d2}0m\u0099X\u00ef\u00ae\u00beE\u001c\u00c2z\u00ef\u00ec\u00db%\u0088\u0001\u00f0w\u0096\u00ff\u0083\u0005\u00de`\u008e\u0000\u00f6v6\u009c\u0019\u0089\u0095\u00ed\u0006\u00d5p\u00f64\u00b7\u0085lG\u00c3w2\u0002\u00e6=\u00a5xeh\u0003\t\u00b7\u00b6]\u00cb\u00d63\u00c1\u00c3\u00bb'IRn=\u00e4[\u0014\u0095\u00a3\u00e1\u00b0\u0002\u00d0\u00e2\u00ab[,\u00f8\u001b!W\u00df\u00d1%.\t7k\u00d3,\u00ee\u00b1$\u00b2\u00b0\u0096\u00cb\u0085\u0095\u0019\u0011\u00d0\u00e2\u00fdi\u00c1B\u00d5?\u00cf\u0001\u00dc\u0082\u00e1\u0088\u0097l)\u0080\u00ef\u00047\u00d6\u00ef\u0097j\u00ab \u0089\u001cU\u0082\u000b\u001eAf\u0017\u00ba\u00be\u007fml\u001cF:\u0086\u001f)k\u0095\u00884\u000e\u0005x\u0094\u0012u\u00ee\u00be\u00aa]l\u0007+l\u0097]h\u00fb\u0087\u00c6\u00ac\u00b4\u00feg\u00b5\u00f3\u008f\u00fa\u00dct\u007f\u00a6\u00d8\u00ae}\u00e8\u00f6\u0013\u00e2Z'\u0007L]-\u00e6Tk\u00a1\u00d0\u0086\u0096\u001a0\u00b3\u00a3\u00cf\u0002\u00d9\u001fP\u008e\u0000_.\u00f5\u00f5\\\u00b5\u00c6\u0012T\u00d0\u00ae\u00d0\u0097\u00a7\u0019r\u00d4\u00efd+\u00a8\u0010(\u001b:MBx\u001a\u00aefU\u0087a\u00b6\u00cd3\u0085\u00d7m\u0017\u00a8Z\rLp\u000emgP\u008f\u00ba\u00b7\u008eQD 3\u0090Cb\u001dJ\u00dfY\u00e0\u008c\u00ed\u00c9\u0014\u00d8\u00f7F\u00ce(\u00ebQ\u00df6\u00da\u0085d\u009eP\u00f5\u0000\u00846\u009f-\u001fj\u0011\u00edM\u0016\u00df0\u00b7n\u00de\u00f1\u008e bQ\u00d6:\u000ed\u00063\b\u00bd\u0017\u00be\u00c6n\u00b0\u0014\u0005UGB\u009f\u0015#\u0094Q\u00d6\u00f3\u00f6\u00ce\u00d9\u0085\u00db\u00028\u000f\u00ae&?\u009f<\u00db\u00f5\u0088~\u00e1\\O\u008e\u009c\u00f9O\u00d0|\bM\u00a3#\u00f0\\\u0098R(o\u0081\u00d5.\u00f9\u00c95}\u008e\u00cb\u00dbGF\u001a\u0082\u00e4\u0099\u00bc\u00d0\u00a4\u0091\u00f7j\u00dd\u00b6\u001f\fa\u00acwW\u0085~\u00fb\u00d0\u009eW\u00d7\u008aB\u001c\u0083\u00baJ\u00f6\u00daD\u00b0";
                    var7_4 = "\u00fe7<\u00c7\u00ea\u00e8;\u00d2\u00fd?\u00e9s`(Y\u00f4\u00feX\u00d6@\u00dfO\u0002\u00df.\u008b\u00d5@\u0012\u0007\u0099\u0093\u0007\u0012\u0084\u00ee\u00ec,z\u00cc\u00b1\u00c4g\u00da\u00c0\u00daR[gW\n6\u00ba\u00e0I\u00c5\u000f\u00f3\u00cf\u00f6\u00fc8\u00ef-\u0010\u0001+\u00c7#\u00a1hQS\u0003p\b\u00daP\u00c5\u0015\u00c6\u00ca\u00bf\u000e\u00a0\u008f-\u001b%\u00be[\u001c\u0097\u009f\u00e6\u008c\u00ba\u00e8\u0092+\u00da\u00a9\u00f2a\u0080\u008c\u00b9\u0097/\u00f9\u00f1GM.w\u0085d9?\u00e5m\u0091\u0092'#w|\u00d7v:\u008e\u00d0k_\u00d8JP/\u00c4Z;v\u00c1\u00c20L=)(J\n\u00da(N\u00b5\u00db\u0089\u00f7\u001f\u00b0\u0002\u00ba\n\u00e7\u00a2f\u007f\u00cc\u0083RO;\u0094y<\u0011\f\u00c5\u00e9b\u00f3U\u00d2\u007f\u00d3G\u00e8\u0086\u0082\u0004\u0093N\u00c7<\n]\u0013\u0087\u00aa\u00b4\u001b\u00d1\u00b8H\u0007\f\u0084t\u009em\u0093\u00e7\u00a5$?a\u000e\u00cd3\u00d5\u00fc\u00cf\u00d9\u00fe\u0010-\u008am\u009d\u00b5a\u00e1\r\\\u009f\u00b9\u008b\u0095\u008a\u00f0+\u0089\u00de\u0018\u00f2(\u0007x;\u00c7\u00bd\u001fqe\u00b9!7/f\u00db}\u00b4'\u0095\u008fK}x\u00e3\u00ac\u00d3\u0099q\u00d56[5k\u00fcb@i\rK8B^)iL\u00bc\u00a0w0\u00b1\u0088\u00edU\u0006\u0098\u008bV\u0019]J\\\u00aa\u0088`\u00a7\u00c5Y\u0018\u00bavP\u000esi\u00b2T\u001c\u00f6\u00e9d\u00c0\u00ceL\u008f\u000f\u00c7}\u008bQi.4(\u0086\u00ed\u00a6\u00f0U\u00c2\u00c4\u00f1\u00f9\u008dJ\u00f7\u00f6GgfNE\u00b5Ae\u0097G\u00e2\u008f\u00ea\u00ba\u00ef\u00ac\u00c6\u00f7J\u00ad1Kr\u00b7D\u00fcWp\u00cfs\u0000\u00eb\u00cf[\u009f\u00e6\u00b0U[+\u00f9b\u001c@\u00c7\u00c7;\u000b\u0095\u00e8C\u0002\u00a4x\u00fe\u00ae\u00dbec2\u008f\u00a1\u000e\u009d-\u00b0\u00ec\u0000G\u00ef\u00f725\u00e7\u00fc\u007fA?\u00cd\u008d\u001f\u0098y\u008a\u001d\u00fa\u0092\u00a3\u009f*\u009b\u00ea\u0092\u007f\u0016\u00c0\u00c4\u00d2T\u00cd\u008e\u00f3\u0098Y\u00d4\u00ec\u00f5'\u00f3\u00fb(F\u001a\u0005\u0090C\u00b8\u001ej\u0084K\u00c8\u0083 \u00e7I/?\u00f5\u00d7D\b\u0002\u00c3\u0015Q\u00d3\u0098a\u00d5\u0080\u00e0\u0010\u0085^\u00f99\u00ab\"\u007fg\u00e4\u0094]\u0018+t\\\u00db\u0096\u00fa\u009f\\J\u00d2}0m\u0099X\u00ef\u00ae\u00beE\u001c\u00c2z\u00ef\u00ec\u00db%\u0088\u0001\u00f0w\u0096\u00ff\u0083\u0005\u00de`\u008e\u0000\u00f6v6\u009c\u0019\u0089\u0095\u00ed\u0006\u00d5p\u00f64\u00b7\u0085lG\u00c3w2\u0002\u00e6=\u00a5xeh\u0003\t\u00b7\u00b6]\u00cb\u00d63\u00c1\u00c3\u00bb'IRn=\u00e4[\u0014\u0095\u00a3\u00e1\u00b0\u0002\u00d0\u00e2\u00ab[,\u00f8\u001b!W\u00df\u00d1%.\t7k\u00d3,\u00ee\u00b1$\u00b2\u00b0\u0096\u00cb\u0085\u0095\u0019\u0011\u00d0\u00e2\u00fdi\u00c1B\u00d5?\u00cf\u0001\u00dc\u0082\u00e1\u0088\u0097l)\u0080\u00ef\u00047\u00d6\u00ef\u0097j\u00ab \u0089\u001cU\u0082\u000b\u001eAf\u0017\u00ba\u00be\u007fml\u001cF:\u0086\u001f)k\u0095\u00884\u000e\u0005x\u0094\u0012u\u00ee\u00be\u00aa]l\u0007+l\u0097]h\u00fb\u0087\u00c6\u00ac\u00b4\u00feg\u00b5\u00f3\u008f\u00fa\u00dct\u007f\u00a6\u00d8\u00ae}\u00e8\u00f6\u0013\u00e2Z'\u0007L]-\u00e6Tk\u00a1\u00d0\u0086\u0096\u001a0\u00b3\u00a3\u00cf\u0002\u00d9\u001fP\u008e\u0000_.\u00f5\u00f5\\\u00b5\u00c6\u0012T\u00d0\u00ae\u00d0\u0097\u00a7\u0019r\u00d4\u00efd+\u00a8\u0010(\u001b:MBx\u001a\u00aefU\u0087a\u00b6\u00cd3\u0085\u00d7m\u0017\u00a8Z\rLp\u000emgP\u008f\u00ba\u00b7\u008eQD 3\u0090Cb\u001dJ\u00dfY\u00e0\u008c\u00ed\u00c9\u0014\u00d8\u00f7F\u00ce(\u00ebQ\u00df6\u00da\u0085d\u009eP\u00f5\u0000\u00846\u009f-\u001fj\u0011\u00edM\u0016\u00df0\u00b7n\u00de\u00f1\u008e bQ\u00d6:\u000ed\u00063\b\u00bd\u0017\u00be\u00c6n\u00b0\u0014\u0005UGB\u009f\u0015#\u0094Q\u00d6\u00f3\u00f6\u00ce\u00d9\u0085\u00db\u00028\u000f\u00ae&?\u009f<\u00db\u00f5\u0088~\u00e1\\O\u008e\u009c\u00f9O\u00d0|\bM\u00a3#\u00f0\\\u0098R(o\u0081\u00d5.\u00f9\u00c95}\u008e\u00cb\u00dbGF\u001a\u0082\u00e4\u0099\u00bc\u00d0\u00a4\u0091\u00f7j\u00dd\u00b6\u001f\fa\u00acwW\u0085~\u00fb\u00d0\u009eW\u00d7\u008aB\u001c\u0083\u00baJ\u00f6\u00daD\u00b0".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "\u001f\u0094\u00d4\u00b4\u00a8\u0096\u0019jR\u0099f\u0019\u00f0\u0096\u008f\u00c7";
                        var7_4 = "\u001f\u0094\u00d4\u00b4\u00a8\u0096\u0019jR\u0099f\u0019\u00f0\u0096\u008f\u00c7".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
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
            _I.b = var8_1;
            _I.c = new Integer[121];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5032033042637913644L;
        ** while (true)
        _I.d = 5032033042637913540L ^ var0_7;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x25E3;
        if (c[n2] == null) {
            _I.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
