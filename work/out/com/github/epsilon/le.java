/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.DepthStencilState
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.CompareOp
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  net.minecraft.core.Direction
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Dm;
import com.github.epsilon.d9;
import com.github.epsilon.dV;
import com.github.epsilon.g0;
import com.github.epsilon.hi;
import com.github.epsilon.lZ;
import com.github.epsilon.uX;
import com.github.epsilon.vl;
import com.github.epsilon.vu;
import com.github.epsilon.yE;
import com.github.epsilon.yN;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.PoseStack;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class le {
    private final List<dV> M = new ArrayList<dV>();
    private final List<Dm> S;
    private static final RenderPipeline s;
    public static final le D;
    private final List<yN> P;
    private final List<uX> v;
    private final List<vl> R = new ArrayList<vl>();
    private final List<vu> z;
    private static final RenderPipeline g;
    private static final long[] a;
    private static final Integer[] b;

    public void I(Object[] objectArray) {
        AABB aABB = (AABB)objectArray[0];
        int n = (Integer)objectArray[1];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = n;
        objectArray2[0] = aABB;
        hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)633947173748752137L);
    }

    private void e(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        Object object4 = objectArray[3];
        Object object5 = objectArray[4];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((uX)object5), (long)1308188066177296732L), (Object)((Vec3)object4), (long)1082050008038634828L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((uX)object5), (long)648480937580647413L), (Object)((Vec3)object4), (long)1082050008038634828L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)((float)hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L)), (float)((float)hi.a("\u00e9", (Object)callSite, (long)1294071886475894755L)), (float)((float)hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L)), (float)((float)hi.a("\u00e9", (Object)callSite2, (long)1300412705618690751L)), (float)((float)hi.a("\u00e9", (Object)callSite2, (long)1294071886475894755L)), (float)((float)hi.a("\u00e9", (Object)callSite2, (long)1282612456329596420L)), (int)hi.a("\u00a5", (Object)((uX)object5), (long)1241350536422863059L), (float)hi.a("\u00a5", (Object)((uX)object5), (long)820093504629769328L), (long)774797598669371054L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void G(Object[] var1_1) {
        block29: {
            block28: {
                var2_2 = var1_1[0];
                var3_3 = Dl.t();
                var10_4 /* !! */  = hi.a("G", (int)(le.a(18168, 7578774735218429039L) ^ le.a(3089, 1964815250490754727L) ^ le.a(31023, 8201571826734461599L)), (int)le.a(23228, 8749603419240517773L), (long)834203424483934088L) + le.a(20115, 2053365400455890251L);
                if (!var3_3) break block28;
lbl6:
                // 2 sources

                while (true) {
                    block31: {
                        block30: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1157359868643818978L), (long)1256913436411747171L);
                            if (var3_3) break block30;
                            if (v0 /* !! */  != false) break block31;
                            v0 /* !! */  = var10_4 /* !! */  = (reference)(le.a(12817, 6008349240054659537L) * le.a(1316, 3885075469844942748L) ^ le.a(4760, 1472079901485144222L));
                        }
                        if (!var3_3) break block28;
                    }
                    var10_4 /* !! */  = hi.a("G", (int)((le.a(20707, 3480629331110222415L) + le.a(16603, 8885055624238943034L)) / le.a(20057, 1910636445223667133L)), (int)le.a(1607, 5847000309227228396L), (long)834203424483934088L) / le.a(24248, 5748745691167315164L) + le.a(18724, 6529119876257104690L);
                    if (!var3_3) break block28;
                    ** GOTO lbl69
                    break;
                }
lbl17:
                // 2 sources

                while (true) {
                    v1 /* !! */  = hi.a("\u00a5", (Object)var8_9, (long)984088978567310565L);
                    if (var3_3) ** GOTO lbl80
                    if (v1 /* !! */  == false) ** GOTO lbl79
                    ** GOTO lbl81
                    break;
                }
lbl22:
                // 2 sources

                while (true) {
                    var8_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)752873413965097316L), (long)1240653736693366367L);
                    if (!var3_3) ** GOTO lbl140
lbl25:
                    // 2 sources

                    while (true) {
                        v2 /* !! */  = hi.a("\u00a5", (Object)var8_9, (long)984088978567310565L);
                        if (var3_3) ** GOTO lbl143
                        if (v2 /* !! */  == false) ** GOTO lbl142
                        ** GOTO lbl144
                        break;
                    }
                    break;
                }
lbl30:
                // 2 sources

                while (true) {
                    var8_9 = le.C("hDTOnGCKeBWWyu2a", iterator(), (List)hi.a("\u00e9", (Object)this, (long)411584793121298751L));
                    if (!var3_3) ** GOTO lbl149
lbl33:
                    // 2 sources

                    while (true) {
                        v3 /* !! */  = le.C("hDTOnGCKeBWWyu2a", hasNext(), (Iterator)var8_9);
                        if (var3_3) ** GOTO lbl152
                        if (v3 /* !! */  == false) ** GOTO lbl151
                        ** GOTO lbl153
                        break;
                    }
                    break;
                }
            }
            block24: while (true) {
                switch (var10_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1646337098: {
                        v4 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)752873413965097316L), (long)1256913436411747171L);
                        if (var3_3) ** GOTO lbl70
                        if (v4 /* !! */  == false) ** GOTO lbl69
                        ** GOTO lbl71
                    }
                    case -1646337093: {
                        v5 /* !! */  = le.C("hDTOnGCKeBWWyu2a", isEmpty(), (List)hi.a("\u00e9", (Object)this, (long)411584793121298751L));
                        if (var3_3) ** GOTO lbl74
                        if (v5 /* !! */  == false) ** GOTO lbl73
                        ** GOTO lbl75
                    }
                    case -1646337096: {
                        var4_5 = hi.a("G", (Object)hi.a("j", (long)1310433436651679292L), (long)597418167065221389L);
                        var5_6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)948190297084541702L), (long)617137790396262668L), (long)888968013430088728L);
                        var6_7 = hi.a("\u00a5", (Object)((PoseStack)var2_2), (long)970332505425455960L);
                        var7_8 = hi.a("\u00a5", (Object)var6_7, (long)795986877611440477L);
                        var8_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1157359868643818978L), (long)1240653736693366367L);
                        if (!var3_3) ** GOTO lbl77
                        ** GOTO lbl17
                    }
                    case -1646337094: {
                        hi.a("G", (long)789749075287395726L);
                        hi.a("G", (long)1125327632940799645L);
                        var10_4 /* !! */  = (reference)((le.a(12906, 1517873798922451147L) - le.a(13079, 8237101532867639718L) ^ le.a(21293, 7237032936937511126L)) - le.a(27733, 3153445319761290889L) - le.a(30646, 3575970743359241666L));
                        continue block24;
                    }
lbl69:
                    // 2 sources

                    v4 /* !! */  = var10_4 /* !! */  = (reference)(le.a(9341, 2335818312971857447L) * le.a(7646, 8679973524076730178L) ^ le.a(27217, 4668743971058475076L));
lbl70:
                    // 2 sources

                    if (!var3_3) continue block24;
lbl71:
                    // 2 sources

                    var10_4 /* !! */  = (reference)(le.a(27731, 3881264633368733365L) / le.a(20057, 1910636445223667133L) / le.a(11204, 7839777181462045128L) * le.a(184, 3186860961991297581L) ^ le.a(21166, 7378397502449703241L));
                    if (!var3_3) continue block24;
lbl73:
                    // 2 sources

                    v5 /* !! */  = var10_4 /* !! */  = (reference)(le.a(9341, 2335818312971857447L) * le.a(7646, 8679973524076730178L) ^ le.a(27217, 4668743971058475076L));
lbl74:
                    // 2 sources

                    if (!var3_3) continue block24;
lbl75:
                    // 2 sources

                    var10_4 /* !! */  = (reference)(le.a(12067, 903517234952512949L) / le.a(20057, 1910636445223667133L) / 2 + le.a(19246, 8416831426803450182L) ^ le.a(20005, 707890112839697500L));
                    continue block24;
lbl77:
                    // 1 sources

                    var10_4 /* !! */  = (reference)(le.a(18318, 7760333496064265550L) / le.a(18388, 6736358132346899823L) - le.a(28593, 6973510765254567377L));
                    if (!var3_3) break block29;
lbl79:
                    // 2 sources

                    v1 /* !! */  = var10_4 /* !! */  = (reference)(le.a(20204, 6950696560763716616L) * le.a(21672, 3525398320751271594L) - le.a(26422, 5777596784385682657L));
lbl80:
                    // 2 sources

                    if (!var3_3) break block29;
lbl81:
                    // 2 sources

                    var10_4 /* !! */  = (reference)(((le.a(14723, 8930680950184850323L) - le.a(24951, 2833513707625081528L)) * le.a(16724, 5147643611058096782L) ^ le.a(10718, 34613064378557216L)) - le.a(27010, 7819077233585578961L));
                    break block29;
                    case -1646337095: 
                }
                break;
            }
            return;
        }
        while (true) {
            block34: {
                block33: {
                    block32: {
                        switch (var10_4 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -1647648541: {
                                var9_10 /* !! */  = (yN)hi.a("\u00a5", (Object)var8_9, (long)470012372636416268L);
                                v6 = new Object[5];
                                v6[4] = var9_10 /* !! */ ;
                                v6[3] = var5_6;
                                v6[2] = var6_7;
                                v6[1] = var7_8;
                                v6[0] = var4_5;
                                hi.a("\u00a5", (Object)this, (Object)v6, (long)360985449637034487L);
                                if (!var3_3) break block32;
                                ** GOTO lbl22
                            }
                            case -1647648544: {
                                ** continue;
                            }
                            case -1647648546: {
                                ** continue;
                            }
                            case -1647648542: {
                                var9_10 /* !! */  = (vu)hi.a("\u00a5", (Object)var8_9, (long)470012372636416268L);
                                v7 = new Object[5];
                                v7[4] = var9_10 /* !! */ ;
                                v7[3] = var5_6;
                                v7[2] = var6_7;
                                v7[1] = var7_8;
                                v7[0] = var4_5;
                                hi.a("\u00a5", (Object)this, (Object)v7, (long)1147864318880793853L);
                                if (!var3_3) break block33;
                                ** GOTO lbl30
                            }
                            case -1647648540: {
                                ** continue;
                            }
                            case -1647648539: {
                                ** continue;
                            }
                            case -1647648547: {
                                var9_10 /* !! */  = (uX)hi.a("\u00a5", (Object)var8_9, (long)470012372636416268L);
                                v8 = new Object[5];
                                v8[4] = var9_10 /* !! */ ;
                                v8[3] = var5_6;
                                v8[2] = var6_7;
                                v8[1] = var7_8;
                                v8[0] = var4_5;
                                hi.a("\u00a5", (Object)this, (Object)v8, (long)796707664788600688L);
                                if (!var3_3) break block34;
                                ** GOTO lbl-1000
                            }
                            case -1647648548: lbl-1000:
                            // 2 sources

                            {
                                le.C("hDTOnGCKeBWWyu2a", k(), (lZ)var4_5);
                                return;
                            }
                            case -1647648545: 
                        }
                        throw null;
                    }
                    var10_4 /* !! */  = (reference)(le.a(8649, 2931668738869046238L) / le.a(27141, 4134297709775347948L) - le.a(29945, 6865772542504631828L));
                    if (!var3_3) continue;
lbl140:
                    // 2 sources

                    var10_4 /* !! */  = (reference)(le.a(30711, 8831699663898279329L) / le.a(5311, 3751258069874482838L) * le.a(30813, 5123047643303801571L) - le.a(9508, 5612068159635697345L) + le.a(29355, 3774719745733753209L));
                    if (!var3_3) continue;
lbl142:
                    // 2 sources

                    v2 /* !! */  = var10_4 /* !! */  = (reference)((le.a(9746, 543803602728954950L) ^ le.a(32308, 4677454179971626370L)) - le.a(24320, 8589471584877139193L) - le.a(22958, 8058822112494703580L));
lbl143:
                    // 2 sources

                    if (!var3_3) continue;
lbl144:
                    // 2 sources

                    var10_4 /* !! */  = (reference)(le.a(11292, 1048308456903911378L) * le.a(5266, 933484323874086745L) + le.a(1586, 997340275524308361L));
                    continue;
                }
                var10_4 /* !! */  = (reference)(le.a(17223, 4551898213434444116L) / le.a(32126, 7936467750581008068L) * le.a(14894, 6808060219665068044L) - le.a(24494, 6463078159568623043L) + le.a(14628, 6699946303784006640L));
                if (!var3_3) continue;
lbl149:
                // 2 sources

                var10_4 /* !! */  = (reference)(hi.a("G", (int)(le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)(le.a(23321, 6382483178334507196L) - le.a(7365, 4033209112552216192L)), (int)le.a(1318, 1641421177165778651L)) / le.a(8146, 7887488814300697630L)), (int)le.a(16736, 1056189510318967472L), (long)834203424483934088L) ^ le.a(29242, 6327153863390558378L));
                if (!var3_3) continue;
lbl151:
                // 2 sources

                v3 /* !! */  = var10_4 /* !! */  = (reference)(((le.a(26432, 3067119254565481793L) / le.a(11204, 7839777181462045128L) + le.a(20459, 7130386524814427410L)) * le.a(15054, 4651833683429568557L) ^ le.a(11325, 3119967700668524523L)) - le.a(11489, 2030388237890889320L));
lbl152:
                // 2 sources

                if (!var3_3) continue;
