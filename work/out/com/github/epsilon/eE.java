/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.ItemStack
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.X0;
import com.github.epsilon.XG;
import com.github.epsilon.Xn;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class eE
extends e {
    private final X0 a = hi.a("\u00a5", (Object)this, (Object)eE.b(12627, 26942), (int)-1, (long)1114934834695297420L);
    private int H;
    private final XG E = hi.a("\u00a5", (Object)this, (Object)eE.b(12624, 5541), (int)0, (int)0, (int)eE.c(11477, 9047015161614036544L), (int)1, (long)1094453040828645510L);
    public static final eE q;
    private boolean N;
    private ItemStack K;
    private int m;
    private boolean C;
    private final XG W;
    private int u;
    private final Xn B = hi.a("\u00a5", (Object)this, (Object)eE.b(12629, 18937), (boolean)true, (long)1230617056439551805L);
    private int c;
    private static final String[] b;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] h;

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "\u00c8\u00d3\u00a5'\u0013\u0003\u00f9Y-g\u00bd\u00f4\u0005\u00ffd\u00b3\u0094n\f\u0099\u0086\u00c2\u0006T\u0090\u00f2\"\u00d7*\u000b\u009e";
                        var12_3 = "\u00c8\u00d3\u00a5'\u0013\u0003\u00f9Y-g\u00bd\u00f4\u0005\u00ffd\u00b3\u0094n\f\u0099\u0086\u00c2\u0006T\u0090\u00f2\"\u00d7*\u000b\u009e".length();
                        var9_4 = 12;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 12;
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
                            var10_2 = "\u0010\u0097cf\u00a6\u00ed\u00bd\u00c9U\u000e,:\u0089\u000bs\rBl\u007f\u00fa\u00e4\u00f0\u001a\u000bE";
                            var12_3 = "\u0010\u0097cf\u00a6\u00ed\u00bd\u00c9U\u000e,:\u0089\u000bs\rBl\u007f\u00fa\u00e4\u00f0\u001a\u000bE".length();
                            var9_4 = 13;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 115;
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
                                    v15 = 82;
                                    break;
                                }
                                case 1: {
                                    v15 = 88;
                                    break;
                                }
                                case 2: {
                                    v15 = 43;
                                    break;
                                }
                                case 3: {
                                    v15 = 54;
                                    break;
                                }
                                case 4: {
                                    v15 = 104;
                                    break;
                                }
                                case 5: {
                                    v15 = 62;
                                    break;
                                }
                                default: {
                                    v15 = 52;
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
                eE.b = var13;
                eE.d = new String[5];
                var0_7 = 8325850560581492240L;
                var6_8 = new long[155];
                var3_9 = 0;
                var4_10 = "\u001f\u00cb\u00f8\u00d6\u009d3\u00e9\u00e2\u0092\u00a0\u00ecc\u00c5\u00e1\u00b0D\u00bf\r\u008d\u0014u\u0002\u00f1}\u00d9t\u00f21X\u00dcm\u009f\u00f8\u00eff\u000b.\u0010\u00b7\u00e4\u009d\u00fa\u001e\u00f7K\u00f8\f\u008e\u00a9s\u00ef1\u00d4\u0005d\u00c3\u009f\\\u0099\u00a4\u0089\u00cd\u00ffR\u00b2\u00ed\u0092Lg\u00ab\u00a9r\u00e0\u00ac.u\rF*\u00e1\u00c3\u00d4\u0088[\u008d\u00d2W \u00af\u00dd\u00c9\u00e4\u00b6\u00adPA\u00e6\u00c0\u009d\u009c)_\u00d0\u00f5\u000e\u00d1\u009f\u00ddMT\u00d4\u00f3\u0082\u000b\u009c\u00fcXY\u0003\u0092\u00f5\u00cc\u008f\u00ee\u00b3\u00cdE\u001e\u00cb\u00a6\u00f5j%\u00a6\u00986$\u007f\u0001\u0003\u0097\u000b\u00c2\u00ed\"Vf\u008a\u0082J\u001a-\u0002\u0002\u00cdW\u00c2\u00dc<\"3K\u00b4\u0014\u009e\u0017\u00b0\u00f4\u0084@\u00f26\u00c4\u0015J\u00cf\u00f4|\u00c0\u001a\u0002\u00d2\u00fb\u00b0\u008f\u00d9#\u00abT\u00a6\u0001\u00f8t\u00bc \u0099\u001f\u00d3s\u0084=\u00feX\u0094\u0000f1%\u00c2\u00c1\u0081\u00c6\u0006\u00a4\u00c4\u00b6\u000b\u00cbK7j[\u00d4\u00d7\u00a0>\u0001\u00b8\u009eQV\u0002CF\u0005\u00d1\u0012\u0085\u0018\u00fd\u00fa[U\u00a1R\u00f0\u00ac\u00a8\u00eeR\u0090Z\u000fZ\u00f3\u00c9jhf\u008a\u0010Jj\u00e5\u00a2\u009e\u00ceC\u00fe\u00cb&\u000b\u0011&t\u000b\u008c\u00cf$\u0006\u009d\u00bd\u0082SP^\u00d9-u\u00b2J\b\u00d2\u00ab\u00fd\u00e4O\u00e0\u00e7\u00c6R\u00c1\u0080a\u0099e\b#\u00ee\u00f2<\u00d7\u00db\u00c1\u0089\u00c3\u001c\u008e\u00ad |~]Z\u00a8\u007f\u0000^\u00c0kk\u00a7\u001c\u001e\u00afV2\u00adv\u00e1~=\u00fc\u00fd{\u00ef\u00e7\u00aeu\u00b4fb\u0088\u0092\u0085\u00a3'=\u00f1^\u00cf\u00dc\u001a\u00b1#\u0089\u00f1B{eze\u00c1\u00d6\u0093\u00be\r6\u009b\u009d\u00cb\u001b\u00bc\u00d2\u008ed\u00f5\u00ff\u00e9\u001d\r\u0007[fyF\u00df\u0082aI\u00d6\u00a2_\u00a2\u00fd\u00ee\u00cf?FK\u00ad\u00e8\u0097i\u001b\u00de^\u009e\u00fd\u00e0\u00bb\u00d4\beDE\u0085\u00f1n\u00c2`{\u00d3\u0093D\u0012\n\u009d/\\\u0087 ,\u00c9\u00d2\u00af\u00c4\u0097K\f\u00f6\u0014\u0017\u0091lh,Bu\u0005\u0018#\u00ffy\u0006\u001d\u00c6j\u00aa\"Y\u00bd0\u00c6\u00b1-F\u00b8\u0082\u00af\u0097\u0091{A'\u00e2[\u00a8-\u0012\u00fc\u00e8\u00d5\u00e2\u00b8\u001c\u00dd\u009a\u00e9XP\u00ca\u0006\u00afr\u0086u\u007f-\u00f9\u00bf]\u00aa\u00a7D\\\u00a6\u009e\u008aN\u00b4\u00f8\u0092e`3\u0098<<\u00ce\u00db\u00a1\u00e2\u00dcKJ\u0004[c\u00a2u\u00ec\u00cf#L\u0084r\u00e5\u001de\u00a5F\u00a1\u00fa\b\u00ca#ma;R[\u00cb\u0097ty\u00d0*\u001bB\u008c\u00ad\u0084\u00d0\u00a3\u00d9\u0097RPS\\\u00b43\u00ad\u00ef IQ\u00f6\u0012\u00b7\u00a4\u00be\u00aa\u00bc5`\u00fbt\u00c1\u00c6\u0082#\u00fb\u00d7\u0003\u00ecw6\u0017\u0007\u0003&\u00e2=\u0014\u00b6\u00f3xP\u0004\u00ca\u00a4D\u00a2\u00d9P\u00b0\u008c\u008ebT\u00bb\u0095j\u00d3\u00ael\u00894\u00cd\u000f+4k\f\u00b0m\u0082\u00d1\u00a7\u009b\u00819B\u001f\u0094I\u007fz+O\u00e0\u0099\u00cf\u00bc\u009d\u00ca\u0015\u00bcwkt\u009eS\u0000&\u00f34\u0099\"\u00b3\u001a\u0087\u00d1m\u007f\u00962\u00115\u00ae\u0082^\u00ca\u00ff\u0010\u0093\f_PK\u009eg\u0002\u00f5\u007f\u00c2/\u0018\u00bbq\u00c0F\u0088\u00cd~\u0093\u00c0\u00b7w\u0005\u009a\u00c6\u0011\u001d\u00f2\u00ee\u00e84\u0082\u00dc\u00c7\u0003R\u008bU\u008c\u00ac\u009f\u0014\u00a8\u00b1\u00ef\u00f0\u007fO\u00c5`\u009e\u0090\u00e7C\u00b0\u00b4-S\u00e4\u00c4\u00ebs\u0014\u00db\u00ac\u0015A\u0090\u0082\u008d\u00dem<,\u0017\t\u00a3\u0013\u009b\u0086\u00f7\u001d.\u00eb\u008a\u00d5-\u00e68:`\u00c9\u00ea\u00c5\u0002\u00102\u00cf\u00fa8MD\u007f\u00cb\u008aB\u0019\u0011]\u00e3gf\u00e3\u00c2\u001e\u001f\u00b2\u00b2\u00c3\u00ca\u0092\u00ea\u00d7\u00aa)_\u00e7\u00c5[\u00a1\u008dS*v\u0002\u00e5u]\u00d4\fx+G\u0012\u00eco\u00b9gN\u00d3\u00cf\u00ae\u00a3x\u0087oy\u00bb\u00de9a\u00d4\u00dcn\u009f\u00da5\u00bfk\u00b5\u00e5DM\b\u0093\u00a2y\u0015`w\u0002P\f\u00f2\u00b5^S\t\u00b6\u0082a\u00f2\u00f3\u00e0z\u0017\u00e4\u009by\u001a\u009aX{\u0096\u00aa\u0019wt\r\u00bc-7\u00daoc\u0007\r\u00f9\u00e1\u00d9\u00dc[\u0096Y#\u00dd\u00c6\u00daT\u00bc\u00fe\u008a\u00a5e\u000f$|\u00eb\u0004\u001e\u0018\u00fc%\u00198\u00c7c\u00f5\u00b2\u001e\u00b5-\u00cf\u00907\u00aa\u00d5#G\u00f4\u0095r\u0082%\u00ab\u00dbC\u00fcb\u00b7\u00d0Xx~\u00cf-:D\u00ca~|\u007f~\u0094H%\u00e0\u00feH(**\f\u00eb\u00c0\u00a4\u00e78')\u0087]/\u00c1\u00b0\u008f\u0010A\u00e15\u008ci\u00ca\u00be\u008f\u00f5\n9\u00d1&\u00f3\u0083\u00e9~4\u00db\u00ff<\u00cc\u00fd\u0091~\u008a\u0091\u0097\u00dd\u00af\u0001\u0095c\u00ef\u00c73x\u00c5R\u00e2C\n\u0098\u00c45%\u00a4\u0086\u00988g\u000b\u00c1(\u0015\u000b)\u0019@\u00d7U\u00d2_hH\u0085<j6hB:\u008c\u000f\u0016H.\u000b\u00b0\u00de\u0091g\u001a\u00cf\u0093JF\u00bf\u00f3~\u00e5\u001d\u00dc\u00f0\u00ca\u00ba\u00d9\u000b\u00ab\u0004\u00cb\u00fe\u00f2\u00047\u001fM.I\u00b1Tv\u00aa(-\u0007]\u0019y\u00ae\u00f1H\u00a0\u0003\u00d8p\u00fe\u00af\u0001\u00b7\u0002\u00d7\rM\u0001P\u00fe\u009f\u0096\n\u00a1\u00ad-\u00ff3\u001b\u00cf;\u0018J^\u00d5;@P\u00d0\u0093\u00faQ;\u0089\u00b0\u00ed3\t\u0084?\u00d6\u0098RR\u00f1BH\u00ac\n\u009c\u00cc%\n\u001e\u0099\u00be\u0093\u00a6R\u008d\u008bN\u00ab\u00e8\u0006(\u00f3}E\u00a8\u00d4\u0013\u0095n\u008a\u00ack\u00a4\u00aa\u0096D\u00e5\u00a3\u0019\u00cc\u00bf$\u0089,\u00d7\u0000";
                var5_11 = "\u001f\u00cb\u00f8\u00d6\u009d3\u00e9\u00e2\u0092\u00a0\u00ecc\u00c5\u00e1\u00b0D\u00bf\r\u008d\u0014u\u0002\u00f1}\u00d9t\u00f21X\u00dcm\u009f\u00f8\u00eff\u000b.\u0010\u00b7\u00e4\u009d\u00fa\u001e\u00f7K\u00f8\f\u008e\u00a9s\u00ef1\u00d4\u0005d\u00c3\u009f\\\u0099\u00a4\u0089\u00cd\u00ffR\u00b2\u00ed\u0092Lg\u00ab\u00a9r\u00e0\u00ac.u\rF*\u00e1\u00c3\u00d4\u0088[\u008d\u00d2W \u00af\u00dd\u00c9\u00e4\u00b6\u00adPA\u00e6\u00c0\u009d\u009c)_\u00d0\u00f5\u000e\u00d1\u009f\u00ddMT\u00d4\u00f3\u0082\u000b\u009c\u00fcXY\u0003\u0092\u00f5\u00cc\u008f\u00ee\u00b3\u00cdE\u001e\u00cb\u00a6\u00f5j%\u00a6\u00986$\u007f\u0001\u0003\u0097\u000b\u00c2\u00ed\"Vf\u008a\u0082J\u001a-\u0002\u0002\u00cdW\u00c2\u00dc<\"3K\u00b4\u0014\u009e\u0017\u00b0\u00f4\u0084@\u00f26\u00c4\u0015J\u00cf\u00f4|\u00c0\u001a\u0002\u00d2\u00fb\u00b0\u008f\u00d9#\u00abT\u00a6\u0001\u00f8t\u00bc \u0099\u001f\u00d3s\u0084=\u00feX\u0094\u0000f1%\u00c2\u00c1\u0081\u00c6\u0006\u00a4\u00c4\u00b6\u000b\u00cbK7j[\u00d4\u00d7\u00a0>\u0001\u00b8\u009eQV\u0002CF\u0005\u00d1\u0012\u0085\u0018\u00fd\u00fa[U\u00a1R\u00f0\u00ac\u00a8\u00eeR\u0090Z\u000fZ\u00f3\u00c9jhf\u008a\u0010Jj\u00e5\u00a2\u009e\u00ceC\u00fe\u00cb&\u000b\u0011&t\u000b\u008c\u00cf$\u0006\u009d\u00bd\u0082SP^\u00d9-u\u00b2J\b\u00d2\u00ab\u00fd\u00e4O\u00e0\u00e7\u00c6R\u00c1\u0080a\u0099e\b#\u00ee\u00f2<\u00d7\u00db\u00c1\u0089\u00c3\u001c\u008e\u00ad |~]Z\u00a8\u007f\u0000^\u00c0kk\u00a7\u001c\u001e\u00afV2\u00adv\u00e1~=\u00fc\u00fd{\u00ef\u00e7\u00aeu\u00b4fb\u0088\u0092\u0085\u00a3'=\u00f1^\u00cf\u00dc\u001a\u00b1#\u0089\u00f1B{eze\u00c1\u00d6\u0093\u00be\r6\u009b\u009d\u00cb\u001b\u00bc\u00d2\u008ed\u00f5\u00ff\u00e9\u001d\r\u0007[fyF\u00df\u0082aI\u00d6\u00a2_\u00a2\u00fd\u00ee\u00cf?FK\u00ad\u00e8\u0097i\u001b\u00de^\u009e\u00fd\u00e0\u00bb\u00d4\beDE\u0085\u00f1n\u00c2`{\u00d3\u0093D\u0012\n\u009d/\\\u0087 ,\u00c9\u00d2\u00af\u00c4\u0097K\f\u00f6\u0014\u0017\u0091lh,Bu\u0005\u0018#\u00ffy\u0006\u001d\u00c6j\u00aa\"Y\u00bd0\u00c6\u00b1-F\u00b8\u0082\u00af\u0097\u0091{A'\u00e2[\u00a8-\u0012\u00fc\u00e8\u00d5\u00e2\u00b8\u001c\u00dd\u009a\u00e9XP\u00ca\u0006\u00afr\u0086u\u007f-\u00f9\u00bf]\u00aa\u00a7D\\\u00a6\u009e\u008aN\u00b4\u00f8\u0092e`3\u0098<<\u00ce\u00db\u00a1\u00e2\u00dcKJ\u0004[c\u00a2u\u00ec\u00cf#L\u0084r\u00e5\u001de\u00a5F\u00a1\u00fa\b\u00ca#ma;R[\u00cb\u0097ty\u00d0*\u001bB\u008c\u00ad\u0084\u00d0\u00a3\u00d9\u0097RPS\\\u00b43\u00ad\u00ef IQ\u00f6\u0012\u00b7\u00a4\u00be\u00aa\u00bc5`\u00fbt\u00c1\u00c6\u0082#\u00fb\u00d7\u0003\u00ecw6\u0017\u0007\u0003&\u00e2=\u0014\u00b6\u00f3xP\u0004\u00ca\u00a4D\u00a2\u00d9P\u00b0\u008c\u008ebT\u00bb\u0095j\u00d3\u00ael\u00894\u00cd\u000f+4k\f\u00b0m\u0082\u00d1\u00a7\u009b\u00819B\u001f\u0094I\u007fz+O\u00e0\u0099\u00cf\u00bc\u009d\u00ca\u0015\u00bcwkt\u009eS\u0000&\u00f34\u0099\"\u00b3\u001a\u0087\u00d1m\u007f\u00962\u00115\u00ae\u0082^\u00ca\u00ff\u0010\u0093\f_PK\u009eg\u0002\u00f5\u007f\u00c2/\u0018\u00bbq\u00c0F\u0088\u00cd~\u0093\u00c0\u00b7w\u0005\u009a\u00c6\u0011\u001d\u00f2\u00ee\u00e84\u0082\u00dc\u00c7\u0003R\u008bU\u008c\u00ac\u009f\u0014\u00a8\u00b1\u00ef\u00f0\u007fO\u00c5`\u009e\u0090\u00e7C\u00b0\u00b4-S\u00e4\u00c4\u00ebs\u0014\u00db\u00ac\u0015A\u0090\u0082\u008d\u00dem<,\u0017\t\u00a3\u0013\u009b\u0086\u00f7\u001d.\u00eb\u008a\u00d5-\u00e68:`\u00c9\u00ea\u00c5\u0002\u00102\u00cf\u00fa8MD\u007f\u00cb\u008aB\u0019\u0011]\u00e3gf\u00e3\u00c2\u001e\u001f\u00b2\u00b2\u00c3\u00ca\u0092\u00ea\u00d7\u00aa)_\u00e7\u00c5[\u00a1\u008dS*v\u0002\u00e5u]\u00d4\fx+G\u0012\u00eco\u00b9gN\u00d3\u00cf\u00ae\u00a3x\u0087oy\u00bb\u00de9a\u00d4\u00dcn\u009f\u00da5\u00bfk\u00b5\u00e5DM\b\u0093\u00a2y\u0015`w\u0002P\f\u00f2\u00b5^S\t\u00b6\u0082a\u00f2\u00f3\u00e0z\u0017\u00e4\u009by\u001a\u009aX{\u0096\u00aa\u0019wt\r\u00bc-7\u00daoc\u0007\r\u00f9\u00e1\u00d9\u00dc[\u0096Y#\u00dd\u00c6\u00daT\u00bc\u00fe\u008a\u00a5e\u000f$|\u00eb\u0004\u001e\u0018\u00fc%\u00198\u00c7c\u00f5\u00b2\u001e\u00b5-\u00cf\u00907\u00aa\u00d5#G\u00f4\u0095r\u0082%\u00ab\u00dbC\u00fcb\u00b7\u00d0Xx~\u00cf-:D\u00ca~|\u007f~\u0094H%\u00e0\u00feH(**\f\u00eb\u00c0\u00a4\u00e78')\u0087]/\u00c1\u00b0\u008f\u0010A\u00e15\u008ci\u00ca\u00be\u008f\u00f5\n9\u00d1&\u00f3\u0083\u00e9~4\u00db\u00ff<\u00cc\u00fd\u0091~\u008a\u0091\u0097\u00dd\u00af\u0001\u0095c\u00ef\u00c73x\u00c5R\u00e2C\n\u0098\u00c45%\u00a4\u0086\u00988g\u000b\u00c1(\u0015\u000b)\u0019@\u00d7U\u00d2_hH\u0085<j6hB:\u008c\u000f\u0016H.\u000b\u00b0\u00de\u0091g\u001a\u00cf\u0093JF\u00bf\u00f3~\u00e5\u001d\u00dc\u00f0\u00ca\u00ba\u00d9\u000b\u00ab\u0004\u00cb\u00fe\u00f2\u00047\u001fM.I\u00b1Tv\u00aa(-\u0007]\u0019y\u00ae\u00f1H\u00a0\u0003\u00d8p\u00fe\u00af\u0001\u00b7\u0002\u00d7\rM\u0001P\u00fe\u009f\u0096\n\u00a1\u00ad-\u00ff3\u001b\u00cf;\u0018J^\u00d5;@P\u00d0\u0093\u00faQ;\u0089\u00b0\u00ed3\t\u0084?\u00d6\u0098RR\u00f1BH\u00ac\n\u009c\u00cc%\n\u001e\u0099\u00be\u0093\u00a6R\u008d\u008bN\u00ab\u00e8\u0006(\u00f3}E\u00a8\u00d4\u0013\u0095n\u008a\u00ack\u00a4\u00aa\u0096D\u00e5\u00a3\u0019\u00cc\u00bf$\u0089,\u00d7\u0000".length();
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
                    var4_10 = "\u00e3\u00ef\u00d6\u0006\u00b1\u00fa\u00fe&D\u00fb\u00ced\u00147\u00fa\u00ed";
                    var5_11 = "\u00e3\u00ef\u00d6\u0006\u00b1\u00fa\u00fe&D\u00fb\u00ced\u00147\u00fa\u00ed".length();
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
        eE.e = var6_8;
        eE.h = new Integer[155];
        eE.q = new eE();
    }

    private eE() {
        super(eE.b(12626, 27924), (vY)((Object)hi.a("j", (long)526176563220736169L)));
        this.W = eE.H("LtwK0HKIRd7yq4At", b(java.lang.String int int int int ), (eE)this, (String)eE.b(12625, 6381), (int)0, (int)0, (int)eE.c(24286, 2994278410043989019L), (int)1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void A(Object[] var1_1) {
        block14: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = hi.a("G", (int)eE.c(23787, 8639924652021915167L), (int)eE.c(3911, 6277091219918572887L), (long)834203424483934088L) ^ eE.c(26226, 6714969967395873995L);
            if (var2_2) break block14;
lbl5:
            // 2 sources

            while (true) {
                v0 = hi.a("\u00e9", (Object)this, (long)936746339155623092L);
                v1 /* !! */  = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)561845057399686853L), (long)789438897355831922L)), (long)1260538186742955956L);
                if (!var2_2) ** GOTO lbl51
                if (v0 >= v1 /* !! */ ) ** GOTO lbl49
                ** GOTO lbl53
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                v2 = this;
                hi.a("\u00f2", (Object)v2, (int)(hi.a("\u00e9", (Object)v2, (long)936746339155623092L) + true), (long)936746339155623092L);
                return;
            }
