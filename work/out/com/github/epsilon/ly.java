/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.Holder
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.boss.enderdragon.EndCrystal
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.DQ;
import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ly {
    public static final float d = 6.0f;
    public static final float A = 5.0f;
    private static final EquipmentSlot[] S;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float j(Object[] var0) {
        block52: {
            block53: {
                block51: {
                    block50: {
                        block54: {
                            var1_1 = (LivingEntity)var0[0];
                            var2_2 = (Vec3)var0[1];
                            var4_3 = ((Float)var0[2]).floatValue();
                            var3_4 = (Vec3)var0[3];
                            var5_5 = (DQ)var0[4];
                            var6_6 = Dl.S();
                            var19_7 /* !! */  = (hi.a("G", (int)(hi.a("G", (int)ly.a(5451, 2335679240955375563L), (int)ly.a(832, 331766411728566656L), (long)834203424483934088L) * ly.a(28648, 2568423762914333868L)), (int)ly.a(18477, 3613528386794681110L), (long)834203424483934088L) ^ ly.a(9148, 7278342559515679152L)) + ly.a(25618, 8793592529630584333L);
                            if (var6_6) break block54;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1072079450906884525L);
                                if (!var6_6) ** GOTO lbl185
                                if (v0 /* !! */  == false) ** GOTO lbl184
                                ** GOTO lbl187
                                break;
                            }
lbl15:
                            // 2 sources

                            while (true) {
                                v1 /* !! */  = var3_4;
                                var19_7 /* !! */  = ly.a(10053, 462965890401049804L) * ly.a(18557, 480409023034651347L) - ly.a(27563, 4737510091307307484L) + ly.a(21370, 1095138970824206700L);
                                if (var6_6) ** GOTO lbl111
                                ** GOTO lbl110
                                break;
                            }
lbl20:
                            // 2 sources

                            while (true) {
                                block56: {
                                    block55: {
                                        var8_9 /* !! */  = v1 /* !! */ ;
                                        var9_10 = hi.a("\u00a5", (Object)var8_9 /* !! */ , (Object)var2_2, (long)1256728004038227497L) / (double)var7_8;
                                        cfr_temp_0 = var9_10 - 1.0;
                                        v2 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                        if (!var6_6) break block55;
                                        if (v2 /* !! */  > 0) break block56;
                                        v2 /* !! */  = (reference)(hi.a("G", (int)((ly.a(10231, 2653696608020897151L) ^ ly.a(31576, 6015527568363175955L) ^ ly.a(1970, 5667395829340257585L)) + ly.a(25934, 3376770266852908992L)), (int)ly.a(23389, 53266283227439458L), (long)834203424483934088L) ^ ly.a(32343, 7135665307250181218L));
                                    }
                                    var19_7 /* !! */  = (int)v2 /* !! */ ;
                                    if (var6_6) break block50;
                                }
                                var19_7 /* !! */  = ly.a(4232, 4619602362558458777L) / ly.a(26080, 4934598463833202313L) - ly.a(14851, 3507421066902372487L);
                                if (var6_6) break block50;
                                ** GOTO lbl140
                                break;
                            }
lbl35:
                            // 2 sources

                            while (true) {
                                v3 = ly.z("A7vvKSyAlydNjFy9", getBoundingBox(), (LivingEntity)var1_1);
                                if (var6_6) break block51;
lbl39:
                                // 2 sources

                                while (true) {
                                    v4 /* !! */  = hi.a("G", (int)-1, (long)701518974625326203L);
lbl41:
                                    // 2 sources

                                    while (true) {
                                        hi.a("G", (long)1318921989870229166L);
lbl44:
                                        // 2 sources

                                        while (true) {
                                            block61: {
                                                block60: {
                                                    block59: {
                                                        block58: {
                                                            block57: {
                                                                var11_11 = v3;
                                                                v5 = new Object[3];
                                                                v5[2] = var1_1;
                                                                v5[1] = var11_11;
                                                                v5[0] = var2_2;
                                                                var12_12 = hi.a("G", (Object)v5, (long)483775539616901849L);
                                                                cfr_temp_1 = var12_12 - 0.0f;
                                                                v6 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                if (!var6_6) break block57;
                                                                if (v6 <= 0) break block58;
                                                                v6 = (hi.a("G", (int)(ly.a(15686, 8783231411521029671L) / ly.a(2820, 1601732472820903956L)), (int)ly.a(7389, 2489448438281938489L), (long)834203424483934088L) - ly.a(26539, 7409081107348118614L)) / 4 + ly.a(20795, 8768222183211690989L);
                                                            }
                                                            var19_7 /* !! */  = (int)v6;
                                                            if (var6_6) break block59;
                                                        }
                                                        var19_7 /* !! */  = ly.a(16746, 5192911004735502917L) ^ ly.a(14733, 8096247841409598227L) ^ ly.a(10797, 5758403220807356725L);
                                                    }
                                                    switch (var19_7 /* !! */ ) {
                                                        default: {
                                                            return 0.0f;
                                                        }
                                                        case 885834041: {
                                                            var13_13 = (1.0 - var9_10) * (double)var12_12;
                                                            var15_14 /* !! */  = (float)((var13_13 * var13_13 + var13_13) / 2.0 * 7.0 * (double)var7_8 + 1.0);
                                                            v7 = var1_1 instanceof Player;
                                                            if (!var6_6) break block60;
                                                            if (v7 == 0) break;
                                                            break block61;
                                                        }
                                                        case 885834042: {
                                                            return (float)hi.a("G", (Object)new Object[]{Float.valueOf(0.5f)}, (long)842688358493305377L);
                                                        }
                                                    }
                                                    v7 = var19_7 /* !! */  = ((ly.a(22060, 2863922693992279282L) ^ ly.a(29741, 1425251592868220889L)) * ly.a(11694, 1979961532016498216L) + ly.a(24313, 4982777624604599633L)) * ly.a(31781, 7201526542341916554L) ^ ly.a(8800, 8170142120454854890L);
                                                }
                                                if (var6_6) break block52;
                                            }
                                            var19_7 /* !! */  = hi.a("G", (int)(ly.a(21747, 5333143063540461502L) + ly.a(31406, 4133204762695516378L)), (int)ly.a(25161, 4222933165631789175L), (long)834203424483934088L) ^ ly.a(9938, 8504220606259764335L);
                                            break block52;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
lbl81:
                        // 3 sources

                        while (true) {
                            switch (var19_7 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case -1046497438: {
                                    var7_8 = var4_3 * 2.0f;
                                    if (!var6_6) ** GOTO lbl94
                                    if (var3_4 == null) ** GOTO lbl93
                                    ** GOTO lbl95
                                }
                                case -1046497436: {
                                    throw null;
                                }
lbl93:
                                // 1 sources

                                var19_7 /* !! */  = (hi.a("G", (int)(ly.a(18823, 2883465504174174930L) / ly.a(6118, 639787888457231447L)), (int)ly.a(2079, 5564318618647212561L), (long)834203424483934088L) ^ ly.a(7850, 5775147490576803020L)) + ly.a(24192, 1377988785358595188L) - ly.a(4253, 8999618517037230630L);
lbl94:
                                // 2 sources

                                if (var6_6) ** GOTO lbl96
lbl95:
                                // 2 sources

                                var19_7 /* !! */  = ly.a(30877, 7987033522312430371L) + ly.a(18699, 9021436042831753780L) - ly.a(28157, 6778208922799789660L) - ly.a(7244, 2738071027650537471L);
lbl96:
                                // 2 sources

                                switch (var19_7 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl15
                                    }
                                    case 606605194: {
                                        v1 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)696157270322254464L);
                                        if (var6_6) break;
                                        ** GOTO lbl20
                                    }
                                    case 606605193: {
                                        hi.a("G", (long)556737103604967103L);
                                        hi.a("G", (long)369479218486228686L);
                                        ** continue;
                                    }
                                }
lbl110:
                                // 2 sources

                                var19_7 /* !! */  = ly.a(3749, 7474808492855899370L) * ly.a(29574, 2033603193693784306L) - ly.a(23013, 1063422364288705327L) + ly.a(18140, 6497182192840506857L);
lbl111:
                                // 2 sources

                                switch (var19_7 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -1758399042: 
                                }
                                return -1.0f;
                                case -1046497439: 
                            }
                            return 0.0f;
                        }
                    }
                    block37: while (true) {
                        block62: {
                            switch (var19_7 /* !! */ ) {
                                case -1053723553: {
                                    if (var3_4 == null) break;
                                    break block62;
                                }
                                case -1053723551: {
                                    v8 = new Object[2];
                                    v8[1] = var3_4;
                                    v8[0] = var1_1;
                                    v3 = hi.a("G", (Object)v8, (long)1303713876118933350L);
                                    var19_7 /* !! */  = (ly.a(4276, 1389716337369197123L) ^ ly.a(20228, 408620855944345009L)) + ly.a(31028, 2722164568918475732L);
                                    if (!var6_6) {
                                        break block37;
                                    }
                                    break block53;
                                }
                                case -1053723549: {
                                    hi.a("G", (long)1026165039297148217L);
                                    hi.a("G", (long)461891726241433586L);
                                    ** GOTO lbl35
                                }
                                case -1053723552: {
                                    ** continue;
                                }
                            }
lbl140:
                            // 2 sources

                            var19_7 /* !! */  = (ly.a(24080, 3045536151068828721L) ^ ly.a(2846, 4918170674451886360L)) / 5 * ly.a(4316, 8110262853304494880L) + ly.a(1709, 6048655158383983886L);
                            if (var6_6) continue;
                        }
                        var19_7 /* !! */  = hi.a("G", (int)(ly.a(11130, 6717176154156798340L) * ly.a(5776, 3630856174752771114L)), (int)ly.a(8624, 5954423766004702029L), (long)834203424483934088L) * ly.a(26758, 2677576714701001437L) * ly.a(11298, 8655067793898706874L) ^ ly.a(14750, 9130303828053295674L);
                    }
                }
                var19_7 /* !! */  = (ly.a(4326, 8953352958711704115L) ^ ly.a(9265, 9106269651906993677L)) + ly.a(26653, 3292977172274893353L);
            }
            v4 /* !! */  = (CallSite)var19_7 /* !! */ ;
            ** while (!var6_6)
lbl150:
            // 1 sources

            switch (v4 /* !! */ ) {
                case -1811601231: {
                    ** continue;
                }
            }
            ** while (true)
            return 0.0f;
        }
        while (true) {
            block63: {
                switch (var19_7 /* !! */ ) {
                    default: {
                        var16_15 = (Player)var1_1;
                        v9 = new Object[2];
                        v9[1] = var16_15;
                        v9[0] = Float.valueOf(var15_14 /* !! */ );
                        var15_14 /* !! */  = (float)hi.a("G", (Object)v9, (long)548206405001949806L);
                        if (var6_6) break block63;
                        ** GOTO lbl-1000
                    }
                    case -1477502518: lbl-1000:
                    // 2 sources

                    {
                        v10 = new Object[2];
                        v10[1] = Float.valueOf(var15_14 /* !! */ );
                        v10[0] = var1_1;
                        var16_16 = hi.a("G", (Object)v10, (long)460527582272000003L);
                        var17_17 = ly.z("A7vvKSyAlydNjFy9", d(java.lang.Object float ), (Object)var1_1, (float)var16_16);
                        v11 = new Object[3];
                        v11[2] = var5_5;
                        v11[1] = Float.valueOf((float)var17_17);
                        v11[0] = var1_1;
                        var18_18 = hi.a("G", (Object)v11, (long)628952870059575273L);
                        return (float)ly.z("A7vvKSyAlydNjFy9", max(float float ), (float)0.0f, (float)var18_18);
                    }
                    case -1477502516: 
                }
                hi.a("G", (float)2.0f, (float)0.5f, (float)0.0f, (float)2.0f, (long)796776827756410481L);
                var19_7 /* !! */  = (ly.a(24502, 6259816638935688696L) ^ ly.a(26265, 1733836607214083430L)) - ly.a(530, 779940431991224689L) ^ ly.a(17182, 5744813982204426470L);
                if (var6_6) continue;
lbl184:
                // 2 sources

                v0 /* !! */  = (CallSite)((ly.a(18822, 3874868421505053441L) - ly.a(8855, 1970812658217425348L) ^ ly.a(22718, 8992041814703727104L)) + ly.a(13262, 7493759788272585180L) + ly.a(26570, 5819267207950818429L));
lbl185:
                // 2 sources

                var19_7 /* !! */  = (int)v0 /* !! */ ;
                if (var6_6) ** GOTO lbl81
lbl187:
                // 2 sources

                var19_7 /* !! */  = (int)(hi.a("G", (int)(ly.a(9327, 7153613062835707467L) + ly.a(16073, 4576789310153983371L) + ly.a(31644, 5573227760914547091L)), (int)ly.a(1468, 8864803694732197551L), (long)834203424483934088L) + ly.a(18098, 159221415954709753L));
                ** continue;
            }
            var19_7 /* !! */  = ((ly.a(30866, 4215896165462098868L) ^ ly.a(5008, 1060565805018622403L)) * ly.a(25689, 8938695241288015836L) + ly.a(660, 1166674950334658856L)) * ly.a(22367, 4844195946142657655L) ^ ly.a(12214, 1457733219284260251L);
        }
    }

    public static float s(Object[] objectArray) {
        LivingEntity livingEntity = (LivingEntity)objectArray[0];
        Vec3 vec3 = (Vec3)objectArray[1];
        Vec3 vec32 = (Vec3)objectArray[2];
        DQ dQ = (DQ)((Object)objectArray[3]);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = dQ;
        objectArray2[3] = vec32;
        objectArray2[2] = Float.valueOf(6.0f);
        objectArray2[1] = vec3;
        objectArray2[0] = livingEntity;
        return (float)hi.a("G", (Object)objectArray2, (long)485195998866200174L);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static float f(Object[] objectArray) {
        Vec3 vec3 = (Vec3)objectArray[0];
        Vec3 vec32 = (Vec3)objectArray[1];
        DQ dQ = (DQ)((Object)objectArray[2]);
        boolean bl = Dl.t();
        int n = (ly.a(20108, 380591832963970519L) ^ ly.a(16656, 7973667778456353598L)) - ly.a(6005, 893781111749651836L);
        boolean bl2 = true;
        block5: while (true) {
            block8: {
                block9: {
                    if (bl2 && !(bl2 = false) && !bl) break block8;
                    if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null) break block9;
                    n = (ly.z("A7vvKSyAlydNjFy9", max(int int ), (int)ly.a(21464, 1290247101955696971L), (int)ly.a(10325, 5998892636052460188L)) - ly.a(14179, 858959550090939433L) ^ ly.a(30263, 5770946763130621234L)) / ly.a(1712, 3351061277066509573L) ^ ly.a(4727, 4863485201451100484L);
                    if (!bl) break block8;
                }
                n = (ly.a(17225, 1066767453357177186L) ^ ly.a(30363, 3570720024917822571L)) + ly.a(15767, 8380755467123492503L);
            }
            switch (n) {
                default: {
                    continue block5;
                }
                case -454990354: {
                    return 0.0f;
                }
                case -454990355: {
                    Object[] objectArray2 = new Object[4];
                    objectArray2[3] = dQ;
                    objectArray2[2] = vec32;
                    objectArray2[1] = vec3;
                    objectArray2[0] = hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L);
                    return (float)hi.a("G", (Object)objectArray2, (long)473135567888506656L);
                }
                case -454990352: 
            }
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float d(Object var0, float var1_1) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var2_2 = Dl.S();
                        var7_3 /* !! */  = ((ly.a(18798, 4061611842362012639L) + ly.a(10795, 952231660552982869L)) / ly.a(22489, 7038808417154035119L) - ly.a(6172, 8379312072403067583L)) / 4 - ly.a(300, 1770108586598513607L);
                        if (!var2_2) {
lbl5:
                            // 2 sources

                            while (true) {
                                ly.z("A7vvKSyAlydNjFy9", values());
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 /* !! */  = ly.z("A7vvKSyAlydNjFy9", hasEffect(net.minecraft.core.Holder ), (LivingEntity)((LivingEntity)var0), (Holder)hi.a("j", (long)784560812929026034L));
                                    if (!var2_2) break block12;
                                    if (v0 /* !! */  == false) break block13;
                                    break block14;
                                    break;
                                }
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((LivingEntity)var0), (Object)hi.a("j", (long)784560812929026034L), (long)846149265482660927L), (long)1127906518344351232L);
                                var4_5 = (var3_4 + true) * 5;
                                var5_6 = ly.a(29848, 1102109855591812861L) - var4_5;
                                var6_7 = var1_1 /* !! */  * (float)var5_6;
                                var1_1 /* !! */  = (float)hi.a("G", (float)(var6_7 / 25.0f), (float)0.0f, (long)1021203527991582354L);
                                if (!var2_2) lbl-1000:
                                // 2 sources

                                {
                                    return var1_1 /* !! */ ;
                                }
                                break block15;
                                break;
                            }
                        }
