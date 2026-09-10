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

final class l3
extends Enum<l3> {
    private static final l3[] c;
    public static final /* enum */ l3 Black;
    public static final /* enum */ l3 Follow;

    private static l3[] R() {
        return new l3[]{hi.a("j", (long)598085941414656405L), hi.a("j", (long)668318514831450927L)};
    }

    public static l3 valueOf(String string) {
        return (l3)((Object)l3.z("lOwlFn7rzo2qgwbQ", valueOf(java.lang.Class<T> java.lang.String ), l3.class, (String)string));
    }

    public static l3[] values() {
        return (l3[])((Enum)((Object)hi.a("j", (long)470284358641560940L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "ESYd7S\u0005APTk3";
            var5_3 = "ESYd7S\u0005APTk3".length();
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
            v4 = 35;
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
                            v11 = 32;
                            break;
                        }
                        case 1: {
                            v11 = 31;
                            break;
                        }
                        case 2: {
                            v11 = 22;
                            break;
                        }
                        case 3: {
                            v11 = 43;
                            break;
                        }
                        case 4: {
                            v11 = 123;
                            break;
                        }
                        case 5: {
                            v11 = 7;
                            break;
                        }
                        default: {
                            v11 = 84;
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
        l3.Black = new l3((Object)var0[1], 0);
        l3.Follow = new l3((Object)var0[0], 1);
        l3.c = l3.z("lOwlFn7rzo2qgwbQ", R());
    }

    public static /* bridge */ /* synthetic */ CallSite z(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }
}
