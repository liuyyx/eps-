/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class zi
extends Enum<zi> {
    public static final /* enum */ zi New;
    public static final /* enum */ zi Old;
    private static final zi[] q;

    public static zi[] values() {
        return (zi[])((Enum)((Object)hi.a("j", (long)525912515348917962L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u0002CY\u0003\u0003JJ";
            var5_3 = "\u0002CY\u0003\u0003JJ".length();
            var2_4 = 3;
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
            v4 = 120;
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
                            v11 = 52;
                            break;
                        }
                        case 1: {
                            v11 = 94;
                            break;
                        }
                        case 2: {
                            v11 = 86;
                            break;
                        }
                        case 3: {
                            v11 = 30;
                            break;
                        }
                        case 4: {
                            v11 = 78;
                            break;
                        }
                        case 5: {
                            v11 = 68;
                            break;
                        }
                        default: {
                            v11 = 127;
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
        zi.Old = new zi((Object)var0[1], 0);
        zi.New = new zi((Object)var0[0], 1);
        zi.q = hi.a("G", (Object)new Object[0], (long)672457113610017899L);
    }

    private static zi[] l(Object[] objectArray) {
        return new zi[]{hi.a("j", (long)1249932480552354958L), hi.a("j", (long)576106384618206409L)};
    }

    public static zi valueOf(String string) {
        return (zi)((Object)hi.a("G", zi.class, (Object)string, (long)703426484721789552L));
    }
}