lbl15:
            // 1 sources

            while (true) {
                v3 /* !! */  = hi.a("\u00e9", (Object)this, (long)622510044057342940L);
                v4 = -1;
                if (!var2_2) ** GOTO lbl57
                if (v3 /* !! */  == v4) ** GOTO lbl55
                ** GOTO lbl59
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                hi.a("G", (int)hi.a("\u00e9", (Object)this, (long)622510044057342940L), (boolean)false, (long)541412231224622628L);
                if (!var2_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        hi.a("\u00a5", (Object)this, (long)773949065129752459L);
                        return;
                    }
                }
                ** GOTO lbl61
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1987756595: {
                    ** continue;
                }
                case 1987756596: {
                    ** continue;
                }
                case 1987756593: {
                    ** continue;
                }
                case 1987756592: {
                    ** continue;
                }
                case 1987756594: 
            }
            hi.a("G", (long)1275757049065691860L);
            hi.a("G", (long)437292628650123400L);
            var3_3 /* !! */  = (eE.H("LtwK0HKIRd7yq4At", max(int int ), (int)eE.c(26451, 499903350850659795L), (int)eE.c(3467, 4519845650754850612L)) + eE.c(12633, 5343666293792797649L) ^ eE.c(15185, 4229943570757843367L)) - eE.c(7875, 3982406523348704322L);
            if (var2_2) continue;
