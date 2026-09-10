/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class OH
extends Enum<OH> {
    public static final /* enum */ OH Quad;
    public static final /* enum */ OH NotHole;
    private static final /* synthetic */ OH[] W;
    public static final /* enum */ OH DoubleZ;
    public static final /* enum */ OH Single;
    public static final /* enum */ OH DoubleX;

    private static /* synthetic */ OH[] p(Object[] objectArray) {
        return new OH[]{hi.a("j", (long)901747059870378999L), hi.a("j", (long)503474481794071210L), hi.a("j", (long)356927996386200710L), hi.a("j", (long)1198449137727898323L), hi.a("j", (long)1102154324729175414L)};
    }

    public static OH[] values() {
        return (OH[])((Enum)((Object)hi.a("j", (long)525460489699519122L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "`)c_\u0007u3wY3F0\u0007u3wY3F2";
                var5_3 = "`)c_\u0007u3wY3F0\u0007u3wY3F2".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 45;
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
                    var3_2 = "\u0015Y\u001c\u0019Z%g\u0006\b_\u00066Y,";
                    var5_3 = "\u0015Y\u001c\u0019Z%g\u0006\b_\u00066Y,".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 71;
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
                            v15 = 28;
                            break;
                        }
                        case 1: {
                            v15 = 113;
                            break;
                        }
                        case 2: {
                            v15 = 47;
                            break;
                        }
                        case 3: {
                            v15 = 22;
                            break;
                        }
                        case 4: {
                            v15 = 114;
                            break;
                        }
                        case 5: {
                            v15 = 14;
                            break;
                        }
                        default: {
                            v15 = 69;
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
        OH.NotHole = new OH((Object)var0[3], 0);
        OH.Single = new OH((Object)var0[4], 1);
        OH.DoubleX = new OH((Object)var0[1], 2);
        OH.DoubleZ = new OH((Object)var0[2], 3);
        OH.Quad = new OH((Object)var0[0], 4);
        OH.W = hi.a("G", (Object)new Object[0], (long)1179495582911058248L);
    }

    public static OH valueOf(String string) {
        return (OH)((Object)hi.a("G", OH.class, (Object)string, (long)703426484721789552L));
    }
}
