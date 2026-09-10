/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class lT
extends Enum<lT> {
    public static final /* enum */ lT Balance;
    private static final lT[] S;
    public static final /* enum */ lT Always;
    public static final /* enum */ lT SlowBalance;

    public static lT valueOf(String string) {
        return (lT)((Object)hi.a("G", lT.class, (Object)string, (long)703426484721789552L));
    }

    public static lT[] values() {
        return (lT[])((Enum)((Object)hi.a("j", (long)1160164138343436766L))).clone();
    }

    private static lT[] D(Object[] objectArray) {
        return new lT[]{hi.a("j", (long)554025410335496729L), hi.a("j", (long)610031633870170951L), hi.a("j", (long)768146591378541132L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "FE\u0013z\\\u0014\u0007EH\bzK\u0004\u0001\u000bTE\u000blg\u0006\bfG\u0007~";
            var5_3 = "FE\u0013z\\\u0014\u0007EH\bzK\u0004\u0001\u000bTE\u000blg\u0006\bfG\u0007~".length();
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
            v4 = 62;
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
                            v11 = 57;
                            break;
                        }
                        case 1: {
                            v11 = 23;
                            break;
                        }
                        case 2: {
                            v11 = 90;
                            break;
                        }
                        case 3: {
                            v11 = 37;
                            break;
                        }
                        case 4: {
                            v11 = 27;
                            break;
                        }
                        case 5: {
                            v11 = 89;
                            break;
                        }
                        default: {
                            v11 = 90;
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
        lT.Always = new lT((Object)var0[0], 0);
        lT.Balance = new lT((Object)var0[1], 1);
        lT.SlowBalance = new lT((Object)var0[2], 2);
        lT.S = hi.a("G", (Object)new Object[0], (long)1333942378883974629L);
    }
}
