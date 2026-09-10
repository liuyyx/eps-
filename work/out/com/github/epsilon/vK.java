/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.components.events.GuiEventListener
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.events.GuiEventListener;

public class vK {
    public static float H;
    public static float U;
    private static int G;
    private static int[] W;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8052529174470309471L;
                var6_1 = new long[70];
                var3_2 = 0;
                var4_3 = "\u00a2\u00f9\u00cd\u0000\u00e1\u0092\u0087\u00ef.\u0096\u00d9\u00fc\u0086\u00b1q\u00cb*y*\f\u00e9\u00c7\u00ae\u0007\u00f7\u0093j\u00a2\u0091,V\u00f8\\\u00c5\u00d8\u0084\u00c9\u00c1\u00cc\u0005\u0088\u0007\u00bai\u00b9\u0018\u00a0\u00a4\u00aa\u009c\u0098\u0016\u00b2\u0092\u00f3\u00b8\u000e\u000e~\u00cf\u00f0\u00beQ\u00d4\u0080=k\u00dbQ\u00b7\u00ab\u00e0:\u0016\u00e4\u0094=R\u00078$\u0016a\u001e}\u0015`\u00d8\u00d6;\u00ef\u00c4V\t\u0098\u0092e\u00f5L\u001f\u00a0)\u001dL\u00e7\u00c7\u00fd\u00b9MT4q\u0094XS-\u0016d\u00ae\u009a\u00b9\u0088w\u00fe\u00e9\u008c\u00e2v\u008dsx\u00f6\u0091a\u0093\u00ac\u00ef4\u00eb\u00fa!I\u00a4\u00d1\u00b8Y2\u00ce\u00df\u009f\u0091:\t\u00c4Ear\u00dc\u00a9\u0015\u0010\u00ad\u00e5\u00f1^\u00f7\u00fb\u00a2nC\u00ee{a\u0086\u00e9\u00ea$\u00ff\u00cf\u00eb\u00aa\u0006\u0094\u008an\u00f4H\u00c1O\u00f5\u00b7{\u00e2r<q\u009a\u00de`v,\u0006\u00fa\u0018<\u0017\u0084\u00bc\u0015\u0095v\u00b8m\u00ef<\u001a\u000b\u007f\u0002(\u00fb\u00cb.\u00a341\u00e2\u0013\n\u00b0#\u00ca\u00f6\u00dbH!\u00a7\u00d2#\u008c\u00ca\u00f8V\u00ba\u00e2\u0016&\u00e9n9[\u009d#\u0093\u0013D\u001f\u009d\u000b\u00a3(CLC\u0011\u00a3\u0089\u00af\u0087\u00b7\u00b2*\u00a1)\u00d9\u00149}f\u008a\u008c#\u00bc\u00f8\u00f6\u0081\u00e4_\u007fc\u00f6|v\u00a2\u00eca1\u00bc`\u0098\u0015\\\u0005\u00bd\n\u00a6\u00c1\u008c\u00a7\u00d3\u0089\u0014\u00f1\u00a3,\u00f3\u001d\u000f\u00dd\u0096U\f\u0083#S\u00c0\u00df= \u00b5\u0085\u00ff\u00a4\u00c0\u00a2p@(\u00e4^\u00895G\u00cd\u00c5\u00b8\u0099\u0096\u00c2\u009b\u00b5\u00e4d\b\u009a\u00f5]\u00a2\u00be\u0082\u00b0\u008a\u00cb\u00f3\u00e6S\u00ecsR3JOb\u00e8\u008b\u0095\"\u00c28`\u00b9p\u00aa\t\u00c5\u00cc\u00d8\u00ad\u00984\u007f\u0016\u00bd:\u00b7\u00ba\u0007\u00dd\u00e3\u001f\u00a0}\u0089\u008dw\u00c1\u0018G\u00a3\u00c9g\u00e7\u000b\u0097,\u0011\u0083\u0080\u00ab\"W*\u009a`\u00d5\u00a4na\u008c\u0011U\u00f0\u0007o\u00c4\u00af/\u00ded\u008b\u000fQ\u00b6w~a\u00cb\u0094\u00ccL\u00fc\u00fa\u00bft\u0001v\u0083z\u009a\u00d1?\u00d8\u007f*\u0002b\u00daD\u00ab \u0002F\u008a\u001a\u00a3\u008a\u00af\u0080?\u00ed\u00e5\u00d0\u009e\u00b7[Y\u00f7\u0091Pg\u00efi+Q\u00c7E\u00ce\u00c32\u00f20f\u008fm\u00ffC\u001a\u00b2\u00bc4\u00908\u0082\u0088B\u0001\u00f84+\u00cf\u00c3\u008c+J\u0097\u0093\u0002N*\u00d5\u00b9\u0085\u0019\u0086\u00fa{\u001a\u00ca/,\u0005\u00b5\u0013\u00ad";
                var5_4 = "\u00a2\u00f9\u00cd\u0000\u00e1\u0092\u0087\u00ef.\u0096\u00d9\u00fc\u0086\u00b1q\u00cb*y*\f\u00e9\u00c7\u00ae\u0007\u00f7\u0093j\u00a2\u0091,V\u00f8\\\u00c5\u00d8\u0084\u00c9\u00c1\u00cc\u0005\u0088\u0007\u00bai\u00b9\u0018\u00a0\u00a4\u00aa\u009c\u0098\u0016\u00b2\u0092\u00f3\u00b8\u000e\u000e~\u00cf\u00f0\u00beQ\u00d4\u0080=k\u00dbQ\u00b7\u00ab\u00e0:\u0016\u00e4\u0094=R\u00078$\u0016a\u001e}\u0015`\u00d8\u00d6;\u00ef\u00c4V\t\u0098\u0092e\u00f5L\u001f\u00a0)\u001dL\u00e7\u00c7\u00fd\u00b9MT4q\u0094XS-\u0016d\u00ae\u009a\u00b9\u0088w\u00fe\u00e9\u008c\u00e2v\u008dsx\u00f6\u0091a\u0093\u00ac\u00ef4\u00eb\u00fa!I\u00a4\u00d1\u00b8Y2\u00ce\u00df\u009f\u0091:\t\u00c4Ear\u00dc\u00a9\u0015\u0010\u00ad\u00e5\u00f1^\u00f7\u00fb\u00a2nC\u00ee{a\u0086\u00e9\u00ea$\u00ff\u00cf\u00eb\u00aa\u0006\u0094\u008an\u00f4H\u00c1O\u00f5\u00b7{\u00e2r<q\u009a\u00de`v,\u0006\u00fa\u0018<\u0017\u0084\u00bc\u0015\u0095v\u00b8m\u00ef<\u001a\u000b\u007f\u0002(\u00fb\u00cb.\u00a341\u00e2\u0013\n\u00b0#\u00ca\u00f6\u00dbH!\u00a7\u00d2#\u008c\u00ca\u00f8V\u00ba\u00e2\u0016&\u00e9n9[\u009d#\u0093\u0013D\u001f\u009d\u000b\u00a3(CLC\u0011\u00a3\u0089\u00af\u0087\u00b7\u00b2*\u00a1)\u00d9\u00149}f\u008a\u008c#\u00bc\u00f8\u00f6\u0081\u00e4_\u007fc\u00f6|v\u00a2\u00eca1\u00bc`\u0098\u0015\\\u0005\u00bd\n\u00a6\u00c1\u008c\u00a7\u00d3\u0089\u0014\u00f1\u00a3,\u00f3\u001d\u000f\u00dd\u0096U\f\u0083#S\u00c0\u00df= \u00b5\u0085\u00ff\u00a4\u00c0\u00a2p@(\u00e4^\u00895G\u00cd\u00c5\u00b8\u0099\u0096\u00c2\u009b\u00b5\u00e4d\b\u009a\u00f5]\u00a2\u00be\u0082\u00b0\u008a\u00cb\u00f3\u00e6S\u00ecsR3JOb\u00e8\u008b\u0095\"\u00c28`\u00b9p\u00aa\t\u00c5\u00cc\u00d8\u00ad\u00984\u007f\u0016\u00bd:\u00b7\u00ba\u0007\u00dd\u00e3\u001f\u00a0}\u0089\u008dw\u00c1\u0018G\u00a3\u00c9g\u00e7\u000b\u0097,\u0011\u0083\u0080\u00ab\"W*\u009a`\u00d5\u00a4na\u008c\u0011U\u00f0\u0007o\u00c4\u00af/\u00ded\u008b\u000fQ\u00b6w~a\u00cb\u0094\u00ccL\u00fc\u00fa\u00bft\u0001v\u0083z\u009a\u00d1?\u00d8\u007f*\u0002b\u00daD\u00ab \u0002F\u008a\u001a\u00a3\u008a\u00af\u0080?\u00ed\u00e5\u00d0\u009e\u00b7[Y\u00f7\u0091Pg\u00efi+Q\u00c7E\u00ce\u00c32\u00f20f\u008fm\u00ffC\u001a\u00b2\u00bc4\u00908\u0082\u0088B\u0001\u00f84+\u00cf\u00c3\u008c+J\u0097\u0093\u0002N*\u00d5\u00b9\u0085\u0019\u0086\u00fa{\u001a\u00ca/,\u0005\u00b5\u0013\u00ad".length();
                var2_5 = 0;
                vK.i(new int[5]);
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00c8\u0086\u00e3\u00d9\u00efj\u0005\u00d4:\u00e0\u00f8\u00f5jKr\u00f3";
                    var5_4 = "\u00c8\u0086\u00e3\u00d9\u00efj\u0005\u00d4:\u00e0\u00f8\u00f5jKr\u00f3".length();
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
lbl28:
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
lbl39:
                // 1 sources

