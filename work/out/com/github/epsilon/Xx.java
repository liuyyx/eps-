/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

final class Xx
extends Enum<Xx> {
    public static final /* enum */ Xx Target;
    public static final /* enum */ Xx Damage;
    private static final Xx[] o;
    public static final /* enum */ Xx CalculationTime;
    public static final /* enum */ Xx Off;
    public static final /* enum */ Xx Speed;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "RTww\u00133\u0005EE\u007fs\u0010\u000fUTvu\u0001:sb\\ux ?\u007fs";
                var5_3 = "RTww\u00133\u0005EE\u007fs\u0010\u000fUTvu\u0001:sb\\ux ?\u007fs".length();
                var2_4 = 6;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 3;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "\u0014\u001e1\u0006\u000f\u0019%<\\o";
                    var5_3 = "\u0014\u001e1\u0006\u000f\u0019%<\\o".length();
                    var2_4 = 3;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 78;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 21;
                            break;
                        }
                        case 1: {
                            v15 = 54;
                            break;
                        }
                        case 2: {
                            v15 = 25;
                            break;
                        }
                        case 3: {
                            v15 = 21;
                            break;
                        }
                        case 4: {
                            v15 = 119;
                            break;
                        }
                        case 5: {
                            v15 = 85;
                            break;
                        }
                        default: {
                            v15 = 17;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        Xx.Off = new Xx();
        Xx.Speed = new Xx();
        Xx.Target = new Xx();
        Xx.Damage = new Xx();
        Xx.CalculationTime = new Xx();
        Xx.o = hi.a("G", (Object)new Object[0], (long)1118695957140852021L);
    }

    public static /* bridge */ /* synthetic */ CallSite m(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static Xx[] values() {
        return (Xx[])Xx.m("Pu97sTmXFIFKoIaW", clone(), (Xx[])hi.a("j", (long)793858542686516373L));
    }

    public static Xx valueOf(String string) {
        return (Xx)((Object)hi.a("G", Xx.class, (Object)string, (long)703426484721789552L));
    }

    private static Xx[] h(Object[] objectArray) {
        return new Xx[]{hi.a("j", (long)522799812716108693L), hi.a("j", (long)379008821617390977L), hi.a("j", (long)806480907328299450L), hi.a("j", (long)1074708503603750672L), hi.a("j", (long)1309612783049448967L)};
    }
}
