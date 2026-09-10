/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

public final class lY {
    public static final String d;
    public static final String t;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "u?7\u0019\u007fya\t\"\u007fvF='?>x";
            var5_3 = "u?7\u0019\u007fya\t\"\u007fvF='?>x".length();
            var2_4 = 7;
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
            v4 = 117;
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
                            v11 = 58;
                            break;
                        }
                        case 2: {
                            v11 = 49;
                            break;
                        }
                        case 3: {
                            v11 = 5;
                            break;
                        }
                        case 4: {
                            v11 = 102;
                            break;
                        }
                        case 5: {
                            v11 = 99;
                            break;
                        }
                        default: {
                            v11 = 122;
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
        lY.t = var0[0];
        lY.d = new String(var0[1]);
    }

    private lY() {
    }
}