lbl49:
            // 2 sources

            v0 = hi.a("G", (int)(eE.c(31444, 4683733258339530845L) + eE.c(8106, 8082443223181745517L)), (int)eE.c(5282, 5243937291525215788L), (long)834203424483934088L);
            v1 /* !! */  = (CallSite)eE.c(3309, 4570097582983597675L);
lbl51:
            // 2 sources

            var3_3 /* !! */  = (int)(v0 - v1 /* !! */ );
            if (var2_2) continue;
lbl53:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)eE.c(25364, 3463429947670766032L), (int)eE.c(20148, 3310530164315688055L), (long)834203424483934088L) + eE.c(4169, 5540727075990426274L));
            if (var2_2) continue;
lbl55:
            // 2 sources

            v3 /* !! */  = (CallSite)((eE.H("LtwK0HKIRd7yq4At", max(int int ), (int)eE.c(17310, 9144589440388366620L), (int)eE.c(14191, 2225475751647475065L)) ^ eE.c(6160, 7215448027349015208L)) * eE.c(31163, 543558630349912897L));
            v4 = eE.c(28858, 8494663121321472580L);
lbl57:
            // 2 sources

            var3_3 /* !! */  = (int)(v3 /* !! */  + v4);
            if (var2_2) continue;
lbl59:
            // 2 sources

            var3_3 /* !! */  = eE.c(23593, 5211330268929007317L) + eE.c(7340, 6368167482283253370L) + eE.c(23463, 4235371430049028352L) - eE.c(19740, 8929808179582472071L) + eE.c(20280, 7930089234443046384L);
            if (var2_2) continue;
