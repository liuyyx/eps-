/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class zL
extends Enum<zL> {
    public static final /* enum */ zL BLACK_HOLE;
    public static final /* enum */ zL ALIEN_TERRAIN;
    public static final /* enum */ zL MINECRAFT;
    public static final /* enum */ zL PLANET;
    private static final zL[] w;
    public static final /* enum */ zL SEA_LEVEL;
    public static final /* enum */ zL CLOUDS;
    public static final /* enum */ zL INFERNO;
    private static final long[] a;
    private static final Integer[] b;

    public static zL valueOf(String string) {
        return (zL)((Object)hi.a("G", zL.class, (Object)string, (long)703426484721789552L));
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
                        var11_2 = "=\bi_na#0\bm\t,\u0001iCi{=:\b\u0006/\biR`j\u0006<\bgIam\u00076\nnYwp$";
                        var13_3 = "=\bi_na#0\bm\t,\u0001iCi{=:\b\u0006/\biR`j\u0006<\bgIam\u00076\nnYwp$".length();
                        var10_4 = 10;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 64;
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
                            var11_2 = "\f3XgXR\u0014\u0007.\r\u00006_gU_\u0001\u0004(DcRN";
                            var13_3 = "\f3XgXR\u0014\u0007.\r\u00006_gU_\u0001\u0004(DcRN".length();
                            var10_4 = 9;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 126;
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
                                    v15 = 63;
                                    break;
                                }
                                case 1: {
                                    v15 = 4;
                                    break;
                                }
                                case 2: {
                                    v15 = 104;
                                    break;
                                }
                                case 3: {
                                    v15 = 92;
                                    break;
                                }
                                case 4: {
                                    v15 = 101;
                                    break;
                                }
                                case 5: {
                                    v15 = 126;
                                    break;
                                }
                                default: {
                                    v15 = 43;
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
                var0_7 = 7140289632702295656L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\"\u00e9\u00d4u\t5\u00c4j\u00c7V\u0095\u008c\u00a6f\u00ff\u00f0L?\"\u00c6m\u0013\u00c8\u00e7";
                var5_11 = "\"\u00e9\u00d4u\t5\u00c4j\u00c7V\u0095\u008c\u00a6f\u00ff\u00f0L?\"\u00c6m\u0013\u00c8\u00e7".length();
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
        zL.a = var6_8;
        zL.b = new Integer[3];
        zL.SEA_LEVEL = new zL((Object)var8[1], 0);
        zL.CLOUDS = new zL((Object)var8[3], 1);
        zL.ALIEN_TERRAIN = new zL((Object)var8[6], 2);
        zL.INFERNO = new zL((Object)var8[4], 3);
        zL.PLANET = new zL((Object)var8[2], 4);
        zL.BLACK_HOLE = new zL((Object)var8[0], 5);
        zL.MINECRAFT = new zL((Object)var8[5], zL.a(1853, 2432764555815560841L));
        zL.w = hi.a("G", (Object)new Object[0], (long)843180816806283983L);
    }

    private static zL[] U(Object[] objectArray) {
        zL[] zLArray = new zL[zL.a(2995, 6616191420747885061L)];
        zLArray[0] = hi.a("j", (long)925732686855525025L);
        zLArray[1] = hi.a("j", (long)1234339412403094206L);
        zLArray[2] = hi.a("j", (long)1020996246778961014L);
        zLArray[3] = hi.a("j", (long)786695821260115279L);
        zLArray[4] = hi.a("j", (long)967133069506861443L);
        zLArray[5] = hi.a("j", (long)549029860146738740L);
        zLArray[zL.a((int)12329, (long)6677285542238425502L)] = hi.a("j", (long)457088103091943332L);
        return zLArray;
    }

    public static zL[] values() {
        return (zL[])((Enum)((Object)hi.a("j", (long)1150522877877333547L))).clone();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x21B6;
        if (b[n2] == null) {
            zL.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
