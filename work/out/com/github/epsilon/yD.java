/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class yD
extends Enum<yD> {
    public static final /* enum */ yD Visible;
    public static final /* enum */ yD Silent;
    private static final yD[] K;

    private static yD[] h(Object[] objectArray) {
        return new yD[]{hi.a("j", (long)1242535819607886805L), hi.a("j", (long)999689795761065226L)};
    }

    public static yD[] values() {
        return (yD[])((Enum)((Object)hi.a("j", (long)473282964552051469L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "Ai\u0018\t\u0010e\u0007Di\u0007\u0005\u001c}\\";
            var5_3 = "Ai\u0018\t\u0010e\u0007Di\u0007\u0005\u001c}\\".length();
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
            v4 = 35;
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
                            v11 = 49;
                            break;
                        }
                        case 1: {
                            v11 = 35;
                            break;
                        }
                        case 2: {
                            v11 = 87;
                            break;
                        }
                        case 3: {
                            v11 = 79;
                            break;
                        }
                        case 4: {
                            v11 = 93;
                            break;
                        }
                        case 5: {
                            v11 = 50;
                            break;
                        }
                        default: {
                            v11 = 26;
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
        yD.Visible = new yD((Object)var0[1], 0);
        yD.Silent = new yD((Object)var0[0], 1);
        yD.K = hi.a("G", (Object)new Object[0], (long)1039025941203357759L);
    }

    public static yD valueOf(String string) {
        return (yD)((Object)hi.a("G", yD.class, (Object)string, (long)703426484721789552L));
    }
}