lbl61:
            // 2 sources

            var3_3 /* !! */  = (hi.a("G", (int)eE.c(28434, 2986645872363941260L), (int)eE.c(2797, 752071683392817401L), (long)834203424483934088L) ^ eE.c(19819, 2425375137379979186L)) * eE.c(21501, 3775638280777306414L) + eE.c(3129, 1877926155712712323L);
        }
    }

    public static /* bridge */ /* synthetic */ CallSite H(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private void P() {
        hi.a("\u00f2", (Object)this, (int)-1, (long)622510044057342940L);
        hi.a("\u00f2", (Object)this, null, (long)865242314456752163L);
        hi.a("\u00f2", (Object)this, (int)0, (long)649257692285766350L);
        hi.a("\u00f2", (Object)this, (int)0, (long)936746339155623092L);
        hi.a("\u00f2", (Object)this, (int)eE.c(14071, 8630800225836495896L), (long)1160818475339870278L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)932103853612531419L);
    }

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (long)773949065129752459L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)957668467833882120L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void X(dR var1_1) {
        block33: {
            block36: {
                block35: {
                    block34: {
                        var2_2 = Dl.t();
                        var5_3 /* !! */  = hi.a("G", (int)(eE.c(13205, 7455129212944871746L) + eE.c(5131, 4607988611055474352L)), (int)eE.c(14552, 4791151347856538134L), (long)834203424483934088L) - eE.c(8067, 1874933455591202081L) ^ eE.c(12710, 1883548614776746932L);
                        if (var2_2) ** GOTO lbl-1000
                        v0 /* !! */  = var5_3 /* !! */ ;
                        if (var2_2) ** GOTO lbl9
                        switch (v0 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                v0 /* !! */  = (int)eE.H("LtwK0HKIRd7yq4At", B(int ), (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1147012041364390822L), (long)789438897355831922L)), (long)1260538186742955956L));
lbl9:
                                // 2 sources

                                v1 = var3_4 = v0 /* !! */ ;
                                if (var2_2) break block34;
                                if (v1 != 0) break;
                                break block35;
                            }
                            case -2086778404: {
                                throw null;
                            }
                        }
                        v1 = var5_3 /* !! */  = (eE.c(5646, 2182850360662152208L) ^ eE.c(25962, 8216593767793141702L) ^ eE.c(23799, 8482110695189093932L)) * eE.c(27068, 984775730196949782L) * eE.c(25230, 494294717220266016L) ^ eE.c(3525, 4037598514428202869L);
                    }
                    if (!var2_2) break block36;
                }
                var5_3 /* !! */  = hi.a("G", (int)(eE.c(24340, 8893917199643680152L) * eE.c(19151, 8114151126928558086L)), (int)eE.c(13350, 6296311364325111457L), (long)834203424483934088L) * eE.c(21887, 8494202031128909676L) ^ eE.c(21579, 3252129924849047292L) ^ eE.c(2360, 349899753154038740L);
                if (!var2_2) break block36;
                ** GOTO lbl93
