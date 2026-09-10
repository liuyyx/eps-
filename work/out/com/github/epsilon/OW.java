/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class OW
extends Enum<OW> {
    public static final /* enum */ OW High;
    public static final /* enum */ OW Medium;
    public static final /* enum */ OW Lowest;
    private static final /* synthetic */ OW[] y;
    public static final /* enum */ OW Low;
    public static final /* enum */ OW Highest;
    public final int priority;

    public static OW valueOf(String string) {
        return (OW)((Object)hi.a("G", OW.class, (Object)string, (long)703426484721789552L));
    }

    private static /* synthetic */ OW[] p(Object[] objectArray) {
        return new OW[]{hi.a("j", (long)1099603966600534000L), hi.a("j", (long)399826666807960272L), hi.a("j", (long)701240220687968054L), hi.a("j", (long)1063001742459100658L), hi.a("j", (long)1061553595500331636L)};
    }

    private OW(int n2) {
        this.priority = n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[5];
                        var12_1 = 0;
                        var11_2 = "rx\u000e)Ow(\u0004rx\u000e)\u0006wt\r(_i";
                        var13_3 = "rx\u000e)Ow(\u0004rx\u000e)\u0006wt\r(_i".length();
                        var10_4 = 7;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 101;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = ",$D\u0006,$D~\u0003*";
                            var13_3 = ",$D\u0006,$D~\u0003*".length();
                            var10_4 = 3;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 63;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 95;
                                    break;
                                }
                                case 1: {
                                    v15 = 116;
                                    break;
                                }
                                case 2: {
                                    v15 = 12;
                                    break;
                                }
                                case 3: {
                                    v15 = 36;
                                    break;
                                }
                                case 4: {
                                    v15 = 79;
                                    break;
                                }
                                case 5: {
                                    v15 = 97;
                                    break;
                                }
                                default: {
                                    v15 = 57;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                var1_7 = 1590290089394711173L;
                var0_8 = new long[4];
                var4_9 = 0;
                var5_10 = "b`\u00e8J\u001c2)m\u00ebK\u00fc!\u001c2*\u00e1";
                var6_11 = "b`\u00e8J\u001c2)m\u00ebK\u00fc!\u001c2*\u00e1".length();
                var3_12 = 0;
                while (true) {
                    var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                    v17 = var0_8;
                    v18 = var4_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var3_12 < var6_11) ** continue;
                    var5_10 = "\u00cb/\\\u00c2\u001c2*\u008f\u0002W\u00ea\u00ef\u001c2*\u00b7";
                    var6_11 = "\u00cb/\\\u00c2\u001c2*\u008f\u0002W\u00ea\u00ef\u001c2*\u00b7".length();
                    var3_12 = 0;
                    while (true) {
                        var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                        v17 = var0_8;
                        v18 = var4_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl123:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var3_12 < var6_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var1_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        OW.Lowest = new OW((Object)var8[4], 0, 0);
        OW.Low = new OW((Object)var8[3], 1, (int)var0_8[2]);
        OW.Medium = new OW((Object)var8[2], 2, (int)var0_8[3]);
        OW.High = new OW((Object)var8[1], 3, (int)var0_8[1]);
        OW.Highest = new OW((Object)var8[0], 4, (int)var0_8[0]);
        OW.y = hi.a("G", (Object)new Object[0], (long)722897941207707948L);
    }

    public static OW[] values() {
        return (OW[])((Enum)((Object)hi.a("j", (long)923197128535767714L))).clone();
    }
}
