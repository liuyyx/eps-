/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xn;
import com.github.epsilon._E;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.lH;
import com.github.epsilon.vY;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e0
extends e {
    private static final long F;
    private final _E d = new _E((lH)((Object)hi.a("j", (long)611443736556992631L)), e0.d(32144, 969656201135107901L));
    private static final float o = 240.0f;
    private float W;
    public static final e0 B;
    public final Xn K;
    public final Xn u;
    private static final float h = 0.85f;
    private static final long D;
    private final _E N = new _E((lH)((Object)hi.a("j", (long)611443736556992631L)), e0.d(13836, 9103135303924999328L));
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;
    private static final long[] k;
    private static final Long[] l;

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1177533542378515722L);
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1308678435871203692L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var21 = new String[3];
                            var19_1 = 0;
                            var18_2 = "\u0018\u00f8\u008f3H\u00e6\u008f\n\u00ba*\u00e78a\u00e1\t|\u00de\u00d7\u0019u\u0096\u00ae\u008c\u00ab\u0006\u0018Txn\u00cd\u0099";
                            var20_3 = "\u0018\u00f8\u008f3H\u00e6\u008f\n\u00ba*\u00e78a\u00e1\t|\u00de\u00d7\u0019u\u0096\u00ae\u008c\u00ab\u0006\u0018Txn\u00cd\u0099".length();
                            var17_4 = 14;
                            var16_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var21[var19_1++] = new String(v0).intern();
                                if ((var16_5 += var17_4) < var20_3) {
                                    var17_4 = var18_2.charAt(var16_5);
                                    ** continue;
                                }
                                break block27;
                                break;
                            }
                            v1 = ++var16_5;
                            v2 = var18_2.substring(v1, v1 + var17_4).toCharArray();
                            v3 = v2.length;
                            var22_6 = 0;
                            v4 = 62;
                            v5 = v2;
                            v6 = v3;
                            if (v3 > 1) ** GOTO lbl67
                            do {
                                v7 = v4;
                                v5 = v5;
                                v8 = v5;
                                v9 = v4;
                                v10 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v11 = 77;
                                            break;
                                        }
                                        case 1: {
                                            v11 = 87;
                                            break;
                                        }
                                        case 2: {
                                            v11 = 30;
                                            break;
                                        }
                                        case 3: {
                                            v11 = 23;
                                            break;
                                        }
                                        case 4: {
                                            v11 = 99;
                                            break;
                                        }
                                        case 5: {
                                            v11 = 19;
                                            break;
                                        }
                                        default: {
                                            v11 = 89;
                                        }
                                    }
                                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                    ++var22_6;
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
                            } while (v6 > var22_6);
                            ** while (true)
                        }
                        e0.a = var21;
                        e0.b = new String[3];
                        var8_7 = 8713539770234537801L;
                        var14_8 = new long[152];
                        var11_9 = 0;
                        var12_10 = ";\u00b4\u0000\u00fe\u009d,\u00f5\u008f4\u008cj\u00bb{\u00ed\u00e3G\u0017\u0001\u001cho'\u00d8yP\\c\u00ff\u00fd\u0092p\u0080:\u00f4\u00ba\u0000\u00e8\u0096\u00c1\u00ce\u00e0\u0097\r\u0000\u00a0z\u0007\u0000\u00ee\u009a8\u0099\u00ec\u0002\u00ca|\u00ed_\u00a7\u0093\u0001\u00b85x\u00b5\u0004\u001c\u00f2\u00aa\u00d2\u00f3%\u0003\u001f\u001e\u00b9UQT>\u00d9\u00c4\r\u0013\u00f6\u00c4\u00df<\u00e9\u0003;\u00b4\u008b3\u0095\u00e8\u009e[3\u00b8\u00b0\u0086\u001ad7\u00a4\u0004\u008d\u00c6\r\u00a1\u00fc\u00910\\\u00feI\fF\"R\u0097\u00cfs\u00c4\u0085~bQ\u00c85\u0088\u00dd\u009dQ5\u00ab\u00ac\u00d2\n\u00d5y\u00d2@\u00d5>\u0015\u00dfO/0i\u00b6E(\u00b6\u00ffk\u00a9\u0089>\u00b9$Y1+\u00bc\u00e7\u00d0\n\u0082\u00e3\u00f0\u00c0\u0012\u00c4\u00c2\u00fc\u00f4\u00ec\u00c0\u00c6\u0010\u00d2c\r\u00b4\u0005\u0090\u00d05+\u00e8Z&Uf\u0085\u0090b\u00ab\u009e\u00d2K/\u00ddu\u0013\u00c9\u00e4[\u0099\u0093\u00e0\u00a3L\u0003\u00a5\u00caV-\u00f2Z\u00e7\u00f4\u0019\u00f0\u0096\u0014P\u001bO\u00d6\u00e1\bz\u00dbUaOB8\u00b7\u0088\u0019\u00e9\u00dc\u00faY\u008eu\u008d\u000b?\u00ec\u0007\u0088Go-\u0095\u008a\u0083\u00e8\u00ba\u007f\u00e2\u0018t\u00bf\u001f\u00a6\u00822ZM\u00b0(\u0099\u00e1\u00c9\u00e6\u00f2|\u0092\u00c7I\u00a5\u0015\u00ab\u00140\u001dej\u0081\u00dcU\u00fd<{\u0016\u00a1!\t\u00a1\u0087\u008a\u000f\u0002\u00f0t\u00aba\u00f8\u00adx\u00de\u00a3\u00bcH\"\u000bP\u00f1Q\u00d1[P{\u00beI\u0082\u0091\u0015\u0099\u0015I\u0001\u00f8\u00872\u00af\u00ae)\u00c7\u00e8\u00cbY\u00eb\u00ad\u00b8Nu\u00ab*\u00cb\u00a6\u00b4\u00f4\u00bb\u00ac\u009bE\u00e1q\u00ae\u00b0\u009fw\u00ce\u00a7\u00e0\u00e4\u00b9\u00b8NW\u00d5}\u009bl\u0095rg=\u00c1gl\u00b2\u0013\u0082w4\u00ac\u0015\u0017\u00d4\u00fe\f\u00936@\u00a0\u0011`\u00c1\u00f4m\u001d\u00b16Vb$\u00ae\u0007\u00daW\u0090\u00e5\u0082\u00a6\u0097\u0019C\u0018\u00bf\u00fe1bRv\u001c\u0091\u008b\u00da\u00e1\u0002\u00ec\u00d7\u00f9a\u0002=\f*\u00d2\u001eo\"\u009f\u0092\u00c3\u0094\u00e7o\u00f7\u0090:d\u00acH\u00feJ\u0084\u00ad\u00be\u00e9\u00b4\u0097E\u00e2\u00fa0Y\u00d7.\u009a\u00ad\u008d\u00c8\u00c4\u0081\u000f.\u00d5,\u00b5PN4\u00ea\u00f6\u00afPLg?\u00b1\u00f6$\u00a0\u00ff\u00c5\u0015i\u00f3\u009f\u0017\u000f\u00e0\u00b1j\u00f1\u00ea\u001c/\u00d5\u00d7\u00ee\u0013\u00d8\u00a0\u0011\u00e4}d\u00bf\u00e3\u00a1\u001d\u00f5\u009d c4\u0080F\u007f\u000f\u00cd\u001dd\u00fdeSp\u008f*|o\u00c3\u00f3M\u0013\u00c2\u00c94\u00eb\u0096kx\u009c)\u0082\u0081\u00a8\u00ed{\u00f5W\u0080jp\u00a3\u0092hY\u0082\u00f2\u00d2\u00ce\u00e2=\u00c8\u001a\u00b7N\\\u00ef\u0099\u00ca\u009f\u00f4W\u00cd\u00fb\u00df\u00f7.9\u0005J3Hr[\u00b1_\u0004\u00ec\u0091\u00f2\u0011p\u001dH^\u00b1\u00a4\u0095\u00e6/_\u0084\u00f3\u0097\n\u0014\u00b9\u0007e\u00bf\u0010\u001f\u0092\u00bcj\u00e0\u00fcO\t\u00d6T\u009f\u0004\tKGV`d\u00fax\u0016ams\u0005\u00d5\u00f6i\u009e\u00c7\u001d\u0089\u0002r\u00df\u009b\u00b0\u0014\u008a:\u001f\u00ec,#\u00cf\u001a\u001d-\u0005\u0095\u0004\u00e8sf\u00b9\u0082\u00a2~\u00f4\u00d1\u00b7\u00b7\u00bf\u00a5\u00dc\u00ffi\u00a8\u00e9C\u00c6e\u008d\u00e7\u0080\u00af-\u0084\u00bb\u0003\u00d6\u00e7\u009fB\u00e7\u0081h\u00c5\u00d1\u00e6g~t\u009f\u00d0-;\u00c2:\u00c1o\u00fe\u00f8?-\u009f\u0012\u00a3\u0092\u001b\u0001b\u00f1E\r#S9\u00f4\u00f3\u001e,\u0000\u0084U\u0002\u00c8\u0012\u00baZ\u00c1\u00e87\u00d5Z\u00a3!\u007f\u00b3\u00ccVp\u00f5\u000e\u0000\u00f7\u00daj9\u00b5\u00f6\u00e8;\u00fbd\u0017\u001e\u0011!\u00ed\u00ccm+\u00eaI\u00e3k\u001b&\u00a0\u000e\u00b8\u00a9\u00f1\u0000\u001bz\r\u00f90\u0080\u0006\u0091p\thw\nu\u001e\u009a\b\u00a7rZ{\u00b0Q\u00c6\u0082\bQ4\u00bf\u00f7\u00ee\u00c4\u0007t\u00e0\u00eaM\u00eb\u001f\u0096\u0092\u00c0p\u0014\u00a8\u0094j\u00b8\u00d3I\u00c3\u00c8\u00061\u0082\u00c1\u00c3#l\u00a9\u0015TY\t\u0088x\u0011$b\u00f5\u00ae\u00fa\u00d5g\u00dfeU\u001b\u009d\u00b9\u0019\u000e\u00cdt\u00d8\u00ec\u0004o\u008c\u0096D2\u0081\u0084\u00a1\u008a\u00b2W&\u00db\u00eb\u0007\u008e\u00e6e\u00a8~\u00da\u0018\u00af)\u00e32>\u0016Q\u00f1s\u00c2\u0001\u00b4\u00b5\u001f\u00efu\u00b7\u009a\u00a7\u00c0\u00f8\u00dc((\u0081\u00b8\u0098\u00eb\u00ac\u00eb\u0093\u00a1\u00ed\u00a1l\u00b6\u00cay\u0086\u00901X\u00d6\u0084!\u00bf\u0086$QL<o\u008c\u00e40R\u00c5\u008a\u00c3\u00db\b5\u0017\u00c0`\u00bfT\u00e4\u0081\u0087\u00af\u0085\u00cd\u0094\u001b\u008ac\u00a3Y\u00a4rD\u00a2>\u00c4\u0092bV*\u00e4\u00f7\r\u0090X4&@\u000b\u00cd\u00f69?\u00c2]\u008bnc\u00b5\u00eb\u00a6\u00ba\u0084v\u00c8\u001b\u00f4w\u00b3Y\u0080$\u00f1\u0010V8\u00c6\u00fc\u007f\u00c7\u00ed\u0082z;\u00b4\u00bd\u00959\u00f8\u008e\u00e7\u0096\u0086\"Dc\u00b5\u00921\u00c2\u0081\u0012\u008b\r/\u00ca\r\u0017$D\u0010B\u0019\u009a\u00ea\u00dcX\u00b1\u00e2\u0013\u00eb\u00c2\u00f8X\u00f7cG\u00e6\u00fbx]\u00e9\u00da\u00a2\u00fb\u009c\u00a3\u00cb\u00e3\u0098\u00d4b\u001aI\u0007?\u00a0\u00c7\u0004\b\u00afe\u008f*\u00d2\u00c734\u00e5\u00ad\u00d2\u00fd3\u00af\u0005&$P\u00e0\u001a\u00fa+7\u00a1Q9_1(\u00c32\u009ez\u00df\u00e3\u0084/\u00a0.q\u00ec`\u00b4\u00e7\u008dbL\u0018{\u00ddi\u00bbPP?EDfu\u0094\u00eaNI\u0013\u0002\u00cd\u00a6!\u0084\u008a\u00a9\u00d7ap\u009e\rk\u0092R\u0093~\u00d4";
                        var13_11 = ";\u00b4\u0000\u00fe\u009d,\u00f5\u008f4\u008cj\u00bb{\u00ed\u00e3G\u0017\u0001\u001cho'\u00d8yP\\c\u00ff\u00fd\u0092p\u0080:\u00f4\u00ba\u0000\u00e8\u0096\u00c1\u00ce\u00e0\u0097\r\u0000\u00a0z\u0007\u0000\u00ee\u009a8\u0099\u00ec\u0002\u00ca|\u00ed_\u00a7\u0093\u0001\u00b85x\u00b5\u0004\u001c\u00f2\u00aa\u00d2\u00f3%\u0003\u001f\u001e\u00b9UQT>\u00d9\u00c4\r\u0013\u00f6\u00c4\u00df<\u00e9\u0003;\u00b4\u008b3\u0095\u00e8\u009e[3\u00b8\u00b0\u0086\u001ad7\u00a4\u0004\u008d\u00c6\r\u00a1\u00fc\u00910\\\u00feI\fF\"R\u0097\u00cfs\u00c4\u0085~bQ\u00c85\u0088\u00dd\u009dQ5\u00ab\u00ac\u00d2\n\u00d5y\u00d2@\u00d5>\u0015\u00dfO/0i\u00b6E(\u00b6\u00ffk\u00a9\u0089>\u00b9$Y1+\u00bc\u00e7\u00d0\n\u0082\u00e3\u00f0\u00c0\u0012\u00c4\u00c2\u00fc\u00f4\u00ec\u00c0\u00c6\u0010\u00d2c\r\u00b4\u0005\u0090\u00d05+\u00e8Z&Uf\u0085\u0090b\u00ab\u009e\u00d2K/\u00ddu\u0013\u00c9\u00e4[\u0099\u0093\u00e0\u00a3L\u0003\u00a5\u00caV-\u00f2Z\u00e7\u00f4\u0019\u00f0\u0096\u0014P\u001bO\u00d6\u00e1\bz\u00dbUaOB8\u00b7\u0088\u0019\u00e9\u00dc\u00faY\u008eu\u008d\u000b?\u00ec\u0007\u0088Go-\u0095\u008a\u0083\u00e8\u00ba\u007f\u00e2\u0018t\u00bf\u001f\u00a6\u00822ZM\u00b0(\u0099\u00e1\u00c9\u00e6\u00f2|\u0092\u00c7I\u00a5\u0015\u00ab\u00140\u001dej\u0081\u00dcU\u00fd<{\u0016\u00a1!\t\u00a1\u0087\u008a\u000f\u0002\u00f0t\u00aba\u00f8\u00adx\u00de\u00a3\u00bcH\"\u000bP\u00f1Q\u00d1[P{\u00beI\u0082\u0091\u0015\u0099\u0015I\u0001\u00f8\u00872\u00af\u00ae)\u00c7\u00e8\u00cbY\u00eb\u00ad\u00b8Nu\u00ab*\u00cb\u00a6\u00b4\u00f4\u00bb\u00ac\u009bE\u00e1q\u00ae\u00b0\u009fw\u00ce\u00a7\u00e0\u00e4\u00b9\u00b8NW\u00d5}\u009bl\u0095rg=\u00c1gl\u00b2\u0013\u0082w4\u00ac\u0015\u0017\u00d4\u00fe\f\u00936@\u00a0\u0011`\u00c1\u00f4m\u001d\u00b16Vb$\u00ae\u0007\u00daW\u0090\u00e5\u0082\u00a6\u0097\u0019C\u0018\u00bf\u00fe1bRv\u001c\u0091\u008b\u00da\u00e1\u0002\u00ec\u00d7\u00f9a\u0002=\f*\u00d2\u001eo\"\u009f\u0092\u00c3\u0094\u00e7o\u00f7\u0090:d\u00acH\u00feJ\u0084\u00ad\u00be\u00e9\u00b4\u0097E\u00e2\u00fa0Y\u00d7.\u009a\u00ad\u008d\u00c8\u00c4\u0081\u000f.\u00d5,\u00b5PN4\u00ea\u00f6\u00afPLg?\u00b1\u00f6$\u00a0\u00ff\u00c5\u0015i\u00f3\u009f\u0017\u000f\u00e0\u00b1j\u00f1\u00ea\u001c/\u00d5\u00d7\u00ee\u0013\u00d8\u00a0\u0011\u00e4}d\u00bf\u00e3\u00a1\u001d\u00f5\u009d c4\u0080F\u007f\u000f\u00cd\u001dd\u00fdeSp\u008f*|o\u00c3\u00f3M\u0013\u00c2\u00c94\u00eb\u0096kx\u009c)\u0082\u0081\u00a8\u00ed{\u00f5W\u0080jp\u00a3\u0092hY\u0082\u00f2\u00d2\u00ce\u00e2=\u00c8\u001a\u00b7N\\\u00ef\u0099\u00ca\u009f\u00f4W\u00cd\u00fb\u00df\u00f7.9\u0005J3Hr[\u00b1_\u0004\u00ec\u0091\u00f2\u0011p\u001dH^\u00b1\u00a4\u0095\u00e6/_\u0084\u00f3\u0097\n\u0014\u00b9\u0007e\u00bf\u0010\u001f\u0092\u00bcj\u00e0\u00fcO\t\u00d6T\u009f\u0004\tKGV`d\u00fax\u0016ams\u0005\u00d5\u00f6i\u009e\u00c7\u001d\u0089\u0002r\u00df\u009b\u00b0\u0014\u008a:\u001f\u00ec,#\u00cf\u001a\u001d-\u0005\u0095\u0004\u00e8sf\u00b9\u0082\u00a2~\u00f4\u00d1\u00b7\u00b7\u00bf\u00a5\u00dc\u00ffi\u00a8\u00e9C\u00c6e\u008d\u00e7\u0080\u00af-\u0084\u00bb\u0003\u00d6\u00e7\u009fB\u00e7\u0081h\u00c5\u00d1\u00e6g~t\u009f\u00d0-;\u00c2:\u00c1o\u00fe\u00f8?-\u009f\u0012\u00a3\u0092\u001b\u0001b\u00f1E\r#S9\u00f4\u00f3\u001e,\u0000\u0084U\u0002\u00c8\u0012\u00baZ\u00c1\u00e87\u00d5Z\u00a3!\u007f\u00b3\u00ccVp\u00f5\u000e\u0000\u00f7\u00daj9\u00b5\u00f6\u00e8;\u00fbd\u0017\u001e\u0011!\u00ed\u00ccm+\u00eaI\u00e3k\u001b&\u00a0\u000e\u00b8\u00a9\u00f1\u0000\u001bz\r\u00f90\u0080\u0006\u0091p\thw\nu\u001e\u009a\b\u00a7rZ{\u00b0Q\u00c6\u0082\bQ4\u00bf\u00f7\u00ee\u00c4\u0007t\u00e0\u00eaM\u00eb\u001f\u0096\u0092\u00c0p\u0014\u00a8\u0094j\u00b8\u00d3I\u00c3\u00c8\u00061\u0082\u00c1\u00c3#l\u00a9\u0015TY\t\u0088x\u0011$b\u00f5\u00ae\u00fa\u00d5g\u00dfeU\u001b\u009d\u00b9\u0019\u000e\u00cdt\u00d8\u00ec\u0004o\u008c\u0096D2\u0081\u0084\u00a1\u008a\u00b2W&\u00db\u00eb\u0007\u008e\u00e6e\u00a8~\u00da\u0018\u00af)\u00e32>\u0016Q\u00f1s\u00c2\u0001\u00b4\u00b5\u001f\u00efu\u00b7\u009a\u00a7\u00c0\u00f8\u00dc((\u0081\u00b8\u0098\u00eb\u00ac\u00eb\u0093\u00a1\u00ed\u00a1l\u00b6\u00cay\u0086\u00901X\u00d6\u0084!\u00bf\u0086$QL<o\u008c\u00e40R\u00c5\u008a\u00c3\u00db\b5\u0017\u00c0`\u00bfT\u00e4\u0081\u0087\u00af\u0085\u00cd\u0094\u001b\u008ac\u00a3Y\u00a4rD\u00a2>\u00c4\u0092bV*\u00e4\u00f7\r\u0090X4&@\u000b\u00cd\u00f69?\u00c2]\u008bnc\u00b5\u00eb\u00a6\u00ba\u0084v\u00c8\u001b\u00f4w\u00b3Y\u0080$\u00f1\u0010V8\u00c6\u00fc\u007f\u00c7\u00ed\u0082z;\u00b4\u00bd\u00959\u00f8\u008e\u00e7\u0096\u0086\"Dc\u00b5\u00921\u00c2\u0081\u0012\u008b\r/\u00ca\r\u0017$D\u0010B\u0019\u009a\u00ea\u00dcX\u00b1\u00e2\u0013\u00eb\u00c2\u00f8X\u00f7cG\u00e6\u00fbx]\u00e9\u00da\u00a2\u00fb\u009c\u00a3\u00cb\u00e3\u0098\u00d4b\u001aI\u0007?\u00a0\u00c7\u0004\b\u00afe\u008f*\u00d2\u00c734\u00e5\u00ad\u00d2\u00fd3\u00af\u0005&$P\u00e0\u001a\u00fa+7\u00a1Q9_1(\u00c32\u009ez\u00df\u00e3\u0084/\u00a0.q\u00ec`\u00b4\u00e7\u008dbL\u0018{\u00ddi\u00bbPP?EDfu\u0094\u00eaNI\u0013\u0002\u00cd\u00a6!\u0084\u008a\u00a9\u00d7ap\u009e\rk\u0092R\u0093~\u00d4".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v12 = var14_8;
                            v13 = var11_9++;
                            v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v15 = -1;
                            break block28;
                            break;
                        }
