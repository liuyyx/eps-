/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class d6
extends Enum<d6> {
    private static final d6[] B;
    public static final /* enum */ d6 OnePointNinePlus;
    public static final /* enum */ d6 OnePointEight;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "r\n\bq5K\u000bI*\u0004O?r\tH\u0017\rr\n\bq5K\u000bI!\u0004F2V";
            var5_3 = "r\n\bq5K\u000bI*\u0004O?r\tH\u0017\rr\n\bq5K\u000bI!\u0004F2V".length();
            var2_4 = 16;
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
            v4 = 37;
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
                            v11 = 24;
                            break;
                        }
                        case 1: {
                            v11 = 65;
                            break;
                        }
                        case 2: {
                            v11 = 72;
                            break;
                        }
                        case 3: {
                            v11 = 4;
                            break;
                        }
                        case 4: {
                            v11 = 127;
                            break;
                        }
                        case 5: {
                            v11 = 7;
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
        d6.OnePointEight = new d6((Object)var0[1], 0);
        d6.OnePointNinePlus = new d6((Object)var0[0], 1);
        d6.B = hi.a("G", (Object)new Object[0], (long)730262492052832321L);
    }

    public static d6[] values() {
        return (d6[])((Enum)((Object)hi.a("j", (long)1117128471277182852L))).clone();
    }

    private static d6[] C(Object[] objectArray) {
        return new d6[]{hi.a("j", (long)520935203988888442L), hi.a("j", (long)585325835917699352L)};
    }

    public static d6 valueOf(String string) {
        return (d6)((Object)hi.a("G", d6.class, (Object)string, (long)703426484721789552L));
    }
}
