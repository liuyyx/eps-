/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XR;
import com.github.epsilon.Xm;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

abstract sealed class Xo
extends Enum<Xo>
permits Xm, XR {
    public static final /* enum */ Xo Aggressive;
    private static final Xo[] j;
    public static final /* enum */ Xo Efficient;

    public static Xo valueOf(String string) {
        return (Xo)((Object)Xo.e("RveC9FFTiMJlOgz9", valueOf(java.lang.Class<T> java.lang.String ), Xo.class, (String)string));
    }

    public static /* bridge */ /* synthetic */ CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "G(\u0002a\u00037!o9\u0000\tC)\u0003z\u0005-7h;";
            var5_3 = "G(\u0002a\u00037!o9\u0000\tC)\u0003z\u0005-7h;".length();
            var2_4 = 10;
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
            v4 = 5;
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
                            v11 = 3;
                            break;
                        }
                        case 1: {
                            v11 = 74;
                            break;
                        }
                        case 2: {
                            v11 = 96;
                            break;
                        }
                        case 3: {
                            v11 = 22;
                            break;
                        }
                        case 4: {
                            v11 = 99;
                            break;
                        }
                        case 5: {
                            v11 = 65;
                            break;
                        }
                        default: {
                            v11 = 87;
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
        Xo.Efficient = new Xm();
        Xo.Aggressive = new XR();
        Xo.j = hi.a("G", (Object)new Object[0], (long)944058503644085773L);
    }

    public static Xo[] values() {
        return (Xo[])((Enum)((Object)hi.a("j", (long)730679954989746827L))).clone();
    }

    private static Xo[] p(Object[] objectArray) {
        return new Xo[]{hi.a("j", (long)1287091669522069522L), hi.a("j", (long)805220754789489605L)};
    }

    abstract float e(float var1, float var2);
}
