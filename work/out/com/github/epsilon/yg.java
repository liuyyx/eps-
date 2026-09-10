/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.vk;
import com.github.epsilon.yT;
import com.github.epsilon.zU;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class yg {
    public static final float k = 10.0f;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static yT M(Object[] var0) {
        block11: {
            block10: {
                block9: {
                    var4_1 = (ih)var0[0];
                    var2_2 = ((Float)var0[1]).floatValue();
                    var3_3 = ((Float)var0[2]).floatValue();
                    var1_4 = ((Float)var0[3]).floatValue();
                    var5_5 = Dl.S();
                    var7_6 /* !! */  = (yg.a(11680, 3495018613827735204L) * yg.a(31574, 4028165241090988117L) ^ yg.a(27483, 4147102177184499801L)) * yg.a(6926, 441454454423828491L) + yg.a(8732, 4779763350158082324L);
                    if (!var5_5) ** GOTO lbl-1000
                    switch (var7_6 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            v0 = new Object[4];
                            v0[3] = Float.valueOf(var1_4);
                            v0[2] = Float.valueOf(var3_3);
                            v0[1] = Float.valueOf(var2_2);
                            v0[0] = var4_1;
                            var6_7 = hi.a("G", (Object)v0, (long)469826428627460717L);
                            if (!var5_5) break block9;
                            if (var6_7 != null) break;
                            break block10;
                        }
                        case -1141142365: {
                            return null;
                        }
                    }
                    var7_6 /* !! */  = (int)(hi.a("G", (int)((yg.a(6611, 2782570746073463506L) ^ yg.a(21128, 2956114639671816582L)) + yg.a(18795, 415420611759663723L)), (int)yg.a(24171, 7181439242580884844L), (long)834203424483934088L) - yg.a(4211, 3397996103963063167L));
                }
                if (var5_5) break block11;
            }
            var7_6 /* !! */  = (hi.a("G", (int)yg.a(25505, 1623880928389775534L), (int)yg.a(26316, 4274923343110817223L), (long)834203424483934088L) + yg.a(7147, 3044213934738782433L)) * yg.a(4590, 7860405157293863655L) ^ yg.a(12644, 7714964219773129321L);
        }
        switch (var7_6 /* !! */ ) {
            default: {
                return null;
            }
            case -865847194: {
                return new yT((float)hi.a("\u00a5", (Object)var6_7, (long)1296121715689270156L), (float)hi.a("\u00a5", (Object)var6_7, (long)1158858709923532539L), (float)hi.a("\u00a5", (Object)var6_7, (long)993405262847979779L), (float)hi.a("\u00a5", (Object)var6_7, (long)941433916570949771L), (float)hi.a("\u00a5", (Object)var6_7, (long)854368075234859697L), (float)hi.a("\u00a5", (Object)var6_7, (long)1129892980857975321L), (float)hi.a("\u00a5", (Object)var6_7, (long)601419232390154847L), (float)yg.d("HorbrwTAe98J0F6K", M8(), (vk)var6_7));
            }
            case -865847195: 
        }
        throw null;
    }

    public static float v(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        ih ih2 = (ih)objectArray[1];
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = Float.valueOf(f3);
        objectArray2[2] = Float.valueOf(f2);
        objectArray2[1] = ih2;
        objectArray2[0] = Float.valueOf(f);
        return (float)hi.a("G", (Object)objectArray2, (long)1244741836487337681L);
    }

    private yg() {
    }

    public static /* bridge */ /* synthetic */ CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static void G(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        ih ih2 = (ih)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f2 = ((Float)objectArray[3]).floatValue();
        float f3 = ((Float)objectArray[4]).floatValue();
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = Float.valueOf(f3);
        objectArray2[4] = Float.valueOf(f2);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = ih2;
        objectArray2[1] = hi.a("j", (long)791229020891128130L);
        objectArray2[0] = zU2;
        hi.a("G", (Object)objectArray2, (long)799122108907727330L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3007793225577292882L;
                var6_1 = new long[15];
                var3_2 = 0;
                var4_3 = "\u0081\u00e1\u00c5\u00e6\u00ea\u00fe\b\u000e\u00ca\u0087z\u00fe\u00e3\u00b7~\u00a8\u00bak\u008d\u00034\u0089[yA\u00c3^\u00a3\u00a6\u00eag6\u0081\u00d9o\u0097_h\u00ca\u00f0\u0080\u00db\u00c5\u00f7\u00cf\u008e\u00cb`\u001e\u00f0%\u0099\u0003\u00ee\u0081C\u00eb\u001a\u009c\u00d7\u0015\u00bd\u00d9\u0095+\u00cd\u00a6\u00e5\u00a5\u00f8\u00b7\u0089?^\u00b7\u00fd\u00d0uX\u0081`\u00b5\u00aazv>\u00d6 h\u00bb+O\u00cc\u0083\u00aa\u0015\u00abt\u0018o\u00a1_`\u00e8";
                var5_4 = "\u0081\u00e1\u00c5\u00e6\u00ea\u00fe\b\u000e\u00ca\u0087z\u00fe\u00e3\u00b7~\u00a8\u00bak\u008d\u00034\u0089[yA\u00c3^\u00a3\u00a6\u00eag6\u0081\u00d9o\u0097_h\u00ca\u00f0\u0080\u00db\u00c5\u00f7\u00cf\u008e\u00cb`\u001e\u00f0%\u0099\u0003\u00ee\u0081C\u00eb\u001a\u009c\u00d7\u0015\u00bd\u00d9\u0095+\u00cd\u00a6\u00e5\u00a5\u00f8\u00b7\u0089?^\u00b7\u00fd\u00d0uX\u0081`\u00b5\u00aazv>\u00d6 h\u00bb+O\u00cc\u0083\u00aa\u0015\u00abt\u0018o\u00a1_`\u00e8".length();
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
                    var4_3 = "\u00bf9K$\u0001z\u00e4\u00f0Z\u0001\u00f2\u0091\u00c1\u00de\u00cd\u008d";
                    var5_4 = "\u00bf9K$\u0001z\u00e4\u00f0Z\u0001\u00f2\u0091\u00c1\u00de\u00cd\u008d".length();
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
        yg.a = var6_1;
        yg.b = new Integer[15];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2309;
        if (b[n2] == null) {
            yg.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
