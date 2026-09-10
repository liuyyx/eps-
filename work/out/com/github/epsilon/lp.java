/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.AbstractClientPlayer
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon._Z;
import com.github.epsilon._j;
import com.github.epsilon.e;
import com.github.epsilon.gk;
import com.github.epsilon.hi;
import com.github.epsilon.l8;
import com.github.epsilon.zU;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class lp
extends l8 {
    private final Supplier<_j> n;
    private static final float o = 10.0f;
    private static final float l = 4.0f;
    private final LivingEntity w;
    private static final float M = 8.0f;
    private boolean s;
    private static final float G = 16.0f;
    private static final float r = 4.0f;
    private float T;
    private static final float u = 12.0f;
    private final _Z U = new _Z();
    private static final float Q = 1.0f;
    private static final float b = 6.0f;
    private static final float C = 160.0f;
    private static final float V = 5.0f;
    private static final float A = 4.0f;
    private static final float c = 6.0f;
    private static final float S = 36.0f;
    private static final float W = 0.9f;
    private static final float L = 1.25f;
    private static final String[] a;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;
    private static final long h;

    public LivingEntity V(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)969092746898469670L);
    }

    private void L(Object[] objectArray) {
        Object object = objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = 5.44f;
        CallSite callSite = hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)760119312841263044L), (long)783130644239099151L);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = callSite;
        objectArray2[3] = Float.valueOf(1.4f);
        objectArray2[2] = Float.valueOf(f3);
        objectArray2[1] = Float.valueOf(f2);
        objectArray2[0] = Float.valueOf(f);
        hi.a("\u00a5", (Object)((zU)object), (Object)objectArray2, (long)1232175890498664897L);
        hi.a("\u00a5", (Object)((zU)object), (float)(f - 1.0f), (float)(f2 - 1.0f), (float)2.0f, (float)2.0f, (float)1.0f, (Object)callSite, (long)776507817655946365L);
        float f4 = f3 + 2.4f;
        hi.a("\u00a5", (Object)((zU)object), (float)(f - 0.6f), (float)(f2 - f4), (float)1.2f, (float)2.2f, (Object)callSite, (long)941115194411145692L);
        hi.a("\u00a5", (Object)((zU)object), (float)(f - 0.6f), (float)(f2 + f4 - 2.2f), (float)1.2f, (float)2.2f, (Object)callSite, (long)941115194411145692L);
        hi.a("\u00a5", (Object)((zU)object), (float)(f - f4), (float)(f2 - 0.6f), (float)2.2f, (float)1.2f, (Object)callSite, (long)941115194411145692L);
        hi.a("\u00a5", (Object)((zU)object), (float)(f + f4 - 2.2f), (float)(f2 - 0.6f), (float)2.2f, (float)1.2f, (Object)callSite, (long)941115194411145692L);
    }

    private static String V(float f) {
        return hi.a("G", (Object)hi.a("j", (long)795501881625394938L), (Object)lp.a(-2121, -11987), (Object)new Object[]{lp.J("WoEFVLCe4a1b7go4", valueOf(float ), (float)f)}, (long)1264245572283041652L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float W(Object[] var0) {
        block14: {
            block12: {
                block13: {
                    var2_1 = ((Float)var0[0]).floatValue();
                    var3_2 = ((Float)var0[1]).floatValue();
                    var1_3 = ((Float)var0[2]).floatValue();
                    var4_4 = Dl.t();
                    var6_5 /* !! */  = hi.a("G", (int)lp.b(4072, 1054351818849241258L), (int)lp.b(9830, 3288263022210441538L), (long)834203424483934088L) ^ lp.b(17213, 5129731615489524814L);
                    if (var4_4) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var5_6 = var3_2 - var2_1;
                            cfr_temp_0 = hi.a("G", (float)var5_6, (long)400111314131951612L) - var1_3;
                            v0 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var4_4) break block12;
                            if (v0 > 0) break block13;
                            break block14;
                            break;
                        }
lbl15:
                        // 1 sources

                        return var3_2;
lbl17:
                        // 1 sources

                        return var2_1 + hi.a("G", (float)var5_6, (long)1211270784066855389L) * var1_3;
                    }
                    switch (var6_5 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -1724718709: {
                            return (float)lp.J("WoEFVLCe4a1b7go4", H());
                        }
                    }
lbl24:
                    // 2 sources

                    while (true) {
                        switch (var6_5 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 701961651: {
                                ** continue;
                            }
                            {
                                ** case 701961652:
                            }
                        }
lbl31:
                        // 1 sources

                        return (float)lp.J("WoEFVLCe4a1b7go4", H());
                    }
                }
                v0 = hi.a("G", (int)((lp.b(15998, 6999784509213473083L) + lp.b(11644, 4592630685652216366L)) / lp.b(7242, 6453357570632112902L)), (int)lp.b(3929, 1918432697494161472L), (long)834203424483934088L) + lp.b(19352, 8207335201243237428L) - lp.b(21822, 8971438357661094521L);
            }
            var6_5 /* !! */  = (int)v0;
            if (!var4_4) ** GOTO lbl24
        }
        var6_5 /* !! */  = lp.b(19287, 5665630053583129656L) / 2 ^ lp.b(2605, 3228757013518142757L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean S() {
        block14: {
            block15: {
                block13: {
                    var1_1 = Dl.t();
                    var2_2 /* !! */  = (lp.b(6926, 5279993453466377303L) - lp.b(13799, 4648751385966998215L)) / lp.b(25970, 8004149830097838719L) - lp.b(5783, 2780370896551399870L) + lp.b(19577, 4162137833487141758L) ^ lp.b(3515, 4706270469604395692L);
                    if (!var1_1) break block13;
lbl4:
                    // 2 sources

                    while (true) {
                        block17: {
                            block16: {
                                v0 /* !! */  = lp.J("WoEFVLCe4a1b7go4", C(), (lp)this);
                                if (var1_1) break block16;
                                if (v0 /* !! */  != false) break block17;
                                v0 /* !! */  = (CallSite)(((lp.b(24551, 6529265108525684806L) + lp.b(27342, 949794348134346136L) ^ lp.b(4852, 4631689560593094020L)) + lp.b(7049, 3116064552977587247L)) / lp.b(25970, 8004149830097838719L) ^ lp.b(32489, 4497445040727701970L));
                            }
                            var2_2 /* !! */  = (int)v0 /* !! */ ;
                            if (!var1_1) break block13;
                        }
                        var2_2 /* !! */  = (lp.b(7063, 4736168562163833992L) - lp.b(7670, 9197086516203117227L) + lp.b(22888, 2905458125734616631L) ^ lp.b(14582, 6960154258245418983L)) - lp.b(9205, 4371727638319916176L);
                        if (!var1_1) break block13;
                        ** GOTO lbl42
                        break;
                    }
lbl16:
                    // 2 sources

                    while (true) {
                        v1 = true;
                        var2_2 /* !! */  = (lp.b(28564, 1827772014734747896L) - lp.b(23349, 3128213977714170942L) - lp.b(10856, 2971830826306039157L) + lp.b(28449, 5815510605306243205L)) * lp.b(24879, 153583382351783551L) + lp.b(15829, 3273046240707836559L);
                        if (!var1_1) break block14;
                        break block15;
                        break;
                    }
                }
                block11: while (true) {
                    block19: {
                        block18: {
                            switch (var2_2 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 1381573999: {
                                    v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)512615766236329019L), (long)lp.h, (long)1224860919547296605L);
                                    if (var1_1) break block18;
                                    if (v2 /* !! */  == false) break;
                                    break block19;
                                }
                                case 1381574000: {
                                    ** GOTO lbl16
                                }
                                case 1381574001: {
                                    v1 = false;
                                    if (!var1_1) break block11;
                                    return v1;
                                }
                                case 1381573998: {
                                    lp.J("WoEFVLCe4a1b7go4", T());
                                    ** continue;
                                }
                            }
lbl42:
                            // 2 sources

                            v2 /* !! */  = (CallSite)(((lp.b(9563, 4072865589649105442L) + lp.b(2909, 2053504693061438558L) ^ lp.b(28568, 5025285023604549796L)) + lp.b(19576, 1769782043905887046L)) / lp.b(25970, 8004149830097838719L) ^ lp.b(3098, 2589670261201062676L));
                        }
                        var2_2 /* !! */  = (int)v2 /* !! */ ;
                        if (!var1_1) continue;
                    }
                    var2_2 /* !! */  = (int)(hi.a("G", (int)(lp.b(31603, 8987807188690910228L) * lp.b(3198, 273806550265973524L)), (int)lp.b(6821, 2441542939756158383L), (long)834203424483934088L) + lp.b(11897, 4481770865293093219L));
                }
            }
            var2_2 /* !! */  = (lp.b(11073, 3361373917008948291L) - lp.b(29252, 6183937181727864101L) - lp.b(25059, 3989837254543353522L) + lp.b(17542, 1042883420376892352L)) * lp.b(2668, 3677115801853250871L) + lp.b(23830, 3441025117468072458L);
        }
        switch (var2_2 /* !! */ ) {
            default: {
                return v1;
            }
            case -1495679403: 
        }
        hi.a("G", (long)850375381118395903L);
        return (boolean)hi.a("G", (int)lp.b(27510, 868847097711373322L), (long)801972633595358600L);
    }

    public lp(LivingEntity livingEntity, Supplier<_j> supplier, gk gk2) {
        super(gk2, 3);
        this.w = livingEntity;
        this.n = supplier;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void n(Object[] var1_1) {
        block16: {
            var2_2 = Dl.S();
            var14_3 /* !! */  = lp.b(5231, 3864720265339851610L) * lp.b(24018, 4924553843414080230L) * lp.b(12845, 5749025455789176152L) + lp.b(18618, 1234919770159812557L) + lp.b(12178, 3254270878098548896L);
            if (var2_2) break block16;
lbl5:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1305017658517506148L);
                if (!var2_2) ** GOTO lbl81
                if (v0 /* !! */  != false) ** GOTO lbl80
                ** GOTO lbl83
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                block18: {
                    block17: {
                        hi.a("\u00f2", (Object)this, (float)0.5f, (long)473417052379647873L);
                        var3_4 = (_j)lp.J("WoEFVLCe4a1b7go4", get(), (Supplier)hi.a("\u00e9", (Object)this, (long)393482757195335872L));
                        var4_5 = hi.a("\u00a5", (Object)var3_4, (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)575194872422435314L), (long)445233814433577985L), (float)1.25f, (long)665434286926928221L);
                        var5_6 = 50.0f + var4_5 + 4.0f + 16.0f + 12.0f;
                        var6_7 = (float)hi.a("G", (long)938841799815187197L) - 50.0f;
                        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)var5_6, (float)160.0f, (float)hi.a("G", (float)160.0f, (float)var6_7, (long)1021203527991582354L), (long)390336973585993938L), (long)1201138026471431927L);
                        var7_8 = hi.a("G", (float)1.0f, (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)1223930668913322686L) + hi.a("G", (float)0.0f, (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)766073733819801286L), (long)1021203527991582354L)), (long)1021203527991582354L);
                        var8_9 = hi.a("\u00a5", (Object)hi.a("j", (long)710376259427890788L), (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)449255995392705669L);
                        var9_10 = hi.a("G", (float)4.0f, (float)hi.a("\u00a5", (Object)var3_4, (float)0.9f, (long)441868902805229185L), (long)1021203527991582354L);
                        hi.a("\u00f2", (Object)this, (float)(58.0f + var9_10), (long)499790097997204220L);
                        var10_11 = hi.a("\u00a5", (Object)var3_4, (Object)lp.J("WoEFVLCe4a1b7go4", V(float ), (float)var8_9), (float)0.9f, (long)665434286926928221L);
                        var11_12 = hi.a("\u00a5", (Object)var3_4, (Object)hi.a("G", (float)var7_8, (long)1129382842951522738L), (float)0.9f, (long)665434286926928221L);
                        var12_13 = hi.a("G", (float)1.0f, (float)(hi.a("\u00e9", (Object)this, (long)1201138026471431927L) - 20.0f - var10_11 - var11_12 - 10.0f), (long)1021203527991582354L);
                        var13_14 = hi.a("G", (float)1.0f, (float)(var12_13 * (var8_9 / var7_8)), (long)1021203527991582354L);
                        v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)1198823881518396419L);
                        if (!var2_2) break block17;
                        if (v1 /* !! */  == false) break block18;
                        v1 /* !! */  = (CallSite)((hi.a("G", (int)lp.b(23065, 6944918090245578082L), (int)lp.b(30167, 4204430112924480245L), (long)834203424483934088L) ^ lp.b(6786, 4866865008647364010L) ^ lp.b(23327, 7857030310072196158L)) / lp.b(27510, 868847097711373322L) - lp.b(2344, 2931051852002872930L));
                    }
                    var14_3 /* !! */  = (int)v1 /* !! */ ;
                    if (var2_2) ** GOTO lbl53
                }
                var14_3 /* !! */  = (lp.b(29769, 5252623684203098919L) ^ lp.b(13810, 6138445315795841703L)) + lp.b(6073, 6716262512191721488L) + lp.b(3601, 5081437344663128400L) + lp.b(20133, 8578483930006489580L);
                if (var2_2) ** GOTO lbl53
                if (true) ** GOTO lbl40
                block12: while (true) {
                    block19: {
                        hi.a("\u00f2", (Object)this, (float)var13_14, (long)463165793423641806L);
                        hi.a("\u00f2", (Object)this, (boolean)true, (long)1198823881518396419L);
                        if (!var2_2) break block19;
lbl40:
                        // 2 sources

                        var14_3 /* !! */  = lp.b(14634, 8517618268718923268L) / lp.b(21454, 8922726978359432291L) * lp.b(19097, 6441968447825349939L) + lp.b(6104, 8307173793495011456L) - lp.b(30392, 193873934011806156L) - lp.b(4469, 6340211464830113404L);
                        if (var2_2) ** GOTO lbl53
                        ** GOTO lbl52
                    }
                    block13: while (true) {
                        v2 = new Object[3];
                        v2[2] = Float.valueOf((float)(var12_13 * 0.04f));
                        v2[1] = Float.valueOf((float)var13_14);
                        v2[0] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)463165793423641806L));
                        hi.a("\u00f2", (Object)this, (float)hi.a("G", (Object)v2, (long)685049755492603070L), (long)463165793423641806L);
                        if (!var2_2) {
                            return;
                        }
