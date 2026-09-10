/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class yf
extends Enum<yf> {
    public static final /* enum */ yf Hide;
    private static final yf[] m;
    public static final /* enum */ yf Vanilla;
    public static final /* enum */ yf None;

    public static yf valueOf(String string) {
        return (yf)((Object)hi.a("G", yf.class, (Object)string, (long)703426484721789552L));
    }

    public static yf[] values() {
        return (yf[])((Enum)((Object)hi.a("j", (long)482079495055705404L))).clone();
    }

    private static yf[] v(Object[] objectArray) {
        return new yf[]{hi.a("j", (long)493324227358920610L), hi.a("j", (long)1274255778700201145L), hi.a("j", (long)1215001220083910120L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "Qj-\r\u0007Ob'\u0001\rgn\u0004Wl'\r";
            var5_3 = "Qj-\r\u0007Ob'\u0001\rgn\u0004Wl'\r".length();
            var2_4 = 4;
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
            v4 = 35;
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
                            v11 = 58;
                            break;
                        }
                        case 1: {
                            v11 = 32;
                            break;
                        }
                        case 2: {
                            v11 = 106;
                            break;
                        }
                        case 3: {
                            v11 = 75;
                            break;
                        }
                        case 4: {
                            v11 = 66;
                            break;
                        }
                        case 5: {
                            v11 = 40;
                            break;
                        }
                        default: {
                            v11 = 44;
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
        yf.None = new yf((Object)var0[2], 0);
        yf.Hide = new yf((Object)var0[0], 1);
        yf.Vanilla = new yf((Object)var0[1], 2);
        yf.m = hi.a("G", (Object)new Object[0], (long)1006917179014061752L);
    }
}
