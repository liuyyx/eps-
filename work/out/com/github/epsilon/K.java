/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.Holder
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.ClipContext
 *  net.minecraft.world.level.ClipContext$Block
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.phys.HitResult
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.Dl;
import com.github.epsilon.XG;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class K
extends e {
    private final DM d;
    private int m;
    private final XG O;
    private static final float E = 1.0f;
    private final DM c = K.E("032yYwxgD49tVwT7", E(java.lang.String double double double double ), (K)this, (String)K.b(32294, -6700), (double)3.0, (double)1.0, (double)7.0, (double)0.1);
    private final XG C;
    public static final K h;
    private static final float x = 1.14f;
    private final DM V;
    private static final String[] a;
    private static final String[] b;
    private static final long[] e;
    private static final Integer[] k;

    public float w(Object[] objectArray) {
        float f = (float)K.E("032yYwxgD49tVwT7", getAttributeValue(net.minecraft.core.Holder ), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Holder)hi.a("j", (long)1078302951600122635L));
        float f2 = 1.0f / f * 20.0f;
        reference var4_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (float)0.0f, (long)1101777741561788214L) * f2;
        return (float)hi.a("G", (float)1.0f, (float)(var4_4 / f2), (long)971000971621905228L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean W(Object[] var1_1) {
        block21: {
            block22: {
                var2_2 = var1_1[0];
                var3_3 = Dl.t();
                var5_4 /* !! */  = ((K.c(23553, 7486359191621907413L) + K.c(6070, 1985371122196576463L)) / K.c(32165, 9020377953833849565L) + K.c(971, 9080524036048776279L)) / K.c(18254, 235814548068018364L) - K.c(14485, 2115330961289009120L);
                if (!var3_3) break block22;
lbl6:
                // 2 sources

                while (true) {
                    v0 /* !! */  = (Entity)var2_2 instanceof LivingEntity;
                    if (var3_3) ** GOTO lbl33
                    if (v0 /* !! */  == 0) ** GOTO lbl32
                    ** GOTO lbl34
                    break;
                }
lbl11:
                // 2 sources

                while (true) {
                    v1 = hi.a("\u00a5", (Object)var4_5, (long)938038053496602901L);
                    if (var3_3) ** GOTO lbl39
                    if (v1 != false) ** GOTO lbl38
                    ** GOTO lbl41
                    break;
                }
            }
            block14: while (true) {
                switch (var5_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1520503572: {
                        var4_5 = (LivingEntity)((Entity)var2_2);
                        if (var3_3) {
                            return false;
                        }
                        ** GOTO lbl36
                    }
                    case 1520503569: {
                        hi.a("G", (int)2, (long)907855111017068855L);
                        K.E("032yYwxgD49tVwT7", l());
                        var5_4 /* !! */  = (K.c(29873, 7435509480072977310L) + K.c(6184, 727719746704635392L) - K.c(17611, 3175329402076867237L)) / K.c(18254, 235814548068018364L) ^ K.c(2140, 7660501854424557495L);
                        if (!var3_3) continue block14;
lbl32:
                        // 2 sources

                        v0 /* !! */  = var5_4 /* !! */  = (int)((hi.a("G", (int)K.c(1192, 7179836981450402692L), (int)K.c(32608, 4803469500352696670L), (long)834203424483934088L) + K.c(13705, 6408526427176000230L)) * K.c(29154, 2387985305516252770L) - K.c(18359, 1662092462180182163L));
lbl33:
                        // 2 sources

                        if (!var3_3) continue block14;
lbl34:
                        // 2 sources

                        var5_4 /* !! */  = (int)(hi.a("G", (int)(K.E("032yYwxgD49tVwT7", max(int int ), (int)K.c(21333, 1520681756143172706L), (int)K.c(25325, 7681736165392682410L)) / 5), (int)K.c(12318, 7979047388310560647L), (long)834203424483934088L) + K.c(28217, 8062077765419794840L));
                        continue block14;
                    }
lbl36:
                    // 1 sources

                    var5_4 /* !! */  = (K.c(2810, 4205856613808629042L) ^ K.c(11529, 7162604204226101847L)) / 5 + K.c(12645, 3745095301904916209L) ^ K.c(13303, 7222072276746656897L);
                    if (!var3_3) break block21;
lbl38:
                    // 2 sources

                    v1 = hi.a("G", (int)K.c(31981, 1295383556922413911L), (int)K.c(31269, 5776357316975990256L), (long)834203424483934088L) / K.c(24691, 6500651543882370627L) - K.c(11487, 4966525178408026957L);
lbl39:
                    // 2 sources

                    var5_4 /* !! */  = (int)v1;
                    if (!var3_3) break block21;
lbl41:
                    // 2 sources

                    var5_4 /* !! */  = K.c(9195, 4420886286254722254L) / K.c(28368, 4001866834460442990L) - K.c(1152, 515109929780440044L);
                    if (!var3_3) break block21;
                    ** GOTO lbl59
                    case 1520503571: 
                }
                break;
            }
            return false;
        }
        block15: while (true) {
            switch (var5_4 /* !! */ ) {
                case -1855614811: {
                    hi.a("G", (long)1228793555023716746L);
                    K.E("032yYwxgD49tVwT7", i());
                    ** GOTO lbl11
                }
                default: {
                    ** continue;
                }
                case -1855614806: {
                    if (var4_5 == hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)) ** GOTO lbl61
lbl59:
                    // 2 sources

                    var5_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)K.c(5287, 3708546396632087212L), (int)K.c(17021, 7602270191642717572L), (long)834203424483934088L) * K.c(12769, 3277722643270885267L)), (int)K.c(30050, 7293116086021987093L), (long)834203424483934088L) - K.c(843, 8170059317021699360L) - K.c(18119, 4236857224016832809L));
                    if (!var3_3) continue block15;
lbl61:
                    // 2 sources

                    var5_4 /* !! */  = K.c(22996, 5455023644746561159L) * K.c(7215, 2444994386105791333L) ^ K.c(2277, 8211817086454916853L);
                    continue block15;
                }
                case -1855614807: {
                    return false;
                }
                case -1855614809: {
                    return false;
                }
                case -1855614808: 
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
    private Entity I(Object[] var1_1) {
        block24: {
            var2_2 = Dl.t();
            var17_3 /* !! */  = K.c(19550, 355759613803635275L) * K.c(8568, 5309236500212338399L) ^ K.c(23962, 8259204586140971714L);
            if (var2_2) ** GOTO lbl-1000
            v0 /* !! */  = var17_3 /* !! */ ;
            if (var2_2 != false) return null;
            switch (v0 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)700108823764850555L);
                    var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1280994566116072355L);
                    var5_6 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1155001495207811514L), (long)789438897355831922L)), (long)371266768739483732L);
                    v1 = new Object[3];
                    v1[2] = Float.valueOf((float)var4_5);
                    v1[1] = Float.valueOf((float)var3_4);
                    v1[0] = (double)var5_6;
                    var6_7 = hi.a("\u00a5", (Object)this, (Object)v1, (long)1091119671682212179L);
                    var7_8 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1133521407411179272L);
                    var8_9 /* !! */  = (double)(var5_6 * var5_6);
                    if (var2_2) ** GOTO lbl105
                    if (var6_7 == null) ** GOTO lbl104
                    ** GOTO lbl106
                }
                case 149403140: {
                    hi.a("G", (long)808131217693296355L);
                    v0 /* !! */  = (int)hi.a("G", (long)561677051612723832L);
                    return null;
                }
            }
lbl28:
            // 1 sources

            while (true) {
                var8_9 /* !! */  = (double)K.E("032yYwxgD49tVwT7", distanceToSqr(net.minecraft.world.phys.Vec3 ), (Vec3)var7_8, (Vec3)hi.a("\u00a5", (Object)var6_7, (long)992105621747975200L));
                if (!var2_2) ** GOTO lbl112
lbl31:
                // 2 sources

                while (true) {
                    block26: {
                        block25: {
                            v2 = new Object[2];
                            v2[1] = Float.valueOf((float)var3_4);
                            v2[0] = Float.valueOf((float)var4_5);
                            var10_10 = hi.a("\u00a5", (Object)this, (Object)v2, (long)571413950712348340L);
                            var11_11 = hi.a("\u00a5", (Object)var7_8, (Object)hi.a("\u00a5", (Object)var10_10, (double)((double)var5_6), (long)1080829230854482551L), (long)701637995304699260L);
                            var12_12 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)766380852710420164L), (Object)K.E("032yYwxgD49tVwT7", scale(double ), (Vec3)var10_10, (double)((double)var5_6)), (long)885389251996139345L), (double)1.0, (double)1.0, (double)1.0, (long)1125128624416910820L);
                            var13_13 = hi.a("G", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)var7_8, (Object)var11_11, (Object)var12_12, (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getCrosshairTarget$0(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)((K)this), (double)var8_9 /* !! */ , (long)922633973615125788L);
                            if (var2_2) break block25;
                            if (var13_13 != null) break block26;
                            var17_3 /* !! */  = (int)(hi.a("G", (int)(K.c(26168, 4339381915786119655L) ^ K.c(29644, 4372865125796224136L)), (int)K.c(3364, 2586282146438472305L), (long)834203424483934088L) + K.c(26870, 378011926950119200L) + K.c(3620, 1375344129314840905L));
                        }
                        if (!var2_2) break block24;
                    }
                    var17_3 /* !! */  = (K.c(31213, 354320235361769067L) - K.c(20106, 1883389068712911202L) + K.c(22771, 4932868312538429360L) ^ K.c(32648, 2491193181374681121L)) - K.c(24450, 2739606293468655699L);
                    break block24;
                    break;
                }
                break;
            }
