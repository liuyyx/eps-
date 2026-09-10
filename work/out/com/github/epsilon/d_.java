/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class d_
extends Enum<d_> {
    public static final /* enum */ d_ FishingRod;
    public static final /* enum */ d_ None;
    public static final /* enum */ d_ Block;
    public static final /* enum */ d_ GoldenApple;
    private static final d_[] V;
    public static final /* enum */ d_ Projectile;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "NM..T\nJH2%VL\"^N%\u0004BN/(";
                var5_3 = "NM..T\nJH2%VL\"^N%\u0004BN/(".length();
                var2_4 = 5;
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
                    var3_2 = "na\u001c\u0015hs\u0003W\u007f\u0016\u000by|\u001f\u001bh~6Nc\u001f\u001a";
                    var5_3 = "na\u001c\u0015hs\u0003W\u007f\u0016\u000by|\u001f\u001bh~6Nc\u001f\u001a".length();
                    var2_4 = 10;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 45;
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
                            v15 = 19;
                            break;
                        }
                        case 1: {
                            v15 = 62;
                            break;
                        }
                        case 2: {
                            v15 = 94;
                            break;
                        }
                        case 3: {
                            v15 = 82;
                            break;
                        }
                        case 4: {
                            v15 = 32;
                            break;
                        }
                        case 5: {
                            v15 = 61;
                            break;
                        }
                        default: {
                            v15 = 90;
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
        d_.None = new d_((Object)var0[2], 0);
        d_.GoldenApple = new d_((Object)var0[4], 1);
        d_.Projectile = new d_((Object)var0[3], 2);
        d_.FishingRod = new d_((Object)var0[1], 3);
        d_.Block = new d_((Object)var0[0], 4);
        d_.V = hi.a("G", (Object)new Object[0], (long)1154114383580523122L);
    }

    private static d_[] A(Object[] objectArray) {
        return new d_[]{hi.a("j", (long)1225529495814893372L), hi.a("j", (long)1302083182012203900L), hi.a("j", (long)911553817953895964L), hi.a("j", (long)1031859173964222050L), hi.a("j", (long)564288606335379272L)};
    }

    public static d_ valueOf(String string) {
        return (d_)((Object)hi.a("G", d_.class, (Object)string, (long)703426484721789552L));
    }

    public static d_[] values() {
        return (d_[])((Enum)((Object)hi.a("j", (long)717987957059100306L))).clone();
    }
}