lbl153:
                // 2 sources

                var10_4 /* !! */  = hi.a("G", (int)((le.a(3591, 5733338276146251236L) + le.a(9704, 8647620717567454752L)) / 5), (int)le.a(41, 2647850088861502362L), (long)834203424483934088L) / 3 + le.a(17533, 6449597196527554498L);
                continue;
            }
            var10_4 /* !! */  = (reference)(le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)(hi.a("G", (int)(le.a(15964, 8926579709814912161L) - le.a(30478, 331494951195508209L)), (int)le.a(12205, 3420450775627801721L), (long)834203424483934088L) / le.a(8146, 7887488814300697630L)), (int)le.a(9911, 7316709222598716564L)) ^ le.a(2355, 8323283886600586161L));
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean s(Object[] var1_1) {
        block16: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = le.a(7620, 994540080709736232L) / le.a(26487, 9053110722560421162L) + le.a(13467, 5553513933789806130L) + le.a(9683, 3063778248346873600L);
            if (!var2_2) ** GOTO lbl16
            block13: while (true) {
                block19: {
                    block18: {
                        block17: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)643102635663418197L), (long)1256913436411747171L);
                            if (var2_2) break block17;
                            if (v0 /* !! */  != false) break block18;
                            v0 /* !! */  = (CallSite)(hi.a("G", (int)le.a(21170, 4005606605808326837L), (int)le.a(22992, 8620961512291750909L), (long)834203424483934088L) * le.a(24237, 5436694255874888988L) * le.a(22469, 5856895565322607924L) ^ le.a(25733, 7750927358140771974L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block19;
                    }
                    var3_3 /* !! */  = le.a(11110, 4488176208653721972L) * le.a(19523, 464752496340846264L) ^ le.a(20706, 7995366193803123243L);
                    if (var2_2) ** GOTO lbl59
                }
                while (true) {
                    block33: {
                        block31: {
                            block32: {
                                block30: {
                                    block28: {
                                        block29: {
                                            block27: {
                                                block25: {
                                                    block26: {
                                                        block24: {
                                                            block22: {
                                                                block23: {
                                                                    block21: {
                                                                        block20: {
                                                                            switch (var3_3 /* !! */ ) {
                                                                                default: {
                                                                                    continue block13;
                                                                                }
                                                                                case 1376776119: {
                                                                                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)942618989109981464L), (long)1256913436411747171L);
                                                                                    if (var2_2) break block20;
                                                                                    if (v1 /* !! */  == false) break;
                                                                                    break block21;
                                                                                }
                                                                                case 1376776113: {
                                                                                    v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1128852959969727580L), (long)1256913436411747171L);
                                                                                    if (var2_2) break block22;
                                                                                    if (v2 /* !! */  == false) break block23;
                                                                                    break block24;
                                                                                }
                                                                                case 1376776114: {
                                                                                    v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1157359868643818978L), (long)1256913436411747171L);
                                                                                    if (var2_2) break block25;
                                                                                    if (v3 /* !! */  == false) break block26;
                                                                                    break block27;
                                                                                }
                                                                                case 1376776115: {
                                                                                    v4 /* !! */  = le.C("hDTOnGCKeBWWyu2a", isEmpty(), (List)hi.a("\u00e9", (Object)this, (long)752873413965097316L));
                                                                                    if (var2_2) break block28;
                                                                                    if (v4 /* !! */  == false) break block29;
                                                                                    break block30;
                                                                                }
                                                                                case 1376776118: {
                                                                                    v5 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)411584793121298751L), (long)1256913436411747171L);
                                                                                    if (var2_2) break block31;
                                                                                    if (v5 /* !! */  == false) break block32;
                                                                                    break block33;
                                                                                }
                                                                                case 1376776117: {
                                                                                    v6 = true;
                                                                                    var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(le.a(28381, 684847965907707011L) * le.a(21795, 7675751165836025759L)), (int)le.a(17902, 3633947867807895069L), (long)834203424483934088L) * le.a(27645, 4641785118420656603L)), (int)le.a(31199, 8159318421630678015L), (long)834203424483934088L) - le.a(5416, 5759839044472774635L));
                                                                                    if (var2_2) {
                                                                                        break block13;
                                                                                    }
                                                                                    break block16;
                                                                                }
                                                                                case 1376776116: {
                                                                                    v6 = false;
                                                                                    if (!var2_2) break block13;
                                                                                    return v6;
                                                                                }
                                                                                case 1376776120: {
                                                                                    throw null;
                                                                                }
                                                                            }
lbl59:
                                                                            // 2 sources

                                                                            v1 /* !! */  = (CallSite)(le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)le.a(29859, 3717630270152212202L), (int)le.a(6931, 4433381620011700708L)) * le.a(4437, 4753560346882382749L) * le.a(24035, 1229593219487618954L) ^ le.a(357, 4908536354444020408L));
                                                                        }
                                                                        var3_3 /* !! */  = (int)v1 /* !! */ ;
                                                                        if (!var2_2) continue;
                                                                    }
                                                                    var3_3 /* !! */  = (le.a(10150, 7189956051650784658L) / le.a(13023, 4042916714488576148L) + le.a(18441, 2965353785722257989L) ^ le.a(1716, 3727484223692541185L)) - le.a(1871, 4492295470588562732L);
                                                                    if (!var2_2) continue;
                                                                }
                                                                v2 /* !! */  = (CallSite)(le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)le.a(29859, 3717630270152212202L), (int)le.a(6931, 4433381620011700708L)) * le.a(4437, 4753560346882382749L) * le.a(24035, 1229593219487618954L) ^ le.a(357, 4908536354444020408L));
                                                            }
                                                            var3_3 /* !! */  = (int)v2 /* !! */ ;
                                                            if (!var2_2) continue;
                                                        }
                                                        var3_3 /* !! */  = le.a(12910, 6250185497637501116L) * le.a(8245, 5770761489973095297L) + le.a(19682, 8667953299838780979L);
                                                        if (!var2_2) continue;
                                                    }
                                                    v3 /* !! */  = (CallSite)(hi.a("G", (int)le.a(29859, 3717630270152212202L), (int)le.a(6931, 4433381620011700708L), (long)834203424483934088L) * le.a(4437, 4753560346882382749L) * le.a(24035, 1229593219487618954L) ^ le.a(357, 4908536354444020408L));
                                                }
                                                var3_3 /* !! */  = (int)v3 /* !! */ ;
                                                if (!var2_2) continue;
                                            }
                                            var3_3 /* !! */  = le.a(25319, 6776763584047376696L) + le.a(26292, 2559820073677843556L) ^ le.a(386, 2772043686513581L);
                                            if (!var2_2) continue;
                                        }
                                        v4 /* !! */  = (CallSite)(hi.a("G", (int)le.a(29859, 3717630270152212202L), (int)le.a(6931, 4433381620011700708L), (long)834203424483934088L) * le.a(4437, 4753560346882382749L) * le.a(24035, 1229593219487618954L) ^ le.a(357, 4908536354444020408L));
                                    }
                                    var3_3 /* !! */  = (int)v4 /* !! */ ;
                                    if (!var2_2) continue;
                                }
                                var3_3 /* !! */  = (int)(hi.a("G", (int)le.a(24994, 2049068050746633148L), (int)le.a(654, 8802749228216879229L), (long)834203424483934088L) + le.a(13019, 7009326840016189696L));
                                if (!var2_2) continue;
                            }
                            v5 /* !! */  = (CallSite)(le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)le.a(29859, 3717630270152212202L), (int)le.a(6931, 4433381620011700708L)) * le.a(4437, 4753560346882382749L) * le.a(24035, 1229593219487618954L) ^ le.a(357, 4908536354444020408L));
                        }
                        var3_3 /* !! */  = (int)v5 /* !! */ ;
                        if (!var2_2) continue;
                    }
                    var3_3 /* !! */  = (le.a(8977, 7402332292239469044L) - le.a(6375, 6924384755993481931L) - le.a(15864, 2572347402009327417L)) / le.a(939, 7593925711559428535L) - le.a(5879, 7524993818483891283L) + le.a(10028, 350940084217425396L);
                }
                break;
            }
            var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(le.a(10890, 3110375030887456853L) * le.a(31821, 5291296544919615146L)), (int)le.a(11125, 4079365164170158504L), (long)834203424483934088L) * le.a(15604, 3460713449314793249L)), (int)le.a(32105, 854509391138387795L), (long)834203424483934088L) - le.a(20955, 3656084666136943159L));
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v6;
            }
            case 1442078459: 
        }
        throw null;
    }

    public void w(Object[] objectArray) {
        Vec3 vec3 = (Vec3)objectArray[0];
        Vec3 vec32 = (Vec3)objectArray[1];
        Color color = (Color)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = (int)hi.a("\u00a5", (Object)color, (long)921162811333111485L);
        objectArray2[1] = vec32;
        objectArray2[0] = vec3;
        hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)1235203007380103913L);
    }

    public void X(AABB aABB, int n, float f, Direction direction) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)752873413965097316L), (Object)new vu(aABB, n, f, direction), (long)615358212536192384L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var8 = new String[2];
                    var12_1 = 0;
                    var11_2 = "VD<\u001b\u0018EkC\u0002*\u0017\u0018@`Br.\u0011\f\u000eVD<\u001b\u0018EkC\u0002 \u0017\u001aIv";
                    var13_3 = "VD<\u001b\u0018EkC\u0002*\u0017\u0018@`Br.\u0011\f\u000eVD<\u001b\u0018EkC\u0002 \u0017\u001aIv".length();
                    var10_4 = 19;
                    var9_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var8[var12_1++] = new String(v0).intern();
                        if ((var9_5 += var10_4) < var13_3) {
                            var10_4 = var11_2.charAt(var9_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var9_5;
                    v2 = var11_2.substring(v1, v1 + var10_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 59;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 29;
                                    break;
                                }
                                case 1: {
                                    v11 = 22;
                                    break;
                                }
                                case 2: {
                                    v11 = 119;
                                    break;
                                }
                                case 3: {
                                    v11 = 69;
                                    break;
                                }
                                case 4: {
                                    v11 = 79;
                                    break;
                                }
                                case 5: {
                                    v11 = 23;
                                    break;
                                }
                                default: {
                                    v11 = 62;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                var0_7 = 8324897181299486033L;
                var6_8 = new long[337];
                var3_9 = 0;
                var4_10 = "\u001f\u00a23\u00c1M\u000b\u0012\u001c1\u00beX$\u00fcyW\u00a52\u0013je\u009a\u0013p\u00c3z\u00cc\u00cf\u00e5s\u009e;\u0003K\u00e1\u00f2@\u0012\u00f9[\u009a \u0016\u00d9\u00a83\u00c9\u00b3\u009c\u009fSO\u00bd1\u001b\u00be\u0001\u0084\u00fa\u00c2\u00f6\u00f4\u0004(\u00ff+\u00c9D\u0095U\u00d3=^D\u00b6`\u00f4\u00ed\u00e7)\t\u0002+\u009e\u00e5\n\u00bfG\u0089\u00b4\u00afs!wa\u0083\u00f0\u00d8O\u000e\u00b4\u0097!@!\u0016i+\u00b07!n\u00f5\u0002\u00f99\u00ce\u00f38\u00f8\u008e\u00f6(\u000b|A\u0094\u00d7\u008f>\u00d8\u00dbK\u009aC\u00fbAh\u00b6ytC\u0005\u001e\u0016\u00bbS\u0098\u00ad\u00f6\u00c4\u00b2\u00fa\u00b8\u00e2lh\u00b3\u001d\u00d7\f2|8\u0096\u00c7\u009c\u00fdw\u00d1.\u0006\u00dea\u00e5\u00df\u0090\u00d7\u00e1g*\u00d0m\u00a0]f\u000e\u00a5(\u00b2t\u00d3d\u00c0\u00a6o\u0006\u000b\u00ed\u00e8\u00c0^C\u0093\u0094n\u00e3\u000f?\u0001Dy\u00a9\u000e\u0087\u00d1\u00fb\u0093g\u0004\u009cKU\u0005\u00a7Y\u00aav\u00fb\u00c1\u00dfM\u00b1d\u00df<$F\u00e2\u0003n\u00a8\u009fjmtf\u0090\u00d53-3\r\u00b0%\u00e1P\u00dc[\u00b3\r\u00d1X\rC\u00f7\u0094\u0001\u0012\u0011\u00a1\u00b5\u0016\u0013R\u0011\u00ca\u00df\u00f0{Y\u00c7F\u001c \u00dav\u00f3\u00f4\u00fd\u00b0}\u00f21O\u009db\u00ec$\u00d4\u0083\u00b1\u0083\u00a8\u0019~\u000b\u0002q^\u00b0A\u0017\u0010\u00c6.5\u00c22D3j\u00bd\u0091Z^\u00c3\u00b0\u00f4d\u00eb\u009e\u00c0?\u00be\u00bb\u00d2I\u0092\u00a3\u0097\u009b\u00846(\u008c\u0014\u00e45\u008b\u0000\u0012\u0019\".\u00c1N\u00ebh5&#\u0006\u0001g\u00e57K\u009eh\u00b7\u00f7Rs&\u00ec\u009a\u00de\u00b0\u008f\u0005\u00d9X\u00aa\u00b4\u00a9\u0094\u00e0\u008a\u0090\u009d\u00d4\u009a\u009b\u0088y\u0002V\u00f8\u007ff\u0096\u0089\u0085\u00bd0r\u00cdw\u00b8\u008b\u00b8\u008e\u00d7(D\u00a5\u00e0rW\u00e5\u00b7\u0099>Cm\u00d1\u00ffKB\u00a54\u00d8\u00a6\u0089\u00d2/\u0013\u00c0\u00cd\u00a0\u00d7\u00177\u0011r\u00c6\u00cf\u00d3+U1\f\u00c4\u008e\u0098\u00f1\u009a\u00d1\u00ff\u00ffE\u00e8\u009f\u00b6\u00f0\u00eb\u00a3\u00dc\u0000@\u001fs\u00a2\u009ehOE\u0083\u00ad\u00a0\u0004\u00e1\u008c\u00b5\u0082Q\u0014}\u00eb\u00f0\u00ce^\u00f4\u0003\u00e1\u00b9\u00f6\u009c_\u00f4b\u0004\u00f9g3\u001c\u00a5\u00d0WH?f\u00e9\u00c0\u0091\u00d5\u00e4\u007f\u00ff\u001f\u00c1!\u00c8\u0096\u0004.\u00dd\u00aa\u0015\u0014t\u00af6H\u00ff\u009e\u00a8\u00de\u0081\u00f5\u0017\u0089Y`\u00d6\u0012\u009c\u00bd\u001d\u00fen\u007f\u00f4\u00fa\u000e\u00e4n!%\u00d3N\u008b\u009a%\u00cdh\u000b\u0005\u00be\u00e6\u00a9z\u0016H\u00ca4\u00c0\u0017/\u0093\u00a7$\u0080\u00a6\u00f9\u00a6\u00b4c\u00d0\u0019\u009b\u00cf\u00fa\t#D\u00bf\u00977/+\u0017\u0099@\u00bd\u00ab\u009d\u00d9a\u0080\u00e1\"\u00a2\u0086n\rY\u00aeO\u00d8(t\u00b1\u00d0\u0016\u0003\u0093i\u00c5X`2\u00ff\u00ba5\u00d8\u009b\u00b1A\tbt\u00c6\u00d7\u001b\u0003M\u00e5\u0085\u00de\u00a7U\u00d4\u00e5\n7\u0006\u00a1\u0084W\u00b4\u00be}\u0085\u0005\u0010e2\u00f0H];\u00b5\u00bb\u0018\u00e4\u00dd2\u0096R\u0086\u0089|\u00c2\u00f0\u00b8\u00af\u00b9\u0000\u00a9\u00db\u0003\u00fe\u00d4\u001cM\u0085Vv\u00dcHR\u0086\u0005\u0018\u00ef\u007f^N\u00e9\u0099\u0080f\u0083&_\n\u0004#\u00c0\u00f0K\u008f!W\u00b6}\u00cf\u0085\u001eHz \u008e\u0003\u00fd=;\u001c\u0089\u00ca0\u0096\u00a8+\u0003\u00b3\u009e\n$\u009d\u001c\u00e6\f\u00eb\u008a\u0011\u00f8\u0003\u00de\u000b\u00cc^G\u0002\u00d6\u0099\u008a3e!\u00896\u00ad\u001ci\u001c\u00d2qP\u00f1\u00c1\u0019\u00e0l\u00acn\u00ac\u00dd\u00c5\u00b9\u00ce\u00c4\u00a0$N\u00b7\u00c6\u00f0e\u0087aw\u0093\u00b1V(\u0003!\u00c5\u00a9\u0006\u0001\u00f6\u00c4\u00ae#P\u0002\u00ca\u00c12\u00a1\u008a\u00b5\u00ec8o\u00a8\u00c0\u00b3\u00e1\u000f$\u00e8\\\u00cbD2r<\u0093\u0092`\u00e3\u00a6)\u000e^1\f\u001f\u0083k\u001f\\\u00ec\u008c\u00dc!6\u00ba\u0087<\u00a6\u00f2\u0005Xfj$\u00c5\u00d0.\u0004\u00c6\u00d6=/C\u00ac\u00c6~\u00bc\u00fb\"c\u001e\u00da\u00ae\u00a5\u00ef\u00b7\u0013>8\u000b[\u00e0\u001a\u00dd\u00aa+\u0090[\u00acm6}#t\u00bf\u0085\u00c8\u00e9H!\u00b9hLfXy\u00a3\u00ef1\u00dc\n\u00e0\u00a5p\u001f4\u00a2e\u0003\u00c5@\u009c\u00ed5\u001aj\u00ae\u00f5{\u00a0\u00e4\u00a6\u0017\u00d1\u0094\u0006(=!\"\u00db?\u00b5\u0085I\u00c9\u00e5\u00dd\u00d2n\u00a1\u00ae\u00e8(P/\u00a3b\u0002G\u00d1\f\u00c1\u001c$\u00f3\u001d14F=:\u00de6\u00cb\u00c0t\u00c7\u00fb\u00be\u00a2d\u001c\u00d1O\u00e9F@\u009d\u00dc5\f\u00e6B\u00f2\u00c8\u0019\u009b\u000e~h\u00ac\u00b5r\u0092\u00bd9x\u001d!^ \u00f0\u0016\u00c5*,a\u0097F4\u00a8[\u00ca\u00bf\u00e2\u0090\u00f1\u0018\u00f5\u008b\u0011\u00f3\u00ba\u009b?\u0002\u00da\u0007\r\u0094\u00d1\u0006\u00dboN\u0085'\u0010x\u0081\u00b4w\u00a9e\u00ce\u00a9a\u008a\u00aa+\u0098\u00bd\u0088\r\u0099\u00ce\u0014\u00de\u00cd\u00ac#\u00d0\u00fb\u009d)\u00d5NU\u0092W\"!i\u00a3\u0098:L\u00e8+g\u00bcp\u00f6\u00aeL\u00b9\u00ea0jj\nn\u00b2}\u00db\u001dpz\u001c\u00c7\u00e2Q\u00bf$D\u00d0\u00ae\u008f\u001b\u008e\r\u00c5\u000b\u0005\u00fd-e\u00c9\u007f\u0094o\u00ee\t#\u00c2\u008a\u000bTI\u00c2\u00f5\u00f4\u0017\u0005{;i\u0014y\u008a\u00eb\u008d\u0083\u00cf\u00e7\u0094?>\u00a5X}>mk|\u00f6\u00df\u00dab\u00d6\u00ed\u009e\u001e\u008e\u000f\u00e7r\u0094K/\u00f3\u0005g\u009fc\u0093\u00ba:[qE\u0099\u0012\u00e1-\u00b4.>\u00bd\u0090\u00eb{\u00d3\u0080\u009bM\u0083\u00d1n\u00a2\u00a9+\u0004\u00c34Gmt!\u0086\u0003\u00a5\u00a0(\u008e\u00d7\u00b6+\u0017\u001b\u000e\u00d7\u00e3y\u00e2\u00ad\u00d1$\u00d1\u00c7\u009c\u0087\u00d60\u00b0\u008c\u00e8\u009a\u00f6+/\u0010N\u00b03?\u0085vh7$\u00bfN\u00d2\u00d1\u0091\u00c5H4\u00f1Q(:?KO\u00be\u0017\u00a7\u00cb\f\"a\u00a1\u00d1\u00e4\u00c8\u0007,s\u00e5m0y\u00ea\u00e6\u00b11\u00bc/q\u001f\u00f9k<\u0081C\u00fbU;\u00de\\\u0080eu\u00e8Xd7\r6\u0001\u0087#\u00ba^\u0084]W\u009e\u0089\u007f\u00c0s\u0090\u007f\u009e\u0082\u0096\u00c3\t\u0018\u009dR\u00edBe\u00fa\u00f8\u001e2[n\u001b\\\u00ddr\u00fe\u000fK\u00edu\u00fa\u00e8\u00f9\u0007X\u00be\u008d\u00a8\u00bb\u0011\u00e3\u0006\\9\u00d8\u00f4\u00ceI\f\u001b\u0086Ta(\u00d9\u000e\u00d8d\u0015BK9z\u00e3\u00ac\u00f8\u00ff\u00c2\u0082\u00f6\u00ba\u0082\u008e\u00acDl\f8\u00f1y\u00bb\u00a3\u00f5\u00c1\u00b6s[q\u00f5Nz\u00f4\u00b2\u0003qg.KN\u00bf\u00f3Zt\u00af\u0018\r\u00a6\"\u00ad\u00bd\u00c4\u0081\u00c7&\u00b6\u00e2=\u00d6\u00a2\u00b1\u00e3^\u00b3t\u00b8\u0017\u00d3\u00ffj\u00b7\u0013\u0097\u00ecYd\u00038\u000bZ\u00cc \u00a2\u00a9\u009d\u00ec\u00cb\u00b2R*\u00f8X\u0091\u00f7\u00b2\u00e0b\u00bbt:X\u00e3B\u00fa\u00ca\u00c3\"L\u00aaT\u0090\u0099(7\u0085\u00cc\u0095\u0015\u00cf\u001b\u00bd\u0019\u00c4{8\u0013C\u00a5\u00f4Z\u0096\u00e5\u00b4\u00c0[\u00fc\u00c4yC8\u00bc\u00c0\u0007\u00df\t=\u00aa\u00d8P\u008f\u00ca\u00e6\u00ac\u00f1\u00ea\u001e\u0018b\u0012\u0012\u0018:Wp\u00f8BXu\n]\u001cS\u00d1A?\u00ba\u008cl\u0002\u00c6]@\u00ec\u0085I\u00f7s\u0011\u0091\u00f3l\u00fc\u00fe\u00b5\u00b2\u00ca\u00fe+\u009b5\u001e\u00a35c\u0083\u008bc\u00f2\u00b8\u0016\u00e6\u00f6\tSK\u00c9o\u00aa\u00c4\u0005\u0018\u00c1k\u00992\u009c\u00ef\u00af\u008d\u00d3\u00ea_\u00cb\u00d0>Q\u0080m\u007f\u008fc\u0095\u00d9\u00a9\u000f9\u00aa,p\u00c0\u00ba\u009b \u0000bv\u0099N\u0003scC\u00ac]\u00c7\u00ee0\u0094b\u0092\u00e0k\u00fd;S\u00ba\u00e9\u00f2\u0014[\u00cb\u0017\u0019\u00a3<\u001de.K_\u0014`'(o@\u00b3\u0088\u009f\u00f5\u00b1\u0004\u00cen\u009e\"\u0010y\u0086\r~\u00a7D\u00f3\u00c0\u0005\u00b7_6\u0093v8\tn\u00ee\u00b2\u00da\u0085K\u00e0\u00b1$\u00fc\u001f\u0087\u00d3\u00d1<\u00ef%V\u008f\u008b\u00db\u00ca89Qf\u0086\t\u00f7\u00e44m\u00f8\u00ae3\u00c8-\u009c\u000f\u0004M\u00cc\u0012\tgC!sI\u00bd\u00e9\u0086\u0085\u00a0s\r]\u00c8\u00f4_R\t\u0086d\u0090U\t\u00a7\u0013\u00b4\u00f1\u00bf\u00a4\u00cd\t\u0097#\u00fbp\u008b\u00ea\u00b4\u00d2H6\u0011\u008a\u00a1\u00d6q\u00ed<s\u00ea\u0017\u001e\u008b\u00fc\u007fZ6#\u00c7\u0013\u00e5o\u00b4\u00ac\u00eb\u0093\u001a\u0089I\u0084\u0004\u008c\u00ad2\u0019\u0092O\u0015C\u00f5\u0086Q\u00d1?\u0017\u00bb\u00ebcAc\u00a6C[5$\u00e8\u00b7\u00f1\u0002)\u00ff:\u00aa\u00da\u0019\u0082U\u00e5\u00fa!\nM\u00fd\u00e8x\u009eep\u00de\u00e3\u0088\u00bc\u009a5SO\u009c\u00d3\u00d9-o\u0084\u00aa\u00c0as\u00e0Gw\u00bf\u00c3\u00a1z\u00ff\u00cc\u0015\u00c8W\u00b4p=<H\u00d2\u009d\u00cc\u00a4\u00c4\u00c4\u0018E \u000fT\u00d1\u00d8E\u001d\u00a0\u00c9\u0085\u00c3\u00bfyq}\u00act\u000f\u0093U\u00b9\u00ad\u00b0J\u00ee\u00f1\u00e6\u00df\u00b3\u0001s\u00b9(\u00f5\u00f3\u00ed8pq\u00c1.U4\u00ab\u007f\u00e1V\u00ae\u00bdtTQ\u009d|B\u00d9\u0017\u0004>PC\u008c\u0094\u009dg\u00d3\u00dc\u00c5\u00f0\u00e7\u00bb=\u00987\u0013h<\u00ec\u00c7F\u0099\u00a5\u00e1\t\u001a\u0014\u00bb2\u00c1\u001e\u0084a\u0087\u00bep\u00b1\u008eO\u00b7\u00dd\u00a5z~\u00c2\u0005\u00b6\u00f2\u00c6\u008a\u0010\u00d43\u00d8P\u00b7\u00cd\u00c8\u00d2O\u0092\u0011\u00e8+\u0095W\n\u001b)\u009f\u0091\"\u00a3\u00c6\u00f6f|R\u00f8\u00cf_\u00be\u008fkm\u0000^*\u00fb\u0094\u00d0\u00ef'\u00a8\u009f\u00ca\u00cd\u0085\u00dd\u000f\u00e3\u00c3]\u0095\u0091N\u00dfA\u00c5\u00dc\u008f\u008b~n\u00e7\u00b1R=\u00af\u00ff\u009c\u0014\u00fb\u00dc\u00023y\u00fc\u00aa[\u00b3I\u00ea\u00af\u0093\u001cQx\u00c3d\u00e7\u008b\u00ba\u00fe\u00cf)%;\u00e9}\u00bf\u00c3s<\u001a\u00ecY\u00813\u00c9\u00da\u00a4\u0093\b1\b\u00d6\u00bd*\"\u00deX\u009aYN6\u00d3\u00b2NV\u00b9\u00ee\\$\u00e5q`O\u001d_v\u00daGyh\u00e7\u0080\u00e1N\u00a3\u00f7\u00c4\u0093CN0\u00e1!@\u00fd\u00e0\u0015\u00d28\u00c9\f\u001e,\u0092\r\u009fhk\u00b6,\u008c\u0015DZ\u00a79Z\u00a5\u00d0\u0096X\u0082\u001a<4\u009cK\t=\f\u00ddU\u0098\u0010;-\u0095\u00e7\u0086s\u0080\u0013!\b|,\u00e9\u00c9A[\u00ect\u00d0)\u00ad\u00c0\u0097\b/>s\u00d0<\u00a1\u00f4E+~\u0003]\u0096\u00d1\u001az\u000e$?\u00earb/\u00c2y\u00f5$\u008d_g\u00f7\u009a\u00ab\u00fc\u0096\u0001\u00c0\u00813\u0097\u00c7K\u009f\u0015cw\u00a2\u001e\u00d0\u00d1~\b2\u00a7\u00a6\u00f5K\u008c3fJ\u008e\u00c1i\u00a9)\u008ec\u00ad7\u0013I\u0005\u00ff\u0004!\u00c4\u0097\u007fBZkZ\u00f5\u0011\u0013pM\u00fbmy\u0098^QJI\u0081\u00ff\u009fJ\u00a6\u009b\u0083\u0095T\u0014O\u00ad{\u00ae7^8\u00ca \u00a5\u0099\u0084\u00aa6\u0099\u0019\u00f1\u0080\u00ff\u00b1\u00bcG\u00f2J\u000b?\u009aqv1Q\u00dcm\u0089\u0012&\u00ff\u00b4t\u001e)\u00c5\u00d0\u00ff\u00e9+R\u00b7G\u00a7\u0095\u00ed\u009d1>\u00bb\u0006t\u00b6w,6\u00ff\u001e\u00cf\u00c5a~e[\u00adzj\u0001\u00b64)HYOR\u00c8}R\u00d5\u00ed@\u0088\t\t.\u00eaPfU1M\u00fcF\u0013\u0013Fv\u00cf\u0092Bi\u00ee?\b\u009c\u008e@\u0097\u0001l\u0000n\u0004\u0005M\u0088\u00c5\u00fd7\u00a8\u00b9\u00d2\u0092\u00d5\u00f4p\u0007aC9G\u00e8\u00ed\u0006a'K\u00b6Q\u0017\u00e2\u008d\u0002\u00e5\u00c9'h/\u00ad\u00f7\u00c0\u00b5J\u00f4\u00c1\u00bc^\u00bd\u001bz\u00a1`\u0006\u0083LJU\u00aa\u0004\u0086\u00ef\u00cb\u0011\u008c\u00b7\u00e8?\u0088\u00dc\u000b\u00d6lIZ\t\u00c9\u0012\u00fb\u0019\"\u0094\u00abz g\u00a6\u00c0\u00ca\u00e1\u00c7\u0013\u0003\u00ef\u00b9\u00e6\u00a7\u00ee:\u0003\u0090\u009a>\u0001\u00c2E3\u0099/8~\u0087/}x\u001d\u0098,\u00c3\u0013\u00b1\u00ef_?\u00d2\u00b0b\u00adO\u0018jS\u0010\u00a6ILW\u00ccEJ\u007f\u008c\u001d\u00c2\u0088\u001d\u00c2^\u00e0y\u00a8u\u00ad\u0013\r\u0006\u00d8\u0099 \u0012'q\u009d\t\u00e0>\u00af\u00b4Q\u00fd\u0018\u00dcM\u000e\u00c7/\u00af\u00ca\u007f,[\u00ccZ\u00ec\u00a7\u00d3\u00b1$\u0015\r";
                var5_11 = "\u001f\u00a23\u00c1M\u000b\u0012\u001c1\u00beX$\u00fcyW\u00a52\u0013je\u009a\u0013p\u00c3z\u00cc\u00cf\u00e5s\u009e;\u0003K\u00e1\u00f2@\u0012\u00f9[\u009a \u0016\u00d9\u00a83\u00c9\u00b3\u009c\u009fSO\u00bd1\u001b\u00be\u0001\u0084\u00fa\u00c2\u00f6\u00f4\u0004(\u00ff+\u00c9D\u0095U\u00d3=^D\u00b6`\u00f4\u00ed\u00e7)\t\u0002+\u009e\u00e5\n\u00bfG\u0089\u00b4\u00afs!wa\u0083\u00f0\u00d8O\u000e\u00b4\u0097!@!\u0016i+\u00b07!n\u00f5\u0002\u00f99\u00ce\u00f38\u00f8\u008e\u00f6(\u000b|A\u0094\u00d7\u008f>\u00d8\u00dbK\u009aC\u00fbAh\u00b6ytC\u0005\u001e\u0016\u00bbS\u0098\u00ad\u00f6\u00c4\u00b2\u00fa\u00b8\u00e2lh\u00b3\u001d\u00d7\f2|8\u0096\u00c7\u009c\u00fdw\u00d1.\u0006\u00dea\u00e5\u00df\u0090\u00d7\u00e1g*\u00d0m\u00a0]f\u000e\u00a5(\u00b2t\u00d3d\u00c0\u00a6o\u0006\u000b\u00ed\u00e8\u00c0^C\u0093\u0094n\u00e3\u000f?\u0001Dy\u00a9\u000e\u0087\u00d1\u00fb\u0093g\u0004\u009cKU\u0005\u00a7Y\u00aav\u00fb\u00c1\u00dfM\u00b1d\u00df<$F\u00e2\u0003n\u00a8\u009fjmtf\u0090\u00d53-3\r\u00b0%\u00e1P\u00dc[\u00b3\r\u00d1X\rC\u00f7\u0094\u0001\u0012\u0011\u00a1\u00b5\u0016\u0013R\u0011\u00ca\u00df\u00f0{Y\u00c7F\u001c \u00dav\u00f3\u00f4\u00fd\u00b0}\u00f21O\u009db\u00ec$\u00d4\u0083\u00b1\u0083\u00a8\u0019~\u000b\u0002q^\u00b0A\u0017\u0010\u00c6.5\u00c22D3j\u00bd\u0091Z^\u00c3\u00b0\u00f4d\u00eb\u009e\u00c0?\u00be\u00bb\u00d2I\u0092\u00a3\u0097\u009b\u00846(\u008c\u0014\u00e45\u008b\u0000\u0012\u0019\".\u00c1N\u00ebh5&#\u0006\u0001g\u00e57K\u009eh\u00b7\u00f7Rs&\u00ec\u009a\u00de\u00b0\u008f\u0005\u00d9X\u00aa\u00b4\u00a9\u0094\u00e0\u008a\u0090\u009d\u00d4\u009a\u009b\u0088y\u0002V\u00f8\u007ff\u0096\u0089\u0085\u00bd0r\u00cdw\u00b8\u008b\u00b8\u008e\u00d7(D\u00a5\u00e0rW\u00e5\u00b7\u0099>Cm\u00d1\u00ffKB\u00a54\u00d8\u00a6\u0089\u00d2/\u0013\u00c0\u00cd\u00a0\u00d7\u00177\u0011r\u00c6\u00cf\u00d3+U1\f\u00c4\u008e\u0098\u00f1\u009a\u00d1\u00ff\u00ffE\u00e8\u009f\u00b6\u00f0\u00eb\u00a3\u00dc\u0000@\u001fs\u00a2\u009ehOE\u0083\u00ad\u00a0\u0004\u00e1\u008c\u00b5\u0082Q\u0014}\u00eb\u00f0\u00ce^\u00f4\u0003\u00e1\u00b9\u00f6\u009c_\u00f4b\u0004\u00f9g3\u001c\u00a5\u00d0WH?f\u00e9\u00c0\u0091\u00d5\u00e4\u007f\u00ff\u001f\u00c1!\u00c8\u0096\u0004.\u00dd\u00aa\u0015\u0014t\u00af6H\u00ff\u009e\u00a8\u00de\u0081\u00f5\u0017\u0089Y`\u00d6\u0012\u009c\u00bd\u001d\u00fen\u007f\u00f4\u00fa\u000e\u00e4n!%\u00d3N\u008b\u009a%\u00cdh\u000b\u0005\u00be\u00e6\u00a9z\u0016H\u00ca4\u00c0\u0017/\u0093\u00a7$\u0080\u00a6\u00f9\u00a6\u00b4c\u00d0\u0019\u009b\u00cf\u00fa\t#D\u00bf\u00977/+\u0017\u0099@\u00bd\u00ab\u009d\u00d9a\u0080\u00e1\"\u00a2\u0086n\rY\u00aeO\u00d8(t\u00b1\u00d0\u0016\u0003\u0093i\u00c5X`2\u00ff\u00ba5\u00d8\u009b\u00b1A\tbt\u00c6\u00d7\u001b\u0003M\u00e5\u0085\u00de\u00a7U\u00d4\u00e5\n7\u0006\u00a1\u0084W\u00b4\u00be}\u0085\u0005\u0010e2\u00f0H];\u00b5\u00bb\u0018\u00e4\u00dd2\u0096R\u0086\u0089|\u00c2\u00f0\u00b8\u00af\u00b9\u0000\u00a9\u00db\u0003\u00fe\u00d4\u001cM\u0085Vv\u00dcHR\u0086\u0005\u0018\u00ef\u007f^N\u00e9\u0099\u0080f\u0083&_\n\u0004#\u00c0\u00f0K\u008f!W\u00b6}\u00cf\u0085\u001eHz \u008e\u0003\u00fd=;\u001c\u0089\u00ca0\u0096\u00a8+\u0003\u00b3\u009e\n$\u009d\u001c\u00e6\f\u00eb\u008a\u0011\u00f8\u0003\u00de\u000b\u00cc^G\u0002\u00d6\u0099\u008a3e!\u00896\u00ad\u001ci\u001c\u00d2qP\u00f1\u00c1\u0019\u00e0l\u00acn\u00ac\u00dd\u00c5\u00b9\u00ce\u00c4\u00a0$N\u00b7\u00c6\u00f0e\u0087aw\u0093\u00b1V(\u0003!\u00c5\u00a9\u0006\u0001\u00f6\u00c4\u00ae#P\u0002\u00ca\u00c12\u00a1\u008a\u00b5\u00ec8o\u00a8\u00c0\u00b3\u00e1\u000f$\u00e8\\\u00cbD2r<\u0093\u0092`\u00e3\u00a6)\u000e^1\f\u001f\u0083k\u001f\\\u00ec\u008c\u00dc!6\u00ba\u0087<\u00a6\u00f2\u0005Xfj$\u00c5\u00d0.\u0004\u00c6\u00d6=/C\u00ac\u00c6~\u00bc\u00fb\"c\u001e\u00da\u00ae\u00a5\u00ef\u00b7\u0013>8\u000b[\u00e0\u001a\u00dd\u00aa+\u0090[\u00acm6}#t\u00bf\u0085\u00c8\u00e9H!\u00b9hLfXy\u00a3\u00ef1\u00dc\n\u00e0\u00a5p\u001f4\u00a2e\u0003\u00c5@\u009c\u00ed5\u001aj\u00ae\u00f5{\u00a0\u00e4\u00a6\u0017\u00d1\u0094\u0006(=!\"\u00db?\u00b5\u0085I\u00c9\u00e5\u00dd\u00d2n\u00a1\u00ae\u00e8(P/\u00a3b\u0002G\u00d1\f\u00c1\u001c$\u00f3\u001d14F=:\u00de6\u00cb\u00c0t\u00c7\u00fb\u00be\u00a2d\u001c\u00d1O\u00e9F@\u009d\u00dc5\f\u00e6B\u00f2\u00c8\u0019\u009b\u000e~h\u00ac\u00b5r\u0092\u00bd9x\u001d!^ \u00f0\u0016\u00c5*,a\u0097F4\u00a8[\u00ca\u00bf\u00e2\u0090\u00f1\u0018\u00f5\u008b\u0011\u00f3\u00ba\u009b?\u0002\u00da\u0007\r\u0094\u00d1\u0006\u00dboN\u0085'\u0010x\u0081\u00b4w\u00a9e\u00ce\u00a9a\u008a\u00aa+\u0098\u00bd\u0088\r\u0099\u00ce\u0014\u00de\u00cd\u00ac#\u00d0\u00fb\u009d)\u00d5NU\u0092W\"!i\u00a3\u0098:L\u00e8+g\u00bcp\u00f6\u00aeL\u00b9\u00ea0jj\nn\u00b2}\u00db\u001dpz\u001c\u00c7\u00e2Q\u00bf$D\u00d0\u00ae\u008f\u001b\u008e\r\u00c5\u000b\u0005\u00fd-e\u00c9\u007f\u0094o\u00ee\t#\u00c2\u008a\u000bTI\u00c2\u00f5\u00f4\u0017\u0005{;i\u0014y\u008a\u00eb\u008d\u0083\u00cf\u00e7\u0094?>\u00a5X}>mk|\u00f6\u00df\u00dab\u00d6\u00ed\u009e\u001e\u008e\u000f\u00e7r\u0094K/\u00f3\u0005g\u009fc\u0093\u00ba:[qE\u0099\u0012\u00e1-\u00b4.>\u00bd\u0090\u00eb{\u00d3\u0080\u009bM\u0083\u00d1n\u00a2\u00a9+\u0004\u00c34Gmt!\u0086\u0003\u00a5\u00a0(\u008e\u00d7\u00b6+\u0017\u001b\u000e\u00d7\u00e3y\u00e2\u00ad\u00d1$\u00d1\u00c7\u009c\u0087\u00d60\u00b0\u008c\u00e8\u009a\u00f6+/\u0010N\u00b03?\u0085vh7$\u00bfN\u00d2\u00d1\u0091\u00c5H4\u00f1Q(:?KO\u00be\u0017\u00a7\u00cb\f\"a\u00a1\u00d1\u00e4\u00c8\u0007,s\u00e5m0y\u00ea\u00e6\u00b11\u00bc/q\u001f\u00f9k<\u0081C\u00fbU;\u00de\\\u0080eu\u00e8Xd7\r6\u0001\u0087#\u00ba^\u0084]W\u009e\u0089\u007f\u00c0s\u0090\u007f\u009e\u0082\u0096\u00c3\t\u0018\u009dR\u00edBe\u00fa\u00f8\u001e2[n\u001b\\\u00ddr\u00fe\u000fK\u00edu\u00fa\u00e8\u00f9\u0007X\u00be\u008d\u00a8\u00bb\u0011\u00e3\u0006\\9\u00d8\u00f4\u00ceI\f\u001b\u0086Ta(\u00d9\u000e\u00d8d\u0015BK9z\u00e3\u00ac\u00f8\u00ff\u00c2\u0082\u00f6\u00ba\u0082\u008e\u00acDl\f8\u00f1y\u00bb\u00a3\u00f5\u00c1\u00b6s[q\u00f5Nz\u00f4\u00b2\u0003qg.KN\u00bf\u00f3Zt\u00af\u0018\r\u00a6\"\u00ad\u00bd\u00c4\u0081\u00c7&\u00b6\u00e2=\u00d6\u00a2\u00b1\u00e3^\u00b3t\u00b8\u0017\u00d3\u00ffj\u00b7\u0013\u0097\u00ecYd\u00038\u000bZ\u00cc \u00a2\u00a9\u009d\u00ec\u00cb\u00b2R*\u00f8X\u0091\u00f7\u00b2\u00e0b\u00bbt:X\u00e3B\u00fa\u00ca\u00c3\"L\u00aaT\u0090\u0099(7\u0085\u00cc\u0095\u0015\u00cf\u001b\u00bd\u0019\u00c4{8\u0013C\u00a5\u00f4Z\u0096\u00e5\u00b4\u00c0[\u00fc\u00c4yC8\u00bc\u00c0\u0007\u00df\t=\u00aa\u00d8P\u008f\u00ca\u00e6\u00ac\u00f1\u00ea\u001e\u0018b\u0012\u0012\u0018:Wp\u00f8BXu\n]\u001cS\u00d1A?\u00ba\u008cl\u0002\u00c6]@\u00ec\u0085I\u00f7s\u0011\u0091\u00f3l\u00fc\u00fe\u00b5\u00b2\u00ca\u00fe+\u009b5\u001e\u00a35c\u0083\u008bc\u00f2\u00b8\u0016\u00e6\u00f6\tSK\u00c9o\u00aa\u00c4\u0005\u0018\u00c1k\u00992\u009c\u00ef\u00af\u008d\u00d3\u00ea_\u00cb\u00d0>Q\u0080m\u007f\u008fc\u0095\u00d9\u00a9\u000f9\u00aa,p\u00c0\u00ba\u009b \u0000bv\u0099N\u0003scC\u00ac]\u00c7\u00ee0\u0094b\u0092\u00e0k\u00fd;S\u00ba\u00e9\u00f2\u0014[\u00cb\u0017\u0019\u00a3<\u001de.K_\u0014`'(o@\u00b3\u0088\u009f\u00f5\u00b1\u0004\u00cen\u009e\"\u0010y\u0086\r~\u00a7D\u00f3\u00c0\u0005\u00b7_6\u0093v8\tn\u00ee\u00b2\u00da\u0085K\u00e0\u00b1$\u00fc\u001f\u0087\u00d3\u00d1<\u00ef%V\u008f\u008b\u00db\u00ca89Qf\u0086\t\u00f7\u00e44m\u00f8\u00ae3\u00c8-\u009c\u000f\u0004M\u00cc\u0012\tgC!sI\u00bd\u00e9\u0086\u0085\u00a0s\r]\u00c8\u00f4_R\t\u0086d\u0090U\t\u00a7\u0013\u00b4\u00f1\u00bf\u00a4\u00cd\t\u0097#\u00fbp\u008b\u00ea\u00b4\u00d2H6\u0011\u008a\u00a1\u00d6q\u00ed<s\u00ea\u0017\u001e\u008b\u00fc\u007fZ6#\u00c7\u0013\u00e5o\u00b4\u00ac\u00eb\u0093\u001a\u0089I\u0084\u0004\u008c\u00ad2\u0019\u0092O\u0015C\u00f5\u0086Q\u00d1?\u0017\u00bb\u00ebcAc\u00a6C[5$\u00e8\u00b7\u00f1\u0002)\u00ff:\u00aa\u00da\u0019\u0082U\u00e5\u00fa!\nM\u00fd\u00e8x\u009eep\u00de\u00e3\u0088\u00bc\u009a5SO\u009c\u00d3\u00d9-o\u0084\u00aa\u00c0as\u00e0Gw\u00bf\u00c3\u00a1z\u00ff\u00cc\u0015\u00c8W\u00b4p=<H\u00d2\u009d\u00cc\u00a4\u00c4\u00c4\u0018E \u000fT\u00d1\u00d8E\u001d\u00a0\u00c9\u0085\u00c3\u00bfyq}\u00act\u000f\u0093U\u00b9\u00ad\u00b0J\u00ee\u00f1\u00e6\u00df\u00b3\u0001s\u00b9(\u00f5\u00f3\u00ed8pq\u00c1.U4\u00ab\u007f\u00e1V\u00ae\u00bdtTQ\u009d|B\u00d9\u0017\u0004>PC\u008c\u0094\u009dg\u00d3\u00dc\u00c5\u00f0\u00e7\u00bb=\u00987\u0013h<\u00ec\u00c7F\u0099\u00a5\u00e1\t\u001a\u0014\u00bb2\u00c1\u001e\u0084a\u0087\u00bep\u00b1\u008eO\u00b7\u00dd\u00a5z~\u00c2\u0005\u00b6\u00f2\u00c6\u008a\u0010\u00d43\u00d8P\u00b7\u00cd\u00c8\u00d2O\u0092\u0011\u00e8+\u0095W\n\u001b)\u009f\u0091\"\u00a3\u00c6\u00f6f|R\u00f8\u00cf_\u00be\u008fkm\u0000^*\u00fb\u0094\u00d0\u00ef'\u00a8\u009f\u00ca\u00cd\u0085\u00dd\u000f\u00e3\u00c3]\u0095\u0091N\u00dfA\u00c5\u00dc\u008f\u008b~n\u00e7\u00b1R=\u00af\u00ff\u009c\u0014\u00fb\u00dc\u00023y\u00fc\u00aa[\u00b3I\u00ea\u00af\u0093\u001cQx\u00c3d\u00e7\u008b\u00ba\u00fe\u00cf)%;\u00e9}\u00bf\u00c3s<\u001a\u00ecY\u00813\u00c9\u00da\u00a4\u0093\b1\b\u00d6\u00bd*\"\u00deX\u009aYN6\u00d3\u00b2NV\u00b9\u00ee\\$\u00e5q`O\u001d_v\u00daGyh\u00e7\u0080\u00e1N\u00a3\u00f7\u00c4\u0093CN0\u00e1!@\u00fd\u00e0\u0015\u00d28\u00c9\f\u001e,\u0092\r\u009fhk\u00b6,\u008c\u0015DZ\u00a79Z\u00a5\u00d0\u0096X\u0082\u001a<4\u009cK\t=\f\u00ddU\u0098\u0010;-\u0095\u00e7\u0086s\u0080\u0013!\b|,\u00e9\u00c9A[\u00ect\u00d0)\u00ad\u00c0\u0097\b/>s\u00d0<\u00a1\u00f4E+~\u0003]\u0096\u00d1\u001az\u000e$?\u00earb/\u00c2y\u00f5$\u008d_g\u00f7\u009a\u00ab\u00fc\u0096\u0001\u00c0\u00813\u0097\u00c7K\u009f\u0015cw\u00a2\u001e\u00d0\u00d1~\b2\u00a7\u00a6\u00f5K\u008c3fJ\u008e\u00c1i\u00a9)\u008ec\u00ad7\u0013I\u0005\u00ff\u0004!\u00c4\u0097\u007fBZkZ\u00f5\u0011\u0013pM\u00fbmy\u0098^QJI\u0081\u00ff\u009fJ\u00a6\u009b\u0083\u0095T\u0014O\u00ad{\u00ae7^8\u00ca \u00a5\u0099\u0084\u00aa6\u0099\u0019\u00f1\u0080\u00ff\u00b1\u00bcG\u00f2J\u000b?\u009aqv1Q\u00dcm\u0089\u0012&\u00ff\u00b4t\u001e)\u00c5\u00d0\u00ff\u00e9+R\u00b7G\u00a7\u0095\u00ed\u009d1>\u00bb\u0006t\u00b6w,6\u00ff\u001e\u00cf\u00c5a~e[\u00adzj\u0001\u00b64)HYOR\u00c8}R\u00d5\u00ed@\u0088\t\t.\u00eaPfU1M\u00fcF\u0013\u0013Fv\u00cf\u0092Bi\u00ee?\b\u009c\u008e@\u0097\u0001l\u0000n\u0004\u0005M\u0088\u00c5\u00fd7\u00a8\u00b9\u00d2\u0092\u00d5\u00f4p\u0007aC9G\u00e8\u00ed\u0006a'K\u00b6Q\u0017\u00e2\u008d\u0002\u00e5\u00c9'h/\u00ad\u00f7\u00c0\u00b5J\u00f4\u00c1\u00bc^\u00bd\u001bz\u00a1`\u0006\u0083LJU\u00aa\u0004\u0086\u00ef\u00cb\u0011\u008c\u00b7\u00e8?\u0088\u00dc\u000b\u00d6lIZ\t\u00c9\u0012\u00fb\u0019\"\u0094\u00abz g\u00a6\u00c0\u00ca\u00e1\u00c7\u0013\u0003\u00ef\u00b9\u00e6\u00a7\u00ee:\u0003\u0090\u009a>\u0001\u00c2E3\u0099/8~\u0087/}x\u001d\u0098,\u00c3\u0013\u00b1\u00ef_?\u00d2\u00b0b\u00adO\u0018jS\u0010\u00a6ILW\u00ccEJ\u007f\u008c\u001d\u00c2\u0088\u001d\u00c2^\u00e0y\u00a8u\u00ad\u0013\r\u0006\u00d8\u0099 \u0012'q\u009d\t\u00e0>\u00af\u00b4Q\u00fd\u0018\u00dcM\u000e\u00c7/\u00af\u00ca\u007f,[\u00ccZ\u00ec\u00a7\u00d3\u00b1$\u0015\r".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00ff\u00fd@\u00c7\u00a7\u00b8\u00db\u009a\u00a6\u0089k\u00fa\u00a6\u00e1\u00d9C";
                    var5_11 = "\u00ff\u00fd@\u00c7\u00a7\u00b8\u00db\u009a\u00a6\u0089k\u00fa\u00a6\u00e1\u00d9C".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl101:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl112:
                // 1 sources

                ** continue;
            }
        }
        le.a = var6_8;
        le.b = new Integer[337];
        le.D = new le();
        le.s = le.C("hDTOnGCKeBWWyu2a", build(), (RenderPipeline.Builder)le.C("hDTOnGCKeBWWyu2a", withCull(boolean ), (RenderPipeline.Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)1167515402784077163L)}, (long)731833861383729593L), (Object)hi.a("G", var8[0], (long)1218614314410685839L), (long)438264672872939574L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false));
        le.g = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)1038139946397753316L)}, (long)731833861383729593L), (Object)hi.a("G", var8[1], (long)1218614314410685839L), (long)438264672872939574L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (long)974970866675039906L);
    }

    public void q(AABB aABB, int n, float f) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1157359868643818978L), (Object)new yN(aABB, n, f), (long)615358212536192384L);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void o(Object[] objectArray) {
        Vec3 vec3 = (Vec3)objectArray[0];
        Vec3 vec32 = (Vec3)objectArray[1];
        int n = (Integer)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        boolean bl = Dl.S();
        int n2 = le.a(14573, 6991347203428626983L) + le.a(16943, 2735707436328175712L) ^ le.a(6425, 1429086003212751657L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        reference cfr_temp_0 = le.C("hDTOnGCKeBWWyu2a", distanceToSqr(net.minecraft.world.phys.Vec3 ), (Vec3)vec3, (Vec3)vec32) - 1.0E-6;
                        Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (!bl) break block9;
                        if (object2 < 0) break block10;
                        object2 = object = (Object)((le.a(22000, 1760681152207937339L) - le.a(29150, 4314591677596695456L) - le.a(12064, 1547912508775441866L)) / le.a(30760, 4875537354680726216L) + le.a(15036, 7922353266350534719L) + le.a(8229, 7682813479581199340L));
                    }
                    if (bl) break block8;
                }
                object = hi.a("G", (int)le.a(29678, 8392489267263207923L), (int)le.a(16805, 4520132087556066189L), (long)834203424483934088L) - le.a(19769, 7482526386672420696L) ^ le.a(4921, 6131142275901790498L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case 478893390: {
                    return;
                }
                case 478893391: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)411584793121298751L), (Object)new uX(vec3, vec32, n, f), (long)615358212536192384L);
                    return;
                }
                case 478893392: 
            }
            break;
        }
        hi.a("G", (long)373721845012904719L);
        hi.a("G", (long)1097773666732108654L);
    }

    private Vector3f h(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        float f3 = ((Float)objectArray[2]).floatValue();
        float f4 = ((Float)objectArray[3]).floatValue();
        float f5 = ((Float)objectArray[4]).floatValue();
        float f6 = ((Float)objectArray[5]).floatValue();
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float f9 = f6 - f3;
        CallSite callSite = hi.a("G", (float)(f7 * f7 + f8 * f8 + f9 * f9), (long)1058598864707910295L);
        return new Vector3f(f7 / callSite, f8 / callSite, f9 / callSite);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void R(Object[] var1_1) {
        block26: {
            block25: {
                block24: {
                    block22: {
                        block23: {
                            var2_2 = (PoseStack)var1_1[0];
                            var3_3 = Dl.S();
                            var5_4 /* !! */  = hi.a("G", (int)(le.a(14292, 4960693315040754724L) + le.a(24704, 4302756688806341483L)), (int)le.a(15510, 3546109457957664403L), (long)834203424483934088L) / le.a(6146, 4232661979066896997L) * le.a(22348, 1574654657347869966L) + le.a(4086, 5922814720873006395L);
                            if (!var3_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    v0 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)828696216509352177L);
                                    if (!var3_3) break block22;
                                    if (v0 /* !! */  == false) break block23;
                                    break block24;
                                    break;
                                }
lbl11:
                                // 1 sources

                                return;
lbl13:
                                // 1 sources

                                while (true) {
                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)853056621913317746L);
                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)646695501967012542L);
                                    hi.a("\u00a5", (Object)this, (Object)new Object[]{var2_2}, (long)1295437314758477821L);
                                    if (var3_3) break block25;
lbl20:
                                    // 2 sources

                                    while (true) {
                                        hi.a("G", (float)0.0f, (float)-1.0f, (long)443772702353985914L);
                                        le.C("hDTOnGCKeBWWyu2a", E());
lbl25:
                                        // 2 sources

                                        while (true) {
                                            hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1125611062862751476L);
                                            break block26;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var4_5 = v1;
                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1125611062862751476L);
                                    throw var4_5;
                                }
lbl32:
                                // 1 sources

                                return;
                            }
