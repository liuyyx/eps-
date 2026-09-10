/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.gs;
import com.github.epsilon.hi;
import com.github.epsilon.iJ;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;

final class gT
extends gs {
    private static final long[] a;
    private static final Integer[] d;

    private gT(iJ iJ2, Vec3 vec3) {
        Objects.requireNonNull(iJ2);
        super(iJ2, vec3, gT.b(9342, 3013488514047478945L), (Identifier[])hi.a("j", (long)934298514117453976L));
        hi.a("\u00f2", (Object)this, (float)-0.1f, (long)592263982715586114L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)1041393923578088373L);
        hi.a("\u00f2", (Object)this, (float)((float)gT.s("vZkvx98qd7pw56yA", k(int int ), (iJ)iJ2, (int)5, (int)gT.b(19328, 8466866736780632922L)) * 0.06f), (long)737001268924615182L);
        hi.a("\u00f2", (Object)this, (double)((float)gT.s("vZkvx98qd7pw56yA", k(int int ), (iJ)iJ2, (int)gT.b(5730, 4632697419144838847L), (int)gT.b(2868, 8183544643361776616L)) * 0.02f), (long)609409853844784478L);
        hi.a("\u00f2", (Object)this, (double)((float)gT.s("vZkvx98qd7pw56yA", k(int int ), (iJ)iJ2, (int)gT.b(17441, 7431692820378742015L), (int)gT.b(2868, 8183544643361776616L)) * 0.02f), (long)669321080678999846L);
    }

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (float)((1.0f - (float)hi.a("\u00e9", (Object)this, (long)932224973340092472L) / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)) * 0.45f), (long)813589640703568556L);
        gT gT2 = this;
        hi.a("\u00f2", (Object)gT2, (double)(hi.a("\u00e9", (Object)gT2, (long)609409853844784478L) * (double)0.9f), (long)609409853844784478L);
        gT gT3 = this;
        hi.a("\u00f2", (Object)gT3, (double)(hi.a("\u00e9", (Object)gT3, (long)669321080678999846L) * (double)0.9f), (long)669321080678999846L);
    }

    public static /* bridge */ /* synthetic */ CallSite s(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
                var0 = 1949024570251502407L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "v[\u0004d\u0001\u00d8pN*7\u0088\u00f7n\u00dco\u00f2\u00ee\u0092u\u0019\u009fx@\u00a5";
                var5_4 = "v[\u0004d\u0001\u00d8pN*7\u0088\u00f7n\u00dco\u00f2\u00ee\u0092u\u0019\u009fx@\u00a5".length();
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
                    var4_3 = "\u00e8\u0090y\u00c0<Y\u00a2\u000e\u000f\u00b4\u00da\u0081>8\u0000\u0017";
                    var5_4 = "\u00e8\u0090y\u00c0<Y\u00a2\u000e\u000f\u00b4\u00da\u0081>8\u0000\u0017".length();
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
        gT.a = var6_1;
        gT.d = new Integer[5];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x28DE;
        if (d[n2] == null) {
            gT.d[n2] = (int)(a[n2] ^ l);
        }
        return d[n2];
    }
}
