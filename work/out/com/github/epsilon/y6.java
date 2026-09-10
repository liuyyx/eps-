/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class y6
extends Enum<y6> {
    public static final /* enum */ y6 Range;
    public static final /* enum */ y6 None;
    public static final /* enum */ y6 Fov;
    private static final y6[] q;
    public static final /* enum */ y6 Health;

    private static y6[] a(Object[] objectArray) {
        return new y6[]{hi.a("j", (long)1313151723732419313L), hi.a("j", (long)474052976681733837L), hi.a("j", (long)431558111236634137L), hi.a("j", (long)481553394997760102L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "Ie!\u0010\u0005Uk!\u0012f";
                var5_3 = "Ie!\u0010\u0005Uk!\u0012f".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 50;
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
                    var3_2 = "iI\b?QJ\u0003gC\u001f";
                    var5_3 = "iI\b?QJ\u0003gC\u001f".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 20;
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
                            v15 = 53;
                            break;
                        }
                        case 1: {
                            v15 = 56;
                            break;
                        }
                        case 2: {
                            v15 = 125;
                            break;
                        }
                        case 3: {
                            v15 = 71;
                            break;
                        }
                        case 4: {
                            v15 = 49;
                            break;
                        }
                        case 5: {
                            v15 = 54;
                            break;
                        }
                        default: {
                            v15 = 93;
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
        y6.None = new y6((Object)var0[0], 0);
        y6.Health = new y6((Object)var0[2], 1);
        y6.Fov = new y6((Object)var0[3], 2);
        y6.Range = new y6((Object)var0[1], 3);
        y6.q = hi.a("G", (Object)new Object[0], (long)1082440965324789977L);
    }

    public static y6 valueOf(String string) {
        return (y6)((Object)hi.a("G", y6.class, (Object)string, (long)703426484721789552L));
    }

    public static y6[] values() {
        return (y6[])((Enum)((Object)hi.a("j", (long)783422791068433289L))).clone();
    }
}
