/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  net.minecraft.server.packs.resources.ResourceManager
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.OM;
import com.github.epsilon.hi;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.server.packs.resources.ResourceManager;

public class nL {
    private volatile Map<String, String> l;
    private static final Gson b;
    private static final Pattern a;
    private static final String Z;
    public static final nL h;
    private volatile OM P;
    private static final String n;
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    /*
     * Exception decompiling
     */
    private void u(Object[] var1_1) {
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

    private nL() {
        hi.a("\u00f2", (Object)this, (Map)((Object)hi.a("G", (long)673531794764851542L)), (long)1151291039357543845L);
        hi.a("\u00f2", (Object)this, (OM)((Object)hi.a("j", (long)404864177458797334L)), (long)1185952504198942019L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public synchronized void f(Object[] var1_1) {
        block11: {
            block10: {
                block9: {
                    var2_2 = (ResourceManager)var1_1[0];
                    var3_3 = Dl.t();
                    var6_4 /* !! */  = nL.K("utBa4T3JID6nFUc8", max(int int ), (int)nL.a(2531, 5625631269467076199L), (int)nL.a(12175, 75851835510755336L)) - nL.a(22446, 3699993344568289527L);
                    if (var3_3) ** GOTO lbl-1000
                    switch (var6_4 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var4_5 = new HashMap<K, V>();
                            v0 = new Object[3];
                            v0[2] = var4_5;
                            v0[1] = nL.a(24583, -11632);
                            v0[0] = var2_2;
                            hi.a("\u00a5", (Object)this, (Object)v0, (long)875567866134109485L);
                            var5_6 = nL.K("utBa4T3JID6nFUc8", a(), (nL)this);
                            v1 /* !! */  = nL.K("utBa4T3JID6nFUc8", isBlank(), (String)var5_6);
                            if (var3_3) break block9;
                            if (v1 /* !! */  != false) break;
                            break block10;
                        }
                        case -365896459: {
                            nL.K("utBa4T3JID6nFUc8", w(float float ), (float)2.0f, (float)10.0f);
                            return;
                        }
                    }
                    v1 /* !! */  = var6_4 /* !! */  = (CallSite)((nL.a(25849, 3747360352543136756L) + nL.a(5010, 4313179387970858011L) ^ nL.a(10808, 5245050820473460179L)) + nL.a(29371, 67744980398853610L));
                }
                if (!var3_3) break block11;
            }
            var6_4 /* !! */  = (CallSite)(nL.a(31604, 6858530654104863852L) - nL.a(32494, 2820050371070837242L) + nL.a(29843, 7282474177819659027L));
            if (var3_3) ** GOTO lbl52
        }
        while (true) {
            block15: {
                block14: {
                    block12: {
                        block13: {
                            switch (var6_4 /* !! */ ) {
                                default: {
                                    v2 /* !! */  = nL.K("utBa4T3JID6nFUc8", equals(java.lang.Object ), (String)nL.a(24585, -5202), (Object)var5_6);
                                    if (var3_3) break block12;
                                    if (v2 /* !! */  != false) break block13;
                                    break block14;
                                }
                                case 585510352: {
                                    v3 = new Object[3];
                                    v3[2] = var4_5;
                                    v3[1] = var5_6;
                                    v3[0] = var2_2;
                                    hi.a("\u00a5", (Object)this, (Object)v3, (long)875567866134109485L);
                                    if (!var3_3) break block15;
                                    ** GOTO lbl-1000
                                }
                                case 585510353: lbl-1000:
                                // 2 sources

                                {
                                    hi.a("\u00f2", (Object)this, (Map)nL.K("utBa4T3JID6nFUc8", copyOf(java.util.Map<? extends K, ? extends V> ), var4_5), (long)1151291039357543845L);
                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)464858603634145893L);
                                    return;
                                }
                                case 585510351: 
                            }
                            throw null;
                        }
                        v2 /* !! */  = var6_4 /* !! */  = (CallSite)((nL.a(12099, 8559816448861409501L) + nL.a(5967, 4901976180170303498L) ^ nL.a(22681, 7788632356271351644L)) + nL.a(27367, 4164926129174894060L));
                    }
                    if (!var3_3) continue;
                }
                var6_4 /* !! */  = (CallSite)((nL.a(31158, 630930863318320757L) ^ nL.a(15448, 676552479365694397L)) / nL.a(2798, 4251696279289476559L) / 3 - nL.a(7062, 5637540133352842440L));
                if (!var3_3) continue;
            }
            var6_4 /* !! */  = (CallSite)((nL.a(12099, 8559816448861409501L) + nL.a(5967, 4901976180170303498L) ^ nL.a(22681, 7788632356271351644L)) + nL.a(27367, 4164926129174894060L));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void d(Object[] var1_1) {
        block14: {
            block13: {
                block11: {
                    block12: {
                        var2_2 = Dl.S();
                        var3_3 /* !! */  = ((nL.a(13834, 678480776567589217L) - nL.a(22009, 2882209993966840549L)) / nL.a(28853, 2443061693286371207L) ^ nL.a(18054, 1592176060041361904L)) - nL.a(31015, 8115105335868638785L);
                        if (!var2_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                v0 /* !! */  = nL.K("utBa4T3JID6nFUc8", B(), (OM)hi.a("\u00e9", (Object)this, (long)1185952504198942019L));
                                if (!var2_2) break block11;
                                if (v0 /* !! */  == false) break block12;
                                break block13;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)855077849368972809L)}, (long)614486618438634934L);
                                if (!var2_2) lbl-1000:
                                // 2 sources

                                {
                                    return;
                                }
                                break block14;
                                break;
                            }
                        }
lbl16:
                        // 5 sources

                        while (true) {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 1999998999: {
                                    ** continue;
                                }
                                case 1999998997: {
                                    ** continue;
                                }
                                case 1999998996: 
                            }
                            return;
                        }
                    }
                    v0 /* !! */  = (CallSite)(nL.a(18936, 5176875101593630346L) / nL.a(5628, 787594027237485304L) - nL.a(25374, 3206395104934321262L));
                }
                var3_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) ** GOTO lbl16
            }
            var3_3 /* !! */  = ((nL.a(13766, 2078680279786228428L) - nL.a(25609, 737525121134254956L)) / nL.a(6422, 2161154235834967621L) ^ nL.a(3354, 5070513940715385410L)) * nL.a(16012, 8016527568226681188L) + nL.a(23031, 4028892653007496920L);
            if (var2_2) ** GOTO lbl16
        }
        var3_3 /* !! */  = nL.a(20107, 5624319823510499798L) / nL.a(4273, 1303640564404170745L) - nL.a(639, 7188119518854790574L);
        ** while (true)
    }

    private void q(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("j", (long)1217461351966232571L), (Object)new Object[0], (long)691333946803954318L);
    }

    public boolean h(Object[] objectArray) {
        String string = (String)objectArray[0];
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1151291039357543845L), (Object)string, (long)768493130217600408L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "\u00eb\u0091O\u00b3\u00ad\u001b\u8d4a\u8fc8\u0002\u00da\u00d4!'\u0080Ly\u0092\u8ba1\u8a92\u6549\u4e71\u00e7\u00c0C\u0081\u00a23\u0081\u00d1,\u00dc\u0015B\u00059^W\u00a4\u00ed\u0013sQU\u00da\u0096\u000b\u0012J^\u00f8\u00f6\u008b\u00c3nl\u00e3`\u0093y\u0005\u00c0\u00ffh\u0090\n\u0004\u00d5$ D\n\u00bcj\u00df\u00cc\u0082\u00d2\u008d\u0017zw'\u8b9e\u5388\u0091\u00e1\u00a6Fil\u0085\u00e4\u00ab\u8b12\u8ab5\u653f\u4e95\u5922\u8d59\u00d0J\u00f8\u00ba\u00fe`op|H\u0095\u0099,\u00f3\u0013\u00c3\u00df\u00e6\u00d4\u0000,\u0084\u0004\u0014]\u00d4\u00c1";
                        var12_3 = "\u00eb\u0091O\u00b3\u00ad\u001b\u8d4a\u8fc8\u0002\u00da\u00d4!'\u0080Ly\u0092\u8ba1\u8a92\u6549\u4e71\u00e7\u00c0C\u0081\u00a23\u0081\u00d1,\u00dc\u0015B\u00059^W\u00a4\u00ed\u0013sQU\u00da\u0096\u000b\u0012J^\u00f8\u00f6\u008b\u00c3nl\u00e3`\u0093y\u0005\u00c0\u00ffh\u0090\n\u0004\u00d5$ D\n\u00bcj\u00df\u00cc\u0082\u00d2\u008d\u0017zw'\u8b9e\u5388\u0091\u00e1\u00a6Fil\u0085\u00e4\u00ab\u8b12\u8ab5\u653f\u4e95\u5922\u8d59\u00d0J\u00f8\u00ba\u00fe`op|H\u0095\u0099,\u00f3\u0013\u00c3\u00df\u00e6\u00d4\u0000,\u0084\u0004\u0014]\u00d4\u00c1".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 33;
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
                            var10_2 = "\u00ae/#I\u0005=\u000f\u00bb\u00e2\u001c";
                            var12_3 = "\u00ae/#I\u0005=\u000f\u00bb\u00e2\u001c".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 65;
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
                                    v15 = 61;
                                    break;
                                }
                                case 1: {
                                    v15 = 70;
                                    break;
                                }
                                case 2: {
                                    v15 = 68;
                                    break;
                                }
                                case 3: {
                                    v15 = 116;
                                    break;
                                }
                                case 4: {
                                    v15 = 77;
                                    break;
                                }
                                case 5: {
                                    v15 = 111;
                                    break;
                                }
                                default: {
                                    v15 = 6;
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
                nL.c = var13;
                nL.d = new String[11];
                nL.n = nL.a(24580, -17571);
                nL.Z = nL.a(24591, 7687);
                var0_7 = 6635950623491032468L;
                var6_8 = new long[232];
                var3_9 = 0;
                var4_10 = "\u00ad\u0002'~\u00b2d\u00aeA\u00b7\u00ae\u0011\u00ac\u0089\u008c\u009cx?\u00f24\u008e\u00eeN\u000f\u00cbav\u00ed\u0096BDN\u0081\u008b\u00d6h\u0015\u0097.\u009aY\u0087\u00b6\u00877/\u00f1#\u00d9\u008f\u0001\u00b5\u001f\u00c6\u00e3\u00d1h\u00ce\u00f1\u00c0e4W\r-\u009e\u00a2\u008ao\u00ee\u00d5\u00e3Q{T \u0096\u0084\u00bb\u00b9\u009c\u00dd\u00e9\u000b\u00e5\u00da\u00a0\u008a>\u00e0QS\u00f37\u00f9\u0081\u00fd\u00f7\u00fe\\Y\u008c\u0098V;\u009e\u00ddH\u008f\u0016\u00c1\u00cc\u00e4\u00ea4-'\u00dd\u0018j\u00edo\u000b\u00bf/Eu\u0007\u00f1\u0006r#[\u0018v\u0012\u0085\u0012A\u00fe\u00b3E6\u008d\u0082\u00d5JV\u00b7\u0014\u00db\u00ee\t\u00eb\u00fan)\u0090_\f\u00f0v\u00d1\u0084\u00f6\u0011\u000bdy\u001e\u00a6\u001d\u0083]ZR\u0082\u00d6$]\u00aa\u00c9\u00c1\u0010\fQ0\u00ff\u0013,lK\u0085\u0002\u00e9\u00ab\u0003\u0011\u0000}\u00d2\u00f2\u00dd\u008a>N\u00183\u00ea\u00e6\u00ff\f7\u00de&\u00aes\u00b6f\u00df)I~K\n\u00c2V\u008a1\u0016\u00d8b\u00fd\u0000F\u00ae\u009d8p\u00cdA\u001fS\u00c0qX.\u00aac\u00df\u00a0\u0011\u00b3\u00ad\u00caN\u007ffemc\u00c2u\u00dfY:b\u001dV\u00d2Bw\u008fl\u0018/-\u008d\u00b7\u00e8\u00f6\u0014\u00ba+3\u00e9\u00b1\u00c0\u0019\u00af\u00e0L\u008d\u00ads\u0006\u00a1c\u00d2\u00a1\u00b0T\u00c0W\u009cT'\u00c8\u00b7v\u00b5E\u001c\u0003bh\u00cc\u00d8T\u00d6\u00ea(\f\u00a1K\"\u00d3Y):\u0082\u00c3\u00d3\u00a4Jy\u0001e\u00a4+=\u00b0\u00d4\u001f9\u0005\u00da\u0099\u00d8\u0084\u00ee\u00e2C\u009e*0#\u00a0]\u00ae\u00ba\u0002S\u0081\u00deH\u0089b\u00ac]\u0004\u00a3\u009c\u008a\u00de\u00ed\u00b4\u001fJ\u00f3\u00f3{\u0088\u00a3M\\\u0087.\u00fe\u00d2\u00c2\u001f\u0085}\b*\u00b5[\u0004\u000ff\u0019\u00fa\u0007F~\b\u00a6q\u0014e\u00d5m\u00c0\u0095s\u0003\u00ba\u0001\u00c8l\u00fe\u00154i\u00e3\u008c(\u0004_\u008cX\u0096\u00be\u0001<\u000b@\u00d4\u0011\u009c\u00f75$7\u0001L\u00f8\u0004pb-S\u00edv\u00aep\u00f3\u0010\u000f\u00c9\u00a0\u00e2\u009ftc\b\u0089R0\u009f\u00a6\u00d8\u00d8\u00cf-\u00f0\u00cb+\u00cc\u00acq\u00bb|\u00c8\u001e?\u00beD\u00a5O\u00ff\u00f4Of\u0019\u00d78\u00e3JQ\u008a\u00a4\u00d0q3EQ\u00eb\u00b1\u0019\u0007\u0081\u00cc|A\u001f\u00f6\u00b2\u00fe\u00feG\u00e2@\u00d0\u00d3~f\u0000\u00e4O/a\u000f\u0015\u0097\u007f2\u0096A\u00f6\u00b1\u00faR-\u00ea$(\u00d9\u00143Y\u0003\u00d4\u00178\u001f\u00a7\u009aS\u00baTF\u00e1u\u00bdz\u00b0\u00cb\u00b2%\u00f6h\u00a8S\u00b7[\u00f1d\u00d8\u00f9\b\u00cd\u00d9\u00db\u00b3\u00a5\u0083\u00bcy O\u0005c\u00ba\u0090\u00ba\u0085\u0082\u0006\u00d7\u0017-\u00bc\u00cbl\u00a8x.\u009ege\u00ab\u00fbE\u0086\u00f5\u00c4\bk\u0096$\u00a4\u00f5\u00cc\u00b84\u00bc\u0012\u0014H;\u00c5\u00b1\u009e0\u00a6\u00bb\u00a8c\u0096\u00d0i\u00e9\u00e8\u00f7)\u008c)\u00f4!\u001f\u00d1\u008d\u0086\u008b\u00c2\u0001&\u00e6\u00f2\u00a0\u0082\u00afb\\\u00a9yQ\u0093\u0098\u0019\u008a4\u00f7\u00b3\u00fa\n\u0005\u00ddX*;Y,ZT\u00f3\u001b\u0087\u00b0MF\u0017\u00d9z\u0099/\\@5\u00e1j\u001d\u001b\u00f5\u00b4.\brQ\u0007SJ\u0019E\u0017\u00d2\u00e6\u008e\u00ae<H!O\u00d2\u0010\u00ffn\u00ea\u00c0\u009c\u00a6\u0005z\u0017K\u00b76\u0010\u001e\u0095\u0097\u00c8\u00d25\u0081\u00e7\u00e9:\u009c\u0015+\u00e0\u00c6Js\u00ca\u009d\u00a6\u008ew\u0087\u00a1\u00fe\u008f\u00c2\u00b7\u0095m\u00ef}{\u00d7a\u0098\u0094\u00a6jR\u0085Z\u001b\u00fe,\u00d8>\u0000%\u00f3a$\u00f0\u00de\u00c72\u008a\u00d0\u00fa*R\u009a\u009f\u0015\u00a5d\u0085\u00ca\u0014Cj>EdR\u0006\u00c0|\u009e\u00b8\u0014~V\u00e4\u00ea\u00e5P5{=\u00f7\u0092\u00bf\u00a3\u00a2)\u0097\u0002\u00d1\u00db\u0019\u008av\u0095A\u00d9g\u00b4\b\u000b\u00a0\u0083q|\u00bcaW\u00c81\u00bb\u00bf`\u00f1\u00c1\u00f2\u00ef\u001c\u0005e\u009a\u000e\u00a7H-C\u00f35\u00a1\u00d6\u0098\u00f9\u00f6\u00f1\u0005\u0093\u00df8Fe\u00a7\u0002\u00c5eJc1\u00dcE\u00c8\u00e6\u00c7\u00aaQ*%c\u00d6\u00b7\u0005T\u0092\u00a8%\u00cc3\u00daL\u0000\u0016')\u001a\u008bmD:\t\u00e1\u009c\u00f3\u00a7\u000bV#i\u0016\u00b8@\u0091l\u0014\u0012]T1\u008f\u00f0\u0080\u00cd\u0093{\u001eA \u00f7\u001a\u00da\u00bf\u00d10V\u00df*\u0004 wI\u00be\u00d5\u0013\u00b2\u0017uf\u0005\u0011\u00f2{\u00b5\u00a8\u0083\u00e9Q\u00a57g\u00dc`\u0094\u0086\u00df\u00b0h\u00fc\u008b\u00ae\u008d\u0097~\u0085{\u0092\u00b7\u00f5\u007fF\u001cL\u00e3\u00c6y\u00fb\u0002\u00bcNC\u00faU\u00f1J8hqb}\u0014\u00f0\u00d7=\u00e8\u001c\u00ae{*\u00d5Go\u0098\u00fa6';\u00eb2f\u00d6\u00eaT\u00bc\u009b\u00c4\u00d9\u00c5=\u0016\b\u00ccgr\u0094\u009bM\u0081_\u00ec\u00cb\u0019\u00af\u00be\u001a\u00fb\u0095\u000f\u00ad\u00f4\u00b0\u000f\u00ce\u008b\u00a1\u0092EJ\u0098A]\u00f8$\u00dc\u0095\u001d\u0015\u009cx\n\u00d8\u00de\u00d8\\0\u008dBQ\u00c2e\u0091\u00cf\u00d3\u0010\u00daS\u00d3=B\u00f8SI\u00a4\u00f4Ca\u0088\u00fb\u007f)\u0099ZAA\u001e\u00ecu\u0091\u00d2\u00d2\u00962\u008e%\u00b2\u00ccV\u001a\u00f1\u00bbR\u00f4\u008c\u0080\u00c7Fu\f\u0083\u00d2/\u001dK\u00abD\f\u00daVe\u00f3\u008b\u00eb]\u00e3\u00b7>\u00f8:\u0089\u00bb\u0019`\u0014\u00a8\u00c3nn\u00d9`/\u0082\u00d0\u00ca\u00ec\u00beG\u0091\u00de{\u0097\u00c8\u0019\t\u00e0\u00c1\u0012\tPf\u009f\u0000\u00a1\u00fcl5\u00c0a\u00a7oq>y\u0087%\u00c4\u0012A\u00c0E\u0086\u00e4\u00ac\u000b\u00f4\u009d\u00d9\u00a2\u00c5\u00a8\u0016W\u00f0\u00dd\u00a2\u00d9\u00f6\u00b0\u00d3?\u00f0\u00f5\u00ce\u00d9a\u00deQ\"\u009c\u00abU\u00cd\u001c\u00d6\u00c2\u00aa\u00ee\u001d\u00cf6\u0012K;VSr\u00cf\u00f7\u00a0?\u00c6#\u00d2\u00d6\u0081\u00cf\u0014\u00ea\u00eb\u00dd\u009b\u0094\u0099\u00fa\u00e2\u00db\u00dd\u0010\u00d5\u00dcm\u00b5\u00c3\u009c\u00ee\u00f9\u00ef\u00f4\u00ae\r\u00832e\u0092\u00ab\u0006h\u00fe\u00e5\u00dcu.\u00bf\u0010\u00a4qMF\u00d2\u00d6/z\u0017\u00e5\u00d9\u001f\u0082\u008fh\u0099\u0000\u0090\u00c5\u00eb1\u00d0\\\u008f\u001cxx\u0013./_\u00c5Sg\u00a1F\f\u00f1\u00ff-\u00d8\u007f*+a\u00de\u0093D`\u00f8\u0097\u00d8\u0015W#\bV\u00ba\u00ba\u00ea\u00b0\f\u00bcs\u00c6\u00d8\u00d1\u00c0\u00ca\\\u00e2|\u00ab\u0000ab\u00e7\u00f42\u009ct\u00a8\u0096\u0084\u00f5(\u00daG-@\u0011\u00ebj\u0099\u00a4.;\u00aa\u0099\u00b1\u00bc\b\u00c4\nq\u0093uV\"@\u0000\u00141\u00b0\u00e37<H\u008b?\u00c8\u008ebP\u00bb\u000b\u00a4\u00caT\"\u0011\u009dwY\u008f\u00ca\u00ccI\u00ee\u0096\u00ad\t\u00e7\u00cb\u00f6\u00da8\u00b2\u001b\u00972\u00905\u00e9\u00dfJ\u0091\b\u00a9\u000e\u00ec;\u00b2\u00c4\u00e6d=o\u0089\u00c0t\u001b\u00b6\u00c8-\u00d1\u00a9\u00cd\u00d6\u00a3\u00a7KH\u0096\u00b7b\u00eaZ6\u00da\u00ee\u0087\u00ae\u000b\u00f0\u00e7\u00a6C7XB\u0092\u00a0L\u00e8$\r\u001a\u008e\u009c!\u00ff\u00ac\u00ff\u00a4ogl\u00b81\u0013}\u00f2\u00a1,\u00e7~\u0015\u0081\u00df\u00d1)\u00c7,\u00c4\u00f6XNv\u00b7\u00a9\u00d5\u0004$\u00d5\u00aa\u00862b\u00df>\u00e7M[\u00a2B\u0015u\u0013S\u00dcm\u00feS\u00e3Q[\u0012\u0094\u009a\u0019\u00a6\u00a5\u009b\u00a4\u00a5!\u00a1\u0082\u00b0.\u009c\u008f\u00c8\b\u00a4m\u00bf#\\bt(\u0017:\u00be\u00c1L\u007f\u0081A\u00d7\t\u0015\u009c+\u00f0\u0012R\u00ce\u00ea\u0011\u00baN\u00f4\u009fG\u0013\u00c66_\u0011\u0094G\u00b0D\u00b0\u00cb\u00b8\u000e\u00d3\u00c5\u00f2^\u009d(\u0099\u00f4\u0017J\u0005\"\u00a8P\u00b9uq\u007f\u00d9\u009e\u00e6\u00ddi\u00e8\u00ea\u0089C\u00ed\u00a7rYR\u0014\u00d1\u00c3\u00bd\u00b3O\u00c5*g&\u0090\u0089\u0082\u009a\u00d3\u00a8U!\u0099\u00ab{2\u001c\ft\u0089\u00b22\u00fb\u0088T\u0007;\u00c3 \u00b94daH!@\u00b7\u00a1R\u00d7\u00bc\u00df\u00ec\u00f4\u0088c}/_\u00af\u000b\u008d\u0088\u00c6\u0005O\u00d3\u0096uPG,\u00c4\u00d6\u00de\u001bQ>\u009f\u0002\u00be\u00ccHz\u00c0\u0094{\u00075<e\f\u00e6\u0017a\u0011\u00c7\u0082y0\u00ee-\u00ee\u00f3\u0001\u009a\u00a5\u00e5\u0014\n\u009a\u00cdX\u00bc\u00af\b\u00e1\u0014\u0082E\u009d\u008aA(\u00fak4\u00ba\t\u00e21\u00c2\u00fe;xDPB\u00df\u00d2\u00d9\",L\u008a\u0081(\u008cP\u00d0D\u00e1hMH\u0012\u00dd\u00e7\u007f\u00b0C\u0082\u009f\u00de\u00f8";
                var5_11 = "\u00ad\u0002'~\u00b2d\u00aeA\u00b7\u00ae\u0011\u00ac\u0089\u008c\u009cx?\u00f24\u008e\u00eeN\u000f\u00cbav\u00ed\u0096BDN\u0081\u008b\u00d6h\u0015\u0097.\u009aY\u0087\u00b6\u00877/\u00f1#\u00d9\u008f\u0001\u00b5\u001f\u00c6\u00e3\u00d1h\u00ce\u00f1\u00c0e4W\r-\u009e\u00a2\u008ao\u00ee\u00d5\u00e3Q{T \u0096\u0084\u00bb\u00b9\u009c\u00dd\u00e9\u000b\u00e5\u00da\u00a0\u008a>\u00e0QS\u00f37\u00f9\u0081\u00fd\u00f7\u00fe\\Y\u008c\u0098V;\u009e\u00ddH\u008f\u0016\u00c1\u00cc\u00e4\u00ea4-'\u00dd\u0018j\u00edo\u000b\u00bf/Eu\u0007\u00f1\u0006r#[\u0018v\u0012\u0085\u0012A\u00fe\u00b3E6\u008d\u0082\u00d5JV\u00b7\u0014\u00db\u00ee\t\u00eb\u00fan)\u0090_\f\u00f0v\u00d1\u0084\u00f6\u0011\u000bdy\u001e\u00a6\u001d\u0083]ZR\u0082\u00d6$]\u00aa\u00c9\u00c1\u0010\fQ0\u00ff\u0013,lK\u0085\u0002\u00e9\u00ab\u0003\u0011\u0000}\u00d2\u00f2\u00dd\u008a>N\u00183\u00ea\u00e6\u00ff\f7\u00de&\u00aes\u00b6f\u00df)I~K\n\u00c2V\u008a1\u0016\u00d8b\u00fd\u0000F\u00ae\u009d8p\u00cdA\u001fS\u00c0qX.\u00aac\u00df\u00a0\u0011\u00b3\u00ad\u00caN\u007ffemc\u00c2u\u00dfY:b\u001dV\u00d2Bw\u008fl\u0018/-\u008d\u00b7\u00e8\u00f6\u0014\u00ba+3\u00e9\u00b1\u00c0\u0019\u00af\u00e0L\u008d\u00ads\u0006\u00a1c\u00d2\u00a1\u00b0T\u00c0W\u009cT'\u00c8\u00b7v\u00b5E\u001c\u0003bh\u00cc\u00d8T\u00d6\u00ea(\f\u00a1K\"\u00d3Y):\u0082\u00c3\u00d3\u00a4Jy\u0001e\u00a4+=\u00b0\u00d4\u001f9\u0005\u00da\u0099\u00d8\u0084\u00ee\u00e2C\u009e*0#\u00a0]\u00ae\u00ba\u0002S\u0081\u00deH\u0089b\u00ac]\u0004\u00a3\u009c\u008a\u00de\u00ed\u00b4\u001fJ\u00f3\u00f3{\u0088\u00a3M\\\u0087.\u00fe\u00d2\u00c2\u001f\u0085}\b*\u00b5[\u0004\u000ff\u0019\u00fa\u0007F~\b\u00a6q\u0014e\u00d5m\u00c0\u0095s\u0003\u00ba\u0001\u00c8l\u00fe\u00154i\u00e3\u008c(\u0004_\u008cX\u0096\u00be\u0001<\u000b@\u00d4\u0011\u009c\u00f75$7\u0001L\u00f8\u0004pb-S\u00edv\u00aep\u00f3\u0010\u000f\u00c9\u00a0\u00e2\u009ftc\b\u0089R0\u009f\u00a6\u00d8\u00d8\u00cf-\u00f0\u00cb+\u00cc\u00acq\u00bb|\u00c8\u001e?\u00beD\u00a5O\u00ff\u00f4Of\u0019\u00d78\u00e3JQ\u008a\u00a4\u00d0q3EQ\u00eb\u00b1\u0019\u0007\u0081\u00cc|A\u001f\u00f6\u00b2\u00fe\u00feG\u00e2@\u00d0\u00d3~f\u0000\u00e4O/a\u000f\u0015\u0097\u007f2\u0096A\u00f6\u00b1\u00faR-\u00ea$(\u00d9\u00143Y\u0003\u00d4\u00178\u001f\u00a7\u009aS\u00baTF\u00e1u\u00bdz\u00b0\u00cb\u00b2%\u00f6h\u00a8S\u00b7[\u00f1d\u00d8\u00f9\b\u00cd\u00d9\u00db\u00b3\u00a5\u0083\u00bcy O\u0005c\u00ba\u0090\u00ba\u0085\u0082\u0006\u00d7\u0017-\u00bc\u00cbl\u00a8x.\u009ege\u00ab\u00fbE\u0086\u00f5\u00c4\bk\u0096$\u00a4\u00f5\u00cc\u00b84\u00bc\u0012\u0014H;\u00c5\u00b1\u009e0\u00a6\u00bb\u00a8c\u0096\u00d0i\u00e9\u00e8\u00f7)\u008c)\u00f4!\u001f\u00d1\u008d\u0086\u008b\u00c2\u0001&\u00e6\u00f2\u00a0\u0082\u00afb\\\u00a9yQ\u0093\u0098\u0019\u008a4\u00f7\u00b3\u00fa\n\u0005\u00ddX*;Y,ZT\u00f3\u001b\u0087\u00b0MF\u0017\u00d9z\u0099/\\@5\u00e1j\u001d\u001b\u00f5\u00b4.\brQ\u0007SJ\u0019E\u0017\u00d2\u00e6\u008e\u00ae<H!O\u00d2\u0010\u00ffn\u00ea\u00c0\u009c\u00a6\u0005z\u0017K\u00b76\u0010\u001e\u0095\u0097\u00c8\u00d25\u0081\u00e7\u00e9:\u009c\u0015+\u00e0\u00c6Js\u00ca\u009d\u00a6\u008ew\u0087\u00a1\u00fe\u008f\u00c2\u00b7\u0095m\u00ef}{\u00d7a\u0098\u0094\u00a6jR\u0085Z\u001b\u00fe,\u00d8>\u0000%\u00f3a$\u00f0\u00de\u00c72\u008a\u00d0\u00fa*R\u009a\u009f\u0015\u00a5d\u0085\u00ca\u0014Cj>EdR\u0006\u00c0|\u009e\u00b8\u0014~V\u00e4\u00ea\u00e5P5{=\u00f7\u0092\u00bf\u00a3\u00a2)\u0097\u0002\u00d1\u00db\u0019\u008av\u0095A\u00d9g\u00b4\b\u000b\u00a0\u0083q|\u00bcaW\u00c81\u00bb\u00bf`\u00f1\u00c1\u00f2\u00ef\u001c\u0005e\u009a\u000e\u00a7H-C\u00f35\u00a1\u00d6\u0098\u00f9\u00f6\u00f1\u0005\u0093\u00df8Fe\u00a7\u0002\u00c5eJc1\u00dcE\u00c8\u00e6\u00c7\u00aaQ*%c\u00d6\u00b7\u0005T\u0092\u00a8%\u00cc3\u00daL\u0000\u0016')\u001a\u008bmD:\t\u00e1\u009c\u00f3\u00a7\u000bV#i\u0016\u00b8@\u0091l\u0014\u0012]T1\u008f\u00f0\u0080\u00cd\u0093{\u001eA \u00f7\u001a\u00da\u00bf\u00d10V\u00df*\u0004 wI\u00be\u00d5\u0013\u00b2\u0017uf\u0005\u0011\u00f2{\u00b5\u00a8\u0083\u00e9Q\u00a57g\u00dc`\u0094\u0086\u00df\u00b0h\u00fc\u008b\u00ae\u008d\u0097~\u0085{\u0092\u00b7\u00f5\u007fF\u001cL\u00e3\u00c6y\u00fb\u0002\u00bcNC\u00faU\u00f1J8hqb}\u0014\u00f0\u00d7=\u00e8\u001c\u00ae{*\u00d5Go\u0098\u00fa6';\u00eb2f\u00d6\u00eaT\u00bc\u009b\u00c4\u00d9\u00c5=\u0016\b\u00ccgr\u0094\u009bM\u0081_\u00ec\u00cb\u0019\u00af\u00be\u001a\u00fb\u0095\u000f\u00ad\u00f4\u00b0\u000f\u00ce\u008b\u00a1\u0092EJ\u0098A]\u00f8$\u00dc\u0095\u001d\u0015\u009cx\n\u00d8\u00de\u00d8\\0\u008dBQ\u00c2e\u0091\u00cf\u00d3\u0010\u00daS\u00d3=B\u00f8SI\u00a4\u00f4Ca\u0088\u00fb\u007f)\u0099ZAA\u001e\u00ecu\u0091\u00d2\u00d2\u00962\u008e%\u00b2\u00ccV\u001a\u00f1\u00bbR\u00f4\u008c\u0080\u00c7Fu\f\u0083\u00d2/\u001dK\u00abD\f\u00daVe\u00f3\u008b\u00eb]\u00e3\u00b7>\u00f8:\u0089\u00bb\u0019`\u0014\u00a8\u00c3nn\u00d9`/\u0082\u00d0\u00ca\u00ec\u00beG\u0091\u00de{\u0097\u00c8\u0019\t\u00e0\u00c1\u0012\tPf\u009f\u0000\u00a1\u00fcl5\u00c0a\u00a7oq>y\u0087%\u00c4\u0012A\u00c0E\u0086\u00e4\u00ac\u000b\u00f4\u009d\u00d9\u00a2\u00c5\u00a8\u0016W\u00f0\u00dd\u00a2\u00d9\u00f6\u00b0\u00d3?\u00f0\u00f5\u00ce\u00d9a\u00deQ\"\u009c\u00abU\u00cd\u001c\u00d6\u00c2\u00aa\u00ee\u001d\u00cf6\u0012K;VSr\u00cf\u00f7\u00a0?\u00c6#\u00d2\u00d6\u0081\u00cf\u0014\u00ea\u00eb\u00dd\u009b\u0094\u0099\u00fa\u00e2\u00db\u00dd\u0010\u00d5\u00dcm\u00b5\u00c3\u009c\u00ee\u00f9\u00ef\u00f4\u00ae\r\u00832e\u0092\u00ab\u0006h\u00fe\u00e5\u00dcu.\u00bf\u0010\u00a4qMF\u00d2\u00d6/z\u0017\u00e5\u00d9\u001f\u0082\u008fh\u0099\u0000\u0090\u00c5\u00eb1\u00d0\\\u008f\u001cxx\u0013./_\u00c5Sg\u00a1F\f\u00f1\u00ff-\u00d8\u007f*+a\u00de\u0093D`\u00f8\u0097\u00d8\u0015W#\bV\u00ba\u00ba\u00ea\u00b0\f\u00bcs\u00c6\u00d8\u00d1\u00c0\u00ca\\\u00e2|\u00ab\u0000ab\u00e7\u00f42\u009ct\u00a8\u0096\u0084\u00f5(\u00daG-@\u0011\u00ebj\u0099\u00a4.;\u00aa\u0099\u00b1\u00bc\b\u00c4\nq\u0093uV\"@\u0000\u00141\u00b0\u00e37<H\u008b?\u00c8\u008ebP\u00bb\u000b\u00a4\u00caT\"\u0011\u009dwY\u008f\u00ca\u00ccI\u00ee\u0096\u00ad\t\u00e7\u00cb\u00f6\u00da8\u00b2\u001b\u00972\u00905\u00e9\u00dfJ\u0091\b\u00a9\u000e\u00ec;\u00b2\u00c4\u00e6d=o\u0089\u00c0t\u001b\u00b6\u00c8-\u00d1\u00a9\u00cd\u00d6\u00a3\u00a7KH\u0096\u00b7b\u00eaZ6\u00da\u00ee\u0087\u00ae\u000b\u00f0\u00e7\u00a6C7XB\u0092\u00a0L\u00e8$\r\u001a\u008e\u009c!\u00ff\u00ac\u00ff\u00a4ogl\u00b81\u0013}\u00f2\u00a1,\u00e7~\u0015\u0081\u00df\u00d1)\u00c7,\u00c4\u00f6XNv\u00b7\u00a9\u00d5\u0004$\u00d5\u00aa\u00862b\u00df>\u00e7M[\u00a2B\u0015u\u0013S\u00dcm\u00feS\u00e3Q[\u0012\u0094\u009a\u0019\u00a6\u00a5\u009b\u00a4\u00a5!\u00a1\u0082\u00b0.\u009c\u008f\u00c8\b\u00a4m\u00bf#\\bt(\u0017:\u00be\u00c1L\u007f\u0081A\u00d7\t\u0015\u009c+\u00f0\u0012R\u00ce\u00ea\u0011\u00baN\u00f4\u009fG\u0013\u00c66_\u0011\u0094G\u00b0D\u00b0\u00cb\u00b8\u000e\u00d3\u00c5\u00f2^\u009d(\u0099\u00f4\u0017J\u0005\"\u00a8P\u00b9uq\u007f\u00d9\u009e\u00e6\u00ddi\u00e8\u00ea\u0089C\u00ed\u00a7rYR\u0014\u00d1\u00c3\u00bd\u00b3O\u00c5*g&\u0090\u0089\u0082\u009a\u00d3\u00a8U!\u0099\u00ab{2\u001c\ft\u0089\u00b22\u00fb\u0088T\u0007;\u00c3 \u00b94daH!@\u00b7\u00a1R\u00d7\u00bc\u00df\u00ec\u00f4\u0088c}/_\u00af\u000b\u008d\u0088\u00c6\u0005O\u00d3\u0096uPG,\u00c4\u00d6\u00de\u001bQ>\u009f\u0002\u00be\u00ccHz\u00c0\u0094{\u00075<e\f\u00e6\u0017a\u0011\u00c7\u0082y0\u00ee-\u00ee\u00f3\u0001\u009a\u00a5\u00e5\u0014\n\u009a\u00cdX\u00bc\u00af\b\u00e1\u0014\u0082E\u009d\u008aA(\u00fak4\u00ba\t\u00e21\u00c2\u00fe;xDPB\u00df\u00d2\u00d9\",L\u008a\u0081(\u008cP\u00d0D\u00e1hMH\u0012\u00dd\u00e7\u007f\u00b0C\u0082\u009f\u00de\u00f8".length();
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
lbl114:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u009a\u00e5\b8[\u0095\u00bb\u00cea\u00c5%\u00f2\u00e9\u00b7\u009c\u00a9";
                    var5_11 = "\u009a\u00e5\b8[\u0095\u00bb\u00cea\u00c5%\u00f2\u00e9\u00b7\u009c\u00a9".length();
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
lbl127:
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
lbl138:
                // 1 sources

                ** continue;
            }
        }
        nL.e = var6_8;
        nL.f = new Integer[232];
        nL.h = new nL();
        nL.b = new Gson();
        nL.a = hi.a("G", nL.a(24590, -727), (long)930715878644109460L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String a() {
        var1_1 = Dl.t();
        var3_2 = hi.a("G", (int)((nL.a(11641, 4150824383070605984L) * nL.a(26577, 989756640604510279L) ^ nL.a(7938, 374635076354646139L)) - nL.a(27400, 8281611961375052822L)), (int)nL.a(17400, 2285403859073989730L), (long)834203424483934088L) - nL.a(16463, 8527811705728434126L);
        if (!var1_1) ** GOTO lbl13
        block13: while (true) {
            block18: {
                block17: {
                    block16: {
                        v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1185952504198942019L), (long)1195666890398404100L);
                        if (var1_1) break block16;
                        if (v0 == false) break block17;
                        v0 = var3_2 = (reference)((nL.a(8883, 1662992262178118948L) * nL.a(21202, 1875042712286064093L) ^ nL.a(24083, 2914744992219717892L) ^ nL.a(27351, 8572034934196622676L)) / 2 ^ nL.a(19974, 4396787410686046694L));
                    }
                    if (!var1_1) break block18;
                }
                var3_2 = (reference)((nL.a(22353, 3538471279459920077L) - nL.a(13272, 3903781865930296537L) ^ nL.a(12562, 6151296688609005105L)) - nL.a(6806, 5502811142370960764L));
            }
            switch (var3_2) {
                default: {
                    continue block13;
                }
                case 19514031: {
                    return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1185952504198942019L), (Object)new Object[0], (long)477330943061601680L);
                }
                case 19514030: {
                    v1 = hi.a("\u00a5", (Object)hi.a("\u00a5", (String)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)507036999202746167L), (long)789438897355831922L), (long)1224517143314977883L), (Object)hi.a("j", (long)795501881625394938L), (long)474957951668622990L);
                    if (!var1_1) break block13;
                    return v1;
                }
                case 19514029: {
                    return nL.a(24589, 16940);
                }
            }
            break;
        }
        var3_2 = nL.K("utBa4T3JID6nFUc8", max(int int ), (int)hi.a("G", (int)nL.a(32743, 8360303192069947498L), (int)nL.a(6043, 5128830378450528272L), (long)834203424483934088L), (int)nL.a(7925, 9085660990502281642L)) - nL.a(27011, 907909251491256013L) + nL.a(25572, 2929013288149605550L);
        switch (var3_2) {
            case -1146958725: {
                hi.a("G", (long)1058499983070318781L);
                hi.a("G", (long)575122545431547897L);
                return v1;
            }
        }
        return v1;
        catch (Throwable v2) {
            var3_2 = (reference)((nL.a(28464, 6932110644758401027L) + nL.a(905, 8307402025032105022L) ^ nL.a(13839, 6009972121425414522L)) - nL.a(30344, 3281795423876729318L));
        }
        switch (var3_2) {
            default: {
                var2_3 = v2;
                return "";
            }
            case 610803801: 
        }
        throw null;
    }

    public String l(Object[] objectArray) {
        String string = (String)objectArray[0];
        return (String)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1151291039357543845L), (Object)string, (Object)string, (long)1241751088262622582L));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Exception decompiling
     */
    private void V(Object var1_1, Object var2_2, Object var3_3) {
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

    private static void lambda$appendResources$0(Map map, String string, JsonElement jsonElement) {
        CallSite callSite = hi.a("G", (Object)jsonElement, (Object)string, (long)1019445539392580148L);
        hi.a("\u00a5", (Object)map, (Object)string, (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1175408104430817735L), (Object)callSite, (long)909756653359432071L), (Object)nL.a(24581, 13379), (long)583074564835792837L), (long)1121879748672195632L);
    }

    public OM s(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)1185952504198942019L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void E(OM var1_1) {
        block11: {
            block10: {
                block13: {
                    block12: {
                        var2_2 = Dl.t();
                        var3_3 /* !! */  = nL.a(17749, 5755510071169809043L) / nL.a(15473, 8679334319479751531L) / nL.a(4273, 1303640564404170745L) ^ nL.a(19993, 4767430472081305918L);
                        if (!var2_2) break block12;
lbl4:
                        // 2 sources

                        while (var1_1 /* !! */  == null) {
                            break block10;
                        }
                        break block13;
lbl7:
                        // 1 sources

                        while (true) {
                            var1_1 /* !! */  = hi.a("j", (long)404864177458797334L);
                            if (var2_2) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    hi.a("\u00f2", (Object)this, (OM)var1_1 /* !! */ , (long)1185952504198942019L);
                                    hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)855077849368972809L)}, (long)614486618438634934L);
                                    return;
                                }
                            }
                            break block11;
                            break;
                        }
                    }