lbl23:
                        // 5 sources

                        while (true) {
                            switch (var7_3 /* !! */ ) {
                                case -1687850119: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                case -1687850117: {
                                    ** continue;
                                }
                                ** case -1687850118:
lbl32:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    v0 /* !! */  = (CallSite)(ly.a(31571, 2087884697937789435L) / ly.a(30928, 3221949045991358989L) + ly.a(31341, 6447318132305871008L));
                }
                var7_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) ** GOTO lbl23
            }
            var7_3 /* !! */  = (int)((ly.z("A7vvKSyAlydNjFy9", max(int int ), (int)ly.a(7931, 5052858078157415817L), (int)ly.a(8373, 9188184132568980227L)) + ly.a(29407, 1925141545946564691L)) / ly.a(3256, 5173002222724429588L) + ly.a(23180, 7767797529895821531L));
            ** GOTO lbl23
        }
        var7_3 /* !! */  = ly.a(4461, 2851228268147026555L) / ly.a(4980, 3813347283796207620L) + ly.a(20726, 8676999301936901085L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float G(Object[] var0) {
        block15: {
            var3_1 = (LivingEntity)var0[0];
            var2_2 = (Vec3)var0[1];
            var1_3 = ((Float)var0[2]).floatValue();
            var4_4 = Dl.t();
            var11_5 /* !! */  = (ly.a(21079, 8780732008679631068L) ^ ly.a(18373, 5815936713419554217L)) + ly.a(9443, 3221989932097445506L) ^ ly.a(4068, 4078444569974027719L);
            if (var4_4) ** GOTO lbl-1000
            switch (var11_5 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var5_6 = var1_3 * 2.0f;
                    var6_7 = hi.a("G", (double)hi.a("\u00a5", (Object)var3_1, (Object)var2_2, (long)591044416630901329L), (long)1236096628704034685L) / (double)var5_6;
                    cfr_temp_0 = var6_7 - 1.0;
                    v0 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (var4_4) ** GOTO lbl60
                    if (v0 <= 0) ** GOTO lbl59
                    if (true) ** GOTO lbl62
                }
                case 1032275289: {
                    break;
                }
            }
            break block15;
            block11: while (true) {
                block18: {
                    block17: {
                        block16: {
                            switch (var11_5 /* !! */ ) {
                                case 1665143067: {
                                    v1 = new Object[2];
                                    v1[1] = var3_1;
                                    v1[0] = var2_2;
                                    var8_8 = hi.a("G", (Object)v1, (long)1221829816368843511L);
                                    cfr_temp_1 = var8_8 - 0.0f;
                                    v2 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                    if (var4_4) break block16;
                                    if (v2 > 0) break;
                                    break block17;
                                }
                                case 1665143069: {
                                    break block11;
                                }
                            }
                            v2 = hi.a("G", (int)ly.a(13246, 7213473091396470829L), (int)ly.a(7729, 4091337038359995725L), (long)834203424483934088L) / ly.a(1501, 3311698236578250447L) - ly.a(20604, 5074030892023999123L);
                        }
                        var11_5 /* !! */  = (int)v2;
                        if (!var4_4) break block18;
                    }
                    var11_5 /* !! */  = ly.a(28039, 1046542776457844698L) / ly.a(6118, 639787888457231447L) - ly.a(24043, 7023612430122837907L);
                    break block18;
                    return 0.0f;
                }
                do {
                    switch (var11_5 /* !! */ ) {
                        default: {
                            return 0.0f;
                        }
                        case 1379739378: {
                            var9_9 = (1.0 - var6_7) * (double)var8_8;
                            return (float)((var9_9 * var9_9 + var9_9) / 2.0 * 7.0 * (double)var5_6 + 1.0);
                        }
                        case 1379739379: 
                    }
                    hi.a("G", (long)867976699951098165L);
                    hi.a("G", (long)641038085929903199L);
                    var11_5 /* !! */  = (ly.a(13058, 4460827702659909735L) * ly.a(22762, 5974347742270514062L) ^ ly.a(17673, 108647927331258103L)) * ly.a(28055, 4192757474418972488L) + ly.a(13309, 3557084821057374452L);
                } while (!var4_4);
lbl59:
                // 2 sources

                v0 = hi.a("G", (int)((ly.a(29969, 8113613579165421391L) ^ ly.a(15200, 3788763374388347337L)) - ly.a(25833, 3085943673724788581L)), (int)ly.a(30896, 8596917879230186203L), (long)834203424483934088L) + ly.a(21510, 4988625392508071488L);
lbl60:
                // 2 sources

                var11_5 /* !! */  = (int)v0;
                if (!var4_4) continue;
lbl62:
                // 2 sources

                var11_5 /* !! */  = ly.z("A7vvKSyAlydNjFy9", max(int int ), (int)(ly.a(20527, 1057382438752742131L) * ly.a(29081, 857383203668871684L) ^ ly.a(26816, 322002928719844280L)), (int)ly.a(29266, 7222608798606051406L)) ^ ly.a(23289, 2127956869810413723L) ^ ly.a(757, 2838493133722597818L);
            }
        }
        hi.a("G", (long)402106174180480612L);
        hi.a("G", (float)1.0f, (long)1257120842392389918L);
        return -0.5f;
    }

    public static /* bridge */ /* synthetic */ CallSite z(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Exception decompiling
     */
    private static float m(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public static float i(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private static float x(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean d() {
        block60: {
            block61: {
                block62: {
                    break block62;
lbl1:
                    // 2 sources

                    while (true) {
                        var16 /* !! */  = var4_6 != null ? ((ly.a(3311, 9167412293420693276L) ^ ly.a(20589, 8166667184216992512L)) + ly.a(15790, 4545010651593312251L)) * ly.a(27795, 7211697725520926425L) ^ ly.a(21811, 1211843344368201369L) ^ ly.a(7012, 4133120855166427257L) : (ly.a(13593, 5498938570456632846L) ^ ly.a(3711, 2613292033883550790L)) + ly.a(9320, 8268791809932566261L) ^ ly.a(11370, 7285453160382862982L);
                        break block60;
                        break;
                    }
                }
                var16 /* !! */  = hi.a("G", (int)(ly.a(25775, 8372706595849526841L) * ly.a(16671, 9150431997433051735L)), (int)ly.a(24623, 9144433579663580065L), (long)834203424483934088L) + ly.a(31027, 7237164764652520262L) ^ ly.a(21630, 2459596590870916764L);
                block46: while (true) {
                    switch (var16 /* !! */ ) {
                        default: {
                            if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L) != null) {
                                var16 /* !! */  = (ly.a(23972, 2046570526412662294L) ^ ly.a(27418, 9043426807551774744L)) + ly.a(505, 5319211927631150035L) ^ ly.a(9838, 3512184089833807023L);
                                continue block46;
                            }
                            ** GOTO lbl35
                        }
                        case 1163015392: {
                            if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) != null) {
                                var16 /* !! */  = (int)(hi.a("G", (int)((ly.a(4088, 4801257223215920436L) ^ ly.a(11162, 8763282270681928094L)) + ly.a(14540, 3436399778267562559L)), (int)ly.a(11941, 9075083315404182617L), (long)834203424483934088L) - ly.a(27145, 5121766382464192595L));
                                continue block46;
                            }
                            ** GOTO lbl37
                        }
                        case 1163015395: {
                            if (ly.z("A7vvKSyAlydNjFy9", getCameraEntity(), (Minecraft)hi.a("j", (long)1080602109828736465L)) == null) {
                                var16 /* !! */  = ly.a(27282, 7686474837044351406L) / 4 - ly.a(5980, 9195990951681273002L) + ly.a(8812, 6916270892928342475L);
                                continue block46;
                            }
                            ** GOTO lbl39
                        }
                        case 1163015393: {
                            var0_1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L);
                            var1_2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)752729044355570923L);
                            var2_3 = hi.a("\u00a5", (Object)var0_1, (Object)hi.a("\u00a5", (Object)var1_2, (double)4.0, (long)1080829230854482551L), (long)701637995304699260L);
                            var3_4 = null;
                            var4_5 = 0.1;
                            var16 /* !! */  = (ly.a(19073, 5687398929762218284L) ^ ly.a(5127, 3362977738395168457L)) / ly.a(26835, 8721862657041945305L) + ly.a(22237, 3712623489305963754L) - ly.a(30807, 5518094397676340029L);
                            break block61;
                        }
                        case 1163015390: {
                            hi.a("G", (long)763209694749933009L);
                            hi.a("G", (long)881105324151579743L);
                            return (boolean)hi.a("G", (long)1031195239253115725L);
                        }
lbl35:
                        // 1 sources

                        var16 /* !! */  = ly.a(23868, 7615825913945745353L) / 4 - ly.a(17536, 8936434638599126682L) + ly.a(481, 2755452135335279493L);
                        continue block46;
lbl37:
                        // 1 sources

                        var16 /* !! */  = ly.a(27282, 7686474837044351406L) / 4 - ly.a(5980, 9195990951681273002L) + ly.a(8812, 6916270892928342475L);
                        continue block46;
lbl39:
                        // 1 sources

                        var16 /* !! */  = (int)(hi.a("G", (int)(ly.a(7188, 7339532415795177331L) - ly.a(21863, 5175880276532621260L) + ly.a(15888, 3141442794550068436L)), (int)ly.a(10952, 7543576791753461998L), (long)834203424483934088L) - ly.a(18225, 2774962196134657392L));
                        continue block46;
                        case 1163015394: 
                    }
                    break;
                }
                return false;
            }
            block47: while (true) {
                switch (var16 /* !! */ ) {
                    default: {
                        if (!(var4_5 <= 4.0)) break;
                        var16 /* !! */  = ly.a(7105, 2331721113030205890L) * ly.a(17821, 7183492766739431306L) + ly.a(16198, 5881686235510604901L);
                        continue block47;
                    }
                    case -486699372: {
                        var6_7 = hi.a("\u00a5", (Object)var0_1, (Object)hi.a("\u00a5", (Object)var1_2, (double)var4_5, (long)1080829230854482551L), (long)701637995304699260L);
                        var7_8 = hi.a("G", (Object)var6_7, (long)980631921738979478L);
                        var8_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var7_8, (long)419122760578116751L);
                        var16 /* !! */  = ly.z("A7vvKSyAlydNjFy9", isAir(), (BlockState)var8_9) == false ? ly.z("A7vvKSyAlydNjFy9", max(int int ), (int)hi.a("G", (int)(hi.a("G", (int)ly.a(26197, 7849085000778669301L), (int)ly.a(2741, 8011329059516395998L), (long)834203424483934088L) - ly.a(13205, 8106825986994997552L)), (int)ly.a(24304, 6547992894344717478L), (long)834203424483934088L), (int)ly.a(6377, 2809085687037273037L)) ^ ly.a(29894, 7178492682238906346L) : (int)((hi.a("G", (int)(ly.a(6807, 1886184283526963276L) - ly.a(16507, 8355180665036733197L)), (int)ly.a(24576, 849260869861694201L), (long)834203424483934088L) - ly.a(23260, 1964014966829375962L)) * ly.a(18595, 7027824219319464714L) - ly.a(30629, 1018436852500515975L));
                    }
                    case -486699373: {
                        throw null;
                    }
                }
                var16 /* !! */  = hi.a("G", (int)(ly.a(16634, 3610829532683402222L) * ly.a(3322, 3345069853096916671L)), (int)ly.a(226, 4662767533842283231L), (long)834203424483934088L) ^ ly.a(11276, 2870683509285230461L);
                break;
                block48: while (true) {
                    switch (var16 /* !! */ ) {
                        default: {
                            if (hi.a("\u00a5", (Object)var8_9, (long)1329471762216420120L) == false) break;
                            var16 /* !! */  = (int)((hi.a("G", (int)(ly.a(26458, 1496320094757379086L) - ly.a(13442, 2343574011640582092L)), (int)ly.a(26226, 8802724718285380716L), (long)834203424483934088L) - ly.a(22176, 3371913518666706151L)) * ly.a(5566, 2499365055102201608L) - ly.a(11002, 3733513622089699421L));
                            continue block48;
                        }
                        case 1181545414: {
                            var3_4 = var7_8;
                            var16 /* !! */  = hi.a("G", (int)(ly.a(13783, 3200547264526356002L) * ly.a(4340, 2710727223817316946L)), (int)ly.a(8407, 5261170233135831877L), (long)834203424483934088L) ^ ly.a(5775, 8884733520768282093L);
                            break block47;
                        }
                        case 1181545415: {
                            var4_5 += 0.1;
                            var16 /* !! */  = (ly.a(31651, 8868648694383329485L) ^ ly.a(29554, 1391275950130186353L)) / ly.a(1967, 8498219615957662915L) + ly.a(27986, 1484365220560885698L) - ly.a(21384, 6790611875129420147L);
                            continue block47;
                        }
                        case 1181545417: {
                            ly.z("A7vvKSyAlydNjFy9", N(int ), (int)ly.a(1639, 6027437819893857733L));
                            var16 /* !! */  = hi.a("G", (int)(ly.a(17902, 517599798221045681L) ^ ly.a(25447, 3521213741626808810L)), (int)ly.a(24977, 900658511437585040L), (long)834203424483934088L) ^ ly.a(30347, 7914656462921714743L);
                            continue block48;
                        }
                    }
                    var16 /* !! */  = (ly.a(4538, 6715492892189076473L) - ly.a(25680, 5038302355578838563L) - ly.a(8803, 8508922973958936910L)) * ly.a(21812, 2443729599604060155L) - ly.a(17856, 3008700934420135807L);
                }
                break;
            }
            block49: while (true) {
                switch (var16 /* !! */ ) {
                    default: {
                        if (var3_4 == null) {
                            var16 /* !! */  = (ly.a(31514, 3841612798369480805L) ^ ly.a(3024, 2436571746479550569L)) + ly.a(682, 1665334413620033658L);
                            continue block49;
                        }
                        ** GOTO lbl99
                    }
                    case 756400922: {
                        hi.a("G", (long)859258361668446808L);
                        return false;
                    }
                    case 756400919: {
                        var4_6 = null;
                        var5_10 /* !! */  = 1.7976931348623157E308;
                        var7_8 = hi.a("\u00a5", (Object)new AABB((Vec3)var0_1, (Vec3)var2_3), (double)0.5, (long)939956135489390941L);
                        var8_9 = ly.z("A7vvKSyAlydNjFy9", iterator(), (List)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), EndCrystal.class, (Object)var7_8, (long)826450408586366693L));
                        var16 /* !! */  = ly.a(20389, 8835475498523718872L) + ly.a(7053, 6538623727662276615L) + ly.a(11479, 2354216572798572047L) - ly.a(28157, 8532335566774032090L);
                        break block60;
                    }
