/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class D8
extends Enum<D8> {
    public static final /* enum */ D8 Sakura;
    public static final /* enum */ D8 Tradition;
    public static final /* enum */ D8 Glitch;
    private static final D8[] U;

    public static D8[] values() {
        return (D8[])((Enum)((Object)hi.a("j", (long)419588923407936835L))).clone();
    }

    public static D8 valueOf(String string) {
        return (D8)((Object)hi.a("G", D8.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u0011`\u0018H\u0007\u001b\t\u0002~\u0010X\r\u0007\u001e9b\u0006\u0005m\u001aI\u0016\u0012";
            var5_3 = "\u0011`\u0018H\u0007\u001b\t\u0002~\u0010X\r\u0007\u001e9b\u0006\u0005m\u001aI\u0016\u0012".length();
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
            v4 = 81;
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
                            v11 = 7;
                            break;
                        }
                        case 1: {
                            v11 = 93;
                            break;
                        }
                        case 2: {
                            v11 = 32;
                            break;
                        }
                        case 3: {
                            v11 = 109;
                            break;
                        }
                        case 4: {
                            v11 = 53;
                            break;
                        }
                        case 5: {
                            v11 = 34;
                            break;
                        }
                        default: {
                            v11 = 38;
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
        D8.Tradition = new D8((Object)var0[1], 0);
        D8.Glitch = new D8((Object)var0[0], 1);
        D8.Sakura = new D8((Object)var0[2], 2);
        D8.U = hi.a("G", (Object)new Object[0], (long)541700601854835954L);
    }

    private static D8[] G(Object[] objectArray) {
        return new D8[]{hi.a("j", (long)372688195392109950L), hi.a("j", (long)1117959398261413354L), hi.a("j", (long)482642119582642787L)};
    }
}
