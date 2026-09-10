/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class _P
extends Enum<_P> {
    public static final /* enum */ _P OldNCP;
    public static final /* enum */ _P NCP;
    public static final /* enum */ _P Vanilla;
    private static final _P[] J;

    public static _P[] values() {
        return (_P[])((Enum)((Object)hi.a("j", (long)1114162762134172514L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u0010Ya/5]\u0003\u0011vU\u0007\tTk\b\u001aa<";
            var5_3 = "\u0010Ya/5]\u0003\u0011vU\u0007\tTk\b\u001aa<".length();
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
            v4 = 58;
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
                            v11 = 101;
                            break;
                        }
                        case 1: {
                            v11 = 15;
                            break;
                        }
                        case 2: {
                            v11 = 63;
                            break;
                        }
                        case 3: {
                            v11 = 91;
                            break;
                        }
                        case 4: {
                            v11 = 76;
                            break;
                        }
                        case 5: {
                            v11 = 55;
                            break;
                        }
                        default: {
                            v11 = 103;
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
        _P.Vanilla = new _P((Object)var0[2], 0);
        _P.OldNCP = new _P((Object)var0[0], 1);
        _P.NCP = new _P((Object)var0[1], 2);
        _P.J = hi.a("G", (Object)new Object[0], (long)833727952585254488L);
    }

    public static _P valueOf(String string) {
        return (_P)((Object)hi.a("G", _P.class, (Object)string, (long)703426484721789552L));
    }

    private static _P[] m(Object[] objectArray) {
        return new _P[]{hi.a("j", (long)1081178424571919452L), hi.a("j", (long)659533965106696512L), hi.a("j", (long)1145978325003626242L)};
    }
}