lbl90:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\fS\u00fd\u00ee\u00d6\u000ey\u00bat\u00b1B\u00aaH\u0018\u00f4\u00a3";
                            var13_11 = "\fS\u00fd\u00ee\u00d6\u000ey\u00bat\u00b1B\u00aaH\u0018\u00f4\u00a3".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v12 = var14_8;
                                v13 = var11_9++;
                                v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v15 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl103:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            break block29;
                            break;
                        }
                    }
                    v16 = v14 ^ var8_7;
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
                e0.c = var14_8;
                e0.e = new Integer[152];
                var0_14 = 5541214969827442610L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 = "m\u00b6SX\u00aa\u00cc\u00a3'\u001e\u00fb\u00e7\u0083\u00c2\t=\u0090";
                var5_18 = "m\u00b6SX\u00aa\u00cc\u00a3'\u001e\u00fb\u00e7\u0083\u00c2\t=\u0090".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v17 = var6_15;
                    v18 = var3_16++;
                    v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v20 = -1;
                    break block30;
                    break;
                }
lbl131:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "2\u00b2\u008c\u00fc\u0018`[\u00a6A\u0092\u00b0\u0085bM\u0090\u0019";
                    var5_18 = "2\u00b2\u008c\u00fc\u0018`[\u00a6A\u0092\u00b0\u0085bM\u0090\u0019".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v17 = var6_15;
                        v18 = var3_16++;
                        v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v20 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl144:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    break block31;
                    break;
                }
            }
            v21 = v19 ^ var0_14;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl155:
                // 1 sources

                ** continue;
            }
        }
        e0.k = var6_15;
        e0.l = new Long[4];
        e0.F = e0.d(20111, 2400430630088776737L);
        e0.D = e0.d(20507, 5917094580795015860L);
        e0.B = new e0();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float Q(Object[] var1_1) {
        block15: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = (e0.c(28856, 3481773410492062795L) - e0.c(12729, 3185925617131511089L) - e0.c(25274, 2862780751374749195L)) * e0.c(30341, 880988502611958355L) / e0.c(31644, 9190720820582225776L) + e0.c(15216, 6389602999814117348L);
            if (!var2_2) ** GOTO lbl15
            block8: while (true) {
                block18: {
                    block17: {
                        block16: {
                            v0 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1252821037877920419L);
                            if (var2_2) break block16;
                            if (v0 != false) break block17;
                            v0 = hi.a("G", (int)e0.c(23942, 4488085248979743048L), (int)e0.c(13036, 6578307505292238386L), (long)834203424483934088L) - e0.c(6264, 9007149612185384109L);
                        }
                        var3_3 /* !! */  = (int)v0;
                        if (!var2_2) break block18;
                    }
                    var3_3 /* !! */  = (e0.c(8176, 8923963209912251252L) ^ e0.c(7729, 5771396345848230638L)) + e0.c(32053, 6330961493793903045L);
                }
                block9: while (true) {
                    switch (var3_3 /* !! */ ) {
                        default: {
                            continue block8;
                        }
                        case -574348625: {
                            v1 /* !! */  = (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L), (long)1167668381225401548L);
                            var3_3 /* !! */  = (int)(hi.a("G", (int)e0.c(27197, 7361060897849214614L), (int)e0.c(23461, 174050303406225272L), (long)834203424483934088L) + e0.c(1562, 7525017649326647945L));
                            if (var2_2) {
                                break block8;
                            }
                            break block15;
                        }
                        case -574348627: {
                            v1 /* !! */  = 1.0f;
                            if (!var2_2) break block8;
                            return v1 /* !! */ ;
                        }
                        case -574348624: {
                            e0.l("0lh4gn97hVKftOGU", values());
                            hi.a("G", (long)672565527819449937L);
                            var3_3 /* !! */  = hi.a("G", (int)e0.c(24104, 5216970193919423178L), (int)e0.c(28312, 5924134626366292627L), (long)834203424483934088L) + e0.c(13225, 4799685904229523271L) + e0.c(89, 330209189591805015L) + e0.c(9947, 1722454152289864319L) ^ e0.c(17890, 3891585250712299903L);
                            continue block9;
                        }
                    }
                    break;
                }
                break;
            }
            var3_3 /* !! */  = (int)(hi.a("G", (int)e0.c(20785, 1811773225534340605L), (int)e0.c(18993, 8339753736537941682L), (long)834203424483934088L) + e0.c(9430, 7219198442773334043L));
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v1 /* !! */ ;
            }
            case -1972612995: 
        }
        throw null;
    }

    private e0() {
        super(e0.b(-21449, -24356), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        hi.a("\u00f2", (Object)this, (float)Float.NaN, (long)496337376469087251L);
        this.K = e0.l("0lh4gn97hVKftOGU", U(java.lang.String boolean ), (e0)this, (String)e0.b(-21451, 723), (boolean)true);
        this.u = hi.a("\u00a5", (Object)this, (Object)e0.b(-21450, 16814), (boolean)true, (long)1230617056439551805L);
    }

    private void I(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        hi.a("\u00f2", (Object)this, (float)f, (long)496337376469087251L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (float)f, (long)1165334323158006666L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (Object)new Object[]{Float.valueOf(f)}, (long)1175021915836649385L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (boolean)true, (long)808546903165099297L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean i(Object[] var1_1) {
        var2_2 = Dl.t();
        var3_3 /* !! */  = e0.c(1918, 6552936602565962688L) + e0.c(10084, 7219665557665860561L) + e0.c(25285, 7543943434627616357L);
        if (!var2_2) ** GOTO lbl16
        block10: while (true) {
            block15: {
                block14: {
                    block13: {
                        v0 /* !! */  = e0.l("0lh4gn97hVKftOGU", N(), (e0)this);
                        if (var2_2) break block13;
                        if (v0 /* !! */  != false) break block14;
                        v0 /* !! */  = (CallSite)(e0.l("0lh4gn97hVKftOGU", max(int int ), (int)(e0.c(31162, 5379055118528877866L) / 5 + e0.c(6470, 1729961290688460235L) + e0.c(21674, 3252086248036874353L)), (int)e0.c(28298, 3431173289298100814L)) ^ e0.c(25726, 5922358200550918345L));
                    }
                    var3_3 /* !! */  = (int)v0 /* !! */ ;
                    if (!var2_2) break block15;
                }
                var3_3 /* !! */  = (e0.c(9177, 250488329965457261L) + e0.c(27306, 8036286117449958957L) + e0.c(8119, 7317044954779153323L) - e0.c(14204, 7354967077656976340L) ^ e0.c(2141, 9207209538049107020L)) - e0.c(21262, 2814573036212109208L);
                if (var2_2) ** GOTO lbl41
            }
            block11: while (true) {
                switch (var3_3 /* !! */ ) {
                    default: {
                        continue block10;
                    }
                    case 914282054: {
                        v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1324212920325673614L), (long)789438897355831922L)), (long)1000026253634408124L);
                        if (var2_2) ** GOTO lbl42
                        if (v1 /* !! */  == false) ** GOTO lbl41
                        ** GOTO lbl44
                    }
                    case 914282056: {
                        v2 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                        if (var2_2) ** GOTO lbl47
                        if (v2 /* !! */  != false) ** GOTO lbl46
                        ** GOTO lbl49
                    }
                    case 914282053: {
                        v3 = true;
                        var3_3 /* !! */  = e0.c(15446, 8242876822696120453L) + e0.c(1587, 5771417563409607395L) + e0.c(23773, 196266260529229856L) - e0.c(9342, 5537543069569337493L);
                        if (!var2_2) ** GOTO lbl52
                        ** GOTO lbl51
                    }
                    case 914282052: {
                        v3 = false;
                        if (var2_2) {
                            return v3;
                        }
                        ** GOTO lbl51
                    }
lbl41:
                    // 2 sources

                    v1 /* !! */  = (CallSite)(hi.a("G", (int)(e0.c(4892, 955154539406098181L) / 5 + e0.c(4161, 8991054651961375992L) + e0.c(8476, 7014250616073047493L)), (int)e0.c(5670, 28553788992911931L), (long)834203424483934088L) ^ e0.c(31299, 4320634541306746607L));
lbl42:
                    // 2 sources

                    var3_3 /* !! */  = (int)v1 /* !! */ ;
                    if (!var2_2) continue block11;
lbl44:
                    // 2 sources

                    var3_3 /* !! */  = e0.c(8967, 3104128707717844924L) + e0.c(20193, 3613725857196253721L) + e0.c(4027, 2806278231185482530L);
                    if (!var2_2) continue block11;
lbl46:
                    // 2 sources

                    v2 /* !! */  = (CallSite)(hi.a("G", (int)(e0.c(4892, 955154539406098181L) / 5 + e0.c(4161, 8991054651961375992L) + e0.c(8476, 7014250616073047493L)), (int)e0.c(5670, 28553788992911931L), (long)834203424483934088L) ^ e0.c(31299, 4320634541306746607L));
lbl47:
                    // 2 sources

                    var3_3 /* !! */  = (int)v2 /* !! */ ;
                    if (!var2_2) continue block11;
lbl49:
                    // 2 sources

                    var3_3 /* !! */  = (e0.c(30784, 5894302282907817124L) ^ e0.c(6075, 6359066391501798319L) ^ e0.c(13489, 1756983967081453650L)) / e0.c(1028, 4218500894331594966L) + e0.c(11466, 8989573476357750829L);
                    continue block11;
lbl51:
                    // 2 sources

                    var3_3 /* !! */  = e0.c(2347, 8613066537199396311L) + e0.c(21120, 4969015730095799855L) + e0.c(23878, 4141468206438592856L) - e0.c(24013, 1314989969627132167L);
lbl52:
                    // 2 sources

                    switch (var3_3 /* !! */ ) {
                        default: {
                            return v3;
                        }
                        case 1293920226: 
                    }
                    throw null;
                    case 914282055: 
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int L(Object[] var1_1) {
        block15: {
            var2_2 = (Integer)var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = e0.c(18580, 897866952952652958L) - e0.c(18580, 8429031171398444043L) + e0.c(25179, 8935749799141936716L);
            if (var3_3) break block15;
lbl6:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1035720040285569184L);
                if (!var3_3) ** GOTO lbl54
                if (v0 /* !! */  != false) ** GOTO lbl53
                ** GOTO lbl56
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1177533542378515722L);
                return var2_2;
            }
lbl14:
            // 1 sources

            while (true) {
                v1 /* !! */  = hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)496337376469087251L), (long)619542100356072855L);
                if (!var3_3) ** GOTO lbl59
                if (v1 /* !! */  == false) ** GOTO lbl58
                ** GOTO lbl61
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                cfr_temp_0 = hi.a("G", (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (long)1167668381225401548L) - (float)var2_2), (long)400111314131951612L) - 240.0f;
                v2 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                if (!var3_3) ** GOTO lbl64
                if (v2 /* !! */  <= 0) ** GOTO lbl63
                ** GOTO lbl66
                break;
            }
