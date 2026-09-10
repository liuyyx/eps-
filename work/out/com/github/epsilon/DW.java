/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class DW
extends Enum<DW> {
    public static final /* enum */ DW Double;
    public static final /* enum */ DW Rainbow;
    public static final /* enum */ DW Single;
    private static final DW[] t;
    public static final /* enum */ DW Fade;

    private static DW[] X(Object[] objectArray) {
        return new DW[]{hi.a("j", (long)919627862893990774L), hi.a("j", (long)759653898638966483L), hi.a("j", (long)544272986501020421L), hi.a("j", (long)366244132724352704L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u0005\u00157\u0002out\u0006\u0013\u001b+\u000ea\u007f";
                var5_3 = "\u0005\u00157\u0002out\u0006\u0013\u001b+\u000ea\u007f".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 31;
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
                    var3_2 = "\u0006\u001f2\tc}\u0004\u0013\u00178\u000b";
                    var5_3 = "\u0006\u001f2\tc}\u0004\u0013\u00178\u000b".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 29;
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
                            v15 = 72;
                            break;
                        }
                        case 1: {
                            v15 = 107;
                            break;
                        }
                        case 2: {
                            v15 = 65;
                            break;
                        }
                        case 3: {
                            v15 = 115;
                            break;
                        }
                        case 4: {
                            v15 = 18;
                            break;
                        }
                        case 5: {
                            v15 = 5;
                            break;
                        }
                        default: {
                            v15 = 28;
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
        DW.Single = new DW((Object)var0[2], 0);
        DW.Double = new DW((Object)var0[1], 1);
        DW.Rainbow = new DW((Object)var0[0], 2);
        DW.Fade = new DW((Object)var0[3], 3);
        DW.t = hi.a("G", (Object)new Object[0], (long)882443643710791732L);
    }

    public static DW valueOf(String string) {
        return (DW)((Object)hi.a("G", DW.class, (Object)string, (long)703426484721789552L));
    }

    public static DW[] values() {
        return (DW[])((Enum)((Object)hi.a("j", (long)792974243606254008L))).clone();
    }
}
