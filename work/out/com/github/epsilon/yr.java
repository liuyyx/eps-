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

final class yr
extends Enum<yr> {
    private final boolean C;
    private static final yr[] j;
    private final boolean X;
    public static final /* enum */ yr Weak;
    public static final /* enum */ yr Off;
    public static final /* enum */ yr Strong;

    private yr(boolean bl, boolean bl2) {
        this.C = bl;
        this.X = bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u0004m32ut\u0003\u0018\u007f'\u0004\u0000| 6";
            var5_3 = "\u0004m32ut\u0003\u0018\u007f'\u0004\u0000| 6".length();
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
            v4 = 45;
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
                            v11 = 122;
                            break;
                        }
                        case 1: {
                            v11 = 52;
                            break;
                        }
                        case 2: {
                            v11 = 108;
                            break;
                        }
                        case 3: {
                            v11 = 112;
                            break;
                        }
                        case 4: {
                            v11 = 54;
                            break;
                        }
                        case 5: {
                            v11 = 62;
                            break;
                        }
                        default: {
                            v11 = 41;
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
        yr.Off = new yr(false, false);
        yr.Weak = new yr(true, false);
        yr.Strong = new yr(true, true);
        yr.j = yr.T("YYXDaPywI77qom6k", B());
    }

    public static yr[] values() {
        return (yr[])((Enum)((Object)hi.a("j", (long)903971346986759390L))).clone();
    }

    private static yr[] B() {
        return new yr[]{hi.a("j", (long)1125707777427767691L), hi.a("j", (long)1256164711421550826L), hi.a("j", (long)792458597155035379L)};
    }

    public static yr valueOf(String string) {
        return (yr)((Object)yr.T("YYXDaPywI77qom6k", valueOf(java.lang.Class<T> java.lang.String ), yr.class, (String)string));
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
}
