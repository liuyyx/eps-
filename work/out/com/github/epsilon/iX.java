/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class iX
extends Enum<iX> {
    private static final iX[] l;
    public static final /* enum */ iX Double;
    public static final /* enum */ iX Single;

    public static iX[] values() {
        return (iX[])((Enum)((Object)hi.a("j", (long)940380871156626624L))).clone();
    }

    public static iX valueOf(String string) {
        return (iX)((Object)hi.a("G", iX.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u00177/C\r\u001c\u0006\u000014F\r\u001c";
            var5_3 = "\u00177/C\r\u001c\u0006\u000014F\r\u001c".length();
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
            v4 = 27;
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
                            v11 = 72;
                            break;
                        }
                        case 1: {
                            v11 = 67;
                            break;
                        }
                        case 2: {
                            v11 = 65;
                            break;
                        }
                        case 3: {
                            v11 = 58;
                            break;
                        }
                        case 4: {
                            v11 = 122;
                            break;
                        }
                        case 5: {
                            v11 = 98;
                            break;
                        }
                        default: {
                            v11 = 121;
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
        iX.Single = new iX((Object)var0[1], 0);
        iX.Double = new iX((Object)var0[0], 1);
        iX.l = hi.a("G", (Object)new Object[0], (long)1014607039979496154L);
    }

    private static iX[] Q(Object[] objectArray) {
        return new iX[]{hi.a("j", (long)751376238799770247L), hi.a("j", (long)977775369664444962L)};
    }
}