lbl52:
                        // 3 sources

                        var14_3 /* !! */  = lp.b(3226, 7020240800805866466L) / lp.b(9842, 5145100803496108375L) * lp.b(16563, 3206911252446971872L) + lp.b(11618, 3482639633532611141L) - lp.b(26827, 2471191977851432903L) - lp.b(17534, 3695297128658830153L);
lbl53:
                        // 4 sources

                        switch (var14_3 /* !! */ ) {
                            case 1693950049: {
                                hi.a("G", (long)441264294682620418L);
                                continue block12;
                            }
                            default: {
                                continue block12;
                            }
                            case 1693950051: {
                                continue block13;
                            }
                            case 1693950050: 
                        }
                        break;
                    }
                    break;
                }
                return;
            }
        }
        block14: while (true) {
            block20: {
                switch (var14_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -66486977: {
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)512615766236329019L), (long)779279608538024261L);
                        if (var2_2) break block20;
                        ** GOTO lbl10
                    }
                    case -66486974: {
                        ** continue;
                    }
                    case -66486975: {
                        hi.a("G", (int)lp.b(3341, 754045091265301099L), (long)902898246708732704L);
                        var14_3 /* !! */  = lp.b(3621, 5660594956530665832L) / lp.b(30024, 8774174732771209854L) ^ lp.b(20496, 6884680092019136336L);
                        if (var2_2) continue block14;
                    }
                }
