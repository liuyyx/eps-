/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class y5
extends Enum<y5> {
    private static final y5[] c;
    public static final /* enum */ y5 ChargeFirst;
    public static final /* enum */ y5 ShieldFirst;

    private static y5[] N(Object[] objectArray) {
        return new y5[]{hi.a("j", (long)940328637054144199L), hi.a("j", (long)517375611115668903L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "m\u0015\u001c\u0018\u0010>3G\u000f\u000e\u001e\u000b}\u0015\u0014\u000f\u001b?3G\u000f\u000e\u001e";
            var5_3 = "m\u0015\u001c\u0018\u0010>3G\u000f\u000e\u001e\u000b}\u0015\u0014\u000f\u001b?3G\u000f\u000e\u001e".length();
            var2_4 = 11;
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
                            v11 = 47;
                            break;
                        }
                        case 1: {
                            v11 = 124;
                            break;
                        }
                        case 2: {
                            v11 = 124;
                            break;
                        }
                        case 3: {
                            v11 = 107;
                            break;
                        }
                        case 4: {
                            v11 = 118;
                            break;
                        }
                        case 5: {
                            v11 = 90;
                            break;
                        }
                        default: {
                            v11 = 116;
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
        y5.ShieldFirst = new y5((Object)var0[1], 0);
        y5.ChargeFirst = new y5((Object)var0[0], 1);
        y5.c = hi.a("G", (Object)new Object[0], (long)420810932817325205L);
    }

    public static y5 valueOf(String string) {
        return (y5)((Object)hi.a("G", y5.class, (Object)string, (long)703426484721789552L));
    }

    public static y5[] values() {
        return (y5[])((Enum)((Object)hi.a("j", (long)1025870515640693257L))).clone();
    }
}
