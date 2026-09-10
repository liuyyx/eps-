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

final class _x
extends Enum<_x> {
    private static final _x[] k;
    public static final /* enum */ _x Fly;
    public static final /* enum */ _x Drop;

    public static _x valueOf(String string) {
        return (_x)((Object)hi.a("G", _x.class, (Object)string, (long)703426484721789552L));
    }

    public static _x[] values() {
        return (_x[])_x.F("FA1iVWexo1o8bbQr", clone(), (_x[])hi.a("j", (long)806858777140769738L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "@!<\u0004B?*J";
            var5_3 = "@!<\u0004B?*J".length();
            var2_4 = 3;
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
            v4 = 78;
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
                            v11 = 72;
                            break;
                        }
                        case 1: {
                            v11 = 3;
                            break;
                        }
                        case 2: {
                            v11 = 11;
                            break;
                        }
                        case 3: {
                            v11 = 116;
                            break;
                        }
                        case 4: {
                            v11 = 27;
                            break;
                        }
                        case 5: {
                            v11 = 62;
                            break;
                        }
                        default: {
                            v11 = 98;
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
        _x.Drop = new _x((Object)var0[1], 0);
        _x.Fly = new _x((Object)var0[0], 1);
        _x.k = hi.a("G", (Object)new Object[0], (long)573593222653824005L);
    }

    private static _x[] N(Object[] objectArray) {
        return new _x[]{hi.a("j", (long)1001778207591912008L), hi.a("j", (long)1073641351692122726L)};
    }

    public static /* bridge */ /* synthetic */ CallSite F(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
