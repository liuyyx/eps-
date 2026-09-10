/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.DeltaTracker
 */
package com.github.epsilon;

import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.Xn;
import com.github.epsilon._j;
import com.github.epsilon.dl;
import com.github.epsilon.e;
import com.github.epsilon.eh;
import com.github.epsilon.hi;
import com.github.epsilon.i7;
import com.github.epsilon.iX;
import com.github.epsilon.l3;
import java.awt.Color;
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
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.DeltaTracker;

public class eD
extends eh {
    private final DV P;
    private static final float J = 16.0f;
    private static final float l = 0.65f;
    private static final float o = 8.0f;
    private final Supplier<_j> D;
    private static final float w = 4.0f;
    private final Map<e, dl> m;
    private final DV z;
    private static final float T = 10.0f;
    private static final float W = 16.0f;
    private final DV N;
    private final Dx<iX> x = hi.a("\u00a5", (Object)this, (Object)eD.b(6596, -7501), (Object)hi.a("j", (long)751376238799770247L), (long)426795652261052192L);
    private static final float X = 2.0f;
    private static final float b = 2.0f;
    private static final float h = 3.0f;
    private static final Color n;
    private final Xn E;
    private static final Color C;
    private static final float Q = 0.72f;
    private final Dx<l3> M;
    private static final int t;
    public static final eD d;
    private static final String[] u;
    private static final String[] y;
    private static final long[] F;
    private static final Integer[] db;
    private static final long[] eb;
    private static final Long[] lb;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Color r(Object[] var1_1) {
        var2_2 = var1_1[0];
        var3_3 = var1_1[1];
        var4_4 = (Long)var1_1[2];
        var6_5 = Dl.S();
        var9_6 /* !! */  = eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)(eD.d(13269, 8692673792561310671L) ^ eD.d(10675, 9215858007589614042L)), (int)eD.d(21923, 3773645195676618218L)) + eD.d(647, 8438666772075698834L) + eD.d(17634, 9176111706597760279L);
        if (!var6_5) ** GOTO lbl-1000
        switch (var9_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var7_7 = (double)((eD.R("JOB7HQu6nVaFTQI5", currentTimeMillis()) + var4_4) % eD.e(21083, 7875311855274252518L)) / 2000.0;
                cfr_temp_0 = var7_7 - 1.0;
                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (!var6_5) ** GOTO lbl34
                if (v0 <= 0) ** GOTO lbl33
                ** GOTO lbl36
            }
            case 747358137: {
                throw null;
            }
        }
lbl19:
        // 2 sources

        while (true) {
            var7_7 = 1.0 - var7_7 % 1.0;
            if (var6_5) ** GOTO lbl38
            return eD.R("JOB7HQu6nVaFTQI5", J(java.awt.Color java.awt.Color float ), (Color)((Color)var2_2), (Color)((Color)var3_3), (float)((float)var7_7));
        }
        {
            switch (var9_6 /* !! */ ) {
                default: {
                    ** GOTO lbl19
                }
                case 1118441276: {
                    hi.a("G", (long)637561819799202476L);
                    hi.a("G", (long)870284539248200401L);
                    if (!var6_5) ** break;
                    ** continue;
lbl33:
                    // 2 sources

                    v0 = (eD.d(1219, 1116959474786819458L) / eD.d(24832, 4221678056188983521L) ^ eD.d(19504, 445877519413581148L)) - eD.d(7896, 956466027764729679L);
lbl34:
                    // 2 sources

                    var9_6 /* !! */  = (reference)v0;
                    if (var6_5) continue block8;
lbl36:
                    // 2 sources

                    var9_6 /* !! */  = (reference)((hi.a("G", (int)hi.a("G", (int)eD.d(10783, 2374645310834963366L), (int)eD.d(30636, 4680854108778442345L), (long)834203424483934088L), (int)eD.d(16231, 1954641078676645413L), (long)834203424483934088L) ^ eD.d(5602, 8968908462122978478L)) + eD.d(10128, 6524657994515709684L));
                    if (var6_5) continue block8;
lbl38:
                    // 2 sources

                    var9_6 /* !! */  = (reference)((eD.d(25686, 3700075666303794261L) / eD.d(23479, 9156191028367164001L) ^ eD.d(27872, 5442345709791229311L)) - eD.d(14552, 1695240212210344252L));
                    continue block8;
                }
                case 1118441275: 
            }
        }
        return eD.R("JOB7HQu6nVaFTQI5", J(java.awt.Color java.awt.Color float ), (Color)((Color)var2_2), (Color)((Color)var3_3), (float)((float)var7_7));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private Color Z(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        boolean bl = Dl.S();
        int n2 = ((eD.d(5972, 1590960564647743282L) + eD.d(1041, 7071781921580572141L)) / 2 + eD.d(27228, 604946062725689965L)) * eD.d(12544, 824935849575049565L) ^ eD.d(18879, 9182731526469882098L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        Object object2 = eD.R("JOB7HQu6nVaFTQI5", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)828140797298629023L)), (Enum)((Object)hi.a("j", (long)751376238799770247L)));
                        if (!bl) break block9;
                        if (object2 != false) break block10;
                        object2 = object = (Object)((eD.d(10549, 4205500685639282873L) * eD.d(14712, 7362594343094706294L) + eD.d(3153, 6146713600750540281L) + eD.d(20549, 556777028460644466L)) * eD.d(10041, 4276285500228140892L) - eD.d(16110, 3487162894083581844L));
                    }
                    if (bl) break block8;
                }
                object = eD.d(5262, 1305298952718241096L) - eD.d(24803, 2724500224838482252L) - eD.d(23236, 1487884568914887454L) + eD.d(23538, 2523823445202108941L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case -1399574428: {
                    return (Color)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1096128435808385370L), (long)789438897355831922L));
                }
                case -1399574429: {
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = (long)n * eD.e(12559, 9042395376164060083L);
                    objectArray2[1] = (Color)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)886401747953146446L), (long)789438897355831922L));
                    objectArray2[0] = (Color)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)745044629803187689L), (long)789438897355831922L));
                    return hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)658337223457081177L);
                }
                case -1399574430: 
            }
            break;
        }
        return null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void e(Object[] var1_1) {
        block127: {
            block126: {
                block125: {
                    block128: {
                        block124: {
                            block123: {
                                block122: {
                                    block135: {
                                        block121: {
                                            block129: {
                                                var2_2 = (DeltaTracker)var1_1[0];
                                                var3_3 = Dl.S();
                                                var30_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)eD.d(2029, 6621295486555872950L), (int)eD.d(3930, 7853149806163679028L), (long)834203424483934088L) * eD.d(19197, 377755434584478583L)), (int)eD.d(7752, 6039997547282351904L), (long)834203424483934088L) + eD.d(4535, 6009649948644100225L) + eD.d(6425, 6044494933142650943L);
                                                if (!var3_3) ** GOTO lbl-1000
                                                switch (var30_4 /* !! */ ) {
                                                    default: lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var4_5 = (_j)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)783858421151327786L), (long)876941681548788276L);
                                                        var5_6 = hi.a("\u00a5", (Object)hi.a("j", (long)784151999793788327L), (Object)new Object[0], (long)747510335972292358L);
                                                        var6_7 = new HashSet<E>(var5_6);
                                                        hi.a("\u00a5", (Object)eD.R("JOB7HQu6nVaFTQI5", keySet(), (Map)hi.a("\u00e9", (Object)this, (long)503364034990169727L)), (Predicate<e>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$render$0(java.util.Set com.github.epsilon.e ), (Lcom/github/epsilon/e;)Z)(var6_7), (long)519274218091013055L);
                                                        var7_8 = hi.a("G", (long)658960450018995719L);
                                                        var9_9 = hi.a("\u00a5", (Object)var5_6, (long)1240653736693366367L);
                                                        if (var3_3) break;
                                                        break block129;
                                                    }
                                                    case -643751378: {
                                                        return;
                                                    }
                                                }
                                                var30_4 /* !! */  = hi.a("G", (int)((eD.d(12094, 6938546269946050312L) ^ eD.d(2954, 6531260561294349184L)) + eD.d(27316, 7772143021424390875L)), (int)eD.d(27842, 1328978607442081226L), (long)834203424483934088L) + eD.d(2191, 3960862037068599684L);
                                                if (var3_3) break block121;
                                                ** GOTO lbl27
                                            }
lbl23:
                                            // 2 sources

                                            while (true) {
                                                block131: {
                                                    block130: {
                                                        v0 /* !! */  = hi.a("\u00a5", (Object)var9_9, (long)984088978567310565L);
                                                        if (!var3_3) break block130;
                                                        if (v0 /* !! */  != false) break block131;
lbl27:
                                                        // 2 sources

                                                        v0 /* !! */  = var30_4 /* !! */  = (reference)((eD.d(29829, 1015489939489730039L) * eD.d(11224, 2852415298905240511L) ^ eD.d(5890, 4663232279205498381L)) + eD.d(20145, 7384349013257721616L));
                                                    }
                                                    if (var3_3) break block121;
                                                }
                                                var30_4 /* !! */  = (reference)(eD.d(32715, 8686469004551825089L) - eD.d(30760, 8225100366110335354L) ^ eD.d(27030, 2627302595658068223L));
                                                break block121;
                                                break;
                                            }
lbl33:
                                            // 2 sources

                                            while (true) {
                                                v1 = new Object[2];
                                                v1[1] = (long)var7_8;
                                                v1[0] = true;
                                                hi.a("\u00a5", (Object)((dl)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503364034990169727L), (Object)var10_10, (Function<e, dl>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$render$1(long com.github.epsilon.e ), (Lcom/github/epsilon/e;)Lcom/github/epsilon/dl;)((long)var7_8), (long)817175477130987234L)), (Object)v1, (long)753842898277058248L);
                                                if (var3_3) ** GOTO lbl271
lbl41:
                                                // 2 sources

                                                while (true) {
                                                    var9_9 = eD.R("JOB7HQu6nVaFTQI5", iterator(), (Set)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503364034990169727L), (long)564642612070665456L));
                                                    if (var3_3) ** GOTO lbl273
