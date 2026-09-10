/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Oa;
import com.github.epsilon.Xg;
import com.github.epsilon.gv;
import com.github.epsilon.hi;
import com.github.epsilon.nF;
import com.github.epsilon.vm;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lw
implements Oa {
    private static final double j = 1.25;
    private static final List<vm> D;
    private static final double i = 1.0E-4;
    private static final double Y = 0.1;
    private static final double S = 0.18;
    private static final long[] a;
    private static final Integer[] b;

    private double b(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        return (double)hi.a("G", (double)hi.a("\u00a5", (Object)((BlockPos)object), (Object)((BlockPos)object2), (long)947855549302539755L), (long)1236096628704034685L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private gv C(Object[] var1_1) {
        block35: {
            block34: {
                block33: {
                    block38: {
                        block37: {
                            block36: {
                                var3_2 = var1_1[0];
                                var2_3 = var1_1[1];
                                var4_4 = Dl.t();
                                var10_5 /* !! */  = lw.a(27170, 4481272817005914421L) * lw.a(8619, 2215464093986922663L) - lw.a(8676, 1361912305578844969L) + lw.a(26610, 8469799795292792339L);
                                if (var4_4) ** GOTO lbl-1000
                                v0 /* !! */  = var10_5 /* !! */ ;
                                if (var4_4) break block36;
                                switch (v0 /* !! */ ) {
                                    default: lbl-1000:
                                    // 2 sources

                                    {
                                        var5_6 = hi.a("\u00a5", (Object)((LocalPlayer)var3_2), (long)1045344535518524325L);
                                        var6_7 = new ArrayList<E>();
                                        hi.a("\u00a5", var6_7, (Object)var5_6, (long)490119386715296288L);
                                        var7_8 = 1;
                                        if (!var4_4) break block37;
                                        break block38;
                                    }
                                    case 1740269727: {
                                        v0 /* !! */  = (int)lw.x("YSDqrC2rPe0ttaMD", O());
                                    }
                                }
                            }
                            hi.a("G", (long)1139342403621005073L);
                            return null;
                        }
                        var10_5 /* !! */  = (lw.a(3006, 405755929548818607L) - lw.a(2421, 8674726050481866771L) ^ lw.a(7746, 3462038849540693863L)) - lw.a(5779, 4704791755013789079L);
                        if (!var4_4) break block33;
                        ** GOTO lbl34
                    }
lbl29:
                    // 2 sources

                    while (true) {
                        block40: {
                            block39: {
                                v1 /* !! */  = var7_8;
                                v2 /* !! */  = hi.a("\u00a5", (Object)((List)var2_3), (long)417939159730395915L);
                                if (var4_4) break block39;
                                if (v1 /* !! */  < v2 /* !! */ ) break block40;
lbl34:
                                // 2 sources

                                v1 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)lw.a(14197, 2317396678065665045L), (int)lw.a(22037, 2570764209515943861L), (long)834203424483934088L) - lw.a(13980, 8452365359154444125L)), (int)lw.a(4742, 1888798927202324894L), (long)834203424483934088L) - lw.a(2606, 2970658449178167509L));
                                v2 /* !! */  = (CallSite)lw.a(32079, 4330527580656991820L);
                            }
                            var10_5 /* !! */  = v1 /* !! */  - v2 /* !! */ ;
                            if (!var4_4) break block33;
                        }
                        var10_5 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(lw.a(30579, 6637466002286442459L) - lw.a(28397, 8948818660298813431L)), (int)lw.a(29996, 1261094027490620576L), (long)834203424483934088L), (int)lw.a(2585, 2541744578123172267L), (long)834203424483934088L) - lw.a(31100, 4009627348634826782L));
                        if (!var4_4) break block33;
                        ** GOTO lbl109
                        break;
                    }
lbl43:
                    // 2 sources

                    while (true) {
                        block41: {
                            var7_9 = new ArrayList<E>();
                            hi.a("\u00a5", var7_9, (Object)var5_6, (long)490119386715296288L);
                            var8_10 /* !! */  = 0;
                            if (var4_4) break block41;
                            var10_5 /* !! */  = lw.a(9879, 3388435525655340966L) - lw.a(6074, 4181094507030189772L) - lw.a(24959, 6127670516659970586L) - lw.a(9721, 1274215494851536816L);
                            if (!var4_4) break block34;
                            ** GOTO lbl58
                        }
lbl53:
                        // 2 sources

                        while (true) {
                            block43: {
                                block42: {
                                    v3 = var8_10 /* !! */ ;
                                    v4 /* !! */  = hi.a("\u00a5", var6_7, (long)677347835611134938L) - true;
                                    if (var4_4) break block42;
                                    if (v3 < v4 /* !! */ ) break block43;
lbl58:
                                    // 2 sources

                                    v3 = lw.a(24314, 5210908838126771592L) / 5 - lw.a(23402, 3463273114183916160L);
                                    v4 /* !! */  = (reference)lw.a(28770, 808394046847349625L);
                                }
                                var10_5 /* !! */  = v3 ^ v4 /* !! */ ;
                                if (!var4_4) break block34;
                            }
                            var10_5 /* !! */  = lw.a(6760, 8668991696501053536L) - lw.a(9102, 5814347420671844428L) + lw.a(12773, 2632802355990540953L) - lw.a(3401, 6265390745804607323L) - lw.a(12271, 6040682109944933671L);
                            break block34;
                            break;
                        }
                        break;
                    }
lbl66:
                    // 2 sources

                    while (true) {
                        block44: {
                            var9_11 = hi.a("\u00a5", var6_7, (long)677347835611134938L) - true;
                            if (var4_4) break block44;
                            var10_5 /* !! */  = hi.a("G", (int)lw.a(29348, 5917701469678727377L), (int)lw.a(16922, 3418104462338802044L), (long)834203424483934088L) * lw.a(30822, 3147882942159255971L) - lw.a(25733, 3648432514370954573L) ^ lw.a(32572, 655704152807538019L);
                            if (!var4_4) break block35;
                            ** GOTO lbl78
                        }
lbl73:
                        // 2 sources

                        while (true) {
                            block46: {
                                block45: {
                                    v5 = var9_11;
                                    v6 = var8_10 /* !! */ ;
                                    if (var4_4) break block45;
                                    if (v5 > v6) break block46;
lbl78:
                                    // 2 sources

                                    v5 = hi.a("G", (int)(lw.a(12562, 8459948728058261644L) + lw.a(28301, 6133424653508996450L) - lw.a(9627, 3252811689891047350L)), (int)lw.a(8355, 6482435334137553811L), (long)834203424483934088L);
                                    v6 = lw.a(13007, 1204304746827427872L);
                                }
                                var10_5 /* !! */  = (int)(v5 + v6);
                                if (!var4_4) break block35;
                            }
                            var10_5 /* !! */  = lw.a(17144, 1978391510435348760L) / lw.a(26106, 8553126588945852412L) + lw.a(8648, 8604825687287210775L);
                            if (!var4_4) break block35;
                            ** GOTO lbl158
                            break;
                        }
                        break;
                    }
lbl87:
                    // 2 sources

                    while (true) {
                        v7 = var9_11;
                        v8 = var8_10 /* !! */ ;
                        if (var4_4) ** GOTO lbl170
                        if (v7 != v8) ** GOTO lbl168
                        ** GOTO lbl172
                        break;
                    }
                }
                while (true) {
                    switch (var10_5 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -721039493: {
                            hi.a("\u00a5", var6_7, (Object)hi.a("G", (Object)((Vec3i)lw.x("YSDqrC2rPe0ttaMD", get(int ), (List)((List)var2_3), (int)var7_8)), (long)414024409078792884L), (long)490119386715296288L);
                            ++var7_8;
                            if (!var4_4) break;
                            ** GOTO lbl43
                        }
                        case -721039491: {
                            ** continue;
                        }
                        case -721039494: {
                            throw null;
                        }
                    }
lbl109:
                    // 2 sources

                    var10_5 /* !! */  = (lw.a(29152, 5142502541976564246L) - lw.a(17971, 3391633848276599886L) ^ lw.a(2987, 2835198441771895417L)) - lw.a(20149, 6983737756042907515L);
                }
            }
lbl112:
            // 2 sources

            while (true) {
                switch (var10_5 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -2039900356: {
                        hi.a("G", (long)723518858017143060L);
                        hi.a("G", (long)782721573726732509L);
                        ** GOTO lbl66
                    }
                    case -2039900358: {
                        ** continue;
                    }
                    case -2039900357: 
                }
                return new gv((Vec3)lw.x("YSDqrC2rPe0ttaMD", get(int ), var7_9, (int)1), (List<Vec3>)hi.a("G", var7_9, (long)497368790579535219L));
            }
        }
        block29: do lbl-1000:
        // 6 sources

        {
            block49: {
                block48: {
                    block47: {
                        switch (var10_5 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -1348344408: {
                                v9 = new Object[4];
                                v9[3] = (int)var9_11;
                                v9[2] = var8_10 /* !! */ ;
                                v9[1] = var6_7;
                                v9[0] = (LocalPlayer)var3_2;
                                v10 = hi.a("\u00a5", (Object)this, (Object)v9, (long)834143270698031422L);
                                if (var4_4) break block47;
                                if (v10 != false) break;
                                break block48;
                            }
                            case -1348344413: {
                                --var9_11;
                                if (!var4_4) break block49;
                                ** GOTO lbl87
                            }
                            case -1348344409: {
                                ** continue;
                            }
                            case -1348344412: {
                                return new gv((Vec3)var5_6, (List<Vec3>)hi.a("G", (Object)var5_6, (long)1279617981366714423L));
                            }
                            case -1348344410: {
                                hi.a("\u00a5", var7_9, (Object)((Vec3)hi.a("\u00a5", var6_7, (int)var9_11, (long)1125656849262323078L)), (long)490119386715296288L);
                                var8_10 /* !! */  = (int)var9_11;
                                if (!var4_4) break block29;
                                return new gv((Vec3)lw.x("YSDqrC2rPe0ttaMD", get(int ), var7_9, (int)1), (List<Vec3>)hi.a("G", var7_9, (long)497368790579535219L));
                            }
                            case -1348344414: {
                                throw null;
                            }
                        }
lbl158:
                        // 2 sources

                        v10 = hi.a("G", (int)(lw.a(9402, 726319290388161854L) + lw.a(1353, 259601791660000467L) - lw.a(30167, 8359934234708113297L)), (int)lw.a(23077, 4872816849945516998L), (long)834203424483934088L) + lw.a(25651, 2144782785111189446L);
                    }
                    var10_5 /* !! */  = (int)v10;
                    if (!var4_4) ** GOTO lbl-1000
                }
                var10_5 /* !! */  = (lw.a(18984, 8502853917229009117L) + lw.a(22214, 1378006419081320443L)) * lw.a(19949, 80275861396475095L) * lw.a(31154, 7929888142163736765L) + lw.a(19566, 2124406907065159536L);
                if (!var4_4) ** GOTO lbl-1000
            }
            var10_5 /* !! */  = hi.a("G", (int)lw.a(11187, 157106986582092261L), (int)lw.a(24783, 6586654008656487141L), (long)834203424483934088L) * lw.a(28005, 1056538443057262514L) - lw.a(31938, 301012653486833124L) ^ lw.a(3149, 6921914274514407101L);
            if (!var4_4) ** GOTO lbl-1000
lbl168:
            // 2 sources

            v7 = hi.a("G", (int)lw.a(8016, 3189620344464383070L), (int)lw.a(24297, 8980611617207704933L), (long)834203424483934088L);
            v8 = lw.a(28274, 7363331286789746441L);
lbl170:
            // 2 sources

            var10_5 /* !! */  = (int)(v7 - v8);
            if (!var4_4) ** GOTO lbl-1000
lbl172:
            // 2 sources

            var10_5 /* !! */  = lw.a(23240, 4152644477452245116L) * lw.a(28950, 872453193360044786L) + lw.a(26403, 2835163698401928593L) - lw.a(29469, 449313086807077622L) - lw.a(28651, 2630434354717257233L) ^ lw.a(15363, 2379426209917779592L);
        } while (!var4_4);
        var10_5 /* !! */  = lw.a(861, 7735189918616322400L) - lw.a(16179, 5253429128637758650L) - lw.a(32566, 3900421399834820097L) - lw.a(1584, 2017222731928732833L);
        ** while (true)
    }

    private AABB s(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        double d = (double)hi.a("\u00a5", (Object)((LocalPlayer)object), (long)1251528115868264059L) * 0.5 + 0.18;
        return new AABB((double)(hi.a("\u00e9", (Object)((Vec3)object2), (long)1300412705618690751L) - d), (double)(hi.a("\u00e9", (Object)((Vec3)object2), (long)1294071886475894755L) - 0.1), (double)(hi.a("\u00e9", (Object)((Vec3)object2), (long)1282612456329596420L) - d), (double)(hi.a("\u00e9", (Object)((Vec3)object2), (long)1300412705618690751L) + d), (double)(hi.a("\u00e9", (Object)((Vec3)object2), (long)1294071886475894755L) + (double)hi.a("\u00a5", (Object)((LocalPlayer)object), (long)1216025027674619993L) + 0.1), (double)(hi.a("\u00e9", (Object)((Vec3)object2), (long)1282612456329596420L) + d));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public gv w(Object[] var1_1) {
        block30: {
            block33: {
                block32: {
                    block31: {
                        var2_2 = (LocalPlayer)var1_1[0];
                        var3_3 = (LivingEntity)var1_1[1];
                        var4_4 = (Vec3)var1_1[2];
                        var5_5 = (Xg)var1_1[3];
                        var6_6 = Dl.t();
                        var13_7 /* !! */  = hi.a("G", (int)(lw.a(14100, 6073674416621893083L) / 2 ^ lw.a(25206, 4558142949463384844L)), (int)lw.a(13501, 5570961694706382228L), (long)834203424483934088L) * lw.a(14601, 2944179952335895083L) ^ lw.a(4315, 3059735919495483992L);
                        if (var6_6) ** GOTO lbl-1000
                        switch (var13_7 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                v0 = new Object[3];
                                v0[2] = (int)hi.a("\u00a5", (Object)var5_5, (long)1178344719380785578L);
                                v0[1] = var4_4;
                                v0[0] = hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L);
                                var7_8 = hi.a("\u00a5", (Object)this, (Object)v0, (long)1004494092915634536L);
                                v1 /* !! */  = hi.a("\u00a5", (Object)this, (Object)var2_2, (Object)lw.x("YSDqrC2rPe0ttaMD", position(), (LocalPlayer)var2_2), (Object)var7_8, (long)392477843002473627L);
                                if (var6_6) break block31;
                                if (v1 /* !! */  == false) break;
                                break block32;
                            }
                            case 1434743154: {
                                throw null;
                            }
                        }
                        v1 /* !! */  = (CallSite)(lw.a(26163, 6661051418063922308L) * lw.a(6138, 6357877529091839681L) - lw.a(17026, 1072334326792537055L));
                    }
                    var13_7 /* !! */  = (int)v1 /* !! */ ;
                    if (!var6_6) break block33;
                }
                var13_7 /* !! */  = (int)(hi.a("G", (int)lw.a(15713, 5429318323851706178L), (int)lw.a(29307, 1838394351627268426L), (long)834203424483934088L) - lw.a(22352, 5229405665601279509L) - lw.a(11382, 799961306795519813L) - lw.a(5252, 3424661058095977822L));
                if (!var6_6) break block33;
                ** GOTO lbl94
lbl31:
                // 2 sources

                while (true) {
                    block38: {
                        block37: {
                            block36: {
                                block35: {
                                    block34: {
                                        v2 = new Object[3];
                                        v2[2] = (int)hi.a("\u00a5", (Object)var5_5, (long)1178344719380785578L);
                                        v2[1] = var7_8;
                                        v2[0] = var2_2;
                                        var9_10 = hi.a("\u00a5", (Object)this, (Object)v2, (long)395347821077152239L);
                                        if (var6_6) break block34;
                                        if (var9_10 != null) break block35;
                                        var13_7 /* !! */  = lw.a(2493, 2513219020329257542L) * lw.a(24665, 3453012267745239872L) ^ lw.a(12839, 7665100957316755829L);
                                    }
                                    if (!var6_6) break block36;
                                }
                                var13_7 /* !! */  = lw.a(20541, 9196477320976880399L) * lw.a(16964, 2561630433651770276L) ^ lw.a(14377, 3245644073186540178L) ^ lw.a(5517, 6727515910432691842L);
                            }
                            switch (var13_7 /* !! */ ) {
                                default: {
                                    return new gv((Vec3)var9_10, (List<Vec3>)hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (Object)var9_10, (Object)var7_8, (long)1020205439673982949L));
                                }
                                case -78553349: {
                                    var10_11 = hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (long)980631921738979478L);
                                    var11_12 = hi.a("G", (Object)var7_8, (long)980631921738979478L);
                                    v3 = new Object[4];
                                    v3[3] = var5_5;
                                    v3[2] = var11_12;
                                    v3[1] = var10_11;
                                    v3[0] = var2_2;
                                    var12_13 = hi.a("\u00a5", (Object)this, (Object)v3, (long)981785865620161155L);
                                    v4 /* !! */  = hi.a("\u00a5", (Object)var12_13, (long)417939159730395915L);
                                    v5 = 1;
                                    if (var6_6) break block37;
                                    if (v4 /* !! */  <= v5) break;
                                    break block38;
                                }
                                case -78553351: {
                                    throw null;
                                }
                            }
                            v4 /* !! */  = (CallSite)(lw.a(14769, 3885282275439360696L) / lw.a(11702, 9669320567401719L));
                            v5 = lw.a(12582, 856011517812781841L);
                        }
                        var13_7 /* !! */  = v4 /* !! */  ^ v5;
                        if (!var6_6) break block30;
                    }
                    var13_7 /* !! */  = lw.a(7602, 2873131808849108212L) / lw.a(7689, 5046555858816081831L) / lw.a(6986, 7378427741402504160L) + lw.a(32026, 3121140897982480383L);
                    if (!var6_6) break block30;
                    ** GOTO lbl137
                    break;
                }
            }
            block24: while (true) {
                switch (var13_7 /* !! */ ) {
                    default: {
                        cfr_temp_0 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (Object)var4_4, (long)1256728004038227497L) - hi.a("\u00a5", (Object)var5_5, (long)1258234416289321987L);
                        v6 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (var6_6) ** GOTO lbl95
                        if (v6 /* !! */  > 0) ** GOTO lbl94
                        ** GOTO lbl97
                    }
                    case 1298720474: {
                        var8_9 = lw.x("YSDqrC2rPe0ttaMD", l(java.lang.Object java.lang.Object ), (lw)this, (Object)var2_2, (Object)var7_8);
                        if (var6_6) ** GOTO lbl100
                        if (var8_9 == null) ** GOTO lbl99
                        ** GOTO lbl101
                    }
                    case 1298720470: {
                        hi.a("G", (long)427998708925187485L);
                        hi.a("G", (long)561066160558538168L);
                        return new gv((Vec3)var7_8, (List<Vec3>)hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (Object)var7_8, (long)836702404835957224L));
                    }
lbl94:
                    // 2 sources

                    v6 /* !! */  = (reference)((lw.a(16229, 3137376021774253313L) ^ lw.a(19543, 5557698184335445759L)) + lw.a(1528, 879972449954564079L));
lbl95:
                    // 2 sources

                    var13_7 /* !! */  = (int)v6 /* !! */ ;
                    if (!var6_6) continue block24;
lbl97:
                    // 2 sources

                    var13_7 /* !! */  = (lw.a(24728, 5305814088378606022L) ^ lw.a(2001, 4832445900802720816L)) * lw.a(2660, 8350607839570529041L) ^ lw.a(18232, 4988289816493769974L) ^ lw.a(25058, 4960058706397651900L);
                    continue block24;
lbl99:
                    // 1 sources

                    var13_7 /* !! */  = lw.a(3806, 8328495454522543259L) * lw.a(1534, 8090969378515813466L) ^ lw.a(25553, 2493975651683459291L);
lbl100:
                    // 2 sources

                    if (!var6_6) ** GOTO lbl102
lbl101:
                    // 2 sources

                    var13_7 /* !! */  = (int)((hi.a("G", (int)(lw.a(279, 5406993224464302160L) * lw.a(13928, 4237017946709145005L)), (int)lw.a(5453, 3341805961252410440L), (long)834203424483934088L) - lw.a(18155, 7347964959139710445L)) * lw.a(10605, 4112868297826511449L) - lw.a(30274, 2378700136346514591L));
lbl102:
                    // 2 sources

                    v7 /* !! */  = var13_7 /* !! */ ;
                    if (var6_6) ** GOTO lbl112
                    switch (v7 /* !! */ ) {
                        default: {
                            return new gv((Vec3)var8_9, (List<Vec3>)hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (Object)var8_9, (long)836702404835957224L));
                        }
                        case 1155862670: {
                            ** GOTO lbl31
                        }
                        case 1155862669: 
                    }
                    v7 /* !! */  = (int)hi.a("G", (long)1018118041190145658L);
