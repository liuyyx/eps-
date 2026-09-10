/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class iy
extends Enum<iy> {
    private static final iy[] p;
    public static final /* enum */ iy Mace;
    public static final /* enum */ iy Normal;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "Q-P\b2\u001f\u0004R#A\u0000";
            var5_3 = "Q-P\b2\u001f\u0004R#A\u0000".length();
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
            v4 = 109;
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
                            v11 = 114;
                            break;
                        }
                        case 1: {
                            v11 = 47;
                            break;
                        }
                        case 2: {
                            v11 = 79;
                            break;
                        }
                        case 3: {
                            v11 = 8;
                            break;
                        }
                        case 4: {
                            v11 = 62;
                            break;
                        }
                        case 5: {
                            v11 = 30;
                            break;
                        }
                        default: {
                            v11 = 12;
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
        iy.Normal = new iy((Object)var0[0], 0);
        iy.Mace = new iy((Object)var0[1], 1);
        iy.p = hi.a("G", (Object)new Object[0], (long)533877844812728997L);
    }

    private static iy[] H(Object[] objectArray) {
        return new iy[]{hi.a("j", (long)410611282572420230L), hi.a("j", (long)855762769159878897L)};
    }

    public static iy valueOf(String string) {
        return (iy)((Object)hi.a("G", iy.class, (Object)string, (long)703426484721789552L));
    }

    public static iy[] values() {
        return (iy[])((Enum)((Object)hi.a("j", (long)1131428988025269216L))).clone();
    }
}
