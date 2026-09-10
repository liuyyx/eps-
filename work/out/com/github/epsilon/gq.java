/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Quaternionf
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xi;
import com.github.epsilon.gs;
import com.github.epsilon.hi;
import com.github.epsilon.iJ;
import com.mojang.blaze3d.vertex.PoseStack;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionf;

final class gq
extends gs {
    private float q;
    private final float y;
    final iJ e;
    private final boolean f;
    private float R;
    private static final long[] a;
    private static final Integer[] d;

    @Override
    protected int C() {
        return (int)(hi.a("\u00e9", (Object)this, (long)1064144588222028637L) / 2);
    }

    @Override
    protected void M(Object[] objectArray) {
        gq gq2 = this;
        hi.a("\u00f2", (Object)gq2, (float)(hi.a("\u00e9", (Object)gq2, (long)737001268924615182L) + hi.a("\u00e9", (Object)this, (long)704224681088770532L) * hi.a("\u00e9", (Object)this, (long)608177321337256519L)), (long)737001268924615182L);
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)704224681088770532L) - 1.0f / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)704224681088770532L);
        gq gq3 = this;
        hi.a("\u00f2", (Object)gq3, (float)(hi.a("\u00e9", (Object)gq3, (long)1304691360275602025L) - 1.0f / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)), (long)1304691360275602025L);
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)1304691360275602025L) * hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)869287773518581303L), (long)996942242067786222L), (Object)new Object[0], (long)1130181261751862596L)), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)813589640703568556L);
    }

    @Override
    protected int n(Object[] objectArray) {
        return (int)hi.a("G", (int)hi.a("\u00e9", (Object)this, (long)932224973340092472L), (int)(hi.a("\u00e9", (Object)this, (long)1064144588222028637L) / 2), (long)476721548361853495L);
    }

    public static /* bridge */ /* synthetic */ CallSite X(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Could not resolve type clashes
     */
    @Override
    protected void o(Object[] var1_1) {
        block14: {
            block13: {
                block11: {
                    block12: {
                        var3_2 = (PoseStack)var1_1[0];
                        var4_3 = (Xi)var1_1[1];
                        var2_4 = ((Float)var1_1[2]).floatValue();
                        var5_5 = Dl.S();
                        var6_6 /* !! */  = gq.b(17793, 1544227860219192354L) + gq.b(22374, 733865368039716551L) + gq.b(18123, 8250204043048740721L) ^ gq.b(22358, 2054411877727401709L);
                        if (!var5_5) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                v0 = new Object[4];
                                v0[3] = hi.a("\u00a5", (Object)new Quaternionf(), (float)1.5707964f, (long)805925748301981465L);
                                v0[2] = Float.valueOf(var2_4);
                                v0[1] = var4_3;
                                v0[0] = var3_2;
                                hi.a("\u00a5", (Object)this, (Object)v0, (long)693677239411801080L);
                                v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)756860493845054065L);
                                if (!var5_5) break block11;
                                if (v1 /* !! */  == false) break block12;
                                break block13;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                v2 = new Object[4];
                                v2[3] = gq.X("lEB73ybrPelZ8bdL", rotateX(float ), (Quaternionf)hi.a("\u00a5", (Object)new Quaternionf(), (float)0.7853982f, (long)727592980829567653L), (float)1.5707964f);
                                v2[2] = Float.valueOf(var2_4);
                                v2[1] = var4_3;
                                v2[0] = var3_2;
                                hi.a("\u00a5", (Object)this, (Object)v2, (long)693677239411801080L);
                                if (!var5_5) lbl-1000:
                                // 2 sources

                                {
                                    return;
                                }
                                break block14;
                                break;
                            }
                        }
lbl30:
                        // 5 sources

                        while (true) {
                            switch (var6_6 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 47219890: {
                                    ** continue;
                                }
                                case 47219887: {
                                    ** continue;
                                }
                                case 47219888: 
                            }
                            hi.a("G", (long)1300536579992390540L);
                            gq.X("lEB73ybrPelZ8bdL", g());
                            return;
                        }
                    }
                    v1 /* !! */  = (CallSite)(hi.a("G", (int)((gq.b(22136, 9221841022183339979L) ^ gq.b(10857, 4903035727298661332L)) + gq.b(14642, 576646264679340176L)), (int)gq.b(9286, 1833397039888631270L), (long)834203424483934088L) ^ gq.b(22366, 8948071342446343915L));
                }
                var6_6 /* !! */  = (int)v1 /* !! */ ;
                if (var5_5) ** GOTO lbl30
            }
            var6_6 /* !! */  = (hi.a("G", (int)gq.b(30899, 862922242606291212L), (int)gq.b(24196, 6272496978637782835L), (long)834203424483934088L) + gq.b(13495, 8668970539251766543L)) * gq.b(2918, 7448823153898924767L) ^ gq.b(30739, 727007924844190134L) ^ gq.b(5802, 1233360322891396888L);
            if (var5_5) ** GOTO lbl30
        }
        var6_6 /* !! */  = hi.a("G", (int)((gq.b(31417, 3589371936731126541L) ^ gq.b(14400, 4021254334829074942L)) + gq.b(31637, 4732704380788693545L)), (int)gq.b(1038, 6470169099205027263L), (long)834203424483934088L) ^ gq.b(22601, 6257869391016163833L);
        ** while (true)
    }

    private gq(iJ iJ2, Vec3 vec3, Identifier[] identifierArray, float f, float f2, float f3, boolean bl) {
        iJ iJ3 = iJ2;
        gq.X("lEB73ybrPelZ8bdL", requireNonNull(T ), (Object)iJ3);
        this.e = iJ3;
        super(iJ2, vec3, gq.b(5641, 3704306757030885311L), identifierArray);
        hi.a("\u00f2", (Object)this, (float)f, (long)704224681088770532L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)1304691360275602025L);
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)(f2 * hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)iJ2, (long)996942242067786222L), (Object)new Object[0], (long)1130181261751862596L)), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)813589640703568556L);
        hi.a("\u00f2", (Object)this, (float)0.5f, (long)737001268924615182L);
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)1041393923578088373L);
        this.y = f3 * 0.1f;
        this.f = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5920679483505983642L;
                var6_1 = new long[21];
                var3_2 = 0;
                var4_3 = "\u00b8<\u00f2W^\u008bg>\u0097\u00b5\u00baq>l(\u00be\u00ae1(@\u00e0\u0083\u00a7(\u0090\u0099\u00f6A\u00ca\u0089\u00db\u00bd\u0001\u00f3\u00ac\u009d\u0017\u007f'\u00ac\u0098\u00c0u/iB\u000b\u00ee\u001cU$\u00a3\u00f4\u0005_nX\u00d9\u009b\u00b7\u0084\u00b6\u00f7\r<2\u0090\u00df\u00ae\u00a48\u00da\u001d\u00a4\u00ca\u00e9\u00a4H\u00ca\u009a\t\u00b5\u00a5%U\u00ed\u00f2\u008b\u0004@\u007f4D\u0016u\u00bdOb\u00ac\u009d\u00b7\u00f0\u0083@\u0091\u0007TBb\u00ab\u00a6H\u00abX\u009c\u0006\u00e4\u009b\u00da@s\u00176\u0002\u009b\u00a3\u0091j\u0080\u00bd\u001a\f\u00c7\u008d\u00d53\u001a3\u0017\u0089j\u0088\u00c7g8\u00bf4|\u00d5:.1";
                var5_4 = "\u00b8<\u00f2W^\u008bg>\u0097\u00b5\u00baq>l(\u00be\u00ae1(@\u00e0\u0083\u00a7(\u0090\u0099\u00f6A\u00ca\u0089\u00db\u00bd\u0001\u00f3\u00ac\u009d\u0017\u007f'\u00ac\u0098\u00c0u/iB\u000b\u00ee\u001cU$\u00a3\u00f4\u0005_nX\u00d9\u009b\u00b7\u0084\u00b6\u00f7\r<2\u0090\u00df\u00ae\u00a48\u00da\u001d\u00a4\u00ca\u00e9\u00a4H\u00ca\u009a\t\u00b5\u00a5%U\u00ed\u00f2\u008b\u0004@\u007f4D\u0016u\u00bdOb\u00ac\u009d\u00b7\u00f0\u0083@\u0091\u0007TBb\u00ab\u00a6H\u00abX\u009c\u0006\u00e4\u009b\u00da@s\u00176\u0002\u009b\u00a3\u0091j\u0080\u00bd\u001a\f\u00c7\u008d\u00d53\u001a3\u0017\u0089j\u0088\u00c7g8\u00bf4|\u00d5:.1".length();
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
                    var4_3 = "\u00ea\u00a2\u00e7\u0095\u00a67d\u00f1\u0090\u00a3\u00b2\u0014Y\u00e0@K";
                    var5_4 = "\u00ea\u00a2\u00e7\u0095\u00a67d\u00f1\u0090\u00a3\u00b2\u0014Y\u00e0@K".length();
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
        gq.a = var6_1;
        gq.d = new Integer[21];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x21B1;
        if (d[n2] == null) {
            gq.d[n2] = (int)(a[n2] ^ l);
        }
        return d[n2];
    }
}
