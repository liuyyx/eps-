/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.protocol.game.ServerboundSwingPacket
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.item.Item
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.X0;
import com.github.epsilon.XG;
import com.github.epsilon.Xn;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.gp;
import com.github.epsilon.hi;
import com.github.epsilon.uK;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.network.protocol.game.ServerboundSwingPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;

public class ek
extends e {
    private final XG L;
    private final Xn E;
    private final Xn M;
    private final Xn l;
    public static final ek D;
    private boolean S;
    private final X0 e = hi.a("\u00a5", (Object)this, (Object)ek.b(7252, -21272), (int)-1, (long)1114934834695297420L);
    private int W;
    private final XG O;
    private int d;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] h;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void W(Object[] objectArray) {
        boolean bl = Dl.t();
        int n = (ek.c(29692, 8047188978915976564L) + ek.c(14599, 3228114190182346633L)) * ek.c(28076, 4408401235950058327L) - ek.c(22211, 7161326996960608447L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    Object object2;
                    Object object3;
                    block9: {
                        if (bl2 && !(bl2 = false) && !bl) break block8;
                        Object object2 = hi.a("\u00e9", (Object)this, (long)751895444846986229L);
                        object2 = hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)655519883180522308L), (long)789438897355831922L))), (long)1260538186742955956L);
                        if (bl) break block9;
                        if (object3 < object2) break block10;
                        Object object2 = ek.c(18216, 2476153017397547421L) - ek.c(17716, 2358848665706861386L) - ek.c(3659, 3514178850768771275L);
                        object2 = ek.c(1915, 3005194454685274520L);
                    }
                    object = object3 + object2;
                    if (!bl) break block8;
                }
                object = ek.c(8571, 2721189448097494950L) + ek.c(27933, 1705376470455073689L) + ek.c(32012, 1012596389051771853L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case -1589504079: {
                    ek ek2 = this;
                    hi.a("\u00f2", (Object)ek2, (int)(hi.a("\u00e9", (Object)ek2, (long)751895444846986229L) + true), (long)751895444846986229L);
                    return;
                }
                case -1589504077: {
                    hi.a("G", (long)957299721117170898L);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)781633884612883688L);
                    return;
                }
                case -1589504076: 
            }
            break;
        }
        ek.U("v0IAgTDhow5D7NAJ", X(float float int ), (float)1.0f, (float)0.0f, (int)-1);
        ek.U("v0IAgTDhow5D7NAJ", values());
    }

    public static /* bridge */ /* synthetic */ CallSite U(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[7];
                        var11_1 = 0;
                        var10_2 = "\u00f8k\u00f7sX\u0000\";H\u00100s\f\u00a9\u00ff\u00ef\u00b9iANq\u0099=\u000e\u0014\n\u001c2&\u00c9\u00cd\u00f1\u009fh\n\u00d1\u000bI\u00b5\u008c#\u009c\u00bdY\u0083\u00b8\u00ecI\u0005\u00f6#\u008b\u00b4\u00c3";
                        var12_3 = "\u00f8k\u00f7sX\u0000\";H\u00100s\f\u00a9\u00ff\u00ef\u00b9iANq\u0099=\u000e\u0014\n\u001c2&\u00c9\u00cd\u00f1\u009fh\n\u00d1\u000bI\u00b5\u008c#\u009c\u00bdY\u0083\u00b8\u00ecI\u0005\u00f6#\u008b\u00b4\u00c3".length();
                        var9_4 = 12;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 8;
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
                            var10_2 = "V|=G\u00d2\u00bb\u00dd\u0086\u0015\f\u0003\u00c7\u009c4\u00c7\u0006k\u00ab\u00a3y\u00fd\u00c4";
                            var12_3 = "V|=G\u00d2\u00bb\u00dd\u0086\u0015\f\u0003\u00c7\u009c4\u00c7\u0006k\u00ab\u00a3y\u00fd\u00c4".length();
                            var9_4 = 9;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 18;
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
                                    v15 = 62;
                                    break;
                                }
                                case 1: {
                                    v15 = 83;
                                    break;
                                }
                                case 2: {
                                    v15 = 59;
                                    break;
                                }
                                case 3: {
                                    v15 = 27;
                                    break;
                                }
                                case 4: {
                                    v15 = 68;
                                    break;
                                }
                                case 5: {
                                    v15 = 33;
                                    break;
                                }
                                default: {
                                    v15 = 100;
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
                ek.a = var13;
                ek.b = new String[7];
                var0_7 = 4317132175742643936L;
                var6_8 = new long[160];
                var3_9 = 0;
                var4_10 = "!R\u0088\u008b8\u000f\u0081\u00b2\u0091\u00cb&3\u00b8\u00d6\u00c9\u00b1B\u0083@N\u00f5\u0007\u00f2H\u00f7\u00f8\u00f0\u009b\u0080\u00ed\u0018\u008d\u00071y\u0083\u00aa?\u008e\u0011\u00e6T\u008df\u007f\u0017\u009b\u0000\u0007\u00e7\u00e3\u00a2\u00a6\u0013\u0091d,\u00c5\u00d5\u00e7\u00cee\b\u00ee\u00f7\u00e8\u00a8\u00f8\u00a2\u00f5V\u000b5Na\u009f\u00adLf\u00a3\u00bd\u008dT\u000f\u00ad\u0005\u0085\u00bcg\u00dc\u00b5)\u00fd0\u00a4\u00d6\u0092\u009e\u0004\u0098\u00e3y\u00bb&R\u00d0\u00a6B-//\u0010\u0086\u00d0\u00ff\u001e\u00de\u00c2i]\u0014\u0012\u0088\u00c8\u0094I\u00e7\u00986t\u0084(\u00b2^\u00e6\u00eb7\u00d0!P\u00df}\u001bH@W\u0094\u00f5\u00e8\u001a[\u00c9\u008bh}z\n\u0004\u0088\u00880\u001as*v\u00e8\u0002.\u0089O\u00f4\u00c56\u00c8\u008a\u00ab\u00c0E\u00a7O\u0018\u00d8\u00df!\u0087o.G\u00a3\u0097\"\u009eJ\u00ecL]\u001a\u00f0\u00e6\u001ae\u0004?\u0091\u00f4\u0001\u00b9P\u00bf:\u00a9=\u00baC\u0017Gm6C\r\u00cdB\u00fc\u0018\u00b6\u0014\u0083G\u00dc\u00e2\u00d9\u001e\u0096\u00ddE\u0003\u00a5\u00b5\u00a4#+\u00d1\u00a8\u00c3\u0010[\u00d9~\u00e2\u00c0\u0019\u0015;\u00b0\u0017\u00a7j+\u0001\u0097\r-\u0010V\u00f1\u00bb\u009a\u00bb\u00ac4\u00ac^@\u00ee\u00c3PywX1G\u0006\u00f1\u0083\u00dcK\u0091\u00ec\u00bf-\u00dc\u00c1%?\u0005~\u008c\u00ae[\u00cb3\u001b~\u00c8\u00b4\u0088\u001e\u00e3\u00ec\u001e<\u00b1w\u00bd\u0019V\u001aK\u00e3\u00b3_\u008f\u00f6N4\u00aal\u0010\u00e0\"\u0093L\u00ff\u0001u\u00e6\u00ed\u001aBEx{\u00a0J\u0016\u00d1\u009a\u00fa\u00d1\u00ee\u00c7k !\u00df_\u000b\u00ee\u008b\u00eb'\u00a8\u00ad/f\u00d5\u00c09\u00f7o$\u00fd\u0087\u0097,\u0081d\u009e\u00fd\u00ef\u008c<\u00f0YR\u00ea\u00e7\u00ad\u000f\u00e9m\u0018C\u0014e\u00e7\u00a9_\u00a7W\u00aaNX#7= @O3\u00df\u00df\u00c7\u00af\u00a1\u00066\u00a3b\u0003n\u00d5\u00f4\u001d\u00e5\u00ad\u00f1%j\u001331\u00b2\u00d0\u009c\u00d2O\u00e5=\b\u00db\u0083\u00dd^{\u00b1\u0089\u00ec\u0015_\u00e7\u00fd\u00e3\u00d7\u00ee\u0012\u008d\u0095\u00b3\u0082]\u00f7\u0003\u00f8&\u0087'w\r\u0095P?\u0092#\r\u0092,L\u00e1\u00d5E\u0084!\u0085\u00c6\u00c9p(\u008b\u008a\u00d7\u00d9q.\u008d\u008e\u00bf<q\u008c\u00e9}\u0002`\u00e4\u00bc \u00cf\u0088E\u00aa\u00e0\u008e\u0080z\b\u00ce(O\u00fe\u00b6\u0097y\u00b3\u00d39\u0018\u00e8u7\u00dd\u00fc\u000fqm\u0086\u00f9\u00bb.\u00bf)\u00ea\u00d3q\u00a6\u001a\u009b\u00b4^\u00b8\u0099D\u000fK4\u009b|\u00d4\n\u0010\u00a3\u001c\u001d\u001a2OQ\u0080\u0003\u00ce\u0099\u0019\u00fb\u00ca\u0015\u0082m\u0019\u00cf(r\u00fc\u00d7W%\u008a\u0087H\"\u00f0\u00eb&\u008f&}\u00bf\u0097\u00d8U\u0092#\u00c46\u0083\fp\u00f4gHf\u00e9q\u0000U\u00e7x\u0005\u00d8Xfc-Pa\u00870\u0093\r\u00a8\u00a6\u0017\u00cf\u00f9\u00d1\u0006\u00b1\"\u00bd\u00bc\u00c3I\u000b\u00e2<\u00a1\u00e0\u00ef,%Pim[\u0085\u009f\u00e6\u0099\u00c4ME3\u00b7JS\u0014\u0093U0s\u00c6\t\u00d1\u001a\u000f\u0097\u00de\u00d5y\u00e2vd\u00a0s\u00efO\u00c5\u00b0F\u00f0e\u00ba\u001f\u0017\u00cd#:\u00b1TRr\u009b\u00ba\u0000\u0016\u0005\u00ad9a\u00ee\u00fbM\u00e4\tq\u00f8\u00d9-\u00d1\u00e7\u0006\u00b4V\u009f4\u00aa\u00b5y0\u00e9=l\u00f8\u0089\u00e7\u0001\u00de\n\u0082u\u0016P\u00153h\u00ec@DU\u00b4\u00fa\u0017\u00e4\u00a2\u009c\u0092,\u00a64\u00efAz\u0095\u00b9\u00fdo\u0011\u0011\u00c1\u00db#\u009f\u00eb\u00a1+\u00b2\u00a6\u00e5P\u00f0\u00b0\u00dd\u009c\u0011\"\u00b7\u00b6\u00a0\u009e\u0012\u00cdv\u00a7|\u0089\u00f4(/Z_\u00b0\u00b8\u00df\u00cb\u0006\u0003\u009e-\u00ebc\u00d0\u00f9\u0007d\u00ebD\n\u0082\u0087\u0010M\u008b\u00a1\u009dg\u00f2\u00fd\u0017l\u00e4~\u001dO\u001c\u00f2\u00f7\u0099\u00bd\u0014\u00f5)`p&\u00c2Y=\u00ca(h\u0084\u00cd\nh\u00b0\u0006s\u00c9\u0007\u00dc\u00cf\u00bcs\u00b1>1$\u0095\u00bd^\u00f9/\u00b3}\u00b3\u00c7\u0005/\u00ff\u00d0\u00d4|b\u00beZ;\r6\u00d4r\u0018\u00b8`\u009f*\u00cc$p\u00de\u00ab:\u00856\u00cbC\u00df\u00bf\u00c3\u0094w\u00fa]$\u00c7Z\u00ad\u00ca\u009a\u00b9;j\u0099\u000e\u00f10\u00b5\b\u00d1\u0014%\u00c1\u00f0`\u00c1\u00a9\u0092\u0089\u008e\u00c21mu^\u00c7\u00b8\u00c0\u00feA\u00f7\u00de+\u0083\u00a3\u00e2\u00d7#\u0012:\u001a-\u0011*+\u00c8\t\u00cc]\u00b3\u00a4\u00bf\u0088;#e<L\u00e5\u00f9$@\u00d8\u00edH\u00car\u00f7G\u00a0sl\u009b\u001c,\u00bc\u00ae\u00d4\u00ca\u0006Z\u0002\u0097X\u00fa\u00e7\u00e5\u00dd\u0001\u0082\u00fbtC0\u00e2\u00d0k\u00dd\u00a6@\u00f6\u00fa\u00fc\u00d1\u00e5\u0011K\u00d1\u0094N\u00a1k\u00a4k\u00bd\u008f\u0090QY\u0000\u0019E\u00c6\u0018-\u0093\u00a6\u0002\u00ef\u0018\u00aa\u0004\u0010\u00fc\u00a4\u009dx<\u0007\u00f8\u0004\u00d2\u00ca=M\u00e4\u0006#sB|\u00e6\u00d4\u0010\u00f2R\u00fd\u0084\u001e\u00fb\u00c0\u009bH5\u00a7\u00a9\u001d\u00fd\u0089t\u00b9\u00bbF|\u000bM\u00fd\u00c68.*\n\u00ee\u00fca\u00a83\u001e(\u0013-1\u00e9\u009a\u0098}\u0003{\u00b9;s\u0090\u00c7Uw\u001e\u0002\u00d3\u00e8\n\u00f6\u00c1\u0091p\u00b1\u00dfu\u00df \u00f1\u0018jsvK\u00f6\u0086\u0093\u0083\u00e8\u00ac:\u00ce\u00df\u00fe\u009dDE\u00ca\u00bb\u00cdM3\u00e0b\u00ab4\u00d3\u0013 B\u0099\u00ec\u00b8\u001d\u0005\u00c7\u001e[!\u00c1\u00ec\u00fe\u00f7%w`\u00d2\u00c3S\u00df\u000fN\u00e7\u00ab\u00e9,\u00ca\u00e2\u00dc\u00c4/XP\u008b7\u001e\u0084\u00fd\u009e\u00dbw\u008a\u00b8\u00efq\u0003\u00f8@\u00d3\u00b6\b\u00ad\u0012\u0097\u00d7\b'\u00b8\u009c\u0005\u009fh\u008f\u0012\u0091\u00a7\u009b1\u0016\u00fb\u00a8\u00b6\u00e9-\u00c6\u00cc\u000b;\u000f\\2\u001b\u00c9w3f\u0001r\u00a1\u0097Y\u000e\u00c1Y\u00caL";
                var5_11 = "!R\u0088\u008b8\u000f\u0081\u00b2\u0091\u00cb&3\u00b8\u00d6\u00c9\u00b1B\u0083@N\u00f5\u0007\u00f2H\u00f7\u00f8\u00f0\u009b\u0080\u00ed\u0018\u008d\u00071y\u0083\u00aa?\u008e\u0011\u00e6T\u008df\u007f\u0017\u009b\u0000\u0007\u00e7\u00e3\u00a2\u00a6\u0013\u0091d,\u00c5\u00d5\u00e7\u00cee\b\u00ee\u00f7\u00e8\u00a8\u00f8\u00a2\u00f5V\u000b5Na\u009f\u00adLf\u00a3\u00bd\u008dT\u000f\u00ad\u0005\u0085\u00bcg\u00dc\u00b5)\u00fd0\u00a4\u00d6\u0092\u009e\u0004\u0098\u00e3y\u00bb&R\u00d0\u00a6B-//\u0010\u0086\u00d0\u00ff\u001e\u00de\u00c2i]\u0014\u0012\u0088\u00c8\u0094I\u00e7\u00986t\u0084(\u00b2^\u00e6\u00eb7\u00d0!P\u00df}\u001bH@W\u0094\u00f5\u00e8\u001a[\u00c9\u008bh}z\n\u0004\u0088\u00880\u001as*v\u00e8\u0002.\u0089O\u00f4\u00c56\u00c8\u008a\u00ab\u00c0E\u00a7O\u0018\u00d8\u00df!\u0087o.G\u00a3\u0097\"\u009eJ\u00ecL]\u001a\u00f0\u00e6\u001ae\u0004?\u0091\u00f4\u0001\u00b9P\u00bf:\u00a9=\u00baC\u0017Gm6C\r\u00cdB\u00fc\u0018\u00b6\u0014\u0083G\u00dc\u00e2\u00d9\u001e\u0096\u00ddE\u0003\u00a5\u00b5\u00a4#+\u00d1\u00a8\u00c3\u0010[\u00d9~\u00e2\u00c0\u0019\u0015;\u00b0\u0017\u00a7j+\u0001\u0097\r-\u0010V\u00f1\u00bb\u009a\u00bb\u00ac4\u00ac^@\u00ee\u00c3PywX1G\u0006\u00f1\u0083\u00dcK\u0091\u00ec\u00bf-\u00dc\u00c1%?\u0005~\u008c\u00ae[\u00cb3\u001b~\u00c8\u00b4\u0088\u001e\u00e3\u00ec\u001e<\u00b1w\u00bd\u0019V\u001aK\u00e3\u00b3_\u008f\u00f6N4\u00aal\u0010\u00e0\"\u0093L\u00ff\u0001u\u00e6\u00ed\u001aBEx{\u00a0J\u0016\u00d1\u009a\u00fa\u00d1\u00ee\u00c7k !\u00df_\u000b\u00ee\u008b\u00eb'\u00a8\u00ad/f\u00d5\u00c09\u00f7o$\u00fd\u0087\u0097,\u0081d\u009e\u00fd\u00ef\u008c<\u00f0YR\u00ea\u00e7\u00ad\u000f\u00e9m\u0018C\u0014e\u00e7\u00a9_\u00a7W\u00aaNX#7= @O3\u00df\u00df\u00c7\u00af\u00a1\u00066\u00a3b\u0003n\u00d5\u00f4\u001d\u00e5\u00ad\u00f1%j\u001331\u00b2\u00d0\u009c\u00d2O\u00e5=\b\u00db\u0083\u00dd^{\u00b1\u0089\u00ec\u0015_\u00e7\u00fd\u00e3\u00d7\u00ee\u0012\u008d\u0095\u00b3\u0082]\u00f7\u0003\u00f8&\u0087'w\r\u0095P?\u0092#\r\u0092,L\u00e1\u00d5E\u0084!\u0085\u00c6\u00c9p(\u008b\u008a\u00d7\u00d9q.\u008d\u008e\u00bf<q\u008c\u00e9}\u0002`\u00e4\u00bc \u00cf\u0088E\u00aa\u00e0\u008e\u0080z\b\u00ce(O\u00fe\u00b6\u0097y\u00b3\u00d39\u0018\u00e8u7\u00dd\u00fc\u000fqm\u0086\u00f9\u00bb.\u00bf)\u00ea\u00d3q\u00a6\u001a\u009b\u00b4^\u00b8\u0099D\u000fK4\u009b|\u00d4\n\u0010\u00a3\u001c\u001d\u001a2OQ\u0080\u0003\u00ce\u0099\u0019\u00fb\u00ca\u0015\u0082m\u0019\u00cf(r\u00fc\u00d7W%\u008a\u0087H\"\u00f0\u00eb&\u008f&}\u00bf\u0097\u00d8U\u0092#\u00c46\u0083\fp\u00f4gHf\u00e9q\u0000U\u00e7x\u0005\u00d8Xfc-Pa\u00870\u0093\r\u00a8\u00a6\u0017\u00cf\u00f9\u00d1\u0006\u00b1\"\u00bd\u00bc\u00c3I\u000b\u00e2<\u00a1\u00e0\u00ef,%Pim[\u0085\u009f\u00e6\u0099\u00c4ME3\u00b7JS\u0014\u0093U0s\u00c6\t\u00d1\u001a\u000f\u0097\u00de\u00d5y\u00e2vd\u00a0s\u00efO\u00c5\u00b0F\u00f0e\u00ba\u001f\u0017\u00cd#:\u00b1TRr\u009b\u00ba\u0000\u0016\u0005\u00ad9a\u00ee\u00fbM\u00e4\tq\u00f8\u00d9-\u00d1\u00e7\u0006\u00b4V\u009f4\u00aa\u00b5y0\u00e9=l\u00f8\u0089\u00e7\u0001\u00de\n\u0082u\u0016P\u00153h\u00ec@DU\u00b4\u00fa\u0017\u00e4\u00a2\u009c\u0092,\u00a64\u00efAz\u0095\u00b9\u00fdo\u0011\u0011\u00c1\u00db#\u009f\u00eb\u00a1+\u00b2\u00a6\u00e5P\u00f0\u00b0\u00dd\u009c\u0011\"\u00b7\u00b6\u00a0\u009e\u0012\u00cdv\u00a7|\u0089\u00f4(/Z_\u00b0\u00b8\u00df\u00cb\u0006\u0003\u009e-\u00ebc\u00d0\u00f9\u0007d\u00ebD\n\u0082\u0087\u0010M\u008b\u00a1\u009dg\u00f2\u00fd\u0017l\u00e4~\u001dO\u001c\u00f2\u00f7\u0099\u00bd\u0014\u00f5)`p&\u00c2Y=\u00ca(h\u0084\u00cd\nh\u00b0\u0006s\u00c9\u0007\u00dc\u00cf\u00bcs\u00b1>1$\u0095\u00bd^\u00f9/\u00b3}\u00b3\u00c7\u0005/\u00ff\u00d0\u00d4|b\u00beZ;\r6\u00d4r\u0018\u00b8`\u009f*\u00cc$p\u00de\u00ab:\u00856\u00cbC\u00df\u00bf\u00c3\u0094w\u00fa]$\u00c7Z\u00ad\u00ca\u009a\u00b9;j\u0099\u000e\u00f10\u00b5\b\u00d1\u0014%\u00c1\u00f0`\u00c1\u00a9\u0092\u0089\u008e\u00c21mu^\u00c7\u00b8\u00c0\u00feA\u00f7\u00de+\u0083\u00a3\u00e2\u00d7#\u0012:\u001a-\u0011*+\u00c8\t\u00cc]\u00b3\u00a4\u00bf\u0088;#e<L\u00e5\u00f9$@\u00d8\u00edH\u00car\u00f7G\u00a0sl\u009b\u001c,\u00bc\u00ae\u00d4\u00ca\u0006Z\u0002\u0097X\u00fa\u00e7\u00e5\u00dd\u0001\u0082\u00fbtC0\u00e2\u00d0k\u00dd\u00a6@\u00f6\u00fa\u00fc\u00d1\u00e5\u0011K\u00d1\u0094N\u00a1k\u00a4k\u00bd\u008f\u0090QY\u0000\u0019E\u00c6\u0018-\u0093\u00a6\u0002\u00ef\u0018\u00aa\u0004\u0010\u00fc\u00a4\u009dx<\u0007\u00f8\u0004\u00d2\u00ca=M\u00e4\u0006#sB|\u00e6\u00d4\u0010\u00f2R\u00fd\u0084\u001e\u00fb\u00c0\u009bH5\u00a7\u00a9\u001d\u00fd\u0089t\u00b9\u00bbF|\u000bM\u00fd\u00c68.*\n\u00ee\u00fca\u00a83\u001e(\u0013-1\u00e9\u009a\u0098}\u0003{\u00b9;s\u0090\u00c7Uw\u001e\u0002\u00d3\u00e8\n\u00f6\u00c1\u0091p\u00b1\u00dfu\u00df \u00f1\u0018jsvK\u00f6\u0086\u0093\u0083\u00e8\u00ac:\u00ce\u00df\u00fe\u009dDE\u00ca\u00bb\u00cdM3\u00e0b\u00ab4\u00d3\u0013 B\u0099\u00ec\u00b8\u001d\u0005\u00c7\u001e[!\u00c1\u00ec\u00fe\u00f7%w`\u00d2\u00c3S\u00df\u000fN\u00e7\u00ab\u00e9,\u00ca\u00e2\u00dc\u00c4/XP\u008b7\u001e\u0084\u00fd\u009e\u00dbw\u008a\u00b8\u00efq\u0003\u00f8@\u00d3\u00b6\b\u00ad\u0012\u0097\u00d7\b'\u00b8\u009c\u0005\u009fh\u008f\u0012\u0091\u00a7\u009b1\u0016\u00fb\u00a8\u00b6\u00e9-\u00c6\u00cc\u000b;\u000f\\2\u001b\u00c9w3f\u0001r\u00a1\u0097Y\u000e\u00c1Y\u00caL".length();
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
                    var4_10 = "\u008c5\u00cc\u00aa\u0010\u00e2\u00c8\u00cc\u00d9\b6\t=\u00efM\u00ef";
                    var5_11 = "\u008c5\u00cc\u00aa\u0010\u00e2\u00c8\u00cc\u00d9\b6\t=\u00efM\u00ef".length();
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
        ek.c = var6_8;
        ek.h = new Integer[160];
        ek.D = new ek();
    }

    private void z(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)0, (long)813701155112963684L);
        hi.a("\u00f2", (Object)this, (int)0, (long)751895444846986229L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)723150271517105360L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void x(dR var1_1) {
        block64: {
            block84: {
                block79: {
                    block77: {
                        block78: {
                            block76: {
                                block74: {
                                    block75: {
                                        block63: {
                                            block61: {
                                                block62: {
                                                    block73: {
                                                        block59: {
                                                            block71: {
                                                                block70: {
                                                                    block68: {
                                                                        block69: {
                                                                            block67: {
                                                                                block65: {
                                                                                    block66: {
                                                                                        block58: {
                                                                                            block81: {
                                                                                                block60: {
                                                                                                    block80: {
                                                                                                        var2_2 = Dl.t();
                                                                                                        var6_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)ek.c(18053, 3973159842637811946L), (int)ek.c(7309, 7002546142155098866L), (long)834203424483934088L) - ek.c(8991, 1597303721960699288L)), (int)ek.c(3641, 8009130525098596566L), (long)834203424483934088L) ^ ek.c(8246, 8779027808899069634L) ^ ek.c(22389, 8417431619603759547L);
                                                                                                        if (!var2_2) break block80;
lbl4:
                                                                                                        // 2 sources

                                                                                                        while (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)907159218940561824L), (long)1017954173869996748L) != null) {
                                                                                                            break block58;
                                                                                                        }
                                                                                                        break block81;
lbl7:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)781633884612883688L);
                                                                                                            if (!var2_2) break block59;
lbl10:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                block83: {
                                                                                                                    block82: {
                                                                                                                        v0 /* !! */  = var3_4 = hi.a("G", (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)521469300386468271L), (long)789438897355831922L)), (long)1260538186742955956L), (long)759451198843871681L);
                                                                                                                        if (var2_2) break block82;
                                                                                                                        if (v0 /* !! */  != false) break block83;
                                                                                                                        v0 /* !! */  = (CallSite)(hi.a("G", (int)ek.c(27082, 783797536719453964L), (int)ek.c(13939, 6694965007955288309L), (long)834203424483934088L) ^ ek.c(5835, 4257635663041675386L));
                                                                                                                    }
                                                                                                                    var6_3 /* !! */  = (int)v0 /* !! */ ;
                                                                                                                    if (!var2_2) break block60;
                                                                                                                }
                                                                                                                var6_3 /* !! */  = ek.c(2590, 5212827956441144568L) - ek.c(15050, 2097586603404127285L) ^ ek.c(26909, 5118886159704637373L);
                                                                                                                break block60;
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
lbl21:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)new uK((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)700108823764850555L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1280994566116072355L)), (double)180.0, (Object)hi.a("j", (long)1061553595500331636L), (long)1303508973408765465L);
                                                                                                            hi.a("G", (int)hi.a("\u00a5", (Object)var4_5, (long)1221194514962317539L), (boolean)hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)676036440559997627L), (long)789438897355831922L)), (long)1000026253634408124L), (long)541412231224622628L);
                                                                                                            v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)813701155112963684L);
                                                                                                            v2 /* !! */  = (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)990362462259684768L), (long)789438897355831922L)), (long)1260538186742955956L);
                                                                                                            if (var2_2) break block61;
                                                                                                            if (v1 /* !! */  >= v2 /* !! */ ) break block62;
                                                                                                            break block63;
                                                                                                            break;
                                                                                                        }
