/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class g9
extends Enum<g9> {
    public static final /* enum */ g9 Range;
    public static final /* enum */ g9 Attack;
    private static final g9[] E;

    public static g9 valueOf(String string) {
        return (g9)((Object)hi.a("G", g9.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u000b\u0005k'\u007f\t\u0005\u0018\u0010q!y";
            var5_3 = "\u000b\u0005k'\u007f\t\u0005\u0018\u0010q!y".length();
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
            v4 = 59;
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
                            v11 = 113;
                            break;
                        }
                        case 1: {
                            v11 = 74;
                            break;
                        }
                        case 2: {
                            v11 = 36;
                            break;
                        }
                        case 3: {
                            v11 = 125;
                            break;
                        }
                        case 4: {
                            v11 = 39;
                            break;
                        }
                        case 5: {
                            v11 = 89;
                            break;
                        }
                        default: {
                            v11 = 123;
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
        g9.Attack = new g9((Object)var0[0], 0);
        g9.Range = new g9((Object)var0[1], 1);
        g9.E = hi.a("G", (Object)new Object[0], (long)1069384098874509240L);
    }

    public static g9[] values() {
        return (g9[])((Enum)((Object)hi.a("j", (long)1243715591810555107L))).clone();
    }

    private static g9[] Y(Object[] objectArray) {
        return new g9[]{hi.a("j", (long)434745218391946730L), hi.a("j", (long)902312954634320770L)};
    }
}
