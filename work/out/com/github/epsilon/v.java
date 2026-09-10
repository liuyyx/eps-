/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.XG;
import com.github.epsilon.dN;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.uy;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.yi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class v
extends e {
    private long a;
    private boolean x;
    private final Dx<uy> t = hi.a("\u00a5", (Object)this, (Object)v.b(-4380, -28208), (Object)hi.a("j", (long)723586900574557739L), (long)426795652261052192L);
    public static final v B;
    private final XG H;
    private final XG k = hi.a("\u00a5", (Object)this, (Object)v.b(-4377, -5586), (int)v.c(20154, 8669097423515200266L), (int)0, (int)v.c(14661, 3059837770372275411L), (int)1, (long)1094453040828645510L);
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "\u008cFZ.U\u0095\u008d+\u00d6\u0005\u00ac'\u00cd\u0005#";
                        var12_3 = "\u008cFZ.U\u0095\u008d+\u00d6\u0005\u00ac'\u00cd\u0005#".length();
                        var9_4 = 9;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 81;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "o\u00e0\u00a0\u0087\u000f;(\u00e3\u00c7G\u00da\u00c0\u000e&\u00ccQ\u00c3\u0086j\u00e9";
                            var12_3 = "o\u00e0\u00a0\u0087\u000f;(\u00e3\u00c7G\u00da\u00c0\u000e&\u00ccQ\u00c3\u0086j\u00e9".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 43;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
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
                                    v15 = 20;
                                    break;
                                }
                                case 1: {
                                    v15 = 122;
                                    break;
                                }
                                case 2: {
                                    v15 = 1;
                                    break;
                                }
                                case 3: {
                                    v15 = 125;
                                    break;
                                }
                                case 4: {
                                    v15 = 89;
                                    break;
                                }
                                case 5: {
                                    v15 = 42;
                                    break;
                                }
                                default: {
                                    v15 = 58;
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
                v.b = var13;
                v.c = new String[4];
                var0_7 = 741322318029842195L;
                var6_8 = new long[59];
                var3_9 = 0;
                var4_10 = "D\u00e8*a-\u00bf\u00dd \u00ffJU\u007f\u008c\\\u007f\u00fb\u00b2\ry\u00ba\u00c6\u00fcqq\fY\u00a4[\u00db\b\u00e1%\u0085^\t\u00a5\u00b8\u0084\u0097\u00c6O\u00e8\u00c9K\u00d9JF\f\u00f6\u00dc:\u00c2\u00a6Ry\u00b3\u00b7\u0084\u00c9\u0006\u0092\u000e\u0010\u00f6od1\u00b0\u00bc\u0001\u00be\u00c9\u00d9\u0086\u0013\u00ee\u0007%\u00f1\u0092\u0099\u009cr\u00834\u00e8lu\t\u000f\u0013Q\u00d9[1\u00ad\u00b8\u000e`\u00d7u\u00dcL+L\u00b24\u00ed(cmg\u00cb\\k6\u001e\u0005\u00a8\u00af\u0096,\u00a9\u009a\u009f\u00f6R!8\u00b1\u00fbk\u00e2\u0087`p\u0091o\u009c\u00eaHjD\u00c6ZN\u00e5\u0011\\\u00f1~\u00e7\u00adOX+\u0098\u0099\u0018\u0005\u00a2\u00ec\u0004\u0084\u0000\u008d\u0090\u00921H\u00c8\u00bf0P`{\u00e9k \u00a3\u0091\u00f5\u00fe\u00c6\u00d0\u00be&\u00a0\u009a\"_!P{\u0016\u0002J\u00b4\u00a1\u009f\u00b9F\u00bd\u009a\u0086\u0014\u0087\u00a6h\u0006\u001d\u00bc\u00cdM\u001f]\u008a\u0016\u00e1\u00d7{\u0018\u00ectR\u00bc\u00c0ow\u001a_\u00f1j\u00d7\u00fbWr\u00fc\u00d1\u00b1\u00ba\rN\u00d6\u00101\u00e0\u00de\u00b8\u0085\u00d9\u00acK`*\u00d2\u00fa\u00e2\u0098\u00d9\u00a9\u008dx\u00f5\u00e1c\u00a6bU|\u00d371 \u00a0\u00cb&\u00d8-!\u0091\\Y\u0005\u00e6\u00b0\u0005\u00de\u0010\u00eb|\u00a4\u00cd\u00c6\u00daV\u0092pC*_\u00d4\u001e]\u001fI<a\u009c\u00a8\u008e\u0003\u00ca&\u00eea\u0082\u0018\b\u00cbBo\u0096Q\u00fc:f\n=\u00b7\u00d2b\u00e4\u00d8[\b\u00f8?\u00a1\u0096\u00fb`:419\u009f\u0084D\u009fW0\u00f7\u00d6\nD\u00ae\u00a3\u00f8\u00b1\u001d\u00c5?\u00c5)\u00ff\u00ac\u00f2\u00db\u00b3^\f\b\u00b9\u00ea\u00d1\u009aL\u00b9\u0087\u00a6\u009c\u00ac\u00bbI\u009c$@N!n\u00fcil\u00e2-\u00d2\u00d8\u001f[\u00c20\u0095J\u0096\u001bG\u00ff\u0081\u0094l\u00e0\u00fc\u00c0\u0017\u00e7\u00cb\u00a3\u00d4\u00de\u00cd\u00db\u00e3\u00d5\u0001M6\u00aa\u00ed;\u0011\u00bd\u001c\u009e\u00bcCtw\u00c8\u009c\u008be\u0001\u00d19\u009d\u008e7v\u00e5i\"N\u00c7\u0091\r";
                var5_11 = "D\u00e8*a-\u00bf\u00dd \u00ffJU\u007f\u008c\\\u007f\u00fb\u00b2\ry\u00ba\u00c6\u00fcqq\fY\u00a4[\u00db\b\u00e1%\u0085^\t\u00a5\u00b8\u0084\u0097\u00c6O\u00e8\u00c9K\u00d9JF\f\u00f6\u00dc:\u00c2\u00a6Ry\u00b3\u00b7\u0084\u00c9\u0006\u0092\u000e\u0010\u00f6od1\u00b0\u00bc\u0001\u00be\u00c9\u00d9\u0086\u0013\u00ee\u0007%\u00f1\u0092\u0099\u009cr\u00834\u00e8lu\t\u000f\u0013Q\u00d9[1\u00ad\u00b8\u000e`\u00d7u\u00dcL+L\u00b24\u00ed(cmg\u00cb\\k6\u001e\u0005\u00a8\u00af\u0096,\u00a9\u009a\u009f\u00f6R!8\u00b1\u00fbk\u00e2\u0087`p\u0091o\u009c\u00eaHjD\u00c6ZN\u00e5\u0011\\\u00f1~\u00e7\u00adOX+\u0098\u0099\u0018\u0005\u00a2\u00ec\u0004\u0084\u0000\u008d\u0090\u00921H\u00c8\u00bf0P`{\u00e9k \u00a3\u0091\u00f5\u00fe\u00c6\u00d0\u00be&\u00a0\u009a\"_!P{\u0016\u0002J\u00b4\u00a1\u009f\u00b9F\u00bd\u009a\u0086\u0014\u0087\u00a6h\u0006\u001d\u00bc\u00cdM\u001f]\u008a\u0016\u00e1\u00d7{\u0018\u00ectR\u00bc\u00c0ow\u001a_\u00f1j\u00d7\u00fbWr\u00fc\u00d1\u00b1\u00ba\rN\u00d6\u00101\u00e0\u00de\u00b8\u0085\u00d9\u00acK`*\u00d2\u00fa\u00e2\u0098\u00d9\u00a9\u008dx\u00f5\u00e1c\u00a6bU|\u00d371 \u00a0\u00cb&\u00d8-!\u0091\\Y\u0005\u00e6\u00b0\u0005\u00de\u0010\u00eb|\u00a4\u00cd\u00c6\u00daV\u0092pC*_\u00d4\u001e]\u001fI<a\u009c\u00a8\u008e\u0003\u00ca&\u00eea\u0082\u0018\b\u00cbBo\u0096Q\u00fc:f\n=\u00b7\u00d2b\u00e4\u00d8[\b\u00f8?\u00a1\u0096\u00fb`:419\u009f\u0084D\u009fW0\u00f7\u00d6\nD\u00ae\u00a3\u00f8\u00b1\u001d\u00c5?\u00c5)\u00ff\u00ac\u00f2\u00db\u00b3^\f\b\u00b9\u00ea\u00d1\u009aL\u00b9\u0087\u00a6\u009c\u00ac\u00bbI\u009c$@N!n\u00fcil\u00e2-\u00d2\u00d8\u001f[\u00c20\u0095J\u0096\u001bG\u00ff\u0081\u0094l\u00e0\u00fc\u00c0\u0017\u00e7\u00cb\u00a3\u00d4\u00de\u00cd\u00db\u00e3\u00d5\u0001M6\u00aa\u00ed;\u0011\u00bd\u001c\u009e\u00bcCtw\u00c8\u009c\u008be\u0001\u00d19\u009d\u008e7v\u00e5i\"N\u00c7\u0091\r".length();
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
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "pq\u00a3{\u0019\u00df\u00ca\u000bi\u0082|)\u00aa\u0082.\u0000";
                    var5_11 = "pq\u00a3{\u0019\u00df\u00ca\u000bi\u0082|)\u00aa\u0082.\u0000".length();
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
lbl125:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        v.d = var6_8;
        v.e = new Integer[59];
        v.B = new v();
    }

    public static /* bridge */ /* synthetic */ CallSite U(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private v() {
        super(v.b(-4379, 13953), (vY)((Object)hi.a("j", (long)1119278030115886606L)));
        this.H = hi.a("\u00a5", (Object)this, (Object)v.b(-4378, -2465), (int)v.c(13056, 781465063317296823L), (int)0, (int)v.c(17768, 3181902271321972966L), (int)1, (long)1094453040828645510L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    private void t(dN var1_1) {
        block19: {
            block18: {
                block16: {
                    block17: {
                        block15: {
                            block13: {
                                block14: {
                                    var2_2 = Dl.t();
                                    var3_3 /* !! */  = v.U("4cTSopLIJytaZiTq", max(int int ), (int)v.c(3234, 5499640818379778328L), (int)v.c(1132, 8255094903506493951L)) * v.c(15550, 8335257721352345915L) ^ v.c(24642, 3777928597936539081L);
                                    if (var2_2) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            cfr_temp_0 = hi.a("G", (long)658960450018995719L) - hi.a("\u00e9", (Object)this, (long)492058234354535248L) - (long)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)523198088199081367L), (long)789438897355831922L)), (long)1260538186742955956L);
                                            v0 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                            if (var2_2) break block13;
                                            if (v0 /* !! */  < 0) break block14;
                                            break block15;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            v1 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)421196756403279538L);
                                            v2 /* !! */  = hi.a("\u00a5", (Object)((Integer)v.U("4cTSopLIJytaZiTq", z(), (XG)hi.a("\u00e9", (Object)this, (long)896314946143138892L))), (long)1260538186742955956L);
                                            if (var2_2) break block16;
                                            if (v1 > v2 /* !! */ ) break block17;
                                            break block18;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            hi.a("\u00f2", (Object)this, (boolean)true, (long)717858819370251053L);
                                            hi.a("\u00f2", (Object)this, (long)v.U("4cTSopLIJytaZiTq", currentTimeMillis()), (long)492058234354535248L);
                                            if (var2_2) lbl-1000:
                                            // 2 sources

                                            {
                                                return;
                                            }
                                            break block19;
                                            break;
                                        }
                                    }
lbl23:
                                    // 7 sources

                                    while (true) {
                                        switch (var3_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case 611308227: {
                                                ** continue;
                                            }
                                            case 611308226: {
                                                ** continue;
                                            }
                                            case 611308228: {
                                                ** continue;
                                            }
                                            case 611308225: 
                                        }
                                        hi.a("G", (long)513075350433525267L);
                                        v.U("4cTSopLIJytaZiTq", U());
                                        return;
                                    }
                                }
                                v0 /* !! */  = (reference)(hi.a("G", (int)(v.c(28295, 5366841510028741415L) - v.c(14141, 3514262961233023673L) ^ v.c(9780, 460620399262188431L)), (int)v.c(13678, 5117433273041342706L), (long)834203424483934088L) / v.c(18024, 5747760501976638405L) ^ v.c(26044, 4278360785785618435L));
                            }
                            var3_3 /* !! */  = (int)v0 /* !! */ ;
                            if (!var2_2) ** GOTO lbl23
                        }
                        var3_3 /* !! */  = v.c(2544, 4419513725616352334L) * v.c(10982, 3550842373454581611L) / v.c(9006, 7434683253334230666L) + v.c(25565, 8936350789726537324L);
                        if (!var2_2) ** GOTO lbl23
                    }
                    v1 = hi.a("G", (int)(v.c(23445, 8791141471797788167L) - v.c(24577, 7571894296238261688L) ^ v.c(23226, 8982347425812594444L)), (int)v.c(17310, 1766795634955855364L), (long)834203424483934088L) / v.c(25757, 8562231707364131081L);
                    v2 /* !! */  = (CallSite)v.c(31306, 49674035948920800L);
                }
                var3_3 /* !! */  = v1 ^ v2 /* !! */ ;
                if (!var2_2) ** GOTO lbl23
            }
            var3_3 /* !! */  = v.c(3496, 3845510303601387575L) * v.c(20888, 868711497128096768L) + v.c(329, 5842900309288314081L);
            if (!var2_2) ** GOTO lbl23
        }
        var3_3 /* !! */  = hi.a("G", (int)(v.c(23445, 8791141471797788167L) - v.c(24577, 7571894296238261688L) ^ v.c(23226, 8982347425812594444L)), (int)v.c(17310, 1766795634955855364L), (long)834203424483934088L) / v.c(25757, 8562231707364131081L) ^ v.c(31306, 49674035948920800L);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @yE
    private void v(yi var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFEEE6) & 0xFFFF;
        if (c[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 124;
                case 1 -> 194;
                case 2 -> 176;
                case 3 -> 186;
                case 4 -> 42;
                case 5 -> 125;
                case 6 -> 115;
                case 7 -> 2;
                case 8 -> 233;
                case 9 -> 232;
                case 10 -> 18;
                case 11 -> 240;
                case 12 -> 161;
                case 13 -> 96;
                case 14 -> 254;
                case 15 -> 195;
                case 16 -> 10;
                case 17 -> 154;
                case 18 -> 89;
                case 19 -> 21;
                case 20 -> 53;
                case 21 -> 17;
                case 22 -> 30;
                case 23 -> 241;
                case 24 -> 92;
                case 25 -> 65;
                case 26 -> 67;
                case 27 -> 94;
                case 28 -> 82;
                case 29 -> 218;
                case 30 -> 234;
                case 31 -> 46;
                case 32 -> 95;
                case 33 -> 247;
                case 34 -> 188;
                case 35 -> 162;
                case 36 -> 224;
                case 37 -> 114;
                case 38 -> 73;
                case 39 -> 15;
                case 40 -> 208;
                case 41 -> 193;
                case 42 -> 187;
                case 43 -> 198;
                case 44 -> 98;
                case 45 -> 36;
                case 46 -> 1;
                case 47 -> 106;
                case 48 -> 228;
                case 49 -> 192;
                case 50 -> 126;
                case 51 -> 214;
                case 52 -> 76;
                case 53 -> 50;
                case 54 -> 175;
                case 55 -> 167;
                case 56 -> 27;
                case 57 -> 152;
                case 58 -> 103;
                case 59 -> 253;
                case 60 -> 216;
                case 61 -> 204;
                case 62 -> 165;
                case 63 -> 171;
                case 64 -> 7;
                case 65 -> 143;
                case 66 -> 12;
                case 67 -> 40;
                case 68 -> 210;
                case 69 -> 55;
                case 70 -> 148;
                case 71 -> 223;
                case 72 -> 123;
                case 73 -> 168;
                case 74 -> 202;
                case 75 -> 20;
                case 76 -> 121;
                case 77 -> 64;
                case 78 -> 207;
                case 79 -> 151;
                case 80 -> 179;
                case 81 -> 56;
                case 82 -> 63;
                case 83 -> 251;
                case 84 -> 249;
                case 85 -> 86;
                case 86 -> 209;
                case 87 -> 108;
                case 88 -> 69;
                case 89 -> 181;
                case 90 -> 252;
                case 91 -> 229;
                case 92 -> 134;
                case 93 -> 113;
                case 94 -> 19;
                case 95 -> 243;
                case 96 -> 88;
                case 97 -> 39;
                case 98 -> 66;
                case 99 -> 105;
                case 100 -> 51;
                case 101 -> 101;
                case 102 -> 38;
                case 103 -> 230;
                case 104 -> 122;
                case 105 -> 81;
                case 106 -> 219;
                case 107 -> 246;
                case 108 -> 191;
                case 109 -> 200;
                case 110 -> 242;
                case 111 -> 6;
                case 112 -> 24;
                case 113 -> 26;
                case 114 -> 11;
                case 115 -> 41;
                case 116 -> 149;
                case 117 -> 140;
                case 118 -> 107;
                case 119 -> 14;
                case 120 -> 84;
                case 121 -> 52;
                case 122 -> 93;
                case 123 -> 75;
                case 124 -> 196;
                case 125 -> 177;
                case 126 -> 245;
                case 127 -> 54;
                case 128 -> 231;
                case 129 -> 71;
                case 130 -> 8;
                case 131 -> 37;
                case 132 -> 153;
                case 133 -> 172;
                case 134 -> 45;
                case 135 -> 80;
                case 136 -> 110;
                case 137 -> 91;
                case 138 -> 144;
                case 139 -> 174;
                case 140 -> 160;
                case 141 -> 28;
                case 142 -> 13;
                case 143 -> 150;
                case 144 -> 201;
                case 145 -> 131;
                case 146 -> 182;
                case 147 -> 220;
                case 148 -> 16;
                case 149 -> 120;
                case 150 -> 237;
                case 151 -> 47;
                case 152 -> 77;
                case 153 -> 178;
                case 154 -> 0;
                case 155 -> 58;
                case 156 -> 206;
                case 157 -> 119;
                case 158 -> 170;
                case 159 -> 35;
                case 160 -> 104;
                case 161 -> 255;
                case 162 -> 199;
                case 163 -> 138;
                case 164 -> 157;
                case 165 -> 74;
                case 166 -> 197;
                case 167 -> 185;
                case 168 -> 62;
                case 169 -> 155;
                case 170 -> 183;
                case 171 -> 163;
                case 172 -> 221;
                case 173 -> 57;
                case 174 -> 43;
                case 175 -> 169;
                case 176 -> 132;
                case 177 -> 227;
                case 178 -> 79;
                case 179 -> 102;
                case 180 -> 116;
                case 181 -> 135;
                case 182 -> 70;
                case 183 -> 5;
                case 184 -> 141;
                case 185 -> 34;
                case 186 -> 117;
                case 187 -> 72;
                case 188 -> 235;
                case 189 -> 48;
                case 190 -> 112;
                case 191 -> 59;
                case 192 -> 3;
                case 193 -> 248;
                case 194 -> 203;
                case 195 -> 164;
                case 196 -> 184;
                case 197 -> 61;
                case 198 -> 90;
                case 199 -> 9;
                case 200 -> 136;
                case 201 -> 222;
                case 202 -> 145;
                case 203 -> 250;
                case 204 -> 118;
                case 205 -> 97;
                case 206 -> 238;
                case 207 -> 68;
                case 208 -> 180;
                case 209 -> 173;
                case 210 -> 239;
                case 211 -> 29;
                case 212 -> 111;
                case 213 -> 236;
                case 214 -> 147;
                case 215 -> 133;
                case 216 -> 44;
                case 217 -> 130;
                case 218 -> 100;
                case 219 -> 142;
                case 220 -> 127;
                case 221 -> 31;
                case 222 -> 205;
                case 223 -> 213;
                case 224 -> 60;
                case 225 -> 99;
                case 226 -> 49;
                case 227 -> 128;
                case 228 -> 166;
                case 229 -> 137;
                case 230 -> 33;
                case 231 -> 139;
                case 232 -> 32;
                case 233 -> 129;
                case 234 -> 146;
                case 235 -> 83;
                case 236 -> 225;
                case 237 -> 109;
                case 238 -> 244;
                case 239 -> 4;
                case 240 -> 22;
                case 241 -> 215;
                case 242 -> 87;
                case 243 -> 190;
                case 244 -> 85;
                case 245 -> 217;
                case 246 -> 25;
                case 247 -> 226;
                case 248 -> 78;
                case 249 -> 156;
                case 250 -> 158;
                case 251 -> 189;
                case 252 -> 159;
                case 253 -> 211;
                case 254 -> 23;
                default -> 212;
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
            v.c[n3] = new String(cArray).intern();
        }
        return c[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x65BC;
        if (e[n2] == null) {
            v.e[n2] = (int)(d[n2] ^ l);
        }
        return e[n2];
    }
}