lbl29:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (Object)new ServerboundSwingPacket((InteractionHand)hi.a("j", (long)844572035549319610L)), (long)367302555785540234L);
                                                                                                            if (var2_2) lbl-1000:
                                                                                                            // 2 sources

                                                                                                            {
                                                                                                                while (true) {
                                                                                                                    hi.a("\u00f2", (Object)this, (boolean)true, (long)723150271517105360L);
                                                                                                                    if (var2_2) {
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    break block64;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            ** GOTO lbl261
                                                                                                            break;
                                                                                                        }
                                                                                                    }
lbl39:
                                                                                                    // 9 sources

                                                                                                    while (true) {
                                                                                                        switch (var6_3 /* !! */ ) {
                                                                                                            default: {
                                                                                                                ** GOTO lbl4
                                                                                                            }
                                                                                                            case 874535788: {
                                                                                                                v3 /* !! */  = hi.a("\u00e9", (Object)this, (long)723150271517105360L);
                                                                                                                if (var2_2) break block65;
                                                                                                                if (v3 /* !! */  == false) break block66;
                                                                                                                break block67;
                                                                                                            }
                                                                                                            case 874535789: {
                                                                                                                v4 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)676036440559997627L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                                                                if (var2_2) break block68;
                                                                                                                if (v4 /* !! */  == false) break block69;
                                                                                                                break block70;
                                                                                                            }
                                                                                                            case 874535790: {
                                                                                                                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)480372906017601361L);
                                                                                                                if (!var2_2) break block71;
                                                                                                                ** GOTO lbl7
                                                                                                            }
                                                                                                            case 874535793: {
                                                                                                                ** continue;
                                                                                                            }
                                                                                                            case 874535795: {
                                                                                                                ** continue;
                                                                                                            }
                                                                                                            case 874535792: {
                                                                                                                return;
                                                                                                            }
                                                                                                            case 874535791: {
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
lbl66:
                                                                                                // 3 sources

                                                                                                while (true) {
                                                                                                    block72: {
                                                                                                        switch (var6_3 /* !! */ ) {
                                                                                                            default: {
                                                                                                                var4_5 = hi.a("G", (Object)new Item[]{hi.a("j", (long)832725519788462997L)}, (long)1292196553031238656L);
                                                                                                                v5 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)429462471063532441L);
                                                                                                                if (var2_2) ** GOTO lbl74
                                                                                                                if (v5 /* !! */  == false) ** GOTO lbl76
                                                                                                                v5 /* !! */  = (CallSite)(ek.c(30712, 7475383383773454720L) * ek.c(32123, 369314891495648224L) + ek.c(508, 4154067477663373145L));
lbl74:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (int)v5 /* !! */ ;
                                                                                                                if (!var2_2) break;
lbl76:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (ek.c(11193, 6753967506341690739L) + ek.c(22214, 284531245617414148L)) / ek.c(25419, 6981507504340579751L) / 5 * ek.c(4024, 4309618815317825902L) + ek.c(11868, 2942147783583824059L);
                                                                                                                if (!var2_2) break;
                                                                                                                ** GOTO lbl117
                                                                                                            }
                                                                                                            case -1196106789: {
                                                                                                                return;
                                                                                                            }
                                                                                                            case -1196106791: {
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        block44: while (true) {
                                                                                                            switch (var6_3 /* !! */ ) {
                                                                                                                default: {
                                                                                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)781633884612883688L);
                                                                                                                    return;
                                                                                                                }
                                                                                                                case 1173854235: {
                                                                                                                    v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)686691195801221584L), (Object)hi.a("\u00a5", (Object)hi.a("j", (long)832725519788462997L), (long)430851306237619580L), (long)1036576191360399282L);
                                                                                                                    if (var2_2) ** GOTO lbl118
                                                                                                                    if (v6 /* !! */  == false) ** GOTO lbl117
                                                                                                                    ** GOTO lbl120
                                                                                                                }
                                                                                                                case 1173854239: {
                                                                                                                    v7 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)505493441099592205L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                                                                    if (var2_2) ** GOTO lbl123
                                                                                                                    if (v7 == false) ** GOTO lbl122
                                                                                                                    ** GOTO lbl125
                                                                                                                }
                                                                                                                case 1173854236: {
                                                                                                                    v8 /* !! */  = hi.a("G", (long)405872435149102496L);
                                                                                                                    if (var2_2) ** GOTO lbl128
                                                                                                                    if (v8 /* !! */  != false) ** GOTO lbl127
                                                                                                                    ** GOTO lbl130
                                                                                                                }
                                                                                                                case 1173854238: {
                                                                                                                    v9 = hi.a("\u00a5", (Object)hi.a("j", (long)1099970570863166760L), (Object)new Object[0], (long)560263715272728412L);
                                                                                                                    if (var2_2) ** GOTO lbl133
                                                                                                                    if (v9 == false) ** GOTO lbl132
                                                                                                                    ** GOTO lbl135
                                                                                                                }
                                                                                                                case 1173854237: {
                                                                                                                    var5_6 = hi.a("j", (long)1099970570863166760L);
                                                                                                                    v10 = hi.a("\u00a5", (Object)var5_6, (Object)new Object[0], (long)560263715272728412L);
                                                                                                                    if (var2_2) ** GOTO lbl138
                                                                                                                    if (v10 == false) ** GOTO lbl137
                                                                                                                    ** GOTO lbl140
                                                                                                                }
                                                                                                                case 1173854234: {
                                                                                                                    throw null;
                                                                                                                }
