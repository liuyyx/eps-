/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.AbstractClientPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.__;
import com.github.epsilon.hi;
import com.github.epsilon.vy;
import com.github.epsilon.yE;
import com.github.epsilon.ym;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class _n {
    private Map<AbstractClientPlayer, List<Vec3>> o;
    public static final _n I;
    private static final long[] a;
    private static final Integer[] b;

    private _n() {
        hi.a("\u00f2", (Object)this, new HashMap(), (long)997410522866036036L);
        _n.f("JvWAowSVYVvvQDZi", X(java.lang.Object ), (vy)((Object)hi.a("j", (long)519102950410566293L)), (Object)this);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public AABB t(Object[] var1_1) {
        block79: {
            block83: {
                block82: {
                    block84: {
                        block81: {
                            block80: {
                                block85: {
                                    var4_2 = (AbstractClientPlayer)var1_1[0];
                                    var5_3 = (List)var1_1[1];
                                    var3_4 = (Integer)var1_1[2];
                                    var2_5 = (Integer)var1_1[3];
                                    var6_6 = Dl.S();
                                    var26_7 /* !! */  = _n.a(7119, 7649801214769865098L) ^ _n.a(30736, 1782565027055682227L) ^ _n.a(18762, 7141352050090111746L);
                                    if (var6_6) break block85;
lbl9:
                                    // 2 sources

                                    while (true) {
                                        v0 = new Object[2];
                                        v0[1] = var2_5;
                                        v0[0] = var5_3;
                                        var7_8 = hi.a("\u00a5", (Object)this, (Object)v0, (long)450430299536260444L);
                                        var8_9 = hi.a("\u00e9", (Object)var7_8, (long)1300412705618690751L);
                                        var10_10 = hi.a("\u00e9", (Object)var7_8, (long)1294071886475894755L);
                                        var12_11 = hi.a("\u00e9", (Object)var7_8, (long)1282612456329596420L);
                                        var14_12 = 0.6;
                                        var16_13 /* !! */  = new AABB((double)(hi.a("\u00a5", (Object)var4_2, (long)835856425001936249L) - 0.3), (double)_n.f("JvWAowSVYVvvQDZi", getY(), (AbstractClientPlayer)var4_2), (double)(hi.a("\u00a5", (Object)var4_2, (long)1010483639671383489L) - 0.3), (double)(hi.a("\u00a5", (Object)var4_2, (long)835856425001936249L) + 0.3), (double)(hi.a("\u00a5", (Object)var4_2, (long)401880629358773030L) + (hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)var4_2, (long)750583557385900206L), (long)1116111677700761539L) - hi.a("\u00e9", (Object)_n.f("JvWAowSVYVvvQDZi", getBoundingBox(), (AbstractClientPlayer)var4_2), (long)797530004147152713L))), (double)(_n.f("JvWAowSVYVvvQDZi", getZ(), (AbstractClientPlayer)var4_2) + 0.3));
                                        var17_14 /* !! */  = _n.f("JvWAowSVYVvvQDZi", F(java.lang.Object java.lang.Object ), (_n)this, (Object)var4_2, (Object)hi.a("\u00a5", (Object)var16_13 /* !! */ , (double)0.0, (double)-0.04, (double)0.0, (long)738081145657832578L));
                                        var18_15 = 0;
                                        if (var6_6) ** GOTO lbl296
lbl22:
                                        // 2 sources

                                        while (true) {
                                            v1 = var18_15;
                                            v2 = var3_4;
                                            if (!var6_6) ** GOTO lbl300
                                            if (v1 >= v2) ** GOTO lbl298
                                            ** GOTO lbl302
                                            break;
                                        }
                                        break;
                                    }
lbl28:
                                    // 2 sources

                                    while (true) {
                                        block89: {
                                            block88: {
                                                block87: {
                                                    block86: {
                                                        cfr_temp_0 = hi.a("\u00a5", (Object)v3 /* !! */ , (long)431225985925845942L) - 0.0;
                                                        v4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                        if (!var6_6) break block86;
                                                        if (v4 == false) break block87;
                                                        v4 = hi.a("G", (int)(_n.a(11715, 9151310111091169180L) - _n.a(30731, 1224202716794765971L)), (int)_n.a(32364, 8241041226812834993L), (long)834203424483934088L) * _n.a(7963, 1685015663722833219L) * _n.a(2191, 8740027789886960213L) - _n.a(14064, 3756737130439412741L);
                                                    }
                                                    var26_7 /* !! */  = (int)v4;
                                                    if (var6_6) break block88;
                                                }
                                                var26_7 /* !! */  = _n.a(8612, 3557507813673966557L) / 3 + _n.a(2235, 14472013461795461L) + _n.a(5382, 7502987636785885002L) ^ _n.a(12956, 1202061112083384418L);
                                            }
                                            v5 = var26_7 /* !! */ ;
                                            if (!var6_6) break block79;
                                            switch (v5) {
                                                default: {
                                                    v3 /* !! */  = var20_17;
                                                    var26_7 /* !! */  = ((_n.a(30493, 8159200234438053268L) ^ _n.a(13378, 9176534060809031390L)) / _n.a(20494, 1655285435570317884L) ^ _n.a(7277, 8083554525489899100L)) * _n.a(23719, 343408891757454976L) + _n.a(10332, 8003643700926648861L);
                                                    if (!var6_6) {
                                                        break;
                                                    }
                                                    break block80;
                                                }
                                                case -1187128444: {
                                                    v3 /* !! */  = hi.a("G", (Object)var4_2, (Object)var20_17, (Object)var16_13 /* !! */ , (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var19_16, (long)1100725717222529285L);
                                                    if (var6_6) break;
                                                    break block89;
                                                }
                                                case -1187128446: {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                            var26_7 /* !! */  = ((_n.a(10968, 8798974503599673535L) ^ _n.a(14296, 8338473160412564937L)) / _n.a(19404, 2557600820905374101L) ^ _n.a(2143, 2506963938858644197L)) * _n.a(24886, 5159851173170568020L) + _n.a(23523, 8691890107318690149L);
                                            break block80;
                                        }
lbl58:
                                        // 2 sources

                                        while (true) {
                                            block91: {
                                                block90: {
                                                    var21_18 /* !! */  = v3 /* !! */ ;
                                                    v6 = var17_14 /* !! */ ;
                                                    if (!var6_6) break block90;
                                                    if (v6 == false) break block91;
                                                    v6 = hi.a("G", (int)_n.a(14276, 5085638974580198720L), (int)_n.a(1194, 1186218278803291802L), (long)834203424483934088L) / _n.a(27232, 4090923147475734606L) + _n.a(13656, 7130846739179573196L);
                                                }
                                                var26_7 /* !! */  = (int)v6;
                                                if (var6_6) break block81;
                                            }
                                            var26_7 /* !! */  = (int)(hi.a("G", (int)_n.a(12970, 2466938260454443231L), (int)_n.a(26313, 7481910341895904476L), (long)834203424483934088L) / _n.a(3722, 6436593731842225169L) - _n.a(24177, 4224685397469193438L));
                                            if (var6_6) break block81;
                                            ** GOTO lbl184
                                            break;
                                        }
                                        break;
                                    }
lbl71:
                                    // 2 sources

                                    while (true) {
                                        block93: {
                                            block92: {
                                                v7 /* !! */  = var22_19 = v8;
                                                if (!var6_6) break block92;
                                                if (v7 /* !! */  != 0) break block93;
                                                v7 /* !! */  = var26_7 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(_n.a(18003, 8608456286148099156L) - _n.a(30421, 1122586616974101699L)), (int)_n.a(11833, 1567839449111041262L), (long)834203424483934088L) + _n.a(20344, 72169988450678033L)), (int)_n.a(26625, 4649521931263136501L), (long)834203424483934088L) - _n.a(9852, 8614481740951067703L));
                                            }
                                            if (var6_6) break block82;
                                        }
                                        var26_7 /* !! */  = (int)(hi.a("G", (int)(_n.a(7762, 5735849862426961030L) - _n.a(22711, 7121588008063459845L) + _n.a(20331, 958010364874257750L) - _n.a(7014, 5507148465049706816L)), (int)_n.a(24496, 4459413059651003756L), (long)834203424483934088L) + _n.a(27198, 3542465509081108656L));
                                        break block82;
                                        break;
                                    }
lbl81:
                                    // 2 sources

                                    while (true) {
                                        var23_20 = var25_22;
                                        if (var6_6) ** GOTO lbl304
lbl84:
                                        // 2 sources

                                        while (true) {
                                            cfr_temp_1 = hi.a("\u00a5", (Object)var23_20, (long)1192650552822508582L) - hi.a("\u00a5", (Object)var21_18 /* !! */ , (long)1192650552822508582L);
                                            v9 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                            if (!var6_6) ** GOTO lbl308
                                            if (v9 <= 0) ** GOTO lbl307
                                            ** GOTO lbl310
                                            break;
                                        }
                                        break;
                                    }
lbl90:
                                    // 2 sources

                                    while (true) {
                                        var16_13 /* !! */  = _n.f("JvWAowSVYVvvQDZi", move(net.minecraft.world.phys.Vec3 ), (AABB)var16_13 /* !! */ , (Vec3)var21_18 /* !! */ );
                                        v10 /* !! */  = var17_14 /* !! */  = hi.a("\u00a5", (Object)this, (Object)var4_2, (Object)_n.f("JvWAowSVYVvvQDZi", move(double double double ), (AABB)var16_13 /* !! */ , (double)0.0, (double)-0.04, (double)0.0), (long)935602811900969823L);
                                        if (!var6_6) ** GOTO lbl315
                                        if (v10 /* !! */  == false) ** GOTO lbl314
                                        ** GOTO lbl317
                                        break;
                                    }
lbl96:
                                    // 2 sources

                                    while (true) {
                                        var10_10 = (var10_10 - 0.08) * 0.98;
                                        if (!var6_6) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                ++var18_15;
                                                if (!var6_6) {
                                                    return var16_13 /* !! */ ;
                                                }
                                                break block83;
                                                break;
                                            }
                                        }
                                        ** GOTO lbl322
                                        break;
                                    }
                                }
                                while (true) {
                                    switch (var26_7 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case -1252879825: 
                                    }
                                    hi.a("G", (long)819552573278442726L);
                                    hi.a("G", (double)0.0, (long)977232075298570964L);
                                    var26_7 /* !! */  = (_n.a(3003, 2894163531318964568L) + _n.a(12525, 6382199321953831629L)) / _n.a(737, 941138716782311530L) + _n.a(20391, 5677139818495669507L) ^ _n.a(10591, 7375908647207211998L);
                                }
lbl118:
                                // 4 sources

                                while (true) {
                                    switch (var26_7 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 1125548776: {
                                            var19_16 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var4_2, (Object)hi.a("\u00a5", (Object)var16_13 /* !! */ , (double)var8_9, (double)var10_10, (double)var12_11, (long)1201201207448147625L), (long)873695488089068957L);
                                            v3 /* !! */  = var20_17 = new Vec3((double)var8_9, (double)var10_10, (double)var12_11);
                                            ** GOTO lbl28
                                        }
                                        case 1125548777: {
                                            throw null;
                                        }
                                        case 1125548778: 
                                    }
                                    return var16_13 /* !! */ ;
                                }
                            }
                            while (true) {
                                switch (var26_7 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -2041849130: 
                                }
                                hi.a("G", (long)703609663147646272L);
                                var26_7 /* !! */  = hi.a("G", (int)_n.a(15314, 4119034727345979719L), (int)_n.a(30551, 3131332062845128138L), (long)834203424483934088L) ^ _n.a(2504, 1655760041123230606L);
                                if (var6_6) ** break;
                                ** continue;
                            }
                        }
                        block54: while (true) {
                            block104: {
                                block102: {
                                    block103: {
                                        block101: {
                                            block99: {
                                                block100: {
                                                    block98: {
                                                        block96: {
                                                            block97: {
                                                                block95: {
                                                                    block94: {
                                                                        switch (var26_7 /* !! */ ) {
                                                                            default: {
                                                                                cfr_temp_2 = var10_10 - 0.0;
                                                                                v11 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                                                                if (!var6_6) break block94;
                                                                                if (v11 /* !! */  >= 0) break;
                                                                                break block95;
                                                                            }
                                                                            case 1617544715: {
                                                                                cfr_temp_3 = hi.a("\u00e9", (Object)var21_18 /* !! */ , (long)1294071886475894755L) - var10_10;
                                                                                v12 /* !! */  = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                                                                                if (!var6_6) break block96;
                                                                                if (v12 /* !! */  == false) break block97;
                                                                                break block98;
                                                                            }
                                                                            case 1617544717: {
                                                                                cfr_temp_4 = hi.a("\u00e9", (Object)var21_18 /* !! */ , (long)1300412705618690751L) - var8_9;
                                                                                v13 /* !! */  = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 > 0 ? 1 : -1);
                                                                                if (!var6_6) break block99;
                                                                                if (v13 /* !! */  != false) break block100;
                                                                                break block101;
                                                                            }
                                                                            case 1617544721: {
                                                                                cfr_temp_5 = hi.a("\u00e9", (Object)var21_18 /* !! */ , (long)1282612456329596420L) - var12_11;
                                                                                v14 /* !! */  = cfr_temp_5 == 0 ? 0 : (cfr_temp_5 > 0 ? 1 : -1);
                                                                                if (!var6_6) break block102;
                                                                                if (v14 /* !! */  == false) break block103;
                                                                                break block104;
                                                                            }
                                                                            case 1617544716: {
                                                                                v8 = 1;
                                                                                var26_7 /* !! */  = (_n.a(26854, 2210178288809366019L) + _n.a(30367, 8188362722477526204L) ^ _n.a(21337, 5296411425873226222L)) + _n.a(31749, 443387479330801234L);
                                                                                if (!var6_6) {
                                                                                    break block54;
                                                                                }
                                                                                break block84;
                                                                            }
                                                                            case 1617544718: {
                                                                                v8 = 0;
                                                                                if (var6_6) break block54;
                                                                                ** GOTO lbl71
                                                                            }
                                                                            case 1617544720: {
                                                                                throw null;
                                                                            }
                                                                        }
lbl184:
                                                                        // 2 sources

                                                                        v11 /* !! */  = (reference)((_n.a(8397, 9013003791447628532L) - _n.a(10218, 4737300251207736646L)) * _n.a(18242, 4984183580187524498L) ^ _n.a(28694, 2068335084975934265L));
                                                                    }
                                                                    var26_7 /* !! */  = (int)v11 /* !! */ ;
                                                                    if (var6_6) continue;
                                                                }
                                                                var26_7 /* !! */  = (int)((hi.a("G", (int)_n.a(13689, 9075248388374564653L), (int)_n.a(11430, 927345040133723672L), (long)834203424483934088L) / 4 + _n.a(30683, 4660288314994478384L)) / _n.a(16121, 7539104412767814761L) + _n.a(1729, 156969278868503707L));
                                                                if (var6_6) continue;
                                                            }
                                                            v12 /* !! */  = (reference)((_n.a(22937, 2486185640096850804L) - _n.a(12676, 5797213203185732388L)) * _n.a(11690, 1790630513628681984L) ^ _n.a(30147, 678812356810624914L));
                                                        }
                                                        var26_7 /* !! */  = (int)v12 /* !! */ ;
                                                        if (var6_6) continue;
                                                    }
                                                    var26_7 /* !! */  = (int)(hi.a("G", (int)_n.a(28591, 1790268853774767556L), (int)_n.a(3564, 6922489041701680973L), (long)834203424483934088L) / _n.a(3722, 6436593731842225169L) + _n.a(19903, 5306580791439620095L));
                                                    if (var6_6) continue;
                                                }
                                                v13 /* !! */  = (reference)((_n.a(17101, 8728384690331645963L) ^ _n.a(22333, 9210644178216643601L)) + _n.a(8903, 7052249536631642265L));
                                            }
                                            var26_7 /* !! */  = (int)v13 /* !! */ ;
                                            if (var6_6) continue;
                                        }
                                        var26_7 /* !! */  = _n.a(3250, 1165914083532682779L) / _n.a(13913, 7698807157749255211L) + _n.a(14345, 7879703060467221096L) - _n.a(17854, 3011146629765758764L) + _n.a(4678, 1201990730560841898L);
                                        if (var6_6) continue;
                                    }
                                    v14 /* !! */  = (reference)((_n.a(22937, 2486185640096850804L) - _n.a(12676, 5797213203185732388L)) * _n.a(11690, 1790630513628681984L) ^ _n.a(30147, 678812356810624914L));
                                }
                                var26_7 /* !! */  = (int)v14 /* !! */ ;
                                if (var6_6) continue;
                            }
                            var26_7 /* !! */  = (_n.a(25139, 3114235582948432157L) ^ _n.a(24336, 8501321699424134594L)) + _n.a(16763, 6355778297445153613L);
                        }
                        var26_7 /* !! */  = (_n.a(5802, 8129381047275695234L) + _n.a(9880, 9077597440736402554L) ^ _n.a(24105, 4987975630376592537L)) + _n.a(2014, 1838599967003196779L);
                    }
                    switch (var26_7 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 1956714030: 
                    }
                    return null;
                }
                block55: while (true) {
                    block107: {
                        block108: {
                            block106: {
                                block105: {
                                    switch (var26_7 /* !! */ ) {
                                        default: {
                                            var23_20 = hi.a("G", (Object)var4_2, (Object)new Vec3((double)var8_9, var14_12, (double)var12_11), (Object)var16_13 /* !! */ , (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var19_16, (long)1100725717222529285L);
                                            var24_21 = _n.f("JvWAowSVYVvvQDZi", collideBoundingBox(net.minecraft.world.entity.Entity net.minecraft.world.phys.Vec3 net.minecraft.world.phys.AABB net.minecraft.world.level.Level java.util.List ), (Entity)var4_2, (Vec3)new Vec3(0.0, var14_12, 0.0), (AABB)hi.a("\u00a5", (Object)var16_13 /* !! */ , (double)var8_9, (double)0.0, (double)var12_11, (long)1201201207448147625L), (Level)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (List)var19_16);
                                            cfr_temp_6 = hi.a("\u00e9", (Object)var24_21, (long)1294071886475894755L) - var14_12;
                                            v15 /* !! */  = cfr_temp_6 == 0 ? 0 : (cfr_temp_6 < 0 ? -1 : 1);
                                            if (!var6_6) break block105;
                                            if (v15 /* !! */  >= 0) break;
                                            break block106;
                                        }
                                        case 235054857: {
                                            ** GOTO lbl90
                                        }
                                        case 235054855: {
                                            var10_10 = (reference)0.0;
                                            if (var6_6) break block107;
                                            ** GOTO lbl96
                                        }
                                        case 235054858: {
                                            ** continue;
                                        }
                                        case 235054856: {
                                            ** continue;
                                        }
                                        case 235054854: {
                                            _n.f("JvWAowSVYVvvQDZi", values());
                                            _n.f("JvWAowSVYVvvQDZi", Y());
                                            var26_7 /* !! */  = _n.a(28040, 1847609108185634805L) - _n.a(5056, 2803424458734938470L) + _n.a(17067, 5613783085192149152L);
                                            continue block55;
                                        }
                                    }
                                    v15 /* !! */  = (reference)(_n.a(14980, 2284816975452635186L) - _n.a(14368, 5520319333115527947L) - _n.a(3958, 338107862932894997L) + _n.a(21779, 1907168377512030173L));
                                }
                                var26_7 /* !! */  = (int)v15 /* !! */ ;
                                if (var6_6) break block108;
                            }
                            var26_7 /* !! */  = (_n.a(7707, 4225711380221076605L) ^ _n.a(23826, 8280471112945887057L)) - _n.a(8554, 3668618166044662667L);
                        }
                        block56: while (true) {
                            block111: {
                                block110: {
                                    block109: {
                                        switch (var26_7 /* !! */ ) {
                                            default: {
                                                var25_22 = _n.f("JvWAowSVYVvvQDZi", add(net.minecraft.world.phys.Vec3 ), (Vec3)hi.a("G", (Object)var4_2, (Object)new Vec3((double)hi.a("\u00e9", (Object)var20_17, (long)1300412705618690751L), 0.0, (double)hi.a("\u00e9", (Object)var20_17, (long)1282612456329596420L)), (Object)_n.f("JvWAowSVYVvvQDZi", move(net.minecraft.world.phys.Vec3 ), (AABB)var16_13 /* !! */ , (Vec3)var24_21), (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var19_16, (long)1100725717222529285L), (Vec3)var24_21);
                                                cfr_temp_7 = hi.a("\u00a5", (Object)var25_22, (long)1192650552822508582L) - hi.a("\u00a5", (Object)var23_20, (long)1192650552822508582L);
                                                v16 /* !! */  = cfr_temp_7 == 0 ? 0 : (cfr_temp_7 > 0 ? 1 : -1);
                                                if (!var6_6) break block109;
                                                if (v16 /* !! */  <= 0) break;
                                                break block110;
                                            }
                                            case 82498518: {
                                                ** continue;
                                            }
                                            case 82498521: {
                                                var25_22 = hi.a("\u00a5", (Object)var23_20, (Object)hi.a("G", (Object)var4_2, (Object)new Vec3(0.0, (double)(-hi.a("\u00e9", (Object)var23_20, (long)1294071886475894755L) + hi.a("\u00e9", (Object)var20_17, (long)1294071886475894755L)), 0.0), (Object)_n.f("JvWAowSVYVvvQDZi", move(net.minecraft.world.phys.Vec3 ), (AABB)var16_13 /* !! */ , (Vec3)var23_20), (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var19_16, (long)1100725717222529285L), (long)701637995304699260L);
                                                var16_13 /* !! */  = _n.f("JvWAowSVYVvvQDZi", move(net.minecraft.world.phys.Vec3 ), (AABB)var16_13 /* !! */ , (Vec3)var25_22);
                                                var17_14 /* !! */  = (CallSite)true;
                                                if (var6_6) break block56;
                                                ** continue;
                                            }
                                            case 82498519: lbl-1000:
                                            // 2 sources

                                            {
                                                v5 = false;
                                                break block79;
                                            }
                                        }
                                        v16 /* !! */  = (reference)(_n.a(20520, 4847421140587276823L) - _n.a(20264, 1534044197158941995L) - _n.a(11401, 4072544125351892716L) + _n.a(4374, 4571434001917815607L));
                                    }
                                    var26_7 /* !! */  = (int)v16 /* !! */ ;
                                    if (var6_6) continue;
                                }
                                var26_7 /* !! */  = (int)((hi.a("G", (int)_n.a(1641, 774424382302928084L), (int)_n.a(7839, 6654075959850607745L), (long)834203424483934088L) - _n.a(31599, 4338158271324439016L)) / _n.a(15897, 8550902284696552469L) / _n.a(24397, 3651213530115532196L) + _n.a(7891, 411261574319089150L));
                                if (!var6_6) break block111;
                                switch (var26_7 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl81
                                    }
                                    case 1061605639: 
                                }
                                hi.a("G", (long)1127763923712469243L);
                                hi.a("G", (long)711058383680228479L);
                                if (!var6_6) ** break;
                                ** continue;
lbl296:
                                // 2 sources

                                var26_7 /* !! */  = (int)(hi.a("G", (int)_n.a(28707, 2243292769001065023L), (int)_n.a(32051, 6481128079392851801L), (long)834203424483934088L) - _n.a(9126, 1392399251255794137L) - _n.a(12369, 6113175062913288734L));
                                if (var6_6) ** GOTO lbl118
lbl298:
                                // 2 sources

                                v1 = (_n.a(1967, 5952577368885935429L) - _n.a(18093, 6993424748260654191L) ^ _n.a(12611, 5903485528667458334L)) / 3 / _n.a(25849, 3217098226481323732L);
                                v2 = _n.a(25101, 5328952379973621956L);
lbl300:
                                // 2 sources

                                var26_7 /* !! */  = v1 - v2;
                                if (var6_6) ** GOTO lbl118
lbl302:
                                // 2 sources

                                var26_7 /* !! */  = (_n.a(6027, 7261723138883398988L) ^ _n.a(2289, 7106599883654410891L)) / _n.a(16558, 215281169249860290L) + _n.a(29170, 4522077842787257248L);
                                ** GOTO lbl118
                            }
                            var26_7 /* !! */  = _n.a(20520, 4847421140587276823L) - _n.a(20264, 1534044197158941995L) - _n.a(11401, 4072544125351892716L) + _n.a(4374, 4571434001917815607L);
                            if (var6_6) continue;
lbl307:
                            // 2 sources

                            v9 = hi.a("G", (int)(hi.a("G", (int)(_n.a(8397, 4420144918776453710L) - _n.a(2625, 901368089209876566L)), (int)_n.a(12315, 3258961608780843569L), (long)834203424483934088L) + _n.a(32427, 4436647242684318882L)), (int)_n.a(20661, 261833708733262584L), (long)834203424483934088L) - _n.a(24669, 1227433021252459211L);
lbl308:
                            // 2 sources

                            var26_7 /* !! */  = (int)v9;
                            if (var6_6) continue block55;
lbl310:
                            // 2 sources

                            var26_7 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(_n.a(23505, 4882557399951270151L) - _n.a(24538, 1913939738019423734L)), (int)_n.a(21626, 3936101636287819386L), (long)834203424483934088L), (int)_n.a(29807, 4136307713422020213L), (long)834203424483934088L) + _n.a(30462, 2313961470641294806L));
                        }
                        var26_7 /* !! */  = (int)(hi.a("G", (int)_n.f("JvWAowSVYVvvQDZi", max(int int ), (int)(_n.a(10308, 655101953269240380L) - _n.a(9629, 6202577045483134792L) + _n.a(8430, 8516628506866293330L)), (int)_n.a(30808, 8247279721384854206L)), (int)_n.a(2100, 5364269524264333983L), (long)834203424483934088L) - _n.a(23172, 4987970639025135739L));
                        if (var6_6) continue;
lbl314:
                        // 2 sources

                        v10 /* !! */  = (CallSite)(_n.a(417, 7380516699767421897L) / _n.a(24397, 3651213530115532196L) ^ _n.a(6015, 8252748035330289022L));
lbl315:
                        // 2 sources

                        var26_7 /* !! */  = (int)v10 /* !! */ ;
                        if (var6_6) continue;
lbl317:
                        // 2 sources

                        var26_7 /* !! */  = (int)(hi.a("G", (int)_n.a(5817, 4076956572879170595L), (int)_n.a(11052, 6037929314125287688L), (long)834203424483934088L) + _n.a(31311, 320738829140476052L));
                        if (var6_6) continue;
                    }
                    var26_7 /* !! */  = _n.a(26413, 7202158760846548461L) / _n.a(24397, 3651213530115532196L) ^ _n.a(4646, 6179703804690311314L);
                    if (var6_6) continue;
