/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.KeyMapping
 *  net.minecraft.client.gui.screens.ChatScreen
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xn;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.yi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.screens.ChatScreen;

public class E
extends e {
    public static final E H;
    private final Xn L = E.T("5XURX4VoCteQBuqU", U(java.lang.String boolean ), (E)this, (String)E.b(9833, 4360), (boolean)false);
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00e1\u00f1!H\u0012\b\u00ac12M\u00ff\u00f9\u00cc\\";
                    var12_3 = "\u00e1\u00f1!H\u0012\b\u00ac12M\u00ff\u00f9\u00cc\\".length();
                    var9_4 = 5;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 112;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 90;
                                    break;
                                }
                                case 1: {
                                    v11 = 78;
                                    break;
                                }
                                case 2: {
                                    v11 = 116;
                                    break;
                                }
                                case 3: {
                                    v11 = 3;
                                    break;
                                }
                                case 4: {
                                    v11 = 100;
                                    break;
                                }
                                case 5: {
                                    v11 = 5;
                                    break;
                                }
                                default: {
                                    v11 = 83;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                E.a = var13;
                E.b = new String[2];
                var0_7 = 5322396036552520145L;
                var6_8 = new long[91];
                var3_9 = 0;
                var4_10 = "\u0099$\u00e6=\u00d7\u00d2R\u00cfn\u008e\u00d9\u00b6\u00ed^\u00105\u0099\u00c1l\u00da\u009e1w\u00b5ay\u0098\u00f9fT\u00d0\u0014\u0012\u00a0\"\u0089\u009e\u00b7\u0016ZK\u00afQ\u0004.\u00cf\u00d7\u00e6%M\u00c0\u00947zb\u00ed\fJ&\u00b5\u0088a\u00d3f\u001c\u001e\u001c\u0006\u00d2{L\u0096sn\f*\u0086L\u0019[\u00ffe\u00d2M_\"\u00f58\u0086\u00f2}\u00f9\u00f9\u0092\u008d\u00ea\u001c+K\u008a\u00dd\b\u00b2\u00e5\u00dcNL\u00b8Kf\u0012\u0083\u00ec\u00d7\u00e3\u00ed\u00b1\u00d8\u00fd\u00be\u0002\u00bf-\u0080o\u0015\u00da\u00a1\u00f2/\u00f6$\u001dmNjD'\u00c7\u00db\u000b\u0087\u00fa\u00f3\u00b2\u00d0~\u00bf\u00a8\u00b4!u\u0094\u0010\u00b4\u00c4\u0083\u00f9\u00a6\u00a0\u00dbY\u00bc\u0097\u00c8\u009c\u00bdP\u00f1\u00e8\u001aP\u00a8\u00db4\u00c0\u00b7\u0093(\u00eed\u0087DY\u001d\u00e5\u0095F\u00abL\u0019\u00f1N\u0019\u00dc\u00fcZ\r\u00e1\u00ff~\u00bem\u00f6\u00aa\u00a2ze\u00d7%@\u00b8\u00d2Fc\u0088\u0005\u00b4\u00a0o\u00b25\u0095\u00ca\u00bc_\u0089\u001e\u009a.\u00ac5\u0082\u00fc\u00d3\u001d\u001eh\u00a3\u00c9^Ok\u0097\u00ce}\u001c\u0011}\u00b7\u009c\u00b0\u00fd\u001fj\u00e8\u00c9\u00de\u00cf}@\u00e5b\u000e\u0089f\u00e1\u00b7\u00e4\u0089'\u00aa\u0083iL\u00bdQ,\u0097\u00b1\u00dd\u00a3\u00c9\u00df~uHaI\u00c7!q\r\u00e2M\u00dd\u00c0\u0082\u00e7\u008f\u007faq\u00b6+:J\u00fb:9\u000fu\u001f\u00b1G\u00b2\u00ff\u00e6\u00cct\u0099\u0086=\u0095\n\u0088\u00ca\u00bfk\u00b3\u00ad\u0002\u00c4\u00a1\u00be\u00dch5\u00ab\u00e4\u00ed\u00eaDPK\u0096\u0007\u0007*#\u00b6\u00d8k\u00bay\u0005\u008e\u00ad\u00b7\u00c4\f\\\u0014\u00db\u00f3\u0096\u0099*\u008f\u00db8u2\u00c4\u00d1\u0014\u0013\u0007\u00e1\u00e9\u00a8\u00a6\u00e5w`)\u00ab\u009dh\u00b1\u00ee\u0006\u0099\u00d3\u0000\u00f2\u00e5\u0082\u0003)\u0098\u00dc\u00f8\u00ef\u001d\u00b5\u00acU.\u00e5s\u00a1[(J\u009f6)\n\u00cbhBV\u009bv\u008c\u00b6\u00c7\u0092W\u00b3`\u00a5\u00acf\u00d0T\u00c4%\u009a\u00dc\u0092\u00b9\u00b8\u00b7\u0097\u00a5\u001d\u00894\u001d`\u0082\"\u0081H^(Q\u00d8l\u009bG\u0084\u001b\u0014\u00eb\u009b\u00ab\u00d8|\u008b\u0001$\u00ea\u0016\u00e9\u0082\u00ae\u0010.].i\u00f34Zq<\u0007=\u0016\u00fbe\u001d\u00bf\u009a\u00b2\u00f8\u0091#\u00b8\u009e\u0090n9\u00e7j\u00f4\u00f0\u00fc\u001c\u00a4a\u008b\u0014\u00c6_\u0014\u00c1~s\u00d3\u00b5!\u00d3&\u00dc\u00a3 \r\u009f\u0091\u00aa]d\u00e2\u0091Q`|\u00f3\u00c6\u0000u\u00d3g\u0097l\u00e9\u00ce\u00f1X\u0084R\u00c6Q\u00e2YXc\u00a3\u001e\u00e0&3X?\u00e3\u0016\u00abEN\bnZ\u0095n\u00e6\u00b3Ow\u00d9>\u0002\u00a6!\u00dfhcv}\u000b3\u0004\u00a1\u0018\u00b7m_p4\u00bd\u00e8\u00ad\u00c9\u00d3\u001f\u00fe\u00cbA\u00c3\u0089\u001fTL\u00a8j\\\u00c8\u009c\u0014o\u00b3\u00b4\u0014\u00b3\u00cao-E\u00f4\u00e2s\u00e4m-\u00bdMp\u00a13gr\u001f#>\u00b6\u00fcT\u0089\u00ac\u0011\u00a4r.\u0013\u00df\u00a9v\u0018\u0080\u008c\u00e9\u00a8\u0006k\u00aa\u0095\u00f8k\u00e0({e\u001a6&\u0017\u00f7\u00ef\u00b3\u00e3\u00ef\u0085\u00abP\u00b7bR\u00d0C.\u00b4S\u00f99\u00e5\u00c2\u008e\u00bb\u0012\u00c9\u0091\u00a8\u00be'qf6\u0082)";
                var5_11 = "\u0099$\u00e6=\u00d7\u00d2R\u00cfn\u008e\u00d9\u00b6\u00ed^\u00105\u0099\u00c1l\u00da\u009e1w\u00b5ay\u0098\u00f9fT\u00d0\u0014\u0012\u00a0\"\u0089\u009e\u00b7\u0016ZK\u00afQ\u0004.\u00cf\u00d7\u00e6%M\u00c0\u00947zb\u00ed\fJ&\u00b5\u0088a\u00d3f\u001c\u001e\u001c\u0006\u00d2{L\u0096sn\f*\u0086L\u0019[\u00ffe\u00d2M_\"\u00f58\u0086\u00f2}\u00f9\u00f9\u0092\u008d\u00ea\u001c+K\u008a\u00dd\b\u00b2\u00e5\u00dcNL\u00b8Kf\u0012\u0083\u00ec\u00d7\u00e3\u00ed\u00b1\u00d8\u00fd\u00be\u0002\u00bf-\u0080o\u0015\u00da\u00a1\u00f2/\u00f6$\u001dmNjD'\u00c7\u00db\u000b\u0087\u00fa\u00f3\u00b2\u00d0~\u00bf\u00a8\u00b4!u\u0094\u0010\u00b4\u00c4\u0083\u00f9\u00a6\u00a0\u00dbY\u00bc\u0097\u00c8\u009c\u00bdP\u00f1\u00e8\u001aP\u00a8\u00db4\u00c0\u00b7\u0093(\u00eed\u0087DY\u001d\u00e5\u0095F\u00abL\u0019\u00f1N\u0019\u00dc\u00fcZ\r\u00e1\u00ff~\u00bem\u00f6\u00aa\u00a2ze\u00d7%@\u00b8\u00d2Fc\u0088\u0005\u00b4\u00a0o\u00b25\u0095\u00ca\u00bc_\u0089\u001e\u009a.\u00ac5\u0082\u00fc\u00d3\u001d\u001eh\u00a3\u00c9^Ok\u0097\u00ce}\u001c\u0011}\u00b7\u009c\u00b0\u00fd\u001fj\u00e8\u00c9\u00de\u00cf}@\u00e5b\u000e\u0089f\u00e1\u00b7\u00e4\u0089'\u00aa\u0083iL\u00bdQ,\u0097\u00b1\u00dd\u00a3\u00c9\u00df~uHaI\u00c7!q\r\u00e2M\u00dd\u00c0\u0082\u00e7\u008f\u007faq\u00b6+:J\u00fb:9\u000fu\u001f\u00b1G\u00b2\u00ff\u00e6\u00cct\u0099\u0086=\u0095\n\u0088\u00ca\u00bfk\u00b3\u00ad\u0002\u00c4\u00a1\u00be\u00dch5\u00ab\u00e4\u00ed\u00eaDPK\u0096\u0007\u0007*#\u00b6\u00d8k\u00bay\u0005\u008e\u00ad\u00b7\u00c4\f\\\u0014\u00db\u00f3\u0096\u0099*\u008f\u00db8u2\u00c4\u00d1\u0014\u0013\u0007\u00e1\u00e9\u00a8\u00a6\u00e5w`)\u00ab\u009dh\u00b1\u00ee\u0006\u0099\u00d3\u0000\u00f2\u00e5\u0082\u0003)\u0098\u00dc\u00f8\u00ef\u001d\u00b5\u00acU.\u00e5s\u00a1[(J\u009f6)\n\u00cbhBV\u009bv\u008c\u00b6\u00c7\u0092W\u00b3`\u00a5\u00acf\u00d0T\u00c4%\u009a\u00dc\u0092\u00b9\u00b8\u00b7\u0097\u00a5\u001d\u00894\u001d`\u0082\"\u0081H^(Q\u00d8l\u009bG\u0084\u001b\u0014\u00eb\u009b\u00ab\u00d8|\u008b\u0001$\u00ea\u0016\u00e9\u0082\u00ae\u0010.].i\u00f34Zq<\u0007=\u0016\u00fbe\u001d\u00bf\u009a\u00b2\u00f8\u0091#\u00b8\u009e\u0090n9\u00e7j\u00f4\u00f0\u00fc\u001c\u00a4a\u008b\u0014\u00c6_\u0014\u00c1~s\u00d3\u00b5!\u00d3&\u00dc\u00a3 \r\u009f\u0091\u00aa]d\u00e2\u0091Q`|\u00f3\u00c6\u0000u\u00d3g\u0097l\u00e9\u00ce\u00f1X\u0084R\u00c6Q\u00e2YXc\u00a3\u001e\u00e0&3X?\u00e3\u0016\u00abEN\bnZ\u0095n\u00e6\u00b3Ow\u00d9>\u0002\u00a6!\u00dfhcv}\u000b3\u0004\u00a1\u0018\u00b7m_p4\u00bd\u00e8\u00ad\u00c9\u00d3\u001f\u00fe\u00cbA\u00c3\u0089\u001fTL\u00a8j\\\u00c8\u009c\u0014o\u00b3\u00b4\u0014\u00b3\u00cao-E\u00f4\u00e2s\u00e4m-\u00bdMp\u00a13gr\u001f#>\u00b6\u00fcT\u0089\u00ac\u0011\u00a4r.\u0013\u00df\u00a9v\u0018\u0080\u008c\u00e9\u00a8\u0006k\u00aa\u0095\u00f8k\u00e0({e\u001a6&\u0017\u00f7\u00ef\u00b3\u00e3\u00ef\u0085\u00abP\u00b7bR\u00d0C.\u00b4S\u00f99\u00e5\u00c2\u008e\u00bb\u0012\u00c9\u0091\u00a8\u00be'qf6\u0082)".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0087\u0088\u00be\t\u00d80y\u00f8\u007f'\u009a\u00bdh\u00f1\u00f1Y";
                    var5_11 = "\u0087\u0088\u00be\t\u00d80y\u00f8\u007f'\u009a\u00bdh\u00f1\u00f1Y".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        E.c = var6_8;
        E.d = new Integer[91];
        E.H = new E();
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

    private E() {
        super(E.b(9832, -16088), (vY)((Object)hi.a("j", (long)456237291118568391L)));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE(P=200)
    private void t(yi var1_1) {
        block46: {
            block43: {
                block45: {
                    block44: {
                        block42: {
                            var2_2 = Dl.S();
                            var12_3 /* !! */  = (E.c(28001, 2319936784814586516L) ^ E.c(30685, 5812498495818014750L)) * E.c(2102, 3883952538928144379L) ^ E.c(2119, 3314587201790861186L);
                            if (var2_2) break block42;
lbl4:
                            // 2 sources

                            while (true) {
                                if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)907159218940561824L), (long)1017954173869996748L) == null) {
                                    var12_3 /* !! */  = (E.c(23334, 4534024520205667558L) + E.c(25751, 5629483663662658372L) - E.c(8971, 5797385891336811706L)) / 2 + E.c(4242, 3985040936559200104L);
                                    if (var2_2) break block42;
                                }
                                var12_3 /* !! */  = E.c(16176, 6545037706530384083L) * E.c(17142, 4548420311834891578L) + E.c(27665, 1579803147213847511L);
                                if (var2_2) break block42;
                                ** GOTO lbl82
                                break;
                            }
lbl11:
                            // 2 sources

                            while (true) {
                                block48: {
                                    block47: {
                                        var10_11 = v0;
                                        v1 = var5_6;
                                        v2 /* !! */  = var6_7;
                                        if (!var2_2) break block47;
                                        if (v1 == v2 /* !! */ ) break block48;
                                        v1 = hi.a("G", (int)(E.c(13510, 6816820881998570298L) + E.c(13412, 6472249394553938831L)), (int)E.c(1047, 2925503104338252725L), (long)834203424483934088L);
                                        v2 /* !! */  = (CallSite)E.c(17956, 3187727710330753522L);
                                    }
                                    var12_3 /* !! */  = (int)(v1 + v2 /* !! */ );
                                    if (var2_2) break block43;
                                }
                                var12_3 /* !! */  = E.c(27780, 3534194553373768509L) - E.c(15091, 1462965819628842268L) - E.c(5423, 5052288927256855243L);
                                break block43;
                                break;
                            }
lbl25:
                            // 2 sources

                            while (true) {
                                block50: {
                                    block49: {
                                        var11_12 = v3;
                                        E.T("5XURX4VoCteQBuqU", C(float ), (yi)var1_1, (float)var10_11);
                                        hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{Float.valueOf(var11_12)}, (long)382049764311173290L);
                                        hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{(boolean)var7_8}, (long)795320219994177176L);
                                        v4 /* !! */  = E.T("5XURX4VoCteQBuqU", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1074609915188898704L), (long)789438897355831922L)));
                                        if (!var2_2) break block49;
                                        if (v4 /* !! */  != false) break block50;
                                        v4 /* !! */  = (CallSite)(E.c(11710, 6376891516544154222L) + E.c(14677, 7280811047440412322L) - E.c(23908, 3123706299999881948L));
                                    }
                                    var12_3 /* !! */  = (int)v4 /* !! */ ;
                                    if (var2_2) ** GOTO lbl45
                                }
                                var12_3 /* !! */  = (E.c(21533, 7692240169207432121L) * E.c(25452, 557769172869985454L) + E.c(3292, 7895633774360550146L) + E.c(14296, 5882897235022209047L) ^ E.c(21934, 2267054755261317651L)) - E.c(13566, 1861714709683856192L);
                                if (var2_2) ** GOTO lbl45
                                if (true) ** GOTO lbl44
                                block31: while (true) {
                                    hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{(boolean)var8_9}, (long)374643115609907404L);
                                    if (!var2_2) break;
