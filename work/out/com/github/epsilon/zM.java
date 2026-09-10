/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class zM
extends Enum<zM> {
    public static final /* enum */ zM Adaptive;
    private static final zM[] T;
    public static final /* enum */ zM Cover;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "O<\u0001/\u0010\u0014|k\u0005M7\u0016:\u0016";
            var5_3 = "O<\u0001/\u0010\u0014|k\u0005M7\u0016:\u0016".length();
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
            v4 = 18;
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
                            v11 = 28;
                            break;
                        }
                        case 1: {
                            v11 = 74;
                            break;
                        }
                        case 2: {
                            v11 = 114;
                            break;
                        }
                        case 3: {
                            v11 = 77;
                            break;
                        }
                        case 4: {
                            v11 = 118;
                            break;
                        }
                        case 5: {
                            v11 = 111;
                            break;
                        }
                        default: {
                            v11 = 24;
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
        zM.Adaptive = new zM((Object)var0[0], 0);
        zM.Cover = new zM((Object)var0[1], 1);
        zM.T = hi.a("G", (Object)new Object[0], (long)681098437568011979L);
    }

    private static zM[] K(Object[] objectArray) {
        return new zM[]{hi.a("j", (long)371070254794073710L), hi.a("j", (long)395698219134702381L)};
    }

    public static zM[] values() {
        return (zM[])((Enum)((Object)hi.a("j", (long)1173239262852017928L))).clone();
    }

    public static zM valueOf(String string) {
        return (zM)((Object)hi.a("G", zM.class, (Object)string, (long)703426484721789552L));
    }
}
