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

final class XD
extends Enum<XD> {
    public static final /* enum */ XD Bloom;
    public static final /* enum */ XD Hearts;
    public static final /* enum */ XD Stars;
    private static final XD[] t;

    public static /* bridge */ /* synthetic */ CallSite x(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static XD[] R() {
        return new XD[]{hi.a("j", (long)1230185026334181397L), hi.a("j", (long)634568564320142690L), hi.a("j", (long)529046910453337214L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = ">yh(F\u00064pf5_1\u0005/af5X";
            var5_3 = ">yh(F\u00064pf5_1\u0005/af5X".length();
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
            v4 = 51;
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
                            v11 = 79;
                            break;
                        }
                        case 1: {
                            v11 = 38;
                            break;
                        }
                        case 2: {
                            v11 = 52;
                            break;
                        }
                        case 3: {
                            v11 = 116;
                            break;
                        }
                        case 4: {
                            v11 = 24;
                            break;
                        }
                        case 5: {
                            v11 = 113;
                            break;
                        }
                        default: {
                            v11 = 50;
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
        XD.Stars = new XD((Object)var0[2], 0);
        XD.Hearts = new XD((Object)var0[1], 1);
        XD.Bloom = new XD((Object)var0[0], 2);
        XD.t = XD.x("MZddvdMc5kJfguAO", R());
    }

    public static XD valueOf(String string) {
        return (XD)((Object)XD.x("MZddvdMc5kJfguAO", valueOf(java.lang.Class<T> java.lang.String ), XD.class, (String)string));
    }

    public static XD[] values() {
        return (XD[])((Enum)((Object)hi.a("j", (long)458272123631408257L))).clone();
    }
}