lbl80:
                // 2 sources

                v0 /* !! */  = (CallSite)((lp.b(32153, 7652782312655305455L) * lp.b(24406, 958318410703247412L) + lp.b(2181, 7370987731593875329L) ^ lp.b(13534, 6816741822006621065L)) - lp.b(1800, 6314364567238459478L) ^ lp.b(26602, 1802299623509303461L));
lbl81:
                // 2 sources

                var14_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) continue;
lbl83:
                // 2 sources

                var14_3 /* !! */  = (lp.b(10166, 4489221248569729225L) + lp.b(30662, 4641660598472290517L)) / lp.b(31691, 284051731205668064L) / 2 - lp.b(18035, 8425135644009824724L) + lp.b(264, 731599476437796395L);
                if (var2_2) continue;
            }
            var14_3 /* !! */  = (lp.b(19038, 9153439820992515392L) * lp.b(31510, 3879958509260553220L) + lp.b(6197, 183189924363493128L) ^ lp.b(18710, 1811921990948294229L)) - lp.b(12550, 1455598993031001672L) ^ lp.b(29239, 4127687689473307974L);
        }
    }

    public static /* bridge */ /* synthetic */ CallSite J(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    @Override
    public void B(Object[] var1_1) {
        block26: {
            block25: {
                block24: {
                    block27: {
                        var6_2 = (zU)var1_1[0];
                        var2_3 = ((Float)var1_1[1]).floatValue();
                        var5_4 = ((Float)var1_1[2]).floatValue();
                        var3_5 = ((Float)var1_1[3]).floatValue();
                        var4_6 = ((Float)var1_1[4]).floatValue();
                        var7_7 = Dl.S();
                        var34_8 /* !! */  = (lp.b(3561, 1544670538685008581L) + lp.b(9531, 2043732633627157147L) ^ lp.b(22105, 6153954857747091801L)) - lp.b(15664, 622350833116477990L);
                        if (var7_7) break block27;
lbl10:
                        // 2 sources

                        while (true) {
                            v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)393482757195335872L), (long)876941681548788276L);
                            while (true) {
                                var8_9 = (_j)v0;
                                var9_10 = 8.0f;
                                var10_11 = 8.0f;
                                var11_12 = 7.92f;
                                hi.a("\u00a5", (Object)var6_2, (float)var9_10, (float)var10_11, (float)36.0f, (float)36.0f, (float)var11_12, (Object)hi.a("\u00a5", (Object)this, (Object)new Color(0, 0, 0, lp.b(20455, 5935214231907010781L)), (long)783130644239099151L), (long)776507817655946365L);
                                var13_13 = hi.a("\u00e9", (Object)this, (long)969092746898469670L);
                                v1 = var13_13 instanceof AbstractClientPlayer;
                                if (var7_7) {
                                    if (v1 != 0) break block24;
                                    v1 = var34_8 /* !! */  = (lp.b(12640, 6756047462534018569L) ^ lp.b(5322, 8095362134566687697L)) * lp.b(17241, 8739929255301121089L) / 3 ^ lp.b(10099, 2616180788125425778L);
                                }
                                if (var7_7) break block25;
                                break block24;
                                break;
                            }
                            break;
                        }
lbl25:
                        // 2 sources

                        while (true) {
                            block29: {
                                block28: {
                                    var12_16 = var9_10 + 36.0f + 6.0f;
                                    var13_14 = var3_5 - 16.0f - 12.0f;
                                    var14_17 = lp.J("WoEFVLCe4a1b7go4", getString(), (Component)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)575194872422435314L));
                                    hi.a("\u00a5", (Object)var6_2, (Object)var14_17, (float)var12_16, (float)(var10_11 + 2.0f), (float)1.25f, (Object)hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)720158344261759983L), (long)783130644239099151L), (long)487875072643634565L);
                                    var15_18 = hi.a("G", (Object)hi.a("j", (long)795501881625394938L), (Object)lp.a(-2122, -6567), (Object)new Object[]{hi.a("G", (float)lp.J("WoEFVLCe4a1b7go4", distanceTo(net.minecraft.world.entity.Entity ), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (Entity)hi.a("\u00e9", (Object)this, (long)969092746898469670L)), (long)1097085248186378937L)}, (long)1264245572283041652L);
                                    var16_19 = lp.J("WoEFVLCe4a1b7go4", i(float ), (_j)var8_9, (float)1.25f);
                                    hi.a("\u00a5", (Object)var6_2, (Object)var15_18, (float)var12_16, (float)(var10_11 + 2.0f + var16_19 + 3.0f), (float)1.0f, (Object)hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)932689590773998488L), (long)783130644239099151L), (long)487875072643634565L);
                                    v2 = new Object[3];
                                    v2[2] = Float.valueOf(var10_11 + 4.0f + 8.0f);
                                    v2[1] = Float.valueOf(var13_14 + 8.0f);
                                    v2[0] = var6_2;
                                    hi.a("\u00a5", (Object)this, (Object)v2, (long)452329553554908759L);
                                    var17_20 = lp.J("WoEFVLCe4a1b7go4", max(float float ), (float)1.0f, (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)1223930668913322686L) + hi.a("G", (float)0.0f, (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)766073733819801286L), (long)1021203527991582354L)));
                                    var18_21 = hi.a("\u00a5", (Object)hi.a("j", (long)710376259427890788L), (Object)hi.a("\u00e9", (Object)this, (long)969092746898469670L), (long)449255995392705669L);
                                    var19_22 = hi.a("G", (float)var18_21, (long)1129382842951522738L);
                                    var20_23 = hi.a("G", (float)var17_20, (long)1129382842951522738L);
                                    var21_24 = hi.a("\u00a5", (Object)var8_9, (float)0.9f, (long)441868902805229185L);
                                    var22_25 = hi.a("\u00a5", (Object)var8_9, (Object)var19_22, (float)0.9f, (long)665434286926928221L);
                                    var23_26 = hi.a("\u00a5", (Object)var8_9, (Object)var20_23, (float)0.9f, (long)665434286926928221L);
                                    var24_27 = hi.a("G", (float)4.0f, (float)var21_24, (long)1021203527991582354L);
                                    var25_28 = var10_11 + 36.0f + 6.0f;
                                    var26_29 = var25_28 + (var24_27 - var21_24) * 0.5f;
                                    var27_30 = 10.0f + var22_25 + 5.0f;
                                    var28_31 = var3_5 - 10.0f - var23_26 - 5.0f;
                                    var29_32 = hi.a("G", (float)1.0f, (float)(var28_31 - var27_30), (long)1021203527991582354L);
                                    var30_33 = var25_28 + (var24_27 - 4.0f) * 0.5f;
                                    var31_34 = 2.0f;
                                    hi.a("\u00a5", (Object)var6_2, (float)var27_30, (float)var30_33, (float)var29_32, (float)4.0f, (float)var31_34, (Object)lp.J("WoEFVLCe4a1b7go4", V(java.awt.Color ), (lp)this, (Color)hi.a("j", (long)625689211155287392L)), (long)776507817655946365L);
                                    var32_35 = new Color[]{hi.a("j", (long)760119312841263044L), hi.a("j", (long)926754446249079507L), hi.a("j", (long)645951472504482279L)};
                                    var33_36 = lp.J("WoEFVLCe4a1b7go4", clamp(float float float ), (float)var29_32, (float)0.0f, (float)hi.a("\u00e9", (Object)this, (long)463165793423641806L));
                                    cfr_temp_0 = var33_36 - 0.0f;
                                    v3 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                    if (!var7_7) break block28;
                                    if (v3 /* !! */  > 0) break block29;
                                    v3 /* !! */  = (reference)((lp.b(12123, 1364974994351220767L) ^ lp.b(1990, 1724937263270052089L)) + lp.b(17677, 2040230151651295755L));
                                }
                                var34_8 /* !! */  = (int)v3 /* !! */ ;
                                if (var7_7) break block26;
                            }
                            var34_8 /* !! */  = lp.b(3490, 4720766027735550658L) - lp.b(28383, 8920453068569881034L) + lp.b(2592, 8790793074507500904L) + lp.b(9250, 2432106220409643846L) + lp.b(6142, 1705610027934798062L) - lp.b(25978, 1363492801036722898L);
                            if (var7_7) break block26;
                            ** GOTO lbl142
                            break;
                        }
