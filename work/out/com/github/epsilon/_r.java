/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class _r
extends Enum<_r> {
    public static final /* enum */ _r SESSION;
    public static final /* enum */ _r CRACKED;
    private static final _r[] R;
    public static final /* enum */ _r NONE;
    public static final /* enum */ _r ALTENING;

    public static _r valueOf(String string) {
        return (_r)((Object)hi.a("G", _r.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "|[\"G3\u0002X\u0004qF-A";
                var5_3 = "|[\"G3\u0002X\u0004qF-A".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 6;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "\u0016-_)^f:\u0010\u0007\u0004$X?Y`:";
                    var5_3 = "\u0016-_)^f:\u0010\u0007\u0004$X?Y`:".length();
                    var2_4 = 8;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 110;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 57;
                            break;
                        }
                        case 1: {
                            v15 = 15;
                            break;
                        }
                        case 2: {
                            v15 = 101;
                            break;
                        }
                        case 3: {
                            v15 = 2;
                            break;
                        }
                        case 4: {
                            v15 = 126;
                            break;
                        }
                        case 5: {
                            v15 = 65;
                            break;
                        }
                        default: {
                            v15 = 26;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        _r.NONE = new _r((Object)var0[1], 0);
        _r.CRACKED = new _r((Object)var0[0], 1);
        _r.ALTENING = new _r((Object)var0[2], 2);
        _r.SESSION = new _r((Object)var0[3], 3);
        _r.R = hi.a("G", (Object)new Object[0], (long)783241800836561713L);
    }

    public static _r[] values() {
        return (_r[])((Enum)((Object)hi.a("j", (long)1085089327391038495L))).clone();
    }

    private static _r[] J(Object[] objectArray) {
        return new _r[]{hi.a("j", (long)831321163810021373L), hi.a("j", (long)510558019671069642L), hi.a("j", (long)795591557907986876L), hi.a("j", (long)726769344349388930L)};
    }
}
