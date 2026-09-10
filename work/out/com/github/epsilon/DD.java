/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class DD
extends Enum<DD> {
    public static final /* enum */ DD Both;
    public static final /* enum */ DD Notification;
    public static final /* enum */ DD Chat;
    private static final DD[] A;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\rsA/\f\u0000tT2\nz\f/oI4\u0002\u0004\ftT3";
            var5_3 = "\rsA/\f\u0000tT2\nz\f/oI4\u0002\u0004\ftT3".length();
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
            v4 = 68;
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
                            v11 = 10;
                            break;
                        }
                        case 1: {
                            v11 = 95;
                            break;
                        }
                        case 2: {
                            v11 = 100;
                            break;
                        }
                        case 3: {
                            v11 = 31;
                            break;
                        }
                        case 4: {
                            v11 = 40;
                            break;
                        }
                        case 5: {
                            v11 = 87;
                            break;
                        }
                        default: {
                            v11 = 43;
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
        DD.Chat = new DD((Object)var0[0], 0);
        DD.Notification = new DD((Object)var0[1], 1);
        DD.Both = new DD((Object)var0[2], 2);
        DD.A = hi.a("G", (Object)new Object[0], (long)1011654916179306429L);
    }

    public static DD valueOf(String string) {
        return (DD)((Object)hi.a("G", DD.class, (Object)string, (long)703426484721789552L));
    }

    private static DD[] p(Object[] objectArray) {
        return new DD[]{hi.a("j", (long)406733810543061454L), hi.a("j", (long)756478174858561066L), hi.a("j", (long)844904967427994501L)};
    }

    public static DD[] values() {
        return (DD[])((Enum)((Object)hi.a("j", (long)965017225224040383L))).clone();
    }
}