lbl44:
                                                    // 2 sources

                                                    while (true) {
                                                        v2 /* !! */  = hi.a("\u00a5", (Object)var9_9, (long)984088978567310565L);
                                                        if (!var3_3) ** GOTO lbl276
                                                        if (v2 /* !! */  == false) ** GOTO lbl275
                                                        ** GOTO lbl277
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
lbl49:
                                            // 2 sources

                                            while (true) {
                                                v3 = new Object[2];
                                                v3[1] = (long)var7_8;
                                                v3[0] = false;
                                                cfr_temp_0 = hi.a("\u00a5", (Object)((dl)hi.a("\u00a5", (Object)var10_10, (long)1134935675208353020L)), (Object)v3, (long)753842898277058248L) - 0.0f;
                                                v4 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                if (!var3_3) ** GOTO lbl311
                                                if (v4 /* !! */  > 0) ** GOTO lbl310
                                                ** GOTO lbl312
                                                break;
                                            }
lbl59:
                                            // 2 sources

                                            while (!var3_3) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    block132: {
                                                        var10_10 = new ArrayList<E>();
                                                        var11_11 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503364034990169727L), (long)564642612070665456L), (long)1297238455825536256L);
                                                        if (!var3_3) break block132;
                                                        var30_4 /* !! */  = hi.a("G", (int)eD.d(1286, 3724795568680426599L), (int)eD.d(32390, 5899455483291084793L), (long)834203424483934088L) + eD.d(15786, 789859320359839185L) + eD.d(2301, 783575109751918901L);
                                                        if (var3_3) break block122;
                                                        ** GOTO lbl72
                                                    }
lbl68:
                                                    // 2 sources

                                                    while (true) {
                                                        block134: {
                                                            block133: {
                                                                v5 /* !! */  = hi.a("\u00a5", (Object)var11_11, (long)984088978567310565L);
                                                                if (!var3_3) break block133;
                                                                if (v5 /* !! */  != false) break block134;
lbl72:
                                                                // 2 sources

                                                                v5 /* !! */  = var30_4 /* !! */  = (reference)(eD.d(7451, 2918158514355160410L) / eD.d(23173, 3170086511111176927L) - eD.d(29016, 1999284573300992046L) - eD.d(2211, 6172409245403074727L));
                                                            }
                                                            if (var3_3) break block122;
                                                        }
                                                        var30_4 /* !! */  = (reference)((eD.d(27189, 3293987395215864719L) * eD.d(18888, 8395131805407383731L) ^ eD.d(26872, 2278391483236299192L)) - eD.d(13030, 3086226609080363742L) + eD.d(5036, 5185816162599913992L));
                                                        break block122;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            break block135;
lbl79:
                                            // 2 sources

                                            while (true) {
                                                hi.a("G", (double)10.0, (long)514485682373957547L);
lbl82:
                                                // 2 sources

                                                while (true) {
                                                    block137: {
                                                        block136: {
                                                            var14_18 = (e)hi.a("\u00a5", (Object)var12_13, (long)374171850520217279L);
                                                            var15_19 = hi.a("\u00a5", (Object)var14_18, (long)726480729306514365L);
                                                            if (!var3_3) break block136;
                                                            if (var15_19 != null) break block137;
                                                            var30_4 /* !! */  = hi.a("G", (int)eD.d(27716, 3033219884051445060L), (int)eD.d(1379, 4543238422157122694L), (long)834203424483934088L) + eD.d(14179, 1510390480280940414L) + eD.d(5912, 3650598064699330396L);
                                                        }
                                                        if (var3_3) break block122;
                                                    }
                                                    var30_4 /* !! */  = (reference)(eD.d(27380, 3431187134726484890L) / eD.d(11506, 543468970634474862L) - eD.d(20729, 986195042097596720L) + eD.d(25099, 1289937435689958270L) + eD.d(15631, 5809523295983690797L));
                                                    if (var3_3) break block123;
                                                    ** GOTO lbl369
                                                    break;
                                                }
                                                break;
                                            }
lbl94:
                                            // 2 sources

                                            while (true) {
                                                block139: {
                                                    block138: {
                                                        var16_21 = hi.a("\u00a5", (Object)var14_18, (long)721675246255933332L);
                                                        v6 /* !! */  = eD.R("JOB7HQu6nVaFTQI5", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)600143629388581715L), (long)789438897355831922L)));
                                                        if (!var3_3) break block138;
                                                        if (v6 /* !! */  != false) break block139;
                                                        v6 /* !! */  = var30_4 /* !! */  = hi.a("G", (int)eD.d(4205, 1314090246904531015L), (int)eD.d(11883, 7843812185609009035L), (long)834203424483934088L) - eD.d(9829, 507659155402522515L);
                                                    }
                                                    if (var3_3) break block124;
                                                }
                                                var30_4 /* !! */  = (reference)(eD.d(30074, 9156360804466306112L) / 5 + eD.d(27980, 4408765023177651380L) + eD.d(21211, 5159750645192887120L) + eD.d(27287, 3984827142777713403L) - eD.d(19447, 7327904688856764944L));
                                                break block124;
                                                break;
                                            }
lbl105:
                                            // 2 sources

                                            while (true) {
                                                block144: {
                                                    block143: {
                                                        block142: {
                                                            block141: {
                                                                block140: {
                                                                    var17_24 = v7;
                                                                    var18_27 = eD.R("JOB7HQu6nVaFTQI5", v(java.lang.String float ), (_j)var4_5, (String)var16_21, (float)0.65f);
                                                                    v8 /* !! */  = hi.a("\u00a5", var17_24, (long)361382094905603987L);
                                                                    if (!var3_3) break block140;
                                                                    if (v8 /* !! */  != false) break block141;
                                                                    v8 /* !! */  = var30_4 /* !! */  = (reference)(((eD.d(26776, 6392269029986414963L) ^ eD.d(25524, 2661318401520515747L)) - eD.d(7140, 6026040600296113029L)) / 5 * eD.d(3690, 1179267838454355515L) + eD.d(19352, 5634540331212575706L));
                                                                }
                                                                if (var3_3) break block142;
                                                            }
                                                            var30_4 /* !! */  = (reference)((eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)(eD.d(14783, 9078754324183474407L) + eD.d(15906, 4156521416990680624L)), (int)eD.d(17732, 4608160264911953001L)) ^ eD.d(5967, 4075115668275646252L)) + eD.d(21262, 1282291184168897214L));
                                                        }
                                                        switch (var30_4 /* !! */ ) {
                                                            default: {
                                                                v9 /* !! */  = 0.0f;
                                                                var30_4 /* !! */  = (reference)(eD.d(9141, 1430860042744429477L) / 5 ^ eD.d(20927, 718721446930614314L));
                                                                if (!var3_3) {
                                                                    break;
                                                                }
                                                                break block143;
                                                            }
                                                            case -1103834735: {
                                                                v9 /* !! */  = (float)hi.a("\u00a5", (Object)var4_5, (Object)(" " + var17_24), (float)0.65f, (long)665434286926928221L);
                                                                if (var3_3) break;
                                                                ** GOTO lbl-1000
                                                            }
                                                            case -1103834736: {
                                                                return;
                                                            }
                                                        }
                                                        var30_4 /* !! */  = (reference)(eD.d(6832, 5804503239866106557L) / 5 ^ eD.d(13966, 3281073482853052301L));
                                                    }
                                                    switch (var30_4 /* !! */ ) {
                                                        default: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var19_28 /* !! */  = v9 /* !! */ ;
                                                            hi.a("\u00a5", (Object)var10_10, (Object)new i7((e)var14_18, (String)var16_21, var17_24, (String)hi.a("\u00e9", (Object)var15_19, (long)1218053806151603752L), (float)var18_27, (float)(var18_27 + var19_28 /* !! */ ), (float)var13_15), (long)615358212536192384L);
                                                            if (var3_3) break;
                                                            break block144;
                                                        }
                                                        case -2002629352: {
                                                            hi.a("G", (long)561677051612723832L);
                                                            hi.a("G", (long)1301756410258456892L);
                                                            return;
                                                        }
                                                    }
                                                    var30_4 /* !! */  = hi.a("G", (int)eD.d(27716, 3033219884051445060L), (int)eD.d(1379, 4543238422157122694L), (long)834203424483934088L) + eD.d(14179, 1510390480280940414L) + eD.d(5912, 3650598064699330396L);
                                                    break block122;
                                                }