lbl117:
                                                                                                                // 2 sources

                                                                                                                v6 /* !! */  = (CallSite)(ek.c(9279, 3431006064459215501L) - ek.c(17077, 2756638305125176446L) ^ ek.c(28441, 2990138894783429100L));
lbl118:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (int)v6 /* !! */ ;
                                                                                                                if (!var2_2) continue block44;
lbl120:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (ek.c(1094, 1102511292140769987L) - ek.c(16555, 7749873361295382107L)) * ek.c(18217, 2583769828131574173L) / ek.c(19216, 3370397925508095448L) ^ ek.c(15680, 4249325450255952868L);
                                                                                                                if (!var2_2) continue block44;
lbl122:
                                                                                                                // 2 sources

                                                                                                                v7 = ek.U("v0IAgTDhow5D7NAJ", max(int int ), (int)hi.a("G", (int)hi.a("G", (int)ek.c(30672, 4119440669110673788L), (int)ek.c(32359, 9203366192455100659L), (long)834203424483934088L), (int)ek.c(27923, 1331456425573366727L), (long)834203424483934088L), (int)ek.c(8248, 495939777429108370L)) - ek.c(28246, 2750570120558884927L) - ek.c(22087, 1958618744569135328L);
lbl123:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (int)v7;
                                                                                                                if (!var2_2) continue block44;