lbl322:
                    // 2 sources

                    var26_7 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(_n.a(10330, 4692691007342482106L) - _n.a(12502, 3515665312854772239L) + _n.a(17901, 8253853673465151336L)), (int)_n.a(29126, 4249244066125892406L), (long)834203424483934088L), (int)_n.a(4234, 1954380199456352868L), (long)834203424483934088L) - _n.a(3929, 1250255891927676233L));
                    if (!var6_6) break;
                }
            }
            var26_7 /* !! */  = (int)(_n.f("JvWAowSVYVvvQDZi", max(int int ), (int)_n.a(12963, 4704999957265221798L), (int)_n.a(25679, 2074862630079290971L)) - _n.a(1818, 4709934761418145155L) - _n.a(28861, 4405572621072189998L));
            ** while (true)
        }
        hi.a("G", (boolean)v5, (long)1096505374926936287L);
        hi.a("G", (float)100.0f, (long)681697085620050089L);
        return null;
    }

    public static /* bridge */ /* synthetic */ CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public AABB v(Object[] var1_1) {
        block12: {
            var4_2 = (AbstractClientPlayer)var1_1[0];
            var2_3 = (Integer)var1_1[1];
            var3_4 = (Integer)var1_1[2];
            var5_5 = Dl.S();
            var7_6 /* !! */  = _n.a(10649, 2499882258769285910L) / _n.a(2799, 4946975013864911009L) - _n.a(3650, 4830071404356318432L);
            if (var5_5) break block12;
lbl8:
            // 2 sources

            while (true) {
                v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)997410522866036036L), (Object)var4_2, (long)717569244418368117L);
                while (true) {
                    block15: {
                        block14: {
                            block13: {
                                var6_7 = (List)v0;
                                if (!var5_5) break block13;
                                if (var6_7 == null) break block14;
                                var7_6 /* !! */  = (_n.a(7567, 480563772050614197L) - _n.a(2164, 8605917509712753356L)) * _n.a(9940, 1277476480061611166L) - _n.a(24025, 5303766786268030890L);
                            }
                            if (var5_5) break block15;
                        }
                        var7_6 /* !! */  = (int)(hi.a("G", (int)(_n.a(19607, 4108462224450647583L) - _n.a(14338, 202038711736238647L)), (int)_n.a(4863, 4966593204852172975L), (long)834203424483934088L) + _n.a(16904, 7009664784552818714L) - _n.a(174, 5118279461887195829L) - _n.a(5309, 3036776032232484514L));
                    }
                    switch (var7_6 /* !! */ ) {
                        default: {
                            return null;
                        }
                        case -1626521864: {
                            v1 = new Object[4];
                            v1[3] = var3_4;
                            v1[2] = var2_3;
                            v1[1] = var6_7;
                            v1[0] = var4_2;
                            return hi.a("\u00a5", (Object)this, (Object)v1, (long)989238865933023165L);
                        }
                        case -1626521865: 
                    }
                    hi.a("G", (long)782721573726732509L);
                    return null;
                }
                break;
            }
        }
        while (true) {
            switch (var7_6 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1174189651: 
            }
            hi.a("G", (float)-0.5f, (long)670532585860963011L);
            v0 = hi.a("G", (long)402106174180480612L);
            if (!var5_5) ** continue;
            var7_6 /* !! */  = _n.a(4533, 6745646274187635612L) + _n.a(10536, 3374641547726983980L) - _n.a(1197, 8593764912918216342L) ^ _n.a(4952, 6752589828860370L);
        }
    }

    private void lambda$extrapolateMap$0(Map map, ym ym2, ym ym3, AbstractClientPlayer abstractClientPlayer, List list) {
        boolean bl = Dl.t();
        Object object = list;
        if (!bl) {
            if (object == null) {
                return;
            }
            Object[] objectArray = new Object[4];
            objectArray[3] = (int)hi.a("\u00a5", (Object)((Integer)((Object)_n.f("JvWAowSVYVvvQDZi", f(T ), (ym)ym3, (Object)abstractClientPlayer))), (long)1260538186742955956L);
            objectArray[2] = (int)hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)ym2, (Object)abstractClientPlayer, (long)696058710735302213L))), (long)1260538186742955956L);
            objectArray[1] = list;
            objectArray[0] = abstractClientPlayer;
            object = hi.a("\u00a5", (Object)map, (Object)abstractClientPlayer, (Object)hi.a("\u00a5", (Object)this, (Object)objectArray, (long)989238865933023165L), (long)1121879748672195632L);
        }
    }

    private boolean F(Object object, Object object2) {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)((Player)object), (Object)((AABB)object2), (long)1033567344631114010L), (long)414337658232293583L), (long)984088978567310565L);
    }

    public void N(Object[] objectArray) {
        Map map = (Map)objectArray[0];
        ym ym2 = (ym)objectArray[1];
        ym ym3 = (ym)objectArray[2];
        hi.a("\u00a5", (Object)map, (long)1321656001466046640L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)997410522866036036L), (arg_0, arg_1) -> this.lambda$extrapolateMap$0(map, ym2, ym3, arg_0, arg_1), (long)789503095451415081L);
    }

    /*
     * Exception decompiling
     */
    @yE(P=200)
    private void N(__ var1_1) {
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
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8026812406119638758L;
                var6_1 = new long[264];
                var3_2 = 0;
                var4_3 = "q\u00a3\u0084\u008d\u00b5\u00c1\u008d\u00a0\u00d7\u0003\u00ee*\u0091\u00c3v\u00af\u00abkM|\u00c5\u0080\u00f8>V\u00f1\u00b3\u0092OS\u00e4\u00c7TpN\u00c3UZ\u0016mV\u00e8\u0090\u0080)\u001ej:\u00e4>\u00f5\u009f\u00c8\u00d8\u00f7\u009f\u00e0J\b\u0005\u00e0\u00aamM\u0097\u0007\u00e7>\u00b1\u00ab\u001b\u00ef\u00de\u00a9$\u0090\u0007g+\u0007\u0019j\u00ad\u001f k2\b9\u00c4a\u00f5\u0016\u00edt\u0096\u00d94\u0005\u00f1\u00d7\u00b3\u0092\u00de\u001b\u00a0\n\u008b\r\u00c5[z\b\u00ea\u0014\u0085y\u001e\u008d\u00ff\u00baGu\u00a4\u00e9\u00e6\u00f8\u00eb\u0092\u00fc}\u00eaSRq\u00aa\u00e1i\u00d5\u00ccp\u00af\u0006\u00c9_\u008a\u00af]\u00c0?\u0088\u0000\u00bf`\u0095d\u00d0\u00fc\u0091\n\u00c2\u00af\u00ac\u0005n0n\u00bf\tM\u00ce\u00e3\u00a5\u00af\u00f9\u00aeq\u00eb_\u00a9\u00d6w@\r\u001bT\u00fcr\u00f0}Yz\u00a3 \u0004\u0010\u00d1\u00fb\u00f5F7D\u00c7v\u00d0\u0085S\u000f[NZT\u00c0/\u00f6\u0098\u0082,\u0088+:l\u0085B\u00ea\u00fa\b\u00db\u00d5\u00814\u00d7\u00d3\u00af\u00ca\u00bcd~L\u00d3\u0018\u00f6r\u00a6\u0017\u00fc[\u00f7\u009d\u00fd\u001d\u00be\u001aQ\u00c6\u00f5\u00c3\u001d\u00cb\u001e\u00d3\u00e2U.\u009fO'pq\u0082%\u00ef\u0006\u0091\u0011\u00aa\u009ba\u00e1\u00b6l\u00afc\u00b2\u00c5\u001f\u00a2\u00fce\u0087+\u009e\u00b3ll\u00c8\u0010Q.\b\u001c\u00b6\u00da|=\u009e\u001f'Z\u001f\u000b;\u00f6\u0082\u0099\u00cf^\u00c9\u009dD\u00f6\nu\u001e\u00bab\u00bd\u00b6\u0081\u00be(Y\u0096\\\u00a4W\u00b7KW\u00d5\u00d0u'\u00de\u00962+\u00e3\u001da\u00f7QN\b\u00ee\u009d\u0087\u00e4\u000bjv\u00e3\u00d5&\u00b3\u00eb;T\u009f\u00d1-\u00ef\u00f1S\u00cf\u008f\t\u00e8\u0091h5\u00b4\u0084\u00a4\u00c6\u009e\u00d9Csx\u000bO\u00cd\u00ec\u00bf\u00c3\u00b4\u00a1\u00cf\u00fe|\u0007rKj+\u0018\u009fr\u0084.\u00d0\u00ee\u00f2eG\u00cfN\u00b3\u00aaf\u00ab\u00a3\u00ff\u00f7\u0088\u0090\u0083\u0003A\u00f2Y\u00baA\u008d\u0012&\u0013\u00ad\u0017lX\u00928\u00cd\r\u0094\u00f3\u00b4#\u0006%9QW+7Skh\u00ce2+\u00be\"\u00c6\u009e\u00c3A\u00b2\u0088V\u00e4N\u00fce#B\u008d\u00ce\u0096I1 h\u008e\u00c0\u000b\u00dbK\u009e\u009f\u00e7>&1\u00c7\u0010\u0010\u00f5#\u00a5\u0094JJY\u00bc\u000fV2\u0005\u00da\u00f5\u00a8\u00c1\u00a2\u0005\u000bG\u0014\u008c{\u008e\u0082l\u008b\u00b3\u00c8\u00ef\u00e7\u0093\u00e9Y\u00f5\u008b\u00c0s4\u008f\u00ac2\u0082\\*\u00c1\u00fb\u00e8\u008b\u0015\u00a1_7w\u0080-\u0019\u00d0\u00dc\u0014\u00cc\u00fb\u008d\u0088o\u00aa\u00fe\u00ba\u0088\u00e9\u0097M=\u00f1SS\u00ee\u00c6\u00a3S\u00dd|V\u00d4\u0004\u0007,\u0015\u00cdn\u0016\u00c5J\u00f6\u00fd\u00d2^~G\u00a1\u0006\u00da\u00de\u0015}\u00a6\u00a5Bo\u0086b\u00f3\u00e6$\u0012\u0002\u00ff\u00d6X=\u00fc2\u00f4&;\u00a2\u00f8(\u00b5!Z\u0087\u00c5\u00d8;7S\u001c\u0014\u0010\u0096\\\u00a4\u00d6Hc?~\u00d2A\u00f4\u00b8\u00c0\u001ad\u00cb\u001f\u001e*t\u00ea\u00cb*I\u00abP\u00a8f\u0084\u00bb,\u00f1/m}\u0098\u00f0\u0012oy\u0006\u00a6\u00dd\u00fe\u00b2b\u00ba\u00cd\u00b1\u00ad\u00a6T\u0012yb\u000e\u00fe\u00f5\t\\\u0089(\u00ff\u000b\u00a9T\u00c7\f\u0000\u00c7\u00d5&\u008a0\u00d2\u0002\f\u0002\n\u00a1g\u00bbC9\u00ee9\u00c7seE\u0089^\u009b\u00101\u00ca\u00b0\u00e9\u00b9\u00f6\u0095\u00e6\u009c\u008e\u00ea+\u00b3\u00ae\u00bc\u00e6\u0094\u00aa\u00cb\u009c\u00c6\u00fe\u00fb\u00b0\u00d5\u0001\u00f5\u00f6,}\u00e6{t\u00d1\u0019jP\u00d0\u001b}\u00d4h>8%\u0001\u00af\u009fS\u0016JH@R\u000e\u00c2\u00a9\u0012\u0085\u00f7rP\nl\u0001H\u00d5\u0015\u00aaUkb\u009a\rC=\u00fa\u00b1#Z2\u0087\u008fP\u00c8d6\u0086\u008d\u00f5<G\u0017&+p\u00a6`w\u001c`\u00df\u00ba\u0097k\u00a8\u0083\u00ab\u008a8F\u00ab\u00ad\u00b4}\u00fbe\u0096\u001e\u0081L\u0015\u00d38\u0005k`AG\u00d1.Qh\u00fe\u00caH7\u00ba<o\u00ac\u00d9\n\u00b8\u00ee0\u0089\"\u00a8\u0087\u00bc\u00a4Wt\u008b\u0018\u000e\u00d0D\u0012P\u00f7Z\u00dbY\u00c6\u00e5d\u0094.\u00e4^fd\u00ba\u00e8\u00880\u00db)\u00b0\u00b2jc\u00df\u0090\u00ee\u008c\u00eeT>\u00dc\u0099\u0091gn\b\u00b9\u00d6\fB\\J*{\u0097\u00ccZ;\u0002\u00ed$\b\f_V:Wz\u00e2\u008e\u0083.(+\u00b5&!\u0005}\u008e-\u00d0]\u008e\u0011;3\u00c4\u00cb*0*Kit\u00d0Q\f\u0095Ab\u00ee\u00f8\u000f\u00ae^6\u00a6an\u0093\u009c\u00e8mU\u00ad6\u00a1\u009e\u007f\u0083\u0017N\u008e\u00a0\u00d0\u000f\u0083\u0098\u000fV\u0095\b\u00f7\u0091\u00ba\u00f0&\u0086\u00aa\u0018lM\u0004\u00f42`\u008d\u001a\u00ef\u0019\u00eaK\u00ec\u0013\u00ff\n)y\u0088\u001fR\u009f\u0007\u00f3\u0083c\u00b2\u00edVD\u00a6\u00db\u0016\\P@\u00ef\u00eb?\u001e\u001e\u00e2\u00d4mN\u00b9\u00a1\u001et\u0084S\u00ed\b\u00a2l\u0082\u0083m\u00f4\u00b4\u009f\u00bb\u009fZ\u00ce\u000eD\u00ce\u008ckH]1d4g\u0015L\u00c8\fMK/U\u00d6\u00f7\u00f66F{\r\u00f5\u00ca\u00a8\u00f9?\u00b5_\u00f9\u0016hQI\u00da\u00de\u00f7\u00efH2B\u0094\u00e0i\u00d0\u00b3\u0000]O\"\u00c0\u008f2\u009e9\u00daR\u00c4\u00b0\u00c9!P[\u00c0\u008a\u0088?\u001dN\u00ed-y3\u00edP\u00e9<oE\u000fd@\u00da9g`\u0018#\u00de\u00ec\u00cd \u00e2\u00fb\b 1Q\u00c4\u00d0:)\u00b9\u00cd\u00cfN\u0014\u00c4\u0099\u00a0\u009b\u009bw\u0094\u0014\u00de\u00ad\u0010w\"\u00f6\u0001;Q\u0018\u0012Q\u00a5HP\u00edMGfl\u009d\u001b\u008fc\u00a4\u00ees\u00a3\u00cb&\u00b7T\u001fW\u0001dK\u00cac\u00b1\u008fm\u00f6\u00b8\u0007\u00ab2Rm{\u00f4\u0003\u0012!@\u000eJ\u00d1\u00a1L\u00bd\u00a9\u00bc\u0006\u001bRN\u008a=\u00c5'I\u008d\u00fa8\u00d3\u00bf\u00ec|\u0093\u0014\u00e8)>\u0010\u009a\u00c2\u00ec-\u00bf\u00a5\u009cSw\u00f6\u0082$\u00ba\u00c9w\u00ed\u0099b\u00caG\u0004\u00e33X\u009e\u009c\u00dbh\u0081\u00e7/\u00fdv\u008f*\u00dd}\u0096\u001eg\t/\u0016\u00fe\u00bd$\u00e0[\u00f0_\fXF\u00adP^\u00f562\u007fp\u00f0\u0093\u00a7\u0087\u00f3\u00d2\u0086x^qi\u00bb\u00d6\u00a4\u00bc\u0090\u009fK\u00ad\u0087\u00b3\"\u00a6/\u00949\\[\u00ac8\\\u00caC\u00a1\u00b1n\u00ba\u00bf\u0004\u00d6\u00d2\u00f1N\u00c5u\u00daZ\u00e4[>5\"\u00cbc@2\u009d\u0087\u00dc\u00f4e\u00f5\u00be\u00e6\u00a9m:\u000e5\u00bbw>\u00be\u00f7)kj\u00ca5\u0088\u00b7\u00c7\u00eb\u0017]\u00f3B`\u0091\u0084\u0083\u0092\u00f0(\u00aeL\u00beu\u00f5c\u00c4\u0099\u00c4\u0083\u00f1\u00967\u00da\u0088K;\u00f5\u00ce\u0091yy,\u0001\u00f3\u00aeR\u00e9\u00fdsP?_%K~\u00b6K\u00bf\u00d0u)\u008f\u0001\u008a\u00a7md\u0099\u0014%Cv\u008fi\u00a5!?\u00d9\u00d0\\\u00a8\u000e>A\u00e0\u0012\u00f5f/%T/B\"\u00b0e\u00a1\u00d5\u00d3,\u0089{\u00fe\u00ee\u00a2\u0083S\u00cb\u00baC\u00ea\u00dc\u0081\u00eb\u00e5\u0097nD\u0099rs\u00c4g\u00d7L\u0006\u0001\u00ad9\u008d\u009f\u0014\u00de\u001d\u00a2\u0016\u001f\u0004\u00b7\u00ab\u001fr\u0013\u0014\u00b263\u00c6\u009d:C\u009c\u00ff#\u000f\u0083\r\u00c9T\u00d7CM\u00e3;He\u00e1\u00ae\u009a\u00c4\u00b6\u009d\u00d7\u00c1\u000f\u00ad[\u00ae6ymp\u0084\u00e2\u00d9%\u0098\u00ecG\u00cc\u00cc\u00c0\u0013\u00ccF\u0011\u00dc\u00efdy\u007f\u00dd\u00fa\u00e1\u009d\u00ef\u0096\u00f5.\u00ff\u00f9\u00abk\u00da\u0007\u00f7\u00c2\u0018\u00f3\u0012\u0095\u00cb\u00b8\u008eU\u00efI\u007fh\u00e1\u00ed\u00e9\u008b/\u009f\u00ae]\u00b33\u00a9\u00d0\u00e8g\u0012\u0015\u00a6\u00c5\u0099O\u00bd\u008a\u008e\t\u00ff`\u00e5*\u00b4\u009f\rR\u0012\u00df\u0013^b\u00c0 @\u008b\"\u00c7f\u00e1[[\u00d24c\u00f8h\u00d3].\u0095)T\u00d2\u00e66fwg7m\ro\u00dda\u00c7\u0011w\u001c\u001cn\u00b2\u00a21\u00d0\u00efb\u00fdJOLf\n\u001d\u0080z\u009f\u008c+\u00f7\u00d1\u009e\u00dd\u00be*\u0088 W\u00dd\u0006\u00011\u0086GxK\u00c0\u00f9\u00b9\u00e6\u0000\u000fr\u000f\u000f\u001d\u0095\u00dc&\u00db\u008a\ri\u00ee\u009d\u00d1P\u00ad\u0002S\u0007m\u009c\u00e9\u000eD\"\t\u00f1\u0092\u008b\u001c\u00c9\u0015\u00d2\u001d*38e%\u00cb\u00d2\u00e7D\u00ee5\u00fe\u0083\u0093~%\u00a4\u0092F'T\f\u00e0\u00f8\u00c9R\u0016\u0090\u00c5\u00ad\u00d3\u001e(R`4\u0088\u00d0\u0006a\u00f2H\u00ba\u00c0\u00fa\u00a9\u00ad;>\u00b7\u0086ua\u00ce\u00cbM\u00d1P\u0089\u009d\u00bb\u00b6yn\u00f0\u0099\u00c4;\u00e2\u00fd\u00a6\u00007\u0015\u000f\u00f4\u00e7\u009c\u001d\u00d6R\u00b7\u0018\u0017\u00a8w\u001e\u000e?\u001aw\u00d2\u001c\u00f9\u00d7\u00dc\u00c2\u00850\u0097\u00cd \u00bc\u001a\u009f\u008c\u00b9\u00135\u00ca\u00c920\u0092\u00b13_\u008b\u000fEj\u00c1\u00a015\n\u00114\u00c9\u00dc\u00e9\u00a5\u00ef\u001d\u0085\u0011\u00e2\u0006\u0099\n\u00f9\u00fdN\u001dX\u00c9\u009f\u00bb\u00d8t\u00cb\u00a8\u00ae\u00a6\u001c\u00b7\u00b7\u00ae\u00f4.\u00dd\u00e7\u008e\u00f1\u00b7\u00db\u001a\u00c6\u00d7\u00f6\u0087\u0000R\u001a\u001d\u009e0\u00078\u0001t\u00e50l\u00bc;wK\u00ab\u00e7\u00d1\u008a6\u009e\u00f7-\"\u009ce$\u00b2\u008a\fOP\u00e3\u008a\u0014\u00bap\u0015wZB\u0084\u00ec\u00ef-\u0000p\u0011\u0017G\u0094i\u00ce\u008b\u001e\u00e1rk\u00eb\u00cdtu\u00f7\u00d33;\u0083tDL\u00afR>\u00cc\u00f3=\u00c0O4\u009a\u00a04\u0087\u00d0\"0\u00a6\u00ca0\u00ca=\u00a1cT\u0011\u0098\u00c4\u00ee\u0007\u00dau\u00d7\u009e\u00fdJ\u00d3U\u00e5\u00f5!\u00c0\u009f?";
                var5_4 = "q\u00a3\u0084\u008d\u00b5\u00c1\u008d\u00a0\u00d7\u0003\u00ee*\u0091\u00c3v\u00af\u00abkM|\u00c5\u0080\u00f8>V\u00f1\u00b3\u0092OS\u00e4\u00c7TpN\u00c3UZ\u0016mV\u00e8\u0090\u0080)\u001ej:\u00e4>\u00f5\u009f\u00c8\u00d8\u00f7\u009f\u00e0J\b\u0005\u00e0\u00aamM\u0097\u0007\u00e7>\u00b1\u00ab\u001b\u00ef\u00de\u00a9$\u0090\u0007g+\u0007\u0019j\u00ad\u001f k2\b9\u00c4a\u00f5\u0016\u00edt\u0096\u00d94\u0005\u00f1\u00d7\u00b3\u0092\u00de\u001b\u00a0\n\u008b\r\u00c5[z\b\u00ea\u0014\u0085y\u001e\u008d\u00ff\u00baGu\u00a4\u00e9\u00e6\u00f8\u00eb\u0092\u00fc}\u00eaSRq\u00aa\u00e1i\u00d5\u00ccp\u00af\u0006\u00c9_\u008a\u00af]\u00c0?\u0088\u0000\u00bf`\u0095d\u00d0\u00fc\u0091\n\u00c2\u00af\u00ac\u0005n0n\u00bf\tM\u00ce\u00e3\u00a5\u00af\u00f9\u00aeq\u00eb_\u00a9\u00d6w@\r\u001bT\u00fcr\u00f0}Yz\u00a3 \u0004\u0010\u00d1\u00fb\u00f5F7D\u00c7v\u00d0\u0085S\u000f[NZT\u00c0/\u00f6\u0098\u0082,\u0088+:l\u0085B\u00ea\u00fa\b\u00db\u00d5\u00814\u00d7\u00d3\u00af\u00ca\u00bcd~L\u00d3\u0018\u00f6r\u00a6\u0017\u00fc[\u00f7\u009d\u00fd\u001d\u00be\u001aQ\u00c6\u00f5\u00c3\u001d\u00cb\u001e\u00d3\u00e2U.\u009fO'pq\u0082%\u00ef\u0006\u0091\u0011\u00aa\u009ba\u00e1\u00b6l\u00afc\u00b2\u00c5\u001f\u00a2\u00fce\u0087+\u009e\u00b3ll\u00c8\u0010Q.\b\u001c\u00b6\u00da|=\u009e\u001f'Z\u001f\u000b;\u00f6\u0082\u0099\u00cf^\u00c9\u009dD\u00f6\nu\u001e\u00bab\u00bd\u00b6\u0081\u00be(Y\u0096\\\u00a4W\u00b7KW\u00d5\u00d0u'\u00de\u00962+\u00e3\u001da\u00f7QN\b\u00ee\u009d\u0087\u00e4\u000bjv\u00e3\u00d5&\u00b3\u00eb;T\u009f\u00d1-\u00ef\u00f1S\u00cf\u008f\t\u00e8\u0091h5\u00b4\u0084\u00a4\u00c6\u009e\u00d9Csx\u000bO\u00cd\u00ec\u00bf\u00c3\u00b4\u00a1\u00cf\u00fe|\u0007rKj+\u0018\u009fr\u0084.\u00d0\u00ee\u00f2eG\u00cfN\u00b3\u00aaf\u00ab\u00a3\u00ff\u00f7\u0088\u0090\u0083\u0003A\u00f2Y\u00baA\u008d\u0012&\u0013\u00ad\u0017lX\u00928\u00cd\r\u0094\u00f3\u00b4#\u0006%9QW+7Skh\u00ce2+\u00be\"\u00c6\u009e\u00c3A\u00b2\u0088V\u00e4N\u00fce#B\u008d\u00ce\u0096I1 h\u008e\u00c0\u000b\u00dbK\u009e\u009f\u00e7>&1\u00c7\u0010\u0010\u00f5#\u00a5\u0094JJY\u00bc\u000fV2\u0005\u00da\u00f5\u00a8\u00c1\u00a2\u0005\u000bG\u0014\u008c{\u008e\u0082l\u008b\u00b3\u00c8\u00ef\u00e7\u0093\u00e9Y\u00f5\u008b\u00c0s4\u008f\u00ac2\u0082\\*\u00c1\u00fb\u00e8\u008b\u0015\u00a1_7w\u0080-\u0019\u00d0\u00dc\u0014\u00cc\u00fb\u008d\u0088o\u00aa\u00fe\u00ba\u0088\u00e9\u0097M=\u00f1SS\u00ee\u00c6\u00a3S\u00dd|V\u00d4\u0004\u0007,\u0015\u00cdn\u0016\u00c5J\u00f6\u00fd\u00d2^~G\u00a1\u0006\u00da\u00de\u0015}\u00a6\u00a5Bo\u0086b\u00f3\u00e6$\u0012\u0002\u00ff\u00d6X=\u00fc2\u00f4&;\u00a2\u00f8(\u00b5!Z\u0087\u00c5\u00d8;7S\u001c\u0014\u0010\u0096\\\u00a4\u00d6Hc?~\u00d2A\u00f4\u00b8\u00c0\u001ad\u00cb\u001f\u001e*t\u00ea\u00cb*I\u00abP\u00a8f\u0084\u00bb,\u00f1/m}\u0098\u00f0\u0012oy\u0006\u00a6\u00dd\u00fe\u00b2b\u00ba\u00cd\u00b1\u00ad\u00a6T\u0012yb\u000e\u00fe\u00f5\t\\\u0089(\u00ff\u000b\u00a9T\u00c7\f\u0000\u00c7\u00d5&\u008a0\u00d2\u0002\f\u0002\n\u00a1g\u00bbC9\u00ee9\u00c7seE\u0089^\u009b\u00101\u00ca\u00b0\u00e9\u00b9\u00f6\u0095\u00e6\u009c\u008e\u00ea+\u00b3\u00ae\u00bc\u00e6\u0094\u00aa\u00cb\u009c\u00c6\u00fe\u00fb\u00b0\u00d5\u0001\u00f5\u00f6,}\u00e6{t\u00d1\u0019jP\u00d0\u001b}\u00d4h>8%\u0001\u00af\u009fS\u0016JH@R\u000e\u00c2\u00a9\u0012\u0085\u00f7rP\nl\u0001H\u00d5\u0015\u00aaUkb\u009a\rC=\u00fa\u00b1#Z2\u0087\u008fP\u00c8d6\u0086\u008d\u00f5<G\u0017&+p\u00a6`w\u001c`\u00df\u00ba\u0097k\u00a8\u0083\u00ab\u008a8F\u00ab\u00ad\u00b4}\u00fbe\u0096\u001e\u0081L\u0015\u00d38\u0005k`AG\u00d1.Qh\u00fe\u00caH7\u00ba<o\u00ac\u00d9\n\u00b8\u00ee0\u0089\"\u00a8\u0087\u00bc\u00a4Wt\u008b\u0018\u000e\u00d0D\u0012P\u00f7Z\u00dbY\u00c6\u00e5d\u0094.\u00e4^fd\u00ba\u00e8\u00880\u00db)\u00b0\u00b2jc\u00df\u0090\u00ee\u008c\u00eeT>\u00dc\u0099\u0091gn\b\u00b9\u00d6\fB\\J*{\u0097\u00ccZ;\u0002\u00ed$\b\f_V:Wz\u00e2\u008e\u0083.(+\u00b5&!\u0005}\u008e-\u00d0]\u008e\u0011;3\u00c4\u00cb*0*Kit\u00d0Q\f\u0095Ab\u00ee\u00f8\u000f\u00ae^6\u00a6an\u0093\u009c\u00e8mU\u00ad6\u00a1\u009e\u007f\u0083\u0017N\u008e\u00a0\u00d0\u000f\u0083\u0098\u000fV\u0095\b\u00f7\u0091\u00ba\u00f0&\u0086\u00aa\u0018lM\u0004\u00f42`\u008d\u001a\u00ef\u0019\u00eaK\u00ec\u0013\u00ff\n)y\u0088\u001fR\u009f\u0007\u00f3\u0083c\u00b2\u00edVD\u00a6\u00db\u0016\\P@\u00ef\u00eb?\u001e\u001e\u00e2\u00d4mN\u00b9\u00a1\u001et\u0084S\u00ed\b\u00a2l\u0082\u0083m\u00f4\u00b4\u009f\u00bb\u009fZ\u00ce\u000eD\u00ce\u008ckH]1d4g\u0015L\u00c8\fMK/U\u00d6\u00f7\u00f66F{\r\u00f5\u00ca\u00a8\u00f9?\u00b5_\u00f9\u0016hQI\u00da\u00de\u00f7\u00efH2B\u0094\u00e0i\u00d0\u00b3\u0000]O\"\u00c0\u008f2\u009e9\u00daR\u00c4\u00b0\u00c9!P[\u00c0\u008a\u0088?\u001dN\u00ed-y3\u00edP\u00e9<oE\u000fd@\u00da9g`\u0018#\u00de\u00ec\u00cd \u00e2\u00fb\b 1Q\u00c4\u00d0:)\u00b9\u00cd\u00cfN\u0014\u00c4\u0099\u00a0\u009b\u009bw\u0094\u0014\u00de\u00ad\u0010w\"\u00f6\u0001;Q\u0018\u0012Q\u00a5HP\u00edMGfl\u009d\u001b\u008fc\u00a4\u00ees\u00a3\u00cb&\u00b7T\u001fW\u0001dK\u00cac\u00b1\u008fm\u00f6\u00b8\u0007\u00ab2Rm{\u00f4\u0003\u0012!@\u000eJ\u00d1\u00a1L\u00bd\u00a9\u00bc\u0006\u001bRN\u008a=\u00c5'I\u008d\u00fa8\u00d3\u00bf\u00ec|\u0093\u0014\u00e8)>\u0010\u009a\u00c2\u00ec-\u00bf\u00a5\u009cSw\u00f6\u0082$\u00ba\u00c9w\u00ed\u0099b\u00caG\u0004\u00e33X\u009e\u009c\u00dbh\u0081\u00e7/\u00fdv\u008f*\u00dd}\u0096\u001eg\t/\u0016\u00fe\u00bd$\u00e0[\u00f0_\fXF\u00adP^\u00f562\u007fp\u00f0\u0093\u00a7\u0087\u00f3\u00d2\u0086x^qi\u00bb\u00d6\u00a4\u00bc\u0090\u009fK\u00ad\u0087\u00b3\"\u00a6/\u00949\\[\u00ac8\\\u00caC\u00a1\u00b1n\u00ba\u00bf\u0004\u00d6\u00d2\u00f1N\u00c5u\u00daZ\u00e4[>5\"\u00cbc@2\u009d\u0087\u00dc\u00f4e\u00f5\u00be\u00e6\u00a9m:\u000e5\u00bbw>\u00be\u00f7)kj\u00ca5\u0088\u00b7\u00c7\u00eb\u0017]\u00f3B`\u0091\u0084\u0083\u0092\u00f0(\u00aeL\u00beu\u00f5c\u00c4\u0099\u00c4\u0083\u00f1\u00967\u00da\u0088K;\u00f5\u00ce\u0091yy,\u0001\u00f3\u00aeR\u00e9\u00fdsP?_%K~\u00b6K\u00bf\u00d0u)\u008f\u0001\u008a\u00a7md\u0099\u0014%Cv\u008fi\u00a5!?\u00d9\u00d0\\\u00a8\u000e>A\u00e0\u0012\u00f5f/%T/B\"\u00b0e\u00a1\u00d5\u00d3,\u0089{\u00fe\u00ee\u00a2\u0083S\u00cb\u00baC\u00ea\u00dc\u0081\u00eb\u00e5\u0097nD\u0099rs\u00c4g\u00d7L\u0006\u0001\u00ad9\u008d\u009f\u0014\u00de\u001d\u00a2\u0016\u001f\u0004\u00b7\u00ab\u001fr\u0013\u0014\u00b263\u00c6\u009d:C\u009c\u00ff#\u000f\u0083\r\u00c9T\u00d7CM\u00e3;He\u00e1\u00ae\u009a\u00c4\u00b6\u009d\u00d7\u00c1\u000f\u00ad[\u00ae6ymp\u0084\u00e2\u00d9%\u0098\u00ecG\u00cc\u00cc\u00c0\u0013\u00ccF\u0011\u00dc\u00efdy\u007f\u00dd\u00fa\u00e1\u009d\u00ef\u0096\u00f5.\u00ff\u00f9\u00abk\u00da\u0007\u00f7\u00c2\u0018\u00f3\u0012\u0095\u00cb\u00b8\u008eU\u00efI\u007fh\u00e1\u00ed\u00e9\u008b/\u009f\u00ae]\u00b33\u00a9\u00d0\u00e8g\u0012\u0015\u00a6\u00c5\u0099O\u00bd\u008a\u008e\t\u00ff`\u00e5*\u00b4\u009f\rR\u0012\u00df\u0013^b\u00c0 @\u008b\"\u00c7f\u00e1[[\u00d24c\u00f8h\u00d3].\u0095)T\u00d2\u00e66fwg7m\ro\u00dda\u00c7\u0011w\u001c\u001cn\u00b2\u00a21\u00d0\u00efb\u00fdJOLf\n\u001d\u0080z\u009f\u008c+\u00f7\u00d1\u009e\u00dd\u00be*\u0088 W\u00dd\u0006\u00011\u0086GxK\u00c0\u00f9\u00b9\u00e6\u0000\u000fr\u000f\u000f\u001d\u0095\u00dc&\u00db\u008a\ri\u00ee\u009d\u00d1P\u00ad\u0002S\u0007m\u009c\u00e9\u000eD\"\t\u00f1\u0092\u008b\u001c\u00c9\u0015\u00d2\u001d*38e%\u00cb\u00d2\u00e7D\u00ee5\u00fe\u0083\u0093~%\u00a4\u0092F'T\f\u00e0\u00f8\u00c9R\u0016\u0090\u00c5\u00ad\u00d3\u001e(R`4\u0088\u00d0\u0006a\u00f2H\u00ba\u00c0\u00fa\u00a9\u00ad;>\u00b7\u0086ua\u00ce\u00cbM\u00d1P\u0089\u009d\u00bb\u00b6yn\u00f0\u0099\u00c4;\u00e2\u00fd\u00a6\u00007\u0015\u000f\u00f4\u00e7\u009c\u001d\u00d6R\u00b7\u0018\u0017\u00a8w\u001e\u000e?\u001aw\u00d2\u001c\u00f9\u00d7\u00dc\u00c2\u00850\u0097\u00cd \u00bc\u001a\u009f\u008c\u00b9\u00135\u00ca\u00c920\u0092\u00b13_\u008b\u000fEj\u00c1\u00a015\n\u00114\u00c9\u00dc\u00e9\u00a5\u00ef\u001d\u0085\u0011\u00e2\u0006\u0099\n\u00f9\u00fdN\u001dX\u00c9\u009f\u00bb\u00d8t\u00cb\u00a8\u00ae\u00a6\u001c\u00b7\u00b7\u00ae\u00f4.\u00dd\u00e7\u008e\u00f1\u00b7\u00db\u001a\u00c6\u00d7\u00f6\u0087\u0000R\u001a\u001d\u009e0\u00078\u0001t\u00e50l\u00bc;wK\u00ab\u00e7\u00d1\u008a6\u009e\u00f7-\"\u009ce$\u00b2\u008a\fOP\u00e3\u008a\u0014\u00bap\u0015wZB\u0084\u00ec\u00ef-\u0000p\u0011\u0017G\u0094i\u00ce\u008b\u001e\u00e1rk\u00eb\u00cdtu\u00f7\u00d33;\u0083tDL\u00afR>\u00cc\u00f3=\u00c0O4\u009a\u00a04\u0087\u00d0\"0\u00a6\u00ca0\u00ca=\u00a1cT\u0011\u0098\u00c4\u00ee\u0007\u00dau\u00d7\u009e\u00fdJ\u00d3U\u00e5\u00f5!\u00c0\u009f?".length();
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
                    var4_3 = "\u00e2\u00af\u00a5;\u0089\u00e5\u00b4\u0088\u00b6O\u00ee0&*\u00d2?";
                    var5_4 = "\u00e2\u00af\u00a5;\u0089\u00e5\u00b4\u0088\u00b6O\u00ee0&*\u00d2?".length();
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
        _n.a = var6_1;
        _n.b = new Integer[264];
        _n.I = new _n();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Vec3 T(Object[] var1_1) {
        var3_2 = var1_1[0];
        var2_3 = (Integer)var1_1[1];
        var4_4 = Dl.t();
        var8_5 /* !! */  = (_n.a(23564, 8082434350840473140L) + _n.a(20587, 1792555264020769460L)) * _n.a(32622, 145690559965349195L) / 3 + _n.a(11290, 3149852580298724937L) + _n.a(2013, 2470958417172938058L);
        if (var4_4) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_6 /* !! */  = new Vec3(0.0, (double)((hi.a("\u00e9", (Object)((Vec3)hi.a("\u00a5", (Object)((List)var3_2), (long)1306698130352332317L)), (long)1294071886475894755L) - 0.08) * 0.98), 0.0);
                var6_7 = hi.a("G", (int)hi.a("\u00a5", (Object)((List)var3_2), (long)417939159730395915L), (int)var2_3, (long)476721548361853495L);
                var7_8 = 0;
                if (var4_4) {
                    break;
                }
                ** GOTO lbl44
            }
            case -1189116663: {
                hi.a("G", (long)489615632222951107L);
                hi.a("G", (float)0.0f, (float)-3.0f, (long)730361849522875513L);
                return null;
            }
        }
