/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class vn
extends Enum<vn> {
    public static final /* enum */ vn COLOR_PICKER;
    private static final vn[] D;
    public static final /* enum */ vn KEY_BIND;
    public static final /* enum */ vn ENUM_SELECT;
    public static final /* enum */ vn NONE;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "=)\u001ao\f0)\u0018e,k\":%\u001fo,";
                var5_3 = "=)\u001ao\f0)\u0018e,k\":%\u001fo,".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 93;
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
                    var3_2 = "\u001c\u0002+M\u000bM\u001d\u0015\t=T\b\u0012\t'_\u0016W\u0016\u001d";
                    var5_3 = "\u001c\u0002+M\u000bM\u001d\u0015\t=T\b\u0012\t'_\u0016W\u0016\u001d".length();
                    var2_4 = 11;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 119;
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
                            v15 = 46;
                            break;
                        }
                        case 1: {
                            v15 = 59;
                            break;
                        }
                        case 2: {
                            v15 = 9;
                            break;
                        }
                        case 3: {
                            v15 = 119;
                            break;
                        }
                        case 4: {
                            v15 = 35;
                            break;
                        }
                        case 5: {
                            v15 = 105;
                            break;
                        }
                        default: {
                            v15 = 47;
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
        vn.NONE = new vn((Object)var0[0], 0);
        vn.ENUM_SELECT = new vn((Object)var0[2], 1);
        vn.KEY_BIND = new vn((Object)var0[3], 2);
        vn.COLOR_PICKER = new vn((Object)var0[1], 3);
        vn.D = hi.a("G", (Object)new Object[0], (long)1127591695487712552L);
    }

    public static vn[] values() {
        return (vn[])((Enum)((Object)hi.a("j", (long)1305190113462575652L))).clone();
    }

    public static vn valueOf(String string) {
        return (vn)((Object)hi.a("G", vn.class, (Object)string, (long)703426484721789552L));
    }

    private static vn[] r(Object[] objectArray) {
        return new vn[]{hi.a("j", (long)1090653591137250741L), hi.a("j", (long)1028660381913669722L), hi.a("j", (long)1136371011737067588L), hi.a("j", (long)1090123680009223053L)};
    }
}