lbl112:
                    // 2 sources

                    lw.x("YSDqrC2rPe0ttaMD", d());
                    ** continue;
                    case 1298720472: {
                        return new gv((Vec3)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (List<Vec3>)hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (long)1279617981366714423L));
                    }
                    case 1298720473: 
                }
                break;
            }
            return new gv((Vec3)var7_8, (List<Vec3>)hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (Object)var7_8, (long)836702404835957224L));
        }
        block25: while (true) {
            switch (var13_7 /* !! */ ) {
                default: {
                    v8 = new Object[2];
                    v8[1] = var12_13;
                    v8[0] = var2_2;
                    return hi.a("\u00a5", (Object)this, (Object)v8, (long)663836982246124228L);
                }
                case -1121306316: {
                    v9 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", size(), (List)var12_13);
                    v10 = 1;
                    if (var6_6) ** GOTO lbl139
                    if (v9 /* !! */  != v10) ** GOTO lbl137
                    ** GOTO lbl141
                }
                case -1121306317: {
                    hi.a("G", (long)1097773666732108654L);
                    return null;
                }
lbl137:
                // 2 sources

                v9 /* !! */  = (CallSite)((lw.a(9012, 934304547260441215L) + lw.a(29532, 1763941304067289208L)) * lw.a(22469, 3232163822825460748L) - lw.a(30271, 5766705579354715985L));
                v10 = lw.a(13952, 7858533377270559793L);
lbl139:
                // 2 sources

                var13_7 /* !! */  = (int)(v9 /* !! */  + v10);
                if (!var6_6) continue block25;
lbl141:
                // 2 sources

                var13_7 /* !! */  = lw.a(20434, 965768112742223104L) + lw.a(567, 5690220351813288210L) ^ lw.a(6601, 3098541425277737813L);
                continue block25;
                case -1121306318: {
                    return new gv((Vec3)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (List<Vec3>)hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (long)1279617981366714423L));
                }
                case -1121306315: 
            }
            break;
        }
        return new gv((Vec3)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (List<Vec3>)hi.a("G", (Object)hi.a("\u00a5", (Object)var2_2, (long)1045344535518524325L), (long)1279617981366714423L));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean y(Object[] var1_1) {
        block17: {
            block15: {
                block16: {
                    block14: {
                        block12: {
                            block13: {
                                var2_2 = (LocalPlayer)var1_1[0];
                                var3_3 = (BlockPos)var1_1[1];
                                var4_4 = Dl.t();
                                var5_5 /* !! */  = (lw.a(3000, 2524382167516874782L) / lw.a(13036, 6967947083190415632L) - lw.a(12904, 451743969830089624L) ^ lw.a(2033, 4011627290699237107L)) + lw.a(16423, 9054857383334560688L);
                                if (var4_4) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var2_2, (long)827913124966560621L), (Object)var3_3, (long)488130391410755029L);
                                        if (var4_4) break block12;
                                        if (v0 /* !! */  == false) break block13;
                                        break block14;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var2_2, (long)827913124966560621L), (Object)var3_3, (long)864608062160339421L);
                                        if (var4_4) break block15;
                                        if (v1 /* !! */  != false) break block16;
                                        break block17;
                                        break;
                                    }
lbl17:
                                    // 1 sources

                                    return false;
lbl19:
                                    // 1 sources

                                    while (true) {
                                        v2 = new Object[2];
                                        v2[1] = hi.a("G", (Object)var3_3, (long)414024409078792884L);
                                        v2[0] = var2_2;
                                        return (boolean)hi.a("\u00a5", (Object)this, (Object)v2, (long)1259202755906798647L);
                                    }
                                }
lbl24:
                                // 6 sources

                                while (true) {
                                    switch (var5_5 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case -1967328309: {
                                            ** continue;
                                        }
                                        case -1967328311: {
                                            ** continue;
                                        }
                                        case -1967328310: {
                                            ** continue;
                                        }
                                        case -1967328312: 
                                    }
                                    return (boolean)hi.a("G", (long)487000789894408457L);
                                }
                            }
                            v0 /* !! */  = (CallSite)((lw.a(10075, 5224905436470781464L) ^ lw.a(24866, 8131999293726122235L)) - lw.a(7198, 5189983463911104119L) ^ lw.a(28438, 4130903807770979861L));
                        }
                        var5_5 /* !! */  = (int)v0 /* !! */ ;
                        if (!var4_4) ** GOTO lbl24
                    }
                    var5_5 /* !! */  = lw.a(6359, 195346860039084899L) * lw.a(21444, 5665220482516570557L) - lw.a(29416, 2840506291355021617L);
                    if (!var4_4) ** GOTO lbl24
                }
                v1 /* !! */  = (CallSite)(hi.a("G", (int)(lw.a(26506, 9110515745680287350L) * lw.a(27013, 5025874734141827621L)), (int)lw.a(17216, 1570012048353935993L), (long)834203424483934088L) ^ lw.a(22213, 6385557776691582346L));
            }
            var5_5 /* !! */  = (int)v1 /* !! */ ;
            if (!var4_4) ** GOTO lbl24
        }
        var5_5 /* !! */  = (lw.a(12735, 5762559213580562623L) ^ lw.a(32386, 2001781316402675246L)) - lw.a(25417, 5375226643680649835L) ^ lw.a(28097, 233805876020112614L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private List M(Object[] var1_1) {
        block12: {
            var2_2 = var1_1[0];
            var3_3 = var1_1[1];
            var4_4 = Dl.t();
            var7_5 /* !! */  = lw.a(11098, 5671632383596537868L) * lw.a(19238, 3768341156878240371L) + lw.a(23385, 7113242761316784405L) + lw.a(6729, 7790594563157531565L);
            if (var4_4) ** GOTO lbl-1000
            switch (var7_5 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var5_6 = new ArrayList<E>();
                    var6_7 = (BlockPos)var3_3;
                    hi.a("\u00a5", var5_6, (Object)var6_7, (long)490119386715296288L);
                    if (!var4_4) break;
                    break block12;
                }
                case 1793738452: {
                    throw null;
                }
            }
            var7_5 /* !! */  = lw.a(27553, 7607860600891304168L) / lw.a(7689, 5046555858816081831L) ^ lw.a(1692, 6750036301411779752L);
            if (!var4_4) ** GOTO lbl37
            ** GOTO lbl30
        }
        block8: while (true) {
            hi.a("G", (long)589253768936098215L);
            block9: while (true) {
                block15: {
                    block14: {
                        block13: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)((Map)var2_2), (Object)var6_7, (long)768493130217600408L);
                            if (var4_4) break block13;
                            if (v0 /* !! */  != false) break block14;
lbl30:
                            // 2 sources

                            v0 /* !! */  = (CallSite)((lw.a(17053, 7805059123150701513L) + lw.a(19404, 8445784755870812445L) ^ lw.a(16711, 7446908332510921369L)) + lw.a(32275, 1472262981545393628L) - lw.a(3436, 9133438524572110833L) ^ lw.a(20694, 1687363263649567192L));
                        }
                        var7_5 /* !! */  = (int)v0 /* !! */ ;
                        if (!var4_4) break block15;
                    }
                    var7_5 /* !! */  = (int)(hi.a("G", (int)(lw.a(29256, 8499817029388431596L) / lw.a(2203, 112762608658287175L)), (int)lw.a(17349, 779955054779056132L), (long)834203424483934088L) - lw.a(4039, 4024730097653550524L) - lw.a(10329, 5277714063722719930L));
                    if (var4_4) ** GOTO lbl54
                }
                while (true) {
                    block16: {
                        switch (var7_5 /* !! */ ) {
                            case 831552673: {
                                continue block8;
                            }
                            default: {
                                continue block9;
                            }
                            case 831552675: {
                                var6_7 = (BlockPos)hi.a("\u00a5", (Object)((Map)var2_2), (Object)var6_7, (long)717569244418368117L);
                                hi.a("\u00a5", var5_6, (Object)var6_7, (long)490119386715296288L);
                                if (var4_4) {
                                    break;
                                }
                                break block16;
                            }
                            case 831552674: 
                        }
                        hi.a("G", var5_6, (long)473196647699225745L);
                        return var5_6;
                    }
                    var7_5 /* !! */  = lw.a(27971, 4176562099041430751L) / lw.a(7689, 5046555858816081831L) ^ lw.a(21633, 6740836116311168793L);
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Vec3 s(Object[] var1_1) {
        block61: {
            block60: {
                block58: {
                    block59: {
                        block69: {
                            block57: {
                                block56: {
                                    block62: {
                                        var2_2 = var1_1[0];
                                        var4_3 = var1_1[1];
                                        var3_4 = (Integer)var1_1[2];
                                        var5_5 = Dl.t();
                                        var21_6 /* !! */  = lw.a(20060, 1975911048411303891L) / 5 - lw.a(21946, 8884233307549587151L) + lw.a(13057, 1917149327636738054L) - lw.a(3885, 4168655147951000904L);
                                        if (!var5_5) break block62;
lbl8:
                                        // 2 sources

                                        while (true) {
                                            v0 = var2_2;
                                            while (true) {
                                                block66: {
                                                    block65: {
                                                        block64: {
                                                            block63: {
                                                                var6_7 = hi.a("\u00a5", (Object)((LocalPlayer)v0), (long)1045344535518524325L);
                                                                var7_8 = hi.a("\u00a5", (Object)((Vec3)var4_3), (Object)var6_7, (long)1082050008038634828L);
                                                                var8_9 = new Vec3((double)hi.a("\u00e9", (Object)var7_8, (long)1300412705618690751L), 0.0, (double)hi.a("\u00e9", (Object)var7_8, (long)1282612456329596420L));
                                                                var9_10 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var7_8, (long)1049603101739605009L), (double)-1.25, (long)1080829230854482551L);
                                                                cfr_temp_0 = hi.a("\u00a5", (Object)var8_9, (long)431225985925845942L) - 1.0E-6;
                                                                v1 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                if (var5_5) break block63;
                                                                if (v1 /* !! */  < 0) break block64;
                                                                v1 /* !! */  = (reference)((lw.a(11036, 4475053796031146649L) - lw.a(3643, 4432996184100473969L)) / lw.a(30097, 3929466860276152147L) - lw.a(19243, 3133809840076769318L));
                                                            }
                                                            var21_6 /* !! */  = (int)v1 /* !! */ ;
                                                            if (!var5_5) break block65;
                                                        }
                                                        var21_6 /* !! */  = (lw.a(14669, 3303974682863974422L) ^ lw.a(16870, 3799150935622959172L)) / lw.a(20975, 7117210263112274626L) + lw.a(6706, 1064785202566600936L) ^ lw.a(16846, 646716157152772928L);
                                                    }
                                                    switch (var21_6 /* !! */ ) {
                                                        default: {
                                                            v2 /* !! */  = new Vec3(1.0, 0.0, 0.0);
                                                            var21_6 /* !! */  = ((lw.a(30276, 8399503919979558144L) - lw.a(3293, 3335621180308196900L)) * lw.a(19126, 7539116681937898357L) + lw.a(7929, 3709828050080931828L)) * lw.a(26711, 4496634157066349472L) - lw.a(9456, 94666145331389805L);
                                                            if (var5_5) {
                                                                break;
                                                            }
                                                            break block66;
                                                        }
                                                        case -1284512526: {
                                                            v2 /* !! */  = hi.a("\u00a5", (Object)new Vec3((double)(-hi.a("\u00e9", (Object)var8_9, (long)1282612456329596420L)), 0.0, (double)hi.a("\u00e9", (Object)var8_9, (long)1300412705618690751L)), (long)1049603101739605009L);
                                                            if (!var5_5) break;
                                                            ** GOTO lbl-1000
                                                        }
                                                        case -1284512525: {
                                                            return null;
                                                        }
                                                    }
                                                    var21_6 /* !! */  = ((lw.a(8807, 2612683643956240556L) - lw.a(32221, 3307393426936889277L)) * lw.a(10976, 5098523838256982937L) + lw.a(26456, 7800047748181517443L)) * lw.a(31643, 4654026765661108636L) - lw.a(5123, 766128889489036877L);
                                                }
                                                switch (var21_6 /* !! */ ) {
                                                    default: lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var10_11 /* !! */  = v2 /* !! */ ;
                                                        var11_12 = hi.a("G", (Object)new Vec3(0.0, -1.0, 0.0), (Object)new Vec3(0.0, 1.0, 0.0), (Object)var10_11 /* !! */ , (Object)hi.a("\u00a5", (Object)var10_11 /* !! */ , (double)-1.0, (long)1080829230854482551L), (long)406152283510049266L);
                                                        var12_13 = null;
                                                        var13_14 /* !! */  = 1.7976931348623157E308;
                                                        var15_15 = hi.a("\u00a5", (Object)var11_12, (long)1240653736693366367L);
                                                        var21_6 /* !! */  = (lw.a(29829, 6695752837424740143L) + lw.a(25542, 2534202070876840241L) + lw.a(28112, 3968406859913948950L) ^ lw.a(8837, 4005677618993995781L)) - lw.a(28691, 2018311609974878854L) + lw.a(5892, 2272018807458633450L);
                                                        break block56;
                                                    }
                                                    case -796846154: {
                                                        lw.x("YSDqrC2rPe0ttaMD", values());
                                                        return null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
lbl54:
                                        // 2 sources

                                        while (true) {
                                            v3 /* !! */  = var17_17;
                                            v4 = var3_4;
                                            if (var5_5) ** GOTO lbl164
                                            if (v3 /* !! */  > v4) ** GOTO lbl162
                                            ** GOTO lbl166
                                            break;
                                        }
lbl60:
                                        // 2 sources

                                        while (true) {
                                            block68: {
                                                block67: {
                                                    var18_18 = lw.x("YSDqrC2rPe0ttaMD", add(net.minecraft.world.phys.Vec3 ), (Vec3)hi.a("\u00a5", (Object)var6_7, (Object)var9_10, (long)701637995304699260L), (Vec3)hi.a("\u00a5", (Object)var16_16, (double)var17_17, (long)1080829230854482551L));
                                                    v5 = new Object[2];
                                                    v5[1] = var18_18;
                                                    v5[0] = (LocalPlayer)var2_2;
                                                    v6 /* !! */  = hi.a("\u00a5", (Object)this, (Object)v5, (long)1259202755906798647L);
                                                    if (var5_5) break block67;
                                                    if (v6 /* !! */  == false) break block68;
                                                    v6 /* !! */  = (CallSite)((lw.a(24624, 1875146738352939544L) ^ lw.a(20457, 5148171812026404274L)) / lw.a(20975, 7117210263112274626L) + lw.a(32677, 5502466947586522602L) - lw.a(19451, 7764280792730355972L));
                                                }
                                                var21_6 /* !! */  = (int)v6 /* !! */ ;
                                                if (!var5_5) break block57;
                                            }
                                            var21_6 /* !! */  = (hi.a("G", (int)lw.a(20239, 5044036253602696654L), (int)lw.a(14273, 8585756001140421699L), (long)834203424483934088L) * lw.a(2337, 2821822795703945982L) + lw.a(19312, 2521604157365111020L) ^ lw.a(31114, 2920173274564754330L)) - lw.a(16537, 7025188664662278897L);
                                            if (!var5_5) break block57;
                                            ** GOTO lbl207
                                            break;
                                        }
lbl76:
                                        // 2 sources

                                        while (true) {
                                            v7 = new Object[2];
                                            v7[1] = var18_18;
                                            v7[0] = (LocalPlayer)var2_2;
                                            v8 /* !! */  = hi.a("\u00a5", (Object)this, (Object)v7, (long)368951674786617411L);
                                            if (var5_5) ** GOTO lbl210
                                            if (v8 /* !! */  != false) ** GOTO lbl209
                                            ** GOTO lbl212
                                            break;
                                        }
lbl84:
                                        // 2 sources

                                        while (var5_5) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                v9 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", M(java.lang.Object java.lang.Object java.lang.Object ), (lw)this, (Object)((LocalPlayer)var2_2), (Object)var18_18, (Object)((Vec3)var4_3));
                                                if (var5_5) break block58;
                                                if (v9 /* !! */  != false) break block59;
                                                break block60;
                                                break;
                                            }
                                        }
                                        break block69;
lbl91:
                                        // 2 sources

                                        while (true) {
                                            block73: {
                                                block72: {
                                                    block71: {
                                                        block70: {
                                                            var19_19 = lw.x("YSDqrC2rPe0ttaMD", distanceTo(net.minecraft.world.phys.Vec3 ), (Vec3)var6_7, (Vec3)var18_18) + hi.a("\u00a5", (Object)var18_18, (Object)((Vec3)var4_3), (long)1256728004038227497L);
                                                            v10 = var19_19 == var13_14 /* !! */  ? 0 : (var19_19 < var13_14 /* !! */  ? -1 : 1);
                                                            if (var5_5) break block70;
                                                            if (v10 < 0) break block71;
                                                            v10 = hi.a("G", (int)(lw.a(26197, 1857040149455299896L) / lw.a(30097, 3929466860276152147L) / 4), (int)lw.a(28618, 8210642642847100649L), (long)834203424483934088L) - lw.a(13440, 5660704824632424236L) + lw.a(18810, 6217411012673882293L);
                                                        }
                                                        var21_6 /* !! */  = (int)v10;
                                                        if (!var5_5) ** GOTO lbl167
                                                    }
                                                    var21_6 /* !! */  = (lw.a(20956, 2785456090107597781L) ^ lw.a(4805, 428087188736283458L)) - lw.a(12041, 3823374889861623363L);
                                                    if (var5_5) break block72;
                                                    switch (var21_6 /* !! */ ) {
                                                        default: {
                                                            var12_13 = var18_18;
                                                            var13_14 /* !! */  = (double)var19_19;
                                                            if (!var5_5) break;
                                                            break block73;
                                                        }
                                                        case 937718313: {
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                var21_6 /* !! */  = (int)(hi.a("G", (int)(lw.a(26197, 1857040149455299896L) / lw.a(30097, 3929466860276152147L) / 4), (int)lw.a(28618, 8210642642847100649L), (long)834203424483934088L) - lw.a(13440, 5660704824632424236L) + lw.a(18810, 6217411012673882293L));
                                                if (!var5_5) ** GOTO lbl167
                                                ** GOTO lbl120
                                            }
lbl117:
                                            // 2 sources

                                            while (true) {
                                                block74: {
                                                    var17_17 += 2;
                                                    if (var5_5) break block74;
lbl120:
                                                    // 2 sources

                                                    var21_6 /* !! */  = (lw.a(25795, 670165702369175166L) * lw.a(10158, 1776865176973845993L) - lw.a(13994, 7706505707688146305L) ^ lw.a(26146, 4746558125496067302L)) - lw.a(31699, 2870309715918485986L);
                                                    if (!var5_5) ** GOTO lbl167
                                                    ** GOTO lbl127
                                                }
lbl124:
                                                // 2 sources

                                                while (true) {
                                                    if (var5_5) {
                                                        return var12_13;
                                                    }
lbl127:
                                                    // 3 sources

                                                    var21_6 /* !! */  = (lw.a(26404, 4451567146409026698L) + lw.a(15780, 3863096838213319820L) + lw.a(19746, 3244710162657627289L) ^ lw.a(23364, 69250216183683104L)) - lw.a(19885, 7112915212304502524L) + lw.a(9302, 1503379368402855510L);
                                                    break block56;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    while (true) {
                                        switch (var21_6 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -949249221: 
                                        }
                                        hi.a("G", (long)421370710175267624L);
                                        v0 = hi.a("G", (long)659151967568421102L);
                                        if (var5_5) ** continue;
                                        var21_6 /* !! */  = (lw.a(11248, 3081844911222663283L) ^ lw.a(2831, 2479264845322487978L)) + lw.a(3546, 4501221087940119586L);
                                    }
                                }
                                block43: while (true) {
                                    switch (var21_6 /* !! */ ) {
                                        default: {
                                            v11 = hi.a("\u00a5", (Object)var15_15, (long)984088978567310565L);
                                            if (var5_5) ** GOTO lbl156
                                            if (v11 == false) ** GOTO lbl155
                                            ** GOTO lbl158
                                        }
                                        case -1531452476: {
                                            var16_16 = (Vec3)hi.a("\u00a5", (Object)var15_15, (long)470012372636416268L);
                                            var17_17 = 2;
                                            if (!var5_5) ** GOTO lbl160
                                            ** GOTO lbl54
                                        }
lbl155:
                                        // 1 sources

                                        v11 = lw.x("YSDqrC2rPe0ttaMD", max(int int ), (int)(lw.a(24062, 4413825347908558815L) + lw.a(25045, 8075133419897741962L) ^ lw.a(29594, 6960605122566877585L)), (int)lw.a(13445, 7315482375227127051L)) - lw.a(24783, 4658667968630776595L);
lbl156:
                                        // 2 sources

                                        var21_6 /* !! */  = (int)v11;
                                        if (!var5_5) continue block43;
lbl158:
                                        // 2 sources

                                        var21_6 /* !! */  = ((lw.a(12546, 2495558262492509009L) * lw.a(46, 7086216919999448045L) ^ lw.a(2568, 920284913335076925L)) + lw.a(16190, 2740860287548538492L)) / 2 ^ lw.a(12795, 3131057028562792556L);
                                        continue block43;
lbl160:
                                        // 1 sources

                                        var21_6 /* !! */  = (lw.a(31904, 2611896595693895123L) * lw.a(10386, 7984950311660409L) - lw.a(28351, 1275302059644447931L) ^ lw.a(19327, 2752616470663809380L)) - lw.a(17707, 7054258796538807443L);
                                        if (!var5_5) ** GOTO lbl167
lbl162:
                                        // 2 sources

                                        v3 /* !! */  = (int)(hi.a("G", (int)(lw.a(19535, 8586154687085203021L) / lw.a(30097, 3929466860276152147L) / 4), (int)lw.a(18997, 555823976558152102L), (long)834203424483934088L) - lw.a(21324, 285219011503903042L));
                                        v4 = lw.a(29227, 3269290490129314786L);
lbl164:
                                        // 2 sources

                                        var21_6 /* !! */  = v3 /* !! */  + v4;
                                        if (!var5_5) ** GOTO lbl167
lbl166:
                                        // 2 sources

                                        var21_6 /* !! */  = hi.a("G", (int)lw.a(28360, 8914882730282315138L), (int)lw.a(2440, 6713158755707685473L), (long)834203424483934088L) ^ lw.a(11170, 7121657563770301166L) ^ lw.a(28045, 154572422558117501L);
lbl167:
                                        // 6 sources

                                        switch (var21_6 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -1275572007: {
                                                hi.a("G", (long)891539368048632717L);
                                                ** GOTO lbl60
                                            }
                                            case -1275572009: {
                                                ** continue;
                                            }
                                            case -1275572010: 
                                        }
                                        ** continue;
                                        case -1531452479: {
                                            return var12_13;
                                        }
                                        case -1531452478: 
                                    }
                                    break;
                                }
                                return null;
                            }
lbl183:
                            // 5 sources

                            while (true) {
                                switch (var21_6 /* !! */ ) {
                                    default: {
                                        if (!var5_5) break;
                                        ** GOTO lbl76
                                    }
                                    case -917425170: {
                                        ** continue;
                                    }
                                    case -917425165: {
                                        hi.a("G", (float)5.0f, (float)-1.0f, (float)-1.0f, (float)11.0f, (long)1107932821409857423L);
                                        hi.a("G", (long)397288152806896377L);
                                        ** GOTO lbl84
                                    }
                                    case -917425167: {
                                        ** GOTO lbl84
                                    }
                                    case -917425169: {
                                        ** continue;
                                    }
                                    case -917425166: {
                                        if (!var5_5) break block61;
                                        ** GOTO lbl91
                                    }
                                    case -917425171: {
                                        ** continue;
                                    }
                                    case -917425164: {
                                        ** continue;
                                    }
                                }
lbl207:
                                // 2 sources

                                var21_6 /* !! */  = ((lw.a(30595, 3795783457712076130L) ^ lw.a(16986, 9059420197714117559L)) - lw.a(4947, 3775719784624919279L) ^ lw.a(21654, 2737570387792352781L)) / lw.a(17305, 260087325598270263L) + lw.a(15605, 8798562304701414936L);
                                if (!var5_5) continue;
lbl209:
                                // 2 sources

                                v8 /* !! */  = (CallSite)(hi.a("G", (int)(((lw.a(10806, 6581657308455414201L) ^ lw.a(28166, 4595642998703353322L)) - lw.a(23550, 2391295901519829177L)) / lw.a(6986, 7378427741402504160L)), (int)lw.a(30824, 7232986719422445929L), (long)834203424483934088L) ^ lw.a(9602, 5546529628885624033L));
lbl210:
                                // 2 sources

                                var21_6 /* !! */  = (int)v8 /* !! */ ;
                                if (!var5_5) continue;
lbl212:
                                // 2 sources

                                var21_6 /* !! */  = (hi.a("G", (int)lw.a(1230, 7355897853191325620L), (int)lw.a(12987, 3962398840691208215L), (long)834203424483934088L) ^ lw.a(26416, 8534704777874728574L) ^ lw.a(1906, 3671190734011040981L)) - lw.a(31973, 6235711829835349282L) + lw.a(484, 3346778193617650310L);
                                if (!var5_5) continue;
                                break;
                            }
                        }
                        var21_6 /* !! */  = ((lw.a(25775, 5269445845651514822L) ^ lw.a(26591, 8279897924202849679L)) - lw.a(25422, 4517485951532785988L) ^ lw.a(27893, 4337109498773729116L)) / lw.a(17305, 260087325598270263L) + lw.a(1455, 5101150844538586642L);
                        if (!var5_5) ** GOTO lbl183
                    }
                    v9 /* !! */  = (CallSite)(hi.a("G", (int)lw.a(15975, 1271034200196988018L), (int)lw.a(10386, 7668752629466213372L), (long)834203424483934088L) ^ lw.a(10524, 3962016788308240633L));
                }
                var21_6 /* !! */  = (int)v9 /* !! */ ;
                if (!var5_5) ** GOTO lbl183
            }
            var21_6 /* !! */  = (lw.a(18331, 7926260532413285929L) + lw.a(23266, 1145870052882635256L)) * lw.a(5189, 1083686289727133405L) + lw.a(32676, 3753510505885269010L);
            if (!var5_5) ** GOTO lbl183
        }
        var21_6 /* !! */  = ((lw.a(25775, 5269445845651514822L) ^ lw.a(26591, 8279897924202849679L)) - lw.a(25422, 4517485951532785988L) ^ lw.a(27893, 4337109498773729116L)) / lw.a(17305, 260087325598270263L) + lw.a(1455, 5101150844538586642L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static List S(Object[] var0) {
        block31: {
            var7_1 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", max(int int ), (int)(lw.a(18747, 6863362998439758041L) / lw.a(26711, 3367009529014741825L)), (int)lw.a(31673, 6041242681000655056L)) - lw.a(19225, 4975312395977246976L) - lw.a(23382, 8577818932625791210L) ^ lw.a(7573, 4356163269574270921L);
            switch (var7_1 /* !! */ ) {
                default: {
                    var1_2 = new ArrayList<E>(lw.a(30039, 5694554451076413397L));
                    var2_3 = -1;
                    var7_1 /* !! */  = (hi.a("G", (int)lw.a(4657, 4989133531914342666L), (int)lw.a(744, 4087076501469921355L), (long)834203424483934088L) + lw.a(24226, 9028258014950382959L) ^ lw.a(26618, 327462883074401926L)) - lw.a(8281, 6346955846953542288L);
                    break block31;
                }
                case -771218739: {
                    throw null;
                }
            }
lbl12:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
lbl15:
        // 2 sources

        block24: while (true) {
            switch (var7_1 /* !! */ ) {
                default: {
                    if (var2_3 <= 1) {
                        var7_1 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(lw.a(21086, 1423635067851428145L) * lw.a(5994, 120530065154774644L)), (int)lw.a(30178, 765362715303867639L), (long)834203424483934088L), (int)lw.a(11126, 1270515161652931057L), (long)834203424483934088L) - lw.a(9217, 6331918474255607433L));
                        continue block24;
                    }
                    ** GOTO lbl30
                }
                case 1219839262: {
                    hi.a("G", (long)979899430926065004L);
                    hi.a("G", (long)1101389884075884739L);
                    ** GOTO lbl12
                }
                case 1219839261: {
                    ** continue;
                }
lbl30:
                // 1 sources

                var7_1 /* !! */  = (lw.a(512, 5800691712183534424L) + lw.a(29297, 2081245842322223344L)) * lw.a(10557, 4207218119445162606L) * lw.a(19728, 4278319163883048131L) + lw.a(13122, 5710161322874417245L) - lw.a(16248, 5476374470349503832L);
                continue block24;
                case 1219839260: 
            }
            return hi.a("G", var1_2, (long)497368790579535219L);
        }
        var3_4 = -1;
        var7_1 /* !! */  = (lw.a(2204, 1589053320370260612L) ^ lw.a(15332, 5806784620336101601L)) / lw.a(26711, 3367009529014741825L) * lw.a(17934, 8557704912660776845L) - lw.a(10312, 1082827922106591770L) + lw.a(27420, 486292936285153957L);
        block25: while (true) {
            block32: {
                switch (var7_1 /* !! */ ) {
                    default: {
                        if (var3_4 > 1) break;
                        var7_1 /* !! */  = lw.a(18117, 7569002980254532764L) * lw.a(8341, 709129982056407874L) + lw.a(7090, 8416751982306564214L) + lw.a(2826, 7746208805787994604L) ^ lw.a(8313, 1201987464659247769L) ^ lw.a(29605, 2980027940969672770L);
                        continue block25;
                    }
                    case -939746933: {
                        var4_5 = -1;
                        var7_1 /* !! */  = (lw.a(15677, 6529091980974079634L) + lw.a(19124, 819051329084738464L) ^ lw.a(8703, 6037057725477069677L) ^ lw.a(26299, 2662449444705559833L)) * lw.a(23874, 1421614951807999057L) + lw.a(5367, 7136261557317113663L);
                        break block32;
                    }
                    case -939746931: {
                        ++var2_3;
                        var7_1 /* !! */  = (hi.a("G", (int)lw.a(31640, 5614542696831810179L), (int)lw.a(919, 3856965505174241931L), (long)834203424483934088L) + lw.a(23852, 3174443300953087098L) ^ lw.a(16817, 8818570074939933271L)) - lw.a(10294, 1836097102808460221L);
                        ** continue;
                    }
                    case -939746932: {
                        break block25;
                    }
                }
                var7_1 /* !! */  = lw.a(8282, 8709505928072995777L) + lw.a(30663, 123302220841121323L) - lw.a(11567, 1078530076673682556L) + lw.a(1870, 2151638587547911507L);
                continue;
            }
            block26: while (true) {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                switch (var7_1 /* !! */ ) {
                                    default: {
                                        if (var4_5 > 1) break;
                                        var7_1 /* !! */  = (lw.a(22108, 930114852250146279L) / lw.a(19096, 699400857844599573L) ^ lw.a(20687, 102850118567023368L)) * lw.a(29609, 5961689030872691257L) / lw.a(23511, 785228222171961978L) - lw.a(17080, 7215520463710503725L);
                                        continue block26;
                                    }
                                    case 1944987726: {
                                        if (var2_3 == 0) {
                                            var7_1 /* !! */  = (((lw.a(19234, 9171219842190658061L) ^ lw.a(10878, 9110290113132046749L)) + lw.a(24085, 5980106722324143169L)) / lw.a(23511, 785228222171961978L) ^ lw.a(3238, 2453159678007185230L)) + lw.a(23031, 8972319473641347799L);
                                            continue block26;
                                        }
                                        break block33;
                                    }
                                    case 1944987722: {
                                        if (var3_4 == 0) {
                                            var7_1 /* !! */  = hi.a("G", (int)(lw.a(22235, 6102542513888679076L) / 4), (int)lw.a(2274, 3387129603189934951L), (long)834203424483934088L) - lw.a(2342, 4810343349249674060L) ^ lw.a(11937, 3932555055888084063L);
                                            continue block26;
                                        }
                                        break block34;
                                    }
                                    case 1944987724: {
                                        if (var4_5 == 0) {
                                            var7_1 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)lw.a(19722, 4535724635242221140L), (int)lw.a(23583, 3451269580082765420L), (long)834203424483934088L), (int)lw.a(24057, 2482753297439153284L), (long)834203424483934088L) - lw.a(25944, 5571932204227060905L));
                                            continue block26;
                                        }
                                        break block35;
                                    }
                                    case 1944987725: {
                                        break block36;
                                    }
                                    case 1944987721: {
                                        var5_6 = hi.a("G", (double)((double)(var2_3 * var2_3 + var4_5 * var4_5) + (double)(var3_4 * var3_4) * 1.44), (long)1236096628704034685L);
                                        hi.a("\u00a5", var1_2, (Object)new vm(var2_3, var3_4, var4_5, (double)var5_6), (long)490119386715296288L);
                                        var7_1 /* !! */  = lw.a(22674, 3938340876454582994L) / lw.a(7689, 5046555858816081831L) + lw.a(25358, 2445271072851780229L);
                                        continue block26;
                                    }
                                    case 1944987728: {
                                        ++var4_5;
                                        var7_1 /* !! */  = (lw.a(7898, 6994496008775900554L) + lw.a(5939, 7578033126915479444L) ^ lw.a(4756, 402361438703030522L) ^ lw.a(5388, 6265503533602510552L)) * lw.a(22556, 3726992160269621905L) + lw.a(23910, 4708460371709451999L);
                                        continue block26;
                                    }
                                    case 1944987729: {
                                        ++var3_4;
                                        var7_1 /* !! */  = (lw.a(28600, 3423972898965122725L) ^ lw.a(7683, 3272613326848105646L)) / lw.a(26711, 3367009529014741825L) * lw.a(13776, 7375639687109326684L) - lw.a(7665, 242006835616292525L) + lw.a(23662, 3736834234112695977L);
                                        continue block25;
                                    }
                                    case 1944987723: {
                                        break block25;
                                    }
                                }
                                var7_1 /* !! */  = (lw.a(18105, 8124171147606050660L) + lw.a(2898, 7407966364538833056L)) * lw.a(8632, 5497231465401131054L) - lw.a(26608, 3290790608836552310L) ^ lw.a(4448, 5523499722903457880L);
                                continue;
                            }
                            var7_1 /* !! */  = (lw.a(11168, 6039692796390582803L) ^ lw.a(19997, 5790552894651977086L)) - lw.a(29398, 2273865839268197299L) - lw.a(1665, 821836622953088021L) ^ lw.a(13387, 279817419759040085L);
                            continue;
                        }
                        var7_1 /* !! */  = (lw.a(23695, 8827235344253279768L) ^ lw.a(31406, 7087150996767177481L)) - lw.a(3611, 6363390493653405540L) - lw.a(1142, 5672520694794880322L) ^ lw.a(22469, 2230836410212636026L);
                        continue;
                    }
                    var7_1 /* !! */  = (lw.a(23695, 8827235344253279768L) ^ lw.a(31406, 7087150996767177481L)) - lw.a(3611, 6363390493653405540L) - lw.a(1142, 5672520694794880322L) ^ lw.a(22469, 2230836410212636026L);
                    continue;
                }
                var7_1 /* !! */  = lw.a(5401, 8068268184160769129L) / lw.a(7689, 5046555858816081831L) + lw.a(31940, 8762859052543016827L);
            }
            break;
        }
        hi.a("G", (long)480507656276889797L);
        hi.a("G", (long)589253768936098215L);
        return lw.x("YSDqrC2rPe0ttaMD", x());
    }

    public static /* bridge */ /* synthetic */ CallSite x(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private List D(Object[] var1_1) {
        block90: {
            block89: {
                block93: {
                    block88: {
                        block86: {
                            block87: {
                                block92: {
                                    block85: {
                                        block83: {
                                            block84: {
                                                block91: {
                                                    var5_2 = var1_1[0];
                                                    var4_3 = var1_1[1];
                                                    var2_4 = var1_1[2];
                                                    var3_5 = var1_1[3];
                                                    var6_6 = Dl.t();
                                                    var27_7 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", max(int int ), (int)(lw.a(10392, 3777118327572310589L) * lw.a(19587, 179954676838518651L) + lw.a(684, 5203245944053793539L) - lw.a(17966, 8157795881250801468L)), (int)lw.a(4737, 8696646300249755936L)) + lw.a(23303, 6229209727098313388L);
                                                    if (var6_6) ** GOTO lbl-1000
                                                    v0 = var27_7 /* !! */ ;
                                                    if (var6_6) break block90;
                                                    switch (v0) {
                                                        default: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var7_8 = new PriorityQueue<E>(lw.x("YSDqrC2rPe0ttaMD", comparingDouble(java.util.function.ToDoubleFunction<? super T> ), (ToDoubleFunction<nF>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, z(), (Lcom/github/epsilon/nF;)D)()));
                                                            var8_9 = new HashMap<K, V>();
                                                            var9_10 = new HashMap<K, V>();
                                                            var10_11 = new HashMap<K, V>();
                                                            var11_12 = new HashSet<E>();
                                                            v1 = new Object[2];
                                                            v1[1] = (BlockPos)var2_4;
                                                            v1[0] = (BlockPos)var4_3;
                                                            var13_14 = var12_13 = new nF((BlockPos)var4_3, 0.0, (double)hi.a("\u00a5", (Object)this, (Object)v1, (long)817952446212008827L));
                                                            lw.x("YSDqrC2rPe0ttaMD", add(E ), var7_8, (Object)var12_13);
                                                            hi.a("\u00a5", var9_10, (Object)((BlockPos)var4_3), (Object)hi.a("G", (double)0.0, (long)1323649220833053453L), (long)1121879748672195632L);
                                                            var14_15 = 0;
                                                            if (var6_6) {
                                                                break;
                                                            }
                                                            ** GOTO lbl338
                                                        }
                                                        case 318671244: {
                                                            ** GOTO lbl228
                                                        }
                                                    }
lbl32:
                                                    // 2 sources

                                                    while (true) {
                                                        v2 /* !! */  = hi.a("\u00a5", var7_8, (long)578049367522332596L);
                                                        if (var6_6) ** GOTO lbl341
                                                        if (v2 /* !! */  != false) ** GOTO lbl340
                                                        ** GOTO lbl342
                                                        break;
                                                    }
lbl37:
                                                    // 2 sources

                                                    while (true) {
                                                        ++var14_15;
                                                        cfr_temp_1 = hi.a("\u00a5", (Object)var15_16, (long)392419273667760217L) - hi.a("\u00a5", (Object)var13_14, (long)392419273667760217L);
                                                        v3 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                        if (var6_6) ** GOTO lbl198
                                                        if (v3 /* !! */  >= 0) ** GOTO lbl197
                                                        ** GOTO lbl199
                                                        break;
                                                    }
lbl44:
                                                    // 2 sources

                                                    while (true) {
                                                        block95: {
                                                            block94: {
                                                                var16_17 = hi.a("G", (Object)lw.x("YSDqrC2rPe0ttaMD", _c(), (nF)var15_16), (long)414024409078792884L);
                                                                v4 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var15_16, (long)913362749556658591L), (Object)((BlockPos)var2_4), (long)1203894332961133998L);
                                                                if (var6_6) break block94;
                                                                if (v4 /* !! */  == false) break block95;
                                                                v4 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(29020, 5814995009545269962L) / lw.a(30097, 3929466860276152147L) ^ lw.a(30967, 4684825345001257613L)) + lw.a(18506, 3076467021819758954L));
                                                            }
                                                            if (!var6_6) ** GOTO lbl203
                                                        }
                                                        var27_7 /* !! */  = (CallSite)((lw.a(12185, 8692039323994762282L) - lw.a(4055, 7417002061130140741L) + lw.a(20013, 6016120334173490327L) ^ lw.a(16917, 2282750123206361991L)) + lw.a(14837, 415104760582060156L));
                                                        if (!var6_6) ** GOTO lbl203
                                                        if (true) ** GOTO lbl230
                                                        break;
                                                    }
                                                    block52: while (true) {
                                                        block98: {
                                                            block97: {
                                                                block96: {
                                                                    v5 /* !! */  = var17_18 /* !! */  = v6 /* !! */ ;
                                                                    if (var6_6) break block96;
                                                                    if (v5 /* !! */  != false) break block97;
                                                                    v5 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(30293, 7629248892784965625L) + lw.a(25686, 3463723887392417497L)) / lw.a(29212, 3565009267246854195L) ^ lw.a(31537, 4215102877744527677L));
                                                                }
                                                                if (!var6_6) break block98;
                                                            }
                                                            var27_7 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(lw.a(842, 990115235679142379L) + lw.a(18071, 8218527300179346606L)), (int)lw.a(12273, 2119408756058369757L), (long)834203424483934088L) * lw.a(9025, 1501147615200747905L)), (int)lw.a(25625, 2173811232961914579L), (long)834203424483934088L) - lw.a(20479, 3054614664594247297L);
                                                        }
                                                        cfr_temp_0 = 0;
lbl67:
                                                        // 2 sources

                                                        while (true) {
                                                            switch (cfr_temp_0 == 0 ? var27_7 /* !! */  : cfr_temp_0) {
                                                                default: {
                                                                    v7 = new Object[2];
                                                                    v7[1] = hi.a("\u00a5", (Object)var15_16, (long)913362749556658591L);
                                                                    v7[0] = var8_9;
                                                                    return hi.a("\u00a5", (Object)this, (Object)v7, (long)901628539336058799L);
                                                                }
                                                                case -481961846: {
                                                                    var18_19 = hi.a("\u00a5", (Object)hi.a("j", (long)903903745240135212L), (long)1240653736693366367L);
                                                                    if (!var6_6) ** GOTO lbl79
                                                                    ** GOTO lbl82
lbl79:
                                                                    // 1 sources

                                                                    var27_7 /* !! */  = (CallSite)(lw.a(19272, 992660325579475114L) * lw.a(4343, 178265448070779176L) / 5 * lw.a(24870, 1368212155316232217L) ^ lw.a(7392, 8189573934192794940L));
                                                                    if (!var6_6) ** GOTO lbl252
                                                                    ** GOTO lbl90
lbl82:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        hi.a("G", (long)1072168011298293672L);
                                                                        hi.a("G", (long)763209694749933009L);
lbl86:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            v8 /* !! */  = hi.a("\u00a5", (Object)var18_19, (long)984088978567310565L);
                                                                            if (var6_6) ** GOTO lbl91
                                                                            if (v8 /* !! */  != false) ** GOTO lbl92
lbl90:
                                                                            // 2 sources

                                                                            v8 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(27697, 2771392242868842362L) ^ lw.a(17316, 1549494062763983556L)) - lw.a(3297, 3999710066347216147L) ^ lw.a(31033, 2212020920907102947L));
lbl91:
                                                                            // 2 sources

                                                                            if (!var6_6) ** GOTO lbl252
lbl92:
                                                                            // 2 sources

                                                                            var27_7 /* !! */  = (CallSite)(lw.a(511, 2817625851891843137L) ^ lw.a(858, 1963484914313560167L) ^ lw.a(11612, 7280627144034364546L));
                                                                            ** GOTO lbl252
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
lbl94:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        cfr_temp_2 = hi.a("\u00a5", (Object)((BlockPos)var4_3), (Object)var20_21, (long)947855549302539755L) - (double)(hi.a("\u00a5", (Object)((Xg)var3_5), (long)1178344719380785578L) * hi.a("\u00a5", (Object)((Xg)var3_5), (long)1178344719380785578L));
                                                                        v9 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                                                        if (var6_6) break block83;
                                                                        if (v9 /* !! */  <= 0) break block84;
                                                                        break block85;
                                                                        break;
                                                                    }
lbl100:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        v10 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", var10_11, (Object)var20_21, (Function<BlockPos, Boolean>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$findPath$0(net.minecraft.client.player.LocalPlayer net.minecraft.core.BlockPos ), (Lnet/minecraft/core/BlockPos;)Ljava/lang/Boolean;)((lw)this, (LocalPlayer)((LocalPlayer)var5_2)), (long)817175477130987234L)));
                                                                        if (var6_6) break block86;
                                                                        if (v10 /* !! */  != false) break block87;
                                                                        break block88;
                                                                        break;
                                                                    }
lbl105:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var21_22 = hi.a("\u00a5", (Object)var15_16, (long)1102558491463540197L) + hi.a("\u00a5", (Object)var19_20, (long)1155458407077864994L);
                                                                        var23_23 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", var9_10, (Object)var20_21, (Object)hi.a("G", (double)1.7976931348623157E308, (long)1323649220833053453L), (long)1241751088262622582L)), (long)637262500311742568L);
                                                                        v11 /* !! */  = var21_22 == var23_23 ? 0 : (var21_22 > var23_23 ? 1 : -1);
                                                                        if (var6_6) ** GOTO lbl112
                                                                        if (v11 /* !! */  >= 0) ** GOTO lbl113
                                                                        v11 /* !! */  = var27_7 /* !! */  = (CallSite)(lw.a(26204, 4047056687069685035L) / 2 - lw.a(26085, 3218515830727304862L));
lbl112:
                                                                        // 2 sources

                                                                        if (!var6_6) break block89;
lbl113:
                                                                        // 2 sources

                                                                        var27_7 /* !! */  = (CallSite)(lw.a(8177, 833515944325062074L) / lw.a(6986, 7378427741402504160L) * lw.a(727, 7243745172449952058L) / lw.a(7689, 5046555858816081831L) + lw.a(32360, 8866969865494200267L) - lw.a(9936, 858202226595472736L));
                                                                        if (!var6_6) break block89;
                                                                        ** GOTO lbl350
                                                                        break;
                                                                    }
                                                                }
lbl116:
                                                                // 2 sources

                                                                while (true) {
                                                                    v12 /* !! */  = hi.a("\u00a5", (Object)this, (Object)((LocalPlayer)var5_2), (Object)hi.a("G", (Object)hi.a("\u00a5", (Object)var15_16, (long)913362749556658591L), (long)414024409078792884L), (Object)hi.a("G", (Object)var20_21, (long)414024409078792884L), (long)392477843002473627L);
                                                                    if (var6_6) ** GOTO lbl354
                                                                    if (v12 /* !! */  != false) ** GOTO lbl353
                                                                    ** GOTO lbl355
                                                                    break;
                                                                }
lbl121:
                                                                // 2 sources

                                                                while (true) {
                                                                    hi.a("\u00a5", var8_9, (Object)var20_21, (Object)hi.a("\u00a5", (Object)var15_16, (long)913362749556658591L), (long)1121879748672195632L);
                                                                    hi.a("\u00a5", var9_10, (Object)var20_21, (Object)hi.a("G", (double)var21_22, (long)1323649220833053453L), (long)1121879748672195632L);
                                                                    v13 = new Object[2];
                                                                    v13[1] = (BlockPos)var2_4;
                                                                    v13[0] = var20_21;
                                                                    var25_24 = hi.a("\u00a5", (Object)this, (Object)v13, (long)817952446212008827L);
                                                                    hi.a("\u00a5", var7_8, (Object)new nF((BlockPos)var20_21, (double)var21_22, (double)var25_24), (long)496987210709417386L);
                                                                    if (var6_6) ** GOTO lbl136
                                                                    var27_7 /* !! */  = (CallSite)(lw.a(22249, 5684370372676441146L) * lw.a(7136, 7500328356993800575L) / 5 * lw.a(18672, 3217676492518672799L) ^ lw.a(7561, 5259470268726419426L));
                                                                    if (!var6_6) ** GOTO lbl252
                                                                    ** GOTO lbl138
lbl136:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var6_6) ** GOTO lbl141
lbl138:
                                                                        // 2 sources

                                                                        var27_7 /* !! */  = (CallSite)(lw.a(17526, 660772111301199386L) ^ lw.a(5624, 577500028916438540L) ^ lw.a(15687, 6406568299475451538L));
                                                                        if (!var6_6) ** GOTO lbl148
                                                                        ** GOTO lbl145
lbl141:
                                                                        // 1 sources

                                                                        block62: while (true) {
                                                                            v14 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var13_14, (long)913362749556658591L), (Object)((BlockPos)var4_3), (long)1203894332961133998L);
                                                                            if (var6_6) ** GOTO lbl146
                                                                            if (v14 /* !! */  == false) ** GOTO lbl147
