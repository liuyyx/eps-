/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DF;
import com.github.epsilon.Dl;
import com.github.epsilon._E;
import com.github.epsilon.hi;
import com.github.epsilon.lH;
import com.github.epsilon.zU;
import com.github.epsilon.zc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public abstract class zv<S extends Dl<?>>
extends zc<S> {
    private static final float D = 14.0f;
    private final _E t = new _E((lH)((Object)hi.a("j", (long)611443736556992631L)), c);
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean e(Object[] var1_1) {
        block18: {
            block16: {
                block17: {
                    block15: {
                        block13: {
                            block14: {
                                var3_2 = (Double)var1_1[0];
                                var5_3 = (Double)var1_1[1];
                                var2_4 = (Integer)var1_1[2];
                                var7_5 = Dl.S();
                                var8_6 /* !! */  = (zv.b(24221, 6548924527392650642L) + zv.b(5908, 5358414533493570572L) - zv.b(6525, 2091763626086838884L) + zv.b(3340, 8789935460678673952L) ^ zv.b(20124, 398664820588766604L)) - zv.b(2205, 4253992871182967686L);
                                if (!var7_5) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 = var2_4;
                                        if (!var7_5) break block13;
                                        if (v0 != 0) break block14;
                                        break block15;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        v1 = new Object[2];
                                        v1[1] = var5_3;
                                        v1[0] = var3_2;
                                        v2 /* !! */  = hi.a("\u00a5", (Object)this, (Object)v1, (long)1199230817003015372L);
                                        if (!var7_5) break block16;
                                        if (v2 /* !! */  != false) break block17;
                                        break block18;
                                        break;
                                    }
lbl23:
                                    // 1 sources

                                    return false;
lbl25:
                                    // 1 sources

                                    while (true) {
                                        hi.a("G", (float)1.0f, (long)945348514596968233L);
                                        zv.o("FQu16jyNEoGyQcUF", values());
lbl30:
                                        // 2 sources

                                        while (true) {
                                            hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)383746498625567740L);
                                            hi.a("\u00a5", (Object)hi.a("j", (long)1253195410950740767L), (Object)new Object[]{hi.a("j", (long)1162970244660412433L)}, (long)915299438154452722L);
                                            hi.a("\u00a5", (Object)hi.a("j", (long)1112562866355832122L), (Object)hi.a("j", (long)1158716554595397923L), (long)433704824712272587L);
                                            return true;
                                        }
                                        break;
                                    }
                                }
lbl35:
                                // 6 sources

                                while (true) {
                                    switch (var8_6 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 1947234124: {
                                            ** continue;
                                        }
                                        case 1947234128: {
                                            ** continue;
                                        }
                                        case 1947234126: {
                                            ** continue;
                                        }
                                        ** case 1947234125:
lbl46:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                            }
                            v0 = var8_6 /* !! */  = zv.b(2843, 6434112053607637023L) + zv.b(28865, 1782863287896071104L) + zv.b(5097, 8297807940905121986L) + zv.b(1314, 7811388036756024884L);
                        }
                        if (var7_5) ** GOTO lbl35
                    }
                    var8_6 /* !! */  = hi.a("G", (int)zv.b(11753, 6297598364193031933L), (int)zv.b(6748, 4443442071255069012L), (long)834203424483934088L) ^ zv.b(32012, 8011376592349517334L);
                    if (var7_5) ** GOTO lbl35
                }
                v2 /* !! */  = (CallSite)(zv.b(26388, 4727075068347272203L) + zv.b(15741, 6515987663664289388L) - zv.b(18798, 3889873501543785085L));
            }
            var8_6 /* !! */  = (int)v2 /* !! */ ;
            if (var7_5) ** GOTO lbl35
        }
        var8_6 /* !! */  = zv.b(32096, 3023065459550312055L) + zv.b(21236, 2093782401190984184L) + zv.b(6433, 145012196745589284L) + zv.b(28304, 5857637919628838326L);
        ** while (true)
    }

    protected abstract int Y(Object[] var1);

    protected abstract String L(Object[] var1);

    protected zv(S s) {
        super(s);
    }

    @Override
    public float H() {
        return 29.0f;
    }

    private float h(Object[] objectArray) {
        Object object = objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        return f + (f2 - hi.a("\u00a5", (Object)((DF)object), (float)f3, (long)470446160550961215L)) * 0.5f;
    }

    protected float s(Object[] objectArray) {
        return (float)hi.a("\u00a5", (Object)this, (float)6.0f, (long)786993788394806152L);
    }

    protected float k() {
        return (float)(hi.a("\u00e9", (Object)this, (long)805156968765708265L) - 12.0f);
    }

    protected abstract void X(Object[] var1);

    public static /* bridge */ /* synthetic */ CallSite o(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    protected float F(Object[] objectArray) {
        return (float)hi.a("\u00a5", (Object)this, (float)15.0f, (long)631588808502567065L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void O(Object[] var1_1) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        var4_2 = (zU)var1_1[0];
                        var5_3 = (DF)var1_1[1];
                        var2_4 = (Integer)var1_1[2];
                        var3_5 = (Integer)var1_1[3];
                        var6_6 = Dl.t();
                        var19_7 /* !! */  = (hi.a("G", (int)zv.b(9179, 8484810363466418393L), (int)zv.b(666, 583806874762291604L), (long)834203424483934088L) ^ zv.b(31139, 5783315427329528490L)) - zv.b(11056, 1245051969432485949L);
                        if (var6_6) ** GOTO lbl-1000
                        v0 /* !! */  = var19_7 /* !! */ ;
                        if (var6_6) ** GOTO lbl19
                        switch (v0 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                v1 = new Object[2];
                                v1[1] = (double)var3_5;
                                v1[0] = (double)var2_4;
                                v0 /* !! */  = (int)hi.a("\u00a5", (Object)this, (Object)v1, (long)1199230817003015372L);
lbl19:
                                // 2 sources

                                var7_8 = v0 /* !! */ ;
                                v2 = hi.a("\u00e9", (Object)this, (long)884275230833425987L);
                                v3 /* !! */  = var7_8;
                                if (var6_6) break block15;
                                if (v3 /* !! */  == 0) break;
                                break block16;
                            }
                            case 299745101: {
                                throw null;
                            }
                        }
                        v3 /* !! */  = var19_7 /* !! */  = (int)(zv.o("FQu16jyNEoGyQcUF", max(int int ), (int)(zv.b(10310, 1414870597745116011L) + zv.b(29492, 1118169011439556636L)), (int)zv.b(32092, 4196160114037544540L)) + zv.b(21968, 5927724047662153465L));
                    }
                    if (!var6_6) break block17;
                }
                var19_7 /* !! */  = zv.b(7321, 6092993234970720147L) * zv.b(12967, 4519983569937766843L) ^ zv.b(21454, 4874861391604676808L) ^ zv.b(25403, 5184216683463165990L);
            }
            switch (var19_7 /* !! */ ) {
                default: {
                    v4 = 1.0f;
                    var19_7 /* !! */  = (int)(hi.a("G", (int)(zv.b(21922, 2422334982447857313L) / zv.b(9086, 7324274728027359339L)), (int)zv.b(13051, 2736936186272127465L), (long)834203424483934088L) + zv.b(25996, 4919308587702865570L));
                    if (var6_6) {
                        break;
                    }
                    break block18;
                }
                case -1322650417: {
                    v4 = 0.0f;
                    if (!var6_6) break;
                    ** GOTO lbl-1000
                }
                case -1322650419: {
                    hi.a("G", (long)405872435149102496L);
                    hi.a("G", (double)0.0, (long)1327728264718092753L);
                    return;
                }
            }
            var19_7 /* !! */  = (int)(hi.a("G", (int)(zv.b(10213, 1648965948600519918L) / zv.b(14512, 2226224765337015194L)), (int)zv.b(25411, 7250766413634816093L), (long)834203424483934088L) + zv.b(692, 8007364988886559131L));
        }
        switch (var19_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                hi.a("\u00a5", (Object)v2, (float)v4, (long)439674605800943152L);
                hi.a("\u00a5", (Object)var4_2, (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L), (long)465467115463800692L), (float)6.0f, (float)1.0f, (float)0.65f, (Object)hi.a("G", (long)941950898065809316L), (long)487875072643634565L);
                var8_9 = 6.0f;
                var9_10 = 15.0f;
                var10_11 = hi.a("\u00a5", (Object)this, (long)440977466235899282L);
                var11_12 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)884275230833425987L), (long)1167668381225401548L);
                var12_13 = hi.a("G", (Object)hi.a("j", (long)970606960436247839L), (Object)hi.a("j", (long)817827339599640798L), (float)(var11_12 * 0.6f), (long)1032418514208893637L);
                var13_14 = hi.a("G", (Object)hi.a("G", (Object)hi.a("j", (long)787573419855687315L), (int)zv.b(30733, 4162543650268402442L), (long)950630386023407477L), (Object)hi.a("j", (long)501800615308669146L), (float)var11_12, (long)1032418514208893637L);
                var14_15 = (int)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)731191544305202131L) + (String)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)876124525008074887L);
                var15_16 = 0.5f;
                var16_17 = 0.54f;
                v5 = new Object[4];
                v5[3] = Float.valueOf(var15_16);
                v5[2] = Float.valueOf(14.0f);
                v5[1] = Float.valueOf(var9_10);
                v5[0] = var5_3;
                var17_18 = hi.a("\u00a5", (Object)this, (Object)v5, (long)805322257960640459L);
                v6 = new Object[4];
                v6[3] = Float.valueOf(var16_17);
                v6[2] = Float.valueOf(14.0f);
                v6[1] = Float.valueOf(var9_10);
                v6[0] = var5_3;
                var18_19 = hi.a("\u00a5", (Object)this, (Object)v6, (long)805322257960640459L);
                hi.a("\u00a5", (Object)var4_2, (float)var8_9, (float)var9_10, (float)var10_11, (float)14.0f, (float)5.0f, (Object)var12_13, (long)776507817655946365L);
                hi.a("\u00a5", (Object)var4_2, (float)var8_9, (float)var9_10, (float)var10_11, (float)14.0f, (float)5.0f, (float)0.7f, (Object)var13_14, (long)681197135062276323L);
                hi.a("\u00a5", (Object)var4_2, (Object)var14_15, (float)(var8_9 + 6.0f), (float)var17_18, (float)var15_16, (Object)hi.a("j", (long)892696799870358639L), (long)487875072643634565L);
                hi.a("\u00a5", (Object)var4_2, (Object)"+", (float)(var8_9 + var10_11 - 12.0f), (float)var18_19, (float)var16_17, (Object)hi.a("j", (long)892696799870358639L), (long)487875072643634565L);
                return;
            }
            case -711139809: 
        }
    }

    protected boolean E(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        return (boolean)zv.o("FQu16jyNEoGyQcUF", j(double double float float float float ), (zv)this, (double)d, (double)d2, (float)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1179714669691222993L), (float)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)510729136607444142L), (float)zv.o("FQu16jyNEoGyQcUF", k(), (zv)this), (float)14.0f);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 5816562183716195754L;
                    var8_1 = new long[41];
                    var5_2 = 0;
                    var6_3 = "\u001fy\u00ad\u008b\u0019\u00be7\u00a7\u000b\u00cd\u0018\u00fa\u0094\u00af_\u00e1\u00917wn\u00016\u00bb\u00af\u00c5a\u00992\u00c5\u0094\u00fe\u00ac3\u00a1\u00f4\u0004\u0014g\u00df\u00da\u0089oHp\u008c\u00cc\u00e1\u00e2\u0092F)=\u00ac\u00aa\u0010kz4\u00df\u0002\u00c5\u001b>\u0010\u00ac\u00d1f\u00af\u00ba]\u00a2o\u009a\u00c3\u00a8\u0090B\u0011\u009e\u00fa\u00d1o3\n\u009a\t\u0086QV\u00d9\u009aP\u00ce$\u00cd\u00f55\u00b6\u00fc\u00f0\u00a7\u00b2\u009b\u0080J\u00b3J-\u00ba\u000e\u0013\u00ad$FF\u00d6\u0087_\u00ea\u00cd\u00cf\u00da\u00e8m\u00fc\u00e4\u0019\u0097\u00f3\u00c3\u009eH\u00d7\u00ec\u0001\u00ed\u00b8j\u00d2,+\u00e02&}\u0082}\u00dd#\u0017f\u00aa\u00d4\t\u0081\u00d4$\u00afd\u009e\u0010\u0083gl\u00ed\u00cc\u0010Zy)P\u0099\u00b6\u00f2\u00fd,3\r\u00d4\u0098\u00e1\u00fc\u00be1@\u00b2[\u00ebb(I\u00e0\u00eb\u00d1\u00c6\u00ebC\u00c5\u00a3jT\u00f6\u00f5\u00cc\u0093a\u00f09\u000e\u0088\u00ac\u0090\u008e\u00cd\u00af\u00fd\u0097\u008e\u00bf\u0019/.\u00c5\u00c6\u0098WN\u0084&L\u00d0Y=\u0099\u0015\u00bf\u0088HJ\u0088\u00bfx\u00dag?\u00f8\u00c0j\u00d3\u00e6t\u00db('\u00fa\u00e3\u0087\u00bc\u00f7\u000e\u0007\"\u00c4$\u00f0J\u00de\u00dc\u009c\u00d7\u00a3\u001d\u00df\u00e0O)\u00f3v\u0083K\u0082\u00bazu\u00d8r*\u00a2\u00cd\u0099\u00d9$\u001eH\u00de7Dx\u00e2>\u0019*\u00c7\u0013\u00faSL\u0094\u0096\u009b\u00ac\u00bf";
                    var7_4 = "\u001fy\u00ad\u008b\u0019\u00be7\u00a7\u000b\u00cd\u0018\u00fa\u0094\u00af_\u00e1\u00917wn\u00016\u00bb\u00af\u00c5a\u00992\u00c5\u0094\u00fe\u00ac3\u00a1\u00f4\u0004\u0014g\u00df\u00da\u0089oHp\u008c\u00cc\u00e1\u00e2\u0092F)=\u00ac\u00aa\u0010kz4\u00df\u0002\u00c5\u001b>\u0010\u00ac\u00d1f\u00af\u00ba]\u00a2o\u009a\u00c3\u00a8\u0090B\u0011\u009e\u00fa\u00d1o3\n\u009a\t\u0086QV\u00d9\u009aP\u00ce$\u00cd\u00f55\u00b6\u00fc\u00f0\u00a7\u00b2\u009b\u0080J\u00b3J-\u00ba\u000e\u0013\u00ad$FF\u00d6\u0087_\u00ea\u00cd\u00cf\u00da\u00e8m\u00fc\u00e4\u0019\u0097\u00f3\u00c3\u009eH\u00d7\u00ec\u0001\u00ed\u00b8j\u00d2,+\u00e02&}\u0082}\u00dd#\u0017f\u00aa\u00d4\t\u0081\u00d4$\u00afd\u009e\u0010\u0083gl\u00ed\u00cc\u0010Zy)P\u0099\u00b6\u00f2\u00fd,3\r\u00d4\u0098\u00e1\u00fc\u00be1@\u00b2[\u00ebb(I\u00e0\u00eb\u00d1\u00c6\u00ebC\u00c5\u00a3jT\u00f6\u00f5\u00cc\u0093a\u00f09\u000e\u0088\u00ac\u0090\u008e\u00cd\u00af\u00fd\u0097\u008e\u00bf\u0019/.\u00c5\u00c6\u0098WN\u0084&L\u00d0Y=\u0099\u0015\u00bf\u0088HJ\u0088\u00bfx\u00dag?\u00f8\u00c0j\u00d3\u00e6t\u00db('\u00fa\u00e3\u0087\u00bc\u00f7\u000e\u0007\"\u00c4$\u00f0J\u00de\u00dc\u009c\u00d7\u00a3\u001d\u00df\u00e0O)\u00f3v\u0083K\u0082\u00bazu\u00d8r*\u00a2\u00cd\u0099\u00d9$\u001eH\u00de7Dx\u00e2>\u0019*\u00c7\u0013\u00faSL\u0094\u0096\u009b\u00ac\u00bf".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "h\u0000\u00eb\u0084-\u000bd0\u0090\u0018\u0081\u00110\u0004H\u00e8";
                        var7_4 = "h\u0000\u00eb\u0084-\u000bd0\u0090\u0018\u0081\u00110\u0004H\u00e8".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
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
            zv.a = var8_1;
            zv.b = new Integer[41];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3274728651366319303L;
        ** while (true)
        zv.c = 3274728651366319295L ^ var0_7;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2B0E;
        if (b[n2] == null) {
            zv.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
