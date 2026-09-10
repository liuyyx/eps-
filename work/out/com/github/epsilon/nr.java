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

public final class nr
extends Enum<nr> {
    public static final /* enum */ nr Glow;
    private static final nr[] P;
    public static final /* enum */ nr Outline;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "2|v\u000f\u0007:em\u0014[U\u000f";
            var5_3 = "2|v\u000f\u0007:em\u0014[U\u000f".length();
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
            v4 = 101;
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
                            v11 = 16;
                            break;
                        }
                        case 1: {
                            v11 = 117;
                            break;
                        }
                        case 2: {
                            v11 = 124;
                            break;
                        }
                        case 3: {
                            v11 = 29;
                            break;
                        }
                        case 4: {
                            v11 = 87;
                            break;
                        }
                        case 5: {
                            v11 = 94;
                            break;
                        }
                        default: {
                            v11 = 15;
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
        nr.Outline = new nr((Object)var0[1], 0);
        nr.Glow = new nr((Object)var0[0], 1);
        nr.P = hi.a("G", (Object)new Object[0], (long)780600389626212775L);
    }

    public static /* bridge */ /* synthetic */ CallSite T(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static nr[] G(Object[] objectArray) {
        return new nr[]{hi.a("j", (long)951690305018102115L), hi.a("j", (long)1145867102080661668L)};
    }

    public static nr valueOf(String string) {
        return (nr)((Object)nr.T("a6nDBDDuTraVJAjl", valueOf(java.lang.Class<T> java.lang.String ), nr.class, (String)string));
    }

    public static nr[] values() {
        return (nr[])nr.T("a6nDBDDuTraVJAjl", clone(), (nr[])hi.a("j", (long)1292511275883419135L));
    }
}
