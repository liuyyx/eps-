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

final class i5
extends Enum<i5> {
    public static final /* enum */ i5 Normal;
    public static final /* enum */ i5 Strict;
    private static final i5[] o;

    private static i5[] r(Object[] objectArray) {
        return new i5[]{hi.a("j", (long)585759406572355802L), hi.a("j", (long)762419887653560799L)};
    }

    public static i5[] values() {
        return (i5[])i5.A("YLImpms7OfhUOjtk", clone(), (i5[])hi.a("j", (long)1101976505411865832L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "R\u001ffg 7\u0006O\u0004fc\"/";
            var5_3 = "R\u001ffg 7\u0006O\u0004fc\"/".length();
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
            v4 = 11;
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
                            v11 = 10;
                            break;
                        }
                        case 1: {
                            v11 = 96;
                            break;
                        }
                        case 2: {
                            v11 = 31;
                            break;
                        }
                        case 3: {
                            v11 = 5;
                            break;
                        }
                        case 4: {
                            v11 = 72;
                            break;
                        }
                        case 5: {
                            v11 = 72;
                            break;
                        }
                        default: {
                            v11 = 34;
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
        i5.Normal = new i5((Object)var0[1], 0);
        i5.Strict = new i5((Object)var0[0], 1);
        i5.o = hi.a("G", (Object)new Object[0], (long)661065798294305271L);
    }

    public static /* bridge */ /* synthetic */ CallSite A(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static i5 valueOf(String string) {
        return (i5)((Object)hi.a("G", i5.class, (Object)string, (long)703426484721789552L));
    }
}
