/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.protocol.Packet
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon._U;
import com.github.epsilon.hi;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.LinkedBlockingQueue;
import net.minecraft.network.protocol.Packet;

public class gH {
    public boolean m;
    public final LinkedBlockingQueue<Packet<?>> b = new LinkedBlockingQueue();
    static boolean t;
    public static final gH v;
    private static final String[] a;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    /*
     * Exception decompiling
     */
    public void x(Object[] var1_1) {
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

    @yE
    private void i(_U _U2) {
        hi.a("\u00d2", (boolean)true, (long)955360830219725138L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1192956842696608702L);
    }

    public void s(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1192956842696608702L);
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
                    var10_2 = "\u00eef\u0012\u001c\u00fc\u00aa\r\u00c4\u00c2\u00ef\u00fa(\u00d1\u0097q\u00e3\u00b7\u00b4^\u009e\u0094";
                    var12_3 = "\u00eef\u0012\u001c\u00fc\u00aa\r\u00c4\u00c2\u00ef\u00fa(\u00d1\u0097q\u00e3\u00b7\u00b4^\u009e\u0094".length();
                    var9_4 = 2;
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
                    v4 = 91;
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
                                    v11 = 43;
                                    break;
                                }
                                case 1: {
                                    v11 = 91;
                                    break;
                                }
                                case 2: {
                                    v11 = 55;
                                    break;
                                }
                                case 3: {
                                    v11 = 118;
                                    break;
                                }
                                case 4: {
                                    v11 = 30;
                                    break;
                                }
                                case 5: {
                                    v11 = 87;
                                    break;
                                }
                                default: {
                                    v11 = 47;
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
                gH.a = var13;
                gH.c = new String[2];
                var0_7 = 2126739671098270859L;
                var6_8 = new long[87];
                var3_9 = 0;
                var4_10 = "\u009d\u00cd\u000e\u0096\u0097'\u009b\u0095\u00af\u0000\u00d6\u00dfe\u00fch\u009a-\u0018\u0019w$K\u009d\u00d5I\u00d2\u00c5\u008b\u00c8\u00e7\u0085J\u0018\u00eb\u00c6\u00ee\u00baB\u0005\u0006y\u0013\u00ec\u00b1J,\u0018\tS\u0019Z\u00e8%(W\u0015\u00b8!WB\u00b4j<AL\u008c\u00e6\u00a9%\u00af#S^\u0084h\u00f4<\u00b5\u00f9\u00f5<E\u008f\u0000&\u00cf\u0019\u008b\u00f4\u00ff\u00bb\u00edC\u00ae\u0016\u00d4\u00c8\u000e\u001e\f\u00a1V\u001d\u008c\\\u001aL\u00a1S\u00890\u0087\u0093\u001ba\u00a1\u00fa\t\u0097\u0002\u00bd\u00c8\u00e6\u00dd\u00b6s\u00b4\u001a\u00c9)Nz\u00b6%(\u00e8\u001fz\u0090/s\u00b0\u00c3c\u00e1\u00d1\u009f\u0096p\u00f2\u00bf\u0080\u0006'\u00f1\u00ff\u000b\u0013\u00ec\u0007[\n\u0006\u00e4\u00cbx\u00a9Y,j\u00fe\u00b2\u00a7\u0017I\u00df\u00b7js\u00aej\u0005\u008a]+\u00bd)\u00193\u00b7\u00d2\u00b6\u00cc\u000f\u008a\f\u00a1\u00a4f4\u00fb\u00ae\u00da\u009c\u00fd^\u00c0\u008f\u00e2c\u00e7\u008e\u00c2\u00e2&i\u00b1\u0091\u0094'\u00af\u0088\u00cb\u00a65\u0000S\u00dd\u00b3\u000f\u001a5\u00df\u0013h\u00afH4\u00d1\u0096I$\u0085\u009f4`,\u0098\u0018G\u00b0n\u00c9:\u00af\u00945(\u00f1\u00066\u001e9'\u00f5\u0089\u00a1\u0098\u008c\u0006\u00da\u00b1\u0088Q\u00e5\u00cbg\u00cbI\u00cfpzu\u00a9^\u00a4D\u0089\u0012\u00a8J\\X\u00b2E\u00ff\u00a1\u0004\u00e4^+\u00db\u00f6v\u0093r X#\u00de\u00bd\u00f9\u00be\u001e\u0086H\u00fa\u009a\u00fd\u00d1u (~\r.\u00abQ\u009f\u00ff\u0004\u001b-R'\u00d5\u00d1c\u000e\u008e\u0013#\u00eeH1\u008bF\u0005\u00ea\u0093\u001d\u00f5\u0012\u008c\u00aer\u00ea\u00da\u0099Q\u00f7'a\u00e8*\u0093\u0002u\u00c4\\\"\u0089j\u00ea\u00d3\u00f4\u00a3Ds\u00e9j\u0094\u00f6R\u00e7\u00b8:I\u00c9J\u008c\u00be*\u009awV\u0002@8\u0012\u0006\u0017uG\u00ed@\u0010Jw\u00c4\u0088\u00b9\u00fc\u009833\u00f4\u00dd\u009f\u00c6s\u00d2?\u00d36\u00b6\u00eb\u00c0y\u00e28\u001a~\u00c6+\u00e8\u009a\u00e50\u00e6L\u001bzR\u00ea\u00a1CuM\u00b5\u009dSS\u001b\u009b>\u00aac4k\u00bf\u009a\u008e]\u00b4\rl.\u00db\u00dd\u00c7\u00d1\u00afz\bX\u00d4j@D\u0014\u00b3N\u009d_<%\u00c4\u00b2\u00e9o\u00f9Z?\u000e\u00f9\u0088\u00ea~\u00b1\u00a5\u00da\u00fe\u00eb\u00d3a\u00bd\u001c\u00dc]t\u00a3\u00d3JB\u0005\u008a\u0007\u00eeN\u00f5\u00c7_+\u000b\u00a7\u00c6Q\u0083\u0099D\u00da\u0003\u0091\u0087\u0092*~]\u00ae\u0098\u00a4\u008a'\u009bjb\u00d9\u0003\u0084\u0084~n\u00c7\u00d6\u009d\u00ffB\u0096\u00cd\u00aetQ\u00f8\u00c4|/\u00b5\u00b1\u00ad\u0013\n\u00ff\u00e9\u0013\u00b9\u0098\u00ce}\u0011\u0019\u00e2m\u001dm\u0011\u0095\u0092\u00e0j\u00b3\u00f7\u00d0\u0019\u00b1\u0007\u00cf\u0003\u00bf\u00e1\u00ca\u0098\u00ea(r\u00dd\u000e\u00ae\u0014\u00cf-\u00b2\u00d5\u0088\n\u00f4\u00ffv\u00ad\u0017\u00ea\u0001o1r\u009f21\u0015\u00c7-\u0080$\u00cd8m_\u0082\bZ\u00df8+\u00c2Sg\u00f9\u00da\u00ff\u00e8\u00b1\u00a4;$m\u00e5R\u00f2\r[\u0016\u00ac\u00e2\u000f\u0098\u00a547\u0012\u00eb\u00c1\u00f6\u00a2\u0087\u00bf{\u00c3$\u0091\u00fe";
                var5_11 = "\u009d\u00cd\u000e\u0096\u0097'\u009b\u0095\u00af\u0000\u00d6\u00dfe\u00fch\u009a-\u0018\u0019w$K\u009d\u00d5I\u00d2\u00c5\u008b\u00c8\u00e7\u0085J\u0018\u00eb\u00c6\u00ee\u00baB\u0005\u0006y\u0013\u00ec\u00b1J,\u0018\tS\u0019Z\u00e8%(W\u0015\u00b8!WB\u00b4j<AL\u008c\u00e6\u00a9%\u00af#S^\u0084h\u00f4<\u00b5\u00f9\u00f5<E\u008f\u0000&\u00cf\u0019\u008b\u00f4\u00ff\u00bb\u00edC\u00ae\u0016\u00d4\u00c8\u000e\u001e\f\u00a1V\u001d\u008c\\\u001aL\u00a1S\u00890\u0087\u0093\u001ba\u00a1\u00fa\t\u0097\u0002\u00bd\u00c8\u00e6\u00dd\u00b6s\u00b4\u001a\u00c9)Nz\u00b6%(\u00e8\u001fz\u0090/s\u00b0\u00c3c\u00e1\u00d1\u009f\u0096p\u00f2\u00bf\u0080\u0006'\u00f1\u00ff\u000b\u0013\u00ec\u0007[\n\u0006\u00e4\u00cbx\u00a9Y,j\u00fe\u00b2\u00a7\u0017I\u00df\u00b7js\u00aej\u0005\u008a]+\u00bd)\u00193\u00b7\u00d2\u00b6\u00cc\u000f\u008a\f\u00a1\u00a4f4\u00fb\u00ae\u00da\u009c\u00fd^\u00c0\u008f\u00e2c\u00e7\u008e\u00c2\u00e2&i\u00b1\u0091\u0094'\u00af\u0088\u00cb\u00a65\u0000S\u00dd\u00b3\u000f\u001a5\u00df\u0013h\u00afH4\u00d1\u0096I$\u0085\u009f4`,\u0098\u0018G\u00b0n\u00c9:\u00af\u00945(\u00f1\u00066\u001e9'\u00f5\u0089\u00a1\u0098\u008c\u0006\u00da\u00b1\u0088Q\u00e5\u00cbg\u00cbI\u00cfpzu\u00a9^\u00a4D\u0089\u0012\u00a8J\\X\u00b2E\u00ff\u00a1\u0004\u00e4^+\u00db\u00f6v\u0093r X#\u00de\u00bd\u00f9\u00be\u001e\u0086H\u00fa\u009a\u00fd\u00d1u (~\r.\u00abQ\u009f\u00ff\u0004\u001b-R'\u00d5\u00d1c\u000e\u008e\u0013#\u00eeH1\u008bF\u0005\u00ea\u0093\u001d\u00f5\u0012\u008c\u00aer\u00ea\u00da\u0099Q\u00f7'a\u00e8*\u0093\u0002u\u00c4\\\"\u0089j\u00ea\u00d3\u00f4\u00a3Ds\u00e9j\u0094\u00f6R\u00e7\u00b8:I\u00c9J\u008c\u00be*\u009awV\u0002@8\u0012\u0006\u0017uG\u00ed@\u0010Jw\u00c4\u0088\u00b9\u00fc\u009833\u00f4\u00dd\u009f\u00c6s\u00d2?\u00d36\u00b6\u00eb\u00c0y\u00e28\u001a~\u00c6+\u00e8\u009a\u00e50\u00e6L\u001bzR\u00ea\u00a1CuM\u00b5\u009dSS\u001b\u009b>\u00aac4k\u00bf\u009a\u008e]\u00b4\rl.\u00db\u00dd\u00c7\u00d1\u00afz\bX\u00d4j@D\u0014\u00b3N\u009d_<%\u00c4\u00b2\u00e9o\u00f9Z?\u000e\u00f9\u0088\u00ea~\u00b1\u00a5\u00da\u00fe\u00eb\u00d3a\u00bd\u001c\u00dc]t\u00a3\u00d3JB\u0005\u008a\u0007\u00eeN\u00f5\u00c7_+\u000b\u00a7\u00c6Q\u0083\u0099D\u00da\u0003\u0091\u0087\u0092*~]\u00ae\u0098\u00a4\u008a'\u009bjb\u00d9\u0003\u0084\u0084~n\u00c7\u00d6\u009d\u00ffB\u0096\u00cd\u00aetQ\u00f8\u00c4|/\u00b5\u00b1\u00ad\u0013\n\u00ff\u00e9\u0013\u00b9\u0098\u00ce}\u0011\u0019\u00e2m\u001dm\u0011\u0095\u0092\u00e0j\u00b3\u00f7\u00d0\u0019\u00b1\u0007\u00cf\u0003\u00bf\u00e1\u00ca\u0098\u00ea(r\u00dd\u000e\u00ae\u0014\u00cf-\u00b2\u00d5\u0088\n\u00f4\u00ffv\u00ad\u0017\u00ea\u0001o1r\u009f21\u0015\u00c7-\u0080$\u00cd8m_\u0082\bZ\u00df8+\u00c2Sg\u00f9\u00da\u00ff\u00e8\u00b1\u00a4;$m\u00e5R\u00f2\r[\u0016\u00ac\u00e2\u000f\u0098\u00a547\u0012\u00eb\u00c1\u00f6\u00a2\u0087\u00bf{\u00c3$\u0091\u00fe".length();
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
                    var4_10 = "\r-=\\\u00fc$\u001b2\u00dc\u00f1mI\u00f2\u00e5\u0081\u0016";
                    var5_11 = "\r-=\\\u00fc$\u001b2\u00dc\u00f1mI\u00f2\u00e5\u0081\u0016".length();
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
        gH.d = var6_8;
        gH.e = new Integer[87];
        gH.v = new gH();
    }