lbl44:
                                    // 2 sources

                                    var12_3 /* !! */  = E.c(8946, 2437099142781498635L) + E.c(751, 7097693949433664806L) - E.c(6832, 4330034689863142761L);
lbl45:
                                    // 3 sources

                                    switch (var12_3 /* !! */ ) {
                                        case 1987135494: {
                                            hi.a("G", (long)1330918851199290462L);
                                            hi.a("G", (float)-1.0f, (float)100.0f, (long)1060325894040809393L);
                                            continue block31;
                                        }
                                        default: {
                                            continue block31;
                                        }
                                        case 1987135496: 
                                    }
                                    break;
                                }
                                hi.a("\u00a5", (Object)var1_1, (boolean)var9_10, (long)704448810477335541L);
                                return;
                            }
                        }
                        block32: while (true) {
                            switch (var12_3 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case -193193448: {
                                    v5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)907159218940561824L), (long)1017954173869996748L) instanceof ChatScreen;
                                    if (!var2_2) ** GOTO lbl83
                                    if (v5 == 0) ** GOTO lbl82
                                    ** GOTO lbl84
                                }
                                case -193193446: {
                                    var3_4 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)746342926556941089L)}, (long)845940984871506231L);
                                    var4_5 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)890373966890392112L)}, (long)845940984871506231L);
                                    var5_6 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)884774916442844591L)}, (long)845940984871506231L);
                                    var6_7 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1181070455859876505L)}, (long)845940984871506231L);
                                    var7_8 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1282175146993233974L)}, (long)845940984871506231L);
                                    var8_9 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)961150177177550205L)}, (long)845940984871506231L);
                                    var9_10 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)399463041390746282L)}, (long)845940984871506231L);
                                    v6 = var3_4;
                                    v7 /* !! */  = var4_5;
                                    if (!var2_2) ** GOTO lbl88
                                    if (v6 != v7 /* !! */ ) ** GOTO lbl86
                                    ** GOTO lbl90
                                }
                                case -193193447: {
                                    throw null;
                                }
