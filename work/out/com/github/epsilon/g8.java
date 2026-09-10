/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class g8
extends Enum<g8> {
    public static final /* enum */ g8 FRIEND;
    public static final /* enum */ g8 CONFIG;
    public static final /* enum */ g8 ADDON;
    public static final /* enum */ g8 GENERAL;
    private static final g8[] P;

    public static g8 valueOf(String string) {
        return (g8)((Object)hi.a("G", g8.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "tmcp[z\u0007pgcs@|e";
                var5_3 = "tmcp[z\u0007pgcs@|e".length();
                var2_4 = 6;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 12;
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
                    var3_2 = "/?0 \u0005\u0006()=*\u0005 ";
                    var5_3 = "/?0 \u0005\u0006()=*\u0005 ".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 85;
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
                            v15 = 59;
                            break;
                        }
                        case 1: {
                            v15 = 46;
                            break;
                        }
                        case 2: {
                            v15 = 33;
                            break;
                        }
                        case 3: {
                            v15 = 58;
                            break;
                        }
                        case 4: {
                            v15 = 30;
                            break;
                        }
                        case 5: {
                            v15 = 49;
                            break;
                        }
                        default: {
                            v15 = 37;
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
        g8.GENERAL = new g8((Object)var0[1], 0);
        g8.FRIEND = new g8((Object)var0[3], 1);
        g8.CONFIG = new g8((Object)var0[0], 2);
        g8.ADDON = new g8((Object)var0[2], 3);
        g8.P = hi.a("G", (Object)new Object[0], (long)1325925473059888435L);
    }

    private static g8[] e(Object[] objectArray) {
        return new g8[]{hi.a("j", (long)1216665040131297294L), hi.a("j", (long)1209394313104476311L), hi.a("j", (long)619716510178276148L), hi.a("j", (long)1112007378936454935L)};
    }

    public static g8[] values() {
        return (g8[])((Enum)((Object)hi.a("j", (long)1184336788156576731L))).clone();
    }
}