lbl145:
                                                                            // 2 sources

                                                                            v14 /* !! */  = var27_7 /* !! */  = hi.a("G", (int)(((lw.a(2284, 4117879094448360018L) ^ lw.a(3861, 1744586549717110494L)) + lw.a(27206, 6568913111762201456L)) * lw.a(23605, 7329901519268798219L)), (int)lw.a(22241, 5732758579105650544L), (long)834203424483934088L) + lw.a(2425, 3586111310000982761L);
lbl146:
                                                                            // 2 sources

                                                                            if (!var6_6) ** GOTO lbl148
lbl147:
                                                                            // 2 sources

                                                                            var27_7 /* !! */  = (CallSite)((lw.a(656, 1508082316201821176L) ^ lw.a(14425, 6733198985798400647L)) + lw.a(3300, 5712763942941167466L) ^ lw.a(11767, 8294404770855857737L));
lbl148:
                                                                            // 8 sources

                                                                            block63: while (true) {
                                                                                v6 /* !! */  = var27_7 /* !! */ ;
                                                                                while (true) {
                                                                                    switch (v6 /* !! */ ) {
                                                                                        default: {
                                                                                            ** continue;
                                                                                        }
                                                                                        case -132812413: {
                                                                                            v15 = var14_15;
                                                                                            v16 /* !! */  = hi.a("\u00a5", (Object)((Xg)var3_5), (long)1014459269908359779L);
                                                                                            if (var6_6) ** GOTO lbl346
                                                                                            if (v15 >= v16 /* !! */ ) ** GOTO lbl344
                                                                                            ** GOTO lbl348
                                                                                        }
                                                                                        case -132812415: {
                                                                                            var15_16 = (nF)hi.a("\u00a5", var7_8, (long)1260358979334293429L);
                                                                                            v17 /* !! */  = hi.a("\u00a5", var11_12, (Object)lw.x("YSDqrC2rPe0ttaMD", _c(), (nF)var15_16), (long)489810460382064611L);
                                                                                            if (var6_6) ** GOTO lbl174
                                                                                            if (v17 /* !! */  != false) ** GOTO lbl173
                                                                                            ** GOTO lbl175
                                                                                        }
                                                                                        case -132812411: {
                                                                                            continue block62;
                                                                                        }
                                                                                        case -132812416: {
                                                                                            v18 = new Object[2];
                                                                                            v18[1] = lw.x("YSDqrC2rPe0ttaMD", _c(), (nF)var13_14);
                                                                                            v18[0] = var8_9;
                                                                                            return hi.a("\u00a5", (Object)this, (Object)v18, (long)901628539336058799L);
                                                                                        }
lbl173:
                                                                                        // 1 sources

                                                                                        v17 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(30637, 2105589970289882572L) + lw.a(27570, 9046468843351959619L)) / lw.a(26711, 3367009529014741825L) / 2 ^ lw.a(13055, 6677979629588754795L));
lbl174:
                                                                                        // 2 sources

                                                                                        if (!var6_6) ** GOTO lbl180
lbl175:
                                                                                        // 2 sources

                                                                                        var27_7 /* !! */  = (CallSite)(lw.a(5796, 8461707485801059616L) + lw.a(14776, 5536438279024425747L) + lw.a(23, 759723153231708792L) - lw.a(10252, 7038334580304095961L) - lw.a(12865, 5266280294173815061L));
                                                                                        if (!var6_6) ** GOTO lbl180
                                                                                        ** GOTO lbl195
                                                                                        case -132812417: {
                                                                                            return hi.a("G", (long)1104179098836104202L);
                                                                                        }
lbl180:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            switch (var27_7 /* !! */ ) {
                                                                                                default: {
                                                                                                    if (!var6_6) break;
                                                                                                    ** GOTO lbl37
                                                                                                }
                                                                                                case -1424690197: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case -1424690199: {
                                                                                                    var13_14 = var15_16;
                                                                                                    if (!var6_6) ** GOTO lbl201
                                                                                                    ** GOTO lbl44
                                                                                                }
                                                                                                case -1424690198: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case -1424690196: {
                                                                                                    throw null;
                                                                                                }
                                                                                            }
lbl195:
                                                                                            // 2 sources

                                                                                            var27_7 /* !! */  = (CallSite)(lw.a(17526, 660772111301199386L) ^ lw.a(5624, 577500028916438540L) ^ lw.a(15687, 6406568299475451538L));
                                                                                            if (!var6_6) continue block63;
lbl197:
                                                                                            // 2 sources

                                                                                            v3 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(8360, 5306167439259378384L) ^ lw.a(26018, 349208491314504726L)) + lw.a(28820, 5980716853301834460L));
lbl198:
                                                                                            // 2 sources

                                                                                            if (!var6_6) continue;
lbl199:
                                                                                            // 2 sources

                                                                                            var27_7 /* !! */  = (CallSite)((lw.a(2132, 2431163634524359153L) + lw.a(10488, 77598124284422710L)) / lw.a(26711, 3367009529014741825L) ^ lw.a(22490, 4347844999841469481L) ^ lw.a(4209, 5304099611899499095L));
                                                                                            if (!var6_6) continue;
lbl201:
                                                                                            // 2 sources

                                                                                            var27_7 /* !! */  = (CallSite)((lw.a(17938, 7686453454681065460L) ^ lw.a(19460, 5013605944906272436L)) + lw.a(30450, 7883990021395248604L));
                                                                                        }
lbl203:
                                                                                        // 6 sources

                                                                                        while (true) {
                                                                                            switch (var27_7 /* !! */ ) {
                                                                                                default: {
                                                                                                    cfr_temp_3 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var15_16, (long)913362749556658591L), (Object)((BlockPos)var2_4), (long)947855549302539755L) - hi.a("\u00a5", (Object)((Xg)var3_5), (long)1258234416289321987L) * hi.a("\u00a5", (Object)((Xg)var3_5), (long)1258234416289321987L);
                                                                                                    v19 /* !! */  = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                                                                                    if (var6_6) ** GOTO lbl231
                                                                                                    if (v19 /* !! */  > 0) ** GOTO lbl230
                                                                                                    ** GOTO lbl232
                                                                                                }
                                                                                                case -397080054: {
                                                                                                    v20 /* !! */  = hi.a("\u00a5", (Object)this, (Object)((LocalPlayer)var5_2), (Object)var16_17, (Object)lw.x("YSDqrC2rPe0ttaMD", atBottomCenterOf(net.minecraft.core.Vec3i ), (Vec3i)((BlockPos)var2_4)), (long)392477843002473627L);
                                                                                                    if (var6_6) ** GOTO lbl235
                                                                                                    if (v20 /* !! */  == false) ** GOTO lbl234
                                                                                                    ** GOTO lbl236
                                                                                                }
                                                                                                case -397080051: {
                                                                                                    v6 /* !! */  = (CallSite)true;
                                                                                                    var27_7 /* !! */  = hi.a("G", (int)lw.a(2276, 4672075888805808517L), (int)lw.a(14284, 7056869812183414085L), (long)834203424483934088L) - lw.a(1461, 8843623902781212524L);
                                                                                                    if (!var6_6) ** GOTO lbl239
                                                                                                    ** GOTO lbl238
                                                                                                }
                                                                                                case -397080053: {
                                                                                                    v6 /* !! */  = (CallSite)false;
                                                                                                    if (var6_6) {
                                                                                                        continue block52;
                                                                                                    }
                                                                                                    ** GOTO lbl238
                                                                                                }
                                                                                                case -397080050: 
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        case -132812414: 
                                                                                    }
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
lbl228:
                                                                // 3 sources

                                                                v0 = hi.a("G", (int)1, (long)525303406604919947L);
                                                                break block90;
lbl230:
                                                                // 2 sources

                                                                v19 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(2500, 7253644043698801286L) ^ lw.a(23598, 6652584598537690990L)) - lw.a(4493, 5566520251209191463L) ^ lw.a(2974, 1372052572324039199L));
lbl231:
                                                                // 2 sources

                                                                if (!var6_6) ** GOTO lbl203
lbl232:
                                                                // 2 sources

                                                                var27_7 /* !! */  = (CallSite)((lw.a(9596, 3983226168363689108L) / lw.a(30097, 3929466860276152147L) ^ lw.a(12155, 4108159778400283702L)) + lw.a(6879, 2722047534629165281L));
                                                                if (!var6_6) ** GOTO lbl203
lbl234:
                                                                // 2 sources

                                                                v20 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(16039, 6780879421410655440L) ^ lw.a(3224, 1557400615924010703L)) - lw.a(9749, 5114937625524447110L) ^ lw.a(30898, 2366820339200785395L));
lbl235:
                                                                // 2 sources

                                                                if (!var6_6) ** GOTO lbl203
lbl236:
                                                                // 2 sources

                                                                var27_7 /* !! */  = (CallSite)(hi.a("G", (int)(lw.a(7984, 1487578987503033812L) / 2 * lw.a(28589, 3505524241964166251L) / lw.a(7689, 5046555858816081831L)), (int)lw.a(15371, 8596840417752399584L), (long)834203424483934088L) ^ lw.a(809, 1182471005168173449L));
                                                                ** continue;
lbl238:
                                                                // 2 sources

                                                                var27_7 /* !! */  = hi.a("G", (int)lw.a(569, 6114993752037654773L), (int)lw.a(1106, 2781197360086255589L), (long)834203424483934088L) - lw.a(30914, 6552765159181580995L);
lbl239:
                                                                // 2 sources

                                                                while (true) {
                                                                    switch (var27_7 /* !! */ ) {
                                                                        default: {
                                                                            continue block52;
                                                                        }
                                                                        case -1478127774: 
                                                                    }
                                                                    hi.a("G", (long)703609663147646272L);
                                                                    lw.x("YSDqrC2rPe0ttaMD", values());
                                                                    var27_7 /* !! */  = (CallSite)(hi.a("G", (int)(lw.a(3709, 6991211159759391825L) * lw.a(30040, 5485346637733360663L) ^ lw.a(29987, 7742788165603128941L)), (int)lw.a(18008, 1858439946005202689L), (long)834203424483934088L) ^ lw.a(32426, 742976646832979715L));
                                                                    if (var6_6) ** continue;
                                                                }
lbl252:
                                                                // 9 sources

                                                                while (true) {
                                                                    switch (var27_7 /* !! */ ) {
                                                                        case -581522558: {
                                                                            ** continue;
                                                                        }
                                                                        default: {
                                                                            ** continue;
                                                                        }
                                                                        case -581522557: {
                                                                            var19_20 = (vm)hi.a("\u00a5", (Object)var18_19, (long)470012372636416268L);
                                                                            var20_21 = lw.x("YSDqrC2rPe0ttaMD", offset(int int int ), (BlockPos)hi.a("\u00a5", (Object)var15_16, (long)913362749556658591L), (int)lw.x("YSDqrC2rPe0ttaMD", cL(), (vm)var19_20), (int)hi.a("\u00a5", (Object)var19_20, (long)1290748721425239734L), (int)hi.a("\u00a5", (Object)var19_20, (long)1052424951548866133L));
                                                                            v21 /* !! */  = hi.a("\u00a5", var11_12, (Object)var20_21, (long)1128025236213057684L);
                                                                            if (var6_6) ** GOTO lbl268
                                                                            if (v21 /* !! */  == false) break;
                                                                            ** GOTO lbl269
                                                                        }
                                                                        case -581522560: {
                                                                            ** continue;
                                                                        }
                                                                    }
                                                                    v21 /* !! */  = var27_7 /* !! */  = (CallSite)(lw.a(20089, 8840425744112012614L) / 3 + lw.a(10035, 3313743068184749811L));
lbl268:
                                                                    // 2 sources

                                                                    if (!var6_6) ** GOTO lbl271
lbl269:
                                                                    // 2 sources

                                                                    var27_7 /* !! */  = (CallSite)(lw.a(15245, 456179362654796402L) * lw.a(24502, 6845335509681200371L) - lw.a(6029, 4566864900520383889L) ^ lw.a(14396, 326411756587006662L));
                                                                    if (var6_6) break block91;
lbl271:
                                                                    // 6 sources

                                                                    while (true) {
                                                                        switch (var27_7 /* !! */ ) {
                                                                            default: {
                                                                                if (!var6_6) break block91;
                                                                                ** GOTO lbl94
                                                                            }
                                                                            case 2053852138: {
                                                                                ** continue;
                                                                            }
                                                                            case 2053852135: {
                                                                                if (!var6_6) break block92;
                                                                                ** GOTO lbl100
                                                                            }
                                                                            case 2053852134: {
                                                                                ** continue;
                                                                            }
                                                                            case 2053852140: {
                                                                                if (!var6_6) break block93;
                                                                                ** GOTO lbl105
                                                                            }
                                                                            case 2053852136: {
                                                                                ** continue;
                                                                            }
                                                                            cfr_temp_0 = -481961844;
                                                                            ** case 2053852139:
                                                                            {
                                                                                case -481961844: {
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl292:
                                                    // 1 sources

                                                    ** while (true)
lbl293:
                                                    // 1 sources

                                                    throw null;
                                                }
                                                var27_7 /* !! */  = (CallSite)(lw.a(22249, 5684370372676441146L) * lw.a(7136, 7500328356993800575L) / 5 * lw.a(18672, 3217676492518672799L) ^ lw.a(7561, 5259470268726419426L));
                                                if (!var6_6) ** GOTO lbl252
                                            }
                                            v9 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(9362, 5817403404938717071L) * lw.a(28535, 5642512095468612650L) ^ lw.a(10505, 6552034556012112509L)) - lw.a(25036, 7267616798027670334L));
                                        }
                                        if (!var6_6) ** GOTO lbl271
                                    }
                                    var27_7 /* !! */  = (CallSite)(lw.a(32100, 4950783937051459299L) - lw.a(10213, 4206060618833045004L) + lw.a(26582, 3650458949900134046L));
                                    if (!var6_6) ** GOTO lbl271
                                }
                                var27_7 /* !! */  = (CallSite)(lw.a(22249, 5684370372676441146L) * lw.a(7136, 7500328356993800575L) / 5 * lw.a(18672, 3217676492518672799L) ^ lw.a(7561, 5259470268726419426L));
                                if (!var6_6) ** GOTO lbl252
                            }
                            v10 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(11564, 5442324467468021702L) / lw.a(23511, 785228222171961978L) * lw.a(10813, 4025937860760447865L) ^ lw.a(11961, 5979772307909520632L)) + lw.a(11494, 887654823847046718L));
                        }
                        if (!var6_6) ** GOTO lbl271
                    }
                    var27_7 /* !! */  = (CallSite)(lw.a(18773, 8751693795856632740L) ^ lw.a(3444, 7118897398418869391L) ^ lw.a(779, 3853772603799962102L));
                    ** while (!var6_6)
                }
                var27_7 /* !! */  = (CallSite)(lw.a(22249, 5684370372676441146L) * lw.a(7136, 7500328356993800575L) / 5 * lw.a(18672, 3217676492518672799L) ^ lw.a(7561, 5259470268726419426L));
                ** GOTO lbl252
            }
            block70: do lbl-1000:
            // 4 sources

            {
                block99: {
                    switch (var27_7 /* !! */ ) {
                        default: {
                            if (!var6_6) break block99;
                            ** GOTO lbl116
                        }
                        case -1203651621: {
                            ** continue;
                        }
                        case -1203651622: {
                            if (!var6_6) break block70;
                            ** GOTO lbl121
                        }
                        case -1203651618: {
                            ** continue;
                        }
                        case -1203651619: {
                            hi.a("G", (long)427998708925187485L);
                            hi.a("G", (int)0, (long)1024745345430233792L);
                            var27_7 /* !! */  = (CallSite)(lw.x("YSDqrC2rPe0ttaMD", max(int int ), (int)hi.a("G", (int)(lw.a(11540, 8972643727401856782L) + lw.a(13859, 5433950928771494994L)), (int)lw.a(32478, 358870149321326572L), (long)834203424483934088L), (int)lw.a(7513, 5406765512312889249L)) * lw.a(23457, 6785704084467177584L) ^ lw.a(2015, 4974938037120206255L));
                            if (!var6_6) ** GOTO lbl-1000
                        }
                    }
lbl338:
                    // 2 sources

                    var27_7 /* !! */  = (CallSite)(lw.a(19088, 3279235624288668500L) ^ lw.a(26649, 3701576251159571195L) ^ lw.a(31561, 8148338677809248787L));
                    if (!var6_6) ** GOTO lbl148
lbl340:
                    // 2 sources

                    v2 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(15077, 4353665688393628623L) * lw.a(15317, 8846119039048464620L) / lw.a(5923, 4351393599388063310L) + lw.a(7665, 996035772031180747L) ^ lw.a(11735, 3501836882672660216L)) - lw.a(12397, 6566153965333459288L));
