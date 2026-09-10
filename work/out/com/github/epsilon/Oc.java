/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.User
 */
package com.github.epsilon;

import com.github.epsilon.DJ;
import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.nV;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.client.User;

public class Oc
extends nV<Oc> {
    private String v;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Exception decompiling
     */
    private String G(Object[] var1_1) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean z() {
        block14: {
            var1_1 = Dl.S();
            var2_2 /* !! */  = Oc.T("h37n21GYL6wPzw5g", max(int int ), (int)Oc.b(30321, 3122112432963370241L), (int)Oc.b(19233, 4385202806434496615L)) - Oc.b(32131, 7674306978627040995L) - Oc.b(10268, 6085518627734872945L) - Oc.b(13781, 6772210548222983831L);
            if (var1_1) ** GOTO lbl13
            block8: while (true) {
                block17: {
                    block16: {
                        block15: {
                            hi.a("\u00f2", (Object)this, (String)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)841484151702340439L), (long)1006316378754764054L);
                            if (!var1_1) break block15;
                            if (hi.a("\u00e9", (Object)this, (long)1006316378754764054L) != null) break block16;
                            var2_2 /* !! */  = (reference)(Oc.b(13631, 6469963529258368538L) / Oc.b(17098, 2815070032067004828L) * Oc.b(5491, 6565752612751990283L) * Oc.b(16652, 7989301430050425442L) - Oc.b(307, 8349091167857232500L));
                        }
                        if (var1_1) break block17;
                    }
                    var2_2 /* !! */  = (reference)(hi.a("G", (int)(Oc.b(31261, 7278602734124052815L) + Oc.b(5858, 3517685815833288077L)), (int)Oc.b(27494, 5441202118309388304L), (long)834203424483934088L) ^ Oc.b(9990, 8418640925545786442L) ^ Oc.b(28318, 1495850559778629069L));
                }
                switch (var2_2 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case 56584553: {
                        v0 = true;
                        var2_2 /* !! */  = (reference)(Oc.b(11727, 4957461274537387709L) * Oc.b(7316, 5068267022934005713L) ^ Oc.b(12068, 6081360225749984328L));
                        if (!var1_1) {
                            break block8;
                        }
                        break block14;
                    }
                    case 56584552: {
                        v0 = false;
                        if (var1_1) break block8;
                        return v0;
                    }
                    case 56584551: {
                        hi.a("G", (int)0, (long)661332433958006309L);
                        hi.a("G", (long)659151967568421102L);
                        return (boolean)Oc.T("h37n21GYL6wPzw5g", H(int int ), (int)2, (int)Oc.b(25915, 6851807945453809246L));
                    }
                }
                break;
            }
            var2_2 /* !! */  = (reference)(Oc.b(12314, 2297525099036998491L) * Oc.b(1526, 8113110275159510677L) ^ Oc.b(2447, 844275169688699629L));
        }
        switch (var2_2 /* !! */ ) {
            default: {
                return v0;
            }
            case 9479252: 
        }
        return false;
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

    public Oc(String string) {
        super((DJ)((Object)hi.a("j", (long)874965402212012820L)), string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public boolean e(Object[] objectArray) {
        boolean bl = Dl.S();
        int n = Oc.b(18401, 3977513505830341825L) * Oc.b(28206, 8372957573631944051L) ^ Oc.b(10928, 6246924784173048282L);
        boolean bl2 = true;
        block5: while (true) {
            reference var3_4;
            block8: {
                block9: {
                    if (bl2 && !(bl2 = false) && bl) break block8;
                    if (hi.a("\u00e9", (Object)this, (long)1006316378754764054L) == null) break block9;
                    var3_4 = (hi.a("G", (int)Oc.b(29378, 5394237583940401591L), (int)Oc.b(6738, 2881416209900163335L), (long)834203424483934088L) - Oc.b(29028, 211589361420810810L) + Oc.b(90, 8925910135191685906L)) / Oc.b(12510, 2566028371129826234L) - Oc.b(7535, 200075907825096239L);
                    if (bl) break block8;
                }
                var3_4 = hi.a("G", (int)hi.a("G", (int)Oc.b(4501, 4871540342695942849L), (int)Oc.b(7387, 1901176272744699780L), (long)834203424483934088L), (int)Oc.b(11208, 8389524308466917555L), (long)834203424483934088L) + Oc.b(9236, 8261571899423747888L) - Oc.b(24382, 4325969604917040239L);
            }
            switch (var3_4) {
                default: {
                    continue block5;
                }
                case -1132721111: {
                    return false;
                }
                case -1132721109: {
                    super.e(new Object[0]);
                    hi.a("G", (Object)new User((String)((Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)806520782816175070L), (long)487305887145600804L)), (UUID)((Object)hi.a("G", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)806520782816175070L), (long)719730683012248778L), (long)1216268965136849390L)), (String)((Object)hi.a("\u00e9", (Object)this, (long)1006316378754764054L)), (Optional)((Object)hi.a("G", (long)856831910629242918L)), (Optional)((Object)hi.a("G", (long)856831910629242918L))), (long)432297434808268700L);
                    return true;
                }
                case -1132721110: 
            }
            break;
        }
        throw null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean equals(Object var1_1) {
        var2_2 = Dl.t();
        var4_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)(hi.a("G", (int)Oc.b(3532, 7897108780479760042L), (int)Oc.b(28501, 8387027530034750473L), (long)834203424483934088L) + Oc.b(18980, 6347249252358488332L)), (int)Oc.b(7830, 7373438744100066777L), (long)834203424483934088L), (int)Oc.b(17689, 7403993917558754930L), (long)834203424483934088L) + Oc.b(28355, 3675870441205441920L);
        if (!var2_2) ** GOTO lbl14
        block8: while (true) {
            block13: {
                block12: {
                    block11: {
                        v0 = var1_1 instanceof Oc;
                        if (var2_2) break block11;
                        if (v0 != 0) break block12;
                        v0 = Oc.b(16715, 6482657120246172264L) / Oc.b(15204, 2139080922718203946L) * Oc.b(27734, 5458524340713957233L) / Oc.b(14620, 7577018934409818747L) - Oc.b(1074, 776458113817563003L);
                    }
                    var4_3 /* !! */  = (reference)v0;
                    if (!var2_2) break block13;
                }
                var4_3 /* !! */  = (reference)((Oc.b(4540, 2664515231871228609L) - Oc.b(14184, 2964149936375168027L)) * Oc.b(26992, 5543857672420336219L) / Oc.b(22402, 4607498812587646150L) + Oc.b(24192, 4315681914419025401L) - Oc.b(15046, 8246434342543094244L));
            }
            switch (var4_3 /* !! */ ) {
                default: {
                    continue block8;
                }
                case 2103259710: {
                    var3_4 = (Oc)var1_1;
                    if (!var2_2) break block8;
                    return false;
                }
                case 2103259708: {
                    return false;
                }
                case 2103259709: {
                    Oc.T("h37n21GYL6wPzw5g", B());
                    hi.a("G", (long)723518858017143060L);
                    return true;
                }
            }
            break;
        }
        var4_3 /* !! */  = (reference)(Oc.b(10874, 2312654586782343424L) + Oc.b(8104, 8394318938211079382L) + Oc.b(10639, 5684224871308845762L));
        v1 /* !! */  = var4_3 /* !! */ ;
        if (var2_2 != false) return (boolean)v1 /* !! */ ;
        switch (v1 /* !! */ ) {
            default: {
                return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)var3_4, (long)485708115055468696L), (Object)hi.a("\u00e9", (Object)this, (long)485708115055468696L), (long)734234975012314075L);
            }
            case -912265488: 
        }
        hi.a("G", (long)661981318591720701L);
        v1 /* !! */  = (reference)false;
        return (boolean)v1 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2136296249100385296L;
                var6_1 = new long[75];
                var3_2 = 0;
                var4_3 = "\u007f,\u00e2q9\u00d1}\u00d1\u00e8!\u001d|FvY QI\u00f3\u00a9\u009b\u0006\u009a\u001c;\u00b5\u00a4\u00fao6O\u00de\u00db\u00d6i\u00e5\u0097Y\u0092D\u00a9$\u00fd\u00fa\u00fed\u00c7\u00ac<\u00f1\u00ab\u001a\u00cfGNl\u00fa\u0012\u0007\u0012\u00a0\u001f\u00d8\u00c8\u00c9\u00d7\u0086\u0004&\r\u00af\u00ae\u0082\u0099\u00fc\u00bc\u00f3y\u00aa\u00c6\u00f3\u00ca\r\u00d3\u00d7\u00e6\u00bc\u00b8\u0083\u00c2!\u00aaE\u00b71\u0096\u00fdB@\u00ff<W\u00b3\u00bc3\u00fa\u00d5\u00d7\u00e5\u00c8i{\u0081\u0095\u0015\u0092\u00a2SnW\u00bcKI\u0004X\u00b99A\u009e\u0089t\u00e1[@\u0094\u00ae\u00c0N\u008f'/\u0018\u008b\u0000N\u00d2\u0083\u00db\u00a4P\u001c\u00c8[\u00f2\u0085\u00e1\u00ac\u00a6\u00a6K\u00b90L\u0094`\u0093&;\"\u0019j\u0083\u00ce\u001er\u00ca\u000eB\u00b2}\u00a4\u0089(\u00ac6|\u00d2Dz\\^\u00e3\u0093\u00a9\u00ca\u0018T3\u00db1\u00ce \u00b7Qi}\u00e2\u0014\u00f2 \u0016Yo\u00d3B\u00a9\u001e{-\u0090;u\u000f{\u00f9\u001cY\u00c5\u008f\u00f0'\u00d8\u0002O\u00f7T,\u008c;\u00f6b\u0018*n\u00c5*\u0097 \u00c7m\u00a0V\u00d4\u00ec\u0080\u00bdio\u00b7\u008cB\u008c;\u00ad\u00deX\f\t\u009d\u0095\u00bc!!\u00fd\u0088|8\u00eeg\tWd\u00c2\u00a3P\u0018a\u001c\u007f\u00f0\u0005^\u00d5\u00bc\u0003X\u0005\u00ed\u00a0\u009d\u009d\u00f2\u00a0\u00df\u00ae\u0017\u00a5\u000b\u00100<!\u007f\u00f6\u00a0\u00f6r>q\u00c2\u000ex\u00bc\u0002T\u00eb\u00fa8Swc?3\u00cf\u0010\u00eb}\u00b2~_\u00c9Xm\u0007\u00e3D\u00fd@R&\u001f\u00d2`z\u00cf\u009a\u008c\u009d\u00ea\u00d9\u007f/\u0085 \u0089\u008aXgo\u00f16\u00d8\u0012\u00b9\u00dak\u00cd\u00ad\u00b9\u00f3\u00a6\u00ceL*\u00e2\u00ee\u0090p?\u0010\u0013\u00e0p\u00b1<N-<N!%\u00c7\u00fe7\u0098q\u00bc\u00ddx\u00ea\\}\u00d1\u00d79\u00d5\u0001\u00f6B\u0004\u00e1\u00f3\u00b9mN6\u00b9K\u00fb\f\u00a5\u0000\u00beI\u00f1Cb\u0000P\u00d5\u0090]\u00ae\u000f\u00c9\u00935\u0082\u00e4;\u00f5\u00b7\u00eb\u00b3\u0094\u008a\u00e5\u00e5\"\u00cd\u001d\u00a9\u00a2\u00c6b\u00d9\u00e6\u00d3VFh\u0096\u00c8\u00d3\u0000\u00a5\n\u0082\u00dd\u00eb\u00cb\u00f6 ?\u008e\u00a2\u00f2v\u0093\u00f0\u00ae\u00d5\u00b91\u00bd\u00d0Lt`\u00c8\u000b\u00e6g:a\u00a1\u0081\u0085*\u0005;\u00e49M\u00fe\u00ea\u00c2w\u00adA\u00f2;^[\u0081F\u00dbu\u00df\u00b5\u00b5\u00b6\u00ddYy\u00d7\u0012\u00ec\u0006\u00af\u00e3\u009b\u00d5\u00cb\u0081\u00c6\u0002t\u007f\u00f9\u00ce;\u0081\u0096\u00dag\u000f\u0004\u00fa\u009e\u00d2\u000f\u0091\u00f3\u00d8X\u00f7\n\u0084\u0002\u00c9g\u0086\u00b4\u00b3\u0089@\u00c3s\u00a9\u00e1*\u00e9)";
                var5_4 = "\u007f,\u00e2q9\u00d1}\u00d1\u00e8!\u001d|FvY QI\u00f3\u00a9\u009b\u0006\u009a\u001c;\u00b5\u00a4\u00fao6O\u00de\u00db\u00d6i\u00e5\u0097Y\u0092D\u00a9$\u00fd\u00fa\u00fed\u00c7\u00ac<\u00f1\u00ab\u001a\u00cfGNl\u00fa\u0012\u0007\u0012\u00a0\u001f\u00d8\u00c8\u00c9\u00d7\u0086\u0004&\r\u00af\u00ae\u0082\u0099\u00fc\u00bc\u00f3y\u00aa\u00c6\u00f3\u00ca\r\u00d3\u00d7\u00e6\u00bc\u00b8\u0083\u00c2!\u00aaE\u00b71\u0096\u00fdB@\u00ff<W\u00b3\u00bc3\u00fa\u00d5\u00d7\u00e5\u00c8i{\u0081\u0095\u0015\u0092\u00a2SnW\u00bcKI\u0004X\u00b99A\u009e\u0089t\u00e1[@\u0094\u00ae\u00c0N\u008f'/\u0018\u008b\u0000N\u00d2\u0083\u00db\u00a4P\u001c\u00c8[\u00f2\u0085\u00e1\u00ac\u00a6\u00a6K\u00b90L\u0094`\u0093&;\"\u0019j\u0083\u00ce\u001er\u00ca\u000eB\u00b2}\u00a4\u0089(\u00ac6|\u00d2Dz\\^\u00e3\u0093\u00a9\u00ca\u0018T3\u00db1\u00ce \u00b7Qi}\u00e2\u0014\u00f2 \u0016Yo\u00d3B\u00a9\u001e{-\u0090;u\u000f{\u00f9\u001cY\u00c5\u008f\u00f0'\u00d8\u0002O\u00f7T,\u008c;\u00f6b\u0018*n\u00c5*\u0097 \u00c7m\u00a0V\u00d4\u00ec\u0080\u00bdio\u00b7\u008cB\u008c;\u00ad\u00deX\f\t\u009d\u0095\u00bc!!\u00fd\u0088|8\u00eeg\tWd\u00c2\u00a3P\u0018a\u001c\u007f\u00f0\u0005^\u00d5\u00bc\u0003X\u0005\u00ed\u00a0\u009d\u009d\u00f2\u00a0\u00df\u00ae\u0017\u00a5\u000b\u00100<!\u007f\u00f6\u00a0\u00f6r>q\u00c2\u000ex\u00bc\u0002T\u00eb\u00fa8Swc?3\u00cf\u0010\u00eb}\u00b2~_\u00c9Xm\u0007\u00e3D\u00fd@R&\u001f\u00d2`z\u00cf\u009a\u008c\u009d\u00ea\u00d9\u007f/\u0085 \u0089\u008aXgo\u00f16\u00d8\u0012\u00b9\u00dak\u00cd\u00ad\u00b9\u00f3\u00a6\u00ceL*\u00e2\u00ee\u0090p?\u0010\u0013\u00e0p\u00b1<N-<N!%\u00c7\u00fe7\u0098q\u00bc\u00ddx\u00ea\\}\u00d1\u00d79\u00d5\u0001\u00f6B\u0004\u00e1\u00f3\u00b9mN6\u00b9K\u00fb\f\u00a5\u0000\u00beI\u00f1Cb\u0000P\u00d5\u0090]\u00ae\u000f\u00c9\u00935\u0082\u00e4;\u00f5\u00b7\u00eb\u00b3\u0094\u008a\u00e5\u00e5\"\u00cd\u001d\u00a9\u00a2\u00c6b\u00d9\u00e6\u00d3VFh\u0096\u00c8\u00d3\u0000\u00a5\n\u0082\u00dd\u00eb\u00cb\u00f6 ?\u008e\u00a2\u00f2v\u0093\u00f0\u00ae\u00d5\u00b91\u00bd\u00d0Lt`\u00c8\u000b\u00e6g:a\u00a1\u0081\u0085*\u0005;\u00e49M\u00fe\u00ea\u00c2w\u00adA\u00f2;^[\u0081F\u00dbu\u00df\u00b5\u00b5\u00b6\u00ddYy\u00d7\u0012\u00ec\u0006\u00af\u00e3\u009b\u00d5\u00cb\u0081\u00c6\u0002t\u007f\u00f9\u00ce;\u0081\u0096\u00dag\u000f\u0004\u00fa\u009e\u00d2\u000f\u0091\u00f3\u00d8X\u00f7\n\u0084\u0002\u00c9g\u0086\u00b4\u00b3\u0089@\u00c3s\u00a9\u00e1*\u00e9)".length();
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
                    var4_3 = "U\u00bd-\u00bd\u00c5+\u0084\u00bab,\u009f\u00e0g\u00f8\u00f4\u008a";
                    var5_4 = "U\u00bd-\u00bd\u00c5+\u0084\u00bab,\u009f\u00e0g\u00f8\u00f4\u008a".length();
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
        Oc.c = var6_1;
        Oc.d = new Integer[75];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B61;
        if (d[n2] == null) {
            Oc.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