lbl25:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[]{Float.valueOf(var2_2)}, (long)846988796337968276L);
                return var2_2;
            }
lbl28:
            // 1 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (float)var2_2, (long)496337376469087251L);
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (float)var2_2, (long)439674605800943152L);
                return (int)hi.a("G", (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (long)1167668381225401548L), (long)400355798406630015L);
            }
        }
        while (true) {
            switch (var4_4 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1386308136: {
                    ** continue;
                }
                case 1386308131: {
                    ** continue;
                }
                case 1386308135: {
                    ** continue;
                }
                case 1386308130: {
                    ** continue;
                }
                case 1386308132: {
                    ** continue;
                }
                case 1386308133: 
            }
            hi.a("G", (long)1082807210064546197L);
            e0.l("0lh4gn97hVKftOGU", l());
            var4_4 /* !! */  = e0.c(19417, 8465447370928203551L) + e0.c(19682, 7654841345068638279L) + e0.c(17970, 8033504135041624712L);
            if (var3_3) continue;
lbl53:
            // 2 sources

            v0 /* !! */  = (CallSite)(hi.a("G", (int)(e0.c(10828, 3485838526922475230L) + e0.c(135, 7504736195101191304L)), (int)e0.c(28163, 3664541950183899852L), (long)834203424483934088L) ^ e0.c(14859, 4410868671189538489L));
lbl54:
            // 2 sources

            var4_4 /* !! */  = (int)v0 /* !! */ ;
            if (var3_3) continue;
lbl56:
            // 2 sources

            var4_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(e0.c(27962, 7372574446515552730L) - e0.c(15712, 6266667663499710915L)), (int)e0.c(4765, 9154052521296035356L), (long)834203424483934088L) ^ e0.c(14238, 8302571361061395235L)), (int)e0.c(28650, 8276147385248842586L), (long)834203424483934088L) + e0.c(5960, 439623764856929111L));
            if (var3_3) continue;