lbl82:
                                // 2 sources

                                v5 = var12_3 /* !! */  = E.c(24426, 8288590051169077387L) / 4 ^ E.c(905, 4643662117203825752L);
lbl83:
                                // 2 sources

                                if (var2_2) continue block32;
lbl84:
                                // 2 sources

                                var12_3 /* !! */  = (E.c(15226, 6128439550510689445L) + E.c(11297, 2210543465409444765L) - E.c(27886, 295815060246182741L)) / 2 + E.c(18852, 6197951633518698066L);
                                continue block32;
lbl86:
                                // 1 sources

                                v6 = hi.a("G", (int)E.c(27715, 2524115574400203747L), (int)E.c(4672, 6242555873293354495L), (long)834203424483934088L);
                                v7 /* !! */  = (CallSite)E.c(14068, 6492635741453607185L);
lbl88:
                                // 2 sources

                                var12_3 /* !! */  = v6 ^ v7 /* !! */ ;
                                if (var2_2) break block44;
lbl90:
                                // 2 sources

                                var12_3 /* !! */  = hi.a("G", (int)(E.c(20680, 3781089226282829668L) + E.c(10865, 5264753954100608464L)), (int)E.c(22954, 3092383398435720829L), (long)834203424483934088L) - E.c(4334, 6705684247717332773L) ^ E.c(27207, 5965351708278766989L);
                                break block44;
                                case -193193449: 
                            }
                            break;
                        }
                        return;
                    }
                    block33: while (true) {
                        block52: {
                            block51: {
                                switch (var12_3 /* !! */ ) {
                                    default: {
                                        v0 = 0.0f;
                                        var12_3 /* !! */  = E.c(30032, 424141654700499614L) / E.c(31507, 2252690050498342074L) * E.c(2716, 2488422124527246708L) * E.c(24047, 7282827844920216084L) ^ E.c(21397, 481191117600293960L) ^ E.c(17662, 2788627503336133382L);
                                        break block45;
                                    }
                                    case 814468775: {
                                        v8 /* !! */  = var3_4;
                                        if (!var2_2) break block51;
                                        if (v8 /* !! */  == false) break;
                                        break block52;
                                    }
                                    case 814468771: {
                                        v0 = 1.0f;
                                        var12_3 /* !! */  = E.c(4162, 9134127821136906217L) / E.c(17630, 4687561781748601651L) * E.c(12412, 8851036827094673288L) * E.c(14015, 2778455525710487907L) ^ E.c(14476, 5508969556029108003L) ^ E.c(28588, 8067253513099884620L);
                                        if (!var2_2) {
                                            break block33;
                                        }
                                        break block45;
                                    }
                                    case 814468772: {
                                        v0 = -1.0f;
                                        if (var2_2) break block33;
                                        ** GOTO lbl11
                                    }
                                    case 814468774: {
                                        hi.a("G", (long)789749075287395726L);
                                        hi.a("G", (long)517921721709175203L);
                                        return;
                                    }
                                }
                                v8 /* !! */  = (CallSite)((E.c(11951, 3122824287688292690L) ^ E.c(12048, 2584858164157675745L)) / E.c(16228, 3361815340163328134L) * E.c(20806, 1228591886032766708L) + E.c(23896, 1158822654969875084L) ^ E.c(16156, 4621168923557325051L));
                            }
                            var12_3 /* !! */  = (int)v8 /* !! */ ;
                            if (var2_2) continue;
                        }
                        var12_3 /* !! */  = E.c(21688, 2331411004597273360L) / 3 / E.c(29138, 5134128717243033148L) + E.c(20454, 6811006889990101026L) - E.c(6006, 4824672578394308752L) ^ E.c(23258, 730011101661433096L);
                    }
                    var12_3 /* !! */  = E.c(4162, 9134127821136906217L) / E.c(17630, 4687561781748601651L) * E.c(12412, 8851036827094673288L) * E.c(14015, 2778455525710487907L) ^ E.c(14476, 5508969556029108003L) ^ E.c(28588, 8067253513099884620L);
                }
                while (true) {
                    switch (var12_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -727751337: 
                    }
                    E.T("5XURX4VoCteQBuqU", U());
                    var12_3 /* !! */  = E.c(20883, 8441099349581203026L) - E.c(14398, 3417564019923611607L) ^ E.c(14469, 2098053081773010731L);
                }
            }
            block35: while (true) {
                block54: {
                    block53: {
                        switch (var12_3 /* !! */ ) {
                            default: {
                                v3 = 0.0f;
                                var12_3 /* !! */  = (int)(hi.a("G", (int)(E.c(16852, 8528480696926148111L) - E.c(26132, 2047127132338827699L)), (int)E.c(16302, 3297227519954380804L), (long)834203424483934088L) + E.c(30130, 1675897913457287786L) - E.c(21237, 7507657253045437775L));
                                break block46;
                            }
                            case -255012427: {
                                v9 /* !! */  = var5_6;
                                if (!var2_2) break block53;
                                if (v9 /* !! */  == false) break;
                                break block54;
                            }
                            case -255012431: {
                                v3 = 1.0f;
                                var12_3 /* !! */  = (int)(hi.a("G", (int)(E.c(6967, 5095222511044775113L) - E.c(24949, 1513856060050388633L)), (int)E.c(16714, 6380938631655560935L), (long)834203424483934088L) + E.c(17762, 4537278145589056144L) - E.c(31228, 4888830782568345183L));
                                if (!var2_2) {
                                    break block35;
                                }
                                break block46;
                            }
                            case -255012430: {
                                v3 = -1.0f;
                                if (var2_2) break block35;
                                ** GOTO lbl25
                            }
                            case -255012428: {
                                throw null;
                            }
                        }
                        v9 /* !! */  = (CallSite)((E.c(9037, 5550593373862392983L) ^ E.c(20513, 3097855077426169830L)) * E.c(26952, 7896860311314710267L) ^ E.c(15381, 5090630406004632541L) ^ E.c(29408, 5497445046539953424L));
                    }
                    var12_3 /* !! */  = (int)v9 /* !! */ ;
                    if (var2_2) continue;
                }
                var12_3 /* !! */  = (int)(hi.a("G", (int)(E.c(4830, 7223397525320156427L) * E.c(13704, 9110928293323367035L)), (int)E.c(920, 5055248476284572734L), (long)834203424483934088L) * E.c(9783, 3865728535658820040L) - E.c(8807, 7764135106194830733L) + E.c(26616, 5538671106779426909L));
            }
            var12_3 /* !! */  = (int)(hi.a("G", (int)(E.c(6967, 5095222511044775113L) - E.c(24949, 1513856060050388633L)), (int)E.c(16714, 6380938631655560935L), (long)834203424483934088L) + E.c(17762, 4537278145589056144L) - E.c(31228, 4888830782568345183L));
        }
        switch (var12_3 /* !! */ ) {
            default: {
                ** continue;
            }
            case 1120555390: 
        }
        hi.a("G", (long)938841799815187197L);
        hi.a("G", (long)1301756410258456892L);
    }

    private boolean K(Object[] objectArray) {
        Object object = objectArray[0];
        return (boolean)hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)501728103734382890L), (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((KeyMapping)object), (long)693131475716058339L), (long)1316914862415438553L), (long)396354291557487238L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x2669) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 162;
                case 1 -> 107;
                case 2 -> 15;
                case 3 -> 135;
                case 4 -> 168;
                case 5 -> 72;
                case 6 -> 118;
                case 7 -> 24;
                case 8 -> 166;
                case 9 -> 76;
                case 10 -> 87;
                case 11 -> 115;
                case 12 -> 220;
                case 13 -> 180;
                case 14 -> 249;
                case 15 -> 229;
                case 16 -> 138;
                case 17 -> 105;
                case 18 -> 102;
                case 19 -> 12;
                case 20 -> 237;
                case 21 -> 200;
                case 22 -> 217;
                case 23 -> 232;
                case 24 -> 195;
                case 25 -> 3;
                case 26 -> 42;
                case 27 -> 239;
                case 28 -> 11;
                case 29 -> 151;
                case 30 -> 137;
                case 31 -> 106;
                case 32 -> 6;
                case 33 -> 2;
                case 34 -> 139;
                case 35 -> 185;
                case 36 -> 83;
                case 37 -> 31;
                case 38 -> 69;
                case 39 -> 48;
                case 40 -> 114;
                case 41 -> 206;
                case 42 -> 148;
                case 43 -> 75;
                case 44 -> 67;
                case 45 -> 59;
                case 46 -> 167;
                case 47 -> 163;
                case 48 -> 210;
                case 49 -> 150;
                case 50 -> 184;
                case 51 -> 39;
                case 52 -> 61;
                case 53 -> 109;
                case 54 -> 147;
                case 55 -> 181;
                case 56 -> 169;
                case 57 -> 182;
                case 58 -> 198;
                case 59 -> 65;
                case 60 -> 97;
                case 61 -> 30;
                case 62 -> 124;
                case 63 -> 53;
                case 64 -> 19;
                case 65 -> 153;
                case 66 -> 128;
                case 67 -> 142;
                case 68 -> 57;
                case 69 -> 204;
                case 70 -> 245;
                case 71 -> 54;
                case 72 -> 99;
                case 73 -> 29;
                case 74 -> 209;
                case 75 -> 208;
                case 76 -> 119;
                case 77 -> 14;
                case 78 -> 248;
                case 79 -> 55;
                case 80 -> 4;
                case 81 -> 196;
                case 82 -> 122;
                case 83 -> 227;
                case 84 -> 222;
                case 85 -> 207;
                case 86 -> 154;
                case 87 -> 84;
                case 88 -> 81;
                case 89 -> 92;
                case 90 -> 43;
                case 91 -> 240;
                case 92 -> 85;
                case 93 -> 247;
                case 94 -> 77;
                case 95 -> 58;
                case 96 -> 98;
                case 97 -> 145;
                case 98 -> 51;
                case 99 -> 146;
                case 100 -> 101;
                case 101 -> 46;
                case 102 -> 62;
                case 103 -> 37;
                case 104 -> 254;
                case 105 -> 213;
                case 106 -> 225;
                case 107 -> 44;
                case 108 -> 49;
                case 109 -> 82;
                case 110 -> 41;
                case 111 -> 178;
                case 112 -> 253;
                case 113 -> 183;
                case 114 -> 108;
                case 115 -> 199;
                case 116 -> 71;
                case 117 -> 176;
                case 118 -> 123;
                case 119 -> 35;
                case 120 -> 60;
                case 121 -> 1;
                case 122 -> 120;
                case 123 -> 228;
                case 124 -> 33;
                case 125 -> 52;
                case 126 -> 235;
                case 127 -> 143;
                case 128 -> 40;
                case 129 -> 32;
                case 130 -> 172;
                case 131 -> 127;
                case 132 -> 193;
                case 133 -> 66;
                case 134 -> 103;
                case 135 -> 152;
                case 136 -> 202;
                case 137 -> 89;
                case 138 -> 50;
                case 139 -> 93;
                case 140 -> 26;
                case 141 -> 25;
                case 142 -> 164;
                case 143 -> 156;
                case 144 -> 111;
                case 145 -> 174;
                case 146 -> 28;
                case 147 -> 132;
                case 148 -> 20;
                case 149 -> 133;
                case 150 -> 17;
                case 151 -> 90;
                case 152 -> 88;
                case 153 -> 224;
                case 154 -> 36;
                case 155 -> 136;
                case 156 -> 236;
                case 157 -> 192;
                case 158 -> 9;
                case 159 -> 191;
                case 160 -> 64;
                case 161 -> 234;
                case 162 -> 170;
                case 163 -> 175;
                case 164 -> 94;
                case 165 -> 251;
                case 166 -> 189;
                case 167 -> 86;
                case 168 -> 79;
                case 169 -> 252;
                case 170 -> 95;
                case 171 -> 238;
                case 172 -> 241;
                case 173 -> 100;
                case 174 -> 91;
                case 175 -> 68;
                case 176 -> 173;
                case 177 -> 223;
                case 178 -> 161;
                case 179 -> 149;
                case 180 -> 250;
                case 181 -> 203;
                case 182 -> 165;
                case 183 -> 221;
                case 184 -> 159;
                case 185 -> 140;
                case 186 -> 27;
                case 187 -> 233;
                case 188 -> 197;
                case 189 -> 158;
                case 190 -> 160;
                case 191 -> 74;
                case 192 -> 244;
                case 193 -> 186;
                case 194 -> 73;
                case 195 -> 141;
                case 196 -> 131;
                case 197 -> 63;
                case 198 -> 56;
                case 199 -> 70;
                case 200 -> 157;
                case 201 -> 187;
                case 202 -> 226;
                case 203 -> 112;
                case 204 -> 16;
                case 205 -> 211;
                case 206 -> 96;
                case 207 -> 110;
                case 208 -> 7;
                case 209 -> 38;
                case 210 -> 214;
                case 211 -> 104;
                case 212 -> 10;
                case 213 -> 121;
                case 214 -> 205;
                case 215 -> 216;
                case 216 -> 130;
                case 217 -> 219;
                case 218 -> 45;
                case 219 -> 179;
                case 220 -> 18;
                case 221 -> 243;
                case 222 -> 22;
                case 223 -> 155;
                case 224 -> 117;
                case 225 -> 177;
                case 226 -> 255;
                case 227 -> 218;
                case 228 -> 129;
                case 229 -> 144;
                case 230 -> 47;
                case 231 -> 21;
                case 232 -> 0;
                case 233 -> 23;
                case 234 -> 8;
                case 235 -> 78;
                case 236 -> 113;
                case 237 -> 171;
                case 238 -> 201;
                case 239 -> 246;
                case 240 -> 215;
                case 241 -> 230;
                case 242 -> 134;
                case 243 -> 190;
                case 244 -> 34;
                case 245 -> 126;
                case 246 -> 125;
                case 247 -> 231;
                case 248 -> 13;
                case 249 -> 212;
                case 250 -> 194;
                case 251 -> 116;
                case 252 -> 242;
                case 253 -> 188;
                case 254 -> 5;
                default -> 80;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            E.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57EB;
        if (d[n2] == null) {
            E.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
