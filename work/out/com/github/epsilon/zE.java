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

final class zE
extends Enum<zE> {
    private static final zE[] Z;
    public static final /* enum */ zE Eyes;
    public static final /* enum */ zE Feet;

    public static zE valueOf(String string) {
        return (zE)((Object)zE.M("r3lqEkVfeF8YJjYR", valueOf(java.lang.Class<T> java.lang.String ), zE.class, (String)string));
    }

    public static zE[] values() {
        return (zE[])((Enum)((Object)hi.a("j", (long)1033976653460839869L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "vF\t$\u0004uZ\t#";
            var5_3 = "vF\t$\u0004uZ\t#".length();
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
            v4 = 90;
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
                            v11 = 106;
                            break;
                        }
                        case 1: {
                            v11 = 121;
                            break;
                        }
                        case 2: {
                            v11 = 54;
                            break;
                        }
                        case 3: {
                            v11 = 10;
                            break;
                        }
                        case 4: {
                            v11 = 43;
                            break;
                        }
                        case 5: {
                            v11 = 13;
                            break;
                        }
                        default: {
                            v11 = 104;
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
        zE.Feet = new zE();
        zE.Eyes = new zE();
        zE.Z = hi.a("G", (Object)new Object[0], (long)990185466935896531L);
    }

    private static zE[] z(Object[] objectArray) {
        return new zE[]{hi.a("j", (long)742627306298663361L), hi.a("j", (long)509673429711678766L)};
    }

    public static /* bridge */ /* synthetic */ CallSite M(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
