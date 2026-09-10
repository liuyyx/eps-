/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DF;
import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.zU;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public abstract class zF {
    protected float Y;
    protected float Q;
    protected float I;
    private static final long[] e;
    private static final Integer[] j;

    protected boolean S(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        return (boolean)hi.a("\u00a5", (Object)this, (double)d, (double)d2, (float)hi.a("\u00e9", (Object)this, (long)583111938809038446L), (float)hi.a("\u00e9", (Object)this, (long)468187944702551169L), (float)hi.a("\u00e9", (Object)this, (long)805156968765708265L), (float)zF.D("JU0I5mvUJvtwfX9H", H(), (zF)this), (long)458345174234035172L);
    }

    public final void I(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        DF dF = (DF)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        ih ih2 = (ih)objectArray[4];
        hi.a("\u00a5", (Object)zU2, (Object)ih2, arg_0 -> this.lambda$draw$0(dF, n, n2, ih2, arg_0), (long)449141544506485015L);
    }

    private void lambda$draw$0(DF dF, int n, int n2, ih ih2, zU zU2) {
        zF.D("JU0I5mvUJvtwfX9H", Q(com.github.epsilon.zU com.github.epsilon.DF int int com.github.epsilon.ih ), (zF)this, (zU)zU2, (DF)dF, (int)n, (int)n2, (ih)ih2);
    }

    public boolean b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        return false;
    }

    public final void Q(zU zU2, DF dF, int n, int n2, ih ih2) {
        Object[] objectArray = new Object[3];
        objectArray[2] = Float.valueOf((float)hi.a("\u00a5", (Object)ih2, (long)1210563473410659836L));
        objectArray[1] = Float.valueOf((float)hi.a("\u00a5", (Object)ih2, (long)1092110395291557528L));
        objectArray[0] = Float.valueOf((float)hi.a("\u00a5", (Object)ih2, (long)906597334513960415L));
        hi.a("\u00a5", (Object)this, (Object)objectArray, (long)584223240963887144L);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n2;
        objectArray2[2] = n;
        objectArray2[1] = dF;
        objectArray2[0] = zU2;
        hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)949841450490315322L);
    }

    public boolean W(Object[] objectArray) {
        String string = (String)objectArray[0];
        return false;
    }

    public float Q(Object[] objectArray) {
        return (float)hi.a("\u00e9", (Object)this, (long)583111938809038446L);
    }

    public float Z(Object[] objectArray) {
        return (float)hi.a("\u00e9", (Object)this, (long)805156968765708265L);
    }

    public boolean R(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        return false;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected boolean j(double var1_1, double var3_2, float var5_3, float var6_4, float var7_5, float var8_6) {
        block14: {
            var9_7 = Dl.t();
            var10_8 /* !! */  = zF.a(252, 9007691413863749508L) + zF.a(24829, 2690888773465618362L) - zF.a(21990, 434126043417936566L);
            if (!var9_7) ** GOTO lbl15
            block11: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = (cfr_temp_0 = var1_1 - (double)var5_3) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (var9_7) break block15;
                            if (v0 >= 0) break block16;
                            v0 = hi.a("G", (int)hi.a("G", (int)zF.a(32137, 179677841219496661L), (int)zF.a(14438, 3687141810480541474L), (long)834203424483934088L), (int)zF.a(29669, 612981699349259433L), (long)834203424483934088L) ^ zF.a(539, 791982176540087655L) ^ zF.a(743, 4874201355866396095L) ^ zF.a(13583, 8891588773453423193L);
                        }
                        var10_8 /* !! */  = (int)v0;
                        if (!var9_7) break block17;
                    }
                    var10_8 /* !! */  = (hi.a("G", (int)(zF.a(4863, 3895510359919543713L) - zF.a(30556, 7685821767511318539L)), (int)zF.a(28236, 9101841036784253193L), (long)834203424483934088L) ^ zF.a(26480, 3363109591932809275L) ^ zF.a(5930, 7465505083326382161L)) - zF.a(31032, 4778046218135187041L);
                    if (var9_7) ** GOTO lbl51
                }
                while (true) {
                    block25: {
                        block23: {
                            block24: {
                                block22: {
                                    block20: {
                                        block21: {
                                            block19: {
                                                block18: {
                                                    switch (var10_8 /* !! */ ) {
                                                        default: {
                                                            continue block11;
                                                        }
                                                        case 456924609: {
                                                            cfr_temp_1 = var1_1 - (double)(var5_3 + var7_5);
                                                            v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                            if (var9_7) break block18;
                                                            if (v1 > 0) break;
                                                            break block19;
                                                        }
                                                        case 456924610: {
                                                            cfr_temp_2 = var3_2 - (double)var6_4;
                                                            v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                            if (var9_7) break block20;
                                                            if (v2 < 0) break block21;
                                                            break block22;
                                                        }
                                                        case 456924606: {
                                                            cfr_temp_3 = var3_2 - (double)(var6_4 + var8_6);
                                                            v3 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                            if (var9_7) break block23;
                                                            if (v3 > 0) break block24;
                                                            break block25;
                                                        }
                                                        case 456924611: {
                                                            v4 = true;
                                                            var10_8 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)zF.a(23671, 8657553884034534193L), (int)zF.a(32188, 5198817281696148221L), (long)834203424483934088L) * zF.a(25999, 3082443191439602383L)), (int)zF.a(7977, 5315285752411211883L), (long)834203424483934088L) + zF.a(17377, 2290061384054346907L) - zF.a(15169, 2049153538765155344L));
                                                            if (var9_7) {
                                                                break block11;
                                                            }
                                                            break block14;
                                                        }
                                                        case 456924605: {
                                                            v4 = false;
                                                            if (!var9_7) break block11;
                                                            return v4;
                                                        }
                                                        case 456924607: {
                                                            throw null;
                                                        }
                                                    }
lbl51:
                                                    // 2 sources

                                                    v1 = hi.a("G", (int)hi.a("G", (int)zF.a(4763, 6781964562424186322L), (int)zF.a(32318, 5288724831211399523L), (long)834203424483934088L), (int)zF.a(26619, 5983155936221212846L), (long)834203424483934088L) ^ zF.a(18797, 1136910577027882542L) ^ zF.a(4865, 3713634388750845003L) ^ zF.a(25959, 1783982881513255476L);
                                                }
                                                var10_8 /* !! */  = (int)v1;
                                                if (!var9_7) continue;
                                            }
                                            var10_8 /* !! */  = zF.a(9637, 8647567221681648382L) * zF.a(17038, 6298300855269135808L) - zF.a(2227, 6436202881498701772L);
                                            if (!var9_7) continue;
                                        }
                                        v2 = hi.a("G", (int)hi.a("G", (int)zF.a(4763, 6781964562424186322L), (int)zF.a(32318, 5288724831211399523L), (long)834203424483934088L), (int)zF.a(26619, 5983155936221212846L), (long)834203424483934088L) ^ zF.a(18797, 1136910577027882542L) ^ zF.a(4865, 3713634388750845003L) ^ zF.a(25959, 1783982881513255476L);
                                    }
                                    var10_8 /* !! */  = (int)v2;
                                    if (!var9_7) continue;
                                }
                                var10_8 /* !! */  = zF.a(26966, 3336487360799063599L) / zF.a(18311, 2933290986723184890L) + zF.a(6791, 1275470308142796234L);
                                if (!var9_7) continue;
                            }
                            v3 = hi.a("G", (int)hi.a("G", (int)zF.a(4763, 6781964562424186322L), (int)zF.a(32318, 5288724831211399523L), (long)834203424483934088L), (int)zF.a(26619, 5983155936221212846L), (long)834203424483934088L) ^ zF.a(18797, 1136910577027882542L) ^ zF.a(4865, 3713634388750845003L) ^ zF.a(25959, 1783982881513255476L);
                        }
                        var10_8 /* !! */  = (int)v3;
                        if (!var9_7) continue;
                    }
                    var10_8 /* !! */  = zF.a(5056, 4432929768102511806L) + zF.a(23054, 660989745471524166L) + zF.a(17420, 727839459705164664L);
                }
                break;
            }
            var10_8 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)zF.a(30942, 7262203408406425476L), (int)zF.a(11906, 6052443084063275469L), (long)834203424483934088L) * zF.a(12556, 7588035390100924025L)), (int)zF.a(7983, 3165793331561711728L), (long)834203424483934088L) + zF.a(4548, 952457322779526800L) - zF.a(27523, 7478358343082589393L));
        }
        switch (var10_8 /* !! */ ) {
            default: {
                return v4;
            }
            case 816869810: 
        }
        return false;
    }

    public boolean u(double d, double d2, int n) {
        return false;
    }

    public abstract float H();

    public float y(Object[] objectArray) {
        return (float)hi.a("\u00e9", (Object)this, (long)468187944702551169L);
    }

    protected float f(float f) {
        return (float)(hi.a("\u00e9", (Object)this, (long)583111938809038446L) + f);
    }

    public static /* bridge */ /* synthetic */ CallSite D(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public abstract void O(Object[] var1);

    protected float m(float f) {
        return (float)(hi.a("\u00e9", (Object)this, (long)468187944702551169L) + f);
    }

    public boolean e(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        int n = (Integer)objectArray[2];
        return false;
    }

    public void v(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        float f3 = ((Float)objectArray[2]).floatValue();
        hi.a("\u00f2", (Object)this, (float)f, (long)583111938809038446L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)468187944702551169L);
        hi.a("\u00f2", (Object)this, (float)f3, (long)805156968765708265L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 9028764668956512686L;
                var6_1 = new long[42];
                var3_2 = 0;
                var4_3 = "\u00c1\u0088\u0081:C\u008f^\u00f3\u00c8\u001fTA\u00ee\u0089\u00a9\u00eb\u00b3\t\u00c6\u00f7\u0016&\u00b8q'A\u00c6\u0010E\rd\\\u0089^\u0090\u00ee\u00a6\u00ee\u00f5\u00df\u00aeA\u00aac\u00f00E\u0094y\u0014\u0084&\u0007\u00ads%\u0090S\u00eeK\u00ffH\u0083\u009b\u00cb\u00f0n\u00d6\u0093\u00dbo\u00bap\u001d\u00f9H\u0093\"\u00f2\u00cc\u00a7\u00f8@\u00853\u001e\u00f9\u00ce\u00b0\u0001\u00a6\u008a27\u00d5\u00fd(\u00f0\u00d9\u00bdM\u00c8\u00e8P\u00af\u001a\t>/vS\u00dc\u00b2\u0087z0\u0099D\u0085\u0090b\u00fc\u00e3sS\u00188\u0091\u0016\u00b1h\u008c\u0098\u00ae\u00a7E\u0012\u00ceM\u00ff\u00be`{\u00bd\u0099qi/\u008boh\u0092\u00db\u0091\u00a1rI\u00f7\u00f8\u00db\u0085\u00e19\u00d0\u00cb\u00f8\u00c6\u00ec\u00fb\u00dbi\u0092\u0004\u00c0Yg$\u00fa\u009c\u0003\u00a5\u0006l\u000e\u00d9\u0006\u0088\u0018\u000b?\u00d4`\u0003W\u0095\u00e6\u0094\u00dfQW\u00a2\t\u0000k6\u0085\u0018\u00b2\r\u0093AO\u00ae^\u0081\u00c1\u00dc\u0003\u0001<ZT'.\u0080\u001e\\[\u0094\u001a;\u00a2\u00a0\u001d\u00b8\u0082\u0005Y\n6Y\u00f7N\u008aWS{\b\u00da\u00e8OM\u00f6\u0005\u00b8jm\u00d7vN3\u00bd\u0081[C\u001a\u00afx\u00d7n0Af\u009f)\f\u00fe\u0095\u00fe\u0095o q\u0090:E\u0012\u00a4U\u00e7\u00bf\u000f\u00fc\u00e6\u00a8\u00be\u008f\u00d3\u00ac\u00f9;Y\u00f0\u0085\u0091\u0004L\u00d0\u0013\u0092\u001c]m(\u00ca\u00b1\u001e\u00ba\u00a0\u00c7";
                var5_4 = "\u00c1\u0088\u0081:C\u008f^\u00f3\u00c8\u001fTA\u00ee\u0089\u00a9\u00eb\u00b3\t\u00c6\u00f7\u0016&\u00b8q'A\u00c6\u0010E\rd\\\u0089^\u0090\u00ee\u00a6\u00ee\u00f5\u00df\u00aeA\u00aac\u00f00E\u0094y\u0014\u0084&\u0007\u00ads%\u0090S\u00eeK\u00ffH\u0083\u009b\u00cb\u00f0n\u00d6\u0093\u00dbo\u00bap\u001d\u00f9H\u0093\"\u00f2\u00cc\u00a7\u00f8@\u00853\u001e\u00f9\u00ce\u00b0\u0001\u00a6\u008a27\u00d5\u00fd(\u00f0\u00d9\u00bdM\u00c8\u00e8P\u00af\u001a\t>/vS\u00dc\u00b2\u0087z0\u0099D\u0085\u0090b\u00fc\u00e3sS\u00188\u0091\u0016\u00b1h\u008c\u0098\u00ae\u00a7E\u0012\u00ceM\u00ff\u00be`{\u00bd\u0099qi/\u008boh\u0092\u00db\u0091\u00a1rI\u00f7\u00f8\u00db\u0085\u00e19\u00d0\u00cb\u00f8\u00c6\u00ec\u00fb\u00dbi\u0092\u0004\u00c0Yg$\u00fa\u009c\u0003\u00a5\u0006l\u000e\u00d9\u0006\u0088\u0018\u000b?\u00d4`\u0003W\u0095\u00e6\u0094\u00dfQW\u00a2\t\u0000k6\u0085\u0018\u00b2\r\u0093AO\u00ae^\u0081\u00c1\u00dc\u0003\u0001<ZT'.\u0080\u001e\\[\u0094\u001a;\u00a2\u00a0\u001d\u00b8\u0082\u0005Y\n6Y\u00f7N\u008aWS{\b\u00da\u00e8OM\u00f6\u0005\u00b8jm\u00d7vN3\u00bd\u0081[C\u001a\u00afx\u00d7n0Af\u009f)\f\u00fe\u0095\u00fe\u0095o q\u0090:E\u0012\u00a4U\u00e7\u00bf\u000f\u00fc\u00e6\u00a8\u00be\u008f\u00d3\u00ac\u00f9;Y\u00f0\u0085\u0091\u0004L\u00d0\u0013\u0092\u001c]m(\u00ca\u00b1\u001e\u00ba\u00a0\u00c7".length();
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
                    var4_3 = "ss\u00b7\u00d5\u00bdC\u00de\u0080\u0010\u00f1`!\u0083K\u0012V";
                    var5_4 = "ss\u00b7\u00d5\u00bdC\u00de\u0080\u0010\u00f1`!\u0083K\u0012V".length();
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
        zF.e = var6_1;
        zF.j = new Integer[42];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x575D;
        if (j[n2] == null) {
            zF.j[n2] = (int)(e[n2] ^ l);
        }
        return j[n2];
    }
}