lbl341:
                    // 2 sources

                    if (!var6_6) ** GOTO lbl148
lbl342:
                    // 2 sources

                    var27_7 /* !! */  = (CallSite)(hi.a("G", (int)(lw.a(7400, 4591539804110921561L) * lw.a(7135, 2748226887889197271L) - lw.a(2630, 8822453633663699214L)), (int)lw.a(29127, 1544331342549151857L), (long)834203424483934088L) ^ lw.a(3889, 5001720078777323255L));
                    if (!var6_6) ** GOTO lbl148
lbl344:
                    // 2 sources

                    v15 = lw.a(7930, 2382013251834387819L) * lw.a(17342, 3070765701710529190L) / lw.a(15275, 7704218695747877479L) + lw.a(9404, 4409684622301504982L) ^ lw.a(2957, 5304176057813502421L);
                    v16 /* !! */  = (CallSite)lw.a(21880, 3440010759497635493L);
lbl346:
                    // 2 sources

                    var27_7 /* !! */  = (CallSite)(v15 - v16 /* !! */ );
                    if (!var6_6) ** GOTO lbl148
lbl348:
                    // 2 sources

                    var27_7 /* !! */  = (CallSite)(lw.a(6852, 8554441254925212119L) * lw.a(22795, 1030473960934267582L) + lw.a(1435, 8027727633509483598L));
                    ** continue;
                }
                var27_7 /* !! */  = (CallSite)(lw.a(22249, 5684370372676441146L) * lw.a(7136, 7500328356993800575L) / 5 * lw.a(18672, 3217676492518672799L) ^ lw.a(7561, 5259470268726419426L));
                if (!var6_6) ** GOTO lbl252
lbl353:
                // 2 sources

                v12 /* !! */  = var27_7 /* !! */  = (CallSite)((lw.a(24200, 5793405297703443635L) ^ lw.a(9648, 324601391485265485L)) + lw.a(25090, 2834753169795965933L));
lbl354:
                // 2 sources

                if (!var6_6) ** GOTO lbl-1000