lbl58:
            // 2 sources

            v1 /* !! */  = (CallSite)(e0.c(1896, 4420410647223528292L) / e0.c(15015, 1104828959494788628L) * e0.c(22390, 8172078352917838759L) + e0.c(2806, 817739187349481038L) + e0.c(19704, 3317000411399856142L) - e0.c(27544, 251018196545832750L));
lbl59:
            // 2 sources

            var4_4 /* !! */  = (int)v1 /* !! */ ;
            if (var3_3) continue;
lbl61:
            // 2 sources

            var4_4 /* !! */  = (e0.c(14787, 4126665377102091597L) ^ e0.c(7731, 6533110335232471771L)) * e0.c(32573, 811013006023168945L) + e0.c(31056, 6691060162016581050L);
            if (var3_3) continue;
lbl63:
            // 2 sources

            v2 /* !! */  = (reference)(e0.c(2519, 304990412573631817L) ^ e0.c(28788, 8118427502450220185L) ^ e0.c(11246, 3785365354543990580L));
lbl64:
            // 2 sources

            var4_4 /* !! */  = (int)v2 /* !! */ ;
            if (var3_3) continue;
lbl66:
            // 2 sources

            var4_4 /* !! */  = e0.c(30634, 7462902273471847345L) / e0.c(1028, 4218500894331594966L) * e0.c(2158, 7631852619189838964L) + e0.c(14003, 5000229018743200348L) + e0.c(20558, 3889318201553796239L) - e0.c(3522, 8584798385576075616L);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean g(Object[] var1_1) {
        var2_2 = Dl.S();
        var3_3 /* !! */  = hi.a("G", (int)(e0.c(19058, 7365827933866272504L) * e0.c(7281, 2164492612630442089L) - e0.c(28919, 3520307657572654161L)), (int)e0.c(14679, 3610313420600792471L), (long)834203424483934088L) / e0.c(9815, 8968573715494980261L) - e0.c(517, 2325695516154031840L);
        if (var2_2) ** GOTO lbl15
        block10: while (true) {
            block15: {
                block14: {
                    block13: {
                        v0 /* !! */  = e0.l("0lh4gn97hVKftOGU", N(), (e0)this);
                        if (!var2_2) break block13;
                        if (v0 /* !! */  != false) break block14;
                        v0 /* !! */  = var3_3 /* !! */  = (reference)(e0.c(21930, 603132152174164412L) / 3 ^ e0.c(3992, 6593658567026500451L));
                    }
                    if (var2_2) break block15;
                }
                var3_3 /* !! */  = (reference)((e0.c(23768, 7682073494677729393L) / 2 ^ e0.c(12626, 4844201333686230417L)) + e0.c(3202, 1112542177351852079L) - e0.c(21246, 1788186919325253162L));
                if (!var2_2) ** GOTO lbl40
            }
            block11: while (true) {
                switch (var3_3 /* !! */ ) {
                    default: {
                        continue block10;
                    }
                    case 2073731226: {
                        v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669703100445001829L), (long)789438897355831922L)), (long)1000026253634408124L);
                        if (!var2_2) ** GOTO lbl41
                        if (v1 /* !! */  == false) ** GOTO lbl40
                        ** GOTO lbl42
                    }
                    case 2073731231: {
                        v2 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                        if (!var2_2) ** GOTO lbl45
                        if (v2 /* !! */  != false) ** GOTO lbl44
                        ** GOTO lbl46
                    }
                    case 2073731228: {
                        v3 = true;
                        var3_3 /* !! */  = (reference)((e0.c(19414, 1890972404085106465L) + e0.c(3917, 3773614858441221013L) - e0.c(32600, 6134274083927659338L) - e0.c(17085, 7765111971231936044L)) / e0.c(14957, 7107191987453875832L) ^ e0.c(19170, 294293457995671062L));
                        if (var2_2) ** GOTO lbl49
                        ** GOTO lbl48
                    }
                    case 2073731229: {
                        v3 = false;
                        if (!var2_2) {
                            return v3;
                        }
                        ** GOTO lbl48
                    }
