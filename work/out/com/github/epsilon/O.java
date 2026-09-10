/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.ItemStack
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.XG;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.zh;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends e {
    public static final O D;
    private final XG S;
    private final Dx<zh> O = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.O.b(21569, 7240), (Object)hi.a("j", (long)950731023780175059L), (long)426795652261052192L);
    private ItemStack y;
    private int E;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, null, (long)822864912165872017L);
        hi.a("\u00f2", (Object)this, (int)0, (long)648926657380224222L);
    }

    /*
     * Exception decompiling
     */
    private int q(Object[] var1_1) {
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

    public static /* bridge */ /* synthetic */ CallSite R(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\b\u00b77\u00bb\u0005\ng\u00ab]r\u000f\u000b\u00ad}\u00f8\u00922\u0010\u00f8{g\u00e0\u00f2\u00fc\bA";
                    var12_3 = "\b\u00b77\u00bb\u0005\ng\u00ab]r\u000f\u000b\u00ad}\u00f8\u00922\u0010\u00f8{g\u00e0\u00f2\u00fc\bA".length();
                    var9_4 = 4;
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
                    v4 = 85;
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
                                    v11 = 9;
                                    break;
                                }
                                case 1: {
                                    v11 = 96;
                                    break;
                                }
                                case 2: {
                                    v11 = 104;
                                    break;
                                }
                                case 3: {
                                    v11 = 89;
                                    break;
                                }
                                case 4: {
                                    v11 = 88;
                                    break;
                                }
                                case 5: {
                                    v11 = 16;
                                    break;
                                }
                                default: {
                                    v11 = 55;
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
                com.github.epsilon.O.a = var13;
                com.github.epsilon.O.b = new String[3];
                var0_7 = 1791899281615624559L;
                var6_8 = new long[115];
                var3_9 = 0;
                var4_10 = "F\u00e3\u0005F!w\u00b0\u009aN\u00ab\u00c7\u00e8\u001a\u00a6\u00f5\u00e7x\u00de\u00a2\u00c2b\u009e\u00d7i\u0015J\u000ff\u00b5\u00bc\u00e6\u009ch\u00bb\u00damPp\"\u00b3\u0013\u00fa\u00be_\u0018\u00a36-M#\\\u0012\u001eN\u00dc\u009dD\u00f7\u00c4\u00f4\u0089\u008fk\u00b6\u00af\u00a7\u0015rH$}\b\u00c2\u00e5\u000f\u00dez\u00efF\u00c9\u007f\u00cf\u00cf\u00ea\u00cf\u00fb\u00fa=\u0019d\u00a5\u00fa\u00faB\u00c0\u0085\u00b9E\u0084ZO\u0082\u0002\u0016\u00c2\u00e7\u00ff\n;T\u0003\u00acd\u0007\u00fc\u0007\u00fa1!?R\u00d9\n\u00a2\u00e3\u000b\u00d9\u008b8\t\u00d3[\u00f2\u00f4\u00c4$Ugib\u0011n\u00f6\u0005\u00b4\u0015\u00c3\u00b0\u008d\u0088'0\u00b3\u00ad\u00e2\u00ef\u00f9\u0083\u00feS44\u00cd\u0099\u0089i\u00a3\u00feM\u00d9\u00ed,H\u0014\u00be\u00f3\u00d3\u00a2\u001bF\u00c1\u00a06\u00e3\u0007\"\u00eaK\fHM(\u00d0BUa\u000fQ\u00ca/\u00db\u00829\u0000\u00bc\u001c\u00fe\u007f3M\u009b\u00ee)\u0016nEU%\u0006\u00c6\u00e2kBl.b/\u000b\u0095\u00bbg!\u00ff\u000bR*\u00b9\u00c1h?\u0098{\u00a4\u00909\u00fc&\u00a8.\u00d9|\u00c1phW\u0097\u000339\u001alH:\u00ffh\u00cc\u0004\u00a4\u00bb>C%\u0084Or\u00d4f\u008d\u0097h\u0002\u00ae>\u009b\u00a2f\u00f7\u00d8\u00cc2*\u00a2\u00c63\u00f9k\u00d4\u00da\u00fe|\u00da\u00db\u00d7\u0002\u00ae>\u0015\"\u00e6\u00e2e\u0097\u00d0\u0091/ X\u00c6\u00b5\u00a9\u00c7\u00cd\u00a2\u00f7]\tu,F\"!\u001d\u0000\u000f\u0089ee\u00f8\u001e\u00d3\u0000\u0018\u00b4\u00b1A\u00ed\u00c7h\u0007\u00ec\u0098\u008b\u00c0\u0018\u0097\u00aaK\u00fc\u00a4\u008bP\u008f\u00c3\u0089\u001a\u00e6X\u0007\u001b\u0011\u0092g\u00f0\u009fD1\u0003\nNB\u00efTOK\u00db$\u00ce\u0087\u0091\u0001\u0091p\u0096\u00802\u0098\u00d7\u00beG\u009d\u0080\u0082K\u00ff\u0080\u00160L\u0019\u0080\u00c7\u0003\u009e\u00fc\u00dbj\r]\u0097\u00ady\t\u00856N]\u0097\u0084/\u00ff\u00c5\u00b5\u001f0\u00a8\u00ba\u00e2v\u00cb\u00af\u00ba\u00dd,G\u00ed\u00af@\u008c\u0016\u0095\u00fbI\u008f\u00db;\u00a3\u00b9\u00b0\u00ee\u008es\u00aa#\u00e3\u001b\u00f0\u0016l\u0005\u00b2i\u00d5A\u00a4\u000bv\u00b4\u00bb\u00bam\fb\u00a4l{\u008d\u00b3\u001c\u00d6$: \u00ce\u00d9\u00fa\u0019\u0098{\u00fa\u0089\u0091\u000b9\u0084\u00f38|y\u0018-\u00a2\u00c3\u008fd\u00d7\u00fch\u00f8X\u0083\u00bf\u001fs\u0083w\u00f0\u00e7\u0080\u00f9\u008e\u009ft,Z\u00c0\u00ea\u00c2\u008b\u001cm\u00c5^\u00fb\u00f0E+$\u00eeU\u00ab\u0090x\u00aa`6\u00e9\u00b0D\u009d\u009c\u00d0\u00d4M6\u008b+\u00f8:\u00ad\r\u00d8\u007f\u00c7\u00c5\u0019g\u00f7\u00dfl\u00051\u0013\u00a9T\u00d6\u00af^\u0094\u00d1\u009d\u0084Ny\u00c6C\u00d3\u00df\u0013L\n\u008c$\u00c5=\u0080v\u00161\u00e5P\u00ee\u0017\u009c`\u00a44T\u00db\u0010\u008b\u00ad\u00ce\u00b0\u00a1\u00a6\u00d4\b{8\u001f\u00eb<\u00c3\u0094\u009fV\u00c6\u00ce\u00a7\u00a0\u00fc\u00cdt\u00b0\u00b4\u0003n\u0011\u0086\u00a3\u00163\u00e4\u00eb:`>\u00f0\u00a7\u001f\u00daFZ\u00fe\r\u00ee\u00de\u00d2\u00d8\u0093\u0010\u00fe\u0099a\u00ed\u0084t\u001c2&\u0094\u00ea\u00c9d\u00b3\u00de\u0086\u00d2\u00e1\u0010\u00c6\u00ba\u00b9\u0016\u00c1=\u00a6s\u001f\u00b7\u00ed\u0002\u0002GP\t\u007f\u0012(\u0003\u00be\u00af,\n\\\u00a1\u00e2\u00e1L\u00f9\u00c14#gK\u00c5\u00f7\u00ddH\u00d1\u009d\u0084\u001cCB\u0096o\u00e2\u0004\u00dc\u00d7X\u00f5\u007fy\u00b6 ~}h\u00fa\u00ba\u000b\u009cy\u00f2gJG\u00b0\u00a8\u00df\u0004,\u00a0(\u00a4\u00ef\u00cb\u00fa\u00a7\u00b5X\u00c2\u00b1\u009dk\u00ea2\u0099\u0011\u00dc%\u00c5\u0088\u009e\u001f$\u00f2t\u00ac)I\u0097a1\u00b5\u00ad\u00d7\u00b7\u0013\u0012^\u00dc\u00eeU\t\u0094\u0097H\u0093-U\u00fc\u00a9E\u00bbX\u00f1\t\r\u00de\u00d0}\u0091\u008d\u00fd\u0098z\u00ff\u0015\u00cd\u00c3\u00e8\u00f0\u00acAH<\u00c6\u0004\u0010{\u00a0\u00c1oa~[\u00fb*~\u00dc\u00e7fKjD\u00a4`\u00f43\u00d7\u00ef\u0088\u00cd\u0007\u00fb\u00d6v\u00a5\u00af\u00f3\u0006\u00dd3cs\u00d5\u0011\u00e8s<x\u00a5\u0094a$q\u00ef\u00d0[I^HUL\u007f\u00c6\u00b4\u00ba\u008c\u00d8-";
                var5_11 = "F\u00e3\u0005F!w\u00b0\u009aN\u00ab\u00c7\u00e8\u001a\u00a6\u00f5\u00e7x\u00de\u00a2\u00c2b\u009e\u00d7i\u0015J\u000ff\u00b5\u00bc\u00e6\u009ch\u00bb\u00damPp\"\u00b3\u0013\u00fa\u00be_\u0018\u00a36-M#\\\u0012\u001eN\u00dc\u009dD\u00f7\u00c4\u00f4\u0089\u008fk\u00b6\u00af\u00a7\u0015rH$}\b\u00c2\u00e5\u000f\u00dez\u00efF\u00c9\u007f\u00cf\u00cf\u00ea\u00cf\u00fb\u00fa=\u0019d\u00a5\u00fa\u00faB\u00c0\u0085\u00b9E\u0084ZO\u0082\u0002\u0016\u00c2\u00e7\u00ff\n;T\u0003\u00acd\u0007\u00fc\u0007\u00fa1!?R\u00d9\n\u00a2\u00e3\u000b\u00d9\u008b8\t\u00d3[\u00f2\u00f4\u00c4$Ugib\u0011n\u00f6\u0005\u00b4\u0015\u00c3\u00b0\u008d\u0088'0\u00b3\u00ad\u00e2\u00ef\u00f9\u0083\u00feS44\u00cd\u0099\u0089i\u00a3\u00feM\u00d9\u00ed,H\u0014\u00be\u00f3\u00d3\u00a2\u001bF\u00c1\u00a06\u00e3\u0007\"\u00eaK\fHM(\u00d0BUa\u000fQ\u00ca/\u00db\u00829\u0000\u00bc\u001c\u00fe\u007f3M\u009b\u00ee)\u0016nEU%\u0006\u00c6\u00e2kBl.b/\u000b\u0095\u00bbg!\u00ff\u000bR*\u00b9\u00c1h?\u0098{\u00a4\u00909\u00fc&\u00a8.\u00d9|\u00c1phW\u0097\u000339\u001alH:\u00ffh\u00cc\u0004\u00a4\u00bb>C%\u0084Or\u00d4f\u008d\u0097h\u0002\u00ae>\u009b\u00a2f\u00f7\u00d8\u00cc2*\u00a2\u00c63\u00f9k\u00d4\u00da\u00fe|\u00da\u00db\u00d7\u0002\u00ae>\u0015\"\u00e6\u00e2e\u0097\u00d0\u0091/ X\u00c6\u00b5\u00a9\u00c7\u00cd\u00a2\u00f7]\tu,F\"!\u001d\u0000\u000f\u0089ee\u00f8\u001e\u00d3\u0000\u0018\u00b4\u00b1A\u00ed\u00c7h\u0007\u00ec\u0098\u008b\u00c0\u0018\u0097\u00aaK\u00fc\u00a4\u008bP\u008f\u00c3\u0089\u001a\u00e6X\u0007\u001b\u0011\u0092g\u00f0\u009fD1\u0003\nNB\u00efTOK\u00db$\u00ce\u0087\u0091\u0001\u0091p\u0096\u00802\u0098\u00d7\u00beG\u009d\u0080\u0082K\u00ff\u0080\u00160L\u0019\u0080\u00c7\u0003\u009e\u00fc\u00dbj\r]\u0097\u00ady\t\u00856N]\u0097\u0084/\u00ff\u00c5\u00b5\u001f0\u00a8\u00ba\u00e2v\u00cb\u00af\u00ba\u00dd,G\u00ed\u00af@\u008c\u0016\u0095\u00fbI\u008f\u00db;\u00a3\u00b9\u00b0\u00ee\u008es\u00aa#\u00e3\u001b\u00f0\u0016l\u0005\u00b2i\u00d5A\u00a4\u000bv\u00b4\u00bb\u00bam\fb\u00a4l{\u008d\u00b3\u001c\u00d6$: \u00ce\u00d9\u00fa\u0019\u0098{\u00fa\u0089\u0091\u000b9\u0084\u00f38|y\u0018-\u00a2\u00c3\u008fd\u00d7\u00fch\u00f8X\u0083\u00bf\u001fs\u0083w\u00f0\u00e7\u0080\u00f9\u008e\u009ft,Z\u00c0\u00ea\u00c2\u008b\u001cm\u00c5^\u00fb\u00f0E+$\u00eeU\u00ab\u0090x\u00aa`6\u00e9\u00b0D\u009d\u009c\u00d0\u00d4M6\u008b+\u00f8:\u00ad\r\u00d8\u007f\u00c7\u00c5\u0019g\u00f7\u00dfl\u00051\u0013\u00a9T\u00d6\u00af^\u0094\u00d1\u009d\u0084Ny\u00c6C\u00d3\u00df\u0013L\n\u008c$\u00c5=\u0080v\u00161\u00e5P\u00ee\u0017\u009c`\u00a44T\u00db\u0010\u008b\u00ad\u00ce\u00b0\u00a1\u00a6\u00d4\b{8\u001f\u00eb<\u00c3\u0094\u009fV\u00c6\u00ce\u00a7\u00a0\u00fc\u00cdt\u00b0\u00b4\u0003n\u0011\u0086\u00a3\u00163\u00e4\u00eb:`>\u00f0\u00a7\u001f\u00daFZ\u00fe\r\u00ee\u00de\u00d2\u00d8\u0093\u0010\u00fe\u0099a\u00ed\u0084t\u001c2&\u0094\u00ea\u00c9d\u00b3\u00de\u0086\u00d2\u00e1\u0010\u00c6\u00ba\u00b9\u0016\u00c1=\u00a6s\u001f\u00b7\u00ed\u0002\u0002GP\t\u007f\u0012(\u0003\u00be\u00af,\n\\\u00a1\u00e2\u00e1L\u00f9\u00c14#gK\u00c5\u00f7\u00ddH\u00d1\u009d\u0084\u001cCB\u0096o\u00e2\u0004\u00dc\u00d7X\u00f5\u007fy\u00b6 ~}h\u00fa\u00ba\u000b\u009cy\u00f2gJG\u00b0\u00a8\u00df\u0004,\u00a0(\u00a4\u00ef\u00cb\u00fa\u00a7\u00b5X\u00c2\u00b1\u009dk\u00ea2\u0099\u0011\u00dc%\u00c5\u0088\u009e\u001f$\u00f2t\u00ac)I\u0097a1\u00b5\u00ad\u00d7\u00b7\u0013\u0012^\u00dc\u00eeU\t\u0094\u0097H\u0093-U\u00fc\u00a9E\u00bbX\u00f1\t\r\u00de\u00d0}\u0091\u008d\u00fd\u0098z\u00ff\u0015\u00cd\u00c3\u00e8\u00f0\u00acAH<\u00c6\u0004\u0010{\u00a0\u00c1oa~[\u00fb*~\u00dc\u00e7fKjD\u00a4`\u00f43\u00d7\u00ef\u0088\u00cd\u0007\u00fb\u00d6v\u00a5\u00af\u00f3\u0006\u00dd3cs\u00d5\u0011\u00e8s<x\u00a5\u0094a$q\u00ef\u00d0[I^HUL\u007f\u00c6\u00b4\u00ba\u008c\u00d8-".length();
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
                    var4_10 = "\u00f8\u00f0\u0081]\u0002\u00e2\u0088\u00baCG\u00bd\tb\t\u00d0\u00c1";
                    var5_11 = "\u00f8\u00f0\u0081]\u0002\u00e2\u0088\u00baCG\u00bd\tb\t\u00d0\u00c1".length();
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
        com.github.epsilon.O.c = var6_8;
        com.github.epsilon.O.d = new Integer[115];
        com.github.epsilon.O.D = new O();
    }

    public void q(Object[] objectArray) {
        ItemStack itemStack = (ItemStack)objectArray[0];
        hi.a("\u00f2", (Object)this, (ItemStack)itemStack, (long)822864912165872017L);
        hi.a("\u00f2", (Object)this, (int)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)441390331317273708L), (long)648926657380224222L);
    }

    /*
     * Exception decompiling
     */
    public void m(Object[] var1_1) {
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
     * Could not resolve type clashes
     */
    @yE
    private void y(dR var1_1) {
        block12: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)com.github.epsilon.O.c(17399, 4949766309590767242L), (int)com.github.epsilon.O.c(24879, 6158361666338042973L), (long)834203424483934088L) ^ com.github.epsilon.O.c(30458, 5532905114376872850L)), (int)com.github.epsilon.O.c(19434, 1404861879412006539L), (long)834203424483934088L) + com.github.epsilon.O.c(30571, 1148152444631851633L) - com.github.epsilon.O.c(29339, 7490805766685173692L);
            if (!var2_2) break block12;
