/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class Xb
extends Enum<Xb> {
    public static final /* enum */ Xb Off;
    public static final /* enum */ Xb Target;
    public static final /* enum */ Xb All;
    private static final Xb[] L;
    public static final /* enum */ Xb Own;
    public static final /* enum */ Xb Smart;

    public static Xb valueOf(String string) {
        return (Xb)((Object)hi.a("G", Xb.class, (Object)string, (long)703426484721789552L));
    }

    public static Xb[] values() {
        return (Xb[])((Enum)((Object)hi.a("j", (long)450307323944758469L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "\u0019\u0002V\u0010F\u0003\u000b\u0003[\u0003\u0005\tQ";
                var5_3 = "\u0019\u0002V\u0010F\u0003\u000b\u0003[\u0003\u0005\tQ".length();
                var2_4 = 5;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 28;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "\u0016\u000bJ\u0006\r\u001dV\u0016D\u0015";
                    var5_3 = "\u0016\u000bJ\u0006\r\u001dV\u0016D\u0015".length();
                    var2_4 = 3;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 15;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 86;
                            break;
                        }
                        case 1: {
                            v15 = 115;
                            break;
                        }
                        case 2: {
                            v15 = 43;
                            break;
                        }
                        case 3: {
                            v15 = 126;
                            break;
                        }
                        case 4: {
                            v15 = 46;
                            break;
                        }
                        case 5: {
                            v15 = 110;
                            break;
                        }
                        default: {
                            v15 = 98;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        Xb.Off = new Xb();
        Xb.Target = new Xb();
        Xb.Own = new Xb();
        Xb.Smart = new Xb();
        Xb.All = new Xb();
        Xb.L = hi.a("G", (Object)new Object[0], (long)1294533125005282975L);
    }

    private static Xb[] W(Object[] objectArray) {
        return new Xb[]{hi.a("j", (long)1030877938940914149L), hi.a("j", (long)1197375334151743051L), hi.a("j", (long)746479205504874057L), hi.a("j", (long)598537723579758540L), hi.a("j", (long)1012696635322366800L)};
    }
}
