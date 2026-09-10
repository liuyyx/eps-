/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.sounds.SimpleSoundInstance
 *  net.minecraft.client.resources.sounds.SoundInstance
 *  net.minecraft.client.resources.sounds.SoundInstance$Attenuation
 *  net.minecraft.client.sounds.SoundManager
 *  net.minecraft.resources.Identifier
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.RandomSource
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.iE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;

public class lS {
    private static final long M;
    public static final lS q;
    private long L;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    public void C(Object[] objectArray) {
        iE iE2 = (iE)((Object)objectArray[0]);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = Float.valueOf(1.2f);
        objectArray2[0] = iE2;
        hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)1115051230263459086L);
    }

    public static /* bridge */ /* synthetic */ CallSite I(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void B(Object[] var1_1) {
        block14: {
            block12: {
                block13: {
                    var2_2 = (iE)var1_1[0];
                    var3_3 = ((Float)var1_1[1]).floatValue();
                    var4_4 = ((Float)var1_1[2]).floatValue();
                    var5_5 = Dl.t();
                    var8_6 /* !! */  = (lS.a(18322, 3386264059616145230L) ^ lS.a(27294, 4074523197610164856L) ^ lS.a(11412, 2436041253705499719L)) - lS.a(28546, 7309399018765780812L) ^ lS.a(25515, 6528600514642873199L);
                    if (var5_5) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var6_7 = hi.a("G", (long)658960450018995719L);
                            cfr_temp_0 = var6_7 - hi.a("\u00e9", (Object)this, (long)1220981820353672715L) - lS.b(18232, 7340048471552612190L);
                            v0 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var5_5) break block12;
                            if (v0 /* !! */  >= 0) break block13;
                            break block14;
                            break;
                        }
lbl15:
                        // 1 sources

                        return;
lbl17:
                        // 1 sources

                        while (true) {
                            hi.a("\u00f2", (Object)this, (long)var6_7, (long)1220981820353672715L);
                            v1 = new Object[3];
                            v1[2] = Float.valueOf(var4_4);
                            v1[1] = Float.valueOf(var3_3);
                            v1[0] = var2_2;
                            hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)644557729212998413L), (Object)hi.a("\u00a5", (Object)this, (Object)v1, (long)811664105561787781L), (long)541013928964636783L);
                            return;
                        }
                    }
                    switch (var8_6 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 1604218487: {
                            return;
                        }
                    }
