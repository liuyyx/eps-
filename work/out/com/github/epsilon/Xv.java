/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.nV;
import com.github.epsilon.uT;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.function.Function;

public final class Xv
extends Enum<Xv> {
    private final uT b;
    private static final Xv[] B;
    private final Comparator<nV<?>> I;
    public static final /* enum */ Xv ADDED;
    public static final /* enum */ Xv NAME;
    public static final /* enum */ Xv TYPE;

    private static String lambda$static$0(nV nV2) {
        return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)nV2, (Object)new Object[0], (long)939274775332328186L), (long)803620760186977190L);
    }

    private Xv(uT uT2, Comparator<nV<?>> comparator) {
        this.b = uT2;
        this.I = comparator;
    }

    public static Xv valueOf(String string) {
        return (Xv)((Object)hi.a("G", Xv.class, (Object)string, (long)703426484721789552L));
    }

    private static String lambda$static$1(nV nV2) {
        return hi.a("\u00a5", (Object)Xv.a("z1f8Tyqaz1v6KRrx", l(), (nV)nV2), (long)1087813703548000919L);
    }

    public String i(Object[] objectArray) {
        return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)1307101544300678973L), (long)1335171215242130397L);
    }

    public static /* bridge */ /* synthetic */ CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public Comparator v(Object[] objectArray) {
        return hi.a("\u00e9", (Object)((Object)this), (long)715852974803428435L);
    }

    private static String lambda$static$2(nV nV2) {
        return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)nV2, (Object)new Object[0], (long)939274775332328186L), (long)803620760186977190L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "5\u0011|;/\u0004 \fh;\u0004:\u0014u;";
            var5_3 = "5\u0011|;/\u0004 \fh;\u0004:\u0014u;".length();
            var2_4 = 5;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 19;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 103;
                            break;
                        }
                        case 1: {
                            v11 = 70;
                            break;
                        }
                        case 2: {
                            v11 = 43;
                            break;
                        }
                        case 3: {
                            v11 = 109;
                            break;
                        }
                        case 4: {
                            v11 = 120;
                            break;
                        }
                        case 5: {
                            v11 = 75;
                            break;
                        }
                        default: {
                            v11 = 60;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
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
            } while (v6 > var6_6);
            ** while (true)
        }
        Xv.ADDED = new Xv((Object)var0[0], 0, (Object)hi.a("j", (long)1011262624126738305L), null);
        Xv.NAME = new Xv((Object)var0[2], 1, (Object)hi.a("j", (long)650051663254394632L), (Object)hi.a("G", (Function<nV, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(com.github.epsilon.nV ), (Lcom/github/epsilon/nV;)Ljava/lang/String;)(), (long)768539126730402143L));
        Xv.TYPE = new Xv((Object)var0[1], 2, (Object)hi.a("j", (long)1191715274700850196L), (Object)hi.a("\u00a5", (Object)hi.a("G", (Function<nV, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$1(com.github.epsilon.nV ), (Lcom/github/epsilon/nV;)Ljava/lang/String;)(), (long)768539126730402143L), (Function<nV, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$2(com.github.epsilon.nV ), (Lcom/github/epsilon/nV;)Ljava/lang/String;)(), (long)662680385181633489L));
        Xv.B = hi.a("G", (Object)new Object[0], (long)874475629553076245L);
    }

    public Xv E(Object[] objectArray) {
        CallSite callSite = hi.a("G", (long)458460050821989667L);
        return callSite[(Xv.a("z1f8Tyqaz1v6KRrx", ordinal(), (Xv)this) + true) % ((CallSite)callSite).length];
    }

    private static Xv[] I(Object[] objectArray) {
        return new Xv[]{hi.a("j", (long)1237977121765634387L), hi.a("j", (long)383003100450206893L), hi.a("j", (long)420899556953935316L)};
    }

    public static Xv[] values() {
        return (Xv[])Xv.a("z1f8Tyqaz1v6KRrx", clone(), (Xv[])hi.a("j", (long)928773503563063704L));
    }
}
