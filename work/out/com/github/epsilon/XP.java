/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BindGroupLayout
 *  com.mojang.blaze3d.pipeline.BindGroupLayout$Builder
 *  com.mojang.blaze3d.shaders.UniformType
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.pipeline.BindGroupLayout;
import com.mojang.blaze3d.shaders.UniformType;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class XP {
    public static final BindGroupLayout P;
    public static final BindGroupLayout z;
    public static final BindGroupLayout I;
    public static final BindGroupLayout V;
    public static final BindGroupLayout j;
    public static final BindGroupLayout Z;
    public static final BindGroupLayout A;
    public static final BindGroupLayout m;
    public static final BindGroupLayout K;
    public static final BindGroupLayout f;
    public static final BindGroupLayout Y;
    public static final BindGroupLayout x;
    public static final BindGroupLayout b;
    public static final BindGroupLayout W;
    public static final BindGroupLayout a;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[16];
                var4_1 = 0;
                var3_2 = "vK0\u00185I@JO>\u000e#\bc[0\u001d\u0019UeJ\nbO8\b3SGDW0\nbO>\u000b\u0013TmCJ6\u000fgL)><NqpM8\u001a?InV\flM!\t$hbHS=\u0019\"\u0017vF6\u00115Uw@G\u0002\u00141_lRv?\u00156TqHP\u000bcJ=\b5I@JO>\u000e\faF!\b8hbHS=\u0019\"\u000ehL%\u0015?UAIV#81Ob\u0010cL?\b\u0012WvWv?\u00156TqHP\flM!\t$hbHS=\u0019\"\fvK0\u00185ISDQ0\u0011#\tfV\"\b?VPNZ";
                var5_3 = "vK0\u00185I@JO>\u000e#\bc[0\u001d\u0019UeJ\nbO8\b3SGDW0\nbO>\u000b\u0013TmCJ6\u000fgL)><NqpM8\u001a?InV\flM!\t$hbHS=\u0019\"\u0017vF6\u00115Uw@G\u0002\u00141_lRv?\u00156TqHP\u000bcJ=\b5I@JO>\u000e\faF!\b8hbHS=\u0019\"\u000ehL%\u0015?UAIV#81Ob\u0010cL?\b\u0012WvWv?\u00156TqHP\flM!\t$hbHS=\u0019\"\fvK0\u00185ISDQ0\u0011#\tfV\"\b?VPNZ".length();
                var2_4 = 12;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 101;
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
                    var3_2 = "t\\7\u001d\u0016FyP_0\u00020\u000fq\\1\u0003\u0010I~RR-\u0017\nFvY";
                    var5_3 = "t\\7\u001d\u0016FyP_0\u00020\u000fq\\1\u0003\u0010I~RR-\u0017\nFvY".length();
                    var2_4 = 12;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 118;
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
                            v15 = 64;
                            break;
                        }
                        case 1: {
                            v15 = 70;
                            break;
                        }
                        case 2: {
                            v15 = 52;
                            break;
                        }
                        case 3: {
                            v15 = 25;
                            break;
                        }
                        case 4: {
                            v15 = 53;
                            break;
                        }
                        case 5: {
                            v15 = 94;
                            break;
                        }
                        default: {
                            v15 = 102;
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
        XP.j = hi.a("G", var0[10], (long)706291665370251312L);
        XP.m = hi.a("G", var0[2], (long)706291665370251312L);
        XP.V = hi.a("G", var0[6], (long)706291665370251312L);
        XP.b = hi.a("G", var0[15], (long)706291665370251312L);
        XP.P = hi.a("G", var0[1], (long)706291665370251312L);
        XP.Y = XP.O("B9AJx3W9TGqgCl2L", N(java.lang.Object ), (Object)var0[7]);
        XP.a = hi.a("G", var0[13], (long)706291665370251312L);
        XP.I = hi.a("G", var0[14], (long)706291665370251312L);
        XP.f = XP.O("B9AJx3W9TGqgCl2L", N(java.lang.Object ), (Object)var0[4]);
        XP.z = hi.a("G", var0[3], (long)706291665370251312L);
        XP.A = hi.a("G", var0[12], (long)706291665370251312L);
        XP.W = hi.a("G", var0[0], (long)706291665370251312L);
        XP.K = hi.a("G", var0[9], (long)706291665370251312L);
        XP.x = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)1267329027202673618L), (Object)var0[11], (long)1144888123169894664L), (long)755269648143748212L);
        XP.Z = hi.a("\u00a5", (Object)XP.O("B9AJx3W9TGqgCl2L", withSampler(java.lang.String ), (BindGroupLayout.Builder)XP.O("B9AJx3W9TGqgCl2L", withSampler(java.lang.String ), (BindGroupLayout.Builder)hi.a("G", (long)1267329027202673618L), (String)var0[5]), (String)var0[8]), (long)755269648143748212L);
    }

    private static BindGroupLayout N(Object object) {
        return hi.a("\u00a5", (Object)XP.O("B9AJx3W9TGqgCl2L", withUniform(java.lang.String com.mojang.blaze3d.shaders.UniformType ), (BindGroupLayout.Builder)hi.a("G", (long)1267329027202673618L), (String)((String)object), (UniformType)hi.a("j", (long)1325757176313201690L)), (long)755269648143748212L);
    }

    public static /* bridge */ /* synthetic */ CallSite O(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }
}
