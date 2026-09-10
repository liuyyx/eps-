/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class vT
extends Enum<vT> {
    public static final /* enum */ vT VERTICAL;
    public static final /* enum */ vT HORIZONTAL;
    private static final vT[] o;

    public static vT[] values() {
        return (vT[])((Enum)((Object)hi.a("j", (long)467935980278358771L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "A,\u001b0\u001eG\u0013]\"\u0005\b_&\u001b-\rK\u001cE";
            var5_3 = "A,\u001b0\u001eG\u0013]\"\u0005\b_&\u001b-\rK\u001cE".length();
            var2_4 = 10;
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
            v4 = 64;
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
                            v11 = 73;
                            break;
                        }
                        case 1: {
                            v11 = 35;
                            break;
                        }
                        case 2: {
                            v11 = 9;
                            break;
                        }
                        case 3: {
                            v11 = 57;
                            break;
                        }
                        case 4: {
                            v11 = 4;
                            break;
                        }
                        case 5: {
                            v11 = 72;
                            break;
                        }
                        default: {
                            v11 = 29;
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
        vT.HORIZONTAL = new vT((Object)var0[0], 0);
        vT.VERTICAL = new vT((Object)var0[1], 1);
        vT.o = hi.a("G", (Object)new Object[0], (long)720531971581611397L);
    }

    public static vT valueOf(String string) {
        return (vT)((Object)hi.a("G", vT.class, (Object)string, (long)703426484721789552L));
    }

    private static vT[] c(Object[] objectArray) {
        return new vT[]{hi.a("j", (long)564170527753856773L), hi.a("j", (long)649788751872100844L)};
    }
}
