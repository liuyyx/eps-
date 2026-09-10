/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.hi;
import com.github.epsilon.z0;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;

public class ze
extends z0<DM, Double> {
    private static final DecimalFormat y;
    private static final String[] a;
    private static final String[] c;
    private static final long[] h;
    private static final Integer[] i;

    protected Double V(Object[] objectArray) {
        return hi.a("G", (double)hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)1228493945977170503L), (long)1323649220833053453L);
    }

    @Override
    protected void D(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        reference var3_3 = ze.i("pNBgqC1KLYOn7gut", p(), (DM)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L)))) - hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)1228493945977170503L);
        CallSite callSite = hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)1150404598993256043L);
        reference var7_5 = hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)1228493945977170503L) + (double)ze.i("pNBgqC1KLYOn7gut", round(double ), (double)((double)f * var3_3 / callSite)) * callSite;
        hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("G", (double)hi.a("G", (double)var7_5, (double)hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)1228493945977170503L), (double)hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)448940460375041867L), (long)569387319293504539L), (long)1323649220833053453L)}, (long)597522462984691898L);
    }

    @Override
    protected String c(Object[] objectArray) {
        return hi.a("\u00a5", (Object)hi.a("j", (long)427783330483124024L), (Object)hi.a("\u00a5", (Object)this, (long)506958556113200645L), (long)436734169222020859L);
    }

    private static boolean lambda$new$0(String string) {
        return (boolean)hi.a("\u00a5", string, (Object)ze.a(-19012, -2707), (long)982124516597137659L);
    }

    @Override
    protected float o(Object[] objectArray) {
        return (float)((hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)this, (long)506958556113200645L))), (long)637262500311742568L) - hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)1228493945977170503L)) / (hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)448940460375041867L) - hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)1228493945977170503L)));
    }

    public ze(DM dM) {
        super(dM, ze.c(21386, 402479838480951079L), ze::lambda$new$0);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void D() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
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

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00a0B%\u00b0p\b!\u008ca`\u0085\u0089\u00a8\u00ec";
                    var12_3 = "\u00a0B%\u00b0p\b!\u008ca`\u0085\u0089\u00a8\u00ec".length();
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
                    v4 = 48;
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
                                    v11 = 98;
                                    break;
                                }
                                case 1: {
                                    v11 = 60;
                                    break;
                                }
                                case 2: {
                                    v11 = 34;
                                    break;
                                }
                                case 3: {
                                    v11 = 79;
                                    break;
                                }
                                case 4: {
                                    v11 = 125;
                                    break;
                                }
                                case 5: {
                                    v11 = 24;
                                    break;
                                }
                                default: {
                                    v11 = 71;
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
                ze.a = var13;
                ze.c = new String[2];
                var0_7 = 9221291501002360145L;
                var6_8 = new long[99];
                var3_9 = 0;
                var4_10 = "\u00e5\u00d2\u0087\u008fh\u0084\u0007\u00fa\u00dd/j\u000eq?\u0093\u00de2\u0012\u00ee]\u00f5\u00b6\u00a6\u00cd\u00c8\u00db\u00cc\u00966\u008c. \f\u001fN\u00d2\u00bd\u00f1/\u00b4D\u00a6\u00c6\u009d\u009b\u00ed5#\u00a9rK\u00f7\u00dc+}\u00c3K\u00ea\u00c4\u00e5\u00d5\u00f8\u0015v\u0094Q\t\u00bfw\u00ecn\u0091\u001a\u0089\u00d07\u00da&\u00dbW\b\t\u0084X\u00f4n\u00c2\u0091\u00c6n\u00ab\u009c\u00d2k\u0010^\u009d<\u00955\u008a\u00be\u0002\u008f\u00e7F;F\u0088\u00af\u00eehr\u00fa&\u00b3\u008b\u00aa\u00c3\u0099\u00d9a\u00c2*\u00b2\u00f9\u0002\u0093\u00d7\u00a8\u0018\u009a\u00f9\u00b3\u00a9\u00da\u00f2n+\u00e5 \u0002\u0083\u009ar\u0000\u00d3\u00d7\u00b2F \u00eb\u00bc\u00f7\u00c5\u00f4c&l\u0085\u00c2&R\u00ae\u00fdj\u00e4\u001f\u00ac\u00e7\u00bc\u00ba\u00e0J\u00dd\u00b1\u00bbm\u0083\u00ae \u00a3\u00821\u001e\u00ea9\u000f\u00a4HN\u00e4n\u00f2\u00a3\u00b6PG\u00bch\u0011n6\u00bb\u00e9;\u00ef\u00f5\u000b\u0019\u00d0\u00f2.\u00bd\u00cd\u0001\u00a6\u00a5\u00ba\u008cV\u00e3\u0000g\u009b\u00b7\u00c0\u009f\u00cebS\u008c\r\u001a\u00afI\u0095\u00ef6I\u00a2\u00d4\u0018owE\u0090\u00d3\u00f6H.\u00e9\u00af\u001d\u0005\u00a1f~V)\u00d3\u00c7m\u00a7\u00a7\u00ff\u000e%\u00e2\u00b6\u00bbsAd8\u0010:\u00d3\u00b8\u0084S\u00029.\u00f0M\u0011\u00d0\u0091\u00c3E\u0010v}\u00a8\u00d7l\u0004T\u00b5jO\u00cd\u00a4\u0096\u001f\u00ab\u0012\u0005X7\u00a2\u007f\u00b6;\u00e7U(\u00a4#\u0019\u0019d\u0087\u00e4\u00f6\u00ef\u00e63\u0015\u00c4\u00fcz\u00e8\u00fe\u00b8>\u00d3\u0002\u00c1\u0007\u001ao2\u00a8\u0099\u00be\u001e0\u001f\u00ca\t\u00f6*\u0010g\u0085KS]\u00d4:\u00aezX*Y\u00bb\u00eer\u00ce\u0002\u00c1T\u000fB1\u0007\u0017\u009ea7p\u0093](id\u0003\n\u00d3\u008e\u0087Z0\u00aaI\u00ef\u0002\u00d94\u00c0\u008a\u0084\u00fb\u00e9\u00e7\u009b4\u00b3\u001csF\u008b \u00a1G\u00ae\u00a2^\u0003[\u0088\u00d5GE#t\u0083\u009a\u00b4\u00fc\u00ab\u00da\u0090\u001f\u00b7\u009c\u00be\u0005j\u00ef\u00e5#\u00cf\u00cb]\u00bc\u00e6\u00c9\u00e4C\u0092\u00b2\u0017q/\u00ccy\u00f2\u001b\u00f2W\u00de\u00e8<\u00e0[\u00f2\u0010\nd\u0093Q\u00d5\u0094\u00e3\u00df\u001f\u00f2\u00c2\u00e2V\u00b8Q\u00fe\u009c\t\u00e5\u009d8\u00a5\u00a6z\u00e2f\u00beq`\u00ee\u00105\u0000\u0019\u00e1\u00e0\\(\u0011C\u00ec\u00b9[\u0014\u00bc\u00a8\u00af\u00f0\u00cf\\\u00b6\u00c0\u0083\u00f9\u000eG\u0089\u0083\u00d6#\u00b2\u00bd0h0]\u0014\u00ba\u00ff\u0012P\u00eb\u0096\u0016?~Y\u0088\u0001\u00a6\u00dc\u009f\u00f9D\u00e7\u00f09\u0013\u00e8\u00c1d\u008ce\u00a4\u00a4\u00f0\u00e64\u00b8Z=\u00be\u00bf\u00cb\u001cB\u009bC0>F\u009fp\u00ee,\u00197,\u00b1\u00a2\u0096\u00955\u0004\u00a1Y3\u00d0\u00c2\u0014\u00af\u00e5t\u0095\u0084\u00bb\u00f4\u00c5Q\bwI\u008d\u0003\u00cc\u008a\tv\u00a52\u00f5i=\u001b\u00d0\u0003\u00a1\u00d0^!3\u00efY$\u0005\u00944V\u00b9\"\u00f2\u00fc^0|CR\u00f5\u0087_\u00d3\u00fc\u00de\u00ad\u008fbP\u008d\u00b9\u00f1~\u000e\u00fdE>\r\u00d3\u00d2\u00bc\u007f6\u00a6\u0089\nl\u00af\u00c9.v\u00cev\u00c9)\u00d0Pw\u00a9\u00af\u00batW\u001e\u008d\u0091\u00f43,\u0098h\u00e6\u0012\u00aa\u00893\u00edQ\u0001\u00888\u009b\r\u00ffX0i\u00c7\u00dd\u009e\u009a\u0093\u0093\u00cb\u00bck\u00e2\u009b\u00ab\u00a1\u0089lT\u00e0\u00d3Z\u00d0p\u00f6\u00e7\u00cc\u001fL\u009e\u0016\u0018\u0003\u00ceL\u00f6\u0094\u00e8\u00fe\u00ea\u0086\nb\u00d4\u00a6S\u00ab\u00e5\u00a8ID\u0086\u00a4\u00c85\u00a5oB=\u000b2\u00e5\u0003h";
                var5_11 = "\u00e5\u00d2\u0087\u008fh\u0084\u0007\u00fa\u00dd/j\u000eq?\u0093\u00de2\u0012\u00ee]\u00f5\u00b6\u00a6\u00cd\u00c8\u00db\u00cc\u00966\u008c. \f\u001fN\u00d2\u00bd\u00f1/\u00b4D\u00a6\u00c6\u009d\u009b\u00ed5#\u00a9rK\u00f7\u00dc+}\u00c3K\u00ea\u00c4\u00e5\u00d5\u00f8\u0015v\u0094Q\t\u00bfw\u00ecn\u0091\u001a\u0089\u00d07\u00da&\u00dbW\b\t\u0084X\u00f4n\u00c2\u0091\u00c6n\u00ab\u009c\u00d2k\u0010^\u009d<\u00955\u008a\u00be\u0002\u008f\u00e7F;F\u0088\u00af\u00eehr\u00fa&\u00b3\u008b\u00aa\u00c3\u0099\u00d9a\u00c2*\u00b2\u00f9\u0002\u0093\u00d7\u00a8\u0018\u009a\u00f9\u00b3\u00a9\u00da\u00f2n+\u00e5 \u0002\u0083\u009ar\u0000\u00d3\u00d7\u00b2F \u00eb\u00bc\u00f7\u00c5\u00f4c&l\u0085\u00c2&R\u00ae\u00fdj\u00e4\u001f\u00ac\u00e7\u00bc\u00ba\u00e0J\u00dd\u00b1\u00bbm\u0083\u00ae \u00a3\u00821\u001e\u00ea9\u000f\u00a4HN\u00e4n\u00f2\u00a3\u00b6PG\u00bch\u0011n6\u00bb\u00e9;\u00ef\u00f5\u000b\u0019\u00d0\u00f2.\u00bd\u00cd\u0001\u00a6\u00a5\u00ba\u008cV\u00e3\u0000g\u009b\u00b7\u00c0\u009f\u00cebS\u008c\r\u001a\u00afI\u0095\u00ef6I\u00a2\u00d4\u0018owE\u0090\u00d3\u00f6H.\u00e9\u00af\u001d\u0005\u00a1f~V)\u00d3\u00c7m\u00a7\u00a7\u00ff\u000e%\u00e2\u00b6\u00bbsAd8\u0010:\u00d3\u00b8\u0084S\u00029.\u00f0M\u0011\u00d0\u0091\u00c3E\u0010v}\u00a8\u00d7l\u0004T\u00b5jO\u00cd\u00a4\u0096\u001f\u00ab\u0012\u0005X7\u00a2\u007f\u00b6;\u00e7U(\u00a4#\u0019\u0019d\u0087\u00e4\u00f6\u00ef\u00e63\u0015\u00c4\u00fcz\u00e8\u00fe\u00b8>\u00d3\u0002\u00c1\u0007\u001ao2\u00a8\u0099\u00be\u001e0\u001f\u00ca\t\u00f6*\u0010g\u0085KS]\u00d4:\u00aezX*Y\u00bb\u00eer\u00ce\u0002\u00c1T\u000fB1\u0007\u0017\u009ea7p\u0093](id\u0003\n\u00d3\u008e\u0087Z0\u00aaI\u00ef\u0002\u00d94\u00c0\u008a\u0084\u00fb\u00e9\u00e7\u009b4\u00b3\u001csF\u008b \u00a1G\u00ae\u00a2^\u0003[\u0088\u00d5GE#t\u0083\u009a\u00b4\u00fc\u00ab\u00da\u0090\u001f\u00b7\u009c\u00be\u0005j\u00ef\u00e5#\u00cf\u00cb]\u00bc\u00e6\u00c9\u00e4C\u0092\u00b2\u0017q/\u00ccy\u00f2\u001b\u00f2W\u00de\u00e8<\u00e0[\u00f2\u0010\nd\u0093Q\u00d5\u0094\u00e3\u00df\u001f\u00f2\u00c2\u00e2V\u00b8Q\u00fe\u009c\t\u00e5\u009d8\u00a5\u00a6z\u00e2f\u00beq`\u00ee\u00105\u0000\u0019\u00e1\u00e0\\(\u0011C\u00ec\u00b9[\u0014\u00bc\u00a8\u00af\u00f0\u00cf\\\u00b6\u00c0\u0083\u00f9\u000eG\u0089\u0083\u00d6#\u00b2\u00bd0h0]\u0014\u00ba\u00ff\u0012P\u00eb\u0096\u0016?~Y\u0088\u0001\u00a6\u00dc\u009f\u00f9D\u00e7\u00f09\u0013\u00e8\u00c1d\u008ce\u00a4\u00a4\u00f0\u00e64\u00b8Z=\u00be\u00bf\u00cb\u001cB\u009bC0>F\u009fp\u00ee,\u00197,\u00b1\u00a2\u0096\u00955\u0004\u00a1Y3\u00d0\u00c2\u0014\u00af\u00e5t\u0095\u0084\u00bb\u00f4\u00c5Q\bwI\u008d\u0003\u00cc\u008a\tv\u00a52\u00f5i=\u001b\u00d0\u0003\u00a1\u00d0^!3\u00efY$\u0005\u00944V\u00b9\"\u00f2\u00fc^0|CR\u00f5\u0087_\u00d3\u00fc\u00de\u00ad\u008fbP\u008d\u00b9\u00f1~\u000e\u00fdE>\r\u00d3\u00d2\u00bc\u007f6\u00a6\u0089\nl\u00af\u00c9.v\u00cev\u00c9)\u00d0Pw\u00a9\u00af\u00batW\u001e\u008d\u0091\u00f43,\u0098h\u00e6\u0012\u00aa\u00893\u00edQ\u0001\u00888\u009b\r\u00ffX0i\u00c7\u00dd\u009e\u009a\u0093\u0093\u00cb\u00bck\u00e2\u009b\u00ab\u00a1\u0089lT\u00e0\u00d3Z\u00d0p\u00f6\u00e7\u00cc\u001fL\u009e\u0016\u0018\u0003\u00ceL\u00f6\u0094\u00e8\u00fe\u00ea\u0086\nb\u00d4\u00a6S\u00ab\u00e5\u00a8ID\u0086\u00a4\u00c85\u00a5oB=\u000b2\u00e5\u0003h".length();
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
                    var4_10 = "^H\u001a\u00efH'\u0003w\u00db\u0086\u008f\u00f3\u00a8\u00db\u00d1\u00fd";
                    var5_11 = "^H\u001a\u00efH'\u0003w\u00db\u0086\u008f\u00f3\u00a8\u00db\u00d1\u00fd".length();
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
        ze.h = var6_8;
        ze.i = new Integer[99];
        ze.y = new DecimalFormat(ze.a(-19011, -17136));
    }

    protected String f(Object[] objectArray) {
        Double d = (Double)objectArray[0];
        return hi.a("\u00a5", (Object)hi.a("j", (long)427783330483124024L), (Object)d, (long)436734169222020859L);
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

    protected void g(Object[] objectArray) {
        Double d = (Double)objectArray[0];
        hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[]{d}, (long)1134711104362043345L);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void O() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
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

    protected Double m(Object[] objectArray) {
        return hi.a("G", (double)hi.a("\u00a5", (Object)((DM)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)448940460375041867L), (long)1323649220833053453L);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFB5BD) & 0xFFFF;
        if (c[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 44;
                case 1 -> 87;
                case 2 -> 128;
                case 3 -> 249;
                case 4 -> 171;
                case 5 -> 89;
                case 6 -> 53;
                case 7 -> 54;
                case 8 -> 180;
                case 9 -> 218;
                case 10 -> 45;
                case 11 -> 95;
                case 12 -> 143;
                case 13 -> 170;
                case 14 -> 17;
                case 15 -> 202;
                case 16 -> 224;
                case 17 -> 29;
                case 18 -> 106;
                case 19 -> 156;
                case 20 -> 175;
                case 21 -> 102;
                case 22 -> 138;
                case 23 -> 168;
                case 24 -> 27;
                case 25 -> 70;
                case 26 -> 247;
                case 27 -> 25;
                case 28 -> 239;
                case 29 -> 145;
                case 30 -> 233;
                case 31 -> 157;
                case 32 -> 116;
                case 33 -> 84;
                case 34 -> 223;
                case 35 -> 185;
                case 36 -> 206;
                case 37 -> 210;
                case 38 -> 22;
                case 39 -> 133;
                case 40 -> 74;
                case 41 -> 213;
                case 42 -> 112;
                case 43 -> 194;
                case 44 -> 253;
                case 45 -> 160;
                case 46 -> 148;
                case 47 -> 236;
                case 48 -> 113;
                case 49 -> 97;
                case 50 -> 137;
                case 51 -> 164;
                case 52 -> 65;
                case 53 -> 33;
                case 54 -> 47;
                case 55 -> 115;
                case 56 -> 159;
                case 57 -> 82;
                case 58 -> 83;
                case 59 -> 203;
                case 60 -> 245;
                case 61 -> 20;
                case 62 -> 130;
                case 63 -> 255;
                case 64 -> 197;
                case 65 -> 166;
                case 66 -> 31;
                case 67 -> 100;
                case 68 -> 30;
                case 69 -> 244;
                case 70 -> 135;
                case 71 -> 93;
                case 72 -> 190;
                case 73 -> 59;
                case 74 -> 123;
                case 75 -> 140;
                case 76 -> 94;
                case 77 -> 85;
                case 78 -> 46;
                case 79 -> 204;
                case 80 -> 60;
                case 81 -> 75;
                case 82 -> 37;
                case 83 -> 23;
                case 84 -> 227;
                case 85 -> 191;
                case 86 -> 76;
                case 87 -> 34;
                case 88 -> 149;
                case 89 -> 48;
                case 90 -> 24;
                case 91 -> 234;
                case 92 -> 107;
                case 93 -> 188;
                case 94 -> 167;
                case 95 -> 77;
                case 96 -> 10;
                case 97 -> 146;
                case 98 -> 216;
                case 99 -> 55;
                case 100 -> 101;
                case 101 -> 211;
                case 102 -> 134;
                case 103 -> 118;
                case 104 -> 13;
                case 105 -> 193;
                case 106 -> 222;
                case 107 -> 131;
                case 108 -> 81;
                case 109 -> 73;
                case 110 -> 104;
                case 111 -> 139;
                case 112 -> 132;
                case 113 -> 26;
                case 114 -> 49;
                case 115 -> 69;
                case 116 -> 155;
                case 117 -> 105;
                case 118 -> 52;
                case 119 -> 72;
                case 120 -> 230;
                case 121 -> 231;
                case 122 -> 61;
                case 123 -> 207;
                case 124 -> 200;
                case 125 -> 15;
                case 126 -> 38;
                case 127 -> 96;
                case 128 -> 251;
                case 129 -> 250;
                case 130 -> 51;
                case 131 -> 80;
                case 132 -> 141;
                case 133 -> 179;
                case 134 -> 182;
                case 135 -> 158;
                case 136 -> 173;
                case 137 -> 127;
                case 138 -> 144;
                case 139 -> 124;
                case 140 -> 12;
                case 141 -> 119;
                case 142 -> 6;
                case 143 -> 9;
                case 144 -> 161;
                case 145 -> 2;
                case 146 -> 91;
                case 147 -> 198;
                case 148 -> 114;
                case 149 -> 217;
                case 150 -> 254;
                case 151 -> 150;
                case 152 -> 187;
                case 153 -> 39;
                case 154 -> 142;
                case 155 -> 86;
                case 156 -> 242;
                case 157 -> 147;
                case 158 -> 201;
                case 159 -> 66;
                case 160 -> 16;
                case 161 -> 8;
                case 162 -> 98;
                case 163 -> 195;
                case 164 -> 243;
                case 165 -> 181;
                case 166 -> 212;
                case 167 -> 165;
                case 168 -> 14;
                case 169 -> 189;
                case 170 -> 196;
                case 171 -> 178;
                case 172 -> 88;
                case 173 -> 64;
                case 174 -> 1;
                case 175 -> 18;
                case 176 -> 90;
                case 177 -> 21;
                case 178 -> 183;
                case 179 -> 36;
                case 180 -> 214;
                case 181 -> 232;
                case 182 -> 248;
                case 183 -> 240;
                case 184 -> 238;
                case 185 -> 199;
                case 186 -> 19;
                case 187 -> 122;
                case 188 -> 252;
                case 189 -> 163;
                case 190 -> 111;
                case 191 -> 186;
                case 192 -> 209;
                case 193 -> 43;
                case 194 -> 153;
                case 195 -> 184;
                case 196 -> 151;
                case 197 -> 208;
                case 198 -> 241;
                case 199 -> 78;
                case 200 -> 4;
                case 201 -> 205;
                case 202 -> 50;
                case 203 -> 56;
                case 204 -> 11;
                case 205 -> 126;
                case 206 -> 129;
                case 207 -> 58;
                case 208 -> 235;
                case 209 -> 92;
                case 210 -> 215;
                case 211 -> 125;
                case 212 -> 0;
                case 213 -> 79;
                case 214 -> 192;
                case 215 -> 169;
                case 216 -> 176;
                case 217 -> 67;
                case 218 -> 5;
                case 219 -> 221;
                case 220 -> 57;
                case 221 -> 220;
                case 222 -> 62;
                case 223 -> 71;
                case 224 -> 219;
                case 225 -> 177;
                case 226 -> 174;
                case 227 -> 120;
                case 228 -> 41;
                case 229 -> 162;
                case 230 -> 7;
                case 231 -> 110;
                case 232 -> 68;
                case 233 -> 35;
                case 234 -> 121;
                case 235 -> 154;
                case 236 -> 42;
                case 237 -> 226;
                case 238 -> 103;
                case 239 -> 229;
                case 240 -> 228;
                case 241 -> 246;
                case 242 -> 63;
                case 243 -> 108;
                case 244 -> 136;
                case 245 -> 172;
                case 246 -> 28;
                case 247 -> 117;
                case 248 -> 237;
                case 249 -> 32;
                case 250 -> 225;
                case 251 -> 3;
                case 252 -> 109;
                case 253 -> 40;
                case 254 -> 152;
                default -> 99;
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
            ze.c[n3] = new String(cArray).intern();
        }
        return c[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3490;
        if (i[n2] == null) {
            ze.i[n2] = (int)(h[n2] ^ l);
        }
        return i[n2];
    }
}
