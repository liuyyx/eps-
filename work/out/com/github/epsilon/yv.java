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

final class yv
extends Enum<yv> {
    public static final /* enum */ yv Smart;
    public static final /* enum */ yv Simple;
    private static final yv[] t;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "B}dH[\u0006ByhJCl";
            var5_3 = "B}dH[\u0006ByhJCl".length();
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
            v4 = 85;
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
                            v11 = 68;
                            break;
                        }
                        case 1: {
                            v11 = 69;
                            break;
                        }
                        case 2: {
                            v11 = 80;
                            break;
                        }
                        case 3: {
                            v11 = 111;
                            break;
                        }
                        case 4: {
                            v11 = 122;
                            break;
                        }
                        case 5: {
                            v11 = 92;
                            break;
                        }
                        default: {
                            v11 = 46;
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
        yv.Simple = new yv((Object)var0[1], 0);
        yv.Smart = new yv((Object)var0[0], 1);
        yv.t = yv.f("QPO31wnjNtv9wmen", U());
    }

    private static yv[] U() {
        return new yv[]{hi.a("j", (long)478981211217684270L), hi.a("j", (long)870218776210343994L)};
    }

    public static yv[] values() {
        return (yv[])((Enum)((Object)hi.a("j", (long)766936527946514206L))).clone();
    }

    public static /* bridge */ /* synthetic */ CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static yv valueOf(String string) {
        return (yv)((Object)hi.a("G", yv.class, (Object)string, (long)703426484721789552L));
    }
}
