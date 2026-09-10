/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.ClipContext
 *  net.minecraft.world.level.ClipContext$Block
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.phys.EntityHitResult
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
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class nJ {
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean f(uK var0, Direction var1_1, BlockPos var2_2, boolean var3_3) {
        block16: {
            block19: {
                block18: {
                    block17: {
                        var4_4 = Dl.t();
                        var11_5 /* !! */  = nJ.l("fZWWZ4GmSgixdaiF", max(int int ), (int)(nJ.a(17047, 8312431066362509460L) * nJ.a(4108, 3959777082479880801L)), (int)nJ.a(5167, 1587768445618040521L)) * nJ.a(10123, 3831771343230967283L) - nJ.a(23416, 5721665712569606552L);
                        if (var4_4) ** GOTO lbl-1000
                        v0 = var11_5 /* !! */ ;
                        if (var4_4 != false) return (boolean)v0;
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var5_6 = hi.a("G", (float)hi.a("\u00a5", (Object)var0, (long)1059675231579017960L), (float)hi.a("\u00a5", (Object)var0, (long)1049231279723202751L), (long)1201801463705872112L);
                                var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (float)1.0f, (long)471623755036185916L);
                                var7_8 = 4.5;
                                var9_9 = hi.a("\u00a5", (Object)var6_7, (Object)hi.a("\u00a5", (Object)var5_6, (double)var7_8, (long)1080829230854482551L), (long)701637995304699260L);
                                var10_10 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)new ClipContext((Vec3)var6_7, (Vec3)var9_9, (ClipContext.Block)hi.a("j", (long)1246558594152704253L), (ClipContext.Fluid)hi.a("j", (long)747535818869381789L), (Entity)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L)), (long)438016674394306919L);
                                if (var4_4) break block17;
                                if (hi.a("\u00a5", (Object)var10_10, (long)628689410903398059L) != hi.a("j", (long)958553802615151507L)) break;
                                break block18;
                            }
                            case 1784320981: {
                                hi.a("G", (double)15.0, (long)439999302750573161L);
                                v0 = hi.a("G", (long)495291380660240240L);
                                return (boolean)v0;
                            }
                        }
                        var11_5 /* !! */  = (reference)((nJ.a(3146, 2889362641057363564L) - nJ.a(25730, 3749283958890978908L)) * nJ.a(10350, 2754316901616456307L) - nJ.a(171, 2475953156142217813L) + nJ.a(8464, 1213096649511574498L));
                    }
                    if (!var4_4) break block19;
                }
                var11_5 /* !! */  = (reference)(((nJ.a(26471, 9218731448662449520L) - nJ.a(29167, 5981184446826990515L) ^ nJ.a(24311, 316457253058962589L)) - nJ.a(3414, 4155300127801718586L)) / nJ.a(27144, 3894182911614144741L) - nJ.a(16326, 2291097224452015508L));
                if (var4_4) ** GOTO lbl56
            }
            block14: while (true) {
                block26: {
                    block25: {
                        block24: {
                            block22: {
                                block23: {
                                    block21: {
                                        block20: {
                                            switch (var11_5 /* !! */ ) {
                                                case 1895238885: {
                                                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var10_10, (long)367457867556936554L), (Object)var2_2, (long)1203894332961133998L);
                                                    if (var4_4) break block20;
                                                    if (v1 /* !! */  == false) break;
                                                    break block21;
                                                }
                                                case 1895238886: {
                                                    v2 /* !! */  = var3_3;
                                                    if (var4_4) break block22;
                                                    if (!v2 /* !! */ ) break block23;
                                                    break block24;
                                                }
                                                case 1895238889: {
                                                    if (hi.a("\u00a5", (Object)var10_10, (long)1085058882649236422L) != var1_1) break block25;
                                                    break block26;
                                                }
                                                case 1895238884: {
                                                    v3 = true;
                                                    var11_5 /* !! */  = (reference)((hi.a("G", (int)nJ.a(22094, 8953749769539415042L), (int)nJ.a(2107, 2642369655767708231L), (long)834203424483934088L) ^ nJ.a(9241, 359431472186138172L)) + nJ.a(18374, 1801071951191047557L) - nJ.a(14809, 2415532284860302285L));
                                                    if (var4_4) {
                                                        break block14;
                                                    }
                                                    break block16;
                                                }
                                                case 1895238888: {
                                                    v3 = false;
                                                    if (!var4_4) break block14;
                                                    return v3;
                                                }
                                                case 1895238887: {
                                                    throw null;
                                                }
                                            }
lbl56:
                                            // 2 sources

                                            v1 /* !! */  = var11_5 /* !! */  = (reference)((nJ.a(17058, 622232237855832248L) / nJ.a(30757, 2710600589188121291L) - nJ.a(25406, 5586102553583933929L) - nJ.a(10419, 917003391070278301L)) / 5 - nJ.a(3278, 9159613049695352523L));
                                        }
                                        if (!var4_4) continue;
                                    }
                                    var11_5 /* !! */  = (reference)(nJ.a(19863, 6828069597319231385L) - nJ.a(26659, 5839486987939828447L) + nJ.a(3635, 3642633376642643179L) ^ nJ.a(28580, 6474953978001151434L));
                                    if (!var4_4) continue;
                                }
                                v2 /* !! */  = hi.a("G", (int)(nJ.a(21160, 8960010848986065010L) + nJ.a(29102, 4639671720849230734L)), (int)nJ.a(25266, 2292820410395842741L), (long)834203424483934088L) - nJ.a(13481, 8868079381892206264L);
                            }
                            var11_5 /* !! */  = (reference)v2 /* !! */ ;
                            if (!var4_4) continue;
                        }
                        var11_5 /* !! */  = hi.a("G", (int)hi.a("G", (int)nJ.a(20108, 4628154702676784165L), (int)nJ.a(4778, 2536032370049755219L), (long)834203424483934088L), (int)nJ.a(19411, 6241184476618223894L), (long)834203424483934088L) - nJ.a(24181, 8073217212670665917L);
                        if (!var4_4) continue;
                    }
                    var11_5 /* !! */  = (reference)((nJ.a(6848, 3411300255373533186L) / nJ.a(20908, 3078880815484857340L) - nJ.a(31017, 9052183617880998907L) - nJ.a(26334, 565869276737428614L)) / 5 - nJ.a(7190, 4899245016746763879L));
                    if (!var4_4) continue;
                }
                var11_5 /* !! */  = nJ.l("fZWWZ4GmSgixdaiF", max(int int ), (int)(nJ.a(5851, 5260903534351527108L) + nJ.a(22688, 3127547013382562379L)), (int)nJ.a(22124, 5104845305342553130L)) - nJ.a(8922, 3057830380965140619L);
            }
            var11_5 /* !! */  = (reference)((hi.a("G", (int)nJ.a(8693, 1802415628161162165L), (int)nJ.a(2408, 2011175430828438451L), (long)834203424483934088L) ^ nJ.a(28807, 1251538857770699380L)) + nJ.a(2390, 383277015219155884L) - nJ.a(2663, 1445862838233051159L));
        }
        switch (var11_5 /* !! */ ) {
            default: {
                return v3;
            }
            case -795493255: 
        }
        throw null;
        return false;
    }

    public static HitResult f(uK uK2, double d) {
        Object[] objectArray = new Object[3];
        objectArray[2] = Float.valueOf(0.0f);
        objectArray[1] = d;
        objectArray[0] = uK2;
        return hi.a("G", (Object)objectArray, (long)422253046505194019L);
    }

    public static boolean T(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        BlockPos blockPos = (BlockPos)objectArray[1];
        Direction direction = (Direction)objectArray[2];
        return (boolean)hi.a("G", (Object)uK2, (Object)direction, (Object)blockPos, (boolean)true, (long)1118523526549459047L);
    }

    public static /* bridge */ /* synthetic */ CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public static boolean S(Vec3 var0, Vec3 var1_1) {
        block14: {
            var2_2 = Dl.t();
            var3_3 = nJ.a(15312, 7721584223487689010L) / nJ.a(17262, 3132475369403021666L) * nJ.a(12228, 2521035716403369455L) + nJ.a(4511, 5893919727644191651L) ^ nJ.a(32259, 1217242383837447414L);
            if (!var2_2) ** GOTO lbl10
            block8: while (true) {
                block16: {
                    block15: {
                        if (hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)new ClipContext(var0, var1_1, (ClipContext.Block)hi.a("j", (long)1246558594152704253L), (ClipContext.Fluid)hi.a("j", (long)747535818869381789L), (Entity)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L)), (long)438016674394306919L), (long)628689410903398059L) == hi.a("j", (long)958553802615151507L)) break block15;
                        var3_3 = nJ.a(11481, 5434991307198600943L) / 4 + nJ.a(17036, 5487467938454173941L) - nJ.a(9323, 7021782863423708753L) + nJ.a(22095, 8742881857276865568L);
                        if (!var2_2) break block16;
                    }
                    var3_3 = (nJ.a(25922, 7202090228270849833L) + nJ.a(25471, 5825094258431383911L)) * nJ.a(8834, 1278148067281574108L) + nJ.a(24720, 3875519662179375771L) ^ nJ.a(29274, 4710226135127345203L);
                }
                switch (var3_3) {
                    default: {
                        continue block8;
                    }
                    case 1387066521: {
                        v0 = true;
                        var3_3 = nJ.a(16174, 1544124885212759317L) + nJ.a(1137, 5458326815937150474L) + nJ.a(11811, 5761622525742453892L) + nJ.a(28286, 5393419599369163807L);
                        if (var2_2) {
                            break block8;
                        }
                        break block14;
                    }
                    case 1387066520: {
                        v0 = false;
                        if (!var2_2) break block8;
                        return v0;
                    }
                    case 1387066523: {
                        throw null;
                    }
                }
                break;
            }
            var3_3 = nJ.a(13510, 2041129476549643955L) + nJ.a(13620, 5517193359449722630L) + nJ.a(5065, 4697359939913689536L) + nJ.a(13566, 5277363804291075810L);
        }
        switch (var3_3) {
            default: {
                return v0;
            }
            case -1846206972: 
        }
        throw null;
    }

    public static boolean Q(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        BlockPos blockPos = (BlockPos)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        return (boolean)nJ.l("fZWWZ4GmSgixdaiF", f(com.github.epsilon.uK net.minecraft.core.Direction net.minecraft.core.BlockPos boolean ), (uK)uK2, (Direction)hi.a("j", (long)1151726402263101942L), (BlockPos)blockPos, (boolean)bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$raytrace$0(Entity entity) {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)entity, (long)1306501691620228693L);
                if (!bl) break block4;
                if (object != false) break block5;
                object = hi.a("\u00a5", (Object)entity, (long)1157067657770687608L);
            }
            if (!bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    public static boolean e(uK uK2, BlockPos blockPos) {
        return (boolean)nJ.l("fZWWZ4GmSgixdaiF", f(com.github.epsilon.uK net.minecraft.core.Direction net.minecraft.core.BlockPos boolean ), (uK)uK2, (Direction)hi.a("j", (long)1151726402263101942L), (BlockPos)blockPos, (boolean)false);
    }

    public static HitResult D(Object[] objectArray) {
        uK uK2 = (uK)objectArray[0];
        double d = (Double)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = d;
        objectArray2[0] = uK2;
        return hi.a("G", (Object)objectArray2, (long)615596062594456711L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static HitResult N(Object[] var0) {
        block46: {
            block45: {
                var1_1 = (uK)var0[0];
                var3_2 = (Double)var0[1];
                var5_3 = ((Float)var0[2]).floatValue();
                var2_4 = (Entity)var0[3];
                var6_5 = Dl.S();
                var29_6 /* !! */  = (nJ.a(29246, 5416408819200313466L) - nJ.a(21650, 7753388902120091312L) - nJ.a(7441, 7280440933027850175L) + nJ.a(6630, 6047536336384434971L)) * nJ.a(11001, 4313127476863406324L) + nJ.a(3164, 7937954608763844250L);
                if (var6_5) break block45;
lbl9:
                // 2 sources

                while (true) {
                    if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L) == null) {
                        var29_6 /* !! */  = (nJ.a(869, 9017530662493764042L) ^ nJ.a(22002, 385562383144775610L)) / nJ.a(27198, 5834359656245580015L) - nJ.a(29921, 7247903049881275977L);
                        if (var6_5) break block45;
                    }
                    var29_6 /* !! */  = (int)(hi.a("G", (int)(nJ.a(6679, 7094228473759768610L) / 3 - nJ.a(21171, 4705849801925650528L)), (int)nJ.a(25654, 6363347519759900242L), (long)834203424483934088L) + nJ.a(22201, 3877306057090264157L));
                    if (var6_5) break block45;
                    ** GOTO lbl54
                    break;
                }
lbl16:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl18:
                // 2 sources

                while (true) {
                    v0 /* !! */  = hi.a("\u00a5", (Object)var25_23, (long)476537408042860654L);
                    if (!var6_5) ** GOTO lbl180
                    if (v0 /* !! */  == false) ** GOTO lbl179
                    ** GOTO lbl182
                    break;
                }
lbl23:
                // 2 sources

                while (true) {
                    var15_14 = var22_20;
                    var16_15 = var26_24;
                    var17_16 = (double)var27_25;
                    if (var6_5) ** GOTO lbl243
lbl28:
                    // 2 sources

                    while (!var6_5) lbl-1000:
                    // 2 sources

                    {
                        while (var15_14 != null) {
                            ** GOTO lbl250
                        }
                        ** GOTO lbl248
                    }
                    ** GOTO lbl246
                    break;
                }
            }
            block39: while (true) {
                switch (var29_6 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1380937589: {
                        if (var2_4 != null) ** GOTO lbl54
                        ** GOTO lbl56
                    }
                    case -1380937587: {
                        var7_7 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
                        var8_8 = hi.a("\u00a5", (Object)var2_4, (float)var7_7, (long)1159454227238996293L);
                        var9_9 = hi.a("G", (float)hi.a("\u00a5", (Object)var1_1, (long)1059675231579017960L), (float)nJ.l("fZWWZ4GmSgixdaiF", p(), (uK)var1_1), (long)1201801463705872112L);
                        var10_10 = hi.a("\u00a5", (Object)var8_8, (Object)hi.a("\u00a5", (Object)var9_9, (double)var3_2, (long)1080829230854482551L), (long)701637995304699260L);
                        var11_11 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)new ClipContext((Vec3)var8_8, (Vec3)var10_10, (ClipContext.Block)hi.a("j", (long)1246558594152704253L), (ClipContext.Fluid)hi.a("j", (long)747535818869381789L), var2_4), (long)438016674394306919L);
                        var12_12 /* !! */  = var3_2;
                        if (!var6_5) ** GOTO lbl59
                        if (hi.a("\u00a5", (Object)var11_11, (long)760876273703437601L) == hi.a("j", (long)958553802615151507L)) ** GOTO lbl58
                        ** GOTO lbl60
                    }
                    case -1380937586: {
                        throw null;
                    }
lbl54:
                    // 2 sources

                    var29_6 /* !! */  = nJ.a(21693, 8880038167410536062L) + nJ.a(23371, 7060142177511498066L) - nJ.a(13357, 5767268607153770212L);
                    if (var6_5) continue block39;
lbl56:
                    // 2 sources

                    var29_6 /* !! */  = (nJ.a(20724, 6805547939635391039L) ^ nJ.a(26012, 4031721230522572660L)) / nJ.a(20043, 3455553234939999236L) - nJ.a(14647, 6523838521297404770L);
                    continue block39;
lbl58:
                    // 1 sources

                    var29_6 /* !! */  = nJ.a(28036, 8549680631035713426L) / nJ.a(32657, 8429325624143365457L) ^ nJ.a(12472, 6602568312189684451L);
lbl59:
                    // 2 sources

                    if (var6_5) break block46;
lbl60:
                    // 2 sources

                    var29_6 /* !! */  = (nJ.a(6096, 8894499072623291831L) / nJ.a(16594, 3978626431184534067L) + nJ.a(27274, 4742401270974074979L)) * nJ.a(725, 2868565425315625201L) + nJ.a(25785, 7795198921580142206L);
                    if (var6_5) break block46;
                    ** GOTO lbl80
                    case -1380937588: 
                }
                break;
            }
            return null;
        }
        block40: while (true) {
            switch (var29_6 /* !! */ ) {
                default: {
                    var12_12 /* !! */  = (double)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var11_11, (long)992105621747975200L), (Object)var8_8, (long)1256728004038227497L);
                    if (var6_5) break;
                    ** GOTO lbl16
                }
                case -298195188: {
                    ** continue;
                }
                case -298195190: {
                    nJ.l("fZWWZ4GmSgixdaiF", z());
                    var29_6 /* !! */  = nJ.a(22387, 361855910532377950L) * nJ.a(3674, 5123730119543993407L) + nJ.a(11810, 6114069238180123728L);
                    continue block40;
                }
            }
