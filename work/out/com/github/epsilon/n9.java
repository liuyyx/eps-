/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class n9
extends Enum<n9> {
    public static final /* enum */ n9 RightTop;
    public static final /* enum */ n9 LeftBottom;
    public static final /* enum */ n9 RightBottom;
    private static final n9[] A;
    public static final /* enum */ n9 LeftTop;
    public static final /* enum */ n9 None;

    public static n9 valueOf(String string) {
        return (n9)((Object)hi.a("G", n9.class, (Object)string, (long)703426484721789552L));
    }

    public static n9[] values() {
        return (n9[])((Enum)((Object)hi.a("j", (long)1133675443498902734L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "J\u001f\\\u0013\nH\u0015T\u0002}{/p\u001f_\u0007H\u0015T\u0002k{+";
                var5_3 = "J\u001f\\\u0013\nH\u0015T\u0002}{/p\u001f_\u0007H\u0015T\u0002k{+".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 60;
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
                    var3_2 = "$k'l92F\u0006\u000b$k'l9$F\u0002v/i";
                    var5_3 = "$k'l92F\u0006\u000b$k'l9$F\u0002v/i".length();
                    var2_4 = 8;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 78;
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
                            v15 = 56;
                            break;
                        }
                        case 1: {
                            v15 = 76;
                            break;
                        }
                        case 2: {
                            v15 = 14;
                            break;
                        }
                        case 3: {
                            v15 = 74;
                            break;
                        }
                        case 4: {
                            v15 = 3;
                            break;
                        }
                        case 5: {
                            v15 = 40;
                            break;
                        }
                        default: {
                            v15 = 103;
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
        n9.None = new n9((Object)var0[0], 0);
        n9.LeftTop = new n9((Object)var0[2], 1);
        n9.RightTop = new n9((Object)var0[3], 2);
        n9.LeftBottom = new n9((Object)var0[1], 3);
        n9.RightBottom = new n9((Object)var0[4], 4);
        n9.A = hi.a("G", (Object)new Object[0], (long)764465730587645742L);
    }

    private static n9[] P(Object[] objectArray) {
        return new n9[]{hi.a("j", (long)1291686572608242644L), hi.a("j", (long)1217771449773958284L), hi.a("j", (long)562315701040209299L), hi.a("j", (long)545691954151922967L), hi.a("j", (long)1236197500520590144L)};
    }
}