lbl47:
            // 5 sources

            while (true) {
                switch (var17_3 /* !! */ ) {
                    default: {
                        if (hi.a("\u00a5", (Object)var6_7, (long)760876273703437601L) == hi.a("j", (long)958553802615151507L)) ** GOTO lbl108
                        ** GOTO lbl110
                    }
                    case -2091000791: {
                        break;
                    }
                    case -2091000793: {
                        ** continue;
                    }
                    case -2091000794: {
                        hi.a("G", (int)-1, (long)907855111017068855L);
                        break;
                    }
                }
                ** continue;
                break;
            }
        }
        block21: while (true) lbl-1000:
        // 3 sources

        {
            block29: {
                block28: {
                    block27: {
                        switch (var17_3 /* !! */ ) {
                            default: {
                                var14_14 = hi.a("\u00a5", (Object)var13_13, (long)1041207400292436410L);
                                var15_15 = hi.a("\u00a5", (Object)var7_8, (Object)hi.a("\u00a5", (Object)var13_13, (long)1322256446935321529L), (long)1291060754145254714L);
                                v3 /* !! */  = var15_15 == var8_9 /* !! */  ? 0 : (var15_15 < var8_9 /* !! */  ? -1 : 1);
                                if (var2_2) break block27;
                                if (v3 /* !! */  < 0) break;
                                break block28;
                            }
                            case 178985912: {
                                return null;
                            }
                            case 0xAAB1BBA: {
                                K.E("032yYwxgD49tVwT7", d());
                                return null;
                            }
                        }
                        v3 /* !! */  = (reference)(K.c(7663, 7596231688628073185L) * K.c(29582, 7269416184808676760L) * K.c(11539, 4280945634211447377L) / 2 + K.c(24296, 3482811883397460370L));
                    }
                    var17_3 /* !! */  = (int)v3 /* !! */ ;
                    if (!var2_2) break block29;
                }
                var17_3 /* !! */  = ((K.c(4856, 364292690424134935L) ^ K.c(6396, 3967988011835356978L)) - K.c(26430, 5968989330732517454L)) / K.c(1801, 5872213061823621231L) * K.c(11981, 931112663418028533L) - K.c(12174, 6541886506787192972L);
                if (var2_2) ** GOTO lbl114
            }
            block22: while (true) {
                switch (var17_3 /* !! */ ) {
                    default: {
                        if (var6_7 == null) ** GOTO lbl114
                        ** GOTO lbl116
                    }
                    case -1486317791: {
                        if (hi.a("\u00a5", (Object)var6_7, (long)760876273703437601L) != hi.a("j", (long)958553802615151507L)) ** GOTO lbl118
                        ** GOTO lbl120
                    }
                    case -1486317794: {
                        v4 /* !! */  = var14_14 instanceof LivingEntity;
                        if (var2_2) continue block21;
                        if (v4 /* !! */  == 0) ** GOTO lbl122
                        ** GOTO lbl124
                    }
                    case -1486317793: {
                        hi.a("G", (long)763209694749933009L);
                        hi.a("G", (long)513075350433525267L);
                        if (var2_2 == false) return var14_14;
lbl104:
                        // 2 sources

                        var17_3 /* !! */  = K.c(23996, 3011168364999225949L) * K.c(26817, 8814776105742436245L) + K.c(1043, 2320879241731697263L);
lbl105:
                        // 2 sources

                        if (!var2_2) ** GOTO lbl47
lbl106:
                        // 2 sources

                        var17_3 /* !! */  = (int)(K.E("032yYwxgD49tVwT7", max(int int ), (int)(K.c(9339, 8891404619284957697L) ^ K.c(17231, 6210513306480749618L)), (int)K.c(791, 7385846300842716452L)) - K.c(26363, 5461730278287116630L));
                        if (!var2_2) ** GOTO lbl47
lbl108:
                        // 2 sources

                        var17_3 /* !! */  = K.c(19834, 114107217719599858L) * K.c(29278, 6845278013541981593L) + K.c(513, 8310029155721407598L);
                        if (!var2_2) ** GOTO lbl47
lbl110:
                        // 2 sources

                        var17_3 /* !! */  = K.c(28151, 8322054940739306205L) - K.c(23383, 8690559522218259770L) + K.c(22774, 6722555277883717420L);
                        if (!var2_2) ** GOTO lbl47
lbl112:
                        // 2 sources

                        var17_3 /* !! */  = K.c(19834, 114107217719599858L) * K.c(29278, 6845278013541981593L) + K.c(513, 8310029155721407598L);
                        ** continue;
                    }
lbl114:
                    // 2 sources

                    var17_3 /* !! */  = K.c(32208, 4516798034036265679L) * K.c(30379, 1744265444950710402L) * K.c(26667, 8235471065843533712L) / 2 + K.c(6019, 6621681213397203010L);
                    if (!var2_2) continue block22;
lbl116:
                    // 2 sources

                    var17_3 /* !! */  = (int)(hi.a("G", (int)K.c(25011, 4750346534964956672L), (int)K.c(21712, 3600910455244405620L), (long)834203424483934088L) * K.c(23232, 576394304958379517L) - K.c(26356, 5872279843820701937L) + K.c(8956, 1559801224855866501L));
                    if (!var2_2) continue block22;
lbl118:
                    // 2 sources

                    var17_3 /* !! */  = (int)(hi.a("G", (int)(K.c(12670, 2152964333623303858L) ^ K.c(4053, 2104575893096751531L)), (int)K.c(12502, 1033875104532815624L), (long)834203424483934088L) + K.c(22467, 399169058962127330L) + K.c(19621, 7777894001290060773L));
                    if (!var2_2) ** GOTO lbl-1000
lbl120:
                    // 2 sources

                    var17_3 /* !! */  = K.c(32208, 4516798034036265679L) * K.c(30379, 1744265444950710402L) * K.c(26667, 8235471065843533712L) / 2 + K.c(6019, 6621681213397203010L);
                    if (!var2_2) continue block22;
lbl122:
                    // 2 sources

                    v4 /* !! */  = var17_3 /* !! */  = (int)(hi.a("G", (int)(K.c(12670, 2152964333623303858L) ^ K.c(4053, 2104575893096751531L)), (int)K.c(12502, 1033875104532815624L), (long)834203424483934088L) + K.c(22467, 399169058962127330L) + K.c(19621, 7777894001290060773L));
                    if (!var2_2) continue block21;
lbl124:
                    // 2 sources

                    var17_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)(K.c(11793, 7594664092594356493L) - K.c(12177, 3588623485333487795L)), (int)K.c(5756, 2536214090855840046L), (long)834203424483934088L), (int)K.c(26247, 7958863030655879498L), (long)834203424483934088L) ^ K.c(29920, 5355799882047036245L);
                    continue block22;
                    case -1486317790: 
                }
                break;
            }
            break;
        }
        return var14_14;
    }

    private HitResult I(Object[] objectArray) {
        double d = (Double)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1133521407411179272L);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = Float.valueOf(f2);
        CallSite callSite2 = hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)571413950712348340L);
        CallSite callSite3 = hi.a("\u00a5", (Object)callSite, (Object)hi.a("\u00a5", (Object)callSite2, (double)d, (long)1080829230854482551L), (long)701637995304699260L);
        return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)new ClipContext((Vec3)callSite, (Vec3)callSite3, (ClipContext.Block)hi.a("j", (long)450224442646423139L), (ClipContext.Fluid)hi.a("j", (long)747535818869381789L), (Entity)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (long)438016674394306919L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[6];
                        var11_1 = 0;
                        var10_2 = "\u00c3\u00f3\u00fa\u00ce\u00e46.\u00b00\u0017[p\u0087\u00c9\u0018y\u00ed\u0011\u0010\u00ec\u00aa+\u0084vF\u009b\u00d8\u00e6{\u008c(\u00af\u00e9$u\u000b\u00a0\u000ecb\u0090\u00f1\u001cC)\u00e3\u00a3\u000f\u0087\u001e-\u00a0\u00e3a\u00a4\u00fd\u000b;w^3\u00a3\u001e";
                        var12_3 = "\u00c3\u00f3\u00fa\u00ce\u00e46.\u00b00\u0017[p\u0087\u00c9\u0018y\u00ed\u0011\u0010\u00ec\u00aa+\u0084vF\u009b\u00d8\u00e6{\u008c(\u00af\u00e9$u\u000b\u00a0\u000ecb\u0090\u00f1\u001cC)\u00e3\u00a3\u000f\u0087\u001e-\u00a0\u00e3a\u00a4\u00fd\u000b;w^3\u00a3\u001e".length();
                        var9_4 = 18;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 80;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "D\u0098\u00d3/\u0084\u00de(&}I\u0012\u0083\u0091q\u0006\u009d\u0005\u00b5\u00d7\u00ed\u00c5I";
                            var12_3 = "D\u0098\u00d3/\u0084\u00de(&}I\u0012\u0083\u0091q\u0006\u009d\u0005\u00b5\u00d7\u00ed\u00c5I".length();
                            var9_4 = 16;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 21;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 102;
                                    break;
                                }
                                case 1: {
                                    v15 = 6;
                                    break;
                                }
                                case 2: {
                                    v15 = 86;
                                    break;
                                }
                                case 3: {
                                    v15 = 98;
                                    break;
                                }
                                case 4: {
                                    v15 = 79;
                                    break;
                                }
                                case 5: {
                                    v15 = 69;
                                    break;
                                }
                                default: {
                                    v15 = 68;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                K.a = var13;
                K.b = new String[6];
                var0_7 = 7459294559768143102L;
                var6_8 = new long[343];
                var3_9 = 0;
                var4_10 = "\u0084\u00d8\u00a6\u00b3\u00f31\u00fc\u00f4\u00c9\u00feD\u0094,\u00d5.\u0082\u00e5\u0097\u000b\u00a0!E\u009eC\u00b0\u00ce{\u00a7\u00b5Sz\u0084\u0005X\n\u00b5\u00d2\u00fd\u0088\u00e2\r\u0014\u0094\u0001\u0088\u001b\u008e*&R\u009b\u00ec\u00e5q*\f\u00b7;IpD~V=\u0015\u0007S\u00ec@\u00ba\u00f5\u0012\u00c8\u00a0\u000b\u00d8\u00f9*R\u000b\u009abD\u00e8\u009c\u009e\u00f3\u00a9\u00e6/\u00c7lM\u008e|\u00cb\u0004\u00ec_\u00ba\u00f3\u00dc\u001c\u00a2\u00e3\u00b8\u0013i\u00dc\nUU\u00b1X\u008fy\u00e1\u00d8u\u00bb\u000bz\u0016l\u0015\u00b2.1!\u0090l\u00a0\u00a0s.^\u0001\u00cc\u00cc\u0013\u00bd\u00b1\u00e8Lh\u008d\f\u00c1j\u00e8U\rC\u008d+eVh\u00e6\u00a4!\u00ee@\u00a5\u000e\u0017\u0089VB\u009f\u001d9\u0017\u00b8\u00c1\u00ccvK\u0082\b\u0091\u00f9\u00c8-])\u00b0[\u00e0oW\u009f\u00d0\u00ef\u00d9\u00a5\u009c\u00c0\u00d2\u009c\u00148X\u0083\u00ed\u0015\u00c8\u00b2\u0097\u00af\u00f6`\t(\u00e3\u0096/\u0088-\u00d1\u00a3\u00e3\u0094\u00dcS\u001e\u00ff\u000e\u0086\u00a4\u0084\u00c7\u00c8\u00fb\u0004]\u0088\u0083v*\u00b4\u00f3M;\u0099\u0096uH\u00c5p\u00c8\u00ad\u0086\u001a\\\u0010h\u00d6$\u00cf\u00fd\u00d65\u00bc\u00e1\u00bdf$9\u00bc\u00ed?\u00eb[\u0096\u0000\u000b\u008fC\u00beX!\u00ce\u008c\u000f\u00bf\u00dc\u00ba\u008dvV3e\u00daJ\u00e5\u0004\u00c1\u00e5\u00be\u0092j\u00fe\u00da\u0094\u009c\u00f4\u00e9S\u00a2\u00d0\u0006\n\u00d4\u008b\"b\u009c\u0083\u00c8\u00e1D\u00ecr\u00a0\u0098\u00e2`\u0010\u007f\u0015\u0081G\u00ef\u001f\u0017/\u0093<\u00d7X\u00f3\u00c8S\u00f9p\u00aa\u00e1@e)&\u00c2w\u00dfe\u00b7\u00d1\u00ae\u0085\u00ba\u0096\u0001\u0096\u00c6\u00f3f\u009e\u00be\u0014VM\u00af\u00e3d\u00e7\u00cc'\u00d8b\u00c8\u00c5\u00c0\u0081\u00e1\u00e6p\u00c3/\u00ebQ\u00a4\u00c6\u00a8:\u0005$|\u00e2\u00d5\u00b8\u00b5\u007f\u00a6tA\u00afv\u001f\u008bt6:<\u00b0\u00c965\u008e\u00f2\u00dc\u00ce\u00ae/\u00d5k\u0089\u00f1\u0089\r\u00aa\u00cb<\u001eO\u0099\"B\u00d3,H\u00d3b/\u00e1\u0081\u0011\"\u00cd\u00b0.\u00a5<3\u0087\u00f9\u0094Q\r\u00be\u008b\u00f2\u00afMB\u00df\u0017\u00e1h(\u0010);\u0011\u00edq\u001d\u000fG\u0082\n7\u00a1r\u0001\u00ab\u00c0\u00b3G\u00d7\u0084AhU\u00c7\u00cc\u00f7\u0002\u008b:&W\u0011n\u00d5\u00d3+\f\u00bcr\u0016\u00d8\u00c8$W\u00adiZ\u00c9\u009f\u0097e\u00d7z\u00da\u00c4\u0000\\:D>VM\u00d3\u009b\u00d8\u00a8\u00aa\u0084\u00f7s\u00f3\u00f6,\u0018\u0004\u00f2\u0084\u00ccQ\u00adT\u00f2H\u000f\u0096\u00f0\u00cf\u00f11\u00dch\u0083\u00f2:Q7mBi\u00fb\u00eb\u0001`\u0090\u00997\u0087\u00b0\u001f|\u00e73\u00e7o\u0017$E\u00d0%r\u0094\u001cR\u00d5G\u00b99\u00a7B\u00b2\u000f\u00cf\u0080\u00a8@\u00e2YztL\u00d7\by8\u00d6H\u00ac\u008a6\u00bb\u00ff\u0016\u0099X\b\u0080Wk\u0084\u00f4\u00be\u00ef\u00f0\u00b0:\u0092\u001e\u00d6\u0017\u00c8\u00974\u00a4\\\u0096\u00d5\u00b5Ki\u0015J\u0019\u009e\u00f3\u00beP\u009a\u008d\u009fe(\u00e3V\u00bbu\u00b2V\u000f#\u00b0\u0006\u00d2\u00b8\u00ff\u00ef\u00a2\u000f\u00aa\u00a51\u00b1r\u0011\u00daG\u00c9\u0015\u0089\u00c8\u00f3C\u00d08,\u0000\u00a0\u00ae\u00e5\u00cej\u0013^`|\\w\u0081\u00ee\u00c5]\u0001\u00a3I\u00d1\u00be\u00ab}\u00a9\u00c15+l\u00b7\u00b3:\u0013\u00ba\u00b7\u00e44@l{S;2\u00f4\u00d91\u0083UR\u00da\u008d\u00cfRrV\u009c\f\u0097\u0087\u00c7\u000btk\u0011\u001f[\u0000\u00d9;\u00e2{\u00ef\u0013@|q}2\u009bcd\u00bcJ\u00cf\u000e\u0088\u00b8\u00b5|S&\u00fa\u00179\u00f69\u00a16\u0084W?o\u0015a\u00e1\u00e2\u00b2\u0092\u009c\u0084G\u0089\u00b1\u0016\u0015<\u00fd\u00cd\u009b\u0087\u009f)}\u00d4\u00cf\u00cc\u00c0\u00fc\u00ac\u00c39fP\t+c\u00ec\u00e1\u0099\u00bf\u00ae\u001f\u0096vU\u00f7i\u0015\u0015>\u0080\u00c3\u0082\u0093\u0099k1\u00c2\u0082\u00a4\u0098\u0015EQ<4\u0096\u00e1\u0003qd\u0002>Kd4J\u00c1\u0016l\u0092\u0007W*K\u0087h\u0000\u0096Kk\u00a0]%\u00a8H\u009aR\u00cdh\u00b5*H=\u0098\u0082\u00d2Z\u00ab4\u00bd\u00e7\u008f=\u00d8\u009f\u00e5\u009eY\u00c34t\u00c8\u00a2#\u0001\u009c\u00e9\\P]\u00da\u00dc\u001a\u00c4\u0010\u008d\u00ea5J\u009a\u00b0\u00b7UG+\u00db\u000f\u00e3\u0099FbK)\u00bbn'L\u00d1\u000b~k\u0085L\u00e3\u00db\u00d8Vk\u00ce\u00c87(\u0006\u008f\u0086\u0089\u0015\u00f3\u00fdw\u001c]Z\u0010b\u0004\u008c_S\u00e26p0\u0098\u000b\u00ee\u00ac\u00da\u00c2E\u009f9\u00d7\u001a\u00d4(i\u0090\u009ah\u008c\u007f\u0099\u00a8!h\u0016\u00a9\u0015Mk\u00b5\u00b3\u0086{\u00dc:\u0087\u0081v\u00e5\u00d9\u00ab\u008b\u008f2\u00dd4\u0006q\u00b2^w\u009ep\u00d3\u00b6i\u00f7\u00f8\u00f5\u0080\u008c\u001c\u00ad\u00cd_\u00ef?\u00f7$\u0099Q\u00109\u00fa\u00a3#C6\u00d1\u00f9So\u0095e\u009e\u00f0\u009ef5\u00b2\u0093\u00c8\u0003\u00c3.9\u00c3\u00ef\u00a8\u00c7\u00aa\u00damX\u00d7c\u00fb\u0080n#\u009a\u00b5\u00c7\u00b6\u0094\u00f2\u0005Q\u00cc*\u00fap\u00b1\u00a0\u00c4\u00c9?T\u00ce\u00d5\u00bb\u0080 \u00edu\u00b6\u00bc/\u00da\u00f7\u00f4\u0010\u00d4]G\u00bdJJ\u00b0\u0002\u00c6/\u00af\u009a\u000e\u00d1\u00b5\u0096\u001e^Q\u0016\u00f6\u00c15\u00c8l\u0014\u009e^\u0083K\u008e\u008c\u0005\u00d8\u00bd0\u00ac1\u0084NX|E\u00f7\u00c2\u0080\u00day%\u00a90\u00be\u00e9v\u001c\u00b7\u009bF\u00d1\u00ac\u0090X\u00a0\u009d\u00b3@\u00f1\u00a1\u008a\u000f\u00b4\u00d7\u001b\f0o\u00e6\u001fk `\rs8{\u0015\u00d8,\u009d\u0095-Yw\u0016\u00ee\u00fe\u00964v\u009fm\u00b9\u00c3\u00daV\u0085\u009c\u0086\u008f\u00c2H\u0004T\u009c\u00bd\u00f3#\u00a27\u001d\r\u000b\u0091c\u008c\u001e\u00e0\u0015\u00c6\u00fb\u00d1]\u0084+A#\u00ca4\u0006\u0015\u009c\u008f\u008c\u00d9\u009c\u0006Hj\u00cb\u00abjQ\u007f\u0097Z\u00dc\u00dd\u008e\u00b3;\u0095=9a\u00d1-\u0081U\u00b4%C\u0013\u00ea:\u00c4\u00ca\u00b9\u00ee.o\u00c4\u00d8\u00ac\u00c3\u00a9\u00e4\u0086<\u009772\u00da',\u00a3H\u00b1\u00b5\u00e6$\u007fZ7\u00be\u00be^n\r\u00aa\u00f8!{\u00cefT\u008e9\u00da|\u0012\u008dS\u00f0R\u00a4\u00afY\u00e5\u00d9\u0090=\u0010\u00b7\u00cd\u00d8\u0085.\u00b6\u0085\u00bb\u00ce\u00f3\u0082\u00c9\u00ad\u00a3\u0013'50\u00a0\u00cf\u00b3\u00f2H\u00a3\u009c\u0094\u00dd\u001c\u00d5\u0015\u00feC\u0018\u00ee\u0002\u0096x\u00af*;\u00e1\u00c93\u0017\u000e\u00acl\u00ec\u00f1\u00f6\u00b4\u00e50\u00efD\\\u000f\u001c\u00e8\u00af\u0090\u00e9\u00c7\u00aa\u00c8\u0094\u001f\u009c\u00c7\u00f7g\n\u0014\u00117\u00c7b\u00fd\u00f0\u00fc\u00ca\u00f79\u00a9\u00d6\u00aa\u00c1\u00f4\u0007G\u000e\u0087\u000e\u00f7i\u007f\u00c0\u0091,W)\u00a9}f\u00f8\u00a05mZ\u00da\u00ae<\u00ad\u0016\u00e9!\u00f6b\u0005\u0018f\u00d8\u0087 \u0019\u00bdu4\u008b\u00f2\u001eI\u00a2\u009fi\u00e8\u00a4\u008fF`\u00c8ZG2\u009d[;(\u00dc6Ve\u0083\u0080\u008f\u00f1\u0091@\u0011\u00a65\u00ee\u00b5\\\u00baZ\u00a6|\u001e`\u0086B4\u00ba\u000b\bq\u00dd\u0083\u00a4e\u00e6\"i\u00a5J\u00fb\u00ec\u0006G\u00cd#\u000f\u00d6\u00e2fv\u00fc\u008d!\u00feF\u00bd\u009e\u007f\u0088<mh\u00a6\u00ac\u00c7b6\u00ac\u009b\u00b2\u00fd\u00a7/\u00b0\u000e\u00b1\u00f2\u00b1\u00b5u\u0092\u00c1U\u0004\u00da\u00fb\u00b1\u008a\u00d6k\nd\u00c6\u0090\u00afw\u00dbL;\u0087\u00d0\u00ef0?\u008f\u008dLM\u00c6\u0099N*\u000e_\u00ca\u00ce\u00890$\r\u00a3/\f\u0005!N\u0014\u00a9\u00ec\u0085t\u00bc%\u00de1\u0000k\u0084sa./\u00180\u00a0\u0097\u00cfW9\u001d\u00d6\u00caK\u00a1\u00eb}\u00dd\u00ac\u00dd\u0013*\u009dD\u00a6}W\u00cdE\t\u008co4HUm\u00dc\u00dc\u001f\u001c\u001f\u00bc\u0004\u0084\u00a8\u009a\u00b2\u00a1WcUP\u00de@\u0002\u00d8\u0093\u00a6v{\u00f5\u0089\u0015\u00e2\u001e`\u00f4\u008ab)\u0083:\u000f\u0002\u000f[\u00e5\u00b6\r\u00b7M\u008f\u00d95O-\u00be7\u008e\u00ea\u00fdgu\u00e1\u00b9\u00b9P\u0016h\u00a9M\u00a7\u00b2\u00ed_\u0002\u00b4\u00869\u001d\u00d9\u009e\u00a6\u00fd\u00e7J\u0002\u00ad)AA\u00c5Ksj\u00df\u0088\u00ba\u00dc\u00ae\u00e2\u0098$\u00e3e!\u0082`6\u009e\u00fdv\u00ab&\u0012\u00b0y1\u007fC\u000bV\u0083\u00bd\f\u00f2U\u00a2\u00f6\u00beD\u0096\rc\n\u00e8K\\\u001dO\u00ed\u0099\u0098\t\u00d5\u00ca\u0016\u00bd &\u00b6I\u00f1\u00de\n\u0015\u00b6\u00ed$\u00b3\n`\\\u00d9\u00d4+\u0012<\u00c6\u0011b\u008b\u007f/\u00f5\u00b6\u00e1\u0089i\u0098\u000f\u00ac\u00c4\u001fn\u000ew]\u00ee\u00c9\u00e0~\u00f8\u0092/1b\u0098\u001e\u00a8}\u00f5\u00e6F\u0000\u00eb\u00b0\u0082d\u00c8\u0095\u00a6o;\u00eb\u00f0\u00cb/\u00c1\u00ae\u00851\u00d1\u009d\u00b6\u00f5\u0089`\u00f0\u00f6fS\u0002rpd\u00cf\u00e8\u00cc)g\u00f2\u000e\u0017B\u00a5&\u00e6\u0096\u0095\u00e1\u0088Rn\u0002\u009c\u00c5lJ\u00fe\u0018\u001b:c\\q\u00cag\u00e2\u00d0\u0019\u0085\u001a\u007f\u0003.\u00ea\u0019^2\u009be#s=\u00c2\u0099\"\u00b4R\u00a5\u0092\u0006\u0098\u0014\u00938#\u00c9\u0005\u00ae%eEm\u0089_\u001ar\u0006\n\u001cW9`\u00fc\u00e3{\u00cbr\u009e\u00af\u00ecl\u00d3(\u00e0\u00af\u00c4\u00c9\u008c\u0002\u0002\u0085\u00abS\u008d\u00e2\u00d4k\u0085\u00d2}q\u00ff\u00af&t~\n\u0015k\u00cbok>\u00b9\u00f6k\u00dc\u0088\u008a\u00a204\u00e9\u00d8\u00ac\f\u00d86\u00ee\u0085\u0016\u00be\u0088\u00a1\u00c1\\\u0011\u008d\u0006,\u001cQ\u00840y\u00a9\u008b\u00ce\u00b3X\u00ca\u00e1\u009a>\u00ec\u00d0eP\u0003o'\u00a7\u00b4B\u0090:w\u0002\u0084LD wO\u00ffS\u00ee,V\u00f9\u00fe6\u00b12\u00c3\u00a8\u00c5\u008c\u00be\u0015\u00e3\u00c1\u00a6\u00d4\u00c8\u00cbs\u00d7h\u0003\u00eb$k\u009d\u00d4\u00fb\u00ca\u00b0[\u008f\u00c7\u007fhn\u00959\u009e\u001c\u00fca\u00acO\u00ea\u00ad\u00e6\u008fkZ#\u00d6\u00e6e\u00e7\fz\u008a\u00d2\u00ec \b(\u00c3\u00c4\u00d2{\u00bd\u0084e\u00c7#\u00f5fJ\u00a9\u00ff$\u00fa\u00f8X\u00d69j\u00d1\u00c5\u00aa\u00bak&\u0011*\u0090\u001f\u00e3\u00b2\u00c3$E\u00b0;\u00e5]|\u00f6\u00f4\u00ed^q\u0089\u00cf\u0088\u0019EO [\u0013\u00a4\u008f9\u007f\u00f9\u001a\u00d2\u00d3\u0091vd'\u0097\u00d5Pr(\u00ac\u00b4\u00fa\u00a2Y\f\u00ea\u009ea\u00ce\u00eb \u009d\u00d8\u00aeL\u00041\u0019\u00c6\u00cfr\u0099\u00da]%\u00f33\u00ccKKpE\u009e\u001c\u0011`\u0090(\u008d\u00e4\u0005\u00ba\u00c9\u0083\u00deW\u00d7\u00cf\u00a2\u00a6\u00e6>\u00a0\u0090\u00ff\"L?\u0087\u00c3]\u0001`\u00d6i\u0094\u0091\u00cb&A\u0081\u00c2\u00c9|!\u008f\u00d2\u00c8WT\u00b2\u00a7U!\u0002%6\u00e6\u001fU\u00ca\u00b3L\u0082H\u0081\u0007v\u00dcp\u00d8\u008d\u00d7\u00ce\u00d6\u0013*\u0097\u00e9V\u00f1\u00cf\u0096%d\u008d\u0019\u0083\u00e2 \u00f7\u0002\u00f0\u000e\u00a2\u009avi\u008b\u009cY\u00f0\u00e7:\u0080\t\u00fd\u00a0Y\u00ea\u00da-\u00ea_\u0017\u0012o{\u00feNeL`;\u00cb\u00e9\u00a1p7N\u00a2\u00a0\u00cc.\u00f3jc\t\u0007\u008c]\u0000=\r\u00fd\u00b2`\u00ffN\t\u00be\u00ff}\u00ec\u000fO\u00d5\u001c\u0097.\r\u0013\u008b\u00a3\u00c3\u0003\u00de\u00de\u00d4\u0001\u00e6\u00e1\u009f\u00e1\u00dd0\u009a\u00c1\u00b3$x\u00ad\u0015;\u00bc6E\n\u00bf\u00c8\u00cb\u0094\u009d\t^\u00af\u00eeY\u0010\u00ef\u00fbq\u00ab-Q9\u00b1)\u0005\u0094\u00b3\u0095\u00d1\u0016\u0081\u00ef\u001e\u0007*\u00ee\u009e\u00b5_\u0001\u00dbTa\u008b\u00a2F<\u00de\n\u0014\u00ddf\u0002qLz\u001d\u009eP[\u00f3\u0014!\u000f\u00c8G\u0001Ywi\u00d6\u00b5=H\u00dc\u0015\u00db\u0002H\u00e8\u0090&\u007f\u0018%\u0004\u00c8\u00c0\u0015\u00b5\u00d8\u00d4\u0013\f\u00bf\u0003\u001aE\u00beq\u00d3\u001c\u000bj\u00bfp&\u00ffx!\u00c7\u00f7\u00f8Go^8\u00f7\u00f7\u00eb\u00f6\u00f1H=\u0098\u00de\u001f\u00b5t\u00aa\u00b6\u0002%\u00e3\u00ad\u001dYSa]\u0013\u00a8cM\u0092\u00e3b\u0094\u00d5\u00a7(\u001b\u00e2A\u00d6\u00df\u00cb\u001cz\u00a2\u00cf\u00a3;6\u0005'\u0081\u00b0\u00ee\u00fb\u0017\u00cdr\u00cf\u00f7\u00ba\u008bV\u0003\u0018\"x4\u0003\u00a6Eb\u00b1~u7\u00d8\u00d3\u00d4\u00a7\u00be\u00d0\u00aa\u00ce\u00b1\u00d6\u00een^C\u0091;og\u00bc\f\u00d7kl\u0004H@_[\u00eb\u001b\u00d0\u0014\u00d7\u0004\u00a8\u00f0\u001a\u0080\u0005\u00dcu\u00f1\u0087\u00fc\\\u0091wI\u00ba\u00ec\u00a8\u00e0\u00e3\u00b9\u00a62\u00ecO\u008b\u001ew\u00b3\u00d9\u00f0\u0091\u00cd\u0013 \u00d9q\u009f\u00c8\u00be\u00a1\u0086\u00b1\u00842\u0096U\u009difk\u008f\u00d8\u00d8\u00f1\u00bb";
                var5_11 = "\u0084\u00d8\u00a6\u00b3\u00f31\u00fc\u00f4\u00c9\u00feD\u0094,\u00d5.\u0082\u00e5\u0097\u000b\u00a0!E\u009eC\u00b0\u00ce{\u00a7\u00b5Sz\u0084\u0005X\n\u00b5\u00d2\u00fd\u0088\u00e2\r\u0014\u0094\u0001\u0088\u001b\u008e*&R\u009b\u00ec\u00e5q*\f\u00b7;IpD~V=\u0015\u0007S\u00ec@\u00ba\u00f5\u0012\u00c8\u00a0\u000b\u00d8\u00f9*R\u000b\u009abD\u00e8\u009c\u009e\u00f3\u00a9\u00e6/\u00c7lM\u008e|\u00cb\u0004\u00ec_\u00ba\u00f3\u00dc\u001c\u00a2\u00e3\u00b8\u0013i\u00dc\nUU\u00b1X\u008fy\u00e1\u00d8u\u00bb\u000bz\u0016l\u0015\u00b2.1!\u0090l\u00a0\u00a0s.^\u0001\u00cc\u00cc\u0013\u00bd\u00b1\u00e8Lh\u008d\f\u00c1j\u00e8U\rC\u008d+eVh\u00e6\u00a4!\u00ee@\u00a5\u000e\u0017\u0089VB\u009f\u001d9\u0017\u00b8\u00c1\u00ccvK\u0082\b\u0091\u00f9\u00c8-])\u00b0[\u00e0oW\u009f\u00d0\u00ef\u00d9\u00a5\u009c\u00c0\u00d2\u009c\u00148X\u0083\u00ed\u0015\u00c8\u00b2\u0097\u00af\u00f6`\t(\u00e3\u0096/\u0088-\u00d1\u00a3\u00e3\u0094\u00dcS\u001e\u00ff\u000e\u0086\u00a4\u0084\u00c7\u00c8\u00fb\u0004]\u0088\u0083v*\u00b4\u00f3M;\u0099\u0096uH\u00c5p\u00c8\u00ad\u0086\u001a\\\u0010h\u00d6$\u00cf\u00fd\u00d65\u00bc\u00e1\u00bdf$9\u00bc\u00ed?\u00eb[\u0096\u0000\u000b\u008fC\u00beX!\u00ce\u008c\u000f\u00bf\u00dc\u00ba\u008dvV3e\u00daJ\u00e5\u0004\u00c1\u00e5\u00be\u0092j\u00fe\u00da\u0094\u009c\u00f4\u00e9S\u00a2\u00d0\u0006\n\u00d4\u008b\"b\u009c\u0083\u00c8\u00e1D\u00ecr\u00a0\u0098\u00e2`\u0010\u007f\u0015\u0081G\u00ef\u001f\u0017/\u0093<\u00d7X\u00f3\u00c8S\u00f9p\u00aa\u00e1@e)&\u00c2w\u00dfe\u00b7\u00d1\u00ae\u0085\u00ba\u0096\u0001\u0096\u00c6\u00f3f\u009e\u00be\u0014VM\u00af\u00e3d\u00e7\u00cc'\u00d8b\u00c8\u00c5\u00c0\u0081\u00e1\u00e6p\u00c3/\u00ebQ\u00a4\u00c6\u00a8:\u0005$|\u00e2\u00d5\u00b8\u00b5\u007f\u00a6tA\u00afv\u001f\u008bt6:<\u00b0\u00c965\u008e\u00f2\u00dc\u00ce\u00ae/\u00d5k\u0089\u00f1\u0089\r\u00aa\u00cb<\u001eO\u0099\"B\u00d3,H\u00d3b/\u00e1\u0081\u0011\"\u00cd\u00b0.\u00a5<3\u0087\u00f9\u0094Q\r\u00be\u008b\u00f2\u00afMB\u00df\u0017\u00e1h(\u0010);\u0011\u00edq\u001d\u000fG\u0082\n7\u00a1r\u0001\u00ab\u00c0\u00b3G\u00d7\u0084AhU\u00c7\u00cc\u00f7\u0002\u008b:&W\u0011n\u00d5\u00d3+\f\u00bcr\u0016\u00d8\u00c8$W\u00adiZ\u00c9\u009f\u0097e\u00d7z\u00da\u00c4\u0000\\:D>VM\u00d3\u009b\u00d8\u00a8\u00aa\u0084\u00f7s\u00f3\u00f6,\u0018\u0004\u00f2\u0084\u00ccQ\u00adT\u00f2H\u000f\u0096\u00f0\u00cf\u00f11\u00dch\u0083\u00f2:Q7mBi\u00fb\u00eb\u0001`\u0090\u00997\u0087\u00b0\u001f|\u00e73\u00e7o\u0017$E\u00d0%r\u0094\u001cR\u00d5G\u00b99\u00a7B\u00b2\u000f\u00cf\u0080\u00a8@\u00e2YztL\u00d7\by8\u00d6H\u00ac\u008a6\u00bb\u00ff\u0016\u0099X\b\u0080Wk\u0084\u00f4\u00be\u00ef\u00f0\u00b0:\u0092\u001e\u00d6\u0017\u00c8\u00974\u00a4\\\u0096\u00d5\u00b5Ki\u0015J\u0019\u009e\u00f3\u00beP\u009a\u008d\u009fe(\u00e3V\u00bbu\u00b2V\u000f#\u00b0\u0006\u00d2\u00b8\u00ff\u00ef\u00a2\u000f\u00aa\u00a51\u00b1r\u0011\u00daG\u00c9\u0015\u0089\u00c8\u00f3C\u00d08,\u0000\u00a0\u00ae\u00e5\u00cej\u0013^`|\\w\u0081\u00ee\u00c5]\u0001\u00a3I\u00d1\u00be\u00ab}\u00a9\u00c15+l\u00b7\u00b3:\u0013\u00ba\u00b7\u00e44@l{S;2\u00f4\u00d91\u0083UR\u00da\u008d\u00cfRrV\u009c\f\u0097\u0087\u00c7\u000btk\u0011\u001f[\u0000\u00d9;\u00e2{\u00ef\u0013@|q}2\u009bcd\u00bcJ\u00cf\u000e\u0088\u00b8\u00b5|S&\u00fa\u00179\u00f69\u00a16\u0084W?o\u0015a\u00e1\u00e2\u00b2\u0092\u009c\u0084G\u0089\u00b1\u0016\u0015<\u00fd\u00cd\u009b\u0087\u009f)}\u00d4\u00cf\u00cc\u00c0\u00fc\u00ac\u00c39fP\t+c\u00ec\u00e1\u0099\u00bf\u00ae\u001f\u0096vU\u00f7i\u0015\u0015>\u0080\u00c3\u0082\u0093\u0099k1\u00c2\u0082\u00a4\u0098\u0015EQ<4\u0096\u00e1\u0003qd\u0002>Kd4J\u00c1\u0016l\u0092\u0007W*K\u0087h\u0000\u0096Kk\u00a0]%\u00a8H\u009aR\u00cdh\u00b5*H=\u0098\u0082\u00d2Z\u00ab4\u00bd\u00e7\u008f=\u00d8\u009f\u00e5\u009eY\u00c34t\u00c8\u00a2#\u0001\u009c\u00e9\\P]\u00da\u00dc\u001a\u00c4\u0010\u008d\u00ea5J\u009a\u00b0\u00b7UG+\u00db\u000f\u00e3\u0099FbK)\u00bbn'L\u00d1\u000b~k\u0085L\u00e3\u00db\u00d8Vk\u00ce\u00c87(\u0006\u008f\u0086\u0089\u0015\u00f3\u00fdw\u001c]Z\u0010b\u0004\u008c_S\u00e26p0\u0098\u000b\u00ee\u00ac\u00da\u00c2E\u009f9\u00d7\u001a\u00d4(i\u0090\u009ah\u008c\u007f\u0099\u00a8!h\u0016\u00a9\u0015Mk\u00b5\u00b3\u0086{\u00dc:\u0087\u0081v\u00e5\u00d9\u00ab\u008b\u008f2\u00dd4\u0006q\u00b2^w\u009ep\u00d3\u00b6i\u00f7\u00f8\u00f5\u0080\u008c\u001c\u00ad\u00cd_\u00ef?\u00f7$\u0099Q\u00109\u00fa\u00a3#C6\u00d1\u00f9So\u0095e\u009e\u00f0\u009ef5\u00b2\u0093\u00c8\u0003\u00c3.9\u00c3\u00ef\u00a8\u00c7\u00aa\u00damX\u00d7c\u00fb\u0080n#\u009a\u00b5\u00c7\u00b6\u0094\u00f2\u0005Q\u00cc*\u00fap\u00b1\u00a0\u00c4\u00c9?T\u00ce\u00d5\u00bb\u0080 \u00edu\u00b6\u00bc/\u00da\u00f7\u00f4\u0010\u00d4]G\u00bdJJ\u00b0\u0002\u00c6/\u00af\u009a\u000e\u00d1\u00b5\u0096\u001e^Q\u0016\u00f6\u00c15\u00c8l\u0014\u009e^\u0083K\u008e\u008c\u0005\u00d8\u00bd0\u00ac1\u0084NX|E\u00f7\u00c2\u0080\u00day%\u00a90\u00be\u00e9v\u001c\u00b7\u009bF\u00d1\u00ac\u0090X\u00a0\u009d\u00b3@\u00f1\u00a1\u008a\u000f\u00b4\u00d7\u001b\f0o\u00e6\u001fk `\rs8{\u0015\u00d8,\u009d\u0095-Yw\u0016\u00ee\u00fe\u00964v\u009fm\u00b9\u00c3\u00daV\u0085\u009c\u0086\u008f\u00c2H\u0004T\u009c\u00bd\u00f3#\u00a27\u001d\r\u000b\u0091c\u008c\u001e\u00e0\u0015\u00c6\u00fb\u00d1]\u0084+A#\u00ca4\u0006\u0015\u009c\u008f\u008c\u00d9\u009c\u0006Hj\u00cb\u00abjQ\u007f\u0097Z\u00dc\u00dd\u008e\u00b3;\u0095=9a\u00d1-\u0081U\u00b4%C\u0013\u00ea:\u00c4\u00ca\u00b9\u00ee.o\u00c4\u00d8\u00ac\u00c3\u00a9\u00e4\u0086<\u009772\u00da',\u00a3H\u00b1\u00b5\u00e6$\u007fZ7\u00be\u00be^n\r\u00aa\u00f8!{\u00cefT\u008e9\u00da|\u0012\u008dS\u00f0R\u00a4\u00afY\u00e5\u00d9\u0090=\u0010\u00b7\u00cd\u00d8\u0085.\u00b6\u0085\u00bb\u00ce\u00f3\u0082\u00c9\u00ad\u00a3\u0013'50\u00a0\u00cf\u00b3\u00f2H\u00a3\u009c\u0094\u00dd\u001c\u00d5\u0015\u00feC\u0018\u00ee\u0002\u0096x\u00af*;\u00e1\u00c93\u0017\u000e\u00acl\u00ec\u00f1\u00f6\u00b4\u00e50\u00efD\\\u000f\u001c\u00e8\u00af\u0090\u00e9\u00c7\u00aa\u00c8\u0094\u001f\u009c\u00c7\u00f7g\n\u0014\u00117\u00c7b\u00fd\u00f0\u00fc\u00ca\u00f79\u00a9\u00d6\u00aa\u00c1\u00f4\u0007G\u000e\u0087\u000e\u00f7i\u007f\u00c0\u0091,W)\u00a9}f\u00f8\u00a05mZ\u00da\u00ae<\u00ad\u0016\u00e9!\u00f6b\u0005\u0018f\u00d8\u0087 \u0019\u00bdu4\u008b\u00f2\u001eI\u00a2\u009fi\u00e8\u00a4\u008fF`\u00c8ZG2\u009d[;(\u00dc6Ve\u0083\u0080\u008f\u00f1\u0091@\u0011\u00a65\u00ee\u00b5\\\u00baZ\u00a6|\u001e`\u0086B4\u00ba\u000b\bq\u00dd\u0083\u00a4e\u00e6\"i\u00a5J\u00fb\u00ec\u0006G\u00cd#\u000f\u00d6\u00e2fv\u00fc\u008d!\u00feF\u00bd\u009e\u007f\u0088<mh\u00a6\u00ac\u00c7b6\u00ac\u009b\u00b2\u00fd\u00a7/\u00b0\u000e\u00b1\u00f2\u00b1\u00b5u\u0092\u00c1U\u0004\u00da\u00fb\u00b1\u008a\u00d6k\nd\u00c6\u0090\u00afw\u00dbL;\u0087\u00d0\u00ef0?\u008f\u008dLM\u00c6\u0099N*\u000e_\u00ca\u00ce\u00890$\r\u00a3/\f\u0005!N\u0014\u00a9\u00ec\u0085t\u00bc%\u00de1\u0000k\u0084sa./\u00180\u00a0\u0097\u00cfW9\u001d\u00d6\u00caK\u00a1\u00eb}\u00dd\u00ac\u00dd\u0013*\u009dD\u00a6}W\u00cdE\t\u008co4HUm\u00dc\u00dc\u001f\u001c\u001f\u00bc\u0004\u0084\u00a8\u009a\u00b2\u00a1WcUP\u00de@\u0002\u00d8\u0093\u00a6v{\u00f5\u0089\u0015\u00e2\u001e`\u00f4\u008ab)\u0083:\u000f\u0002\u000f[\u00e5\u00b6\r\u00b7M\u008f\u00d95O-\u00be7\u008e\u00ea\u00fdgu\u00e1\u00b9\u00b9P\u0016h\u00a9M\u00a7\u00b2\u00ed_\u0002\u00b4\u00869\u001d\u00d9\u009e\u00a6\u00fd\u00e7J\u0002\u00ad)AA\u00c5Ksj\u00df\u0088\u00ba\u00dc\u00ae\u00e2\u0098$\u00e3e!\u0082`6\u009e\u00fdv\u00ab&\u0012\u00b0y1\u007fC\u000bV\u0083\u00bd\f\u00f2U\u00a2\u00f6\u00beD\u0096\rc\n\u00e8K\\\u001dO\u00ed\u0099\u0098\t\u00d5\u00ca\u0016\u00bd &\u00b6I\u00f1\u00de\n\u0015\u00b6\u00ed$\u00b3\n`\\\u00d9\u00d4+\u0012<\u00c6\u0011b\u008b\u007f/\u00f5\u00b6\u00e1\u0089i\u0098\u000f\u00ac\u00c4\u001fn\u000ew]\u00ee\u00c9\u00e0~\u00f8\u0092/1b\u0098\u001e\u00a8}\u00f5\u00e6F\u0000\u00eb\u00b0\u0082d\u00c8\u0095\u00a6o;\u00eb\u00f0\u00cb/\u00c1\u00ae\u00851\u00d1\u009d\u00b6\u00f5\u0089`\u00f0\u00f6fS\u0002rpd\u00cf\u00e8\u00cc)g\u00f2\u000e\u0017B\u00a5&\u00e6\u0096\u0095\u00e1\u0088Rn\u0002\u009c\u00c5lJ\u00fe\u0018\u001b:c\\q\u00cag\u00e2\u00d0\u0019\u0085\u001a\u007f\u0003.\u00ea\u0019^2\u009be#s=\u00c2\u0099\"\u00b4R\u00a5\u0092\u0006\u0098\u0014\u00938#\u00c9\u0005\u00ae%eEm\u0089_\u001ar\u0006\n\u001cW9`\u00fc\u00e3{\u00cbr\u009e\u00af\u00ecl\u00d3(\u00e0\u00af\u00c4\u00c9\u008c\u0002\u0002\u0085\u00abS\u008d\u00e2\u00d4k\u0085\u00d2}q\u00ff\u00af&t~\n\u0015k\u00cbok>\u00b9\u00f6k\u00dc\u0088\u008a\u00a204\u00e9\u00d8\u00ac\f\u00d86\u00ee\u0085\u0016\u00be\u0088\u00a1\u00c1\\\u0011\u008d\u0006,\u001cQ\u00840y\u00a9\u008b\u00ce\u00b3X\u00ca\u00e1\u009a>\u00ec\u00d0eP\u0003o'\u00a7\u00b4B\u0090:w\u0002\u0084LD wO\u00ffS\u00ee,V\u00f9\u00fe6\u00b12\u00c3\u00a8\u00c5\u008c\u00be\u0015\u00e3\u00c1\u00a6\u00d4\u00c8\u00cbs\u00d7h\u0003\u00eb$k\u009d\u00d4\u00fb\u00ca\u00b0[\u008f\u00c7\u007fhn\u00959\u009e\u001c\u00fca\u00acO\u00ea\u00ad\u00e6\u008fkZ#\u00d6\u00e6e\u00e7\fz\u008a\u00d2\u00ec \b(\u00c3\u00c4\u00d2{\u00bd\u0084e\u00c7#\u00f5fJ\u00a9\u00ff$\u00fa\u00f8X\u00d69j\u00d1\u00c5\u00aa\u00bak&\u0011*\u0090\u001f\u00e3\u00b2\u00c3$E\u00b0;\u00e5]|\u00f6\u00f4\u00ed^q\u0089\u00cf\u0088\u0019EO [\u0013\u00a4\u008f9\u007f\u00f9\u001a\u00d2\u00d3\u0091vd'\u0097\u00d5Pr(\u00ac\u00b4\u00fa\u00a2Y\f\u00ea\u009ea\u00ce\u00eb \u009d\u00d8\u00aeL\u00041\u0019\u00c6\u00cfr\u0099\u00da]%\u00f33\u00ccKKpE\u009e\u001c\u0011`\u0090(\u008d\u00e4\u0005\u00ba\u00c9\u0083\u00deW\u00d7\u00cf\u00a2\u00a6\u00e6>\u00a0\u0090\u00ff\"L?\u0087\u00c3]\u0001`\u00d6i\u0094\u0091\u00cb&A\u0081\u00c2\u00c9|!\u008f\u00d2\u00c8WT\u00b2\u00a7U!\u0002%6\u00e6\u001fU\u00ca\u00b3L\u0082H\u0081\u0007v\u00dcp\u00d8\u008d\u00d7\u00ce\u00d6\u0013*\u0097\u00e9V\u00f1\u00cf\u0096%d\u008d\u0019\u0083\u00e2 \u00f7\u0002\u00f0\u000e\u00a2\u009avi\u008b\u009cY\u00f0\u00e7:\u0080\t\u00fd\u00a0Y\u00ea\u00da-\u00ea_\u0017\u0012o{\u00feNeL`;\u00cb\u00e9\u00a1p7N\u00a2\u00a0\u00cc.\u00f3jc\t\u0007\u008c]\u0000=\r\u00fd\u00b2`\u00ffN\t\u00be\u00ff}\u00ec\u000fO\u00d5\u001c\u0097.\r\u0013\u008b\u00a3\u00c3\u0003\u00de\u00de\u00d4\u0001\u00e6\u00e1\u009f\u00e1\u00dd0\u009a\u00c1\u00b3$x\u00ad\u0015;\u00bc6E\n\u00bf\u00c8\u00cb\u0094\u009d\t^\u00af\u00eeY\u0010\u00ef\u00fbq\u00ab-Q9\u00b1)\u0005\u0094\u00b3\u0095\u00d1\u0016\u0081\u00ef\u001e\u0007*\u00ee\u009e\u00b5_\u0001\u00dbTa\u008b\u00a2F<\u00de\n\u0014\u00ddf\u0002qLz\u001d\u009eP[\u00f3\u0014!\u000f\u00c8G\u0001Ywi\u00d6\u00b5=H\u00dc\u0015\u00db\u0002H\u00e8\u0090&\u007f\u0018%\u0004\u00c8\u00c0\u0015\u00b5\u00d8\u00d4\u0013\f\u00bf\u0003\u001aE\u00beq\u00d3\u001c\u000bj\u00bfp&\u00ffx!\u00c7\u00f7\u00f8Go^8\u00f7\u00f7\u00eb\u00f6\u00f1H=\u0098\u00de\u001f\u00b5t\u00aa\u00b6\u0002%\u00e3\u00ad\u001dYSa]\u0013\u00a8cM\u0092\u00e3b\u0094\u00d5\u00a7(\u001b\u00e2A\u00d6\u00df\u00cb\u001cz\u00a2\u00cf\u00a3;6\u0005'\u0081\u00b0\u00ee\u00fb\u0017\u00cdr\u00cf\u00f7\u00ba\u008bV\u0003\u0018\"x4\u0003\u00a6Eb\u00b1~u7\u00d8\u00d3\u00d4\u00a7\u00be\u00d0\u00aa\u00ce\u00b1\u00d6\u00een^C\u0091;og\u00bc\f\u00d7kl\u0004H@_[\u00eb\u001b\u00d0\u0014\u00d7\u0004\u00a8\u00f0\u001a\u0080\u0005\u00dcu\u00f1\u0087\u00fc\\\u0091wI\u00ba\u00ec\u00a8\u00e0\u00e3\u00b9\u00a62\u00ecO\u008b\u001ew\u00b3\u00d9\u00f0\u0091\u00cd\u0013 \u00d9q\u009f\u00c8\u00be\u00a1\u0086\u00b1\u00842\u0096U\u009difk\u008f\u00d8\u00d8\u00f1\u00bb".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00ea\u001e\u00cb\u00a9\u00d1\u0082\u00e0\u0001\u0093\u00a7=\u00b0\u008b\u00c2\u00ce\u0018";
                    var5_11 = "\u00ea\u001e\u00cb\u00a9\u00d1\u0082\u00e0\u0001\u0093\u00a7=\u00b0\u008b\u00c2\u00ce\u0018".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        K.e = var6_8;
        K.k = new Integer[343];
        K.h = new K();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    public void P(dR var1_1) {
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
                                                                        block51: {
                                                                            block33: {
                                                                                block31: {
                                                                                    block32: {
                                                                                        block50: {
                                                                                            var2_2 = Dl.S();
                                                                                            var4_3 /* !! */  = K.c(5366, 5925509730290269020L) * K.c(4034, 1961397583626428618L) * K.c(6469, 248988126870959869L) - K.c(25206, 1476195025188425156L) ^ K.c(18247, 6982788866624923818L);
                                                                                            if (var2_2) break block50;
lbl4:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                                                                                if (!var2_2) break block31;
                                                                                                if (v0 /* !! */  != false) break block32;
                                                                                                break block33;
                                                                                                break;
                                                                                            }
lbl9:
                                                                                            // 1 sources

                                                                                            while (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)907159218940561824L), (long)1017954173869996748L) != null) {
                                                                                                break block34;
                                                                                            }
                                                                                            break block51;
lbl12:
                                                                                            // 1 sources

                                                                                            return;
lbl14:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                hi.a("G", (long)405872435149102496L);
                                                                                                K.E("032yYwxgD49tVwT7", J(int ), (int)-1);
lbl18:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1015148049117770214L);
                                                                                                    if (!var2_2) break block35;
                                                                                                    if (v1 != false) break block36;
                                                                                                    break block37;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            }
lbl23:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)486189134127341670L);
                                                                                                if (!var2_2) break block38;
                                                                                                if (v2 == false) break block39;
                                                                                                break block40;
                                                                                                break;
                                                                                            }
