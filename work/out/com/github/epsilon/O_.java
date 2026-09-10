/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class O_
extends Enum<O_> {
    private static final O_[] z;
    public static final /* enum */ O_ Custom;
    public static final /* enum */ O_ Sync;

    private static O_[] h(Object[] objectArray) {
        return new O_[]{hi.a("j", (long)392363387708696458L), hi.a("j", (long)1075961602807477795L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u00021v\u0003\u0015d\u0004\u0012=k\u0014";
            var5_3 = "\u00021v\u0003\u0015d\u0004\u0012=k\u0014".length();
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
            v4 = 41;
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
                            v11 = 104;
                            break;
                        }
                        case 1: {
                            v11 = 109;
                            break;
                        }
                        case 2: {
                            v11 = 44;
                            break;
                        }
                        case 3: {
                            v11 = 94;
                            break;
                        }
                        case 4: {
                            v11 = 83;
                            break;
                        }
                        case 5: {
                            v11 = 32;
                            break;
                        }
                        default: {
                            v11 = 63;
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
        O_.Custom = new O_((Object)var0[0], 0);
        O_.Sync = new O_((Object)var0[1], 1);
        O_.z = hi.a("G", (Object)new Object[0], (long)571092391292067261L);
    }

    public static O_[] values() {
        return (O_[])((Enum)((Object)hi.a("j", (long)1244041568592636634L))).clone();
    }

    public static O_ valueOf(String string) {
        return (O_)((Object)hi.a("G", O_.class, (Object)string, (long)703426484721789552L));
    }
}
