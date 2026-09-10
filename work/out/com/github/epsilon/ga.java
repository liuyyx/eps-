/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class ga
extends Enum<ga> {
    public static final /* enum */ ga Backwards;
    public static final /* enum */ ga Centered;
    private static final ga[] K;

    private static ga[] i(Object[] objectArray) {
        return new ga[]{hi.a("j", (long)1154197975825677082L), hi.a("j", (long)932638087179771651L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u0007\u0010c\u00045+6 \t\u0006\u0014n\u001b'8! \u0006";
            var5_3 = "\u0007\u0010c\u00045+6 \t\u0006\u0014n\u001b'8! \u0006".length();
            var2_4 = 8;
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
            v4 = 19;
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
                            v11 = 87;
                            break;
                        }
                        case 1: {
                            v11 = 102;
                            break;
                        }
                        case 2: {
                            v11 = 30;
                            break;
                        }
                        case 3: {
                            v11 = 99;
                            break;
                        }
                        case 4: {
                            v11 = 67;
                            break;
                        }
                        case 5: {
                            v11 = 74;
                            break;
                        }
                        default: {
                            v11 = 64;
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
        ga.Backwards = new ga((Object)var0[1], 0);
        ga.Centered = new ga((Object)var0[0], 1);
        ga.K = hi.a("G", (Object)new Object[0], (long)481320812636602142L);
    }

    public static ga[] values() {
        return (ga[])((Enum)((Object)hi.a("j", (long)879693605503068718L))).clone();
    }

    public static ga valueOf(String string) {
        return (ga)((Object)hi.a("G", ga.class, (Object)string, (long)703426484721789552L));
    }
}