lbl23:
                // 2 sources

                while (true) {
                    v2 /* !! */  = hi.a("\u00e9", (Object)this, (long)1160818475339870278L);
                    if (var2_2) ** GOTO lbl96
                    if (v2 /* !! */  <= 0) ** GOTO lbl95
                    ** GOTO lbl98
                    break;
                }
lbl28:
                // 2 sources

                while (true) {
                    block38: {
                        block37: {
                            v3 = var4_5 = hi.a("\u00a5", (Object)hi.a("G", (Object)new Item[]{hi.a("j", (long)480661012398501637L)}, (long)1292196553031238656L), (long)1221194514962317539L);
                            v4 = -1;
                            if (var2_2) break block37;
                            if (v3 == v4) break block38;
                            v3 = hi.a("G", (int)(eE.c(1596, 4173134136985142484L) / eE.c(26364, 2627378154813367538L) / eE.c(8293, 6531862748844810967L) * eE.c(4980, 1884046126388859271L)), (int)eE.c(1424, 6497796097290782520L), (long)834203424483934088L);
                            v4 = eE.c(24161, 4702093052713835696L);
                        }
                        var5_3 /* !! */  = v3 ^ v4;
                        if (!var2_2) break block33;
                    }
                    var5_3 /* !! */  = (int)(hi.a("G", (int)(eE.c(6756, 7738402058538965126L) * eE.c(13592, 979215727987652548L) / eE.c(22050, 3211190910094972128L)), (int)eE.c(7282, 7106589917836205699L), (long)834203424483934088L) - eE.c(19995, 3351550904343366806L));
                    if (!var2_2) break block33;
                    ** GOTO lbl174
                    break;
                }
lbl42:
                // 2 sources

                while (true) {
                    v5 = hi.a("\u00e9", (Object)this, (long)932103853612531419L);
                    if (var2_2) ** GOTO lbl202
                    if (v5 == false) ** GOTO lbl201
                    ** GOTO lbl204
                    break;
                }
            }