lbl125:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = ((ek.c(20329, 3054900349321714093L) + ek.c(17797, 3031497481832731493L)) / ek.c(21914, 3249905031093322499L) - ek.c(29886, 8429714064049152596L)) / ek.c(10300, 3317239733609954956L) + ek.c(500, 9182060054135658297L);
                                                                                                                if (!var2_2) continue block44;
lbl127:
                                                                                                                // 2 sources

                                                                                                                v8 /* !! */  = (CallSite)((ek.c(27036, 5136629698829139716L) ^ ek.c(24446, 1115479058222188928L)) * ek.c(28002, 7542662487532714887L) ^ ek.c(31313, 4098807277488516294L));
lbl128:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (int)v8 /* !! */ ;
                                                                                                                if (!var2_2) continue block44;
lbl130:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (ek.c(31351, 4526256192319401180L) + ek.c(27138, 7547631918622588060L)) / ek.c(25095, 2156875255524963440L) / ek.c(28800, 407211511132989038L) - ek.c(19733, 8272776868054506484L) + ek.c(31506, 1010189892735217014L);
                                                                                                                if (!var2_2) continue block44;
lbl132:
                                                                                                                // 2 sources

                                                                                                                v9 = hi.a("G", (int)hi.a("G", (int)hi.a("G", (int)ek.c(308, 4169780977966798791L), (int)ek.c(15567, 6091761662144604725L), (long)834203424483934088L), (int)ek.c(14083, 952726229303058834L), (long)834203424483934088L), (int)ek.c(27256, 1143499446939073751L), (long)834203424483934088L) - ek.c(2899, 2241804698603609530L) - ek.c(3935, 2704104015339149712L);
