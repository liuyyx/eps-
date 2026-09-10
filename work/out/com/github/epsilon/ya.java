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

public final class ya
extends Enum<ya> {
    private static final ya[] F;
    public static final /* enum */ ya Solid;
    public static final /* enum */ ya Rainbow;
    public static final /* enum */ ya Blend;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "R\u001f\u0000F,(\r\u0005S\u0011\u0005A*\u0005B\u0012\fF*";
            var5_3 = "R\u001f\u0000F,(\r\u0005S\u0011\u0005A*\u0005B\u0012\fF*".length();
            var2_4 = 7;
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
            v4 = 60;
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
                            v11 = 60;
                            break;
                        }
                        case 1: {
                            v11 = 66;
                            break;
                        }
                        case 2: {
                            v11 = 85;
                            break;
                        }
                        case 3: {
                            v11 = 20;
                            break;
                        }
                        case 4: {
                            v11 = 114;
                            break;
                        }
                        case 5: {
                            v11 = 123;
                            break;
                        }
                        default: {
                            v11 = 70;
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
        ya.Solid = new ya((Object)var0[1], 0);
        ya.Blend = new ya((Object)var0[2], 1);
        ya.Rainbow = new ya((Object)var0[0], 2);
        ya.F = hi.a("G", (Object)new Object[0], (long)758945060289085374L);
    }

    public static ya valueOf(String string) {
        return (ya)((Object)ya.l("tp90nDpFaXLDSeYw", valueOf(java.lang.Class<T> java.lang.String ), ya.class, (String)string));
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

    private static ya[] W(Object[] objectArray) {
        return new ya[]{hi.a("j", (long)958294305279200898L), hi.a("j", (long)1082285272310756216L), hi.a("j", (long)664922924664801820L)};
    }

    public static ya[] values() {
        return (ya[])((Enum)((Object)hi.a("j", (long)366801892952092795L))).clone();
    }
}