lbl48:
            // 4 sources

            block30: while (true) {
                switch (var5_3 /* !! */ ) {
                    default: {
                        hi.a("\u00f2", (Object)this, (boolean)false, (long)957668467833882120L);
                        if (!var2_2) ** GOTO lbl93
                        ** GOTO lbl23
                    }
                    case -1959427748: {
                        ** continue;
                    }
                    case -1959427743: {
                        v6 = this;
                        hi.a("\u00f2", (Object)v6, (int)(hi.a("\u00e9", (Object)v6, (long)1160818475339870278L) - true), (long)1160818475339870278L);
                        return;
                    }
                    case -1959427745: {
                        v7 /* !! */  = var3_4;
                        if (var2_2) ** GOTO lbl101
                        if (v7 /* !! */  == 0) ** GOTO lbl100
                        ** GOTO lbl102
                    }
                    case -1959427749: {
                        v8 = hi.a("\u00e9", (Object)this, (long)957668467833882120L);
                        if (var2_2) ** GOTO lbl105
                        if (v8 == false) ** GOTO lbl104
                        ** GOTO lbl107
                    }
                    case -1959427739: {
                        v9 = hi.a("\u00e9", (Object)this, (long)622510044057342940L);
                        v10 = -1;
                        if (var2_2) ** GOTO lbl111
                        if (v9 != v10) ** GOTO lbl109
                        ** GOTO lbl113
                    }
                    case -1959427747: {
                        hi.a("\u00f2", (Object)this, (boolean)true, (long)957668467833882120L);
                        v11 = hi.a("\u00e9", (Object)this, (long)622510044057342940L);
                        v12 = -1;
                        if (var2_2) ** GOTO lbl117
                        if (v11 != v12) ** GOTO lbl115
                        ** GOTO lbl119
                    }
                    case -1959427742: {
                        hi.a("\u00f2", (Object)this, (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1119095325570777413L), (long)588501882833882098L), (long)622510044057342940L);
                        hi.a("\u00f2", (Object)this, (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1062363401682879978L), (long)865242314456752163L);
                        if (!var2_2) ** GOTO lbl121
                        ** GOTO lbl28
                    }
                    case -1959427750: {
                        ** continue;
                    }
                    case -1959427746: {
                        throw null;
                    }
lbl93:
                    // 2 sources

                    var5_3 /* !! */  = (eE.c(30211, 6667431699052311567L) ^ eE.c(24054, 207749770976239481L) ^ eE.c(10587, 6268550593197435877L)) * eE.c(11149, 25786002777139502L) * eE.c(31381, 150743946370627708L) ^ eE.c(21767, 6984054841809901527L);
                    if (!var2_2) continue block30;
lbl95:
                    // 2 sources

                    v2 /* !! */  = (CallSite)(eE.c(4812, 7971957721855447248L) / eE.c(32242, 455717441120517975L) * eE.c(26735, 2984237379921193707L) / 4 ^ eE.c(23028, 3157234444464561134L) ^ eE.c(28113, 4885565241447264084L));
lbl96:
                    // 2 sources

                    var5_3 /* !! */  = (int)v2 /* !! */ ;
                    if (!var2_2) continue block30;
lbl98:
                    // 2 sources

                    var5_3 /* !! */  = eE.c(17038, 1181954282843045966L) * eE.c(9795, 8808662336491840652L) - eE.c(10275, 911449351027681988L);
                    if (!var2_2) continue block30;
lbl100:
                    // 2 sources

                    v7 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)(eE.c(26274, 4686594235956208701L) * eE.c(9035, 7907904015158272342L)), (int)eE.c(21322, 5422418662171283876L), (long)834203424483934088L) + eE.c(7552, 2164742549205180176L));
lbl101:
                    // 2 sources

                    if (!var2_2) continue block30;
lbl102:
                    // 2 sources

                    var5_3 /* !! */  = eE.c(19173, 7727956313081841711L) - eE.c(1481, 227520261924669308L) ^ eE.c(5909, 3584369433765238037L) ^ eE.c(24697, 5882608425712100067L);
                    if (!var2_2) continue block30;
lbl104:
                    // 2 sources

                    v8 = hi.a("G", (int)(eE.c(21936, 794110725113026487L) / eE.c(7373, 3730107382143114876L)), (int)eE.c(18865, 1982695265900301063L), (long)834203424483934088L) - eE.c(27729, 8869607226868805346L);
lbl105:
                    // 2 sources

                    var5_3 /* !! */  = (int)v8;
                    if (!var2_2) continue block30;
lbl107:
                    // 2 sources

                    var5_3 /* !! */  = hi.a("G", (int)eE.H("LtwK0HKIRd7yq4At", max(int int ), (int)(eE.c(28474, 737001693721800078L) + eE.c(15204, 441855785702488445L)), (int)eE.c(22852, 518118387868179360L)), (int)eE.c(12665, 1992118257431671791L), (long)834203424483934088L) ^ eE.c(16090, 4111575775089720527L);
                    if (!var2_2) continue block30;
lbl109:
                    // 2 sources

                    v9 = hi.a("G", (int)(eE.c(24969, 5080039093928993672L) / eE.c(29309, 210874137477787778L)), (int)eE.c(3983, 7859034030968622421L), (long)834203424483934088L);
                    v10 = eE.c(8605, 1182394010979918683L);
lbl111:
                    // 2 sources

                    var5_3 /* !! */  = (int)(v9 - v10);
                    if (!var2_2) continue block30;
lbl113:
                    // 2 sources

                    var5_3 /* !! */  = eE.c(11809, 7264584819735948473L) * eE.c(17811, 4425111836057831298L) * eE.c(12702, 7467566886098301833L) - eE.c(6531, 4724693254963354455L) + eE.c(22480, 2294008314557895968L) ^ eE.c(30822, 1212703704136399488L);
                    if (!var2_2) continue block30;
lbl115:
                    // 2 sources

                    v11 = eE.H("LtwK0HKIRd7yq4At", max(int int ), (int)eE.c(30122, 7509750315616253706L), (int)eE.c(15738, 616674364405743519L));
                    v12 = eE.c(31901, 258896506438696574L);
lbl117:
                    // 2 sources

                    var5_3 /* !! */  = (int)(v11 - v12);
                    if (!var2_2) continue block30;
lbl119:
                    // 2 sources

                    var5_3 /* !! */  = (hi.a("G", (int)eE.c(28000, 693454105907539953L), (int)eE.c(6166, 9187575011988003346L), (long)834203424483934088L) + eE.c(32149, 6127686639642492799L) + eE.c(2314, 4813908533504920457L)) / eE.c(25562, 8949688283118412105L) ^ eE.c(20550, 5851168738447626919L);
                    if (!var2_2) continue block30;
