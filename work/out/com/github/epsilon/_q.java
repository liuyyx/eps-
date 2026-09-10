/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.OptionInstance
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.ClipContext
 *  net.minecraft.world.level.ClipContext$Block
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.HitResult
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.uK;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.function.Predicate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _q {
    private static final long[] a;
    private static final Integer[] b;

    private static boolean lambda$getDirection$1(BlockPos blockPos, Direction direction) {
        Object[] objectArray = new Object[2];
        objectArray[1] = direction;
        objectArray[0] = blockPos;
        return (boolean)hi.a("G", (Object)objectArray, (long)977408634875460306L);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static uK b(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        uK uK3 = (uK)objectArray[1];
        double d = (Double)objectArray[2];
        boolean bl = Dl.S();
        reference var22_5 = (hi.a("G", (int)_q.a(23689, 7957807819536066865L), (int)_q.a(2211, 3201629615765011543L), (long)834203424483934088L) - _q.a(31886, 2078557292428282073L)) / _q.a(2922, 5469595133396631042L) + _q.a(7072, 1817750939741597312L);
        boolean bl2 = true;
        block5: while (true) {
            double d2;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        double d3 = d - 0.0;
                        double d4 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                        if (!bl) break block9;
                        if (d4 != false) break block10;
                        d4 = d2 = (double)((hi.a("G", (int)_q.a(25303, 2163648934904682219L), (int)_q.a(24750, 2066756136378225802L), (long)834203424483934088L) + _q.a(32196, 191024230947867070L)) * _q.a(17275, 3842997128926131828L) + _q.a(14420, 3501093325910051969L) ^ _q.a(14031, 6400011166250763132L));
                    }
                    if (bl) break block8;
                }
                d2 = hi.a("G", (int)_q.a(17757, 2566132301284700307L), (int)_q.a(26809, 7804592096887594387L), (long)834203424483934088L) ^ _q.a(6825, 7151113807290478239L);
            }
            switch (d2) {
                default: {
                    continue block5;
                }
                case -974470088: {
                    double d5 = (double)_q.E("tL8iECgf9y2NxjN1", wrapDegrees(float ), (float)(hi.a("\u00a5", (Object)uK3, (long)1049231279723202751L) - hi.a("\u00a5", (Object)uK2, (long)1049231279723202751L)));
                    double d6 = (double)(hi.a("\u00a5", (Object)uK3, (long)1059675231579017960L) - hi.a("\u00a5", (Object)uK2, (long)1059675231579017960L));
                    CallSite callSite = hi.a("G", (double)(d5 * d5 + d6 * d6), (long)1236096628704034685L);
                    CallSite callSite2 = hi.a("G", (double)(d5 / callSite), (long)1220789442640140846L);
                    CallSite callSite3 = hi.a("G", (double)(d6 / callSite), (long)1220789442640140846L);
                    double d7 = d * callSite2;
                    double d8 = d * callSite3;
                    float f = (float)hi.a("G", (double)d5, (double)(-d7), (double)d7, (long)569387319293504539L);
                    float f2 = (float)hi.a("G", (double)d6, (double)(-d8), (double)d8, (long)569387319293504539L);
                    return new uK(f, f2);
                }
                case -974470089: {
                    return new uK(0.0f, 0.0f);
                }
                case -974470090: 
            }
            break;
        }
        hi.a("G", (long)487615547825844238L);
        hi.a("G", (long)1327200575414382593L);
        return null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static uK j(Object[] var0) {
        block11: {
            block12: {
                var1_1 = (Vec3)var0[0];
                var2_2 = ((Boolean)var0[1]).booleanValue();
                var3_3 = Dl.S();
                var13_4 = _q.a(28186, 7817547218832185950L) + _q.a(19843, 3374997207044159524L) + _q.a(5835, 2828971702536381273L);
                if (var3_3) break block12;
lbl7:
                // 2 sources

                while (true) {
                    block14: {
                        block13: {
                            var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L);
                            v0 = var2_2;
                            if (!var3_3) break block13;
                            if (v0 != 0) break block14;
                            v0 = (_q.a(16888, 7098600620044383355L) - _q.a(23775, 5990449893975681233L)) * _q.a(3521, 4481823936118143103L) * _q.a(9203, 8088150134048298904L) / _q.a(15142, 2382776459168026258L) - _q.a(27752, 3404663611575195772L);
                        }
                        var13_4 = v0;
                        if (var3_3) break block11;
                    }
                    var13_4 = _q.a(9834, 5763478274897842743L) / _q.a(24933, 6320878944394040743L) * _q.a(2706, 1200928406186409579L) + _q.a(31199, 2531230720220548217L);
                    if (var3_3) break block11;
                    ** GOTO lbl52
                    break;
                }
            }
            while (true) {
                switch (var13_4) {
                    default: {
                        ** continue;
                    }
                    case -1763045646: 
                }
                hi.a("G", (float)0.0f, (long)1257120842392389918L);
                hi.a("G", (long)357835453833397902L);
                var13_4 = (_q.a(21002, 3370009676489844533L) * _q.a(18061, 6373646666323555078L) / _q.a(12359, 4961371672410686814L) + _q.a(11201, 7223070062111006622L)) * _q.a(18067, 7821517599995327367L) - _q.a(14642, 1410689428326157576L);
            }
        }
        while (true) {
            block15: {
                switch (var13_4) {
                    default: {
                        var4_5 = _q.E("tL8iECgf9y2NxjN1", add(net.minecraft.world.phys.Vec3 ), (Vec3)var4_5, (Vec3)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1288045356464090616L));
                        if (var3_3) break block15;
                        ** GOTO lbl-1000
                    }
                    case -1550602450: lbl-1000:
                    // 2 sources

                    {
                        var5_6 = hi.a("\u00e9", (Object)var1_1, (long)1300412705618690751L) - hi.a("\u00e9", (Object)var4_5, (long)1300412705618690751L);
                        var7_7 = hi.a("\u00e9", (Object)var1_1, (long)1294071886475894755L) - hi.a("\u00e9", (Object)var4_5, (long)1294071886475894755L);
                        var9_8 = hi.a("\u00e9", (Object)var1_1, (long)1282612456329596420L) - hi.a("\u00e9", (Object)var4_5, (long)1282612456329596420L);
                        var11_9 = _q.E("tL8iECgf9y2NxjN1", wrapDegrees(float ), (float)((float)hi.a("G", (double)hi.a("G", (double)var9_8, (double)var5_6, (long)500914284220543481L), (long)1261399724580134246L) - 90.0f));
                        var12_10 = _q.E("tL8iECgf9y2NxjN1", wrapDegrees(float ), (float)(-((float)hi.a("G", (double)hi.a("G", (double)var7_7, (double)hi.a("G", (double)(var5_6 * var5_6 + var9_8 * var9_8), (long)1236096628704034685L), (long)500914284220543481L), (long)1261399724580134246L))));
                        return new uK((float)var11_9, (float)var12_10);
                    }
                    case -1550602452: 
                }
                hi.a("G", (long)1127763923712469243L);
                hi.a("G", (int)_q.a(9992, 2622874477024678681L), (int)_q.a(17073, 845620968459499111L), (long)735288420341019222L);
                return null;
            }
            var13_4 = (_q.a(29854, 5739210684790456541L) - _q.a(23942, 6949503158677366791L)) * _q.a(29568, 6234339423583160019L) * _q.a(15578, 1051171020220368929L) / _q.a(15142, 2382776459168026258L) - _q.a(29184, 804942961675060851L);
        }
    }

    public static uK T(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        uK uK3 = (uK)objectArray[1];
        float f = (float)(hi.a("\u00a5", (Object)((Double)((Object)_q.E("tL8iECgf9y2NxjN1", get(), (OptionInstance)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1250868354805814437L), (long)527364981902350651L)))), (long)637262500311742568L) * (1.0 + hi.a("G", (long)479298531793312865L) / 1.0E7) * (double)0.6f + (double)0.2f);
        double d = (double)(f * f * f * 8.0f) * 0.15;
        reference var6_5 = hi.a("\u00a5", (Object)uK3, (long)1049231279723202751L) + (float)((double)hi.a("G", (double)((double)(hi.a("\u00a5", (Object)uK2, (long)1049231279723202751L) - hi.a("\u00a5", (Object)uK3, (long)1049231279723202751L)) / d), (long)656829459129041302L) * d);
        reference var7_6 = hi.a("\u00a5", (Object)uK3, (long)1059675231579017960L) + (float)((double)hi.a("G", (double)((double)(_q.E("tL8iECgf9y2NxjN1", f(), (uK)uK2) - hi.a("\u00a5", (Object)uK3, (long)1059675231579017960L)) / d), (long)656829459129041302L) * d);
        return new uK((float)var6_5, (float)hi.a("G", (float)var7_6, (float)-90.0f, (float)90.0f, (long)390336973585993938L));
    }

    private static boolean lambda$getDirection$0(BlockPos blockPos, Direction direction) {
        return (boolean)hi.a("G", (Object)blockPos, (Object)direction, (long)1164373879090859756L);
    }

    public static uK m(Object[] objectArray) {
        Vec3 vec3 = (Vec3)objectArray[0];
        Direction direction = (Direction)objectArray[1];
        reference var3_3 = hi.a("\u00e9", (Object)vec3, (long)1300412705618690751L) + 0.5;
        reference var5_4 = hi.a("\u00e9", (Object)vec3, (long)1294071886475894755L) + 0.5;
        reference var7_5 = hi.a("\u00e9", (Object)vec3, (long)1282612456329596420L) + 0.5;
        return hi.a("G", (Object)new Object[]{new Vec3((double)(var3_3 += (double)hi.a("\u00a5", (Object)direction, (long)548124175341745588L) * 0.5), (double)(var5_4 += (double)hi.a("\u00a5", (Object)direction, (long)1244978798994688417L) * 0.5), (double)(var7_5 += (double)hi.a("\u00a5", (Object)direction, (long)638836021009548004L) * 0.5))}, (long)821415463297306273L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static uK G(Object[] var0) {
        block50: {
            block56: {
                block55: {
                    block54: {
                        var4_1 = (Entity)var0[0];
                        var1_2 = (Boolean)var0[1];
                        var2_3 = (Double)var0[2];
                        var5_4 = Dl.S();
                        var37_5 /* !! */  = _q.a(7789, 1724549440167127873L) / _q.a(8121, 7890211333497006768L) ^ _q.a(25361, 2173603746158073628L);
                        if (!var5_4) ** GOTO lbl-1000
                        switch (var37_5 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var6_6 = _q.E("tL8iECgf9y2NxjN1", h(net.minecraft.world.entity.Entity ), (Entity)var4_1);
                                v0 = new Object[3];
                                v0[2] = Float.valueOf(0.0f);
                                v0[1] = var2_3;
                                v0[0] = var6_6;
                                var7_7 = hi.a("G", (Object)v0, (long)422253046505194019L);
                                v1 /* !! */  = var1_2;
                                if (!var5_4) break block54;
                                if (!v1 /* !! */ ) break;
                                break block55;
                            }
                            case -45258130: {
                                hi.a("G", (long)397288152806896377L);
                                hi.a("G", (long)636853863237534702L);
                                return null;
                            }
                        }
                        v1 /* !! */  = hi.a("G", (int)((_q.a(3180, 1901278370238282208L) ^ _q.a(16916, 7084843601156110131L)) - _q.a(12040, 2285261611920530403L)), (int)_q.a(24703, 612687690954331423L), (long)834203424483934088L) + _q.a(19093, 6683591953304059709L) + _q.a(2612, 3865038752186613669L);
                    }
                    var37_5 /* !! */  = (int)v1 /* !! */ ;
                    if (var5_4) break block56;
                }
                var37_5 /* !! */  = (_q.a(28706, 4613329943145465092L) ^ _q.a(20712, 2981565595053548983L)) + _q.a(30745, 4783797901614566853L) + _q.a(13350, 3099757252051960109L);
                if (var5_4) break block56;
                ** GOTO lbl84
lbl34:
                // 2 sources

                while (true) {
                    cfr_temp_0 = var22_16 - 0.0;
                    v2 /* !! */  = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                    if (!var5_4) ** GOTO lbl95
                    if (v2 /* !! */  < 0) ** GOTO lbl94
                    ** GOTO lbl97
                    break;
                }
lbl40:
                // 2 sources

                while (true) {
                    cfr_temp_1 = var24_17 - -0.5;
                    v3 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                    if (!var5_4) ** GOTO lbl118
                    if (v3 < 0) ** GOTO lbl117
                    ** GOTO lbl120
                    break;
                }
lbl46:
                // 2 sources

                while (true) {
                    cfr_temp_2 = var26_18 - -0.5;
                    v4 /* !! */  = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                    if (!var5_4) ** GOTO lbl141
                    if (v4 /* !! */  < 0) ** GOTO lbl140
                    ** GOTO lbl143
                    break;
                }
lbl52:
                // 2 sources

                while (true) {
                    var24_17 -= 0.5;
                    if (var5_4) ** GOTO lbl197
lbl55:
                    // 2 sources

                    while (true) {
                        var22_16 -= 0.25 + hi.a("G", (long)479298531793312865L) * 0.1;
                        if (!var5_4) {
                            return var6_6;
                        }
                        ** GOTO lbl199
                        break;
                    }
                    break;
                }
            }
            block34: while (true) {
                switch (var37_5 /* !! */ ) {
                    default: {
                        if (var7_7 == null) ** GOTO lbl84
                        ** GOTO lbl86
                    }
                    case 626529167: {
                        if (hi.a("\u00a5", (Object)var7_7, (long)760876273703437601L) != hi.a("j", (long)1257983716310300578L)) ** GOTO lbl88
                        ** GOTO lbl90
                    }
                    case 626529168: {
                        var8_8 = hi.a("\u00a5", (Object)var4_1, (long)972363407830745929L);
                        var9_9 = hi.a("\u00e9", (Object)var8_8, (long)1065600789354078750L);
                        var11_10 = hi.a("\u00e9", (Object)var8_8, (long)430137657327008003L);
                        var13_11 = hi.a("\u00e9", (Object)var8_8, (long)797530004147152713L);
                        var15_12 = hi.a("\u00e9", (Object)var8_8, (long)1116111677700761539L);
                        var17_13 = hi.a("\u00e9", (Object)var8_8, (long)1242259651052261877L);
                        var19_14 = hi.a("\u00e9", (Object)var8_8, (long)1166170983307000375L);
                        var21_15 = hi.a("\u00a5", (Object)var4_1, (long)843444004431316321L);
                        var22_16 = 1.0;
                        if (var5_4) ** GOTO lbl92
                        ** GOTO lbl34
                    }
                    case 626529166: {
                        throw null;
                    }
lbl84:
                    // 2 sources

                    var37_5 /* !! */  = (_q.a(18106, 5158324952923534328L) * _q.a(22455, 276311999532950524L) - _q.a(20220, 5743902610427116036L) + _q.a(15958, 7109133003088530420L)) / _q.a(13075, 3227157239650092544L) + _q.a(26572, 521981251447149285L);
                    if (var5_4) continue block34;
lbl86:
                    // 2 sources

                    var37_5 /* !! */  = _q.a(177, 3648357031462876389L) / _q.a(32111, 5450981378280900982L) - _q.a(5070, 333708904576755492L);
                    if (var5_4) continue block34;
lbl88:
                    // 2 sources

                    var37_5 /* !! */  = (_q.a(29750, 5866691249131536432L) * _q.a(336, 5934035035327575208L) - _q.a(14250, 6342839041474724708L) + _q.a(5268, 2327291906521309577L)) / _q.a(13075, 3227157239650092544L) + _q.a(30439, 6966675592269939634L);
                    if (var5_4) continue block34;
lbl90:
                    // 2 sources

                    var37_5 /* !! */  = (int)(_q.E("tL8iECgf9y2NxjN1", max(int int ), (int)((_q.a(19498, 1676779349931161654L) ^ _q.a(30735, 7460238893595839749L)) - _q.a(24730, 7407526865962980843L)), (int)_q.a(22598, 6132081452132756581L)) + _q.a(9493, 2692703579947143528L) + _q.a(30241, 9081684572565946951L));
                    continue block34;
lbl92:
                    // 1 sources

                    var37_5 /* !! */  = _q.a(8459, 8632078514565518603L) * _q.a(21898, 5769988381300351405L) + _q.a(5709, 4216736019736830486L) + _q.a(20882, 2969638439497032794L) + _q.a(8761, 975394647735899701L) ^ _q.a(6908, 5070411604266266517L);
                    if (var5_4) break block50;
lbl94:
                    // 2 sources

                    v2 /* !! */  = (double)(hi.a("G", (int)(_q.a(31571, 6758519077892181829L) * _q.a(31298, 8081150532954476542L) + _q.a(18135, 6261043896795263524L) ^ _q.a(24885, 7789250758167647568L)), (int)_q.a(18332, 407686819547378654L), (long)834203424483934088L) + _q.a(2435, 6091688836250287215L));
lbl95:
                    // 2 sources

                    var37_5 /* !! */  = (int)v2 /* !! */ ;
                    if (var5_4) break block50;
lbl97:
                    // 2 sources

                    var37_5 /* !! */  = _q.a(17180, 9115039888064280121L) / _q.a(21073, 5073415880311203747L) / _q.a(32111, 5450981378280900982L) ^ _q.a(705, 1843655203327194846L);
                    break block50;
                    case 626529164: 
                }
                break;
            }
            return var6_6;
        }
        while (true) {
            block57: {
                switch (var37_5 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 353407387: {
                        var24_17 = 1.0;
                        if (var5_4) ** GOTO lbl115
                        ** GOTO lbl40
                    }
                    case 353407388: {
                        hi.a("G", (long)979875262789802604L);
                        return var6_6;
                    }
lbl115:
                    // 1 sources

                    var37_5 /* !! */  = _q.a(17971, 7378006160757748293L) - _q.a(25566, 1673851883306997455L) + _q.a(22659, 3330608506677914949L) - _q.a(12354, 6365330353959896333L) + _q.a(5474, 2741000553445236827L);
                    if (var5_4) break block57;
lbl117:
                    // 2 sources

                    v3 = _q.a(70, 4573782084956271937L) + _q.a(21558, 2360712088531722441L) + _q.a(11857, 6848934386638101384L);
lbl118:
                    // 2 sources

                    var37_5 /* !! */  = (int)v3;
                    if (var5_4) break block57;
lbl120:
                    // 2 sources

                    var37_5 /* !! */  = (int)(hi.a("G", (int)_q.a(26416, 5476220025073849106L), (int)_q.a(16261, 338573382120180595L), (long)834203424483934088L) * _q.a(16878, 877710417197495403L) / _q.a(4062, 2686803945229630233L) - _q.a(25799, 196223811998503334L) + _q.a(31501, 1857413663394516733L));
                    break block57;
                    case 353407390: 
                }
                return var6_6;
            }
            do {
                block58: {
                    switch (var37_5 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 952804611: {
                            var26_18 = 1.0;
                            if (var5_4) break;
                            ** GOTO lbl46
                        }
                        case 952804612: {
                            ** continue;
                        }
                        case 952804610: {
                            ** GOTO lbl185
                        }
                    }
                    var37_5 /* !! */  = _q.a(21084, 8189813521405732511L) / _q.a(13075, 3227157239650092544L) + _q.a(26179, 5653618340407923582L) + _q.a(9153, 8071337403706644094L);
                    if (var5_4) break block58;
lbl140:
                    // 2 sources

                    v4 /* !! */  = (double)(hi.a("G", (int)_q.a(246, 1235309227999081639L), (int)_q.a(21341, 4324088197535819518L), (long)834203424483934088L) * _q.a(14799, 1485606585855610162L) - _q.a(14492, 1981732289052314899L));
lbl141:
                    // 2 sources

                    var37_5 /* !! */  = (int)v4 /* !! */ ;
                    if (var5_4) break block58;
lbl143:
                    // 2 sources

                    var37_5 /* !! */  = hi.a("G", (int)_q.a(7512, 8389151888198248654L), (int)_q.a(25230, 9095990021777020610L), (long)834203424483934088L) * _q.a(25326, 1508299678807742362L) ^ _q.a(25204, 4081932966403594097L) ^ _q.a(22607, 6585576452452412850L);
                }
                do {
                    block53: {
                        block52: {
                            block51: {
                                switch (var37_5 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case 527138592: {
                                        var28_19 = (var11_10 - var9_9) * var24_17;
                                        var30_20 = (var15_12 - var13_11) * var22_16;
                                        var32_21 = (var19_14 - var17_13) * var26_18;
                                        var34_22 = hi.a("\u00a5", (Object)var21_15, (double)var28_19, (double)var30_20, (double)var32_21, (long)1050989166521321638L);
                                        var35_23 = hi.a("G", (Object)new Object[]{var34_22}, (long)821415463297306273L);
                                        v5 = new Object[3];
                                        v5[2] = Float.valueOf(0.0f);
                                        v5[1] = var2_3;
                                        v5[0] = var35_23;
                                        var36_24 = hi.a("G", (Object)v5, (long)422253046505194019L);
                                        if (!var5_4) ** GOTO lbl167
                                        if (var36_24 == null) ** GOTO lbl166
                                        ** GOTO lbl168
                                    }
                                    case 527138591: {
                                        ** GOTO lbl52
                                    }
lbl166:
                                    // 1 sources

                                    var37_5 /* !! */  = (_q.a(2732, 2320921195495833551L) / _q.a(13075, 3227157239650092544L) + _q.a(276, 3484686431771899117L) ^ _q.a(18235, 5769542897335300828L)) - _q.a(21687, 6473633135946555691L);
lbl167:
                                    // 2 sources

                                    if (var5_4) ** GOTO lbl170
lbl168:
                                    // 2 sources

                                    var37_5 /* !! */  = (_q.a(18196, 7851051802138997377L) - _q.a(31505, 4511513409736429174L)) / 3 - _q.a(6271, 959164663458540563L);
                                    if (!var5_4) break block51;
lbl170:
                                    // 4 sources

                                    while (true) {
                                        switch (var37_5 /* !! */ ) {
                                            default: {
                                                if (_q.E("tL8iECgf9y2NxjN1", getType(), (HitResult)var36_24) != hi.a("j", (long)1257983716310300578L)) break block51;
                                                break block52;
                                            }
                                            case 798910774: {
                                                return var35_23;
                                            }
                                            case 798910771: {
                                                var26_18 -= 0.5;
                                                if (!var5_4) {
                                                    ** continue;
                                                }
                                                break block53;
                                            }
                                            case 798910773: 
                                        }
                                        break;
                                    }
                                    case 527138590: 
                                }
lbl185:
                                // 3 sources

                                hi.a("G", (float)0.0f, (long)391647354171730378L);
                                return null;
                            }
                            var37_5 /* !! */  = (_q.a(21965, 6356805701988606128L) / _q.a(13075, 3227157239650092544L) + _q.a(12014, 7903524491269839673L) ^ _q.a(16050, 8482391517062630341L)) - _q.a(20329, 2749105931376294775L);
                            if (var5_4) ** GOTO lbl170
                        }
                        var37_5 /* !! */  = (_q.a(24775, 6269198699496002805L) - _q.a(32047, 2132590249904588823L)) * _q.a(12831, 3034359844466165342L) * _q.a(19960, 5531240438014867895L) ^ _q.a(22482, 5668613495872054269L);
                        if (var5_4) ** continue;
                    }
                    var37_5 /* !! */  = _q.a(30158, 7978966276869374133L) / _q.a(13075, 3227157239650092544L) + _q.a(15158, 1083905714352295517L) + _q.a(2365, 4914676897685847358L);
                } while (var5_4);
lbl197:
                // 2 sources

                var37_5 /* !! */  = _q.a(27471, 1694073008822050379L) - _q.a(24194, 1298450147806669474L) + _q.a(12928, 5104293806836418458L) - _q.a(16220, 8807344480414337954L) + _q.a(25232, 5057614275865564872L);
            } while (var5_4);
lbl199:
            // 2 sources

            var37_5 /* !! */  = _q.a(10134, 994734043685032641L) * _q.a(12359, 6235293706104734854L) + _q.a(5398, 6656924721857044576L) + _q.a(1710, 6820300236724581071L) + _q.a(24262, 7065024437569973030L) ^ _q.a(10223, 472084221190279794L);
        }
    }

    public static uK u(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        uK uK3 = new uK((float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)new Object[0], (long)1150216145728165743L), (long)1049231279723202751L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)new Object[0], (long)1150216145728165743L), (long)1059675231579017960L));
        float f = (float)(hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1250868354805814437L), (long)527364981902350651L), (long)728880487843580622L))), (long)637262500311742568L) * (1.0 + hi.a("G", (long)479298531793312865L) / 1.0E7) * (double)0.6f + (double)0.2f);
        double d = (double)(f * f * f * 8.0f) * 0.15;
        reference var6_5 = hi.a("\u00a5", (Object)uK3, (long)1049231279723202751L) + (float)((double)hi.a("G", (double)((double)(_q.E("tL8iECgf9y2NxjN1", p(), (uK)uK2) - hi.a("\u00a5", (Object)uK3, (long)1049231279723202751L)) / d), (long)656829459129041302L) * d);
        reference var7_6 = _q.E("tL8iECgf9y2NxjN1", f(), (uK)uK3) + (float)((double)hi.a("G", (double)((double)(hi.a("\u00a5", (Object)uK2, (long)1059675231579017960L) - hi.a("\u00a5", (Object)uK3, (long)1059675231579017960L)) / d), (long)656829459129041302L) * d);
        return new uK((float)var6_5, (float)hi.a("G", (float)var7_6, (float)-90.0f, (float)90.0f, (long)390336973585993938L));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static Direction t(Object[] var0) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        block16: {
                            block15: {
                                var1_1 = (BlockPos)var0[0];
                                var2_2 = Dl.S();
                                var5_3 = _q.a(27830, 3123096382639593831L) / _q.a(15142, 2382776459168026258L) ^ _q.a(7024, 6508007526385135132L);
                                if (!var2_2) ** GOTO lbl-1000
                                switch (var5_3) {
                                    default: lbl-1000:
                                    // 2 sources

                                    {
                                        v0 = new Object[2];
                                        v0[1] = (Predicate<Direction>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getDirection$0(net.minecraft.core.BlockPos net.minecraft.core.Direction ), (Lnet/minecraft/core/Direction;)Z)((BlockPos)var1_1);
                                        v0[0] = var1_1;
                                        var3_4 = hi.a("G", (Object)v0, (long)998309654320454991L);
                                        if (!var2_2) break block15;
                                        if (var3_4 == null) break;
                                        break block16;
                                    }
                                    case -241410944: {
                                        hi.a("G", (long)1322977965577556497L);
                                        return null;
                                    }
                                }
                                var5_3 = (_q.a(1492, 333291870786335005L) - _q.a(23973, 523271851471432173L) ^ _q.a(12986, 4387576262897403801L) ^ _q.a(26236, 7155326133762314828L)) - _q.a(25585, 7891014493187757843L);
                            }
                            if (var2_2) break block17;
                        }
                        var5_3 = (_q.a(27130, 1419605803021360414L) ^ _q.a(17030, 108735794335020992L)) * _q.a(6935, 8711466865480019458L) - _q.a(18418, 7055383312242700882L);
                    }
                    switch (var5_3) {
                        default: {
                            return var3_4;
                        }
                        case -1352256895: {
                            v1 = new Object[2];
                            v1[1] = (Predicate<Direction>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getDirection$1(net.minecraft.core.BlockPos net.minecraft.core.Direction ), (Lnet/minecraft/core/Direction;)Z)((BlockPos)var1_1);
                            v1[0] = var1_1;
                            var4_5 = hi.a("G", (Object)v1, (long)998309654320454991L);
                            if (!var2_2) break block18;
                            if (var4_5 == null) break;
                            break block19;
                        }
                        case -1352256894: {
                            return null;
                        }
                    }
                    var5_3 = (_q.a(25681, 116827012779594144L) + _q.a(28368, 6277530431928589150L) ^ _q.a(25750, 3682890022540923278L) ^ _q.a(25444, 8811042816651384725L)) + _q.a(11423, 7783586569398950321L);
                }
                if (var2_2) break block20;
            }
            var5_3 = (_q.a(209, 7204270567757755412L) - _q.a(15121, 1074374849424002888L)) * _q.a(19442, 2410026231094214549L) ^ _q.a(5417, 24746877601325334L);
        }
        switch (var5_3) {
            default: {
                return var4_5;
            }
            case 2019907442: {
                return hi.a("j", (long)1151726402263101942L);
            }
            case 2019907441: 
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    public static boolean y(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
     * Could not resolve type clashes
     */
    public static uK D(Object[] var0) {
        block9: {
            block11: {
                block10: {
                    var1_1 = (uK)var0[0];
                    var2_2 = Dl.S();
                    var5_3 /* !! */  = _q.a(8908, 5158865409477810060L) / _q.a(14141, 3097699540253737711L) / _q.a(20381, 4699408513623620512L) / _q.a(24774, 9065843432026559759L) ^ _q.a(8032, 4164108961822714434L);
                    if (var2_2) break block10;
lbl6:
                    // 2 sources

                    while (var1_1 == null) {
                        break block9;
                    }
                    break block11;
lbl9:
                    // 1 sources

                    return null;
lbl11:
                    // 1 sources

                    while (true) {
                        var3_4 = hi.a("\u00a5", (Object)var1_1, (long)1049231279723202751L) + _q.E("tL8iECgf9y2NxjN1", wrapDegrees(float ), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)700108823764850555L) - hi.a("\u00a5", (Object)var1_1, (long)1049231279723202751L)));
                        var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1280994566116072355L);
                        return new uK((float)var3_4, (float)var4_5);
                    }
                }
lbl16:
                // 3 sources

                while (true) {
                    switch (var5_3 /* !! */ ) {
                        default: {
                            ** GOTO lbl6
                        }
                        case 953809546: {
                            ** continue;
                        }
                        case 953809544: {
                            ** continue;
                        }
                        case 953809543: 
                    }
                    hi.a("G", (long)637561819799202476L);
                    hi.a("G", (int)1, (long)1235507535267189928L);
                    var5_3 /* !! */  = hi.a("G", (int)((_q.a(24581, 8190297594384045257L) + _q.a(30403, 3729753665261191688L)) / 2), (int)_q.a(14075, 469071717046682534L), (long)834203424483934088L) ^ _q.a(27747, 952100535216527539L);
                    if (var2_2) continue;
                    break;
                }
            }
            var5_3 /* !! */  = (_q.a(4388, 4691363744127460705L) * _q.a(8094, 7305600043538197116L) + _q.a(21786, 3299759694111793190L)) * _q.a(4625, 56192068543784884L) - _q.a(3939, 7047431379143015045L);
            if (var2_2) ** GOTO lbl16
        }
        var5_3 /* !! */  = (int)(hi.a("G", (int)((_q.a(23647, 5982796769464903681L) - _q.a(8642, 1570416992829772813L)) / 2 / _q.a(32111, 5450981378280900982L)), (int)_q.a(29235, 7551330338152171505L), (long)834203424483934088L) + _q.a(31202, 6890309277507866071L));
        ** while (true)
    }

    public static uK U(Object[] objectArray) {
        Entity entity = (Entity)objectArray[0];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)entity, (long)843444004431316321L), (double)0.0, (double)((double)_q.E("tL8iECgf9y2NxjN1", getBbHeight(), (Entity)entity) / 2.0), (double)0.0, (long)1050989166521321638L);
        reference var4_4 = hi.a("\u00e9", (Object)callSite2, (long)1300412705618690751L) - hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L);
        reference var6_5 = hi.a("\u00e9", (Object)callSite2, (long)1294071886475894755L) - hi.a("\u00e9", (Object)callSite, (long)1294071886475894755L);
        reference var8_6 = hi.a("\u00e9", (Object)callSite2, (long)1282612456329596420L) - hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L);
        CallSite callSite3 = _q.E("tL8iECgf9y2NxjN1", sqrt(double ), (double)(var4_4 * var4_4 + var8_6 * var8_6));
        float f = (float)hi.a("G", (double)(-hi.a("G", (double)var4_4, (double)var8_6, (long)500914284220543481L)), (long)1261399724580134246L);
        float f2 = (float)hi.a("G", (double)(-_q.E("tL8iECgf9y2NxjN1", atan2(double double ), (double)var6_5, (double)callSite3)), (long)1261399724580134246L);
        return new uK(f, (float)hi.a("G", (float)f2, (float)-90.0f, (float)90.0f, (long)390336973585993938L));
    }

    public static uK h(Entity entity) {
        return hi.a("G", (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)entity, (long)843444004431316321L), (double)0.0, (double)hi.a("G", (double)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)413756257338480558L) - hi.a("\u00a5", (Object)entity, (long)1108104001900174719L) + (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)874782692675996876L)), (double)0.0, (double)((hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)entity, (long)972363407830745929L), (long)1116111677700761539L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)entity, (long)972363407830745929L), (long)797530004147152713L)) * 0.9), (long)569387319293504539L), (double)0.0, (long)1050989166521321638L)}, (long)821415463297306273L);
    }

    public static uK z(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        CallSite callSite = hi.a("j", (long)1054285254962319361L);
        uK uK3 = new uK((float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)callSite, (Object)new Object[0], (long)1150216145728165743L), (long)1049231279723202751L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)callSite, (Object)new Object[0], (long)1150216145728165743L), (long)1059675231579017960L));
        reference var4_4 = _q.E("tL8iECgf9y2NxjN1", p(), (uK)uK3) + hi.a("G", (float)(hi.a("\u00a5", (Object)uK2, (long)1049231279723202751L) - hi.a("\u00a5", (Object)uK3, (long)1049231279723202751L)), (long)604508068528351008L);
        CallSite callSite2 = hi.a("G", (float)hi.a("\u00a5", (Object)uK2, (long)1059675231579017960L), (float)-90.0f, (float)90.0f, (long)390336973585993938L);
        return new uK((float)var4_4, (float)callSite2);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean e(BlockPos var0, Direction var1_1) {
        block21: {
            var2_2 = Dl.t();
            var6_3 = _q.a(11088, 284603806185299590L) * _q.a(27151, 7109986534934371874L) - _q.a(24512, 6934293364632185528L);
            if (!var2_2) break block21;
lbl4:
            // 2 sources

            while (true) {
                block27: {
                    block26: {
                        block25: {
                            block24: {
                                block23: {
                                    block22: {
                                        var3_4 = hi.a("\u00a5", (Object)hi.a("G", (Object)var0, (long)968425374253918917L), (Object)var1_1, (double)0.5, (long)643840655838233038L);
                                        var4_5 = new ClipContext((Vec3)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L), (Vec3)var3_4, (ClipContext.Block)hi.a("j", (long)450224442646423139L), (ClipContext.Fluid)hi.a("j", (long)747535818869381789L), (Entity)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L));
                                        var5_6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var4_5, (long)438016674394306919L);
                                        if (var2_2) break block22;
                                        if (hi.a("\u00a5", (Object)var5_6, (long)760876273703437601L) == hi.a("j", (long)958553802615151507L)) break block23;
                                        var6_3 = (_q.a(19031, 6545917740096388710L) ^ _q.a(17107, 3358010604856080141L)) - _q.a(16283, 5049265512884538209L) - _q.a(22701, 2479884712935484696L);
                                    }
                                    if (!var2_2) break block24;
                                }
                                var6_3 = hi.a("G", (int)((_q.a(2982, 7700082715482931154L) + _q.a(19486, 744802754567436549L) ^ _q.a(13883, 6357213341722477439L)) - _q.a(10251, 7540931464760138782L)), (int)_q.a(11567, 6497141536667769309L), (long)834203424483934088L) ^ _q.a(19760, 7204434001282365900L);
                            }
                            v0 = var6_3;
                            if (var2_2) break block25;
                            switch (v0) {
                                default: {
                                    v0 = 1;
                                    break;
                                }
                                case -499323982: {
                                    v0 = 0;
                                    if (var2_2) {
                                        return (boolean)v0;
                                    }
                                    break block26;
                                }
                                case -499323983: {
                                    throw null;
                                }
                            }
                        }
                        var6_3 = hi.a("G", (int)(hi.a("G", (int)_q.a(10591, 777265628804422947L), (int)_q.a(11233, 5106000699037064780L), (long)834203424483934088L) - _q.a(5348, 2953916803170836846L)), (int)_q.a(22502, 3705931385520972388L), (long)834203424483934088L) * _q.a(21872, 7231124703860351385L) ^ _q.a(28266, 1115832105683508052L);
                        if (!var2_2) break block27;
                    }
                    var6_3 = hi.a("G", (int)(hi.a("G", (int)_q.a(1630, 2198435161516323366L), (int)_q.a(2996, 4183900614349143893L), (long)834203424483934088L) - _q.a(3669, 1113807553954429906L)), (int)_q.a(12834, 8638450780707030734L), (long)834203424483934088L) * _q.a(151, 8136452172419314948L) ^ _q.a(10430, 1223317775620611453L);
                }
                switch (var6_3) {
                    default: {
                        return (boolean)v0;
                    }
                    case 1308556139: 
                }
                throw null;
            }
        }
        while (true) {
            switch (var6_3) {
                default: {
                    ** continue;
                }
                case 1165084907: 
            }
            hi.a("G", (long)938841799815187197L);
            hi.a("G", (float)1.0f, (float)1.0f, (int)1, (long)803182559024134953L);
            var6_3 = ((_q.a(5489, 7679331222750044430L) * _q.a(24002, 8162768043136575884L) - _q.a(19270, 1856312303843737091L)) * _q.a(17997, 3003448756937814575L) ^ _q.a(28224, 814794830608259632L)) - _q.a(29913, 731690584013357081L);
        }
    }

    public static uK E(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        double d = (Double)objectArray[1];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = d;
        objectArray2[1] = uK2;
        objectArray2[0] = hi.a("\u00e9", (Object)hi.a("j", (long)1054285254962319361L), (long)691748736029573032L);
        return hi.a("G", (Object)objectArray2, (long)553039747580057571L);
    }

    public static uK s(BlockPos blockPos, Direction direction) {
        double d = (double)hi.a("\u00a5", (Object)blockPos, (long)918555824711552631L) + 0.5;
        double d2 = (double)hi.a("\u00a5", (Object)blockPos, (long)491002271509294121L) + 0.5;
        double d3 = (double)hi.a("\u00a5", (Object)blockPos, (long)1003954676294969181L) + 0.5;
        return hi.a("G", (Object)new Object[]{new Vec3(d += (double)_q.E("tL8iECgf9y2NxjN1", getStepX(), (Direction)direction) * 0.5, d2 += (double)hi.a("\u00a5", (Object)direction, (long)1244978798994688417L) * 0.5, d3 += (double)hi.a("\u00a5", (Object)direction, (long)638836021009548004L) * 0.5)}, (long)821415463297306273L);
    }

    public static uK S(Object[] objectArray) {
        Vec3 vec3 = (Vec3)objectArray[0];
        return hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L), (Object)vec3, (long)1021645254548924040L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean Y(Object[] var0) {
        block35: {
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                block29: {
                                    var1_1 = (Entity)var0[0];
                                    var2_2 = ((Float)var0[1]).floatValue();
                                    var3_3 = Dl.t();
                                    var5_4 = _q.a(17347, 7217311030978869226L) * _q.a(31253, 3876314712719839211L) - _q.a(16473, 4527106499490313725L) ^ _q.a(14338, 126933551281736915L);
                                    if (!var3_3) ** GOTO lbl17
                                    block12: while (true) {
                                        block28: {
                                            block27: {
                                                block26: {
                                                    v0 /* !! */  = (cfr_temp_0 = var2_2 - 360.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                    if (var3_3) break block26;
                                                    if (v0 /* !! */  >= 0) break block27;
                                                    v0 /* !! */  = (float)(hi.a("G", (int)_q.a(32753, 3724040758938979002L), (int)_q.a(6127, 5170366991546033130L), (long)834203424483934088L) + _q.a(29725, 9150540972664832321L));
                                                }
                                                var5_4 = (int)v0 /* !! */ ;
                                                if (!var3_3) break block28;
                                            }
                                            var5_4 = hi.a("G", (int)_q.a(21728, 6046113556813799756L), (int)_q.a(31996, 1632673009721460779L), (long)834203424483934088L) / 4 ^ _q.a(19095, 654552400337141730L);
                                        }
                                        switch (var5_4) {
                                            default: {
                                                continue block12;
                                            }
                                            case -484152895: {
                                                return true;
                                            }
                                            case -484152894: {
                                                break block12;
                                            }
                                            case -484152896: {
                                                hi.a("G", (long)1232023252855193994L);
                                            }
                                        }
                                        break;
                                    }
                                    var4_5 = hi.a("G", (float)hi.a("G", (float)(hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{var1_1}, (long)980289883827067213L), (long)1049231279723202751L) - _q.E("tL8iECgf9y2NxjN1", getYRot(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L))), (long)604508068528351008L), (long)400111314131951612L);
                                    cfr_temp_1 = (double)var4_5 - (double)var2_2 / 2.0;
                                    v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                    if (var3_3) break block29;
                                    if (v1 <= 0) break block30;
                                    v1 = _q.a(19438, 1661767716223057648L) - _q.a(15965, 20415811774745494L) ^ _q.a(27968, 6996962402496731485L);
                                }
                                var5_4 = (int)v1;
                                if (!var3_3) break block31;
                            }
                            var5_4 = hi.a("G", (int)_q.a(19787, 7459140006121666767L), (int)_q.a(147, 7214967935556892143L), (long)834203424483934088L) ^ _q.a(53, 6952447139856528666L);
                        }
                        v2 = var5_4;
                        if (var3_3) break block32;
                        switch (v2) {
                            default: {
                                break block33;
                            }
                            case 1685264074: {
                                v3 = false;
                                if (var3_3) {
                                    return v3;
                                }
                                break block34;
                            }
                            case 1685264076: {
                                hi.a("G", (double)14.0, (long)977232075298570964L);
                                v2 = 2;
                            }
                        }
                    }
                    _q.E("tL8iECgf9y2NxjN1", E(int int int ), (int)v2, (int)_q.a(6347, 8616012220689165592L), (int)1);
                }
                v3 = true;
                var5_4 = _q.a(29036, 1143124267473814708L) / _q.a(32111, 5450981378280900982L) + _q.a(7996, 109154392176634679L);
                if (!var3_3) break block35;
            }
            var5_4 = _q.a(1269, 7843276792948830536L) / _q.a(32111, 5450981378280900982L) + _q.a(11292, 381014899843144046L);
        }
        switch (var5_4) {
            default: {
                return v3;
            }
            case -2041239901: 
        }
        hi.a("G", (long)1229653054671944966L);
        return (boolean)hi.a("G", (long)1031195239253115725L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static uK y(Object[] var0) {
        block19: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            var1_1 = (uK)var0[0];
                            var2_2 = (uK)var0[1];
                            var3_3 = (Double)var0[2];
                            var5_4 = Dl.t();
                            var14_5 = _q.a(28051, 4634189184966089072L) * _q.a(11111, 3244680787855744537L) + _q.a(24404, 3354535537518373464L);
                            if (!var5_4) break block20;
                            ** GOTO lbl-1000
                        }
                        v0 = var14_5;
                        if (var5_4) ** GOTO lbl18
                        switch (v0) {
                            case -1584120490: lbl-1000:
                            // 2 sources

                            {
                                hi.a("G", (int)-1, (long)701518974625326203L);
                                v0 = 5;
lbl18:
                                // 2 sources

                                _q.E("tL8iECgf9y2NxjN1", a(int ), (int)v0);
                                break;
                            }
                        }
                        var6_6 = hi.a("\u00a5", (Object)var2_2, (long)1049231279723202751L);
                        var7_7 = _q.E("tL8iECgf9y2NxjN1", f(), (uK)var2_2);
                        var8_8 = hi.a("\u00a5", (Object)var1_1, (long)1049231279723202751L);
                        var9_9 = _q.E("tL8iECgf9y2NxjN1", f(), (uK)var1_1);
                        cfr_temp_0 = var3_3 - 0.0;
                        v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        if (var5_4) break block21;
                        if (v1 != false) break block22;
                        v1 = (_q.a(18385, 4164706502545076898L) - _q.a(8978, 676728920068822676L)) * _q.a(28418, 7830775687019354754L) ^ _q.a(1422, 3760947892176859168L) ^ _q.a(5894, 8595350270035436317L);
                    }
                    var14_5 = (int)v1;
                    if (!var5_4) break block23;
                }
                var14_5 = ((_q.a(7117, 9051830460640865989L) - _q.a(966, 1071126084325455765L)) * _q.a(10460, 567631845614361773L) + _q.a(23635, 2270567087404509190L)) * _q.a(9795, 6467530774190494252L) ^ _q.a(3707, 1370805899416320534L);
                break block23;