lbl133:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (int)v9;
                                                                                                                if (!var2_2) continue block44;
lbl135:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (ek.c(20071, 6406760545370642621L) ^ ek.c(17986, 4281185066515304639L)) * ek.c(23513, 4395737570559003977L) ^ ek.c(18256, 3018009744329937375L);
                                                                                                                continue block44;
lbl137:
                                                                                                                // 1 sources

                                                                                                                v10 = hi.a("G", (int)(ek.c(1274, 8642148303038829161L) * ek.c(15489, 4437712471599082079L)), (int)ek.c(21072, 1347470112314524841L), (long)834203424483934088L) + ek.c(10757, 3154562363910814874L);
lbl138:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (int)v10;
                                                                                                                if (!var2_2) break block72;
lbl140:
                                                                                                                // 2 sources

                                                                                                                var6_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)ek.c(7011, 2834507219511528888L), (int)ek.c(5706, 7779979945176023224L), (long)834203424483934088L), (int)ek.c(28211, 2148419803810576524L), (long)834203424483934088L) + ek.c(21959, 3275439450974454550L));
                                                                                                                if (!var2_2) break block72;
                                                                                                                break block73;
                                                                                                                case 1173854241: {
                                                                                                                    return;
                                                                                                                }
                                                                                                                case 1173854242: 
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        return;
                                                                                                    }
