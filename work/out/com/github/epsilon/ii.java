/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class ii
extends Enum<ii> {
    public static final /* enum */ ii Dark;
    public static final /* enum */ ii Light;
    private static final ii[] t;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u0011=N\u0013 \u0004\u00195[\u0010";
            var5_3 = "\u0011=N\u0013 \u0004\u00195[\u0010".length();
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
            v4 = 67;
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
                            v11 = 30;
                            break;
                        }
                        case 1: {
                            v11 = 23;
                            break;
                        }
                        case 2: {
                            v11 = 106;
                            break;
                        }
                        case 3: {
                            v11 = 56;
                            break;
                        }
                        case 4: {
                            v11 = 23;
                            break;
                        }
                        case 5: {
                            v11 = 107;
                            break;
                        }
                        default: {
                            v11 = 43;
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
        ii.Dark = new ii((Object)var0[1], 0);
        ii.Light = new ii((Object)var0[0], 1);
        ii.t = hi.a("G", (Object)new Object[0], (long)815757521198044033L);
    }

    private static ii[] q(Object[] objectArray) {
        return new ii[]{hi.a("j", (long)1190839861366256060L), hi.a("j", (long)843775961949430890L)};
    }

    public static ii[] values() {
        return (ii[])((Enum)((Object)hi.a("j", (long)388259696364393744L))).clone();
    }

    public static ii valueOf(String string) {
        return (ii)((Object)hi.a("G", ii.class, (Object)string, (long)703426484721789552L));
    }
}