lbl99:
                    // 1 sources

                    var16 /* !! */  = (int)(hi.a("G", (int)(ly.a(924, 1546687145405430188L) - ly.a(20836, 1514981177264630522L)), (int)ly.a(25860, 3767265092530659140L), (long)834203424483934088L) + ly.a(20306, 8021146227671496115L) - ly.a(20944, 7521161292954200968L) - ly.a(9391, 6875777993545457288L));
                    continue block49;
                    case 756400921: 
                }
                break;
            }
            return false;
        }
        block50: while (true) {
            block63: {
                switch (var16 /* !! */ ) {
                    default: {
                        if (hi.a("\u00a5", (Object)var8_9, (long)984088978567310565L) != false) {
                            var16 /* !! */  = ly.a(17470, 5578444439833837270L) / 2 + ly.a(7229, 4690394864341984775L);
                            continue block50;
                        }
                        ** GOTO lbl126
                    }
                    case -1402152730: {
                        var9_11 = (EndCrystal)hi.a("\u00a5", (Object)var8_9, (long)470012372636416268L);
                        var16 /* !! */  = hi.a("\u00a5", (Object)var9_11, (long)828387467655475766L) == false ? ly.a(21166, 2453171323731896378L) - ly.a(17036, 2445610829774682589L) + ly.a(20143, 1692033262064694376L) + ly.a(11574, 6626465475319600697L) : (ly.a(16891, 986815293799234344L) ^ ly.a(15277, 9158959824862347636L)) - ly.a(3770, 8960029611195545025L) ^ ly.a(27999, 497037921577490017L);
                    }
                    case -1402152727: {
                        ly.z("A7vvKSyAlydNjFy9", z());
                        hi.a("G", (long)1217681287799928622L);
                        ** GOTO lbl1
                    }
                    case -1402152729: {
                        ** continue;
                    }
                    case -1402152726: {
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), var4_6, (long)899051199446605892L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)1027340002540470646L);
                        return true;
                    }
lbl126:
                    // 1 sources

                    var16 /* !! */  = ((ly.a(11197, 4532540269530386757L) ^ ly.a(12460, 5694672430301973398L)) / ly.a(4980, 3813347283796207620L) ^ ly.a(7239, 3134870236498372419L)) / 2 ^ ly.a(21930, 1711848520743645114L);
                    continue block50;
                    switch (var16 /* !! */ ) {
                        default: {
                            break;
                        }
                        case 1680899599: {
                            var10_12 = ly.z("A7vvKSyAlydNjFy9", subtract(net.minecraft.world.phys.Vec3 ), (Vec3)hi.a("\u00a5", (Object)var9_11, (long)410151044975148381L), (Vec3)var0_1);
                            var11_13 = hi.a("\u00a5", (Object)var10_12, (Object)var1_2, (long)775234009870370927L);
                            if (var11_13 < 0.0) ** GOTO lbl143
                            var16 /* !! */  = ly.a(17457, 4043858277823610624L) - ly.a(20720, 6284665706722159534L) - ly.a(11278, 4892003626982119024L);
                            break block63;
                        }
                        case 1680899597: {
                            hi.a("G", (long)1061732747013503384L);
                            return false;
                        }
                    }
                    var16 /* !! */  = ly.a(14089, 5106815199754980366L) + ly.a(5808, 2347291163404741961L) + ly.a(24476, 7638573423410603018L) - ly.a(24887, 6569949994497825560L);
                    continue block50;
