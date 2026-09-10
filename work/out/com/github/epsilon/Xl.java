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

final class Xl
extends Enum<Xl> {
    public static final /* enum */ Xl Client;
    public static final /* enum */ Xl Silent;
    private static final Xl[] C;

    private static Xl[] N() {
        return new Xl[]{hi.a("j", (long)830730965770457862L), hi.a("j", (long)544420299941095700L)};
    }

    public static Xl[] values() {
        return (Xl[])((Enum)((Object)hi.a("j", (long)1017582357868935797L))).clone();
    }

    public static /* bridge */ /* synthetic */ CallSite n(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static Xl valueOf(String string) {
        return (Xl)((Object)Xl.n("8zVnjalcQdDPv67B", valueOf(java.lang.Class<T> java.lang.String ), Xl.class, (String)string));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "[b6k\u0014.\u0006Kg3k\u0014.";
            var5_3 = "[b6k\u0014.\u0006Kg3k\u0014.".length();
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
            v4 = 124;
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
                            v11 = 100;
                            break;
                        }
                        case 1: {
                            v11 = 114;
                            break;
                        }
                        case 2: {
                            v11 = 35;
                            break;
                        }
                        case 3: {
                            v11 = 114;
                            break;
                        }
                        case 4: {
                            v11 = 6;
                            break;
                        }
                        case 5: {
                            v11 = 38;
                            break;
                        }
                        default: {
                            v11 = 14;
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
        Xl.Client = new Xl((Object)var0[0], 0);
        Xl.Silent = new Xl((Object)var0[1], 1);
        Xl.C = Xl.n("8zVnjalcQdDPv67B", N());
    }
}
