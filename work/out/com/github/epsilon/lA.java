/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class lA
extends Enum<lA> {
    public static final /* enum */ lA Default;
    public static final /* enum */ lA Pre_1_14;
    private static final lA[] C;
    public static final /* enum */ lA Custom;
    public static final /* enum */ lA Pre_1_9;

    private static lA[] e(Object[] objectArray) {
        return new lA[]{hi.a("j", (long)525065133851724916L), hi.a("j", (long)546286292862258234L), hi.a("j", (long)1206592858152239970L), hi.a("j", (long)463400295964623158L)};
    }

    public static lA valueOf(String string) {
        return (lA)((Object)hi.a("G", lA.class, (Object)string, (long)703426484721789552L));
    }

    public static lA[] values() {
        return (lA[])((Enum)((Object)hi.a("j", (long)1208695776575348764L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "]&LyD#\u0007Z6Yl^\"f";
                var5_3 = "]&LyD#\u0007Z6Yl^\"f".length();
                var2_4 = 6;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 104;
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
                    var3_2 = "B-V^\u0016\u001d'\bB-V^\u0016\u001d/&";
                    var5_3 = "B-V^\u0016\u001d'\bB-V^\u0016\u001d/&".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 100;
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
                            v15 = 118;
                            break;
                        }
                        case 1: {
                            v15 = 59;
                            break;
                        }
                        case 2: {
                            v15 = 87;
                            break;
                        }
                        case 3: {
                            v15 = 101;
                            break;
                        }
                        case 4: {
                            v15 = 67;
                            break;
                        }
                        case 5: {
                            v15 = 38;
                            break;
                        }
                        default: {
                            v15 = 122;
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
        lA.Default = new lA((Object)var0[1], 0);
        lA.Custom = new lA((Object)var0[0], 1);
        lA.Pre_1_14 = new lA((Object)var0[3], 2);
        lA.Pre_1_9 = new lA((Object)var0[2], 3);
        lA.C = hi.a("G", (Object)new Object[0], (long)1279160839391717173L);
    }
}
