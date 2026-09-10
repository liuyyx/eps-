/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.dR;
import com.github.epsilon.dY;
import com.github.epsilon.hi;
import com.github.epsilon.uK;
import com.github.epsilon.zb;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.player.LocalPlayer;

public class zu
extends zb {
    private uK i;
    private static final long[] e;
    private static final Integer[] g;

    /*
     * Exception decompiling
     */
    private void e(Object[] var1_1) {
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
    private void V(Object[] var1_1) {
        block11: {
            block10: {
                block13: {
                    block12: {
                        var2_2 = Dl.t();
                        var3_3 /* !! */  = (zu.b(25349, 9098881884884711072L) + zu.b(10203, 3589414786632053323L) ^ zu.b(7059, 415175835323125277L) ^ zu.b(27595, 8245026772013530652L)) / zu.b(28264, 7120274138700037113L) ^ zu.b(31808, 8379090484684138893L);
                        if (!var2_2) break block12;
lbl5:
                        // 2 sources

                        while (hi.a("\u00e9", (Object)this, (long)1054040699611919570L) != null) {
                            break block10;
                        }
                        break block13;
lbl8:
                        // 1 sources

                        while (true) {
                            v0 = new Object[2];
                            v0[1] = false;
                            v0[0] = hi.a("\u00e9", (Object)this, (long)1054040699611919570L);
                            hi.a("\u00a5", (Object)this, (Object)v0, (long)1205234540094760200L);
                            if (var2_2) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    hi.a("\u00f2", (Object)this, (uK)new uK((float)zu.s("t9l9EHEbNeQCnkV4", getYRot(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L)), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1280994566116072355L)), (long)1054040699611919570L);
                                    hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)603873101947865664L)}, (long)1061116460702592678L);
                                    return;
                                }
                            }
                            break block11;
                            break;
                        }
                    }
lbl20:
                    // 4 sources

                    while (true) {
                        switch (var3_3 /* !! */ ) {
                            default: {
                                ** GOTO lbl5
                            }
                            case -702707468: {
                                ** continue;
                            }
                            case -702707469: {
                                ** continue;
                            }
                            case -702707470: 
                        }
                        hi.a("G", (long)1207087722114992771L);
                        hi.a("G", (long)409074377258406884L);
                        return;
                    }
                }
                var3_3 /* !! */  = zu.b(5224, 8899628156504752615L) / zu.b(7239, 3050592940716739010L) / zu.b(18552, 8545839020101803477L) ^ zu.b(2781, 8253599650871369492L);
                if (!var2_2) ** GOTO lbl20
            }
            var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)zu.b(22870, 5094066174743710872L), (int)zu.b(9378, 5979775484817338729L), (long)834203424483934088L) + zu.b(17978, 716391130533106588L)), (int)zu.b(19893, 2529083855696631849L), (long)834203424483934088L) - zu.b(27707, 9192373407709542796L));
            if (!var2_2) ** GOTO lbl20
        }
        var3_3 /* !! */  = zu.b(25488, 9142221179150153238L) / zu.b(8245, 4929593119175832991L) / zu.b(18552, 8545839020101803477L) ^ zu.b(8036, 482986043576535780L);
        ** while (true)
    }

    @Override
    protected void E(Object[] objectArray) {
        dY dY2 = (dY)objectArray[0];
    }

    @Override
    protected void J(dR dR2) {
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)1054040699611919570L);
        super.J(dR2);
        Object[] objectArray = new Object[2];
        objectArray[1] = true;
        objectArray[0] = callSite;
        hi.a("\u00a5", (Object)this, (Object)objectArray, (long)1205234540094760200L);
    }

    public static /* bridge */ /* synthetic */ CallSite s(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public zu() {
        hi.a("\u00f2", (Object)this, null, (long)1054040699611919570L);
    }

    @Override
    protected void G(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)363161871013737242L);
    }

    @Override
    protected void B() {
        hi.a("\u00f2", (Object)this, null, (long)1054040699611919570L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void w(Object[] var1_1) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            block24: {
                                block16: {
                                    block23: {
                                        block22: {
                                            var3_2 = var1_1[0];
                                            var2_3 = ((Boolean)var1_1[1]).booleanValue();
                                            var4_4 = Dl.t();
                                            var5_5 /* !! */  = (zu.b(20357, 3687971119118391845L) ^ zu.b(15356, 7523502298825420399L)) - zu.b(16597, 3294419107895350649L) ^ zu.b(21510, 3856684694261105044L);
                                            if (!var4_4) break block22;
lbl7:
                                            // 2 sources

                                            while ((uK)var3_2 != null) {
                                                break block16;
                                            }
                                            break block23;
lbl10:
                                            // 1 sources

                                            while (hi.a("\u00e9", (Object)this, (long)1054040699611919570L) != (uK)var3_2) {
                                                break block17;
                                            }
                                            break block24;
lbl13:
                                            // 1 sources

                                            return;
lbl15:
                                            // 1 sources

                                            while (true) {
                                                hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)1054040699611919570L)}, (long)1061116460702592678L);
                                                hi.a("\u00f2", (Object)this, null, (long)1054040699611919570L);
                                                v0 = var2_3;
                                                if (var4_4) break block18;
                                                if (v0 == 0) break block19;
                                                break block20;
                                                break;
                                            }
lbl22:
                                            // 1 sources

                                            while (true) {
                                                hi.a("\u00f2", (Object)this, (boolean)false, (long)482529922368815585L);
                                                hi.a("\u00f2", (Object)this, (int)0, (long)695029997827097638L);
                                                hi.a("\u00f2", (Object)this, (uK)new uK((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)700108823764850555L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1280994566116072355L)), (long)1218226128943805201L);
                                                if (var4_4) lbl-1000:
                                                // 2 sources

                                                {
                                                    return;
                                                }
                                                break block21;
                                                break;
                                            }
                                        }