lbl148:
                                                // 2 sources

                                                while (true) {
                                                    block145: {
                                                        hi.a("\u00a5", (Object)var10_10, (Object)hi.a("\u00a5", (Object)hi.a("G", (ToDoubleFunction<i7>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, KX(), (Lcom/github/epsilon/i7;)D)(), (long)1110573410300049240L), (long)1011334880947717168L), (long)1121017606236678262L);
                                                        var11_12 /* !! */  = 0.0f;
                                                        var12_14 = 0.0f;
                                                        var13_16 = hi.a("\u00a5", (Object)var10_10, (long)1240653736693366367L);
                                                        if (!var3_3) break block145;
                                                        var30_4 /* !! */  = (reference)((eD.d(18563, 2862939620824846772L) / eD.d(5970, 8181505021098708716L) / eD.d(19050, 4929029762213024656L) ^ eD.d(30843, 5228471375025545489L)) + eD.d(19071, 3846809167190889321L));
                                                        if (var3_3) break block125;
                                                        ** GOTO lbl162
                                                    }
lbl158:
                                                    // 2 sources

                                                    while (true) {
                                                        block147: {
                                                            block146: {
                                                                v10 /* !! */  = eD.R("JOB7HQu6nVaFTQI5", hasNext(), (Iterator)var13_16);
                                                                if (!var3_3) break block146;
                                                                if (v10 /* !! */  != false) break block147;
lbl162:
                                                                // 2 sources

                                                                v10 /* !! */  = var30_4 /* !! */  = (reference)(eD.d(23834, 5474587155745571870L) / 4 ^ eD.d(12417, 4489882860654356812L));
                                                            }
                                                            if (var3_3) break block125;
                                                        }
                                                        var30_4 /* !! */  = (reference)((eD.d(30826, 5746044543790358897L) * eD.d(1391, 5061597069721951292L) ^ eD.d(18908, 7142413572020604972L)) - eD.d(8379, 3816068182294100468L) - eD.d(7624, 6585769259302306947L));
                                                        break block125;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
lbl168:
                                            // 2 sources

                                            while (true) {
                                                v11 /* !! */  = hi.a("\u00a5", (Object)var10_10, (long)1256913436411747171L);
                                                if (!var3_3) ** GOTO lbl435
                                                if (v11 /* !! */  != false) ** GOTO lbl434
                                                ** GOTO lbl436
                                                break;
                                            }
lbl173:
                                            // 2 sources

                                            while (true) {
                                                hi.a("\u00a5", (Object)this, (float)hi.a("G", (float)16.0f, (float)var11_12 /* !! */ , (long)1021203527991582354L), (float)hi.a("G", (float)16.0f, (float)var12_14, (long)1021203527991582354L), (long)1276984734984451677L);
                                                v12 /* !! */  = hi.a("\u00a5", (Object)var10_10, (long)1256913436411747171L);
                                                if (!var3_3) ** GOTO lbl441
                                                if (v12 /* !! */  == false) ** GOTO lbl440
                                                ** GOTO lbl442
                                                break;
                                            }
lbl179:
                                            // 2 sources

                                            while (true) {
                                                block148: {
                                                    var13_17 = hi.a("\u00e9", (Object)this, (long)423210454345410312L);
                                                    var14_18 = eD.R("JOB7HQu6nVaFTQI5", iterator(), (List)var10_10);
                                                    if (!var3_3) break block148;
                                                    var30_4 /* !! */  = hi.a("G", (int)(eD.d(2014, 8089993554336734966L) ^ eD.d(6147, 6540769122854027770L)), (int)eD.d(21207, 9178781456388787184L), (long)834203424483934088L) / 2 - eD.d(23743, 8184735270506497379L);
                                                    if (var3_3) break block126;
                                                    ** GOTO lbl191
                                                }
lbl187:
                                                // 2 sources

                                                while (true) {
                                                    block150: {
                                                        block149: {
                                                            v13 /* !! */  = hi.a("\u00a5", (Object)var14_18, (long)984088978567310565L);
                                                            if (!var3_3) break block149;
                                                            if (v13 /* !! */  != false) break block150;
lbl191:
                                                            // 2 sources

                                                            v13 /* !! */  = var30_4 /* !! */  = (reference)((eD.d(2255, 571205860840362354L) * eD.d(2603, 7104178131788452797L) / eD.d(31191, 1198477944549122156L) ^ eD.d(11554, 8715018984554919088L) ^ eD.d(1037, 6708820221387136407L)) - eD.d(7566, 7388757489101227175L));
                                                        }
                                                        if (var3_3) break block126;
                                                    }
                                                    var30_4 /* !! */  = (reference)(eD.d(27477, 6503669661250106086L) * eD.d(10994, 553099352411403086L) - eD.d(31398, 2153199697361904613L) - eD.d(5539, 8351965953184124055L) ^ eD.d(18383, 8237220293049622410L));
                                                    break block126;
                                                    break;
                                                }
                                                break;
                                            }
lbl197:
                                            // 2 sources

                                            while (true) {
                                                block151: {
                                                    var14_18 = hi.a("\u00a5", (Object)this, (long)567689278082192432L);
                                                    var13_17 = hi.a("\u00e9", (Object)this, (long)423210454345410312L);
                                                    var15_20 = 0;
                                                    var16_23 = eD.R("JOB7HQu6nVaFTQI5", iterator(), (List)var10_10);
                                                    if (!var3_3) break block151;
                                                    var30_4 /* !! */  = hi.a("G", (int)eD.d(25302, 7158119155986054032L), (int)eD.d(23868, 3224491690213835848L), (long)834203424483934088L) + eD.d(19516, 4354056198541710792L);
                                                    if (var3_3) break block127;
                                                    ** GOTO lbl211
                                                }
lbl207:
                                                // 2 sources

                                                while (true) {
                                                    block153: {
                                                        block152: {
                                                            v14 /* !! */  = hi.a("\u00a5", (Object)var16_23, (long)984088978567310565L);
                                                            if (!var3_3) break block152;
                                                            if (v14 /* !! */  != false) break block153;
lbl211:
                                                            // 2 sources

                                                            v14 /* !! */  = var30_4 /* !! */  = (reference)(eD.d(10070, 5202145879004839538L) * eD.d(26431, 1464310939747663565L) * eD.d(4335, 5687944572857895234L) / eD.d(29556, 7186578395560028929L) - eD.d(13230, 876200419504941714L));
                                                        }
                                                        if (var3_3) break block127;
                                                    }
                                                    var30_4 /* !! */  = (reference)(eD.d(2507, 2470889785057431942L) + eD.d(3462, 5453856072492241993L) + eD.d(588, 1324510853343205939L));
                                                    break block127;
                                                    break;
                                                }
                                                break;
                                            }
lbl217:
                                            // 2 sources

                                            while (true) {
                                                var13_17 += 18.0f * var18_27;
                                                if (!var3_3) {
                                                    return;
                                                }
                                                ** GOTO lbl523
                                                break;
                                            }
                                        }
lbl223:
                                        // 2 sources

                                        block93: while (true) {
                                            block161: {
                                                block158: {
                                                    block156: {
                                                        block157: {
                                                            block160: {
                                                                block159: {
                                                                    block155: {
                                                                        block154: {
                                                                            switch (var30_4 /* !! */ ) {
                                                                                default: {
                                                                                    ** continue;
                                                                                }
                                                                                case -1808079395: {
                                                                                    var10_10 = (e)hi.a("\u00a5", (Object)var9_9, (long)470012372636416268L);
                                                                                    v15 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{var10_10}, (long)375551253229731180L);
                                                                                    if (!var3_3) break block154;
                                                                                    if (v15 /* !! */  != false) break;
                                                                                    break block155;
                                                                                }
                                                                                case -1808079392: {
                                                                                    ** continue;
                                                                                }
                                                                                case -1808079391: {
                                                                                    ** continue;
                                                                                }
                                                                                case -1808079397: {
                                                                                    var10_10 = (Map.Entry)eD.R("JOB7HQu6nVaFTQI5", next(), (Iterator)var9_9);
                                                                                    v16 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{(e)hi.a("\u00a5", (Object)var10_10, (long)374171850520217279L)}, (long)375551253229731180L);
                                                                                    if (!var3_3) break block156;
                                                                                    if (v16 /* !! */  == false) break block157;
                                                                                    break block158;
                                                                                }
                                                                                case -1808079396: {
                                                                                    ** continue;
                                                                                }
                                                                                case -1808079394: {
                                                                                    hi.a("G", (long)487733742417394326L);
                                                                                    hi.a("G", (float)-1.0f, (long)671146500863747464L);
                                                                                    var30_4 /* !! */  = (reference)((eD.d(20995, 1042736880698264185L) + eD.d(10011, 5948245603775348466L) ^ eD.d(8545, 1213543924192868726L)) + eD.d(28770, 6334561873130694952L));
                                                                                    continue block93;
                                                                                }
                                                                            }
                                                                            v15 /* !! */  = var30_4 /* !! */  = (reference)(eD.d(2923, 468535918160204419L) - eD.d(2490, 2434804345325441036L) + eD.d(26658, 7235015045749911943L));
                                                                        }
                                                                        if (var3_3) break block159;
                                                                    }
                                                                    var30_4 /* !! */  = eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)(eD.d(10456, 2927889322993774943L) / eD.d(1030, 8973396378026532096L)), (int)eD.d(3871, 4694216382258370289L)) / eD.d(7921, 7079873518723581585L) * eD.d(26804, 2334158617998110934L) - eD.d(15256, 6527008611713311636L);
                                                                    if (!var3_3) break block160;
                                                                }
                                                                switch (var30_4 /* !! */ ) {
                                                                    default: {
                                                                        if (var3_3) break;
                                                                        ** GOTO lbl33
                                                                    }
                                                                    case -207162693: {
                                                                        ** continue;
                                                                    }
                                                                    case -207162692: {
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                            var30_4 /* !! */  = hi.a("G", (int)((eD.d(32572, 1164391185561790143L) ^ eD.d(2614, 5435328189905589105L)) + eD.d(15974, 2596045844567484309L)), (int)eD.d(17609, 1296997986413059248L), (long)834203424483934088L) + eD.d(7554, 1043773968484025595L);
                                                            if (var3_3) continue;
lbl271:
                                                            // 2 sources

                                                            var30_4 /* !! */  = eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)((eD.d(32572, 1164391185561790143L) ^ eD.d(2614, 5435328189905589105L)) + eD.d(15974, 2596045844567484309L)), (int)eD.d(17609, 1296997986413059248L)) + eD.d(7554, 1043773968484025595L);
                                                            if (var3_3) continue;
lbl273:
                                                            // 2 sources

                                                            var30_4 /* !! */  = hi.a("G", (int)eD.d(8867, 4371515427828726713L), (int)eD.d(7796, 799638947620210660L), (long)834203424483934088L) - eD.d(14635, 7230583077975744550L) - eD.d(8401, 7592798398609684943L) - eD.d(11695, 3530131676495475878L);
                                                            if (var3_3) continue;
lbl275:
                                                            // 2 sources

                                                            v2 /* !! */  = var30_4 /* !! */  = (reference)(eD.d(32104, 2752870190994039925L) / 5 - eD.d(17611, 1359496667181063643L) - eD.d(725, 993303814615784402L));
lbl276:
                                                            // 2 sources

                                                            if (var3_3) continue;
lbl277:
                                                            // 2 sources

                                                            var30_4 /* !! */  = (reference)(eD.d(17145, 4875991225790176199L) / eD.d(19050, 4929029762213024656L) * eD.d(27190, 3625419553652847505L) * eD.d(28181, 8598186917669615132L) - eD.d(15830, 7052330010368992278L));
                                                            continue;
                                                        }
                                                        v16 /* !! */  = var30_4 /* !! */  = hi.a("G", (int)eD.d(27272, 7792997832961864436L), (int)eD.d(4254, 8538737484405426503L), (long)834203424483934088L) - eD.d(10675, 8806315643041018277L) + eD.d(26074, 5729050208810581107L);
                                                    }
                                                    if (var3_3) break block161;
                                                }
                                                var30_4 /* !! */  = (reference)((eD.d(5805, 9036828491703078716L) + eD.d(17065, 8058572737032526805L) + eD.d(1885, 3962822478545313376L) ^ eD.d(5830, 6165073102270975925L)) - eD.d(15180, 7098989598158447445L) ^ eD.d(18593, 786598231295857022L));
                                                if (!var3_3) ** GOTO lbl308
                                            }
                                            block94: while (true) {
                                                block162: {
                                                    switch (var30_4 /* !! */ ) {
                                                        default: {
                                                            if (var3_3) break;
                                                            ** GOTO lbl49
                                                        }
                                                        case 1899249101: {
                                                            ** continue;
                                                        }
                                                        case 1899249100: {
                                                            hi.a("\u00a5", (Object)var9_9, (long)798035814993215984L);
                                                            if (var3_3) break block162;
                                                            ** GOTO lbl59
                                                        }
                                                        case 1899249102: {
                                                            ** GOTO lbl59
                                                        }
                                                        case 1899249103: {
                                                            hi.a("G", (float)2.0f, (float)1.0f, (float)-1.0f, (float)0.0f, (int)1, (long)807165359221636751L);
                                                            hi.a("G", (long)589253768936098215L);
                                                            var30_4 /* !! */  = (reference)(eD.d(18610, 7759569773720146289L) * eD.d(2988, 2629767364689154789L) ^ eD.d(20239, 1291459701600785953L) ^ eD.d(27582, 8556232489061888550L));
                                                            continue block94;
                                                        }
                                                    }
lbl308:
                                                    // 2 sources

                                                    var30_4 /* !! */  = hi.a("G", (int)eD.d(23742, 3448676302771160264L), (int)eD.d(21752, 5526375387651935693L), (long)834203424483934088L) - eD.d(13720, 3470843153788071334L) - eD.d(18693, 6984700473930420542L) - eD.d(19615, 4398540661373408754L);
                                                    if (var3_3) continue block93;
lbl310:
                                                    // 2 sources

                                                    v4 /* !! */  = var30_4 /* !! */  = (reference)(hi.a("G", (int)eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)((eD.d(1961, 8958676547538542297L) ^ eD.d(11568, 9089223576629212412L)) * eD.d(26043, 1975395628542639541L)), (int)eD.d(27410, 4944906635623543490L)), (int)eD.d(15558, 4490581418776388742L), (long)834203424483934088L) ^ eD.d(24538, 2437128309640791985L));
