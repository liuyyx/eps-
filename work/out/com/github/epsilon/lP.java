/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class lP
extends Enum<lP> {
    public static final /* enum */ lP FONT_BLUR;
    public static final /* enum */ lP STANDARD;
    private static final lP[] C;
    public static final /* enum */ lP GLITCH;

    public static lP valueOf(String string) {
        return (lP)((Object)hi.a("G", lP.class, (Object)string, (long)703426484721789552L));
    }

    private static lP[] b(Object[] objectArray) {
        return new lP[]{hi.a("j", (long)989245393182426574L), hi.a("j", (long)621934944740959210L), hi.a("j", (long)1195562796857282876L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u0001$& TY\u0010\u0016\u0006\u0015<.:SP\t\u0014?):OZ\u000e\u0007\"";
            var5_3 = "\u0001$& TY\u0010\u0016\u0006\u0015<.:SP\t\u0014?):OZ\u000e\u0007\"".length();
            var2_4 = 8;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 89;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 11;
                            break;
                        }
                        case 1: {
                            v11 = 41;
                            break;
                        }
                        case 2: {
                            v11 = 62;
                            break;
                        }
                        case 3: {
                            v11 = 55;
                            break;
                        }
                        case 4: {
                            v11 = 73;
                            break;
                        }
                        case 5: {
                            v11 = 65;
                            break;
                        }
                        default: {
                            v11 = 27;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        lP.STANDARD = new lP((Object)var0[0], 0);
        lP.FONT_BLUR = new lP((Object)var0[2], 1);
        lP.GLITCH = new lP((Object)var0[1], 2);
        lP.C = hi.a("G", (Object)new Object[0], (long)1129208567479508986L);
    }

    public static lP[] values() {
        return (lP[])((Enum)((Object)hi.a("j", (long)448268103584623496L))).clone();
    }
}
