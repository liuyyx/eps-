/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4fc
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.DynamicUniformStorage;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4fc;

final class ge
extends Record
implements DynamicUniformStorage.DynamicUniform {
    private final Vec3 xw;
    private final boolean bL;
    private final int fQ;
    private final int f3;
    private final boolean bA;
    private final float md;
    private final Matrix4fc t0;
    private final Matrix4fc tW;
    private final float m5;
    private final Matrix4fc tb;
    private final float mq;
    private final Matrix4fc t2;
    private static final long[] a;
    private static final Integer[] b;

    public Vec3 Xw() {
        return hi.a("\u00e9", (Object)this, (long)593465096789081891L);
    }

    public boolean bL() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)642116805256726248L);
    }

    public float Md() {
        return (float)hi.a("\u00e9", (Object)this, (long)1035566049089551218L);
    }

    public Matrix4fc t0() {
        return hi.a("\u00e9", (Object)this, (long)714786606037025425L);
    }

    public float M5() {
        return (float)hi.a("\u00e9", (Object)this, (long)1203457022611866860L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void write(ByteBuffer var1_1) {
        block34: {
            block42: {
                block41: {
                    block40: {
                        block39: {
                            block38: {
                                block37: {
                                    block36: {
                                        block35: {
                                            var2_2 = Dl.t();
                                            var3_3 /* !! */  = (ge.a(475, 6615086795375342957L) ^ ge.a(16998, 1077907997583259368L)) - ge.a(12575, 1244131170797241750L) + ge.a(20788, 3451132956609127824L);
                                            if (var2_2) ** GOTO lbl-1000
                                            switch (var3_3 /* !! */ ) {
                                                default: lbl-1000:
                                                // 2 sources

                                                {
                                                    v0 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)var1_1, (long)1267780619223285422L), (Object)hi.a("\u00e9", (Object)this, (long)368886517349394997L), (long)1253663530483718608L), (Object)hi.a("\u00e9", (Object)this, (long)1176925279784918336L), (long)1253663530483718608L), (Object)hi.a("\u00e9", (Object)this, (long)714786606037025425L), (long)1253663530483718608L), (Object)hi.a("\u00e9", (Object)this, (long)1305627067906018828L), (long)1253663530483718608L), (float)((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)593465096789081891L), (long)1300412705618690751L)), (float)((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)593465096789081891L), (long)1294071886475894755L)), (float)((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)593465096789081891L), (long)1282612456329596420L)), (float)0.0f, (long)651805384725515153L);
                                                    v1 = hi.a("\u00e9", (Object)this, (long)1203457022611866860L);
                                                    v2 = hi.a("\u00e9", (Object)this, (long)1035566049089551218L);
                                                    v3 = hi.a("\u00e9", (Object)this, (long)1327572198329106659L);
                                                    v4 /* !! */  = hi.a("\u00e9", (Object)this, (long)558338482788538727L);
                                                    if (var2_2) break block35;
                                                    if (v4 /* !! */  == false) break;
                                                    break block36;
                                                }
                                                case 1482790476: {
                                                    throw null;
                                                }
                                            }
                                            v4 /* !! */  = (CallSite)((ge.a(16637, 7331101592965133434L) ^ ge.a(1335, 553776721508462999L)) + ge.a(14546, 7168627135369661555L) - ge.a(13998, 870472673146585638L));
                                        }
                                        var3_3 /* !! */  = (int)v4 /* !! */ ;
                                        if (!var2_2) break block37;
                                    }
                                    var3_3 /* !! */  = (int)(hi.a("G", (int)((ge.a(32759, 6776167796964723538L) * ge.a(31490, 3313143485966913429L) ^ ge.a(2756, 2928020553254403655L)) / ge.a(22767, 7383522875136453699L)), (int)ge.a(14914, 4801862673273147100L), (long)834203424483934088L) - ge.a(2606, 7781141318045138611L));
                                }
                                switch (var3_3 /* !! */ ) {
                                    default: {
                                        v5 = 1.0f;
                                        var3_3 /* !! */  = (int)(hi.a("G", (int)((ge.a(15975, 1446875432729004775L) - ge.a(26723, 7261900126201519305L)) / ge.a(24204, 8528012524993096198L)), (int)ge.a(20148, 4447617870904703511L), (long)834203424483934088L) + ge.a(12931, 3369310392845223425L) + ge.a(23581, 8416578146564188299L));
                                        if (var2_2) {
                                            break;
                                        }
                                        break block38;
                                    }
                                    case -94347281: {
                                        v5 = 0.0f;
                                        if (!var2_2) break;
                                        ** GOTO lbl-1000
                                    }
                                    case -94347283: {
                                        return;
                                    }
                                }
                                var3_3 /* !! */  = (int)(hi.a("G", (int)((ge.a(10329, 9080289197923261642L) - ge.a(16492, 7878412459329303789L)) / ge.a(31531, 1795912089827184515L)), (int)ge.a(11353, 255977104016726229L), (long)834203424483934088L) + ge.a(7518, 2273243413391043059L) + ge.a(12612, 4562213767709935082L));
                            }
                            v6 /* !! */  = (CallSite)var3_3 /* !! */ ;
                            if (var2_2) break block39;
                            switch (v6 /* !! */ ) {
                                case 1761182212: lbl-1000:
                                // 2 sources

                                {
                                    hi.a("G", (long)1147339583020672972L);
                                    v6 /* !! */  = hi.a("G", (int)2, (int)ge.a(31187, 174695380255739230L), (long)589346929323904906L);
                                    break;
                                }
                            }
                        }
                        v7 = hi.a("\u00a5", (Object)v0, (float)v1, (float)v2, (float)v3, (float)v5, (long)651805384725515153L);
                        v8 = hi.a("\u00e9", (Object)this, (long)733225988819601136L);
                        v9 = hi.a("\u00e9", (Object)this, (long)1264090555298379583L);
                        v10 = hi.a("\u00e9", (Object)this, (long)642116805256726248L);
                        if (var2_2) break block40;
                        if (v10 != false) break block41;
                        v10 = ge.G("o1TmTrjh2annq4fN", max(int int ), (int)ge.a(23319, 6168002325861412785L), (int)ge.a(30242, 5367418564021158576L)) + ge.a(22722, 8713938019151883369L);
                    }
                    var3_3 /* !! */  = (int)v10;
                    if (!var2_2) break block42;
                }
                var3_3 /* !! */  = (int)(hi.a("G", (int)(ge.a(16047, 5688914588109687339L) - ge.a(12465, 5147988424418706478L) ^ ge.a(18261, 3933672082904232922L)), (int)ge.a(10356, 6798183513476226277L), (long)834203424483934088L) + ge.a(4652, 5576384509892093607L));
                break block42;