lbl355:
                // 2 sources

                var27_7 /* !! */  = (CallSite)(lw.a(22415, 2922114642894804412L) - lw.a(24688, 1778243047754130150L) - lw.a(4667, 4647910813942551035L) + lw.a(26071, 3437084907458127482L));
            } while (!var6_6);
            var27_7 /* !! */  = (CallSite)(lw.a(22249, 5684370372676441146L) * lw.a(7136, 7500328356993800575L) / 5 * lw.a(18672, 3217676492518672799L) ^ lw.a(7561, 5259470268726419426L));
            ** while (true)
        }
        hi.a("G", (long)596429899407897303L);
        return null;
    }

    private Boolean lambda$findPath$0(LocalPlayer localPlayer, BlockPos blockPos) {
        Object[] objectArray = new Object[2];
        objectArray[1] = blockPos;
        objectArray[0] = localPlayer;
        return hi.a("G", (boolean)hi.a("\u00a5", (Object)this, (Object)objectArray, (long)1175622970926255758L), (long)827866887164769227L);
    }

    private boolean i(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((LocalPlayer)object), (long)766380852710420164L), (double)1.0E-4, (long)690371185538250507L);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = hi.a("\u00a5", (Object)((Vec3)object2), (Object)hi.a("\u00a5", (Object)((LocalPlayer)object), (long)1045344535518524325L), (long)1082050008038634828L);
        objectArray2[1] = callSite;
        objectArray2[0] = (LocalPlayer)object;
        return (boolean)hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)453433618460133666L);
    }

    private boolean M(Object object, Object object2, Object object3) {
        Object[] objectArray = new Object[2];
        objectArray[1] = (Vec3)object2;
        objectArray[0] = (LocalPlayer)object;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = lw.x("YSDqrC2rPe0ttaMD", subtract(net.minecraft.world.phys.Vec3 ), (Vec3)((Vec3)object3), (Vec3)((Vec3)object2));
        objectArray2[1] = hi.a("\u00a5", (Object)this, (Object)objectArray, (long)988093559625050283L);
        objectArray2[0] = (LocalPlayer)object;
        return (boolean)hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)453433618460133666L);
    }

    private boolean w(Object object, Object object2) {
        CallSite callSite = lw.x("YSDqrC2rPe0ttaMD", containing(double double double ), (double)hi.a("\u00e9", (Object)((AABB)object2), (long)1065600789354078750L), (double)hi.a("\u00e9", (Object)((AABB)object2), (long)797530004147152713L), (double)hi.a("\u00e9", (Object)((AABB)object2), (long)1242259651052261877L));
        CallSite callSite2 = hi.a("G", (double)hi.a("\u00e9", (Object)((AABB)object2), (long)430137657327008003L), (double)hi.a("\u00e9", (Object)((AABB)object2), (long)1116111677700761539L), (double)hi.a("\u00e9", (Object)((AABB)object2), (long)1166170983307000375L), (long)921489941210881726L);
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((LocalPlayer)object), (long)827913124966560621L), (Object)callSite, (Object)callSite2, (long)1119907467282112756L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 81985498273857755L;
                var6_1 = new long[778];
                var3_2 = 0;
                var4_3 = "\u00b4_IvD\u0014\u0082\u00a5&l\u00b8~']0'\u00c6d\u0099\u00e8\u00e4'L(\u00b9\u0096\u00f0Y\u00ad\u00fc\u0099\u000f\u00fe/\u0010<\u00bc{o'=\u00ed\u00a4:2\\\u00a3\u0082#w8\u0014uW\u00e0H\u00af,\u00b2\u00c8\u0085\u001c\u0006\u00b6r~\u00f7\u0097\u00fa3\u0015M}\u0095t\u00ed\u0089\u00db\u00b4\u00a1\u00da2\u0011\u0084\u00fb)\u00fc\u00ee7\u00e8\u00d4P%!\u00a0g\u00cf.KUH\u008b\u0005Q\u00d9\u00f98+\u00d8\u0096\u00dc\u00bd=\u00b7\u00f5\u00c2\u0081\u00b5\u008c\u0098\u00d1^\u00de\u001d\u00b7\u00b9K\u00cb=\u0013\u0005\u00b0M\u00cdFv\u00efSc+\u0011\u00cf\u00bd\u00d7+\u00c2\u0001i\u0018\u00bf\u00d3\u0017\u00b2\u00d1\u00fa\u0016o\u00b9m\u00cd\u008f~\u00ffw:\u00fe1\u00b1eF`\u00b1\u00b1-\u001a@\u001fq0F\u00d7\u00f5\u001fR\u008b\u00bfV\u0016\u00c4Jx\u0099\u00e9\u0085Q\u0006\u0001o \u008c\u00de\u00b4\u0087\u00fa\u00fc\u00eb]E\u00e3\u00ee\u00f3\u0005}&\u001dr\u0087}\u00ee\u00ceiho\u00a5\u00ac7\u00e0\u00c6\u00bfv~\u00fab\t(\u000f\u00ee\u00af^\u00bdn\u00a0\u00944Fp\u00a4\u00c4x\u00e5\u00e1\u0010\u0098\u00e5\u00ac\u0088\u001c\u00e0\u00ef=lH\u0081>Vd@\u00e1`\u00977\u00a4l4\u00d6yV%A3A\u001e\u008e\u00e0\u0091\u00e0\u0014\u0007\u00adPV@ a4t\u00bd&\u00a3c\u000f\u00fd@!\u00ceRl[\u00f4~Q\\{V\u00c0\u00a9\u00baU\u00ed\u00c1\u0015\u00ef\u00e0\u007f\u00d6\u009b3h\u00c3\u0000\u00f9.\u0081\u0083\u00a7+\u001a\u00f1\u00cf'\u00dd9tK\u00ffTK\u00fc\u0093\u008a\u00a5\u0004s\u00e1}\u00c4.\u00b2TX\u00fd\u00e6\u00a1\u00dd\u00b4\u00c3\u00cc\u0013+\u001c\u0095\u00cc\u00cb\u00f9o\u00db\u00ec\u009f\u00b2\u00e5[\u00fey\u00cb\b>\u0081\u0000\u0085\u001d3\u00f9\u008c\u0081\u0097\n\u0003\u000f\u00fd\u00d7\u00e3o@\u009e\u0016r\u00c9\u0000\bhI\u0002$\b'\u00e2\u00db\u00d7\u00cc+\u0007\u0086\u00c22\u00eb__X\u000e(z\u00cd5\u00b2'\u00e0\u00b7\u001by]\u00c72\u00f6N*(j\u00e7!n\u008c,_\u00ea\u008b\u0080\u00cd\u00e3\u00e1p\u00c0\u00ea\u00cbj(r\u0099:l\u00d59\u00f7\\)<\u00d1\u008b\u00d7\u000bf\u00f2\u00f5kqdQ\u00d0\u00f9\u00e1A\u0010\u0083\u00d6\u00f9\u00b2\u00f8\u00b9\u0012\u00b6\u008c\u00a8\u00985\u001f\u00ff\u0083\u00dc3X\u0018G\u00e7\u001b\u00d0\\\u00ffd\u00d5\u0082\u00b2\u00b1K\u0011\u0086I\u00cc\u00a7\u0017\u0096\u0018\u00a7\u00fa!\u0000a\u0082\u00c8\u00cc\u0010K\u00a7\t`\u00e0\u0010j\u00035\u0090\u0007\u0000Q\u00de:f\u001e\u00b4\u00c8\b\fg\u00eb5\u00a6v\u00829\u001b6\u0013\u00c8\u00a8\u00a7rr\u008b\u00e2\u00cb\u00d3e\u00d7\u009a}\u00da\u0086\u00cb\u00ef\u00b1j8\t\u009b57p\u0087\u0004<\u00c4\u00e4\u009d\u00d7\u008c\u001cf\u00f08\u0006\u001a&\u00bf\u00d3u\u00d69\u0093S\u00d5U\u00a6\u00e0\u0012\u00c2\u001bel=\u00d8\u00a23\rr\u00f4/y\u00d5\u008d4\u00c0\u00be\u0083{\u000b)C\u00e7\u0013\u0098\u00d1/\t=d\u0013\u0097\u00eb\u00b2\u00cd\u00b2\u00dc\u0094\u00ea\u00be\u0085X\u0012\u0003^\u0006\u0010q\u00c3w\u0013\u00b48\u0093\u0006\u00e3\u0005D'\u00da\u00dc\u00fb\u0083tBV\u00ce\u00db\u0090\u00ad\u001b\u001a\u00a1e~\u0004P\u001fui\u00ff\u00a86q\u0011thK\u00fe\u00ea\u00b1\u00bc\u00e8\u00d2\u001a\u00a3G94\u00e0\u001f`\u008f\u00d2\u00f0\"\u0017\u001c\u000f\u00d4dy\u0098\u00a52m\u00d6%\u00d5]\u00d8\u00f7s\u0088O\u00dc\u00b3\n\u0085\r\u001a\u008b\u00c7T\u001dj\u0086\u009f\u0087KN\u00b3\u00edm\u00ebp\u00eb6j\u00e7S\u0091f\u0080U\u00c3a\u00e4\u00ca\u000fJ-N\u0092k\u0012\u00f9\u0081\u00c3\"\u0000\u00e1\u00ec\u00aa+0\u00cb\u00a6\u00a6\u0004\u00c2\u00b8\u0002\u000f\u00dd\u00e1|<\"\u00d8\u000f\u00d5\u00b5-\u0010\u00bf;\u0016s\u00a0T\u00d8F\u00b3`\u008dbV\u00b2\\\u00c33\u00fb\u00f3\u0081\u009d\b\u00ee\u00c6{\u001bM\u00ef\u009d\u00dd\u00aa+F\u00d3\u00eay\u008c\u00d5?\u00ecf\u00f6\u001f\u0000\u0090\u008b\u00ab|\u00b8\u00e1M\tqSb\u00ec\u00a8\u00c6\u009e#\u00b1\u00d0\u00bd]\u00ed\u0015\u0086\u00c9B\u009fP6|\u00b5\r@\u0081\n\u00b7Z\u008f\u00ed\u008dR\u001b\u008e\u008e\u0004^\u00035\u0087\r\u00f1P\u008b\u0000]\u00d2\u00bdm\u0019\u00a8l\u00be\u0095\u00fa,\u007f\u00e9?\u0080\u008d[1b\u00ff\u00b70\u00d9\u00ed\u00a7\u0017`\u0083\u009ap\u00f2r\u00c8\u00a7\u00da:\u00d27\u0011-(\u00df$f\u00a9/\"\u0090\u00a5 \u00b4\u00df.\u001b\u0081\u001d\u001by\u00b1\u009b\u00d88\u00d5\u0092C2\u00a5\u00d1?&\u00d7\u0084%\u00bb\u00df\u00af|>`\u00e6\u0011}\u009f\u00cb\u00b5\u00bc\u00be%\u00d7h{tr\u00b5\u00fc33w\u0014Z0\u00dc\u0080W\u00a5\u00f7\u0010\u00e1k\u008b>\"\u00ec\u00fd\u00a5jW,\u009d\u00b2\u0013\u00c1\u00f8\u0000\u00d7\u0014\u009b\u000b\u00a3\u00c1\u00ca\u0092\u0010b\u0098\u008ffD\u000f\u00a8\u0082\u00cb \u00efH\tD\u0080\u00c4\u00e0\u0016\u00e4\u0082\u00f0\u00e0z\u009c3\u0096n\u00d7\u0086\u00ae\u00f4\u0003\u0097\u00b2\u008a\u00d0\b1?p\u00a9T\u00c0\u00c7\u00a5\u00ceJ9:\u00abjo\u0014\u00eb=I\u00ea\u00d5'\u00f8\u00ae\u00c1O4>[\u0080\u0094P\u008f\u0019\u00b08\u009eG\u00a1U\u00ea\u008d\u00c1\u00cb7\u00f7\"\u00ba\u00e0 \u000fm!\u00c1G\u00a6-\t\u00aa\u00aeK\u00a4\u0089\u0003\u001dM\u0082\u0012\u00abm\u00d8\u0080\u00c3\u00f3H\u00cd\\\u00a3\u008e\u00c3d\u00dd\u0089:\u0084\\{\u0096\u0013\u00a9\u00af\u000f\f\u00be\u001b\u00bd\u00f0\t\u00abm\u00902ej\u008e.\u009eh\r5h\u0018\u00e5#Y$\u001b\u0013\u00b5\u00c6t\u000b\nv\u0082\u00ae\u00d8\u00cd\u00c0\u008a\u00b6\u00b6\u00f9\fC\u0082\u0098\u00da\u00c4\u009dnO\u00ddm@\u00a1\u00d0\u00ba\u00b1\u0085\u009a7\u00f6\u00ad\u00b1`\u00e3{s\u0093+\u009a\u00afN#\u00c8\u00c1\u0082\u00de#\u00e4,d\u00fc\u009e\u001crpV\u00d5\u009b\u0017j.\u0081\u0083\u00c5=>\u0093\u008c_\u0088\u008c\u00f2^\u00b8\u00fd\u009fl\u00e4A\u0092\u00d2\u00a0\u00ef^\u0010\u00d1\u0083L\u00d9\u00a5\"\u00a16\u00c3]VG+\u00bd[H]\\\u00bfs\u0080N\u00fa\u00ff\u0097\u0002\u00fc\u00ddi\u008d\u00b1u?3\u0083\t\u00f2\n\u0010\u00cf\u00c6=\u00b3\\\u00eb\u008b]\u000b\u0085\u0085\u0013x\u00ae\u00b5\u00da\u00c1\u009fR\u00e9\u0095\u00c9\u007f\u001fEx\u00a8\u0097\u00f1\u00f0\u00b1\u0098\u00b8\u00d9\u001dkV\u001cZ\u0012bn\u00f82|\u00c6\u00825\u0084\u0081~^\u00fa\u00ac\u0002\u00ecz\u00cbNC\u00e1\u0003\u00ca\u00cb\u001a\u00cc\u00b9\u00bd\u0087\u0082>^\u00d7\nn\u001e+0M\u00f9\u00a3\"@\u00b9\u0003\u00afhbz\u00c6h2\u00a1@\u0000\u00f6\u0089\u00a5YJ\u0090x\t\u0081<jf5\u00b1\u00bf\u008c\\\u00f2\u00c1\u001aOec\u00b3\u00a5\u0081\u0087\u00b5\u00a8\u00bb\u00811\u0083=\u0080\u0017\u00fc\u00ba\u00b5\u00c8e\u00bc\u00ae\u00a9\u0018\u00c4(\u00c6\u00cc\u00b7s!\u00eb\u00c9\u00b8\u0090\u00b1\u0081\u001f\u00ab\u0097\u00d2l\u0000|\u00b8\u00c5N\u00be\u00c1HB\u00e5,\u00a2\u000b\u00afg\u00a1\u00c97z,\u0007\u00a4\u0006:\u000f\r\u00eb\u00c22\u00ac\u00b9\u00f8\u00e38;P\u00d9\u00fey\u0093\u00d1\u008b\u00df\u00bb\u00d1\u009eM\u00114o\u00da\u0003\u008f\u00ccc\u00d4\\\u00d2\u001c4\u008cN\u0092\u00b4\u00f1x\u0015V\u00aa\u00e3\u0018\u001b\u00fe\u0016!\u009c\u0007\u001fC\u00e2\u00ca(\u0016\"\r\u0005\u00de\u00d8;\u00d9Ba>\u00cf\u001d\u00ca\u00ec|\u00a0\u00b6\u001a^\u008f\u00fc\u00c4iX\u00edo]2\u00ca\u00fd\u00ce\u00cb\u00c8\u001cX\u008c\u00e5u\u00ed]\u0017\u00bc\u0018<\u00e7u\u00eaWW\u0087\u00a8\u00c5S\u00f7\u008f\u00dav@a\u009e\u00fd]\u00deH\u0098T\u00bc\u00f8\u007f\u00844\u009aKu\u0000\u0018\u00f6\u00e9c\u00b1\u001c\u0006\u00ba\u00eeU\u00a7\u0016%\u00d3\u00fdA\u00de\u00d9[\u008f\u007f\u0006\u00f6\u001be\u00faq]*\u00f6O\u0095t\u00d89W \u0001\u0015Z6\f4\u00e7\u00f75\u0082\u00eai\u00a4)4\"\u00b4\"\u0097o\u00cf\u00ca\u009a\u008d\u0002\tzW\u0084\u00be#\u0083\u0001\u00f1\u008d\u001e\u0084\u00bd\u00ff\u00f7F\u00c4l\u00d1j't\u0084[$\u00a9c\u00ce[h\u0090\u001a\u00e6 8\u0011\u00a5\u0003At\u00de2\u008b\u0000\u0085\u00e5i\u00a3<\n\t\u00dek\u0094\u00819\u00e9\u00af\u00c8\u009e\f\u000f\u00c0\u0019\u0094\u00fc\u000f$\u00c7\u0081+D\u00b7\u00bd\u00ea\u00fe\u009cJ\u00d9\u0018\u00caK_\u00b9\u00d0\u00e3\u00c02$|\u00c5\u0080\u00f1\u00eb\u0084s3%\u00cf\u00ea>K\u00ff\u00a1\u00aa<nM\u00187\u00d7\u00f9\f0Q\u00cf\u008e\u00b6\u00fbC\u00be\u0001\u00e9\u00cc\u00bd\u00c7mR\u008a\u008b\u00ce\u00b4c\u0004K$:\u0005\u00882r\u00be\u0003'+b\u0094p(\u001eS\u00b7\u00fdp\r,PR\u00cd\u00bf\u0080XC\u00d3\"\u00ce\u0006\u00cf\u00df\u00f7\u0004\u00d6\u00ad^A\u00d2\u00d5\u00c0c5\u00c4\u00b4\u001fC\u000f X\u0081\u00fc\u00f9iz\u0084\u0086\u00f2\u00e2/\u001d9\u00fd\u00f9\u007f\u00d0\u0091\u00bc'\u00e1\u00c3\u00a3!\u009cN?\u00ce%\u00d6\u007fQ\u0087\u00da\u00ed\u00d1f\u0096\u0090\u001e5`?2\u00f0\u009d_\u00c2c\u00ec\u00b3\u00c4^SP\u0097:\u00eb\u00b8\\\u00e8@G\u00eb\u00ee81\u0018=rz\u000b\u00af\u00abD\t\u0019p\u00abt\u00e7\u00d3 WP\u0090\u0097\u0012Q\u009f\u0005\u0086\u0096\u001b=)\u00b7\u00af\u00e6\u00b3.X\u00e88\u0081\u0005\u00c6\u00d7\u00bff\u00cb\u00cf\u0084u\u00a2\u00ac\u00e1y\u00baIA\u0016G\u00f0\u0014_\u00a0\u00b2J#T;\u00d3<3}\u00a9\u00ce+\u00c6K\u0093\u0004\u00ec\u009b\u008e\u0082\u00b3\u00e2\"\u00a1\u00bd]\u00dd\u00f0\n\u009d\u00f4\u00a8\bDU\u008b\u0098F\u00a0u\u00c1\u000e\u00d3\u001d\u00a2_q9$d\u00f4\u007f\u00a3&4L\u00ac7dl\u00ca\u00c1Q1\u001c\u00a5:\u00bdS\u008f\u00de\u00f1\u00eeb\u00bd\u00fe\u0001\u0082A\ba_5\u00ad0N\u0006U\u00fe\u001c\u0012H\u00d2\u00b7E\u00da\u00e1a:dP\u00190\u00da\u00ab\u00c3\u00fc\u008c\u0004\u001b5\u001e\u00df\u00db?\u00cdH,\u00af.\u00ca\u0083\u0005\"_\u00db\u0082RS\u001d\u00d7\u00c0\u00e4\u00fa%\u008b\u0081\u00de\u00a6\u00bb\u008a\u00ee\u008a\u0007\u00f4\u00b5V\u009e\u00e7\u0086\u00ccL2h\u00a5\u0002\u00ec\u00c5\u0005\"b!\u00ad~\u00e0\u008e\u007f\u001e\u00c7\u00bd\u00f4\u00049\u00ca\u0016A9Aw\u00c7\u00ddP\u00dd\u00b5\u00d4\u00adZ\u00a0\u00c9M\u00fc\u00cd\u00ba\u00c9\u00b7-N\u007f\u0095j\u00967\u00f3\u0019R\u0014\u0012\u0097\u00f8\u00993\u00afe~p\b\u00cc\u00f3j=O\u009e\u001e)\u0085\u007f\u00b8G2\u0017\u00cc?\u0096=|\u0099\u00a9\u00f7]\u00be\u0084/4\u00b5\u008b\u00df\u0080\u00c7\u00a9E\u00b0Z\u0019\u00cc\u00edh\u00d3\u0010o\u00e6w\u00d8\u00bf\u0089|\u0006\u00f2p\u0095\u00f694\u00cas\u0085\u00cf\u00cey|x\u0086\u00fb\u00ae\u0099\u00ff\u00f1\u00ff\u00bf\u00cb\u00f1\u00f0\u00b8 \u000e\u008a\u0092\u00bb\u00ed'\u00b27S\u00c0vW[\b\u0015\u0087\u00e4d@\n\u00a8\u00b6+\u00c8.\u00fd\u00ac\u00b0\u00e5\u000e,\u00a6\u00fdz2d\u009fZ\u00d8z\u00f6\u0003\u0092,a\u00dfc>\u009a\u000b\u00e3I\u00a1uZz6dh\u00dd!$\u00a2T\n\u00abu,\u00ea\u009a\u00cb!\u00ec\u00e4yCi\"\u00f9\u00dd\n\u00e2\u00d49\u00ad\u0003U\u00a2\u00cax\u00b7B\u0010\u008b\u00bcp\u007f\u00df\u00b7\u0014+e\u0093z'\f\u00deW{\t\u00d3\u008a\u00fe\u0097\u00b8D4b\u001a\u008b\u008b\u00a2\u00d01\u0004U\u00cc\u001e\u00f6\u00b5\r\u0093IC\u00a1,k\u00cb\u00ce#\u008b\"L\u00df\u00ca\u0091\u00bc#\u00dc\u00f5$\u0019(\u00cbY\u0019S\u0016\u00c2y\u001b\u00f9$#\u00d4\u00dep\u00a8\u00f8\u00809P\u00ac+mq\u007f\u000e\reay\u009d\u0086\u00bf\u00a5\"\u008d\u00be\u00d0U\u00a7\u0097\u000fQ\u00a7\u0001\u00ef=\u0083W\u00eb\u00b8\u0096f\t\u00d8\u0013\u001au\u00c6,\u00ea\u00be\u00b0\u00ab\u00f5\u00bb\u008d\u00b5y\u00d6\u0090\u00d3\u00ab\u0013t\u0080\u00e6/gY\u001fDy`d?\u00e3\u00bf\u00f3\u0094\u00d5]w\u0087.Fa\u0094\u0005\u0016\u00c6\u0004^\u00cb/\u00benS\u0006\u00e0\u0087`;\tk\u001doO4\u000b\u0095\u0003\u008e\u0096g\u009b\u00cd\u00c5B\u00d3\u00d5`\u0083\u009f\u0081;\u0099%'\u00ec\u0095N\u00c1\u00b1\u0015N\u0003h\u001e\u00a2\u0004\u009e4\u00b5\u001d\tS\u00a7\u00ec-\u0088_\u0093\u001b\u00b6\u00e9\u0097jsL`\u00c1\u00b8\u00faG\u00de\u00df\u0080\u00ad>\u00d4\u0088\u008b\u007f\u00ef\u00ec\u0089\u00dc\u00a1\u00a6\u00d83b/\r\u0098:\u00ee\u00b5f\u00b2P\u0085o\rk\u001cZ\u0004\u00f37\u00bc\u0083\u0086\u00af{\u00c6\u00fd\u0007uy\u00ac\u00ads4\u00c1\u0095\u00a0\u00e3l\u009b\ro\u00ac\u0087y0\u00ef@\u009c\u0082\u00e6OwV\u00e4{\t\u00bc\u00ef\u0098+;\u00a3\u0095+\u00bb5\u00a0\u0019\u00b0|\u00c4\u001a\u00c3\u00f2\u009d\b\u00e3\u00e7\u00a9\u009ap\u0096\u0007\u0012\u009a\u00c5\u0093\u0000\u009eb\u00c3\u00bb\u00db\u0082\u0083\u00f4c\u00ff\u0016\u00d6y\u0092\u00b0\u00bd\u00f7m\u0082\u00eaq\u00f7_\u0005\u009b\u00f7\u0012W\u009c\u0086\u00d9\u00ff\u0098\u00bf\\\u00e2m9U\u00a4|\u00d8=\u00cb\u009c\u00b3u\u0082\u0012#\u00e0\u0095\u009e\u00cc\u00cb\u00fb\u001f\u0014\u0097\u0086P\u00bfr\u001d;\u000e\u001f\u001b\u00b6\u0098\u00ad\u00a0):\u000e\u0096pW\u00c2\u009a(\u00bcg\u001a\u0084+I\u009f\"c\u00c1\u00e5c\u0085+\u0006\u0081[\r\u0082VS=\u00962O\u0000lP+\u00f6A\u00ab\u00e8\u0019\u00d9\u0006\u00a7)\u008at\u00a5\u00bdY\r\u0000[r\u0085\u007f\u001f\u00a4-\u00b7\u008b\u00dbq>\u00e8\u009f\u00f7\u00e3q\u00bb\u00eb\u00f6^nC^\u00a1\u0019\t;\u00b9\u0090\u0090\u00b02\u008a\u0084ce6)\u00a3z\u00d9\u00ae\u0095\u0099e\u0018w\u00ec\u009e\u001e57\u0098.\u0010(\u0094i\u00c5\u00bfeg'_\u00b1bC1W\u0094V6\u00e0\u00b5+fN(\bI\u008d\u0013H\u000b:\u00b0\u00d94\u007f\u0003\u00fe\u0091$$\u00c5\u00fc|\u0094^\u00ca\u009a\u00b3\u009d\u008b\u00d9)\u0017\u0010/1\u00aen\u009f\u008f_o\u0005\"\u008d\u00e5\u00a8W\u0015\u001f\u00e6w\u001b\u00ea\u00ad\u00d3\u00e1\u0010\u0095\u00bd\u0091\u0083a\u009a\u0088\u0084F\u00b7\u00c0Y{\u0093\u0012c\u00d6\u00bf\u008f\u00ccD]\u001fZ\u00e1\u001a\u009bw\u00dcB\u0006\u0095\u0084>\u00a9\u0086\u0011\u00cb\u00f9^\u008b9\u00ee\u00a6\u00e2G|\u00c2y\u00b1\u0014?\u00b2;\u00f1`M\u00d7\r\u00cdkJi\u009c{\u0015J\u0007^\u0006a\u00b0\u00e6\u00e1Kk\u00d2\u00d8o\u00ae\u001e\u00030\u00a0\u00de\u00d7\u00b7\u0087\u008e\u0085\u00dcb\u00ee\u0003\u00ffR\u0096\u00e4\u000f\u000e\u00c9`\u00e1\u0018\n\u009b\u0085\u00b2n\u000b\u00a9\u001f\u00818\u00e9{5\u0096\u00a6U\u0092\u0088\u0019\u00bf\u000e\b]\u00a5\u0092\u00cb\u0098$\u000f\u00ca2{\u00eb\u0018ZO\u00f5\u0007QV\u009f\u00ea\u00caQe\u000b\u00e0\u00d8\u00ebrN\u00dd\u00d4\u0005\u00c7/\u00ae\t\u00b5m\u00a2\u00fd\u001d:Z`\u001a\u00bbe\u0016\u00e6!F\u00a1\u00ec\u0011\u009a\u0017\u0088\u00901\u00c4)\u0005:\u00f4u^\u0082j\u0097\u00b2W\u009bx\u0096\\y\u0095%\u00cf\u00d5U\u0080\u00feb6\u001b\u0018\u00f9\u00eagB\u0080\u00efY\u00ff1\u009d\u00bfFV\u00a9\u00e1\u0088\u0014x\u0097\u00d8\u00d2\u00f8\u00baf\u0082c\u0090\u00ed'\u00dc\u00aa%\u009c\u008cJ\u00d0\u0083iu\u0086Y:\u001d#\u00c9H^\u00c5K\u00b41\u00afS\u00dc\u009f.\u00c9~\u00e3:\u00c0\u0007e\u001e\u00da\u00b6\u0084{\u007fX\u001c\u00bd-U\u00b9V\u001e\u00b7\u0006\u00e2\u00f9\u00da\u0000r<\u00d3n71~\u0080\u0080\u00a7F&\u00d0\u0089\u0093\u00bc\u009c@\u001b\u0000\u00c4\u0093\u00cfG\u0002\u00dd\u00c0\u00b4\u00da\u00e5b\u0080K\u0017\u00e9\u00f3\u00eap\u0092\u007fa\u00bc\u00a7\u00f5O6\u0007\u00d3\u00a9kcn\u00c8Y\u00b9+\u00d7\u00dffyP\u00bbS\u00e2\u009d\u00f1\u009b\u0091\u0095\u00edU\\\u00fa\u0098\u008f\u00fc\u00a1,n\u00a3\\\fq\u00b69\u00c7\u00cf\u0086\u00b5@\u00b7\u00b2s\n\u00d8Y\u00c2o\u0088\u00b2\u0083\u00a0H'-y\u0002i:0Z8\\\b\u00e3\u009c|QoY\u00fe\u001c\u00ca\u00dc\u008f\u00df\u0082v\u0082\u0001*B'\u0012\u00f9\u0081\u0096\u00f7'\u0091\u009fj\u00eabI\u00a73\u00e7\u00a9\u00ea\u0080\u00ee2\u00d7\u00fb\u0088\u00e9\u000b\u0000h\u00d3\u001e\u009a\u00fd q\nAM\u00b4\u00fa\u00f8X\u00d6\u0001\u008dqJj^>\u0094\u00f2e\u00d7C\u0084\u00d8_cB\u00c8\u00b4>|\b\u0091\u0013\u0085%\u00e9\u0011z\u0081\u00d3\u001b\u00aa1\u00b4\u00a0D\u00ddaT\u00ed\u00f3\u008ad\u009e\u00b7e\u00bc_7\u009dU\u00c2P\u00978\u00d5\u0013\u0007\u007f\u00fa\u0080\u007f\u00d8\u00ef\\<1*\u00c9:\u00c5`Xr\u00f3\u00edz\u00c5\n\\g\u00f0\u000e\u00dc\u00f4\u00c5\u001aH\u00bc]\u0081\u00ddu\u00f7=\u00be\u00c0\u00b7\u00e65%\u00eb\u0081]\u0014\u00f3C\u00e58\u00c9\u00c4\u0019\u00f6'Bp[;\u0095\u00b0G\u0017}\u00d8\u00df\u0010\u00b1\u0090\u00d1S\u00d3<\u00b6\u00ff\u0006\u00cfw|U\u009e\u00de\u0089N\u0093\u0017n!\u00a86\u00b3\u00ff\u00d6\u00b7\u00d1R\u00fd`\u00cf\u00a0\u00a2A\u0010M)fRg\u000b\u008e\u0006\u0001r\u0098ph\u008d\u00f3\u00bf\u0084\u00c1\u00daW\u00e0\u0092\u0094l\u00cdU\u00ba\u0080O\u009cXl\r\u00aa\u0011b\u00f21\u00d00\u00ed|\u00f9\u00ae\u00a1q9\u00c9\u00dd\u00f7\u00c96F\u00d9a\u00aa\u00e4\u00aa\u00e6{\u009b\u0093\u009b?\u0000Q\u00c1\u00f6|\u0014\u00f6\u008bM\u00f7\u00ef\u001a\u00e79@>\u0003\u0091\u00c4\u00a1H\f\u00df\u00be\u00fc0;M\u0019\u0083P\u0010\u00b7!\u009b\u0095K\u00fb\u00b6nW\u0013&\u00d8\u000e\u00ff\u00c6^\"\u00b4!\u0015\u00f42\u00fc\u0087\u00ab\u000e\u00a9\u0094\u00dd\u00ecD\u00f9\u0012Q\u0002\u00beb\u00e4\u00aa\u00f8\t\u000f= \u00d7A2\u00d0\u0084\u00b2\u00ef\u001fa\u00ddV\u001e\u00cb:C\u0006\u00bcF<\u000f\u00ba\u00cf\u0007\u00d2c\u000e9\u00ca\u00cc\u00c2kdW\bX\u009b\u00ad;\u009d\u00ae}\u00e7O\u00e6\u000b\u00c0\u00e6\u00bctZ\u00e6;a\u00f6^\u00e0Q\\\u00a9\u00c3S,\u0012\u00d5\u009d\u0094,{\u00dd4\u00a8u\u0017|\u00e3\u00e01u\u00fam\u00d5M\u00c4\u00b1hx\u00f7\u00de\u00cd\u0090\u001f\u0095\u0084V\u0006\u000f\u00b9\u00ee\u00ed\u00d2\u00cb\u008eh\u00ad\f^t\u00fe'\u00e2p\u00eb\u00df\u00dcZq\u00b5\u00e8,j\u008b;\u0087\u00d7V\u00de\u0080\u00e2Y\u00ae\u008e\u00c1\u00c8\u00be\u00d58c\u00e1W\u00a9lgj\u00a07\u00ae\u0013\u009b+cZ\u00a4\u00afBC\u00a1\u00e9\u00a1R\u0089\rh\rE\u00ef\u00a7\u0083)\u0093B\u009582S\u00c2\u0013\u00fd\u009fD\u009574K\u009e\f\u00f37\u00b7-8\u0006\u00df\u0010\u00fal\u00c50A\u00adN\u00cb\u00aal\u00e7/t(, Z\u001ah&\u00cb#\u00da=\n\u000e4Y\u00ec\u00ed\u0000\u0080\u00dc2{\u008ejs\u00a1\u00c7\u0096\u008cA\u00a8g+\u0001\u00f9MFrH\u0004\u0098\u00148\u00ae\u00cdz\u00c3\u008e\u00c3\u009c>\u00f1r\u0080\u00e7\u00df\u00b8\u008bQ\u00b2\u00e5;\u0018;\u00a0\u0098\u0011|\\\"\u0018A\u00d6\u00de\u00c3\u00f1`*\u00faUQ_\u0098w(\u0085\u007f\u0005\u0000\u009d\u0002z\u00e4 \u008e\u00f00\u0012\u00fc}1\u0013B\u0098@\u00bd\u009c\u0086\u00cf\u001d\u00d8\u008d| 2\u00b0T\u00f6%5\u001b\u0013\u0082\u00be\u00dfp\u00a4\u0015hk7s\u001a\u00a9\u00d1}x#\bVKM~4zW\u00cd\u00c5\u00b6]I\u00bd\u009e\u0018\u00de\u009ay\u000fD\u00e9ek</\u0081\u00eeRO\u0087\u0088\u00ce1\u0015;\u0017(S\u00a9\u00e5\u0093\u00e2\u00cb\u001f\n\u00bf \u00b8Ez9\u0004\u00f5}\u008f j\u00eb\u00bc\u00f8m?\u00cf\u00e0A\u00f5\u00b6s\u00c8\u0005\u0001\u00f0\u0010\u0096wb<8\u0007\u00f8KfA\u00d60\u00f5\u00ef\u00c5\u00ba\u00ea\u001a0\u00e1\u00e7\u0086\u0003\u001f\u0017\u00c8\u00d0\u009f3\u00b6\u008bPM\u00b5\u0014\u00c0_\u009a\u00db\u008e%\u00cc\u00d8#\u00bd\u00d6\u0092\u00cc\u00feyS\u0087\u00ec\u0018\u0092C/Q\u00d0N\b\u00196\u00dc}\u00e1/\u000b5X\u0015\u00fa\u0080k\u0015\u00db\u00d6l\u00d9\u00fe\\\u0093>\u00ee\u00fa\u00bb4a\u0001\u00edJ\u00fa\u00f5\u00f0\u00d8[\u0018\u00be,9\u0003r\"\u0001\u00cc\u00a9u\u00ddE\u00acFC\u008f]b\u009c\u00a4\u0014\u0099\u00c9R$?=I\u008e\u001c\u0000\u00d6\u0086\u00c1\u0098\u000e\u000ez\u00a4\u00ad\u00a5\u00d1\\\u00b0E),\u00a5xo\u00f1E)<\u00ecX\u00fc\u00ff_\u0086\u008b\u00a2\u00f4\u00bc\u00db\u00d9@R\u00b4\u00fc]Q\u008e8\u009c\u00c5\u00ae\u00b26\u008b\u00c8\u009a-\u00a4\u00f7\b\u00af\u00d1\u007f\u00a43\u001f\u0097\u00f2\u00b7[\u0088\r| \u00bd\u0097\u00e2\u00ae\u00be\u00d1K\u00b2\u00e5[\u0019\u00eb[\u00c3\u00de1\u00c0\u00e2\u00c9\u0090\u009c\u00eb\u0081.^\u00aaY\u0096\u0001\u009c\u00c8}\f!\u007f\u00d6\u00bd\u00d8\u00e1S\u00ef\u00eb\u00b2\bc/9\u0004\u0090\u0084\u008fT?\u00cb\u00aa\u00b9\u0095R\u00ca0\u00db\u00c6\u00da_\u009a\u008a\u00ec\u00dd]\u00e9\u00c4\u00f0\u00eeNO\u0088\u0093\u00eafN\u0007:\u00ca^YE?q\u008ctM\u00a8\r\u00c8\u0099N\u00b0\u00c4x\u00c1\u008d\u00b4\u00e5\u00a2\u0082\u00ed\u00ef\u00d0\u00c0|T\u0002\u00a2\u0004M\u00be2};l~\u00a6\u00c4\u00cf\u00cf;\u00e2\f\u00ba\u00bb k\u0003\u00be\u001f9V%\u00e2\u00a3:\u00ac\u001b\u00c2q\u000e\u0080\u0098\u00ce\u00b19)\u00fd\u00a8\u0002;\u001d\u00c6a5*\u00c1\u00b3\u00b8\u00ba\u0096\u0094\u00ae\u00be\t\u00cb\u00e9\u009a\u00d9e\u00c1\u00d5=W+\u00f8\u00ac8\u0081\u00a2Gg\u00ce\u00ae\u00b3\u008e_\u00a2\u00ab\u00aa\u008f3\u00f4\u0002\u00bd^\u00d8\u00c5\u00f4\u0001Hb@\u00bc?\u00e9,a5\u001c\u00c2{\u00fd\u0087K\r\u00d0u\u0000?\u00bfY^\u008e\u00c7\u00fd\u0015\u00a6K\u00a3\u00e9%\u009f\u0006\u00cc\u00e1W\u00f0mX\u00d8h\u0084.\u00a4\u00bd\u00c1_\u0082\u0011\u00dbu\u00b6\u00daF\u00e8\u0015\u008bR\u0002\u00c5\u00be\u00ab \u00cd\u001d\u00edP\u00b3,\u001d4Z\u0099\u00bc\u00a7\u00fa\t*\u00b1[\u008c\u001f\"\u0011\u00fe\u00cf\u00dcn\u00c2\u007f\u00a9\u001c\u009c{Z\u00c9\u00ce\u00e9\u00b4\u00dc\u00fbaG\u001e\u0083+\u0089\u0081\u00b7t\u00a7u#h\u0015\u009e\u00d8U\u00d59\u009f\u0093\u00cd\u00d6~\u00fd8B\u00963\u0080e v\u00de~\u00a7]39t7.Z\u001a\u00a2\u00fe\u00d7\nb\u000b\u00a5\u00ca\u00ff\u0097\u00ac\u00ad\u00d1'\u00d3\u00cd\n\u00a3\u0003%5\u0086\u009a\u00b0h\u00a2\u0088S\u0095\u001b4$7\u00d2\u0002'\u00af\u00c5\u00d6\u00fd\u0098\u00fa3\u008b:aKe\u009a\u00fa\u0083\u00c9\u00f8\u00ea\u00b6\u00bfB\u009b>h\u00a8\u00fc\u009e\u00fa\u00e9f\u0005\u0091\u00a3\u00c3\u00ed\u00a8\u00c4\u0083pkd\u0010\u007f;\u00e4\u00fe\u00c7\u00ef\u0084Z7\u008f\u00c4G~f4\u0082\u00bf\u00017\u00a4R`\u00f9JZ\u00f6f\u0005)\u00b2\u00d26\u0014E\u00e8\u00d3\u00b5Y\u0093\u00d7\u00dc\u00d8Z^h\u00ebn$;\u00f4S\u00f3(\u00cd\u00a2\u00de\u00f9d,\u00ff6[\f\u00e2\t\u0005\u00b4\u00ff\u0092\u00a1z\u00b72#\u0007V\u009e{\u00ddA\u00d5\u00b7\u00ec\u009d\u00da\u00a4\u009b\u00c3\u00bd?\u009d\u00d6\u0082TUs\u00a5\u009b\u00a0\u00a4=\u009f\u0013\u00af\u00d9\u009fd\u008a4\u00e8\n\u00f4\u0086+\u00b4\u00fc\u00cf\u008e\u00c7l#f\u0084\u00d4\u00b6\u0099\u0092W$\u001d\u0015\u00c5\u00e5\u00d0\u00fa2y\b\u00aa\u001a\u0086S\u00f6\u0095%\u001a\u00e0\u0094\u00d9L\u00ef \u009e\bE\u00a8\u00e9\u00a7\u001d\u00ea\b%\u00c5\u00c3Q\u00aa\u0090\u00d0\u00b1zz\u00faq9Xf\u00c3L\u0011\u00d0/(\u00cb\u009f:\u0014,\u001b0Vm\u00b1\u00bb\u008b\u00a3\u00d6\u00e5\u00e5\u0095\u00b0\u0092\u0004e\u00fc\u00d2#\u0095\u00d0S\u0013L\u00d7DF?$\u000e%\u0095\u00ff\u0013'z\u0019\u008c\u00bd\f\u00e2\u0018\u00fd\u00d2\u00d5\u008e\u00b3J74>\u00af\u000f0\u00a9B+\u007f\u001b6[\u0096\u00c12\u0092^\u00f6\u001c\u00fc\u00f8\u007f\u0094\u00b3\u009a*f\u007f\u0086j~\u0080|\u0014\u0093w/\u00be\u008b\u0015\u0097\r\u000b]X!\u00c3\u008a\u00fa'\u00b9\u00f23F\"\u00ddo%\u00e1;\u00af\u00f5[\u00c46\u00ad\u00aaa^:\u0081TO\u0089o\u009d\u00c1G\u00c5\u00e0\u001c\u00e8\u009a>\u00f6\u00df2\u00fb\u00d1\u00d7Z\u001e\u00a3\f\u00e82e\u00da\u001ci\u00eaz\u009d\u008bN\u00c6\u0093\u00bb{\u0013\u00e7\u0090\u0013\u001aP\u0001\u0002>\rFz\u00f0\u00cbkN\u00ee\u00c4\u00d2\u001a\u001f\u00b8\u00e7\u00b5\u00aa\u00db\u00a8@u\u000b\u0006F\u00ba+43\u00fa\u009eC\u00fc\u00a1\u00efrU\u00d6\u00b5\u0098\u00ac\u00cf\u00a4\u00e1\u0004\u00a6w\u00b6\u00f9\u00c9\u00cb\f\u00ef\u00fc=\f\u00edYp\u0085O\u0088M\u001e\u00d4Z\u00b8\u00b9\u0080\u00dcQubq\u00b06\u00f2n\u001c7\u00cc\u0086\b\u0002\u0019\u0019<3\u00ae\u00a2\u0098\u0011\u00d3\u000b\u00ac\u00e9z\u00fa\u00fe g\u00e1\u009e\u00e6\u00d6\u00e0\u001b\u00bf\u0097\u0015[\u001d\u007f/#\u0014<\u00c9K\u00a9@-n\u00b4g\u00d5\u0012\u00f7\\\u009f\u00ac\u0018t\u00fenv\tYJ\u000e\"\r\u001b\u00b3G\u0000\u0092\u0004\u00cc,\u00fd\u00f8}\u008b\u00db\u0016\u0089\u00e4\u008a\u00e4\u00adm?\u00f9~\u00beG{t\u0086\u00c0D\u00f05i\u00c3t\u00ad\u0013\u00d8X|C\u0082\u00f6\\KX\u001b\u00a5A\u0084\u00ba\u008c\u00ba\u00a0\u00fb\u000f\u0091\u00d4\u009d\u00cc\u00fd\u00a5\u00c4\u0096wC'Q\t\u009db\u00bf\u0088\u00e78\u00a7b\u00cb2\u00c9\u0084\u00c04\u00denEp_\u00f1'\u00b9\u00b0\u00a4O:\u00a4\u00ee\u008c\u008e\u00c9z\u00ad\u00e7\u00b0\u00cd\u0085\u0087\u0007u\u00e4\u008cQ+\u000b\u00bb\n\u00f6\u008eOZi\u008b\u00de\u00f5\u0092A\u00df \u00e7\u00c4\u00bb\u00b1\u009a\u00fb\u00d4\u00ddv3\u00dfB\u0019\u001b\u0084\u009b\u00f5?\u00a6\u00be\u00d7\u00b6\u00e0\u00bb\u007f\u00d3Q]\u00b4\u008d\u00ef\u00f3:\u0014\u00d9\u00cd\u0014b\u00b99\u00b21&+:\u00d6S\u00d3\u0083R/Oy\u0085\u00f9-\u00ac\u0092\u008d\u009d\u0080D{\u00e6r\u008e|\u00af>\u0082\u0098/,\u00e8\u0087a>\u00a4\u00de_\u0097\u00ab\u00be\u00f6\u008a\u00a4\u00ba\u00ac\u00d0\u0093\u0094\u00fa\u00bbc\u0004\u00dc\u00c5\u0017\u00a6\u00fb\u00051\u00e7\u00d8\u0087\u001b\u00a9#\u0085W\u00bd\u0096\u00ef\u0081}\u00e3\u00a0,\u00a3\u00d1q@-,hh\u0084\u00ed%\u008fc\u00a7\u001a\u00ffVEv0\u0015\u00e3\u0082\u00d9\u009b\u00f8~\u0014H\u00faR\u00e5\u00ca\u00d8w\u00a3\u00dfI\u00bd\u00ad\u0083\u00afp\u0097\u00ed\u00af[T\u0087\u00dc\u00b10'i\u0098s\u0006\u0092n&<\u001b\u001b\u009aDc\u0011\u000b\u00e7\u00d67{\u00e6#\u00b5\u00b1\u00e1~\u00e2z\u0007\u00a5\u0089@\u00ff\bb\\\u00dc7\u00d6\u009e`1\u00f1\u0006\u0001\u00ffj\t\u00ff\u00b1B\u00d0\u00ef\u00f74\u0014\r\u00bcLp\u008e+*\u00f0cR{\u0097T\u00ff'\u0018\u0090\u00a8\u00d9\u00e5\u009d\u00c6\u0098\u00f5\u00bb\u00dc\u00d6\u008f9\u0001\u008a&a\u00fb\u00b2\u00b4-\u00f8\u001cM\u00fc\u00a6y\u00a5\u009dBq\u0083e\u00dc\u0089\u00dfQ\u00cd\u00f27/K\u009a\u00d9\u007f m5\u00c0\u00c93@\u0098H-LI\u0012zP\u00db[\u0004\u00f2\u0096_\u00e4\u00e5\u00c5\u00ba\u00d5\u001bV@\u00fa\u00b6\u0018t\u008dT\u0092w\u00f5=\u00bd\u00f2i\u001cYO\u00d6\u00af\u00ea`J\u00e9\u0091\\\u00f4t\u001bQ-Jb,O\u0005\u00ef\u00e8\u000b\u00c1\u00a2\u00b1\u00d1\u008d\u0090\u00e7\u00fc\u0016\u0091\u00a94\u0002\u00d7Y\u0096y\u0019kb\u0097\u00e8\n\u0092\u00c7[]\u00d4(P\u00d9*w\u00f2\u00e8\rU\u00a2\u0085\u00fb*\u00bcx!\u001b\u00f3\u00bc\u009d\u0007\u00b8\u0098\u000b\u00ff-\u00cf\u0018\u00d5\u00da*?\u00d2\u0094)\u00da\u0094w\u0080q\u0090g\u0010g\u008fkD\u00a9*\u00f2\u001bY\u00ae\u00ec\u0088}d@\u00f7\u00f9\f\u00cb\u00e6\u00c3\u00d0\r\u0000\u00fb\u00e1A\u00ef\b,\u009a\r\nR\u00bf\u00d8Uo\u00e5\u008d\u0004\u0001\u00a5\u0084\u0097u\u00ff(\n\u000eZ\u001f.\u00ed\u00e0$\u00dd\u00c6\u00cc\u00c7\u0013\u0086\u00f0\u0018m:v>\u00b99\u0099\u0003\u0000-\u00b5\u001d\u00fe\u00c5\u00bd\u0005*\u00cb\u00f5z\u0097\u00e1mb\u00f1g\u008c\u00d2D\u0087\u001b\u00bf\u008f\u0087\u0004Rf>\u00de\u00b3\u00b1\u001f]y\n\u00c6dm\u00fb\u008b\u00fb\u0083\u00d4\u001c\u00fek:5\u000bT\u00be\u00d1\u00e6\tD\u00c0\u001cR^\u00bdt\u00fbl \u0081\u009e(4\u0012\u00f3]\u00f9\u00eb\u00da\u00c5z\u00a2\u00a7\u00eb\u0002\u0019i\u00ba\u00d9\u00df\u00be\u00cd\u00bf^H.\fD\u0092\u000f\u0018\r/\u00d2\u00f67\u00c3\u00d0\u00b1\u00c4\u00b9\u008bG\u00bd\u00c6-\u007f\u0099\u0017\u00a2f\u00e5C\u0095\u00be\u00f7\u000e\u00b7\u00ea\u0013\u0093\u0011\u00ee\u008b\u00c0\u00d5Tq\u0082Jq\u0013\u00c2\u00b0\u0099\u00fc?\u00b3\u00b1v\u00c8\u00c7Y\u00a3\u00a4\u0000\u00d6\u00a6$\"^\u00c7\u008f\u00f6\u00ef\u00e0\u00d1\u00b4\u0088(1\u00cf\u00c0\u0013:\u008b\u00ce\u007fL\u00c0\u009b\u00e4\u0003\u00a7\u00d8\u0098\u00f7o\u00d7\u00f9=\u00cd#\u00a7{\u0005\u0083\u0090~\u00b6\u0085\u0013\u0016\u00119\u00bc\u001a\u00ceM\u009f\u000fJ\u00e4W\u000e\u0091U9\u0085\u0003\u00e2\u00f1[\u0081\u00e7~\u00d7O\u00c8m\u00e6V\u00d4\u0089Sd\u00cc\u00c2J\u0082\u00a5\u00eeyz\u00aa\u0017-\u001f\u00f8zw\u00db<\u00bd\u00c3\u00eeC:\u0099v\u00d5\u00b2\u00ba\u0082\u00b9\t\u00a7y\u0094";
                var5_4 = "\u00b4_IvD\u0014\u0082\u00a5&l\u00b8~']0'\u00c6d\u0099\u00e8\u00e4'L(\u00b9\u0096\u00f0Y\u00ad\u00fc\u0099\u000f\u00fe/\u0010<\u00bc{o'=\u00ed\u00a4:2\\\u00a3\u0082#w8\u0014uW\u00e0H\u00af,\u00b2\u00c8\u0085\u001c\u0006\u00b6r~\u00f7\u0097\u00fa3\u0015M}\u0095t\u00ed\u0089\u00db\u00b4\u00a1\u00da2\u0011\u0084\u00fb)\u00fc\u00ee7\u00e8\u00d4P%!\u00a0g\u00cf.KUH\u008b\u0005Q\u00d9\u00f98+\u00d8\u0096\u00dc\u00bd=\u00b7\u00f5\u00c2\u0081\u00b5\u008c\u0098\u00d1^\u00de\u001d\u00b7\u00b9K\u00cb=\u0013\u0005\u00b0M\u00cdFv\u00efSc+\u0011\u00cf\u00bd\u00d7+\u00c2\u0001i\u0018\u00bf\u00d3\u0017\u00b2\u00d1\u00fa\u0016o\u00b9m\u00cd\u008f~\u00ffw:\u00fe1\u00b1eF`\u00b1\u00b1-\u001a@\u001fq0F\u00d7\u00f5\u001fR\u008b\u00bfV\u0016\u00c4Jx\u0099\u00e9\u0085Q\u0006\u0001o \u008c\u00de\u00b4\u0087\u00fa\u00fc\u00eb]E\u00e3\u00ee\u00f3\u0005}&\u001dr\u0087}\u00ee\u00ceiho\u00a5\u00ac7\u00e0\u00c6\u00bfv~\u00fab\t(\u000f\u00ee\u00af^\u00bdn\u00a0\u00944Fp\u00a4\u00c4x\u00e5\u00e1\u0010\u0098\u00e5\u00ac\u0088\u001c\u00e0\u00ef=lH\u0081>Vd@\u00e1`\u00977\u00a4l4\u00d6yV%A3A\u001e\u008e\u00e0\u0091\u00e0\u0014\u0007\u00adPV@ a4t\u00bd&\u00a3c\u000f\u00fd@!\u00ceRl[\u00f4~Q\\{V\u00c0\u00a9\u00baU\u00ed\u00c1\u0015\u00ef\u00e0\u007f\u00d6\u009b3h\u00c3\u0000\u00f9.\u0081\u0083\u00a7+\u001a\u00f1\u00cf'\u00dd9tK\u00ffTK\u00fc\u0093\u008a\u00a5\u0004s\u00e1}\u00c4.\u00b2TX\u00fd\u00e6\u00a1\u00dd\u00b4\u00c3\u00cc\u0013+\u001c\u0095\u00cc\u00cb\u00f9o\u00db\u00ec\u009f\u00b2\u00e5[\u00fey\u00cb\b>\u0081\u0000\u0085\u001d3\u00f9\u008c\u0081\u0097\n\u0003\u000f\u00fd\u00d7\u00e3o@\u009e\u0016r\u00c9\u0000\bhI\u0002$\b'\u00e2\u00db\u00d7\u00cc+\u0007\u0086\u00c22\u00eb__X\u000e(z\u00cd5\u00b2'\u00e0\u00b7\u001by]\u00c72\u00f6N*(j\u00e7!n\u008c,_\u00ea\u008b\u0080\u00cd\u00e3\u00e1p\u00c0\u00ea\u00cbj(r\u0099:l\u00d59\u00f7\\)<\u00d1\u008b\u00d7\u000bf\u00f2\u00f5kqdQ\u00d0\u00f9\u00e1A\u0010\u0083\u00d6\u00f9\u00b2\u00f8\u00b9\u0012\u00b6\u008c\u00a8\u00985\u001f\u00ff\u0083\u00dc3X\u0018G\u00e7\u001b\u00d0\\\u00ffd\u00d5\u0082\u00b2\u00b1K\u0011\u0086I\u00cc\u00a7\u0017\u0096\u0018\u00a7\u00fa!\u0000a\u0082\u00c8\u00cc\u0010K\u00a7\t`\u00e0\u0010j\u00035\u0090\u0007\u0000Q\u00de:f\u001e\u00b4\u00c8\b\fg\u00eb5\u00a6v\u00829\u001b6\u0013\u00c8\u00a8\u00a7rr\u008b\u00e2\u00cb\u00d3e\u00d7\u009a}\u00da\u0086\u00cb\u00ef\u00b1j8\t\u009b57p\u0087\u0004<\u00c4\u00e4\u009d\u00d7\u008c\u001cf\u00f08\u0006\u001a&\u00bf\u00d3u\u00d69\u0093S\u00d5U\u00a6\u00e0\u0012\u00c2\u001bel=\u00d8\u00a23\rr\u00f4/y\u00d5\u008d4\u00c0\u00be\u0083{\u000b)C\u00e7\u0013\u0098\u00d1/\t=d\u0013\u0097\u00eb\u00b2\u00cd\u00b2\u00dc\u0094\u00ea\u00be\u0085X\u0012\u0003^\u0006\u0010q\u00c3w\u0013\u00b48\u0093\u0006\u00e3\u0005D'\u00da\u00dc\u00fb\u0083tBV\u00ce\u00db\u0090\u00ad\u001b\u001a\u00a1e~\u0004P\u001fui\u00ff\u00a86q\u0011thK\u00fe\u00ea\u00b1\u00bc\u00e8\u00d2\u001a\u00a3G94\u00e0\u001f`\u008f\u00d2\u00f0\"\u0017\u001c\u000f\u00d4dy\u0098\u00a52m\u00d6%\u00d5]\u00d8\u00f7s\u0088O\u00dc\u00b3\n\u0085\r\u001a\u008b\u00c7T\u001dj\u0086\u009f\u0087KN\u00b3\u00edm\u00ebp\u00eb6j\u00e7S\u0091f\u0080U\u00c3a\u00e4\u00ca\u000fJ-N\u0092k\u0012\u00f9\u0081\u00c3\"\u0000\u00e1\u00ec\u00aa+0\u00cb\u00a6\u00a6\u0004\u00c2\u00b8\u0002\u000f\u00dd\u00e1|<\"\u00d8\u000f\u00d5\u00b5-\u0010\u00bf;\u0016s\u00a0T\u00d8F\u00b3`\u008dbV\u00b2\\\u00c33\u00fb\u00f3\u0081\u009d\b\u00ee\u00c6{\u001bM\u00ef\u009d\u00dd\u00aa+F\u00d3\u00eay\u008c\u00d5?\u00ecf\u00f6\u001f\u0000\u0090\u008b\u00ab|\u00b8\u00e1M\tqSb\u00ec\u00a8\u00c6\u009e#\u00b1\u00d0\u00bd]\u00ed\u0015\u0086\u00c9B\u009fP6|\u00b5\r@\u0081\n\u00b7Z\u008f\u00ed\u008dR\u001b\u008e\u008e\u0004^\u00035\u0087\r\u00f1P\u008b\u0000]\u00d2\u00bdm\u0019\u00a8l\u00be\u0095\u00fa,\u007f\u00e9?\u0080\u008d[1b\u00ff\u00b70\u00d9\u00ed\u00a7\u0017`\u0083\u009ap\u00f2r\u00c8\u00a7\u00da:\u00d27\u0011-(\u00df$f\u00a9/\"\u0090\u00a5 \u00b4\u00df.\u001b\u0081\u001d\u001by\u00b1\u009b\u00d88\u00d5\u0092C2\u00a5\u00d1?&\u00d7\u0084%\u00bb\u00df\u00af|>`\u00e6\u0011}\u009f\u00cb\u00b5\u00bc\u00be%\u00d7h{tr\u00b5\u00fc33w\u0014Z0\u00dc\u0080W\u00a5\u00f7\u0010\u00e1k\u008b>\"\u00ec\u00fd\u00a5jW,\u009d\u00b2\u0013\u00c1\u00f8\u0000\u00d7\u0014\u009b\u000b\u00a3\u00c1\u00ca\u0092\u0010b\u0098\u008ffD\u000f\u00a8\u0082\u00cb \u00efH\tD\u0080\u00c4\u00e0\u0016\u00e4\u0082\u00f0\u00e0z\u009c3\u0096n\u00d7\u0086\u00ae\u00f4\u0003\u0097\u00b2\u008a\u00d0\b1?p\u00a9T\u00c0\u00c7\u00a5\u00ceJ9:\u00abjo\u0014\u00eb=I\u00ea\u00d5'\u00f8\u00ae\u00c1O4>[\u0080\u0094P\u008f\u0019\u00b08\u009eG\u00a1U\u00ea\u008d\u00c1\u00cb7\u00f7\"\u00ba\u00e0 \u000fm!\u00c1G\u00a6-\t\u00aa\u00aeK\u00a4\u0089\u0003\u001dM\u0082\u0012\u00abm\u00d8\u0080\u00c3\u00f3H\u00cd\\\u00a3\u008e\u00c3d\u00dd\u0089:\u0084\\{\u0096\u0013\u00a9\u00af\u000f\f\u00be\u001b\u00bd\u00f0\t\u00abm\u00902ej\u008e.\u009eh\r5h\u0018\u00e5#Y$\u001b\u0013\u00b5\u00c6t\u000b\nv\u0082\u00ae\u00d8\u00cd\u00c0\u008a\u00b6\u00b6\u00f9\fC\u0082\u0098\u00da\u00c4\u009dnO\u00ddm@\u00a1\u00d0\u00ba\u00b1\u0085\u009a7\u00f6\u00ad\u00b1`\u00e3{s\u0093+\u009a\u00afN#\u00c8\u00c1\u0082\u00de#\u00e4,d\u00fc\u009e\u001crpV\u00d5\u009b\u0017j.\u0081\u0083\u00c5=>\u0093\u008c_\u0088\u008c\u00f2^\u00b8\u00fd\u009fl\u00e4A\u0092\u00d2\u00a0\u00ef^\u0010\u00d1\u0083L\u00d9\u00a5\"\u00a16\u00c3]VG+\u00bd[H]\\\u00bfs\u0080N\u00fa\u00ff\u0097\u0002\u00fc\u00ddi\u008d\u00b1u?3\u0083\t\u00f2\n\u0010\u00cf\u00c6=\u00b3\\\u00eb\u008b]\u000b\u0085\u0085\u0013x\u00ae\u00b5\u00da\u00c1\u009fR\u00e9\u0095\u00c9\u007f\u001fEx\u00a8\u0097\u00f1\u00f0\u00b1\u0098\u00b8\u00d9\u001dkV\u001cZ\u0012bn\u00f82|\u00c6\u00825\u0084\u0081~^\u00fa\u00ac\u0002\u00ecz\u00cbNC\u00e1\u0003\u00ca\u00cb\u001a\u00cc\u00b9\u00bd\u0087\u0082>^\u00d7\nn\u001e+0M\u00f9\u00a3\"@\u00b9\u0003\u00afhbz\u00c6h2\u00a1@\u0000\u00f6\u0089\u00a5YJ\u0090x\t\u0081<jf5\u00b1\u00bf\u008c\\\u00f2\u00c1\u001aOec\u00b3\u00a5\u0081\u0087\u00b5\u00a8\u00bb\u00811\u0083=\u0080\u0017\u00fc\u00ba\u00b5\u00c8e\u00bc\u00ae\u00a9\u0018\u00c4(\u00c6\u00cc\u00b7s!\u00eb\u00c9\u00b8\u0090\u00b1\u0081\u001f\u00ab\u0097\u00d2l\u0000|\u00b8\u00c5N\u00be\u00c1HB\u00e5,\u00a2\u000b\u00afg\u00a1\u00c97z,\u0007\u00a4\u0006:\u000f\r\u00eb\u00c22\u00ac\u00b9\u00f8\u00e38;P\u00d9\u00fey\u0093\u00d1\u008b\u00df\u00bb\u00d1\u009eM\u00114o\u00da\u0003\u008f\u00ccc\u00d4\\\u00d2\u001c4\u008cN\u0092\u00b4\u00f1x\u0015V\u00aa\u00e3\u0018\u001b\u00fe\u0016!\u009c\u0007\u001fC\u00e2\u00ca(\u0016\"\r\u0005\u00de\u00d8;\u00d9Ba>\u00cf\u001d\u00ca\u00ec|\u00a0\u00b6\u001a^\u008f\u00fc\u00c4iX\u00edo]2\u00ca\u00fd\u00ce\u00cb\u00c8\u001cX\u008c\u00e5u\u00ed]\u0017\u00bc\u0018<\u00e7u\u00eaWW\u0087\u00a8\u00c5S\u00f7\u008f\u00dav@a\u009e\u00fd]\u00deH\u0098T\u00bc\u00f8\u007f\u00844\u009aKu\u0000\u0018\u00f6\u00e9c\u00b1\u001c\u0006\u00ba\u00eeU\u00a7\u0016%\u00d3\u00fdA\u00de\u00d9[\u008f\u007f\u0006\u00f6\u001be\u00faq]*\u00f6O\u0095t\u00d89W \u0001\u0015Z6\f4\u00e7\u00f75\u0082\u00eai\u00a4)4\"\u00b4\"\u0097o\u00cf\u00ca\u009a\u008d\u0002\tzW\u0084\u00be#\u0083\u0001\u00f1\u008d\u001e\u0084\u00bd\u00ff\u00f7F\u00c4l\u00d1j't\u0084[$\u00a9c\u00ce[h\u0090\u001a\u00e6 8\u0011\u00a5\u0003At\u00de2\u008b\u0000\u0085\u00e5i\u00a3<\n\t\u00dek\u0094\u00819\u00e9\u00af\u00c8\u009e\f\u000f\u00c0\u0019\u0094\u00fc\u000f$\u00c7\u0081+D\u00b7\u00bd\u00ea\u00fe\u009cJ\u00d9\u0018\u00caK_\u00b9\u00d0\u00e3\u00c02$|\u00c5\u0080\u00f1\u00eb\u0084s3%\u00cf\u00ea>K\u00ff\u00a1\u00aa<nM\u00187\u00d7\u00f9\f0Q\u00cf\u008e\u00b6\u00fbC\u00be\u0001\u00e9\u00cc\u00bd\u00c7mR\u008a\u008b\u00ce\u00b4c\u0004K$:\u0005\u00882r\u00be\u0003'+b\u0094p(\u001eS\u00b7\u00fdp\r,PR\u00cd\u00bf\u0080XC\u00d3\"\u00ce\u0006\u00cf\u00df\u00f7\u0004\u00d6\u00ad^A\u00d2\u00d5\u00c0c5\u00c4\u00b4\u001fC\u000f X\u0081\u00fc\u00f9iz\u0084\u0086\u00f2\u00e2/\u001d9\u00fd\u00f9\u007f\u00d0\u0091\u00bc'\u00e1\u00c3\u00a3!\u009cN?\u00ce%\u00d6\u007fQ\u0087\u00da\u00ed\u00d1f\u0096\u0090\u001e5`?2\u00f0\u009d_\u00c2c\u00ec\u00b3\u00c4^SP\u0097:\u00eb\u00b8\\\u00e8@G\u00eb\u00ee81\u0018=rz\u000b\u00af\u00abD\t\u0019p\u00abt\u00e7\u00d3 WP\u0090\u0097\u0012Q\u009f\u0005\u0086\u0096\u001b=)\u00b7\u00af\u00e6\u00b3.X\u00e88\u0081\u0005\u00c6\u00d7\u00bff\u00cb\u00cf\u0084u\u00a2\u00ac\u00e1y\u00baIA\u0016G\u00f0\u0014_\u00a0\u00b2J#T;\u00d3<3}\u00a9\u00ce+\u00c6K\u0093\u0004\u00ec\u009b\u008e\u0082\u00b3\u00e2\"\u00a1\u00bd]\u00dd\u00f0\n\u009d\u00f4\u00a8\bDU\u008b\u0098F\u00a0u\u00c1\u000e\u00d3\u001d\u00a2_q9$d\u00f4\u007f\u00a3&4L\u00ac7dl\u00ca\u00c1Q1\u001c\u00a5:\u00bdS\u008f\u00de\u00f1\u00eeb\u00bd\u00fe\u0001\u0082A\ba_5\u00ad0N\u0006U\u00fe\u001c\u0012H\u00d2\u00b7E\u00da\u00e1a:dP\u00190\u00da\u00ab\u00c3\u00fc\u008c\u0004\u001b5\u001e\u00df\u00db?\u00cdH,\u00af.\u00ca\u0083\u0005\"_\u00db\u0082RS\u001d\u00d7\u00c0\u00e4\u00fa%\u008b\u0081\u00de\u00a6\u00bb\u008a\u00ee\u008a\u0007\u00f4\u00b5V\u009e\u00e7\u0086\u00ccL2h\u00a5\u0002\u00ec\u00c5\u0005\"b!\u00ad~\u00e0\u008e\u007f\u001e\u00c7\u00bd\u00f4\u00049\u00ca\u0016A9Aw\u00c7\u00ddP\u00dd\u00b5\u00d4\u00adZ\u00a0\u00c9M\u00fc\u00cd\u00ba\u00c9\u00b7-N\u007f\u0095j\u00967\u00f3\u0019R\u0014\u0012\u0097\u00f8\u00993\u00afe~p\b\u00cc\u00f3j=O\u009e\u001e)\u0085\u007f\u00b8G2\u0017\u00cc?\u0096=|\u0099\u00a9\u00f7]\u00be\u0084/4\u00b5\u008b\u00df\u0080\u00c7\u00a9E\u00b0Z\u0019\u00cc\u00edh\u00d3\u0010o\u00e6w\u00d8\u00bf\u0089|\u0006\u00f2p\u0095\u00f694\u00cas\u0085\u00cf\u00cey|x\u0086\u00fb\u00ae\u0099\u00ff\u00f1\u00ff\u00bf\u00cb\u00f1\u00f0\u00b8 \u000e\u008a\u0092\u00bb\u00ed'\u00b27S\u00c0vW[\b\u0015\u0087\u00e4d@\n\u00a8\u00b6+\u00c8.\u00fd\u00ac\u00b0\u00e5\u000e,\u00a6\u00fdz2d\u009fZ\u00d8z\u00f6\u0003\u0092,a\u00dfc>\u009a\u000b\u00e3I\u00a1uZz6dh\u00dd!$\u00a2T\n\u00abu,\u00ea\u009a\u00cb!\u00ec\u00e4yCi\"\u00f9\u00dd\n\u00e2\u00d49\u00ad\u0003U\u00a2\u00cax\u00b7B\u0010\u008b\u00bcp\u007f\u00df\u00b7\u0014+e\u0093z'\f\u00deW{\t\u00d3\u008a\u00fe\u0097\u00b8D4b\u001a\u008b\u008b\u00a2\u00d01\u0004U\u00cc\u001e\u00f6\u00b5\r\u0093IC\u00a1,k\u00cb\u00ce#\u008b\"L\u00df\u00ca\u0091\u00bc#\u00dc\u00f5$\u0019(\u00cbY\u0019S\u0016\u00c2y\u001b\u00f9$#\u00d4\u00dep\u00a8\u00f8\u00809P\u00ac+mq\u007f\u000e\reay\u009d\u0086\u00bf\u00a5\"\u008d\u00be\u00d0U\u00a7\u0097\u000fQ\u00a7\u0001\u00ef=\u0083W\u00eb\u00b8\u0096f\t\u00d8\u0013\u001au\u00c6,\u00ea\u00be\u00b0\u00ab\u00f5\u00bb\u008d\u00b5y\u00d6\u0090\u00d3\u00ab\u0013t\u0080\u00e6/gY\u001fDy`d?\u00e3\u00bf\u00f3\u0094\u00d5]w\u0087.Fa\u0094\u0005\u0016\u00c6\u0004^\u00cb/\u00benS\u0006\u00e0\u0087`;\tk\u001doO4\u000b\u0095\u0003\u008e\u0096g\u009b\u00cd\u00c5B\u00d3\u00d5`\u0083\u009f\u0081;\u0099%'\u00ec\u0095N\u00c1\u00b1\u0015N\u0003h\u001e\u00a2\u0004\u009e4\u00b5\u001d\tS\u00a7\u00ec-\u0088_\u0093\u001b\u00b6\u00e9\u0097jsL`\u00c1\u00b8\u00faG\u00de\u00df\u0080\u00ad>\u00d4\u0088\u008b\u007f\u00ef\u00ec\u0089\u00dc\u00a1\u00a6\u00d83b/\r\u0098:\u00ee\u00b5f\u00b2P\u0085o\rk\u001cZ\u0004\u00f37\u00bc\u0083\u0086\u00af{\u00c6\u00fd\u0007uy\u00ac\u00ads4\u00c1\u0095\u00a0\u00e3l\u009b\ro\u00ac\u0087y0\u00ef@\u009c\u0082\u00e6OwV\u00e4{\t\u00bc\u00ef\u0098+;\u00a3\u0095+\u00bb5\u00a0\u0019\u00b0|\u00c4\u001a\u00c3\u00f2\u009d\b\u00e3\u00e7\u00a9\u009ap\u0096\u0007\u0012\u009a\u00c5\u0093\u0000\u009eb\u00c3\u00bb\u00db\u0082\u0083\u00f4c\u00ff\u0016\u00d6y\u0092\u00b0\u00bd\u00f7m\u0082\u00eaq\u00f7_\u0005\u009b\u00f7\u0012W\u009c\u0086\u00d9\u00ff\u0098\u00bf\\\u00e2m9U\u00a4|\u00d8=\u00cb\u009c\u00b3u\u0082\u0012#\u00e0\u0095\u009e\u00cc\u00cb\u00fb\u001f\u0014\u0097\u0086P\u00bfr\u001d;\u000e\u001f\u001b\u00b6\u0098\u00ad\u00a0):\u000e\u0096pW\u00c2\u009a(\u00bcg\u001a\u0084+I\u009f\"c\u00c1\u00e5c\u0085+\u0006\u0081[\r\u0082VS=\u00962O\u0000lP+\u00f6A\u00ab\u00e8\u0019\u00d9\u0006\u00a7)\u008at\u00a5\u00bdY\r\u0000[r\u0085\u007f\u001f\u00a4-\u00b7\u008b\u00dbq>\u00e8\u009f\u00f7\u00e3q\u00bb\u00eb\u00f6^nC^\u00a1\u0019\t;\u00b9\u0090\u0090\u00b02\u008a\u0084ce6)\u00a3z\u00d9\u00ae\u0095\u0099e\u0018w\u00ec\u009e\u001e57\u0098.\u0010(\u0094i\u00c5\u00bfeg'_\u00b1bC1W\u0094V6\u00e0\u00b5+fN(\bI\u008d\u0013H\u000b:\u00b0\u00d94\u007f\u0003\u00fe\u0091$$\u00c5\u00fc|\u0094^\u00ca\u009a\u00b3\u009d\u008b\u00d9)\u0017\u0010/1\u00aen\u009f\u008f_o\u0005\"\u008d\u00e5\u00a8W\u0015\u001f\u00e6w\u001b\u00ea\u00ad\u00d3\u00e1\u0010\u0095\u00bd\u0091\u0083a\u009a\u0088\u0084F\u00b7\u00c0Y{\u0093\u0012c\u00d6\u00bf\u008f\u00ccD]\u001fZ\u00e1\u001a\u009bw\u00dcB\u0006\u0095\u0084>\u00a9\u0086\u0011\u00cb\u00f9^\u008b9\u00ee\u00a6\u00e2G|\u00c2y\u00b1\u0014?\u00b2;\u00f1`M\u00d7\r\u00cdkJi\u009c{\u0015J\u0007^\u0006a\u00b0\u00e6\u00e1Kk\u00d2\u00d8o\u00ae\u001e\u00030\u00a0\u00de\u00d7\u00b7\u0087\u008e\u0085\u00dcb\u00ee\u0003\u00ffR\u0096\u00e4\u000f\u000e\u00c9`\u00e1\u0018\n\u009b\u0085\u00b2n\u000b\u00a9\u001f\u00818\u00e9{5\u0096\u00a6U\u0092\u0088\u0019\u00bf\u000e\b]\u00a5\u0092\u00cb\u0098$\u000f\u00ca2{\u00eb\u0018ZO\u00f5\u0007QV\u009f\u00ea\u00caQe\u000b\u00e0\u00d8\u00ebrN\u00dd\u00d4\u0005\u00c7/\u00ae\t\u00b5m\u00a2\u00fd\u001d:Z`\u001a\u00bbe\u0016\u00e6!F\u00a1\u00ec\u0011\u009a\u0017\u0088\u00901\u00c4)\u0005:\u00f4u^\u0082j\u0097\u00b2W\u009bx\u0096\\y\u0095%\u00cf\u00d5U\u0080\u00feb6\u001b\u0018\u00f9\u00eagB\u0080\u00efY\u00ff1\u009d\u00bfFV\u00a9\u00e1\u0088\u0014x\u0097\u00d8\u00d2\u00f8\u00baf\u0082c\u0090\u00ed'\u00dc\u00aa%\u009c\u008cJ\u00d0\u0083iu\u0086Y:\u001d#\u00c9H^\u00c5K\u00b41\u00afS\u00dc\u009f.\u00c9~\u00e3:\u00c0\u0007e\u001e\u00da\u00b6\u0084{\u007fX\u001c\u00bd-U\u00b9V\u001e\u00b7\u0006\u00e2\u00f9\u00da\u0000r<\u00d3n71~\u0080\u0080\u00a7F&\u00d0\u0089\u0093\u00bc\u009c@\u001b\u0000\u00c4\u0093\u00cfG\u0002\u00dd\u00c0\u00b4\u00da\u00e5b\u0080K\u0017\u00e9\u00f3\u00eap\u0092\u007fa\u00bc\u00a7\u00f5O6\u0007\u00d3\u00a9kcn\u00c8Y\u00b9+\u00d7\u00dffyP\u00bbS\u00e2\u009d\u00f1\u009b\u0091\u0095\u00edU\\\u00fa\u0098\u008f\u00fc\u00a1,n\u00a3\\\fq\u00b69\u00c7\u00cf\u0086\u00b5@\u00b7\u00b2s\n\u00d8Y\u00c2o\u0088\u00b2\u0083\u00a0H'-y\u0002i:0Z8\\\b\u00e3\u009c|QoY\u00fe\u001c\u00ca\u00dc\u008f\u00df\u0082v\u0082\u0001*B'\u0012\u00f9\u0081\u0096\u00f7'\u0091\u009fj\u00eabI\u00a73\u00e7\u00a9\u00ea\u0080\u00ee2\u00d7\u00fb\u0088\u00e9\u000b\u0000h\u00d3\u001e\u009a\u00fd q\nAM\u00b4\u00fa\u00f8X\u00d6\u0001\u008dqJj^>\u0094\u00f2e\u00d7C\u0084\u00d8_cB\u00c8\u00b4>|\b\u0091\u0013\u0085%\u00e9\u0011z\u0081\u00d3\u001b\u00aa1\u00b4\u00a0D\u00ddaT\u00ed\u00f3\u008ad\u009e\u00b7e\u00bc_7\u009dU\u00c2P\u00978\u00d5\u0013\u0007\u007f\u00fa\u0080\u007f\u00d8\u00ef\\<1*\u00c9:\u00c5`Xr\u00f3\u00edz\u00c5\n\\g\u00f0\u000e\u00dc\u00f4\u00c5\u001aH\u00bc]\u0081\u00ddu\u00f7=\u00be\u00c0\u00b7\u00e65%\u00eb\u0081]\u0014\u00f3C\u00e58\u00c9\u00c4\u0019\u00f6'Bp[;\u0095\u00b0G\u0017}\u00d8\u00df\u0010\u00b1\u0090\u00d1S\u00d3<\u00b6\u00ff\u0006\u00cfw|U\u009e\u00de\u0089N\u0093\u0017n!\u00a86\u00b3\u00ff\u00d6\u00b7\u00d1R\u00fd`\u00cf\u00a0\u00a2A\u0010M)fRg\u000b\u008e\u0006\u0001r\u0098ph\u008d\u00f3\u00bf\u0084\u00c1\u00daW\u00e0\u0092\u0094l\u00cdU\u00ba\u0080O\u009cXl\r\u00aa\u0011b\u00f21\u00d00\u00ed|\u00f9\u00ae\u00a1q9\u00c9\u00dd\u00f7\u00c96F\u00d9a\u00aa\u00e4\u00aa\u00e6{\u009b\u0093\u009b?\u0000Q\u00c1\u00f6|\u0014\u00f6\u008bM\u00f7\u00ef\u001a\u00e79@>\u0003\u0091\u00c4\u00a1H\f\u00df\u00be\u00fc0;M\u0019\u0083P\u0010\u00b7!\u009b\u0095K\u00fb\u00b6nW\u0013&\u00d8\u000e\u00ff\u00c6^\"\u00b4!\u0015\u00f42\u00fc\u0087\u00ab\u000e\u00a9\u0094\u00dd\u00ecD\u00f9\u0012Q\u0002\u00beb\u00e4\u00aa\u00f8\t\u000f= \u00d7A2\u00d0\u0084\u00b2\u00ef\u001fa\u00ddV\u001e\u00cb:C\u0006\u00bcF<\u000f\u00ba\u00cf\u0007\u00d2c\u000e9\u00ca\u00cc\u00c2kdW\bX\u009b\u00ad;\u009d\u00ae}\u00e7O\u00e6\u000b\u00c0\u00e6\u00bctZ\u00e6;a\u00f6^\u00e0Q\\\u00a9\u00c3S,\u0012\u00d5\u009d\u0094,{\u00dd4\u00a8u\u0017|\u00e3\u00e01u\u00fam\u00d5M\u00c4\u00b1hx\u00f7\u00de\u00cd\u0090\u001f\u0095\u0084V\u0006\u000f\u00b9\u00ee\u00ed\u00d2\u00cb\u008eh\u00ad\f^t\u00fe'\u00e2p\u00eb\u00df\u00dcZq\u00b5\u00e8,j\u008b;\u0087\u00d7V\u00de\u0080\u00e2Y\u00ae\u008e\u00c1\u00c8\u00be\u00d58c\u00e1W\u00a9lgj\u00a07\u00ae\u0013\u009b+cZ\u00a4\u00afBC\u00a1\u00e9\u00a1R\u0089\rh\rE\u00ef\u00a7\u0083)\u0093B\u009582S\u00c2\u0013\u00fd\u009fD\u009574K\u009e\f\u00f37\u00b7-8\u0006\u00df\u0010\u00fal\u00c50A\u00adN\u00cb\u00aal\u00e7/t(, Z\u001ah&\u00cb#\u00da=\n\u000e4Y\u00ec\u00ed\u0000\u0080\u00dc2{\u008ejs\u00a1\u00c7\u0096\u008cA\u00a8g+\u0001\u00f9MFrH\u0004\u0098\u00148\u00ae\u00cdz\u00c3\u008e\u00c3\u009c>\u00f1r\u0080\u00e7\u00df\u00b8\u008bQ\u00b2\u00e5;\u0018;\u00a0\u0098\u0011|\\\"\u0018A\u00d6\u00de\u00c3\u00f1`*\u00faUQ_\u0098w(\u0085\u007f\u0005\u0000\u009d\u0002z\u00e4 \u008e\u00f00\u0012\u00fc}1\u0013B\u0098@\u00bd\u009c\u0086\u00cf\u001d\u00d8\u008d| 2\u00b0T\u00f6%5\u001b\u0013\u0082\u00be\u00dfp\u00a4\u0015hk7s\u001a\u00a9\u00d1}x#\bVKM~4zW\u00cd\u00c5\u00b6]I\u00bd\u009e\u0018\u00de\u009ay\u000fD\u00e9ek</\u0081\u00eeRO\u0087\u0088\u00ce1\u0015;\u0017(S\u00a9\u00e5\u0093\u00e2\u00cb\u001f\n\u00bf \u00b8Ez9\u0004\u00f5}\u008f j\u00eb\u00bc\u00f8m?\u00cf\u00e0A\u00f5\u00b6s\u00c8\u0005\u0001\u00f0\u0010\u0096wb<8\u0007\u00f8KfA\u00d60\u00f5\u00ef\u00c5\u00ba\u00ea\u001a0\u00e1\u00e7\u0086\u0003\u001f\u0017\u00c8\u00d0\u009f3\u00b6\u008bPM\u00b5\u0014\u00c0_\u009a\u00db\u008e%\u00cc\u00d8#\u00bd\u00d6\u0092\u00cc\u00feyS\u0087\u00ec\u0018\u0092C/Q\u00d0N\b\u00196\u00dc}\u00e1/\u000b5X\u0015\u00fa\u0080k\u0015\u00db\u00d6l\u00d9\u00fe\\\u0093>\u00ee\u00fa\u00bb4a\u0001\u00edJ\u00fa\u00f5\u00f0\u00d8[\u0018\u00be,9\u0003r\"\u0001\u00cc\u00a9u\u00ddE\u00acFC\u008f]b\u009c\u00a4\u0014\u0099\u00c9R$?=I\u008e\u001c\u0000\u00d6\u0086\u00c1\u0098\u000e\u000ez\u00a4\u00ad\u00a5\u00d1\\\u00b0E),\u00a5xo\u00f1E)<\u00ecX\u00fc\u00ff_\u0086\u008b\u00a2\u00f4\u00bc\u00db\u00d9@R\u00b4\u00fc]Q\u008e8\u009c\u00c5\u00ae\u00b26\u008b\u00c8\u009a-\u00a4\u00f7\b\u00af\u00d1\u007f\u00a43\u001f\u0097\u00f2\u00b7[\u0088\r| \u00bd\u0097\u00e2\u00ae\u00be\u00d1K\u00b2\u00e5[\u0019\u00eb[\u00c3\u00de1\u00c0\u00e2\u00c9\u0090\u009c\u00eb\u0081.^\u00aaY\u0096\u0001\u009c\u00c8}\f!\u007f\u00d6\u00bd\u00d8\u00e1S\u00ef\u00eb\u00b2\bc/9\u0004\u0090\u0084\u008fT?\u00cb\u00aa\u00b9\u0095R\u00ca0\u00db\u00c6\u00da_\u009a\u008a\u00ec\u00dd]\u00e9\u00c4\u00f0\u00eeNO\u0088\u0093\u00eafN\u0007:\u00ca^YE?q\u008ctM\u00a8\r\u00c8\u0099N\u00b0\u00c4x\u00c1\u008d\u00b4\u00e5\u00a2\u0082\u00ed\u00ef\u00d0\u00c0|T\u0002\u00a2\u0004M\u00be2};l~\u00a6\u00c4\u00cf\u00cf;\u00e2\f\u00ba\u00bb k\u0003\u00be\u001f9V%\u00e2\u00a3:\u00ac\u001b\u00c2q\u000e\u0080\u0098\u00ce\u00b19)\u00fd\u00a8\u0002;\u001d\u00c6a5*\u00c1\u00b3\u00b8\u00ba\u0096\u0094\u00ae\u00be\t\u00cb\u00e9\u009a\u00d9e\u00c1\u00d5=W+\u00f8\u00ac8\u0081\u00a2Gg\u00ce\u00ae\u00b3\u008e_\u00a2\u00ab\u00aa\u008f3\u00f4\u0002\u00bd^\u00d8\u00c5\u00f4\u0001Hb@\u00bc?\u00e9,a5\u001c\u00c2{\u00fd\u0087K\r\u00d0u\u0000?\u00bfY^\u008e\u00c7\u00fd\u0015\u00a6K\u00a3\u00e9%\u009f\u0006\u00cc\u00e1W\u00f0mX\u00d8h\u0084.\u00a4\u00bd\u00c1_\u0082\u0011\u00dbu\u00b6\u00daF\u00e8\u0015\u008bR\u0002\u00c5\u00be\u00ab \u00cd\u001d\u00edP\u00b3,\u001d4Z\u0099\u00bc\u00a7\u00fa\t*\u00b1[\u008c\u001f\"\u0011\u00fe\u00cf\u00dcn\u00c2\u007f\u00a9\u001c\u009c{Z\u00c9\u00ce\u00e9\u00b4\u00dc\u00fbaG\u001e\u0083+\u0089\u0081\u00b7t\u00a7u#h\u0015\u009e\u00d8U\u00d59\u009f\u0093\u00cd\u00d6~\u00fd8B\u00963\u0080e v\u00de~\u00a7]39t7.Z\u001a\u00a2\u00fe\u00d7\nb\u000b\u00a5\u00ca\u00ff\u0097\u00ac\u00ad\u00d1'\u00d3\u00cd\n\u00a3\u0003%5\u0086\u009a\u00b0h\u00a2\u0088S\u0095\u001b4$7\u00d2\u0002'\u00af\u00c5\u00d6\u00fd\u0098\u00fa3\u008b:aKe\u009a\u00fa\u0083\u00c9\u00f8\u00ea\u00b6\u00bfB\u009b>h\u00a8\u00fc\u009e\u00fa\u00e9f\u0005\u0091\u00a3\u00c3\u00ed\u00a8\u00c4\u0083pkd\u0010\u007f;\u00e4\u00fe\u00c7\u00ef\u0084Z7\u008f\u00c4G~f4\u0082\u00bf\u00017\u00a4R`\u00f9JZ\u00f6f\u0005)\u00b2\u00d26\u0014E\u00e8\u00d3\u00b5Y\u0093\u00d7\u00dc\u00d8Z^h\u00ebn$;\u00f4S\u00f3(\u00cd\u00a2\u00de\u00f9d,\u00ff6[\f\u00e2\t\u0005\u00b4\u00ff\u0092\u00a1z\u00b72#\u0007V\u009e{\u00ddA\u00d5\u00b7\u00ec\u009d\u00da\u00a4\u009b\u00c3\u00bd?\u009d\u00d6\u0082TUs\u00a5\u009b\u00a0\u00a4=\u009f\u0013\u00af\u00d9\u009fd\u008a4\u00e8\n\u00f4\u0086+\u00b4\u00fc\u00cf\u008e\u00c7l#f\u0084\u00d4\u00b6\u0099\u0092W$\u001d\u0015\u00c5\u00e5\u00d0\u00fa2y\b\u00aa\u001a\u0086S\u00f6\u0095%\u001a\u00e0\u0094\u00d9L\u00ef \u009e\bE\u00a8\u00e9\u00a7\u001d\u00ea\b%\u00c5\u00c3Q\u00aa\u0090\u00d0\u00b1zz\u00faq9Xf\u00c3L\u0011\u00d0/(\u00cb\u009f:\u0014,\u001b0Vm\u00b1\u00bb\u008b\u00a3\u00d6\u00e5\u00e5\u0095\u00b0\u0092\u0004e\u00fc\u00d2#\u0095\u00d0S\u0013L\u00d7DF?$\u000e%\u0095\u00ff\u0013'z\u0019\u008c\u00bd\f\u00e2\u0018\u00fd\u00d2\u00d5\u008e\u00b3J74>\u00af\u000f0\u00a9B+\u007f\u001b6[\u0096\u00c12\u0092^\u00f6\u001c\u00fc\u00f8\u007f\u0094\u00b3\u009a*f\u007f\u0086j~\u0080|\u0014\u0093w/\u00be\u008b\u0015\u0097\r\u000b]X!\u00c3\u008a\u00fa'\u00b9\u00f23F\"\u00ddo%\u00e1;\u00af\u00f5[\u00c46\u00ad\u00aaa^:\u0081TO\u0089o\u009d\u00c1G\u00c5\u00e0\u001c\u00e8\u009a>\u00f6\u00df2\u00fb\u00d1\u00d7Z\u001e\u00a3\f\u00e82e\u00da\u001ci\u00eaz\u009d\u008bN\u00c6\u0093\u00bb{\u0013\u00e7\u0090\u0013\u001aP\u0001\u0002>\rFz\u00f0\u00cbkN\u00ee\u00c4\u00d2\u001a\u001f\u00b8\u00e7\u00b5\u00aa\u00db\u00a8@u\u000b\u0006F\u00ba+43\u00fa\u009eC\u00fc\u00a1\u00efrU\u00d6\u00b5\u0098\u00ac\u00cf\u00a4\u00e1\u0004\u00a6w\u00b6\u00f9\u00c9\u00cb\f\u00ef\u00fc=\f\u00edYp\u0085O\u0088M\u001e\u00d4Z\u00b8\u00b9\u0080\u00dcQubq\u00b06\u00f2n\u001c7\u00cc\u0086\b\u0002\u0019\u0019<3\u00ae\u00a2\u0098\u0011\u00d3\u000b\u00ac\u00e9z\u00fa\u00fe g\u00e1\u009e\u00e6\u00d6\u00e0\u001b\u00bf\u0097\u0015[\u001d\u007f/#\u0014<\u00c9K\u00a9@-n\u00b4g\u00d5\u0012\u00f7\\\u009f\u00ac\u0018t\u00fenv\tYJ\u000e\"\r\u001b\u00b3G\u0000\u0092\u0004\u00cc,\u00fd\u00f8}\u008b\u00db\u0016\u0089\u00e4\u008a\u00e4\u00adm?\u00f9~\u00beG{t\u0086\u00c0D\u00f05i\u00c3t\u00ad\u0013\u00d8X|C\u0082\u00f6\\KX\u001b\u00a5A\u0084\u00ba\u008c\u00ba\u00a0\u00fb\u000f\u0091\u00d4\u009d\u00cc\u00fd\u00a5\u00c4\u0096wC'Q\t\u009db\u00bf\u0088\u00e78\u00a7b\u00cb2\u00c9\u0084\u00c04\u00denEp_\u00f1'\u00b9\u00b0\u00a4O:\u00a4\u00ee\u008c\u008e\u00c9z\u00ad\u00e7\u00b0\u00cd\u0085\u0087\u0007u\u00e4\u008cQ+\u000b\u00bb\n\u00f6\u008eOZi\u008b\u00de\u00f5\u0092A\u00df \u00e7\u00c4\u00bb\u00b1\u009a\u00fb\u00d4\u00ddv3\u00dfB\u0019\u001b\u0084\u009b\u00f5?\u00a6\u00be\u00d7\u00b6\u00e0\u00bb\u007f\u00d3Q]\u00b4\u008d\u00ef\u00f3:\u0014\u00d9\u00cd\u0014b\u00b99\u00b21&+:\u00d6S\u00d3\u0083R/Oy\u0085\u00f9-\u00ac\u0092\u008d\u009d\u0080D{\u00e6r\u008e|\u00af>\u0082\u0098/,\u00e8\u0087a>\u00a4\u00de_\u0097\u00ab\u00be\u00f6\u008a\u00a4\u00ba\u00ac\u00d0\u0093\u0094\u00fa\u00bbc\u0004\u00dc\u00c5\u0017\u00a6\u00fb\u00051\u00e7\u00d8\u0087\u001b\u00a9#\u0085W\u00bd\u0096\u00ef\u0081}\u00e3\u00a0,\u00a3\u00d1q@-,hh\u0084\u00ed%\u008fc\u00a7\u001a\u00ffVEv0\u0015\u00e3\u0082\u00d9\u009b\u00f8~\u0014H\u00faR\u00e5\u00ca\u00d8w\u00a3\u00dfI\u00bd\u00ad\u0083\u00afp\u0097\u00ed\u00af[T\u0087\u00dc\u00b10'i\u0098s\u0006\u0092n&<\u001b\u001b\u009aDc\u0011\u000b\u00e7\u00d67{\u00e6#\u00b5\u00b1\u00e1~\u00e2z\u0007\u00a5\u0089@\u00ff\bb\\\u00dc7\u00d6\u009e`1\u00f1\u0006\u0001\u00ffj\t\u00ff\u00b1B\u00d0\u00ef\u00f74\u0014\r\u00bcLp\u008e+*\u00f0cR{\u0097T\u00ff'\u0018\u0090\u00a8\u00d9\u00e5\u009d\u00c6\u0098\u00f5\u00bb\u00dc\u00d6\u008f9\u0001\u008a&a\u00fb\u00b2\u00b4-\u00f8\u001cM\u00fc\u00a6y\u00a5\u009dBq\u0083e\u00dc\u0089\u00dfQ\u00cd\u00f27/K\u009a\u00d9\u007f m5\u00c0\u00c93@\u0098H-LI\u0012zP\u00db[\u0004\u00f2\u0096_\u00e4\u00e5\u00c5\u00ba\u00d5\u001bV@\u00fa\u00b6\u0018t\u008dT\u0092w\u00f5=\u00bd\u00f2i\u001cYO\u00d6\u00af\u00ea`J\u00e9\u0091\\\u00f4t\u001bQ-Jb,O\u0005\u00ef\u00e8\u000b\u00c1\u00a2\u00b1\u00d1\u008d\u0090\u00e7\u00fc\u0016\u0091\u00a94\u0002\u00d7Y\u0096y\u0019kb\u0097\u00e8\n\u0092\u00c7[]\u00d4(P\u00d9*w\u00f2\u00e8\rU\u00a2\u0085\u00fb*\u00bcx!\u001b\u00f3\u00bc\u009d\u0007\u00b8\u0098\u000b\u00ff-\u00cf\u0018\u00d5\u00da*?\u00d2\u0094)\u00da\u0094w\u0080q\u0090g\u0010g\u008fkD\u00a9*\u00f2\u001bY\u00ae\u00ec\u0088}d@\u00f7\u00f9\f\u00cb\u00e6\u00c3\u00d0\r\u0000\u00fb\u00e1A\u00ef\b,\u009a\r\nR\u00bf\u00d8Uo\u00e5\u008d\u0004\u0001\u00a5\u0084\u0097u\u00ff(\n\u000eZ\u001f.\u00ed\u00e0$\u00dd\u00c6\u00cc\u00c7\u0013\u0086\u00f0\u0018m:v>\u00b99\u0099\u0003\u0000-\u00b5\u001d\u00fe\u00c5\u00bd\u0005*\u00cb\u00f5z\u0097\u00e1mb\u00f1g\u008c\u00d2D\u0087\u001b\u00bf\u008f\u0087\u0004Rf>\u00de\u00b3\u00b1\u001f]y\n\u00c6dm\u00fb\u008b\u00fb\u0083\u00d4\u001c\u00fek:5\u000bT\u00be\u00d1\u00e6\tD\u00c0\u001cR^\u00bdt\u00fbl \u0081\u009e(4\u0012\u00f3]\u00f9\u00eb\u00da\u00c5z\u00a2\u00a7\u00eb\u0002\u0019i\u00ba\u00d9\u00df\u00be\u00cd\u00bf^H.\fD\u0092\u000f\u0018\r/\u00d2\u00f67\u00c3\u00d0\u00b1\u00c4\u00b9\u008bG\u00bd\u00c6-\u007f\u0099\u0017\u00a2f\u00e5C\u0095\u00be\u00f7\u000e\u00b7\u00ea\u0013\u0093\u0011\u00ee\u008b\u00c0\u00d5Tq\u0082Jq\u0013\u00c2\u00b0\u0099\u00fc?\u00b3\u00b1v\u00c8\u00c7Y\u00a3\u00a4\u0000\u00d6\u00a6$\"^\u00c7\u008f\u00f6\u00ef\u00e0\u00d1\u00b4\u0088(1\u00cf\u00c0\u0013:\u008b\u00ce\u007fL\u00c0\u009b\u00e4\u0003\u00a7\u00d8\u0098\u00f7o\u00d7\u00f9=\u00cd#\u00a7{\u0005\u0083\u0090~\u00b6\u0085\u0013\u0016\u00119\u00bc\u001a\u00ceM\u009f\u000fJ\u00e4W\u000e\u0091U9\u0085\u0003\u00e2\u00f1[\u0081\u00e7~\u00d7O\u00c8m\u00e6V\u00d4\u0089Sd\u00cc\u00c2J\u0082\u00a5\u00eeyz\u00aa\u0017-\u001f\u00f8zw\u00db<\u00bd\u00c3\u00eeC:\u0099v\u00d5\u00b2\u00ba\u0082\u00b9\t\u00a7y\u0094".length();
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
                    var4_3 = "\u0003o\u0017\u00c4y\u00c0\u00ab\u0097>\u00d5\u0018@\u00eaaL\u00cf";
                    var5_4 = "\u0003o\u0017\u00c4y\u00c0\u00ab\u0097>\u00d5\u0018@\u00eaaL\u00cf".length();
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
        lw.a = var6_1;
        lw.b = new Integer[778];
        lw.D = hi.a("G", (Object)new Object[0], (long)685927195022058899L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean c(Object[] var1_1) {
        block25: {
            block24: {
                block23: {
                    block26: {
                        var2_2 = (LocalPlayer)var1_1[0];
                        var3_3 = (Vec3)var1_1[1];
                        var4_4 = Dl.t();
                        var7_5 /* !! */  = lw.a(14631, 2915558615580392180L) ^ lw.a(11560, 8833560827300359223L) ^ lw.a(16199, 1587208060899310794L);
                        if (!var4_4) break block26;
lbl7:
                        // 2 sources

                        while (true) {
                            block28: {
                                block27: {
                                    var5_6 = hi.a("G", (Object)var3_3, (long)980631921738979478L);
                                    v0 /* !! */  = hi.a("\u00a5", (Object)lw.x("YSDqrC2rPe0ttaMD", level(), (LocalPlayer)var2_2), (Object)var5_6, (long)488130391410755029L);
                                    if (var4_4) break block27;
                                    if (v0 /* !! */  != false) break block28;
                                    v0 /* !! */  = (CallSite)(lw.a(8212, 2456645843190391469L) / 2 ^ lw.a(10310, 7667075942000208620L));
                                }
                                var7_5 /* !! */  = (int)v0 /* !! */ ;
                                if (!var4_4) break block23;
                            }
                            var7_5 /* !! */  = (hi.a("G", (int)(lw.a(32469, 1540242233969048745L) / lw.a(20935, 7687153968825095121L)), (int)lw.a(13584, 2120678249273538198L), (long)834203424483934088L) ^ lw.a(5557, 1807483115508504461L)) + lw.a(2753, 1215905991968295178L);
                            if (!var4_4) break block23;
                            ** GOTO lbl56
                            break;
                        }
                    }
                    while (true) {
                        switch (var7_5 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 1442484953: 
                        }
                        hi.a("G", (float)-1.0f, (float)-1.0f, (float)1.0f, (float)0.0f, (long)796776827756410481L);
                        hi.a("G", (boolean)false, (float)10.0f, (long)499998531297741759L);
                        var7_5 /* !! */  = hi.a("G", (int)hi.a("G", (int)(lw.a(30961, 5579373354230937993L) + lw.a(16765, 7319200125040017985L)), (int)lw.a(32721, 1689325120168132143L), (long)834203424483934088L), (int)lw.a(23106, 6784642580671421232L), (long)834203424483934088L) + lw.a(15752, 8856648272967319419L) ^ lw.a(11046, 6078988767003093037L);
                    }
                }
                block19: while (true) {
                    switch (var7_5 /* !! */ ) {
                        default: {
                            v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var2_2, (long)827913124966560621L), (Object)var5_6, (long)864608062160339421L);
                            if (var4_4) ** GOTO lbl57
                            if (v1 /* !! */  != false) ** GOTO lbl56
                            ** GOTO lbl59
                        }
                        case -1915199203: {
                            v2 = new Object[2];
                            v2[1] = var3_3;
                            v2[0] = var2_2;
                            var6_7 = hi.a("\u00a5", (Object)this, (Object)v2, (long)988093559625050283L);
                            v3 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", w(java.lang.Object java.lang.Object ), (lw)this, (Object)var2_2, (Object)var6_7);
                            if (var4_4) ** GOTO lbl62
                            if (v3 /* !! */  == false) ** GOTO lbl61
                            ** GOTO lbl64
                        }
                        case -1915199204: {
                            hi.a("G", (long)1207087722114992771L);
                            var7_5 /* !! */  = hi.a("G", (int)(lw.a(29586, 4945765059037786725L) - lw.a(26699, 1806176668316953133L)), (int)lw.a(31106, 6017646663696612010L), (long)834203424483934088L) ^ lw.a(7971, 4274863881949781233L);
                            continue block19;
                        }
lbl56:
                        // 2 sources

                        v1 /* !! */  = (CallSite)((lw.a(5929, 453685176447636662L) ^ lw.a(2842, 594304636949891574L)) * lw.a(27969, 2007351102136217308L) / 4 - lw.a(4168, 538727122186441228L));
lbl57:
                        // 2 sources

                        var7_5 /* !! */  = (int)v1 /* !! */ ;
                        if (!var4_4) continue block19;
lbl59:
                        // 2 sources

                        var7_5 /* !! */  = lw.a(2136, 6751709638598986086L) / 2 ^ lw.a(24528, 7874993711736184449L);
                        continue block19;
lbl61:
                        // 1 sources

                        v3 /* !! */  = (CallSite)(lw.a(23489, 3626818226134964859L) / lw.a(23511, 785228222171961978L) / lw.a(8816, 2237148544794894752L) ^ lw.a(15045, 3538777011222952336L));
lbl62:
                        // 2 sources

                        var7_5 /* !! */  = (int)v3 /* !! */ ;
                        if (!var4_4) break block24;
lbl64:
                        // 2 sources

                        var7_5 /* !! */  = (lw.a(16384, 1506950754970288984L) - lw.a(10573, 6138445775457495919L) ^ lw.a(32168, 6646058799873031429L)) + lw.a(19218, 4887390741181450983L);
                        if (!var4_4) break block24;
                        ** GOTO lbl98
                        case -1915199202: 
                    }
                    break;
                }
                return false;
            }
            block20: while (true) {
                block33: {
                    block31: {
                        block32: {
                            block30: {
                                block29: {
                                    switch (var7_5 /* !! */ ) {
                                        default: {
                                            v4 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", noBlockCollision(net.minecraft.world.entity.Entity net.minecraft.world.phys.AABB ), (Level)lw.x("YSDqrC2rPe0ttaMD", level(), (LocalPlayer)var2_2), (Entity)var2_2, (AABB)var6_7);
                                            if (var4_4) break block29;
                                            if (v4 /* !! */  == false) break;
                                            break block30;
                                        }
                                        case -1342232140: {
                                            v5 /* !! */  = lw.x("YSDqrC2rPe0ttaMD", noBorderCollision(net.minecraft.world.entity.Entity net.minecraft.world.phys.AABB ), (Level)hi.a("\u00a5", (Object)var2_2, (long)827913124966560621L), (Entity)var2_2, (AABB)var6_7);
                                            if (var4_4) break block31;
                                            if (v5 /* !! */  == false) break block32;
                                            break block33;
                                        }
                                        case -1342232141: {
                                            v6 = true;
                                            var7_5 /* !! */  = (hi.a("G", (int)(lw.a(4544, 2459127734082015470L) ^ lw.a(22036, 6536434200276326325L)), (int)lw.a(27916, 2460455967962722210L), (long)834203424483934088L) ^ lw.a(27558, 8330655909955955394L) ^ lw.a(27497, 4612012220280564160L)) - lw.a(15515, 6379478938023083522L);
                                            if (var4_4) {
                                                break block20;
                                            }
                                            break block25;
                                        }
                                        case -1342232143: {
                                            v6 = false;
                                            if (!var4_4) break block20;
                                            return v6;
                                        }
                                        case -1342232142: {
                                            hi.a("G", (double)-1.0, (long)439999302750573161L);
                                            var7_5 /* !! */  = lw.a(9310, 5070813200957089077L) / lw.a(14200, 3038654308006737406L) + lw.a(25370, 3030684182840696939L) + lw.a(10300, 1045976607602780474L);
                                            continue block20;
                                        }
                                    }
lbl98:
                                    // 2 sources

                                    v4 /* !! */  = (CallSite)(lw.a(29118, 1063664762624864914L) / lw.a(23511, 785228222171961978L) / lw.a(30097, 3929466860276152147L) ^ lw.a(12006, 6035784954486894502L));
                                }
                                var7_5 /* !! */  = (int)v4 /* !! */ ;
                                if (!var4_4) continue;
                            }
                            var7_5 /* !! */  = lw.a(23491, 252563877683747067L) / lw.a(20975, 7117210263112274626L) + lw.a(3048, 5234080591834056856L) - lw.a(22843, 7573396104478545962L);
                            if (!var4_4) continue;
                        }
                        v5 /* !! */  = (CallSite)(lw.a(29118, 1063664762624864914L) / lw.a(23511, 785228222171961978L) / lw.a(30097, 3929466860276152147L) ^ lw.a(12006, 6035784954486894502L));
                    }
                    var7_5 /* !! */  = (int)v5 /* !! */ ;
                    if (!var4_4) continue;
                }
                var7_5 /* !! */  = (int)(hi.a("G", (int)(lw.a(25984, 3853768444192679733L) - lw.a(29204, 443312957088231497L) ^ lw.a(795, 8432545243511358166L)), (int)lw.a(15173, 3987089923499932032L), (long)834203424483934088L) - lw.a(26657, 5416095427388828373L));
            }
            var7_5 /* !! */  = (hi.a("G", (int)(lw.a(10110, 3127788056660977112L) ^ lw.a(32260, 7235287612241018254L)), (int)lw.a(5259, 5326530950724293950L), (long)834203424483934088L) ^ lw.a(6516, 6988835830633405341L) ^ lw.a(3622, 8475976097789415213L)) - lw.a(18694, 5072845736806664349L);
        }
        switch (var7_5 /* !! */ ) {
            default: {
                return v6;
            }
            case 730035200: 
        }
        throw null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Vec3 l(Object var1_1, Object var2_2) {
        block52: {
            block51: {
                block50: {
                    var3_3 = Dl.t();
                    var15_4 /* !! */  = hi.a("G", (int)lw.a(21118, 3968894240455643233L), (int)lw.a(10947, 8050218231717144936L), (long)834203424483934088L) + lw.a(31908, 7064135151495085898L);
                    if (var3_3) ** GOTO lbl-1000
                    switch (var15_4 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var4_5 = hi.a("\u00a5", (Object)((LocalPlayer)var1_1), (long)1045344535518524325L);
                            v0 = new Object[2];
                            v0[1] = var4_5;
                            v0[0] = (LocalPlayer)var1_1;
                            v1 /* !! */  = hi.a("\u00a5", (Object)this, (Object)v0, (long)1259202755906798647L);
                            if (var3_3) break block50;
                            if (v1 /* !! */  == false) break;
                            break block51;
                        }
                        case -103935762: {
                            hi.a("G", (long)1186314902226853278L);
                            return null;
                        }
                    }
                    v1 /* !! */  = var15_4 /* !! */  = (reference)(lw.a(15356, 1563718857529801119L) * lw.a(31875, 4894863849487695278L) + lw.a(20112, 9175380565704199534L) + lw.a(24782, 1066091502204609512L) + lw.a(26608, 488446124971877728L));
                }
                if (!var3_3) break block52;
            }
            var15_4 /* !! */  = (reference)(lw.a(2630, 5948923690660268412L) * lw.a(32679, 3874815290463059583L) / lw.a(2203, 112762608658287175L) ^ lw.a(29313, 1244976275355431227L));
        }
        switch (var15_4 /* !! */ ) {
            default: {
                return null;
            }
            case 1827606029: {
                var5_6 = null;
                var6_7 = 1.7976931348623157E308;
                var8_8 = hi.a("\u00a5", (Object)hi.a("j", (long)903903745240135212L), (long)1240653736693366367L);
                var15_4 /* !! */  = (reference)((lw.a(17576, 5321834192470721832L) ^ lw.a(2163, 7434979410980276822L)) * lw.a(6893, 7084122084477934363L) ^ lw.a(28017, 4663949348434046619L));
                ** GOTO lbl102
            }
            case 1827606030: {
                hi.a("G", (float)-0.5f, (long)855506680013936433L);
                return null;
            }
        }