lbl36:
                // 2 sources

                while (true) {
                    v2 = var11_11;
                    v3 = (int)((double)((float)_q.E("tL8iECgf9y2NxjN1", getFps(), (Minecraft)hi.a("j", (long)1080602109828736465L)) / 20.0f) + hi.a("G", (long)479298531793312865L) * 10.0);
                    if (var5_4) ** GOTO lbl76
                    if (v2 > v3) ** GOTO lbl74
                    ** GOTO lbl79
                    break;
                }
lbl42:
                // 2 sources

                while (true) {
                    var12_12 = new uK((float)var6_6, (float)var7_7);
                    var13_13 = hi.a("G", (Object)new Object[]{var12_12}, (long)698673254442245483L);
                    var6_6 = hi.a("\u00a5", (Object)var13_13, (long)1049231279723202751L);
                    var7_7 = hi.a("\u00a5", (Object)var13_13, (long)1059675231579017960L);
                    ++var11_11;
                    if (var5_4) {
                        return new uK((float)var6_6, (float)var7_7);
                    }
                    var14_5 = (hi.a("G", (int)_q.a(28822, 3176493833336964219L), (int)_q.a(19432, 8258758674391826427L), (long)834203424483934088L) / _q.a(1254, 1603080074058281266L) + _q.a(19282, 4269959390066933504L) ^ _q.a(20215, 3597950912847805224L)) + _q.a(3591, 8181027765171272629L);
                    break block19;
                    break;
                }
            }
            block15: while (true) {
                switch (var14_5) {
                    default: {
                        v4 = new Object[2];
                        v4[1] = var3_3;
                        v4[0] = var2_2;
                        var10_10 = hi.a("G", (Object)v4, (long)514998056137585073L);
                        var6_6 = var8_8 + hi.a("\u00a5", (Object)var10_10, (long)1049231279723202751L);
                        var7_7 = var9_9 + hi.a("\u00a5", (Object)var10_10, (long)1059675231579017960L);
                        var11_11 = 1;
                        if (!var5_4) ** GOTO lbl72
                        ** GOTO lbl36
                    }
                    case 358538054: {
                        hi.a("G", (long)578153914721391355L);
                        var14_5 = hi.a("G", (int)(_q.a(10119, 9192705982388081365L) - _q.a(26146, 6514339169684050706L)), (int)_q.a(27863, 8119966377409042938L), (long)834203424483934088L) ^ _q.a(1844, 8088425822558532398L);
                        continue block15;
                    }
lbl72:
                    // 1 sources

                    var14_5 = (_q.E("tL8iECgf9y2NxjN1", max(int int ), (int)_q.a(9090, 1081516651544909431L), (int)_q.a(24494, 6595617020043979313L)) / _q.a(1254, 1603080074058281266L) + _q.a(12330, 3405297755775272399L) ^ _q.a(12076, 3615962707367173096L)) + _q.a(31730, 2903786887926894242L);
                    if (!var5_4) break block19;
lbl74:
                    // 2 sources

                    v2 = (_q.a(16721, 4702768997972276487L) - _q.a(28686, 8260717585469785155L)) * _q.a(28691, 3038147817144141094L) ^ _q.a(6743, 1839709619545222764L);
                    v3 = _q.a(28095, 4220887144602818801L);
lbl76:
                    // 2 sources

                    var14_5 = v2 ^ v3;
                    if (var5_4) ** break;
                    continue block15;
lbl79:
                    // 2 sources

                    var14_5 = (_q.a(18851, 602243739856436248L) - _q.a(9802, 6882386645242876479L)) / 5 / _q.a(1035, 2114823088832753862L) - _q.a(23288, 6909601515698155039L);
                    if (!var5_4) break block19;
                    ** GOTO lbl105
                    case 358538055: 
                }
                break;
            }
            return new uK((float)var6_6, (float)var7_7);
        }
        while (true) {
            block26: {
                block25: {
                    block24: {
                        switch (var14_5) {
                            default: {
                                ** continue;
                            }
                            case -740096848: {
                                cfr_temp_1 = (double)(_q.E("tL8iECgf9y2NxjN1", abs(float ), (float)_q.E("tL8iECgf9y2NxjN1", p(), (uK)var10_10)) + hi.a("G", (float)_q.E("tL8iECgf9y2NxjN1", f(), (uK)var10_10), (long)400111314131951612L)) - 1.0E-4;
                                v5 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                if (var5_4) break block24;
                                if (v5 <= 0) break;
                                break block25;
                            }
                            case -740096846: {
                                var6_6 += (float)((hi.a("G", (long)479298531793312865L) - 0.5) / 1000.0);
                                var7_7 -= (float)(_q.E("tL8iECgf9y2NxjN1", random()) / 200.0);
                                if (!var5_4) break block26;
                                ** GOTO lbl42
                            }
                            case -740096847: {
                                ** continue;
                            }
                            case -740096845: {
                                throw null;
                            }
                        }
lbl105:
                        // 2 sources

                        v5 = ((hi.a("G", (int)_q.a(27994, 3942773097948567566L), (int)_q.a(3315, 6570348968794175960L), (long)834203424483934088L) ^ _q.a(18807, 5052665840588553443L)) - _q.a(28602, 4350749484536093616L)) / 5 + _q.a(19734, 1341671029681977808L);
                    }
                    var14_5 = (int)v5;
                    if (!var5_4) continue;
                }
                var14_5 = (_q.a(6449, 5505584483557715229L) ^ _q.a(14451, 3312621832461618617L)) - _q.a(20802, 3386184336130434150L) - _q.a(27163, 7765867054545526364L);
                if (!var5_4) continue;
            }
            var14_5 = ((hi.a("G", (int)_q.a(26261, 6738470677782811542L), (int)_q.a(21330, 1439458812812224026L), (long)834203424483934088L) ^ _q.a(15777, 4476965552118859992L)) - _q.a(13106, 4019587865610651613L)) / 5 + _q.a(2892, 4732416834587377308L);
        }
    }

    public static uK R(BlockPos blockPos) {
        return hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L), (Object)hi.a("G", (Object)blockPos, (long)968425374253918917L), (long)1021645254548924040L);
    }

    public static /* bridge */ /* synthetic */ CallSite E(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    private static AABB L(Object[] var0) {
        block15: {
            var1_1 = var0[0];
            var2_2 = Dl.t();
            var7_3 /* !! */  = _q.a(5912, 5092467922913305377L) / _q.a(15142, 2382776459168026258L) / _q.a(2922, 5469595133396631042L) + _q.a(11111, 4849468759887781677L);
            if (var2_2) ** GOTO lbl-1000
            switch (var7_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)((BlockPos)var1_1), (long)419122760578116751L), (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)((BlockPos)var1_1), (long)826970659746530362L), (Object)((BlockPos)var1_1), (long)1169080734395727517L);
                    var4_5 /* !! */  = new AABB((BlockPos)var1_1);
                    var5_6 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var3_4, (long)948473201875045121L), (long)1240653736693366367L);
                    if (!var2_2) break;
                    break block15;
                }
                case -1602360418: {
                    return null;
                }
            }
            var7_3 /* !! */  = hi.a("G", (int)_q.a(4224, 7949273278884848920L), (int)_q.a(17329, 14697655376672439L), (long)834203424483934088L) ^ _q.a(17899, 5566086891556204572L);
            if (!var2_2) ** GOTO lbl29
            ** GOTO lbl23
        }
        block8: while (true) {
            block18: {
                block17: {
                    block16: {
                        v0 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)984088978567310565L);
                        if (var2_2) break block16;
                        if (v0 /* !! */  != false) break block17;
lbl23:
                        // 2 sources

                        v0 /* !! */  = (CallSite)(_q.a(26518, 5642918482527703560L) - _q.a(16210, 6302015197068921729L) - _q.a(27238, 8026514320657866633L) ^ _q.a(7519, 5732690679549700201L));
                    }
                    var7_3 /* !! */  = (int)v0 /* !! */ ;
                    if (!var2_2) break block18;
                }
                var7_3 /* !! */  = (_q.a(26848, 316131877272870276L) ^ _q.a(18591, 5733899163203501214L)) / _q.a(15142, 2382776459168026258L) ^ _q.a(26325, 7469489618258711173L) ^ _q.a(2011, 5163912339322352158L);
            }
            block9: while (true) {
                switch (var7_3 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case 1554730636: {
                        var6_7 = (AABB)_q.E("tL8iECgf9y2NxjN1", next(), (Iterator)var5_6);
                        var4_5 /* !! */  = hi.a("\u00a5", (Object)var4_5 /* !! */ , (Object)var6_7, (long)1059471463466049652L);
                        if (var2_2) {
                            return var4_5 /* !! */ ;
                        }
                        ** GOTO lbl43
                    }
                    case 1554730638: {
                        throw null;
                    }
lbl43:
                    // 1 sources

                    var7_3 /* !! */  = _q.E("tL8iECgf9y2NxjN1", max(int int ), (int)_q.a(1455, 6914117144262619585L), (int)_q.a(27832, 1697417419140946229L)) ^ _q.a(12114, 2426321561984048006L);
                    continue block9;
                    case 1554730637: 
                }
                break;
            }
            break;
        }
        return var4_5 /* !! */ ;
    }

    public static uK J(Vec3 vec3, Vec3 vec32) {
        CallSite callSite = hi.a("\u00a5", (Object)vec32, (Object)vec3, (long)1082050008038634828L);
        CallSite callSite2 = hi.a("G", (double)hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L), (double)hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L), (long)903373408565700087L);
        float f = (float)hi.a("G", (double)_q.E("tL8iECgf9y2NxjN1", atan2(double double ), (double)hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L), (double)hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L)), (long)1261399724580134246L) - 90.0f;
        float f2 = (float)(-hi.a("G", (double)hi.a("G", (double)hi.a("\u00e9", (Object)callSite, (long)1294071886475894755L), (double)callSite2, (long)1143934603743867950L), (long)1261399724580134246L));
        return new uK(f, f2);
    }

    public static double K(LivingEntity livingEntity) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L);
        CallSite callSite2 = hi.a("\u00a5", (Object)livingEntity, (long)869823823966533953L);
        CallSite callSite3 = hi.a("G", (double)(hi.a("\u00e9", (Object)callSite2, (long)1065600789354078750L) - hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L)), (double)hi.a("G", (double)0.0, (double)(hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L) - hi.a("\u00e9", (Object)callSite2, (long)430137657327008003L)), (long)667573796910998930L), (long)667573796910998930L);
        CallSite callSite4 = hi.a("G", (double)(hi.a("\u00e9", (Object)callSite2, (long)797530004147152713L) - hi.a("\u00e9", (Object)callSite, (long)1294071886475894755L)), (double)hi.a("G", (double)0.0, (double)(hi.a("\u00e9", (Object)callSite, (long)1294071886475894755L) - hi.a("\u00e9", (Object)callSite2, (long)1116111677700761539L)), (long)667573796910998930L), (long)667573796910998930L);
        CallSite callSite5 = hi.a("G", (double)(hi.a("\u00e9", (Object)callSite2, (long)1242259651052261877L) - hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L)), (double)_q.E("tL8iECgf9y2NxjN1", max(double double ), (double)0.0, (double)(hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L) - hi.a("\u00e9", (Object)callSite2, (long)1166170983307000375L))), (long)667573796910998930L);
        return (double)hi.a("G", (double)(callSite3 * callSite3 + callSite4 * callSite4 + callSite5 * callSite5), (long)1236096628704034685L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static Direction F(Object[] var0) {
        var1_1 = var0[0];
        var2_2 = var0[1];
        var3_3 = Dl.t();
        var14_4 /* !! */  = hi.a("G", (int)_q.a(5480, 9085586989531078845L), (int)_q.a(22246, 5724601714186019643L), (long)834203424483934088L) ^ _q.a(19543, 6506296081439291775L);
        if (var3_3) ** GOTO lbl-1000
        switch (var14_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var4_5 = null;
                var5_6 /* !! */  = 1.7976931348623157E308;
                var7_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L);
                var8_8 = _q.E("tL8iECgf9y2NxjN1", values());
                var9_9 = ((CallSite)var8_8).length;
                var10_10 = 0;
                var14_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(_q.a(24083, 3451134090591202132L) - _q.a(22592, 756523128498908596L)), (int)_q.a(30986, 8712154619137346848L), (long)834203424483934088L) - _q.a(856, 2888736207090726771L)), (int)_q.a(23908, 7696069598205470840L), (long)834203424483934088L) - _q.a(866, 1928452356478973758L));
                if (true) ** GOTO lbl56
            }
            case 258105780: {
                throw null;
            }
        }
        block17: while (true) {
            block28: {
                block27: {
                    block26: {
                        block25: {
                            block24: {
                                block23: {
                                    var12_12 = hi.a("\u00a5", (Object)var7_7, (Object)hi.a("G", (Object)hi.a("\u00a5", (Object)((BlockPos)var1_1), (Object)var11_11, (long)531922423199390482L), (long)968425374253918917L), (long)1291060754145254714L);
                                    v0 /* !! */  = var12_12 == var5_6 /* !! */  ? 0 : (var12_12 > var5_6 /* !! */  ? 1 : -1);
                                    if (var3_3) break block23;
                                    if (v0 /* !! */  >= 0) break block24;
                                    v0 /* !! */  = (reference)(_q.a(3266, 69429090835478900L) - _q.a(2808, 3527904844158189447L) ^ _q.a(7281, 8497457181100058920L));
                                }
                                var14_4 /* !! */  = (int)v0 /* !! */ ;
                                if (!var3_3) break block25;
                            }
                            var14_4 /* !! */  = _q.a(11340, 7872863383015823617L) + _q.a(9955, 2774262270594651021L) + _q.a(25875, 6690985212066648379L);
                            if (var3_3) break block26;
                        }
                        switch (var14_4 /* !! */ ) {
                            default: {
                                if (!var3_3) break block26;
                                ** GOTO lbl-1000
                            }
                            case -64819532: lbl-1000:
                            // 2 sources

                            {
                                var4_5 = var11_11;
                                var5_6 /* !! */  = (double)var12_12;
                                if (!var3_3) break block27;
                                break block28;
                            }
                            case -64819531: 
                        }
                        throw null;
                    }
                    var14_4 /* !! */  = (hi.a("G", (int)_q.a(24995, 5530327706498618512L), (int)_q.a(18159, 425562690290873309L), (long)834203424483934088L) * _q.a(32301, 6323238387175279418L) ^ _q.a(29759, 8459378995861504424L)) + _q.a(20241, 69280608303872787L);
                    if (!var3_3) ** GOTO lbl88
                }
                var14_4 /* !! */  = (hi.a("G", (int)_q.a(24995, 5530327706498618512L), (int)_q.a(18159, 425562690290873309L), (long)834203424483934088L) * _q.a(32301, 6323238387175279418L) ^ _q.a(29759, 8459378995861504424L)) + _q.a(20241, 69280608303872787L);
                if (!var3_3) ** GOTO lbl88
                ** GOTO lbl55
            }
            block18: while (true) {
                block22: {
                    ++var10_10;
                    if (var3_3) {
                        return var4_5;
                    }
lbl55:
                    // 3 sources

                    var14_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(_q.a(6344, 2964646198442372407L) - _q.a(1799, 685410814463783448L)), (int)_q.a(14028, 5166590280119091931L), (long)834203424483934088L) - _q.a(18665, 6565722436710792608L)), (int)_q.a(30018, 4152358422726361135L), (long)834203424483934088L) - _q.a(24033, 5231474229052500241L));