lbl311:
                                                    // 2 sources

                                                    if (var3_3) continue;
lbl312:
                                                    // 2 sources

                                                    var30_4 /* !! */  = (reference)((eD.d(25862, 3727379291921530181L) / eD.d(23677, 3426782930718622769L) ^ eD.d(18486, 8738464120326361158L)) + eD.d(18497, 6516450963800527237L) + eD.d(24752, 750833914010286546L) - eD.d(3050, 7840482105379508917L));
                                                    if (var3_3) continue;
                                                }
                                                var30_4 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)((eD.d(8556, 4770989967818258815L) ^ eD.d(8272, 5504237628735486047L)) * eD.d(6957, 3923985452630393448L)), (int)eD.d(12805, 5850898765454961510L), (long)834203424483934088L), (int)eD.d(12857, 8011129451519470151L), (long)834203424483934088L) ^ eD.d(16011, 2516139612113790896L));
                                                if (!var3_3) break block93;
                                            }
                                            break;
                                        }
                                    }
                                    var30_4 /* !! */  = hi.a("G", (int)eD.d(23742, 3448676302771160264L), (int)eD.d(21752, 5526375387651935693L), (long)834203424483934088L) - eD.d(13720, 3470843153788071334L) - eD.d(18693, 6984700473930420542L) - eD.d(19615, 4398540661373408754L);
                                    ** while (true)
                                }