lbl148:
                                                                                                    // 5 sources

                                                                                                    block45: while (true) {
                                                                                                        switch (var6_3 /* !! */ ) {
                                                                                                            default: {
                                                                                                                ek.U("v0IAgTDhow5D7NAJ", o(java.lang.String java.lang.String ), (gp)hi.a("j", (long)549148920996267385L), (String)hi.a("\u00a5", (Object)var5_6, (long)721675246255933332L), (String)hi.a("\u00a5", (Object)hi.a("j", (long)917927983609278510L), (long)1335171215242130397L));
                                                                                                                hi.a("\u00a5", (Object)var5_6, (long)842500491703248782L);
                                                                                                                if (!var2_2) break block73;
                                                                                                                ** GOTO lbl21
                                                                                                            }
                                                                                                            case -1657331196: {
                                                                                                                ** continue;
                                                                                                            }
                                                                                                            case -1657331197: {
                                                                                                                v11 = this;
                                                                                                                hi.a("\u00f2", (Object)v11, (int)(hi.a("\u00e9", (Object)v11, (long)813701155112963684L) + true), (long)813701155112963684L);
                                                                                                                return;
                                                                                                            }
                                                                                                            case -1657331194: {
                                                                                                                v12 /* !! */  = hi.a("\u00e9", (Object)this, (long)723150271517105360L);
                                                                                                                if (var2_2) break block74;
                                                                                                                if (v12 /* !! */  != false) break block75;
                                                                                                                break block76;
                                                                                                            }
                                                                                                            case -1657331192: {
                                                                                                                var5_6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)872694920693261832L);
                                                                                                                v13 /* !! */  = ek.U("v0IAgTDhow5D7NAJ", consumesAction(), (InteractionResult)var5_6);
                                                                                                                if (var2_2) break block77;
                                                                                                                if (v13 /* !! */  == false) break block78;
                                                                                                                break block79;
                                                                                                            }
                                                                                                            case -1657331195: {
                                                                                                                hi.a("G", (int)2, (int)ek.c(21570, 3355618398623498910L), (long)682117342267402956L);
                                                                                                                var6_3 /* !! */  = (int)(hi.a("G", (int)(ek.c(7353, 5116369318769871441L) - ek.c(12437, 6227825805569550056L)), (int)ek.c(3978, 3301656747493775850L), (long)834203424483934088L) + ek.c(9700, 6376216916095955747L));
                                                                                                                if (!var2_2) continue block45;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var6_3 /* !! */  = (ek.c(21459, 8015686490604504445L) + ek.c(5449, 5636390266822640638L)) / ek.c(9541, 7990381317750977481L) - ek.c(30545, 4204560017036616103L);
                                                                                            if (!var2_2) ** GOTO lbl39
                                                                                        }
                                                                                        var6_3 /* !! */  = ek.c(2082, 4326410996079713975L) + ek.c(30648, 2948023247373115759L) - ek.c(9336, 5588309776368857743L);
                                                                                        if (!var2_2) ** GOTO lbl39
                                                                                    }
                                                                                    v3 /* !! */  = (CallSite)(hi.a("G", (int)(ek.c(31131, 1538562591785562094L) * ek.c(18716, 521927068211322726L) ^ ek.c(26196, 7934853660248944877L)), (int)ek.c(19052, 1854355712364846224L), (long)834203424483934088L) + ek.c(23977, 1602887445413235652L) ^ ek.c(16015, 1528755271068641378L));
                                                                                }
                                                                                var6_3 /* !! */  = (int)v3 /* !! */ ;
                                                                                if (!var2_2) ** GOTO lbl39
                                                                            }
                                                                            var6_3 /* !! */  = ek.c(21797, 3438937268550599574L) - ek.c(9295, 9207172631730942700L) + ek.c(23060, 4932651788399479911L);
                                                                            if (!var2_2) ** GOTO lbl39
                                                                        }
                                                                        v4 /* !! */  = (CallSite)(hi.a("G", (int)ek.c(2933, 4365453145348857283L), (int)ek.c(3110, 1472244826413488804L), (long)834203424483934088L) + ek.c(12143, 4116034285041449427L) ^ ek.c(2827, 5545007847667654009L) ^ ek.c(29456, 358291864566769022L) ^ ek.c(27257, 1559397719727029491L));
                                                                    }
                                                                    var6_3 /* !! */  = (int)v4 /* !! */ ;
                                                                    if (!var2_2) ** GOTO lbl39
                                                                }
                                                                var6_3 /* !! */  = ek.c(11014, 3925245215074909565L) / ek.c(10166, 208581207988466118L) + ek.c(30318, 8583941415598432396L) ^ ek.c(11257, 3883290997911092518L);
                                                                if (!var2_2) ** GOTO lbl39
                                                            }
                                                            var6_3 /* !! */  = hi.a("G", (int)(ek.c(13649, 5286421459625894688L) * ek.c(15564, 6773332982335466157L) ^ ek.c(28362, 4737765376953235560L)), (int)ek.c(8975, 5302543072079181155L), (long)834203424483934088L) + ek.c(14188, 899164367983534496L) ^ ek.c(4068, 1525972465652881793L);
                                                            if (!var2_2) ** GOTO lbl39
                                                        }
                                                        var6_3 /* !! */  = ek.U("v0IAgTDhow5D7NAJ", max(int int ), (int)(ek.c(13649, 5286421459625894688L) * ek.c(15564, 6773332982335466157L) ^ ek.c(28362, 4737765376953235560L)), (int)ek.c(8975, 5302543072079181155L)) + ek.c(14188, 899164367983534496L) ^ ek.c(4068, 1525972465652881793L);
                                                        ** while (true)
                                                    }
                                                    var6_3 /* !! */  = (int)(hi.a("G", (int)(ek.c(8381, 620332541999281716L) * ek.c(11931, 6573400077847230480L)), (int)ek.c(6006, 5761540532572504571L), (long)834203424483934088L) + ek.c(29453, 1890499422743242085L));
                                                    if (!var2_2) ** GOTO lbl148
                                                }
                                                v1 /* !! */  = (CallSite)(ek.c(5116, 6884797699406120350L) ^ ek.c(17804, 7363926362849055572L));
                                                v2 /* !! */  = ek.c(10300, 3730025755365998313L);
                                            }
                                            var6_3 /* !! */  = (int)(v1 /* !! */  + v2 /* !! */ );
                                            if (!var2_2) ** GOTO lbl148
                                        }
                                        var6_3 /* !! */  = (ek.c(7236, 963466637879691951L) ^ ek.c(1995, 8899890615654928642L)) - ek.c(4625, 392314900523172968L);
                                        if (!var2_2) ** GOTO lbl148
                                    }
                                    v12 /* !! */  = (CallSite)(hi.a("G", (int)ek.c(9355, 7289228860626235992L), (int)ek.c(15207, 8446245747004763643L), (long)834203424483934088L) ^ ek.c(7811, 8556591444458424366L));
                                }
                                var6_3 /* !! */  = (int)v12 /* !! */ ;
                                if (!var2_2) ** GOTO lbl66
                            }
                            var6_3 /* !! */  = (int)(ek.U("v0IAgTDhow5D7NAJ", max(int int ), (int)ek.c(7681, 7151684292189374583L), (int)ek.c(11985, 3521303072275232954L)) * ek.c(2853, 5728203829333941635L) / ek.c(29251, 5850348068097533179L) + ek.c(2779, 6038801509244755014L) - ek.c(14661, 1467107668995108788L));
                            ** while (true)
                        }
                        v13 /* !! */  = (CallSite)((ek.c(26306, 426842010621587521L) + ek.c(27572, 1097463011251862805L) - ek.c(9704, 1138840054949147432L)) * ek.c(21140, 4849441081870025809L) - ek.c(15207, 6892463071525891534L));
                    }
                    var6_3 /* !! */  = (int)v13 /* !! */ ;
                    if (!var2_2) break block84;
                }
                var6_3 /* !! */  = (int)(ek.U("v0IAgTDhow5D7NAJ", max(int int ), (int)(ek.c(7399, 2514900320288295427L) ^ ek.c(20946, 6399575582222288745L)), (int)ek.c(377, 6185278683859343264L)) + ek.c(6894, 3578170959457700886L) + ek.c(15260, 8535327852054867455L));
                if (var2_2) ** GOTO lbl251
            }
            do lbl-1000:
            // 5 sources

            {
                block87: {
                    block86: {
                        block85: {
                            switch (var6_3 /* !! */ ) {
                                default: {
                                    v14 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)551064704168390470L), (long)789438897355831922L)), (long)1000026253634408124L);
                                    if (var2_2) break block85;
                                    if (v14 /* !! */  == false) break;
                                    break block86;
                                }
                                case -495637628: {
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)1027340002540470646L);
                                    if (!var2_2) break block87;
                                    ** GOTO lbl29
                                }
                                case -495637631: {
                                    ** continue;
                                }
                                case -495637630: {
                                    ** continue;
                                }
                                case -495637627: {
                                    return;
                                }
                            }