lbl16:
                    // 4 sources

                    while (true) {
                        switch (var3_3 /* !! */ ) {
                            default: {
                                ** GOTO lbl4
                            }
                            case 620496062: {
                                ** continue;
                            }
                            case 620496060: {
                                ** continue;
                            }
                            case 620496059: 
                        }
                        hi.a("G", (long)740307216543007282L);
                        var3_3 /* !! */  = (int)(hi.a("G", (int)(nL.a(14026, 5613773436485372295L) / nL.a(4273, 1303640564404170745L) ^ nL.a(25397, 4604970114787761253L)), (int)nL.a(26651, 903630644335957898L), (long)834203424483934088L) + nL.a(4263, 8667867648518533100L) + nL.a(27296, 5265884229702866263L));
                        if (!var2_2) continue;
                        break;
                    }
                }
                var3_3 /* !! */  = nL.a(18466, 3649451936633321427L) * nL.a(31111, 2738933898766534231L) / nL.a(2798, 4251696279289476559L) + nL.a(25125, 7807831690844790025L);
                if (!var2_2) ** GOTO lbl16
            }
            var3_3 /* !! */  = (nL.a(5459, 4886626750237813334L) ^ nL.a(23112, 4988929989010744768L)) * nL.a(23010, 753497577988941510L) - nL.a(32669, 7064422922718560358L) + nL.a(1220, 8263711795813039082L) ^ nL.a(13386, 3692363721234975710L);
            if (!var2_2) ** GOTO lbl16
        }
        var3_3 /* !! */  = nL.a(11126, 5130668779161883898L) * nL.a(26654, 3369250187891463950L) / nL.a(2798, 4251696279289476559L) + nL.a(29493, 1783244531397020759L);
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite K(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x600D) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 51;
                case 1 -> 115;
                case 2 -> 82;
                case 3 -> 235;
                case 4 -> 119;
                case 5 -> 38;
                case 6 -> 102;
                case 7 -> 11;
                case 8 -> 22;
                case 9 -> 55;
                case 10 -> 122;
                case 11 -> 219;
                case 12 -> 198;
                case 13 -> 5;
                case 14 -> 46;
                case 15 -> 147;
                case 16 -> 234;
                case 17 -> 124;
                case 18 -> 202;
                case 19 -> 144;
                case 20 -> 230;
                case 21 -> 248;
                case 22 -> 97;
                case 23 -> 95;
                case 24 -> 203;
                case 25 -> 103;
                case 26 -> 52;
                case 27 -> 80;
                case 28 -> 128;
                case 29 -> 146;
                case 30 -> 65;
                case 31 -> 83;
                case 32 -> 139;
                case 33 -> 43;
                case 34 -> 1;
                case 35 -> 232;
                case 36 -> 153;
                case 37 -> 199;
                case 38 -> 238;
                case 39 -> 45;
                case 40 -> 60;
                case 41 -> 14;
                case 42 -> 133;
                case 43 -> 168;
                case 44 -> 62;
                case 45 -> 48;
                case 46 -> 36;
                case 47 -> 41;
                case 48 -> 50;
                case 49 -> 176;
                case 50 -> 140;
                case 51 -> 94;
                case 52 -> 90;
                case 53 -> 177;
                case 54 -> 29;
                case 55 -> 244;
                case 56 -> 79;
                case 57 -> 72;
                case 58 -> 75;
                case 59 -> 197;
                case 60 -> 225;
                case 61 -> 114;
                case 62 -> 194;
                case 63 -> 233;
                case 64 -> 241;
                case 65 -> 108;
                case 66 -> 117;
                case 67 -> 221;
                case 68 -> 132;
                case 69 -> 255;
                case 70 -> 84;
                case 71 -> 87;
                case 72 -> 56;
                case 73 -> 158;
                case 74 -> 182;
                case 75 -> 30;
                case 76 -> 227;
                case 77 -> 178;
                case 78 -> 224;
                case 79 -> 19;
                case 80 -> 210;
                case 81 -> 40;
                case 82 -> 252;
                case 83 -> 6;
                case 84 -> 183;
                case 85 -> 16;
                case 86 -> 44;
                case 87 -> 37;
                case 88 -> 70;
                case 89 -> 137;
                case 90 -> 160;
                case 91 -> 204;
                case 92 -> 157;
                case 93 -> 208;
                case 94 -> 9;
                case 95 -> 35;
                case 96 -> 127;
                case 97 -> 66;
                case 98 -> 69;
                case 99 -> 129;
                case 100 -> 247;
                case 101 -> 186;
                case 102 -> 149;
                case 103 -> 218;
                case 104 -> 195;
                case 105 -> 85;
                case 106 -> 54;
                case 107 -> 237;
                case 108 -> 74;
                case 109 -> 15;
                case 110 -> 190;
                case 111 -> 223;
                case 112 -> 123;
                case 113 -> 246;
                case 114 -> 68;
                case 115 -> 220;
                case 116 -> 151;
                case 117 -> 112;
                case 118 -> 64;
                case 119 -> 161;
                case 120 -> 152;
                case 121 -> 228;
                case 122 -> 2;
                case 123 -> 118;
                case 124 -> 222;
                case 125 -> 242;
                case 126 -> 187;
                case 127 -> 28;
                case 128 -> 175;
                case 129 -> 205;
                case 130 -> 25;
                case 131 -> 93;
                case 132 -> 239;
                case 133 -> 91;
                case 134 -> 229;
                case 135 -> 148;
                case 136 -> 100;
                case 137 -> 113;
                case 138 -> 217;
                case 139 -> 57;
                case 140 -> 231;
                case 141 -> 134;
                case 142 -> 63;
                case 143 -> 173;
                case 144 -> 77;
                case 145 -> 86;
                case 146 -> 136;
                case 147 -> 32;
                case 148 -> 206;
                case 149 -> 236;
                case 150 -> 211;
                case 151 -> 215;
                case 152 -> 111;
                case 153 -> 8;
                case 154 -> 150;
                case 155 -> 169;
                case 156 -> 17;
                case 157 -> 10;
                case 158 -> 88;
                case 159 -> 251;
                case 160 -> 121;
                case 161 -> 20;
                case 162 -> 201;
                case 163 -> 135;
                case 164 -> 254;
                case 165 -> 4;
                case 166 -> 106;
                case 167 -> 109;
                case 168 -> 98;
                case 169 -> 0;
                case 170 -> 105;
                case 171 -> 253;
                case 172 -> 170;
                case 173 -> 167;
                case 174 -> 185;
                case 175 -> 142;
                case 176 -> 163;
                case 177 -> 18;
                case 178 -> 27;
                case 179 -> 99;
                case 180 -> 192;
                case 181 -> 243;
                case 182 -> 78;
                case 183 -> 181;
                case 184 -> 110;
                case 185 -> 58;
                case 186 -> 92;
                case 187 -> 166;
                case 188 -> 7;
                case 189 -> 89;
                case 190 -> 120;
                case 191 -> 3;
                case 192 -> 42;
                case 193 -> 213;
                case 194 -> 209;
                case 195 -> 164;
                case 196 -> 125;
                case 197 -> 49;
                case 198 -> 61;
                case 199 -> 23;
                case 200 -> 59;
                case 201 -> 180;
                case 202 -> 73;
                case 203 -> 116;
                case 204 -> 107;
                case 205 -> 101;
                case 206 -> 33;
                case 207 -> 191;
                case 208 -> 174;
                case 209 -> 212;
                case 210 -> 162;
                case 211 -> 214;
                case 212 -> 143;
                case 213 -> 138;
                case 214 -> 21;
                case 215 -> 12;
                case 216 -> 24;
                case 217 -> 179;
                case 218 -> 53;
                case 219 -> 131;
                case 220 -> 245;
                case 221 -> 159;
                case 222 -> 193;
                case 223 -> 207;
                case 224 -> 47;
                case 225 -> 130;
                case 226 -> 165;
                case 227 -> 71;
                case 228 -> 39;
                case 229 -> 189;
                case 230 -> 250;
                case 231 -> 126;
                case 232 -> 196;
                case 233 -> 96;
                case 234 -> 184;
                case 235 -> 34;
                case 236 -> 145;
                case 237 -> 172;
                case 238 -> 76;
                case 239 -> 13;
                case 240 -> 67;
                case 241 -> 240;
                case 242 -> 141;
                case 243 -> 154;
                case 244 -> 155;
                case 245 -> 31;
                case 246 -> 200;
                case 247 -> 171;
                case 248 -> 226;
                case 249 -> 104;
                case 250 -> 156;
                case 251 -> 216;
                case 252 -> 26;
                case 253 -> 249;
                case 254 -> 188;
                default -> 81;
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
            nL.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3F56;
        if (f[n2] == null) {
            nL.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }
}
