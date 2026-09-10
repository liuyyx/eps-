/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
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
import net.minecraft.resources.Identifier;

public final class zJ
extends Enum<zJ> {
    public static final /* enum */ zJ IDLE;
    public static final /* enum */ zJ PANEL_OPEN;
    public static final /* enum */ zJ CANCEL;
    public static final /* enum */ zJ PANEL_CLOSE;
    public static final /* enum */ zJ SCROLL_DOWN;
    public static final /* enum */ zJ TOGGLE_ON;
    private static final zJ[] N;
    public static final /* enum */ zJ PRIMARY_CLICK;
    public static final /* enum */ zJ CONFIRM;
    public static final /* enum */ zJ HEAD_HOVER;
    public static final /* enum */ zJ TOGGLE_OFF;
    public static final /* enum */ zJ BUTTON_ACTION;
    public static final /* enum */ zJ BLINK;
    public static final /* enum */ zJ COLOR_PICK;
    public static final /* enum */ zJ DRAG;
    public static final /* enum */ zJ SLIDER_ADJUST;
    private final int M;
    public static final /* enum */ zJ KEY_BIND;
    private final Identifier W;
    private final long p;
    public static final /* enum */ zJ SCROLL_UP;
    public static final /* enum */ zJ MODULE_HIDDEN;
    public static final /* enum */ zJ SECONDARY_CLICK;
    public static final /* enum */ zJ TYPING;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    private static zJ[] s(Object[] objectArray) {
        zJ[] zJArray = new zJ[zJ.a(21478, 5284501357115443767L)];
        zJArray[0] = hi.a("j", (long)1158716554595397923L);
        zJArray[1] = hi.a("j", (long)786611390352501567L);
        zJArray[2] = hi.a("j", (long)1089638728845495349L);
        zJArray[3] = hi.a("j", (long)1108946086899355849L);
        zJArray[4] = hi.a("j", (long)597645201562828599L);
        zJArray[5] = hi.a("j", (long)506177599043629010L);
        zJArray[zJ.a((int)30085, (long)423386469559446609L)] = hi.a("j", (long)771535224685464789L);
        zJArray[zJ.a((int)3, (long)8864819961780787649L)] = hi.a("j", (long)788161320910655993L);
        zJArray[zJ.a((int)7054, (long)58658885468537416L)] = hi.a("j", (long)1247305522298595726L);
        zJArray[zJ.a((int)19464, (long)4681277356660397508L)] = hi.a("j", (long)914160619700649708L);
        zJArray[zJ.a((int)19217, (long)2646680854223819506L)] = hi.a("j", (long)681355696848348009L);
        zJArray[zJ.a((int)30932, (long)2878466489818063107L)] = hi.a("j", (long)1203662346844571369L);
        zJArray[zJ.a((int)20885, (long)5064357974484191336L)] = hi.a("j", (long)543566076446335695L);
        zJArray[zJ.a((int)8383, (long)2590431881520871758L)] = hi.a("j", (long)370549720774891894L);
        zJArray[zJ.a((int)22577, (long)6520278519114170826L)] = hi.a("j", (long)1178449271169429125L);
        zJArray[zJ.a((int)23481, (long)4922586664936768071L)] = hi.a("j", (long)375026474282833602L);
        zJArray[zJ.a((int)19905, (long)1526386620063421452L)] = hi.a("j", (long)754399624983433933L);
        zJArray[zJ.a((int)22243, (long)6097202607000620857L)] = hi.a("j", (long)669400933084822815L);
        zJArray[zJ.a((int)22797, (long)6922382412860621044L)] = hi.a("j", (long)959628199090740860L);
        zJArray[zJ.a((int)26972, (long)376230194584858784L)] = hi.a("j", (long)1142532897080709856L);
        return zJArray;
    }

    public static zJ[] values() {
        return (zJ[])((Enum)((Object)hi.a("j", (long)369628962299726724L))).clone();
    }

    public long K(Object[] objectArray) {
        return (long)hi.a("\u00e9", (Object)((Object)this), (long)716350525986786427L);
    }

    public static /* bridge */ /* synthetic */ CallSite q(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private zJ(String string2, long l, int n2) {
        this.W = hi.a("G", zJ.a(6851, -15138) + string2 + zJ.a(6901, -619), (long)1218614314410685839L);
        this.p = l;
        this.M = n2;
    }

    public Identifier k(Object[] objectArray) {
        return hi.a("\u00e9", (Object)((Object)this), (long)1060086274028471920L);
    }

    public int b(Object[] objectArray) {
        return (int)hi.a("\u00e9", (Object)((Object)this), (long)1106562820999517532L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean E(Object[] var1_1) {
        block14: {
            block15: {
                var2_2 = Dl.t();
                var3_3 /* !! */  = hi.a("G", (int)(zJ.a(24321, 8317296656058058473L) ^ zJ.a(16990, 2175649845436128168L)), (int)zJ.a(13969, 4161218801847922559L), (long)834203424483934088L) * zJ.a(24076, 6979303468388747239L) ^ zJ.a(6261, 5149142921285616025L);
                if (!var2_2) ** GOTO lbl15
                block8: while (true) {
                    block18: {
                        block17: {
                            block16: {
                                v0 /* !! */  = (cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)716350525986786427L) - 0L) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (var2_2) break block16;
                                if (v0 /* !! */  > 0) break block17;
                                v0 /* !! */  = (reference)((zJ.a(24385, 6906452280581162643L) ^ zJ.a(13898, 3707136464545836931L)) / zJ.a(30932, 2878466489818063107L) ^ zJ.a(15562, 151882225129022720L));
                            }
                            var3_3 /* !! */  = (int)v0 /* !! */ ;
                            if (!var2_2) break block18;
                        }
                        var3_3 /* !! */  = (zJ.a(24213, 6195436613449123658L) + zJ.a(30083, 1920698294145166452L)) / zJ.a(20885, 5064357974484191336L) + zJ.a(3956, 3327008088604595847L);
                    }
                    switch (var3_3 /* !! */ ) {
                        default: {
                            continue block8;
                        }
                        case -913926146: {
                            v1 = true;
                            var3_3 /* !! */  = (int)(hi.a("G", (int)(zJ.a(26193, 6454754505401646986L) ^ zJ.a(30469, 1756805845761568459L)), (int)zJ.a(29776, 7143611025985875385L), (long)834203424483934088L) + zJ.a(28261, 3806330946355345314L));
                            if (!var2_2) break block14;
                            break block15;
                        }
                        case -913926147: {
                            break block8;
                        }
                        case -913926148: {
                            hi.a("G", (long)1077881734840925226L);
                            hi.a("G", (long)426324660506778941L);
                        }
                    }
                    break;
                }
                v1 = false;
                if (var2_2) {
                    return v1;
                }
            }
            var3_3 /* !! */  = (int)(hi.a("G", (int)(zJ.a(31220, 1194325538933022745L) ^ zJ.a(16579, 483198260839422216L)), (int)zJ.a(18461, 49689468583580100L), (long)834203424483934088L) + zJ.a(17902, 8039106532867546168L));
        }
        block9: while (true) {
            switch (var3_3 /* !! */ ) {
                case -445610620: {
                    hi.a("G", (long)409074377258406884L);
                    var3_3 /* !! */  = (int)(hi.a("G", (int)(zJ.a(26363, 7075479658763304741L) / zJ.a(23481, 4922586664936768071L)), (int)zJ.a(32190, 5040358374410363994L), (long)834203424483934088L) + zJ.a(10411, 9157086857149411707L));
                    continue block9;
                }
            }
            break;
        }
        return v1;
    }

    public static zJ valueOf(String string) {
        return (zJ)((Object)zJ.q("Qk66eLS6R6jsLj6S", valueOf(java.lang.Class<T> java.lang.String ), zJ.class, (String)string));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[42];
                                var19_1 = 0;
                                var18_2 = "\u0082\u000b\u001d\u00f8\u000ft\n%\u00e8\u00e9\r(\u0091O\u00d2\u00af5\u00a4\u00ae\u00eft*o\u00b7\u0002\u0006\u00eb\u0002y\\\nvY\u00977\u00a3\u00bb\u00ee/tr\t\u00e9{\u00fd;;T\u009cg#\u0005\u00b6\u0094\u00cc\u00ac\u00d5\u0002\u00df>\u0007~\u00ce\u00f3\u008c\u00d7\u0094\u00b6\u0002%8\u0002\u00c8*\u0002\u00ad\u0000\u0002\u00a9Y\u0002ef\u0002S1\u0006\u00c90\u0005\u0099\u0005\u008d\u000b\u00ec\u0019\u00d0\u00ba\u00b6<10\b\u00c9W\u0002\u0003\u0081\u00028\u00cb\u0004\u00ca<,\u00bb\u001b\bA\u00da >U\u0018\u00aa\u00afv\u00ffK\u00d2+\u00be\u00c8\u00a4,\u0015t,z`C\u0003*\u00fb\u0002Yj\r\u00c8w\u00e0\u00a8\u00fbv\u0084$'\u00d8u\u00f5\u00f5\u0006\u009e\u00e9\u0004\u00b3\u00f3\u0088\r_\u0017\u00c2\u00d6\u001a\u009d\u0090\u00a5\u00a8\u00ce9\u00eeU\u0002K\\\u0002(\u00db\t\u000e\u008a\u00f3\u0080M#R\u00bb\u00e4\b\u00d2\u00d4x\u009dX\u0097.\u0099\u0002,Y\u0002<-\r\u008b\u00f3v`8E\u009f!N@\u001e\u00fe4\u0002'D\u0004\u00c5\bl\u00eb\u0004A\u00e1\u00f4\u0090\u0002N\r\u0002\u00a8\u00da\u000f\u00de\u0089\u00f8&\u001d\u00ff\u0004.\u00fa\u00db\u00db\u00e4\u00c0{|\u0002\u0085\u00fe\n=\u001b\u0099?\u00c3\u00c7QJy;";
                                var20_3 = "\u0082\u000b\u001d\u00f8\u000ft\n%\u00e8\u00e9\r(\u0091O\u00d2\u00af5\u00a4\u00ae\u00eft*o\u00b7\u0002\u0006\u00eb\u0002y\\\nvY\u00977\u00a3\u00bb\u00ee/tr\t\u00e9{\u00fd;;T\u009cg#\u0005\u00b6\u0094\u00cc\u00ac\u00d5\u0002\u00df>\u0007~\u00ce\u00f3\u008c\u00d7\u0094\u00b6\u0002%8\u0002\u00c8*\u0002\u00ad\u0000\u0002\u00a9Y\u0002ef\u0002S1\u0006\u00c90\u0005\u0099\u0005\u008d\u000b\u00ec\u0019\u00d0\u00ba\u00b6<10\b\u00c9W\u0002\u0003\u0081\u00028\u00cb\u0004\u00ca<,\u00bb\u001b\bA\u00da >U\u0018\u00aa\u00afv\u00ffK\u00d2+\u00be\u00c8\u00a4,\u0015t,z`C\u0003*\u00fb\u0002Yj\r\u00c8w\u00e0\u00a8\u00fbv\u0084$'\u00d8u\u00f5\u00f5\u0006\u009e\u00e9\u0004\u00b3\u00f3\u0088\r_\u0017\u00c2\u00d6\u001a\u009d\u0090\u00a5\u00a8\u00ce9\u00eeU\u0002K\\\u0002(\u00db\t\u000e\u008a\u00f3\u0080M#R\u00bb\u00e4\b\u00d2\u00d4x\u009dX\u0097.\u0099\u0002,Y\u0002<-\r\u008b\u00f3v`8E\u009f!N@\u001e\u00fe4\u0002'D\u0004\u00c5\bl\u00eb\u0004A\u00e1\u00f4\u0090\u0002N\r\u0002\u00a8\u00da\u000f\u00de\u0089\u00f8&\u001d\u00ff\u0004.\u00fa\u00db\u00db\u00e4\u00c0{|\u0002\u0085\u00fe\n=\u001b\u0099?\u00c3\u00c7QJy;".length();
                                var17_4 = 10;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 111;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "6\u00e5U\u00bb}\u0017\u0007\\\u000ba\u000b\u0095b\u00d3\u00ce\u001a\u00b9\u00eb\u00aa\u009f\u00c4\u00fd";
                                    var20_3 = "6\u00e5U\u00bb}\u0017\u0007\\\u000ba\u000b\u0095b\u00d3\u00ce\u001a\u00b9\u00eb\u00aa\u009f\u00c4\u00fd".length();
                                    var17_4 = 10;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 55;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 110;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 40;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 22;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 50;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 39;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 29;
                                            break;
                                        }
                                        default: {
                                            v15 = 7;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        zJ.a = var21;
                        zJ.b = new String[42];
                        var8_7 = 9091883678922880064L;
                        var14_8 = new long[65];
                        var11_9 = 0;
                        var12_10 = "+\u009fu\u00c9\u00a5I\u00cd\u00dd7]NRF\u00ed\u0000\u001c\u00bb\u00b3P\u0089\u00d5Fy\b:\u00d8B\u0099(\u0088&\u00b8e\u00e6\u00b9%V\u0011\u00d3\u0002\u00fbem\u00b3\u0016J\u00e50\u00b4\u0018eq\u00d3+\u00e4\u00bcB\u00fc\u001c\u00db$4\u00a7,\u00f0Z4\u009d#\u00c5\u00fc\u0004\u00e8\u00d8\u0089\u00e6\u00d7\u00b1\u00fek\u0095\u00ae\u0086 \u00ee1\u0003\u001aZ\u00c1#\u00f5\u0013\u00a7\u00d3\u00f8\u0093\u009a\u00eb\u00b7ML\u00bf:\u00e3\u00b7\u009f+\u00a8\\\u00fbz&\u009b\u009c\u0001\u0086\u0081\u0002\u00d7\u0018E\u00f4[\u00be\u00993\u00ff\u00c4\u00f6\u00c0\u00d44}\u00db\u00b31\u0085\u0011{\u00ad\u00bbM\u0003\u0086\u0018 \u009f\u00e581\u00bb\u000b\u007fUp\u0084\u0004\u00a61{I\u00bb\u00e1\u00c6\u008e\u00d6\u00c1R\u00bf\u00aa\n\u00ed\u0087h\u00d0_n\"\u008fk!\u0086c\u0093\u00fc\u001c\u00b7:\u001c\u00c0\u00f5{p\u00e8Yu\u00b8\u001f\u00eec\u00b7\u009d\u00e20\u00a6\u00b4\u00a6{g\u007f\\\u0092\u00ed\u008f\u00c9v\u00ce\u00108\u00957\u00b5\u0084/\u00a7\u0089r\u00a3_\u0004\u00f3\nL\u0004\u00b2\u0019\u00d2\u00bc$\u00c2E55^\u00ff6\b\u0088UC4\u00e9\u008b\u0090j\u00d4\u0000\u00de\u00a2\u0098}1\u00c7T\u00e8\u00d0\u00e9\u00b4\u00bb\u00de\u00fa\u00ac=w\u00e4n\u00e2\u00ed\u00866>w\u001f{D\u0086\u00bd7\u0097~\u00ae7\u001f\u00ea\u00a4\u008d\u00a4\u00eaS\u00c9W\u0091\u00c0-F\u00c4\u0096\u00f2\u001bv\u0000=}\u00ad\u00a5\u0007\u009b\u001e\u0013A<J\u0087*4\u00ffs\u00d0oE$ \u00dd\u00ff,K\u00ed\u0018)\u000eB\u0091\u00ae|*\u00e9w\u00b7G\u00bc\u0091\u00ee\u00b0\u00d7\u0019\u00ef\u008c!\u008dLVg\u00a1\u00cb\u0094\u00a0\\Y@\u0081\u00d3u\u00de\u008bRu;Z\u00ae?\u0088\u00d3\u001e=\u001d\u00dc\u009c\u008e\u00e1@\u0004u\u00a2\u0012\u00e7\u00a0\u00b1>c\b%^\u00cc\u009e\u00ca\u00ab\u00e7\u008a'\u00bc\u00c1\u00b8u=\u00e8\u001e!,\u0081\u00c5\u0092\u0098\u0017\u00a8\u00d8k3r!\rI\u001e\u00d1L\u00f0G\u009a\u00b5\u0089\u00ab\u00b0\u0082\u00cer&\u0015H8\u00cc\u0099S\u00bekB4\u00c3\u00ed\u0007\u00ef\u0012\u00c2\u00c2\u0016\u00fdY\u00f9I\u0084\u0085;hBH1\u008c@\u00cad\u00e9\u009edDi\u00e8\u00a1\u008a\u0000]\u00d4\u00b6\u0016\u0095\u00ad\u00bb6\u00b8\u0012\u00c0\u0094\u00c3\u00e2xO";
                        var13_11 = "+\u009fu\u00c9\u00a5I\u00cd\u00dd7]NRF\u00ed\u0000\u001c\u00bb\u00b3P\u0089\u00d5Fy\b:\u00d8B\u0099(\u0088&\u00b8e\u00e6\u00b9%V\u0011\u00d3\u0002\u00fbem\u00b3\u0016J\u00e50\u00b4\u0018eq\u00d3+\u00e4\u00bcB\u00fc\u001c\u00db$4\u00a7,\u00f0Z4\u009d#\u00c5\u00fc\u0004\u00e8\u00d8\u0089\u00e6\u00d7\u00b1\u00fek\u0095\u00ae\u0086 \u00ee1\u0003\u001aZ\u00c1#\u00f5\u0013\u00a7\u00d3\u00f8\u0093\u009a\u00eb\u00b7ML\u00bf:\u00e3\u00b7\u009f+\u00a8\\\u00fbz&\u009b\u009c\u0001\u0086\u0081\u0002\u00d7\u0018E\u00f4[\u00be\u00993\u00ff\u00c4\u00f6\u00c0\u00d44}\u00db\u00b31\u0085\u0011{\u00ad\u00bbM\u0003\u0086\u0018 \u009f\u00e581\u00bb\u000b\u007fUp\u0084\u0004\u00a61{I\u00bb\u00e1\u00c6\u008e\u00d6\u00c1R\u00bf\u00aa\n\u00ed\u0087h\u00d0_n\"\u008fk!\u0086c\u0093\u00fc\u001c\u00b7:\u001c\u00c0\u00f5{p\u00e8Yu\u00b8\u001f\u00eec\u00b7\u009d\u00e20\u00a6\u00b4\u00a6{g\u007f\\\u0092\u00ed\u008f\u00c9v\u00ce\u00108\u00957\u00b5\u0084/\u00a7\u0089r\u00a3_\u0004\u00f3\nL\u0004\u00b2\u0019\u00d2\u00bc$\u00c2E55^\u00ff6\b\u0088UC4\u00e9\u008b\u0090j\u00d4\u0000\u00de\u00a2\u0098}1\u00c7T\u00e8\u00d0\u00e9\u00b4\u00bb\u00de\u00fa\u00ac=w\u00e4n\u00e2\u00ed\u00866>w\u001f{D\u0086\u00bd7\u0097~\u00ae7\u001f\u00ea\u00a4\u008d\u00a4\u00eaS\u00c9W\u0091\u00c0-F\u00c4\u0096\u00f2\u001bv\u0000=}\u00ad\u00a5\u0007\u009b\u001e\u0013A<J\u0087*4\u00ffs\u00d0oE$ \u00dd\u00ff,K\u00ed\u0018)\u000eB\u0091\u00ae|*\u00e9w\u00b7G\u00bc\u0091\u00ee\u00b0\u00d7\u0019\u00ef\u008c!\u008dLVg\u00a1\u00cb\u0094\u00a0\\Y@\u0081\u00d3u\u00de\u008bRu;Z\u00ae?\u0088\u00d3\u001e=\u001d\u00dc\u009c\u008e\u00e1@\u0004u\u00a2\u0012\u00e7\u00a0\u00b1>c\b%^\u00cc\u009e\u00ca\u00ab\u00e7\u008a'\u00bc\u00c1\u00b8u=\u00e8\u001e!,\u0081\u00c5\u0092\u0098\u0017\u00a8\u00d8k3r!\rI\u001e\u00d1L\u00f0G\u009a\u00b5\u0089\u00ab\u00b0\u0082\u00cer&\u0015H8\u00cc\u0099S\u00bekB4\u00c3\u00ed\u0007\u00ef\u0012\u00c2\u00c2\u0016\u00fdY\u00f9I\u0084\u0085;hBH1\u008c@\u00cad\u00e9\u009edDi\u00e8\u00a1\u008a\u0000]\u00d4\u00b6\u0016\u0095\u00ad\u00bb6\u00b8\u0012\u00c0\u0094\u00c3\u00e2xO".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00c6F\u0015\u00a2xX8\u0096b4\u00c6R\u00cbS\u00b2\u0010";
                            var13_11 = "\u00c6F\u0015\u00a2xX8\u0096b4\u00c6R\u00cbS\u00b2\u0010".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                zJ.c = var14_8;
                zJ.d = new Integer[65];
                var1_14 = 360602422391921147L;
                var0_15 = new long[16];
                var4_16 = 0;
                var5_17 = "\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u00f3\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0097\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db+\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0003\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u00af\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0003\u0005\u0001\u001d\u00fe\u001b\u00d0\u00dbo\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0097\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u0087\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db+\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u00af\u0005\u0001\u001d\u00fe\u001b\u00d0\u00dbo\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u0093\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8C";
                var6_18 = "\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u00f3\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0097\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db+\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0003\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u00af\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0003\u0005\u0001\u001d\u00fe\u001b\u00d0\u00dbo\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db\u0097\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u0087\u0005\u0001\u001d\u00fe\u001b\u00d0\u00db+\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u00af\u0005\u0001\u001d\u00fe\u001b\u00d0\u00dbo\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u0093\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8C".length();
                var3_19 = 0;
                while (true) {
                    var7_20 = var5_17.substring(var3_19, var3_19 += 8).getBytes("ISO-8859-1");
                    v22 = var0_15;
                    v23 = var4_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var3_19 < var6_18) ** continue;
                    var5_17 = "\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u001b\u0005\u0001\u001d\u00fe\u001b\u00d0\u00df\u00bb";
                    var6_18 = "\u0005\u0001\u001d\u00fe\u001b\u00d0\u00d8\u001b\u0005\u0001\u001d\u00fe\u001b\u00d0\u00df\u00bb".length();
                    var3_19 = 0;
                    while (true) {
                        var7_20 = var5_17.substring(var3_19, var3_19 += 8).getBytes("ISO-8859-1");
                        v22 = var0_15;
                        v23 = var4_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl166:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var3_19 < var6_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var1_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl177:
                // 1 sources

                ** continue;
            }
        }
        zJ.PANEL_OPEN = new zJ((Object)zJ.a(6871, 25128), 0, (Object)zJ.a(6876, -2533), var0_15[2], zJ.a(20551, 3961299985243015572L));
        zJ.COLOR_PICK = new zJ((Object)zJ.a(6896, -20195), 1, (Object)zJ.a(6862, 21154), var0_15[5], zJ.a(23641, 7263495343892235691L));
        zJ.SECONDARY_CLICK = new zJ((Object)zJ.a(6898, -32125), 2, (Object)zJ.a(6899, -17756), var0_15[13], zJ.a(13853, 9035727234054451181L));
        zJ.PRIMARY_CLICK = new zJ((Object)zJ.a(6870, -1811), 3, (Object)zJ.a(6861, 9101), var0_15[8], zJ.a(23635, 5678534593412826515L));
        zJ.PANEL_CLOSE = new zJ((Object)zJ.a(6855, 31770), 4, (Object)zJ.a(6858, -21088), var0_15[1], zJ.a(28401, 9133541314421307163L));
        zJ.MODULE_HIDDEN = new zJ((Object)zJ.a(6849, -5136), 5, (Object)zJ.a(6873, -25413), var0_15[9], zJ.a(27509, 495616275903034038L));
        zJ.CANCEL = new zJ((Object)zJ.a(6872, 6767), zJ.a(1830, 3535284423358504674L), (Object)zJ.a(6853, -4804), var0_15[3], zJ.a(2368, 8622024921967841446L));
        zJ.TOGGLE_ON = new zJ((Object)zJ.a(6866, -698), zJ.a(12203, 2807612181128279667L), (Object)zJ.a(6864, 8898), var0_15[6], zJ.a(13099, 1022204120358284010L));
        zJ.TOGGLE_OFF = new zJ((Object)zJ.a(6911, -5520), zJ.a(26516, 7185148831065914952L), (Object)zJ.a(6900, -16436), var0_15[11], zJ.a(13099, 1022204120358284010L));
        zJ.IDLE = new zJ((Object)zJ.a(6852, 18571), zJ.a(15228, 3805679468682437256L), (Object)zJ.a(6854, -15370), 0L, 0);
        zJ.SLIDER_ADJUST = new zJ((Object)zJ.a(6863, 13863), zJ.a(2207, 7703824336734671226L), (Object)zJ.a(6857, -9588), var0_15[0], zJ.a(28155, 8267180211015234586L));
        zJ.CONFIRM = new zJ((Object)zJ.a(6879, 16566), zJ.a(19072, 2381019556315009895L), (Object)zJ.a(6897, 13409), var0_15[7], zJ.a(25126, 9098195801002425308L));
        zJ.TYPING = new zJ((Object)zJ.a(6848, 3810), zJ.a(24784, 5113489426806192389L), (Object)zJ.a(6878, 25387), var0_15[14], zJ.a(24086, 5437923064573036537L));
        zJ.SCROLL_UP = new zJ((Object)zJ.a(6860, -3906), zJ.a(1384, 5761025881369336989L), (Object)zJ.a(6850, -18686), var0_15[10], zJ.a(4812, 106756045730892548L));
        zJ.KEY_BIND = new zJ((Object)zJ.a(6859, -10343), zJ.a(8307, 275440467533330835L), (Object)zJ.a(6869, -22458), var0_15[15], zJ.a(16075, 3585472430347806468L));
        zJ.BUTTON_ACTION = new zJ((Object)zJ.a(6856, -31123), zJ.a(22180, 6883170420610240377L), (Object)zJ.a(6868, -16936), var0_15[9], zJ.a(16075, 3585472430347806468L));
        zJ.DRAG = new zJ((Object)zJ.a(6902, -13522), zJ.a(29254, 8484295454130351038L), (Object)zJ.a(6903, 7422), var0_15[12], zJ.a(13099, 1022204120358284010L));
        zJ.SCROLL_DOWN = new zJ((Object)zJ.a(6910, 25540), zJ.a(31828, 1195267353282684305L), (Object)zJ.a(6877, -14748), var0_15[4], zJ.a(24519, 7842858755850831463L));
        zJ.HEAD_HOVER = new zJ((Object)zJ.a(6867, 6396), zJ.a(5304, 8582134717314813274L), (Object)zJ.a(6874, 7770), 0L, 0);
        zJ.BLINK = new zJ((Object)zJ.a(6865, 19618), zJ.a(32198, 4068348767224800313L), (Object)zJ.a(6875, -2721), 0L, 0);
        zJ.N = hi.a("G", (Object)new Object[0], (long)1289286745342027765L);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x1AD7) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 167;
                case 1 -> 82;
                case 2 -> 196;
                case 3 -> 86;
                case 4 -> 32;
                case 5 -> 81;
                case 6 -> 56;
                case 7 -> 16;
                case 8 -> 17;
                case 9 -> 97;
                case 10 -> 70;
                case 11 -> 202;
                case 12 -> 118;
                case 13 -> 83;
                case 14 -> 179;
                case 15 -> 98;
                case 16 -> 101;
                case 17 -> 169;
                case 18 -> 211;
                case 19 -> 230;
                case 20 -> 171;
                case 21 -> 88;
                case 22 -> 120;
                case 23 -> 240;
                case 24 -> 208;
                case 25 -> 25;
                case 26 -> 181;
                case 27 -> 46;
                case 28 -> 133;
                case 29 -> 13;
                case 30 -> 79;
                case 31 -> 233;
                case 32 -> 66;
                case 33 -> 76;
                case 34 -> 36;
                case 35 -> 200;
                case 36 -> 22;
                case 37 -> 157;
                case 38 -> 231;
                case 39 -> 102;
                case 40 -> 43;
                case 41 -> 116;
                case 42 -> 186;
                case 43 -> 129;
                case 44 -> 163;
                case 45 -> 131;
                case 46 -> 195;
                case 47 -> 0;
                case 48 -> 30;
                case 49 -> 35;
                case 50 -> 159;
                case 51 -> 111;
                case 52 -> 27;
                case 53 -> 144;
                case 54 -> 55;
                case 55 -> 29;
                case 56 -> 18;
                case 57 -> 51;
                case 58 -> 249;
                case 59 -> 176;
                case 60 -> 158;
                case 61 -> 128;
                case 62 -> 73;
                case 63 -> 4;
                case 64 -> 39;
                case 65 -> 204;
                case 66 -> 184;
                case 67 -> 135;
                case 68 -> 160;
                case 69 -> 7;
                case 70 -> 15;
                case 71 -> 110;
                case 72 -> 34;
                case 73 -> 193;
                case 74 -> 40;
                case 75 -> 113;
                case 76 -> 156;
                case 77 -> 45;
                case 78 -> 235;
                case 79 -> 77;
                case 80 -> 182;
                case 81 -> 147;
                case 82 -> 89;
                case 83 -> 80;
                case 84 -> 14;
                case 85 -> 250;
                case 86 -> 248;
                case 87 -> 241;
                case 88 -> 153;
                case 89 -> 215;
                case 90 -> 59;
                case 91 -> 236;
                case 92 -> 175;
                case 93 -> 114;
                case 94 -> 26;
                case 95 -> 188;
                case 96 -> 109;
                case 97 -> 151;
                case 98 -> 183;
                case 99 -> 31;
                case 100 -> 5;
                case 101 -> 42;
                case 102 -> 191;
                case 103 -> 234;
                case 104 -> 137;
                case 105 -> 91;
                case 106 -> 10;
                case 107 -> 162;
                case 108 -> 244;
                case 109 -> 185;
                case 110 -> 192;
                case 111 -> 53;
                case 112 -> 232;
                case 113 -> 12;
                case 114 -> 149;
                case 115 -> 197;
                case 116 -> 2;
                case 117 -> 177;
                case 118 -> 146;
                case 119 -> 189;
                case 120 -> 143;
                case 121 -> 224;
                case 122 -> 140;
                case 123 -> 166;
                case 124 -> 187;
                case 125 -> 245;
                case 126 -> 252;
                case 127 -> 122;
                case 128 -> 209;
                case 129 -> 92;
                case 130 -> 180;
                case 131 -> 85;
                case 132 -> 172;
                case 133 -> 87;
                case 134 -> 121;
                case 135 -> 58;
                case 136 -> 214;
                case 137 -> 219;
                case 138 -> 165;
                case 139 -> 71;
                case 140 -> 150;
                case 141 -> 170;
                case 142 -> 225;
                case 143 -> 72;
                case 144 -> 178;
                case 145 -> 99;
                case 146 -> 226;
                case 147 -> 136;
                case 148 -> 134;
                case 149 -> 190;
                case 150 -> 229;
                case 151 -> 194;
                case 152 -> 141;
                case 153 -> 152;
                case 154 -> 210;
                case 155 -> 198;
                case 156 -> 125;
                case 157 -> 20;
                case 158 -> 237;
                case 159 -> 23;
                case 160 -> 251;
                case 161 -> 60;
                case 162 -> 57;
                case 163 -> 19;
                case 164 -> 95;
                case 165 -> 69;
                case 166 -> 220;
                case 167 -> 221;
                case 168 -> 206;
                case 169 -> 11;
                case 170 -> 41;
                case 171 -> 94;
                case 172 -> 127;
                case 173 -> 100;
                case 174 -> 61;
                case 175 -> 213;
                case 176 -> 67;
                case 177 -> 106;
                case 178 -> 246;
                case 179 -> 107;
                case 180 -> 33;
                case 181 -> 205;
                case 182 -> 105;
                case 183 -> 173;
                case 184 -> 139;
                case 185 -> 63;
                case 186 -> 164;
                case 187 -> 207;
                case 188 -> 142;
                case 189 -> 203;
                case 190 -> 253;
                case 191 -> 239;
                case 192 -> 217;
                case 193 -> 115;
                case 194 -> 96;
                case 195 -> 227;
                case 196 -> 174;
                case 197 -> 154;
                case 198 -> 124;
                case 199 -> 62;
                case 200 -> 228;
                case 201 -> 108;
                case 202 -> 6;
                case 203 -> 9;
                case 204 -> 37;
                case 205 -> 130;
                case 206 -> 103;
                case 207 -> 126;
                case 208 -> 148;
                case 209 -> 3;
                case 210 -> 48;
                case 211 -> 1;
                case 212 -> 201;
                case 213 -> 222;
                case 214 -> 64;
                case 215 -> 68;
                case 216 -> 78;
                case 217 -> 199;
                case 218 -> 223;
                case 219 -> 112;
                case 220 -> 54;
                case 221 -> 255;
                case 222 -> 212;
                case 223 -> 247;
                case 224 -> 145;
                case 225 -> 243;
                case 226 -> 49;
                case 227 -> 47;
                case 228 -> 90;
                case 229 -> 75;
                case 230 -> 104;
                case 231 -> 132;
                case 232 -> 138;
                case 233 -> 123;
                case 234 -> 28;
                case 235 -> 254;
                case 236 -> 155;
                case 237 -> 93;
                case 238 -> 44;
                case 239 -> 52;
                case 240 -> 117;
                case 241 -> 84;
                case 242 -> 161;
                case 243 -> 74;
                case 244 -> 8;
                case 245 -> 38;
                case 246 -> 50;
                case 247 -> 238;
                case 248 -> 242;
                case 249 -> 119;
                case 250 -> 218;
                case 251 -> 65;
                case 252 -> 24;
                case 253 -> 168;
                case 254 -> 216;
                default -> 21;
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
            zJ.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x59E0;
        if (d[n2] == null) {
            zJ.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
