/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.nq;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

final class i4 {
    private float f;
    private nq x;
    private float O;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private i4 x(Object[] var1_1) {
        var2_2 = Dl.t();
        var3_3 /* !! */  = i4.a(30452, 6529370020655668568L) ^ i4.a(25133, 724087587093973430L) ^ i4.a(30547, 7975497876569169099L);
        if (!var2_2) ** GOTO lbl12
        block10: while (true) {
            block13: {
                block12: {
                    if (hi.a("\u00e9", (Object)this, (long)599599406792532184L) != null) break block12;
                    var3_3 /* !! */  = (int)(hi.a("G", (int)(i4.a(19561, 8795924689923614662L) + i4.a(8292, 9201542116780788733L) ^ i4.a(10243, 7191215770648363915L)), (int)i4.a(29629, 2073050011325012002L), (long)834203424483934088L) + i4.a(30290, 3489206292910415325L));
                    if (!var2_2) break block13;
                }
                var3_3 /* !! */  = i4.a(3953, 1139120821112038620L) - i4.a(12977, 5244882080093329722L) ^ i4.a(10366, 6520758328669553663L);
                if (var2_2) ** GOTO lbl42
            }
            block11: while (true) {
                switch (var3_3 /* !! */ ) {
                    default: {
                        continue block10;
                    }
                    case 476994021: {
                        cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)376000727518660259L) - 3.4028235E38f;
                        v0 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                        if (var2_2) ** GOTO lbl43
                        if (v0 == false) ** GOTO lbl42
                        ** GOTO lbl45
                    }
                    case 476994019: {
                        cfr_temp_1 = hi.a("\u00e9", (Object)this, (long)556821065722535863L) - -Infinityf;
                        v1 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                        if (var2_2) ** GOTO lbl48
                        if (v1 <= 0) ** GOTO lbl47
                        ** GOTO lbl50
                    }
                    case 476994020: {
                        v2 = this;
                        var3_3 /* !! */  = (int)(hi.a("G", (int)i4.H("oqgQfTR6iOyvUVY9", max(int int ), (int)i4.a(13360, 98128253082689452L), (int)i4.a(28485, 1120096956905653448L)), (int)i4.a(12344, 1493196999900584876L), (long)834203424483934088L) - i4.a(22583, 5139972479266173869L) - i4.a(23618, 4549884274641057740L));
                        ** GOTO lbl36
                    }
                    case 476994024: {
                        v2 = null;
                        var3_3 /* !! */  = (int)(i4.H("oqgQfTR6iOyvUVY9", max(int int ), (int)hi.a("G", (int)i4.a(25741, 7848104986450595598L), (int)i4.a(22015, 5525132802020097663L), (long)834203424483934088L), (int)i4.a(12152, 2964382820035052774L)) - i4.a(17283, 6071345487066212367L) - i4.a(29427, 762482830628133221L));
lbl36:
                        // 2 sources

                        switch (var3_3 /* !! */ ) {
                            default: {
                                return v2;
                            }
                            case 610467133: 
                        }
                        throw null;
                    }
lbl42:
                    // 2 sources

                    v0 = hi.a("G", (int)(i4.a(5714, 9030206203905670612L) + i4.a(10500, 30883324901278337L) ^ i4.a(3911, 1492409427697853645L)), (int)i4.a(11248, 4974429927676231794L), (long)834203424483934088L) + i4.a(5422, 8933402592024329915L);
lbl43:
                    // 2 sources

                    var3_3 /* !! */  = (int)v0;
                    if (!var2_2) continue block11;
lbl45:
                    // 2 sources

                    var3_3 /* !! */  = (i4.a(5067, 4819875290910029890L) / i4.a(20775, 7280499897734380218L) ^ i4.a(29142, 775185398910622290L)) - i4.a(5745, 1163625975428808161L);
                    if (!var2_2) continue block11;
lbl47:
                    // 2 sources

                    v1 = i4.H("oqgQfTR6iOyvUVY9", max(int int ), (int)(i4.a(5714, 9030206203905670612L) + i4.a(10500, 30883324901278337L) ^ i4.a(3911, 1492409427697853645L)), (int)i4.a(11248, 4974429927676231794L)) + i4.a(5422, 8933402592024329915L);
lbl48:
                    // 2 sources

                    var3_3 /* !! */  = (int)v1;
                    if (!var2_2) continue block11;
lbl50:
                    // 2 sources

                    var3_3 /* !! */  = (int)(hi.a("G", (int)(i4.a(23357, 3329845124838011066L) * i4.a(26982, 1916085861383013064L)), (int)i4.a(11450, 216850459809990445L), (long)834203424483934088L) * i4.a(31041, 1941945229396677331L) - i4.a(4039, 7190068023586972756L) + i4.a(25161, 8895247170022181336L));
                    continue block11;
                    case 476994023: 
                }
                break;
            }
            break;
        }
        return null;
    }

    private void J(Object[] objectArray) {
        nq nq2 = (nq)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        hi.a("\u00f2", (Object)this, (nq)nq2, (long)599599406792532184L);
        hi.a("\u00f2", (Object)this, (float)f, (long)376000727518660259L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)556821065722535863L);
    }

    private void W(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, null, (long)599599406792532184L);
        hi.a("\u00f2", (Object)this, (float)Float.MAX_VALUE, (long)376000727518660259L);
        hi.a("\u00f2", (Object)this, (float)Float.NEGATIVE_INFINITY, (long)556821065722535863L);
    }

    private i4() {
        hi.a("\u00f2", (Object)this, (float)Float.MAX_VALUE, (long)376000727518660259L);
        hi.a("\u00f2", (Object)this, (float)Float.NEGATIVE_INFINITY, (long)556821065722535863L);
    }

    public static /* bridge */ /* synthetic */ CallSite H(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3768189758020190952L;
                var6_1 = new long[36];
                var3_2 = 0;
                var4_3 = "\u00ba\u001e=\u00f2\u00c8\u00ee\u00a6\u00c5\u00bd\u00a7\u009d*\u0080~\u00d2\u00ef2G\u0088\u00e6^\u00e2tmA\u00a4wq\u00917\u001e\u0085V\u0082'\u00a5\u0094\u0099y\u00108d\u00beQ\u00bb\u00bcl\u0096\u0087\u00e9wYh\u008am\u009e\u00f3\u0094\u00a5\u00e2\u0096MK\u00d0V,8\u00af%\u00e3\u00be\u00fc\u008a\u0003\u0087\u00943\u00fb\u0091p\u0001\u00dc\u00baP\u001dZ$:\u009c\u00acs\u00e6\r(\u00bb\u00ec\u00d8T\u0098\u00a5I\u008d\u00aeN\u0005\u009b\u00f9\u00fa7\u00f1\u001cr\u00f40\u00163\u00a3\u00e2\u00b1\u00de;|F\u0095\u00e2\u00c0(\u00abK\u00e5!\u00c6\u008a\u00b6\u00b8U\u00d3\u00f07\u00ab\u0085\u00d2\u00e1|1\u00ce\u00f4\u0015KSp\u00fbb,\u00f5Koi\u008a\u00d2\u00d2\u00a3\u0001\u009e\u00e7Y7\u00806\u009b\u00a6Q\u00d5O_\u0082\u009azT\u00c4+`\u00bc\u0002\u0083\u00831#\u00ac\u00cf\u00c9MP\u00ddAe\u00df0\u0017\u000b\u008e\u00e4\u0092`\u00ff\u00dc\u0095\u0098w\u00aa\u00e8\u00c9\u001cR\u00bdK\u00b2H\u0019\u00c1\u009c\u00c60,@g\u00f6s\u00c6\u00ba\u00f8\u000bXi\u00d7\u00caj\u00fe\u0087P\u00f2\u0015y\u008bG/oE\u00a1\u00b2g\u00c8\u0000\u00ecz\u009c\u00c6u\u00f3\u00c3\u00b4\u0006\u000b<\u008a\u00a8Z+O\u00c2\u00b0\u00ab";
                var5_4 = "\u00ba\u001e=\u00f2\u00c8\u00ee\u00a6\u00c5\u00bd\u00a7\u009d*\u0080~\u00d2\u00ef2G\u0088\u00e6^\u00e2tmA\u00a4wq\u00917\u001e\u0085V\u0082'\u00a5\u0094\u0099y\u00108d\u00beQ\u00bb\u00bcl\u0096\u0087\u00e9wYh\u008am\u009e\u00f3\u0094\u00a5\u00e2\u0096MK\u00d0V,8\u00af%\u00e3\u00be\u00fc\u008a\u0003\u0087\u00943\u00fb\u0091p\u0001\u00dc\u00baP\u001dZ$:\u009c\u00acs\u00e6\r(\u00bb\u00ec\u00d8T\u0098\u00a5I\u008d\u00aeN\u0005\u009b\u00f9\u00fa7\u00f1\u001cr\u00f40\u00163\u00a3\u00e2\u00b1\u00de;|F\u0095\u00e2\u00c0(\u00abK\u00e5!\u00c6\u008a\u00b6\u00b8U\u00d3\u00f07\u00ab\u0085\u00d2\u00e1|1\u00ce\u00f4\u0015KSp\u00fbb,\u00f5Koi\u008a\u00d2\u00d2\u00a3\u0001\u009e\u00e7Y7\u00806\u009b\u00a6Q\u00d5O_\u0082\u009azT\u00c4+`\u00bc\u0002\u0083\u00831#\u00ac\u00cf\u00c9MP\u00ddAe\u00df0\u0017\u000b\u008e\u00e4\u0092`\u00ff\u00dc\u0095\u0098w\u00aa\u00e8\u00c9\u001cR\u00bdK\u00b2H\u0019\u00c1\u009c\u00c60,@g\u00f6s\u00c6\u00ba\u00f8\u000bXi\u00d7\u00caj\u00fe\u0087P\u00f2\u0015y\u008bG/oE\u00a1\u00b2g\u00c8\u0000\u00ecz\u009c\u00c6u\u00f3\u00c3\u00b4\u0006\u000b<\u008a\u00a8Z+O\u00c2\u00b0\u00ab".length();
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
                    var4_3 = "\u001b\u00c0\u00ca\u001e\u00d0\u0087\u00e1\u00fe\u008c\u0002\u001efa\u00ac\u0086\u00e3";
                    var5_4 = "\u001b\u00c0\u00ca\u001e\u00d0\u0087\u00e1\u00fe\u008c\u0002\u001efa\u00ac\u0086\u00e3".length();
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
        i4.a = var6_1;
        i4.b = new Integer[36];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B8D;
        if (b[n2] == null) {
            i4.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
