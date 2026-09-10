/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class n1
extends Enum<n1> {
    public static final /* enum */ n1 Vanilla;
    public static final /* enum */ n1 Flux;
    private static final n1[] Z;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u001aC\u001ftR^|\u0004\nN\u0004e";
            var5_3 = "\u001aC\u001ftR^|\u0004\nN\u0004e".length();
            var2_4 = 7;
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
                            v11 = 12;
                            break;
                        }
                        case 1: {
                            v11 = 98;
                            break;
                        }
                        case 2: {
                            v11 = 49;
                            break;
                        }
                        case 3: {
                            v11 = 93;
                            break;
                        }
                        case 4: {
                            v11 = 126;
                            break;
                        }
                        case 5: {
                            v11 = 114;
                            break;
                        }
                        default: {
                            v11 = 93;
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
        n1.Vanilla = new n1((Object)var0[0], 0);
        n1.Flux = new n1((Object)var0[1], 1);
        n1.Z = hi.a("G", (Object)new Object[0], (long)674327722546031328L);
    }

    public static n1 valueOf(String string) {
        return (n1)((Object)hi.a("G", n1.class, (Object)string, (long)703426484721789552L));
    }

    public static n1[] values() {
        return (n1[])((Enum)((Object)hi.a("j", (long)826572342375888693L))).clone();
    }

    private static n1[] O(Object[] objectArray) {
        return new n1[]{hi.a("j", (long)448108977778085471L), hi.a("j", (long)706931938171142171L)};
    }
}
