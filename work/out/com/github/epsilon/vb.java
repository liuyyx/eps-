/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Camera
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.u8;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.Camera;
import net.minecraft.world.phys.Vec3;

class vb {
    private final Vec3 H;
    private int r;
    private int C;
    private final Color z;
    private final Vec3 O;
    final u8 N;
    private static final long[] a;
    private static final Integer[] b;

    public Color Z(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)849675320103763181L);
    }

    public double z(float f) {
        return (double)((float)hi.a("\u00e9", (Object)this, (long)1018990184552913350L) + (float)(hi.a("\u00e9", (Object)this, (long)827661140324956926L) - hi.a("\u00e9", (Object)this, (long)1018990184552913350L)) * f) / 10.0;
    }

    public Vec3 b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)vb.T("B6eBDw71asbxb23t", A(com.github.epsilon.u8 ), (u8)((Object)hi.a("\u00e9", (Object)this, (long)1075117891297536062L))), (long)968554650154943535L), (long)529286173586661242L);
        reference var4_4 = hi.a("G", (double)f, (double)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1264381783844577444L), (long)1300412705618690751L), (double)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)602500293981594022L), (long)1300412705618690751L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1300412705618690751L);
        reference var6_5 = hi.a("G", (double)f, (double)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1264381783844577444L), (long)1294071886475894755L), (double)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)602500293981594022L), (long)1294071886475894755L), (long)634868052102297765L) - hi.a("\u00e9", (Object)vb.T("B6eBDw71asbxb23t", position(), (Camera)callSite), (long)1294071886475894755L);
        reference var8_6 = hi.a("G", (double)f, (double)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1264381783844577444L), (long)1282612456329596420L), (double)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)602500293981594022L), (long)1282612456329596420L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1282612456329596420L);
        return new Vec3((double)var4_4, (double)var6_5, (double)var8_6);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean i() {
        block15: {
            var1_1 = Dl.S();
            var2_2 /* !! */  = vb.T("B6eBDw71asbxb23t", max(int int ), (int)vb.a(8391, 8701900167911839804L), (int)vb.a(10612, 4484189112863330715L)) * vb.a(5023, 2973819435391101798L) ^ vb.a(18834, 1776967937882059118L);
            if (var1_1) ** GOTO lbl18
            block8: while (true) {
                block18: {
                    block17: {
                        block16: {
                            hi.a("\u00f2", (Object)this, (int)hi.a("\u00e9", (Object)this, (long)827661140324956926L), (long)1018990184552913350L);
                            v0 = this;
                            v1 = hi.a("\u00e9", (Object)v0, (long)827661140324956926L);
                            v2 /* !! */  = v1;
                            hi.a("\u00f2", (Object)v0, (int)(v1 - true), (long)827661140324956926L);
                            if (!var1_1) break block16;
                            if (v2 /* !! */  <= 0) break block17;
                            v2 /* !! */  = (CallSite)(hi.a("G", (int)(vb.a(14316, 1185707997641248529L) * vb.a(5053, 4270953652202548056L)), (int)vb.a(15080, 555625732335403526L), (long)834203424483934088L) ^ vb.a(4932, 1837042223163616182L));
                        }
                        var2_2 /* !! */  = (int)v2 /* !! */ ;
                        if (var1_1) break block18;
                    }
                    var2_2 /* !! */  = hi.a("G", (int)vb.a(15244, 2454565096593163108L), (int)vb.a(4660, 6241634647649462979L), (long)834203424483934088L) ^ vb.a(2422, 5088330490536997262L);
                }
                switch (var2_2 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case 1224491977: {
                        v3 = true;
                        var2_2 /* !! */  = (hi.a("G", (int)hi.a("G", (int)(vb.a(14437, 6086622256331948186L) / 5), (int)vb.a(15493, 2476544376423974001L), (long)834203424483934088L), (int)vb.a(9827, 9195331910161571478L), (long)834203424483934088L) ^ vb.a(3487, 4497033446873380212L)) - vb.a(7054, 8688560315135861630L);
                        if (!var1_1) {
                            break block8;
                        }
                        break block15;
                    }
                    case 1224491976: {
                        v3 = false;
                        if (var1_1) break block8;
                        return v3;
                    }
                    case 1224491975: {
                        return true;
                    }
                }
                break;
            }
            var2_2 /* !! */  = (hi.a("G", (int)vb.T("B6eBDw71asbxb23t", max(int int ), (int)(vb.a(23215, 130689179870093918L) / 5), (int)vb.a(8854, 2792365140536531552L)), (int)vb.a(8160, 1298629031733733130L), (long)834203424483934088L) ^ vb.a(24883, 7447200247016217055L)) - vb.a(26060, 6917295861322538273L);
        }
        block9: while (true) {
            switch (var2_2 /* !! */ ) {
                case 1363341098: {
                    hi.a("G", (long)632688375482250411L);
                    var2_2 /* !! */  = vb.a(3130, 5392815303479473344L) / vb.a(15271, 4431114762898113358L) + vb.a(15233, 3177956218497663845L);
                    continue block9;
                }
            }
            break;
        }
        return v3;
    }

    public static /* bridge */ /* synthetic */ CallSite T(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private vb(u8 u82, Vec3 vec3, Vec3 vec32, Color color) {
        u8 u83 = u82;
        vb.T("B6eBDw71asbxb23t", requireNonNull(T ), (Object)u83);
        this.N = u83;
        hi.a("\u00f2", (Object)this, (int)vb.a(16278, 1280499886383105893L), (long)827661140324956926L);
        hi.a("\u00f2", (Object)this, (int)vb.a(31875, 1247506784960758909L), (long)1018990184552913350L);
        this.H = vec3;
        this.O = vec32;
        this.z = color;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1053328332903249419L;
                var6_1 = new long[26];
                var3_2 = 0;
                var4_3 = "\u00c8?!I\u00dd\u0012\u009b\u008d\u0084\u009e[\u00b1\u00d3j\u00de.%\u00ce\u001e+\u0082\u0081h\u001c\u008c0\u00a1\u00a7\u000e\u00f4\u00b2|\u0084\u00b3\u00e5U\u00a7\u00d3z\u00f4\u00c1\u0080A\u00e1\u008a\u00dafE6SG\u000fg\u00c8\u0096/\u0005\u0010\u00e9\u00dfQF\u00caG\u00ae\u00bcSq\u00a1\u009e~\u00af\u00f0\u0093\u0005l3\u009d\u00d0\u00c0\u00d0;\u001f\u00f9,w\u00ba/\u00f1\u0088\u00efZ\u00fc~\u00ce\u00d1P,f\u00f6\u00c2\u0002\u008a\u00d8.~r;\u00b9\u009cp\u0018\u00a5\u0000\u00a3\u00db\u0004Fqdc\u00d0z\u00cb\u009f\u0088\u00f2\u0000\u0000Lm \u009c\u00ce\u000eG(-w\u0082\u00e4\u0094-~/;YO\u00bc%\u00dc\u00b9pMV\u00d7\u00d6\u0003\u00e2\u00a0\u00fc\u0002\u00c5\u0085\u00e3\u0005uJ\u00c1\u00fd~C\u00aa\u009b\u0017f\u0016;$\u00ee\u00fd\u00feA\u00d5A8Q&\u00b2\u001fG3";
                var5_4 = "\u00c8?!I\u00dd\u0012\u009b\u008d\u0084\u009e[\u00b1\u00d3j\u00de.%\u00ce\u001e+\u0082\u0081h\u001c\u008c0\u00a1\u00a7\u000e\u00f4\u00b2|\u0084\u00b3\u00e5U\u00a7\u00d3z\u00f4\u00c1\u0080A\u00e1\u008a\u00dafE6SG\u000fg\u00c8\u0096/\u0005\u0010\u00e9\u00dfQF\u00caG\u00ae\u00bcSq\u00a1\u009e~\u00af\u00f0\u0093\u0005l3\u009d\u00d0\u00c0\u00d0;\u001f\u00f9,w\u00ba/\u00f1\u0088\u00efZ\u00fc~\u00ce\u00d1P,f\u00f6\u00c2\u0002\u008a\u00d8.~r;\u00b9\u009cp\u0018\u00a5\u0000\u00a3\u00db\u0004Fqdc\u00d0z\u00cb\u009f\u0088\u00f2\u0000\u0000Lm \u009c\u00ce\u000eG(-w\u0082\u00e4\u0094-~/;YO\u00bc%\u00dc\u00b9pMV\u00d7\u00d6\u0003\u00e2\u00a0\u00fc\u0002\u00c5\u0085\u00e3\u0005uJ\u00c1\u00fd~C\u00aa\u009b\u0017f\u0016;$\u00ee\u00fd\u00feA\u00d5A8Q&\u00b2\u001fG3".length();
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
                    var4_3 = "I\u0000\u00ab\u008e2\u00c5;\u0080\u00d7\u00f6o#\u000e(\u00c1\u00d4";
                    var5_4 = "I\u0000\u00ab\u008e2\u00c5;\u0080\u00d7\u00f6o#\u000e(\u00c1\u00d4".length();
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
        vb.a = var6_1;
        vb.b = new Integer[26];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x38FD;
        if (b[n2] == null) {
            vb.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
