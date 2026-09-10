/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class lr
extends Enum<lr> {
    public static final /* enum */ lr Down;
    public static final /* enum */ lr V1_7;
    public static final /* enum */ lr Ninja;
    public static final /* enum */ lr Leaked;
    public static final /* enum */ lr Pushdown;
    private static final lr[] h;
    public static final /* enum */ lr Scale;
    private static final long a;

    public static lr valueOf(String string) {
        return (lr)((Object)hi.a("G", lr.class, (Object)string, (long)703426484721789552L));
    }

    public static lr[] values() {
        return (lr[])((Enum)((Object)hi.a("j", (long)1203352585722093241L))).clone();
    }

    private static lr[] V(Object[] objectArray) {
        lr[] lrArray = new lr[(int)a];
        lrArray[0] = hi.a("j", (long)763965459525339782L);
        lrArray[1] = hi.a("j", (long)357215261370766596L);
        lrArray[2] = hi.a("j", (long)1041290786994706620L);
        lrArray[3] = hi.a("j", (long)1142644523972023288L);
        lrArray[4] = hi.a("j", (long)914339803415349607L);
        lrArray[5] = hi.a("j", (long)404496550662928916L);
        return lrArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "\u0000&_y`\u0004\u0017*I{\u0006\u001f _~`M\u0004\u0005ta\"";
                var7_3 = "\u0000&_y`\u0004\u0017*I{\u0006\u001f _~`M\u0004\u0005ta\"".length();
                var4_4 = 5;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 7;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "+\u0018eUIn:\u0015\u00055\u0004xWL";
                    var7_3 = "+\u0018eUIn:\u0015\u00055\u0004xWL".length();
                    var4_4 = 8;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 47;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 84;
                            break;
                        }
                        case 1: {
                            v15 = 66;
                            break;
                        }
                        case 2: {
                            v15 = 57;
                            break;
                        }
                        case 3: {
                            v15 = 18;
                            break;
                        }
                        case 4: {
                            v15 = 2;
                            break;
                        }
                        case 5: {
                            v15 = 46;
                            break;
                        }
                        default: {
                            v15 = 98;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3333413919106178104L;
        ** while (true)
        lr.a = -5322592955126866882L ^ var0_7;
        lr.V1_7 = new lr((Object)var2[3], 0);
        lr.Pushdown = new lr((Object)var2[4], 1);
        lr.Scale = new lr((Object)var2[0], 2);
        lr.Leaked = new lr((Object)var2[2], 3);
        lr.Ninja = new lr((Object)var2[5], 4);
        lr.Down = new lr((Object)var2[1], 5);
        lr.h = hi.a("G", (Object)new Object[0], (long)821308241335694749L);
    }
}