lbl37:
        // 2 sources

        while (true) {
            block53: {
                var10_10 = 1;
                if (var3_3) break block53;
                var15_4 /* !! */  = (reference)(lw.a(32242, 629076860526623781L) * lw.a(22109, 6341259022160975266L) / lw.a(29651, 3720463824708694047L) * lw.a(1482, 4581829506589394507L) + lw.a(14637, 7495434275434183242L));
                if (!var3_3) ** GOTO lbl158
                ** GOTO lbl49
            }
lbl44:
            // 2 sources

            while (true) {
                block55: {
                    block54: {
                        v2 = var10_10;
                        v3 = 3;
                        if (var3_3) break block54;
                        if (v2 <= v3) break block55;
lbl49:
                        // 2 sources

                        v2 = lw.a(2047, 3166851917860177061L) / lw.a(2203, 112762608658287175L) - lw.a(337, 246205909785804872L);
                        v3 = lw.a(21004, 2289416604202193834L);
                    }
                    var15_4 /* !! */  = (reference)(v2 + v3);
                    if (!var3_3) ** GOTO lbl158
                }
                var15_4 /* !! */  = (reference)(((lw.a(12420, 8106225806256485352L) ^ lw.a(27859, 6079219327690468971L)) + lw.a(17241, 1051331530792780143L) ^ lw.a(14323, 7888283688966305236L)) - lw.a(22987, 2369628959993911889L));
                if (true) ** GOTO lbl158
                break;
            }
            break;
        }
