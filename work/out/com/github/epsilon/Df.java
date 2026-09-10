/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class Df
extends Enum<Df> {
    public static final /* enum */ Df CHROME;
    public static final /* enum */ Df POPUP;
    public static final /* enum */ Df BACKGROUND;
    private final int E;
    public static final /* enum */ Df FLOATING;
    private static final /* synthetic */ Df[] b;
    public static final /* enum */ Df CONTENT;
    public static final /* enum */ Df OVERLAY;
    private static final long[] a;
    private static final Integer[] c;

    private Df(int n2) {
        this.E = n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[6];
                        var12_1 = 0;
                        var11_2 = "6X\"MCN\u000b\u0005%X<LV\n7V/RAR\u0010 Y(\u00066_>VKE";
                        var13_3 = "6X\"MCN\u000b\u0005%X<LV\n7V/RAR\u0010 Y(\u00066_>VKE".length();
                        var10_4 = 7;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 102;
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
                            var11_2 = "o\u0014|\u001e\u001f\u0014S\bf\u000ev\r\u0007\u001cDg";
                            var13_3 = "o\u0014|\u001e\u001f\u0014S\bf\u000ev\r\u0007\u001cDg".length();
                            var10_4 = 7;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 51;
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
                                    v15 = 19;
                                    break;
                                }
                                case 1: {
                                    v15 = 113;
                                    break;
                                }
                                case 2: {
                                    v15 = 10;
                                    break;
                                }
                                case 3: {
                                    v15 = 127;
                                    break;
                                }
                                case 4: {
                                    v15 = 96;
                                    break;
                                }
                                case 5: {
                                    v15 = 102;
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
                var0_7 = 5918158292026516135L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u001eDvn\u0002l\u00f2\u0014r\u00c0.?\u0089\u00fb\u00e9i\u00e1\u00dd\u00f5B\u00eb\u0094a\u00af\u00e5\u0087T\u00a1\u00cc\u000eLU";
                var5_11 = "\u001eDvn\u0002l\u00f2\u0014r\u00c0.?\u0089\u00fb\u00e9i\u00e1\u00dd\u00f5B\u00eb\u0094a\u00af\u00e5\u0087T\u00a1\u00cc\u000eLU".length();
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
                    var4_10 = "\u00e6Om\u00ae\u008c\u00b0 E\u00c4>*\u00ac^\u00b4#p";
                    var5_11 = "\u00e6Om\u00ae\u008c\u00b0 E\u00c4>*\u00ac^\u00b4#p".length();
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
        Df.a = var6_8;
        Df.c = new Integer[6];
        Df.BACKGROUND = new Df((Object)var8[2], 0, 0);
        Df.CHROME = new Df((Object)var8[3], 1, Df.a(16022, 5893572667844046486L));
        Df.CONTENT = new Df((Object)var8[0], 2, Df.a(5057, 409113813582971840L));
        Df.FLOATING = new Df((Object)var8[5], 3, Df.a(21449, 3154133139001295822L));
        Df.POPUP = new Df((Object)var8[1], 4, Df.a(288, 6952391046909727011L));
        Df.OVERLAY = new Df((Object)var8[4], 5, Df.a(20517, 5409229311396921379L));
        Df.b = hi.a("G", (Object)new Object[0], (long)412856480120950984L);
    }

    public int e() {
        return (int)hi.a("\u00e9", (Object)((Object)this), (long)1169642312669735254L);
    }

    public static Df[] values() {
        return (Df[])((Enum)((Object)hi.a("j", (long)858902212844877318L))).clone();
    }

    public static Df valueOf(String string) {
        return (Df)((Object)hi.a("G", Df.class, (Object)string, (long)703426484721789552L));
    }

    private static /* synthetic */ Df[] m(Object[] objectArray) {
        Df[] dfArray = new Df[Df.a(7114, 3543241327535590344L)];
        dfArray[0] = hi.a("j", (long)1051992334706217839L);
        dfArray[1] = hi.a("j", (long)940179441753858572L);
        dfArray[2] = hi.a("j", (long)882827338724254838L);
        dfArray[3] = hi.a("j", (long)385055487695276602L);
        dfArray[4] = hi.a("j", (long)908139053228126372L);
        dfArray[5] = hi.a("j", (long)559377594655331103L);
        return dfArray;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1003;
        if (c[n2] == null) {
            Df.c[n2] = (int)(a[n2] ^ l);
        }
        return c[n2];
    }
}