lbl322:
                                // 2 sources

                                block95: while (true) {
                                    switch (var30_4 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 816267131: {
                                            var12_13 = (Map.Entry)hi.a("\u00a5", (Object)var11_11, (long)470012372636416268L);
                                            var13_15 = hi.a("\u00a5", (Object)((dl)hi.a("\u00a5", (Object)var12_13, (long)1134935675208353020L)), (Object)new Object[0], (long)1139332904318855025L);
                                            cfr_temp_1 = var13_15 - 0.001f;
                                            v17 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                            if (!var3_3) ** GOTO lbl337
                                            if (v17 /* !! */  > 0) ** GOTO lbl336
                                            ** GOTO lbl338
                                        }
                                        case 816267130: {
                                            ** continue;
                                        }
lbl336:
                                        // 1 sources

                                        v17 /* !! */  = var30_4 /* !! */  = (reference)((eD.d(12874, 3224480130118150928L) ^ eD.d(22479, 1462303497064451995L)) - eD.d(6879, 7888039251994592125L));
lbl337:
                                        // 2 sources

                                        if (var3_3) ** GOTO lbl340
lbl338:
                                        // 2 sources

                                        var30_4 /* !! */  = hi.a("G", (int)hi.a("G", (int)eD.d(21073, 7097337760660228682L), (int)eD.d(18273, 274535778347490844L), (long)834203424483934088L), (int)eD.d(24327, 3748431086274053654L), (long)834203424483934088L) + eD.d(13791, 6392440530843266530L);
                                        if (!var3_3) ** GOTO lbl349
lbl340:
                                        // 2 sources

                                        switch (var30_4 /* !! */ ) {
                                            default: {
                                                if (var3_3) break;
                                                ** GOTO lbl79
                                            }
                                            case 1852122060: {
                                                ** continue;
                                            }
                                            case 1852122062: {
                                                ** continue;
                                            }
                                        }
lbl349:
                                        // 2 sources

                                        var30_4 /* !! */  = hi.a("G", (int)eD.d(27716, 3033219884051445060L), (int)eD.d(1379, 4543238422157122694L), (long)834203424483934088L) + eD.d(14179, 1510390480280940414L) + eD.d(5912, 3650598064699330396L);
                                        continue block95;
                                        case 816267128: 
                                    }
                                    return;
                                }
                            }
                            block96: do lbl-1000:
                            // 3 sources

                            {
                                block164: {
                                    block163: {
                                        switch (var30_4 /* !! */ ) {
                                            default: {
                                                v18 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var14_18, (long)1025159459230292690L), (long)361382094905603987L);
                                                if (!var3_3) break block163;
                                                if (v18 /* !! */  == false) break;
                                                break block164;
                                            }
                                            case 109025481: {
                                                if (var3_3) break block96;
                                                ** GOTO lbl94
                                            }
                                            case 109025482: {
                                                ** continue;
                                            }
                                            case 109025479: {
                                                throw null;
                                            }
                                        }
lbl369:
                                        // 2 sources

                                        v18 /* !! */  = var30_4 /* !! */  = (reference)(hi.a("G", (int)eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)((eD.d(2081, 413007059497406878L) ^ eD.d(8095, 4483439676499117689L)) / 4), (int)eD.d(24123, 1805031957748188931L)), (int)eD.d(32529, 4359119124701259456L), (long)834203424483934088L) ^ eD.d(20578, 7258757477724719532L));
                                    }
                                    if (var3_3) ** GOTO lbl-1000
                                }
                                var30_4 /* !! */  = (reference)((eD.d(3858, 8930334330527503939L) - eD.d(20392, 4802973201406793403L)) * eD.d(29932, 3936070143069859111L) + eD.d(29398, 2361459972893387485L) - eD.d(3958, 7792024045360961396L));
                            } while (var3_3);
                            var30_4 /* !! */  = hi.a("G", (int)eD.d(27716, 3033219884051445060L), (int)eD.d(1379, 4543238422157122694L), (long)834203424483934088L) + eD.d(14179, 1510390480280940414L) + eD.d(5912, 3650598064699330396L);
                            ** while (true)
                        }
                        block97: while (true) {
                            switch (var30_4 /* !! */ ) {
                                default: {
                                    v7 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)var14_18, (Object)new Object[0], (long)874952544071855486L)}, (long)447776052275312105L);
                                    var30_4 /* !! */  = (reference)(eD.d(1579, 520104216468610659L) * eD.d(22520, 218590082234879532L) - eD.d(17057, 8603834820468349660L));
                                    if (!var3_3) {
                                        break block97;
                                    }
                                    break block128;
                                }
                                case 1359821311: {
                                    v7 = "";
                                    if (var3_3) break block97;
                                    ** GOTO lbl105
                                }
                                case 1359821313: {
                                    eD.R("JOB7HQu6nVaFTQI5", B());
                                    hi.a("G", (int)2, (int)2, (long)589346929323904906L);
                                    var30_4 /* !! */  = hi.a("G", (int)(eD.d(22413, 3325120471694216915L) - eD.d(21889, 3776330545945546118L)), (int)eD.d(6813, 1965788172474073999L), (long)834203424483934088L) - eD.d(30602, 4684833472470298291L);
                                    continue block97;
                                }
                            }
                            break;
                        }
                        var30_4 /* !! */  = (reference)(eD.d(9202, 22626476582763064L) * eD.d(16758, 4118566816013785385L) - eD.d(6871, 1399081236040532778L));
                    }
                    switch (var30_4 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -563311013: 
                    }
                    hi.a("G", (long)1064615117133635571L);
                    return;
                }
                block98: while (true) {
                    switch (var30_4 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 763347839: {
                            var14_18 = (i7)eD.R("JOB7HQu6nVaFTQI5", next(), (Iterator)var13_16);
                            var11_12 /* !! */  = (float)hi.a("G", (float)var11_12 /* !! */ , (float)(18.0f + hi.a("\u00a5", (Object)var14_18, (long)1032995794944526068L) + 8.0f), (long)1021203527991582354L);
                            var12_14 += 18.0f * hi.a("\u00a5", (Object)var14_18, (long)1294708871139941216L);
                            if (var3_3) ** GOTO lbl432
                            ** GOTO lbl168
                        }
                        case 763347838: {
                            ** continue;
                        }
                        case 763347836: {
                            var12_14 -= 2.0f * hi.a("\u00a5", (Object)((i7)hi.a("\u00a5", (Object)var10_10, (long)438551443134834968L)), (long)1294708871139941216L);
                            if (var3_3) ** GOTO lbl438
                            ** GOTO lbl173
                        }
                        case 763347833: {
                            ** continue;
                        }
                        case 763347837: {
                            hi.a("G", (float)2.0f, (float)100.0f, (float)-0.5f, (float)10.0f, (double)13.0, (int)eD.d(6105, 3387533873166372751L), (long)1270986612680661754L);
                            ** GOTO lbl179
                        }
                        case 763347832: {
                            ** continue;
                        }
lbl432:
                        // 1 sources

                        var30_4 /* !! */  = (reference)((eD.d(17764, 3849241583643073756L) / eD.d(12197, 6524021241332200963L) / eD.d(19050, 4929029762213024656L) ^ eD.d(20684, 2571635360879184236L)) + eD.d(16546, 3618926917753543117L));
                        if (var3_3) continue block98;
lbl434:
                        // 2 sources

                        v11 /* !! */  = var30_4 /* !! */  = (reference)(eD.d(467, 5257725659606669515L) * eD.d(7116, 5221171870273061547L) + eD.d(18414, 1130820442266771164L));
lbl435:
                        // 2 sources

                        if (var3_3) continue block98;
lbl436:
                        // 2 sources

                        var30_4 /* !! */  = (reference)(eD.d(1096, 7029731590360456610L) + eD.d(10180, 2025756354699591313L) + eD.d(7180, 8734016418305852478L) + eD.d(28232, 3082628935581218330L) - eD.d(13806, 8958637106660764869L));
                        if (var3_3) continue block98;
lbl438:
                        // 2 sources

                        var30_4 /* !! */  = (reference)(eD.d(5997, 8264115192128786285L) * eD.d(28984, 5837296191266040121L) + eD.d(4926, 2267064314707462774L));
                        if (var3_3) continue block98;
lbl440:
                        // 2 sources

                        v12 /* !! */  = var30_4 /* !! */  = hi.a("G", (int)hi.a("G", (int)eD.d(4810, 8869382650658015922L), (int)eD.d(18540, 4463402674027860264L), (long)834203424483934088L), (int)eD.d(2482, 6585299645759082947L), (long)834203424483934088L) - eD.d(20179, 2683621634757531596L);
lbl441:
                        // 2 sources

                        if (var3_3) continue block98;
lbl442:
                        // 2 sources

                        var30_4 /* !! */  = hi.a("G", (int)eD.d(11822, 4185301834674763534L), (int)eD.d(30548, 628957497271234260L), (long)834203424483934088L) + eD.d(8383, 1057783225417431495L);
                        continue block98;
                        case 763347835: 
                    }
                    break;
                }
                return;
            }
            while (true) {
                switch (var30_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -161826088: {
                        var15_19 = (i7)hi.a("\u00a5", (Object)var14_18, (long)470012372636416268L);
                        var16_22 = hi.a("\u00a5", (Object)var15_19, (long)1294708871139941216L);
                        var17_25 = 18.0f + hi.a("\u00a5", (Object)var15_19, (long)1032995794944526068L) + 8.0f;
                        var18_27 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) - var17_25 * (1.0f - var16_22);
                        var19_28 /* !! */  = 16.0f * var16_22;
                        var20_29 = hi.a("G", (float)3.0f, (float)(var19_28 /* !! */  * 0.5f), (long)971000971621905228L);
                        var21_30 /* !! */  = var18_27 + 16.0f + 2.0f + 4.0f;
                        var22_31 = var21_30 /* !! */  - 4.0f;
                        var23_32 = hi.a("\u00a5", (Object)var15_19, (long)1032995794944526068L) + 8.0f;
                        hi.a("\u00a5", (Object)hi.a("j", (long)889421552268440488L), (float)var18_27, (float)var13_17, (float)16.0f, (float)var19_28 /* !! */ , (float)var20_29, (float)8.0f, (long)1070709360778150966L);
                        hi.a("\u00a5", (Object)hi.a("j", (long)889421552268440488L), (float)var22_31, (float)var13_17, (float)var23_32, (float)var19_28 /* !! */ , (float)var20_29, (float)8.0f, (long)1070709360778150966L);
                        var13_17 += 18.0f * var16_22;
                        if (var3_3) break;
                        ** GOTO lbl197
                    }
                    case -161826090: {
                        ** continue;
                    }
                    case -161826089: {
                        throw null;
                    }
                }
                var30_4 /* !! */  = hi.a("G", (int)(eD.d(5204, 5861218180829138047L) ^ eD.d(11620, 4936664882980386042L)), (int)eD.d(23250, 8747722797005833163L), (long)834203424483934088L) / 2 - eD.d(23188, 6142639193553765145L);
            }
        }
        while (true) {
            switch (var30_4 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1360354693: {
                    var17_26 = (i7)hi.a("\u00a5", (Object)var16_23, (long)470012372636416268L);
                    var18_27 = hi.a("\u00a5", (Object)var17_26, (long)1294708871139941216L);
                    var19_28 /* !! */  = 18.0f + hi.a("\u00a5", (Object)var17_26, (long)1032995794944526068L) + 8.0f;
                    var20_29 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) - var19_28 /* !! */  * (1.0f - var18_27);
                    var21_30 /* !! */  = (reference)(16.0f * var18_27);
                    var22_31 = hi.a("G", (float)3.0f, (float)(var21_30 /* !! */  * 0.5f), (long)971000971621905228L);
                    var23_32 = var20_29 + 16.0f + 2.0f;
                    var24_33 = hi.a("\u00a5", (Object)var17_26, (long)1032995794944526068L) + 8.0f;
                    var25_34 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var15_20++}, (long)786910891685164907L);
                    v19 = new Object[2];
                    v19[1] = Float.valueOf((float)var18_27);
                    v19[0] = var25_34;
                    var26_35 = hi.a("\u00a5", (Object)this, (Object)v19, (long)652953831401665087L);
                    hi.a("\u00a5", (Object)var14_18, (float)var20_29, (float)var13_17, (float)16.0f, (float)var21_30 /* !! */ , (float)var22_31, (float)10.0f, (Object)var26_35, (long)1008283404322600030L);
                    hi.a("\u00a5", (Object)var14_18, (float)var23_32, (float)var13_17, (float)var24_33, (float)var21_30 /* !! */ , (float)var22_31, (float)10.0f, (Object)var26_35, (long)1008283404322600030L);
                    var27_36 = hi.a("\u00a5", (Object)var4_5, (float)0.72f, (Object)hi.a("j", (long)1254631756863587562L), (long)958009015122202404L);
                    var28_37 = hi.a("\u00a5", (Object)var4_5, (Object)eD.R("JOB7HQu6nVaFTQI5", fe(), (i7)var17_26), (float)0.72f, (Object)hi.a("j", (long)1254631756863587562L), (long)360006357769256977L);
                    var29_38 = hi.a("\u00a5", (Object)this, (Object)var25_34, (float)var18_27, (long)894123256670108677L);
                    hi.a("\u00a5", (Object)var14_18, (Object)hi.a("\u00a5", (Object)var17_26, (long)799806202254662377L), (float)(var20_29 + (16.0f - var28_37) * 0.5f), (float)(var13_17 + (var21_30 /* !! */  - var27_36) * 0.5f), (float)0.72f, (Object)var29_38, (Object)hi.a("j", (long)1254631756863587562L), (long)1054750863256699983L);
                    hi.a("\u00a5", (Object)var14_18, (Object)hi.a("\u00a5", (Object)var17_26, (long)1069134750439658283L), (float)(var23_32 + 4.0f), (float)(var13_17 + (var21_30 /* !! */  - hi.a("\u00a5", (Object)var4_5, (float)0.65f, (long)441868902805229185L)) * 0.5f), (float)0.65f, (Object)var29_38, (long)487875072643634565L);
                    v20 /* !! */  = eD.R("JOB7HQu6nVaFTQI5", isEmpty(), (String)hi.a("\u00a5", (Object)var17_26, (long)766473701442493995L));
                    if (!var3_3) ** GOTO lbl503
                    if (v20 /* !! */  == false) ** GOTO lbl504
                    v20 /* !! */  = var30_4 /* !! */  = (reference)(eD.d(25910, 3739478438168935555L) - eD.d(13756, 6852023147926973515L) - eD.d(10929, 8529757971984642980L) - eD.d(1224, 224101316233485604L) ^ eD.d(17784, 1257860758429277395L));
