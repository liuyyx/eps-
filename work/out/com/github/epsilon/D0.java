/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class D0
extends Enum<D0> {
    public static final /* enum */ D0 CCClip;
    public static final /* enum */ D0 Pearl;
    private static final D0[] X;
    public static final /* enum */ D0 Vanilla;
    public static final /* enum */ D0 ForceMine;
    public static final /* enum */ D0 Sunrise;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "7\u0014db>]\r\t\"\u000exs2c\u0001\n\u0004\u0006'\"I|>^";
                var5_3 = "7\u0014db>]\r\t\"\u000exs2c\u0001\n\u0004\u0006'\"I|>^".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 88;
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
                    var3_2 = "<\u000ejw5L\u0007\u0005:\nel5";
                    var5_3 = "<\u000ejw5L\u0007\u0005:\nel5".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 86;
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
                            v15 = 60;
                            break;
                        }
                        case 1: {
                            v15 = 57;
                            break;
                        }
                        case 2: {
                            v15 = 82;
                            break;
                        }
                        case 3: {
                            v15 = 72;
                            break;
                        }
                        case 4: {
                            v15 = 15;
                            break;
                        }
                        case 5: {
                            v15 = 118;
                            break;
                        }
                        default: {
                            v15 = 48;
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
        D0.Vanilla = new D0((Object)var0[3], 0);
        D0.Pearl = new D0((Object)var0[4], 1);
        D0.Sunrise = new D0((Object)var0[0], 2);
        D0.ForceMine = new D0((Object)var0[1], 3);
        D0.CCClip = new D0((Object)var0[2], 4);
        D0.X = hi.a("G", (Object)new Object[0], (long)1232111253234923584L);
    }

    public static D0[] values() {
        return (D0[])((Enum)((Object)hi.a("j", (long)1273991998433503259L))).clone();
    }

    private static D0[] A(Object[] objectArray) {
        return new D0[]{hi.a("j", (long)568796307780275075L), hi.a("j", (long)662470324093410984L), hi.a("j", (long)1101973778652024801L), hi.a("j", (long)1001506286048776213L), hi.a("j", (long)584773752600948348L)};
    }

    public static D0 valueOf(String string) {
        return (D0)((Object)hi.a("G", D0.class, (Object)string, (long)703426484721789552L));
    }
}
