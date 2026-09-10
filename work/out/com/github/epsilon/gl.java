/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.gs;
import com.github.epsilon.hi;
import com.github.epsilon.iJ;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;

final class gl
extends gs {
    private static final long[] a;
    private static final Integer[] d;

    @Override
    protected int C() {
        return gl.b(16942, 5842779742955392423L);
    }

    @Override
    protected int n(Object[] objectArray) {
        return (int)hi.a("G", (int)hi.a("\u00e9", (Object)this, (long)932224973340092472L), (int)gl.b(16942, 5842779742955392423L), (long)476721548361853495L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void M(Object[] var1_1) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var2_2 = Dl.t();
                        var3_3 /* !! */  = (gl.b(25044, 1407392507870998099L) - gl.b(17549, 8491776163000044293L) + gl.b(8546, 1535533673697128180L)) / gl.b(22981, 9002707036264650318L) - gl.b(16603, 6270716924371029828L) ^ gl.b(1647, 7310716772279028211L);
                        if (var2_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)932224973340092472L);
                                v1 = gl.b(16569, 7716450458204819239L);
                                if (var2_2) break block12;
                                if (v0 /* !! */  <= v1) break block13;
                                break block14;
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                v2 = this;
                                hi.a("\u00f2", (Object)v2, (float)(hi.a("\u00e9", (Object)v2, (long)813589640703568556L) - 0.033333335f), (long)813589640703568556L);
                                if (var2_2) {
lbl16:
                                    // 2 sources

                                    while (true) {
                                        hi.a("G", (long)510943974080801881L);
lbl19:
                                        // 2 sources

                                        while (true) {
                                            v3 = this;
                                            hi.a("\u00f2", (Object)v3, (double)(hi.a("\u00e9", (Object)v3, (long)1078706094324596397L) * 0.949999988079071), (long)1078706094324596397L);
                                            return;
                                        }
                                        break;
                                    }
                                }
                                break block15;
                                break;
                            }
                        }
