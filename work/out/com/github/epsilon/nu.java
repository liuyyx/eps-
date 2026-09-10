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

final class nu
extends Enum<nu> {
    public static final /* enum */ nu Static;
    public static final /* enum */ nu Hypixel;
    private static final nu[] F;
    public static final /* enum */ nu Heypixel;

    public static nu valueOf(String string) {
        return (nu)((Object)hi.a("G", nu.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "|IS\ft4QX\u0007|UZ\u0015e)X\u0006gXK\bt/";
            var5_3 = "|IS\ft4QX\u0007|UZ\u0015e)X\u0006gXK\bt/".length();
            var2_4 = 8;
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
            v4 = 34;
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
                            v11 = 22;
                            break;
                        }
                        case 1: {
                            v11 = 14;
                            break;
                        }
                        case 2: {
                            v11 = 8;
                            break;
                        }
                        case 3: {
                            v11 = 94;
                            break;
                        }
                        case 4: {
                            v11 = 63;
                            break;
                        }
                        case 5: {
                            v11 = 110;
                            break;
                        }
                        default: {
                            v11 = 22;
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
        nu.Static = new nu((Object)var0[2], 0);
        nu.Hypixel = new nu((Object)var0[1], 1);
        nu.Heypixel = new nu((Object)var0[0], 2);
        nu.F = nu.m("czBiNYHPVWMJs1Yy", x());
    }

    public static nu[] values() {
        return (nu[])((Enum)((Object)hi.a("j", (long)967900472006085838L))).clone();
    }

    private static nu[] x() {
        return new nu[]{hi.a("j", (long)1208190623198428012L), hi.a("j", (long)1270343827400781957L), hi.a("j", (long)792803114442146796L)};
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
}