lbl34:
                            // 6 sources

                            while (true) {
                                switch (var5_4 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -243401960: {
                                        ** continue;
                                    }
                                    case -243401959: {
                                        ** continue;
                                    }
                                    case -243401956: {
                                        ** continue;
                                    }
                                    case -243401961: {
                                        ** continue;
                                    }
                                    ** case -243401957:
lbl47:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
lbl48:
                            // 1 sources

                            while (true) {
                                switch (var5_4 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case 1001089911: 
                                }
                                le.C("hDTOnGCKeBWWyu2a", N());
                                return;
                            }
                        }
                        v0 /* !! */  = var5_4 /* !! */  = (CallSite)(le.a(13430, 5138358479715057548L) * le.a(19596, 7882815273069233753L) - le.a(27896, 5539625096628561656L) - le.a(10706, 4920346974565344092L));
                    }
                    if (var3_3) ** GOTO lbl34
                }
                var5_4 /* !! */  = (CallSite)(le.a(12761, 419466527551863616L) / le.a(11204, 7839777181462045128L) + le.a(8206, 7261969103308302871L));
                if (var3_3) ** GOTO lbl34
            }
            var5_4 /* !! */  = (CallSite)((le.a(10778, 3853245952205430988L) * le.a(24230, 273603641561535574L) + le.a(24208, 7982765976008447148L) ^ le.a(2709, 7782415639649583281L)) * le.a(5061, 1531065191507368249L) + le.a(7642, 569026720137320232L));
            if (var3_3) ** GOTO lbl34
        }
        var5_4 /* !! */  = (CallSite)(le.a(20540, 8026132319365847567L) / le.a(6146, 4232661979066896997L) - le.a(10952, 7585594939597103473L) - le.a(7549, 8338885225735853838L));
        ** while (true)
        catch (Throwable v1) {
            var5_4 /* !! */  = (CallSite)(le.a(706, 3612954482672502991L) / 5 / le.a(6146, 4232661979066896997L) - le.a(10936, 2666899392181641395L));
            ** continue;
        }
    }

    private void A(Object object, Object object2, Object object3, float f, float f2, float f3, float f4, float f5, float f6, int n, float f7) {
        Object[] objectArray = new Object[6];
        objectArray[5] = Float.valueOf(f6);
        objectArray[4] = Float.valueOf(f5);
        objectArray[3] = Float.valueOf(f4);
        objectArray[2] = Float.valueOf(f3);
        objectArray[1] = Float.valueOf(f2);
        objectArray[0] = Float.valueOf(f);
        CallSite callSite = hi.a("\u00a5", (Object)this, (Object)objectArray, (long)954148112030122271L);
        hi.a("\u00a5", (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f, (float)f2, (float)f3, (int)n, (float)hi.a("\u00e9", (Object)callSite, (long)719578877512501895L), (float)hi.a("\u00e9", (Object)callSite, (long)641683247927396683L), (float)hi.a("\u00e9", (Object)callSite, (long)1031437550468343246L), (float)f7, (long)761281777649130913L);
        hi.a("\u00a5", (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f4, (float)f5, (float)f6, (int)n, (float)hi.a("\u00e9", (Object)callSite, (long)719578877512501895L), (float)hi.a("\u00e9", (Object)callSite, (long)641683247927396683L), (float)hi.a("\u00e9", (Object)callSite, (long)1031437550468343246L), (float)f7, (long)761281777649130913L);
    }

    public static /* bridge */ /* synthetic */ CallSite C(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public void q(Object[] objectArray) {
        AABB aABB = (AABB)objectArray[0];
        double d = (Double)objectArray[1];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)643102635663418197L), (Object)new dV(aABB, d), (long)615358212536192384L);
    }

    public void U(Object[] objectArray) {
        AABB aABB = (AABB)objectArray[0];
        int n = (Integer)objectArray[1];
        hi.a("\u00a5", (Object)this, (Object)aABB, (int)n, (float)2.0f, (long)739893072227345033L);
    }

    private void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        Object object4 = objectArray[3];
        Object object5 = objectArray[4];
        CallSite callSite = le.C("hDTOnGCKeBWWyu2a", qj(), (yN)((yN)object5));
        float f = (float)(hi.a("\u00e9", (Object)callSite, (long)1065600789354078750L) - hi.a("\u00e9", (Object)((Vec3)object4), (long)1300412705618690751L));
        float f2 = (float)(hi.a("\u00e9", (Object)callSite, (long)797530004147152713L) - hi.a("\u00e9", (Object)((Vec3)object4), (long)1294071886475894755L));
        float f3 = (float)(hi.a("\u00e9", (Object)callSite, (long)1242259651052261877L) - hi.a("\u00e9", (Object)((Vec3)object4), (long)1282612456329596420L));
        float f4 = (float)(hi.a("\u00e9", (Object)callSite, (long)430137657327008003L) - hi.a("\u00e9", (Object)((Vec3)object4), (long)1300412705618690751L));
        float f5 = (float)(hi.a("\u00e9", (Object)callSite, (long)1116111677700761539L) - hi.a("\u00e9", (Object)((Vec3)object4), (long)1294071886475894755L));
        float f6 = (float)(hi.a("\u00e9", (Object)callSite, (long)1166170983307000375L) - hi.a("\u00e9", (Object)((Vec3)object4), (long)1282612456329596420L));
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f, (float)f2, (float)f3, (float)f4, (float)f2, (float)f3, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)hi.a("\u00a5", (Object)((yN)object5), (long)1211973416081777019L), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f4, (float)f2, (float)f3, (float)f4, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)hi.a("\u00a5", (Object)((yN)object5), (long)1211973416081777019L), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f4, (float)f2, (float)f6, (float)f, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)le.C("hDTOnGCKeBWWyu2a", c1(), (yN)((yN)object5)), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f, (float)f2, (float)f6, (float)f, (float)f2, (float)f3, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)hi.a("\u00a5", (Object)((yN)object5), (long)1211973416081777019L), (long)774797598669371054L);
        le.C("hDTOnGCKeBWWyu2a", A(java.lang.Object java.lang.Object java.lang.Object float float float float float float int float ), (le)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f, (float)f5, (float)f3, (float)f4, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)le.C("hDTOnGCKeBWWyu2a", c1(), (yN)((yN)object5)));
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f4, (float)f5, (float)f3, (float)f4, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)le.C("hDTOnGCKeBWWyu2a", c1(), (yN)((yN)object5)), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f4, (float)f5, (float)f6, (float)f, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)le.C("hDTOnGCKeBWWyu2a", c1(), (yN)((yN)object5)), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f, (float)f5, (float)f6, (float)f, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)le.C("hDTOnGCKeBWWyu2a", c1(), (yN)((yN)object5)), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f, (float)f2, (float)f3, (float)f, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)hi.a("\u00a5", (Object)((yN)object5), (long)1211973416081777019L), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f4, (float)f2, (float)f3, (float)f4, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)le.C("hDTOnGCKeBWWyu2a", c1(), (yN)((yN)object5)), (long)774797598669371054L);
        hi.a("\u00a5", (Object)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f4, (float)f2, (float)f6, (float)f4, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)hi.a("\u00a5", (Object)((yN)object5), (long)1211973416081777019L), (long)774797598669371054L);
        le.C("hDTOnGCKeBWWyu2a", A(java.lang.Object java.lang.Object java.lang.Object float float float float float float int float ), (le)this, (Object)((lZ)object), (Object)((Matrix4f)object2), (Object)((PoseStack.Pose)object3), (float)f, (float)f2, (float)f6, (float)f, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((yN)object5), (long)1289033414569936257L), (float)le.C("hDTOnGCKeBWWyu2a", c1(), (yN)((yN)object5)));
    }

    private le() {
        this.S = new ArrayList<Dm>();
        this.P = new ArrayList<yN>();
        this.z = new ArrayList<vu>();
        this.v = new ArrayList<uX>();
        hi.a("\u00a5", (Object)hi.a("j", (long)519102950410566293L), (Object)this, (long)817797371366047544L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void m(Object[] var1_1) {
        block22: {
            var2_2 = Dl.S();
            var8_3 /* !! */  = (le.a(15533, 8912088479711540921L) ^ le.a(23530, 1857618106014814226L)) * le.a(2758, 4328983155403587960L) ^ le.a(13309, 3856652545041250653L);
            if (var2_2) break block22;
lbl5:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)942618989109981464L), (long)1256913436411747171L);
                if (!var2_2) ** GOTO lbl93
                if (v0 /* !! */  == false) ** GOTO lbl92
                ** GOTO lbl95
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00a5", (Object)var6_7, (long)984088978567310565L);
                if (!var2_2) ** GOTO lbl50
                if (v1 /* !! */  == false) ** GOTO lbl49
                ** GOTO lbl52
                break;
            }