lbl24:
                        // 5 sources

                        while (true) {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 1728815531: {
                                    ** continue;
                                }
                                case 1728815529: {
                                    ** continue;
                                }
                                ** case 1728815532:
lbl33:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    v0 /* !! */  = (CallSite)(hi.a("G", (int)(gl.b(18877, 9157038960108553768L) ^ gl.b(24082, 9120652880929083786L)), (int)gl.b(9054, 3260357758258752709L), (long)834203424483934088L) - gl.b(14178, 6520802324322007277L) ^ gl.b(4012, 2993801454876196896L));
                    v1 = gl.b(29958, 5437949867404720786L);
                }
                var3_3 /* !! */  = (int)(v0 /* !! */  + v1);
                if (!var2_2) ** GOTO lbl24
            }
            var3_3 /* !! */  = (hi.a("G", (int)(gl.b(633, 6848331823202274807L) + gl.b(270, 4750588345125834397L)), (int)gl.b(1448, 1525565673926232633L), (long)834203424483934088L) ^ gl.b(15548, 8457034559750681398L)) / gl.b(1844, 4620293105919297705L) ^ gl.b(10878, 2921365297107510766L);
            if (!var2_2) ** GOTO lbl24
        }
        var3_3 /* !! */  = (hi.a("G", (int)(gl.b(28583, 1300830451679354942L) ^ gl.b(8650, 314144751144578640L)), (int)gl.b(10652, 3907742702353131025L), (long)834203424483934088L) - gl.b(11560, 7872803047445045951L) ^ gl.b(3736, 1652587046445711645L)) + gl.b(2145, 1457671577140037605L);
        ** while (true)
    }

    private gl(iJ iJ2, Vec3 vec3) {
        gl.t("sckreAr1KiGIjrbl", requireNonNull(T ), (Object)iJ2);
        super(iJ2, vec3, gl.b(6818, 2792341873225372976L), (Identifier[])hi.a("j", (long)1151707595483077248L));
        hi.a("\u00f2", (Object)this, (double)0.2, (long)1078706094324596397L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)737001268924615182L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)1041393923578088373L);
    }

    public static /* bridge */ /* synthetic */ CallSite t(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
                var0 = 3205435894810237128L;
                var6_1 = new long[27];
                var3_2 = 0;
                var4_3 = "|\u000f\u0086\u00d9,\u00f2\u00d0k1s\u00b4\u00df\u00de\u00ceKmTy\u00e5SE\f\u0000E\u0005fI\u0011|A\u0097\u00f1W\u00c1i\u0096\u00038y\u00a2\u00b2\u00d19\u00c7\u00cd\u00ee\u00e1\u007f\u00f5\u0002l\u00a4%\u009e\u00eb\fM\u009b\u00a1@\u009e\u0083\u009e\u00a51\u00f7b#Q\u00cd_\u00b4\u001f\u00a1Q\u0092},%T\u00d5r\u00d4\u00ed0\u00abD\u00e0c\u0001\u00c0\u0006\u000f!.\u00b1;\u0019\u001a\u00e2\u00e1\u0014\u008a\u00a5\u00aeG\u00df=\u008b\u00b1\u00feP\u00d1~\u0085\u00d6\u0016\u00d4\u00b6\u00d8\u0083\u00ac[H1\u007fM\u00c2aN\u00c7\u00c9\u00dfOa\u00d8uw\u00beBp\u00af(\u00a4K\u00f4\u00cbN\u009a\u00f9^\u00b2\u00e9\u000e%\u00fa\u00d2\u00e7/[\u00f7\u0096r\u0007\u00d3\u00c7\u0015qzx\u007fd\u00e8M\u0007\u00ee\u00c0K\u009agu\u0005\u008e\u008cRJ\u0006\u00ee\u00b7\u0095\u00ed\u00a4\u001f\u0081\u0099\u009dr\u0091\u00a9\u0099";
                var5_4 = "|\u000f\u0086\u00d9,\u00f2\u00d0k1s\u00b4\u00df\u00de\u00ceKmTy\u00e5SE\f\u0000E\u0005fI\u0011|A\u0097\u00f1W\u00c1i\u0096\u00038y\u00a2\u00b2\u00d19\u00c7\u00cd\u00ee\u00e1\u007f\u00f5\u0002l\u00a4%\u009e\u00eb\fM\u009b\u00a1@\u009e\u0083\u009e\u00a51\u00f7b#Q\u00cd_\u00b4\u001f\u00a1Q\u0092},%T\u00d5r\u00d4\u00ed0\u00abD\u00e0c\u0001\u00c0\u0006\u000f!.\u00b1;\u0019\u001a\u00e2\u00e1\u0014\u008a\u00a5\u00aeG\u00df=\u008b\u00b1\u00feP\u00d1~\u0085\u00d6\u0016\u00d4\u00b6\u00d8\u0083\u00ac[H1\u007fM\u00c2aN\u00c7\u00c9\u00dfOa\u00d8uw\u00beBp\u00af(\u00a4K\u00f4\u00cbN\u009a\u00f9^\u00b2\u00e9\u000e%\u00fa\u00d2\u00e7/[\u00f7\u0096r\u0007\u00d3\u00c7\u0015qzx\u007fd\u00e8M\u0007\u00ee\u00c0K\u009agu\u0005\u008e\u008cRJ\u0006\u00ee\u00b7\u0095\u00ed\u00a4\u001f\u0081\u0099\u009dr\u0091\u00a9\u0099".length();
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
                    var4_3 = "IGNP>\u00bb\u00d8#\u001e\u001b\u00ad\u0083'\u00fb7\u00d2";
                    var5_4 = "IGNP>\u00bb\u00d8#\u001e\u001b\u00ad\u0083'\u00fb7\u00d2".length();
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
        gl.a = var6_1;
        gl.d = new Integer[27];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xF9D;
        if (d[n2] == null) {
            gl.d[n2] = (int)(a[n2] ^ l);
        }
        return d[n2];
    }
}