lbl4:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)648926657380224222L);
                if (var2_2) ** GOTO lbl41
                if (v0 /* !! */  <= 0) ** GOTO lbl40
                ** GOTO lbl42
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                v1 = this;
                v2 = hi.a("\u00e9", (Object)v1, (long)648926657380224222L) - true;
                v3 /* !! */  = v2;
                hi.a("\u00f2", (Object)v1, (int)v2, (long)648926657380224222L);
                if (var2_2) ** GOTO lbl45
                if (v3 /* !! */  != false) ** GOTO lbl44
                ** GOTO lbl46
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                hi.a("\u00f2", (Object)this, null, (long)822864912165872017L);
                if (var2_2) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl48
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 2062250964: {
                    ** continue;
                }
                case 2062250966: {
                    ** continue;
                }
                case 2062250965: {
                    ** continue;
                }
                case 2062250967: 
            }
            hi.a("G", (boolean)true, (long)529149675032995021L);
            var3_3 /* !! */  = (reference)(com.github.epsilon.O.c(28888, 475031391608776088L) * com.github.epsilon.O.c(16352, 5911002588513725134L) + com.github.epsilon.O.c(11614, 3043761734269237342L) - com.github.epsilon.O.c(30937, 4630680350495059411L));
            if (!var2_2) continue;
