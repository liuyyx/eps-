/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.resources.Identifier
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Pose
 *  net.minecraft.world.phys.Vec3
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
import java.util.Objects;
import net.minecraft.resources.Identifier;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.phys.Vec3;

final class gZ
extends gs {
    private float V;
    private final int g;
    final iJ z;
    private final float S;
    private final float y;
    private final float Z;
    private static final long[] a;
    private static final Integer[] d;

    @Override
    protected void o(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        Xi xi = (Xi)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = Float.valueOf((float)(-hi.a("\u00e9", (Object)this, (long)685000169007256968L)));
        objectArray2[1] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)1270795653826098180L));
        objectArray2[0] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)685000169007256968L));
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)1014545969785226912L));
        objectArray3[1] = Float.valueOf(0.0f);
        objectArray3[0] = Float.valueOf(0.0f);
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("G", (Object)objectArray2, (long)812286722774504929L), (Object)hi.a("G", (Object)objectArray3, (long)812286722774504929L), (long)799947091895873526L);
        Object[] objectArray4 = new Object[4];
        objectArray4[3] = callSite;
        objectArray4[2] = Float.valueOf(f);
        objectArray4[1] = xi;
        objectArray4[0] = poseStack;
        hi.a("\u00a5", (Object)this, (Object)objectArray4, (long)693677239411801080L);
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected void M(Object[] var1_1) {
        block16: {
            block19: {
                block17: {
                    block18: {
                        block15: {
                            var2_2 = Dl.S();
                            var5_3 /* !! */  = gZ.b(27274, 2454745856036294138L) * gZ.b(21053, 365901883802252628L) + gZ.b(18728, 1975927749694516811L);
                            if (!var2_2) ** GOTO lbl-1000
                            switch (var5_3 /* !! */ ) {
                                default: lbl-1000:
                                // 2 sources

                                {
                                    var3_4 = hi.a("\u00a5", (Object)this, (Object)new Object[]{(int)hi.a("\u00e9", (Object)this, (long)644106489669853434L)}, (long)1295275066202874490L);
                                    if (!var2_2) break block17;
                                    if (var3_4 == null) break block18;
                                    break block19;
                                }
                                case 1997274152: {
                                    hi.a("G", (long)1206926475581937118L);
                                    return;
                                }
                            }
lbl15:
                            // 2 sources

                            while (true) {
                                block21: {
                                    block20: {
                                        var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)692818440547506094L), (long)996942242067786222L), (long)440657095562936831L);
                                        cfr_temp_0 = var4_5 - 0.0f;
                                        v0 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                        if (!var2_2) break block20;
                                        if (v0 /* !! */  <= 0) break block21;
                                        v0 /* !! */  = (reference)(gZ.b(21099, 155642809268139287L) + gZ.b(11020, 5462748403520605292L) - gZ.b(25585, 9206459487478137998L));
                                    }
                                    var5_3 /* !! */  = (int)v0 /* !! */ ;
                                    if (var2_2) break block15;
                                }
                                var5_3 /* !! */  = (int)(hi.a("G", (int)gZ.b(22928, 1331528835041427185L), (int)gZ.b(32091, 2085272696309013040L), (long)834203424483934088L) - gZ.b(24551, 1840189603284547717L));
                                break block15;
                                break;
                            }
lbl28:
                            // 3 sources

                            while (true) {
                                switch (var5_3 /* !! */ ) {
                                    default: {
                                        hi.a("\u00f2", (Object)this, (double)hi.a("\u00a5", (Object)var3_4, (long)1056215895855441373L), (long)792301987515869896L);
                                        hi.a("\u00f2", (Object)this, (double)(hi.a("\u00a5", (Object)var3_4, (long)1108104001900174719L) + (double)(hi.a("\u00a5", (Object)gZ.X("5FTawKyAu1ngjdIV", getDimensions(net.minecraft.world.entity.Pose ), (Entity)var3_4, (Pose)hi.a("\u00a5", (Object)var3_4, (long)1167468948218867437L)), (long)1101464289718948652L) / 2.0f)), (long)1061381010527330786L);
                                        hi.a("\u00f2", (Object)this, (double)hi.a("\u00a5", (Object)var3_4, (long)729073117846923949L), (long)598428387898362242L);
                                        if (var2_2) break block16;
                                        ** GOTO lbl15
                                    }
                                    case -1833854708: {
                                        ** continue;
                                    }
                                    case -1833854707: {
                                        hi.a("G", (long)818835474660401656L);
                                        hi.a("G", (boolean)false, (long)951202213413429819L);
                                        var5_3 /* !! */  = gZ.b(9812, 3494427186167054633L) + gZ.b(6630, 2423422273592344221L) + gZ.b(27357, 5127497960675495342L) - gZ.b(7402, 2707236929202633628L);
                                        break;
                                    }
                                }
                                continue;
                                break;
                            }
                        }
                        do {
                            switch (var5_3 /* !! */ ) {
                                default: {
                                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)813589640703568556L);
                                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)737001268924615182L);
                                    return;
                                }
                                case 574544351: {
                                    v1 = this;
                                    hi.a("\u00f2", (Object)v1, (float)(hi.a("\u00e9", (Object)v1, (long)1014545969785226912L) + 20.0f), (long)1014545969785226912L);
                                    hi.a("\u00f2", (Object)this, (float)(hi.a("G", (float)((float)hi.a("G", (double)hi.a("G", (double)((double)hi.a("\u00e9", (Object)this, (long)932224973340092472L) / (double)hi.a("\u00e9", (Object)this, (long)1064144588222028637L) * 3.141592653589793), (long)920621527924433365L), (long)1236096628704034685L) / 1.2f), (float)0.0f, (float)1.0f, (long)390336973585993938L) * var4_5), (long)813589640703568556L);
                                    hi.a("\u00f2", (Object)this, (float)(hi.a("\u00e9", (Object)this, (long)813589640703568556L) / var4_5 * hi.a("\u00e9", (Object)this, (long)918315873078717104L)), (long)737001268924615182L);
                                    return;
                                }
                                case 574544349: 
                            }
                            hi.a("G", (long)819552573278442726L);
                            var5_3 /* !! */  = gZ.b(11660, 5306985762344405731L) + gZ.b(31488, 4987825080628993132L) + gZ.b(1707, 4621322459941380565L);
                        } while (var2_2);
                    }
                    var5_3 /* !! */  = gZ.b(6305, 556527798325428164L) * gZ.b(15404, 6168004634013637477L) * gZ.b(1058, 9095900792252277583L) - gZ.b(5813, 6679104106856231378L);
                }
                if (var2_2) ** GOTO lbl28
            }
            var5_3 /* !! */  = (int)(hi.a("G", (int)((gZ.b(14366, 3148670510844518247L) ^ gZ.b(7162, 8991440662840065168L)) / gZ.b(30193, 5497285220972122758L) ^ gZ.b(25194, 3514494686098867490L)), (int)gZ.b(31799, 2024075512835857221L), (long)834203424483934088L) - gZ.b(6331, 1075813203518767054L));
            if (var2_2) ** GOTO lbl28
        }
        var5_3 /* !! */  = gZ.b(7869, 3834390664476801526L) * gZ.b(10083, 1024707601868685337L) * gZ.b(31680, 5007558098650258598L) - gZ.b(23480, 621631588444929238L);
        ** while (true)
    }

    private gZ(iJ iJ2, Vec3 vec3, int n, float f) {
        block4: {
            block2: {
                block3: {
                    iJ iJ3 = iJ2;
                    Objects.requireNonNull(iJ3);
                    this.z = iJ3;
                    super(iJ2, vec3, gZ.b(17817, 4068868863801156337L), (Identifier[])hi.a("j", (long)495485071617150674L));
                    this.g = n;
                    this.S = f;
                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)813589640703568556L);
                    boolean bl = Dl.t();
                    hi.a("\u00f2", (Object)this, (float)0.2f, (long)737001268924615182L);
                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)1041393923578088373L);
                    boolean bl2 = bl;
                    this.Z = (float)hi.a("\u00a5", (Object)iJ2, (int)gZ.b(3029, 2415070118418328737L), (int)gZ.b(1927, 1539556135490724095L), (long)402873961194657983L);
                    hi.a("\u00f2", (Object)this, (float)((float)hi.a("\u00a5", (Object)iJ2, (int)gZ.b(9743, 2095561629728604523L), (int)gZ.b(1758, 8264330163541516719L), (long)402873961194657983L)), (long)1014545969785226912L);
                    this.y = (float)hi.a("\u00a5", (Object)iJ2, (int)gZ.b(9743, 2095561629728604523L), (int)gZ.b(1758, 8264330163541516719L), (long)402873961194657983L);
                    if (bl2) break block2;
                    if (gZ.X("5FTawKyAu1ngjdIV", nextBoolean(), (RandomSource)hi.a("\u00e9", (Object)iJ2, (long)997764946395687615L)) == false) break block3;
                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)1009326797419192685L);
                    hi.a("\u00f2", (Object)this, (float)1.0f, (long)748132799987884835L);
                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)1334802402800276645L);
                    if (!bl2) break block4;
                }
                hi.a("\u00f2", (Object)this, (float)1.0f, (long)1009326797419192685L);
                hi.a("\u00f2", (Object)this, (float)1.0f, (long)748132799987884835L);
            }
            hi.a("\u00f2", (Object)this, (float)0.0f, (long)1334802402800276645L);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8549887174881995004L;
                var6_1 = new long[35];
                var3_2 = 0;
                var4_3 = "\u0099\u00cd\u00f6\u008d\u00de7]\u0089m`1\u00f6\u0098\u0001\u008a%\u0081!\u00ad-\u0011./w\u00ba%\u00ebsU\u00ddKe\u00d9\u00d9Z\u00ab\u00c1\u0005\u00ed2\u001e\u00af\u00f4*B\u00d8\u0001;\u00f5\u00a1\u008d\u00f5\u00df\u00c4\u0088K\u00fb0b\u00cbl1\u00b3\u00d2\u00ee;.Z\u00c5w_\u0014Oh\u00ad\r\u009d\u00c4\nKrV1\u0088\u00a5\u00cb]\u001d\u000f3\u008b\u00dc\u0099G\u007fB`.w#\u0083(\u0092\\>M}\u00b1\u00f7\u0094\u0016\u00db\u00d6-\u00f6\u0094\u008d^\u00fe\u00d6)$\u00bc\u00bf\u00edL\u0012\u00db\u0006\u00dc_x\u0003\u00f0$\u00d30[F\u00db\u00ef0\u00c8\u00b7V\u0082\u00d6;]\u0082\u00b8v=\u00e1^\u0093J\u00f6\u00eeL6a\u00c7\u00e1s\u00d91\u00a8\u00d3\u00e7j\u0013\u0085s&\u00c1\u00bf\u00b5\u009a\u00c6\u0013K\u00fcTn\u00f4P\u00f0\u00ae\u00c9q\u0097 \u007f\u00a5l@\u00f2I\u00e7+q\u00b59Hna\u00db\u001c\u001d\u00deh\u008e|\u0004a\u009e!\u0016\u00c4\u00ba\u00fe\u00de\u00aa\u00f4\u001d\\\u0097\u00d0\u00af^\r\u001c*g=\u00c4\u0081\u00bb\u0011\u00c0\u00cb9\u00d7A\u008e:}\u00a3@\\!\u0014\"v\u00a9\u001c+P\u00b05\u00a8\u00f50";
                var5_4 = "\u0099\u00cd\u00f6\u008d\u00de7]\u0089m`1\u00f6\u0098\u0001\u008a%\u0081!\u00ad-\u0011./w\u00ba%\u00ebsU\u00ddKe\u00d9\u00d9Z\u00ab\u00c1\u0005\u00ed2\u001e\u00af\u00f4*B\u00d8\u0001;\u00f5\u00a1\u008d\u00f5\u00df\u00c4\u0088K\u00fb0b\u00cbl1\u00b3\u00d2\u00ee;.Z\u00c5w_\u0014Oh\u00ad\r\u009d\u00c4\nKrV1\u0088\u00a5\u00cb]\u001d\u000f3\u008b\u00dc\u0099G\u007fB`.w#\u0083(\u0092\\>M}\u00b1\u00f7\u0094\u0016\u00db\u00d6-\u00f6\u0094\u008d^\u00fe\u00d6)$\u00bc\u00bf\u00edL\u0012\u00db\u0006\u00dc_x\u0003\u00f0$\u00d30[F\u00db\u00ef0\u00c8\u00b7V\u0082\u00d6;]\u0082\u00b8v=\u00e1^\u0093J\u00f6\u00eeL6a\u00c7\u00e1s\u00d91\u00a8\u00d3\u00e7j\u0013\u0085s&\u00c1\u00bf\u00b5\u009a\u00c6\u0013K\u00fcTn\u00f4P\u00f0\u00ae\u00c9q\u0097 \u007f\u00a5l@\u00f2I\u00e7+q\u00b59Hna\u00db\u001c\u001d\u00deh\u008e|\u0004a\u009e!\u0016\u00c4\u00ba\u00fe\u00de\u00aa\u00f4\u001d\\\u0097\u00d0\u00af^\r\u001c*g=\u00c4\u0081\u00bb\u0011\u00c0\u00cb9\u00d7A\u008e:}\u00a3@\\!\u0014\"v\u00a9\u001c+P\u00b05\u00a8\u00f50".length();
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
                    var4_3 = "\u00c5\u00d5\u0089\u0084\u0003\u009f\u00ceS\u00b0i{\u007f\u0093\u00cf\u0014n";
                    var5_4 = "\u00c5\u00d5\u0089\u0084\u0003\u009f\u00ceS\u00b0i{\u007f\u0093\u00cf\u0014n".length();
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
        gZ.a = var6_1;
        gZ.d = new Integer[35];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2769;
        if (d[n2] == null) {
            gZ.d[n2] = (int)(a[n2] ^ l);
        }
        return d[n2];
    }
}
