/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class yB
extends Enum<yB> {
    public static final /* enum */ yB None;
    public static final /* enum */ yB Color;
    private static final yB[] p;
    public static final /* enum */ yB Scoreboard;

    public static yB[] values() {
        return (yB[])((Enum)((Object)hi.a("j", (long)798345378486912119L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "d\u00189Z\n-LV\t2\u0005t\u0014:G\u001d\u0004y\u00148M";
            var5_3 = "d\u00189Z\n-LV\t2\u0005t\u0014:G\u001d\u0004y\u00148M".length();
            var2_4 = 10;
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
                            v11 = 110;
                            break;
                        }
                        case 1: {
                            v11 = 34;
                            break;
                        }
                        case 2: {
                            v11 = 15;
                            break;
                        }
                        case 3: {
                            v11 = 113;
                            break;
                        }
                        case 4: {
                            v11 = 54;
                            break;
                        }
                        case 5: {
                            v11 = 22;
                            break;
                        }
                        default: {
                            v11 = 122;
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
        yB.None = new yB((Object)var0[2], 0);
        yB.Color = new yB((Object)var0[1], 1);
        yB.Scoreboard = new yB((Object)var0[0], 2);
        yB.p = hi.a("G", (Object)new Object[0], (long)629811973384500204L);
    }

    private static yB[] X(Object[] objectArray) {
        return new yB[]{hi.a("j", (long)391286998559650079L), hi.a("j", (long)1142690764202413207L), hi.a("j", (long)1112947195450243667L)};
    }

    public static yB valueOf(String string) {
        return (yB)((Object)hi.a("G", yB.class, (Object)string, (long)703426484721789552L));
    }
}
