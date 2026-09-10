/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class dG
extends Enum<dG> {
    public static final /* enum */ dG TXT;
    private static final dG[] k;
    public static final /* enum */ dG SENTENCE;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "J?z\bM\"`s:J\u0006[";
            var5_3 = "J?z\bM\"`s:J\u0006[".length();
            var2_4 = 3;
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
            v4 = 24;
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
                            v11 = 6;
                            break;
                        }
                        case 1: {
                            v11 = 127;
                            break;
                        }
                        case 2: {
                            v11 = 54;
                            break;
                        }
                        case 3: {
                            v11 = 63;
                            break;
                        }
                        case 4: {
                            v11 = 103;
                            break;
                        }
                        case 5: {
                            v11 = 28;
                            break;
                        }
                        default: {
                            v11 = 93;
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
        dG.TXT = new dG((Object)var0[0], 0);
        dG.SENTENCE = new dG((Object)var0[1], 1);
        dG.k = hi.a("G", (Object)new Object[0], (long)950771920864280670L);
    }

    private static dG[] L(Object[] objectArray) {
        return new dG[]{hi.a("j", (long)900554527249041553L), hi.a("j", (long)657007874764371602L)};
    }

    public static dG valueOf(String string) {
        return (dG)((Object)hi.a("G", dG.class, (Object)string, (long)703426484721789552L));
    }

    public static dG[] values() {
        return (dG[])((Enum)((Object)hi.a("j", (long)1131894020014320061L))).clone();
    }
}