lbl62:
                // 2 sources

                while (true) {
                    v11 = 0;
lbl64:
                    // 2 sources

                    while (true) {
                        ge.G("o1TmTrjh2annq4fN", putIVec4(int int int int ), (Std140Builder)v7, (int)v8, (int)v9, (int)v12, (int)v11);
                        return;
                    }
                    break;
                }
            }
            block19: while (true) {
                switch (var3_3 /* !! */ ) {
                    default: {
                        v12 = 1;
                        var3_3 /* !! */  = (ge.a(27843, 5926464067329726559L) * ge.a(14010, 1438245726674960930L) + ge.a(24505, 7165412357953432347L)) / ge.a(22264, 5278243711994634877L) ^ ge.a(27107, 1402071316135943542L);
                        if (var2_2) {
                            break block19;
                        }
                        break block34;
                    }
                    case -285385660: {
                        v12 = 0;
                        if (!var2_2) break block19;
                        ** GOTO lbl62
                    }
                    case -285385659: {
                        hi.a("G", (int)ge.a(32316, 4132999711930387110L), (long)801972633595358600L);
                        ge.G("o1TmTrjh2annq4fN", values());
                        var3_3 /* !! */  = (ge.a(27988, 2212970924118022627L) + ge.a(4388, 6813579430622160317L)) * ge.a(31924, 1149104165693327410L) - ge.a(1111, 3692780973316174064L);
                        continue block19;
                    }
                }
                break;
            }
            var3_3 /* !! */  = (ge.a(18184, 3109536568930022291L) * ge.a(28974, 4475140849923753351L) + ge.a(343, 6200128546233349571L)) / ge.a(2043, 1470064147055407956L) ^ ge.a(7875, 2799140328756308563L);
        }
        v11 = var3_3 /* !! */ ;
        ** while (var2_2)
