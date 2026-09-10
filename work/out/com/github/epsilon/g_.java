/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class g_
extends Enum<g_> {
    public static final /* enum */ g_ AimAssist;
    private static final g_[] b;
    public static final /* enum */ g_ BowAim;

    public static g_ valueOf(String string) {
        return (g_)((Object)hi.a("G", g_.class, (Object)string, (long)703426484721789552L));
    }

    private static g_[] Z(Object[] objectArray) {
        return new g_[]{hi.a("j", (long)756582747519640360L), hi.a("j", (long)577928010809934046L)};
    }

    public static g_[] values() {
        return (g_[])((Enum)((Object)hi.a("j", (long)1197426336707614233L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "M\u0018sA&s\tN\u001eiA<mc|\u0003";
            var5_3 = "M\u0018sA&s\tN\u001eiA<mc|\u0003".length();
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
            v4 = 76;
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
                            v11 = 67;
                            break;
                        }
                        case 1: {
                            v11 = 59;
                            break;
                        }
                        case 2: {
                            v11 = 72;
                            break;
                        }
                        case 3: {
                            v11 = 76;
                            break;
                        }
                        case 4: {
                            v11 = 3;
                            break;
                        }
                        case 5: {
                            v11 = 82;
                            break;
                        }
                        default: {
                            v11 = 70;
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
        g_.AimAssist = new g_((Object)var0[1], 0);
        g_.BowAim = new g_((Object)var0[0], 1);
        g_.b = hi.a("G", (Object)new Object[0], (long)736757823229574110L);
    }
}
