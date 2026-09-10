/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class nZ
extends Enum<nZ> {
    public static final /* enum */ nZ Pitch40;
    public static final /* enum */ nZ Control;
    private static final /* synthetic */ nZ[] g;

    public static nZ valueOf(String string) {
        return (nZ)((Object)hi.a("G", nZ.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u0014c\u001e\bu<Z\u0007\u0007e\u0004\u001fog\u0006";
            var5_3 = "\u0014c\u001e\bu<Z\u0007\u0007e\u0004\u001fog\u0006".length();
            var2_4 = 7;
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
            v4 = 1;
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
                            v11 = 86;
                            break;
                        }
                        case 1: {
                            v11 = 13;
                            break;
                        }
                        case 2: {
                            v11 = 113;
                            break;
                        }
                        case 3: {
                            v11 = 125;
                            break;
                        }
                        case 4: {
                            v11 = 6;
                            break;
                        }
                        case 5: {
                            v11 = 82;
                            break;
                        }
                        default: {
                            v11 = 55;
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
        nZ.Control = new nZ((Object)var0[0], 0);
        nZ.Pitch40 = new nZ((Object)var0[1], 1);
        nZ.g = hi.a("G", (Object)new Object[0], (long)904650597939770446L);
    }

    private static /* synthetic */ nZ[] r(Object[] objectArray) {
        return new nZ[]{hi.a("j", (long)1241595054848115486L), hi.a("j", (long)560380943379648391L)};
    }

    public static nZ[] values() {
        return (nZ[])((Enum)((Object)hi.a("j", (long)745381913298479192L))).clone();
    }
}