lbl31:
                    // 2 sources

                    while (true) {
                        switch (var8_6 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -906056199: {
                                ** continue;
                            }
                            case -906056198: {
                                return;
                            }
                        }
                        break;
                    }
                }
                v0 /* !! */  = (reference)((hi.a("G", (int)lS.a(24002, 8294120666555790611L), (int)lS.a(9642, 3632934900645547355L), (long)834203424483934088L) ^ lS.a(10109, 1071974966048378776L)) - lS.a(27067, 9110249952894157136L));
            }
            var8_6 /* !! */  = (int)v0 /* !! */ ;
            if (!var5_5) ** GOTO lbl31
        }
        var8_6 /* !! */  = lS.a(990, 4393927867209968405L) / lS.a(25713, 207777494946778273L) + lS.a(6568, 8172532848078352706L);
        ** while (true)
    }

    public void c(Object[] objectArray) {
        iE iE2 = (iE)((Object)objectArray[0]);
        float f = ((Float)objectArray[1]).floatValue();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = Float.valueOf(1.0f);
        objectArray2[0] = iE2;
        hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)800426962516813352L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public Optional<SoundInstance> K(iE var1_1, float var2_2) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        var3_3 = Dl.S();
                        var6_4 /* !! */  = (lS.a(3647, 195282835376465606L) - lS.a(9462, 8169586139233733636L) + lS.a(26741, 5934228904917794953L)) / lS.a(14340, 4461614860148822221L) * lS.a(30406, 2685353315887160885L) + lS.a(18915, 1064486426549920027L);
                        if (!var3_3) ** GOTO lbl-1000
                        switch (var6_4 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                v0 = new Object[3];
                                v0[2] = Float.valueOf(var2_2);
                                v0[1] = Float.valueOf(1.0f);
                                v0[0] = var1_1;
                                var4_5 = hi.a("\u00a5", (Object)this, (Object)v0, (long)811664105561787781L);
                                var5_6 = lS.I("FiYFpvRE34voA3AI", play(net.minecraft.client.resources.sounds.SoundInstance ), (SoundManager)lS.I("FiYFpvRE34voA3AI", getSoundManager(), (Minecraft)hi.a("j", (long)1080602109828736465L)), (SoundInstance)var4_5);
                                if (!var3_3) break block15;
                                if (var5_6 != hi.a("j", (long)981884974242300186L)) break;
                                break block16;
                            }
                            case -86257139: {
                                throw null;
                            }
                        }
                        var6_4 /* !! */  = lS.a(25906, 6616841659124157950L) * lS.a(1613, 8407900115860844197L) + lS.a(32479, 1237173628734969377L) + lS.a(18827, 3482854948030062946L);
                    }
                    if (var3_3) break block17;
                }
                var6_4 /* !! */  = (int)(hi.a("G", (int)lS.a(2058, 2620530423198376190L), (int)lS.a(7793, 3929226318208235164L), (long)834203424483934088L) + lS.a(21179, 4001889810018581093L));
            }
            v1 /* !! */  = var6_4 /* !! */ ;
            if (var3_3 == false) return null;
            switch (v1 /* !! */ ) {
                default: {
                    v2 = lS.I("FiYFpvRE34voA3AI", empty());
                    var6_4 /* !! */  = lS.a(31479, 5346748974538920492L) + lS.a(23354, 2281765464494027760L) + lS.a(31171, 2696151759167295779L);
                    if (!var3_3) {
                        break;
                    }
                    break block18;
                }
                case -1934609033: {
                    v2 = hi.a("G", (Object)var4_5, (long)978807976925528211L);
                    if (var3_3) break;
                    return v2;
                }
                case -1934609034: {
                    v1 /* !! */  = (int)hi.a("G", (long)938841799815187197L);
                    return null;
                }
            }
            var6_4 /* !! */  = lS.a(22269, 4395012075957501477L) + lS.a(8275, 6158927748727654568L) + lS.a(19565, 1640263060638672052L);
        }
        switch (var6_4 /* !! */ ) {
            default: {
                return v2;
            }
            case -1559660954: 
        }
        return null;
    }

    private lS() {
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void i(Object[] var1_1) {
        block15: {
            block16: {
                var2_2 = Dl.S();
                var7_3 = lS.a(27632, 2418672345168479031L) * lS.a(9461, 7616931977942420488L) ^ lS.a(5765, 2972623532081512023L) ^ lS.a(16009, 8720056530642949718L);
                if (var2_2) break block16;
lbl5:
                // 2 sources

                while (true) {
                    block17: {
                        var3_4 = hi.a("G", (long)1026165039297148217L);
                        var4_5 = ((CallSite)var3_4).length;
                        var5_6 = 0;
                        if (!var2_2) break block17;
                        var7_3 = (lS.a(862, 13550461957172118L) ^ lS.a(29514, 6054374576220904383L)) * lS.a(22275, 3525493331158187993L) * lS.a(15157, 332581930798109688L) - lS.a(17072, 7942360910631479890L) ^ lS.a(12808, 1309579975880923870L);
                        if (var2_2) break block15;
                        ** GOTO lbl19
                    }
lbl14:
                    // 2 sources

                    while (true) {
                        block19: {
                            block18: {
                                v0 = var5_6;
                                v1 = var4_5;
                                if (!var2_2) break block18;
                                if (v0 < v1) break block19;
lbl19:
                                // 2 sources

                                v0 = lS.a(21841, 6890738832089824678L) * lS.a(2956, 5399219720195466073L);
                                v1 = lS.a(6559, 1249736013592654152L);
                            }
                            var7_3 = v0 - v1;
                            if (var2_2) break block15;
                        }
                        var7_3 = hi.a("G", (int)lS.a(30168, 7830052046833130811L), (int)lS.a(10398, 1806491857435279448L), (long)834203424483934088L) + lS.a(31352, 2711007490532381367L) - lS.a(12665, 3265593288412060061L) ^ lS.a(14383, 5602206771586650318L);
                        break block15;
                        break;
                    }
                    break;
                }
            }
            while (true) {
                switch (var7_3) {
                    default: {
                        ** continue;
                    }
                    case -1707125620: 
                }
                hi.a("G", (long)1309558455265531753L);
                var7_3 = (lS.a(15327, 4492756874891088672L) - lS.a(11289, 4538717093623645438L) ^ lS.a(14409, 1427297947288948884L)) + lS.a(3852, 2644175431018932195L);
            }
        }
        block11: while (true) {
            switch (var7_3) {
                default: {
                    ** continue;
                }
                case 352481373: {
                    var6_7 = var3_4[var5_6];
                    lS.I("FiYFpvRE34voA3AI", stop(net.minecraft.resources.Identifier net.minecraft.sounds.SoundSource ), (SoundManager)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)644557729212998413L), (Identifier)hi.a("\u00a5", (Object)var6_7, (long)1016589162668210983L), null);
                    ++var5_6;
                    if (!var2_2) {
                        return;
                    }
                    ** GOTO lbl53
                }
                case 352481374: {
                    throw null;
                }
lbl53:
                // 1 sources

                var7_3 = (lS.a(31726, 6477916770679067412L) ^ lS.a(3331, 1765808506455418357L)) * lS.a(386, 6069200721612990806L) * lS.a(32074, 2861538367345825210L) - lS.a(2801, 4612039693166862877L) ^ lS.a(32207, 3226739296523130145L);
                continue block11;
                case 352481375: 
            }
            break;
        }
    }

    static {
        IlilIlIlil.registerNativesForClass((int)23, lS.class);
        Hidden0.special_clinit_23_70(lS.class);
    }

    private SimpleSoundInstance F(Object[] objectArray) {
        Object object = objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        return new SimpleSoundInstance((Identifier)lS.I("FiYFpvRE34voA3AI", g(), (iE)((iE)((Object)object))), (SoundSource)hi.a("j", (long)504260097017280558L), (float)hi.a("G", (float)f2, (float)0.0f, (float)1.0f, (long)390336973585993938L), (float)hi.a("G", (float)f, (float)0.5f, (float)2.0f, (long)390336973585993938L), (RandomSource)hi.a("G", (long)601975340235211190L), false, 0, (SoundInstance.Attenuation)hi.a("j", (long)835058587440591742L), 0.0, 0.0, 0.0, true);
    }

    public void r(Object[] objectArray) {
        iE iE2 = (iE)((Object)objectArray[0]);
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)644557729212998413L), (Object)lS.I("FiYFpvRE34voA3AI", g(), (iE)iE2), null, (long)1273893603874426755L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68FE;
        if (b[n2] == null) {
            lS.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    private static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x1066) & Short.MAX_VALUE;
        if (d[n2] == null) {
            lS.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }
}