    public static /* bridge */ /* synthetic */ CallSite O(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private gH() {
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1192956842696608702L);
        hi.a("\u00a5", (Object)hi.a("j", (long)519102950410566293L), (Object)this, (long)817797371366047544L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean A(Object[] var1_1) {
        block20: {
            block23: {
                block19: {
                    block22: {
                        block21: {
                            var2_2 = (Packet)var1_1[0];
                            var3_3 = Dl.S();
                            var4_4 /* !! */  = hi.a("G", (int)gH.a(18411, 5562834303847281221L), (int)gH.a(28968, 6714592078997128387L), (long)834203424483934088L) * gH.a(30826, 5287695943089327612L) / gH.a(18348, 5440167679896433225L) ^ gH.a(24228, 5830178907617110802L) ^ gH.a(6924, 5917974970644983451L);
                            if (var3_3) break block21;
lbl6:
                            // 2 sources

                            while (true) {
                                v0 = hi.a("j", (long)955360830219725138L);
                                if (!var3_3) ** GOTO lbl60
                                if (v0 == false) ** GOTO lbl59
                                ** GOTO lbl62
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)668882249025243283L);
                                hi.a("\u00d2", (boolean)false, (long)955360830219725138L);
                                return false;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)1192956842696608702L);
                                if (!var3_3) ** GOTO lbl65
                                if (v1 /* !! */  != false) ** GOTO lbl64
                                ** GOTO lbl67
                                break;
                            }
lbl20:
                            // 1 sources

                            return false;
lbl22:
                            // 1 sources

                            while (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) != null) {
                                break block19;
                            }
                            break block22;
lbl25:
                            // 1 sources

                            while (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L) == null) {
                                break block20;
                            }
                            break block23;
lbl28:
                            // 1 sources

                            return false;
lbl30:
                            // 1 sources

                            while (true) {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)752486790053838499L), (Object)var2_2, (long)989132260762557845L);
                                return true;
                            }
                        }
