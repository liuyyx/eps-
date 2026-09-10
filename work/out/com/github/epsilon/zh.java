/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class zh
extends Enum<zh> {
    public static final /* enum */ zh Roll;
    public static final /* enum */ zh Fall;
    private static final zh[] v;
    public static final /* enum */ zh Insert;
    public static final /* enum */ zh Size;
    public static final /* enum */ zh FadeOut;
    public static final /* enum */ zh Rocket;
    public static final /* enum */ zh Otkisuli;
    private static final long[] a;
    private static final Integer[] b;

    public static zh[] values() {
        return (zh[])((Enum)((Object)hi.a("j", (long)716698911910793550L))).clone();
    }

    private static zh[] r(Object[] objectArray) {
        zh[] zhArray = new zh[zh.a(18032, 7385716656644893269L)];
        zhArray[0] = hi.a("j", (long)950731023780175059L);
        zhArray[1] = hi.a("j", (long)791969460299048658L);
        zhArray[2] = hi.a("j", (long)952876923704648100L);
        zhArray[3] = hi.a("j", (long)428313951537022585L);
        zhArray[4] = hi.a("j", (long)577135590600337916L);
        zhArray[5] = hi.a("j", (long)506822524851274219L);
        zhArray[zh.a((int)11465, (long)4954790036093550830L)] = hi.a("j", (long)506642865277498221L);
        return zhArray;
    }

    public static zh valueOf(String string) {
        return (zh)((Object)hi.a("G", zh.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var8 = new String[7];
                        var12_1 = 0;
                        var11_2 = "SFY[t\u0016\u0006HGIUc\u0016\bN]QYb\u0017<h\u0007GH^U^\u0017$\u0004GHV\\";
                        var13_3 = "SFY[t\u0016\u0006HGIUc\u0016\bN]QYb\u0017<h\u0007GH^U^\u0017$\u0004GHV\\".length();
                        var10_4 = 6;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 21;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block21;
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
                            var11_2 = "DQAK\u0004EWWB";
                            var13_3 = "DQAK\u0004EWWB".length();
                            var10_4 = 4;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 2;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block21;
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
                            break block22;
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
                                    v15 = 20;
                                    break;
                                }
                                case 1: {
                                    v15 = 60;
                                    break;
                                }
                                case 2: {
                                    v15 = 47;
                                    break;
                                }
                                case 3: {
                                    v15 = 37;
                                    break;
                                }
                                case 4: {
                                    v15 = 4;
                                    break;
                                }
                                case 5: {
                                    v15 = 119;
                                    break;
                                }
                                default: {
                                    v15 = 69;
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
                var0_7 = 2178166305288855003L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u00ee\u0014|\u0017\u009ew\u00dd3\u008a\u00d8\u00e5\u001c\u0015\u0011\u00fb\u009f!9\u0011\u0004\u00dbv\u00b7\u0089";
                var5_11 = "\u00ee\u0014|\u0017\u009ew\u00dd3\u008a\u00d8\u00e5\u001c\u0015\u0011\u00fb\u009f!9\u0011\u0004\u00dbv\u00b7\u0089".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        zh.a = var6_8;
        zh.b = new Integer[3];
        zh.FadeOut = new zh((Object)var8[3], 0);
        zh.Size = new zh((Object)var8[6], 1);
        zh.Otkisuli = new zh((Object)var8[2], 2);
        zh.Insert = new zh((Object)var8[1], 3);
        zh.Fall = new zh((Object)var8[4], 4);
        zh.Rocket = new zh((Object)var8[0], 5);
        zh.Roll = new zh((Object)var8[5], zh.a(2660, 6619839844164462146L));
        zh.v = hi.a("G", (Object)new Object[0], (long)543810217330853137L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C27;
        if (b[n2] == null) {
            zh.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