lbl80:
            // 2 sources

            var29_6 /* !! */  = nJ.a(14492, 4155167733941011044L) / nJ.a(28476, 8639345001105577440L) ^ nJ.a(24856, 7448346938828446539L);
        }
        var14_13 = hi.a("\u00a5", (Object)var8_8, (Object)hi.a("\u00a5", (Object)var9_9, (double)var3_2, (long)1080829230854482551L), (long)701637995304699260L);
        var15_14 = null;
        var16_15 = null;
        var17_16 = var12_12 /* !! */ ;
        var19_17 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var2_4, (long)972363407830745929L), (Object)hi.a("\u00a5", (Object)var9_9, (double)var3_2, (long)1080829230854482551L), (long)885389251996139345L), (double)1.0, (long)939956135489390941L);
        var20_18 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)var2_4, (Object)var19_17, (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$raytrace$0(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)(), (long)864039115099713828L);
        var21_19 = hi.a("\u00a5", (Object)var20_18, (long)1240653736693366367L);
        var29_6 /* !! */  = nJ.a(20104, 6743549955943789783L) / 3 ^ nJ.a(28164, 8391358066545972393L);
        block41: while (true) {
            block51: {
                block50: {
                    block49: {
                        block47: {
                            block48: {
                                block52: {
                                    switch (var29_6 /* !! */ ) {
                                        default: {
                                            v1 /* !! */  = hi.a("\u00a5", (Object)var21_19, (long)984088978567310565L);
                                            if (!var6_5) ** GOTO lbl122
                                            if (v1 /* !! */  == false) ** GOTO lbl121
                                            ** GOTO lbl124
                                        }
                                        case -1398708805: {
                                            var22_20 = (Entity)nJ.l("fZWWZ4GmSgixdaiF", next(), (Iterator)var21_19);
                                            var23_21 = hi.a("\u00a5", (Object)var22_20, (long)1008861028606564454L) + var5_3;
                                            var24_22 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var22_20, (long)972363407830745929L), (double)((double)var23_21), (long)939956135489390941L);
                                            var25_23 = hi.a("\u00a5", (Object)var24_22, (Object)var8_8, (Object)var14_13, (long)926342417919587352L);
                                            v2 /* !! */  = hi.a("\u00a5", (Object)var24_22, (Object)var8_8, (long)436670141505435777L);
                                            if (!var6_5) ** GOTO lbl127
                                            if (v2 /* !! */  == false) ** GOTO lbl126
                                            ** GOTO lbl129
                                        }
                                        case -1398708801: {
                                            ** GOTO lbl-1000
                                        }
                                        case -1398708803: {
                                            v3 = var17_16 == var12_12 /* !! */  ? 0 : (var17_16 < var12_12 /* !! */  ? -1 : 1);
                                            if (!var6_5) break block47;
                                            if (v3 < 0) break block48;
                                            break block49;
                                        }
                                        case -1398708804: {
                                            if (hi.a("\u00a5", (Object)var11_11, (long)760876273703437601L) != hi.a("j", (long)958553802615151507L)) break block50;
                                            break block51;
                                        }
                                        case -1398708806: {
                                            hi.a("G", (long)1103686052128593910L);
                                            var29_6 /* !! */  = (int)(hi.a("G", (int)(nJ.a(31975, 7558071044982163173L) * nJ.a(16250, 3787394758182798643L) - nJ.a(24859, 1614897182578563884L)), (int)nJ.a(239, 5239885477046565600L), (long)834203424483934088L) / 4 + nJ.a(26796, 8693946898975478503L));
                                            continue block41;
                                        }
lbl121:
                                        // 1 sources

                                        v1 /* !! */  = (CallSite)(nJ.a(29603, 3270638237105211785L) / nJ.a(5443, 2371529819426369328L) / nJ.a(10004, 6927071216400178556L) ^ nJ.a(3626, 6351117101953528975L) ^ nJ.a(22626, 9026398884540604963L));
lbl122:
                                        // 2 sources

                                        var29_6 /* !! */  = (int)v1 /* !! */ ;
                                        if (var6_5) continue block41;
lbl124:
                                        // 2 sources

                                        var29_6 /* !! */  = (nJ.a(2146, 8388086248772186678L) ^ nJ.a(20721, 694834634202999488L)) - nJ.a(19506, 7691086933968123473L) - nJ.a(14575, 4568678722331771644L) + nJ.a(31383, 5032784127233114280L);
                                        continue block41;
lbl126:
                                        // 1 sources

                                        v2 /* !! */  = (CallSite)((nJ.a(30402, 8053098949780524038L) * nJ.a(16123, 6018566643373016275L) - nJ.a(23362, 2821883173728313748L)) * nJ.a(20378, 4889971444667577755L) - nJ.a(5559, 2973504894290308970L));
lbl127:
                                        // 2 sources

                                        var29_6 /* !! */  = (int)v2 /* !! */ ;
                                        if (var6_5) break block52;
lbl129:
                                        // 2 sources

                                        var29_6 /* !! */  = (hi.a("G", (int)(nJ.a(28144, 2207099195419416501L) - nJ.a(11646, 3673228769442633579L)), (int)nJ.a(18308, 3976083939374038345L), (long)834203424483934088L) - nJ.a(17670, 6405758133331853255L)) / nJ.a(20908, 3078880815484857340L) ^ nJ.a(25686, 53734443703262880L);
                                        if (var6_5) break block52;
                                        ** GOTO lbl169
                                        case -1398708799: {
                                            return new EntityHitResult(var15_14, var16_15);
                                        }
                                        case -1398708800: 
                                    }
                                    return var11_11;
                                }
                                block42: while (true) {
                                    block59: {
                                        block58: {
                                            block56: {
                                                block57: {
                                                    block55: {
                                                        block54: {
                                                            block53: {
                                                                switch (var29_6 /* !! */ ) {
                                                                    default: {
                                                                        cfr_temp_0 = var17_16 - 0.0;
                                                                        v4 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                        if (!var6_5) break block53;
                                                                        if (v4 < 0) break;
                                                                        break block54;
                                                                    }
                                                                    case -315500192: {
                                                                        var15_14 = var22_20;
                                                                        var16_15 = (Vec3)hi.a("\u00a5", (Object)var25_23, (Object)var8_8, (long)535909545969414314L);
                                                                        var17_16 = 0.0;
                                                                        if (var6_5) break block55;
                                                                        ** GOTO lbl18
                                                                    }
                                                                    case -315500194: {
                                                                        ** continue;
                                                                    }
                                                                    case -315500195: {
                                                                        var26_24 = (Vec3)hi.a("\u00a5", (Object)var25_23, (long)954639740495073388L);
                                                                        var27_25 = hi.a("\u00a5", (Object)var8_8, (Object)var26_24, (long)1256728004038227497L);
                                                                        v5 /* !! */  = var27_25 == var17_16 ? 0 : (var27_25 < var17_16 ? -1 : 1);
                                                                        if (!var6_5) break block56;
                                                                        if (v5 /* !! */  < 0) break block57;
                                                                        break block58;
                                                                    }
                                                                    case -315500197: {
                                                                        ** GOTO lbl28
                                                                    }
                                                                    case -315500193: {
                                                                        hi.a("G", (long)672565527819449937L);
                                                                        hi.a("G", (long)738323961753190111L);
                                                                        var29_6 /* !! */  = nJ.l("fZWWZ4GmSgixdaiF", max(int int ), (int)((nJ.a(22502, 3073463476009627099L) + nJ.a(21634, 6821874867091467848L)) / nJ.a(12010, 3381646822494999552L) ^ nJ.a(25170, 4037867858307831974L)), (int)nJ.a(18382, 8191953038882372891L)) ^ nJ.a(29589, 93183168003230124L);
                                                                        continue block42;
                                                                    }
                                                                }
lbl169:
                                                                // 2 sources

                                                                v4 = (nJ.a(2128, 6804248665174979322L) + nJ.a(8667, 2256538594080103365L)) * nJ.a(14144, 21934811742702928L) - nJ.a(6499, 5561830398494253847L);
                                                            }
                                                            var29_6 /* !! */  = (int)v4;
                                                            if (var6_5) continue;
                                                        }
                                                        var29_6 /* !! */  = hi.a("G", (int)((nJ.l("fZWWZ4GmSgixdaiF", max(int int ), (int)nJ.a(8362, 3928003857135835861L), (int)nJ.a(28380, 4555239799234712715L)) ^ nJ.a(24899, 731366812000410599L)) * nJ.a(621, 2151027745857157298L)), (int)nJ.a(21601, 642936095194803768L), (long)834203424483934088L) ^ nJ.a(13276, 3656186580411877680L);
                                                        if (var6_5) continue;
                                                    }
                                                    var29_6 /* !! */  = (nJ.a(10606, 8810201504469652297L) + nJ.a(1618, 401601676477152287L)) * nJ.a(28903, 935025540013673003L) - nJ.a(21959, 3441654283130072851L);
                                                    if (var6_5) continue;
lbl179:
                                                    // 2 sources

                                                    v0 /* !! */  = (CallSite)((nJ.a(10606, 8810201504469652297L) + nJ.a(1618, 401601676477152287L)) * nJ.a(28903, 935025540013673003L) - nJ.a(21959, 3441654283130072851L));
lbl180:
                                                    // 2 sources

                                                    var29_6 /* !! */  = (int)v0 /* !! */ ;
                                                    if (var6_5) continue;
lbl182:
                                                    // 2 sources

                                                    var29_6 /* !! */  = nJ.a(32609, 8484930648659314023L) * nJ.a(15186, 6592806697096741172L) - nJ.a(22276, 4221927117684895231L);
                                                    continue;
                                                }
                                                v5 /* !! */  = (reference)(nJ.a(18671, 6771393160925541013L) + nJ.a(28293, 7496797644222747847L) ^ nJ.a(9333, 6418541342439251600L));
                                            }
                                            var29_6 /* !! */  = (int)v5 /* !! */ ;
                                            if (var6_5) break block59;
                                        }
                                        var29_6 /* !! */  = (nJ.a(13199, 675612860522826223L) ^ nJ.a(11925, 4468869742247679162L)) + nJ.a(2410, 3855430686749012873L);
                                        if (!var6_5) ** GOTO lbl220
                                    }
                                    block43: do lbl-1000:
                                    // 5 sources

                                    {
                                        block66: {
                                            block64: {
                                                block65: {
                                                    block63: {
                                                        block62: {
                                                            block61: {
                                                                block60: {
                                                                    switch (var29_6 /* !! */ ) {
                                                                        default: {
                                                                            cfr_temp_1 = var17_16 - 0.0;
                                                                            v6 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                            if (!var6_5) break block60;
                                                                            if (v6 != false) break;
                                                                            break block61;
                                                                        }
                                                                        case -2079813339: {
                                                                            if (hi.a("\u00a5", (Object)var22_20, (long)818248345734393164L) != hi.a("\u00a5", (Object)var2_4, (long)818248345734393164L)) break block62;
                                                                            break block63;
                                                                        }
                                                                        case -2079813341: {
                                                                            cfr_temp_2 = var17_16 - 0.0;
                                                                            v7 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                            if (!var6_5) break block64;
                                                                            if (v7 != false) break block65;
                                                                            break block66;
                                                                        }
                                                                        case -2079813342: {
                                                                            var15_14 = var22_20;
                                                                            var16_15 = var26_24;
                                                                            if (var6_5) break block43;
                                                                            ** GOTO lbl23
                                                                        }
                                                                        case -2079813344: {
                                                                            ** continue;
                                                                        }
                                                                        case -2079813340: {
                                                                            nJ.l("fZWWZ4GmSgixdaiF", P());
                                                                            return null;
                                                                        }
                                                                    }
lbl220:
                                                                    // 2 sources

                                                                    v6 = (nJ.a(10606, 8810201504469652297L) + nJ.a(1618, 401601676477152287L)) * nJ.a(28903, 935025540013673003L) - nJ.a(21959, 3441654283130072851L);
                                                                }
                                                                var29_6 /* !! */  = (int)v6;
                                                                if (var6_5) continue block42;
                                                            }
                                                            var29_6 /* !! */  = nJ.a(23717, 8315615648617424559L) + nJ.a(1776, 4167107111881358553L) ^ nJ.a(16894, 5349860736640940801L);
                                                            if (var6_5) ** GOTO lbl-1000
                                                        }
                                                        var29_6 /* !! */  = nJ.a(22409, 1757827381262446036L) + nJ.a(25893, 3624373132973989723L) ^ nJ.a(20631, 3101676669111102055L);
                                                        if (var6_5) ** GOTO lbl-1000
                                                    }
                                                    var29_6 /* !! */  = (int)(hi.a("G", (int)nJ.a(10834, 1193763212038246581L), (int)nJ.a(10719, 9080414015445930885L), (long)834203424483934088L) / nJ.a(28448, 4267091362826147104L) + nJ.a(14365, 4360917866586800646L));
                                                    if (var6_5) ** GOTO lbl-1000
                                                }
                                                v7 = (nJ.a(10606, 8810201504469652297L) + nJ.a(1618, 401601676477152287L)) * nJ.a(28903, 935025540013673003L) - nJ.a(21959, 3441654283130072851L);
                                            }
                                            var29_6 /* !! */  = (int)v7;
                                            if (var6_5) continue block42;
                                        }
                                        var29_6 /* !! */  = (int)(nJ.l("fZWWZ4GmSgixdaiF", max(int int ), (int)(hi.a("G", (int)nJ.a(26153, 6817400098882673767L), (int)nJ.a(31141, 8729718085814469559L), (long)834203424483934088L) - nJ.a(28858, 3947949689208261356L)), (int)nJ.a(15593, 5643117474057029259L)) + nJ.a(7550, 680393679502288785L) + nJ.a(10346, 1599705139953373786L));
                                    } while (var6_5);
                                    var29_6 /* !! */  = (nJ.a(10606, 8810201504469652297L) + nJ.a(1618, 401601676477152287L)) * nJ.a(28903, 935025540013673003L) - nJ.a(21959, 3441654283130072851L);
                                    if (var6_5) continue;
lbl243:
                                    // 2 sources

                                    var29_6 /* !! */  = (nJ.a(10606, 8810201504469652297L) + nJ.a(1618, 401601676477152287L)) * nJ.a(28903, 935025540013673003L) - nJ.a(21959, 3441654283130072851L);
                                    if (!var6_5) break;
                                }
lbl246:
                                // 2 sources

                                var29_6 /* !! */  = nJ.a(1513, 4651719697105305553L) / 3 ^ nJ.a(31537, 3354736825564414261L);
                                if (var6_5) continue;
lbl248:
                                // 2 sources

                                var29_6 /* !! */  = nJ.a(26759, 5938302744387900144L) / 4 ^ nJ.a(18463, 1061081495326192190L);
                                if (var6_5) continue;
lbl250:
                                // 2 sources

                                var29_6 /* !! */  = nJ.a(6657, 2398981864060231733L) + nJ.a(1549, 6001930186625727682L) - nJ.a(13309, 5769898216326695351L) - nJ.a(17659, 1248349447182351915L) ^ nJ.a(4715, 7599302639890180250L);
                                if (var6_5) continue;
                            }
                            v3 = nJ.a(6785, 6543434822834102317L) + nJ.a(29153, 3014776568290495383L) + nJ.a(6798, 5059117671547019437L);
                        }
                        var29_6 /* !! */  = (int)v3;
                        if (var6_5) continue;
                    }
                    var29_6 /* !! */  = (nJ.a(12829, 5781440394360817710L) + nJ.a(21484, 5257701969589135643L)) / nJ.a(20585, 3755073961595988567L) - nJ.a(18912, 4437266691894735848L) - nJ.a(2854, 8990852606246531560L);
                    if (var6_5) continue;
                }
                var29_6 /* !! */  = nJ.a(30412, 4921421435437796455L) / 4 ^ nJ.a(25083, 4393483991763508183L);
                if (var6_5) continue;
            }
            var29_6 /* !! */  = nJ.a(5816, 4051510883334335585L) + nJ.a(22007, 4353060833051733936L) + nJ.a(7027, 8471322879721971982L);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5701344905282031890L;
                var6_1 = new long[203];
                var3_2 = 0;
                var4_3 = "\u00d5Q\u0090\u00c2\u00a8\u00b5\u00fa\u0090\u00e7\u00e6\u00d3l1l\u000eMV\u00b8^\u00a2\u00e3\u009a\u0099S*\"\u00d8\u001a>\u001d\u00e2\u0091\u00f4VB\u008eE\u00c8+\u00e5\u00a1Qo\u00b3\u000e\f\fb\u00fe\u00df0\u0004\u00a8\u00d7e\u00e7\u00e7!\u00d1\u0004\t\u00c37\u0090\u001bks\u00d8\u00ce\u009e\u008f\u00f2<\u00b2\u00b9\u00cdR\u00dd\u000f\u00ffNF&\u00f7\b6\u00e8\u00eb\u00a2\u00c7\u00d5e\u00ce\u00a1\u0006\u0083;E@\u00aai \u00b2\u001a`\u0000,a\u000b\u00a4@4\u00b5\u0083DIV\u00b8\u00c3\u008b\u00df\u001bb\u0091\b\u000e$\u00073\u00ad\u007f\u00c4A\u0092\u00aa\u00a4\u00fd3x1\u00d6#\u000e\u0014\u00ee\u00c2$Mk\u00a3\u00d4(\u001c:\u008f9\u008e\u00a4<\u009fp\u00c8\u0002\u00fc!\u00a5P\u00c3\u00f9#No\u008e\u0001\u0094\u0094\u00e8R\u00f0\u00d4\"v\u00c1:\u001d\u00d2\u00b1z\u00fb\r\u00be\u00b4Ia\u00e3[E1\u00beX\u000e\u00ff\u00ddi\u0013b\u00cc\u00e3\u00fe\u008e\u001a]\u0015\u001aY\u00bf\u00f5T\u00f4\u009d\u00adT\u0007\u007f\u0013\u00fa\u00eb\u0007\u00d09y3z\u00d1\u00d9azB1W\u00c3\u00e5\u008a\u0092\u00b0v>2\u00dbU\u0018g\u00e4g:}\u00a8\u00fa\u00ac>\u00f0\u001a\t\u0084/\u00f5\u000e\u00b7\u00edrFb\u0005\u0086\u00bd\u00b9\"]e\u0010\u009b\u0014\u00dc\u00b4\u0083b\u0014\u00cfH\u00d0\u00882\u0096\u00f9\rn*P\u0088\u001cK}\f\u00af\u00b1G\u0080\u00dfV*3\u00d2\u00d9\u00e6\u00b7Y\u00c3\u0085\u0017\u000f\u009d\u00a6\u00ab~\u00df|_\u00fd\u00e7\u00e1fy\u00d2\u00a1Z\u00eb\u00b8\\\u00f9\u0083\u00ec\u00c2\u00a3X\u0016\u00e0 \u0091O:#\u00a3]\f\u007f\u0004\u00d4\u001f\u0082j\u00b2\u008e\u00c0l\u00ce{1\u00d5\u009bt\u0005\u00f0\u00a0\u00d3\u000e\t\u0097nTY\u00bf\f\u00d6~}\u00b2\u0080\u00e9\u009a\u00ea\u00ca*a\u001e\u00f1R\u00a3\u00c7\u007f=\u00b9\u00b5\u00fd\u00df^6\u000b\u00e9\\\u00e7\u00f2]%T\u00aa\u0003\u00e1i\u0086\u009c\u00d6a\u009e/-\"\u00ba\u00e8+\u00f9\u001d\u0012\u00b5\u0095\u0097i\u00f2d\u00fc\u00f27;\u00d4\u001d\u008c\u00a89+\u00b6\u0087\u0010\u00d1\u00a2ok\u00d24\u00b9\u00f0g\u00f0\u00f5\"\t\u000e\u00ef\u00b4!\u00c7\u00e9\u00b3=E\u0080\u00c3\u00f5\u0080:V\u00fc\u001d@\u00aa\u00ea\u00fc\u00a0\u00dd\u0013\u00a9\u0001LA\u00fd\u00ec\u00fa\u00e4\u00e7B\u00c6U\u00fb\u0089-Zz\u00af\u00bf\u0083\u001f\\D^\u00f4w\u00c0\u00d7}\u00d4P!co\u0004\u00f9\u000fr)\u009d\u0082\\h@Q\u000e\u0001\u008e\u00f5\u0013\u00ec\\\u0000VS\t\u00d3nz3o\\>`1\u00d1\u00b0\u0090\u00f1\u00c4^\u0082\u00cd6P\u00db\u00e8\u00a9\u00db@\u0018\u00dd\u008a\u00b3\u001b\u008bWJb\u00a1\u00ecU\u00be\u00b8^p*/\u0012a\u00cb\u00abQ4+\u00f8\u0017\u00baS\u0004\u00b8%\u00f9\u00c2\u00efV\u00d5[SN\u00fa$\u0088\u001c&\u00b7\u0080t\u00b5\u00fe\u00a8\u00b3\u00b6\u007fL\t\u00bfJ\u001aj'\u0093+\u0007\u00b9\u00a4:\u001as\u0016\u0016a\u00a5>\u0098\u0019\u00fd\u001c\u008bR=\u00ed\u0099\u00b8\u00f8V\u00f2\u00fc\u00c6\u0091q<\u009d\u0002\u00f8\u00e1\u00866\u008d\u00c0\u008fn\u00fbUzk\u00af\u00d1\u00afs\u00ee\u00b4\u00b1E\u00f4\u009d\u00b3\u00b1@\u00ef\u00a9g\u00f8.l\u00915\u00fe\u00ca)\u0011I\u008b\u00a7\u00f2\u00de\u00a2~\u001d\u0019\u00b7\u0089\u00ee\u00a7\u0087\u001b\u0007\u00bb\u00c7=\u00e8\u00a7\u00b5\u00eb\u00cc\u0099\u00d5\u0001o;5O\u00da\u001c~\u00caUBdC\u00be\u00f5j'\u0094\u00c1\r\u00c6M\u0014F\u00c4\u00003q\u0098\u00fd\u00f7\u0018\u008b\u00bd[\u00b5\u00d3\u00db\u00c2\u00fa\u00bf\u00f06^\u00f0\u00c3\u00a3\u00e5\u00b9\u00e0\u0017\u00f9\u009d\u0018\u001f\u0081\u00bc\u00e8|\u00a1h9\u0003\u009bK\u001c\u00b8^\u00ce,|;\u0088\u00cb5\u0017;Y;|d.\u0001fi\u00833\u00f3\u00e2'/Z\u00ae\u0013\u00f0\u001d\u00e8\u00cedX h\u00fe4\u00f1*\u008e\u00fc\u00b5`R\u0081\u00ed\u00e9\u009f-\u00d5-X\u0013\u0082\u00fa\u00fdAa\u00fe\u00eb\u0092\u0011\u0097<d\u00f3\u0016\u00ba\u00dc\u00da\u0012\u0081\u0001;\u00fd\u00a3\u00b5\u00ef\u00d94@\u0003\u00c3\u00fct2D5Z\u00e3\u0010^'\u00bc\u00c74\u0090\u00074\u00da\u0087{v\u0084\u00f8 @#\u008dkS\bpdG\u0087\u00e1a\u00e8\u00e7\u0087\u00baV\u00ad\u000e@w\u000f\u00d7\u00e8\u008d+i\u009f\u00ae^\u00ac7\u00fa\"\u00c0}`\u00849\u00a7\u008b\u0003\u00e3\"\u008e!Xu\u0011\u00be\u00b5>PN\u001b\u00ef\u001a&\u00ce\u00b7O1\u00f9cA.\u0001\u0013\u00daP\u00ab4\u0085\u00f9\u009e\u0005\u0082\u008dZ\u00ed\u00c2\u0004X#\u00ecU5@\u00cd\u0019\u0084VF\u00f8D\u008a\u001d\u00fbA\u00d5K \u00cb\u00d9\u00c9:~4h5\u009fh\u001a\u00da\u0002\u00e0\u009e\u00f8;|q\u00a1X\u0098\u00fc\u009e\n\u0094\u00ec\u00b7,y\u00c1\u00f0\u0082\u0081+\u00fd\u0088-\u00a5\u00cfe\u00d7n*\u00f7\u00f2\u00ec\u008a\u0096}\u008d?#\u00d4S\u00d3\u00ec\u00fe{'\u0081\u0007d\u00bd\u00cfuC\u0019\u00bf\u00d7<ai\u00d0A\u0010\u0082\u00db\u00e5\u00cc\u001c\u00fb\u00c3J\u00b7\u00f5\u0005\u001d\u001f\u0010\u00ec\u00bc\u00c6\u00fbnyF\fm\u00828\u00822\u0083\u0094\u008a\u00eao\u00003\u00a1\u00da*\u00da\u00cfWMy\u00d1\u0012\u00a3RV\u00ac)\u00eak(c?\u009f\u00f8\u00b8\u0017:p#x\\\u001f\u00dc\u00e3\u0016\u00a9\u00b1\u0017,\u00bfZ\u00b76\u0087\u00f8=rL\u0012\u0017$r\u00c9c\u00fd\u00e2\ty6\u00dc\u00be\u00a4T\u00cb\u0017\u00f1\u008b\u00e8\u00f8vc2-mJ.\u00b3\u0095\u0086\u00d3\u0012n\u00f2\u00f7\u00ea\u00ab\u00a9\u00eb$\u0005\u0093\u000ePKb\u00ceim%\n&\u00b8[\u0089/\u00cf\u00c0 \u0089rst\u0095\u00b0Q\u00db\u0093[\u00b17\u00eb\u00a6a|\u00e3m\u00b8Z\u0004\u00c3]\u0096~v\u00c9U\u00fe\u00b0\u0015\u0085\u0005\u000eb;\u00fcNj\u00f7w\u0082\u0083\u00f4-\u009b\u00c3\u0097H\u0019\u0000\u0016j}\n8\u00a51\u0088\u000b\u00fcI\u00e1O)JaSE\u00ccma;i\u00bc\u00a1xy/N\u009a\u0080Q\u00f8^eIG\u00fe\u00a7\u00b2{\u00e1w\u00b9\u00ea$u\u0097E7@=aZ\u00a0\u00e1\u0090\u00a2\u0095+0\u00e0\u00ef\u00eb~\u00e5\u00bd42{\u0084 .rK\u009f\u00e5\u00c4\u0013(\u00a9\u00be\u00adE\u00e6\u0093\u00ff\u009d\u00bb\u0082\u0002=\u00d0D{!vO]:\u00c0\u0018\u00fa\u00d9\u00f8\u00c2\u00c5\u007f`v\u00c3\u0083\u00c9X\u00a3\u00b1\u00c4S\u000ec\u00d1^xTK\u009bT*:@\u00d2\u00dd\f\u00ecm\u00bc\u0004\u0098;\u0017\u008b\u0088\u008b_\u00e3\u00be\u00eb\u0097\u00b7\u0082\u0013_t\u00a7\u00a0D\u00fa\u00adN\u00adRbT\u001c\u00c5\u00e9n\u00ffm\u0088\u00d6\u00d8\u00b7\u00fb\u00b6\u00dcNKR\u00d0|\u0090nX\u00e1\u001fn\u00d7\u00fb\\\u009c\u0087A`\u00e8\u008f\u00e0\u0006\u0090\u00e3\u00c6\t\u00ab3\u00b9\u008c\u00eeo\tY\u00ca\u0098\u00c9\u00dbz\u0007\u0090y\u00f1\u0080\u00e7\u00db8D\u00dd\u001c\u0007\u00d9\"\u00bf\u00ab`\u009c\u001b\u00b9U\u009d\u00a0\u009aS\r\u00ef2\u00c1\u00fb\u0011:aqd@\u0018\u0092\u00ad\u00ae\u00dc1\u00a4\u00a66\u00d18l\u00f5\u009e4*C0]\u00f2\u00f2\u00a2\u00b2\u00a6oa\u0004\u0080\u001e\u0000ve\u00dc0K\u00b3,\u00c3\u0087D\u00e7\u00c7`U\u00be\u00d8D:v\u00d4\u00a7\u0093\u00cd\u001d\u00b2\u00cb\u008e\u00bf\u00eb\u00cb\u0085\u00f4\u009d:\u00a6\u00f9\u0085#H\u00a5\u00bb\u00ae\u00c7(\u001c\u00fd\u009cA\u0019\u00ac\u0019\u0096\u00d5z\u0018\u00f1\u0096c\u008d\u00c6";
                var5_4 = "\u00d5Q\u0090\u00c2\u00a8\u00b5\u00fa\u0090\u00e7\u00e6\u00d3l1l\u000eMV\u00b8^\u00a2\u00e3\u009a\u0099S*\"\u00d8\u001a>\u001d\u00e2\u0091\u00f4VB\u008eE\u00c8+\u00e5\u00a1Qo\u00b3\u000e\f\fb\u00fe\u00df0\u0004\u00a8\u00d7e\u00e7\u00e7!\u00d1\u0004\t\u00c37\u0090\u001bks\u00d8\u00ce\u009e\u008f\u00f2<\u00b2\u00b9\u00cdR\u00dd\u000f\u00ffNF&\u00f7\b6\u00e8\u00eb\u00a2\u00c7\u00d5e\u00ce\u00a1\u0006\u0083;E@\u00aai \u00b2\u001a`\u0000,a\u000b\u00a4@4\u00b5\u0083DIV\u00b8\u00c3\u008b\u00df\u001bb\u0091\b\u000e$\u00073\u00ad\u007f\u00c4A\u0092\u00aa\u00a4\u00fd3x1\u00d6#\u000e\u0014\u00ee\u00c2$Mk\u00a3\u00d4(\u001c:\u008f9\u008e\u00a4<\u009fp\u00c8\u0002\u00fc!\u00a5P\u00c3\u00f9#No\u008e\u0001\u0094\u0094\u00e8R\u00f0\u00d4\"v\u00c1:\u001d\u00d2\u00b1z\u00fb\r\u00be\u00b4Ia\u00e3[E1\u00beX\u000e\u00ff\u00ddi\u0013b\u00cc\u00e3\u00fe\u008e\u001a]\u0015\u001aY\u00bf\u00f5T\u00f4\u009d\u00adT\u0007\u007f\u0013\u00fa\u00eb\u0007\u00d09y3z\u00d1\u00d9azB1W\u00c3\u00e5\u008a\u0092\u00b0v>2\u00dbU\u0018g\u00e4g:}\u00a8\u00fa\u00ac>\u00f0\u001a\t\u0084/\u00f5\u000e\u00b7\u00edrFb\u0005\u0086\u00bd\u00b9\"]e\u0010\u009b\u0014\u00dc\u00b4\u0083b\u0014\u00cfH\u00d0\u00882\u0096\u00f9\rn*P\u0088\u001cK}\f\u00af\u00b1G\u0080\u00dfV*3\u00d2\u00d9\u00e6\u00b7Y\u00c3\u0085\u0017\u000f\u009d\u00a6\u00ab~\u00df|_\u00fd\u00e7\u00e1fy\u00d2\u00a1Z\u00eb\u00b8\\\u00f9\u0083\u00ec\u00c2\u00a3X\u0016\u00e0 \u0091O:#\u00a3]\f\u007f\u0004\u00d4\u001f\u0082j\u00b2\u008e\u00c0l\u00ce{1\u00d5\u009bt\u0005\u00f0\u00a0\u00d3\u000e\t\u0097nTY\u00bf\f\u00d6~}\u00b2\u0080\u00e9\u009a\u00ea\u00ca*a\u001e\u00f1R\u00a3\u00c7\u007f=\u00b9\u00b5\u00fd\u00df^6\u000b\u00e9\\\u00e7\u00f2]%T\u00aa\u0003\u00e1i\u0086\u009c\u00d6a\u009e/-\"\u00ba\u00e8+\u00f9\u001d\u0012\u00b5\u0095\u0097i\u00f2d\u00fc\u00f27;\u00d4\u001d\u008c\u00a89+\u00b6\u0087\u0010\u00d1\u00a2ok\u00d24\u00b9\u00f0g\u00f0\u00f5\"\t\u000e\u00ef\u00b4!\u00c7\u00e9\u00b3=E\u0080\u00c3\u00f5\u0080:V\u00fc\u001d@\u00aa\u00ea\u00fc\u00a0\u00dd\u0013\u00a9\u0001LA\u00fd\u00ec\u00fa\u00e4\u00e7B\u00c6U\u00fb\u0089-Zz\u00af\u00bf\u0083\u001f\\D^\u00f4w\u00c0\u00d7}\u00d4P!co\u0004\u00f9\u000fr)\u009d\u0082\\h@Q\u000e\u0001\u008e\u00f5\u0013\u00ec\\\u0000VS\t\u00d3nz3o\\>`1\u00d1\u00b0\u0090\u00f1\u00c4^\u0082\u00cd6P\u00db\u00e8\u00a9\u00db@\u0018\u00dd\u008a\u00b3\u001b\u008bWJb\u00a1\u00ecU\u00be\u00b8^p*/\u0012a\u00cb\u00abQ4+\u00f8\u0017\u00baS\u0004\u00b8%\u00f9\u00c2\u00efV\u00d5[SN\u00fa$\u0088\u001c&\u00b7\u0080t\u00b5\u00fe\u00a8\u00b3\u00b6\u007fL\t\u00bfJ\u001aj'\u0093+\u0007\u00b9\u00a4:\u001as\u0016\u0016a\u00a5>\u0098\u0019\u00fd\u001c\u008bR=\u00ed\u0099\u00b8\u00f8V\u00f2\u00fc\u00c6\u0091q<\u009d\u0002\u00f8\u00e1\u00866\u008d\u00c0\u008fn\u00fbUzk\u00af\u00d1\u00afs\u00ee\u00b4\u00b1E\u00f4\u009d\u00b3\u00b1@\u00ef\u00a9g\u00f8.l\u00915\u00fe\u00ca)\u0011I\u008b\u00a7\u00f2\u00de\u00a2~\u001d\u0019\u00b7\u0089\u00ee\u00a7\u0087\u001b\u0007\u00bb\u00c7=\u00e8\u00a7\u00b5\u00eb\u00cc\u0099\u00d5\u0001o;5O\u00da\u001c~\u00caUBdC\u00be\u00f5j'\u0094\u00c1\r\u00c6M\u0014F\u00c4\u00003q\u0098\u00fd\u00f7\u0018\u008b\u00bd[\u00b5\u00d3\u00db\u00c2\u00fa\u00bf\u00f06^\u00f0\u00c3\u00a3\u00e5\u00b9\u00e0\u0017\u00f9\u009d\u0018\u001f\u0081\u00bc\u00e8|\u00a1h9\u0003\u009bK\u001c\u00b8^\u00ce,|;\u0088\u00cb5\u0017;Y;|d.\u0001fi\u00833\u00f3\u00e2'/Z\u00ae\u0013\u00f0\u001d\u00e8\u00cedX h\u00fe4\u00f1*\u008e\u00fc\u00b5`R\u0081\u00ed\u00e9\u009f-\u00d5-X\u0013\u0082\u00fa\u00fdAa\u00fe\u00eb\u0092\u0011\u0097<d\u00f3\u0016\u00ba\u00dc\u00da\u0012\u0081\u0001;\u00fd\u00a3\u00b5\u00ef\u00d94@\u0003\u00c3\u00fct2D5Z\u00e3\u0010^'\u00bc\u00c74\u0090\u00074\u00da\u0087{v\u0084\u00f8 @#\u008dkS\bpdG\u0087\u00e1a\u00e8\u00e7\u0087\u00baV\u00ad\u000e@w\u000f\u00d7\u00e8\u008d+i\u009f\u00ae^\u00ac7\u00fa\"\u00c0}`\u00849\u00a7\u008b\u0003\u00e3\"\u008e!Xu\u0011\u00be\u00b5>PN\u001b\u00ef\u001a&\u00ce\u00b7O1\u00f9cA.\u0001\u0013\u00daP\u00ab4\u0085\u00f9\u009e\u0005\u0082\u008dZ\u00ed\u00c2\u0004X#\u00ecU5@\u00cd\u0019\u0084VF\u00f8D\u008a\u001d\u00fbA\u00d5K \u00cb\u00d9\u00c9:~4h5\u009fh\u001a\u00da\u0002\u00e0\u009e\u00f8;|q\u00a1X\u0098\u00fc\u009e\n\u0094\u00ec\u00b7,y\u00c1\u00f0\u0082\u0081+\u00fd\u0088-\u00a5\u00cfe\u00d7n*\u00f7\u00f2\u00ec\u008a\u0096}\u008d?#\u00d4S\u00d3\u00ec\u00fe{'\u0081\u0007d\u00bd\u00cfuC\u0019\u00bf\u00d7<ai\u00d0A\u0010\u0082\u00db\u00e5\u00cc\u001c\u00fb\u00c3J\u00b7\u00f5\u0005\u001d\u001f\u0010\u00ec\u00bc\u00c6\u00fbnyF\fm\u00828\u00822\u0083\u0094\u008a\u00eao\u00003\u00a1\u00da*\u00da\u00cfWMy\u00d1\u0012\u00a3RV\u00ac)\u00eak(c?\u009f\u00f8\u00b8\u0017:p#x\\\u001f\u00dc\u00e3\u0016\u00a9\u00b1\u0017,\u00bfZ\u00b76\u0087\u00f8=rL\u0012\u0017$r\u00c9c\u00fd\u00e2\ty6\u00dc\u00be\u00a4T\u00cb\u0017\u00f1\u008b\u00e8\u00f8vc2-mJ.\u00b3\u0095\u0086\u00d3\u0012n\u00f2\u00f7\u00ea\u00ab\u00a9\u00eb$\u0005\u0093\u000ePKb\u00ceim%\n&\u00b8[\u0089/\u00cf\u00c0 \u0089rst\u0095\u00b0Q\u00db\u0093[\u00b17\u00eb\u00a6a|\u00e3m\u00b8Z\u0004\u00c3]\u0096~v\u00c9U\u00fe\u00b0\u0015\u0085\u0005\u000eb;\u00fcNj\u00f7w\u0082\u0083\u00f4-\u009b\u00c3\u0097H\u0019\u0000\u0016j}\n8\u00a51\u0088\u000b\u00fcI\u00e1O)JaSE\u00ccma;i\u00bc\u00a1xy/N\u009a\u0080Q\u00f8^eIG\u00fe\u00a7\u00b2{\u00e1w\u00b9\u00ea$u\u0097E7@=aZ\u00a0\u00e1\u0090\u00a2\u0095+0\u00e0\u00ef\u00eb~\u00e5\u00bd42{\u0084 .rK\u009f\u00e5\u00c4\u0013(\u00a9\u00be\u00adE\u00e6\u0093\u00ff\u009d\u00bb\u0082\u0002=\u00d0D{!vO]:\u00c0\u0018\u00fa\u00d9\u00f8\u00c2\u00c5\u007f`v\u00c3\u0083\u00c9X\u00a3\u00b1\u00c4S\u000ec\u00d1^xTK\u009bT*:@\u00d2\u00dd\f\u00ecm\u00bc\u0004\u0098;\u0017\u008b\u0088\u008b_\u00e3\u00be\u00eb\u0097\u00b7\u0082\u0013_t\u00a7\u00a0D\u00fa\u00adN\u00adRbT\u001c\u00c5\u00e9n\u00ffm\u0088\u00d6\u00d8\u00b7\u00fb\u00b6\u00dcNKR\u00d0|\u0090nX\u00e1\u001fn\u00d7\u00fb\\\u009c\u0087A`\u00e8\u008f\u00e0\u0006\u0090\u00e3\u00c6\t\u00ab3\u00b9\u008c\u00eeo\tY\u00ca\u0098\u00c9\u00dbz\u0007\u0090y\u00f1\u0080\u00e7\u00db8D\u00dd\u001c\u0007\u00d9\"\u00bf\u00ab`\u009c\u001b\u00b9U\u009d\u00a0\u009aS\r\u00ef2\u00c1\u00fb\u0011:aqd@\u0018\u0092\u00ad\u00ae\u00dc1\u00a4\u00a66\u00d18l\u00f5\u009e4*C0]\u00f2\u00f2\u00a2\u00b2\u00a6oa\u0004\u0080\u001e\u0000ve\u00dc0K\u00b3,\u00c3\u0087D\u00e7\u00c7`U\u00be\u00d8D:v\u00d4\u00a7\u0093\u00cd\u001d\u00b2\u00cb\u008e\u00bf\u00eb\u00cb\u0085\u00f4\u009d:\u00a6\u00f9\u0085#H\u00a5\u00bb\u00ae\u00c7(\u001c\u00fd\u009cA\u0019\u00ac\u0019\u0096\u00d5z\u0018\u00f1\u0096c\u008d\u00c6".length();
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
                    var4_3 = "w]\u00ff\u0099\u00bc\f\u0088X\u00a1[\u00fbD\u001c\u0014\u0013E";
                    var5_4 = "w]\u00ff\u0099\u00bc\f\u0088X\u00a1[\u00fbD\u001c\u0014\u0013E".length();
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
        nJ.a = var6_1;
        nJ.b = new Integer[203];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A6D;
        if (b[n2] == null) {
            nJ.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