lbl28:
                                                                                            // 1 sources

                                                                                            return;
lbl30:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var3_4 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)502202743880570518L);
                                                                                                if (!var2_2) break block41;
                                                                                                if (var3_4 != null) break block42;
                                                                                                break block43;
                                                                                                break;
                                                                                            }
lbl35:
                                                                                            // 1 sources

                                                                                            return;
lbl37:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v3 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)616069535323041068L);
                                                                                                if (!var2_2) break block44;
                                                                                                if (v3 /* !! */  != false) break block45;
                                                                                                break block46;
                                                                                                break;
                                                                                            }
lbl42:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v4 /* !! */  = hi.a("\u00e9", (Object)this, (long)714561758073278778L);
                                                                                                if (!var2_2) break block47;
                                                                                                if (v4 /* !! */  <= 0) break block48;
                                                                                                break block49;
                                                                                                break;
                                                                                            }
lbl47:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v5 = this;
                                                                                                hi.a("\u00f2", (Object)v5, (int)(hi.a("\u00e9", (Object)v5, (long)714561758073278778L) - true), (long)714561758073278778L);
                                                                                                return;
                                                                                            }
lbl51:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)var3_4, (long)899051199446605892L);
                                                                                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)1027340002540470646L);
                                                                                                hi.a("\u00f2", (Object)this, (int)hi.a("G", (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)495351082421679826L), (long)789438897355831922L)), (long)1260538186742955956L), (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)542272435502671630L), (long)789438897355831922L)), (long)1260538186742955956L), (long)656208795491924261L), (long)714561758073278778L);
                                                                                                return;
                                                                                            }
                                                                                        }
