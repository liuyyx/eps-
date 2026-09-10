/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uT;

public final class vw {
    public static final uT G;
    public static final uT y;
    public static final uT L;
    public static final uT o;
    public static final uT C;
    public static final uT c;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[8];
                var4_1 = 0;
                var3_2 = "qA'gt*8p\u0014pD1~p*/f\u0006$\u007ft=>g\b=}s+\u0005pE$gl\u0004eG$`\u0006}M5\u007fa,\u0007eD5jp6(";
                var5_3 = "qA'gt*8p\u0014pD1~p*/f\u0006$\u007ft=>g\b=}s+\u0005pE$gl\u0004eG$`\u0006}M5\u007fa,\u0007eD5jp6(".length();
                var2_4 = 8;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 3;
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
                    var3_2 = "\u001b+L\u001c\u001cZX\u0010,\u0014\u001a.[\u0014\u001a@E\flN\u0015\u001eWT\rbW\u0017\u0019A";
                    var5_3 = "\u001b+L\u001c\u001cZX\u0010,\u0014\u001a.[\u0014\u001a@E\flN\u0015\u001eWT\rbW\u0017\u0019A".length();
                    var2_4 = 9;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 105;
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
                            v15 = 22;
                            break;
                        }
                        case 1: {
                            v15 = 43;
                            break;
                        }
                        case 2: {
                            v15 = 87;
                            break;
                        }
                        case 3: {
                            v15 = 16;
                            break;
                        }
                        case 4: {
                            v15 = 22;
                            break;
                        }
                        case 5: {
                            v15 = 71;
                            break;
                        }
                        default: {
                            v15 = 88;
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
        vw.C = hi.a("G", var0[7], (Object)var0[5], (long)552744722789337767L);
        vw.o = hi.a("G", var0[1], (Object)var0[0], (long)552744722789337767L);
        vw.c = hi.a("G", var0[1], (Object)var0[4], (long)552744722789337767L);
        vw.G = hi.a("G", var0[1], (Object)var0[3], (long)552744722789337767L);
        vw.L = hi.a("G", var0[1], (Object)var0[6], (long)552744722789337767L);
        vw.y = hi.a("G", var0[1], (Object)var0[2], (long)552744722789337767L);
    }

    private vw() {
    }
}
