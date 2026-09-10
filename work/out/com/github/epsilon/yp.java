/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.iH;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class yp {
    private final List<iH> r = new ArrayList<iH>();
    public static final yp e;
    private boolean f;
    private final Set<String> S = new HashSet<String>();
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

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

    private yp() {
    }

    public synchronized List O(Object[] objectArray) {
        return yp.O("cBFEAUYFoUDLO83f", unmodifiableList(java.util.List<? extends T> ), (List)((Object)hi.a("\u00e9", (Object)this, (long)598181179412839823L)));
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
                        var10_2 = "\u634d\u4e52\u5222\u8fde\u5ba8\u62bc\uff8c\u00a5<\u000b\u5f77\u758a\u91c2\u5954\u632a\u4e75\u001a\u0099\uffb0'\u00f3";
                        var12_3 = "\u634d\u4e52\u5222\u8fde\u5ba8\u62bc\uff8c\u00a5<\u000b\u5f77\u758a\u91c2\u5954\u632a\u4e75\u001a\u0099\uffb0'\u00f3".length();
                        var9_4 = 9;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 28;
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
                            var10_2 = "\u5f94\u75bb\u6595\u6770\u65d4\u00cc\u0007\u7620\u6371\u4e43\uff7b\u00e9\u00e8\n\u6327\u4eea\u52d4\u5979\u53e0\u590f\u8d75\uffb1\u00db\u00b7";
                            var12_3 = "\u5f94\u75bb\u6595\u6770\u65d4\u00cc\u0007\u7620\u6371\u4e43\uff7b\u00e9\u00e8\n\u6327\u4eea\u52d4\u5979\u53e0\u590f\u8d75\uffb1\u00db\u00b7".length();
                            var9_4 = 13;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 119;
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
                                    v15 = 99;
                                    break;
                                }
                                case 1: {
                                    v15 = 51;
                                    break;
                                }
                                case 2: {
                                    v15 = 80;
                                    break;
                                }
                                case 3: {
                                    v15 = 56;
                                    break;
                                }
                                case 4: {
                                    v15 = 65;
                                    break;
                                }
                                case 5: {
                                    v15 = 61;
                                    break;
                                }
                                default: {
                                    v15 = 41;
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
                yp.a = var13;
                yp.b = new String[4];
                var0_7 = 4691172121881016544L;
                var6_8 = new long[132];
                var3_9 = 0;
                var4_10 = "%\u00da\u00e8\u0016\u00c01\u00db\u00c0\u0088\u00b3\u00c6[\u00e2\u00da\u001fm\u00ff\u0094{\u00a4\u00b82o\u0011&\u00edT\u00d6\u0089)\b\u00dc\u008a\"\u00f2*<\u00f9M|\u0007\u0088\u00d6\u00ab(\u00faJy~\u00a5\u00a6!\u00df*\u0085\u0088E\u0092\u00af\u001e\u0001\u0001\u00cd\u00c2]\u00ba_(Z\u00ca\u00d4\u00ec1{\u0006\u00faw\u00a1|\u0011`#\u00be\u0082\u0091\u00dc\u00ce\\N\u0001\u00e2\u00c1\u00dd\u00110x\u0094]&p\u001e\b\u00d8\u00ba\u001f\u008d,`\u001b\u00efi@p\u00a6\u00f2\f\u00c7\u00fb\u001e\u0007\u00f6b\u00b2\u00abC}m\u0094\u00a9\u00c1\u007f\u00e8\u00acgo\u0001\u00f8e\u00b0\u0014SP\u00d4d\u008a\u0098/\u00fd\u009b=&o\u00aa>|\u00fd\u00e4P\u00a3+$\u0092f\u00f2 \u00d1\u00b8\u0010v\u00f2\u00f5\u00da8\u0083pJ\u009f\\MQ@\r\u00ce\\\u00d0\u009c}(\u00d2\u008d\u00b8\u00e2\u000e0~\u00e7h\u001b\u00f7\u00d9l\u00c4\u00a8\b\u00c2\u0001$\u001fB\u00d0\t\u000e\u00d9\u00d3y\u00b3p\u00c5\u00d6\u00ca\u00b54K/\u0003W\u001f\u00a5\u00dc\u00c6\u00f3\u0088\t\u0012\u0095\u00cc\u00f8\u008d\u0013\u00c5\u00da\u00f7\u00cd\u00b3\u0019g\u00b4\u007f\u00c5\r/\u00bbd\u0019\u00fc\u00a1XP\u00d7\u00f3\u00cb\u00d9)\u00bd\f\u00ba\u00df'\u00e6\u00f4\u0097\u00f2\u00b8\u0091r\u00ae[ZS\u00b5\u00dbF~\u00f6!G\u00a8\u00f5\u00f8\\\u00cc^\u00ae\u00f6K\u00d2\u00eaR\u0007\u009a\u009e\u00adi\u0098Z\u00e2\u00fb\u00eek0\u008f8$/\u00b5\u00fav\u0093$<\u00e6U@S\u000b\u00ec\u00ca\u0087\u00c8\u0015\u00f1\u00d5l\u00c1X\u00861\"\u00d2\u00e1\u00de\u008c\u00e6\u00bf\u00b1\u00cb\u00b0_\u00b5fq\u00bb\u0007OE&iX\u00bf!UA\u00ce\u0017\u0016\u00b98\u0003\u00a5\u00f8\u00b7<\u00a3\u00d7\u00e7B+\\\u009b\u00aa\u00c9\u00baL\u009b2\u008b&\u00ba\u0092q\u00dd\u001a\u00e2?\u00d5\u00cb\b\u0095\u00f2\u00f0.\u00a1A\u00d0\b\u00d6\u001b\u00fe\nT\u00f6\u00a3\u009eQw\u00cd\u00edb\ts\u0010\u00f7\u00ca\u00d0a\"\u00bc)\u00e33\u00c6\u00fb\u008b\u00a9FY}pW\u00eb\u00f6\u0004\u00e3\u0019=\u0087}\u00c8\u009e\u00b2\u00cc\u00c9\u001c\u00b0\u00a5\u0017\u009fS\u00cb\t\u00baZ\r\u00ba\u008eo\u00f0\u009f\u0014I7B\u0018.?\u00fe\u00f9\u00b0\u00c6\u00e5Y\u00e5\u0011M4\u00d0\u00f0\u00c5\u0018\u0097\u00e1wW\u0012(\u00e2\n\u00b9\u0017\u00d7B\f\u00f8\u00f7\u0094\u00e5g\u009c\u0092\u00a6h\u0010\u00d4\u00e53\u00fb\u001b\u001c\u0098\u0011)\u00e5/JW`\u00b1\u00d2<\u009c;x.>\u00fc\u0094\u00b8o\u00a9x\u0085\u00d0\u0007\r%\u007fpO'\u00f2\u000b\u00b8\f\u0093\u00bdM\u0007SZY\u00dei3Q\u00ce\u00fa\u00df\u009d}\u00c7\u00ee\u00caM\u00e9\u00f7\u00d1n\u008f\u00b7\u00cd\u00f3O\u009c#\u0003?\u001f\u0016lP\u00b05'6\u00e6\u00df\u00f8w\u00a1At\u0084d\u00c3\u000e\u0012\u0016\u00c3\u00a9\u0012]\u0087\u001b\u0087a\u00b3\u001d\u00cf\u00c6\u00c7S\u0013\u00ff\u00f7\u00c9\u008b\u0001f\u0007\u0080\u00e1\u00caK\u00ba\u00a2\u00a9l\u008f\u009dg\u0094Y\u008d%:\u00d8Z\u00d6W-:-Gh\u00ef\u00ccT\u00ef|\u00de\u0081\u001c\u0088\u00f1(\u00db\u0017~\u00ab\u0015\u00ef\u0094\u008d\u001bQ\\\u0000\u00ef\u00b3eH\u00ac\u00e1\u0092\u00bd\u00c7\u00c9\u00bc\b~\u00b3t\"zT\u0001F\u0096\u00cf\u00a5\u001f\u0003Y>\u00c3\u00ff\u00be\u0006\u00ae\u00a4\u00b9\u001e\u0004\u001c\u00cd\t\u00cb\u00cf\u009d\u0085\u0016.@\u0019<@\u0098\u00e2\u00f8\u00c3A6\u0007\n\u0092\u00b5\u0081\u00a6m\u00db\u00a3I\u00c2ie\u0089\"\u008d\u009b\u00d4\u00e4\u0094\u00be\f\u0003\u00104\u008f\u0013\u00c9\u00cd\u00ce\u000ev\u00cdVc6L:q\u00da\u008cw\u0012\u00fa\u009e\u00a5)$\u00e4\u00c0\u000e\"\u00db\u00ab\u00835\u00f0\\\u00dc\u00b9\f\u0098\u008f\u0082\u00fdIA\u0092\u00b7\u0012\u00ab\u00d5o\u00ad\u00b7\u00a9XP7\u001e\u00d4\u001a\u0089\u00079\u00ceJ-aW\u00d4\u0011\u00ff.L\"\u00be\u00adO\u009f\u00c0\u00f4+\u00cb\u00dcX\u00a0Lb8\u009c6\u00db\u00f1H\u0014\u0083U\u0000\u00fc\u0099\u00043G\u00be\\\u0003\b\u0017\u00dd\u00f7Pi\u00ad\u00ce\u00be;\u00b4\u001f_k=\u00d4Rf\u00d4<\u00c2\u00f6\u00d5\u00b6\u00f7\u0089\u009a\u00e3xWr&\u000f\u0094c\u00bbY\u00ccg\u00c7^\u00f7]\u00b0T\u001a\u009e\u0017l\u00c9Ng\u00e8\u0099\u0014{\u00b3\u00ca .\u00cd\u00e0lJ2Z\u00bc)\u00e2\u00ed\u00cf\u0084\u00b3\u00c1xN6\u009dO\u00ccV\u0090\u001ajw\u00f1s\u00d0\u00e3\u00d4\u00ff\u0000^\u009f7l\u00a9\u000e\u00a2\u00b2^\u00ae\u00d7\u009f\u00ac\u00ce\u00d7F\"\u00cf\u001e$\u000b\u0019\u00e4,\f}\u00f7\u0004qs\u0095\u0092\u00e4Xl\u00ee0\u00ad0C\u0015\u00e3;7\u0087\u00b9\u00fb\u00deBM|\u0096\u00cc\u00eb\u00ef\u00cd*\u0097O\u009f\u00a8\u00eb\u0003\u00faV\u00c6\u00fb\u007f:\u00b2z\u00eeCa\u00f8\u0086+}\u00f0\u00d1\u00ef\u000eQJ\u00d8\u00ab[\u00188";
                var5_11 = "%\u00da\u00e8\u0016\u00c01\u00db\u00c0\u0088\u00b3\u00c6[\u00e2\u00da\u001fm\u00ff\u0094{\u00a4\u00b82o\u0011&\u00edT\u00d6\u0089)\b\u00dc\u008a\"\u00f2*<\u00f9M|\u0007\u0088\u00d6\u00ab(\u00faJy~\u00a5\u00a6!\u00df*\u0085\u0088E\u0092\u00af\u001e\u0001\u0001\u00cd\u00c2]\u00ba_(Z\u00ca\u00d4\u00ec1{\u0006\u00faw\u00a1|\u0011`#\u00be\u0082\u0091\u00dc\u00ce\\N\u0001\u00e2\u00c1\u00dd\u00110x\u0094]&p\u001e\b\u00d8\u00ba\u001f\u008d,`\u001b\u00efi@p\u00a6\u00f2\f\u00c7\u00fb\u001e\u0007\u00f6b\u00b2\u00abC}m\u0094\u00a9\u00c1\u007f\u00e8\u00acgo\u0001\u00f8e\u00b0\u0014SP\u00d4d\u008a\u0098/\u00fd\u009b=&o\u00aa>|\u00fd\u00e4P\u00a3+$\u0092f\u00f2 \u00d1\u00b8\u0010v\u00f2\u00f5\u00da8\u0083pJ\u009f\\MQ@\r\u00ce\\\u00d0\u009c}(\u00d2\u008d\u00b8\u00e2\u000e0~\u00e7h\u001b\u00f7\u00d9l\u00c4\u00a8\b\u00c2\u0001$\u001fB\u00d0\t\u000e\u00d9\u00d3y\u00b3p\u00c5\u00d6\u00ca\u00b54K/\u0003W\u001f\u00a5\u00dc\u00c6\u00f3\u0088\t\u0012\u0095\u00cc\u00f8\u008d\u0013\u00c5\u00da\u00f7\u00cd\u00b3\u0019g\u00b4\u007f\u00c5\r/\u00bbd\u0019\u00fc\u00a1XP\u00d7\u00f3\u00cb\u00d9)\u00bd\f\u00ba\u00df'\u00e6\u00f4\u0097\u00f2\u00b8\u0091r\u00ae[ZS\u00b5\u00dbF~\u00f6!G\u00a8\u00f5\u00f8\\\u00cc^\u00ae\u00f6K\u00d2\u00eaR\u0007\u009a\u009e\u00adi\u0098Z\u00e2\u00fb\u00eek0\u008f8$/\u00b5\u00fav\u0093$<\u00e6U@S\u000b\u00ec\u00ca\u0087\u00c8\u0015\u00f1\u00d5l\u00c1X\u00861\"\u00d2\u00e1\u00de\u008c\u00e6\u00bf\u00b1\u00cb\u00b0_\u00b5fq\u00bb\u0007OE&iX\u00bf!UA\u00ce\u0017\u0016\u00b98\u0003\u00a5\u00f8\u00b7<\u00a3\u00d7\u00e7B+\\\u009b\u00aa\u00c9\u00baL\u009b2\u008b&\u00ba\u0092q\u00dd\u001a\u00e2?\u00d5\u00cb\b\u0095\u00f2\u00f0.\u00a1A\u00d0\b\u00d6\u001b\u00fe\nT\u00f6\u00a3\u009eQw\u00cd\u00edb\ts\u0010\u00f7\u00ca\u00d0a\"\u00bc)\u00e33\u00c6\u00fb\u008b\u00a9FY}pW\u00eb\u00f6\u0004\u00e3\u0019=\u0087}\u00c8\u009e\u00b2\u00cc\u00c9\u001c\u00b0\u00a5\u0017\u009fS\u00cb\t\u00baZ\r\u00ba\u008eo\u00f0\u009f\u0014I7B\u0018.?\u00fe\u00f9\u00b0\u00c6\u00e5Y\u00e5\u0011M4\u00d0\u00f0\u00c5\u0018\u0097\u00e1wW\u0012(\u00e2\n\u00b9\u0017\u00d7B\f\u00f8\u00f7\u0094\u00e5g\u009c\u0092\u00a6h\u0010\u00d4\u00e53\u00fb\u001b\u001c\u0098\u0011)\u00e5/JW`\u00b1\u00d2<\u009c;x.>\u00fc\u0094\u00b8o\u00a9x\u0085\u00d0\u0007\r%\u007fpO'\u00f2\u000b\u00b8\f\u0093\u00bdM\u0007SZY\u00dei3Q\u00ce\u00fa\u00df\u009d}\u00c7\u00ee\u00caM\u00e9\u00f7\u00d1n\u008f\u00b7\u00cd\u00f3O\u009c#\u0003?\u001f\u0016lP\u00b05'6\u00e6\u00df\u00f8w\u00a1At\u0084d\u00c3\u000e\u0012\u0016\u00c3\u00a9\u0012]\u0087\u001b\u0087a\u00b3\u001d\u00cf\u00c6\u00c7S\u0013\u00ff\u00f7\u00c9\u008b\u0001f\u0007\u0080\u00e1\u00caK\u00ba\u00a2\u00a9l\u008f\u009dg\u0094Y\u008d%:\u00d8Z\u00d6W-:-Gh\u00ef\u00ccT\u00ef|\u00de\u0081\u001c\u0088\u00f1(\u00db\u0017~\u00ab\u0015\u00ef\u0094\u008d\u001bQ\\\u0000\u00ef\u00b3eH\u00ac\u00e1\u0092\u00bd\u00c7\u00c9\u00bc\b~\u00b3t\"zT\u0001F\u0096\u00cf\u00a5\u001f\u0003Y>\u00c3\u00ff\u00be\u0006\u00ae\u00a4\u00b9\u001e\u0004\u001c\u00cd\t\u00cb\u00cf\u009d\u0085\u0016.@\u0019<@\u0098\u00e2\u00f8\u00c3A6\u0007\n\u0092\u00b5\u0081\u00a6m\u00db\u00a3I\u00c2ie\u0089\"\u008d\u009b\u00d4\u00e4\u0094\u00be\f\u0003\u00104\u008f\u0013\u00c9\u00cd\u00ce\u000ev\u00cdVc6L:q\u00da\u008cw\u0012\u00fa\u009e\u00a5)$\u00e4\u00c0\u000e\"\u00db\u00ab\u00835\u00f0\\\u00dc\u00b9\f\u0098\u008f\u0082\u00fdIA\u0092\u00b7\u0012\u00ab\u00d5o\u00ad\u00b7\u00a9XP7\u001e\u00d4\u001a\u0089\u00079\u00ceJ-aW\u00d4\u0011\u00ff.L\"\u00be\u00adO\u009f\u00c0\u00f4+\u00cb\u00dcX\u00a0Lb8\u009c6\u00db\u00f1H\u0014\u0083U\u0000\u00fc\u0099\u00043G\u00be\\\u0003\b\u0017\u00dd\u00f7Pi\u00ad\u00ce\u00be;\u00b4\u001f_k=\u00d4Rf\u00d4<\u00c2\u00f6\u00d5\u00b6\u00f7\u0089\u009a\u00e3xWr&\u000f\u0094c\u00bbY\u00ccg\u00c7^\u00f7]\u00b0T\u001a\u009e\u0017l\u00c9Ng\u00e8\u0099\u0014{\u00b3\u00ca .\u00cd\u00e0lJ2Z\u00bc)\u00e2\u00ed\u00cf\u0084\u00b3\u00c1xN6\u009dO\u00ccV\u0090\u001ajw\u00f1s\u00d0\u00e3\u00d4\u00ff\u0000^\u009f7l\u00a9\u000e\u00a2\u00b2^\u00ae\u00d7\u009f\u00ac\u00ce\u00d7F\"\u00cf\u001e$\u000b\u0019\u00e4,\f}\u00f7\u0004qs\u0095\u0092\u00e4Xl\u00ee0\u00ad0C\u0015\u00e3;7\u0087\u00b9\u00fb\u00deBM|\u0096\u00cc\u00eb\u00ef\u00cd*\u0097O\u009f\u00a8\u00eb\u0003\u00faV\u00c6\u00fb\u007f:\u00b2z\u00eeCa\u00f8\u0086+}\u00f0\u00d1\u00ef\u000eQJ\u00d8\u00ab[\u00188".length();
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
                    var4_10 = "l%\u0098C\u008d\u00ac3)EN\u00f8\u00b7\f\u0001\u00d6F";
                    var5_11 = "l%\u0098C\u008d\u00ac3)EN\u00f8\u00b7\f\u0001\u00d6F".length();
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
        yp.c = var6_8;
        yp.d = new Integer[132];
        yp.e = new yp();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean Z(Object[] var1_1) {
        var2_2 = var1_1[0];
        var3_3 = Dl.t();
        var4_4 /* !! */  = yp.a(1307, 1862540529691549750L) ^ yp.a(743, 724791581244188506L) ^ yp.a(4918, 567187296218183298L) ^ yp.a(20882, 2974395069934384221L);
        if (!var3_3) ** GOTO lbl13
        block9: while (true) {
            block13: {
                block12: {
                    if ((String)var2_2 != null) break block12;
                    var4_4 /* !! */  = (yp.a(15972, 5306807602139323382L) ^ yp.a(13994, 2941782798275990399L)) + yp.a(24187, 7416388750712749016L);
                    if (!var3_3) break block13;
                }
                var4_4 /* !! */  = (yp.a(27512, 9167346926319374015L) ^ yp.a(17967, 3611406294838518750L)) + yp.a(19825, 5187275894648744091L);
                if (var3_3) ** GOTO lbl33
            }
            block10: while (true) {
                switch (var4_4 /* !! */ ) {
                    default: {
                        continue block9;
                    }
                    case 44860409: {
                        v0 = hi.a("\u00a5", (String)var2_2, (long)601063317567675907L);
                        if (var3_3) ** GOTO lbl34
                        if (v0 == false) ** GOTO lbl33
                        ** GOTO lbl36
                    }
                    case 44860410: {
                        v1 = true;
                        var4_4 /* !! */  = (((yp.a(3849, 7833500994098653899L) ^ yp.a(31480, 4523650566735470361L)) - yp.a(32458, 1362974246339484439L)) / yp.a(28572, 7749181698523990528L) ^ yp.a(6890, 2921992023714758403L)) + yp.a(19761, 1982933102036068531L);
                        if (!var3_3) ** GOTO lbl39
                        ** GOTO lbl38
                    }
                    case 44860408: {
                        v1 = false;
                        if (var3_3) {
                            return v1;
                        }
                        ** GOTO lbl38
                    }
lbl33:
                    // 2 sources

                    v0 = hi.a("G", (int)(yp.a(305, 8464986653895287997L) + yp.a(24408, 8234619857038457578L) ^ yp.a(10696, 8224603587923823638L)), (int)yp.a(12771, 2133610368265966692L), (long)834203424483934088L) + yp.a(18140, 3169523373998646042L);
lbl34:
                    // 2 sources

                    var4_4 /* !! */  = (int)v0;
                    if (!var3_3) continue block10;
lbl36:
                    // 2 sources

                    var4_4 /* !! */  = (yp.a(572, 2617102296490371063L) ^ yp.a(22893, 4402621778377456864L)) + yp.a(25418, 50918208626231028L);
                    continue block10;
lbl38:
                    // 2 sources

                    var4_4 /* !! */  = (((yp.a(20726, 1519605246079022342L) ^ yp.a(10900, 6769849572146859896L)) - yp.a(32069, 3459926961581955178L)) / yp.a(9561, 185572533850816736L) ^ yp.a(20264, 8386825761377692409L)) + yp.a(19520, 1138878291655174634L);
lbl39:
                    // 2 sources

                    switch (var4_4 /* !! */ ) {
                        default: {
                            return v1;
                        }
                        case -263563608: 
                    }
                    hi.a("G", (float)1.0f, (long)945348514596968233L);
                    return true;
                    case 44860412: 
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public synchronized void P(Object[] objectArray) {
        Iterable iterable = (Iterable)objectArray[0];
        boolean bl = Dl.S();
        int n = yp.a(16109, 4447162032659880824L) ^ yp.a(15804, 5082872134110107766L) ^ yp.a(9868, 901017685600944972L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        Object object2 = hi.a("G", (Object)iterable, (long)375182581916676704L);
                        if (!bl) break block9;
                        if (object2 != false) break block10;
                        object2 = object = (Object)(yp.O("cBFEAUYFoUDLO83f", max(int int ), (int)(yp.a(28241, 8135391426893056899L) - yp.a(8077, 8720196469161032281L)), (int)yp.a(16073, 2480597981440760623L)) ^ yp.a(15848, 5611090045994620973L));
                    }
                    if (bl) break block8;
                }
                object = yp.a(5739, 6956624151634408379L) / yp.a(4701, 2385977649154389974L) + yp.a(32759, 627417278121187928L) - yp.a(27347, 6673794104557440808L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case 765947625: {
                    return;
                }
                case 765947626: {
                    hi.a("\u00a5", (Object)iterable, this::f, (long)690272122365716213L);
                    return;
                }
                case 765947623: 
            }
            break;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    public synchronized void B() {
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
    public synchronized void f(iH var1_1) {
        block16: {
            var2_2 = Dl.S();
            var4_3 /* !! */  = (yp.a(31165, 4442824018480733294L) ^ yp.a(6617, 5718817355790941251L)) / yp.a(22504, 2702593450729157229L) + yp.a(17148, 7311597855662679882L) ^ yp.a(22062, 3959130816407516107L);
            if (var2_2) ** GOTO lbl14
            block11: while (true) {
                block19: {
                    block18: {
                        block17: {
                            v0 /* !! */  = yp.O("cBFEAUYFoUDLO83f", isNull(java.lang.Object ), (Object)var1_1);
                            if (!var2_2) break block17;
                            if (v0 /* !! */  != false) break block18;
                            v0 /* !! */  = (CallSite)(yp.a(11825, 7431522481592781745L) * yp.a(2296, 2178054687300971860L) + yp.a(28066, 8992702759220152374L));
                        }
                        var4_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) break block19;
                    }
                    var4_3 /* !! */  = yp.a(30061, 2429029899997909172L) - yp.a(5696, 8587124563636843490L) ^ yp.a(13253, 82687448399271489L);
                }
                block12: while (true) {
                    switch (var4_3 /* !! */ ) {
                        default: {
                            continue block11;
                        }
                        case -794375698: {
                            var3_4 = hi.a("\u00a5", (Object)var1_1, (long)709365441762266247L);
                            v1 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{var3_4}, (long)1040902602832411953L);
                            if (!var2_2) ** GOTO lbl34
                            if (v1 /* !! */  == false) ** GOTO lbl33
                            ** GOTO lbl36
                        }
                        case -794375699: {
                            hi.a("G", (long)589253768936098215L);
                            yp.O("cBFEAUYFoUDLO83f", Y(boolean ), (boolean)true);
                            var4_3 /* !! */  = (yp.a(18629, 1845029871931272459L) + yp.a(15629, 7969032333287708803L) ^ yp.a(15099, 4070128586839285543L)) / yp.a(20179, 5889908649747589980L) - yp.a(2027, 1378149506364662346L);
                            continue block12;
                        }
lbl33:
                        // 1 sources

                        v1 /* !! */  = (CallSite)(yp.a(12271, 3129282663250872945L) / yp.a(22333, 5210038281451123349L) * yp.a(20294, 3298211214840834725L) - yp.a(20999, 8571212307449132954L) + yp.a(32084, 6087142085008267479L) - yp.a(26981, 8282975321829313772L));
lbl34:
                        // 2 sources

                        var4_3 /* !! */  = (int)v1 /* !! */ ;
                        if (var2_2) break block16;
lbl36:
                        // 2 sources

                        var4_3 /* !! */  = yp.a(23189, 2669942937371066146L) * yp.a(30175, 3656838871776628769L) - yp.a(27338, 8325906285186617211L);
                        if (var2_2) break block16;
                        ** GOTO lbl62
                        case -794375701: 
                    }
                    break;
                }
                break;
            }
            return;
        }
        while (true) {
            block21: {
                block20: {
                    switch (var4_3 /* !! */ ) {
                        default: {
                            hi.a("\u00a5", (Object)hi.a("j", (long)930465074088781133L), (Object)yp.a(-22018, -22903), (Object)hi.a("\u00a5", var1_1.getClass(), (long)927605372257141128L), (long)1266867696886733794L);
                            return;
                        }
                        case 1581403764: {
                            v2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)940990813784688015L), (Object)var3_4, (long)489810460382064611L);
                            if (!var2_2) break block20;
                            if (v2 != false) break;
                            break block21;
                        }
                        case 1581403765: {
                            yp.O("cBFEAUYFoUDLO83f", warn(java.lang.String java.lang.Object ), (Logger)hi.a("j", (long)930465074088781133L), (String)yp.a(-22019, 25753), (Object)var3_4);
                            return;
                        }
                        case 1581403766: {
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)598181179412839823L), (Object)var1_1, (long)615358212536192384L);
                            return;
                        }
                        case 1581403763: {
                            throw null;
                        }
                    }
lbl62:
                    // 2 sources

                    v2 = hi.a("G", (int)yp.a(26402, 7286825766097093134L), (int)yp.a(13995, 5387386822139794258L), (long)834203424483934088L) - yp.a(21419, 3691590243089430102L);
                }
                var4_3 /* !! */  = (int)v2;
                if (var2_2) continue;
            }
            var4_3 /* !! */  = yp.a(32318, 9218890216910035944L) + yp.a(29117, 3246087314912941136L) - yp.a(29476, 1570189656317662903L) + yp.a(7135, 5556764707269803761L);
        }
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFA9FC) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 166;
                case 1 -> 161;
                case 2 -> 244;
                case 3 -> 4;
                case 4 -> 17;
                case 5 -> 90;
                case 6 -> 24;
                case 7 -> 111;
                case 8 -> 164;
                case 9 -> 235;
                case 10 -> 231;
                case 11 -> 157;
                case 12 -> 248;
                case 13 -> 151;
                case 14 -> 197;
                case 15 -> 228;
                case 16 -> 65;
                case 17 -> 226;
                case 18 -> 105;
                case 19 -> 234;
                case 20 -> 49;
                case 21 -> 2;
                case 22 -> 201;
                case 23 -> 181;
                case 24 -> 198;
                case 25 -> 218;
                case 26 -> 59;
                case 27 -> 47;
                case 28 -> 109;
                case 29 -> 183;
                case 30 -> 152;
                case 31 -> 5;
                case 32 -> 215;
                case 33 -> 96;
                case 34 -> 165;
                case 35 -> 0;
                case 36 -> 51;
                case 37 -> 168;
                case 38 -> 140;
                case 39 -> 233;
                case 40 -> 194;
                case 41 -> 159;
                case 42 -> 113;
                case 43 -> 97;
                case 44 -> 57;
                case 45 -> 126;
                case 46 -> 156;
                case 47 -> 1;
                case 48 -> 16;
                case 49 -> 22;
                case 50 -> 118;
                case 51 -> 104;
                case 52 -> 249;
                case 53 -> 255;
                case 54 -> 125;
                case 55 -> 87;
                case 56 -> 123;
                case 57 -> 26;
                case 58 -> 93;
                case 59 -> 50;
                case 60 -> 11;
                case 61 -> 163;
                case 62 -> 106;
                case 63 -> 15;
                case 64 -> 98;
                case 65 -> 199;
                case 66 -> 73;
                case 67 -> 224;
                case 68 -> 32;
                case 69 -> 247;
                case 70 -> 29;
                case 71 -> 112;
                case 72 -> 162;
                case 73 -> 67;
                case 74 -> 137;
                case 75 -> 133;
                case 76 -> 35;
                case 77 -> 108;
                case 78 -> 243;
                case 79 -> 200;
                case 80 -> 88;
                case 81 -> 44;
                case 82 -> 236;
                case 83 -> 55;
                case 84 -> 174;
                case 85 -> 7;
                case 86 -> 171;
                case 87 -> 119;
                case 88 -> 99;
                case 89 -> 144;
                case 90 -> 213;
                case 91 -> 94;
                case 92 -> 83;
                case 93 -> 131;
                case 94 -> 9;
                case 95 -> 195;
                case 96 -> 191;
                case 97 -> 117;
                case 98 -> 139;
                case 99 -> 63;
                case 100 -> 19;
                case 101 -> 182;
                case 102 -> 237;
                case 103 -> 148;
                case 104 -> 84;
                case 105 -> 135;
                case 106 -> 37;
                case 107 -> 45;
                case 108 -> 170;
                case 109 -> 253;
                case 110 -> 101;
                case 111 -> 175;
                case 112 -> 132;
                case 113 -> 121;
                case 114 -> 46;
                case 115 -> 54;
                case 116 -> 250;
                case 117 -> 184;
                case 118 -> 38;
                case 119 -> 23;
                case 120 -> 52;
                case 121 -> 208;
                case 122 -> 225;
                case 123 -> 80;
                case 124 -> 68;
                case 125 -> 82;
                case 126 -> 203;
                case 127 -> 69;
                case 128 -> 12;
                case 129 -> 134;
                case 130 -> 221;
                case 131 -> 43;
                case 132 -> 179;
                case 133 -> 143;
                case 134 -> 8;
                case 135 -> 124;
                case 136 -> 71;
                case 137 -> 176;
                case 138 -> 251;
                case 139 -> 79;
                case 140 -> 149;
                case 141 -> 246;
                case 142 -> 190;
                case 143 -> 177;
                case 144 -> 150;
                case 145 -> 172;
                case 146 -> 138;
                case 147 -> 207;
                case 148 -> 86;
                case 149 -> 154;
                case 150 -> 153;
                case 151 -> 129;
                case 152 -> 115;
                case 153 -> 36;
                case 154 -> 130;
                case 155 -> 33;
                case 156 -> 204;
                case 157 -> 110;
                case 158 -> 241;
                case 159 -> 75;
                case 160 -> 158;
                case 161 -> 160;
                case 162 -> 141;
                case 163 -> 70;
                case 164 -> 128;
                case 165 -> 31;
                case 166 -> 42;
                case 167 -> 187;
                case 168 -> 41;
                case 169 -> 103;
                case 170 -> 193;
                case 171 -> 89;
                case 172 -> 229;
                case 173 -> 188;
                case 174 -> 254;
                case 175 -> 245;
                case 176 -> 85;
                case 177 -> 142;
                case 178 -> 209;
                case 179 -> 20;
                case 180 -> 230;
                case 181 -> 120;
                case 182 -> 6;
                case 183 -> 76;
                case 184 -> 10;
                case 185 -> 62;
                case 186 -> 64;
                case 187 -> 102;
                case 188 -> 252;
                case 189 -> 40;
                case 190 -> 216;
                case 191 -> 92;
                case 192 -> 211;
                case 193 -> 107;
                case 194 -> 214;
                case 195 -> 56;
                case 196 -> 58;
                case 197 -> 167;
                case 198 -> 239;
                case 199 -> 186;
                case 200 -> 146;
                case 201 -> 178;
                case 202 -> 189;
                case 203 -> 30;
                case 204 -> 3;
                case 205 -> 206;
                case 206 -> 212;
                case 207 -> 242;
                case 208 -> 223;
                case 209 -> 100;
                case 210 -> 18;
                case 211 -> 53;
                case 212 -> 210;
                case 213 -> 180;
                case 214 -> 34;
                case 215 -> 72;
                case 216 -> 114;
                case 217 -> 74;
                case 218 -> 205;
                case 219 -> 145;
                case 220 -> 202;
                case 221 -> 21;
                case 222 -> 27;
                case 223 -> 77;
                case 224 -> 232;
                case 225 -> 219;
                case 226 -> 66;
                case 227 -> 28;
                case 228 -> 61;
                case 229 -> 116;
                case 230 -> 39;
                case 231 -> 155;
                case 232 -> 238;
                case 233 -> 217;
                case 234 -> 147;
                case 235 -> 136;
                case 236 -> 192;
                case 237 -> 185;
                case 238 -> 169;
                case 239 -> 220;
                case 240 -> 122;
                case 241 -> 25;
                case 242 -> 227;
                case 243 -> 14;
                case 244 -> 81;
                case 245 -> 60;
                case 246 -> 13;
                case 247 -> 91;
                case 248 -> 173;
                case 249 -> 240;
                case 250 -> 95;
                case 251 -> 48;
                case 252 -> 127;
                case 253 -> 222;
                case 254 -> 78;
                default -> 196;
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
            yp.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x65AD;
        if (d[n2] == null) {
            yp.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