lbl121:
                    // 2 sources

                    var5_3 /* !! */  = (int)(hi.a("G", (int)eE.c(4199, 1316413219822588656L), (int)eE.c(31509, 3254415037770348813L), (long)834203424483934088L) - eE.c(2795, 2731207247414773828L));
                    continue block30;
                    case -1959427740: {
                        return;
                    }
                    case -1959427744: 
                }
                return;
            }
        }
        block31: do lbl-1000:
        // 10 sources

        {
            block50: {
                block48: {
                    block49: {
                        block47: {
                            block46: {
                                block44: {
                                    block45: {
                                        block43: {
                                            block41: {
                                                block42: {
                                                    block40: {
                                                        block39: {
                                                            switch (var5_3 /* !! */ ) {
                                                                default: {
                                                                    eE.H("LtwK0HKIRd7yq4At", P(), (eE)this);
                                                                    return;
                                                                }
                                                                case 1454891291: {
                                                                    hi.a("G", (int)var4_5, (boolean)false, (long)541412231224622628L);
                                                                    v13 /* !! */  = hi.a("\u00e9", (Object)this, (long)649257692285766350L);
                                                                    v14 /* !! */  = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)875330282366139785L), (long)789438897355831922L)), (long)1260538186742955956L);
                                                                    if (var2_2) break block39;
                                                                    if (v13 /* !! */  >= v14 /* !! */ ) break;
                                                                    break block40;
                                                                }
                                                                case 1454891284: {
                                                                    v15 = this;
                                                                    hi.a("\u00f2", (Object)v15, (int)(hi.a("\u00e9", (Object)v15, (long)649257692285766350L) + true), (long)649257692285766350L);
                                                                    return;
                                                                }
                                                                case 1454891287: {
                                                                    v16 = hi.a("\u00e9", (Object)this, (long)932103853612531419L);
                                                                    if (var2_2) break block41;
                                                                    if (v16 != false) break block42;
                                                                    break block43;
                                                                }
                                                                case 1454891290: {
                                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)872694920693261832L);
                                                                    hi.a("\u00f2", (Object)this, (boolean)true, (long)932103853612531419L);
                                                                    v17 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1079289013742781868L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                    if (var2_2) break block44;
                                                                    if (v17 != false) break block45;
                                                                    break block46;
                                                                }
                                                                case 1454891285: {
                                                                    hi.a("\u00a5", (Object)this, (long)773949065129752459L);
                                                                    if (!var2_2) break block47;
                                                                    ** GOTO lbl42
                                                                }
                                                                case 1454891283: {
                                                                    ** continue;
                                                                }
                                                                case 1454891286: {
                                                                    v18 = eE.H("LtwK0HKIRd7yq4At", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1079289013742781868L), (long)789438897355831922L)));
                                                                    if (var2_2) break block48;
                                                                    if (v18 == false) break block49;
                                                                    break block50;
                                                                }
                                                                case 1454891292: {
                                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)564796880122783196L);
                                                                    if (!var2_2) break block31;
                                                                    return;
                                                                }
                                                                case 1454891288: {
                                                                    return;
                                                                }
                                                            }
lbl174:
                                                            // 2 sources

                                                            v13 /* !! */  = (CallSite)((eE.c(8020, 501981577525288384L) * eE.c(30428, 6578744744632529943L) + eE.c(5206, 6887154717643560635L)) * eE.c(2598, 2666648873354283239L) ^ eE.c(27048, 6071990112015919994L));
                                                            v14 /* !! */  = (CallSite)eE.c(20023, 410636823758245061L);
                                                        }
                                                        var5_3 /* !! */  = v13 /* !! */  ^ v14 /* !! */ ;
                                                        if (!var2_2) ** GOTO lbl-1000
                                                    }
                                                    var5_3 /* !! */  = eE.c(25535, 3384341285938143515L) / 4 - eE.c(962, 8020750822909722952L) + eE.c(7204, 4096088991965961869L);
                                                    if (!var2_2) ** GOTO lbl-1000
                                                }
                                                v16 = hi.a("G", (int)(hi.a("G", (int)(eE.c(11867, 6214025516992523472L) ^ eE.c(5023, 4513661125198467411L)), (int)eE.c(14705, 3430411590809877364L), (long)834203424483934088L) * eE.c(9035, 1114159002579886546L)), (int)eE.c(26827, 8880866317733341739L), (long)834203424483934088L) + eE.c(16348, 5183200545581432263L);
                                            }
                                            var5_3 /* !! */  = (int)v16;
                                            if (!var2_2) ** GOTO lbl-1000
                                        }
                                        var5_3 /* !! */  = eE.c(12491, 252707911272559304L) + eE.c(23609, 3348253462968442598L) ^ eE.c(8472, 4791024509715571588L);
                                        if (!var2_2) ** GOTO lbl-1000
                                    }
                                    v17 = hi.a("G", (int)(eE.H("LtwK0HKIRd7yq4At", max(int int ), (int)(eE.c(17741, 5965854645204092747L) ^ eE.c(10432, 3690004408505363068L)), (int)eE.c(29809, 1752953171837466249L)) * eE.c(24638, 3173242196576772805L)), (int)eE.c(29933, 4331736881945327130L), (long)834203424483934088L) + eE.c(29431, 4814059498689278202L);
                                }
                                var5_3 /* !! */  = (int)v17;
                                if (!var2_2) ** GOTO lbl-1000
                            }
                            var5_3 /* !! */  = (eE.c(7317, 5002502002135359114L) + eE.c(31036, 3409232869081725924L) ^ eE.c(28878, 3120058970871444172L)) * eE.c(6847, 3818224644702951538L) + eE.c(19626, 7718753630131097111L) + eE.c(26588, 8085150210471994689L);
                            if (!var2_2) ** GOTO lbl-1000
                        }
                        var5_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(eE.c(17741, 5965854645204092747L) ^ eE.c(10432, 3690004408505363068L)), (int)eE.c(29809, 1752953171837466249L), (long)834203424483934088L) * eE.c(24638, 3173242196576772805L)), (int)eE.c(29933, 4331736881945327130L), (long)834203424483934088L) + eE.c(29431, 4814059498689278202L));
                        if (!var2_2) ** GOTO lbl-1000
lbl201:
                        // 2 sources

                        v5 = hi.a("G", (int)(eE.c(16995, 7512665789556981949L) * eE.c(4386, 5089002480561345495L)), (int)eE.c(28821, 4667165299878343240L), (long)834203424483934088L) + eE.c(12829, 9195028960829731016L);
lbl202:
                        // 2 sources

                        var5_3 /* !! */  = (int)v5;
                        if (!var2_2) ** GOTO lbl48