lbl20:
        // 2 sources

        while (true) {
            v0 /* !! */  = var7_8;
            v1 /* !! */  = var6_7;
            if (var4_4) ** GOTO lbl48
            if (v0 /* !! */  >= v1 /* !! */ ) ** GOTO lbl46
            if (true) ** GOTO lbl50
            break;
        }
        block9: while (true) {
            switch (var8_5 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1076556642: {
                    var5_6 /* !! */  = hi.a("\u00a5", (Object)var5_6 /* !! */ , (double)hi.a("\u00e9", (Object)((Vec3)hi.a("\u00a5", (Object)((List)var3_2), (int)var7_8, (long)516183098926246296L)), (long)1300412705618690751L), (double)0.0, (double)hi.a("\u00e9", (Object)((Vec3)hi.a("\u00a5", (Object)((List)var3_2), (int)var7_8, (long)516183098926246296L)), (long)1282612456329596420L), (long)1050989166521321638L);
                    ++var7_8;
                    if (var4_4) {
                        return hi.a("\u00a5", (Object)var5_6 /* !! */ , (double)(1.0f / (float)var6_7), (double)1.0, (double)(1.0f / (float)var6_7), (long)1322859952980661780L);
                    }
                    ** GOTO lbl52
                }
                case 1076556644: {
                    hi.a("G", (long)659151967568421102L);
                    hi.a("G", (float)2.0f, (long)450110752184348458L);
                    var8_5 /* !! */  = (int)(hi.a("G", (int)(_n.a(26026, 3682060048634896000L) + _n.a(9111, 3578572580534917569L)), (int)_n.a(17782, 726300107206229969L), (long)834203424483934088L) - _n.a(8578, 5426545874122251134L));
                    if (!var4_4) continue block9;
lbl44:
                    // 2 sources

                    var8_5 /* !! */  = hi.a("G", (int)(hi.a("G", (int)_n.a(19993, 4191947361236186282L), (int)_n.a(6693, 1036190426380214495L), (long)834203424483934088L) + _n.a(21545, 6959689403513466461L) ^ _n.a(21164, 7804741918759774352L)), (int)_n.a(27632, 731914608877818121L), (long)834203424483934088L) ^ _n.a(15447, 4541500982051833395L);
                    if (!var4_4) continue block9;
lbl46:
                    // 2 sources

                    v0 /* !! */  = (int)hi.a("G", (int)(_n.a(984, 821497682337970645L) ^ _n.a(26931, 5012706126195872628L)), (int)_n.a(22574, 2580708395235861043L), (long)834203424483934088L);
                    v1 /* !! */  = (CallSite)_n.a(19731, 2326583510628988924L);
lbl48:
                    // 2 sources

                    var8_5 /* !! */  = v0 /* !! */  ^ v1 /* !! */ ;
                    if (!var4_4) continue block9;
lbl50:
                    // 2 sources

                    var8_5 /* !! */  = _n.f("JvWAowSVYVvvQDZi", max(int int ), (int)(_n.a(16036, 1118319029115585640L) * _n.a(27879, 1672639511205402175L) / 2 / _n.a(29400, 5384338852284778586L)), (int)_n.a(10667, 1660577745321202534L)) ^ _n.a(19561, 5336774682338031111L);
                    if (!var4_4) continue block9;
lbl52:
                    // 2 sources

                    var8_5 /* !! */  = _n.f("JvWAowSVYVvvQDZi", max(int int ), (int)(hi.a("G", (int)_n.a(12639, 1939367514685213588L), (int)_n.a(1917, 182702412791692618L), (long)834203424483934088L) + _n.a(1217, 1718212530933284393L) ^ _n.a(25959, 4936226771406118672L)), (int)_n.a(6612, 8354232906684277708L)) ^ _n.a(20406, 3731270075727803661L);
                    continue block9;
                }
                case 1076556645: 
            }
            break;
        }
        return hi.a("\u00a5", (Object)var5_6 /* !! */ , (double)(1.0f / (float)var6_7), (double)1.0, (double)(1.0f / (float)var6_7), (long)1322859952980661780L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A2F;
        if (b[n2] == null) {
            _n.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
