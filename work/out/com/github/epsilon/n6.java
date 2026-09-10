/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Oq;
import com.github.epsilon._t;
import com.github.epsilon.hi;
import com.github.epsilon.vq;
import com.github.epsilon.yn;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

final class n6 {
    final Oq S;
    final float z;
    final vq o;
    final _t W;
    long C;
    final yn v;
    GpuBufferSlice O;
    long Y;
    GpuBufferSlice q;
    private static final long[] a;
    private static final Integer[] b;

    public static /* bridge */ /* synthetic */ CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private n6(vq vq2, _t _t2, yn yn2, float f, Oq oq) {
        vq vq3 = vq2;
        Objects.requireNonNull(vq3);
        this.o = vq3;
        hi.a("\u00f2", (Object)this, (long)0L, (long)736183204801137158L);
        hi.a("\u00f2", (Object)this, (long)0L, (long)874088229852808600L);
        this.W = _t2;
        this.v = yn2;
        this.z = f;
        this.S = oq;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private long f(Object[] var1_1) {
        block11: {
            block12: {
                var2_2 = (Integer)var1_1[0];
                var3_3 = Dl.S();
                var8_4 /* !! */  = hi.a("G", (int)n6.a(482, 1696056153177308344L), (int)n6.a(22444, 3822697101185706744L), (long)834203424483934088L) ^ n6.a(2858, 9204713679373416056L);
                if (var3_3) break block12;
lbl6:
                // 2 sources

                while (true) {
                    block14: {
                        block13: {
                            var4_5 = hi.a("\u00e9", (Object)this, (long)736183204801137158L);
                            var6_6 = var4_5 + (long)var2_2 * hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)912887996496476638L), (long)389567683454482403L);
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1177354962355027797L), (long)var6_6, (long)622741647270629025L);
                            v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1177354962355027797L), (long)468077952600542431L);
                            if (!var3_3) break block13;
                            if (v0 == false) break block14;
                            v0 = hi.a("G", (int)n6.a(28064, 38155841243926775L), (int)n6.a(168, 1052250561798815220L), (long)834203424483934088L) + n6.a(27227, 2714027524735457030L);
                        }
                        var8_4 /* !! */  = (int)v0;
                        if (var3_3) break block11;
                    }
                    var8_4 /* !! */  = n6.a(3046, 6495062072196216510L) / n6.a(19472, 6146560729661698368L) + n6.a(19962, 6556103320841154721L) - n6.a(28839, 7271817520007826930L);
                    if (var3_3) break block11;
                    ** GOTO lbl43
                    break;
                }
            }
            while (true) {
                switch (var8_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1596803990: 
                }
                hi.a("G", (long)1134434820933353061L);
                var8_4 /* !! */  = (int)(hi.a("G", (int)n6.a(9714, 7824711566828411051L), (int)n6.a(22755, 6163395124687267232L), (long)834203424483934088L) * n6.a(14336, 4141953316882351443L) - n6.a(25919, 5778681514848573537L));
            }
        }
        block9: while (true) {
            switch (var8_4 /* !! */ ) {
                default: {
                    n6.j("FcZt1GyIUNPOeF4w", c(), (_t)hi.a("\u00e9", (Object)this, (long)1177354962355027797L));
                    if (var3_3) ** GOTO lbl43
                    ** GOTO lbl-1000
                }
                case 1005999333: lbl-1000:
                // 2 sources

                {
                    hi.a("\u00f2", (Object)this, (long)hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1177354962355027797L), (long)1141641667400208417L), (long)517346999203462081L), (long)874088229852808600L);
                    hi.a("\u00f2", (Object)this, (long)var6_6, (long)736183204801137158L);
                    return (long)(hi.a("\u00e9", (Object)this, (long)874088229852808600L) + var4_5);
                }
lbl43:
                // 2 sources

                var8_4 /* !! */  = (int)(hi.a("G", (int)n6.a(2152, 2609865781475915063L), (int)n6.a(15014, 2275220613691869175L), (long)834203424483934088L) + n6.a(25372, 1740370364260212298L));
                continue block9;
                case 1005999334: 
            }
            break;
        }
        return (long)hi.a("G", (long)1147173558201835878L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1352827330467866205L;
                var6_1 = new long[17];
                var3_2 = 0;
                var4_3 = "}\u0005\u00c6\u00b8\"+\u001b\u0089\u00a8\u00e2|\u00bfoN1)\"\u00f7P\u00a6@q\u00e7^\u00c0g\u00e3\u0097\u00eb#\u00d7\u0012c\u00c1*\u0081\u00c4\u00c4\u00b0\u0097\u00d2\u0003<\u00ddo\nv\u00bfu\u00d5\u00f4\u008f\u00ba\u00f6\rv.\u00eb/Q\u00c1\u00b1Y\u00c2}e\u009a3C_\u00fe\u00ea\u009e\u00cc^,j\u00d5\u001d5\u00aa\u00fa\u00b2d^\u00b8 \u0098\u00a1\u00c7U\u00cf&f\u00b6\u000b\u009f\u00f3\b>\u0017\u00e6UW\u001c_\fA-\u00e1\u00fc\u00f2\u00880\u00c5j\u000e/\u00ff\u00f3";
                var5_4 = "}\u0005\u00c6\u00b8\"+\u001b\u0089\u00a8\u00e2|\u00bfoN1)\"\u00f7P\u00a6@q\u00e7^\u00c0g\u00e3\u0097\u00eb#\u00d7\u0012c\u00c1*\u0081\u00c4\u00c4\u00b0\u0097\u00d2\u0003<\u00ddo\nv\u00bfu\u00d5\u00f4\u008f\u00ba\u00f6\rv.\u00eb/Q\u00c1\u00b1Y\u00c2}e\u009a3C_\u00fe\u00ea\u009e\u00cc^,j\u00d5\u001d5\u00aa\u00fa\u00b2d^\u00b8 \u0098\u00a1\u00c7U\u00cf&f\u00b6\u000b\u009f\u00f3\b>\u0017\u00e6UW\u001c_\fA-\u00e1\u00fc\u00f2\u00880\u00c5j\u000e/\u00ff\u00f3".length();
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
                    var4_3 = "\u00de\u00ca\u0019\u0007&\b\u00dd]\u00c8\u00eb\u00d3g\u00d2\"\u00b8^";
                    var5_4 = "\u00de\u00ca\u0019\u0007&\b\u00dd]\u00c8\u00eb\u00d3g\u00d2\"\u00b8^".length();
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
        n6.a = var6_1;
        n6.b = new Integer[17];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D53;
        if (b[n2] == null) {
            n6.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