                ** continue;
            }
        }
        vK.a = var6_1;
        vK.b = new Integer[70];
        hi.a("\u00d2", (float)0.0f, (long)817515226557096230L);
        hi.a("\u00d2", (float)0.0f, (long)660311983048283728L);
        hi.a("\u00d2", (int)0, (long)399969089356873696L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void c() {
        var1 /* !! */  = (hi.a("G", (int)vK.a(24238, 3004696004004728770L), (int)vK.a(4557, 5967750884045783194L), (long)834203424483934088L) ^ vK.a(19347, 5721225037015800573L)) * vK.a(6401, 867542975560878148L) * vK.a(11043, 6987487323243002494L) ^ vK.a(4302, 2707491373033718180L);
        block8: while (true) {
            switch (var1 /* !! */ ) {
                default: {
                    hi.a("\u00d2", (int)(hi.a("j", (long)399969089356873696L) + true), (long)399969089356873696L);
                    if (hi.a("j", (long)399969089356873696L) == true) {
                        var1 /* !! */  = (int)(hi.a("G", (int)vK.a(16543, 9031303304187302345L), (int)vK.a(27524, 1732932493602978544L), (long)834203424483934088L) - vK.a(26884, 8866221260134447170L) + vK.a(23559, 4426456533424885083L));
                        continue block8;
                    }
                    ** GOTO lbl27
                }
                case 1445867742: {
                    var0_1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)907159218940561824L), (long)1017954173869996748L);
                    if (var0_1 != null) {
                        var1 /* !! */  = (vK.a(25677, 8746346124224951603L) + vK.a(28568, 4654298182025019128L)) * vK.a(18845, 2427588806441392368L) - vK.a(25268, 5231573775460725700L);
                        switch (var1 /* !! */ ) {
                            default: {
                                hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (Object)var0_1, (boolean)true, (long)1233524536946965653L);
                                var1 /* !! */  = vK.a(30592, 9043117498969810687L) ^ vK.a(28318, 1297026049681915895L) ^ vK.a(13925, 5272145266805647144L);
                                continue block8;
                            }
                            case 609190896: 
                        }
                        return;
                    }
                    ** GOTO lbl29
                }
                case 1445867743: {
                    hi.a("G", (long)1124891203117124897L);
                    return;
                }