lbl31:
                                        // 8 sources

                                        while (true) {
                                            switch (var5_5 /* !! */ ) {
                                                default: {
                                                    ** GOTO lbl7
                                                }
                                                case 1609595592: {
                                                    ** GOTO lbl10
                                                }
                                                case 1609595595: {
                                                    ** continue;
                                                }
                                                case 1609595590: {
                                                    ** continue;
                                                }
                                                case 1609595593: {
                                                    ** continue;
                                                }
                                                case 1609595594: {
                                                    ** continue;
                                                }
                                                case 1609595589: 
                                            }
                                            hi.a("G", (long)1254720339774257797L);
                                            zu.s("t9l9EHEbNeQCnkV4", Q());
                                            var5_5 /* !! */  = (int)(hi.a("G", (int)(zu.b(14357, 4490745000438492585L) * zu.b(26369, 5130615193443119782L)), (int)zu.b(20523, 7143287632669902211L), (long)834203424483934088L) - zu.b(27911, 4005113639626979535L));
                                            if (!var4_4) continue;
                                            break;
                                        }
                                    }
                                    var5_5 /* !! */  = zu.b(17907, 7557467240945946687L) / zu.b(26360, 8135623020505903939L) + zu.b(25244, 2900290929650808587L);
                                    if (!var4_4) ** GOTO lbl31
                                }
                                var5_5 /* !! */  = (int)(hi.a("G", (int)(zu.b(5298, 7762282171617493290L) / 3 + zu.b(18773, 57065666990054637L)), (int)zu.b(15399, 9097665296167004548L), (long)834203424483934088L) / zu.b(24355, 1216551769634015926L) - zu.b(5824, 1293748887430316897L));
                                if (!var4_4) ** GOTO lbl31
                            }
                            var5_5 /* !! */  = zu.b(28213, 6242183145232317429L) + zu.b(29833, 674899456775364898L) - zu.b(23110, 4909631201750716399L) - zu.b(21431, 4184484719834433028L) + zu.b(22956, 6155117525329415204L);
                            if (!var4_4) ** GOTO lbl31
                        }
                        var5_5 /* !! */  = zu.b(3848, 2087275730948709002L) / zu.b(27802, 6305884738639575372L) + zu.b(3862, 3957908973397138128L);
                        if (!var4_4) ** GOTO lbl31
                    }
                    v0 = (zu.b(13814, 3399356664179122227L) / 3 ^ zu.b(27183, 5580156037225725850L)) + zu.b(24043, 5931835306989455393L) - zu.b(29311, 5315528423230547938L);
                }
                var5_5 /* !! */  = v0;
                if (!var4_4) ** GOTO lbl31
            }
            var5_5 /* !! */  = (zu.b(31136, 3642152903589768309L) / zu.b(8245, 4929593119175832991L) ^ zu.b(32250, 6195009800131225657L)) - zu.b(28368, 6514004894571215700L) + zu.b(18071, 663766760429327139L);
            if (!var4_4) ** GOTO lbl31
        }
        var5_5 /* !! */  = (zu.b(18800, 8716760476630752417L) / 3 ^ zu.b(18828, 5869316892136610817L)) + zu.b(12900, 1172619500197734375L) - zu.b(7088, 7969570330120146441L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5733325567235519249L;
                var6_1 = new long[86];
                var3_2 = 0;
                var4_3 = "\u009c\u00eb\u0010\u00c3\u00f1\u0000\u00ba\u00da\u00a2\u00f9\u00d1\u00a9\u00be\u00a8.(\u0013a\u009b\u0081\u00a2\u00ab\u00f1\u00e2\u001dVj\u00c2\u00c3\u0018f\u001d\u00e5\u00d3\u001b\u0091\u00b1&!;M\u0018\u0001\b\u00a8\u00f6\u00bd\u0090`\u00d5!T,B\u001c\u00d6\u00d0\u001f\u00cdI\u00dc\u00e0e\u00d0\u00d1\u00d0\u0098\u00d3\u00f0\u000f\u0006\u00070\u009d\u00fa]\u00b0\u0081\u00b6\u00e1\u00f7\u0013aJ\u00a7\u00d3\u0091\u00ecA\u00f3\"\u00be\u00ebFn\u0088\u00f8\u00f7\u0081\u0004\u00fe/\u00cc:\u00ff\u008e\u0080\u008e\u00d8\\\u00de\u00d6e\u00a33\u001fUuX\u0004\u00be\u000fX\u00008j\u00e2\u00d7\u00ed\t\u009b\u00b0\u0097Ty\u00a9\u00cb\u0006U\u009c\u0015\u00f0.\u00cd\t\u00d7\u00b7\u0010\u00ab]\"\u001d\u0097\u00d3\u00d5\u00ee\u0091\u00d2\u00f2\u00b8\u0015q\u008d\u0004\u00ac!H\u00e7\u007f\u00be\u00c1\u00db\u008f\u000b97\u00b1\u007f%:\u00dar\u0085\u00a36\u0090\u00cb\u001e\u00ad\u00d4\u00d4rSp\u00d9\u00ae\u009aVL\u00f4r\u0013J\u0007\u0014\u009e\u0015\u00f8\u00a4y\u00ecm,\u0095>\u00b1{\u00ce\u00d6\u0086)/:\u00b9\r{.1i2\u008b\u0094\u00ca6\u009e;!\u0086w\u0004l\u00a1C\u00b8\u0005\u0007\u0007\u00dc\u00a8\"\u0015zR\u00ee\u00c3\u008d\u0004\u001fc{\u0084\u00fc\u00c9\u00108\u0014\u00b4k\u001cU\u00da\u00af\u0003\u001df\u008b\u009b\u00b2t\u00c6!\u00db\u00a7\u000bU\t\u00cd;\u00fe\u00d9\u00f5\u007f\u009f\u00b7\u0081\u00a2ur\u0095\u0006\u000f\u00ea\u00f5\u00c1\n\u0018\u009f\u00e0\u00c4\u00e3j\u00e0\u00cb\u007fl\n1Jbq\u00a0\u00a0#\u009d\u0084k\u00ee\u00cb\u00f9\u009b\u00fdKIRA\u0090V\u0083}r\u001a\u00ee\u00fa\u000f.\u0085\u00bb\u00d6\u00e7TM\u0019\u00ae\u00f2/X\\\u00f6\b\u0093\u00d6\u001d\u0097\u00888+s\u00a0}\u0087\u00b1\u00c0\u00c3^\u00c0\u00c6\u00dc\u00dc\u00f4\u00e2\u00fb\u0013\u0086\u0087V3\u00ed^\u00e8\u0018\u00a5\u009c\u0085r\u00d9\u000f\u008b\u00fa\u00e6\r\u00e7\u00e9eJ>D\u00bfQ\u00ea\u00a3\u00d7Q\b>\u00cc\u00ddl\u00f8\u00c27\u00f5S\u0099]\u00ea\u00d4\u00f7H\u009b\u00b8Z\u00e1\u0093\u00bc\u00d7[\u00b5\u00f9>\u0086^lx\u00b4\u00d0\u00d7\u00dfq\u00f1,\u00fb\u00fa9y\n,\\S\u009dk\u00a6W\u0014 _\u00e5~\u0091X(4L\u000b!\u0097DW\u00f9\u00ee7-}\u0012C%=\u00a5\u001f\u00f8\u0018\u00e0\u00b5ps\u00ec\u00f4h\u0000\u00c1i{\u0002@B\u00dc\u00947*\u00a1?|\u00cf\u001d]\u00adth\u00f2\u00b9\u00d6\u00ef\u00b7tU@\u00f7\u0002^\u00b5\u00dar0 \u00c0]\u0017\u00f42+\u009d\u0088\u00e8O\u00c6g\u00be\u0003\u00f8\u0085~\u0094\u009a\u00cb\u0010\t\u00f2X\u00b3M\n#\u0085\u00f3c\u000e\u009e\u0093\u00b6\u0007\u00c1*\u00dfX\u0093\u00e0\u0013\u00ed!2\u008b\u00f8\u0083%m+\u00a1\u0092q-\u00a1\u00afe\u0098\u00d1$\u0086\u00a3V\u00a8r\u00a1\u0096\u0092\u00eb9\r\u00d0\u008ca1\u00e6j\u00e2V\u00a8`A\u00be\u00c4o\"\b\u001f\u00ce&\u001d\u001d\u00c6\u0017@@\u00c0\u008e\u0011\u0088\u00ffB\u0083s\u0010\u00ae\u00ad\u0013\u00c0~\u00b6z\u00ceJ\u0089C\u00b9\u00b2\u00b4\b_:V\u00d3r^r\u00a2\u00be\u008a\u0005LJ\u0099\u0097\u00caM";
                var5_4 = "\u009c\u00eb\u0010\u00c3\u00f1\u0000\u00ba\u00da\u00a2\u00f9\u00d1\u00a9\u00be\u00a8.(\u0013a\u009b\u0081\u00a2\u00ab\u00f1\u00e2\u001dVj\u00c2\u00c3\u0018f\u001d\u00e5\u00d3\u001b\u0091\u00b1&!;M\u0018\u0001\b\u00a8\u00f6\u00bd\u0090`\u00d5!T,B\u001c\u00d6\u00d0\u001f\u00cdI\u00dc\u00e0e\u00d0\u00d1\u00d0\u0098\u00d3\u00f0\u000f\u0006\u00070\u009d\u00fa]\u00b0\u0081\u00b6\u00e1\u00f7\u0013aJ\u00a7\u00d3\u0091\u00ecA\u00f3\"\u00be\u00ebFn\u0088\u00f8\u00f7\u0081\u0004\u00fe/\u00cc:\u00ff\u008e\u0080\u008e\u00d8\\\u00de\u00d6e\u00a33\u001fUuX\u0004\u00be\u000fX\u00008j\u00e2\u00d7\u00ed\t\u009b\u00b0\u0097Ty\u00a9\u00cb\u0006U\u009c\u0015\u00f0.\u00cd\t\u00d7\u00b7\u0010\u00ab]\"\u001d\u0097\u00d3\u00d5\u00ee\u0091\u00d2\u00f2\u00b8\u0015q\u008d\u0004\u00ac!H\u00e7\u007f\u00be\u00c1\u00db\u008f\u000b97\u00b1\u007f%:\u00dar\u0085\u00a36\u0090\u00cb\u001e\u00ad\u00d4\u00d4rSp\u00d9\u00ae\u009aVL\u00f4r\u0013J\u0007\u0014\u009e\u0015\u00f8\u00a4y\u00ecm,\u0095>\u00b1{\u00ce\u00d6\u0086)/:\u00b9\r{.1i2\u008b\u0094\u00ca6\u009e;!\u0086w\u0004l\u00a1C\u00b8\u0005\u0007\u0007\u00dc\u00a8\"\u0015zR\u00ee\u00c3\u008d\u0004\u001fc{\u0084\u00fc\u00c9\u00108\u0014\u00b4k\u001cU\u00da\u00af\u0003\u001df\u008b\u009b\u00b2t\u00c6!\u00db\u00a7\u000bU\t\u00cd;\u00fe\u00d9\u00f5\u007f\u009f\u00b7\u0081\u00a2ur\u0095\u0006\u000f\u00ea\u00f5\u00c1\n\u0018\u009f\u00e0\u00c4\u00e3j\u00e0\u00cb\u007fl\n1Jbq\u00a0\u00a0#\u009d\u0084k\u00ee\u00cb\u00f9\u009b\u00fdKIRA\u0090V\u0083}r\u001a\u00ee\u00fa\u000f.\u0085\u00bb\u00d6\u00e7TM\u0019\u00ae\u00f2/X\\\u00f6\b\u0093\u00d6\u001d\u0097\u00888+s\u00a0}\u0087\u00b1\u00c0\u00c3^\u00c0\u00c6\u00dc\u00dc\u00f4\u00e2\u00fb\u0013\u0086\u0087V3\u00ed^\u00e8\u0018\u00a5\u009c\u0085r\u00d9\u000f\u008b\u00fa\u00e6\r\u00e7\u00e9eJ>D\u00bfQ\u00ea\u00a3\u00d7Q\b>\u00cc\u00ddl\u00f8\u00c27\u00f5S\u0099]\u00ea\u00d4\u00f7H\u009b\u00b8Z\u00e1\u0093\u00bc\u00d7[\u00b5\u00f9>\u0086^lx\u00b4\u00d0\u00d7\u00dfq\u00f1,\u00fb\u00fa9y\n,\\S\u009dk\u00a6W\u0014 _\u00e5~\u0091X(4L\u000b!\u0097DW\u00f9\u00ee7-}\u0012C%=\u00a5\u001f\u00f8\u0018\u00e0\u00b5ps\u00ec\u00f4h\u0000\u00c1i{\u0002@B\u00dc\u00947*\u00a1?|\u00cf\u001d]\u00adth\u00f2\u00b9\u00d6\u00ef\u00b7tU@\u00f7\u0002^\u00b5\u00dar0 \u00c0]\u0017\u00f42+\u009d\u0088\u00e8O\u00c6g\u00be\u0003\u00f8\u0085~\u0094\u009a\u00cb\u0010\t\u00f2X\u00b3M\n#\u0085\u00f3c\u000e\u009e\u0093\u00b6\u0007\u00c1*\u00dfX\u0093\u00e0\u0013\u00ed!2\u008b\u00f8\u0083%m+\u00a1\u0092q-\u00a1\u00afe\u0098\u00d1$\u0086\u00a3V\u00a8r\u00a1\u0096\u0092\u00eb9\r\u00d0\u008ca1\u00e6j\u00e2V\u00a8`A\u00be\u00c4o\"\b\u001f\u00ce&\u001d\u001d\u00c6\u0017@@\u00c0\u008e\u0011\u0088\u00ffB\u0083s\u0010\u00ae\u00ad\u0013\u00c0~\u00b6z\u00ceJ\u0089C\u00b9\u00b2\u00b4\b_:V\u00d3r^r\u00a2\u00be\u008a\u0005LJ\u0099\u0097\u00caM".length();
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
                    var4_3 = "mk4\u0005\u0010\u000f\u00c5D\u00ec\u00ed\u00fb\u00b3\u00bf6\u0095w";
                    var5_4 = "mk4\u0005\u0010\u000f\u00c5D\u00ec\u00ed\u00fb\u00b3\u00bf6\u0095w".length();
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
        zu.e = var6_1;
        zu.g = new Integer[86];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5585;
        if (g[n2] == null) {
            zu.g[n2] = (int)(e[n2] ^ l);
        }
        return g[n2];
    }
}
