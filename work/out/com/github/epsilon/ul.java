/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class ul
extends Enum<ul> {
    public static final /* enum */ ul IDLE;
    public static final /* enum */ ul READY_TO_EXECUTE;
    private static final ul[] E;
    public static final /* enum */ ul WAITING_FOR_INVENTORY_CLOSE;
    public static final /* enum */ ul WAITING_FOR_SPRINT_STOP;

    public static ul valueOf(String string) {
        return (ul)((Object)hi.a("G", ul.class, (Object)string, (long)703426484721789552L));
    }

    private static ul[] i(Object[] objectArray) {
        return new ul[]{hi.a("j", (long)669539097074851102L), hi.a("j", (long)1282602281907129836L), hi.a("j", (long)472748872333798469L), hi.a("j", (long)557927702321373114L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "$/3.\u0017~O,(5(\u0001yF%+4.\u0011bQ,-65\ru\u0004:*6?";
                var5_3 = "$/3.\u0017~O,(5(\u0001yF%+4.\u0011bQ,-65\ru\u0004:*6?".length();
                var2_4 = 27;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 34;
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
                    var3_2 = "KAQTm\u00056V[UHq\u00197MA\u0017NEYD}\u0014%FB_Bk\t2KM^Dk\t6VT";
                    var5_3 = "KAQTm\u00056V[UHq\u00197MA\u0017NEYD}\u0014%FB_Bk\t2KM^Dk\t6VT".length();
                    var2_4 = 16;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 72;
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
                            v15 = 81;
                            break;
                        }
                        case 1: {
                            v15 = 76;
                            break;
                        }
                        case 2: {
                            v15 = 88;
                            break;
                        }
                        case 3: {
                            v15 = 88;
                            break;
                        }
                        case 4: {
                            v15 = 124;
                            break;
                        }
                        case 5: {
                            v15 = 18;
                            break;
                        }
                        default: {
                            v15 = 42;
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
        ul.IDLE = new ul((Object)var0[1], 0);
        ul.WAITING_FOR_SPRINT_STOP = new ul((Object)var0[3], 1);
        ul.READY_TO_EXECUTE = new ul((Object)var0[2], 2);
        ul.WAITING_FOR_INVENTORY_CLOSE = new ul((Object)var0[0], 3);
        ul.E = hi.a("G", (Object)new Object[0], (long)859944802228166143L);
    }

    public static ul[] values() {
        return (ul[])((Enum)((Object)hi.a("j", (long)385914890795371403L))).clone();
    }
}