lbl57:
                                                                                        // 9 sources

                                                                                        while (true) {
                                                                                            switch (var4_3 /* !! */ ) {
                                                                                                default: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case -1763454157: {
                                                                                                    ** GOTO lbl9
                                                                                                }
                                                                                                case -1763454155: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case -1763454153: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case -1763454151: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case -1763454158: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case -1763454154: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                ** case -1763454156:
lbl74:
                                                                                                // 1 sources

                                                                                                ** continue;
                                                                                            }
                                                                                            break;
                                                                                        }
lbl75:
                                                                                        // 6 sources

                                                                                        while (true) {
                                                                                            switch (var4_3 /* !! */ ) {
                                                                                                default: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case 1210616542: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case 1210616543: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case 1210616538: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case 1210616541: {
                                                                                                    ** continue;
                                                                                                }
                                                                                                case 1210616540: 
                                                                                            }
                                                                                            hi.a("G", (double)1.0, (long)1273198203909826830L);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    v0 /* !! */  = (CallSite)((K.c(4637, 1727268766301518895L) - K.c(12321, 1145962666609466969L)) * K.c(29025, 230483193455844883L) * K.c(9277, 7874162407612173274L) + K.c(3926, 4297367333721432131L));
                                                                                }
                                                                                var4_3 /* !! */  = (int)v0 /* !! */ ;
                                                                                if (var2_2) ** GOTO lbl57
                                                                            }
                                                                            var4_3 /* !! */  = (hi.a("G", (int)(K.c(7243, 444084777820713573L) / K.c(22162, 6973382008089000433L)), (int)K.c(27614, 5283703834144113795L), (long)834203424483934088L) - K.c(778, 750914817945562249L) ^ K.c(3480, 8640000565856395851L)) - K.c(9531, 6340021540348349158L);
                                                                            if (var2_2) ** GOTO lbl57
                                                                        }
                                                                        var4_3 /* !! */  = (K.c(9588, 2688112409356946135L) ^ K.c(15665, 6642830117023830703L) ^ K.c(2123, 7489082151676110388L)) / K.c(2265, 7034634365143017353L) + K.c(7201, 7512479909716915038L);
                                                                        if (var2_2) ** GOTO lbl57
                                                                    }
                                                                    var4_3 /* !! */  = (K.c(16077, 5113508066304348410L) - K.c(2969, 4535408874406569402L)) * K.c(21032, 5123809078542089507L) * K.c(9788, 8214358510697400613L) + K.c(19607, 5062817637622326246L);
                                                                    if (var2_2) ** GOTO lbl57
                                                                }
                                                                v1 = hi.a("G", (int)K.c(5275, 6580823676126362419L), (int)K.c(31978, 8811096974978487084L), (long)834203424483934088L) / K.c(13135, 7806709542166912056L) + K.c(1496, 5968527809782475515L);
                                                            }
                                                            var4_3 /* !! */  = (int)v1;
                                                            if (var2_2) ** GOTO lbl57
                                                        }
                                                        var4_3 /* !! */  = (K.c(23249, 1664460364810171864L) * K.c(25150, 221222045519678536L) + K.c(24198, 8510365679476289693L)) / 2 - K.c(24266, 6921480877715108225L);
                                                        if (var2_2) ** GOTO lbl57
                                                    }
                                                    v2 = hi.a("G", (int)((K.c(3104, 1429767018967425599L) - K.c(19641, 5817714945459167924L)) / 5), (int)K.c(20280, 3786779666926608401L), (long)834203424483934088L) + K.c(3394, 2154143783912628851L);
                                                }
                                                var4_3 /* !! */  = (int)v2;
                                                if (var2_2) ** GOTO lbl57
                                            }
                                            var4_3 /* !! */  = (int)(hi.a("G", (int)K.c(25279, 2395877674799009039L), (int)K.c(3247, 4270882226858976046L), (long)834203424483934088L) / K.c(13135, 7806709542166912056L) + K.c(11164, 7430918830778565804L));
                                            ** while (true)
                                        }
                                        var4_3 /* !! */  = (int)(hi.a("G", (int)K.c(31917, 4896585460419826664L), (int)K.c(11312, 2073358160534487892L), (long)834203424483934088L) + K.c(14656, 1799350496971150922L));
                                    }
                                    if (var2_2) ** GOTO lbl75
                                }
                                var4_3 /* !! */  = hi.a("G", (int)(K.c(27879, 8870872636067382102L) ^ K.c(13551, 179834543475776389L)), (int)K.c(25090, 7806841913336728992L), (long)834203424483934088L) * K.c(26655, 5389744256635864848L) * K.c(31929, 5666613942175601594L) ^ K.c(27707, 3083888488580907554L);
                                if (var2_2) ** GOTO lbl75
                            }
                            v3 /* !! */  = (CallSite)((K.c(8370, 4052028488820805523L) * K.c(11229, 1417878289459922094L) ^ K.c(27792, 3813927825280533133L)) - K.c(16286, 7248618093479416217L));
                        }
                        var4_3 /* !! */  = (int)v3 /* !! */ ;
                        if (var2_2) ** GOTO lbl75
                    }
                    var4_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)K.c(25922, 4871252579792980666L), (int)K.c(6836, 5871248618294670636L), (long)834203424483934088L) + K.c(10518, 2930582807860397764L)), (int)K.c(22785, 6163817253378537106L), (long)834203424483934088L) - K.c(11693, 9178219115125654406L));
                    if (var2_2) ** GOTO lbl75
                }
                v4 /* !! */  = (CallSite)((K.c(25147, 4336665239331900429L) * K.c(22507, 2102941917058676766L) ^ K.c(9130, 7175440627075534070L)) - K.c(10571, 7031170136136992266L));
            }
            var4_3 /* !! */  = (int)v4 /* !! */ ;
            if (var2_2) ** GOTO lbl75
        }
        var4_3 /* !! */  = K.c(23752, 2262035797337322274L) * K.c(26825, 1903784766500734736L) ^ K.c(11087, 5195126392677123248L);
        ** while (true)
    }

    private K() {
        super(K.b(32289, 15829), (vY)((Object)hi.a("j", (long)1119278030115886606L)));
        this.O = K.E("032yYwxgD49tVwT7", b(java.lang.String int int int int ), (K)this, (String)K.b(32295, 25823), (int)2, (int)0, (int)K.c(11548, 8573611908015375096L), (int)1);
        this.C = hi.a("\u00a5", (Object)this, (Object)K.b(32290, 9488), (int)K.c(20944, 9167681806483439189L), (int)0, (int)K.c(5548, 1666540965028067916L), (int)1, (long)1094453040828645510L);
        this.V = hi.a("\u00a5", (Object)this, (Object)K.b(32288, -9843), (double)0.9, (double)0.5, (double)1.0, (double)0.05, (long)1077996338587307774L);
        this.d = hi.a("\u00a5", (Object)this, (Object)K.b(32291, -12884), (double)0.0, (double)0.0, (double)1.0, (double)0.05, (long)1077996338587307774L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$getCrosshairTarget$0(Entity entity) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)entity, (long)1306501691620228693L);
                    if (bl) break block4;
                    if (object != false) break block5;
                    object = K.E("032yYwxgD49tVwT7", isPickable(), (Entity)entity);
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)this, (Object)new Object[]{entity}, (long)533083778192677555L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean E(Object[] var1_1) {
        block53: {
            block52: {
                var2_2 = Dl.S();
                var4_3 /* !! */  = (K.c(10023, 7769675137543391296L) ^ K.c(1528, 3669548259456412609L)) - K.c(20288, 5440547205771763829L);
                if (var2_2) break block52;
lbl5:
                // 2 sources

                while (true) {
                    block55: {
                        block54: {
                            v0 = hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1239870339333076059L), (long)793288979961607741L);
                            if (!var2_2) break block54;
                            if (v0 == false) break block55;
                            v0 = hi.a("G", (int)(K.c(29681, 1596677061249277125L) * K.c(32687, 489773702694638008L) * K.c(20551, 2966296417825799798L) / K.c(22162, 6973382008089000433L)), (int)K.c(10286, 6011830679327131626L), (long)834203424483934088L) + K.c(15042, 100192445560706278L);
                        }
                        var4_3 /* !! */  = (int)v0;
                        if (var2_2) break block52;
                    }
                    var4_3 /* !! */  = (K.c(25241, 3058518305919470772L) - K.c(3125, 7281759602711257643L)) * K.c(21202, 1043731731727924605L) ^ K.c(32505, 7817287353249698074L);
                    if (var2_2) break block52;
                    ** GOTO lbl71
                    break;
                }
lbl17:
                // 2 sources

                while (true) {
                    block57: {
                        block56: {
                            var3_4 = v1;
                            cfr_temp_0 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)607354766899991275L) - 1.0;
                            v2 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            if (!var2_2) break block56;
                            if (v2 /* !! */  > 0) break block57;
                            v2 /* !! */  = (reference)((K.c(1964, 5585146685135349847L) / K.c(28027, 3138077410374222445L) ^ K.c(31703, 8585859739692897319L)) + K.c(16997, 4331640956713119218L) - K.c(16765, 7188019573386260006L));
                        }
                        var4_3 /* !! */  = (int)v2 /* !! */ ;
                        if (var2_2) break block53;
                    }
                    var4_3 /* !! */  = K.c(18171, 4523074492272781687L) * K.c(24256, 8183723123099742384L) - K.c(6146, 7006747774060033598L) ^ K.c(21751, 7690906195392805724L);
                    if (var2_2) break block53;
                    ** GOTO lbl153
                    break;
                }