lbl57:
        // 2 sources

        while (true) {
            v4 = new Object[2];
            v4[1] = var12_12;
            v4[0] = (LocalPlayer)var1_1;
            v5 /* !! */  = hi.a("\u00a5", (Object)this, (Object)v4, (long)368951674786617411L);
            if (var3_3) ** GOTO lbl210
            if (v5 /* !! */  != false) ** GOTO lbl209
            ** GOTO lbl211
            break;
        }
        block35: while (true) {
            block59: {
                block58: {
                    block57: {
                        block56: {
                            var13_13 = (double)var10_10 * 1.5 + hi.a("\u00a5", (Object)var12_12, (Object)((Vec3)var2_2), (long)1256728004038227497L);
                            v6 = var13_13 == var6_7 ? 0 : (var13_13 < var6_7 ? -1 : 1);
                            if (var3_3) break block56;
                            if (v6 < 0) break block57;
                            v6 = lw.a(31978, 8531392116444823269L) / lw.a(2203, 112762608658287175L) - lw.a(11003, 1136557521842677963L) + lw.a(29779, 7317033388514473517L);
                        }
                        var15_4 /* !! */  = (reference)v6;
                        if (!var3_3) ** GOTO lbl158
                    }
                    var15_4 /* !! */  = (reference)(lw.a(27356, 4314245584529648092L) * lw.a(15580, 3352386728662777846L) + lw.a(2920, 6144098034128128030L) - lw.a(4983, 1121907245207294636L));
                    if (var3_3) break block58;
                    switch (var15_4 /* !! */ ) {
                        default: {
                            var5_6 = var12_12;
                            var6_7 = var13_13;
                            if (!var3_3) break;
                            break block59;
                        }
                        case -22082424: {
                            throw null;
                        }
                    }
                }
                var15_4 /* !! */  = (reference)(lw.a(31978, 8531392116444823269L) / lw.a(2203, 112762608658287175L) - lw.a(11003, 1136557521842677963L) + lw.a(29779, 7317033388514473517L));
                if (!var3_3) ** GOTO lbl158
                ** GOTO lbl94
            }
            block36: while (true) {
                block65: {
                    block49: {
                        block48: {
                            block61: {
                                block60: {
                                    ++var10_10;
                                    if (var3_3) break block60;
lbl94:
                                    // 2 sources

                                    var15_4 /* !! */  = (reference)(lw.a(26203, 4107755646173308840L) * lw.a(27704, 8755858109946359089L) / lw.a(11489, 2763405829904641929L) * lw.a(21292, 8186729749257637933L) + lw.a(3253, 2716467362717371930L));
                                    if (!var3_3) break block61;
                                    ** GOTO lbl101
                                }
lbl98:
                                // 2 sources

                                while (true) {
                                    if (var3_3) {
                                        return var5_6;
                                    }
lbl101:
                                    // 3 sources

                                    var15_4 /* !! */  = (reference)((lw.a(32344, 2112287415176461636L) ^ lw.a(17562, 511940928482789351L)) * lw.a(26475, 2165028279814349927L) ^ lw.a(27676, 3309324690794114877L));
lbl102:
                                    // 2 sources

                                    block38: while (true) {
                                        block62: {
                                            switch (var15_4 /* !! */ ) {
                                                default: {
                                                    v7 /* !! */  = hi.a("\u00a5", (Object)var8_8, (long)984088978567310565L);
                                                    if (var3_3) ** GOTO lbl119
                                                    if (v7 /* !! */  == false) ** GOTO lbl118
                                                    ** GOTO lbl120
                                                }
                                                case -442082523: {
                                                    var9_9 = (vm)hi.a("\u00a5", (Object)var8_8, (long)470012372636416268L);
                                                    v8 /* !! */  = hi.a("\u00a5", (Object)var9_9, (long)875080889560885798L);
                                                    if (var3_3) ** GOTO lbl123
                                                    if (v8 /* !! */  != false) ** GOTO lbl122
                                                    ** GOTO lbl124
                                                }
                                                case -442082521: {
                                                    throw null;
                                                }
lbl118:
                                                // 1 sources

                                                v7 /* !! */  = var15_4 /* !! */  = (reference)(hi.a("G", (int)(lw.a(8760, 3749561865869074732L) / lw.a(15275, 7704218695747877479L)), (int)lw.a(10951, 5052754657025239153L), (long)834203424483934088L) / lw.a(26711, 3367009529014741825L) ^ lw.a(7253, 5043642519790558698L));
lbl119:
                                                // 2 sources

                                                if (!var3_3) continue block38;
lbl120:
                                                // 2 sources

                                                var15_4 /* !! */  = (reference)((hi.a("G", (int)(lw.a(32304, 2466373735558872849L) / lw.a(17305, 260087325598270263L)), (int)lw.a(483, 7558617909238170296L), (long)834203424483934088L) ^ lw.a(12983, 8390609092740592145L)) - lw.a(18499, 8452400035850504560L));
                                                continue block38;
lbl122:
                                                // 1 sources

                                                v8 /* !! */  = var15_4 /* !! */  = (reference)((lw.a(6875, 2617832352941218006L) / lw.a(2203, 112762608658287175L) / lw.a(20975, 7117210263112274626L) ^ lw.a(20826, 5550537427799397113L)) - lw.a(16424, 1237846517247361932L) + lw.a(31252, 5806057619389610274L));
lbl123:
                                                // 2 sources

                                                if (!var3_3) break block62;
lbl124:
                                                // 2 sources

                                                var15_4 /* !! */  = (reference)(lw.a(3964, 3648089244599684635L) / lw.a(26711, 3367009529014741825L) * lw.a(31258, 5580476890397112428L) - lw.a(21989, 2528306682230297722L));
                                                if (!var3_3) break block62;
                                                ** GOTO lbl149
                                                case -442082522: 
                                            }
                                            return var5_6;
                                        }
                                        block39: while (true) {
                                            block64: {
                                                block63: {
                                                    switch (var15_4 /* !! */ ) {
                                                        default: {
                                                            v9 /* !! */  = hi.a("\u00a5", (Object)var9_9, (long)1052424951548866133L);
                                                            if (var3_3) break block63;
                                                            if (v9 /* !! */  != false) break;
                                                            break block64;
                                                        }
                                                        case -1924514442: {
                                                            if (!var3_3) break block39;
                                                            ** GOTO lbl37
                                                        }
                                                        case -1924514444: {
                                                            ** continue;
                                                        }
                                                        case -1924514443: {
                                                            hi.a("G", (long)1005006586280819563L);
                                                            hi.a("G", (long)589253768936098215L);
                                                            var15_4 /* !! */  = (reference)(lw.a(9852, 8602896577381902037L) - lw.a(20359, 3467982648547299003L) - lw.a(9497, 2187425010926462579L));
                                                            continue block39;
                                                        }
                                                    }
lbl149:
                                                    // 2 sources

                                                    v9 /* !! */  = var15_4 /* !! */  = (reference)((lw.a(11708, 1157492764459478203L) / lw.a(2203, 112762608658287175L) / lw.a(20975, 7117210263112274626L) ^ lw.a(22740, 3809060446322580376L)) - lw.a(12132, 6369317527636061806L) + lw.a(14361, 2685562230167026121L));
                                                }
                                                if (!var3_3) continue;
                                            }
                                            var15_4 /* !! */  = (reference)((lw.a(14637, 7517783204254268406L) - lw.a(17814, 1539727067996407304L) ^ lw.a(6811, 4560713049475651823L)) - lw.a(27551, 1235812256323430683L) + lw.a(854, 1414801571027190420L));
                                            if (var3_3) break;
                                        }
                                        var15_4 /* !! */  = (reference)((lw.a(32344, 2112287415176461636L) ^ lw.a(17562, 511940928482789351L)) * lw.a(26475, 2165028279814349927L) ^ lw.a(27676, 3309324690794114877L));
                                    }
                                    break;
                                }
                            }
                            block40: while (true) {
                                switch (var15_4 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -928032269: {
                                        var11_11 = hi.a("\u00a5", (Object)lw.x("YSDqrC2rPe0ttaMD", normalize(), (Vec3)new Vec3((double)lw.x("YSDqrC2rPe0ttaMD", cL(), (vm)var9_9), (double)lw.x("YSDqrC2rPe0ttaMD", cw(), (vm)var9_9), (double)lw.x("YSDqrC2rPe0ttaMD", cZ(), (vm)var9_9))), (double)var10_10, (long)1080829230854482551L);
                                        var12_12 = hi.a("\u00a5", (Object)var4_5, (Object)var11_11, (long)701637995304699260L);
                                        v10 = new Object[2];
                                        v10[1] = var12_12;
                                        v10[0] = (LocalPlayer)var1_1;
                                        v11 /* !! */  = hi.a("\u00a5", (Object)this, (Object)v10, (long)1259202755906798647L);
                                        if (var3_3) break block48;
                                        if (v11 /* !! */  != false) break block40;
                                        break block49;
                                    }
                                    case -928032268: {
                                        ** continue;
                                    }
                                    case -928032267: {
                                        hi.a("G", (long)785752490276612505L);
                                        lw.x("YSDqrC2rPe0ttaMD", x());
                                        var15_4 /* !! */  = (reference)(hi.a("G", (int)(lw.a(9933, 5908638826467370382L) / lw.a(6986, 7378427741402504160L) * lw.a(16392, 9163030474764567294L)), (int)lw.a(14743, 1790225875570997466L), (long)834203424483934088L) ^ lw.a(7392, 2425997697148394873L));
                                        continue block40;
                                    }
                                }
                                break;
                            }
                            v11 /* !! */  = var15_4 /* !! */  = hi.a("G", (int)(lw.a(21245, 6435499862130938244L) ^ lw.a(16008, 5244485211224095973L)), (int)lw.a(7161, 6449367956865849372L), (long)834203424483934088L) + lw.a(1828, 4233155800923800701L);
                        }
                        if (!var3_3) break block65;
                    }
                    var15_4 /* !! */  = (reference)(((lw.a(16877, 4398557916353249397L) * lw.a(20509, 6296636427398828447L) ^ lw.a(4624, 3111669889929023562L)) + lw.a(19503, 5497171896130850183L)) / lw.a(17305, 260087325598270263L) + lw.a(4128, 6016183027557667184L));
                    if (var3_3) ** GOTO lbl207
                }
                while (true) {
                    block66: {
                        switch (var15_4 /* !! */ ) {
                            default: {
                                if (!var3_3) break;
                                ** GOTO lbl57
                            }
                            case -384123503: {
                                ** continue;
                            }
                            case -384123502: {
                                if (var3_3) {
                                    continue block35;
                                }
                                break block66;
                            }
                            case -384123498: {
                                continue block35;
                            }
                            case -384123499: {
                                continue block36;
                            }
                            case -384123500: {
                                throw null;
                            }
                        }
lbl207:
                        // 2 sources

                        var15_4 /* !! */  = (reference)((lw.a(32664, 4511974898274925826L) + lw.a(9347, 6667199380535190884L) ^ lw.a(31614, 5692287208982313263L)) - lw.a(19381, 3765130820735224383L));
                        if (!var3_3) continue;
lbl209:
                        // 2 sources

                        v5 /* !! */  = var15_4 /* !! */  = hi.a("G", (int)((lw.a(10378, 4551617171703671256L) ^ lw.a(10510, 6784010952458774719L)) * lw.a(32105, 5674372219308309558L)), (int)lw.a(29770, 4028611586937222814L), (long)834203424483934088L) + lw.a(15314, 9119655638222387926L);
lbl210:
                        // 2 sources

                        if (!var3_3) continue;
lbl211:
                        // 2 sources

                        var15_4 /* !! */  = hi.a("G", (int)hi.a("G", (int)lw.a(15899, 4304120698926841719L), (int)lw.a(20620, 938827851344597830L), (long)834203424483934088L), (int)lw.a(15645, 7733092254297013963L), (long)834203424483934088L) + lw.a(4905, 2924198789463118398L);
                        if (!var3_3) continue;
                    }
                    var15_4 /* !! */  = (reference)((lw.a(16424, 438453168591192479L) + lw.a(8529, 1034929531397251684L) ^ lw.a(8928, 7253071160557379987L)) - lw.a(4096, 6292064696298934787L));
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean O(Object[] var1_1) {
        block32: {
            block36: {
                block31: {
                    block30: {
                        var3_2 = var1_1[0];
                        var2_3 = var1_1[1];
                        var4_4 = var1_1[2];
                        var5_5 = Dl.t();
                        var9_6 = hi.a("G", (int)lw.a(21403, 5134465631125819545L), (int)lw.a(1757, 3742323750454790026L), (long)834203424483934088L) ^ lw.a(29969, 3422863772676716534L);
                        if (!var5_5) ** GOTO lbl18
                        block19: while (true) {
                            block35: {
                                block34: {
                                    block33: {
                                        v0 /* !! */  = (cfr_temp_0 = hi.a("\u00a5", (Object)((Vec3)var4_4), (long)431225985925845942L) - 1.0E-6) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                        if (var5_5) break block33;
                                        if (v0 /* !! */  < 0) break block34;
                                        v0 /* !! */  = (reference)(lw.a(3642, 2636445699103001980L) * lw.a(16916, 3306481293333184897L) * lw.a(15870, 2278921199803383668L) - lw.a(22975, 4804645482788117162L) - lw.a(6157, 2660148392251300723L) - lw.a(14977, 336339778414132053L));
                                    }
                                    var9_6 = (boolean)v0 /* !! */ ;
                                    if (!var5_5) break block35;
                                }
                                var9_6 = (lw.a(3840, 7383146119079759266L) ^ lw.a(23474, 4735740421961243194L) ^ lw.a(1969, 5448362258993022625L)) + lw.a(11767, 453375899304963776L);
                            }
                            switch (var9_6) {
                                default: {
                                    continue block19;
                                }
                                case -1261481773: {
                                    return true;
                                }
                                case -1261481772: {
                                    var6_7 = lw.x("YSDqrC2rPe0ttaMD", expandTowards(net.minecraft.world.phys.Vec3 ), (AABB)((AABB)var2_3), (Vec3)((Vec3)var4_4));
                                    v1 /* !! */  = hi.a("\u00a5", (Object)this, (Object)((LocalPlayer)var3_2), (Object)var6_7, (long)741697090339207302L);
                                    if (var5_5) break block30;
                                    if (v1 /* !! */  == false) break block19;
                                    break block31;
                                }
                                case -1261481771: {
                                    throw null;
                                }
                            }
                            break;
                        }
                        v1 /* !! */  = (CallSite)(lw.a(25305, 1744855105753931966L) - lw.a(19662, 7708423518650682682L) + lw.a(15476, 4992434303600966875L));
                    }
                    var9_6 = (boolean)v1 /* !! */ ;
                    if (!var5_5) break block36;
                }
                var9_6 = (boolean)(lw.x("YSDqrC2rPe0ttaMD", max(int int ), (int)(lw.a(938, 5899560974783840989L) + lw.a(19634, 4699533990402248608L)), (int)lw.a(29923, 3497959785879631583L)) - lw.a(31794, 5990777163735891270L));
                if (!var5_5) break block36;
                ** GOTO lbl61
lbl41:
                // 2 sources

                while (true) {
                    v2 /* !! */  = hi.a("\u00a5", (Object)var7_8, (long)984088978567310565L);
                    if (var5_5) ** GOTO lbl69
                    if (v2 /* !! */  == false) ** GOTO lbl68
                    ** GOTO lbl71
                    break;
                }
            }
            block21: while (true) {
                switch (var9_6) {
                    default: {
                        v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((LocalPlayer)var3_2), (long)827913124966560621L), (Object)((LocalPlayer)var3_2), (Object)hi.a("\u00a5", (Object)((AABB)var2_3), (Object)((Vec3)var4_4), (long)1074515606318807979L), (long)645807885150158196L);
                        if (var5_5) ** GOTO lbl62
                        if (v3 /* !! */  != false) ** GOTO lbl61
                        ** GOTO lbl64
                    }
                    case -164855550: {
                        var7_8 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((LocalPlayer)var3_2), (long)827913124966560621L), (Object)((LocalPlayer)var3_2), (Object)var6_7, (long)395302770486547245L), (long)414337658232293583L);
                        if (!var5_5) ** GOTO lbl66
                        ** GOTO lbl41
                    }
                    case -164855551: {
                        throw null;
                    }
lbl61:
                    // 2 sources

                    v3 /* !! */  = (CallSite)(lw.a(20989, 8063316604547616873L) * lw.a(30815, 1526983013669993078L) - lw.a(8571, 5456823469362553609L));
lbl62:
                    // 2 sources

                    var9_6 = (boolean)v3 /* !! */ ;
                    if (!var5_5) continue block21;
lbl64:
                    // 2 sources

                    var9_6 = lw.a(19021, 3016546284608474109L) - lw.a(7150, 8276978237287209214L) + lw.a(16161, 8890415234739420166L);
                    continue block21;
lbl66:
                    // 1 sources

                    var9_6 = lw.a(31326, 2944869783992072304L) * lw.a(29465, 7077932978372309286L) / 5 * lw.a(22228, 3390833272088254253L) ^ lw.a(10954, 3304457385061788666L);
                    if (!var5_5) break block32;
lbl68:
                    // 2 sources

                    v2 /* !! */  = (CallSite)(((lw.a(10271, 8528184192679193038L) + lw.a(10976, 8663655557090093229L)) / lw.a(23511, 785228222171961978L) / lw.a(6986, 7378427741402504160L) ^ lw.a(11777, 7231358232434551874L)) - lw.a(17022, 1067606057970745735L));
lbl69:
                    // 2 sources

                    var9_6 = (boolean)v2 /* !! */ ;
                    if (!var5_5) break block32;
lbl71:
                    // 2 sources

                    var9_6 = (lw.a(17194, 4089269477284954848L) * lw.a(27786, 380137356764376515L) ^ lw.a(1383, 2819969310869489176L)) * lw.a(30567, 8764772523416057071L) / lw.a(7689, 5046555858816081831L) + lw.a(23342, 1181109013510084940L);
                    break block32;
                    case -164855549: 
                }
                break;
            }
            return false;
        }
        block22: while (true) {
            switch (var9_6) {
                default: {
                    ** continue;
                }
                case -1132830605: {
                    var8_9 = (VoxelShape)lw.x("YSDqrC2rPe0ttaMD", next(), (Iterator)var7_8);
                    v4 /* !! */  = hi.a("\u00a5", (Object)((AABB)var2_3), (Object)((Vec3)var4_4), (Object)hi.a("\u00a5", (Object)var8_9, (long)948473201875045121L), (long)581149642116295624L);
                    if (var5_5) ** GOTO lbl92
                    if (v4 /* !! */  == false) ** GOTO lbl91
                    ** GOTO lbl94
                }
                case -1132830607: {
                    hi.a("G", (double)1.0, (float)1.0f, (boolean)false, (boolean)true, (boolean)true, (boolean)true, (boolean)false, (boolean)false, (boolean)true, (boolean)true, (int)lw.a(2203, 112762608658287175L), (long)1218704056816907128L);
                    return true;
                }
lbl91:
                // 1 sources

                v4 /* !! */  = (CallSite)((lw.a(28523, 1384886614866554098L) ^ lw.a(19082, 2737480978447910957L)) + lw.a(31803, 749938859178425918L) - lw.a(24624, 7077936642099798960L));
lbl92:
                // 2 sources

                var9_6 = (boolean)v4 /* !! */ ;
                if (!var5_5) ** GOTO lbl96
lbl94:
                // 2 sources

                var9_6 = lw.a(12704, 7288877689492222792L) / lw.a(7689, 5046555858816081831L) ^ lw.a(25312, 1656300031403122929L);
                if (var5_5) ** GOTO lbl107
lbl96:
                // 2 sources

                v5 = var9_6;
                if (var5_5 != false) return v5;
                switch (v5) {
                    default: {
                        return false;
                    }
                    case -89476228: {
                        if (!var5_5) break;
                        return true;
                    }
                    case -89476227: {
                        lw.x("YSDqrC2rPe0ttaMD", T());
                        return true;
                    }
                }
lbl107:
                // 2 sources

                var9_6 = lw.a(31716, 3215923908604099008L) * lw.a(20498, 4484393417786413742L) / 5 * lw.a(28670, 8388031178402229708L) ^ lw.a(23342, 372258037804292600L);
                continue block22;
                case -1132830604: 
            }
            break;
        }
        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Vec3 W(Object[] var1_1) {
        var2_2 = var1_1[0];
        var4_3 = var1_1[1];
        var3_4 = (Integer)var1_1[2];
        var5_5 = Dl.t();
        var9_6 /* !! */  = (lw.a(3945, 9078353090481654858L) * lw.a(4800, 4536556988488913026L) - lw.a(15034, 761392767202834468L) ^ lw.a(4364, 3243875889905471492L)) + lw.a(731, 6969283959869899690L) ^ lw.a(124, 3607908201569518017L);
        if (var5_5) ** GOTO lbl-1000
        switch (var9_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var6_7 = hi.a("\u00a5", (Object)((Vec3)var4_3), (Object)((Vec3)var2_2), (long)1082050008038634828L);
                var7_8 = hi.a("\u00a5", (Object)var6_7, (long)466029558179589985L);
                cfr_temp_0 = var7_8 - (double)var3_4;
                v0 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (var5_5) ** GOTO lbl33
                if (v0 <= 0) ** GOTO lbl32
                if (true) ** GOTO lbl35
            }
            case 316687595: {
                return null;
            }
        }
        block8: while (true) {
            switch (var9_6 /* !! */ ) {
                default: {
                    cfr_temp_1 = var7_8 - 0.001;
                    v1 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                    if (var5_5) ** GOTO lbl38
                    if (v1 /* !! */  >= 0) ** GOTO lbl37
                    ** GOTO lbl40
                }
                case 119278526: {
                    hi.a("G", (long)789749075287395726L);
                    if (var5_5 == false) return hi.a("\u00a5", (Object)((Vec3)var2_2), (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var6_7, (long)1049603101739605009L), (double)var3_4, (long)1080829230854482551L), (long)701637995304699260L);
lbl32:
                    // 2 sources

                    v0 = hi.a("G", (int)lw.a(10260, 1335012563555985897L), (int)lw.a(16755, 3787931787787486198L), (long)834203424483934088L) / lw.a(14327, 973223659292178145L) - lw.a(8679, 6227286351398150751L);
lbl33:
                    // 2 sources

                    var9_6 /* !! */  = (int)v0;
                    if (!var5_5) continue block8;
lbl35:
                    // 2 sources

                    var9_6 /* !! */  = (int)(lw.x("YSDqrC2rPe0ttaMD", max(int int ), (int)((lw.a(25029, 34683900700976086L) ^ lw.a(4985, 4131312795612910010L)) / 2 / 3), (int)lw.a(5475, 11554603085894719L)) - lw.a(5488, 4681989857034277972L));
                    if (!var5_5) continue block8;
lbl37:
                    // 2 sources

                    v1 /* !! */  = (reference)(lw.a(26758, 5051250139257334622L) - lw.a(7216, 2622103887320784485L) + lw.a(21980, 442718899829986980L) + lw.a(16260, 370111267230203091L) - lw.a(30899, 1250163956608301568L));
lbl38:
                    // 2 sources

                    var9_6 /* !! */  = (int)v1 /* !! */ ;
                    if (!var5_5) continue block8;
lbl40:
                    // 2 sources

                    var9_6 /* !! */  = (int)(hi.a("G", (int)lw.a(4068, 2489769350269177037L), (int)lw.a(16564, 5873021715774619679L), (long)834203424483934088L) / lw.a(14327, 973223659292178145L) - lw.a(17517, 1769657504865339069L));
                    continue block8;
                }
                case 119278523: {
                    return (Vec3)var4_3;
                }
                case 119278524: 
            }
            break;
        }
        return hi.a("\u00a5", (Object)((Vec3)var2_2), (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var6_7, (long)1049603101739605009L), (double)var3_4, (long)1080829230854482551L), (long)701637995304699260L);
    }

    /*
     * Unable to fully structure code
     */
    private boolean x(Object[] var1_1) {
        block9: {
            var2_2 = var1_1[0];
            var3_3 = var1_1[1];
            var5_4 = (Integer)var1_1[2];
            var4_5 = (Integer)var1_1[3];
            var6_6 = Dl.S();
            var7_7 = (lw.a(3263, 6947043366953684948L) ^ lw.a(4844, 6020201031696880583L)) + lw.a(10074, 5633277393918993844L) + lw.a(3847, 1184877311643126886L);
            if (var6_6) break block9;
lbl9:
            // 2 sources

            while (true) {
                v0 = var5_4;
                if (!var6_6) ** GOTO lbl39
                if (v0 != 0) ** GOTO lbl38
                ** GOTO lbl40
                break;
            }
lbl14:
            // 2 sources

            while (true) {
                v1 = new Object[2];
                v1[1] = (Vec3)hi.a("\u00a5", (Object)((List)var3_3), (int)var4_5, (long)516183098926246296L);
                v1[0] = (LocalPlayer)var2_2;
                return (boolean)hi.a("\u00a5", (Object)this, (Object)v1, (long)368951674786617411L);
            }
lbl19:
            // 1 sources

            return (boolean)lw.x("YSDqrC2rPe0ttaMD", M(java.lang.Object java.lang.Object java.lang.Object ), (lw)this, (Object)((LocalPlayer)var2_2), (Object)((Vec3)hi.a("\u00a5", (Object)((List)var3_3), (int)var5_4, (long)516183098926246296L)), (Object)((Vec3)hi.a("\u00a5", (Object)((List)var3_3), (int)var4_5, (long)516183098926246296L)));
        }
        while (true) {
            switch (var7_7) {
                default: {
                    ** continue;
                }
                case -980491580: {
                    ** GOTO lbl14
                }
                case -980491581: {
                    ** continue;
                }
                case -980491579: 
            }
            lw.x("YSDqrC2rPe0ttaMD", a(int boolean ), (int)0, (boolean)false);
            hi.a("G", (long)660349619478157975L);
            if (!var6_6) ** break;
            ** continue;
lbl38:
            // 2 sources

            v0 = var7_7 = lw.a(3174, 6899973893047685070L) / lw.a(30545, 4005689777465849479L) - lw.a(12114, 8832968139480542376L) + lw.a(10851, 6234911078130362527L);
lbl39:
            // 2 sources

            if (var6_6) continue;
lbl40:
            // 2 sources

            var7_7 = (lw.a(18185, 1797779945110521242L) ^ lw.a(27830, 1577520302588554909L)) - lw.a(16713, 48065910590849885L);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3AF;
        if (b[n2] == null) {
            lw.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