lbl204:
                        // 2 sources

                        var5_3 /* !! */  = eE.c(15065, 717757203785185316L) - eE.c(26753, 6882811582889765408L) + eE.c(20515, 8030474048021467790L);
                        if (!var2_2) ** GOTO lbl-1000
                    }
                    v18 = hi.a("G", (int)(eE.c(16995, 7512665789556981949L) * eE.c(4386, 5089002480561345495L)), (int)eE.c(28821, 4667165299878343240L), (long)834203424483934088L) + eE.c(12829, 9195028960829731016L);
                }
                var5_3 /* !! */  = (int)v18;
                if (!var2_2) ** GOTO lbl48
            }
            var5_3 /* !! */  = (hi.a("G", (int)eE.c(14519, 3965146050368633361L), (int)eE.c(156, 7530062312480359013L), (long)834203424483934088L) ^ eE.c(20550, 8253892535820980948L)) / 3 - eE.c(17388, 2000348056188158279L);
        } while (!var2_2);
        var5_3 /* !! */  = (int)(eE.H("LtwK0HKIRd7yq4At", max(int int ), (int)(eE.c(16995, 7512665789556981949L) * eE.c(4386, 5089002480561345495L)), (int)eE.c(28821, 4667165299878343240L)) + eE.c(12829, 9195028960829731016L));
        ** while (true)
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x3151) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 220;
                case 1 -> 20;
                case 2 -> 99;
                case 3 -> 212;
                case 4 -> 177;
                case 5 -> 142;
                case 6 -> 154;
                case 7 -> 216;
                case 8 -> 68;
                case 9 -> 140;
                case 10 -> 31;
                case 11 -> 205;
                case 12 -> 217;
                case 13 -> 106;
                case 14 -> 231;
                case 15 -> 101;
                case 16 -> 36;
                case 17 -> 118;
                case 18 -> 254;
                case 19 -> 33;
                case 20 -> 108;
                case 21 -> 250;
                case 22 -> 208;
                case 23 -> 42;
                case 24 -> 39;
                case 25 -> 219;
                case 26 -> 114;
                case 27 -> 178;
                case 28 -> 165;
                case 29 -> 18;
                case 30 -> 120;
                case 31 -> 195;
                case 32 -> 27;
                case 33 -> 91;
                case 34 -> 88;
                case 35 -> 57;
                case 36 -> 225;
                case 37 -> 137;
                case 38 -> 150;
                case 39 -> 245;
                case 40 -> 11;
                case 41 -> 15;
                case 42 -> 155;
                case 43 -> 236;
                case 44 -> 255;
                case 45 -> 148;
                case 46 -> 233;
                case 47 -> 134;
                case 48 -> 86;
                case 49 -> 164;
                case 50 -> 6;
                case 51 -> 14;
                case 52 -> 175;
                case 53 -> 78;
                case 54 -> 3;
                case 55 -> 37;
                case 56 -> 161;
                case 57 -> 234;
                case 58 -> 239;
                case 59 -> 197;
                case 60 -> 187;
                case 61 -> 21;
                case 62 -> 170;
                case 63 -> 56;
                case 64 -> 203;
                case 65 -> 181;
                case 66 -> 222;
                case 67 -> 213;
                case 68 -> 128;
                case 69 -> 46;
                case 70 -> 75;
                case 71 -> 22;
                case 72 -> 130;
                case 73 -> 97;
                case 74 -> 13;
                case 75 -> 26;
                case 76 -> 201;
                case 77 -> 80;
                case 78 -> 85;
                case 79 -> 159;
                case 80 -> 70;
                case 81 -> 107;
                case 82 -> 248;
                case 83 -> 117;
                case 84 -> 209;
                case 85 -> 119;
                case 86 -> 64;
                case 87 -> 143;
                case 88 -> 109;
                case 89 -> 61;
                case 90 -> 243;
                case 91 -> 199;
                case 92 -> 112;
                case 93 -> 194;
                case 94 -> 141;
                case 95 -> 138;
                case 96 -> 232;
                case 97 -> 12;
                case 98 -> 79;
                case 99 -> 160;
                case 100 -> 126;
                case 101 -> 136;
                case 102 -> 169;
                case 103 -> 180;
                case 104 -> 214;
                case 105 -> 60;
                case 106 -> 252;
                case 107 -> 34;
                case 108 -> 182;
                case 109 -> 131;
                case 110 -> 132;
                case 111 -> 244;
                case 112 -> 186;
                case 113 -> 17;
                case 114 -> 5;
                case 115 -> 253;
                case 116 -> 4;
                case 117 -> 224;
                case 118 -> 66;
                case 119 -> 111;
                case 120 -> 204;
                case 121 -> 190;
                case 122 -> 127;
                case 123 -> 238;
                case 124 -> 193;
                case 125 -> 156;
                case 126 -> 241;
                case 127 -> 163;
                case 128 -> 67;
                case 129 -> 45;
                case 130 -> 30;
                case 131 -> 189;
                case 132 -> 249;
                case 133 -> 93;
                case 134 -> 7;
                case 135 -> 211;
                case 136 -> 96;
                case 137 -> 43;
                case 138 -> 0;
                case 139 -> 38;
                case 140 -> 102;
                case 141 -> 226;
                case 142 -> 92;
                case 143 -> 59;
                case 144 -> 72;
                case 145 -> 215;
                case 146 -> 105;
                case 147 -> 207;
                case 148 -> 122;
                case 149 -> 73;
                case 150 -> 40;
                case 151 -> 185;
                case 152 -> 229;
                case 153 -> 116;
                case 154 -> 198;
                case 155 -> 145;
                case 156 -> 103;
                case 157 -> 206;
                case 158 -> 246;
                case 159 -> 202;
                case 160 -> 124;
                case 161 -> 192;
                case 162 -> 191;
                case 163 -> 41;
                case 164 -> 218;
                case 165 -> 200;
                case 166 -> 76;
                case 167 -> 149;
                case 168 -> 151;
                case 169 -> 94;
                case 170 -> 69;
                case 171 -> 168;
                case 172 -> 90;
                case 173 -> 135;
                case 174 -> 240;
                case 175 -> 98;
                case 176 -> 28;
                case 177 -> 58;
                case 178 -> 153;
                case 179 -> 121;
                case 180 -> 55;
                case 181 -> 113;
                case 182 -> 89;
                case 183 -> 25;
                case 184 -> 172;
                case 185 -> 44;
                case 186 -> 71;
                case 187 -> 53;
                case 188 -> 173;
                case 189 -> 50;
                case 190 -> 32;
                case 191 -> 82;
                case 192 -> 100;
                case 193 -> 237;
                case 194 -> 95;
                case 195 -> 174;
                case 196 -> 133;
                case 197 -> 77;
                case 198 -> 188;
                case 199 -> 184;
                case 200 -> 167;
                case 201 -> 147;
                case 202 -> 29;
                case 203 -> 247;
                case 204 -> 162;
                case 205 -> 83;
                case 206 -> 166;
                case 207 -> 223;
                case 208 -> 139;
                case 209 -> 81;
                case 210 -> 23;
                case 211 -> 176;
                case 212 -> 179;
                case 213 -> 35;
                case 214 -> 157;
                case 215 -> 65;
                case 216 -> 54;
                case 217 -> 251;
                case 218 -> 47;
                case 219 -> 62;
                case 220 -> 144;
                case 221 -> 129;
                case 222 -> 125;
                case 223 -> 49;
                case 224 -> 158;
                case 225 -> 115;
                case 226 -> 146;
                case 227 -> 8;
                case 228 -> 171;
                case 229 -> 152;
                case 230 -> 84;
                case 231 -> 242;
                case 232 -> 52;
                case 233 -> 2;
                case 234 -> 51;
                case 235 -> 9;
                case 236 -> 63;
                case 237 -> 16;
                case 238 -> 74;
                case 239 -> 228;
                case 240 -> 1;
                case 241 -> 87;
                case 242 -> 235;
                case 243 -> 19;
                case 244 -> 110;
                case 245 -> 24;
                case 246 -> 123;
                case 247 -> 196;
                case 248 -> 210;
                case 249 -> 230;
                case 250 -> 227;
                case 251 -> 104;
                case 252 -> 183;
                case 253 -> 10;
                case 254 -> 221;
                default -> 48;
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
            eE.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4294;
        if (h[n2] == null) {
            eE.h[n2] = (int)(e[n2] ^ l);
        }
        return h[n2];
    }
}
