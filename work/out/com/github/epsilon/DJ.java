/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class DJ
extends Enum<DJ> {
    public static final /* enum */ DJ TheAltening;
    public static final /* enum */ DJ Cracked;
    private static final /* synthetic */ DJ[] f;
    public static final /* enum */ DJ Session;
    public static final /* enum */ DJ Microsoft;

    private static /* synthetic */ DJ[] k(Object[] objectArray) {
        return new DJ[]{hi.a("j", (long)803108192655186905L), hi.a("j", (long)874965402212012820L), hi.a("j", (long)897826413736069381L), hi.a("j", (long)1231058544381614959L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u0002T\u0003w_pV)I\u0007\fO\u0001f[f]";
                var5_3 = "\u0002T\u0003w_pV)I\u0007\fO\u0001f[f]".length();
                var2_4 = 9;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 14;
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
                    var3_2 = "f(x9!\n!\\)s\u001f\u0007a%n\u000b$\u0011*";
                    var5_3 = "f(x9!\n!\\)s\u001f\u0007a%n\u000b$\u0011*".length();
                    var2_4 = 11;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 115;
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
                            v15 = 65;
                            break;
                        }
                        case 1: {
                            v15 = 51;
                            break;
                        }
                        case 2: {
                            v15 = 110;
                            break;
                        }
                        case 3: {
                            v15 = 11;
                            break;
                        }
                        case 4: {
                            v15 = 62;
                            break;
                        }
                        case 5: {
                            v15 = 13;
                            break;
                        }
                        default: {
                            v15 = 55;
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
        DJ.Cracked = new DJ((Object)var0[1], 0);
        DJ.Microsoft = new DJ((Object)var0[0], 1);
        DJ.TheAltening = new DJ((Object)var0[2], 2);
        DJ.Session = new DJ((Object)var0[3], 3);
        DJ.f = hi.a("G", (Object)new Object[0], (long)539768058014122971L);
    }

    public static DJ[] values() {
        return (DJ[])((Enum)((Object)hi.a("j", (long)1211360904063570460L))).clone();
    }

    public static DJ valueOf(String string) {
        return (DJ)((Object)hi.a("G", DJ.class, (Object)string, (long)703426484721789552L));
    }
}