lbl40:
                    // 2 sources

                    v1 /* !! */  = var3_3 /* !! */  = (reference)(e0.c(13849, 8883830634543340042L) / 3 ^ e0.c(8956, 6731474444200824442L));
lbl41:
                    // 2 sources

                    if (var2_2) continue block11;
lbl42:
                    // 2 sources

                    var3_3 /* !! */  = hi.a("G", (int)e0.c(28107, 2921601505221214492L), (int)e0.c(10803, 6861676335690335932L), (long)834203424483934088L) - e0.c(24554, 6900006428790305576L);
                    if (var2_2) continue block11;
lbl44:
                    // 2 sources

                    v2 /* !! */  = var3_3 /* !! */  = (reference)(e0.c(13849, 8883830634543340042L) / 3 ^ e0.c(8956, 6731474444200824442L));
lbl45:
                    // 2 sources

                    if (var2_2) continue block11;
lbl46:
                    // 2 sources

                    var3_3 /* !! */  = (reference)((e0.c(20889, 4506781659966455041L) ^ e0.c(11328, 5899850126329233627L) ^ e0.c(18889, 4487512121363080523L)) + e0.c(14586, 6729381953692980274L) + e0.c(8072, 920655990004216584L) - e0.c(30102, 8116146705110866303L));
                    continue block11;
