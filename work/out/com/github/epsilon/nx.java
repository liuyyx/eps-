/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.minecraft.client.User
 */
package com.github.epsilon;

import com.github.epsilon.DJ;
import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.nV;
import com.github.epsilon.zy;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.client.User;

public class nx
extends nV<nx>
implements zy {
    private String V;
    private static final String[] c;
    private static final String[] d;
    private static final long[] g;
    private static final Integer[] h;

    @Override
    public String g(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)1214486646089219874L);
    }

    public nx a(Object[] objectArray) {
        JsonObject jsonObject = (JsonObject)objectArray[0];
        super.f(jsonObject);
        hi.a("\u00f2", (Object)this, (String)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)jsonObject, (Object)nx.b(22490, -19916), (long)762969773812762396L), (long)444304451125411138L)), (long)1214486646089219874L);
        return this;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean z() {
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
    @Override
    public boolean e(Object[] var1_1) {
        block14: {
            block12: {
                block13: {
                    block11: {
                        block16: {
                            block15: {
                                var2_2 = Dl.S();
                                var3_3 /* !! */  = hi.a("G", (int)nx.b(2075, 321676306242902409L), (int)nx.b(18409, 8321628669289387647L), (long)834203424483934088L) * nx.b(25880, 479056211748222116L) * nx.b(1727, 5496941435373131563L) - nx.b(28355, 1410904445730291516L) + nx.b(11588, 7749788243616480475L);
                                if (var2_2) break block15;
lbl5:
                                // 2 sources

                                while (hi.a("\u00e9", (Object)this, (long)1214486646089219874L) != null) {
                                    break block11;
                                }
                                break block16;
lbl8:
                                // 1 sources

                                while (true) {
                                    v0 /* !! */  = nx.S("FA6hPb4WYba0ULdt", isBlank(), (String)hi.a("\u00e9", (Object)this, (long)1214486646089219874L));
                                    if (!var2_2) break block12;
                                    if (v0 /* !! */  == false) break block13;
                                    break block14;
                                    break;
                                }
lbl13:
                                // 1 sources

                                return false;
lbl15:
                                // 2 sources

                                while (true) {
                                    super.e(new Object[0]);
                                    hi.a("G", (Object)new User((String)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)806520782816175070L), (long)487305887145600804L), (UUID)hi.a("G", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)806520782816175070L), (long)719730683012248778L), (long)1216268965136849390L), (String)hi.a("\u00e9", (Object)this, (long)1214486646089219874L), (Optional)hi.a("G", (long)856831910629242918L), (Optional)hi.a("G", (long)856831910629242918L)), (long)432297434808268700L);
                                    return true;
                                }
                            }
lbl21:
                            // 5 sources

                            while (true) {
                                switch (var3_3 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl5
                                    }
                                    case -154043803: {
                                        ** continue;
                                    }
                                    case -154043805: {
                                        ** continue;
                                    }
                                    case -154043807: {
                                        ** GOTO lbl15
                                    }
                                    case -154043806: 
                                }
                                hi.a("G", (long)632688375482250411L);
                                if (!var2_2) ** break;
                                break;
                            }
                            ** while (true)
                        }
                        var3_3 /* !! */  = (CallSite)(nx.b(17830, 3764556209472001143L) * nx.b(13046, 7837473501637157704L) * nx.b(2011, 6080439831615641094L) + nx.b(17694, 2864529284609070213L));
                        if (var2_2) ** GOTO lbl21
                    }
                    var3_3 /* !! */  = (CallSite)(hi.a("G", (int)(hi.a("G", (int)(nx.b(10253, 7174480060066544060L) * nx.b(3231, 6985930080358669605L)), (int)nx.b(16770, 5831345336420454492L), (long)834203424483934088L) * nx.b(7017, 1320164011185310387L)), (int)nx.b(31245, 8263738518369987523L), (long)834203424483934088L) ^ nx.b(4150, 4887733301941535154L));
                    if (var2_2) ** GOTO lbl21
                }
                v0 /* !! */  = var3_3 /* !! */  = (CallSite)(nx.b(14431, 6007071472181750183L) ^ nx.b(25673, 5125197093845104097L) ^ nx.b(20653, 6146659300796416379L));
            }
            if (var2_2) ** GOTO lbl21
        }
        var3_3 /* !! */  = (CallSite)(nx.b(10664, 2572112307185072225L) * nx.b(7781, 2907603978295513026L) * nx.b(7948, 7784247813324836509L) + nx.b(4226, 2443364816749265201L));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean equals(Object var1_1) {
        var2_2 = Dl.t();
        var4_3 = (nx.b(289, 3315489918763798756L) ^ nx.b(2830, 2705893631462939299L)) * nx.b(26603, 2632058008094373417L) - nx.b(5794, 4321169280173803297L);
        if (!var2_2) ** GOTO lbl13
        block8: while (true) {
            block17: {
                block16: {
                    block15: {
                        v0 = var1_1 instanceof nx;
                        if (var2_2) break block15;
                        if (v0) break block16;
                        v0 = var4_3 = nx.b(10862, 3780440194247572423L) * nx.b(28879, 6256780769454612832L) * nx.b(31168, 3320820932721829975L) - nx.b(19714, 1051942963885989057L) ^ nx.b(9593, 2928069613829960947L);
                    }
                    if (!var2_2) break block17;
                }
                var4_3 = (nx.b(25701, 1280884972531054044L) / 5 ^ nx.b(31247, 6474838154260278222L)) + nx.b(25164, 8675054047136379841L);
            }
            block9: while (true) {
                switch (var4_3) {
                    default: {
                        continue block8;
                    }
                    case -560280508: {
                        var3_4 = (nx)var1_1;
                        if (var2_2) {
                            return false;
                        }
                        ** GOTO lbl29
                    }
                    case -560280505: {
                        hi.a("G", (long)1072168011298293672L);
                        var4_3 = (nx.b(12209, 4062825215786171981L) - nx.b(13675, 1309948703440381107L) ^ nx.b(19441, 3503061466519755346L)) - nx.b(18215, 5621958949402826471L);
                        continue block9;
                    }
lbl29:
                    // 1 sources

                    var4_3 = nx.b(27475, 3986009453933132500L) / 4 + nx.b(25485, 6852334906586657282L) ^ nx.b(24129, 3317830204316864403L);
                    v1 = var4_3;
                    if (var2_2 != false) return v1;
                    switch (v1) {
                        default: {
                            return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)var3_4, (long)485708115055468696L), (Object)hi.a("\u00e9", (Object)this, (long)485708115055468696L), (long)734234975012314075L);
                        }
                        case 657539016: 
                    }
                    nx.S("FA6hPb4WYba0ULdt", H(int ), (int)nx.b(9847, 6083613998990636995L));
                    return false;
                    case -560280507: 
                }
                break;
            }
            break;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public nx(String string) {
        super((DJ)((Object)hi.a("j", (long)1231058544381614959L)), string);
        hi.a("\u00f2", (Object)this, (String)string, (long)1214486646089219874L);
    }

    @Override
    public void O(Object[] objectArray) {
        JsonObject jsonObject = (JsonObject)objectArray[0];
        super.O(new Object[]{jsonObject});
        hi.a("\u00a5", (Object)jsonObject, (Object)nx.b(22488, -14551), (Object)hi.a("\u00e9", (Object)this, (long)1214486646089219874L), (long)853340881431046684L);
    }

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
                        var10_2 = "\u00edX\u0013\u00ae/\u001d\u00b6\u00df\u00ff{\u000e\u008a?H\u00f7w\u00d2q\u00ef'\u00aa\u00cd\u00a8\u00bc\u001e6\u00c2W|VC\u00a48\b\u0012";
                        var12_3 = "\u00edX\u0013\u00ae/\u001d\u00b6\u00df\u00ff{\u000e\u008a?H\u00f7w\u00d2q\u00ef'\u00aa\u00cd\u00a8\u00bc\u001e6\u00c2W|VC\u00a48\b\u0012".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 13;
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
                            var10_2 = "\u001cq\u00d7qM3\u00062\u0014t\u00d4\u00f1)\u00eb\u00ff\u0002c\u00cf~\u00fa\u00e6\u000f\u00d9\u00e2\u008a=\u00e9\u00f9\u00d3\u0095}8O\u00a7\u0012b\u00f9p\u0082\u0098|7P\u0002r$\u001b_\u00dd\u001f\u00f4\u00e3P\u001d`\u00e2\\";
                            var12_3 = "\u001cq\u00d7qM3\u00062\u0014t\u00d4\u00f1)\u00eb\u00ff\u0002c\u00cf~\u00fa\u00e6\u000f\u00d9\u00e2\u008a=\u00e9\u00f9\u00d3\u0095}8O\u00a7\u0012b\u00f9p\u0082\u0098|7P\u0002r$\u001b_\u00dd\u001f\u00f4\u00e3P\u001d`\u00e2\\".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 121;
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
                                    v15 = 117;
                                    break;
                                }
                                case 1: {
                                    v15 = 101;
                                    break;
                                }
                                case 2: {
                                    v15 = 61;
                                    break;
                                }
                                case 3: {
                                    v15 = 66;
                                    break;
                                }
                                case 4: {
                                    v15 = 46;
                                    break;
                                }
                                case 5: {
                                    v15 = 37;
                                    break;
                                }
                                default: {
                                    v15 = 18;
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
                nx.c = var13;
                nx.d = new String[4];
                var0_7 = 5394715068208973587L;
                var6_8 = new long[104];
                var3_9 = 0;
                var4_10 = "\u00ceg\u00f8\u0089lq\u00b5\u001b\u00f5/\u00b4\u001e{\u00bc\u00c2\u0093\u008c\u009e\u00a8M\u00e9J\u00d0\u0005H\u00ff `\u00db\u00e4\u0096\u00b4?z\u00c7\u00b2\u00d8J\u00c0-c\u0000c\u000b\u0004\u008e\u00d4\u00ef\u00e1\u00c1\u0098\u00a2\u00e0.uf\u00e8\u009b]\u00c5\u00c5&\u001f\u0092\u00d1\u00a9\u00c3]\b\u00a4\u00ae\u000b\u00f7\u009f\u00ff\u008a\u0010m8c\u0081\u00ffP$W0l\u00a7S\u0018\u00b5\u00a2\u00b5`\u0084\u00f7\u00f2.\u00070\u00f4\u0087\u00f6\u00da\u0084lSu\u00e4\u0002\u00ea#\u0098\u009c+ a\u00bf>cB3)a=\u0081\u0010\u0086\u00b7\u00e4M\u008a\u0002\u00c8\u00aa&\u0014\\55V\u00b2`A\u0015\u00c8(\u00b0B\u0004\u00e0hK9\u00c7\u0018M\u00aa\u009f\u0010\u00ebl\u008d\u00a8\u008d\u0091\u00f4\u00e0\u0095\u00a3\u00a8\b\u00a2y\u0004N\u00ce\r\u008dq\u0000Ke\u00b3\u00e1\u001c\u007fNU\u00e2\u00a4\u008b \u0096\u00e2\u0088\u00a7D\u00c1\u0007\u0002\u00e1\u00af\u00c6\u00d3\u0001w\u009e\u00c2\u0016#\u00d2\u0004\u008d\u00e5\u0095\u00fb]\u0096N\u0002F\u00d9wj\u00a1\u00edH\u00a6\u00a3\u001a\u0080to\u00ca\u00e6\u00d3c$<h\u008c]\u00da\u00e5\u0081\u00d5\u0085Y\u008bL\u008f\u00c6\u00a4\u00e5\u0010\u00d8u\u0000\u00d5\u0015\u00ba\u00c8AvP\u0013\r\u00a9\u0094\u00d3\u00a3\u00e4\u00e1\u00bb>j\u00c1]\u00e0\u0006\u00d5zt\u00f0H\u00e4\u0097\u0016\u00e3\u00c6\u008f\u00db\u008a\u008f\u0085Y3\u00b0\u001ciG\u008e&l\u0080Y/H`G\u00a0\u00b5\u0005\u0015\u0086\u0017\u00eb\u0099\u0092BW\u00f2\u00edp\u007f[;Rb\u00e4\u0086\u009b\u00fe\u0004\u00f9L\u00c8\u00d4\u00b2\u0007\u009e\u0005\u00b1\u00fei\u00b3\u00f5\u00c2]\u00b3:m\u00c0\u00b5\u00f6\u00ea\u00da\u00d1G\u00e0\u0014\u00d5A\u0089e38\u00cdO\u00a9\nct)\f\u00b5\u00c6\u00bf\u0085D\u00da\u00d7\u00d59\u00eee\b\u0004S\u00bf?\u00e2\u00fe\u00ab\u0016z\u00bc*\u00f1\u00d2\u00e0P\u00f6n\u00f5\u009c\u0096\u00a5\u00fc\b\u00ac\u0013\u00f1\u00af#\u00a2\u0015'\u00e11\u00ce\u00df\u0087\u0011r1mi\u00fe/k\u008e\u0086\u00eb\u0006i)M\u0002c\u0013\u00eb\u00d7\u00b4\u0006u\u00d4rY$\u0080'\u008c\u00f1\u0004\u00aa\u00eeY\b\u00b1\u00cd\u00b2-;v\u00d1\u00e7\u00e6)`r`\u00ecd%Z-+\u009e\u000f\u00ebt\u0016\u00b8\u0005\u00e8\u00fd\u00d8\u00c2\u00b4\u00b04\u0015fe\u00ce\u0090\u00f9`\u00d7\u00a45\u0018\u00f2w9\u00b7[\"\u0088\u00f8\u00f9\u0012@\u00be\u00fe\u00a0\u00ee\u0081Ioc\u00ee\u0011\u0010v\u00b7UF\u0089c\u00f7\u00d9\u00ef\u0089\u00ac\u009dEdI.{K\u0096\u00c6\u00ceD\u0005\u00e46\u0090&#5Q6\u0007J\u00bc!Y\u00ce.\u00ca\u00a3z\u00ef\r\u001bc\u00e9\u00e7\u009e\u0092\u00ac\u00fc\u0084S\u00b0S\u00f7ctK|\u009e\u00a8ac\u00d0\u00a6\u00ff8vd2f-dE\u0084\u0088\u0010\u00d1\u00df\u00cd\u00fa\u0016e\u00f0?\u001cAX\u009a\u00d5\u0084\u009d\u00fd\u00cb\u00dc\u0011\u0085e\u000e&b\u00f1\u00c97\u00ee\u0015\u0014\b\u0090\u009b\u00f5o\ft\u00e7\u0003\u00ee\tK\u008fbN\u0012$\u0083-\u00b3e\u000e0\u0096\u00e3\u0089\u009b\u0000\u0093T\u0089\u00c3w\u000e:\u00a9\\Z\u00a3\u00f1c0\u00b5\u00a3R\u0083\u00e3:r;\u00e1\u00b5W\u0014:\u009d\u009eg*a\u008d\u00fc8HJ\u009f\u00ae\u00874(T\u00d9\u00b6\u00a3\u0090\u0084\u00f8M\u0012\u00fd\nz\u00eb\u00fbD\u009b\u00ea3_\u00a1\u00ed\u00c6\u00f0\u001a\u00f4w\u00a7xzrjW\u0013Dj\u0091\u00d5Z5A\u00fb\u00c5-\u00e3\"\u00a4\u001fT\u00c0\u00c7\u00d4nf\u0085\u00fd\u0082\u008b\u00bf\u0007`b\u00c7\u0096\u00a6\u008f\u00f8I\u00dbD\u00b3\u00cb\u00a7\u001e9\u00cb\u00ba\u008c\u0087\u00a5\u00b2\u00f4\u00eb4;q]\u00ae\u000f\u00ed\u007f\u00f5$\u0091x\u00d9\u00a2\u009f\u00ca\u0017\u00af\u00cc\u00c5\u00a2\u001e\u0089\u00e6lT\u00e2\u000f\u0000@";
                var5_11 = "\u00ceg\u00f8\u0089lq\u00b5\u001b\u00f5/\u00b4\u001e{\u00bc\u00c2\u0093\u008c\u009e\u00a8M\u00e9J\u00d0\u0005H\u00ff `\u00db\u00e4\u0096\u00b4?z\u00c7\u00b2\u00d8J\u00c0-c\u0000c\u000b\u0004\u008e\u00d4\u00ef\u00e1\u00c1\u0098\u00a2\u00e0.uf\u00e8\u009b]\u00c5\u00c5&\u001f\u0092\u00d1\u00a9\u00c3]\b\u00a4\u00ae\u000b\u00f7\u009f\u00ff\u008a\u0010m8c\u0081\u00ffP$W0l\u00a7S\u0018\u00b5\u00a2\u00b5`\u0084\u00f7\u00f2.\u00070\u00f4\u0087\u00f6\u00da\u0084lSu\u00e4\u0002\u00ea#\u0098\u009c+ a\u00bf>cB3)a=\u0081\u0010\u0086\u00b7\u00e4M\u008a\u0002\u00c8\u00aa&\u0014\\55V\u00b2`A\u0015\u00c8(\u00b0B\u0004\u00e0hK9\u00c7\u0018M\u00aa\u009f\u0010\u00ebl\u008d\u00a8\u008d\u0091\u00f4\u00e0\u0095\u00a3\u00a8\b\u00a2y\u0004N\u00ce\r\u008dq\u0000Ke\u00b3\u00e1\u001c\u007fNU\u00e2\u00a4\u008b \u0096\u00e2\u0088\u00a7D\u00c1\u0007\u0002\u00e1\u00af\u00c6\u00d3\u0001w\u009e\u00c2\u0016#\u00d2\u0004\u008d\u00e5\u0095\u00fb]\u0096N\u0002F\u00d9wj\u00a1\u00edH\u00a6\u00a3\u001a\u0080to\u00ca\u00e6\u00d3c$<h\u008c]\u00da\u00e5\u0081\u00d5\u0085Y\u008bL\u008f\u00c6\u00a4\u00e5\u0010\u00d8u\u0000\u00d5\u0015\u00ba\u00c8AvP\u0013\r\u00a9\u0094\u00d3\u00a3\u00e4\u00e1\u00bb>j\u00c1]\u00e0\u0006\u00d5zt\u00f0H\u00e4\u0097\u0016\u00e3\u00c6\u008f\u00db\u008a\u008f\u0085Y3\u00b0\u001ciG\u008e&l\u0080Y/H`G\u00a0\u00b5\u0005\u0015\u0086\u0017\u00eb\u0099\u0092BW\u00f2\u00edp\u007f[;Rb\u00e4\u0086\u009b\u00fe\u0004\u00f9L\u00c8\u00d4\u00b2\u0007\u009e\u0005\u00b1\u00fei\u00b3\u00f5\u00c2]\u00b3:m\u00c0\u00b5\u00f6\u00ea\u00da\u00d1G\u00e0\u0014\u00d5A\u0089e38\u00cdO\u00a9\nct)\f\u00b5\u00c6\u00bf\u0085D\u00da\u00d7\u00d59\u00eee\b\u0004S\u00bf?\u00e2\u00fe\u00ab\u0016z\u00bc*\u00f1\u00d2\u00e0P\u00f6n\u00f5\u009c\u0096\u00a5\u00fc\b\u00ac\u0013\u00f1\u00af#\u00a2\u0015'\u00e11\u00ce\u00df\u0087\u0011r1mi\u00fe/k\u008e\u0086\u00eb\u0006i)M\u0002c\u0013\u00eb\u00d7\u00b4\u0006u\u00d4rY$\u0080'\u008c\u00f1\u0004\u00aa\u00eeY\b\u00b1\u00cd\u00b2-;v\u00d1\u00e7\u00e6)`r`\u00ecd%Z-+\u009e\u000f\u00ebt\u0016\u00b8\u0005\u00e8\u00fd\u00d8\u00c2\u00b4\u00b04\u0015fe\u00ce\u0090\u00f9`\u00d7\u00a45\u0018\u00f2w9\u00b7[\"\u0088\u00f8\u00f9\u0012@\u00be\u00fe\u00a0\u00ee\u0081Ioc\u00ee\u0011\u0010v\u00b7UF\u0089c\u00f7\u00d9\u00ef\u0089\u00ac\u009dEdI.{K\u0096\u00c6\u00ceD\u0005\u00e46\u0090&#5Q6\u0007J\u00bc!Y\u00ce.\u00ca\u00a3z\u00ef\r\u001bc\u00e9\u00e7\u009e\u0092\u00ac\u00fc\u0084S\u00b0S\u00f7ctK|\u009e\u00a8ac\u00d0\u00a6\u00ff8vd2f-dE\u0084\u0088\u0010\u00d1\u00df\u00cd\u00fa\u0016e\u00f0?\u001cAX\u009a\u00d5\u0084\u009d\u00fd\u00cb\u00dc\u0011\u0085e\u000e&b\u00f1\u00c97\u00ee\u0015\u0014\b\u0090\u009b\u00f5o\ft\u00e7\u0003\u00ee\tK\u008fbN\u0012$\u0083-\u00b3e\u000e0\u0096\u00e3\u0089\u009b\u0000\u0093T\u0089\u00c3w\u000e:\u00a9\\Z\u00a3\u00f1c0\u00b5\u00a3R\u0083\u00e3:r;\u00e1\u00b5W\u0014:\u009d\u009eg*a\u008d\u00fc8HJ\u009f\u00ae\u00874(T\u00d9\u00b6\u00a3\u0090\u0084\u00f8M\u0012\u00fd\nz\u00eb\u00fbD\u009b\u00ea3_\u00a1\u00ed\u00c6\u00f0\u001a\u00f4w\u00a7xzrjW\u0013Dj\u0091\u00d5Z5A\u00fb\u00c5-\u00e3\"\u00a4\u001fT\u00c0\u00c7\u00d4nf\u0085\u00fd\u0082\u008b\u00bf\u0007`b\u00c7\u0096\u00a6\u008f\u00f8I\u00dbD\u00b3\u00cb\u00a7\u001e9\u00cb\u00ba\u008c\u0087\u00a5\u00b2\u00f4\u00eb4;q]\u00ae\u000f\u00ed\u007f\u00f5$\u0091x\u00d9\u00a2\u009f\u00ca\u0017\u00af\u00cc\u00c5\u00a2\u001e\u0089\u00e6lT\u00e2\u000f\u0000@".length();
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
                    var4_10 = "<\u00c6\u00a3Y\u00f6\u00car\u0016\u00b6\n\u00cf\u00c8\u0082c\u0006$";
                    var5_11 = "<\u00c6\u00a3Y\u00f6\u00car\u0016\u00b6\n\u00cf\u00c8\u0082c\u0006$".length();
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
        nx.g = var6_8;
        nx.h = new Integer[104];
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x57DA) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 25;
                case 1 -> 231;
                case 2 -> 39;
                case 3 -> 47;
                case 4 -> 21;
                case 5 -> 82;
                case 6 -> 163;
                case 7 -> 29;
                case 8 -> 224;
                case 9 -> 88;
                case 10 -> 33;
                case 11 -> 4;
                case 12 -> 135;
                case 13 -> 84;
                case 14 -> 23;
                case 15 -> 105;
                case 16 -> 197;
                case 17 -> 218;
                case 18 -> 79;
                case 19 -> 179;
                case 20 -> 188;
                case 21 -> 217;
                case 22 -> 189;
                case 23 -> 139;
                case 24 -> 42;
                case 25 -> 6;
                case 26 -> 190;
                case 27 -> 161;
                case 28 -> 98;
                case 29 -> 63;
                case 30 -> 242;
                case 31 -> 20;
                case 32 -> 91;
                case 33 -> 60;
                case 34 -> 131;
                case 35 -> 27;
                case 36 -> 120;
                case 37 -> 185;
                case 38 -> 160;
                case 39 -> 223;
                case 40 -> 70;
                case 41 -> 95;
                case 42 -> 119;
                case 43 -> 183;
                case 44 -> 204;
                case 45 -> 222;
                case 46 -> 153;
                case 47 -> 180;
                case 48 -> 147;
                case 49 -> 152;
                case 50 -> 114;
                case 51 -> 173;
                case 52 -> 73;
                case 53 -> 110;
                case 54 -> 2;
                case 55 -> 234;
                case 56 -> 90;
                case 57 -> 61;
                case 58 -> 210;
                case 59 -> 194;
                case 60 -> 11;
                case 61 -> 13;
                case 62 -> 45;
                case 63 -> 1;
                case 64 -> 140;
                case 65 -> 164;
                case 66 -> 128;
                case 67 -> 237;
                case 68 -> 37;
                case 69 -> 74;
                case 70 -> 134;
                case 71 -> 203;
                case 72 -> 176;
                case 73 -> 50;
                case 74 -> 226;
                case 75 -> 151;
                case 76 -> 196;
                case 77 -> 193;
                case 78 -> 232;
                case 79 -> 209;
                case 80 -> 127;
                case 81 -> 8;
                case 82 -> 138;
                case 83 -> 100;
                case 84 -> 254;
                case 85 -> 56;
                case 86 -> 230;
                case 87 -> 150;
                case 88 -> 14;
                case 89 -> 58;
                case 90 -> 102;
                case 91 -> 227;
                case 92 -> 244;
                case 93 -> 109;
                case 94 -> 251;
                case 95 -> 35;
                case 96 -> 245;
                case 97 -> 166;
                case 98 -> 220;
                case 99 -> 57;
                case 100 -> 132;
                case 101 -> 22;
                case 102 -> 228;
                case 103 -> 111;
                case 104 -> 103;
                case 105 -> 10;
                case 106 -> 216;
                case 107 -> 97;
                case 108 -> 248;
                case 109 -> 206;
                case 110 -> 170;
                case 111 -> 124;
                case 112 -> 62;
                case 113 -> 195;
                case 114 -> 201;
                case 115 -> 143;
                case 116 -> 212;
                case 117 -> 192;
                case 118 -> 154;
                case 119 -> 67;
                case 120 -> 184;
                case 121 -> 86;
                case 122 -> 159;
                case 123 -> 48;
                case 124 -> 117;
                case 125 -> 16;
                case 126 -> 145;
                case 127 -> 28;
                case 128 -> 7;
                case 129 -> 233;
                case 130 -> 187;
                case 131 -> 38;
                case 132 -> 221;
                case 133 -> 77;
                case 134 -> 72;
                case 135 -> 116;
                case 136 -> 208;
                case 137 -> 113;
                case 138 -> 172;
                case 139 -> 115;
                case 140 -> 182;
                case 141 -> 211;
                case 142 -> 30;
                case 143 -> 94;
                case 144 -> 65;
                case 145 -> 92;
                case 146 -> 202;
                case 147 -> 162;
                case 148 -> 54;
                case 149 -> 83;
                case 150 -> 69;
                case 151 -> 157;
                case 152 -> 178;
                case 153 -> 19;
                case 154 -> 44;
                case 155 -> 32;
                case 156 -> 104;
                case 157 -> 175;
                case 158 -> 123;
                case 159 -> 85;
                case 160 -> 17;
                case 161 -> 243;
                case 162 -> 171;
                case 163 -> 133;
                case 164 -> 34;
                case 165 -> 51;
                case 166 -> 89;
                case 167 -> 238;
                case 168 -> 255;
                case 169 -> 239;
                case 170 -> 49;
                case 171 -> 219;
                case 172 -> 137;
                case 173 -> 167;
                case 174 -> 93;
                case 175 -> 130;
                case 176 -> 122;
                case 177 -> 246;
                case 178 -> 186;
                case 179 -> 156;
                case 180 -> 240;
                case 181 -> 136;
                case 182 -> 225;
                case 183 -> 247;
                case 184 -> 149;
                case 185 -> 40;
                case 186 -> 215;
                case 187 -> 96;
                case 188 -> 99;
                case 189 -> 81;
                case 190 -> 165;
                case 191 -> 155;
                case 192 -> 252;
                case 193 -> 177;
                case 194 -> 207;
                case 195 -> 106;
                case 196 -> 18;
                case 197 -> 249;
                case 198 -> 43;
                case 199 -> 5;
                case 200 -> 148;
                case 201 -> 68;
                case 202 -> 75;
                case 203 -> 235;
                case 204 -> 15;
                case 205 -> 144;
                case 206 -> 41;
                case 207 -> 3;
                case 208 -> 78;
                case 209 -> 108;
                case 210 -> 0;
                case 211 -> 253;
                case 212 -> 59;
                case 213 -> 158;
                case 214 -> 168;
                case 215 -> 46;
                case 216 -> 107;
                case 217 -> 126;
                case 218 -> 36;
                case 219 -> 87;
                case 220 -> 236;
                case 221 -> 125;
                case 222 -> 205;
                case 223 -> 146;
                case 224 -> 198;
                case 225 -> 76;
                case 226 -> 191;
                case 227 -> 241;
                case 228 -> 66;
                case 229 -> 199;
                case 230 -> 121;
                case 231 -> 55;
                case 232 -> 31;
                case 233 -> 174;
                case 234 -> 169;
                case 235 -> 12;
                case 236 -> 229;
                case 237 -> 52;
                case 238 -> 214;
                case 239 -> 26;
                case 240 -> 53;
                case 241 -> 181;
                case 242 -> 112;
                case 243 -> 118;
                case 244 -> 250;
                case 245 -> 64;
                case 246 -> 71;
                case 247 -> 101;
                case 248 -> 200;
                case 249 -> 24;
                case 250 -> 129;
                case 251 -> 213;
                case 252 -> 141;
                case 253 -> 142;
                case 254 -> 80;
                default -> 9;
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
            nx.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1199;
        if (h[n2] == null) {
            nx.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }
}