lbl68:
                        // 2 sources

                        while (true) {
                            hi.a("\u00a5", (Object)var6_2, (Object)var19_22, (float)10.0f, (float)var26_29, (float)0.9f, (Object)hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)569254123564006439L), (long)783130644239099151L), (long)487875072643634565L);
                            hi.a("\u00a5", (Object)var6_2, (Object)var20_23, (float)(var3_5 - 10.0f - var23_26), (float)var26_29, (float)0.9f, (Object)hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)569254123564006439L), (long)783130644239099151L), (long)487875072643634565L);
                            if (com.github.epsilon.e.M() == null) return;
                            Dl.B(var7_7 == false);
                            return;
                        }
                    }
                    while (true) {
                        switch (var34_8 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -117545021: 
                        }
                        hi.a("G", (long)397471851942621184L);
                        v0 = hi.a("G", (long)659151967568421102L);
                        if (!var7_7) ** continue;
                        var34_8 /* !! */  = (lp.b(23958, 6536066089665206845L) / lp.b(20033, 8007457011283036501L) ^ lp.b(207, 3951989789611575242L)) - lp.b(5959, 3539795667154817077L) - lp.b(15762, 461077035298126525L);
                    }
                }
                var34_8 /* !! */  = (int)(hi.a("G", (int)(lp.b(11508, 8513240128614263708L) / lp.b(7050, 950566587027938518L) + lp.b(11992, 9172271433290049954L)), (int)lp.b(8445, 606872239603509123L), (long)834203424483934088L) + lp.b(12686, 1164116572663182977L));
                block18: while (true) {
                    switch (var34_8 /* !! */ ) {
                        default: {
                            var12_15 = (AbstractClientPlayer)var13_13;
                            var13_13 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var12_15, (long)1119149936291176659L), (long)709844567398076201L), (long)626461247043783440L);
                            v4 = new Object[6];
                            v4[5] = lp.J("WoEFVLCe4a1b7go4", V(java.awt.Color ), (lp)this, (Color)hi.a("j", (long)1173447058378651714L));
                            v4[4] = Float.valueOf(var11_12);
                            v4[3] = Float.valueOf(36.0f);
                            v4[2] = Float.valueOf(var10_11);
                            v4[1] = Float.valueOf(var9_10);
                            v4[0] = var13_13;
                            hi.a("\u00a5", (Object)var6_2, (Object)v4, (long)818924792766685982L);
                            if (var7_7) break block18;
                            ** GOTO lbl25
                        }
                        case 1622924030: {
                            lp.J("WoEFVLCe4a1b7go4", p());
                            var34_8 /* !! */  = lp.b(32715, 2189516976512973042L) * lp.b(17433, 8660118455446111028L) - lp.b(8730, 7226224073142560103L) + lp.b(17824, 6342647594431447566L) ^ lp.b(20753, 6038262508493805115L);
                            if (!var7_7) break block25;
                            if (var7_7) continue block18;
                            throw null;
                        }
                    }
                    break;
                }
                var34_8 /* !! */  = (lp.b(760, 4867213081131271571L) ^ lp.b(24950, 599585312939583046L)) * lp.b(17526, 2309673965221151559L) / 3 ^ lp.b(12465, 1557416982606575589L);
            }
            switch (var34_8 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1053766069: 
            }
            throw null;
        }
        block19: while (true) {
            switch (var34_8 /* !! */ ) {
                default: {
                    v5 = new Object[7];
                    v5[6] = lp.J("WoEFVLCe4a1b7go4", V(java.awt.Color ), (lp)this, (Color)var32_35[var32_35.length - 1]);
                    v5[5] = lp.J("WoEFVLCe4a1b7go4", V(java.awt.Color ), (lp)this, (Color)var32_35[0]);
                    v5[4] = Float.valueOf(var31_34);
                    v5[3] = Float.valueOf(4.0f);
                    v5[2] = Float.valueOf((float)var33_36);
                    v5[1] = Float.valueOf(var30_33);
                    v5[0] = Float.valueOf(var27_30);
                    hi.a("\u00a5", (Object)var6_2, (Object)v5, (long)841785224573631958L);
                    if (var7_7) break;
                    ** GOTO lbl68
                }
                case -2065165948: {
                    ** continue;
                }
                case -2065165949: {
                    lp.J("WoEFVLCe4a1b7go4", A(int ), (int)lp.b(24271, 7366343962748131756L));
                    var34_8 /* !! */  = (lp.b(23886, 4334991992280291958L) + lp.b(31489, 5407447024343071918L) ^ lp.b(27131, 3006154671159848542L)) - lp.b(8829, 4121366461085017398L);
                    continue block19;
                }
            }
lbl142:
            // 2 sources

            var34_8 /* !! */  = (lp.b(20451, 5346329756736391376L) ^ lp.b(7063, 4241762556051250426L)) + lp.b(22139, 1717320503110635869L);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var15 = new String[2];
                        var13_1 = 0;
                        var12_2 = "\u00dd\u00daY\u009e\u000e\u00d6@\u0013ppCc\u0001\u00d8\u009b\u000b\u0017\b,";
                        var14_3 = "\u00dd\u00daY\u009e\u000e\u00d6@\u0013ppCc\u0001\u00d8\u009b\u000b\u0017\b,".length();
                        var11_4 = 4;
                        var10_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var15[var13_1++] = new String(v0).intern();
                            if ((var10_5 += var11_4) < var14_3) {
                                var11_4 = var12_2.charAt(var10_5);
                                ** continue;
                            }
                            break block21;
                            break;
                        }
                        v1 = ++var10_5;
                        v2 = var12_2.substring(v1, v1 + var11_4).toCharArray();
                        v3 = v2.length;
                        var16_6 = 0;
                        v4 = 99;
                        v5 = v2;
                        v6 = v3;
                        if (v3 > 1) ** GOTO lbl67
                        do {
                            v7 = v4;
                            v5 = v5;
                            v8 = v5;
                            v9 = v4;
                            v10 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v11 = 98;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 10;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 17;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 6;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 67;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 22;
                                        break;
                                    }
                                    default: {
                                        v11 = 36;
                                    }
                                }
                                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                ++var16_6;
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
                        } while (v6 > var16_6);
                        ** while (true)
                    }
                    lp.a = var15;
                    lp.e = new String[2];
                    var2_7 = 5224903888486663760L;
                    var8_8 = new long[142];
                    var5_9 = 0;
                    var6_10 = "\u00ae=\u00ba^L?l\u00d2^\u00d1\u00af0\u00eei\u00f1m\u0010\u00f8\u0090m\u009b;1\u00fa\u0083\u0083\u00c7?\u00fe\u00f6\u0096\u00f7eU\u00a9Z\u00e9\u0016\u0013\u0005\u00f7\u0086\u000eA\u0097\u0093p.\u00a2\u00db\u00a3\u000f\u00c8p\u00df*\u00d6r\u008b`\n\u0097:\u00bfB\u00e5\u00c0JI\u00a5.\u00df%?~D\u00df8g\u0001\u00ady\u00da\u00aeo\u00cb\u00fd\u00e6\b\u00eb^\u0016\u0089\u00ee\b\u0015}\u00ba\u00c7\u00ed5\u008e\n\u00e72\u00c6\u0091\u00ea\u009c\u0004p\u00a52\u00b1\u00a7\u00d6B\u0084:\u00b3\u0015m\u00ed\u00f9\u00bd\u00dfu\u00d9\u00c5\u00d7!r\u0017L\u0090\u0089\u00d5HC\u00ae\u00c4\u0003\"IY\u0012\u00e8A1\u00a6\u00c9&\f\f[\u0088\u00bf\u00e5\u0084\u0001\u00e0\u00a8\u00c4\u00f0\u00b5$\u0087\u00e9\u0016K\u0087\u00a8\u00b7M2\u00aeChb\u008d\u00b4g\u000e\u00bdQ\u00d0\u0013#lY@f\u00fe\u00f6Qr\u00d3R\u00b03\u009e<\u00f0{(\u00a5\u0014\u0089\u0081\u00e5\u0094\u00c8\u00f2\u00c74'\u00a8]\u00ac\u00f2'ZmX\u0096\u00b3C\u00be\u0012\u00e7\u0097\u00f3\u00dbN-O\u00ad\u00a5\u00cfX\u0007\u00a3`\u00cd\u00c6G\u00dc6\u00e3\u00ac\u00eaO\u00f84j\u00b1*\u00e6\u00b1\u00aa\u0011\u0089\u00cc\u00dbe$WX\u00b52$(\u00f22\u0096\u0007\t{\u00b2\u00a0\u00a7\u0005c\u0006\u00ae\u00bc\u00ec\u0093\u0016[\u007fl\u00ff\u00be~\u0004\u00ca\u00ef\u0094\u00af\u0090o\u00b8m\u00b7\u00a0\u0012h\u00f5z{\u00b7\u00d7\u0081\u00a3#\u00b7g\u00c1\u00b4\u00bd\u00c6\r\u00ce-t\u00b2\u00c0\u0000\u009c-\u00f9\u0089\u00f5\u007f\r\u00d5b1\u000f\u001f\u009b\u00ee\u00b0\u0098\u00fe\u00a8\u0018\u0091*\u00e4\u00bcM7\u00df\u00f4D\u0011\u00f0\u009d\u0000\u00c2\u00b1>\u0083B+&u*\u00edn\u00ae\u00ab+\u001aJ\u0085\u0088\"\u00e4k\u001d\u00a7x\u00c8\u00d4\tG9A\u00ca\u00a1e\u00c5W\u00a5\u0017d\u0001q\u0015Q\u00d2\u0090\b=\u001fUTh\u00d3\u00b4nU(\u00a2\u00ef\f\f^\u0018\u00c8^n\u00e6\u00855y5[q\u00aa\u0081\u00ed\u00f6\u00aa\u0010f6\u00c1\u00bbt+\"WbdN\u0081\u008c\u00de\u0095r\u008f\b\u00b3\u00afi\u00fb\u00d5\u008fY\u00bc\u001d0\u00e9N\u0092\u00c4\u00d1\u0003\u00e5\u001f\u00ffAU\u00e80\u00a5?km\u00e0\u000b\u0018\u0010\u008f\u00b0\u00e8xd\u00ea\u0082\u00a9\u00e3-^h\u00eb\u00f3\u00aa%_\u00cdR\u0006]\u00187\u00f9-\u0015>\u00bda\u00a2\u0095\u00ef\u00a1\u00fd\t\u00f0\u00b2\u00dc\u0012\u0098\u0002WHp\u00cb.\u0081\\|\u00aa!\u00d5\u00f3N\u0080\u00cb\u00e1i\"\u00d7\u00c1_\u00b7ah\u00b3\u0002\u00cd\u0001(B\u00e2$\u0014\u001e\u00cd\u00f7\u00d5\u00cb\u00a8u\u00f5C!]\u0010\u00b0\u00d1\u00beng\u00e2HW\u00be\u00e03:RC/M\u00e5\u001a\u00e2B\u00af^\u008e\u0093\u00b0\u00cc<\u0001\u0094O\u00a1\u0014.^\u001f\u001b\u00b0\u00cb\u00e1\u00b1a\u00eb\u0001\u0094v\u00b8\u0082\nOh\u00af=,\u001e\u00e0\u009f\u00bf\u0081oV\u0010e3\u00a5\u00c3\u00e0\u0000pX\u00aa\\\u009d\u00f9*U\u00b3\u00c9N\u00cb\u00e8\u00fc\u00f6\u008d\rC\u00aeg~\u00a0_n,\u00f2\u00d3\u00ea\u00c6e\u00d7\u00fa\u00ba\u0005D\u00d7=\u00d9\u0084\u001c\u00bdO\u00cfr\u00cbrW\u0086\u00a8\u001b\u008d\u0084\u0018\u00f1\u00f8\"\u00a2\u00b33\u00a9*m\u00ef$\u00a6\r\u00ady\r\u00d3\u00d2\u00d0\u00ea\u00d2v7\u00e1\u00db-=\u0083,5X\"\u0012\u008a\u00b0\u0088\u00e0\u00ec?\u00e8g\u001d\u00c2\u0003\u0091L\u0085\u0019O\u00ed\u00a9k\f\u00ebv<\u00ba\u001c\u00d0\u00e9}\u00f8B\u0013p\u00eeu\r\u0003\u00ab\u0082\u00e8(*Y\u000b\u0093\u00f4~\u0084\u00d4\u00ddF\u008f\u00b2\u001e*O\u009e\u00f0\u0016\u00ae\u00b8\u00b93\u0080GF\u009e\u00e3\u00fb\u00ceF\u00d0b\u00893\u00b2\u00e0\u00c1R\u00b9\u00d0K:\"\\\u00de\u008f\f-`\u00ab[w\u00af\u00e7\u00b3\u00a6\u000b\u000b\u00d5\u00c2\u00b5(\u00d0\u00b2+L\u0095B6\u00f0\u000b\u00f3\u008a~\u00b0u\u00f0%\u00f6\u00f0\u00c8UET)$\u00cdR3Y \u008c\u009bb9\u00b6\u00b8|\\D\u0090\u00cck~\u00d4n\u00b3\u00bb\u0004\t\u00f5\u00cd,nAL\u00d6\u00c0>J\u00fa\u00c5\u00fa\u00c80\u0095RC\u009f\u00b9'3\u00fb\u00a7)\u00e9\u00da\u0096\u008aT\u0085z3\u0006\ti\u00b9\u00b8\u00c6\u00d7\u0087\u00cf\u00f0\u0080\u00999+>\u0097\u00ae\u000b\u0000\u0006\u00c0\u001c\u00f1\u00bc22\u00d0\u00992H~*\u009d\u00fb\u00db\u0083M\u0093\u00f4D\t\u00a1O6\u00c4\u00ca\u00a7\u001c\u009cO\u00ea\u009d\u00c4#\b,D<\u00b1\u00cd\u00ed}0\u00eb5dB\u0097\u00de,\u0002\u00e0\u00d5\u00fca$\u00d0\"\u0004?2be\u00dd\u0089\u00f5e7\u0097$\u00a2#@\u00ba\u0012\u00b7<\u00af\u00c6\u001c\u0006^\u00f7\u00beh\u00db\u00ee\u0099\u00c2$\u00b4]+\u00f0\u00a9\u00c3M]\n\u00da\u0098\u0099x2\u0097\u0007\u0089\u00e6&\u00925(E[\u00b85\u009b\u000bwd\u00fb+\u00eb\u009dZt\t\u00dd$q\u001d\u00f4^\u00cf\u00c2\u00b8\u0007n\u00b2\u00f9\u008e\u0002aLE\u00ea\u00fbK\u0082zz\u00ce%<\u00c7\u0019\u00d1/bm\u00c1\u00b9_\u00a0,\u0018\u001c9\u0092:\u00e2M\u00008\u00b0\u000b|u\u00f2\u00d0,\u009eO\u00da4\u00f7\u00d6\u0098PQ\u00cd";
                    var7_11 = "\u00ae=\u00ba^L?l\u00d2^\u00d1\u00af0\u00eei\u00f1m\u0010\u00f8\u0090m\u009b;1\u00fa\u0083\u0083\u00c7?\u00fe\u00f6\u0096\u00f7eU\u00a9Z\u00e9\u0016\u0013\u0005\u00f7\u0086\u000eA\u0097\u0093p.\u00a2\u00db\u00a3\u000f\u00c8p\u00df*\u00d6r\u008b`\n\u0097:\u00bfB\u00e5\u00c0JI\u00a5.\u00df%?~D\u00df8g\u0001\u00ady\u00da\u00aeo\u00cb\u00fd\u00e6\b\u00eb^\u0016\u0089\u00ee\b\u0015}\u00ba\u00c7\u00ed5\u008e\n\u00e72\u00c6\u0091\u00ea\u009c\u0004p\u00a52\u00b1\u00a7\u00d6B\u0084:\u00b3\u0015m\u00ed\u00f9\u00bd\u00dfu\u00d9\u00c5\u00d7!r\u0017L\u0090\u0089\u00d5HC\u00ae\u00c4\u0003\"IY\u0012\u00e8A1\u00a6\u00c9&\f\f[\u0088\u00bf\u00e5\u0084\u0001\u00e0\u00a8\u00c4\u00f0\u00b5$\u0087\u00e9\u0016K\u0087\u00a8\u00b7M2\u00aeChb\u008d\u00b4g\u000e\u00bdQ\u00d0\u0013#lY@f\u00fe\u00f6Qr\u00d3R\u00b03\u009e<\u00f0{(\u00a5\u0014\u0089\u0081\u00e5\u0094\u00c8\u00f2\u00c74'\u00a8]\u00ac\u00f2'ZmX\u0096\u00b3C\u00be\u0012\u00e7\u0097\u00f3\u00dbN-O\u00ad\u00a5\u00cfX\u0007\u00a3`\u00cd\u00c6G\u00dc6\u00e3\u00ac\u00eaO\u00f84j\u00b1*\u00e6\u00b1\u00aa\u0011\u0089\u00cc\u00dbe$WX\u00b52$(\u00f22\u0096\u0007\t{\u00b2\u00a0\u00a7\u0005c\u0006\u00ae\u00bc\u00ec\u0093\u0016[\u007fl\u00ff\u00be~\u0004\u00ca\u00ef\u0094\u00af\u0090o\u00b8m\u00b7\u00a0\u0012h\u00f5z{\u00b7\u00d7\u0081\u00a3#\u00b7g\u00c1\u00b4\u00bd\u00c6\r\u00ce-t\u00b2\u00c0\u0000\u009c-\u00f9\u0089\u00f5\u007f\r\u00d5b1\u000f\u001f\u009b\u00ee\u00b0\u0098\u00fe\u00a8\u0018\u0091*\u00e4\u00bcM7\u00df\u00f4D\u0011\u00f0\u009d\u0000\u00c2\u00b1>\u0083B+&u*\u00edn\u00ae\u00ab+\u001aJ\u0085\u0088\"\u00e4k\u001d\u00a7x\u00c8\u00d4\tG9A\u00ca\u00a1e\u00c5W\u00a5\u0017d\u0001q\u0015Q\u00d2\u0090\b=\u001fUTh\u00d3\u00b4nU(\u00a2\u00ef\f\f^\u0018\u00c8^n\u00e6\u00855y5[q\u00aa\u0081\u00ed\u00f6\u00aa\u0010f6\u00c1\u00bbt+\"WbdN\u0081\u008c\u00de\u0095r\u008f\b\u00b3\u00afi\u00fb\u00d5\u008fY\u00bc\u001d0\u00e9N\u0092\u00c4\u00d1\u0003\u00e5\u001f\u00ffAU\u00e80\u00a5?km\u00e0\u000b\u0018\u0010\u008f\u00b0\u00e8xd\u00ea\u0082\u00a9\u00e3-^h\u00eb\u00f3\u00aa%_\u00cdR\u0006]\u00187\u00f9-\u0015>\u00bda\u00a2\u0095\u00ef\u00a1\u00fd\t\u00f0\u00b2\u00dc\u0012\u0098\u0002WHp\u00cb.\u0081\\|\u00aa!\u00d5\u00f3N\u0080\u00cb\u00e1i\"\u00d7\u00c1_\u00b7ah\u00b3\u0002\u00cd\u0001(B\u00e2$\u0014\u001e\u00cd\u00f7\u00d5\u00cb\u00a8u\u00f5C!]\u0010\u00b0\u00d1\u00beng\u00e2HW\u00be\u00e03:RC/M\u00e5\u001a\u00e2B\u00af^\u008e\u0093\u00b0\u00cc<\u0001\u0094O\u00a1\u0014.^\u001f\u001b\u00b0\u00cb\u00e1\u00b1a\u00eb\u0001\u0094v\u00b8\u0082\nOh\u00af=,\u001e\u00e0\u009f\u00bf\u0081oV\u0010e3\u00a5\u00c3\u00e0\u0000pX\u00aa\\\u009d\u00f9*U\u00b3\u00c9N\u00cb\u00e8\u00fc\u00f6\u008d\rC\u00aeg~\u00a0_n,\u00f2\u00d3\u00ea\u00c6e\u00d7\u00fa\u00ba\u0005D\u00d7=\u00d9\u0084\u001c\u00bdO\u00cfr\u00cbrW\u0086\u00a8\u001b\u008d\u0084\u0018\u00f1\u00f8\"\u00a2\u00b33\u00a9*m\u00ef$\u00a6\r\u00ady\r\u00d3\u00d2\u00d0\u00ea\u00d2v7\u00e1\u00db-=\u0083,5X\"\u0012\u008a\u00b0\u0088\u00e0\u00ec?\u00e8g\u001d\u00c2\u0003\u0091L\u0085\u0019O\u00ed\u00a9k\f\u00ebv<\u00ba\u001c\u00d0\u00e9}\u00f8B\u0013p\u00eeu\r\u0003\u00ab\u0082\u00e8(*Y\u000b\u0093\u00f4~\u0084\u00d4\u00ddF\u008f\u00b2\u001e*O\u009e\u00f0\u0016\u00ae\u00b8\u00b93\u0080GF\u009e\u00e3\u00fb\u00ceF\u00d0b\u00893\u00b2\u00e0\u00c1R\u00b9\u00d0K:\"\\\u00de\u008f\f-`\u00ab[w\u00af\u00e7\u00b3\u00a6\u000b\u000b\u00d5\u00c2\u00b5(\u00d0\u00b2+L\u0095B6\u00f0\u000b\u00f3\u008a~\u00b0u\u00f0%\u00f6\u00f0\u00c8UET)$\u00cdR3Y \u008c\u009bb9\u00b6\u00b8|\\D\u0090\u00cck~\u00d4n\u00b3\u00bb\u0004\t\u00f5\u00cd,nAL\u00d6\u00c0>J\u00fa\u00c5\u00fa\u00c80\u0095RC\u009f\u00b9'3\u00fb\u00a7)\u00e9\u00da\u0096\u008aT\u0085z3\u0006\ti\u00b9\u00b8\u00c6\u00d7\u0087\u00cf\u00f0\u0080\u00999+>\u0097\u00ae\u000b\u0000\u0006\u00c0\u001c\u00f1\u00bc22\u00d0\u00992H~*\u009d\u00fb\u00db\u0083M\u0093\u00f4D\t\u00a1O6\u00c4\u00ca\u00a7\u001c\u009cO\u00ea\u009d\u00c4#\b,D<\u00b1\u00cd\u00ed}0\u00eb5dB\u0097\u00de,\u0002\u00e0\u00d5\u00fca$\u00d0\"\u0004?2be\u00dd\u0089\u00f5e7\u0097$\u00a2#@\u00ba\u0012\u00b7<\u00af\u00c6\u001c\u0006^\u00f7\u00beh\u00db\u00ee\u0099\u00c2$\u00b4]+\u00f0\u00a9\u00c3M]\n\u00da\u0098\u0099x2\u0097\u0007\u0089\u00e6&\u00925(E[\u00b85\u009b\u000bwd\u00fb+\u00eb\u009dZt\t\u00dd$q\u001d\u00f4^\u00cf\u00c2\u00b8\u0007n\u00b2\u00f9\u008e\u0002aLE\u00ea\u00fbK\u0082zz\u00ce%<\u00c7\u0019\u00d1/bm\u00c1\u00b9_\u00a0,\u0018\u001c9\u0092:\u00e2M\u00008\u00b0\u000b|u\u00f2\u00d0,\u009eO\u00da4\u00f7\u00d6\u0098PQ\u00cd".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v12 = var8_8;
                        v13 = var5_9++;
                        v14 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v15 = -1;
                        break block22;
                        break;
                    }
