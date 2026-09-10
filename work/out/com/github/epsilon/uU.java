/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

public class uU {
    public static final int s;
    public static final int V;
    public static final int F;
    public static final int T = 0;
    public static final int u;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 7262856871343996981L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "@I>\u0007\u001e\u00f6\u00c0Q\u00ccy\u009aZ\u001e\u00f6\u00c0\u00fd";
                var6_4 = "@I>\u0007\u001e\u00f6\u00c0Q\u00ccy\u009aZ\u001e\u00f6\u00c0\u00fd".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "\u0012\u00e5\u008b\u00fd\u00e1\t?\u00a9k\u00ad\u008a\u0099\u00e1\t?\r";
                    var6_4 = "\u0012\u00e5\u008b\u00fd\u00e1\t?\u00a9k\u00ad\u008a\u0099\u00e1\t?\r".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var1;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        uU.s = (int)var0_1[1];
        uU.V = (int)var0_1[3];
        uU.u = (int)var0_1[0];
        uU.F = (int)var0_1[2];
    }
}
