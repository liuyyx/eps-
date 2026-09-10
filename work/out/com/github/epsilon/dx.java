/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class dx
extends Enum<dx> {
    public static final /* enum */ dx AStar;
    private static final dx[] l;
    public static final /* enum */ dx Straight;

    private static dx[] H(Object[] objectArray) {
        return new dx[]{hi.a("j", (long)596012569370412339L), hi.a("j", (long)1116138719707845554L)};
    }

    public static dx[] values() {
        return (dx[])((Enum)((Object)hi.a("j", (long)465391389458646033L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u00058S0b\b\u0017\u001fU0yhH0";
            var5_3 = "\u00058S0b\b\u0017\u001fU0yhH0".length();
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
            v4 = 66;
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
                            v11 = 41;
                            break;
                        }
                        case 2: {
                            v11 = 101;
                            break;
                        }
                        case 3: {
                            v11 = 19;
                            break;
                        }
                        case 4: {
                            v11 = 82;
                            break;
                        }
                        case 5: {
                            v11 = 77;
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
        dx.Straight = new dx((Object)var0[1], 0);
        dx.AStar = new dx((Object)var0[0], 1);
        dx.l = hi.a("G", (Object)new Object[0], (long)1166568950184571706L);
    }

    public static dx valueOf(String string) {
        return (dx)((Object)hi.a("G", dx.class, (Object)string, (long)703426484721789552L));
    }
}
