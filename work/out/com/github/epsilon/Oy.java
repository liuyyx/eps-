/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class Oy
extends Enum<Oy> {
    public static final /* enum */ Oy DoubleZ;
    public static final /* enum */ Oy Quad;
    public static final /* enum */ Oy DoubleX;
    private static final Oy[] v;
    public static final /* enum */ Oy Single;

    public static Oy[] values() {
        return (Oy[])((Enum)((Object)hi.a("j", (long)851168657668017209L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "9Gd:\u0006;[k9{P";
                var5_3 = "9Gd:\u0006;[k9{P".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 91;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "\r|Q\u001dZqs\u0007\r|Q\u001dZqq";
                    var5_3 = "\r|Q\u001dZqs\u0007\r|Q\u001dZqq".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 122;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 51;
                            break;
                        }
                        case 1: {
                            v15 = 105;
                            break;
                        }
                        case 2: {
                            v15 = 94;
                            break;
                        }
                        case 3: {
                            v15 = 5;
                            break;
                        }
                        case 4: {
                            v15 = 76;
                            break;
                        }
                        case 5: {
                            v15 = 110;
                            break;
                        }
                        default: {
                            v15 = 81;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        Oy.Single = new Oy((Object)var0[1], 0);
        Oy.DoubleX = new Oy((Object)var0[2], 1);
        Oy.DoubleZ = new Oy((Object)var0[3], 2);
        Oy.Quad = new Oy((Object)var0[0], 3);
        Oy.v = hi.a("G", (Object)new Object[0], (long)741023429590703678L);
    }

    public static Oy valueOf(String string) {
        return (Oy)((Object)hi.a("G", Oy.class, (Object)string, (long)703426484721789552L));
    }

    private static Oy[] C(Object[] objectArray) {
        return new Oy[]{hi.a("j", (long)417550219549502207L), hi.a("j", (long)470233281332403429L), hi.a("j", (long)1002235447002820110L), hi.a("j", (long)1039287321566444874L)};
    }
}