lbl15:
            // 2 sources

            while (true) {
                var6_7 = le.C("hDTOnGCKeBWWyu2a", iterator(), (List)hi.a("\u00e9", (Object)this, (long)1128852959969727580L));
                if (var2_2) ** GOTO lbl105
lbl18:
                // 2 sources

                while (true) {
                    v2 /* !! */  = hi.a("\u00a5", (Object)var6_7, (long)984088978567310565L);
                    if (!var2_2) ** GOTO lbl108
                    if (v2 /* !! */  == false) ** GOTO lbl107
                    ** GOTO lbl110
                    break;
                }
                break;
            }
        }
        block18: while (true) {
            block23: {
                switch (var8_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 436740888: {
                        v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1128852959969727580L), (long)1256913436411747171L);
                        if (!var2_2) ** GOTO lbl98
                        if (v3 /* !! */  == false) ** GOTO lbl97
                        ** GOTO lbl100
                    }
                    case 436740890: {
                        var3_4 = hi.a("G", (Object)new Object[]{hi.a("j", (long)1284955393069310909L)}, (long)1061302820998618068L);
                        var4_5 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)824644249180421663L), (long)538452375068194790L), (long)1212178218618897878L), (long)635841009398561852L);
                        var5_6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)948190297084541702L), (long)617137790396262668L), (long)888968013430088728L);
                        var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)942618989109981464L), (long)1240653736693366367L);
                        if (var2_2) ** GOTO lbl47
                        ** GOTO lbl10
                    }
                    case 436740886: {
                        hi.a("G", (long)561066160558538168L);
                        hi.a("G", (long)562426116161301804L);
                        var8_3 /* !! */  = le.a(32279, 8785810555158525009L) - le.a(7606, 2224063426491160487L) ^ le.a(1721, 7194475668739820548L);
                        continue block18;
                    }