lbl40:
            // 2 sources

            v0 /* !! */  = var3_3 /* !! */  = (reference)(com.github.epsilon.O.c(5248, 2711167512466702847L) * com.github.epsilon.O.c(14620, 3762310889894636599L) + com.github.epsilon.O.c(18940, 6198428707482311904L));
lbl41:
            // 2 sources

            if (!var2_2) continue;
lbl42:
            // 2 sources

            var3_3 /* !! */  = (reference)((com.github.epsilon.O.c(4978, 7074935899546568249L) - com.github.epsilon.O.c(11476, 5471845399510612458L)) * com.github.epsilon.O.c(32041, 2228613720456767534L) ^ com.github.epsilon.O.c(13929, 8631841267273622310L));
            if (!var2_2) continue;
lbl44:
            // 2 sources

            v3 /* !! */  = var3_3 /* !! */  = (reference)(com.github.epsilon.O.c(19395, 3142063970238373504L) * com.github.epsilon.O.c(1528, 8402469782182842599L) + com.github.epsilon.O.c(12488, 5043599920999228897L));
lbl45:
            // 2 sources

            if (!var2_2) continue;
lbl46:
            // 2 sources

            var3_3 /* !! */  = (reference)((com.github.epsilon.O.R("nk9TTejQuqO1lbQQ", max(int int ), (int)(com.github.epsilon.O.c(26151, 1194787635784495964L) + com.github.epsilon.O.c(21663, 4361553846791831952L)), (int)com.github.epsilon.O.c(21557, 5766269445807767895L)) ^ com.github.epsilon.O.c(20707, 9093630356014433740L)) - com.github.epsilon.O.c(18450, 8993093049996221810L));
            if (!var2_2) continue;