lbl93:
        // 1 sources

        switch (v11) {
            default: {
                ** continue;
            }
            case -80715018: 
        }
    }

    public Matrix4fc tb() {
        return hi.a("\u00e9", (Object)this, (long)1305627067906018828L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ge.class, "tW;t2;t0;tb;xw;m5;md;mq;bA;f3;fQ;bL", "tW", "t2", "t0", "tb", "xw", "m5", "md", "mq", "bA", "f3", "fQ", "bL"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ge.class, "tW;t2;t0;tb;xw;m5;md;mq;bA;f3;fQ;bL", "tW", "t2", "t0", "tb", "xw", "m5", "md", "mq", "bA", "f3", "fQ", "bL"}, this);
    }

    public boolean bA() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)558338482788538727L);
    }

    public Matrix4fc t2() {
        return hi.a("\u00e9", (Object)this, (long)1176925279784918336L);
    }

    public int fQ() {
        return (int)hi.a("\u00e9", (Object)this, (long)1264090555298379583L);
    }

    public int f3() {
        return (int)hi.a("\u00e9", (Object)this, (long)733225988819601136L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ge.class, "tW;t2;t0;tb;xw;m5;md;mq;bA;f3;fQ;bL", "tW", "t2", "t0", "tb", "xw", "m5", "md", "mq", "bA", "f3", "fQ", "bL"}, this, object);
    }

    public static /* bridge */ /* synthetic */ CallSite G(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public float Mq() {
        return (float)hi.a("\u00e9", (Object)this, (long)1327572198329106659L);
    }

    private ge(Matrix4fc matrix4fc, Matrix4fc matrix4fc2, Matrix4fc matrix4fc3, Matrix4fc matrix4fc4, Vec3 vec3, float f, float f2, float f3, boolean bl, int n, int n2, boolean bl2) {
        this.tW = matrix4fc;
        this.t2 = matrix4fc2;
        this.t0 = matrix4fc3;
        this.tb = matrix4fc4;
        this.xw = vec3;
        this.m5 = f;
        this.md = f2;
        this.mq = f3;
        this.bA = bl;
        this.f3 = n;
        this.fQ = n2;
        this.bL = bl2;
    }

    public Matrix4fc tW() {
        return hi.a("\u00e9", (Object)this, (long)368886517349394997L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3152438484384679977L;
                var6_1 = new long[50];
                var3_2 = 0;
                var4_3 = "\u00e6\u00d8f\u0099\u0019;^\u00b4f\u0013\u00ef{\u0086\u00c9T\\\u00d3\u00ec\u00b8\u008a\u00b5d*Y\u00bf\u00f9\u00af\u00cf\u00a3Lj\u000e\u00ce\u007f/\u0090\u00d5C\u0085\u00e8\u00ca\u00ac\f\u00ca\u00fb\u000b\u00daP\u0081\u00e9\u0091\u0015\u00e3\u000e\u0083Vh\u00e9\u00b4\u00fc\u00cbq\u00f3!\u0003\u00fb\u009d\u008a1?\u00d7\u00f6E\u00ae(\u0084\u0083\u00ffx'\u0091\r\u0018*\u00b2\u000e\u0085gH\u0081\u00a2\u009d\u008e(\u00de(\u00af_\u00f4\u00dd\u0018V\u001d\u0081#\u00ecd6.N\u00a2#\u00f6f\u0005d4\u00c1^\u0096\u00ac\u0096\u00b0\u0083f\u00e5\u0013BA3Z\u0084\u00d5TZ\u0097\u00fdQ\u00f2\u008a6\u00f8\u00fe\u001b\u00feN\u00a6\u0014\u009du\u0093Aeu\u0016\u00bduz\u0013LN\u00e1\u00f0|\u0005t\u00e5\f?U\u00bb3\u00ed\u00dbX\u009e\u0098\u00a7\u009bfY\u001b\u00bd\u00f8j\u0084\u0095W\n\u0084\u00e4d\u009b\u00f4\u00ed@\u00e2\u0099\u00c2^\u0082\u0086\u00e4\u009a\u00b1\u00c2\u0017\u0010\rK\u00ef%?\u00cb\u0007m\u0095\b\u0018\u0093\u00c4\u00e4<\u00c4\u00e2\u00e5\u00c6{h\u0083\u0017\bR\u0012\u00c7\u00a5@b\u0002\u009f\u000e\u00a6\u0017\u00a1H\u00e4z8\u00e3H\u00a2*\u0095\u00f1N\u0096\u00f3|'\u00e2\u0000\u00aa\u0087\u009cM\u00ad\u00b7\u00df\u00da3\u00fa{\u00d8\u00e5Y\u00ce\u00c8\u0018'\u00c5\u0098\u00ec\u00d2\u00d8\u00c4L\u0003\u00eau\u00fa\u0096)\u00f6P<\u00ea\u008a\u00b4\u00ab\u0080\u000b\u0087M\u0094\u00c8\u00b8E\u00b61Y \u00b2-\u00ba\u0086tm\u0080\u00cf\r\u00810\u001d7\u00f4C{p\u00ba\u00db\u00b8\u00bb\t\u0001\u0093z\u00c9\u00d5\u00baV\u008b\u00b2\u00f5\u00a2B_\u00e5\u0001\u0015\u007f\u00a4a=\u0099\u007f\u00c9`RZ!\u001c\u00c7pj\u008b\u00c0+r\u00c6\u0014\u0085RTU\u00893\u00dbH\u00e3<\u00b7\u00ff\u0087\u00a6";
                var5_4 = "\u00e6\u00d8f\u0099\u0019;^\u00b4f\u0013\u00ef{\u0086\u00c9T\\\u00d3\u00ec\u00b8\u008a\u00b5d*Y\u00bf\u00f9\u00af\u00cf\u00a3Lj\u000e\u00ce\u007f/\u0090\u00d5C\u0085\u00e8\u00ca\u00ac\f\u00ca\u00fb\u000b\u00daP\u0081\u00e9\u0091\u0015\u00e3\u000e\u0083Vh\u00e9\u00b4\u00fc\u00cbq\u00f3!\u0003\u00fb\u009d\u008a1?\u00d7\u00f6E\u00ae(\u0084\u0083\u00ffx'\u0091\r\u0018*\u00b2\u000e\u0085gH\u0081\u00a2\u009d\u008e(\u00de(\u00af_\u00f4\u00dd\u0018V\u001d\u0081#\u00ecd6.N\u00a2#\u00f6f\u0005d4\u00c1^\u0096\u00ac\u0096\u00b0\u0083f\u00e5\u0013BA3Z\u0084\u00d5TZ\u0097\u00fdQ\u00f2\u008a6\u00f8\u00fe\u001b\u00feN\u00a6\u0014\u009du\u0093Aeu\u0016\u00bduz\u0013LN\u00e1\u00f0|\u0005t\u00e5\f?U\u00bb3\u00ed\u00dbX\u009e\u0098\u00a7\u009bfY\u001b\u00bd\u00f8j\u0084\u0095W\n\u0084\u00e4d\u009b\u00f4\u00ed@\u00e2\u0099\u00c2^\u0082\u0086\u00e4\u009a\u00b1\u00c2\u0017\u0010\rK\u00ef%?\u00cb\u0007m\u0095\b\u0018\u0093\u00c4\u00e4<\u00c4\u00e2\u00e5\u00c6{h\u0083\u0017\bR\u0012\u00c7\u00a5@b\u0002\u009f\u000e\u00a6\u0017\u00a1H\u00e4z8\u00e3H\u00a2*\u0095\u00f1N\u0096\u00f3|'\u00e2\u0000\u00aa\u0087\u009cM\u00ad\u00b7\u00df\u00da3\u00fa{\u00d8\u00e5Y\u00ce\u00c8\u0018'\u00c5\u0098\u00ec\u00d2\u00d8\u00c4L\u0003\u00eau\u00fa\u0096)\u00f6P<\u00ea\u008a\u00b4\u00ab\u0080\u000b\u0087M\u0094\u00c8\u00b8E\u00b61Y \u00b2-\u00ba\u0086tm\u0080\u00cf\r\u00810\u001d7\u00f4C{p\u00ba\u00db\u00b8\u00bb\t\u0001\u0093z\u00c9\u00d5\u00baV\u008b\u00b2\u00f5\u00a2B_\u00e5\u0001\u0015\u007f\u00a4a=\u0099\u007f\u00c9`RZ!\u001c\u00c7pj\u008b\u00c0+r\u00c6\u0014\u0085RTU\u00893\u00dbH\u00e3<\u00b7\u00ff\u0087\u00a6".length();
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
                    var4_3 = "L\u00b3z\u00caF\u0095G3\u0003\u0011(r1\u001d@\u0081";
                    var5_4 = "L\u00b3z\u00caF\u0095G3\u0003\u0011(r1\u001d@\u0081".length();
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
        ge.a = var6_1;
        ge.b = new Integer[50];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7487;
        if (b[n2] == null) {
            ge.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