lbl47:
                    // 1 sources

                    var8_3 /* !! */  = le.a(18037, 5783269586688953589L) / le.a(11204, 7839777181462045128L) + le.a(23436, 6767857541333144023L) + le.a(12149, 4430977536770581655L) + le.a(8859, 8597751922603010195L);
                    if (var2_2) break block23;
lbl49:
                    // 2 sources

                    v1 /* !! */  = (CallSite)(le.a(4803, 3942638243751696389L) * le.a(11289, 6566427539863578202L) * le.a(7217, 4685722720518149697L) + le.a(13311, 3214870787850352960L));
lbl50:
                    // 2 sources

                    var8_3 /* !! */  = (int)v1 /* !! */ ;
                    if (var2_2) break block23;
lbl52:
                    // 2 sources

                    var8_3 /* !! */  = (le.a(8361, 2488176386321918579L) * le.a(27244, 3891434345123504142L) ^ le.a(5934, 2469629903950814560L) ^ le.a(32633, 1453830206149784894L)) - le.a(22793, 8363307452995982225L) ^ le.a(20074, 5943713751254844555L);
                    break block23;
                    case 436740887: 
                }
                return;
            }
            while (true) {
                block25: {
                    block24: {
                        switch (var8_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 1041761979: {
                                var7_8 /* !! */  = (vl)hi.a("\u00a5", (Object)var6_7, (long)470012372636416268L);
                                le.C("hDTOnGCKeBWWyu2a", P(java.lang.Object java.lang.Object java.lang.Object java.lang.Object ), (le)this, (Object)var3_4, (Object)var4_5, (Object)var5_6, (Object)var7_8 /* !! */ );
                                if (var2_2) break block24;
                                ** GOTO lbl15
                            }
                            case 1041761983: {
                                ** continue;
                            }
                            case 1041761982: {
                                ** continue;
                            }
                            case 1041761978: {
                                var7_8 /* !! */  = (Dm)hi.a("\u00a5", (Object)var6_7, (long)470012372636416268L);
                                v4 = new Object[4];
                                v4[3] = var7_8 /* !! */ ;
                                v4[2] = var5_6;
                                v4[1] = var4_5;
                                v4[0] = var3_4;
                                hi.a("\u00a5", (Object)this, (Object)v4, (long)1283046959967894570L);
                                if (var2_2) break block25;
                                ** GOTO lbl-1000
                            }
                            case 1041761980: lbl-1000:
                            // 2 sources

                            {
                                hi.a("\u00a5", (Object)var3_4, (long)506483793077719001L);
                                return;
                            }
                            case 1041761981: 
                        }
                        hi.a("G", (long)1072168011298293672L);
                        hi.a("G", (float)0.0f, (long)551872630485081828L);
                        var8_3 /* !! */  = (le.a(23572, 3075530305240356813L) ^ le.a(21504, 5279095532948840389L)) + le.a(1705, 3564075773094923590L) ^ le.a(31960, 6858220930342745719L);
                        if (var2_2) continue;
lbl92:
                        // 2 sources

                        v0 /* !! */  = (CallSite)((le.a(7287, 8774610616692447109L) * le.a(31815, 8654701435392226985L) ^ le.a(13874, 3451405420220825068L)) - le.a(31002, 1863012167376335691L) + le.a(25609, 1966098403766464072L));
lbl93:
                        // 2 sources

                        var8_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) continue block18;
lbl95:
                        // 2 sources

                        var8_3 /* !! */  = (le.a(23989, 5209663757929306079L) + le.a(21180, 5166555335029741776L)) * le.a(20759, 1542820643484785454L) - le.a(17304, 5829659824359033132L);
                        if (var2_2) continue block18;
lbl97:
                        // 2 sources

                        v3 /* !! */  = (CallSite)((le.a(31891, 5336658259487979057L) * le.a(18067, 4362601355427695997L) ^ le.a(31680, 5214327240330473966L)) - le.a(18080, 8052241092695968977L) + le.a(8040, 2009658774124107064L));
lbl98:
                        // 2 sources

                        var8_3 /* !! */  = (int)v3 /* !! */ ;
                        if (var2_2) continue block18;
lbl100:
                        // 2 sources

                        var8_3 /* !! */  = (le.a(23563, 837831484891977670L) ^ le.a(744, 5359977106703812638L)) - le.a(30698, 5108300111944646095L);
                        continue block18;
                    }
                    var8_3 /* !! */  = le.a(11257, 8113708988816335207L) / le.a(11204, 7839777181462045128L) + le.a(3512, 2707608840907064832L) + le.a(18855, 5873311540280050527L) + le.a(21490, 809476863099296048L);
                    if (var2_2) continue;
lbl105:
                    // 2 sources

                    var8_3 /* !! */  = (le.a(24934, 3847893384946838330L) + le.a(8813, 6353684137080301808L) - le.a(5047, 5211469194388838858L) ^ le.a(485, 4621998007077047178L)) + le.a(10607, 7824934219051934605L);
                    if (var2_2) continue;
lbl107:
                    // 2 sources

                    v2 /* !! */  = (CallSite)((le.a(15479, 6120948635511338726L) ^ le.a(25220, 4929763938043750539L)) / le.a(11204, 7839777181462045128L) / le.a(9415, 2531890330603859503L) + le.a(13443, 6911290986464165430L) - le.a(14303, 7196992735400442908L));
lbl108:
                    // 2 sources

                    var8_3 /* !! */  = (int)v2 /* !! */ ;
                    if (var2_2) continue;
lbl110:
                    // 2 sources

                    var8_3 /* !! */  = le.a(17708, 6396496659503828697L) / le.a(11204, 7839777181462045128L) - le.a(29992, 7988878286245887877L) ^ le.a(17404, 4529420621336725808L);
                    continue;
                }
                var8_3 /* !! */  = (le.a(5004, 3446208169586104392L) + le.a(7786, 5872151967676109870L) - le.a(9694, 5675269354193661825L) ^ le.a(2457, 4233884756859290410L)) + le.a(14450, 1976783669568713613L);
            }
            break;
        }
    }

    public void f(AABB aABB, Color color) {
        Object[] objectArray = new Object[2];
        objectArray[1] = (int)hi.a("\u00a5", (Object)color, (long)921162811333111485L);
        objectArray[0] = aABB;
        hi.a("\u00a5", (Object)this, (Object)objectArray, (long)958889182774599962L);
    }

    public void h(AABB aABB, Color color) {
        Object[] objectArray = new Object[2];
        objectArray[1] = (int)hi.a("\u00a5", (Object)color, (long)921162811333111485L);
        objectArray[0] = aABB;
        hi.a("\u00a5", (Object)this, (Object)objectArray, (long)913259398591958532L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void N(Object[] var1_1) {
        block32: {
            block33: {
                var2_2 = var1_1[0];
                var5_3 = var1_1[1];
                var4_4 = var1_1[2];
                var3_5 = var1_1[3];
                var6_6 = Dl.t();
                var14_7 /* !! */  = (le.a(7494, 6636938021019129661L) + le.a(20625, 8060861905772665496L)) / 3 - le.a(7107, 1309380346296275420L);
                if (!var6_6) break block33;
lbl9:
                // 2 sources

                while (true) {
                    var7_8 = hi.a("\u00a5", (Object)((Dm)var3_5), (long)1019580093477299498L);
                    var8_9 = (float)(hi.a("\u00e9", (Object)var7_8, (long)1065600789354078750L) - hi.a("\u00e9", (Object)((Vec3)var4_4), (long)1300412705618690751L));
                    var9_10 = (float)(hi.a("\u00e9", (Object)var7_8, (long)797530004147152713L) - hi.a("\u00e9", (Object)((Vec3)var4_4), (long)1294071886475894755L));
                    var10_11 = (float)(hi.a("\u00e9", (Object)var7_8, (long)1242259651052261877L) - hi.a("\u00e9", (Object)((Vec3)var4_4), (long)1282612456329596420L));
                    var11_12 = (float)(hi.a("\u00e9", (Object)var7_8, (long)430137657327008003L) - hi.a("\u00e9", (Object)((Vec3)var4_4), (long)1300412705618690751L));
                    var12_13 = (float)(hi.a("\u00e9", (Object)var7_8, (long)1116111677700761539L) - hi.a("\u00e9", (Object)((Vec3)var4_4), (long)1294071886475894755L));
                    var13_14 = (float)(hi.a("\u00e9", (Object)var7_8, (long)1166170983307000375L) - hi.a("\u00e9", (Object)((Vec3)var4_4), (long)1282612456329596420L));
                    v0 /* !! */  = hi.a("j", (long)1279865724138908935L)[hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((Dm)var3_5), (long)1115087885286786867L), (long)1317840160279033201L)];
                    if (!var6_6) {
                        switch (v0 /* !! */ ) {
                            case 1: {
                                var14_7 /* !! */  = (le.a(17109, 6613510536185464902L) ^ le.a(13774, 8781117837615382281L)) - le.a(14599, 487579503482811180L);
                                if (!var6_6) break block32;
                            }
                            case 2: {
                                var14_7 /* !! */  = le.a(25429, 8374543565259499975L) - le.a(31378, 2563006871619596537L) - le.a(13442, 2159115002296024765L);
                                if (!var6_6) break block32;
                            }
                            case 3: {
                                var14_7 /* !! */  = (le.a(426, 7808730157979339734L) + le.a(23076, 2339868930858438698L) ^ le.a(18243, 8787017048803953946L)) - le.a(26470, 744381113975598542L) + le.a(2869, 1318349269331181907L) - le.a(2631, 4012261185233289374L);
                                if (!var6_6) break block32;
                            }
                            case 4: {
                                var14_7 /* !! */  = hi.a("G", (int)le.a(22455, 4888232043342421117L), (int)le.a(1964, 3718667361664764993L), (long)834203424483934088L) ^ le.a(9882, 8516096328787274847L) ^ le.a(11936, 9080529612224865426L);
                                if (!var6_6) break block32;
                            }
                            case 5: {
                                var14_7 /* !! */  = (le.a(20523, 8734486729416628900L) + le.a(27291, 4957716068908523651L) + le.a(28319, 2160104710117155866L)) * le.a(20638, 1093356376666987383L) + le.a(5450, 1214301964917317280L);
                                if (!var6_6) break block32;
                            }
                            case 6: {
                                var14_7 /* !! */  = hi.a("G", (int)((hi.a("G", (int)le.a(9911, 6330728168235183473L), (int)le.a(29791, 4358304997684641495L), (long)834203424483934088L) - le.a(26138, 5903118965940776422L)) * le.a(17621, 3727490506621439586L)), (int)le.a(21230, 5496163963842746550L), (long)834203424483934088L) ^ le.a(17757, 5787033154609860521L);
                                if (!var6_6) ** break;
                                break;
                            }
                        }
                        v0 /* !! */  = (CallSite)((le.a(7501, 7340116049418688466L) ^ le.a(4458, 7554841999733300208L)) + le.a(6098, 2559631066028612999L) + le.a(6376, 7846642716612465303L) - le.a(18907, 3203843202789131232L));
                    }
                    var14_7 /* !! */  = (int)v0 /* !! */ ;
                    if (!var6_6) break block32;
                    ** GOTO lbl87
                    break;
                }
lbl43:
                // 2 sources

                while (true) {
                    hi.a("\u00a5", (Object)this, (Object)((g0)var2_2), (Object)((Matrix4f)var5_3), (float)var8_9, (float)var9_10, (float)var10_11, (int)le.C("hDTOnGCKeBWWyu2a", h(), (Dm)((Dm)var3_5)), (float)var8_9, (float)var12_13, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var12_13, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var9_10, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (long)765790389442590668L);
                    if (!var6_6) ** GOTO lbl89
lbl46:
                    // 2 sources

                    while (true) {
                        le.C("hDTOnGCKeBWWyu2a", U(java.lang.Object java.lang.Object float float float int float float float int float float float int float float float int ), (le)this, (Object)((g0)var2_2), (Object)((Matrix4f)var5_3), (float)var11_12, (float)var9_10, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var12_13, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var12_13, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var9_10, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L));
                        if (!var6_6) ** GOTO lbl91
lbl49:
                        // 2 sources

                        while (true) {
                            hi.a("\u00a5", (Object)this, (Object)((g0)var2_2), (Object)((Matrix4f)var5_3), (float)var8_9, (float)var9_10, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var9_10, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var12_13, (float)var13_14, (int)le.C("hDTOnGCKeBWWyu2a", h(), (Dm)((Dm)var3_5)), (float)var8_9, (float)var12_13, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (long)765790389442590668L);
                            if (!var6_6) ** GOTO lbl93
lbl52:
                            // 2 sources

                            while (true) {
                                hi.a("\u00a5", (Object)this, (Object)((g0)var2_2), (Object)((Matrix4f)var5_3), (float)var8_9, (float)var9_10, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var8_9, (float)var9_10, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var8_9, (float)var12_13, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var8_9, (float)var12_13, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (long)765790389442590668L);
                                if (!var6_6) ** GOTO lbl95
lbl55:
                                // 2 sources

                                while (true) {
                                    hi.a("\u00a5", (Object)this, (Object)((g0)var2_2), (Object)((Matrix4f)var5_3), (float)var8_9, (float)var12_13, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var8_9, (float)var12_13, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var12_13, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var12_13, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (long)765790389442590668L);
                                    if (var6_6) {
                                        return;
                                    }
                                    ** GOTO lbl97
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            while (true) {
                switch (var14_7 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -651266075: 
                }
                hi.a("G", (long)545824520147797887L);
                var14_7 /* !! */  = (int)(hi.a("G", (int)(le.a(21707, 3126290059806662426L) - le.a(25808, 2796830538338627103L)), (int)le.a(30457, 1428096803501473099L), (long)834203424483934088L) - le.a(11721, 8279685079655294789L) - le.a(15350, 670936527236477260L));
            }
        }
        block27: while (true) {
            switch (var14_7 /* !! */ ) {
                default: {
                    hi.a("\u00a5", (Object)this, (Object)((g0)var2_2), (Object)((Matrix4f)var5_3), (float)var8_9, (float)var9_10, (float)var10_11, (int)le.C("hDTOnGCKeBWWyu2a", h(), (Dm)((Dm)var3_5)), (float)var11_12, (float)var9_10, (float)var10_11, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var11_12, (float)var9_10, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (float)var8_9, (float)var9_10, (float)var13_14, (int)hi.a("\u00a5", (Object)((Dm)var3_5), (long)549644838546732429L), (long)765790389442590668L);
                    if (!var6_6) ** GOTO lbl87
                    ** GOTO lbl43
                }
                case 681780152: {
                    ** continue;
                }
                case 681780157: {
                    ** continue;
                }
                case 681780158: {
                    ** continue;
                }
                case 681780155: {
                    ** continue;
                }
                case 681780156: {
                    ** continue;
                }
lbl87:
                // 2 sources

                var14_7 /* !! */  = (le.a(16189, 3424971748553471415L) ^ le.a(13094, 8462206000324753797L)) + le.a(20805, 1413729858379406178L) + le.a(24740, 8472457877063854930L) - le.a(2735, 5133240447717966005L);
                if (!var6_6) continue block27;
lbl89:
                // 2 sources

                var14_7 /* !! */  = (le.a(16189, 3424971748553471415L) ^ le.a(13094, 8462206000324753797L)) + le.a(20805, 1413729858379406178L) + le.a(24740, 8472457877063854930L) - le.a(2735, 5133240447717966005L);
                if (!var6_6) continue block27;
lbl91:
                // 2 sources

                var14_7 /* !! */  = (le.a(16189, 3424971748553471415L) ^ le.a(13094, 8462206000324753797L)) + le.a(20805, 1413729858379406178L) + le.a(24740, 8472457877063854930L) - le.a(2735, 5133240447717966005L);
                if (!var6_6) continue block27;
lbl93:
                // 2 sources

                var14_7 /* !! */  = (le.a(16189, 3424971748553471415L) ^ le.a(13094, 8462206000324753797L)) + le.a(20805, 1413729858379406178L) + le.a(24740, 8472457877063854930L) - le.a(2735, 5133240447717966005L);
                if (!var6_6) continue block27;
lbl95:
                // 2 sources

                var14_7 /* !! */  = (le.a(16189, 3424971748553471415L) ^ le.a(13094, 8462206000324753797L)) + le.a(20805, 1413729858379406178L) + le.a(24740, 8472457877063854930L) - le.a(2735, 5133240447717966005L);
                if (!var6_6) continue block27;
lbl97:
                // 2 sources

                var14_7 /* !! */  = (le.a(16189, 3424971748553471415L) ^ le.a(13094, 8462206000324753797L)) + le.a(20805, 1413729858379406178L) + le.a(24740, 8472457877063854930L) - le.a(2735, 5133240447717966005L);
                continue block27;
                case 681780154: {
                    return;
                }
                case 681780153: 
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void C(Object[] var1_1) {
        block33: {
            block32: {
                var5_2 = var1_1[0];
                var6_3 = var1_1[1];
                var2_4 = var1_1[2];
                var4_5 = var1_1[3];
                var3_6 = var1_1[4];
                var7_7 = Dl.t();
                var15_8 /* !! */  = le.a(5736, 7867694652594789609L) / 5 / le.a(8146, 7887488814300697630L) + le.a(21690, 851497675240595149L) ^ le.a(933, 7581431506379901341L);
                if (!var7_7) {
                    v0 /* !! */  = var15_8 /* !! */ ;
                    if (!var7_7) {
                        switch (v0 /* !! */ ) {
                            default: {
                                break;
                            }
                            case 448984871: {
                                hi.a("G", (long)818835474660401656L);
                                v0 /* !! */  = (int)hi.a("G", (long)938841799815187197L);
                            }
                        }
                    }
                }
                var8_9 = hi.a("\u00a5", (Object)((vu)var3_6), (long)387451716005544971L);
                var9_10 = (float)(hi.a("\u00e9", (Object)var8_9, (long)1065600789354078750L) - hi.a("\u00e9", (Object)((Vec3)var4_5), (long)1300412705618690751L));
                var10_11 = (float)(hi.a("\u00e9", (Object)var8_9, (long)797530004147152713L) - hi.a("\u00e9", (Object)((Vec3)var4_5), (long)1294071886475894755L));
                var11_12 = (float)(hi.a("\u00e9", (Object)var8_9, (long)1242259651052261877L) - hi.a("\u00e9", (Object)((Vec3)var4_5), (long)1282612456329596420L));
                var12_13 = (float)(hi.a("\u00e9", (Object)var8_9, (long)430137657327008003L) - hi.a("\u00e9", (Object)((Vec3)var4_5), (long)1300412705618690751L));
                var13_14 = (float)(hi.a("\u00e9", (Object)var8_9, (long)1116111677700761539L) - hi.a("\u00e9", (Object)((Vec3)var4_5), (long)1294071886475894755L));
                var14_15 = (float)(hi.a("\u00e9", (Object)var8_9, (long)1166170983307000375L) - hi.a("\u00e9", (Object)((Vec3)var4_5), (long)1282612456329596420L));
                v1 /* !! */  = hi.a("j", (long)1279865724138908935L)[hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((vu)var3_6), (long)383334896490993410L), (long)1317840160279033201L)];
                if (var7_7) break block32;
                switch (v1 /* !! */ ) {
                    case 1: {
                        var15_8 /* !! */  = le.a(258, 5198613499838925718L) * le.a(15894, 8728805660292330551L) / le.a(10411, 5605345723883266716L) ^ le.a(30487, 2468075194030849313L);
                        if (!var7_7) break block33;
                    }
                    case 2: {
                        var15_8 /* !! */  = le.a(9734, 1230821988355517612L) - le.a(7488, 3751233376698603191L) ^ le.a(4621, 549176177939191877L);
                        if (!var7_7) break block33;
                    }
                    case 3: {
                        var15_8 /* !! */  = (int)(hi.a("G", (int)(le.a(6520, 3481017353609056920L) * le.a(814, 3549177612401641714L) + le.a(9318, 246689972660285123L)), (int)le.a(28083, 9206264693042046479L), (long)834203424483934088L) - le.a(1544, 5152960323760950326L) - le.a(29905, 3693753019738291733L));
                        if (!var7_7) break block33;
                    }
                    case 4: {
                        var15_8 /* !! */  = (int)(le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)(le.a(8728, 2844318549406460051L) ^ le.a(21050, 4888159651044678141L)), (int)le.a(22322, 7324090000350436764L)) + le.a(13304, 8450486702351071501L));
                        if (!var7_7) break block33;
                    }
                    case 5: {
                        var15_8 /* !! */  = le.a(24155, 1328858336552605107L) - le.a(27200, 318725351155163521L) ^ le.a(12950, 2702006370934045040L);
                        if (!var7_7) break block33;
                    }
                    case 6: {
                        var15_8 /* !! */  = hi.a("G", (int)((hi.a("G", (int)le.a(7308, 3686526762958296761L), (int)le.a(22495, 5882292427514338701L), (long)834203424483934088L) - le.a(7202, 610950155271149222L)) * le.a(28243, 900342276517323830L)), (int)le.a(26898, 1901180498388443999L), (long)834203424483934088L) ^ le.a(23882, 3515022507408119630L);
                        if (!var7_7) ** break;
                        break;
                    }
                    {
                    }
                }
                v1 /* !! */  = (CallSite)(le.a(25556, 4803816970739968442L) * le.a(22024, 5744174231762689247L) * le.a(10469, 1019175154581643838L) ^ le.a(29422, 8122997323000510751L));
            }
            var15_8 /* !! */  = (int)v1 /* !! */ ;
            if (!var7_7) break block33;
            ** GOTO lbl112
lbl55:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var11_12, (float)var12_13, (float)var10_11, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var11_12, (float)var12_13, (float)var10_11, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var14_15, (float)var9_10, (float)var10_11, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var14_15, (float)var9_10, (float)var10_11, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                if (!var7_7) ** GOTO lbl114
lbl61:
                // 2 sources

                while (true) {
                    hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var11_12, (float)var12_13, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                    hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var14_15, (float)var12_13, (float)var13_14, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                    hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var13_14, (float)var14_15, (float)var12_13, (float)var13_14, (float)var11_12, (int)le.C("hDTOnGCKeBWWyu2a", hn(), (vu)((vu)var3_6)), (float)le.C("hDTOnGCKeBWWyu2a", iK(), (vu)((vu)var3_6)), (long)774797598669371054L);
                    le.C("hDTOnGCKeBWWyu2a", A(java.lang.Object java.lang.Object java.lang.Object float float float float float float int float ), (le)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var14_15, (float)var12_13, (float)var10_11, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L));
                    if (!var7_7) ** GOTO lbl116
lbl67:
                    // 2 sources

                    while (true) {
                        hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var11_12, (float)var9_10, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)le.C("hDTOnGCKeBWWyu2a", iK(), (vu)((vu)var3_6)), (long)774797598669371054L);
                        le.C("hDTOnGCKeBWWyu2a", A(java.lang.Object java.lang.Object java.lang.Object float float float float float float int float ), (le)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var14_15, (float)var9_10, (float)var13_14, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L));
                        hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var13_14, (float)var14_15, (float)var9_10, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                        hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var14_15, (float)var9_10, (float)var10_11, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)le.C("hDTOnGCKeBWWyu2a", iK(), (vu)((vu)var3_6)), (long)774797598669371054L);
                        if (!var7_7) ** GOTO lbl118
lbl73:
                        // 2 sources

                        while (true) {
                            hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var11_12, (float)var12_13, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                            hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var11_12, (float)var9_10, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                            hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var11_12, (float)var9_10, (float)var10_11, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                            hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var13_14, (float)var11_12, (float)var9_10, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                            if (!var7_7) ** GOTO lbl120
lbl79:
                            // 2 sources

                            while (true) {
                                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var14_15, (float)var9_10, (float)var13_14, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var10_11, (float)var14_15, (float)var12_13, (float)var13_14, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var10_11, (float)var14_15, (float)var12_13, (float)var10_11, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                                hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var13_14, (float)var14_15, (float)var12_13, (float)var13_14, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                                if (var7_7) {
                                    return;
                                }
                                ** GOTO lbl122
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
        block25: while (true) {
            switch (var15_8 /* !! */ ) {
                default: {
                    hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var13_14, (float)var11_12, (float)var12_13, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                    hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var13_14, (float)var11_12, (float)var12_13, (float)var13_14, (float)var14_15, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                    hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var12_13, (float)var13_14, (float)var14_15, (float)var9_10, (float)var13_14, (float)var14_15, (int)le.C("hDTOnGCKeBWWyu2a", hn(), (vu)((vu)var3_6)), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                    hi.a("\u00a5", (Object)this, (Object)((lZ)var5_2), (Object)((Matrix4f)var6_3), (Object)((PoseStack.Pose)var2_4), (float)var9_10, (float)var13_14, (float)var14_15, (float)var9_10, (float)var13_14, (float)var11_12, (int)hi.a("\u00a5", (Object)((vu)var3_6), (long)659417652375980640L), (float)hi.a("\u00a5", (Object)((vu)var3_6), (long)1228639306797936657L), (long)774797598669371054L);
                    if (!var7_7) ** GOTO lbl112
                    ** GOTO lbl55
                }
                case 260975471: {
                    ** continue;
                }
                case 260975472: {
                    ** continue;
                }
                case 260975476: {
                    ** continue;
                }
                case 260975475: {
                    ** continue;
                }
                case 260975474: {
                    ** continue;
                }
                case 260975477: {
                    hi.a("G", (long)447560916480552025L);
                    hi.a("G", (double)100.0, (float)0.0f, (boolean)false, (boolean)false, (boolean)true, (boolean)false, (boolean)true, (boolean)false, (boolean)true, (boolean)false, (int)-1, (long)1218704056816907128L);
                    return;
                }
lbl112:
                // 2 sources

                var15_8 /* !! */  = le.a(15911, 3844682056744383637L) * le.a(31890, 47116901307741821L) * le.a(5073, 3251424473920575787L) ^ le.a(24274, 317438826640200821L);
                if (!var7_7) continue block25;
lbl114:
                // 2 sources

                var15_8 /* !! */  = le.a(15911, 3844682056744383637L) * le.a(31890, 47116901307741821L) * le.a(5073, 3251424473920575787L) ^ le.a(24274, 317438826640200821L);
                if (!var7_7) continue block25;
lbl116:
                // 2 sources

                var15_8 /* !! */  = le.a(15911, 3844682056744383637L) * le.a(31890, 47116901307741821L) * le.a(5073, 3251424473920575787L) ^ le.a(24274, 317438826640200821L);
                if (!var7_7) continue block25;
lbl118:
                // 2 sources

                var15_8 /* !! */  = le.a(15911, 3844682056744383637L) * le.a(31890, 47116901307741821L) * le.a(5073, 3251424473920575787L) ^ le.a(24274, 317438826640200821L);
                if (!var7_7) continue block25;
lbl120:
                // 2 sources

                var15_8 /* !! */  = le.a(15911, 3844682056744383637L) * le.a(31890, 47116901307741821L) * le.a(5073, 3251424473920575787L) ^ le.a(24274, 317438826640200821L);
                if (!var7_7) continue block25;
lbl122:
                // 2 sources

                var15_8 /* !! */  = le.a(15911, 3844682056744383637L) * le.a(31890, 47116901307741821L) * le.a(5073, 3251424473920575787L) ^ le.a(24274, 317438826640200821L);
                continue block25;
                case 260975473: 
            }
            break;
        }
    }

    public void i(Object[] objectArray) {
        AABB aABB = (AABB)objectArray[0];
        int n = (Integer)objectArray[1];
        Direction direction = (Direction)objectArray[2];
        le.C("hDTOnGCKeBWWyu2a", add(E ), (List)((Object)hi.a("\u00e9", (Object)this, (long)1128852959969727580L)), (Object)new Dm(aABB, n, direction));
    }

    public void r(Object[] objectArray) {
        AABB aABB = (AABB)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)942618989109981464L), (Object)new vl(aABB, n, n2), (long)615358212536192384L);
    }

    public void y(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        AABB aABB = (AABB)objectArray[1];
        int n = (Integer)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        Direction direction = (Direction)objectArray[4];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)752873413965097316L), (Object)new vu(aABB, n, f, direction), (long)615358212536192384L);
    }

    private void P(Object object, Object object2, Object object3, Object object4) {
        CallSite callSite = hi.a("\u00a5", (Object)((vl)object4), (long)577617322902307406L);
        float f = (float)(hi.a("\u00e9", (Object)callSite, (long)1065600789354078750L) - hi.a("\u00e9", (Object)((Vec3)object3), (long)1300412705618690751L));
        float f2 = (float)(hi.a("\u00e9", (Object)callSite, (long)797530004147152713L) - hi.a("\u00e9", (Object)((Vec3)object3), (long)1294071886475894755L));
        float f3 = (float)(hi.a("\u00e9", (Object)callSite, (long)1242259651052261877L) - hi.a("\u00e9", (Object)((Vec3)object3), (long)1282612456329596420L));
        float f4 = (float)(hi.a("\u00e9", (Object)callSite, (long)430137657327008003L) - hi.a("\u00e9", (Object)((Vec3)object3), (long)1300412705618690751L));
        float f5 = (float)(hi.a("\u00e9", (Object)callSite, (long)1116111677700761539L) - hi.a("\u00e9", (Object)((Vec3)object3), (long)1294071886475894755L));
        float f6 = (float)(hi.a("\u00e9", (Object)callSite, (long)1166170983307000375L) - hi.a("\u00e9", (Object)((Vec3)object3), (long)1282612456329596420L));
        hi.a("\u00a5", (Object)this, (Object)((g0)object), (Object)((Matrix4f)object2), (float)f, (float)f2, (float)f3, (int)le.C("hDTOnGCKeBWWyu2a", Jf(), (vl)((vl)object4)), (float)f, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (float)f4, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (float)f4, (float)f2, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (long)765790389442590668L);
        hi.a("\u00a5", (Object)this, (Object)((g0)object), (Object)((Matrix4f)object2), (float)f, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f4, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f4, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (long)765790389442590668L);
        hi.a("\u00a5", (Object)this, (Object)((g0)object), (Object)((Matrix4f)object2), (float)f, (float)f2, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (float)f4, (float)f2, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (float)f4, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (long)765790389442590668L);
        hi.a("\u00a5", (Object)this, (Object)((g0)object), (Object)((Matrix4f)object2), (float)f4, (float)f2, (float)f3, (int)le.C("hDTOnGCKeBWWyu2a", Jf(), (vl)((vl)object4)), (float)f4, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (float)f4, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f4, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (long)765790389442590668L);
        hi.a("\u00a5", (Object)this, (Object)((g0)object), (Object)((Matrix4f)object2), (float)f, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (float)f, (float)f5, (float)f6, (int)le.C("hDTOnGCKeBWWyu2a", Jq(), (vl)((vl)object4)), (float)f4, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f4, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (long)765790389442590668L);
        hi.a("\u00a5", (Object)this, (Object)((g0)object), (Object)((Matrix4f)object2), (float)f, (float)f2, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (float)f, (float)f5, (float)f3, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f, (float)f5, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)1332418001511770747L), (float)f, (float)f2, (float)f6, (int)hi.a("\u00a5", (Object)((vl)object4), (long)724061344564297377L), (long)765790389442590668L);
    }

    private void U(Object object, Object object2, float f, float f2, float f3, int n, float f4, float f5, float f6, int n2, float f7, float f8, float f9, int n3, float f10, float f11, float f12, int n4) {
        hi.a("\u00a5", (Object)((g0)object), (Object)((Matrix4f)object2), (float)f, (float)f2, (float)f3, (int)n, (long)1261724584529547875L);
        hi.a("\u00a5", (Object)((g0)object), (Object)((Matrix4f)object2), (float)f4, (float)f5, (float)f6, (int)n2, (long)1261724584529547875L);
        le.C("hDTOnGCKeBWWyu2a", N(org.joml.Matrix4f float float float int ), (g0)((g0)object), (Matrix4f)((Matrix4f)object2), (float)f7, (float)f8, (float)f9, (int)n3);
        hi.a("\u00a5", (Object)((g0)object), (Object)((Matrix4f)object2), (float)f10, (float)f11, (float)f12, (int)n4, (long)1261724584529547875L);
    }

    public void h(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)643102635663418197L), (long)400728262949485023L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)942618989109981464L), (long)400728262949485023L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1128852959969727580L), (long)400728262949485023L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1157359868643818978L), (long)400728262949485023L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)752873413965097316L), (long)400728262949485023L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)411584793121298751L), (long)400728262949485023L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void E(Object[] var1_1) {
        block20: {
            var2_2 = Dl.S();
            var5_3 /* !! */  = le.a(17611, 8053833505768197822L) / le.a(6146, 4232661979066896997L) + le.a(14128, 679124812788120890L);
            if (var2_2) ** GOTO lbl15
            block10: while (true) {
                block23: {
                    block22: {
                        block21: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)643102635663418197L), (long)1256913436411747171L);
                            if (!var2_2) break block21;
                            if (v0 /* !! */  != false) break block22;
                            v0 /* !! */  = (CallSite)(hi.a("G", (int)le.a(7062, 5868574477208162796L), (int)le.a(21283, 8104713571534657957L), (long)834203424483934088L) ^ le.a(17231, 50458739487984066L));
                        }
                        var5_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) break block23;
                    }
                    var5_3 /* !! */  = (le.a(19276, 5881659742038409484L) ^ le.a(30184, 1558921073941020527L)) + le.a(29626, 8826640710819445002L);
                }
                switch (var5_3 /* !! */ ) {
                    default: {
                        continue block10;
                    }
                    case -1557643350: {
                        return;
                    }
                    case -1557643348: {
                        var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)643102635663418197L), (long)1240653736693366367L);
                        if (var2_2) break block10;
                        break block20;
                    }
                    case -1557643349: {
                        throw null;
                    }
                }
                break;
            }
            var5_3 /* !! */  = (int)(le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)(le.a(10214, 960410218848562194L) / le.a(9171, 9167763302074656785L)), (int)le.a(9297, 8651348609830759963L)) - le.a(21529, 1002913849133686369L));
            if (var2_2) ** GOTO lbl42
            ** GOTO lbl36
        }
        block11: while (true) {
            block26: {
                block25: {
                    block24: {
                        v1 = le.C("hDTOnGCKeBWWyu2a", hasNext(), (Iterator)var3_4);
                        if (!var2_2) break block24;
                        if (v1 != false) break block25;
lbl36:
                        // 2 sources

                        v1 = le.C("hDTOnGCKeBWWyu2a", max(int int ), (int)((le.a(22569, 6664436756158927538L) ^ le.a(16962, 1323265056206440849L)) + le.a(13458, 1675245113546227493L)), (int)le.a(3320, 2775100154076661458L)) + le.a(21999, 8497047344796491593L) - le.a(24352, 8902107193669178590L);
                    }
                    var5_3 /* !! */  = (int)v1;
                    if (var2_2) break block26;
                }
                var5_3 /* !! */  = le.a(9787, 1252468750310747266L) * le.a(10781, 3079982437004419146L) * le.a(8290, 6648188494258711212L) / le.a(13725, 7313961349200068419L) - le.a(6020, 569414334954937842L);
            }
            block12: while (true) {
                switch (var5_3 /* !! */ ) {
                    default: {
                        continue block11;
                    }
                    case -755912116: {
                        var4_5 = (dV)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                        v2 = new Object[2];
                        v2[1] = (double)hi.a("\u00a5", (Object)var4_5, (long)961353825386695829L);
                        v2[0] = hi.a("\u00a5", (Object)var4_5, (long)1090566502612677223L);
                        hi.a("\u00a5", (Object)hi.a("j", (long)889421552268440488L), (Object)v2, (long)754209677337150904L);
                        if (!var2_2) {
                            return;
                        }
                        var5_3 /* !! */  = (int)(hi.a("G", (int)(le.a(21048, 6090245246439053701L) / le.a(11204, 7839777181462045128L)), (int)le.a(10086, 2062325472814345613L), (long)834203424483934088L) - le.a(20808, 3950526679440448373L));
                        continue block12;
                    }
                    case -755912117: {
                        return;
                    }
                    case -755912115: 
                }
                break;
            }
            break;
        }
    }

    @yE(P=-999)
    private void o(d9 d92) {
        hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)d92, (long)1109062203649823396L)}, (long)587236062362157272L);
    }

    public void c(AABB aABB, Color color, float f) {
        le.C("hDTOnGCKeBWWyu2a", q(net.minecraft.world.phys.AABB int float ), (le)this, (AABB)aABB, (int)hi.a("\u00a5", (Object)color, (long)921162811333111485L), (float)f);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xAF5;
        if (b[n2] == null) {
            le.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