lbl35:
                        // 5 sources

                        while (true) {
                            switch (var4_4 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 1558360200: {
                                    ** continue;
                                }
                                case 1558360196: {
                                    ** continue;
                                }
                                case 1558360192: {
                                    ** continue;
                                }
                                case 1558360199: {
                                    ** GOTO lbl22
                                }
                                case 1558360195: {
                                    ** GOTO lbl25
                                }
                                case 1558360197: {
                                    ** continue;
                                }
                                case 1558360193: {
                                    ** continue;
                                }
                                case 1558360194: 
                            }
                            gH.O("W56BqV64VttwdwcK", I());
                            var4_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(gH.a(8527, 4543418199526298814L) + gH.a(32663, 3473750815924488707L)), (int)gH.a(8676, 8290892023060649048L), (long)834203424483934088L) ^ gH.a(28426, 3394817075455007484L)), (int)gH.a(6229, 8084703734157667799L), (long)834203424483934088L) + gH.a(6647, 2037950617425931287L));
                            if (var3_3) continue;
lbl59:
                            // 2 sources

                            v0 = gH.O("W56BqV64VttwdwcK", max(int int ), (int)gH.a(24100, 803008855725288360L), (int)gH.a(28253, 7472502236840729551L)) * gH.a(13386, 9161281936609100231L) * gH.a(24381, 427314280362584739L) + gH.a(12331, 1409181220215997864L);