lbl31:
                // 2 sources

                while (true) {
                    block59: {
                        block58: {
                            cfr_temp_1 = v3 - v4 /* !! */ ;
                            v5 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                            if (!var2_2) break block58;
                            if (v5 < 0) break block59;
                            v5 = hi.a("G", (int)(K.c(32261, 6669753519934902726L) * K.c(26253, 7324845569879607770L)), (int)K.c(24003, 2142341829036094079L), (long)834203424483934088L) / K.c(1801, 5872213061823621231L) - K.c(5673, 8245365432182012300L);
                        }
                        var4_3 /* !! */  = (int)v5;
                        if (var2_2) break block53;
                    }
                    var4_3 /* !! */  = (K.c(17373, 6427287986388642955L) * K.c(9667, 246537134421625528L) ^ K.c(452, 6003849278474677842L)) + K.c(2840, 6810597928734909754L) ^ K.c(18199, 4934029193760647466L);
                    if (var2_2) break block53;
                    ** GOTO lbl183
                    break;
                }
            }
            block41: while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -2037446004: {
                        v6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)913845010059318434L);
                        if (!var2_2) ** GOTO lbl72
                        if (v6 != false) ** GOTO lbl71
                        ** GOTO lbl74
                    }
                    case -2037446005: {
                        v7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)535575764292578191L), (long)1290406379781068867L);
                        if (!var2_2) ** GOTO lbl77
                        if (v7 != false) ** GOTO lbl76
                        ** GOTO lbl79
                    }
                    case -2037446002: {
                        if (hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)K.E("032yYwxgD49tVwT7", blockPosition(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (long)419122760578116751L), (long)1154638568918062781L) == hi.a("j", (long)481356316423409617L)) ** GOTO lbl81
                        ** GOTO lbl83
                    }
                    case -2037446007: {
                        v1 = 1;
                        var4_3 /* !! */  = (K.c(1570, 8425647001895561526L) ^ K.c(32631, 7166825708180803815L)) / K.c(30000, 9108143442131753518L) / K.c(1801, 5872213061823621231L) / K.c(31241, 6462022410930623587L) ^ K.c(30360, 1136590411834038409L);
                        if (var2_2) ** GOTO lbl86
                        ** GOTO lbl85
                    }
                    case -2037446008: {
                        v1 = 0;
                        if (var2_2) ** GOTO lbl85
                        ** GOTO lbl17
                    }
