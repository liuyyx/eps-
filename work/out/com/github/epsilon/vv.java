/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class vv
extends Enum<vv> {
    private static final vv[] Q;
    public static final /* enum */ vv RIGHT;
    public static final /* enum */ vv BOTH;
    public static final /* enum */ vv LEFT;
    public final String name;

    public static vv valueOf(String string) {
        return (vv)((Object)hi.a("G", vv.class, (Object)string, (long)703426484721789552L));
    }

    public String toString() {
        return hi.a("\u00e9", (Object)((Object)this), (long)1319224660987391691L);
    }

    public static vv[] values() {
        return (vv[])((Enum)((Object)hi.a("j", (long)1268140287200404495L))).clone();
    }

    private static vv[] A(Object[] objectArray) {
        return new vv[]{hi.a("j", (long)800536659770637938L), hi.a("j", (long)1248830504749898267L), hi.a("j", (long)510425288304258069L)};
    }

    private vv(String string2) {
        this.name = string2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[6];
                var4_1 = 0;
                var3_2 = "\u000eG3pP\u0004\u0010k\u0012L\u0004\u0010K2l\u0004\u001eA p";
                var5_3 = "\u000eG3pP\u0004\u0010k\u0012L\u0004\u0010K2l\u0004\u001eA p".length();
                var2_4 = 5;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 123;
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
                    var3_2 = "1X,oO\u0004!^?o";
                    var5_3 = "1X,oO\u0004!^?o".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 68;
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
                            v15 = 39;
                            break;
                        }
                        case 1: {
                            v15 = 117;
                            break;
                        }
                        case 2: {
                            v15 = 15;
                            break;
                        }
                        case 3: {
                            v15 = 67;
                            break;
                        }
                        case 4: {
                            v15 = 127;
                            break;
                        }
                        case 5: {
                            v15 = 121;
                            break;
                        }
                        default: {
                            v15 = 108;
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
        vv.LEFT = new vv((Object)var0[2], 0, (Object)var0[1]);
        vv.RIGHT = new vv((Object)var0[0], 1, (Object)var0[4]);
        vv.BOTH = new vv((Object)var0[3], 2, (Object)var0[5]);
        vv.Q = hi.a("G", (Object)new Object[0], (long)1242949054870388367L);
    }
}
