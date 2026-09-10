/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class vN
extends Enum<vN> {
    public static final /* enum */ vN Name;
    public static final /* enum */ vN Addon;
    private static final vN[] D;
    public static final /* enum */ vN EnabledFirst;

    public static vN[] values() {
        return (vN[])((Enum)((Object)hi.a("j", (long)464724384847208877L))).clone();
    }

    private static vN[] t(Object[] objectArray) {
        return new vN[]{hi.a("j", (long)845471826287803998L), hi.a("j", (long)420989547959966654L), hi.a("j", (long)395818649220901320L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u007f>D\bX\u0014h|9W\u0019@\u0004t1H\u000f\u0005{4A\u0005Z";
            var5_3 = "\u007f>D\bX\u0014h|9W\u0019@\u0004t1H\u000f\u0005{4A\u0005Z".length();
            var2_4 = 12;
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
            v4 = 110;
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
                            v11 = 84;
                            break;
                        }
                        case 1: {
                            v11 = 62;
                            break;
                        }
                        case 2: {
                            v11 = 75;
                            break;
                        }
                        case 3: {
                            v11 = 4;
                            break;
                        }
                        case 4: {
                            v11 = 90;
                            break;
                        }
                        case 5: {
                            v11 = 31;
                            break;
                        }
                        default: {
                            v11 = 98;
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
        vN.Name = new vN((Object)var0[1], 0);
        vN.EnabledFirst = new vN((Object)var0[0], 1);
        vN.Addon = new vN((Object)var0[2], 2);
        vN.D = hi.a("G", (Object)new Object[0], (long)1307006619439071677L);
    }

    public static vN valueOf(String string) {
        return (vN)((Object)hi.a("G", vN.class, (Object)string, (long)703426484721789552L));
    }
}
