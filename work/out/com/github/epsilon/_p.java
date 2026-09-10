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

public final class _p
extends Enum<_p> {
    public static final /* enum */ _p Vanilla;
    public static final /* enum */ _p Epsilon;
    private static final _p[] H;
    public static final /* enum */ _p Minecraft_1_8_9;

    public static _p valueOf(String string) {
        return (_p)((Object)_p.Z("3Ej7YXJ4sd8dfDBa", valueOf(java.lang.Class<T> java.lang.String ), _p.class, (String)string));
    }

    public static _p[] values() {
        return (_p[])((Enum)((Object)hi.a("j", (long)1186690250108986251L))).clone();
    }

    public static /* bridge */ /* synthetic */ CallSite Z(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            var3_2 = "~s$/0_:Un\u0015{\f\u0015\u0004\n\u0007e{$#?A:\u0007vj9#?B5";
            var5_3 = "~s$/0_:Un\u0015{\f\u0015\u0004\n\u0007e{$#?A:\u0007vj9#?B5".length();
            var2_4 = 15;
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
            v4 = 14;
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
                            v11 = 61;
                            break;
                        }
                        case 1: {
                            v11 = 20;
                            break;
                        }
                        case 2: {
                            v11 = 68;
                            break;
                        }
                        case 3: {
                            v11 = 68;
                            break;
                        }
                        case 4: {
                            v11 = 93;
                            break;
                        }
                        case 5: {
                            v11 = 35;
                            break;
                        }
                        default: {
                            v11 = 85;
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
        _p.Vanilla = new _p((Object)var0[1], 0);
        _p.Minecraft_1_8_9 = new _p((Object)var0[0], 1);
        _p.Epsilon = new _p((Object)var0[2], 2);
        _p.H = hi.a("G", (Object)new Object[0], (long)507950083982969298L);
    }

    private static _p[] e(Object[] objectArray) {
        return new _p[]{hi.a("j", (long)1314609764065888770L), hi.a("j", (long)1027825342440577237L), hi.a("j", (long)1269850842724184400L)};
    }
}