lbl71:
                    // 2 sources

                    v6 = hi.a("G", (int)(K.c(2305, 18038823047096169L) * K.c(7494, 1286455806988874459L) * K.c(32253, 297691917227004447L) / K.c(22162, 6973382008089000433L)), (int)K.c(10976, 2893196406187246799L), (long)834203424483934088L) + K.c(6391, 6438460766854346434L);
lbl72:
                    // 2 sources

                    var4_3 /* !! */  = (int)v6;
                    if (var2_2) continue block41;
lbl74:
                    // 2 sources

                    var4_3 /* !! */  = K.c(3447, 3099458827256685394L) - K.c(15072, 1703821932636558715L) ^ K.c(3666, 9183377152981753961L) ^ K.c(7944, 4826246803823554695L) ^ K.c(22236, 3657356117371205955L);
                    if (var2_2) continue block41;
lbl76:
                    // 2 sources

                    v7 = hi.a("G", (int)(K.c(2305, 18038823047096169L) * K.c(7494, 1286455806988874459L) * K.c(32253, 297691917227004447L) / K.c(22162, 6973382008089000433L)), (int)K.c(10976, 2893196406187246799L), (long)834203424483934088L) + K.c(6391, 6438460766854346434L);
lbl77:
                    // 2 sources

                    var4_3 /* !! */  = (int)v7;
                    if (var2_2) continue block41;
