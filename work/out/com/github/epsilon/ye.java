/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class ye
extends Enum<ye> {
    private static final ye[] X;
    public static final /* enum */ ye VanillaAndModded;
    public static final /* enum */ ye Off;
    public static final /* enum */ ye VanillaOnly;

    private static ye[] h(Object[] objectArray) {
        return new ye[]{hi.a("j", (long)434019235099384971L), hi.a("j", (long)559107057578943300L), hi.a("j", (long)738716305923567103L)};
    }

    public static ye[] values() {
        return (ye[])((Enum)((Object)hi.a("j", (long)731608670774279771L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = " \u00146\u001e\nJ89\u001b4\u000e\u00039\u0013>\u0010 \u00146\u001e\nJ87\u001b<:\tB=\u0013\u0011";
            var5_3 = " \u00146\u001e\nJ89\u001b4\u000e\u00039\u0013>\u0010 \u00146\u001e\nJ87\u001b<:\tB=\u0013\u0011".length();
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
            v4 = 101;
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
                            v11 = 19;
                            break;
                        }
                        case 1: {
                            v11 = 16;
                            break;
                        }
                        case 2: {
                            v11 = 61;
                            break;
                        }
                        case 3: {
                            v11 = 18;
                            break;
                        }
                        case 4: {
                            v11 = 3;
                            break;
                        }
                        case 5: {
                            v11 = 67;
                            break;
                        }
                        default: {
                            v11 = 60;
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
        ye.VanillaAndModded = new ye((Object)var0[2], 0);
        ye.VanillaOnly = new ye((Object)var0[0], 1);
        ye.Off = new ye((Object)var0[1], 2);
        ye.X = hi.a("G", (Object)new Object[0], (long)1120750183385982229L);
    }

    public static ye valueOf(String string) {
        return (ye)((Object)hi.a("G", ye.class, (Object)string, (long)703426484721789552L));
    }
}
