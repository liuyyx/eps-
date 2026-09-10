/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class yh
extends Enum<yh> {
    public static final /* enum */ yh MainHand;
    public static final /* enum */ yh OffHand;
    public static final /* enum */ yh Auto;
    private static final yh[] y;

    public static yh[] values() {
        return (yh[])((Enum)((Object)hi.a("j", (long)1206361718673286003L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "L\u0000F&\u0007B\u0013T\u0001IU\u001c\b@\u0014['`Z\u0016i";
            var5_3 = "L\u0000F&\u0007B\u0013T\u0001IU\u001c\b@\u0014['`Z\u0016i".length();
            var2_4 = 4;
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
            v4 = 111;
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
                            v11 = 98;
                            break;
                        }
                        case 1: {
                            v11 = 26;
                            break;
                        }
                        case 2: {
                            v11 = 93;
                            break;
                        }
                        case 3: {
                            v11 = 38;
                            break;
                        }
                        case 4: {
                            v11 = 71;
                            break;
                        }
                        case 5: {
                            v11 = 84;
                            break;
                        }
                        default: {
                            v11 = 23;
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
        yh.Auto = new yh();
        yh.OffHand = new yh();
        yh.MainHand = new yh();
        yh.y = hi.a("G", (Object)new Object[0], (long)1096213901916896282L);
    }

    private static yh[] x(Object[] objectArray) {
        return new yh[]{hi.a("j", (long)990380610561749221L), hi.a("j", (long)1171171686074774679L), hi.a("j", (long)607599548811699259L)};
    }

    public static yh valueOf(String string) {
        return (yh)((Object)hi.a("G", yh.class, (Object)string, (long)703426484721789552L));
    }
}