lbl503:
                    // 2 sources

                    if (var3_3) break;
lbl504:
                    // 2 sources

                    var30_4 /* !! */  = (reference)(eD.d(2720, 8680512227007124222L) - eD.d(18139, 3605329830952607520L) ^ eD.d(24970, 4117150663944353880L));
                    if (var3_3) break;
                    ** GOTO lbl521
                }
                case 1360354696: {
                    return;
                }
                case 1360354695: {
                    return;
                }
            }
            do {
                switch (var30_4 /* !! */ ) {
                    default: {
                        hi.a("\u00a5", (Object)var14_18, (Object)(" " + (String)hi.a("\u00a5", (Object)var17_26, (long)766473701442493995L)), (float)(var23_32 + 4.0f + hi.a("\u00a5", (Object)var17_26, (long)649074640011818873L)), (float)(var13_17 + (var21_30 /* !! */  - hi.a("\u00a5", (Object)var4_5, (float)0.65f, (long)441868902805229185L)) * 0.5f), (float)0.65f, (Object)eD.R("JOB7HQu6nVaFTQI5", Z(java.lang.Object float ), (eD)this, (Object)hi.a("j", (long)748039826516982428L), (float)var18_27), (long)487875072643634565L);
                        if (var3_3) break;
                        ** GOTO lbl217
                    }
                    case -342849106: {
                        ** continue;
                    }
                    case -342849108: {
                        return;
                    }
                }
lbl521:
                // 2 sources

                var30_4 /* !! */  = (reference)(eD.d(5520, 125311847863766408L) - eD.d(32702, 5578556156347328191L) - eD.d(6203, 5779356533322760645L) - eD.d(8363, 4126258433164146930L) ^ eD.d(22747, 6594803797027717623L));
            } while (var3_3);
