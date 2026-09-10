/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class nW
extends Enum<nW> {
    public static final /* enum */ nW Fade;
    public static final /* enum */ nW Gradient;
    public static final /* enum */ nW Default;
    public static final /* enum */ nW Snow;
    public static final /* enum */ nW Smoke;
    private static final nW[] d;

    public static nW valueOf(String string) {
        return (nW)((Object)hi.a("G", nW.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "|W\u0010iDV]\b\u007f@\u0017lX_GL\u0004k\\\u0019\u007f";
                var5_3 = "|W\u0010iDV]\b\u007f@\u0017lX_GL\u0004k\\\u0019\u007f".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 93;
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
                    var3_2 = "~J\fvA\u0004kF\u0007x";
                    var5_3 = "~J\fvA\u0004kF\u0007x".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 72;
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
                            v15 = 101;
                            break;
                        }
                        case 1: {
                            v15 = 111;
                            break;
                        }
                        case 2: {
                            v15 = 43;
                            break;
                        }
                        case 3: {
                            v15 = 85;
                            break;
                        }
                        case 4: {
                            v15 = 108;
                            break;
                        }
                        case 5: {
                            v15 = 103;
                            break;
                        }
                        default: {
                            v15 = 116;
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
        nW.Default = new nW();
        nW.Smoke = new nW();
        nW.Gradient = new nW();
        nW.Snow = new nW();
        nW.Fade = new nW();
        nW.d = hi.a("G", (Object)new Object[0], (long)809260601719726431L);
    }

    private static nW[] l(Object[] objectArray) {
        return new nW[]{hi.a("j", (long)426670475375059945L), hi.a("j", (long)506728481630649307L), hi.a("j", (long)744459109953823554L), hi.a("j", (long)355580503468055177L), hi.a("j", (long)1217136773284935308L)};
    }

    public static nW[] values() {
        return (nW[])((Enum)((Object)hi.a("j", (long)887194033972568263L))).clone();
    }
}