lbl79:
                    // 2 sources

                    var4_3 /* !! */  = (int)(hi.a("G", (int)K.c(12351, 6486119623878369033L), (int)K.c(15837, 7303178760902333399L), (long)834203424483934088L) * K.c(960, 5109276462513318961L) - K.c(4215, 1543787939434430069L));
                    if (var2_2) continue block41;
lbl81:
                    // 2 sources

                    var4_3 /* !! */  = (int)(K.E("032yYwxgD49tVwT7", max(int int ), (int)(K.c(2305, 18038823047096169L) * K.c(7494, 1286455806988874459L) * K.c(32253, 297691917227004447L) / K.c(22162, 6973382008089000433L)), (int)K.c(10976, 2893196406187246799L)) + K.c(6391, 6438460766854346434L));
                    if (var2_2) continue block41;
lbl83:
                    // 2 sources

                    var4_3 /* !! */  = (K.c(6131, 1485044854711318995L) ^ K.c(14717, 3929845912359294609L)) / 5 * K.c(6010, 4302187403800672451L) ^ K.c(3305, 4795395252621665252L);
                    continue block41;
lbl85:
                    // 2 sources

                    var4_3 /* !! */  = (K.c(18006, 3738559169385637976L) ^ K.c(21179, 171265512206810437L)) / K.c(9548, 3120017856023939702L) / K.c(1801, 5872213061823621231L) / K.c(17394, 8077223159272713439L) ^ K.c(161, 5082129268114812794L);
lbl86:
                    // 2 sources

                    switch (var4_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 1853404273: 
                    }
                    throw null;
                    case -2037446003: 
                }
                break;
            }
            return (boolean)hi.a("G", (int)0, (long)1024745345430233792L);
        }
        block42: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    cfr_temp_2 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)607354766899991275L) - 1.1399999856948853;
                    v8 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                    if (!var2_2) ** GOTO lbl154
                    if (v8 /* !! */  >= 0) ** GOTO lbl153
                    ** GOTO lbl156
                }
                case -787914711: {
                    v3 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)360490350745470581L);
                    v9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)412409060139490357L);
                    if (!var2_2) ** GOTO lbl159
                    if (v9 == false) ** GOTO lbl158
                    ** GOTO lbl161
                }
                case -787914719: {
                    v10 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1282175146993233974L), (long)622868109502394347L);
                    if (!var2_2) ** GOTO lbl184
                    if (v10 /* !! */  != false) ** GOTO lbl183
                    ** GOTO lbl186
                }
                case -787914708: {
                    v11 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)630615357818213681L);
                    if (!var2_2) ** GOTO lbl189
                    if (v11 /* !! */  != false) ** GOTO lbl188
                    ** GOTO lbl191
                }
                case -787914715: {
                    v12 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)976216390819719198L);
                    if (!var2_2) ** GOTO lbl194
                    if (v12 == false) ** GOTO lbl193
                    ** GOTO lbl196
                }
                case -787914718: {
                    v13 = var3_4;
                    if (!var2_2) ** GOTO lbl199
                    if (v13 == 0) ** GOTO lbl198
                    ** GOTO lbl200
                }
                case -787914720: {
                    v14 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)412409060139490357L);
                    if (!var2_2) ** GOTO lbl203
                    if (v14 /* !! */  != false) ** GOTO lbl202
                    ** GOTO lbl205
                }
                case -787914716: {
                    cfr_temp_3 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)607354766899991275L) - (double)hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1252057083267321178L), (long)789438897355831922L)), (long)371266768739483732L);
                    v15 /* !! */  = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                    if (!var2_2) ** GOTO lbl208
                    if (v15 /* !! */  <= 0) ** GOTO lbl207
                    ** GOTO lbl210
                }
                case -787914713: {
                    v16 = true;
                    var4_3 /* !! */  = (K.c(8254, 6519927611368886079L) ^ K.c(6826, 2899927170839442622L)) + K.c(17440, 9138189067414121253L) + K.c(27697, 2582379317923512896L);
                    if (var2_2) ** GOTO lbl213
                    ** GOTO lbl212
                }
                case -787914723: {
                    v16 = false;
                    if (!var2_2) {
                        return v16;
                    }
                    ** GOTO lbl212
                }
                case -787914714: {
                    throw null;
                }
lbl153:
                // 2 sources

                v8 /* !! */  = (reference)((K.c(22369, 7224108250209859824L) / K.c(28027, 3138077410374222445L) ^ K.c(7791, 2248184974040035813L)) + K.c(7005, 3239756733674747131L) - K.c(1746, 8742798214228306331L));
lbl154:
                // 2 sources

                var4_3 /* !! */  = (int)v8 /* !! */ ;
                if (var2_2) continue block42;
lbl156:
                // 2 sources

                var4_3 /* !! */  = K.c(10318, 8570806595950135244L) / 4 * K.c(3951, 8632748675117801824L) + K.c(16949, 3578360673638854008L);
                continue block42;
lbl158:
                // 1 sources

                v9 = hi.a("G", (int)(K.c(923, 895296709891615925L) + K.c(29116, 6414205924560969227L)), (int)K.c(10027, 1679225256257210712L), (long)834203424483934088L) - K.c(4802, 4252401469232315638L);
lbl159:
                // 2 sources

                var4_3 /* !! */  = (int)v9;
                if (var2_2) ** GOTO lbl162
lbl161:
                // 2 sources

                var4_3 /* !! */  = (int)(K.E("032yYwxgD49tVwT7", max(int int ), (int)hi.a("G", (int)(K.c(742, 3359826220219657561L) / K.c(17394, 8077223159272713439L)), (int)K.c(31324, 5913150046945580353L), (long)834203424483934088L), (int)K.c(9644, 2975331722312698562L)) - K.c(30977, 6283373570508265202L));
lbl162:
                // 2 sources

                switch (var4_3 /* !! */ ) {
                    default: {
                        v4 /* !! */  = 1.0f;
                        var4_3 /* !! */  = ((K.c(10178, 3022994047314872798L) ^ K.c(17467, 7385189109683333711L)) - K.c(6459, 5344668504645367451L) ^ K.c(18501, 5873330341662008880L)) + K.c(30775, 8929534932085118509L) + K.c(24320, 6395427701769711818L);
                        if (!var2_2) {
                            break;
                        }
                        ** GOTO lbl177
                    }
                    case 382660444: {
                        v4 /* !! */  = (float)hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1261015955360166769L), (long)789438897355831922L)), (long)371266768739483732L);
                        if (var2_2) break;
                        ** GOTO lbl31
                    }
                    case 382660443: {
                        throw null;
                    }
                }
                var4_3 /* !! */  = ((K.c(7828, 2716183112477438131L) ^ K.c(4751, 2023797215678496182L)) - K.c(28274, 6689162093065634073L) ^ K.c(5906, 650695637903112490L)) + K.c(10074, 5222259874034599954L) + K.c(2490, 8627605026415634012L);
lbl177:
                // 2 sources

                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -273568903: 
                }
                throw null;
lbl183:
                // 2 sources

                v10 /* !! */  = (CallSite)((K.c(131, 7145281357114437421L) / 5 * K.c(30939, 1761518310161258144L) ^ K.c(7038, 2976961524102100037L)) + K.c(29937, 99296680372509646L));
lbl184:
                // 2 sources

                var4_3 /* !! */  = (int)v10 /* !! */ ;
                if (var2_2) continue block42;
lbl186:
                // 2 sources

                var4_3 /* !! */  = (K.c(27249, 5930054709275985215L) + K.c(22047, 6852132889480378779L) + K.c(8057, 8036331685925351802L)) / 2 + K.c(16846, 8545651402469813954L) + K.c(13279, 330925576696290764L);
                if (var2_2) continue block42;
lbl188:
                // 2 sources

                v11 /* !! */  = (CallSite)((K.c(27840, 375348825252201451L) - K.c(10870, 1746330760088405084L) ^ K.c(2824, 2320111142399829180L)) + K.c(27872, 6840236094420353984L) + K.c(28947, 4331177518102289994L) - K.c(19313, 245092197763654829L));
lbl189:
                // 2 sources

                var4_3 /* !! */  = (int)v11 /* !! */ ;
                if (var2_2) continue block42;
lbl191:
                // 2 sources

                var4_3 /* !! */  = (int)(hi.a("G", (int)(K.c(18371, 7552469240940734939L) - K.c(13678, 5651542779980077579L)), (int)K.c(3874, 677207381519228933L), (long)834203424483934088L) * K.c(20946, 7171808831608667886L) - K.c(11212, 2616427844075472003L));
                if (var2_2) continue block42;
lbl193:
                // 2 sources

                v12 = hi.a("G", (int)hi.a("G", (int)(K.c(29146, 8869713207562608212L) ^ K.c(12812, 3632220148565892481L)), (int)K.c(24470, 8001417420815446162L), (long)834203424483934088L), (int)K.c(611, 3537095459404377551L), (long)834203424483934088L) - K.c(2936, 5512674593697359032L);
lbl194:
                // 2 sources

                var4_3 /* !! */  = (int)v12;
                if (var2_2) continue block42;
lbl196:
                // 2 sources

                var4_3 /* !! */  = (K.c(2800, 3064320621695690016L) - K.c(31860, 499646933397443470L) ^ K.c(8048, 4426444698065662093L)) + K.c(30929, 629801605746595500L) + K.c(24885, 7557436058507742826L) - K.c(12257, 7392382762183901435L);
                if (var2_2) continue block42;
lbl198:
                // 2 sources

                v13 = var4_3 /* !! */  = K.c(9806, 6327752076815944103L) * K.c(195, 777418502128955210L) / K.c(32468, 7718092544009114087L) ^ K.c(21314, 3710611476226718869L);
lbl199:
                // 2 sources

                if (var2_2) continue block42;
lbl200:
                // 2 sources

                var4_3 /* !! */  = K.c(26043, 1141082890664283012L) + K.c(6211, 7470110214765836228L) ^ K.c(25501, 3422274727035374726L);
                if (var2_2) continue block42;
lbl202:
                // 2 sources

                v14 /* !! */  = (CallSite)((K.c(5889, 9177000807047854333L) ^ K.c(20108, 4854884896349168109L)) / K.c(1801, 5872213061823621231L) * K.c(30163, 1663762786009914052L) + K.c(73, 6043612278601313856L));
lbl203:
                // 2 sources

                var4_3 /* !! */  = (int)v14 /* !! */ ;
                if (var2_2) continue block42;
lbl205:
                // 2 sources

                var4_3 /* !! */  = ((K.c(12799, 3308546678074400504L) + K.c(11768, 1485062359744332386L) + K.c(29356, 4386920172078341449L)) / K.c(28027, 3138077410374222445L) ^ K.c(7503, 6650887974333051485L)) - K.c(11915, 3160071985530519960L);
                if (var2_2) continue block42;
lbl207:
                // 2 sources

                v15 /* !! */  = (reference)((K.c(18989, 5612445267431105580L) ^ K.c(18557, 6866835919989745590L)) / K.c(1801, 5872213061823621231L) * K.c(16045, 5896199810002211170L) + K.c(6543, 4855270810858551023L));
lbl208:
                // 2 sources

                var4_3 /* !! */  = (int)v15 /* !! */ ;
                if (var2_2) continue block42;
lbl210:
                // 2 sources

                var4_3 /* !! */  = (int)(hi.a("G", (int)(K.c(1907, 3477295000970487834L) * K.c(3393, 1038668849626964545L) - K.c(23633, 5256695985068127033L)), (int)K.c(13191, 5075861956794408187L), (long)834203424483934088L) - K.c(14272, 8264563882422261815L));
                continue block42;
