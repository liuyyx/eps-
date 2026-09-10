/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class Du
extends Enum<Du> {
    public static final /* enum */ Du Delay;
    public static final /* enum */ Du Reduce;
    private static final Du[] y;
    public static final /* enum */ Du Cancel;

    private static Du[] z(Object[] objectArray) {
        return new Du[]{hi.a("j", (long)498248678294831819L), hi.a("j", (long)1036173946877624669L), hi.a("j", (long)921962334355011170L)};
    }

    public static Du valueOf(String string) {
        return (Du)((Object)hi.a("G", Du.class, (Object)string, (long)703426484721789552L));
    }

    public static Du[] values() {
        return (Du[])((Enum)((Object)hi.a("j", (long)831476538198132234L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "w{1z3a\u0006f\u007f;l5h\u0005a{9n)";
            var5_3 = "w{1z3a\u0006f\u007f;l5h\u0005a{9n)".length();
            var2_4 = 6;
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
            v4 = 6;
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
                            v11 = 35;
                            break;
                        }
                        case 1: {
                            v11 = 24;
                            break;
                        }
                        case 2: {
                            v11 = 83;
                            break;
                        }
                        case 3: {
                            v11 = 9;
                            break;
                        }
                        case 4: {
                            v11 = 86;
                            break;
                        }
                        case 5: {
                            v11 = 2;
                            break;
                        }
                        default: {
                            v11 = 88;
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
        Du.Cancel = new Du((Object)var0[1], 0);
        Du.Reduce = new Du((Object)var0[0], 1);
        Du.Delay = new Du((Object)var0[2], 2);
        Du.y = hi.a("G", (Object)new Object[0], (long)479139800512348068L);
    }
}
