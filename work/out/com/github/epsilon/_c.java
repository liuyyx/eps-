/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class _c
extends Enum<_c> {
    public static final /* enum */ _c CaptureMark;
    public static final /* enum */ _c Deobf;
    public static final /* enum */ _c Circle;
    public static final /* enum */ _c Firefly;
    private static final _c[] u;

    public static _c[] values() {
        return (_c[])((Enum)((Object)hi.a("j", (long)382422796435729260L))).clone();
    }

    public static _c valueOf(String string) {
        return (_c)((Object)hi.a("G", _c.class, (Object)string, (long)703426484721789552L));
    }

    private static _c[] D(Object[] objectArray) {
        return new _c[]{hi.a("j", (long)1193866327045333285L), hi.a("j", (long)918502104200369066L), hi.a("j", (long)442768343842576908L), hi.a("j", (long)644742351621817192L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "}v# J$P\u000bx~!1Y:Lv~#.";
                var5_3 = "}v# J$P\u000bx~!1Y:Lv~#.".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 123;
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
                    var3_2 = "\u0012\u0017SJ'\u0006\u0015\u001bNK-@";
                    var5_3 = "\u0012\u0017SJ'\u0006\u0015\u001bNK-@".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 22;
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
                            v15 = 64;
                            break;
                        }
                        case 1: {
                            v15 = 100;
                            break;
                        }
                        case 2: {
                            v15 = 42;
                            break;
                        }
                        case 3: {
                            v15 = 62;
                            break;
                        }
                        case 4: {
                            v15 = 87;
                            break;
                        }
                        case 5: {
                            v15 = 51;
                            break;
                        }
                        default: {
                            v15 = 82;
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
        _c.CaptureMark = new _c((Object)var0[1], 0);
        _c.Circle = new _c((Object)var0[3], 1);
        _c.Firefly = new _c((Object)var0[0], 2);
        _c.Deobf = new _c((Object)var0[2], 3);
        _c.u = hi.a("G", (Object)new Object[0], (long)679896300669225743L);
    }
}
