/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class uy
extends Enum<uy> {
    public static final /* enum */ uy Backwards;
    private static final uy[] K;
    public static final /* enum */ uy NoForwards;
    public static final /* enum */ uy StopSprinting;

    public static uy valueOf(String string) {
        return (uy)((Object)hi.a("G", uy.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "p\u000bG\u0000W\u0011\u0018J\u0011\\\u0019j\u0006\ta\u001eK\u001bs\u0000\u0018G\f\nm\u0010n\u001fv\u0016\u000bQ\u001b[";
            var5_3 = "p\u000bG\u0000W\u0011\u0018J\u0011\\\u0019j\u0006\ta\u001eK\u001bs\u0000\u0018G\f\nm\u0010n\u001fv\u0016\u000bQ\u001b[".length();
            var2_4 = 13;
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
            v4 = 60;
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
                            v11 = 31;
                            break;
                        }
                        case 1: {
                            v11 = 67;
                            break;
                        }
                        case 2: {
                            v11 = 20;
                            break;
                        }
                        case 3: {
                            v11 = 76;
                            break;
                        }
                        case 4: {
                            v11 = 56;
                            break;
                        }
                        case 5: {
                            v11 = 93;
                            break;
                        }
                        default: {
                            v11 = 86;
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
        uy.StopSprinting = new uy((Object)var0[0], 0);
        uy.Backwards = new uy((Object)var0[1], 1);
        uy.NoForwards = new uy((Object)var0[2], 2);
        uy.K = hi.a("G", (Object)new Object[0], (long)1144437934124143276L);
    }

    public static uy[] values() {
        return (uy[])((Enum)((Object)hi.a("j", (long)1170895400753601996L))).clone();
    }

    private static uy[] i(Object[] objectArray) {
        return new uy[]{hi.a("j", (long)723586900574557739L), hi.a("j", (long)841878785901738226L), hi.a("j", (long)1056160032870512744L)};
    }
}
