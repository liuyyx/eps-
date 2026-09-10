/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uT;

public final class XX {
    public static final uT u;
    public static final uT Z;
    public static final uT m;

    private XX() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "WUN`\f>xxHUl;i$HO_\\\u0010e\u0017KSMf\u0016U*HITg\u0017\u0012JS^v\bo;\tYVz\u0010x)\u0007ZVz\u0018WUN`\f>xxRU\\\u0011y)EP_\\\u0001f1SN[";
                var5_3 = "WUN`\f>xxHUl;i$HO_\\\u0010e\u0017KSMf\u0016U*HITg\u0017\u0012JS^v\bo;\tYVz\u0010x)\u0007ZVz\u0018WUN`\f>xxRU\\\u0011y)EP_\\\u0001f1SN[".length();
                var2_4 = 33;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 45;
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
                    var3_2 = "D]Px\u0006a5\u0007WXt\u001ev'\tTXt\u0018Y[@n\u00020vvFUf\u000fk OmWb\u0007t*LFQ";
                    var5_3 = "D]Px\u0006a5\u0007WXt\u001ev'\tTXt\u0018Y[@n\u00020vvFUf\u000fk OmWb\u0007t*LFQ".length();
                    var2_4 = 18;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 35;
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
                            v15 = 10;
                            break;
                        }
                        case 1: {
                            v15 = 17;
                            break;
                        }
                        case 2: {
                            v15 = 23;
                            break;
                        }
                        case 3: {
                            v15 = 46;
                            break;
                        }
                        case 4: {
                            v15 = 73;
                            break;
                        }
                        case 5: {
                            v15 = 39;
                            break;
                        }
                        default: {
                            v15 = 101;
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
        XX.m = hi.a("G", var0[1], (Object)var0[4], (long)552744722789337767L);
        XX.u = hi.a("G", var0[3], (Object)var0[0], (long)552744722789337767L);
        XX.Z = hi.a("G", var0[3], (Object)var0[2], (long)552744722789337767L);
    }
}