lbl48:
                    // 2 sources

                    var3_3 /* !! */  = (reference)((e0.c(6338, 3994849270110516311L) + e0.c(15748, 8860151065430184340L) - e0.c(12594, 4841127481723215278L) - e0.c(2807, 8736521603611452942L)) / e0.c(31644, 9190720820582225776L) ^ e0.c(15007, 6345623975114954350L));
lbl49:
                    // 2 sources

                    switch (var3_3 /* !! */ ) {
                        case 1041711250: {
                            hi.a("G", (float)100.0f, (long)855506680013936433L);
                            hi.a("G", (long)633547218849443973L);
                            return v3;
                        }
                    }
                    return v3;
                    case 2073731227: 
                }
                break;
            }
            break;
        }
        return (boolean)hi.a("G", (int)0, (long)1024745345430233792L);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float s(Object[] objectArray) {
        boolean bl = Dl.S();
        reference var3_3 = hi.a("G", (int)e0.c(12682, 6169977527580024143L), (int)e0.c(4027, 4310031036263195442L), (long)834203424483934088L) / 4 * e0.c(23614, 5991264477319409794L) - e0.c(12373, 811739362967346336L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        Object object2 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1252821037877920419L);
                        if (!bl) break block9;
                        if (object2 == false) break block10;
                        object2 = object = hi.a("G", (int)(e0.c(25315, 7213117702818926153L) * e0.c(3517, 6211296202581369268L)), (int)e0.c(1035, 7828555000251050225L), (long)834203424483934088L) - e0.c(8538, 8865615480463379965L);
                    }
                    if (bl) break block8;
                }
                object = e0.c(10733, 5844028958744528230L) * e0.c(15897, 8959505460458050245L) + e0.c(24207, 5639080771537318446L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case -967612952: {
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1308678435871203692L);
                    return 1.0f;
                }
                case -967612951: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L), (float)1.0f, (long)439674605800943152L);
                    return (float)e0.l("0lh4gn97hVKftOGU", E(), (_E)((Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L)));
                }
                case -967612949: 
            }
            break;
        }
        throw null;
    }

    private void c(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (float)Float.NaN, (long)496337376469087251L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (float)0.0f, (long)1165334323158006666L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L), (Object)new Object[]{Float.valueOf(0.0f)}, (long)1175021915836649385L);
        e0.l("0lh4gn97hVKftOGU", x(boolean ), (_E)((Object)hi.a("\u00e9", (Object)this, (long)670969215451368354L)), (boolean)true);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void L(Object[] objectArray) {
        boolean bl = Dl.t();
        reference var3_3 = hi.a("G", (int)(e0.c(4087, 2945204234909344626L) / e0.c(23357, 8014508592762238915L)), (int)e0.c(17185, 3722183055424106432L), (long)834203424483934088L) - e0.c(7280, 1573030373770096847L) + e0.c(7787, 5777110860402782880L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && !bl) break block8;
                        Object object2 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1252821037877920419L);
                        if (bl) break block9;
                        if (object2 == false) break block10;
                        object2 = object = (Object)(e0.c(8245, 3957716321602063416L) * e0.c(32536, 7710485965230969854L) - e0.c(26313, 2871779198849911399L) ^ e0.c(28933, 2927620603302550930L));
                    }
                    if (!bl) break block8;
                }
                object = (hi.a("G", (int)hi.a("G", (int)e0.c(27823, 2628713008224534608L), (int)e0.c(22898, 708670338771400123L), (long)834203424483934088L), (int)e0.c(32610, 4241816967928615928L), (long)834203424483934088L) ^ e0.c(23325, 4929272615693531098L)) - e0.c(30580, 1222266154153941884L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case 745704889: {
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1308678435871203692L);
                    return;
                }
                case 745704892: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L), (float)0.85f, (long)1165334323158006666L);
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L), (Object)new Object[0], (long)737695432092583956L);
                    return;
                }
                case 745704891: 
            }
            break;
        }
        throw null;
    }

    public static /* bridge */ /* synthetic */ CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private void B(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L), (float)1.0f, (long)1165334323158006666L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L), (Object)new Object[]{Float.valueOf(1.0f)}, (long)1175021915836649385L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1087578771523936381L), (boolean)true, (long)808546903165099297L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFAC37) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 15;
                case 1 -> 114;
                case 2 -> 105;
                case 3 -> 42;
                case 4 -> 242;
                case 5 -> 212;
                case 6 -> 111;
                case 7 -> 73;
                case 8 -> 196;
                case 9 -> 85;
                case 10 -> 110;
                case 11 -> 59;
                case 12 -> 246;
                case 13 -> 156;
                case 14 -> 18;
                case 15 -> 104;
                case 16 -> 22;
                case 17 -> 227;
                case 18 -> 221;
                case 19 -> 200;
                case 20 -> 192;
                case 21 -> 127;
                case 22 -> 81;
                case 23 -> 61;
                case 24 -> 9;
                case 25 -> 89;
                case 26 -> 80;
                case 27 -> 139;
                case 28 -> 203;
                case 29 -> 46;
                case 30 -> 199;
                case 31 -> 229;
                case 32 -> 231;
                case 33 -> 121;
                case 34 -> 224;
                case 35 -> 25;
                case 36 -> 247;
                case 37 -> 168;
                case 38 -> 8;
                case 39 -> 101;
                case 40 -> 56;
                case 41 -> 2;
                case 42 -> 21;
                case 43 -> 187;
                case 44 -> 97;
                case 45 -> 208;
                case 46 -> 160;
                case 47 -> 201;
                case 48 -> 92;
                case 49 -> 40;
                case 50 -> 183;
                case 51 -> 165;
                case 52 -> 126;
                case 53 -> 13;
                case 54 -> 171;
                case 55 -> 84;
                case 56 -> 245;
                case 57 -> 70;
                case 58 -> 243;
                case 59 -> 209;
                case 60 -> 3;
                case 61 -> 117;
                case 62 -> 27;
                case 63 -> 115;
                case 64 -> 128;
                case 65 -> 16;
                case 66 -> 248;
                case 67 -> 48;
                case 68 -> 74;
                case 69 -> 161;
                case 70 -> 94;
                case 71 -> 66;
                case 72 -> 44;
                case 73 -> 154;
                case 74 -> 167;
                case 75 -> 198;
                case 76 -> 51;
                case 77 -> 62;
                case 78 -> 34;
                case 79 -> 158;
                case 80 -> 20;
                case 81 -> 253;
                case 82 -> 185;
                case 83 -> 182;
                case 84 -> 250;
                case 85 -> 83;
                case 86 -> 38;
                case 87 -> 207;
                case 88 -> 162;
                case 89 -> 210;
                case 90 -> 178;
                case 91 -> 159;
                case 92 -> 63;
                case 93 -> 57;
                case 94 -> 215;
                case 95 -> 164;
                case 96 -> 152;
                case 97 -> 120;
                case 98 -> 129;
                case 99 -> 235;
                case 100 -> 219;
                case 101 -> 189;
                case 102 -> 133;
                case 103 -> 87;
                case 104 -> 100;
                case 105 -> 255;
                case 106 -> 47;
                case 107 -> 176;
                case 108 -> 50;
                case 109 -> 68;
                case 110 -> 0;
                case 111 -> 150;
                case 112 -> 214;
                case 113 -> 109;
                case 114 -> 249;
                case 115 -> 7;
                case 116 -> 131;
                case 117 -> 31;
                case 118 -> 99;
                case 119 -> 179;
                case 120 -> 118;
                case 121 -> 65;
                case 122 -> 19;
                case 123 -> 151;
                case 124 -> 125;
                case 125 -> 6;
                case 126 -> 230;
                case 127 -> 194;
                case 128 -> 33;
                case 129 -> 122;
                case 130 -> 32;
                case 131 -> 213;
                case 132 -> 10;
                case 133 -> 60;
                case 134 -> 169;
                case 135 -> 26;
                case 136 -> 103;
                case 137 -> 12;
                case 138 -> 144;
                case 139 -> 240;
                case 140 -> 91;
                case 141 -> 146;
                case 142 -> 140;
                case 143 -> 197;
                case 144 -> 76;
                case 145 -> 28;
                case 146 -> 244;
                case 147 -> 107;
                case 148 -> 41;
                case 149 -> 236;
                case 150 -> 113;
                case 151 -> 14;
                case 152 -> 220;
                case 153 -> 5;
                case 154 -> 45;
                case 155 -> 88;
                case 156 -> 222;
                case 157 -> 141;
                case 158 -> 239;
                case 159 -> 233;
                case 160 -> 35;
                case 161 -> 67;
                case 162 -> 71;
                case 163 -> 96;
                case 164 -> 190;
                case 165 -> 191;
                case 166 -> 206;
                case 167 -> 252;
                case 168 -> 55;
                case 169 -> 254;
                case 170 -> 241;
                case 171 -> 142;
                case 172 -> 186;
                case 173 -> 136;
                case 174 -> 174;
                case 175 -> 54;
                case 176 -> 23;
                case 177 -> 138;
                case 178 -> 211;
                case 179 -> 124;
                case 180 -> 228;
                case 181 -> 163;
                case 182 -> 72;
                case 183 -> 64;
                case 184 -> 106;
                case 185 -> 30;
                case 186 -> 37;
                case 187 -> 102;
                case 188 -> 58;
                case 189 -> 175;
                case 190 -> 78;
                case 191 -> 143;
                case 192 -> 172;
                case 193 -> 193;
                case 194 -> 4;
                case 195 -> 216;
                case 196 -> 173;
                case 197 -> 112;
                case 198 -> 226;
                case 199 -> 217;
                case 200 -> 69;
                case 201 -> 53;
                case 202 -> 238;
                case 203 -> 204;
                case 204 -> 251;
                case 205 -> 11;
                case 206 -> 82;
                case 207 -> 90;
                case 208 -> 137;
                case 209 -> 149;
                case 210 -> 223;
                case 211 -> 119;
                case 212 -> 181;
                case 213 -> 218;
                case 214 -> 123;
                case 215 -> 184;
                case 216 -> 166;
                case 217 -> 52;
                case 218 -> 234;
                case 219 -> 43;
                case 220 -> 93;
                case 221 -> 75;
                case 222 -> 177;
                case 223 -> 202;
                case 224 -> 79;
                case 225 -> 188;
                case 226 -> 232;
                case 227 -> 36;
                case 228 -> 147;
                case 229 -> 148;
                case 230 -> 155;
                case 231 -> 95;
                case 232 -> 157;
                case 233 -> 145;
                case 234 -> 29;
                case 235 -> 153;
                case 236 -> 39;
                case 237 -> 205;
                case 238 -> 130;
                case 239 -> 24;
                case 240 -> 135;
                case 241 -> 170;
                case 242 -> 132;
                case 243 -> 17;
                case 244 -> 86;
                case 245 -> 49;
                case 246 -> 195;
                case 247 -> 116;
                case 248 -> 180;
                case 249 -> 98;
                case 250 -> 1;
                case 251 -> 108;
                case 252 -> 237;
                case 253 -> 134;
                case 254 -> 77;
                default -> 225;
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
            e0.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C9B;
        if (e[n2] == null) {
            e0.e[n2] = (int)(c[n2] ^ l);
        }
        return e[n2];
    }

    private static long d(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x52AE) & Short.MAX_VALUE;
        if (e0.l[n2] == null) {
            e0.l[n2] = k[n2] ^ l;
        }
        return e0.l[n2];
    }
}
