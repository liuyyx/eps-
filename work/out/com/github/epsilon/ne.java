/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class ne
extends Enum<ne> {
    public static final /* enum */ ne Rainbow;
    private static final ne[] G;
    public static final /* enum */ ne Fidelity;
    public static final /* enum */ ne Vibrant;
    public static final /* enum */ ne TonalSpot;
    public static final /* enum */ ne Expressive;
    public static final /* enum */ ne Neutral;
    public static final /* enum */ ne Monochrome;
    public static final /* enum */ ne Content;
    public static final /* enum */ ne FruitSalad;
    private static final long[] a;
    private static final Integer[] b;

    private static ne[] N(Object[] objectArray) {
        ne[] neArray = new ne[ne.a(31179, 8909553255548043558L)];
        neArray[0] = hi.a("j", (long)1222411753678176634L);
        neArray[1] = hi.a("j", (long)641345311885978989L);
        neArray[2] = hi.a("j", (long)1228085532794643456L);
        neArray[3] = hi.a("j", (long)851228724769794622L);
        neArray[4] = hi.a("j", (long)1135711096852418349L);
        neArray[5] = hi.a("j", (long)748888212119226085L);
        neArray[ne.a((int)6289, (long)3340524722119647352L)] = hi.a("j", (long)564623591308783846L);
        neArray[ne.a((int)11955, (long)1972681999325828699L)] = hi.a("j", (long)915943373611112847L);
        neArray[ne.a((int)25912, (long)5756362145806376402L)] = hi.a("j", (long)1238588514554704248L);
        return neArray;
    }

    public static ne[] values() {
        return (ne[])((Enum)((Object)hi.a("j", (long)1181959602511804672L))).clone();
    }

    public static ne valueOf(String string) {
        return (ne)((Object)hi.a("G", ne.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[9];
                        var12_1 = 0;
                        var11_2 = "M*8~4H)\u0007\\$?d3I*\nZ3!b3T-v=4\tK$?q:t.p?\u0007Q.$d$F2\u0007I\"3b7I*\nR$?\u007f5O,p&4";
                        var13_3 = "M*8~4H)\u0007\\$?d3I*\nZ3!b3T-v=4\tK$?q:t.p?\u0007Q.$d$F2\u0007I\"3b7I*\nR$?\u007f5O,p&4".length();
                        var10_4 = 7;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 55;
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
                            var11_2 = ":AV\u0016Y-I\u0005\n:ZG\u001aA\u0017\\\u0010IV";
                            var13_3 = ":AV\u0016Y-I\u0005\n:ZG\u001aA\u0017\\\u0010IV".length();
                            var10_4 = 8;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 84;
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
                                    v15 = 40;
                                    break;
                                }
                                case 1: {
                                    v15 = 124;
                                    break;
                                }
                                case 2: {
                                    v15 = 102;
                                    break;
                                }
                                case 3: {
                                    v15 = 39;
                                    break;
                                }
                                case 4: {
                                    v15 = 97;
                                    break;
                                }
                                case 5: {
                                    v15 = 16;
                                    break;
                                }
                                default: {
                                    v15 = 105;
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
                var0_7 = 6734723005746056352L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = "\u00a8]D's\u007f,\u00de\u00cb\u00d9i\u00e6\u00e2\u00ba\u009a\u00fcz\u008eq>N\u00fe\u0088\u00ae\u008e\u00bfY\u0087\u00c1nQz8\u0085S\u0099jx\u00cd\u008f";
                var5_11 = "\u00a8]D's\u007f,\u00de\u00cb\u00d9i\u00e6\u00e2\u00ba\u009a\u00fcz\u008eq>N\u00fe\u0088\u00ae\u008e\u00bfY\u0087\u00c1nQz8\u0085S\u0099jx\u00cd\u008f".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "M\u00cc\u00a8;\u00c9\u0084\u00c5\u0087Zr=D_\u009a\u00b0\u00b7";
                    var5_11 = "M\u00cc\u00a8;\u00c9\u0084\u00c5\u0087Zr=D_\u009a\u00b0\u00b7".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
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
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
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
        ne.a = var6_8;
        ne.b = new Integer[7];
        ne.TonalSpot = new ne((Object)var8[3], 0);
        ne.Neutral = new ne((Object)var8[4], 1);
        ne.Vibrant = new ne((Object)var8[5], 2);
        ne.Expressive = new ne((Object)var8[2], 3);
        ne.Fidelity = new ne((Object)var8[7], 4);
        ne.Content = new ne((Object)var8[1], 5);
        ne.Rainbow = new ne((Object)var8[0], ne.a(29133, 2068886706603542817L));
        ne.FruitSalad = new ne((Object)var8[8], ne.a(15586, 2460100754184832009L));
        ne.Monochrome = new ne((Object)var8[6], ne.a(1264, 5976311688528378911L));
        ne.G = hi.a("G", (Object)new Object[0], (long)670138578323338153L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x38E9;
        if (b[n2] == null) {
            ne.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
