/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class yR
extends Enum<yR> {
    public static final /* enum */ yR Above;
    private static final yR[] A;
    public static final /* enum */ yR DirectionBased;

    private static yR[] x(Object[] objectArray) {
        return new yR[]{hi.a("j", (long)812043548503656233L), hi.a("j", (long)763877819500432297L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "@iWy'\u000eEbJj!a#nezn1p.";
            var5_3 = "@iWy'\u000eEbJj!a#nezn1p.".length();
            var2_4 = 5;
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
            v4 = 107;
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
                            v11 = 106;
                            break;
                        }
                        case 1: {
                            v11 = 96;
                            break;
                        }
                        case 2: {
                            v11 = 83;
                            break;
                        }
                        case 3: {
                            v11 = 100;
                            break;
                        }
                        case 4: {
                            v11 = 41;
                            break;
                        }
                        case 5: {
                            v11 = 126;
                            break;
                        }
                        default: {
                            v11 = 33;
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
        yR.DirectionBased = new yR((Object)var0[1], 0);
        yR.Above = new yR((Object)var0[0], 1);
        yR.A = hi.a("G", (Object)new Object[0], (long)646798119131101056L);
    }

    public static yR[] values() {
        return (yR[])((Enum)((Object)hi.a("j", (long)894568099910174076L))).clone();
    }

    public static yR valueOf(String string) {
        return (yR)((Object)hi.a("G", yR.class, (Object)string, (long)703426484721789552L));
    }
}