lbl212:
                // 2 sources

                var4_3 /* !! */  = (K.c(30888, 3507556663246493461L) ^ K.c(682, 423145761848782252L)) + K.c(9288, 6867791137941801857L) + K.c(27161, 4598721856332956697L);
lbl213:
                // 2 sources

                switch (var4_3 /* !! */ ) {
                    default: {
                        return v16;
                    }
                    case -1352401861: 
                }
                hi.a("G", (long)1275757049065691860L);
                hi.a("G", (long)1206926475581937118L);
                return (boolean)hi.a("G", (long)561677051612723832L);
                case -787914712: {
                    return false;
                }
                case -787914709: {
                    return false;
                }
                case -787914721: {
                    return true;
                }
                case -787914717: {
                    return true;
                }
                case -787914722: 
            }
            break;
        }
        return true;
    }

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)0, (long)714561758073278778L);
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

    private Vec3 j(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        float f3 = f * ((float)Math.PI / 180);
        float f4 = -f2 * ((float)Math.PI / 180);
        CallSite callSite = K.E("032yYwxgD49tVwT7", cos(double ), (double)f4);
        CallSite callSite2 = hi.a("G", (double)f4, (long)651411597689335820L);
        CallSite callSite3 = hi.a("G", (double)f3, (long)665261795861296096L);
        CallSite callSite4 = hi.a("G", (double)f3, (long)651411597689335820L);
        return new Vec3((double)(callSite2 * callSite3), (double)(-callSite4), (double)(callSite * callSite3));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean q(Object[] var1_1) {
        block15: {
            block18: {
                block17: {
                    block16: {
                        var2_2 = Dl.S();
                        var4_3 /* !! */  = K.c(32320, 4729953913265033586L) * K.c(21374, 5298442684149021732L) / K.c(28027, 3138077410374222445L) - K.c(21421, 4669617674543676443L);
                        if (!var2_2) ** GOTO lbl-1000
                        switch (var4_3 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var3_4 = hi.a("G", (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)822283321678704529L), (double)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L) - 0.4), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1024017773186779925L), (long)921489941210881726L);
                                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)654885146367939811L);
                                if (!var2_2) break block16;
                                if (v0 /* !! */  != false) break;
                                break block17;
                            }
                            case 135078299: {
                                throw null;
                            }
                        }
                        v0 /* !! */  = (CallSite)(hi.a("G", (int)(K.c(22150, 2613127306936760804L) / K.c(13135, 7806709542166912056L)), (int)K.c(1402, 6124423394336893546L), (long)834203424483934088L) ^ K.c(12354, 6922437180991856490L));
                    }
                    var4_3 /* !! */  = (int)v0 /* !! */ ;
                    if (var2_2) break block18;
                }
                var4_3 /* !! */  = ((K.c(14546, 5779515875294926608L) ^ K.c(30150, 5195991184658897839L)) - K.c(13930, 487568860379601330L)) * K.c(8378, 5090156074658975410L) + K.c(8083, 2843364511291011253L) - K.c(23512, 634417646949709258L);
                if (var2_2) break block18;
                ** GOTO lbl51
lbl23:
                // 2 sources

                while (true) {
                    v1 /* !! */  = 0;
lbl25:
                    // 2 sources

                    while (true) {
                        hi.a("G", (boolean)v1 /* !! */ , (long)399331377536836244L);
                        K.E("032yYwxgD49tVwT7", o(float ), (float)2.0f);
                        return v2;
                    }
                    break;
                }
            }
            block13: while (true) {
                block19: {
                    switch (var4_3 /* !! */ ) {
                        default: {
                            if (hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)var3_4, (long)419122760578116751L), (long)1154638568918062781L) != hi.a("j", (long)898724735523943778L)) break;
                            break block19;
                        }
                        case 2139028098: {
                            v2 = true;
                            var4_3 /* !! */  = (int)(K.E("032yYwxgD49tVwT7", max(int int ), (int)((K.c(28753, 7595540613721628245L) - K.c(4434, 5021175304820424542L) ^ K.c(20544, 5865348687177465780L)) - K.c(23724, 5010970195377239000L)), (int)K.c(20760, 1658474176433209150L)) + K.c(27340, 1815822330157204957L));
                            if (!var2_2) {
                                break block13;
                            }
                            break block15;
                        }
                        case 2139028099: {
                            v2 = false;
                            if (var2_2) break block13;
                            ** GOTO lbl23
                        }
                        case 2139028097: {
                            throw null;
                        }
                    }
lbl51:
                    // 2 sources

                    var4_3 /* !! */  = (int)(hi.a("G", (int)(K.c(9866, 3739264214351890719L) - K.c(5134, 8976667002897857352L)), (int)K.c(29031, 5713605648321125913L), (long)834203424483934088L) + K.c(16270, 3270296510327738562L));
                    if (var2_2) continue;
                }
                var4_3 /* !! */  = hi.a("G", (int)(K.c(30018, 3993900871688886919L) / K.c(13135, 7806709542166912056L)), (int)K.c(17283, 3986321021729713160L), (long)834203424483934088L) ^ K.c(9561, 4461852870548212399L);
            }
            var4_3 /* !! */  = (int)(hi.a("G", (int)((K.c(2215, 3312111002602137249L) - K.c(13508, 2074215174875274133L) ^ K.c(13839, 4241911066759321635L)) - K.c(1243, 520508632547388389L)), (int)K.c(11276, 8582736149820523284L), (long)834203424483934088L) + K.c(10116, 4048304045530302910L));
        }
        v1 /* !! */  = var4_3 /* !! */ ;
        ** while (!var2_2)
lbl60:
        // 1 sources

        switch (v1 /* !! */ ) {
            case 1152699943: {
                ** continue;
            }
        }
        return v2;
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x7E23) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 91;
                case 1 -> 8;
                case 2 -> 81;
                case 3 -> 123;
                case 4 -> 78;
                case 5 -> 73;
                case 6 -> 125;
                case 7 -> 158;
                case 8 -> 10;
                case 9 -> 232;
                case 10 -> 72;
                case 11 -> 68;
                case 12 -> 214;
                case 13 -> 15;
                case 14 -> 39;
                case 15 -> 241;
                case 16 -> 40;
                case 17 -> 179;
                case 18 -> 23;
                case 19 -> 70;
                case 20 -> 196;
                case 21 -> 102;
                case 22 -> 209;
                case 23 -> 42;
                case 24 -> 165;
                case 25 -> 63;
                case 26 -> 147;
                case 27 -> 199;
                case 28 -> 161;
                case 29 -> 244;
                case 30 -> 9;
                case 31 -> 182;
                case 32 -> 61;
                case 33 -> 248;
                case 34 -> 25;
                case 35 -> 249;
                case 36 -> 48;
                case 37 -> 143;
                case 38 -> 128;
                case 39 -> 82;
                case 40 -> 0;
                case 41 -> 194;
                case 42 -> 164;
                case 43 -> 254;
                case 44 -> 168;
                case 45 -> 33;
                case 46 -> 45;
                case 47 -> 231;
                case 48 -> 215;
                case 49 -> 3;
                case 50 -> 229;
                case 51 -> 186;
                case 52 -> 103;
                case 53 -> 190;
                case 54 -> 145;
                case 55 -> 122;
                case 56 -> 183;
                case 57 -> 167;
                case 58 -> 247;
                case 59 -> 230;
                case 60 -> 117;
                case 61 -> 121;
                case 62 -> 12;
                case 63 -> 177;
                case 64 -> 227;
                case 65 -> 252;
                case 66 -> 155;
                case 67 -> 181;
                case 68 -> 62;
                case 69 -> 152;
                case 70 -> 65;
                case 71 -> 217;
                case 72 -> 132;
                case 73 -> 76;
                case 74 -> 216;
                case 75 -> 159;
                case 76 -> 56;
                case 77 -> 119;
                case 78 -> 127;
                case 79 -> 11;
                case 80 -> 17;
                case 81 -> 66;
                case 82 -> 100;
                case 83 -> 223;
                case 84 -> 105;
                case 85 -> 129;
                case 86 -> 219;
                case 87 -> 226;
                case 88 -> 96;
                case 89 -> 114;
                case 90 -> 195;
                case 91 -> 134;
                case 92 -> 180;
                case 93 -> 47;
                case 94 -> 60;
                case 95 -> 99;
                case 96 -> 191;
                case 97 -> 235;
                case 98 -> 30;
                case 99 -> 51;
                case 100 -> 221;
                case 101 -> 137;
                case 102 -> 101;
                case 103 -> 13;
                case 104 -> 110;
                case 105 -> 238;
                case 106 -> 112;
                case 107 -> 35;
                case 108 -> 120;
                case 109 -> 59;
                case 110 -> 151;
                case 111 -> 27;
                case 112 -> 87;
                case 113 -> 34;
                case 114 -> 50;
                case 115 -> 166;
                case 116 -> 160;
                case 117 -> 146;
                case 118 -> 251;
                case 119 -> 239;
                case 120 -> 133;
                case 121 -> 53;
                case 122 -> 156;
                case 123 -> 93;
                case 124 -> 32;
                case 125 -> 255;
                case 126 -> 138;
                case 127 -> 205;
                case 128 -> 169;
                case 129 -> 4;
                case 130 -> 225;
                case 131 -> 172;
                case 132 -> 208;
                case 133 -> 80;
                case 134 -> 242;
                case 135 -> 170;
                case 136 -> 116;
                case 137 -> 211;
                case 138 -> 253;
                case 139 -> 141;
                case 140 -> 200;
                case 141 -> 108;
                case 142 -> 52;
                case 143 -> 236;
                case 144 -> 192;
                case 145 -> 16;
                case 146 -> 222;
                case 147 -> 6;
                case 148 -> 71;
                case 149 -> 92;
                case 150 -> 19;
                case 151 -> 38;
                case 152 -> 189;
                case 153 -> 49;
                case 154 -> 85;
                case 155 -> 148;
                case 156 -> 203;
                case 157 -> 55;
                case 158 -> 250;
                case 159 -> 106;
                case 160 -> 171;
                case 161 -> 149;
                case 162 -> 86;
                case 163 -> 2;
                case 164 -> 89;
                case 165 -> 22;
                case 166 -> 67;
                case 167 -> 185;
                case 168 -> 58;
                case 169 -> 98;
                case 170 -> 240;
                case 171 -> 233;
                case 172 -> 75;
                case 173 -> 37;
                case 174 -> 178;
                case 175 -> 69;
                case 176 -> 204;
                case 177 -> 157;
                case 178 -> 107;
                case 179 -> 90;
                case 180 -> 74;
                case 181 -> 29;
                case 182 -> 14;
                case 183 -> 44;
                case 184 -> 54;
                case 185 -> 124;
                case 186 -> 139;
                case 187 -> 206;
                case 188 -> 57;
                case 189 -> 197;
                case 190 -> 187;
                case 191 -> 153;
                case 192 -> 224;
                case 193 -> 109;
                case 194 -> 162;
                case 195 -> 237;
                case 196 -> 77;
                case 197 -> 142;
                case 198 -> 64;
                case 199 -> 111;
                case 200 -> 154;
                case 201 -> 88;
                case 202 -> 31;
                case 203 -> 218;
                case 204 -> 198;
                case 205 -> 234;
                case 206 -> 36;
                case 207 -> 126;
                case 208 -> 212;
                case 209 -> 213;
                case 210 -> 140;
                case 211 -> 176;
                case 212 -> 220;
                case 213 -> 130;
                case 214 -> 1;
                case 215 -> 210;
                case 216 -> 28;
                case 217 -> 18;
                case 218 -> 136;
                case 219 -> 173;
                case 220 -> 188;
                case 221 -> 5;
                case 222 -> 228;
                case 223 -> 104;
                case 224 -> 79;
                case 225 -> 118;
                case 226 -> 46;
                case 227 -> 135;
                case 228 -> 21;
                case 229 -> 20;
                case 230 -> 95;
                case 231 -> 243;
                case 232 -> 144;
                case 233 -> 207;
                case 234 -> 163;
                case 235 -> 201;
                case 236 -> 175;
                case 237 -> 245;
                case 238 -> 43;
                case 239 -> 174;
                case 240 -> 113;
                case 241 -> 7;
                case 242 -> 97;
                case 243 -> 150;
                case 244 -> 26;
                case 245 -> 246;
                case 246 -> 193;
                case 247 -> 115;
                case 248 -> 84;
                case 249 -> 83;
                case 250 -> 131;
                case 251 -> 202;
                case 252 -> 94;
                case 253 -> 41;
                case 254 -> 184;
                default -> 24;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            K.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6F3B;
        if (k[n2] == null) {
            K.k[n2] = (int)(e[n2] ^ l);
        }
        return k[n2];
    }
}
