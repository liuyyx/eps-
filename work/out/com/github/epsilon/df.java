/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class df
extends Enum<df> {
    public static final /* enum */ df OPEN_FOLDER;
    private static final df[] n;
    public static final /* enum */ df EXPORT;
    public static final /* enum */ df SAVE_AS;
    public static final /* enum */ df RELOAD;
    public static final /* enum */ df NEW;
    public static final /* enum */ df IMPORT;
    private static final long a;

    private static df[] J(Object[] objectArray) {
        df[] dfArray = new df[(int)a];
        dfArray[0] = hi.a("j", (long)1189228890417604486L);
        dfArray[1] = hi.a("j", (long)389387055481760632L);
        dfArray[2] = hi.a("j", (long)628035615586431276L);
        dfArray[3] = hi.a("j", (long)1119604127916408496L);
        dfArray[4] = hi.a("j", (long)1005764753646545489L);
        dfArray[5] = hi.a("j", (long)1219642249042861991L);
        return dfArray;
    }

    public static df valueOf(String string) {
        return (df)((Object)hi.a("G", df.class, (Object)string, (long)703426484721789552L));
    }

    public static df[] values() {
        return (df[])((Enum)((Object)hi.a("j", (long)500693865930700701L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "\u001f;8R@G\u0006\b&$RSW\u000b\u0002.1S^E\\\u0001:1O\u0003\u0003;#";
                var7_3 = "\u001f;8R@G\u0006\b&$RSW\u000b\u0002.1S^E\\\u0001:1O\u0003\u0003;#".length();
                var4_4 = 6;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 121;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "~_B8>\" \u0006dSD237";
                    var7_3 = "~_B8>\" \u0006dSD237".length();
                    var4_4 = 7;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 25;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 52;
                            break;
                        }
                        case 1: {
                            v15 = 7;
                            break;
                        }
                        case 2: {
                            v15 = 13;
                            break;
                        }
                        case 3: {
                            v15 = 100;
                            break;
                        }
                        case 4: {
                            v15 = 120;
                            break;
                        }
                        case 5: {
                            v15 = 122;
                            break;
                        }
                        default: {
                            v15 = 106;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3739052158653281371L;
        ** while (true)
        df.a = -166697792164613027L ^ var0_7;
        df.SAVE_AS = new df((Object)var2[4], 0);
        df.RELOAD = new df((Object)var2[0], 1);
        df.EXPORT = new df((Object)var2[1], 2);
        df.IMPORT = new df((Object)var2[5], 3);
        df.NEW = new df((Object)var2[3], 4);
        df.OPEN_FOLDER = new df((Object)var2[2], 5);
        df.n = hi.a("G", (Object)new Object[0], (long)1180526963381613463L);
    }
}
