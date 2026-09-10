/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class OI
extends Enum<OI> {
    private static final OI[] e;
    public static final /* enum */ OI Solid;
    public static final /* enum */ OI Gradient;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "@\tHT\u0011\u0002(s\u0005T\u0014EY\u001c";
            var5_3 = "@\tHT\u0011\u0002(s\u0005T\u0014EY\u001c".length();
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
            v4 = 36;
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
                            v11 = 95;
                            break;
                        }
                        case 2: {
                            v11 = 13;
                            break;
                        }
                        case 3: {
                            v11 = 20;
                            break;
                        }
                        case 4: {
                            v11 = 92;
                            break;
                        }
                        case 5: {
                            v11 = 67;
                            break;
                        }
                        default: {
                            v11 = 98;
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
        OI.Solid = new OI((Object)var0[1], 0);
        OI.Gradient = new OI((Object)var0[0], 1);
        OI.e = hi.a("G", (Object)new Object[0], (long)880714513297250342L);
    }

    public static OI[] values() {
        return (OI[])((Enum)((Object)hi.a("j", (long)774657813692013455L))).clone();
    }

    public static OI valueOf(String string) {
        return (OI)((Object)hi.a("G", OI.class, (Object)string, (long)703426484721789552L));
    }

    private static OI[] p(Object[] objectArray) {
        return new OI[]{hi.a("j", (long)697965646885037759L), hi.a("j", (long)1317935044417972855L)};
    }
}