lbl251:
                            // 2 sources

                            v14 /* !! */  = (CallSite)(hi.a("G", (int)ek.c(29761, 937656572892127787L), (int)ek.c(2899, 8890661682725149991L), (long)834203424483934088L) - ek.c(19499, 4233598334166571769L) ^ ek.c(19451, 2213141915667766684L));
                        }
                        var6_3 /* !! */  = (int)v14 /* !! */ ;
                        if (!var2_2) ** GOTO lbl-1000
                    }
                    var6_3 /* !! */  = ek.c(6786, 1254769667137260772L) * ek.c(23112, 2970788757685505163L) / 3 / ek.c(31481, 7741774754848615544L) ^ ek.c(9199, 7695748540199728465L);
                    if (!var2_2) ** GOTO lbl-1000
                }
                var6_3 /* !! */  = (ek.c(11999, 1280655031257921637L) + ek.c(6292, 3449399202290650692L) - ek.c(6216, 3287292459575529184L)) * ek.c(8598, 588336867098064652L) - ek.c(5390, 2306096502606349212L);
                if (!var2_2) ** GOTO lbl-1000
lbl261:
                // 2 sources

                var6_3 /* !! */  = (ek.c(11999, 1280655031257921637L) + ek.c(6292, 3449399202290650692L) - ek.c(6216, 3287292459575529184L)) * ek.c(8598, 588336867098064652L) - ek.c(5390, 2306096502606349212L);
            } while (!var2_2);
        }
        var6_3 /* !! */  = hi.a("G", (int)ek.c(9355, 7289228860626235992L), (int)ek.c(15207, 8446245747004763643L), (long)834203424483934088L) ^ ek.c(7811, 8556591444458424366L);
        ** while (true)
    }

    private ek() {
        super(ek.b(7249, 20521), (vY)((Object)hi.a("j", (long)1119278030115886606L)));
        this.M = hi.a("\u00a5", (Object)this, (Object)ek.b(7253, 31878), (boolean)true, (long)1230617056439551805L);
        this.L = hi.a("\u00a5", (Object)this, (Object)ek.b(7248, 4986), (int)0, (int)0, (int)ek.c(18780, 4890240247926824906L), (int)1, (long)1094453040828645510L);
        this.E = hi.a("\u00a5", (Object)this, (Object)ek.b(7255, -11932), (boolean)true, (long)1230617056439551805L);
        this.O = hi.a("\u00a5", (Object)this, (Object)ek.b(7250, -22220), (int)0, (int)0, (int)ek.c(14263, 9163441785381642506L), (int)1, (long)1094453040828645510L);
        this.l = hi.a("\u00a5", (Object)this, (Object)ek.b(7254, -10189), (boolean)true, (long)1230617056439551805L);
    }

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)781633884612883688L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x1C54) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 195;
                case 1 -> 110;
                case 2 -> 173;
                case 3 -> 41;
                case 4 -> 143;
                case 5 -> 226;
                case 6 -> 85;
                case 7 -> 198;
                case 8 -> 228;
                case 9 -> 77;
                case 10 -> 212;
                case 11 -> 240;
                case 12 -> 233;
                case 13 -> 253;
                case 14 -> 58;
                case 15 -> 157;
                case 16 -> 154;
                case 17 -> 38;
                case 18 -> 245;
                case 19 -> 171;
                case 20 -> 188;
                case 21 -> 18;
                case 22 -> 44;
                case 23 -> 21;
                case 24 -> 102;
                case 25 -> 247;
                case 26 -> 196;
                case 27 -> 94;
                case 28 -> 223;
                case 29 -> 156;
                case 30 -> 5;
                case 31 -> 47;
                case 32 -> 84;
                case 33 -> 191;
                case 34 -> 168;
                case 35 -> 150;
                case 36 -> 152;
                case 37 -> 108;
                case 38 -> 117;
                case 39 -> 220;
                case 40 -> 88;
                case 41 -> 86;
                case 42 -> 186;
                case 43 -> 178;
                case 44 -> 91;
                case 45 -> 31;
                case 46 -> 119;
                case 47 -> 184;
                case 48 -> 251;
                case 49 -> 163;
                case 50 -> 201;
                case 51 -> 34;
                case 52 -> 141;
                case 53 -> 99;
                case 54 -> 193;
                case 55 -> 187;
                case 56 -> 4;
                case 57 -> 37;
                case 58 -> 224;
                case 59 -> 182;
                case 60 -> 61;
                case 61 -> 74;
                case 62 -> 13;
                case 63 -> 151;
                case 64 -> 81;
                case 65 -> 60;
                case 66 -> 194;
                case 67 -> 12;
                case 68 -> 42;
                case 69 -> 237;
                case 70 -> 144;
                case 71 -> 3;
                case 72 -> 45;
                case 73 -> 107;
                case 74 -> 29;
                case 75 -> 164;
                case 76 -> 65;
                case 77 -> 215;
                case 78 -> 148;
                case 79 -> 40;
                case 80 -> 227;
                case 81 -> 189;
                case 82 -> 25;
                case 83 -> 112;
                case 84 -> 114;
                case 85 -> 69;
                case 86 -> 98;
                case 87 -> 78;
                case 88 -> 205;
                case 89 -> 23;
                case 90 -> 80;
                case 91 -> 15;
                case 92 -> 208;
                case 93 -> 218;
                case 94 -> 95;
                case 95 -> 90;
                case 96 -> 170;
                case 97 -> 250;
                case 98 -> 73;
                case 99 -> 124;
                case 100 -> 244;
                case 101 -> 166;
                case 102 -> 207;
                case 103 -> 54;
                case 104 -> 140;
                case 105 -> 100;
                case 106 -> 67;
                case 107 -> 149;
                case 108 -> 242;
                case 109 -> 159;
                case 110 -> 213;
                case 111 -> 106;
                case 112 -> 72;
                case 113 -> 142;
                case 114 -> 128;
                case 115 -> 55;
                case 116 -> 97;
                case 117 -> 6;
                case 118 -> 216;
                case 119 -> 1;
                case 120 -> 30;
                case 121 -> 19;
                case 122 -> 248;
                case 123 -> 122;
                case 124 -> 111;
                case 125 -> 28;
                case 126 -> 113;
                case 127 -> 56;
                case 128 -> 204;
                case 129 -> 46;
                case 130 -> 153;
                case 131 -> 230;
                case 132 -> 17;
                case 133 -> 133;
                case 134 -> 120;
                case 135 -> 10;
                case 136 -> 9;
                case 137 -> 7;
                case 138 -> 35;
                case 139 -> 241;
                case 140 -> 8;
                case 141 -> 225;
                case 142 -> 176;
                case 143 -> 57;
                case 144 -> 79;
                case 145 -> 219;
                case 146 -> 63;
                case 147 -> 222;
                case 148 -> 118;
                case 149 -> 92;
                case 150 -> 59;
                case 151 -> 115;
                case 152 -> 43;
                case 153 -> 249;
                case 154 -> 231;
                case 155 -> 203;
                case 156 -> 139;
                case 157 -> 229;
                case 158 -> 125;
                case 159 -> 183;
                case 160 -> 174;
                case 161 -> 109;
                case 162 -> 135;
                case 163 -> 16;
                case 164 -> 103;
                case 165 -> 243;
                case 166 -> 123;
                case 167 -> 50;
                case 168 -> 190;
                case 169 -> 127;
                case 170 -> 161;
                case 171 -> 235;
                case 172 -> 185;
                case 173 -> 200;
                case 174 -> 255;
                case 175 -> 211;
                case 176 -> 87;
                case 177 -> 53;
                case 178 -> 20;
                case 179 -> 181;
                case 180 -> 116;
                case 181 -> 48;
                case 182 -> 197;
                case 183 -> 165;
                case 184 -> 199;
                case 185 -> 138;
                case 186 -> 52;
                case 187 -> 221;
                case 188 -> 214;
                case 189 -> 129;
                case 190 -> 104;
                case 191 -> 239;
                case 192 -> 246;
                case 193 -> 71;
                case 194 -> 105;
                case 195 -> 137;
                case 196 -> 82;
                case 197 -> 169;
                case 198 -> 238;
                case 199 -> 121;
                case 200 -> 2;
                case 201 -> 96;
                case 202 -> 76;
                case 203 -> 234;
                case 204 -> 49;
                case 205 -> 130;
                case 206 -> 89;
                case 207 -> 162;
                case 208 -> 0;
                case 209 -> 93;
                case 210 -> 136;
                case 211 -> 202;
                case 212 -> 24;
                case 213 -> 66;
                case 214 -> 252;
                case 215 -> 132;
                case 216 -> 167;
                case 217 -> 177;
                case 218 -> 22;
                case 219 -> 75;
                case 220 -> 64;
                case 221 -> 32;
                case 222 -> 232;
                case 223 -> 172;
                case 224 -> 33;
                case 225 -> 51;
                case 226 -> 134;
                case 227 -> 254;
                case 228 -> 145;
                case 229 -> 27;
                case 230 -> 175;
                case 231 -> 210;
                case 232 -> 180;
                case 233 -> 39;
                case 234 -> 131;
                case 235 -> 217;
                case 236 -> 11;
                case 237 -> 14;
                case 238 -> 36;
                case 239 -> 160;
                case 240 -> 26;
                case 241 -> 209;
                case 242 -> 146;
                case 243 -> 192;
                case 244 -> 236;
                case 245 -> 155;
                case 246 -> 83;
                case 247 -> 158;
                case 248 -> 62;
                case 249 -> 147;
                case 250 -> 70;
                case 251 -> 101;
                case 252 -> 68;
                case 253 -> 126;
                case 254 -> 179;
                default -> 206;
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
            ek.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56FD;
        if (h[n2] == null) {
            ek.h[n2] = (int)(c[n2] ^ l);
        }
        return h[n2];
    }
}
