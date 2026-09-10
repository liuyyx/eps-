/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Registry
 *  net.minecraft.resources.Identifier
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.item.Item
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xf
extends Enum<Xf> {
    public static final /* enum */ Xf ENCHANTMENT;
    private static final Xf[] Q;
    public static final /* enum */ Xf ITEM;
    public static final /* enum */ Xf BLOCK;
    public static final /* enum */ Xf SOUND_EVENT;
    public static final /* enum */ Xf ENTITY_TYPE;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    <T> T u(String var1_1) {
        block29: {
            block28: {
                block27: {
                    block26: {
                        block25: {
                            var2_2 = Dl.t();
                            var5_3 /* !! */  = Xf.a(16342, 38100681490555541L) / Xf.a(29556, 70808057602420334L) ^ Xf.a(15824, 3467377182625521703L);
                            if (!var2_2) break block25;
                            ** GOTO lbl-1000
                        }
                        v0 /* !! */  = var5_3 /* !! */ ;
                        if (var2_2) break block26;
                        switch (v0 /* !! */ ) {
                            case -1590649798: lbl-1000:
                            // 2 sources

                            {
                                hi.a("G", (float)-3.0f, (long)1329648085340989328L);
                                v0 /* !! */  = (int)hi.a("G", (long)1031195239253115725L);
                                break;
                            }
                        }
                    }
                    var3_4 = hi.a("G", var1_1, (long)1213140655904450754L);
                    if (var2_2) break block27;
                    if (var3_4 == null) break block28;
                    var5_3 /* !! */  = (Xf.a(25006, 5875949549013777610L) + Xf.a(28355, 5563134429818565587L)) * Xf.a(12552, 8284028526515580097L) * Xf.a(13484, 2145530342254963025L) + Xf.a(24269, 18394218633528104L);
                }
                if (!var2_2) break block29;
            }
            var5_3 /* !! */  = (Xf.a(13947, 8821020360904764292L) * Xf.a(32275, 7117263684214072087L) * Xf.a(26898, 2609067826903790705L) ^ Xf.a(9751, 5249264984282430241L)) - Xf.a(26870, 8113546591343654375L) - Xf.a(19138, 2473597718423345063L);
            if (!var2_2) break block29;
            ** GOTO lbl50
lbl26:
            // 2 sources

            while (true) {
                v1 = hi.a("\u00a5", (Object)Xf.N("So7UW7jAvJ3iDLcY", getOptional(net.minecraft.resources.Identifier ), (Registry)var4_5, (Identifier)var3_4), null, (long)535909545969414314L);
                if (var2_2) {
                    return (T)v1;
                }
                var5_3 /* !! */  = hi.a("G", (int)((Xf.a(1396, 2125065412452571283L) ^ Xf.a(28779, 1791989666013130125L)) / Xf.a(28868, 3831468773780598248L) ^ Xf.a(30139, 3318040440645069052L)), (int)Xf.a(31768, 197766756269629752L), (long)834203424483934088L) ^ Xf.a(19303, 1272777630627927605L);
                ** GOTO lbl68
                break;
            }
        }
        block17: while (true) {
            switch (var5_3 /* !! */ ) {
                case 1021571808: {
                    if (this != hi.a("j", (long)1160005898052550614L)) ** GOTO lbl50
                    ** GOTO lbl52
                }
                case 1021571805: {
                    var4_5 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)640170586404150368L);
                    if (var2_2) ** GOTO lbl55
                    if (var4_5 != null) ** GOTO lbl54
                    ** GOTO lbl56
                }
                case 1021571806: {
                    Xf.N("So7UW7jAvJ3iDLcY", h(double ), (double)-1.0);
                    Xf.N("So7UW7jAvJ3iDLcY", U());
                    return (T)hi.a("\u00a5", (Object)var3_4, (long)788679794859224930L);
                }
lbl50:
                // 2 sources

                var5_3 /* !! */  = (Xf.a(5962, 8469274558886791808L) ^ Xf.a(24142, 758153775592801124L)) + Xf.a(12594, 2218094176118893638L);
                if (!var2_2) continue block17;
lbl52:
                // 2 sources

                var5_3 /* !! */  = (int)(hi.a("G", (int)Xf.a(22852, 7041805331769853054L), (int)Xf.a(9531, 4338405954337863708L), (long)834203424483934088L) - Xf.a(6595, 7994440556376966186L) - Xf.a(17961, 996573156239580103L) + Xf.a(30903, 1567711040544056773L));
                continue block17;
lbl54:
                // 1 sources

                var5_3 /* !! */  = Xf.a(15182, 1598176183489062434L) / Xf.a(15113, 4451107750696511216L) ^ Xf.a(8320, 8452025488612654448L) ^ Xf.a(2065, 8564009804998006236L);
lbl55:
                // 2 sources

                if (!var2_2) ** GOTO lbl57
lbl56:
                // 2 sources

                var5_3 /* !! */  = (Xf.a(21150, 559670263875440638L) ^ Xf.a(1851, 5790309154598902481L)) / 4 + Xf.a(178, 197985303288667578L) + Xf.a(7741, 4891774760545633139L);
lbl57:
                // 2 sources

                switch (var5_3 /* !! */ ) {
                    default: {
                        v1 = null;
                        var5_3 /* !! */  = hi.a("G", (int)((Xf.a(28446, 4760326587788800617L) ^ Xf.a(17253, 2551256526421630653L)) / Xf.a(30168, 2801426797656844315L) ^ Xf.a(29455, 204252456372023019L)), (int)Xf.a(9560, 6156828819494500378L), (long)834203424483934088L) ^ Xf.a(7063, 7583967000766563959L);
                        break;
                    }
                    case -2122504168: {
                        Xf.N("So7UW7jAvJ3iDLcY", R(float float ), (float)1.0f, (float)100.0f);
                        ** GOTO lbl26
                    }
                    case -2122504169: {
                        ** continue;
                    }
                }
lbl68:
                // 2 sources

                switch (var5_3 /* !! */ ) {
                    default: {
                        return (T)v1;
                    }
                    case 1760474188: 
                }
                return (T)hi.a("G", (long)1109407344178516224L);
                default: {
                    return null;
                }
                case 1021571809: 
            }
            break;
        }
        return (T)hi.a("\u00a5", (Object)var3_4, (long)788679794859224930L);
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

    /*
     * Exception decompiling
     */
    Registry v(Object[] var1_1) {
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
     * Exception decompiling
     */
    Predicate v(Object[] var1_1) {
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

    private static boolean lambda$defaultFilter$1(EntityType entityType) {
        return entityType != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$defaultFilter$0(Item item) {
        boolean bl = Dl.t();
        Item item2 = item;
        if (!bl) {
            if (item2 == null) return false;
            item2 = item;
        }
        if (item2 == hi.a("j", (long)647747123066553138L)) return false;
        return true;
    }

    private static Xf[] E(Object[] objectArray) {
        return new Xf[]{hi.a("j", (long)1308936498861545106L), hi.a("j", (long)937098041521777781L), hi.a("j", (long)979048685352821956L), hi.a("j", (long)1265570870147036333L), hi.a("j", (long)1160005898052550614L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[5];
                        var12_1 = 0;
                        var11_2 = "\u001ex\u0000X\u000b\u0012b\u0006]<3(\u001ai\u000bA\u000b\u0012b\u0011\\)$#\u0003u\u0015P";
                        var13_3 = "\u001ex\u0000X\u000b\u0012b\u0006]<3(\u001ai\u000bA\u000b\u0012b\u0011\\)$#\u0003u\u0015P".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 83;
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
                            var11_2 = "G S\u0018zazB*H\u0002\u0005V#I\u0015u";
                            var13_3 = "G S\u0018zazB*H\u0002\u0005V#I\u0015u".length();
                            var10_4 = 11;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 16;
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
                                    v15 = 4;
                                    break;
                                }
                                case 1: {
                                    v15 = 127;
                                    break;
                                }
                                case 2: {
                                    v15 = 22;
                                    break;
                                }
                                case 3: {
                                    v15 = 70;
                                    break;
                                }
                                case 4: {
                                    v15 = 46;
                                    break;
                                }
                                case 5: {
                                    v15 = 46;
                                    break;
                                }
                                default: {
                                    v15 = 47;
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
                var0_7 = 5990425079298405392L;
                var6_8 = new long[196];
                var3_9 = 0;
                var4_10 = "\u00f9.K\u00a7B\u00f9P\u00b0\u008f\u001c\u0005\u001cl\u008c\u00df\u0006\u00e33)K\u00b2\u00b7\u00cf\u00ado\u0016\u0017A\u00b4\u00cc\u0005^\u00detB)\u0092\u001f\u00f9\u00d2\u0081\u009d\u0089\u00c3\u00e5\u0090Z2X\u00d6/\u0095\u00f6c\u0010\u00eb\u00eb\u00c6fH\u0013\u0092\u00ea\u00b6C\u00d7\u00fe2\u007f\u000e29]\u00f2\u008d^\u00fe\u00ce\u00c8\u007f\n\u00b2\u0012\u008c\u00c8\u0083\u00ae\u00bc\u001a%\u00c1\u00ba\u00c3\u000f\u00a1\u0088\f\u00bb\u0004y\u00e5}\u00dco\u001d\u00ear\u00bb\u00d1\u00dc\u00f5\u001a\u00f4\u00fe\u008eJ\u00f1\u0093f\u00c3Sv7\u00cf/\u00d9\u009f\u00d9L5>73vG\u0090L\u0016\u00d8?\u00f9\u00b0w\u00e2\u00ff\u0003 ZFUK%\u00a8\b\u00a6t\u00a9\u00df\u00df\u00fe\u0005\u0086\u0083\u00a87\nHi\u00d7\u0087.\u009a\u0001\u008a?@\u0086\u00e4\u00c2rS\u0019G\u008d\u00d1\u0097\u00a3\u001d\u00c2\u00a8\u0088\u0017,\u0081\u008b\u00b8\u0010\u00cf\u000b\u00f7\u0002\u00ac,\u0019pM\u009b\u008d\u001d\u0000\u0094)\u00a6G\u0003\u00eb\u00d9\u00b6G#o(\u00fb\u0083pmC\"Go\fD\u0018\u00f5\u0004\u00e4\u00e9\u00f4-\u00ae\u00b2\u00e4\u00fa\u00f1\u0013\u0097EC\u00efs\u00e9BeY\u00e0\u00b0\u00d2\u009e)351%\u00ed\u00f8\u00ab{\u0096\u009beG\u00f5\u00a1i\u00b5\u008b\u009d\u0097\u00a8\u00c4\u00a2l\u00faK\u00fa\u0018W.\u00dda\u00f9\u0019\u00d1\u00e0\u00f6\u00a4\u00a7\u0001\u0017$\u00f3\u0080\u00ac\u00a7j/I\u00c9\u00be\u00d7\u0003O2C\u00c0;\u0084\u00ba\u00da\u008c\u0095\u00aa\u007f\u001d\u00c6\u0010Q\u0090s~ \u00e1P\u0011\u00f3u=\u00c2&K\u00f1\u0098\u008c\u0005\u00fc\u001f!\u008a\u0098\u00d7\u0088u*;S&\u000f\u00bbj\b\u00beO!w\u0019\u00b2%\u00b1\u0003l\u001cw\u00a4p\u0098r\u00ba\u00aa\"\u0086\u0096\u00d3\u00b3\u00c0\u00c1/\u00c7Q\u00bb\u00ef\u008f\u00dc\u00126'\u0081\u00bf\u00d8\u0095\u0087DmtBE\u00cfW\u001d\u00b3>9\u000bi\u0094\u00acG\u00bd\"lS\u0088\u00f5c\u00d9\u0002\t\u0014\u00d6\u00e0U/\u00ef@L+\u0086\u008er\u00a3\u000eY\u008d5\u00a4\u00a2t|\u00ff\u00f4j\u00a8\u00fa\u0010\u00a6\u0091\u0083upP\u009aQ\u00f39\u0018\u009a\u00db\u00d6'z\u00acy\u0080\u00adH\u00a3\u00beU\u00e3S~\u0083\u00849\u00f7\u0019}\u00bd<\u00fbY)\u0086!\u008dY'\u00be\u001e\u00b2\u00d7\u00be\u0090\u00ac\u008f\u000f\u00b7\u0099\u00b2\u00f4\u00d4\u008a\u0093\t\u0088\u009eC-c\"\u00fd&\u00aa\u0002\u00e2X\u00dd;\u001cBN\u00e7'\u00a3\u001bO\u00a5$\u00e0T\u00fa`S\u00b8R\u00d4~\u00f7b\u00d9\u00cf\u00a31\u001fsh\u00bc\u00aem\u001ad\u00ca\u00dez\u0093\u00f4\u00fd^\u0002\u00e0\u00ab\u00d6\u0015s\u0016\u00ea\u00e8\u0014\u00ca\u000f\u00fc$\u00a9\u00fd\u00d3\u00e6\u00a3%\u008c\u00bb\u00ec%\u00ee\u001c\u00023\u00ab\u0084\u000f\u00efw\u009d8\u0086y\t\u00c2\u00d1D\u0093\u00dd\u00d5\u00d1\u009a\u00d0\u00f9L\u00d5G]QZ\u009fL\u00b4G@\u0088\u00d5\u00f7/\u00be\u00db}\u0098\u00e5El\u00c7\u0092\u00ae&,6\u00a0\u001f\u0013\u00922T\u00c3\u001a\u00e8{\u00e0\\\u00be%R\u001b=?\u008e\u00e9`\u0090\u00e36\u00c6p\u00d6\u00cc\u00a5\u00ee\u00a1\u0083\u001f7\u0092-S\b\u00af\u0092@k \u00c9[\u008eK^\u00cab\u00c4\u00e6\u001c\u0019Zr\u0012?}k\u0088\u00ea-\u00b6\u00cc\u00d9\u00d8\u0006\u00c2\u0082e\u008d\u0019\u00ef\u0018:\u00ca \u00a1\u00c8\u00ba(\u0096\u00d1\u0014|\u008f\u001f\u00e6c\u0080\u009b\u009f?@?\u0010\u0088_\u0090\u008a\u00cd3\u00ff\u00a3\n\u009a\u0089IG\u0099\u0097y\u00b5wfk\u001e\u000415D\u001d\u0099\u00e8I\u00bde\u008d.'\u00df2a\u00de\u00fdh\b\u0089\u00d1-\u00c4K\u00de\u00883\u0017\u00fb\r\u0004\u0086*\u0007\u00c0y?\u00efY\u0014\u00f3\u0013b'\u008e\"\u00b2\u00f3X\u00b5\u0080\u00c3\u009aH\u0098\u00bb\u00e8\u00c9\u00bdg9ky\u007f\u0010\u008b\u00db\u0091L\t\u00daUN\u00cb\u0002j\u00d3\u0093=I=@Y\u008c\u009av`\u008a\u00c8\u00c9\u00d5\u009c\t\u00b8%v\u008c\u00db\u00d3\u0081\u009c\u0011\u0000<N(\u00ec\u00abj\u00ec\u009e\u00df\u0003\u001f@\u0012\u0002\\\u00ee\u00d3\u00a7q\u008d\u00ac @\u0086\u00adE\u00a7\u00cb\n\u0019\u00f5\u00e1\u0011\u0010\u00d0\u0096\u00bcm\u00e6BK-\u00e2\u00e1\u008e\u0016\u00f6l\u009b\u00f6=\u0014/\u00d1kD\u00d1\u00b8\u00bc\u00f8\u008c\u009f\u009ciw3Y\u00be\u00a3R\u00f7\u00af\fI\u00d1\u0001\u0091\n\u00d5\u0081\u00dfV$\u00c8`f\u009c\u009d\u00db\u00f77q\u001d\u000e\u00a0\u00eb\u0092n\u0098\u009f\u0089i\"\u00bet\u00f4\u00fd\u00cb\u00fd7-kGIy\u00fe~\u00c4C\u00bb\u00eb\u001a\u0012\u00ce\u001f\u0013-\u00bc\u00f0\u009cf\u00f3t\u009bf\u00f8\u00ad\u00fd\u00c7\u0013\u00d2|\u00fc-\u00b5\u001cE!P&\u00dd\n\u00cd\u009a`\u0014\u0091e\u00a0\u00b9\u00a6\u0099\u00a6\u001bV\u00d4M\u00a99O\u00be\u00cc\u00d3\t4\nb\u00d6\u00cdG\u00d4;E\u00a3D\u0092\u00f2|\u00d6\u008e\u00de\u0000#o(n\u00ca\u0083'\u007f\u00e8K:\u00eb\bq\u00a2\u0089W\u0098\u00b2\u00a4\u008e\u0092I\u00c7\u0094\u0081l\u00fc\u00ec\u00d18\r\u00f4\u009d\u00be\u0017\u0004\u00d8D|\u00f7>\u008e\u009a\u008awD*\u00e8\u00falhl\u00d2\u00e7\u00f8,\u0006K\u00d2\u00c61\u00bd8\u00a1\u008e\u0091WW\u00b6~\u00c6\u00ac\u00a7\u0087\u00fb\u0080x\u00b0\u008b\u0014\u008b\u00f5\u00b9b\u00f1\u00c4\u00eb\u0086j\u00d3?^\u0094\u009fEfP\u009d\u00ce\u0019\u009d\u0084%\u0017\u00d1\u00a7l\u0010`D\u00111\u00e67#`\f\u00a4#7\u00adrP8\u0097\u00b7\u007f\u0001\u00eb\u00ab4T\u0013(\u0004\u00f4\u00e2\u009e\u001b\u00d0\u008c\u00e0R\\\u00f5\u00e4\u00bax\u008e\u00cbN\u0004\u0010\u00b4\u001d|\u00e5\u00ce\u009e\u009b\u00f2\u0082A\u000eZp#\u00154\u00ca8\u009ew\u00fe=\u00d7?\u00b3\u001fB\u00d3H\u00de\u00e1o.\u00d2D\u00dc\u00ad\u0090\u00f7'\u00d9\\\u0019\u001a\u00dd\n\u00ce\u00d7\u0085\u0012c6\bQ\u00d1*b\u00bd\u00c9\u00ef\u008e#-\u00cf_\u00b9\u00b8\u001c\u00b0\u009e\u00bf\u00ad\u0088\u00ab\u00bd\u00d2\u0080YE\u00b8(\u000e\u00a8G3\u00deZ\u008b\u00bc\u000f48I\u0085\u00b6\u0099\u007f\u00c56A\u00f5/\u00ed\u001de}\u0084$\u00e3\u00d7'\u00ba\u008as\u0088\u00a3\u00c2\u00afE\u00e5/\u00db0\u00eb\u0084}W\u00b4\u0089\u00c4\u0013\u00b7A\u00be\u00cfI\u00f5\u00fab\u008e\u000e[\f\u00a0>\u00d2M\u001a\u0000\u00d4d:\u009f\u001c\u00b4) \u0084I\u00ba\u0086lp\u00bf\u00d0\u00a7\\\u009a<\u00fa\u00cc\u0003\u00c2@V\u00e1\u00d5`\u00b9\u008e\u00f6JC\u00f8\u00d0\u00c1\u0096\u00af\u0016\u00f0S\u00b7\u0096\u00e5Y\u0000\u00deG\u00ab\u00d3\"\u008b\u00b4\u009c\u001bD\u00b8\u0098\u00bcg\u0004\u00d7\u001dJ\u00d2\u00041\u00ee\u009b\u008f\u00b7\\ \u00cf\u00e8[o\u00aa\u00e1Rz\u0093Rk\u00cc\u00e3\u007f9~\u00e7\u00e8\u0019\u0012\u001aF\u001cK?r2\u0017Ef\u0013\f\u00f4\u009af\u00daR\u001f\u00ed\u001cun\u00edC\u00f1\u00e3\u0090\u00eb\u00a9\u0011noL\u00d3'\u0007q\u00b5\u00ff0\u0080\u0000Y\u0099\u0085\u00cb\u00b2\u00b3>\u00d67\u00a8S\u00b3q3\u00cd\u00fa\u0091\u00ed2\u00b1\u00e0J.\u00ee|\u00af\u00e9=\u0097\u0013^9v.\u0017\u00dcO\u0080\fR\u009c\u0086\r\u00a3\rg\u00b4\u00ee=\u00ee\u00a3\u009f\u0012\f7\u00dc";
                var5_11 = "\u00f9.K\u00a7B\u00f9P\u00b0\u008f\u001c\u0005\u001cl\u008c\u00df\u0006\u00e33)K\u00b2\u00b7\u00cf\u00ado\u0016\u0017A\u00b4\u00cc\u0005^\u00detB)\u0092\u001f\u00f9\u00d2\u0081\u009d\u0089\u00c3\u00e5\u0090Z2X\u00d6/\u0095\u00f6c\u0010\u00eb\u00eb\u00c6fH\u0013\u0092\u00ea\u00b6C\u00d7\u00fe2\u007f\u000e29]\u00f2\u008d^\u00fe\u00ce\u00c8\u007f\n\u00b2\u0012\u008c\u00c8\u0083\u00ae\u00bc\u001a%\u00c1\u00ba\u00c3\u000f\u00a1\u0088\f\u00bb\u0004y\u00e5}\u00dco\u001d\u00ear\u00bb\u00d1\u00dc\u00f5\u001a\u00f4\u00fe\u008eJ\u00f1\u0093f\u00c3Sv7\u00cf/\u00d9\u009f\u00d9L5>73vG\u0090L\u0016\u00d8?\u00f9\u00b0w\u00e2\u00ff\u0003 ZFUK%\u00a8\b\u00a6t\u00a9\u00df\u00df\u00fe\u0005\u0086\u0083\u00a87\nHi\u00d7\u0087.\u009a\u0001\u008a?@\u0086\u00e4\u00c2rS\u0019G\u008d\u00d1\u0097\u00a3\u001d\u00c2\u00a8\u0088\u0017,\u0081\u008b\u00b8\u0010\u00cf\u000b\u00f7\u0002\u00ac,\u0019pM\u009b\u008d\u001d\u0000\u0094)\u00a6G\u0003\u00eb\u00d9\u00b6G#o(\u00fb\u0083pmC\"Go\fD\u0018\u00f5\u0004\u00e4\u00e9\u00f4-\u00ae\u00b2\u00e4\u00fa\u00f1\u0013\u0097EC\u00efs\u00e9BeY\u00e0\u00b0\u00d2\u009e)351%\u00ed\u00f8\u00ab{\u0096\u009beG\u00f5\u00a1i\u00b5\u008b\u009d\u0097\u00a8\u00c4\u00a2l\u00faK\u00fa\u0018W.\u00dda\u00f9\u0019\u00d1\u00e0\u00f6\u00a4\u00a7\u0001\u0017$\u00f3\u0080\u00ac\u00a7j/I\u00c9\u00be\u00d7\u0003O2C\u00c0;\u0084\u00ba\u00da\u008c\u0095\u00aa\u007f\u001d\u00c6\u0010Q\u0090s~ \u00e1P\u0011\u00f3u=\u00c2&K\u00f1\u0098\u008c\u0005\u00fc\u001f!\u008a\u0098\u00d7\u0088u*;S&\u000f\u00bbj\b\u00beO!w\u0019\u00b2%\u00b1\u0003l\u001cw\u00a4p\u0098r\u00ba\u00aa\"\u0086\u0096\u00d3\u00b3\u00c0\u00c1/\u00c7Q\u00bb\u00ef\u008f\u00dc\u00126'\u0081\u00bf\u00d8\u0095\u0087DmtBE\u00cfW\u001d\u00b3>9\u000bi\u0094\u00acG\u00bd\"lS\u0088\u00f5c\u00d9\u0002\t\u0014\u00d6\u00e0U/\u00ef@L+\u0086\u008er\u00a3\u000eY\u008d5\u00a4\u00a2t|\u00ff\u00f4j\u00a8\u00fa\u0010\u00a6\u0091\u0083upP\u009aQ\u00f39\u0018\u009a\u00db\u00d6'z\u00acy\u0080\u00adH\u00a3\u00beU\u00e3S~\u0083\u00849\u00f7\u0019}\u00bd<\u00fbY)\u0086!\u008dY'\u00be\u001e\u00b2\u00d7\u00be\u0090\u00ac\u008f\u000f\u00b7\u0099\u00b2\u00f4\u00d4\u008a\u0093\t\u0088\u009eC-c\"\u00fd&\u00aa\u0002\u00e2X\u00dd;\u001cBN\u00e7'\u00a3\u001bO\u00a5$\u00e0T\u00fa`S\u00b8R\u00d4~\u00f7b\u00d9\u00cf\u00a31\u001fsh\u00bc\u00aem\u001ad\u00ca\u00dez\u0093\u00f4\u00fd^\u0002\u00e0\u00ab\u00d6\u0015s\u0016\u00ea\u00e8\u0014\u00ca\u000f\u00fc$\u00a9\u00fd\u00d3\u00e6\u00a3%\u008c\u00bb\u00ec%\u00ee\u001c\u00023\u00ab\u0084\u000f\u00efw\u009d8\u0086y\t\u00c2\u00d1D\u0093\u00dd\u00d5\u00d1\u009a\u00d0\u00f9L\u00d5G]QZ\u009fL\u00b4G@\u0088\u00d5\u00f7/\u00be\u00db}\u0098\u00e5El\u00c7\u0092\u00ae&,6\u00a0\u001f\u0013\u00922T\u00c3\u001a\u00e8{\u00e0\\\u00be%R\u001b=?\u008e\u00e9`\u0090\u00e36\u00c6p\u00d6\u00cc\u00a5\u00ee\u00a1\u0083\u001f7\u0092-S\b\u00af\u0092@k \u00c9[\u008eK^\u00cab\u00c4\u00e6\u001c\u0019Zr\u0012?}k\u0088\u00ea-\u00b6\u00cc\u00d9\u00d8\u0006\u00c2\u0082e\u008d\u0019\u00ef\u0018:\u00ca \u00a1\u00c8\u00ba(\u0096\u00d1\u0014|\u008f\u001f\u00e6c\u0080\u009b\u009f?@?\u0010\u0088_\u0090\u008a\u00cd3\u00ff\u00a3\n\u009a\u0089IG\u0099\u0097y\u00b5wfk\u001e\u000415D\u001d\u0099\u00e8I\u00bde\u008d.'\u00df2a\u00de\u00fdh\b\u0089\u00d1-\u00c4K\u00de\u00883\u0017\u00fb\r\u0004\u0086*\u0007\u00c0y?\u00efY\u0014\u00f3\u0013b'\u008e\"\u00b2\u00f3X\u00b5\u0080\u00c3\u009aH\u0098\u00bb\u00e8\u00c9\u00bdg9ky\u007f\u0010\u008b\u00db\u0091L\t\u00daUN\u00cb\u0002j\u00d3\u0093=I=@Y\u008c\u009av`\u008a\u00c8\u00c9\u00d5\u009c\t\u00b8%v\u008c\u00db\u00d3\u0081\u009c\u0011\u0000<N(\u00ec\u00abj\u00ec\u009e\u00df\u0003\u001f@\u0012\u0002\\\u00ee\u00d3\u00a7q\u008d\u00ac @\u0086\u00adE\u00a7\u00cb\n\u0019\u00f5\u00e1\u0011\u0010\u00d0\u0096\u00bcm\u00e6BK-\u00e2\u00e1\u008e\u0016\u00f6l\u009b\u00f6=\u0014/\u00d1kD\u00d1\u00b8\u00bc\u00f8\u008c\u009f\u009ciw3Y\u00be\u00a3R\u00f7\u00af\fI\u00d1\u0001\u0091\n\u00d5\u0081\u00dfV$\u00c8`f\u009c\u009d\u00db\u00f77q\u001d\u000e\u00a0\u00eb\u0092n\u0098\u009f\u0089i\"\u00bet\u00f4\u00fd\u00cb\u00fd7-kGIy\u00fe~\u00c4C\u00bb\u00eb\u001a\u0012\u00ce\u001f\u0013-\u00bc\u00f0\u009cf\u00f3t\u009bf\u00f8\u00ad\u00fd\u00c7\u0013\u00d2|\u00fc-\u00b5\u001cE!P&\u00dd\n\u00cd\u009a`\u0014\u0091e\u00a0\u00b9\u00a6\u0099\u00a6\u001bV\u00d4M\u00a99O\u00be\u00cc\u00d3\t4\nb\u00d6\u00cdG\u00d4;E\u00a3D\u0092\u00f2|\u00d6\u008e\u00de\u0000#o(n\u00ca\u0083'\u007f\u00e8K:\u00eb\bq\u00a2\u0089W\u0098\u00b2\u00a4\u008e\u0092I\u00c7\u0094\u0081l\u00fc\u00ec\u00d18\r\u00f4\u009d\u00be\u0017\u0004\u00d8D|\u00f7>\u008e\u009a\u008awD*\u00e8\u00falhl\u00d2\u00e7\u00f8,\u0006K\u00d2\u00c61\u00bd8\u00a1\u008e\u0091WW\u00b6~\u00c6\u00ac\u00a7\u0087\u00fb\u0080x\u00b0\u008b\u0014\u008b\u00f5\u00b9b\u00f1\u00c4\u00eb\u0086j\u00d3?^\u0094\u009fEfP\u009d\u00ce\u0019\u009d\u0084%\u0017\u00d1\u00a7l\u0010`D\u00111\u00e67#`\f\u00a4#7\u00adrP8\u0097\u00b7\u007f\u0001\u00eb\u00ab4T\u0013(\u0004\u00f4\u00e2\u009e\u001b\u00d0\u008c\u00e0R\\\u00f5\u00e4\u00bax\u008e\u00cbN\u0004\u0010\u00b4\u001d|\u00e5\u00ce\u009e\u009b\u00f2\u0082A\u000eZp#\u00154\u00ca8\u009ew\u00fe=\u00d7?\u00b3\u001fB\u00d3H\u00de\u00e1o.\u00d2D\u00dc\u00ad\u0090\u00f7'\u00d9\\\u0019\u001a\u00dd\n\u00ce\u00d7\u0085\u0012c6\bQ\u00d1*b\u00bd\u00c9\u00ef\u008e#-\u00cf_\u00b9\u00b8\u001c\u00b0\u009e\u00bf\u00ad\u0088\u00ab\u00bd\u00d2\u0080YE\u00b8(\u000e\u00a8G3\u00deZ\u008b\u00bc\u000f48I\u0085\u00b6\u0099\u007f\u00c56A\u00f5/\u00ed\u001de}\u0084$\u00e3\u00d7'\u00ba\u008as\u0088\u00a3\u00c2\u00afE\u00e5/\u00db0\u00eb\u0084}W\u00b4\u0089\u00c4\u0013\u00b7A\u00be\u00cfI\u00f5\u00fab\u008e\u000e[\f\u00a0>\u00d2M\u001a\u0000\u00d4d:\u009f\u001c\u00b4) \u0084I\u00ba\u0086lp\u00bf\u00d0\u00a7\\\u009a<\u00fa\u00cc\u0003\u00c2@V\u00e1\u00d5`\u00b9\u008e\u00f6JC\u00f8\u00d0\u00c1\u0096\u00af\u0016\u00f0S\u00b7\u0096\u00e5Y\u0000\u00deG\u00ab\u00d3\"\u008b\u00b4\u009c\u001bD\u00b8\u0098\u00bcg\u0004\u00d7\u001dJ\u00d2\u00041\u00ee\u009b\u008f\u00b7\\ \u00cf\u00e8[o\u00aa\u00e1Rz\u0093Rk\u00cc\u00e3\u007f9~\u00e7\u00e8\u0019\u0012\u001aF\u001cK?r2\u0017Ef\u0013\f\u00f4\u009af\u00daR\u001f\u00ed\u001cun\u00edC\u00f1\u00e3\u0090\u00eb\u00a9\u0011noL\u00d3'\u0007q\u00b5\u00ff0\u0080\u0000Y\u0099\u0085\u00cb\u00b2\u00b3>\u00d67\u00a8S\u00b3q3\u00cd\u00fa\u0091\u00ed2\u00b1\u00e0J.\u00ee|\u00af\u00e9=\u0097\u0013^9v.\u0017\u00dcO\u0080\fR\u009c\u0086\r\u00a3\rg\u00b4\u00ee=\u00ee\u00a3\u009f\u0012\f7\u00dc".length();
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
                    var4_10 = "\u009d\u0083\u0090\u00fc>>9\u00d0\u0080h0\u00f2;[\u00e7+";
                    var5_11 = "\u009d\u0083\u0090\u00fc>>9\u00d0\u0080h0\u00f2;[\u00e7+".length();
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
        Xf.a = var6_8;
        Xf.b = new Integer[196];
        Xf.BLOCK = new Xf((Object)var8[4], 0);
        Xf.ITEM = new Xf((Object)var8[0], 1);
        Xf.ENTITY_TYPE = new Xf((Object)var8[2], 2);
        Xf.SOUND_EVENT = new Xf((Object)var8[3], 3);
        Xf.ENCHANTMENT = new Xf((Object)var8[1], 4);
        Xf.Q = hi.a("G", (Object)new Object[0], (long)974365661116594319L);
    }

    public static Xf valueOf(String string) {
        return (Xf)((Object)hi.a("G", Xf.class, (Object)string, (long)703426484721789552L));
    }

    public static Xf[] values() {
        return (Xf[])((Enum)((Object)hi.a("j", (long)654157032590242986L))).clone();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    String V(Object[] var1_1) {
        block41: {
            block46: {
                block45: {
                    block44: {
                        block43: {
                            block42: {
                                block36: {
                                    block34: {
                                        block35: {
                                            block33: {
                                                var2_2 = var1_1[0];
                                                var3_3 = Dl.S();
                                                var6_4 /* !! */  = (Xf.a(26305, 4257422514581093233L) * Xf.a(16383, 694947873813783236L) ^ Xf.a(3493, 1991058893770543268L)) - Xf.a(24997, 4864866864816340206L) ^ Xf.a(13616, 1456286879515535369L);
                                                if (var3_3) ** GOTO lbl13
                                                block21: while (true) {
                                                    block38: {
                                                        block37: {
                                                            if (this == hi.a("j", (long)1160005898052550614L)) break block37;
                                                            var6_4 /* !! */  = (Xf.a(1348, 7689975000854026364L) - Xf.a(22553, 2959494219554981187L)) * Xf.a(3773, 8256110862059230060L) - Xf.a(17643, 7583787518022556136L) ^ Xf.a(8627, 687428162881059975L);
                                                            if (var3_3) break block38;
                                                        }
                                                        var6_4 /* !! */  = (Xf.a(27683, 6121991299226481102L) * Xf.a(15676, 3013994174350581797L) * Xf.a(17584, 4932490375601822048L) ^ Xf.a(32374, 657097767017751328L)) / Xf.a(32117, 507781887812608137L) - Xf.a(9000, 7911023188917714501L);
                                                        if (!var3_3) ** GOTO lbl45
                                                    }
                                                    block22: while (true) {
                                                        block40: {
                                                            block39: {
                                                                switch (var6_4 /* !! */ ) {
                                                                    default: {
                                                                        continue block21;
                                                                    }
                                                                    case 304928566: {
                                                                        v0 = var2_2 instanceof String;
                                                                        if (!var3_3) break block39;
                                                                        if (v0 == 0) break;
                                                                        break block40;
                                                                    }
                                                                    case 304928564: {
                                                                        var4_5 = (String)var2_2;
                                                                        v1 = var4_5;
                                                                        var6_4 /* !! */  = (Xf.a(32702, 4867251772413190815L) - Xf.a(32324, 962460666763977519L) + Xf.a(14285, 7134064170165660222L)) * Xf.a(19160, 8408545795837630231L) - Xf.a(4213, 4851698447732067699L);
                                                                        if (!var3_3) {
                                                                            break block21;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    case 304928567: {
                                                                        v1 = "";
                                                                        if (var3_3) break block21;
                                                                        return v1;
                                                                    }
                                                                    case 304928563: {
                                                                        var4_6 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)640170586404150368L);
                                                                        if (!var3_3) break block34;
                                                                        if (var4_6 != null) break block35;
                                                                        break block36;
                                                                    }
                                                                    case 304928565: {
                                                                        hi.a("G", (long)1115568667421921156L);
                                                                        var6_4 /* !! */  = Xf.a(22594, 1282369797208147264L) - Xf.a(26514, 852420701684939416L) ^ Xf.a(148, 4610020702207106554L) ^ Xf.a(3452, 6894043638930952299L);
                                                                        continue block22;
                                                                    }
                                                                }
lbl45:
                                                                // 2 sources

                                                                v0 = var6_4 /* !! */  = Xf.a(12061, 4524711350780293665L) * Xf.a(24353, 4158225334095643164L) ^ Xf.a(7767, 7112496593315382158L);
                                                            }
                                                            if (var3_3) continue;
                                                        }
                                                        var6_4 /* !! */  = (int)(Xf.N("So7UW7jAvJ3iDLcY", max(int int ), (int)Xf.a(6802, 8204173021845636941L), (int)Xf.a(15928, 7723922556270961479L)) + Xf.a(17036, 8572422619715248114L) - Xf.a(29850, 4357313330207304027L));
                                                    }
                                                    break;
                                                }
                                                var6_4 /* !! */  = (Xf.a(13803, 3717765501633587261L) - Xf.a(4929, 3971056437436599876L) + Xf.a(31580, 7952365221718697473L)) * Xf.a(2031, 2057051686776298035L) - Xf.a(31968, 764283609879421389L);
                                            }
                                            switch (var6_4 /* !! */ ) {
                                                default: {
                                                    return v1;
                                                }
                                                case 324213165: 
                                            }
                                            break block41;
                                        }
                                        var6_4 /* !! */  = (Xf.a(32003, 5040680694695469251L) ^ Xf.a(30626, 8459127250978777809L)) * Xf.a(24814, 4998403553337654781L) / 5 - Xf.a(10698, 6881660378966029565L);
                                    }
                                    if (var3_3) break block42;
                                }
                                var6_4 /* !! */  = Xf.a(15161, 1051628884755506754L) - Xf.a(31332, 2098529313038444351L) + Xf.a(5717, 4930974526087351140L) ^ Xf.a(17787, 2152379450755029085L);
                            }
                            v2 /* !! */  = var6_4 /* !! */ ;
                            if (var3_3 == false) return "";
                            switch (v2 /* !! */ ) {
                                case -1747834004: {
                                    hi.a("G", (long)1208540510591910900L);
                                    v2 /* !! */  = (int)Xf.N("So7UW7jAvJ3iDLcY", O());
                                    return "";
                                }
                                default: {
                                    return "";
                                }
                                case -1747834006: 
                            }
                            var5_7 = hi.a("\u00a5", (Object)var4_6, (Object)var2_2, (long)713274920163215701L);
                            if (!var3_3) break block43;
                            if (var5_7 != null) break block44;
                            var6_4 /* !! */  = (Xf.N("So7UW7jAvJ3iDLcY", max(int int ), (int)hi.a("G", (int)(Xf.a(9517, 4851211030565386357L) - Xf.a(4487, 3323116211798854875L)), (int)Xf.a(10108, 3086996663584029280L), (long)834203424483934088L), (int)Xf.a(21431, 5559896564237242041L)) ^ Xf.a(19616, 8964466267910607304L)) + Xf.a(20492, 6049559345438690610L);
                        }
                        if (var3_3) break block45;
                    }
                    var6_4 /* !! */  = (int)(hi.a("G", (int)(Xf.a(16816, 13811485921746113L) + Xf.a(5257, 5480132357972642194L)), (int)Xf.a(28320, 4861743153368347581L), (long)834203424483934088L) - Xf.a(22932, 1640556622457308198L));
                }
                switch (var6_4 /* !! */ ) {
                    default: {
                        v1 = hi.a("\u00a5", (Object)var5_7, (long)788679794859224930L);
                        var6_4 /* !! */  = (hi.a("G", (int)(Xf.a(20642, 3212146148532358541L) / Xf.a(31659, 1212209569739220574L)), (int)Xf.a(17535, 5134319429613394208L), (long)834203424483934088L) ^ Xf.a(25698, 3793063854192966097L)) - Xf.a(3073, 4618763499153052102L) + Xf.a(18388, 3863580965865560704L);
                        if (!var3_3) {
                            break;
                        }
                        break block46;
                    }
                    case 2142014884: {
                        v1 = "";
                        if (var3_3) break;
                        return v1;
                    }
                    case 2142014885: {
                        return hi.a("G", (long)919703241060757748L);
                    }
                }
                var6_4 /* !! */  = (hi.a("G", (int)(Xf.a(20178, 6756016766231778057L) / Xf.a(31659, 1212209569739220574L)), (int)Xf.a(31092, 3351772174666572853L), (long)834203424483934088L) ^ Xf.a(499, 3213839323963120647L)) - Xf.a(7825, 8937867066057278298L) + Xf.a(27736, 15947950036496814L);
            }
            switch (var6_4 /* !! */ ) {
                default: {
                    return v1;
                }
                case -2068714613: 
            }
        }
        Xf.N("So7UW7jAvJ3iDLcY", j());
        hi.a("G", (long)487733742417394326L);
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$defaultFilter$3(String string) {
        boolean bl = Dl.t();
        String string2 = string;
        if (!bl) {
            if (string2 == null) return false;
            string2 = string;
        }
        if (hi.a("G", string2, (long)1213140655904450754L) == null) return false;
        return true;
    }

    private static boolean lambda$defaultFilter$2(SoundEvent soundEvent) {
        return soundEvent != null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5D73;
        if (b[n2] == null) {
            Xf.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
