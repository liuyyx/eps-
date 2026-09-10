/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class _f
extends Enum<_f> {
    public static final /* enum */ _f Default;
    public static final /* enum */ _f Portal;
    private static final _f[] w;

    public static _f[] values() {
        return (_f[])((Enum)((Object)hi.a("j", (long)372082206811583763L))).clone();
    }

    public static _f valueOf(String string) {
        return (_f)((Object)hi.a("G", _f.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u00006yCK\r\u0007\u0014<mV_\r\u001f";
            var5_3 = "\u00006yCK\r\u0007\u0014<mV_\r\u001f".length();
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
            v4 = 98;
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
                            v11 = 50;
                            break;
                        }
                        case 1: {
                            v11 = 59;
                            break;
                        }
                        case 2: {
                            v11 = 105;
                            break;
                        }
                        case 3: {
                            v11 = 85;
                            break;
                        }
                        case 4: {
                            v11 = 72;
                            break;
                        }
                        case 5: {
                            v11 = 3;
                            break;
                        }
                        default: {
                            v11 = 9;
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
        _f.Default = new _f((Object)var0[1], 0);
        _f.Portal = new _f((Object)var0[0], 1);
        _f.w = hi.a("G", (Object)new Object[0], (long)1131145316317065401L);
    }

    private static _f[] f(Object[] objectArray) {
        return new _f[]{hi.a("j", (long)1210633535099315848L), hi.a("j", (long)636108743492895578L)};
    }
}
