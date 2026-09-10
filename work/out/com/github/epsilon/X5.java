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

final class X5
extends Enum<X5> {
    public static final /* enum */ X5 Single;
    public static final /* enum */ X5 Double;
    private static final X5[] B;

    public static X5 valueOf(String string) {
        return (X5)((Object)hi.a("G", X5.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "Gd\u0011KmX\u0006Pb\nNmX";
            var5_3 = "Gd\u0011KmX\u0006Pb\nNmX".length();
            var2_4 = 6;
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
            v4 = 101;
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
                            v11 = 102;
                            break;
                        }
                        case 1: {
                            v11 = 110;
                            break;
                        }
                        case 2: {
                            v11 = 1;
                            break;
                        }
                        case 3: {
                            v11 = 76;
                            break;
                        }
                        case 4: {
                            v11 = 100;
                            break;
                        }
                        case 5: {
                            v11 = 88;
                            break;
                        }
                        default: {
                            v11 = 52;
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
        X5.Single = new X5((Object)var0[1], 0);
        X5.Double = new X5((Object)var0[0], 1);
        X5.B = hi.a("G", (Object)new Object[0], (long)1130314778573366906L);
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

    public static X5[] values() {
        return (X5[])X5.l("SUY5F23qdhJl22jS", clone(), (X5[])hi.a("j", (long)1135474287487219946L));
    }

    private static X5[] f(Object[] objectArray) {
        return new X5[]{hi.a("j", (long)835753610206271055L), hi.a("j", (long)725868765051857227L)};
    }
}
