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

public final class g7
extends Enum<g7> {
    public static final /* enum */ g7 Center;
    public static final /* enum */ g7 Right;
    public static final /* enum */ g7 Left;
    private static final g7[] B;

    public static /* bridge */ /* synthetic */ CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = ".e+\u0001Y\u00040i*\u001d\u0006?i\"\u001dHr";
            var5_3 = ".e+\u0001Y\u00040i*\u001d\u0006?i\"\u001dHr".length();
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
            v4 = 81;
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
                            v11 = 45;
                            break;
                        }
                        case 1: {
                            v11 = 93;
                            break;
                        }
                        case 2: {
                            v11 = 29;
                            break;
                        }
                        case 3: {
                            v11 = 56;
                            break;
                        }
                        case 4: {
                            v11 = 124;
                            break;
                        }
                        case 5: {
                            v11 = 81;
                            break;
                        }
                        default: {
                            v11 = 125;
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
        g7.Left = new g7((Object)var0[1], 0);
        g7.Center = new g7((Object)var0[2], 1);
        g7.Right = new g7((Object)var0[0], 2);
        g7.B = hi.a("G", (Object)new Object[0], (long)480416808642370911L);
    }

    private static g7[] T(Object[] objectArray) {
        return new g7[]{hi.a("j", (long)1104786362878008527L), hi.a("j", (long)886195673375969875L), hi.a("j", (long)539835456405589235L)};
    }

    public static g7 valueOf(String string) {
        return (g7)((Object)g7.i("RRJrqeHJe11nB4FV", valueOf(java.lang.Class<T> java.lang.String ), g7.class, (String)string));
    }

    public static g7[] values() {
        return (g7[])((Enum)((Object)hi.a("j", (long)1035295439078812338L))).clone();
    }
}