lbl60:
                            // 2 sources

                            var4_4 /* !! */  = (int)v0;
                            if (var3_3) continue;
lbl62:
                            // 2 sources

                            var4_4 /* !! */  = (gH.a(20163, 5476597094500416357L) * gH.a(20091, 6373957088420772833L) * gH.a(12365, 7134330495716574703L) - gH.a(12279, 8256126823211194958L)) * gH.a(31593, 3658554633989426881L) - gH.a(22427, 7777374299082236430L);
                            if (var3_3) continue;
lbl64:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(gH.a(19327, 2178081043637550750L) + gH.a(5162, 2111564059517739461L) - gH.a(30404, 6982092251125678880L) ^ gH.a(27371, 4348245668406599542L));
lbl65:
                            // 2 sources

                            var4_4 /* !! */  = (int)v1 /* !! */ ;
                            if (var3_3) continue;
lbl67:
                            // 2 sources

                            var4_4 /* !! */  = gH.a(14204, 555002216208253646L) / gH.a(24392, 5502534800131599057L) - gH.a(17407, 3717983165875205749L) ^ gH.a(30933, 2594108162667384123L);
                            if (var3_3) continue;
                            break;
                        }
                    }
                    var4_4 /* !! */  = gH.a(5329, 8794090920373346662L) - gH.a(779, 7411910538596185747L) - gH.a(7440, 5816896757445322925L);
                    if (var3_3) ** GOTO lbl35
                }
                var4_4 /* !! */  = (int)(hi.a("G", (int)(gH.a(21122, 2275586550345606961L) / gH.a(11474, 2332873972071389525L) - gH.a(8591, 7975677310006776887L) + gH.a(843, 8724579748726666936L)), (int)gH.a(27128, 5015461963374599241L), (long)834203424483934088L) + gH.a(11892, 6717565678284987343L));
                if (var3_3) ** GOTO lbl35
            }
            var4_4 /* !! */  = ((gH.a(15626, 2461936152433576065L) ^ gH.a(17575, 6167814115287609664L)) - gH.a(27127, 8449116680238668893L) ^ gH.a(25456, 1527244344001500878L)) - gH.a(21024, 5152283972661127125L);
            if (var3_3) ** GOTO lbl35
        }
        var4_4 /* !! */  = gH.a(19656, 2285251603238271268L) - gH.a(15861, 342766889138145385L) - gH.a(19275, 2861513033082158761L);
        ** while (true)
    }

    public void i(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (boolean)true, (long)1192956842696608702L);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFBAA9) & 0xFFFF;
        if (c[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 47;
                case 1 -> 50;
                case 2 -> 108;
                case 3 -> 45;
                case 4 -> 77;
                case 5 -> 11;
                case 6 -> 190;
                case 7 -> 156;
                case 8 -> 232;
                case 9 -> 154;
                case 10 -> 180;
                case 11 -> 159;
                case 12 -> 18;
                case 13 -> 217;
                case 14 -> 31;
                case 15 -> 221;
                case 16 -> 210;
                case 17 -> 52;
                case 18 -> 131;
                case 19 -> 178;
                case 20 -> 176;
                case 21 -> 86;
                case 22 -> 80;
                case 23 -> 125;
                case 24 -> 9;
                case 25 -> 146;
                case 26 -> 27;
                case 27 -> 152;
                case 28 -> 179;
                case 29 -> 189;
                case 30 -> 67;
                case 31 -> 187;
                case 32 -> 188;
                case 33 -> 193;
                case 34 -> 202;
                case 35 -> 2;
                case 36 -> 40;
                case 37 -> 127;
                case 38 -> 172;
                case 39 -> 70;
                case 40 -> 87;
                case 41 -> 109;
                case 42 -> 59;
                case 43 -> 135;
                case 44 -> 1;
                case 45 -> 42;
                case 46 -> 122;
                case 47 -> 247;
                case 48 -> 235;
                case 49 -> 198;
                case 50 -> 167;
                case 51 -> 39;
                case 52 -> 20;
                case 53 -> 14;
                case 54 -> 60;
                case 55 -> 89;
                case 56 -> 182;
                case 57 -> 243;
                case 58 -> 62;
                case 59 -> 215;
                case 60 -> 163;
                case 61 -> 124;
                case 62 -> 4;
                case 63 -> 55;
                case 64 -> 54;
                case 65 -> 111;
                case 66 -> 168;
                case 67 -> 74;
                case 68 -> 162;
                case 69 -> 17;
                case 70 -> 79;
                case 71 -> 49;
                case 72 -> 134;
                case 73 -> 33;
                case 74 -> 58;
                case 75 -> 228;
                case 76 -> 150;
                case 77 -> 36;
                case 78 -> 185;
                case 79 -> 117;
                case 80 -> 15;
                case 81 -> 130;
                case 82 -> 65;
                case 83 -> 147;
                case 84 -> 149;
                case 85 -> 194;
                case 86 -> 28;
                case 87 -> 204;
                case 88 -> 216;
                case 89 -> 191;
                case 90 -> 73;
                case 91 -> 69;
                case 92 -> 112;
                case 93 -> 245;
                case 94 -> 6;
                case 95 -> 116;
                case 96 -> 118;
                case 97 -> 237;
                case 98 -> 41;
                case 99 -> 249;
                case 100 -> 205;
                case 101 -> 121;
                case 102 -> 177;
                case 103 -> 169;
                case 104 -> 21;
                case 105 -> 78;
                case 106 -> 71;
                case 107 -> 10;
                case 108 -> 142;
                case 109 -> 174;
                case 110 -> 171;
                case 111 -> 23;
                case 112 -> 66;
                case 113 -> 239;
                case 114 -> 105;
                case 115 -> 222;
                case 116 -> 24;
                case 117 -> 201;
                case 118 -> 192;
                case 119 -> 246;
                case 120 -> 35;
                case 121 -> 213;
                case 122 -> 57;
                case 123 -> 184;
                case 124 -> 211;
                case 125 -> 123;
                case 126 -> 255;
                case 127 -> 158;
                case 128 -> 81;
                case 129 -> 141;
                case 130 -> 82;
                case 131 -> 114;
                case 132 -> 199;
                case 133 -> 244;
                case 134 -> 98;
                case 135 -> 220;
                case 136 -> 107;
                case 137 -> 231;
                case 138 -> 72;
                case 139 -> 46;
                case 140 -> 53;
                case 141 -> 96;
                case 142 -> 155;
                case 143 -> 145;
                case 144 -> 250;
                case 145 -> 84;
                case 146 -> 115;
                case 147 -> 143;
                case 148 -> 164;
                case 149 -> 252;
                case 150 -> 120;
                case 151 -> 214;
                case 152 -> 92;
                case 153 -> 218;
                case 154 -> 137;
                case 155 -> 183;
                case 156 -> 240;
                case 157 -> 51;
                case 158 -> 139;
                case 159 -> 110;
                case 160 -> 206;
                case 161 -> 16;
                case 162 -> 238;
                case 163 -> 76;
                case 164 -> 241;
                case 165 -> 68;
                case 166 -> 136;
                case 167 -> 19;
                case 168 -> 195;
                case 169 -> 83;
                case 170 -> 106;
                case 171 -> 94;
                case 172 -> 186;
                case 173 -> 7;
                case 174 -> 129;
                case 175 -> 56;
                case 176 -> 227;
                case 177 -> 157;
                case 178 -> 101;
                case 179 -> 104;
                case 180 -> 166;
                case 181 -> 38;
                case 182 -> 100;
                case 183 -> 173;
                case 184 -> 8;
                case 185 -> 0;
                case 186 -> 12;
                case 187 -> 22;
                case 188 -> 175;
                case 189 -> 91;
                case 190 -> 63;
                case 191 -> 208;
                case 192 -> 75;
                case 193 -> 138;
                case 194 -> 225;
                case 195 -> 170;
                case 196 -> 203;
                case 197 -> 148;
                case 198 -> 207;
                case 199 -> 44;
                case 200 -> 160;
                case 201 -> 99;
                case 202 -> 226;
                case 203 -> 197;
                case 204 -> 223;
                case 205 -> 29;
                case 206 -> 165;
                case 207 -> 103;
                case 208 -> 230;
                case 209 -> 251;
                case 210 -> 242;
                case 211 -> 85;
                case 212 -> 254;
                case 213 -> 48;
                case 214 -> 97;
                case 215 -> 161;
                case 216 -> 236;
                case 217 -> 95;
                case 218 -> 88;
                case 219 -> 102;
                case 220 -> 5;
                case 221 -> 37;
                case 222 -> 26;
                case 223 -> 126;
                case 224 -> 219;
                case 225 -> 61;
                case 226 -> 229;
                case 227 -> 113;
                case 228 -> 151;
                case 229 -> 90;
                case 230 -> 3;
                case 231 -> 233;
                case 232 -> 43;
                case 233 -> 13;
                case 234 -> 209;
                case 235 -> 30;
                case 236 -> 212;
                case 237 -> 248;
                case 238 -> 224;
                case 239 -> 119;
                case 240 -> 32;
                case 241 -> 234;
                case 242 -> 153;
                case 243 -> 196;
                case 244 -> 181;
                case 245 -> 200;
                case 246 -> 253;
                case 247 -> 132;
                case 248 -> 64;
                case 249 -> 128;
                case 250 -> 133;
                case 251 -> 140;
                case 252 -> 144;
                case 253 -> 25;
                case 254 -> 34;
                default -> 93;
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
            gH.c[n3] = new String(cArray).intern();
        }
        return c[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x75A0;
        if (e[n2] == null) {
            gH.e[n2] = (int)(d[n2] ^ l);
        }
        return e[n2];
    }
}
