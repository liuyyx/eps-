/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class DB
extends Enum<DB> {
    public static final /* enum */ DB Fall;
    private static final DB[] h;
    public static final /* enum */ DB Fly;

    public static DB[] values() {
        return (DB[])((Enum)((Object)hi.a("j", (long)1291552508003886045L))).clone();
    }

    private static DB[] Q(Object[] objectArray) {
        return new DB[]{hi.a("j", (long)441303035586271029L), hi.a("j", (long)1282918637170209772L)};
    }

    public static DB valueOf(String string) {
        return (DB)((Object)hi.a("G", DB.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "*UR\u0004*XG?";
            var5_3 = "*UR\u0004*XG?".length();
            var2_4 = 3;
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
            v4 = 90;
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
                            v11 = 54;
                            break;
                        }
                        case 1: {
                            v11 = 99;
                            break;
                        }
                        case 2: {
                            v11 = 113;
                            break;
                        }
                        case 3: {
                            v11 = 9;
                            break;
                        }
                        case 4: {
                            v11 = 10;
                            break;
                        }
                        case 5: {
                            v11 = 64;
                            break;
                        }
                        default: {
                            v11 = 2;
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
        DB.Fall = new DB((Object)var0[1], 0);
        DB.Fly = new DB((Object)var0[0], 1);
        DB.h = hi.a("G", (Object)new Object[0], (long)359853546255209979L);
    }
}
