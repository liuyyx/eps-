/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class zY
extends Enum<zY> {
    private static final zY[] D;
    public static final /* enum */ zY Multi;
    public static final /* enum */ zY Off;
    public static final /* enum */ zY Single;

    private static zY[] n(Object[] objectArray) {
        return new zY[]{hi.a("j", (long)848164944455680538L), hi.a("j", (long)1011509129949734635L), hi.a("j", (long)769371395902478277L)};
    }

    public static zY[] values() {
        return (zY[])((Enum)((Object)hi.a("j", (long)486130130091580048L))).clone();
    }

    public static zY valueOf(String string) {
        return (zY)((Object)hi.a("G", zY.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\r\u000b\u001b/w\u001e\u0005\u0013\u0017\u0019<r\u0003\u0011\u0004\u0013";
            var5_3 = "\r\u000b\u001b/w\u001e\u0005\u0013\u0017\u0019<r\u0003\u0011\u0004\u0013".length();
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
            v4 = 56;
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
                            v11 = 102;
                            break;
                        }
                        case 1: {
                            v11 = 90;
                            break;
                        }
                        case 2: {
                            v11 = 77;
                            break;
                        }
                        case 3: {
                            v11 = 112;
                            break;
                        }
                        case 4: {
                            v11 = 35;
                            break;
                        }
                        case 5: {
                            v11 = 67;
                            break;
                        }
                        default: {
                            v11 = 119;
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
        zY.Off = new zY();
        zY.Single = new zY();
        zY.Multi = new zY();
        zY.D = hi.a("G", (Object)new Object[0], (long)410091887864674486L);
    }
}
