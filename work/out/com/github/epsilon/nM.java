/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class nM
extends Enum<nM> {
    public static final /* enum */ nM Normal;
    public static final /* enum */ nM Grow;
    public static final /* enum */ nM Box;
    private static final nM[] B;
    public static final /* enum */ nM Shrink;

    public static nM[] values() {
        return (nM[])((Enum)((Object)hi.a("j", (long)1016862159680256492L))).clone();
    }

    private static nM[] k(Object[] objectArray) {
        return new nM[]{hi.a("j", (long)600611239186938771L), hi.a("j", (long)356587447209746000L), hi.a("j", (long)1259809445516505496L), hi.a("j", (long)1068800479010605361L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "=U\u001ce\u00064H\u0001\u007fm8";
                var5_3 = "=U\u001ce\u00064H\u0001\u007fm8".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 67;
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
                    var3_2 = ",\\\u001f\u0006=[\u0015ov+";
                    var5_3 = ",\\\u001f\u0006=[\u0015ov+".length();
                    var2_4 = 3;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 87;
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
                            v15 = 57;
                            break;
                        }
                        case 1: {
                            v15 = 100;
                            break;
                        }
                        case 2: {
                            v15 = 48;
                            break;
                        }
                        case 3: {
                            v15 = 81;
                            break;
                        }
                        case 4: {
                            v15 = 79;
                            break;
                        }
                        case 5: {
                            v15 = 23;
                            break;
                        }
                        default: {
                            v15 = 121;
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
        nM.Box = new nM((Object)var0[2], 0);
        nM.Normal = new nM((Object)var0[1], 1);
        nM.Shrink = new nM((Object)var0[3], 2);
        nM.Grow = new nM((Object)var0[0], 3);
        nM.B = hi.a("G", (Object)new Object[0], (long)771883480242226481L);
    }

    public static nM valueOf(String string) {
        return (nM)((Object)hi.a("G", nM.class, (Object)string, (long)703426484721789552L));
    }
}