lbl27:
                // 1 sources

                var1 /* !! */  = vK.a(29367, 1058950089504580499L) ^ vK.a(7429, 8157174839377300555L) ^ vK.a(25489, 4155678552050397897L);
                continue block8;
lbl29:
                // 1 sources

                var1 /* !! */  = vK.a(30592, 9043117498969810687L) ^ vK.a(28318, 1297026049681915895L) ^ vK.a(13925, 5272145266805647144L);
                continue block8;
                case 1445867741: 
            }
            break;
        }
    }

    private vK() {
    }

    public static /* bridge */ /* synthetic */ CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public static void E() {
        var1 /* !! */  = (vK.a(3366, 2695758038280674412L) + vK.a(31640, 6063591156411362003L) - vK.a(7594, 1528932598101740776L)) * vK.a(10884, 8529997408364477425L) - vK.a(25910, 7290905333110502518L);
        block8: while (true) {
            block11: {
                switch (var1 /* !! */ ) {
                    default: {
                        hi.a("\u00d2", (int)vK.g("kVrCVtnQQduqSjt0", max(int int ), (int)0, (int)(hi.a("j", (long)399969089356873696L) - true)), (long)399969089356873696L);
                        if (hi.a("j", (long)399969089356873696L) == false) {
                            var1 /* !! */  = (vK.a(20852, 802094948640833574L) - vK.a(32276, 837605998783950667L)) * vK.a(3425, 230772831321037830L) * vK.a(6256, 9138392387640559884L) - vK.a(10384, 5749539545762314744L);
                            continue block8;
                        }
                        ** GOTO lbl18
                    }
                    case -1464633038: {
                        var0_1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)907159218940561824L), (long)1017954173869996748L);
                        if (var0_1 == null) ** GOTO lbl20
                        var1 /* !! */  = (vK.a(1485, 6078902698213938308L) - vK.a(18320, 3041633637280732873L) + vK.a(23576, 3461992602065620301L) ^ vK.a(9300, 792511898533836032L)) * vK.a(8687, 3134334048855896201L) - vK.a(22233, 3410468066591393700L);
                        break block11;
                    }
                    case -1464633039: {
                        throw null;
                    }
lbl18:
                    // 1 sources

                    var1 /* !! */  = (int)(hi.a("G", (int)vK.a(11136, 8847052537348569851L), (int)vK.a(4187, 1814738378589995305L), (long)834203424483934088L) + vK.a(12823, 7599860646103819091L));
                    continue block8;
lbl20:
                    // 1 sources

                    var1 /* !! */  = (int)(hi.a("G", (int)vK.a(15683, 5882087984725896194L), (int)vK.a(21780, 1038153723284079735L), (long)834203424483934088L) + vK.a(13783, 7835960087194608772L));
                    continue block8;
                    case -1464633041: 
                }
                return;
            }
            while (true) {
                switch (var1 /* !! */ ) {
                    default: {
                        hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (Object)var0_1, (boolean)false, (long)1233524536946965653L);
                        var1 /* !! */  = (int)(hi.a("G", (int)vK.a(15683, 5882087984725896194L), (int)vK.a(21780, 1038153723284079735L), (long)834203424483934088L) + vK.a(13783, 7835960087194608772L));
                        continue block8;
                    }
                    case -1306546093: 
                }
                hi.a("G", (long)713677872092862225L);
                hi.a("G", (long)409074377258406884L);
                var1 /* !! */  = vK.a(3328, 620291084248357959L) - vK.a(383, 8131776761746985006L) - vK.a(7255, 7096088509051833631L) ^ vK.a(20158, 6453152243865214933L);
            }
            break;
        }
    }

    public static void x(float f, float f2) {
        hi.a("\u00d2", (float)f, (long)817515226557096230L);
        hi.a("\u00d2", (float)f2, (long)660311983048283728L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void m() {
        block13: {
            block14: {
                var0 = Dl.t();
                var2_1 /* !! */  = (vK.a(29351, 8651918354072200064L) - vK.a(7408, 1725447692899716512L)) * vK.a(24034, 8745398300498381972L) - vK.a(12656, 1245533177431924816L) - vK.a(3039, 1521204306632481454L);
                if (!var0) break block14;
lbl4:
                // 2 sources

                while (true) {
                    hi.a("\u00d2", (int)0, (long)399969089356873696L);
                    while (true) {
                        block16: {
                            block15: {
                                var1_2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)907159218940561824L), (long)1017954173869996748L);
                                if (var0) break block15;
                                if (var1_2 != null) break block16;
                                var2_1 /* !! */  = (vK.a(606, 57719124361581330L) / vK.a(4858, 159597902969045941L) + vK.a(8883, 5012329847541674898L) ^ vK.a(19724, 2426223674106797183L)) - vK.a(19704, 545071356640452006L);
                            }
                            if (!var0) break block13;
                        }
                        var2_1 /* !! */  = (int)(hi.a("G", (int)(vK.a(29600, 7535537571160580824L) / vK.a(22268, 183669600225118105L)), (int)vK.a(13874, 1157201354065717012L), (long)834203424483934088L) * vK.a(5003, 7644023562324902574L) - vK.a(6289, 4706037413544790517L));
                        if (!var0) break block13;
                        ** GOTO lbl38
                        break;
                    }
                    break;
                }
            }
            while (true) {
                switch (var2_1 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -879951186: 
                }
                vK.g("kVrCVtnQQduqSjt0", Y(float ), (float)100.0f);
                vK.g("kVrCVtnQQduqSjt0", P(float ), (float)13.0f);
                var2_1 /* !! */  = (int)(hi.a("G", (int)(vK.a(20935, 6391210311592296580L) * vK.a(20980, 6949155562516201603L)), (int)vK.a(15655, 2404233120826403912L), (long)834203424483934088L) + vK.a(867, 6758112469426868761L));
                if (var0) ** continue;
            }
        }
        block10: while (true) {
            switch (var2_1 /* !! */ ) {
                default: {
                    vK.g("kVrCVtnQQduqSjt0", onTextInputFocusChange(net.minecraft.client.gui.components.events.GuiEventListener boolean ), (Minecraft)hi.a("j", (long)1080602109828736465L), (GuiEventListener)var1_2, (boolean)false);
                    if (var0) {
                        return;
                    }
lbl38:
                    // 3 sources

                    var2_1 /* !! */  = (vK.a(19788, 2921220469038636055L) / vK.a(10342, 3103863525884508476L) + vK.a(29588, 3904221429240324845L) ^ vK.a(2526, 1445366456159049916L)) - vK.a(28197, 5390225067369299780L);
                    continue block10;
                }
                case 821962078: {
                    return;
                }
                case 821962076: 
            }
            break;
        }
    }

    public static void i(int[] nArray) {
        W = nArray;
    }

    public static int[] p() {
        return W;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1164;
        if (b[n2] == null) {
            vK.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