lbl56:
                    // 2 sources

                    block19: while (true) {
                        switch (var14_4 /* !! */ ) {
                            default: {
                                v1 = var10_10;
                                v2 = var9_9;
                                if (var3_3) ** GOTO lbl76
                                if (v1 >= v2) ** GOTO lbl74
                                ** GOTO lbl78
                            }
                            case 65603885: {
                                var11_11 = var8_8[var10_10];
                                v3 /* !! */  = hi.a("\u00a5", (Object)((Predicate)var2_2), (Object)var11_11, (long)1216458259878311960L);
                                if (var3_3) ** GOTO lbl81
                                if (v3 /* !! */  != false) ** GOTO lbl80
                                ** GOTO lbl83
                            }
                            case 65603887: {
                                hi.a("G", (long)989880202519854622L);
                                return null;
                            }
lbl74:
                            // 1 sources

                            v1 = _q.a(9905, 202300188468122271L) * _q.a(4187, 7075016176147408138L) / _q.a(3717, 5584194432795982815L) / 4;
                            v2 = _q.a(15658, 6026625375449254050L);
lbl76:
                            // 2 sources

                            var14_4 /* !! */  = v1 + v2;
                            if (!var3_3) continue block19;
lbl78:
                            // 2 sources

                            var14_4 /* !! */  = _q.a(4973, 8397964095933589164L) + _q.a(9319, 6701375342998655351L) + _q.a(11892, 3228675965241039508L);
                            continue block19;
lbl80:
                            // 1 sources

                            v3 /* !! */  = (CallSite)(_q.a(7962, 1583337355451443953L) / _q.a(15142, 2382776459168026258L) - _q.a(13470, 1802734830791426343L));
lbl81:
                            // 2 sources

                            var14_4 /* !! */  = (int)v3 /* !! */ ;
                            if (!var3_3) break block22;
lbl83:
                            // 2 sources

                            var14_4 /* !! */  = _q.a(18301, 8084245951797850968L) * _q.a(24699, 8889664049811740058L) - _q.a(3926, 7779630407642790451L);
                            if (!var3_3) break block22;
                            ** GOTO lbl104
                            case 65603884: 
                        }
                        break;
                    }
                    return var4_5;
                }
                block20: while (true) {
                    switch (var14_4 /* !! */ ) {
                        default: {
                            if (!var3_3) break;
                            continue block17;
                        }
                        case -1144114900: {
                            continue block17;
                        }
                        case -1144114899: {
                            continue block18;
                        }
                        case -1144114898: {
                            hi.a("G", (long)659151967568421102L);
                            var14_4 /* !! */  = _q.a(20052, 2420471340424330237L) + _q.a(13400, 6165319129068896761L) - _q.a(2876, 5498416013714964280L);
                            continue block20;
                        }
                    }
lbl104:
                    // 2 sources

                    var14_4 /* !! */  = (hi.a("G", (int)_q.a(7047, 8892116199689858996L), (int)_q.a(5197, 6002192701399867825L), (long)834203424483934088L) * _q.a(19446, 1826162201547570701L) ^ _q.a(27729, 7672313305467279472L)) + _q.a(4946, 4346081605364131362L);
                }
                break;
            }
            break;
        }
    }

    public static uK r(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        double d = (Double)objectArray[1];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = d;
        objectArray2[1] = uK2;
        objectArray2[0] = hi.a("\u00e9", (Object)hi.a("j", (long)1054285254962319361L), (long)691748736029573032L);
        return hi.a("G", (Object)objectArray2, (long)605211646319506564L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3162121454291737986L;
                var6_1 = new long[440];
                var3_2 = 0;
                var4_3 = "\u00d8t9\u00a1\u0004\u00d7\u00bf\u00b7\u00e3\u0011\f\"\u00a3\u00c4\u0013]B7\u00d8\u0084WJ\u00f3\u00b5\u00f1\u001b\u00eb\u00a1\u0095\u0007\u00b5k*\u00ab\u00cf[\u0092\u0017\u008fe\u009d&\\\u00c0\u00c2\u00de\u00e7\u00ba\u00a5Y/\u000f\u00c3\u0099\u00b0#\u0017<\u00f8\u00ca[\u00ffT\f\u00eag#3\u00cc\u00920\u00f0\u00ca\u00c7\u009c\u00c4\u00ec\u00fc\u00e3\u0087\u008e\u00ec*F\b.\u00bbz\u001a\u0081\u009b\u00c7\u00ff\u00d6\u00b2\u007f\u0080MM\u00dc\u00cc\u00c5W\u00a4.Y\u00ec[=}\u00ba\u00e0\u00d9\u00c1{l\u00aa\u0095L\u00d7'k\u00dc}9=\u00bd~\\[*Y\u00df\u00b1T\r\u00ae\u00c1\u0001_\u001a\u009c\u00cftv\u009bP\u00a2\n:\u0094OO30\u0014^]\u00b5H'\u00d4\u00f7\u00c3\u00c4\u009c\u00e7T\u0081.\u00ce\u00f2I\u00d5\u00b7\u000f~\u00a3\u009c\u00f0\u0002Y\u0093\b,\u0017=tC\u001ah\u0085\u00e7\u0089T\u00c8\u00805+)3*T\u0086*[\u00f7.C\u00e85\u0088\u0080\u00cc\u00a8x\u00b5A\u009b\t\u00d2b\u00ec\u001f\u00d3a\u00be-\u00abK\u00ac\u00ca\u00b4\u00ec\u00c7\u0093\u009bE\u0089|m\r\u001eO\u00b6\u001b\u0094\u00e2\u007f\u0018\u0088_u\u00ba\u0099\u00e2dx\u008d\u0088\u00fa\u00a5\u0087\u00fa\u00c6\u0001i]0S\u0095\u0088\u00a8<+o\u001cY!]k\u00d6$\u00b0\u0017; \u00d0\u0096V\u008e\u0080|\u0082KtH\"j\u00d3x2\u008e\u00e6*_\nf\u00a4\u00ec\u00e2\u00a0R\u0000\u0018\u0086\u001e{j3}\u0018u\u00a7\u00ed\u0007\u0084G\u009b\u00d6\u0011\u0090o\u00e9\u00fb\u00bf\u0004v\u00a45\u00dd\u00cd\u00e1\u0092T\u00ac 8\u000e*;=k\u0010lw\u00bb\u00c81S\u00c5\u00e1\u00c98QQJ\u0098\u00c4K\u00bb{\u00c4\u00b3\u00c7N\u00d1\u00e3\u00a2\u00f9\u00e2\u00e7\u000b\u000f4\u00b1\u008d\b'\u0089\u0005QFzv\u00ee\u008ew\u009bH\f\u00a1\u00e0mLq\u00d8\u00b8=\u00a7d<\u00b7\u00c3)BR>$o\u00e7\u00db\u00efq\u00dc\u001c4\u00ca\u00c6\u00ec\u00eb\u00c9\u009f\u00a9W\u00f6\u0013r\u00bbrp,\u00a4\u00be\u00fe\u0012L\u009fY\u00e3P\u00b3G\u00c1\u008e\u0092\u0006\u00e9\u000b\u00af\u00b6\u00c2\u0014t\u0002 h\u00d4\u00e8\u0007$\u00cazhPJ\u00907\u00e6Q()\u00ec:\u00cf\u0093\u00c12\u00dd\u001a\u00b6/\u00d6\u00aco\u00db\u0083uB\u00eb\u00b4\u0000\u008bZ\u00ab\u00bd \u00a5\u0003B\u0084\u00ef\u00e2\u0014\u0015\u00f8.\u001c\u00cf\u00d3i\u0001\u0093\u00eaz|\u00a7q|\u00de\u00cf\u00f1\u001c\u00ce\u0081ir\u00fc`\u00deh\u0003\u00b1\u009c\u00ee\u0085i\u00ed\u00b1|\u00d5\u0018\t\u0093Gy\u001b\u00d4iy}n\u00f6\u00eaM\u0086\u008c\u00e3\u0011\u00fd\u00104\u0096{w\u00f9\u00d0\u00d7\u0085\u0091\u001e\u0092~&\u00ccr:\u0093\u00d2dc\u001c'\u00a2\u00b3\u0089\u00e6\u00c7$}\u00f8\u00a2\u0007\u0003J\u00f5J\u0082i\u0087I\u00bfb\u001c\u008cs\u007f\u00ff\u00ee\u00c4\u00ab\u00a7\u00065\u00a1L5O\u0015Q\u001fBqu\u00c8|\u00c7nTe\u00c1l\u0005\u00d3M\u00ad\u00a4\u0097p\u00c9T\u0087\u0089@\u00f6\u000b\u00b8\u00eb%\u00ce\u001d+\u008c\u00c4\u009dL\u0096\u0018{9q\u00d1\u001d\u00a0\u0081Q\u009b\u00b3\u001b\u00a1\u00f9\u00e1\u00de;`U\u0081\u009aC\u00bf\u00db\u00e7Q_X\u00ddL\u00f1Y\u0015\u00d4\u00bd$\u00c5\u0093s\u0085\u00b1\u0003\u00c4K\u0014Ec\u0088(\u0096\u0011u\u00f7x\u00c3\u000b\u00f3\u0099\u00c0j5m\u008c\u0011\u0099S:\u00e0\u00a4\u00a74\u00e4[\u0002wfY\u00cc\u00b9\u00af\u00dc\u00c0\u00c1D\u00f9\u00ef\u00e1C\u00b5\u0097\u001d<;k\u0096`}~\u00e6\u00cd\u00b6\u00dd8[\u00f6+X\u00a7:\u009c\n9\u00e1\u00ebp\\\u00d8W\u00f7\u00f0\u00c0\u00cd}`Q\u00965}\u00fd\u00d0^}\u0002\u008a\u0004u[\u0005\u00fcy^<\u0082\u00a2\u0092<\u0017\u00ad\u00f7\u009f\u00e8\u0098\u00act\u00e0\u009cd\u0096H\t\u00cd\u00b6\u00e2\u00a7\u00ab\u000b\u0095\u00c4\u00c0\u00d4j\u00f7\"H\u0085\u001a\u00b3\u00dc\u00cf\u00fe\u008b\u00abVl\u00e9\u00cf\u00a2\u00bf\u00c3\u00d3\u0093\u0006\u00b3\u00fd\u00c86\u00d5\u001b4?+\u009f\u00c9\u00ed\u008av\u0098J\u00e3@Z\u00f7\u008e*|\u00ee\u0087,\u00e5\u007f;\u00e1+TD\u0089\u00da\u0098\u00ff\u0095\r\u008f\u008cG\u00bcZ\u00d0\u00f0-\u00dbFk\u00fa\u00ce\u0097X\u0010\u00ea\u00bb\u00c4\u001f\u00db\u0089\u00d2\by\u0017\u00fb\u0003\u00d1\u00f8ZGP\u00af\u00dd\"?m\u009d\u00a4\u00d8t\u00aaQS~U\u00db\u00be\u00ed\u0019AgO;/w\u00bb\u00e9\u00da\u000b|w\u00d7e\u00c3g\n\u00d8\u00d6\u00b0N\u000e?E\u0093pv%\u001f\u00a8\u00bd\u0001}\u00b0\u00cah\u00cf\u00be\u00ebU\u00b8kL\u00ec\u0085\u00bf\u00f0\u00c0\u00f7&\u00ef^\u00f8%\u00eb\u00d5\u00c9\u00ff\u00f3\u00c3Pe\u0098f\u001f+\u00af\u00d5\"\u00e5\u00fb\u00bcP\u009e\u0085\u0019Mr\u001a/\u00b7\u00b8\u00b3g\u00d4\u00f8\u0088\u00c3\u00e8\u0084P\u008eF\u00c8\u00871\u009c\u001c\u00ff\u00b2\u00b3t=\u00be\f\u000f+P\u00d6\u00e6O\u00deYdV\u00b2*$o\u0011\u00a7\u00fc\u00da\u00c7&\u0001\u0019\u00c6\u001b\u00ea\u0011\u008a\u00bf\u00b9\u00d7\u0082tkILS\u0092\u0006R\u00c7\u0001x\u0098R\u00ee\u00e5\u00bf\u00ca\u00b99_c\u00e3\u00c1W\u00ed~\u0018\u00e0\u00cc\u00e4Sk\u0016\u00b8np\u00aa\u009e{\u001e8.\u001e?e\u008bZ\u00b8\u0001\u00c6u\u0087\u00c7(L{i\u00a8\u00a3\u00e1j)\u00e0\u00bfE3O\u00d4\u00cb\u00b6\u000f\u00cb\u0013\u00cd\u0081e9K\u00e2w\u001cA\u00f3\\\u0011\u008d)G[\u00d1\u001fp\u00c5\u0094Llu:/\u00b4\u00c3\u00e7\u0015\u00eaO\u0098\u00a2i\u00eb\u0099\u009d\u008d\u00c7t\u0003\u00a6\u0084\u00f1\u00c9\u0098\u00fa&\u00d3Gwl\u0099\u00b3\u00af'\u0014..#\u009a\u001azC\u00a0\u0006\u00d2G\u008f\u00c13\u00fa\u00cf\u009b(\u00ef\u00f5}\u008f\u00d2xW\u0093`\u00e5\u00fc\u00a8\u001a\u00f3#;>\u0092X\u0003\u00b0\u009d\u0000\u0010\u009f@c*\u00a3\u00bdaaX\u00fc\u0097\u00df\u00a4\u00c3\u00be\u0016\u00c9\u0091r\u00de\u00c2Z\u00b0\u00c0\b\u00de\u00ef\u009a\b\u00db\u00b1\u00af\u00c5S\u000e{\u00cd\u00ba|\u00dd\u00b6<\t\u0092\u008b\u009f\u0001v\u0088\u0081\u00af\u00b3;\u000e\u00f9\u00e3\u00cf\u009f\u00b8\u00b8\u00ce\u00ae\u0012\u00c2\u0016~wX\u00f0M\u00ff\u0098\u008eE\u00ab\u008d\u009bdp.\u00d7?z`\u0001\u0093\u00f8`\u00d2\u00d5\b\u00f3\b\u008aY\u000e5\u00f8\u00e2o\u00f5\u00ac\u00fa\u00b7U\u00eeL\u00f2\u00e2?hP\u00d3\u00e5eT\u00f5\u00be7O\u00ab!\u00e9-\u00bf>H\u0082\u00c3\u00ac\u00a3\u001b-\u00c5T\u0085,\u0097X\u0012?h\u00dc\u00be\u00ddT+\u00b0\u001aCV\u00b7\u00ee\u00f6\u000b\u00d2\u0003\u0013\"9\u0005\u0088\u00e9\u00f6\u001dd\u00d5\u0000\u0005\u0012\u0091)V3@\u00dc\u00e9\u00d7N\u0004_f_\u00e0\u00a4u\u0012[[k!\u00b9\u00f2\u00ad\u00fbsl\u00b9&\u008cT\u00cf\u00a2\u00a4lt\u0017c \u00ce\u00f7\u00e1\u00d8\u0004\u00f0\u0093\u00d7\u00d7\\2\u0097\u00e5\u0013\u0097\u00cc\u0019T\u008c(7y~Z\u00b9\u0083\u00b1\u00f9\u00e3G\u0089?\u00f1\u00f4%W\u00d6\u00bb\f\u00b1\u0082\u00ac\u0006h\u00846,\u00f3\u00ec\f\u0095\u00c4V\u00eaJm\u00bf\u00eb\u000eV\u009c\u00b7D\u00aa\u00b9\u00f5}\u00cd\u0014\u00c1z\u00dd\u001f\u008d.(\u00f7G\u0015\u00a4\u00dbX\u00b7\u00db]^@'\u0001 #$\u00dfW\u00b7\u00e6\u00a5\u00be6\f\u0092\u0094\u00a5\u001fKj!\u00f8a\u008fZ\u0002'F\u00c5\u00d7\u001e\u00a7d\u00bcy\u0098\u00e8_\u00a7\u00e4#\u00e7\u00f3\u0097\u00f3LS?\u00ab ;'\u00f9\u000en6\u00bc`\u001a\u007fgs\u001a\u0087\u00a7\u00fe\f*r\u0096\u00c9&wv!f\u00c5\u0007\u00bd\u008c_\u00f7e5V\u009d\u00da\u0087wM(\u00a9\u00f6\u008f\u001b\u0001\u00b6\u00df!\u0015\u00b5\u000b\u008c\u00e0\u00f0\u00a1\u0014l\u0000v\u00d3 \u00a89\u0080\u00cb\u0012\u000fD\u00d7\u0081L\n\u00ee\u00f4<T\u00fe\u0094\u00ac%_\u0099\u00bf\u00b4\u00cbP\u00bc\u001d\u00f8\u0082n_x\u00bc\t\u00f5\u00a8\nr\u0088\u00e7\u000fX\u00be(l\u00d3\u001c\u00b8=\u001f\u00b6%\u00b5\u00bb\u0082\u00c8E\u0081\u00c2\u00edE\u00ef\u0085\u000f\u00be\u00be\u00fe7\u00f7\u00939/\u00d1\r\u0016b\u007f\u00faW\n\u009d\u00b1-\u001d\u00bf\u0097\u0016\u00b8\u00bf/W\u0098E\rH\u00bd\u0012\u00c6\u00e8\u00a2\u00ac]\u00cb-\u00af\u00c5|\u00e7+e\u0099\u008eQ\u00df\u0011/7\u00da_e\u0092\u001b\u00989\u00b8\u00a6\u0014\u00191\u00caq\u00eaY\u00d3\u00d5\u00ef\u001d\u00fcC\u00d7?\u0084\u0005\u00b5\u00ad\u00e5\u00d6\u0001-%\u009c\u00c9F\u00a5t\u00b4\u00d9j;\u00a7\u000f\u00e7\u00c7x\u00d1*\u0000T\u0095U\u00cd\u00af\u007f\u00b6Y4\u0095\u00af\u008a3\u001a\u008d:\u00ccI\u00e8\u001e\u00dd\u00dbk;\u00abF\u00f9\u00e7\u00a9\u00ea\b\u00dd\u00d4ga6\u00ba\u0014\u001bFg\u00e4\u00ab\u009d_\u00f8\u00df\u0089u\u00f3g$\u0017\u008d\u0017\u0086\u00f0F\u00a2\u0093\u0006W\u0088)\u0081G[\u008e\u00d0\u0019]\u008at\u0018o5%\u009a\u0017g\u00f6\u001c\u007f\u00d12\u00dd<\u00b3\u0097\u00113\u00c9\u00d6j\u00c4\u0000\u00ffZ\u00ff\u00e3\u00d3&a\u00f2\u00b4\u00a1\u00fa\u001bS\u00ea\u000bw\u0091e7#r\u00ba\u008e\u00b9\u00d7e\u00e7\u008dL&\u00d8\u001e\u00f6\u0016\u008f|H\u0086_\u0012\u00d4\u0096\u0016\u00f5\u00b3Nw\t\"q\u00berf\u00cc]\u00ac\u0014lWV\u00a6\u0080\u0019\u0086\u00be\u00cfn\u00beF\u0014\u00bd\\\u000fw\u008c\u0006[=m]\u0011\u00a7Jw\u009fW\u0084s\u00f7\u00af\u00c7\u00f8\u00b1\u00c0\r\u0017rG\u00fa\u00b6k\u000e(\u0081\u00fa\u00f5U\u009c\u0015\u00fb\u00dfd\u00d8\u00ec\u0098\u0017*\u00b2\u00b3\u00d6Y\u00be3A\u00ac\u0084#9\r7\u009c\u0015\r\u008a\u009c\u0080\u00c7\u00ae\u00c7R\u00ae\u00d9\u00f3\u0093\u00e8\u00c8\u0013 \u008f\u00cd\u0001\u00b6\u00c8+z\u00b6\u00eb+\u0080\"\u0015Cb\u0083E=},1\u008fY\u00fa\u00f0B,^E*\u00e6\u00b5\u00c0\u00a99\u00e2\r\u00bc}Q}\u00d1\u0015k\u00c1\u0005\u0014\u00d9\u0098\u00fb\u0083\u00c0L$<\u00c6}f\u00b1yD\u00cdN\u0083\u00908\u00e1\u00d3\u00f3a,7I\u00aeiEFk\u00eae\u0083\u0019\u00f6r\u009fL \u00acq\u001c\u0010\u00c3a\u00b8H\u0006\u00a3M)\u0085\u000f\u00188\u0011\u007f\u00f0\u000bB\u0082U\u009a \u00ce\u00b8o\u0097\u0087.z\u0014\u0000\u00fb\u0094](\u00ad\u00900\u00e9~;\u0088\u00d9\u00db\u001b|\u00ad\u00cc\u00ff\u00ed\u000b\u00fb\u00f6\u0092\u0095\u0083\u0014\u00dff\u00b3\u00ec\u001e\u001e\u0012\u00d6\u00a3$d\u00f6x|\u00e6\u0001\u00f922\u00a0\u000bGx\u00e2\u00a4\u00a7/\u00e8\u009f\u0085\u00a3]\u00e8\u00a6f\u009c\u00f5jn\u00b5\u00d1\u0086e\u00c5\u0001AQ+z\u00f4!(\u00fd\u00a7\u0013\u009dO\u00e9\u00b6r8\u008fI\u00f2\u00ed\u00004\u008d\u00f1\u00daD\u00e4\u00d4\u0085\u009e\u00b5\u00ec\u00c5\u00c3\u0091\u00be\u0083\u00b4\u0093\u00c1\u00eb\u00b8\u00d9M\u00de\u00c8\u00e1Gd\u00df\u001fb\u0088x\u00ce\u00e4\u00a7>\u0011:m\u00e1\u001cOf\u00bdDZ\u00cdm\u00161g\u00ab\u0000\u00aag\u001e\u00ef\u00f3\u00b7\u001f#R\u00a3\u0014\u00c7\u00a7q\u00f1\u009ay\u0017\u000b\u0088^\u008b\u00b44\u00b5\u00d9W4\u009dm\u001ce\u0096\u00f5\u00be\u009dV\u0080\u00b0\u00b0\u00c4\u0010\u0080\u00be\u00ea\u00cf\t-\u009b?\u0096\u00eeB\u00a2\u0090='w\u00cc\u00ac$\u00a3\u008b9\u00ec\u00d9.\u00few\u0000\u00a6\u00c8\u00fb7\u0019\u00b7b\u00d5]<\u00b2O+\u00cd5\u00f8\u0087n\u0017\u00ee\u009ez\u0094\u00a4\u00cf\u00f4\u00aa\u00f1\u0080\u00818\u00ce\u0000\u00a5ly'\u00d5,\u00ed\u009b6\u00e2\u001d\u009e\u0002~\u00bbz\u009e\u0099FN\u00b9\u0086O\u0014\u00cc]\u00e8(.%\u00e5\u0094:\u00ec\u0010\u0012\u00e0\u00cc\u001dE\u00d5\u00cb\u0012f\u00f7YW\u0014\u0093\u00ea\u0099k\u00c0\u00f0\u0016\u0081\u00f3Q\u00a2>\u0005\u00c8-m\u00bd\u0087\\\u00f5\u00ea|e\u00d6j\u00f3*\u0018\u00c8\u0093\u00ae:\u00e43V\u00f4\u00f9\u00bf%6\u0019dq?\u00db\u00ae\u0084[*g9{\u00b7\u00fd\u00c0\u00adV\u00f9\u00df\u00ff\u00e2\u00b6\u0084\u00b9\u0093\u00be\u0011\u000f\u00ba\u00b1\u000e\u0016\u00ee\u00d1\u0089\u001d\u00eb\u00ec\u00b2\ff\u00bd\u001c\u00d8!\u0018\u00a2p*'\u0082{<\"\u00c0\u00c4\u00e3\u00f1\u00b2\u0011\u00e6\u0084\u00b6I\u0082\u00d3if\u000e$N\u00b4\u00acN\\\u00c6\u0087\u00943xI\u00b4\u0095eP\u00b6\u0095\u00b1\u00faF\u00cap\u00ee\u009b\u00ae!>\u00bc\u0014\u00fe\u00eavez\u0089\u00cc\u0003e|\u00a8a\u0081N\u00945APe\u00912\u00ea \u00e2\u00d7[\u00e1\u00be\b\u008a\u008b^.\n\u0092\u00e1\u00b6\u00bb\u00ec\u00ba\u00c4\u0002\u0005\u0089\u00d4\u00a3\u0002\u00b1\u00c7\u007fqC*\u001e\u00de\u0016J\u00fb\u00d5\u00fe$K\u00f8\u00f3\u0010&\u00b3T\u00ce\u00db\u00b5\u00c8\u0001\u00fe\u00f8\u00a0p\u00f7\u00e0\u00db\u00be\t5\u00fc\u00ca\u00a7XX\u00f1\u009aUtuIXul\u00e7\u0006\u0000-x\u0085\u00a0/\u00cb4F\u0016\u0087Y\u00cb\u00f00\u009f\u0011\u0010\u0080wWe#!\u00a5u\u0089\u0083\u00f5#\u00eaj\u00cd|\u00e2\u0015\f\u00ceKM\u00cd(h\u009f\u00f4\u00cb\u00e3\u00a5U\u0001\u00fe\f8\u00f1\u00e2C\u0087H&/!\u00f4*#\u00ea)`\u00e6s\u00d1zes@K\u0085\u008cZ\u001d\u00ea\u00d0fc`\u00cd\u00cc\u0090nBF\u0000\u00a0\u00c64\u00ed\u0086)R\u00bc\u00b8\u008b\u00d2\u00b8\u0004\u0085\u0017\u00f1\u001f\"\u0006\u00c5/\t\u00cc\u0012E\u00b2cw\u00bb\u0099L\u00a2\u00d1\u00d7t\u0092\u0012l\u0094\u00d1`\u00f2\u0012\u00f9\u00d4\u00b7ml\u0010\u00c0 \u009a\u00a8GQ\u0093\u0018\u00daJ\u009c\u00e1\u00054\u009e2c}I\n\u00c6\u00ed\u0000\n\u0019/@%bI\u0007\u0011B^\u0096\u00fc`[\u00f7\u0013g!\u00f7a:\u00e6\u008f\u00fe\u00f2\u0016\u000b\r_:\u00f9C\u009c%\u00d0\u001b\u008e\u00fa\u00f6\u00be\u00ba\u00bfw\u0016\u00ff\u0000\u00d3\u0003\u0090\u007f\u00ea\u00f56\u00cd\u00ce\u00bbk\u008e\u00c8\u00104s\u00a6o\u0012\u0006n\u00d5\u00f7\n\u00ca\u00aei\u00f2*\u00e8\u009a\u00fd\u00cd\u0080Mc\u00a0\u00bd\u001d\u000f\u001a^\u0002/q\u00b7\u00c4O\nR\u00baR\u00da\u00ffn\u00bb%\u00db\u00a4\u00cf{ \u00ee\u00abm\u0004C\u0082KaZ\u0000\u0094\u00f9\u0098\u00d3\u00ec^\u00d8\u00dbb]\u00cc\u0011\u000bR\u0084rp\u00e3\u00b7m\u0013]/\u00bf$o\u0093Jn[C=\u009b\u00d9\u00e9\u00e3\u00c8}*m\u009c\\W\u000f\n\u00e8<\fCn\u00d0'v\u0095\u00c0\u00de\u00b2\u00dd3d\u00da\u0087q\u0087<\u00c3\u00f9\u007f\u00d2\u001d\u0017;\u00d5\u00c0ZF\u00bf\u00fe@\t\u0010;\u007f3\u00fa|aV\u00ea(\u00e9\u008b\u00bai\u007f\u00ce\u008f\u00b0b\u009f\u0003o\u0098F\u00b1\u00bd\u00d1\u00ac\u00fa\u00f0\u00e2\u001d\\\u00ee\nV]K\u00aa\u0081C\u00c3\u00d0\u0002\u00e8\u00dc*\u00cd\u00df\u00ea\u00e9\u0085\u00f9\u00f4\u001e\u00f4*\u00e8\u00d5\u00dd\u0010\u00a8\u00cf\u000f\u009a\u00052\u00cc\u00b1\u00bcY\u00a6\u0013\u00a0\u00a7\u00a4 p7\nJ\u00ae\u00a4\u00f9o\u001a\u0016\u0096\u008e\u0091\u00c1\u00b8 \u00b6E\u0016\u00ab~\u00fc,\u00f2\u00ffn\u00a8\u00d7\u001d\u00a1+\u00d4\u00053]\u00cdc\u00f1H\u00eb\u00c1\u00ec\"tH\u0092\u0083B\u00e5\u00e9_f\u00c8!\u0014q1\u0014\u001e\u008c\u001a\u00fc!\u0013\u00a1w\u0082\f7\u0090A\u00e7P$\u00b0e\u00d4\u008b\u009d\u0082\u00aaGY\u0010L\u00f9\u00e4\u0085\u00e9\u00e6J)\u00ab\u0098\u000b_f\u00926y\u00e4\u00ff\u00dbm\u000e\u0019G\u00ba\u000b\u00cf7\u00a8j\u00ea\u00f7.\u00c0\u00dc%\u00aa\u001c]\u00c17 \u00c4Pyj\\\u00ebYW~Jli\u00bc\u0088\u0087\u00bb]\u0016\u009e\u00882cc%\u00e2\u00f1r$\u00e4\u00e1I\u00e1\u0083\u00d9\u00a4<tk\u00ac\u009f\u00e7\u00c1F\u00b8\u001d\u00d2\u00c5xp#\u00c6\u00ea\u00f7F\u000eR\u00c4\u0019\u00cdB\u0097i\b+\u00ado\u00c0&qx+bt(+x\u00a15\u00b6\\Q\u00bb\u00cdGs4\u00e6\u0093\u00ed\u00e7\u00901\"\u00fe\u00da(\u00d1(\u0092hrGLA\u0084\u00e5\u0013)\u00d9X/\u008a}\u008a\u00dd\u00ea/\u00fc\u00d2\u00e0\u00e9\u00e0I\u00c9s\u0004\u00bbX\u00a3\nCH\u007f\u0018\u00edK\u0090\u008f\u000f\u00fbm\u00b4\u009f\u009f^@\u00f5\u0014\u00e7\u00f5B\u0007\u0017\nB^Y!Ck\tPOp\u0094L\u00deI1\u00a44\u00d2\u0017\u00fb\u00ac+\u009f\u00d2\u0005H\u00ed\u00b3$\u0012\u0082l\\Y\u00b9\u001b\u00f9@\u0090(\u00e2_k;`bf\u00dd\b\u008d\u00fc>MI";
                var5_4 = "\u00d8t9\u00a1\u0004\u00d7\u00bf\u00b7\u00e3\u0011\f\"\u00a3\u00c4\u0013]B7\u00d8\u0084WJ\u00f3\u00b5\u00f1\u001b\u00eb\u00a1\u0095\u0007\u00b5k*\u00ab\u00cf[\u0092\u0017\u008fe\u009d&\\\u00c0\u00c2\u00de\u00e7\u00ba\u00a5Y/\u000f\u00c3\u0099\u00b0#\u0017<\u00f8\u00ca[\u00ffT\f\u00eag#3\u00cc\u00920\u00f0\u00ca\u00c7\u009c\u00c4\u00ec\u00fc\u00e3\u0087\u008e\u00ec*F\b.\u00bbz\u001a\u0081\u009b\u00c7\u00ff\u00d6\u00b2\u007f\u0080MM\u00dc\u00cc\u00c5W\u00a4.Y\u00ec[=}\u00ba\u00e0\u00d9\u00c1{l\u00aa\u0095L\u00d7'k\u00dc}9=\u00bd~\\[*Y\u00df\u00b1T\r\u00ae\u00c1\u0001_\u001a\u009c\u00cftv\u009bP\u00a2\n:\u0094OO30\u0014^]\u00b5H'\u00d4\u00f7\u00c3\u00c4\u009c\u00e7T\u0081.\u00ce\u00f2I\u00d5\u00b7\u000f~\u00a3\u009c\u00f0\u0002Y\u0093\b,\u0017=tC\u001ah\u0085\u00e7\u0089T\u00c8\u00805+)3*T\u0086*[\u00f7.C\u00e85\u0088\u0080\u00cc\u00a8x\u00b5A\u009b\t\u00d2b\u00ec\u001f\u00d3a\u00be-\u00abK\u00ac\u00ca\u00b4\u00ec\u00c7\u0093\u009bE\u0089|m\r\u001eO\u00b6\u001b\u0094\u00e2\u007f\u0018\u0088_u\u00ba\u0099\u00e2dx\u008d\u0088\u00fa\u00a5\u0087\u00fa\u00c6\u0001i]0S\u0095\u0088\u00a8<+o\u001cY!]k\u00d6$\u00b0\u0017; \u00d0\u0096V\u008e\u0080|\u0082KtH\"j\u00d3x2\u008e\u00e6*_\nf\u00a4\u00ec\u00e2\u00a0R\u0000\u0018\u0086\u001e{j3}\u0018u\u00a7\u00ed\u0007\u0084G\u009b\u00d6\u0011\u0090o\u00e9\u00fb\u00bf\u0004v\u00a45\u00dd\u00cd\u00e1\u0092T\u00ac 8\u000e*;=k\u0010lw\u00bb\u00c81S\u00c5\u00e1\u00c98QQJ\u0098\u00c4K\u00bb{\u00c4\u00b3\u00c7N\u00d1\u00e3\u00a2\u00f9\u00e2\u00e7\u000b\u000f4\u00b1\u008d\b'\u0089\u0005QFzv\u00ee\u008ew\u009bH\f\u00a1\u00e0mLq\u00d8\u00b8=\u00a7d<\u00b7\u00c3)BR>$o\u00e7\u00db\u00efq\u00dc\u001c4\u00ca\u00c6\u00ec\u00eb\u00c9\u009f\u00a9W\u00f6\u0013r\u00bbrp,\u00a4\u00be\u00fe\u0012L\u009fY\u00e3P\u00b3G\u00c1\u008e\u0092\u0006\u00e9\u000b\u00af\u00b6\u00c2\u0014t\u0002 h\u00d4\u00e8\u0007$\u00cazhPJ\u00907\u00e6Q()\u00ec:\u00cf\u0093\u00c12\u00dd\u001a\u00b6/\u00d6\u00aco\u00db\u0083uB\u00eb\u00b4\u0000\u008bZ\u00ab\u00bd \u00a5\u0003B\u0084\u00ef\u00e2\u0014\u0015\u00f8.\u001c\u00cf\u00d3i\u0001\u0093\u00eaz|\u00a7q|\u00de\u00cf\u00f1\u001c\u00ce\u0081ir\u00fc`\u00deh\u0003\u00b1\u009c\u00ee\u0085i\u00ed\u00b1|\u00d5\u0018\t\u0093Gy\u001b\u00d4iy}n\u00f6\u00eaM\u0086\u008c\u00e3\u0011\u00fd\u00104\u0096{w\u00f9\u00d0\u00d7\u0085\u0091\u001e\u0092~&\u00ccr:\u0093\u00d2dc\u001c'\u00a2\u00b3\u0089\u00e6\u00c7$}\u00f8\u00a2\u0007\u0003J\u00f5J\u0082i\u0087I\u00bfb\u001c\u008cs\u007f\u00ff\u00ee\u00c4\u00ab\u00a7\u00065\u00a1L5O\u0015Q\u001fBqu\u00c8|\u00c7nTe\u00c1l\u0005\u00d3M\u00ad\u00a4\u0097p\u00c9T\u0087\u0089@\u00f6\u000b\u00b8\u00eb%\u00ce\u001d+\u008c\u00c4\u009dL\u0096\u0018{9q\u00d1\u001d\u00a0\u0081Q\u009b\u00b3\u001b\u00a1\u00f9\u00e1\u00de;`U\u0081\u009aC\u00bf\u00db\u00e7Q_X\u00ddL\u00f1Y\u0015\u00d4\u00bd$\u00c5\u0093s\u0085\u00b1\u0003\u00c4K\u0014Ec\u0088(\u0096\u0011u\u00f7x\u00c3\u000b\u00f3\u0099\u00c0j5m\u008c\u0011\u0099S:\u00e0\u00a4\u00a74\u00e4[\u0002wfY\u00cc\u00b9\u00af\u00dc\u00c0\u00c1D\u00f9\u00ef\u00e1C\u00b5\u0097\u001d<;k\u0096`}~\u00e6\u00cd\u00b6\u00dd8[\u00f6+X\u00a7:\u009c\n9\u00e1\u00ebp\\\u00d8W\u00f7\u00f0\u00c0\u00cd}`Q\u00965}\u00fd\u00d0^}\u0002\u008a\u0004u[\u0005\u00fcy^<\u0082\u00a2\u0092<\u0017\u00ad\u00f7\u009f\u00e8\u0098\u00act\u00e0\u009cd\u0096H\t\u00cd\u00b6\u00e2\u00a7\u00ab\u000b\u0095\u00c4\u00c0\u00d4j\u00f7\"H\u0085\u001a\u00b3\u00dc\u00cf\u00fe\u008b\u00abVl\u00e9\u00cf\u00a2\u00bf\u00c3\u00d3\u0093\u0006\u00b3\u00fd\u00c86\u00d5\u001b4?+\u009f\u00c9\u00ed\u008av\u0098J\u00e3@Z\u00f7\u008e*|\u00ee\u0087,\u00e5\u007f;\u00e1+TD\u0089\u00da\u0098\u00ff\u0095\r\u008f\u008cG\u00bcZ\u00d0\u00f0-\u00dbFk\u00fa\u00ce\u0097X\u0010\u00ea\u00bb\u00c4\u001f\u00db\u0089\u00d2\by\u0017\u00fb\u0003\u00d1\u00f8ZGP\u00af\u00dd\"?m\u009d\u00a4\u00d8t\u00aaQS~U\u00db\u00be\u00ed\u0019AgO;/w\u00bb\u00e9\u00da\u000b|w\u00d7e\u00c3g\n\u00d8\u00d6\u00b0N\u000e?E\u0093pv%\u001f\u00a8\u00bd\u0001}\u00b0\u00cah\u00cf\u00be\u00ebU\u00b8kL\u00ec\u0085\u00bf\u00f0\u00c0\u00f7&\u00ef^\u00f8%\u00eb\u00d5\u00c9\u00ff\u00f3\u00c3Pe\u0098f\u001f+\u00af\u00d5\"\u00e5\u00fb\u00bcP\u009e\u0085\u0019Mr\u001a/\u00b7\u00b8\u00b3g\u00d4\u00f8\u0088\u00c3\u00e8\u0084P\u008eF\u00c8\u00871\u009c\u001c\u00ff\u00b2\u00b3t=\u00be\f\u000f+P\u00d6\u00e6O\u00deYdV\u00b2*$o\u0011\u00a7\u00fc\u00da\u00c7&\u0001\u0019\u00c6\u001b\u00ea\u0011\u008a\u00bf\u00b9\u00d7\u0082tkILS\u0092\u0006R\u00c7\u0001x\u0098R\u00ee\u00e5\u00bf\u00ca\u00b99_c\u00e3\u00c1W\u00ed~\u0018\u00e0\u00cc\u00e4Sk\u0016\u00b8np\u00aa\u009e{\u001e8.\u001e?e\u008bZ\u00b8\u0001\u00c6u\u0087\u00c7(L{i\u00a8\u00a3\u00e1j)\u00e0\u00bfE3O\u00d4\u00cb\u00b6\u000f\u00cb\u0013\u00cd\u0081e9K\u00e2w\u001cA\u00f3\\\u0011\u008d)G[\u00d1\u001fp\u00c5\u0094Llu:/\u00b4\u00c3\u00e7\u0015\u00eaO\u0098\u00a2i\u00eb\u0099\u009d\u008d\u00c7t\u0003\u00a6\u0084\u00f1\u00c9\u0098\u00fa&\u00d3Gwl\u0099\u00b3\u00af'\u0014..#\u009a\u001azC\u00a0\u0006\u00d2G\u008f\u00c13\u00fa\u00cf\u009b(\u00ef\u00f5}\u008f\u00d2xW\u0093`\u00e5\u00fc\u00a8\u001a\u00f3#;>\u0092X\u0003\u00b0\u009d\u0000\u0010\u009f@c*\u00a3\u00bdaaX\u00fc\u0097\u00df\u00a4\u00c3\u00be\u0016\u00c9\u0091r\u00de\u00c2Z\u00b0\u00c0\b\u00de\u00ef\u009a\b\u00db\u00b1\u00af\u00c5S\u000e{\u00cd\u00ba|\u00dd\u00b6<\t\u0092\u008b\u009f\u0001v\u0088\u0081\u00af\u00b3;\u000e\u00f9\u00e3\u00cf\u009f\u00b8\u00b8\u00ce\u00ae\u0012\u00c2\u0016~wX\u00f0M\u00ff\u0098\u008eE\u00ab\u008d\u009bdp.\u00d7?z`\u0001\u0093\u00f8`\u00d2\u00d5\b\u00f3\b\u008aY\u000e5\u00f8\u00e2o\u00f5\u00ac\u00fa\u00b7U\u00eeL\u00f2\u00e2?hP\u00d3\u00e5eT\u00f5\u00be7O\u00ab!\u00e9-\u00bf>H\u0082\u00c3\u00ac\u00a3\u001b-\u00c5T\u0085,\u0097X\u0012?h\u00dc\u00be\u00ddT+\u00b0\u001aCV\u00b7\u00ee\u00f6\u000b\u00d2\u0003\u0013\"9\u0005\u0088\u00e9\u00f6\u001dd\u00d5\u0000\u0005\u0012\u0091)V3@\u00dc\u00e9\u00d7N\u0004_f_\u00e0\u00a4u\u0012[[k!\u00b9\u00f2\u00ad\u00fbsl\u00b9&\u008cT\u00cf\u00a2\u00a4lt\u0017c \u00ce\u00f7\u00e1\u00d8\u0004\u00f0\u0093\u00d7\u00d7\\2\u0097\u00e5\u0013\u0097\u00cc\u0019T\u008c(7y~Z\u00b9\u0083\u00b1\u00f9\u00e3G\u0089?\u00f1\u00f4%W\u00d6\u00bb\f\u00b1\u0082\u00ac\u0006h\u00846,\u00f3\u00ec\f\u0095\u00c4V\u00eaJm\u00bf\u00eb\u000eV\u009c\u00b7D\u00aa\u00b9\u00f5}\u00cd\u0014\u00c1z\u00dd\u001f\u008d.(\u00f7G\u0015\u00a4\u00dbX\u00b7\u00db]^@'\u0001 #$\u00dfW\u00b7\u00e6\u00a5\u00be6\f\u0092\u0094\u00a5\u001fKj!\u00f8a\u008fZ\u0002'F\u00c5\u00d7\u001e\u00a7d\u00bcy\u0098\u00e8_\u00a7\u00e4#\u00e7\u00f3\u0097\u00f3LS?\u00ab ;'\u00f9\u000en6\u00bc`\u001a\u007fgs\u001a\u0087\u00a7\u00fe\f*r\u0096\u00c9&wv!f\u00c5\u0007\u00bd\u008c_\u00f7e5V\u009d\u00da\u0087wM(\u00a9\u00f6\u008f\u001b\u0001\u00b6\u00df!\u0015\u00b5\u000b\u008c\u00e0\u00f0\u00a1\u0014l\u0000v\u00d3 \u00a89\u0080\u00cb\u0012\u000fD\u00d7\u0081L\n\u00ee\u00f4<T\u00fe\u0094\u00ac%_\u0099\u00bf\u00b4\u00cbP\u00bc\u001d\u00f8\u0082n_x\u00bc\t\u00f5\u00a8\nr\u0088\u00e7\u000fX\u00be(l\u00d3\u001c\u00b8=\u001f\u00b6%\u00b5\u00bb\u0082\u00c8E\u0081\u00c2\u00edE\u00ef\u0085\u000f\u00be\u00be\u00fe7\u00f7\u00939/\u00d1\r\u0016b\u007f\u00faW\n\u009d\u00b1-\u001d\u00bf\u0097\u0016\u00b8\u00bf/W\u0098E\rH\u00bd\u0012\u00c6\u00e8\u00a2\u00ac]\u00cb-\u00af\u00c5|\u00e7+e\u0099\u008eQ\u00df\u0011/7\u00da_e\u0092\u001b\u00989\u00b8\u00a6\u0014\u00191\u00caq\u00eaY\u00d3\u00d5\u00ef\u001d\u00fcC\u00d7?\u0084\u0005\u00b5\u00ad\u00e5\u00d6\u0001-%\u009c\u00c9F\u00a5t\u00b4\u00d9j;\u00a7\u000f\u00e7\u00c7x\u00d1*\u0000T\u0095U\u00cd\u00af\u007f\u00b6Y4\u0095\u00af\u008a3\u001a\u008d:\u00ccI\u00e8\u001e\u00dd\u00dbk;\u00abF\u00f9\u00e7\u00a9\u00ea\b\u00dd\u00d4ga6\u00ba\u0014\u001bFg\u00e4\u00ab\u009d_\u00f8\u00df\u0089u\u00f3g$\u0017\u008d\u0017\u0086\u00f0F\u00a2\u0093\u0006W\u0088)\u0081G[\u008e\u00d0\u0019]\u008at\u0018o5%\u009a\u0017g\u00f6\u001c\u007f\u00d12\u00dd<\u00b3\u0097\u00113\u00c9\u00d6j\u00c4\u0000\u00ffZ\u00ff\u00e3\u00d3&a\u00f2\u00b4\u00a1\u00fa\u001bS\u00ea\u000bw\u0091e7#r\u00ba\u008e\u00b9\u00d7e\u00e7\u008dL&\u00d8\u001e\u00f6\u0016\u008f|H\u0086_\u0012\u00d4\u0096\u0016\u00f5\u00b3Nw\t\"q\u00berf\u00cc]\u00ac\u0014lWV\u00a6\u0080\u0019\u0086\u00be\u00cfn\u00beF\u0014\u00bd\\\u000fw\u008c\u0006[=m]\u0011\u00a7Jw\u009fW\u0084s\u00f7\u00af\u00c7\u00f8\u00b1\u00c0\r\u0017rG\u00fa\u00b6k\u000e(\u0081\u00fa\u00f5U\u009c\u0015\u00fb\u00dfd\u00d8\u00ec\u0098\u0017*\u00b2\u00b3\u00d6Y\u00be3A\u00ac\u0084#9\r7\u009c\u0015\r\u008a\u009c\u0080\u00c7\u00ae\u00c7R\u00ae\u00d9\u00f3\u0093\u00e8\u00c8\u0013 \u008f\u00cd\u0001\u00b6\u00c8+z\u00b6\u00eb+\u0080\"\u0015Cb\u0083E=},1\u008fY\u00fa\u00f0B,^E*\u00e6\u00b5\u00c0\u00a99\u00e2\r\u00bc}Q}\u00d1\u0015k\u00c1\u0005\u0014\u00d9\u0098\u00fb\u0083\u00c0L$<\u00c6}f\u00b1yD\u00cdN\u0083\u00908\u00e1\u00d3\u00f3a,7I\u00aeiEFk\u00eae\u0083\u0019\u00f6r\u009fL \u00acq\u001c\u0010\u00c3a\u00b8H\u0006\u00a3M)\u0085\u000f\u00188\u0011\u007f\u00f0\u000bB\u0082U\u009a \u00ce\u00b8o\u0097\u0087.z\u0014\u0000\u00fb\u0094](\u00ad\u00900\u00e9~;\u0088\u00d9\u00db\u001b|\u00ad\u00cc\u00ff\u00ed\u000b\u00fb\u00f6\u0092\u0095\u0083\u0014\u00dff\u00b3\u00ec\u001e\u001e\u0012\u00d6\u00a3$d\u00f6x|\u00e6\u0001\u00f922\u00a0\u000bGx\u00e2\u00a4\u00a7/\u00e8\u009f\u0085\u00a3]\u00e8\u00a6f\u009c\u00f5jn\u00b5\u00d1\u0086e\u00c5\u0001AQ+z\u00f4!(\u00fd\u00a7\u0013\u009dO\u00e9\u00b6r8\u008fI\u00f2\u00ed\u00004\u008d\u00f1\u00daD\u00e4\u00d4\u0085\u009e\u00b5\u00ec\u00c5\u00c3\u0091\u00be\u0083\u00b4\u0093\u00c1\u00eb\u00b8\u00d9M\u00de\u00c8\u00e1Gd\u00df\u001fb\u0088x\u00ce\u00e4\u00a7>\u0011:m\u00e1\u001cOf\u00bdDZ\u00cdm\u00161g\u00ab\u0000\u00aag\u001e\u00ef\u00f3\u00b7\u001f#R\u00a3\u0014\u00c7\u00a7q\u00f1\u009ay\u0017\u000b\u0088^\u008b\u00b44\u00b5\u00d9W4\u009dm\u001ce\u0096\u00f5\u00be\u009dV\u0080\u00b0\u00b0\u00c4\u0010\u0080\u00be\u00ea\u00cf\t-\u009b?\u0096\u00eeB\u00a2\u0090='w\u00cc\u00ac$\u00a3\u008b9\u00ec\u00d9.\u00few\u0000\u00a6\u00c8\u00fb7\u0019\u00b7b\u00d5]<\u00b2O+\u00cd5\u00f8\u0087n\u0017\u00ee\u009ez\u0094\u00a4\u00cf\u00f4\u00aa\u00f1\u0080\u00818\u00ce\u0000\u00a5ly'\u00d5,\u00ed\u009b6\u00e2\u001d\u009e\u0002~\u00bbz\u009e\u0099FN\u00b9\u0086O\u0014\u00cc]\u00e8(.%\u00e5\u0094:\u00ec\u0010\u0012\u00e0\u00cc\u001dE\u00d5\u00cb\u0012f\u00f7YW\u0014\u0093\u00ea\u0099k\u00c0\u00f0\u0016\u0081\u00f3Q\u00a2>\u0005\u00c8-m\u00bd\u0087\\\u00f5\u00ea|e\u00d6j\u00f3*\u0018\u00c8\u0093\u00ae:\u00e43V\u00f4\u00f9\u00bf%6\u0019dq?\u00db\u00ae\u0084[*g9{\u00b7\u00fd\u00c0\u00adV\u00f9\u00df\u00ff\u00e2\u00b6\u0084\u00b9\u0093\u00be\u0011\u000f\u00ba\u00b1\u000e\u0016\u00ee\u00d1\u0089\u001d\u00eb\u00ec\u00b2\ff\u00bd\u001c\u00d8!\u0018\u00a2p*'\u0082{<\"\u00c0\u00c4\u00e3\u00f1\u00b2\u0011\u00e6\u0084\u00b6I\u0082\u00d3if\u000e$N\u00b4\u00acN\\\u00c6\u0087\u00943xI\u00b4\u0095eP\u00b6\u0095\u00b1\u00faF\u00cap\u00ee\u009b\u00ae!>\u00bc\u0014\u00fe\u00eavez\u0089\u00cc\u0003e|\u00a8a\u0081N\u00945APe\u00912\u00ea \u00e2\u00d7[\u00e1\u00be\b\u008a\u008b^.\n\u0092\u00e1\u00b6\u00bb\u00ec\u00ba\u00c4\u0002\u0005\u0089\u00d4\u00a3\u0002\u00b1\u00c7\u007fqC*\u001e\u00de\u0016J\u00fb\u00d5\u00fe$K\u00f8\u00f3\u0010&\u00b3T\u00ce\u00db\u00b5\u00c8\u0001\u00fe\u00f8\u00a0p\u00f7\u00e0\u00db\u00be\t5\u00fc\u00ca\u00a7XX\u00f1\u009aUtuIXul\u00e7\u0006\u0000-x\u0085\u00a0/\u00cb4F\u0016\u0087Y\u00cb\u00f00\u009f\u0011\u0010\u0080wWe#!\u00a5u\u0089\u0083\u00f5#\u00eaj\u00cd|\u00e2\u0015\f\u00ceKM\u00cd(h\u009f\u00f4\u00cb\u00e3\u00a5U\u0001\u00fe\f8\u00f1\u00e2C\u0087H&/!\u00f4*#\u00ea)`\u00e6s\u00d1zes@K\u0085\u008cZ\u001d\u00ea\u00d0fc`\u00cd\u00cc\u0090nBF\u0000\u00a0\u00c64\u00ed\u0086)R\u00bc\u00b8\u008b\u00d2\u00b8\u0004\u0085\u0017\u00f1\u001f\"\u0006\u00c5/\t\u00cc\u0012E\u00b2cw\u00bb\u0099L\u00a2\u00d1\u00d7t\u0092\u0012l\u0094\u00d1`\u00f2\u0012\u00f9\u00d4\u00b7ml\u0010\u00c0 \u009a\u00a8GQ\u0093\u0018\u00daJ\u009c\u00e1\u00054\u009e2c}I\n\u00c6\u00ed\u0000\n\u0019/@%bI\u0007\u0011B^\u0096\u00fc`[\u00f7\u0013g!\u00f7a:\u00e6\u008f\u00fe\u00f2\u0016\u000b\r_:\u00f9C\u009c%\u00d0\u001b\u008e\u00fa\u00f6\u00be\u00ba\u00bfw\u0016\u00ff\u0000\u00d3\u0003\u0090\u007f\u00ea\u00f56\u00cd\u00ce\u00bbk\u008e\u00c8\u00104s\u00a6o\u0012\u0006n\u00d5\u00f7\n\u00ca\u00aei\u00f2*\u00e8\u009a\u00fd\u00cd\u0080Mc\u00a0\u00bd\u001d\u000f\u001a^\u0002/q\u00b7\u00c4O\nR\u00baR\u00da\u00ffn\u00bb%\u00db\u00a4\u00cf{ \u00ee\u00abm\u0004C\u0082KaZ\u0000\u0094\u00f9\u0098\u00d3\u00ec^\u00d8\u00dbb]\u00cc\u0011\u000bR\u0084rp\u00e3\u00b7m\u0013]/\u00bf$o\u0093Jn[C=\u009b\u00d9\u00e9\u00e3\u00c8}*m\u009c\\W\u000f\n\u00e8<\fCn\u00d0'v\u0095\u00c0\u00de\u00b2\u00dd3d\u00da\u0087q\u0087<\u00c3\u00f9\u007f\u00d2\u001d\u0017;\u00d5\u00c0ZF\u00bf\u00fe@\t\u0010;\u007f3\u00fa|aV\u00ea(\u00e9\u008b\u00bai\u007f\u00ce\u008f\u00b0b\u009f\u0003o\u0098F\u00b1\u00bd\u00d1\u00ac\u00fa\u00f0\u00e2\u001d\\\u00ee\nV]K\u00aa\u0081C\u00c3\u00d0\u0002\u00e8\u00dc*\u00cd\u00df\u00ea\u00e9\u0085\u00f9\u00f4\u001e\u00f4*\u00e8\u00d5\u00dd\u0010\u00a8\u00cf\u000f\u009a\u00052\u00cc\u00b1\u00bcY\u00a6\u0013\u00a0\u00a7\u00a4 p7\nJ\u00ae\u00a4\u00f9o\u001a\u0016\u0096\u008e\u0091\u00c1\u00b8 \u00b6E\u0016\u00ab~\u00fc,\u00f2\u00ffn\u00a8\u00d7\u001d\u00a1+\u00d4\u00053]\u00cdc\u00f1H\u00eb\u00c1\u00ec\"tH\u0092\u0083B\u00e5\u00e9_f\u00c8!\u0014q1\u0014\u001e\u008c\u001a\u00fc!\u0013\u00a1w\u0082\f7\u0090A\u00e7P$\u00b0e\u00d4\u008b\u009d\u0082\u00aaGY\u0010L\u00f9\u00e4\u0085\u00e9\u00e6J)\u00ab\u0098\u000b_f\u00926y\u00e4\u00ff\u00dbm\u000e\u0019G\u00ba\u000b\u00cf7\u00a8j\u00ea\u00f7.\u00c0\u00dc%\u00aa\u001c]\u00c17 \u00c4Pyj\\\u00ebYW~Jli\u00bc\u0088\u0087\u00bb]\u0016\u009e\u00882cc%\u00e2\u00f1r$\u00e4\u00e1I\u00e1\u0083\u00d9\u00a4<tk\u00ac\u009f\u00e7\u00c1F\u00b8\u001d\u00d2\u00c5xp#\u00c6\u00ea\u00f7F\u000eR\u00c4\u0019\u00cdB\u0097i\b+\u00ado\u00c0&qx+bt(+x\u00a15\u00b6\\Q\u00bb\u00cdGs4\u00e6\u0093\u00ed\u00e7\u00901\"\u00fe\u00da(\u00d1(\u0092hrGLA\u0084\u00e5\u0013)\u00d9X/\u008a}\u008a\u00dd\u00ea/\u00fc\u00d2\u00e0\u00e9\u00e0I\u00c9s\u0004\u00bbX\u00a3\nCH\u007f\u0018\u00edK\u0090\u008f\u000f\u00fbm\u00b4\u009f\u009f^@\u00f5\u0014\u00e7\u00f5B\u0007\u0017\nB^Y!Ck\tPOp\u0094L\u00deI1\u00a44\u00d2\u0017\u00fb\u00ac+\u009f\u00d2\u0005H\u00ed\u00b3$\u0012\u0082l\\Y\u00b9\u001b\u00f9@\u0090(\u00e2_k;`bf\u00dd\b\u008d\u00fc>MI".length();
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
                    var4_3 = "\u00b7\u00f2u)\u00d0\u00f9\u00c2A\u00a1\u00c8\u00a8f#\u00ea\u00d4\u001d";
                    var5_4 = "\u00b7\u00f2u)\u00d0\u00f9\u00c2A\u00a1\u00c8\u00a8f#\u00ea\u00d4\u001d".length();
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
        _q.a = var6_1;
        _q.b = new Integer[440];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3561;
        if (b[n2] == null) {
            _q.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