lbl143:
                    // 1 sources

                    var16 /* !! */  = ly.a(14089, 5106815199754980366L) + ly.a(5808, 2347291163404741961L) + ly.a(24476, 7638573423410603018L) - ly.a(24887, 6569949994497825560L);
                    continue block50;
                    case -1402152728: 
                }
                return false;
            }
            block51: while (true) {
                switch (var16 /* !! */ ) {
                    default: {
                        if (var11_13 > 4.0) {
                            var16 /* !! */  = (ly.a(10636, 2635209259349480054L) - ly.a(16123, 4457425944054367471L) + ly.a(32284, 4615168271958885499L)) * ly.a(32385, 1408984772574135585L) ^ ly.a(21774, 3433276173121023853L) ^ ly.a(30595, 1053363883076308283L);
                            continue block51;
                        }
                        ** GOTO lbl160
                    }
                    case -2063957582: {
                        ** GOTO lbl162
                    }
                    case -2063957583: {
                        var13_14 = hi.a("\u00a5", (Object)var0_1, (Object)hi.a("\u00a5", (Object)var1_2, (double)var11_13, (long)1080829230854482551L), (long)701637995304699260L);
                        var16 /* !! */  = hi.a("\u00a5", (Object)var13_14, (Object)hi.a("\u00a5", (Object)var9_11, (long)410151044975148381L), (long)1291060754145254714L) > 2.25 ? hi.a("G", (int)(ly.a(2156, 5697029395496645625L) * ly.a(4359, 5922378205729795037L)), (int)ly.a(2311, 3019170475075678911L), (long)834203424483934088L) * ly.a(23584, 7518749615547704875L) ^ ly.a(27976, 7829657989321447358L) : (int)(hi.a("G", (int)ly.a(26709, 3414267690913190872L), (int)ly.a(10730, 7627022500973908497L), (long)834203424483934088L) * ly.a(12365, 2405663266387003936L) + ly.a(3287, 3535865997724858030L));
                    }
lbl160:
                    // 1 sources

                    var16 /* !! */  = ly.a(30410, 5850553557333691512L) ^ ly.a(10706, 7812391214048351189L) ^ ly.a(26859, 1466981764927247325L);
                    continue block51;
lbl162:
                    // 1 sources

                    var16 /* !! */  = ly.a(14089, 5106815199754980366L) + ly.a(5808, 2347291163404741961L) + ly.a(24476, 7638573423410603018L) - ly.a(24887, 6569949994497825560L);
                    continue block50;
                    block52: while (true) {
                        switch (var16 /* !! */ ) {
                            default: {
                                break block52;
                            }
                            case 899098030: {
                                var14_15 = hi.a("\u00a5", (Object)var0_1, (Object)hi.a("\u00a5", (Object)var9_11, (long)410151044975148381L), (long)1291060754145254714L);
                                var16 /* !! */  = var14_15 < var5_10 /* !! */  ? hi.a("G", (int)((ly.a(8340, 9084921484623420337L) ^ ly.a(15335, 1644320743230013877L)) + ly.a(30698, 5494543006902930547L)), (int)ly.a(18508, 4766487275316015660L), (long)834203424483934088L) ^ ly.a(19850, 5896873656787400643L) : hi.a("G", (int)(ly.a(21954, 7518958755001528151L) / ly.a(4980, 3813347283796207620L)), (int)ly.a(13907, 4218071556410969451L), (long)834203424483934088L) ^ ly.a(3724, 4535763442054215124L);
                            }
                            case 899098032: {
                                hi.a("G", (float)0.0f, (float)1.0f, (long)735515674673248892L);
                                ly.z("A7vvKSyAlydNjFy9", R());
                                var16 /* !! */  = ly.a(3730, 3640577110479025652L) / ly.a(21771, 5652578928743182150L) - ly.a(23247, 5025865746871214133L);
                                continue block52;
                            }
                        }
                        break;
                    }
                    var16 /* !! */  = ly.a(14089, 5106815199754980366L) + ly.a(5808, 2347291163404741961L) + ly.a(24476, 7638573423410603018L) - ly.a(24887, 6569949994497825560L);
                    continue block50;
                    block53: while (true) {
                        switch (var16 /* !! */ ) {
                            default: {
                                var5_10 /* !! */  = (double)var14_15;
                                var4_6 = var9_11;
                                var16 /* !! */  = hi.a("G", (int)(ly.a(4854, 8760738461071026297L) / ly.a(4980, 3813347283796207620L)), (int)ly.a(6674, 2473992930929910005L), (long)834203424483934088L) ^ ly.a(8424, 4056056555140979276L);
                                continue block53;
                            }
                            case -1647122775: {
                                break block53;
                            }
                            case -1647122774: {
                                throw null;
                            }
                        }
                        break;
                    }
                    var16 /* !! */  = ly.a(14089, 5106815199754980366L) + ly.a(5808, 2347291163404741961L) + ly.a(24476, 7638573423410603018L) - ly.a(24887, 6569949994497825560L);
                    continue block50;
                    case -2063957581: 
                }
                break;
            }
            break;
        }
        hi.a("G", (float)-6.0f, (float)2.0f, (float)-15.0f, (float)3.0f, (long)796776827756410481L);
        hi.a("G", (long)513075350433525267L);
        return (boolean)hi.a("G", (long)713677872092862225L);
    }

    private static float t(Object[] objectArray) {
        Object object = objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = (float)hi.a("\u00a5", (Object)((LivingEntity)object), (Object)hi.a("j", (long)790786990245679744L), (long)508386958298026175L);
        float f3 = (float)hi.a("\u00a5", (Object)((LivingEntity)object), (Object)hi.a("j", (long)1077212429032069813L), (long)508386958298026175L);
        float f4 = 2.0f + f3 / 4.0f;
        CallSite callSite = hi.a("G", (float)(f2 - f / f4), (float)(f2 * 0.2f), (float)20.0f, (long)390336973585993938L);
        reference var7_7 = callSite / 25.0f;
        return f * (1.0f - var7_7);
    }

    public static float W(Object[] objectArray) {
        Vec3 vec3 = (Vec3)objectArray[0];
        LivingEntity livingEntity = (LivingEntity)objectArray[1];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = livingEntity;
        objectArray2[1] = hi.a("\u00a5", (Object)livingEntity, (long)869823823966533953L);
        objectArray2[0] = vec3;
        return (float)hi.a("G", (Object)objectArray2, (long)483775539616901849L);
    }

    public static AABB f(Object[] objectArray) {
        LivingEntity livingEntity = (LivingEntity)objectArray[0];
        Vec3 vec3 = (Vec3)objectArray[1];
        CallSite callSite = hi.a("\u00a5", (Object)livingEntity, (long)368119043405793323L);
        CallSite callSite2 = ly.z("A7vvKSyAlydNjFy9", getBbHeight(), (LivingEntity)livingEntity);
        double d = (double)hi.a("G", (float)callSite, (float)2.0f, (long)971000971621905228L) / 2.0;
        CallSite callSite3 = hi.a("G", (double)((double)callSite2), (double)3.0, (long)726020110299105279L);
        return new AABB((double)(hi.a("\u00e9", (Object)vec3, (long)1300412705618690751L) - d), (double)hi.a("\u00e9", (Object)vec3, (long)1294071886475894755L), (double)(hi.a("\u00e9", (Object)vec3, (long)1282612456329596420L) - d), (double)(hi.a("\u00e9", (Object)vec3, (long)1300412705618690751L) + d), (double)(hi.a("\u00e9", (Object)vec3, (long)1294071886475894755L) + callSite3), (double)(hi.a("\u00e9", (Object)vec3, (long)1282612456329596420L) + d));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2814358260741050515L;
                var6_1 = new long[462];
                var3_2 = 0;
                var4_3 = "\u00f1\u00f1\u0089EDku \u00d2\u001f;\u00a1T\u008d\u00b1L{o\u00a0\u00ff\u0083\u0091\u00bb\u0007\u00eb\u00f71-\u00ba\u00d4w\u00a8\u00f9#\u0098%\u00f3\u0083\u00bb\u009c;\u00f8g\u001dW\u0080\u00aa`\u0097#\u00c2\u00f0\u0018\u00f7s\u00c4\u00fe\u00b5\u00ac\u0085\u00fa?IDN\u00bb/)R\u00bf\u0090w\u008f\u00b4\u00ab\u009c\u00dbH\u0005\u00e6\u00e7A9i\u008a\u00a8\u0018\u00b4\u0081R\u00b8\u00fb\u00f5C\u00e0\u0013\u001bq\u00b8U\u00a1\u00f9\u0001\b(\u00b0\u00e0_\u0085\u0097\u00f4\u00fc{Gy\u00df}\u0082\u009e'\u00b6\u0013\u0097.S\u00903l6`\n X\u00d6;\u0083\u00aaa\u0087\u009fWP\u00f4u\u00c4\t\u00e4\u00ca\u00e25\u0081\u00f8\u00b1\u00d5H\u00cb}\u009d\u00ea\u0011\u00d1\u001ei\u0086\u00e7\u00eek\u008e\u00f7?\u0007q8\u00e6\u00d0\u00b7W\u0083\u00ed\u0090\u008a~\u0013l\u00b6\u0086<\u0091\u00e1\u001f-'@\t\n\u00c4\u0002\u00d4\u00e3 \u001e-\u00be\u000eW9\u00d6Q\u00bb\u0095\u0082\u00fe\u00eb\u00e8\u00f1\u009f\u00ebV\u00cc\u0000b\u0005\u00c4\u00a8+8\r<4\u0083\u00e0Y\u0005\u0003~}\u00ffW\bn\u0015A\u00d1\u0098\u00b2!\u00ec\\\u00c9Fk\u00df\u0001\u00f7\u00d3Wx\u00a5J\u0005\u00cc\u00a0\u00ce\u00b1\u0097\u001e\u00ce\u00a5\u00a2z\u00c57\u00fd]\u0011\u008c\u00b7E;}\u0007\u00cdd_8wx\u00fb\u009d[\u0090<\u00119\u00fa\b^\u0017`\u00b2\u00b5\u00b1\u0002\u00a1\u0086\u0087\u0092\u00bc\u00d4\u008d\u00a6\u00c4\u00bb\u00cb\u001e9\u0018\u00d0\u00a0\u00f2\u00d9f\u001f\u00c7\u0098\u00c8G8\u00d9\u00a6\u00b2(\u00b2\u00f9\u00bd\u0094\u0082R\u00ff\u00af\u00b9\u00ae'\tSp\u0005\u0015\u00c2\u00d7\u0004\u0093\u007f\u00e2\u000e\u00a7\u0003\u0089\u00f4\u00b7\u00cd:\u00a5{a\u00cd\u0006cl\u009d\u001dk\u00c5\u00abM\u00e7\u00a4\n\u0010\u001c\u00d1Xf\u0090\u008dS>\u007f\u00b4\u0090\u00cf\u009c\u00a5v\u00e2\u00a1(\u00b0:\u009c\u008at\u00cd\u0015\u000b\u00ad\u009b[\u00c0\u0082#X5\u0000s\"\u00e2z\u0084\u0084\u001e\u0092\u00c2Lnn\nkQ|\u009b\u008b\u00fb\u008fk\u00c3\u00da\u0089\u00b2J#\u00b9_L\u009d\u00ecn\u00f1\u00d1\u009c\u00ac\u00d6\u001d\u00b6j\u009fFh\u00c0\u0000x\u009a\u0015\u00c5}\u009e\u00d5\u00ce:3\u00e6\u00d7\u00ffCp\u0087\u00a8J\u00d2\u00965<%EP}\u0093;\u00f9\u0018:\u001fm\u0097\u000e\u0094\u00bf?\u00b5\u00ed\u00b9\u0087T\u00cf-\u00b8\u00d7\u00f3\u00c5)W\u0007\u00e7\u000f\u00b4\u0098\u00b7~\u00a4\u00c1\u008dR\u0090T>\u00adV.\u00fdE\u00cb\u00f0\u009bN\u0012\u00dbs\u00ea\u0004\u00e0\u00c6\u00a9\u00c3&\f#{\u0086\u0097\u00a0\u00e2c\u009aYFg\u00f3\u00b0\u008c\u00c0Y\u00c15\u0091\u0019\u0086I\u0001b\u00bf\u0080\u00f8\u0087\\A\u00bd!\u00a2r\u001c\u0000V\u00fd1\u00bd\u00a9\u00d6\u00ef@CR\u00a1g\u0098X\u0080\u00de\u00a8\u00a2\u00fe[1M\u0001R\u001au \u0013|%^$?U\u00c3\u00ea\u008c|6\u0081\u00e8\u00ef\u00b2\u00fa.}\u00dcK\u00a4h\u00c5\u00cfW\u009a\u008a\u008d\u0013y\u00bd\u00a9\u00ces\u00fd\u0003\u00e1HrYMmd\u0096\u00e2\u00d4\u00a6\u00a4I\u00aa\u0005c\u00f3\u00a6%\tm\u001a\u0007x\u00c1\u00df\u00c2\u001d3\u00eas8\u00d7C\u00fd\r\u00b6\u00bb4\u008c\u00a3K+\u00d8;eE\u00f4\u00a1\u0087nU\u0092\u001d&\u00c4\u009c\u00f04\u00aewb\u00ed'\u00ab\n{\u00bb\u00eb\u0092\u00ef\u00d0vE\u00f0\u008c\u00aa\u0010O\u00b7\u0083\u0000 \u00c4\u00deM\u00a4\\)\u00dew\u00dfVG!7\u0007\u00c5\u00b9x\u00ad\u00b9<5\u0091\u009f\u00cefL\u00f9\u00c8\u00e4\u008c\u00a8~\u00cb\u0082*\u0006\u00be\u00d3#\u00cb^\u00fb\u00cb\u0084LOM\u00a3\u009b\u00ed\u00eel\u00ad\u00eejdXlD_\u0000\u00a1\u0006U>\u001d\u00da%\u00ca\u00f8gw\u00cb\u00d9\u00c3w/\u00dc\u00ab\u00e4^\u00fa\u00bc\u00bf\u00c8r@i\t\u00f5\u00bez\u0005\u00be\u0088\u0019S]X\u00c3\u00b3O\u008f\u009cGTT-\u0002\u00fb\u0019\u00f7=\u0085\u0097\u00caaT\u0088(\u00d1*\u00ab'pbg\u00f45\u0085\u0090V\u00e6\u00e6\u009d\"\u00d4\u00f51\u00ed\u0094L\u00dc\u00ce\u009b\u000f=\u00e5*\u00b5[\u00a0\u00f3\u00cc\u00a9\u001a\u00e0\u00e0\u001b|\u001dl\u000ee\u0082\u0003f\u00a1\u000f\u000e2>\u00b8:\u0013\u00af\u00d1\u00bf\u00c4Q\u00e7Aw\u00eb\u0088\u0018t\u0011\u0003lr\u00f2\u0012\u0098g\u0010\u001a\u00b0\u007f\u00de\u001f^\u00d0\u00af\u0005s\u00a4+\u00d3:\u0011\u00bc^\u008b]\u009d\u00bdy\u00aa\u00a2b]$m\u0019{|s\u00a3\u00c3\u0003\u00c5\u00ce \u00a9\u00a18\u00cd\u0013\u00b1\u00ce\u00f5\u0093\u00ban\u00bb\u0088*\u00a8x\u001bv\u00b4[\u00f3\u00a2\u00e1>2\u0018\u00a6N.#E{\u00bc\u009bd%\u00ea\u00f3\u00e8\u00fe&\r\u00fd\u00c28}\u001c\u00f9\u0088\u0097\u00e6\u0013\u00ab%D<\u00a5\u000f\u007f\u00a5p\u008ct+\u00bf\u00c9\u00eb\u00a3hl\u00a5\u00ed\u00d9\u00de\u00c5\u0019\u00a8\u0017DX\u00cc\u00b5n\u00f2;\u00cf0E>Mk\u009d(\u00f3\u00ef\u0096\u00eb\u00d77J\u00b2\u00f2;jv.G\u00c9\u00066\u00a8\b\u007f\u009cc%\u00c13\u00e0\u00be?\u00c5\u0096iCJ;\u00f8\u00f78\u00d7C\u00e4H\u00ddV1\u00e6\f\u00f2\u00eb(x\u00df\u00ad,\u00a7\u009c5(\u0087D\u00ee%3'P\u00bb\u0094h\u0084RG\u0014\u00e6\u0097e\u0080z\u001f\u00c86x\u00fc*'Xbp\u00fa\u00bb\u00f6\u007f\u00c54\u00e7\u00bd\u00f0\u00b8\u001d\u007f$\"}\u0016\u0099Q\u001b\u00ecK\u009c\u008b\u0094\u00ee\u00d5\u00b6\u0095\u00b5m)\u00a6K\u00ca\u00e4\u00dcJ\u00ddi\u00ec\f\u00e1\u0084\u009eYO\u00b2\u00172!\u00b9\u00ab-\u00af\u00a6ei>I-\u009et\u00bf\u00d4O\u00a6?\u00df\u00b3\u0090M\u008b\u0093\u00ad\u00d1{\u009b\u00cdQ\u001ag2\u00ce\u00f5\u00b3\u001e\u0003&0\u00cby\u0010\u00a7;>^c\u0092'\u0099\u00f7\u00ed\u000f\u00acz\u00b8\u0010\u00b1_B\u00dc\u00e3\u00d7\u0083\u00abroX\u00e5\u00ac\u00e6\u00e8+\u0096o\u00bb\u00a0\f\b \u00e1os\u000bUS\u0012\u00e7\u00cd\f\u00eb\u00ad\u00f1\u00f2\u0015 _a\u0084\u00f9C\u00b6QI^\u009b\t\u00bd\u00c0\u00e4\u00e8U\u008c\u0098h\u00c7])\u0096i\u00bf\u0097d\u00e4If\u00fc\u00ec6\u00e5\u00e9\u008f\u00a2\u00f88\u0099U[u\u00cd\u0096lnx\u0094\"9u\u0089\u00f6J\u00f8\u00f7\u00ce\u0003\r\u0080\u00f2zp\u00b0\u001fUl\u0006k-\u0019D\u0088\u0019\u00a3\u0010\u00c2<_\u00bb\u00db:\u0099\u00af&V\u000b\u00f0\u00b50\u0099$\\\u00b8h\u00c3+\u00b2\u0083\u0007x\u00d6-\u00dc\u0082\u00dc\u00ae\u0082\u00cb\u00eb\u00be\u00ce\u001d\u00b8fZ\u0098?\u00c3e\u00a6t\u0085\u0086\u00af\u00ff\u0092\u00a6\u00d5\u009eq\u00bah\u00c6L\u00de$3{\u0014\u00ad\u00d4\u0087B{\u0010\u00be\u00b7C\u00c2O\u0013\u00122\u0015\u0096c\u000fg`\u007f\u00b0\u00fet,(\t\u00d8_\u000e\u008b\u0018:\u0019\u00b5\u00de\u00e7\u00ea:\u00f8\u00b98O\u0093\u00b9\u0080\u00b1(a\u00ad e|\u0090\u00cf\u0088\u0081+d\u00d9l\u00e9&\u00fc\u0080:\u0091-\u0084>\u00e67\f<\u0013\u008e0B\u00e0z\u0088\u00d9\u00a7\u00c0\u00e0on\u00e5mS}\u008dF\u00bf\u0090\u00aef\u00c8\u00c8>q|\u00b3\u000f\u0013K`\u0004DPL\u001d\u00d1\u0099\u008fJES\u00d8\u00a5o\u0007_C\u008a\u00f4'\u00e5\u0092c$\u00cd\u0099\u00afv\u0087\u00afk\u008fzx\u00de\u008b\"\u009d\u00c7*\u00bd\u00b9\u001cz\u0013\u00ae\u001aR>\u008e\u00b6\nb\u00ccY\u00f3\u00ff!\u00da\u0094\u0015)\u00edH$\u00b0\u00d3\u0086\u00c8jG\u00ca\u00a4y\u00ac\u00d9\u00cb\u00bb\u00af\u00c1\u00eb\u0001jZ\u00f6\u00a3\u00a5\u009a0\bu_\u00de\u000f\u00f1\u0001\u00ef\u00d5y\u00e7u/\u00c8\u0092\u0007\u0094\u00f8\u00db\u009d6\u00e0\u00b1\u008b\u00c2`\u00df9TL\u0084\u00db\u008d\r$\u0011\u00e9\u0087\u009a\u0091\u00b4\u00b9\u0098\u00d5\u00c8\u00af\u0000s8<\u00f3\u00c6i!m\u008ed\u0090\u0001\u0097\u00d8=\u00f8P\u00f5\u00b0\u00ea\u0095:+R\u0088\t\u00cd\u00f5\u00f5\u009b\u00dc\u00c9\u00f2d|\u0096s\u00ad%\ry\u00f5~\u00a3eF\u00fd\u00f9\u00fe\u0094t\u00cdn@5\u00ad\u0007{>\u00f2\u00f5\u00b6>\u00e5\u0018\u00fe\u001f\u000b\u00ea'\u001d<I\u00dd#\u0006\u00fa[<8`\u00c9\u0001\u00a6\u0098\u0005;P\u00b2\u00e3\u00e9\"\u00fa\u000b+\u009d\u00b3\u008a\u009f\u0002@\u00d5\u00ac\u001e\u00f3=\u00b8\r\\\u00b2\u00c8\tI\u000eAt\u00a2qP\u00c8V\u00cf^Ll)}k\u00b0\u0083\u008d4\u008f\u00ad\u00d6\u00a7\u00b4\u00ed$9N]y$\u001a|8\u001fm`\u0091R\u00997\u00a1M\u0090\u00dd_@oHY\u00d6\u00a6\u00a6pg\u00bb\nU\u00f5\"\u00bf\u00bc\u00c1Y`\u00b3\u00be`\u00ba\u0085\u0097\u0011\u00c0\u00ec0\u0087\u00ee\u00a09E\u00dcH\u00bc\u00d9I*\u0096\u00fbJK2c\u00fe\u00d2\u00a0\u0097\u0082\u0089\u0007\u0006\u00d4iA\u009b\u00c95\u0004N\u00e4\u00ae\n\u0003\u00e8\u00c4\u00f5\u00e3]\u001d\u00ba!\u008b\r\n\u001b\u00a8\u0082[\u00f4X\u00b5\u00c7\u00ab|\u00ee\u0000\u00d2\u00c0\u00bb\u00bf\u00f5\u00b2\u00c8\u00eei\u00a4j\u00e0\u00b7\u00b4\u0091\u00ef\u00d3\u00f6*\u00ee\"9t\u00a6q\u00a0\u00e8\u0002\u00e1mj\u00d6\u00cc\u001b\u008bx\u0092-\u00d2`R\u00a4\u00d2PA\u00ca{\u0091\u0084\u00042\u00809\u00bd? \u00fc \u00e4\u00cd\u0088\u0084\u0098\u0003MIo!\u00ae\u0097K*\u00d6[~\u00fc\u0095\u00fa\u00fb W\u009a\u001e\u00d7B\u00ff\u0000\u0005\u00f8_\u00c4\u00c5t\u009f\u0085\u00f4\u00c9\u00118\u00c1Oh\u00f6J\u00f2\u00c8v\u00db\u00cb\u00dcx9\u009a\u00caq\u0017qb\u0081\u00af\u00e3u$\u00ef\u00c5p-\u00fc\u009b9vl?w%\\\u0088\u0090'\u000f\u0003#\u00ef\u0084\u00fe^'\u00a0}\u00cd\u0003\u00b7\u0088$p\u00f7^\u00f2\u009e\u00bb1K\n\u00f6nN\u00ac\u00b0\"o\u00a7\u000eH\u00a5\u00fc;\u00cc$[\u00bc\u00c8\u00d2\u00f4\u0091\u00d7dm\u0015\u0000\u00a7z\u00edu\u0098j\u00ff$\u00cc\u00d3n\u0000\u008d|\u00f3\u0019\u00ab\u00f7\u00cc\u0088_\fe\u0083\u009f8\u00b0E0KW\u0093\n!\u00d3\u00bd\u0080k\u00e7\u0087\u00a1y\u0094\u00e0\u0081\u00e2\u00db.o?\u009d\u00a4\u00ceq\u0085\u00e8\u00cdL^\u001b&k\u00b2\u00d4|\u009fh\u00cb\u00e5\u0019\u00ae\u00e5\u009b)H7g\u009d\u00ba\u00ff\u001f@M\u00f2\u00f8\u00ddG\u00eb\u00d42As\u0012_._)y(26U%[E\u00ae\u0081\u0014\u0097\u00ba\u00bf\u00e2\u008f.\u00fd\u00b1\u00e4\u00ffy<^6J-\t\u0007+\u00f4\u009c\u00c3#\u001e\u00f5\u001a\u00f7\u0093\u00d6\u00a7D\u00f6K[\u00db<H\u00b0\u00f9\u00b7+\u007f'\u00cd\u00e8\u00ce-\u0094\u00eb)\u0002\u00bd\u009fT\u00f1L\u00c4'\u00b09}\u00f8\u0017\u00a3T\u0016a\u0005\u00d6\u00b2A\u00e5G\u0094e \u00d5\u00f2\u0080m\\\u00a8\u00caM4\u0092\u000f\rY\u0095\u00b5\u00bfu\u00cfzRn\u00f3\u00d6\u000fNf\u0003\u00f8\r\u001c\u00bc\u0014W&\u0099\u00a3\u00fe\u007fT\r\u00d5\u00c3\u00983\u0015\u000e\u0091g\u00fe)k\u001c\\\u000e\u00df'.\u001cv\u008a+U\u00deli\u00c6Te\u00cf\u0084\u0013I4\u00ce\u0086eV\u00c6\u0080m,\u00b5M\u00bf\u00ce\u00fc;\u00bd-\u0018\u00cd\u00d8ff+\u0095\u0013\u008e\u0007\u00b5\\\u00a7\u0083\u001dJ\u00f6O\u0011\u00cf\u00d2\u00c7\fP\u00a0\u00aeV\u0007\u009eu\u00a3\u00e0\u0002\u0017)\u00f8\b5\u0089\u00c9\u009a\u00a0\u0088\u0017TAC4\u00cdb\u00bbKS9\u00f6\u00fa\u00f0\u00c7\u0084\u0018e/\u0013\u00e1`\u0007\u00d4a4'\u00c9r`\u00b7\u00f5\u00d8y\u000f\u00d1\u00d6\u00ce\u0088\u00b3\u00ab\u00c6\u00bck\u008fJ\u00a1\u008er;\u009dn\u0015W\u00ae4\u00a6W\u0001\u00ce\"i\u00c9\u00d8\u001dV\r\u001fF\u00a4h5AC\u00e7\u007fT\u00a6\u0085\u0017\u00c3\u0018\u00d4\u0019\u00c1\u00b4\u00c5\u00b8u\u00ecy\u00c1\u00fdf\u00b6_\t\u0018\f6\u0085\u00d6\u00c2\u00b4\u00fe\u0082Qc\u00b7Sv\u00cb\u0082\u00b9[$&R\b\u00d1\u0091\u00ae\u00ab\u00bb7\u0005\u0092\u008d\u00de\u00f1c\u0099P\u00d6\u00b4O\u0090\u00ae\u00f9\u00a3\u0096\u0092\u00ec\u00a5KA\u001b\u00fd\u009e\u0016\nh\u00b0\u009d\u00c7w,\u00c7\u00c4\u00d6%\u00a8\u00e4otn\u00bdn\u0088\u00cf\u007f!|\nr\u00e1\u00b1\u0096\u009d\u00e7\u00bd\u0098\u00d7\u00a59\u0007\u00a6\u009bfE\u00cb\u001f\u00f4eY7\u00b3C3\u00b2n\u00ec\u00df\u00d93\u00e7\u0086\t\u0090\u00dfg\u0004\u009b ?'\u009e\u00cf|\u00fb\u009cq\u00eb:Wg\u0007\u0007\u00c0~\u00a4\u001a\u00fd\u00dad\u0014\u00ce,b\u0017W\u00d8/S6\u00b6\u00cb\u00f1\u00fd}\u00c7\u00d6\u00dd\u00f7\u00b8\u00900>@\u00fd\u00ba\u00a1\u0099\u00121\t4\u009aV\u00d5\u0004\u0084\u00d5\u00f3nQ;\u008ay\u0012\u00bfh\nBJA\u00acV\u0086\u00cc\u0087\u00d7\u00aa\u0007\u009dh+\u0010b/D+xp\u0091\u0087#\u00e7\u00a3\u00a6\\@\u009d3\u0017\u00cb\u0007\u0006aO\u00d1~\u0007\u00f3\u00d3\u00dfN\n\u00da\u00ea\u00d9\u00ab\u00b79d9~\u00f47\u0080z<6G\u00ca\u0010F\u00af\u0080\u00ad\u00f6\u0096\u00eb,\u0088\u00d6\u0017\u00e7\u001e\u0016\u00f8\u0000\u00f6j\u00deC#\u0082(D{\u00f3\u000f\u00a3:w9g\u00f8\u00d5\u000e\u00e2\u00e5@\u00aa\\hy\u00f4\u0087\u00b9\u00c5\u00bc\u0091r1\u00d7\u00cb\u0098\u00bb\u00d2JU\u00e7\u00fa@$\u000e\u0099\u009d\n\u008e\u00a7=\u008eC\u00b0%7\u0007\u00cf\r\u00bd\u00eb\u00f5}\u0096\u000b\u00d5$8tHQ\u00bd\u0004 \u00c3\fg\u0083I\u00a6E\u009c\u00a9=\u00bf\u0007\u0083*c[v\u0091\u00d7\t\u00e4!\u00cd\u00ff\u008b\u009agK\u00dc}\u0013\u00a3\u0006\u009e\u00fbX\u00e8\u00d0\u000f\u00a8\u00b6\u001b\u00f9p f\u00bc\u00be\u0011e\u00a5 nu\u00b0\u00b19\u00866\u00d8\u00c2\u0091g\u00ecd\u0018\u00ea(\u00b1O\u00a0\u000e\u00c8\u0089a\u00fa\u00a6;\u00f0\te\u0006`a\u0006\u00d9\f\u00b2\u00f2\u00f2\u00c8\u009bP\u001a\u008ed9\u00fc\"&\u0098!^\u00a4\u00bf\u0002)]\u00ae\u00f7\u00c4\u0090,\u00b5\u0080)2%\u00eevB.\u00d9\u00d6\u00ea<\u00daw8\u00c0~~rase\u00e9\u00c9\u0097\u00b5\u00d6\u00a7\u00d9G\u00a8\u0088\u00bc\u00fc\u00fe\u00f3\u00ff\u00bc\u0017\u008b*P\u0096u\u00ec4#\u00b8B\u00c0i\u0096\u001f\u0015\u0096o$\u00fd\u00ab\u001e\u0019\u0097\u00d6)\u001eK\u00ab~_t\u00a6\u000f\u009fU\u0003\u0085\u00ac\u00aa\u0017\u008620\u00c0J\u00ed\u008c+V\u009f\u009d\u00b7:\u0086E\u0081\u00a4\u0010\u0093\u0018\u00ad\u00daW\u00b8aT\u0000\u00a4\u0011@`\u00aa^!\u0010\u00fb\u0013\u0001sF\u0098Y\u00e8l^\u00b5\u00fd\u00d5]r8\u00e7&1o:\u0090\n\u00baR\u00f4\u00d3\u008c\u00ba\u001e5\u009d\u007f\u008d@\u00c0\u00e4G\u00e8\u00cbr\u00fc\u00f1\u0081\u00a5\u00b5\u0098\u00c7\u0090,:\u0015\u00c6\u00b3\u00edD\b\u00e7\u00d0\u0092\u00da\u0095\u0017\r\u00f47},\u0014\u00cd\u0012\u00b0\u001dT\u00caB5\u00ad\u009d,\u00cf\f\u0000\u00f5\u00d4\u00c3\u00bc\u00bd&Me\u00f9n\u0005\u00af9\u00b9\u00866\u00e5\u00f1\u0083v\f\u00d6\u00ca\u00c8\u008d?<\u00c9Se\u00ee\u00e2\u00f5\u0015N}\u00d3D\u00104Z\u00d8a\u00d0\u0011JJCq\u00e3\u00a7\u0088(3w\u00c9\u0004\u00cf\u00b5e\u0094\u00be\u00cd\u00d0r\u0086\u001c}\u00be<9\u00a5\u0092\u00f3DBN\u0004\u00a6Di\u001f\u00c4 \u00bc\u0005\u008f\u0014.K\u00b8J\u00b0d\u00fd(\u00c1h\u0086\u00a8D\u00ba\u00ddT\"\u009d\"nv+\u001a\u0095\u00ad=\u0004\u008c\u00c9!\u00c8\u00f2^/\u009chx\u00a9\u00e0#\u009dP\u00d2\u00ab\u0015\u00f3\u009dp\u00c7\u00d1n\u00c0}\u001d\u00e5\u00e7%\u00ce\u009e\u0085\u0019\u00a8\u008e\u00fc\u00a6\u00a8\u0010 \u008b*\u00aa\u00fc\u00b6\u00c7,B\u00975\u00e8\u009d\u00d3\u00c1}\u00d5Z ]\u0089$hF\u00a7\u001c\u0096\u001a2\u00d3.\u00c6\u00eaPy\u0001\u00be\u00f9\u00dc\u001e$\u0092\u00075\u00a5+i=\u0017\u00a8\u0087,\u0091v\u0012\u00a3\u0006\u009d7\u00c5V\u0013\u0010\u0096X\u00e5\u000e\u0006T\u008bc3\\\u0005\u0015\u00be\u0094]\u009b^K+c\u0098\u00bb\u00dbX\u00bb\u00a6\u00eeQ(W\u00bf\u00f4Fh\u00e8\u00bd\u00b2\u00eaf\u00dbV2X\u00bb\u0014V+\u00ba\nv_-\u0001\u0092L`\u00f02\u009a\u00faI\u00fd\u0088\u00c9l\u0011\u00d9\u0093D\u00cb\u00fb\u00a4\u00a5=\"\u00bc\u00fb!\\\u00d5\u0013%bf\u0007\u00c6\u00c6\u001eD\u00cdU\u00dfKA\u000f\u001b\u00d1E7\u00b0%\u00aal\u0095\u00c7k\u0099\u00b2\u00ad\u0080\u0007\u00b0\u00f4(0\u00b6a\u0018u\u00b2\f+\u007f\u0097\u00cc\u009a3\u0084\u00df\u00cd\u00c3\u008bT\u00a68\u009c\n\u0002I\u009aN\u00f1k\u00a6\u00c2\u00a5\u009f\u000eL\u0019\u00e7\u00f7%\u0092\u00ec\u00bc'\u00b5\u00a4&C\u00f6\u0015\nTN>\u00ad\u00b7?\u00c6\u0013%w\u0012\u00a5\u00d7\u0019\u0012\u00f8\u00a7\u009f\u00e8x\u00b0\u0099\u009f\u00bb\u00ee{\u00ac\u0082q\u0093(Lhi\u0090x\u00b3\u00a0|=\u008d\f\u00adz\u0099{\u00d7\u00d0\u00fa\u00d6\u00db>\u0014\\;\u0019^\u00ea\u00a3\u0096\u00de\u0014dhY\u00fcLnfi(\u0000\u00aa\u00ad\u0091$\u0080|T\u00a7\u00da{9\u00ae\u00a9'\u00e5\u0006\u00c0\u001e\u0018\u00f2\u00ca%\u00a6^\u0010\u00f0\u00a1\u00a0\u00a88\u001f~\u00cfb\u00ae\u0011\u00af\u00ecm\u00e0.)\u0093\u00c2\u00bd\u00bayH\u00f6\u00b0\u008fjry";
                var5_4 = "\u00f1\u00f1\u0089EDku \u00d2\u001f;\u00a1T\u008d\u00b1L{o\u00a0\u00ff\u0083\u0091\u00bb\u0007\u00eb\u00f71-\u00ba\u00d4w\u00a8\u00f9#\u0098%\u00f3\u0083\u00bb\u009c;\u00f8g\u001dW\u0080\u00aa`\u0097#\u00c2\u00f0\u0018\u00f7s\u00c4\u00fe\u00b5\u00ac\u0085\u00fa?IDN\u00bb/)R\u00bf\u0090w\u008f\u00b4\u00ab\u009c\u00dbH\u0005\u00e6\u00e7A9i\u008a\u00a8\u0018\u00b4\u0081R\u00b8\u00fb\u00f5C\u00e0\u0013\u001bq\u00b8U\u00a1\u00f9\u0001\b(\u00b0\u00e0_\u0085\u0097\u00f4\u00fc{Gy\u00df}\u0082\u009e'\u00b6\u0013\u0097.S\u00903l6`\n X\u00d6;\u0083\u00aaa\u0087\u009fWP\u00f4u\u00c4\t\u00e4\u00ca\u00e25\u0081\u00f8\u00b1\u00d5H\u00cb}\u009d\u00ea\u0011\u00d1\u001ei\u0086\u00e7\u00eek\u008e\u00f7?\u0007q8\u00e6\u00d0\u00b7W\u0083\u00ed\u0090\u008a~\u0013l\u00b6\u0086<\u0091\u00e1\u001f-'@\t\n\u00c4\u0002\u00d4\u00e3 \u001e-\u00be\u000eW9\u00d6Q\u00bb\u0095\u0082\u00fe\u00eb\u00e8\u00f1\u009f\u00ebV\u00cc\u0000b\u0005\u00c4\u00a8+8\r<4\u0083\u00e0Y\u0005\u0003~}\u00ffW\bn\u0015A\u00d1\u0098\u00b2!\u00ec\\\u00c9Fk\u00df\u0001\u00f7\u00d3Wx\u00a5J\u0005\u00cc\u00a0\u00ce\u00b1\u0097\u001e\u00ce\u00a5\u00a2z\u00c57\u00fd]\u0011\u008c\u00b7E;}\u0007\u00cdd_8wx\u00fb\u009d[\u0090<\u00119\u00fa\b^\u0017`\u00b2\u00b5\u00b1\u0002\u00a1\u0086\u0087\u0092\u00bc\u00d4\u008d\u00a6\u00c4\u00bb\u00cb\u001e9\u0018\u00d0\u00a0\u00f2\u00d9f\u001f\u00c7\u0098\u00c8G8\u00d9\u00a6\u00b2(\u00b2\u00f9\u00bd\u0094\u0082R\u00ff\u00af\u00b9\u00ae'\tSp\u0005\u0015\u00c2\u00d7\u0004\u0093\u007f\u00e2\u000e\u00a7\u0003\u0089\u00f4\u00b7\u00cd:\u00a5{a\u00cd\u0006cl\u009d\u001dk\u00c5\u00abM\u00e7\u00a4\n\u0010\u001c\u00d1Xf\u0090\u008dS>\u007f\u00b4\u0090\u00cf\u009c\u00a5v\u00e2\u00a1(\u00b0:\u009c\u008at\u00cd\u0015\u000b\u00ad\u009b[\u00c0\u0082#X5\u0000s\"\u00e2z\u0084\u0084\u001e\u0092\u00c2Lnn\nkQ|\u009b\u008b\u00fb\u008fk\u00c3\u00da\u0089\u00b2J#\u00b9_L\u009d\u00ecn\u00f1\u00d1\u009c\u00ac\u00d6\u001d\u00b6j\u009fFh\u00c0\u0000x\u009a\u0015\u00c5}\u009e\u00d5\u00ce:3\u00e6\u00d7\u00ffCp\u0087\u00a8J\u00d2\u00965<%EP}\u0093;\u00f9\u0018:\u001fm\u0097\u000e\u0094\u00bf?\u00b5\u00ed\u00b9\u0087T\u00cf-\u00b8\u00d7\u00f3\u00c5)W\u0007\u00e7\u000f\u00b4\u0098\u00b7~\u00a4\u00c1\u008dR\u0090T>\u00adV.\u00fdE\u00cb\u00f0\u009bN\u0012\u00dbs\u00ea\u0004\u00e0\u00c6\u00a9\u00c3&\f#{\u0086\u0097\u00a0\u00e2c\u009aYFg\u00f3\u00b0\u008c\u00c0Y\u00c15\u0091\u0019\u0086I\u0001b\u00bf\u0080\u00f8\u0087\\A\u00bd!\u00a2r\u001c\u0000V\u00fd1\u00bd\u00a9\u00d6\u00ef@CR\u00a1g\u0098X\u0080\u00de\u00a8\u00a2\u00fe[1M\u0001R\u001au \u0013|%^$?U\u00c3\u00ea\u008c|6\u0081\u00e8\u00ef\u00b2\u00fa.}\u00dcK\u00a4h\u00c5\u00cfW\u009a\u008a\u008d\u0013y\u00bd\u00a9\u00ces\u00fd\u0003\u00e1HrYMmd\u0096\u00e2\u00d4\u00a6\u00a4I\u00aa\u0005c\u00f3\u00a6%\tm\u001a\u0007x\u00c1\u00df\u00c2\u001d3\u00eas8\u00d7C\u00fd\r\u00b6\u00bb4\u008c\u00a3K+\u00d8;eE\u00f4\u00a1\u0087nU\u0092\u001d&\u00c4\u009c\u00f04\u00aewb\u00ed'\u00ab\n{\u00bb\u00eb\u0092\u00ef\u00d0vE\u00f0\u008c\u00aa\u0010O\u00b7\u0083\u0000 \u00c4\u00deM\u00a4\\)\u00dew\u00dfVG!7\u0007\u00c5\u00b9x\u00ad\u00b9<5\u0091\u009f\u00cefL\u00f9\u00c8\u00e4\u008c\u00a8~\u00cb\u0082*\u0006\u00be\u00d3#\u00cb^\u00fb\u00cb\u0084LOM\u00a3\u009b\u00ed\u00eel\u00ad\u00eejdXlD_\u0000\u00a1\u0006U>\u001d\u00da%\u00ca\u00f8gw\u00cb\u00d9\u00c3w/\u00dc\u00ab\u00e4^\u00fa\u00bc\u00bf\u00c8r@i\t\u00f5\u00bez\u0005\u00be\u0088\u0019S]X\u00c3\u00b3O\u008f\u009cGTT-\u0002\u00fb\u0019\u00f7=\u0085\u0097\u00caaT\u0088(\u00d1*\u00ab'pbg\u00f45\u0085\u0090V\u00e6\u00e6\u009d\"\u00d4\u00f51\u00ed\u0094L\u00dc\u00ce\u009b\u000f=\u00e5*\u00b5[\u00a0\u00f3\u00cc\u00a9\u001a\u00e0\u00e0\u001b|\u001dl\u000ee\u0082\u0003f\u00a1\u000f\u000e2>\u00b8:\u0013\u00af\u00d1\u00bf\u00c4Q\u00e7Aw\u00eb\u0088\u0018t\u0011\u0003lr\u00f2\u0012\u0098g\u0010\u001a\u00b0\u007f\u00de\u001f^\u00d0\u00af\u0005s\u00a4+\u00d3:\u0011\u00bc^\u008b]\u009d\u00bdy\u00aa\u00a2b]$m\u0019{|s\u00a3\u00c3\u0003\u00c5\u00ce \u00a9\u00a18\u00cd\u0013\u00b1\u00ce\u00f5\u0093\u00ban\u00bb\u0088*\u00a8x\u001bv\u00b4[\u00f3\u00a2\u00e1>2\u0018\u00a6N.#E{\u00bc\u009bd%\u00ea\u00f3\u00e8\u00fe&\r\u00fd\u00c28}\u001c\u00f9\u0088\u0097\u00e6\u0013\u00ab%D<\u00a5\u000f\u007f\u00a5p\u008ct+\u00bf\u00c9\u00eb\u00a3hl\u00a5\u00ed\u00d9\u00de\u00c5\u0019\u00a8\u0017DX\u00cc\u00b5n\u00f2;\u00cf0E>Mk\u009d(\u00f3\u00ef\u0096\u00eb\u00d77J\u00b2\u00f2;jv.G\u00c9\u00066\u00a8\b\u007f\u009cc%\u00c13\u00e0\u00be?\u00c5\u0096iCJ;\u00f8\u00f78\u00d7C\u00e4H\u00ddV1\u00e6\f\u00f2\u00eb(x\u00df\u00ad,\u00a7\u009c5(\u0087D\u00ee%3'P\u00bb\u0094h\u0084RG\u0014\u00e6\u0097e\u0080z\u001f\u00c86x\u00fc*'Xbp\u00fa\u00bb\u00f6\u007f\u00c54\u00e7\u00bd\u00f0\u00b8\u001d\u007f$\"}\u0016\u0099Q\u001b\u00ecK\u009c\u008b\u0094\u00ee\u00d5\u00b6\u0095\u00b5m)\u00a6K\u00ca\u00e4\u00dcJ\u00ddi\u00ec\f\u00e1\u0084\u009eYO\u00b2\u00172!\u00b9\u00ab-\u00af\u00a6ei>I-\u009et\u00bf\u00d4O\u00a6?\u00df\u00b3\u0090M\u008b\u0093\u00ad\u00d1{\u009b\u00cdQ\u001ag2\u00ce\u00f5\u00b3\u001e\u0003&0\u00cby\u0010\u00a7;>^c\u0092'\u0099\u00f7\u00ed\u000f\u00acz\u00b8\u0010\u00b1_B\u00dc\u00e3\u00d7\u0083\u00abroX\u00e5\u00ac\u00e6\u00e8+\u0096o\u00bb\u00a0\f\b \u00e1os\u000bUS\u0012\u00e7\u00cd\f\u00eb\u00ad\u00f1\u00f2\u0015 _a\u0084\u00f9C\u00b6QI^\u009b\t\u00bd\u00c0\u00e4\u00e8U\u008c\u0098h\u00c7])\u0096i\u00bf\u0097d\u00e4If\u00fc\u00ec6\u00e5\u00e9\u008f\u00a2\u00f88\u0099U[u\u00cd\u0096lnx\u0094\"9u\u0089\u00f6J\u00f8\u00f7\u00ce\u0003\r\u0080\u00f2zp\u00b0\u001fUl\u0006k-\u0019D\u0088\u0019\u00a3\u0010\u00c2<_\u00bb\u00db:\u0099\u00af&V\u000b\u00f0\u00b50\u0099$\\\u00b8h\u00c3+\u00b2\u0083\u0007x\u00d6-\u00dc\u0082\u00dc\u00ae\u0082\u00cb\u00eb\u00be\u00ce\u001d\u00b8fZ\u0098?\u00c3e\u00a6t\u0085\u0086\u00af\u00ff\u0092\u00a6\u00d5\u009eq\u00bah\u00c6L\u00de$3{\u0014\u00ad\u00d4\u0087B{\u0010\u00be\u00b7C\u00c2O\u0013\u00122\u0015\u0096c\u000fg`\u007f\u00b0\u00fet,(\t\u00d8_\u000e\u008b\u0018:\u0019\u00b5\u00de\u00e7\u00ea:\u00f8\u00b98O\u0093\u00b9\u0080\u00b1(a\u00ad e|\u0090\u00cf\u0088\u0081+d\u00d9l\u00e9&\u00fc\u0080:\u0091-\u0084>\u00e67\f<\u0013\u008e0B\u00e0z\u0088\u00d9\u00a7\u00c0\u00e0on\u00e5mS}\u008dF\u00bf\u0090\u00aef\u00c8\u00c8>q|\u00b3\u000f\u0013K`\u0004DPL\u001d\u00d1\u0099\u008fJES\u00d8\u00a5o\u0007_C\u008a\u00f4'\u00e5\u0092c$\u00cd\u0099\u00afv\u0087\u00afk\u008fzx\u00de\u008b\"\u009d\u00c7*\u00bd\u00b9\u001cz\u0013\u00ae\u001aR>\u008e\u00b6\nb\u00ccY\u00f3\u00ff!\u00da\u0094\u0015)\u00edH$\u00b0\u00d3\u0086\u00c8jG\u00ca\u00a4y\u00ac\u00d9\u00cb\u00bb\u00af\u00c1\u00eb\u0001jZ\u00f6\u00a3\u00a5\u009a0\bu_\u00de\u000f\u00f1\u0001\u00ef\u00d5y\u00e7u/\u00c8\u0092\u0007\u0094\u00f8\u00db\u009d6\u00e0\u00b1\u008b\u00c2`\u00df9TL\u0084\u00db\u008d\r$\u0011\u00e9\u0087\u009a\u0091\u00b4\u00b9\u0098\u00d5\u00c8\u00af\u0000s8<\u00f3\u00c6i!m\u008ed\u0090\u0001\u0097\u00d8=\u00f8P\u00f5\u00b0\u00ea\u0095:+R\u0088\t\u00cd\u00f5\u00f5\u009b\u00dc\u00c9\u00f2d|\u0096s\u00ad%\ry\u00f5~\u00a3eF\u00fd\u00f9\u00fe\u0094t\u00cdn@5\u00ad\u0007{>\u00f2\u00f5\u00b6>\u00e5\u0018\u00fe\u001f\u000b\u00ea'\u001d<I\u00dd#\u0006\u00fa[<8`\u00c9\u0001\u00a6\u0098\u0005;P\u00b2\u00e3\u00e9\"\u00fa\u000b+\u009d\u00b3\u008a\u009f\u0002@\u00d5\u00ac\u001e\u00f3=\u00b8\r\\\u00b2\u00c8\tI\u000eAt\u00a2qP\u00c8V\u00cf^Ll)}k\u00b0\u0083\u008d4\u008f\u00ad\u00d6\u00a7\u00b4\u00ed$9N]y$\u001a|8\u001fm`\u0091R\u00997\u00a1M\u0090\u00dd_@oHY\u00d6\u00a6\u00a6pg\u00bb\nU\u00f5\"\u00bf\u00bc\u00c1Y`\u00b3\u00be`\u00ba\u0085\u0097\u0011\u00c0\u00ec0\u0087\u00ee\u00a09E\u00dcH\u00bc\u00d9I*\u0096\u00fbJK2c\u00fe\u00d2\u00a0\u0097\u0082\u0089\u0007\u0006\u00d4iA\u009b\u00c95\u0004N\u00e4\u00ae\n\u0003\u00e8\u00c4\u00f5\u00e3]\u001d\u00ba!\u008b\r\n\u001b\u00a8\u0082[\u00f4X\u00b5\u00c7\u00ab|\u00ee\u0000\u00d2\u00c0\u00bb\u00bf\u00f5\u00b2\u00c8\u00eei\u00a4j\u00e0\u00b7\u00b4\u0091\u00ef\u00d3\u00f6*\u00ee\"9t\u00a6q\u00a0\u00e8\u0002\u00e1mj\u00d6\u00cc\u001b\u008bx\u0092-\u00d2`R\u00a4\u00d2PA\u00ca{\u0091\u0084\u00042\u00809\u00bd? \u00fc \u00e4\u00cd\u0088\u0084\u0098\u0003MIo!\u00ae\u0097K*\u00d6[~\u00fc\u0095\u00fa\u00fb W\u009a\u001e\u00d7B\u00ff\u0000\u0005\u00f8_\u00c4\u00c5t\u009f\u0085\u00f4\u00c9\u00118\u00c1Oh\u00f6J\u00f2\u00c8v\u00db\u00cb\u00dcx9\u009a\u00caq\u0017qb\u0081\u00af\u00e3u$\u00ef\u00c5p-\u00fc\u009b9vl?w%\\\u0088\u0090'\u000f\u0003#\u00ef\u0084\u00fe^'\u00a0}\u00cd\u0003\u00b7\u0088$p\u00f7^\u00f2\u009e\u00bb1K\n\u00f6nN\u00ac\u00b0\"o\u00a7\u000eH\u00a5\u00fc;\u00cc$[\u00bc\u00c8\u00d2\u00f4\u0091\u00d7dm\u0015\u0000\u00a7z\u00edu\u0098j\u00ff$\u00cc\u00d3n\u0000\u008d|\u00f3\u0019\u00ab\u00f7\u00cc\u0088_\fe\u0083\u009f8\u00b0E0KW\u0093\n!\u00d3\u00bd\u0080k\u00e7\u0087\u00a1y\u0094\u00e0\u0081\u00e2\u00db.o?\u009d\u00a4\u00ceq\u0085\u00e8\u00cdL^\u001b&k\u00b2\u00d4|\u009fh\u00cb\u00e5\u0019\u00ae\u00e5\u009b)H7g\u009d\u00ba\u00ff\u001f@M\u00f2\u00f8\u00ddG\u00eb\u00d42As\u0012_._)y(26U%[E\u00ae\u0081\u0014\u0097\u00ba\u00bf\u00e2\u008f.\u00fd\u00b1\u00e4\u00ffy<^6J-\t\u0007+\u00f4\u009c\u00c3#\u001e\u00f5\u001a\u00f7\u0093\u00d6\u00a7D\u00f6K[\u00db<H\u00b0\u00f9\u00b7+\u007f'\u00cd\u00e8\u00ce-\u0094\u00eb)\u0002\u00bd\u009fT\u00f1L\u00c4'\u00b09}\u00f8\u0017\u00a3T\u0016a\u0005\u00d6\u00b2A\u00e5G\u0094e \u00d5\u00f2\u0080m\\\u00a8\u00caM4\u0092\u000f\rY\u0095\u00b5\u00bfu\u00cfzRn\u00f3\u00d6\u000fNf\u0003\u00f8\r\u001c\u00bc\u0014W&\u0099\u00a3\u00fe\u007fT\r\u00d5\u00c3\u00983\u0015\u000e\u0091g\u00fe)k\u001c\\\u000e\u00df'.\u001cv\u008a+U\u00deli\u00c6Te\u00cf\u0084\u0013I4\u00ce\u0086eV\u00c6\u0080m,\u00b5M\u00bf\u00ce\u00fc;\u00bd-\u0018\u00cd\u00d8ff+\u0095\u0013\u008e\u0007\u00b5\\\u00a7\u0083\u001dJ\u00f6O\u0011\u00cf\u00d2\u00c7\fP\u00a0\u00aeV\u0007\u009eu\u00a3\u00e0\u0002\u0017)\u00f8\b5\u0089\u00c9\u009a\u00a0\u0088\u0017TAC4\u00cdb\u00bbKS9\u00f6\u00fa\u00f0\u00c7\u0084\u0018e/\u0013\u00e1`\u0007\u00d4a4'\u00c9r`\u00b7\u00f5\u00d8y\u000f\u00d1\u00d6\u00ce\u0088\u00b3\u00ab\u00c6\u00bck\u008fJ\u00a1\u008er;\u009dn\u0015W\u00ae4\u00a6W\u0001\u00ce\"i\u00c9\u00d8\u001dV\r\u001fF\u00a4h5AC\u00e7\u007fT\u00a6\u0085\u0017\u00c3\u0018\u00d4\u0019\u00c1\u00b4\u00c5\u00b8u\u00ecy\u00c1\u00fdf\u00b6_\t\u0018\f6\u0085\u00d6\u00c2\u00b4\u00fe\u0082Qc\u00b7Sv\u00cb\u0082\u00b9[$&R\b\u00d1\u0091\u00ae\u00ab\u00bb7\u0005\u0092\u008d\u00de\u00f1c\u0099P\u00d6\u00b4O\u0090\u00ae\u00f9\u00a3\u0096\u0092\u00ec\u00a5KA\u001b\u00fd\u009e\u0016\nh\u00b0\u009d\u00c7w,\u00c7\u00c4\u00d6%\u00a8\u00e4otn\u00bdn\u0088\u00cf\u007f!|\nr\u00e1\u00b1\u0096\u009d\u00e7\u00bd\u0098\u00d7\u00a59\u0007\u00a6\u009bfE\u00cb\u001f\u00f4eY7\u00b3C3\u00b2n\u00ec\u00df\u00d93\u00e7\u0086\t\u0090\u00dfg\u0004\u009b ?'\u009e\u00cf|\u00fb\u009cq\u00eb:Wg\u0007\u0007\u00c0~\u00a4\u001a\u00fd\u00dad\u0014\u00ce,b\u0017W\u00d8/S6\u00b6\u00cb\u00f1\u00fd}\u00c7\u00d6\u00dd\u00f7\u00b8\u00900>@\u00fd\u00ba\u00a1\u0099\u00121\t4\u009aV\u00d5\u0004\u0084\u00d5\u00f3nQ;\u008ay\u0012\u00bfh\nBJA\u00acV\u0086\u00cc\u0087\u00d7\u00aa\u0007\u009dh+\u0010b/D+xp\u0091\u0087#\u00e7\u00a3\u00a6\\@\u009d3\u0017\u00cb\u0007\u0006aO\u00d1~\u0007\u00f3\u00d3\u00dfN\n\u00da\u00ea\u00d9\u00ab\u00b79d9~\u00f47\u0080z<6G\u00ca\u0010F\u00af\u0080\u00ad\u00f6\u0096\u00eb,\u0088\u00d6\u0017\u00e7\u001e\u0016\u00f8\u0000\u00f6j\u00deC#\u0082(D{\u00f3\u000f\u00a3:w9g\u00f8\u00d5\u000e\u00e2\u00e5@\u00aa\\hy\u00f4\u0087\u00b9\u00c5\u00bc\u0091r1\u00d7\u00cb\u0098\u00bb\u00d2JU\u00e7\u00fa@$\u000e\u0099\u009d\n\u008e\u00a7=\u008eC\u00b0%7\u0007\u00cf\r\u00bd\u00eb\u00f5}\u0096\u000b\u00d5$8tHQ\u00bd\u0004 \u00c3\fg\u0083I\u00a6E\u009c\u00a9=\u00bf\u0007\u0083*c[v\u0091\u00d7\t\u00e4!\u00cd\u00ff\u008b\u009agK\u00dc}\u0013\u00a3\u0006\u009e\u00fbX\u00e8\u00d0\u000f\u00a8\u00b6\u001b\u00f9p f\u00bc\u00be\u0011e\u00a5 nu\u00b0\u00b19\u00866\u00d8\u00c2\u0091g\u00ecd\u0018\u00ea(\u00b1O\u00a0\u000e\u00c8\u0089a\u00fa\u00a6;\u00f0\te\u0006`a\u0006\u00d9\f\u00b2\u00f2\u00f2\u00c8\u009bP\u001a\u008ed9\u00fc\"&\u0098!^\u00a4\u00bf\u0002)]\u00ae\u00f7\u00c4\u0090,\u00b5\u0080)2%\u00eevB.\u00d9\u00d6\u00ea<\u00daw8\u00c0~~rase\u00e9\u00c9\u0097\u00b5\u00d6\u00a7\u00d9G\u00a8\u0088\u00bc\u00fc\u00fe\u00f3\u00ff\u00bc\u0017\u008b*P\u0096u\u00ec4#\u00b8B\u00c0i\u0096\u001f\u0015\u0096o$\u00fd\u00ab\u001e\u0019\u0097\u00d6)\u001eK\u00ab~_t\u00a6\u000f\u009fU\u0003\u0085\u00ac\u00aa\u0017\u008620\u00c0J\u00ed\u008c+V\u009f\u009d\u00b7:\u0086E\u0081\u00a4\u0010\u0093\u0018\u00ad\u00daW\u00b8aT\u0000\u00a4\u0011@`\u00aa^!\u0010\u00fb\u0013\u0001sF\u0098Y\u00e8l^\u00b5\u00fd\u00d5]r8\u00e7&1o:\u0090\n\u00baR\u00f4\u00d3\u008c\u00ba\u001e5\u009d\u007f\u008d@\u00c0\u00e4G\u00e8\u00cbr\u00fc\u00f1\u0081\u00a5\u00b5\u0098\u00c7\u0090,:\u0015\u00c6\u00b3\u00edD\b\u00e7\u00d0\u0092\u00da\u0095\u0017\r\u00f47},\u0014\u00cd\u0012\u00b0\u001dT\u00caB5\u00ad\u009d,\u00cf\f\u0000\u00f5\u00d4\u00c3\u00bc\u00bd&Me\u00f9n\u0005\u00af9\u00b9\u00866\u00e5\u00f1\u0083v\f\u00d6\u00ca\u00c8\u008d?<\u00c9Se\u00ee\u00e2\u00f5\u0015N}\u00d3D\u00104Z\u00d8a\u00d0\u0011JJCq\u00e3\u00a7\u0088(3w\u00c9\u0004\u00cf\u00b5e\u0094\u00be\u00cd\u00d0r\u0086\u001c}\u00be<9\u00a5\u0092\u00f3DBN\u0004\u00a6Di\u001f\u00c4 \u00bc\u0005\u008f\u0014.K\u00b8J\u00b0d\u00fd(\u00c1h\u0086\u00a8D\u00ba\u00ddT\"\u009d\"nv+\u001a\u0095\u00ad=\u0004\u008c\u00c9!\u00c8\u00f2^/\u009chx\u00a9\u00e0#\u009dP\u00d2\u00ab\u0015\u00f3\u009dp\u00c7\u00d1n\u00c0}\u001d\u00e5\u00e7%\u00ce\u009e\u0085\u0019\u00a8\u008e\u00fc\u00a6\u00a8\u0010 \u008b*\u00aa\u00fc\u00b6\u00c7,B\u00975\u00e8\u009d\u00d3\u00c1}\u00d5Z ]\u0089$hF\u00a7\u001c\u0096\u001a2\u00d3.\u00c6\u00eaPy\u0001\u00be\u00f9\u00dc\u001e$\u0092\u00075\u00a5+i=\u0017\u00a8\u0087,\u0091v\u0012\u00a3\u0006\u009d7\u00c5V\u0013\u0010\u0096X\u00e5\u000e\u0006T\u008bc3\\\u0005\u0015\u00be\u0094]\u009b^K+c\u0098\u00bb\u00dbX\u00bb\u00a6\u00eeQ(W\u00bf\u00f4Fh\u00e8\u00bd\u00b2\u00eaf\u00dbV2X\u00bb\u0014V+\u00ba\nv_-\u0001\u0092L`\u00f02\u009a\u00faI\u00fd\u0088\u00c9l\u0011\u00d9\u0093D\u00cb\u00fb\u00a4\u00a5=\"\u00bc\u00fb!\\\u00d5\u0013%bf\u0007\u00c6\u00c6\u001eD\u00cdU\u00dfKA\u000f\u001b\u00d1E7\u00b0%\u00aal\u0095\u00c7k\u0099\u00b2\u00ad\u0080\u0007\u00b0\u00f4(0\u00b6a\u0018u\u00b2\f+\u007f\u0097\u00cc\u009a3\u0084\u00df\u00cd\u00c3\u008bT\u00a68\u009c\n\u0002I\u009aN\u00f1k\u00a6\u00c2\u00a5\u009f\u000eL\u0019\u00e7\u00f7%\u0092\u00ec\u00bc'\u00b5\u00a4&C\u00f6\u0015\nTN>\u00ad\u00b7?\u00c6\u0013%w\u0012\u00a5\u00d7\u0019\u0012\u00f8\u00a7\u009f\u00e8x\u00b0\u0099\u009f\u00bb\u00ee{\u00ac\u0082q\u0093(Lhi\u0090x\u00b3\u00a0|=\u008d\f\u00adz\u0099{\u00d7\u00d0\u00fa\u00d6\u00db>\u0014\\;\u0019^\u00ea\u00a3\u0096\u00de\u0014dhY\u00fcLnfi(\u0000\u00aa\u00ad\u0091$\u0080|T\u00a7\u00da{9\u00ae\u00a9'\u00e5\u0006\u00c0\u001e\u0018\u00f2\u00ca%\u00a6^\u0010\u00f0\u00a1\u00a0\u00a88\u001f~\u00cfb\u00ae\u0011\u00af\u00ecm\u00e0.)\u0093\u00c2\u00bd\u00bayH\u00f6\u00b0\u008fjry".length();
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
                    var4_3 = "\u008d.\u00b7K\u00b5\u00a4\u00a1\u00e1\"\u00a3\u00b74\u001b\u00d2w\u000e";
                    var5_4 = "\u008d.\u00b7K\u00b5\u00a4\u00a1\u00e1\"\u00a3\u00b74\u001b\u00d2w\u000e".length();
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
        ly.a = var6_1;
        ly.b = new Integer[462];
        ly.S = new EquipmentSlot[]{hi.a("j", (long)775170544810875557L), hi.a("j", (long)1054923417099375911L), hi.a("j", (long)519683754008057371L), hi.a("j", (long)1176677532982660135L)};
    }

    public static float z(Object[] objectArray) {
        Vec3 vec3 = (Vec3)objectArray[0];
        DQ dQ = (DQ)((Object)objectArray[1]);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = dQ;
        objectArray2[1] = null;
        objectArray2[0] = vec3;
        return (float)hi.a("G", (Object)objectArray2, (long)1118417578495590333L);
    }

    private ly() {
    }

    public static float F(LivingEntity livingEntity, Vec3 vec3, DQ dQ) {
        Object[] objectArray = new Object[5];
        objectArray[4] = dQ;
        objectArray[3] = null;
        objectArray[2] = Float.valueOf(5.0f);
        objectArray[1] = vec3;
        objectArray[0] = livingEntity;
        return (float)hi.a("G", (Object)objectArray, (long)485195998866200174L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A3E;
        if (b[n2] == null) {
            ly.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
