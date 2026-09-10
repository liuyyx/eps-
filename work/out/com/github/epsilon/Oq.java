/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;

public final class Oq
extends Record {
    private final float BB;
    private final float be;
    private final float BZ;
    private final Color i6;
    private final float BW;
    private final float b_;
    private final float BT;
    private final float bz;
    private final float BK;
    private final float bl;
    private static final long[] a;
    private static final Integer[] b;

    public Color I6() {
        return hi.a("\u00e9", (Object)this, (long)1046810349013264035L);
    }

    public float Bz() {
        return (float)hi.a("\u00e9", (Object)this, (long)810286002838203878L);
    }

    public float B() {
        reference var1_1 = Oq.i("q61acvAItTY9bNRA", max(float float ), (float)hi.a("\u00e9", (Object)this, (long)1117631380671923299L), (float)hi.a("\u00e9", (Object)this, (long)963181291256850774L)) * 1.5f;
        reference var2_2 = hi.a("\u00e9", (Object)this, (long)974506225558427053L) * hi.a("\u00e9", (Object)this, (long)1319634142126304511L);
        return (float)(Oq.i("q61acvAItTY9bNRA", max(float float ), (float)hi.a("\u00e9", (Object)this, (long)530068468367930759L), (float)hi.a("G", (float)var1_1, (float)var2_2, (long)1021203527991582354L)) + 2.0f);
    }

    public float BT() {
        return (float)hi.a("\u00e9", (Object)this, (long)963181291256850774L);
    }

    public float Be() {
        return (float)hi.a("\u00e9", (Object)this, (long)1319634142126304511L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Oq.class, "b_;BT;BK;BB;bz;bl;be;BZ;i6;BW", "b_", "BT", "BK", "BB", "bz", "bl", "be", "BZ", "i6", "BW"}, this, object);
    }

    public float BB() {
        return (float)hi.a("\u00e9", (Object)this, (long)1291264487216308705L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static float Q(float var0, float var1_1, float var2_2) {
        block14: {
            var3_3 = Dl.S();
            var4_4 /* !! */  = Oq.a(3925, 7763072639060828388L) + Oq.a(25624, 2195838263649471405L) + Oq.a(4160, 1399711488439287791L) + Oq.a(17846, 7041207412642228737L);
            if (var3_3) ** GOTO lbl14
            block8: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = hi.a("G", (float)var0, (long)619542100356072855L);
                            if (!var3_3) break block15;
                            if (v0 != false) break block16;
                            v0 = hi.a("G", (int)((Oq.a(8603, 4877379875028880929L) ^ Oq.a(16281, 6437571820615290931L)) + Oq.a(12350, 3291149435781701525L)), (int)Oq.a(12482, 5956617715664510831L), (long)834203424483934088L) + Oq.a(31107, 4361839241067435554L);
                        }
                        var4_4 /* !! */  = (int)v0;
                        if (var3_3) break block17;
                    }
                    var4_4 /* !! */  = hi.a("G", (int)(Oq.a(18404, 5379170062973610061L) - Oq.a(10204, 4146043620387539044L) - Oq.a(21356, 3123920997772704991L)), (int)Oq.a(5948, 2326620390083688596L), (long)834203424483934088L) + Oq.a(7420, 2260954210540483404L) ^ Oq.a(17167, 303085370017393846L);
                }
                switch (var4_4 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case 430210072: {
                        v1 /* !! */  = (float)hi.a("G", (float)var0, (float)var1_1, (float)var2_2, (long)1122534555557953952L);
                        var4_4 /* !! */  = (int)(hi.a("G", (int)Oq.a(10323, 6306063941236639725L), (int)Oq.a(30732, 6792443523721271226L), (long)834203424483934088L) / Oq.a(28282, 7022617179798962650L) - Oq.a(10132, 4472266030100465722L) + Oq.a(25089, 6174151291082116525L) + Oq.a(4064, 4578147797855035474L));
                        if (!var3_3) {
                            break block8;
                        }
                        break block14;
                    }
                    case 430210073: {
                        v1 /* !! */  = var1_1;
                        if (var3_3) break block8;
                        return v1 /* !! */ ;
                    }
                    case 430210074: {
                        hi.a("G", (int)2, (int)Oq.a(31879, 3821820613413245754L), (int)1, (long)1066719768155535037L);
                        return 2.0f;
                    }
                }
                break;
            }
            var4_4 /* !! */  = (int)(hi.a("G", (int)Oq.a(3999, 6207706455347421220L), (int)Oq.a(25019, 8403542477591580164L), (long)834203424483934088L) / Oq.a(24199, 999317007543382331L) - Oq.a(22557, 1701516536181405631L) + Oq.a(30615, 325103517038155811L) + Oq.a(19970, 1311991452687737249L));
        }
        switch (var4_4 /* !! */ ) {
            case 1268003686: {
                hi.a("G", (long)804704677991023612L);
                hi.a("G", (double)-3.0, (long)1273198203909826830L);
                return v1 /* !! */ ;
            }
        }
        return v1 /* !! */ ;
    }

    public static /* bridge */ /* synthetic */ CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public Oq(float object, float object2, float object3, float object4, float object5, float object6, float object7, float object8, Color color, float object9) {
        object = hi.a("G", (float)object, (float)0.0f, (float)12.0f, (long)379491219271244103L);
        object2 = hi.a("G", (float)object2, (float)0.0f, (float)12.0f, (long)379491219271244103L);
        boolean bl = Dl.S();
        object3 = hi.a("G", (float)object3, (float)0.0f, (float)20.0f, (long)379491219271244103L);
        object4 = hi.a("G", (float)object4, (float)0.0f, (float)5.0f, (long)379491219271244103L);
        object5 = hi.a("G", (float)object5, (float)1.0f, (float)64.0f, (long)379491219271244103L);
        object6 = hi.a("G", (float)object6, (float)0.0f, (float)20.0f, (long)379491219271244103L);
        object7 = hi.a("G", (float)object7, (float)0.0f, (float)1.0f, (long)379491219271244103L);
        object8 = hi.a("G", (float)object8, (float)0.0f, (float)1.0f, (long)379491219271244103L);
        Object object10 = color;
        if (bl) {
            object10 = object10 == null ? hi.a("j", (long)839965449966007568L) : color;
        }
        color = object10;
        object9 = hi.a("G", (float)object9, (float)0.0f, (float)1.0f, (long)379491219271244103L);
        this.b_ = object;
        this.BT = object2;
        this.BK = object3;
        this.BB = object4;
        this.bz = object5;
        this.bl = object6;
        this.be = object7;
        this.BZ = object8;
        this.i6 = color;
        this.BW = object9;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Oq.class, "b_;BT;BK;BB;bz;bl;be;BZ;i6;BW", "b_", "BT", "BK", "BB", "bz", "bl", "be", "BZ", "i6", "BW"}, this);
    }

    public float B_() {
        return (float)hi.a("\u00e9", (Object)this, (long)1117631380671923299L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Oq.class, "b_;BT;BK;BB;bz;bl;be;BZ;i6;BW", "b_", "BT", "BK", "BB", "bz", "bl", "be", "BZ", "i6", "BW"}, this);
    }

    public float BK() {
        return (float)hi.a("\u00e9", (Object)this, (long)530068468367930759L);
    }

    public float BW() {
        return (float)hi.a("\u00e9", (Object)this, (long)718641657685690588L);
    }

    public float Bl() {
        return (float)hi.a("\u00e9", (Object)this, (long)974506225558427053L);
    }

    public float BZ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1129635824004617421L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5048646890599325526L;
                var6_1 = new long[28];
                var3_2 = 0;
                var4_3 = "\u00e6\u00e9\u008el\u00f1}\u00cb;\u0005\u00905\b\u00aa)\u0099=\u0081\u00c5\u0004\u00deL\u00af\u0094>\u00e0\u0012\n6\u008f\u0000#$(\u00c2\u0090\u00cc\n,\u00aej\u00efK\u00a3<\u00b8\u00b1s\u0097\u00f36s\u00abO\u00ae\u0084\u00ed\u0017\u001cL\u00d7B)@\u00189{l\u000f6\u00b7\u00fc\u00cb\u00c9\u00b2ZL\u00b5\u00cdq\u00ccG\u00f5\u00d7[o5|\u0016}x\u0081\u0006\u0013J\u00c7dd\u00c6\u00c5\u009cp\u00f2\u0011\u00a7oUFE\u00d99\u00eb\u00b7\u00b2Jh\u0087\u00d9\u00a6\u00d9\u00a6\u0086\u0099\u00d5\u0006\u009fG\u0089\u0005\u00cf<\u00fc\u00ac\u00d8d\u00a26\u0012\u0003\u0014w\u00bf\u001f\u0014G\u000b!*\u0087\u00ee\u0082_\u00fb2\u00ad\u0014\u0082\u00ea\u0089\u008a`z\u00a4n\u001dN\u00c0\u0004)P\u00e6\u00c8h<\u009b\u00a1`\u00bc\u00ef\u0099\u00e9z+l,\u00c8z\u00b6L\u00ffO\u00d1B\u00d96\u00ea/\u0005\u00f4\u009e\u008b\u00feO\u00e8-\u001b@\u00d2\u00eb";
                var5_4 = "\u00e6\u00e9\u008el\u00f1}\u00cb;\u0005\u00905\b\u00aa)\u0099=\u0081\u00c5\u0004\u00deL\u00af\u0094>\u00e0\u0012\n6\u008f\u0000#$(\u00c2\u0090\u00cc\n,\u00aej\u00efK\u00a3<\u00b8\u00b1s\u0097\u00f36s\u00abO\u00ae\u0084\u00ed\u0017\u001cL\u00d7B)@\u00189{l\u000f6\u00b7\u00fc\u00cb\u00c9\u00b2ZL\u00b5\u00cdq\u00ccG\u00f5\u00d7[o5|\u0016}x\u0081\u0006\u0013J\u00c7dd\u00c6\u00c5\u009cp\u00f2\u0011\u00a7oUFE\u00d99\u00eb\u00b7\u00b2Jh\u0087\u00d9\u00a6\u00d9\u00a6\u0086\u0099\u00d5\u0006\u009fG\u0089\u0005\u00cf<\u00fc\u00ac\u00d8d\u00a26\u0012\u0003\u0014w\u00bf\u001f\u0014G\u000b!*\u0087\u00ee\u0082_\u00fb2\u00ad\u0014\u0082\u00ea\u0089\u008a`z\u00a4n\u001dN\u00c0\u0004)P\u00e6\u00c8h<\u009b\u00a1`\u00bc\u00ef\u0099\u00e9z+l,\u00c8z\u00b6L\u00ffO\u00d1B\u00d96\u00ea/\u0005\u00f4\u009e\u008b\u00feO\u00e8-\u001b@\u00d2\u00eb".length();
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
                    var4_3 = "S\u007f\u0090\u00c1U\u008f\u0093\u00a9\u00d2\u00ec\u0095\u00d1\u008e\u009a\u00bd\u00e5";
                    var5_4 = "S\u007f\u0090\u00c1U\u008f\u0093\u00a9\u00d2\u00ec\u0095\u00d1\u008e\u009a\u00bd\u00e5".length();
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
        Oq.a = var6_1;
        Oq.b = new Integer[28];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6FB8;
        if (b[n2] == null) {
            Oq.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