lbl90:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "\u00b3\u00ae\u00f7\u0092\u0082\u00126\u0097\u009c\u0082Q\u000f\u00c5\u0086\u00ad\u00e2";
                        var7_11 = "\u00b3\u00ae\u00f7\u0092\u0082\u00126\u0097\u009c\u0082Q\u000f\u00c5\u0086\u00ad\u00e2".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v12 = var8_8;
                            v13 = var5_9++;
                            v14 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v15 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl103:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var4_12 < var7_11) ** continue;
                        break block23;
                        break;
                    }
                }
                v16 = v14 ^ var2_7;
                switch (v15) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl114:
                    // 1 sources

                    ** continue;
                }
            }
            lp.f = var8_8;
            lp.g = new Integer[142];
            break block24;
lbl119:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 8403701036254424792L;
        ** while (true)
        lp.h = 8403701036254423656L ^ var0_14;
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFF7B7) & 0xFFFF;
        if (e[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 216;
                case 1 -> 230;
                case 2 -> 25;
                case 3 -> 132;
                case 4 -> 96;
                case 5 -> 140;
                case 6 -> 228;
                case 7 -> 101;
                case 8 -> 41;
                case 9 -> 227;
                case 10 -> 77;
                case 11 -> 210;
                case 12 -> 97;
                case 13 -> 220;
                case 14 -> 61;
                case 15 -> 250;
                case 16 -> 142;
                case 17 -> 12;
                case 18 -> 144;
                case 19 -> 40;
                case 20 -> 157;
                case 21 -> 129;
                case 22 -> 174;
                case 23 -> 47;
                case 24 -> 184;
                case 25 -> 116;
                case 26 -> 15;
                case 27 -> 170;
                case 28 -> 64;
                case 29 -> 60;
                case 30 -> 127;
                case 31 -> 4;
                case 32 -> 164;
                case 33 -> 162;
                case 34 -> 2;
                case 35 -> 123;
                case 36 -> 120;
                case 37 -> 242;
                case 38 -> 231;
                case 39 -> 254;
                case 40 -> 49;
                case 41 -> 146;
                case 42 -> 155;
                case 43 -> 45;
                case 44 -> 100;
                case 45 -> 194;
                case 46 -> 31;
                case 47 -> 152;
                case 48 -> 7;
                case 49 -> 148;
                case 50 -> 237;
                case 51 -> 20;
                case 52 -> 248;
                case 53 -> 222;
                case 54 -> 18;
                case 55 -> 122;
                case 56 -> 137;
                case 57 -> 246;
                case 58 -> 33;
                case 59 -> 160;
                case 60 -> 72;
                case 61 -> 0;
                case 62 -> 197;
                case 63 -> 180;
                case 64 -> 76;
                case 65 -> 103;
                case 66 -> 159;
                case 67 -> 131;
                case 68 -> 202;
                case 69 -> 133;
                case 70 -> 94;
                case 71 -> 124;
                case 72 -> 16;
                case 73 -> 183;
                case 74 -> 249;
                case 75 -> 88;
                case 76 -> 44;
                case 77 -> 9;
                case 78 -> 223;
                case 79 -> 58;
                case 80 -> 32;
                case 81 -> 119;
                case 82 -> 203;
                case 83 -> 239;
                case 84 -> 196;
                case 85 -> 161;
                case 86 -> 236;
                case 87 -> 43;
                case 88 -> 73;
                case 89 -> 200;
                case 90 -> 139;
                case 91 -> 19;
                case 92 -> 208;
                case 93 -> 30;
                case 94 -> 147;
                case 95 -> 192;
                case 96 -> 229;
                case 97 -> 24;
                case 98 -> 225;
                case 99 -> 179;
                case 100 -> 173;
                case 101 -> 66;
                case 102 -> 84;
                case 103 -> 255;
                case 104 -> 253;
                case 105 -> 5;
                case 106 -> 195;
                case 107 -> 21;
                case 108 -> 178;
                case 109 -> 35;
                case 110 -> 85;
                case 111 -> 87;
                case 112 -> 241;
                case 113 -> 252;
                case 114 -> 171;
                case 115 -> 93;
                case 116 -> 98;
                case 117 -> 50;
                case 118 -> 67;
                case 119 -> 188;
                case 120 -> 86;
                case 121 -> 14;
                case 122 -> 114;
                case 123 -> 135;
                case 124 -> 8;
                case 125 -> 219;
                case 126 -> 187;
                case 127 -> 186;
                case 128 -> 209;
                case 129 -> 141;
                case 130 -> 193;
                case 131 -> 167;
                case 132 -> 23;
                case 133 -> 234;
                case 134 -> 217;
                case 135 -> 80;
                case 136 -> 165;
                case 137 -> 215;
                case 138 -> 82;
                case 139 -> 244;
                case 140 -> 182;
                case 141 -> 108;
                case 142 -> 68;
                case 143 -> 89;
                case 144 -> 56;
                case 145 -> 51;
                case 146 -> 59;
                case 147 -> 226;
                case 148 -> 54;
                case 149 -> 172;
                case 150 -> 28;
                case 151 -> 83;
                case 152 -> 125;
                case 153 -> 126;
                case 154 -> 156;
                case 155 -> 128;
                case 156 -> 153;
                case 157 -> 36;
                case 158 -> 1;
                case 159 -> 75;
                case 160 -> 6;
                case 161 -> 240;
                case 162 -> 138;
                case 163 -> 145;
                case 164 -> 109;
                case 165 -> 34;
                case 166 -> 104;
                case 167 -> 191;
                case 168 -> 62;
                case 169 -> 181;
                case 170 -> 39;
                case 171 -> 201;
                case 172 -> 245;
                case 173 -> 74;
                case 174 -> 70;
                case 175 -> 235;
                case 176 -> 92;
                case 177 -> 214;
                case 178 -> 205;
                case 179 -> 211;
                case 180 -> 233;
                case 181 -> 91;
                case 182 -> 63;
                case 183 -> 53;
                case 184 -> 176;
                case 185 -> 69;
                case 186 -> 79;
                case 187 -> 206;
                case 188 -> 136;
                case 189 -> 95;
                case 190 -> 99;
                case 191 -> 117;
                case 192 -> 168;
                case 193 -> 154;
                case 194 -> 189;
                case 195 -> 185;
                case 196 -> 65;
                case 197 -> 106;
                case 198 -> 10;
                case 199 -> 190;
                case 200 -> 13;
                case 201 -> 38;
                case 202 -> 143;
                case 203 -> 48;
                case 204 -> 29;
                case 205 -> 238;
                case 206 -> 22;
                case 207 -> 247;
                case 208 -> 11;
                case 209 -> 221;
                case 210 -> 121;
                case 211 -> 118;
                case 212 -> 130;
                case 213 -> 149;
                case 214 -> 57;
                case 215 -> 166;
                case 216 -> 46;
                case 217 -> 207;
                case 218 -> 251;
                case 219 -> 111;
                case 220 -> 52;
                case 221 -> 163;
                case 222 -> 26;
                case 223 -> 112;
                case 224 -> 3;
                case 225 -> 55;
                case 226 -> 175;
                case 227 -> 27;
                case 228 -> 213;
                case 229 -> 150;
                case 230 -> 90;
                case 231 -> 169;
                case 232 -> 110;
                case 233 -> 232;
                case 234 -> 42;
                case 235 -> 17;
                case 236 -> 37;
                case 237 -> 113;
                case 238 -> 102;
                case 239 -> 78;
                case 240 -> 71;
                case 241 -> 198;
                case 242 -> 81;
                case 243 -> 204;
                case 244 -> 243;
                case 245 -> 151;
                case 246 -> 218;
                case 247 -> 105;
                case 248 -> 212;
                case 249 -> 134;
                case 250 -> 158;
                case 251 -> 115;
                case 252 -> 107;
                case 253 -> 199;
                case 254 -> 177;
                default -> 224;
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
            lp.e[n3] = new String(cArray).intern();
        }
        return e[n3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x472C;
        if (g[n2] == null) {
            lp.g[n2] = (int)(f[n2] ^ l);
        }
        return g[n2];
    }
}
