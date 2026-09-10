/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class lL
extends Enum<lL> {
    public static final /* enum */ lL Protection;
    private static final lL[] Q;
    public static final /* enum */ lL Blast;

    private static lL[] g(Object[] objectArray) {
        return new lL[]{hi.a("j", (long)1321909611595738136L), hi.a("j", (long)1240378299467175712L)};
    }

    public static lL[] values() {
        return (lL[])((Enum)((Object)hi.a("j", (long)946017417406369868L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "b\u001e\"'l\np\u0000, }\u001c\u001fI\u001d-";
            var5_3 = "b\u001e\"'l\np\u0000, }\u001c\u001fI\u001d-".length();
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
            v4 = 123;
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
                            v11 = 91;
                            break;
                        }
                        case 1: {
                            v11 = 9;
                            break;
                        }
                        case 2: {
                            v11 = 56;
                            break;
                        }
                        case 3: {
                            v11 = 47;
                            break;
                        }
                        case 4: {
                            v11 = 99;
                            break;
                        }
                        case 5: {
                            v11 = 4;
                            break;
                        }
                        default: {
                            v11 = 16;
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
        lL.Blast = new lL((Object)var0[0], 0);
        lL.Protection = new lL((Object)var0[1], 1);
        lL.Q = hi.a("G", (Object)new Object[0], (long)560512896377603662L);
    }

    public static lL valueOf(String string) {
        return (lL)((Object)hi.a("G", lL.class, (Object)string, (long)703426484721789552L));
    }
}