lbl48:
            // 2 sources

            var3_3 /* !! */  = (reference)(com.github.epsilon.O.c(19395, 3142063970238373504L) * com.github.epsilon.O.c(1528, 8402469782182842599L) + com.github.epsilon.O.c(12488, 5043599920999228897L));
        }
    }

    private O() {
        super(com.github.epsilon.O.b(21571, -15666), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        this.S = com.github.epsilon.O.R("nk9TTejQuqO1lbQQ", b(java.lang.String int int int int ), (O)this, (String)com.github.epsilon.O.b(21568, -4142), (int)com.github.epsilon.O.c(28559, 5368034129660328633L), (int)1, (int)com.github.epsilon.O.c(5765, 3698542151714227189L), (int)1);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x5441) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 9;
                case 1 -> 91;
                case 2 -> 179;
                case 3 -> 104;
                case 4 -> 196;
                case 5 -> 107;
                case 6 -> 108;
                case 7 -> 82;
                case 8 -> 241;
                case 9 -> 43;
                case 10 -> 232;
                case 11 -> 50;
                case 12 -> 235;
                case 13 -> 187;
                case 14 -> 73;
                case 15 -> 52;
                case 16 -> 79;
                case 17 -> 71;
                case 18 -> 183;
                case 19 -> 6;
                case 20 -> 92;
                case 21 -> 210;
                case 22 -> 228;
                case 23 -> 159;
                case 24 -> 3;
                case 25 -> 106;
                case 26 -> 124;
                case 27 -> 223;
                case 28 -> 7;
                case 29 -> 37;
                case 30 -> 84;
                case 31 -> 209;
                case 32 -> 219;
                case 33 -> 155;
                case 34 -> 20;
                case 35 -> 54;
                case 36 -> 113;
                case 37 -> 217;
                case 38 -> 236;
                case 39 -> 145;
                case 40 -> 204;
                case 41 -> 98;
                case 42 -> 49;
                case 43 -> 128;
                case 44 -> 190;
                case 45 -> 201;
                case 46 -> 72;
                case 47 -> 53;
                case 48 -> 132;
                case 49 -> 134;
                case 50 -> 202;
                case 51 -> 14;
                case 52 -> 191;
                case 53 -> 230;
                case 54 -> 34;
                case 55 -> 154;
                case 56 -> 123;
                case 57 -> 22;
                case 58 -> 164;
                case 59 -> 212;
                case 60 -> 83;
                case 61 -> 46;
                case 62 -> 144;
                case 63 -> 225;
                case 64 -> 4;
                case 65 -> 21;
                case 66 -> 59;
                case 67 -> 193;
                case 68 -> 96;
                case 69 -> 109;
                case 70 -> 32;
                case 71 -> 207;
                case 72 -> 95;
                case 73 -> 215;
                case 74 -> 227;
                case 75 -> 63;
                case 76 -> 126;
                case 77 -> 147;
                case 78 -> 176;
                case 79 -> 62;
                case 80 -> 131;
                case 81 -> 186;
                case 82 -> 156;
                case 83 -> 157;
                case 84 -> 47;
                case 85 -> 140;
                case 86 -> 205;
                case 87 -> 203;
                case 88 -> 93;
                case 89 -> 129;
                case 90 -> 177;
                case 91 -> 173;
                case 92 -> 175;
                case 93 -> 68;
                case 94 -> 254;
                case 95 -> 130;
                case 96 -> 35;
                case 97 -> 39;
                case 98 -> 136;
                case 99 -> 28;
                case 100 -> 246;
                case 101 -> 171;
                case 102 -> 76;
                case 103 -> 195;
                case 104 -> 78;
                case 105 -> 252;
                case 106 -> 61;
                case 107 -> 242;
                case 108 -> 188;
                case 109 -> 180;
                case 110 -> 75;
                case 111 -> 55;
                case 112 -> 150;
                case 113 -> 125;
                case 114 -> 244;
                case 115 -> 192;
                case 116 -> 253;
                case 117 -> 153;
                case 118 -> 40;
                case 119 -> 51;
                case 120 -> 33;
                case 121 -> 169;
                case 122 -> 226;
                case 123 -> 198;
                case 124 -> 66;
                case 125 -> 112;
                case 126 -> 118;
                case 127 -> 67;
                case 128 -> 122;
                case 129 -> 158;
                case 130 -> 220;
                case 131 -> 168;
                case 132 -> 146;
                case 133 -> 149;
                case 134 -> 174;
                case 135 -> 31;
                case 136 -> 88;
                case 137 -> 233;
                case 138 -> 111;
                case 139 -> 41;
                case 140 -> 239;
                case 141 -> 80;
                case 142 -> 27;
                case 143 -> 13;
                case 144 -> 69;
                case 145 -> 57;
                case 146 -> 194;
                case 147 -> 229;
                case 148 -> 115;
                case 149 -> 247;
                case 150 -> 199;
                case 151 -> 127;
                case 152 -> 120;
                case 153 -> 163;
                case 154 -> 77;
                case 155 -> 211;
                case 156 -> 138;
                case 157 -> 224;
                case 158 -> 58;
                case 159 -> 160;
                case 160 -> 137;
                case 161 -> 30;
                case 162 -> 5;
                case 163 -> 222;
                case 164 -> 19;
                case 165 -> 162;
                case 166 -> 184;
                case 167 -> 103;
                case 168 -> 8;
                case 169 -> 200;
                case 170 -> 117;
                case 171 -> 12;
                case 172 -> 234;
                case 173 -> 240;
                case 174 -> 245;
                case 175 -> 170;
                case 176 -> 44;
                case 177 -> 87;
                case 178 -> 182;
                case 179 -> 48;
                case 180 -> 206;
                case 181 -> 0;
                case 182 -> 1;
                case 183 -> 166;
                case 184 -> 243;
                case 185 -> 251;
                case 186 -> 11;
                case 187 -> 181;
                case 188 -> 36;
                case 189 -> 90;
                case 190 -> 29;
                case 191 -> 64;
                case 192 -> 2;
                case 193 -> 248;
                case 194 -> 105;
                case 195 -> 116;
                case 196 -> 237;
                case 197 -> 214;
                case 198 -> 74;
                case 199 -> 151;
                case 200 -> 135;
                case 201 -> 249;
                case 202 -> 42;
                case 203 -> 45;
                case 204 -> 24;
                case 205 -> 23;
                case 206 -> 167;
                case 207 -> 221;
                case 208 -> 208;
                case 209 -> 102;
                case 210 -> 133;
                case 211 -> 143;
                case 212 -> 16;
                case 213 -> 25;
                case 214 -> 121;
                case 215 -> 119;
                case 216 -> 139;
                case 217 -> 94;
                case 218 -> 38;
                case 219 -> 17;
                case 220 -> 148;
                case 221 -> 165;
                case 222 -> 172;
                case 223 -> 250;
                case 224 -> 101;
                case 225 -> 161;
                case 226 -> 114;
                case 227 -> 56;
                case 228 -> 178;
                case 229 -> 231;
                case 230 -> 255;
                case 231 -> 218;
                case 232 -> 86;
                case 233 -> 141;
                case 234 -> 89;
                case 235 -> 152;
                case 236 -> 15;
                case 237 -> 10;
                case 238 -> 85;
                case 239 -> 60;
                case 240 -> 18;
                case 241 -> 216;
                case 242 -> 185;
                case 243 -> 142;
                case 244 -> 97;
                case 245 -> 197;
                case 246 -> 213;
                case 247 -> 26;
                case 248 -> 70;
                case 249 -> 65;
                case 250 -> 110;
                case 251 -> 189;
                case 252 -> 99;
                case 253 -> 100;
                case 254 -> 238;
                default -> 81;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                char[] cArray2 = cArray;
                char c = cArray[n10];
                if (n9 == 0) {
                    cArray2[n10] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                } else {
                    cArray2[n10] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n8]) & 0xFF;
                }
                ++n8;
            }
            com.github.epsilon.O.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5522;
        if (d[n2] == null) {
            com.github.epsilon.O.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
