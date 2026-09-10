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

final class _T
extends Enum<_T> {
    public static final /* enum */ _T Silent;
    private static final _T[] B;
    public static final /* enum */ _T Normal;

    public static _T valueOf(String string) {
        return (_T)((Object)_T.S("IrbIEqjqI7MztY2K", valueOf(java.lang.Class<T> java.lang.String ), _T.class, (String)string));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = ".\u00058S<?\u00063\u0003&[3'";
            var5_3 = ".\u00058S<?\u00063\u0003&[3'".length();
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
            v4 = 126;
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
                            v11 = 30;
                            break;
                        }
                        case 1: {
                            v11 = 20;
                            break;
                        }
                        case 2: {
                            v11 = 52;
                            break;
                        }
                        case 3: {
                            v11 = 64;
                            break;
                        }
                        case 4: {
                            v11 = 35;
                            break;
                        }
                        case 5: {
                            v11 = 45;
                            break;
                        }
                        default: {
                            v11 = 13;
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
        _T.Normal = new _T((Object)var0[0], 0);
        _T.Silent = new _T((Object)var0[1], 1);
        _T.B = hi.a("G", (Object)new Object[0], (long)372611093299179501L);
    }

    private static _T[] m(Object[] objectArray) {
        return new _T[]{hi.a("j", (long)606890169672925067L), hi.a("j", (long)1194911053953533717L)};
    }

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static _T[] values() {
        return (_T[])((Enum)((Object)hi.a("j", (long)1052734352255502068L))).clone();
    }
}
