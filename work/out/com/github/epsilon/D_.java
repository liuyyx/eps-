/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

final class D_ {
    private float H;
    private float W;
    private float M;
    private final Runnable n;
    private float D;
    private float r;
    private final String k;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean z(double var1_1, double var3_2) {
        block14: {
            var5_3 = Dl.t();
            var6_4 /* !! */  = D_.a(13594, 3129803709164975988L) + D_.a(13107, 8522136263048065360L) + D_.a(3077, 2366067341535465056L);
            if (!var5_3) ** GOTO lbl15
            block11: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = (cfr_temp_0 = var1_1 - (double)hi.a("\u00e9", (Object)this, (long)455717028654052987L)) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (var5_3) break block15;
                            if (v0 >= 0) break block16;
                            v0 = (D_.a(7194, 9000247807045656131L) + D_.a(6132, 181613975244723593L) ^ D_.a(27168, 2487540555666729046L)) * D_.a(12102, 3646321320265379122L) + D_.a(22507, 2903247930924799390L);
                        }
                        var6_4 /* !! */  = (int)v0;
                        if (!var5_3) break block17;
                    }
                    var6_4 /* !! */  = D_.Z("cL1skenOyeqZ6jIi", max(int int ), (int)(D_.a(227, 5774790718363648656L) / D_.a(3568, 2284703287858974612L) / D_.a(5882, 4820350995310630033L) / D_.a(1727, 9024153466645071047L)), (int)D_.a(23492, 5288193123965147572L)) ^ D_.a(31606, 613215037632362762L);
                    if (var5_3) ** GOTO lbl55
                }
                block12: while (true) {
                    block25: {
                        block23: {
                            block24: {
                                block22: {
                                    block20: {
                                        block21: {
                                            block19: {
                                                block18: {
                                                    switch (var6_4 /* !! */ ) {
                                                        default: {
                                                            continue block11;
                                                        }
                                                        case -688339727: {
                                                            cfr_temp_1 = var1_1 - (double)(hi.a("\u00e9", (Object)this, (long)455717028654052987L) + hi.a("\u00e9", (Object)this, (long)1288365294608126488L));
                                                            v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                            if (var5_3) break block18;
                                                            if (v1 > 0) break;
                                                            break block19;
                                                        }
                                                        case -688339721: {
                                                            cfr_temp_2 = var3_2 - (double)hi.a("\u00e9", (Object)this, (long)1258729121903301027L);
                                                            v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                            if (var5_3) break block20;
                                                            if (v2 < 0) break block21;
                                                            break block22;
                                                        }
                                                        case -688339725: {
                                                            cfr_temp_3 = var3_2 - (double)(hi.a("\u00e9", (Object)this, (long)1258729121903301027L) + hi.a("\u00e9", (Object)this, (long)424138023389441935L));
                                                            v3 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                            if (var5_3) break block23;
                                                            if (v3 > 0) break block24;
                                                            break block25;
                                                        }
                                                        case -688339722: {
                                                            v4 = true;
                                                            var6_4 /* !! */  = D_.a(674, 6946760530580684997L) / D_.a(3929, 8234747018827091240L) - D_.a(984, 5258524824389697927L);
                                                            if (var5_3) {
                                                                break block11;
                                                            }
                                                            break block14;
                                                        }
                                                        case -688339723: {
                                                            v4 = false;
                                                            if (!var5_3) break block11;
                                                            return v4;
                                                        }
                                                        case -688339726: {
                                                            hi.a("G", (boolean)true, (long)951202213413429819L);
                                                            hi.a("G", (int)-1, (long)532165785136172044L);
                                                            var6_4 /* !! */  = (int)(hi.a("G", (int)(D_.a(19859, 7534051833543593960L) / D_.a(16536, 3948904516315087585L)), (int)D_.a(19239, 115744931988441465L), (long)834203424483934088L) + D_.a(17972, 6101664320922944623L));
                                                            continue block12;
                                                        }
                                                    }
lbl55:
                                                    // 2 sources

                                                    v1 = (D_.a(13092, 6973216818526515580L) + D_.a(5719, 4530148062420653112L) ^ D_.a(27578, 1369608555236141536L)) * D_.a(31231, 5190318406820739981L) + D_.a(17452, 1845794301518710363L);
                                                }
                                                var6_4 /* !! */  = (int)v1;
                                                if (!var5_3) continue;
                                            }
                                            var6_4 /* !! */  = D_.a(1296, 8035317187198502777L) - D_.a(15272, 1783194706161138130L) + D_.a(9531, 351065882286516054L);
                                            if (!var5_3) continue;
                                        }
                                        v2 = (D_.a(13092, 6973216818526515580L) + D_.a(5719, 4530148062420653112L) ^ D_.a(27578, 1369608555236141536L)) * D_.a(31231, 5190318406820739981L) + D_.a(17452, 1845794301518710363L);
                                    }
                                    var6_4 /* !! */  = (int)v2;
                                    if (!var5_3) continue;
                                }
                                var6_4 /* !! */  = D_.a(17923, 6372771550977786977L) * D_.a(28344, 4111201374330367192L) - D_.a(23300, 88794565963356517L);
                                if (!var5_3) continue;
                            }
                            v3 = (D_.a(13092, 6973216818526515580L) + D_.a(5719, 4530148062420653112L) ^ D_.a(27578, 1369608555236141536L)) * D_.a(31231, 5190318406820739981L) + D_.a(17452, 1845794301518710363L);
                        }
                        var6_4 /* !! */  = (int)v3;
                        if (!var5_3) continue;
                    }
                    var6_4 /* !! */  = (D_.a(26921, 9172136514241211205L) ^ D_.a(24965, 1403089421640377315L)) - D_.a(7412, 7179646127068601994L);
                }
                break;
            }
            var6_4 /* !! */  = D_.a(26127, 2605954455366706277L) / D_.a(28171, 715539417893809251L) - D_.a(9513, 6367684148530177878L);
        }
        switch (var6_4 /* !! */ ) {
            case -1747233126: {
                hi.a("G", (long)397471851942621184L);
                hi.a("G", (float)100.0f, (float)0.0f, (float)-1.0f, (float)11.0f, (double)10.0, (int)2, (long)1270986612680661754L);
                return v4;
            }
        }
        return v4;
    }

    public static /* bridge */ /* synthetic */ CallSite Z(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private void W(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        float f3 = ((Float)objectArray[2]).floatValue();
        float f4 = ((Float)objectArray[3]).floatValue();
        hi.a("\u00f2", (Object)this, (float)f, (long)455717028654052987L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)1258729121903301027L);
        hi.a("\u00f2", (Object)this, (float)f3, (long)1288365294608126488L);
        hi.a("\u00f2", (Object)this, (float)f4, (long)424138023389441935L);
    }

    private D_(String string, Runnable runnable) {
        this.k = string;
        this.n = runnable;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3428994055568896963L;
                var6_1 = new long[38];
                var3_2 = 0;
                var4_3 = "p\u008c\u008bv#\u00d7`\u009a\u00ad\"\f\u00a1\u0014\u00d9\u00ae\u0094\u00b4:\u00b0\u00d9\u001a\u00e1w\b\u00f6\u00b4\u00fbRI\u00f9\u00b1.\u00fa\u00d7\u00baRm\u00e9\u00f4\u00a7\u0095\u00111\u00f9\u0099\u00bar\u00c70\u00f6\u009914\u00ea_\u0094\u0010e$|nE\u00a3!\u0004\u0094\u00d1\u00844\u0018\u00ae\u0091\u008c\u00d6\u00a1\u00da\u00a5<\u0092(j}\u0001\u00e0j,W\u00e4~\r\u0018\u00dc\u00b3y~\u00e2\u00c3\u00bbj~\u00b9\u00b8\u00de\u001f7\u00d6@\u001c\u00be\u00a1qB\u00b6*$\u00a6\u00ae\u00f9\u00f8.2Z\u00be\u000b\u0089~\u00e2\u0087\u0004\u00f3;\u00a0r\u00bds\u00fc\u0083\u00ec\u00fd]\u00eb,\u00e7U\u00ac\u00c5\u0082\u00d61E\u009f\u00a9\u00c6\u00a2\u00f5\u0097q\u009ag\u009cy\u009c\u0098w#\u0013\u00e7*\u0099\n\u0010_\u0096q\"\u0090\u00ef\u009e\\\u00b7\u00c0(K\u0016\u00e0\u00f3\u009e\u0014B\u00a2\b\u00c9H\u00e5\u00c2\u00bd\u00faJFKK\u00f8\u00d9\u0000,\u0087\u00b0K\u00cbg\"\u00ef\u00e7\u000f9\u008e\u009b\u00c4\u00a6\u00eall7\f\u009e\u00eb\u00ccl\u00db|\u009dT\u00f4`6/\u00fa\u00b0\u0097\\F\u00e1Y\u00c6\u0019\u001c|Z,Z\u00bdIRP\u00d3\u00dcH\u00dd,\u00f0qs\u00df\u00a9\u0099\u00e6G\u00ae%f \u0005m\u0002\u0094\u00c7\u00e6:\u00f8\u00db|\u00ea\"\u0002!FW\u00e4";
                var5_4 = "p\u008c\u008bv#\u00d7`\u009a\u00ad\"\f\u00a1\u0014\u00d9\u00ae\u0094\u00b4:\u00b0\u00d9\u001a\u00e1w\b\u00f6\u00b4\u00fbRI\u00f9\u00b1.\u00fa\u00d7\u00baRm\u00e9\u00f4\u00a7\u0095\u00111\u00f9\u0099\u00bar\u00c70\u00f6\u009914\u00ea_\u0094\u0010e$|nE\u00a3!\u0004\u0094\u00d1\u00844\u0018\u00ae\u0091\u008c\u00d6\u00a1\u00da\u00a5<\u0092(j}\u0001\u00e0j,W\u00e4~\r\u0018\u00dc\u00b3y~\u00e2\u00c3\u00bbj~\u00b9\u00b8\u00de\u001f7\u00d6@\u001c\u00be\u00a1qB\u00b6*$\u00a6\u00ae\u00f9\u00f8.2Z\u00be\u000b\u0089~\u00e2\u0087\u0004\u00f3;\u00a0r\u00bds\u00fc\u0083\u00ec\u00fd]\u00eb,\u00e7U\u00ac\u00c5\u0082\u00d61E\u009f\u00a9\u00c6\u00a2\u00f5\u0097q\u009ag\u009cy\u009c\u0098w#\u0013\u00e7*\u0099\n\u0010_\u0096q\"\u0090\u00ef\u009e\\\u00b7\u00c0(K\u0016\u00e0\u00f3\u009e\u0014B\u00a2\b\u00c9H\u00e5\u00c2\u00bd\u00faJFKK\u00f8\u00d9\u0000,\u0087\u00b0K\u00cbg\"\u00ef\u00e7\u000f9\u008e\u009b\u00c4\u00a6\u00eall7\f\u009e\u00eb\u00ccl\u00db|\u009dT\u00f4`6/\u00fa\u00b0\u0097\\F\u00e1Y\u00c6\u0019\u001c|Z,Z\u00bdIRP\u00d3\u00dcH\u00dd,\u00f0qs\u00df\u00a9\u0099\u00e6G\u00ae%f \u0005m\u0002\u0094\u00c7\u00e6:\u00f8\u00db|\u00ea\"\u0002!FW\u00e4".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "8\u0080m\u00a7\u008bG\u0003\u00ed\u00b9\u00de\u00ba\"\u00f2\u00ee\u00d4\u0016";
                    var5_4 = "8\u0080m\u00a7\u008bG\u0003\u00ed\u00b9\u00de\u00ba\"\u00f2\u00ee\u00d4\u0016".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        D_.a = var6_1;
        D_.b = new Integer[38];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x427A;
        if (b[n2] == null) {
            D_.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
