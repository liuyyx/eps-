/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class vW
extends Enum<vW> {
    public static final /* enum */ vW Ignore;
    private static final vW[] x;
    public static final /* enum */ vW Always;
    public static final /* enum */ vW ElytraPlus;
    public static final /* enum */ vW None;

    public static vW valueOf(String string) {
        return (vW)((Object)hi.a("G", vW.class, (Object)string, (long)703426484721789552L));
    }

    private static vW[] b(Object[] objectArray) {
        return new vW[]{hi.a("j", (long)1173108059353559480L), hi.a("j", (long)1301962094182038374L), hi.a("j", (long)562237393044360941L), hi.a("j", (long)1114349329983995078L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u0011\u001el)\u0000BC8\u0007f\u0004\u001a\u001d{8";
                var5_3 = "\u0011\u001el)\u0000BC8\u0007f\u0004\u001a\u001d{8".length();
                var2_4 = 10;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 52;
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
                    var3_2 = "2:T\u001d/i\u0006:1M\u0013$\u007f";
                    var5_3 = "2:T\u001d/i\u0006:1M\u0013$\u007f".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 27;
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
                            v15 = 96;
                            break;
                        }
                        case 1: {
                            v15 = 70;
                            break;
                        }
                        case 2: {
                            v15 = 33;
                            break;
                        }
                        case 3: {
                            v15 = 105;
                            break;
                        }
                        case 4: {
                            v15 = 70;
                            break;
                        }
                        case 5: {
                            v15 = 23;
                            break;
                        }
                        default: {
                            v15 = 39;
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
        vW.None = new vW((Object)var0[1], 0);
        vW.Always = new vW((Object)var0[3], 1);
        vW.ElytraPlus = new vW((Object)var0[0], 2);
        vW.Ignore = new vW((Object)var0[2], 3);
        vW.x = hi.a("G", (Object)new Object[0], (long)1136073160658667133L);
    }

    public static vW[] values() {
        return (vW[])((Enum)((Object)hi.a("j", (long)922346174328000000L))).clone();
    }
}
