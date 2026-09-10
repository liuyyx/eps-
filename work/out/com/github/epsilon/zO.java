/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class zO
extends Enum<zO> {
    private static final zO[] e;
    public static final /* enum */ zO Client;
    public static final /* enum */ zO None;
    public static final /* enum */ zO Packet;

    public static zO valueOf(String string) {
        return (zO)((Object)hi.a("G", zO.class, (Object)string, (long)703426484721789552L));
    }

    public static zO[] values() {
        return (zO[])((Enum)((Object)hi.a("j", (long)550949864000395396L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "R\u0014A#\u001a\u0017\u0004_\u0017F#\u0006A\u0019K-\u0011\u0017";
            var5_3 = "R\u0014A#\u001a\u0017\u0004_\u0017F#\u0006A\u0019K-\u0011\u0017".length();
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
            v4 = 58;
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
                            v11 = 43;
                            break;
                        }
                        case 1: {
                            v11 = 66;
                            break;
                        }
                        case 2: {
                            v11 = 18;
                            break;
                        }
                        case 3: {
                            v11 = 124;
                            break;
                        }
                        case 4: {
                            v11 = 78;
                            break;
                        }
                        case 5: {
                            v11 = 89;
                            break;
                        }
                        default: {
                            v11 = 85;
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
        zO.None = new zO();
        zO.Client = new zO();
        zO.Packet = new zO();
        zO.e = hi.a("G", (Object)new Object[0], (long)1062827466452018649L);
    }

    private static zO[] I(Object[] objectArray) {
        return new zO[]{hi.a("j", (long)485565064758029441L), hi.a("j", (long)1212158869802292457L), hi.a("j", (long)939352576653150038L)};
    }
}
