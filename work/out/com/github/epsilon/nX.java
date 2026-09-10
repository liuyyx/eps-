/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public final class nX
extends Enum<nX> {
    public static final /* enum */ nX Success;
    private final int G;
    public static final /* enum */ nX Info;
    private final int o;
    public static final /* enum */ nX Error;
    private final int f;
    private static final /* synthetic */ nX[] Q;
    public static final /* enum */ nX Warning;
    private static final long[] a;
    private static final Integer[] b;

    public static nX[] values() {
        return (nX[])((Enum)((Object)hi.a("j", (long)523629178608929017L))).clone();
    }

    public Color C(Object[] objectArray) {
        return hi.a("\u00a5", (Object)((Object)this), (Object)new Object[]{nX.a(25936, 4625217218601503274L)}, (long)1067191115611499684L);
    }

    public Color b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        return new Color((int)hi.a("\u00e9", (Object)((Object)this), (long)435502735264335178L), (int)hi.a("\u00e9", (Object)((Object)this), (long)905750694628382359L), (int)hi.a("\u00e9", (Object)((Object)this), (long)704565783033169089L), n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[4];
                        var12_1 = 0;
                        var11_2 = "q<\u0012\u000b|T \u0005c/\u0012\ng";
                        var13_3 = "q<\u0012\u000b|T \u0005c/\u0012\ng".length();
                        var10_4 = 7;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 27;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "\u000eRgk\u0007\u0014Ibg\u0011(U";
                            var13_3 = "\u000eRgk\u0007\u0014Ibg\u0011(U".length();
                            var10_4 = 4;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 122;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 61;
                                    break;
                                }
                                case 1: {
                                    v15 = 70;
                                    break;
                                }
                                case 2: {
                                    v15 = 123;
                                    break;
                                }
                                case 3: {
                                    v15 = 126;
                                    break;
                                }
                                case 4: {
                                    v15 = 14;
                                    break;
                                }
                                case 5: {
                                    v15 = 33;
                                    break;
                                }
                                default: {
                                    v15 = 92;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                var0_7 = 111346178811421413L;
                var6_8 = new long[30];
                var3_9 = 0;
                var4_10 = "\u000b\u007f*k#\u00db \u00bb&\u0089\u0003\u00be\u00fa1a\u00ac\u0000\u0017\u0015p\u00ab\u0080\u00dcE6\u0081\u009e~\u0086\u000b@\u0099?\u0005\u00fa\u00ff\u008d|\u00dc}vf\u00b3t\u000f6n\nk\u001a'H@p\u00e4\u0007\u00f9\u00e0\u0006\u00a9\u00d1\u00d5\u00bb\u00de\u00c2ZM\u00f7\u00b5\u00beF\u00b9\u00d9x\u00ef\u0003\u0007\u0014L #\u00af\u00b0+zkW\u00af\u0082\b/\u00c4u\u00d4\u0001H-\u00f6\u00f8h\u00f6\u00dedS\u008f?\u00ae\u008b\u00b3|\u0084\u00bd\u009bN\u00fa\u0013j\u009eqg\u0098\u009d\u008c\u00eck\u0012\u009b\u00c2\u00b2\u00ab\u00eaY\u0098d\u00ce\u008b\u0094\u00b6\u0096fK\u0098\"(\u008f\u00fb\u00ad\u0086\u00bf\u0001'\u00a1\u0000\u00b7\u008b\u001b\u000f\u00cc\u00e4\u009c\u00ccD&n\u00b5iEEt!\u00c6\u00d3\u001a\u00dd\u00dc\u0003\u00f5!A\u00fe\u0011\u00ed\u00dbx\u00ca\u00fa+I\u009b\u008b\u00ae\u00f1\u00f4\u0096\u00c8W\u0015\u00a4\u009eP\u008bv\u00b5IY\u00c3l\u009e\u000f\u0099Hz\u001f\u0085\u0016\u0080\u00c0*B.|\u001a\u00aaq";
                var5_11 = "\u000b\u007f*k#\u00db \u00bb&\u0089\u0003\u00be\u00fa1a\u00ac\u0000\u0017\u0015p\u00ab\u0080\u00dcE6\u0081\u009e~\u0086\u000b@\u0099?\u0005\u00fa\u00ff\u008d|\u00dc}vf\u00b3t\u000f6n\nk\u001a'H@p\u00e4\u0007\u00f9\u00e0\u0006\u00a9\u00d1\u00d5\u00bb\u00de\u00c2ZM\u00f7\u00b5\u00beF\u00b9\u00d9x\u00ef\u0003\u0007\u0014L #\u00af\u00b0+zkW\u00af\u0082\b/\u00c4u\u00d4\u0001H-\u00f6\u00f8h\u00f6\u00dedS\u008f?\u00ae\u008b\u00b3|\u0084\u00bd\u009bN\u00fa\u0013j\u009eqg\u0098\u009d\u008c\u00eck\u0012\u009b\u00c2\u00b2\u00ab\u00eaY\u0098d\u00ce\u008b\u0094\u00b6\u0096fK\u0098\"(\u008f\u00fb\u00ad\u0086\u00bf\u0001'\u00a1\u0000\u00b7\u008b\u001b\u000f\u00cc\u00e4\u009c\u00ccD&n\u00b5iEEt!\u00c6\u00d3\u001a\u00dd\u00dc\u0003\u00f5!A\u00fe\u0011\u00ed\u00dbx\u00ca\u00fa+I\u009b\u008b\u00ae\u00f1\u00f4\u0096\u00c8W\u0015\u00a4\u009eP\u008bv\u00b5IY\u00c3l\u009e\u000f\u0099Hz\u001f\u0085\u0016\u0080\u00c0*B.|\u001a\u00aaq".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "<2\u00e5\u0005p\u00e5\u00a80\u00b2\u00eb\"y2\u00e1\u00a8H";
                    var5_11 = "<2\u00e5\u0005p\u00e5\u00a80\u00b2\u00eb\"y2\u00e1\u00a8H".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl123:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        nX.a = var6_8;
        nX.b = new Integer[30];
        nX.Success = new nX((Object)var8[3], 0, nX.a(11279, 6439469530192773992L), nX.a(2077, 3461231542201722735L), nX.a(18817, 102884695101564650L));
        nX.Info = new nX((Object)var8[2], 1, nX.a(23526, 5271981755193357466L), nX.a(25936, 4625217218601503274L), nX.a(25936, 4625217218601503274L));
        nX.Warning = new nX((Object)var8[0], 2, nX.a(25936, 4625217218601503274L), nX.a(9024, 5393039566218234915L), 0);
        nX.Error = new nX((Object)var8[1], 3, nX.a(4374, 8952647234275130996L), nX.a(19587, 601717750119982062L), nX.a(27136, 3569026730010592628L));
        nX.Q = hi.a("G", (Object)new Object[0], (long)363574468737040772L);
    }

    public static nX valueOf(String string) {
        return (nX)((Object)hi.a("G", nX.class, (Object)string, (long)703426484721789552L));
    }

    private nX(int n2, int n3, int n4) {
        this.o = n2;
        this.G = n3;
        this.f = n4;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static nX K(boolean var0) {
        var1_1 = nX.a(10992, 2738157201306617241L) / 5 - nX.a(1797, 3332439399931586660L) ^ nX.a(10026, 6157316873044625487L);
        if (true) ** GOTO lbl5
        block8: while (true) {
            var1_1 = var0 != false ? (nX.a(17691, 290948288878897770L) ^ nX.a(12611, 2386890703533252141L)) + nX.a(10931, 6399371857704617420L) : hi.a("G", (int)nX.a(10635, 7699145473185777380L), (int)nX.a(24147, 2262522428199104805L), (long)834203424483934088L) / nX.a(26074, 2435910447128857249L) * nX.a(28655, 2588139594209673370L) * nX.a(10708, 5304719105451067047L) ^ nX.a(26732, 3788747163485980L);
lbl5:
            // 2 sources

            switch (var1_1) {
                default: {
                    continue block8;
                }
                case 1683466182: {
                    v0 = hi.a("j", (long)1025033468945026169L);
                    var1_1 = hi.a("G", (int)(nX.a(29097, 5206080542778744532L) / nX.a(28586, 8627995016741961949L)), (int)nX.a(16253, 9004301937131786263L), (long)834203424483934088L) ^ nX.a(21190, 4763439409233362360L);
                    ** GOTO lbl15
                }
                case 1683466183: {
                    v0 = hi.a("j", (long)1318151683907714888L);
                    var1_1 = hi.a("G", (int)(nX.a(16322, 525369159434637474L) / nX.a(27944, 1284404426559046222L)), (int)nX.a(1893, 7637357347094177793L), (long)834203424483934088L) ^ nX.a(6955, 6577331788236764231L);
lbl15:
                    // 2 sources

                    switch (var1_1) {
                        case -434923605: {
                            hi.a("G", (int)1, (int)-1, (long)682117342267402956L);
                            return v0;
                        }
                    }
                    return v0;
                }
                case 1683466181: 
            }
            hi.a("G", (boolean)false, (long)1315516439304393687L);
            nX.N("DxAOq2POYtEGln9q", P(int ), (int)nX.a(15850, 7983957188353233538L));
        }
    }

    public static /* bridge */ /* synthetic */ CallSite N(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static /* synthetic */ nX[] X(Object[] objectArray) {
        return new nX[]{hi.a("j", (long)1025033468945026169L), hi.a("j", (long)866450978617557737L), hi.a("j", (long)1323230672376652096L), hi.a("j", (long)1318151683907714888L)};
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F66;
        if (b[n2] == null) {
            nX.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
