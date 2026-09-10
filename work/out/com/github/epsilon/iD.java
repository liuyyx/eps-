/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class iD
extends Enum<iD> {
    private static final iD[] X;
    public static final /* enum */ iD SILENT;
    public static final /* enum */ iD SNAP;

    private static iD[] y(Object[] objectArray) {
        return new iD[]{hi.a("j", (long)1172693569690285050L), hi.a("j", (long)647363788097878249L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "P.wfxP\u0004P)zs";
            var5_3 = "P.wfxP\u0004P)zs".length();
            var2_4 = 6;
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
            v4 = 84;
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
                            v11 = 87;
                            break;
                        }
                        case 1: {
                            v11 = 51;
                            break;
                        }
                        case 2: {
                            v11 = 111;
                            break;
                        }
                        case 3: {
                            v11 = 119;
                            break;
                        }
                        case 4: {
                            v11 = 98;
                            break;
                        }
                        case 5: {
                            v11 = 80;
                            break;
                        }
                        default: {
                            v11 = 72;
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
        iD.SILENT = new iD((Object)var0[0], 0);
        iD.SNAP = new iD((Object)var0[1], 1);
        iD.X = hi.a("G", (Object)new Object[0], (long)1010298035562931641L);
    }

    public static iD[] values() {
        return (iD[])((Enum)((Object)hi.a("j", (long)1136168619410630816L))).clone();
    }

    public static iD valueOf(String string) {
        return (iD)((Object)hi.a("G", iD.class, (Object)string, (long)703426484721789552L));
    }
}
