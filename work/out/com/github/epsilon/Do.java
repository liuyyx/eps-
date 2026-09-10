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

final class Do
extends Enum<Do> {
    public static final /* enum */ Do None;
    private static final Do[] n;
    public static final /* enum */ Do Silent;
    public static final /* enum */ Do Delay;

    public static Do valueOf(String string) {
        return (Do)((Object)Do.R("6VEKi1zhA1psTGw9", valueOf(java.lang.Class<T> java.lang.String ), Do.class, (String)string));
    }

    public static /* bridge */ /* synthetic */ CallSite R(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static Do[] X() {
        return new Do[]{hi.a("j", (long)1274831351590419860L), hi.a("j", (long)887322970607948370L), hi.a("j", (long)869619405814997047L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\r`m\u0005\u0006\u0010fo\u0005>\u0005\u0005\u0007jo\u0001)";
            var5_3 = "\r`m\u0005\u0006\u0010fo\u0005>\u0005\u0005\u0007jo\u0001)".length();
            var2_4 = 4;
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
            v4 = 74;
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
                            v11 = 9;
                            break;
                        }
                        case 1: {
                            v11 = 69;
                            break;
                        }
                        case 2: {
                            v11 = 73;
                            break;
                        }
                        case 3: {
                            v11 = 42;
                            break;
                        }
                        case 4: {
                            v11 = 26;
                            break;
                        }
                        case 5: {
                            v11 = 59;
                            break;
                        }
                        default: {
                            v11 = 66;
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
        Do.None = new Do((Object)var0[0], 0);
        Do.Delay = new Do((Object)var0[2], 1);
        Do.Silent = new Do((Object)var0[1], 2);
        Do.n = Do.R("6VEKi1zhA1psTGw9", X());
    }

    public static Do[] values() {
        return (Do[])((Enum)((Object)hi.a("j", (long)401259711554703859L))).clone();
    }
}