lbl523:
            // 2 sources

            var30_4 /* !! */  = hi.a("G", (int)eD.d(5449, 2404246849178815862L), (int)eD.d(6975, 7269054054061458233L), (long)834203424483934088L) + eD.d(2632, 684529161074496441L);
        }
    }

    private boolean lambda$new$0() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)828140797298629023L), (Object)hi.a("j", (long)751376238799770247L), (long)511460060498514638L);
    }

    public static /* bridge */ /* synthetic */ CallSite R(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    private Color s(Object[] var1_1) {
        block16: {
            block15: {
                var3_2 = var1_1[0];
                var2_3 = ((Float)var1_1[1]).floatValue();
                var4_4 = Dl.t();
                var6_5 /* !! */  = eD.d(16639, 110988031503800488L) - eD.d(958, 8932476629562579682L) + eD.d(32091, 3505875564781675844L) - eD.d(865, 3552372673800821616L) ^ eD.d(25140, 2211721972659960791L) ^ eD.d(13545, 4179902730317786300L);
                if (!var4_4) ** GOTO lbl17
                block8: while (true) {
                    block19: {
                        block18: {
                            block17: {
                                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)427664607570366121L), (Object)hi.a("j", (long)668318514831450927L), (long)511460060498514638L);
                                if (var4_4) break block17;
                                if (v0 /* !! */  != false) break block18;
                                v0 /* !! */  = (CallSite)(eD.d(901, 3313227662368037380L) - eD.d(14871, 1783688662983336889L) + eD.d(4461, 6396675124639189279L));
                            }
                            var6_5 /* !! */  = (int)v0 /* !! */ ;
                            if (!var4_4) break block19;
                        }
                        var6_5 /* !! */  = eD.d(31323, 2490828209110491665L) - eD.d(25754, 3077812695786536216L) ^ eD.d(14393, 3124512444651200522L);
                    }
                    switch (var6_5 /* !! */ ) {
                        default: {
                            continue block8;
                        }
                        case -165450055: {
                            v1 = new Color((int)hi.a("\u00a5", (Object)((Color)var3_2), (long)634502724407806770L), (int)hi.a("\u00a5", (Object)((Color)var3_2), (long)791634218836538619L), (int)hi.a("\u00a5", (Object)((Color)var3_2), (long)505295769199362574L), (int)hi.a("\u00a5", (Object)hi.a("j", (long)815474260091604049L), (long)999912139159319168L));
                            var6_5 /* !! */  = (int)(eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)(eD.d(15700, 2872522154346210407L) + eD.d(4519, 803097414948800653L)), (int)eD.d(11331, 4329102683191145515L)) * eD.d(16523, 6538280134800480545L) / 5 - eD.d(4660, 8627476220341504946L));
                            if (var4_4) {
                                break block8;
                            }
                            break block15;
                        }
                        case -165450056: {
                            v1 = hi.a("j", (long)815474260091604049L);
                            if (!var4_4) break block8;
                            break block16;
                        }
                        case -165450054: {
                            hi.a("G", (long)487000789894408457L);
                            return null;
                        }
                    }
                    break;
                }
                var6_5 /* !! */  = (int)(hi.a("G", (int)(eD.d(30352, 6567062101505290224L) + eD.d(22204, 679647342385237886L)), (int)eD.d(19801, 2920594077363574010L), (long)834203424483934088L) * eD.d(528, 8303210664503630357L) / 5 - eD.d(9624, 6659437757977492694L));
            }
            block9: while (true) {
                switch (var6_5 /* !! */ ) {
                    default: {
                        break block9;
                    }
                    case 774597131: {
                        hi.a("G", (int)2, (int)1, (long)690492273059811833L);
                        hi.a("G", (long)1275757049065691860L);
                        var6_5 /* !! */  = eD.d(13672, 6726370930608631015L) + eD.d(5085, 1789276219544488611L) ^ eD.d(14744, 334620929942970415L);
                        continue block9;
                    }
                }
                break;
            }
        }
        var5_6 = v1;
        return eD.R("JOB7HQu6nVaFTQI5", Z(java.lang.Object float ), (eD)this, (Object)var5_6, (float)var2_3);
    }

    private boolean lambda$new$2() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)828140797298629023L), (Object)hi.a("j", (long)977775369664444962L), (long)511460060498514638L);
    }

    private Color Z(Object object, float f) {
        CallSite callSite = hi.a("G", (int)((int)((float)hi.a("\u00a5", (Object)((Color)object), (long)999912139159319168L) * hi.a("G", (float)f, (float)0.0f, (float)1.0f, (long)390336973585993938L))), (int)0, (int)eD.d(6831, 8260723842482225963L), (long)1051766797435725461L);
        return new Color((int)hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L), (int)hi.a("\u00a5", (Object)((Color)object), (long)791634218836538619L), (int)hi.a("\u00a5", (Object)((Color)object), (long)505295769199362574L), (int)callSite);
    }

    private eD() {
        super(eD.b(6599, -12502), 96.0f, 16.0f);
        this.z = hi.a("\u00a5", (Object)this, (Object)eD.b(6597, 21408), (Object)hi.a("j", (long)1173447058378651714L), (boolean)false, this::lambda$new$0, (long)393916397130120306L);
        this.N = hi.a("\u00a5", (Object)this, (Object)eD.b(6593, -5005), (Object)hi.a("j", (long)1173447058378651714L), (boolean)false, this::lambda$new$1, (long)393916397130120306L);
        this.P = hi.a("\u00a5", (Object)this, (Object)eD.b(6598, 27314), (Object)hi.a("j", (long)624057616205429839L), (boolean)false, this::lambda$new$2, (long)393916397130120306L);
        this.M = hi.a("\u00a5", (Object)this, (Object)eD.b(6594, -31127), (Object)hi.a("j", (long)598085941414656405L), (long)426795652261052192L);
        this.E = hi.a("\u00a5", (Object)this, (Object)eD.b(6592, 3872), (boolean)true, (long)1230617056439551805L);
        this.m = new HashMap<e, dl>();
        this.D = hi.a("G", _j::S, (long)906022743474534178L);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)5, eD.class);
        Hidden0.special_clinit_5_90(eD.class);
    }

    private boolean lambda$new$1() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)828140797298629023L), (Object)hi.a("j", (long)977775369664444962L), (long)511460060498514638L);
    }

    private static dl lambda$render$1(long l, e e2) {
        return new dl(l);
    }

    private static boolean lambda$render$0(Set set, e e2) {
        boolean bl = Dl.S();
        Object object = hi.a("\u00a5", (Object)set, (Object)e2, (long)1128025236213057684L);
        if (bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private String f(Object[] var1_1) {
        block12: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = (eD.d(25298, 6610155298612099815L) - eD.d(28945, 5588404065326934220L)) / eD.d(26618, 3408423115907153845L) + eD.d(22011, 22226909565291545L) - eD.d(3130, 7895177569667143149L);
            if (var3_3) ** GOTO lbl13
            block9: while (true) {
                block14: {
                    block13: {
                        if ((String)var2_2 != null) break block13;
                        var4_4 /* !! */  = (int)(hi.a("G", (int)eD.d(28757, 4695603271664904267L), (int)eD.d(3004, 8965154899662066335L), (long)834203424483934088L) * eD.d(14908, 4334036675499811407L) - eD.d(23077, 9041270446546977387L));
                        if (var3_3) break block14;
                    }
                    var4_4 /* !! */  = (eD.d(12255, 4387626667003180943L) - eD.d(27872, 6876314136567592307L)) * eD.d(3921, 5426595123483432813L) ^ eD.d(25556, 4694248552231778823L);
                    if (!var3_3) ** GOTO lbl37
                }
                while (true) {
                    block16: {
                        block15: {
                            switch (var4_4 /* !! */ ) {
                                default: {
                                    continue block9;
                                }
                                case 1868571788: {
                                    v0 = hi.a("\u00a5", (String)var2_2, (long)601063317567675907L);
                                    if (!var3_3) break block15;
                                    if (v0 == false) break;
                                    break block16;
                                }
                                case 1868571791: {
                                    v1 = "";
                                    var4_4 /* !! */  = eD.d(11228, 9100377397316842408L) * eD.d(2290, 7430137994330952047L) / eD.d(1030, 8973396378026532096L) ^ eD.d(26067, 6676116912029711850L);
                                    if (!var3_3) {
                                        break block9;
                                    }
                                    break block12;
                                }
                                case 1868571792: {
                                    v1 = (String)var2_2;
                                    if (var3_3) break block9;
                                    return v1;
                                }
                                case 1868571790: {
                                    hi.a("G", (long)1147339583020672972L);
                                    return eD.R("JOB7HQu6nVaFTQI5", r());
                                }
                            }
lbl37:
                            // 2 sources

                            v0 = hi.a("G", (int)(hi.a("G", (int)(eD.d(22047, 155006877679751063L) * eD.d(11067, 4395924577831776772L)), (int)eD.d(14559, 6127670776956444998L), (long)834203424483934088L) + eD.d(25380, 7290923806339512947L)), (int)eD.d(32716, 3644412115986458536L), (long)834203424483934088L) - eD.d(32489, 5060243460987725726L);
                        }
                        var4_4 /* !! */  = (int)v0;
                        if (var3_3) continue;
                    }
                    var4_4 /* !! */  = (int)(hi.a("G", (int)eD.d(13819, 4968936365939682383L), (int)eD.d(19245, 962217179826492020L), (long)834203424483934088L) * eD.d(18773, 3015732332069425471L) - eD.d(24782, 6182228899894213055L));
                }
                break;
            }
            var4_4 /* !! */  = eD.d(30009, 397134360871939131L) * eD.d(26253, 9017791134734728849L) / eD.d(1030, 8973396378026532096L) ^ eD.d(27176, 5682214482548700065L);
        }
        switch (var4_4 /* !! */ ) {
            default: {
                return v1;
            }
            case -2000197779: 
        }
        hi.a("G", (long)596429899407897303L);
        return eD.b(6595, 30898);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean W(Object[] var1_1) {
        block14: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = eD.d(17644, 9028227089817935309L) - eD.d(8292, 5614874450063194369L) + eD.d(14364, 6101734892196192648L);
            if (var3_3) ** GOTO lbl17
            block11: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = eD.R("JOB7HQu6nVaFTQI5", N(), (e)((e)var2_2));
                            if (!var3_3) break block15;
                            if (v0 != false) break block16;
                            v0 = hi.a("G", (int)hi.a("G", (int)eD.d(24744, 4897989358248409449L), (int)eD.d(15753, 799169150659781789L), (long)834203424483934088L), (int)eD.d(16921, 172452400100088581L), (long)834203424483934088L) + eD.d(12379, 236366630582610410L);
                        }
                        var4_4 /* !! */  = (int)v0;
                        if (var3_3) break block17;
                    }
                    var4_4 /* !! */  = (eD.d(18635, 3112952669431665134L) - eD.d(29425, 7390922311750298274L)) / eD.d(5614, 1547996022401256502L) * eD.d(10662, 4984291211547603374L) + eD.d(9179, 7354400250462829547L) ^ eD.d(9330, 7018928794387086759L);
                    if (!var3_3) ** GOTO lbl52
                }
                while (true) {
                    block24: {
                        block22: {
                            block23: {
                                block21: {
                                    block20: {
                                        block19: {
                                            block18: {
                                                switch (var4_4 /* !! */ ) {
                                                    default: {
                                                        continue block11;
                                                    }
                                                    case 1719316594: {
                                                        v1 = hi.a("\u00a5", (Object)((e)var2_2), (Object)new Object[0], (long)648732541034311433L);
                                                        if (!var3_3) break block18;
                                                        if (v1 != false) break;
                                                        break block19;
                                                    }
                                                    case 1719316589: {
                                                        if (eD.R("JOB7HQu6nVaFTQI5", u(), (e)((e)var2_2)) == null) break block20;
                                                        break block21;
                                                    }
                                                    case 1719316592: {
                                                        v2 = eD.R("JOB7HQu6nVaFTQI5", isEmpty(), (String)hi.a("\u00a5", (Object)((e)var2_2), (long)1025159459230292690L));
                                                        if (!var3_3) break block22;
                                                        if (v2 != false) break block23;
                                                        break block24;
                                                    }
                                                    case 1719316593: {
                                                        v3 = true;
                                                        var4_4 /* !! */  = (eD.R("JOB7HQu6nVaFTQI5", max(int int ), (int)(eD.d(27370, 889099821949792990L) * eD.d(3442, 3165398165956416546L)), (int)eD.d(12483, 2217148781453830303L)) ^ eD.d(23700, 5292350758370542802L)) / eD.d(1030, 8973396378026532096L) - eD.d(714, 5696390030921980685L);
                                                        if (!var3_3) {
                                                            break block11;
                                                        }
                                                        break block14;
                                                    }
                                                    case 1719316590: {
                                                        v3 = false;
                                                        if (var3_3) break block11;
                                                        return v3;
                                                    }
                                                    case 1719316595: {
                                                        hi.a("G", (long)980472709099540277L);
                                                        hi.a("G", (long)818835474660401656L);
                                                        continue block11;
                                                    }
                                                }
lbl52:
                                                // 2 sources

                                                v1 = hi.a("G", (int)hi.a("G", (int)eD.d(6770, 8363438564852482975L), (int)eD.d(28611, 2895791089145591688L), (long)834203424483934088L), (int)eD.d(15212, 4384909149630849878L), (long)834203424483934088L) + eD.d(5472, 6599213907876072686L);
                                            }
                                            var4_4 /* !! */  = (int)v1;
                                            if (var3_3) continue;
                                        }
                                        var4_4 /* !! */  = eD.d(28700, 1624643956813801902L) ^ eD.d(24577, 969005482097064298L) ^ eD.d(7598, 3648462748927575240L);
                                        if (var3_3) continue;
                                    }
                                    var4_4 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)eD.d(6770, 8363438564852482975L), (int)eD.d(28611, 2895791089145591688L), (long)834203424483934088L), (int)eD.d(15212, 4384909149630849878L), (long)834203424483934088L) + eD.d(5472, 6599213907876072686L));
                                    if (var3_3) continue;
                                }
                                var4_4 /* !! */  = (eD.d(16083, 7691006380853716616L) / eD.d(11506, 543468970634474862L) / eD.d(16482, 5988749702441048526L) ^ eD.d(15131, 1162534907448583020L)) - eD.d(1534, 910314038332022182L) - eD.d(24966, 4788592332473612317L);
                                if (var3_3) continue;
                            }
                            v2 = hi.a("G", (int)hi.a("G", (int)eD.d(6770, 8363438564852482975L), (int)eD.d(28611, 2895791089145591688L), (long)834203424483934088L), (int)eD.d(15212, 4384909149630849878L), (long)834203424483934088L) + eD.d(5472, 6599213907876072686L);
                        }
                        var4_4 /* !! */  = (int)v2;
                        if (var3_3) continue;
                    }
                    var4_4 /* !! */  = ((eD.d(21612, 6215747021076172210L) ^ eD.d(8317, 9050637292924631056L)) / eD.d(20161, 1410406515254105902L) + eD.d(15539, 721460925656524261L)) * eD.d(29515, 1560778863491721750L) ^ eD.d(5320, 6336689224906263885L);
                }
                break;
            }
            var4_4 /* !! */  = (hi.a("G", (int)(eD.d(29534, 2277631439175723850L) * eD.d(9521, 7549105853702536222L)), (int)eD.d(8994, 4224394938145438226L), (long)834203424483934088L) ^ eD.d(15119, 2687787606440731139L)) / eD.d(1030, 8973396378026532096L) - eD.d(27357, 603392438867866604L);
        }
        switch (var4_4 /* !! */ ) {
            default: {
                return v3;
            }
            case 491107613: 
        }
        throw null;
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x19C0) & 0xFFFF;
        if (y[n3] == null) {
            int n4;
            char[] cArray = u[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 228;
                case 1 -> 240;
                case 2 -> 106;
                case 3 -> 1;
                case 4 -> 96;
                case 5 -> 246;
                case 6 -> 91;
                case 7 -> 161;
                case 8 -> 254;
                case 9 -> 155;
                case 10 -> 57;
                case 11 -> 154;
                case 12 -> 235;
                case 13 -> 255;
                case 14 -> 100;
                case 15 -> 169;
                case 16 -> 215;
                case 17 -> 9;
                case 18 -> 63;
                case 19 -> 122;
                case 20 -> 197;
                case 21 -> 247;
                case 22 -> 32;
                case 23 -> 146;
                case 24 -> 213;
                case 25 -> 51;
                case 26 -> 112;
                case 27 -> 27;
                case 28 -> 34;
                case 29 -> 78;
                case 30 -> 165;
                case 31 -> 55;
                case 32 -> 76;
                case 33 -> 173;
                case 34 -> 3;
                case 35 -> 176;
                case 36 -> 147;
                case 37 -> 115;
                case 38 -> 23;
                case 39 -> 230;
                case 40 -> 160;
                case 41 -> 17;
                case 42 -> 92;
                case 43 -> 163;
                case 44 -> 177;
                case 45 -> 220;
                case 46 -> 184;
                case 47 -> 144;
                case 48 -> 103;
                case 49 -> 37;
                case 50 -> 81;
                case 51 -> 130;
                case 52 -> 98;
                case 53 -> 79;
                case 54 -> 66;
                case 55 -> 43;
                case 56 -> 2;
                case 57 -> 148;
                case 58 -> 123;
                case 59 -> 205;
                case 60 -> 87;
                case 61 -> 80;
                case 62 -> 24;
                case 63 -> 116;
                case 64 -> 214;
                case 65 -> 239;
                case 66 -> 248;
                case 67 -> 109;
                case 68 -> 217;
                case 69 -> 207;
                case 70 -> 196;
                case 71 -> 132;
                case 72 -> 62;
                case 73 -> 30;
                case 74 -> 60;
                case 75 -> 88;
                case 76 -> 107;
                case 77 -> 101;
                case 78 -> 47;
                case 79 -> 179;
                case 80 -> 124;
                case 81 -> 41;
                case 82 -> 50;
                case 83 -> 185;
                case 84 -> 56;
                case 85 -> 137;
                case 86 -> 221;
                case 87 -> 54;
                case 88 -> 245;
                case 89 -> 202;
                case 90 -> 133;
                case 91 -> 70;
                case 92 -> 167;
                case 93 -> 44;
                case 94 -> 212;
                case 95 -> 164;
                case 96 -> 121;
                case 97 -> 75;
                case 98 -> 183;
                case 99 -> 93;
                case 100 -> 234;
                case 101 -> 223;
                case 102 -> 195;
                case 103 -> 142;
                case 104 -> 186;
                case 105 -> 157;
                case 106 -> 131;
                case 107 -> 253;
                case 108 -> 162;
                case 109 -> 104;
                case 110 -> 105;
                case 111 -> 201;
                case 112 -> 15;
                case 113 -> 36;
                case 114 -> 232;
                case 115 -> 181;
                case 116 -> 45;
                case 117 -> 178;
                case 118 -> 58;
                case 119 -> 191;
                case 120 -> 12;
                case 121 -> 46;
                case 122 -> 13;
                case 123 -> 25;
                case 124 -> 26;
                case 125 -> 4;
                case 126 -> 19;
                case 127 -> 175;
                case 128 -> 42;
                case 129 -> 141;
                case 130 -> 182;
                case 131 -> 243;
                case 132 -> 111;
                case 133 -> 238;
                case 134 -> 73;
                case 135 -> 95;
                case 136 -> 236;
                case 137 -> 129;
                case 138 -> 203;
                case 139 -> 241;
                case 140 -> 172;
                case 141 -> 150;
                case 142 -> 145;
                case 143 -> 83;
                case 144 -> 49;
                case 145 -> 68;
                case 146 -> 224;
                case 147 -> 21;
                case 148 -> 38;
                case 149 -> 168;
                case 150 -> 7;
                case 151 -> 170;
                case 152 -> 82;
                case 153 -> 198;
                case 154 -> 20;
                case 155 -> 171;
                case 156 -> 0;
                case 157 -> 200;
                case 158 -> 84;
                case 159 -> 152;
                case 160 -> 192;
                case 161 -> 89;
                case 162 -> 64;
                case 163 -> 52;
                case 164 -> 90;
                case 165 -> 209;
                case 166 -> 139;
                case 167 -> 251;
                case 168 -> 127;
                case 169 -> 126;
                case 170 -> 134;
                case 171 -> 99;
                case 172 -> 67;
                case 173 -> 71;
                case 174 -> 222;
                case 175 -> 86;
                case 176 -> 69;
                case 177 -> 53;
                case 178 -> 118;
                case 179 -> 189;
                case 180 -> 33;
                case 181 -> 187;
                case 182 -> 206;
                case 183 -> 72;
                case 184 -> 166;
                case 185 -> 252;
                case 186 -> 242;
                case 187 -> 61;
                case 188 -> 225;
                case 189 -> 6;
                case 190 -> 250;
                case 191 -> 199;
                case 192 -> 119;
                case 193 -> 108;
                case 194 -> 59;
                case 195 -> 136;
                case 196 -> 210;
                case 197 -> 65;
                case 198 -> 8;
                case 199 -> 40;
                case 200 -> 158;
                case 201 -> 16;
                case 202 -> 138;
                case 203 -> 204;
                case 204 -> 28;
                case 205 -> 208;
                case 206 -> 149;
                case 207 -> 94;
                case 208 -> 117;
                case 209 -> 128;
                case 210 -> 193;
                case 211 -> 10;
                case 212 -> 218;
                case 213 -> 219;
                case 214 -> 159;
                case 215 -> 125;
                case 216 -> 48;
                case 217 -> 151;
                case 218 -> 140;
                case 219 -> 216;
                case 220 -> 237;
                case 221 -> 18;
                case 222 -> 120;
                case 223 -> 97;
                case 224 -> 14;
                case 225 -> 211;
                case 226 -> 5;
                case 227 -> 39;
                case 228 -> 188;
                case 229 -> 227;
                case 230 -> 226;
                case 231 -> 153;
                case 232 -> 194;
                case 233 -> 229;
                case 234 -> 249;
                case 235 -> 29;
                case 236 -> 113;
                case 237 -> 231;
                case 238 -> 35;
                case 239 -> 244;
                case 240 -> 110;
                case 241 -> 135;
                case 242 -> 114;
                case 243 -> 180;
                case 244 -> 11;
                case 245 -> 233;
                case 246 -> 85;
                case 247 -> 102;
                case 248 -> 31;
                case 249 -> 156;
                case 250 -> 77;
                case 251 -> 174;
                case 252 -> 22;
                case 253 -> 190;
                case 254 -> 143;
                default -> 74;
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
            eD.y[n3] = new String(cArray).intern();
        }
        return y[n3];
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x595A;
        if (db[n2] == null) {
            eD.db[n2] = (int)(F[n2] ^ l);
        }
        return db[n2];
    }

    private static long e(int n, long l) {
        int n2 = (n ^ (int)l ^ 0xABC) & Short.MAX_VALUE;
        if (lb[n2] == null) {
            eD.lb[n2] = eb[n2] ^ l;
        }
        return lb[n2];
    }
}
