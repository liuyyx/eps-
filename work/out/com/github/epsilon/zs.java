/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Holder
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.player.Player
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
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;

final class zs
extends Enum<zs> {
    private final Identifier l;
    public static final /* enum */ zs CONTAINER;
    private final Identifier f;
    public static final /* enum */ zs FROZEN;
    private final Identifier A;
    public static final /* enum */ zs NORMAL;
    private final Identifier R;
    private final Identifier P;
    private final Identifier a;
    public static final /* enum */ zs POISONED;
    public static final /* enum */ zs WITHERED;
    public static final /* enum */ zs ABSORBING;
    private final Identifier V;
    private final Identifier B;
    private static final zs[] d;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] g;

    public static zs valueOf(String string) {
        return (zs)((Object)hi.a("G", zs.class, (Object)string, (long)703426484721789552L));
    }

    private static zs[] f(Object[] objectArray) {
        zs[] zsArray = new zs[zs.a(7720, 2407233779828421774L)];
        zsArray[0] = hi.a("j", (long)852080247361973671L);
        zsArray[1] = hi.a("j", (long)987544231771614749L);
        zsArray[2] = hi.a("j", (long)806383019207199696L);
        zsArray[3] = hi.a("j", (long)713360461772333423L);
        zsArray[4] = hi.a("j", (long)1262178430251879740L);
        zsArray[5] = hi.a("j", (long)426430203158303208L);
        return zsArray;
    }

    private static Identifier D(Object object) {
        return hi.a("G", zs.a(1036, 20944) + (String)object, (long)490867849634283930L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[55];
                        var11_1 = 0;
                        var10_2 = "\u0096\u00a7\u00ddk<F\u0089\u008c\u0000R\u00f2\u0094\u00e6\u00d2\u00141g5\u00e4\u00f5\u0014\u000e\u00f7\u00cea^\u0007\u00c5\u00a4\u0089I\u00c1\u0016\u00cf'\u0091cY`BW\u001f\u00bd\u00c1\u0090\u00cd\u00ed\u00de\u0089\fC\u00cbd\u000e\u00d5\u0006\u00b2Y{\u0091\u00ae\u0097DV\u00d2\u00c8[>\u0094p\u00d7\u0082\u0013\u0016\u00e2\u0000\u0081\u00f0\u000f\u00e9\u0004U\u0007\u00cf\u00f8_\u00d8\u00cd\u0017\u0085o\u00e6\u00a2f\u00a4`\u001f$GY\u00c0`\u001bs+\u001c/\u008f\u0092\u00a8\u0095\u001d+\u008e\u00df\u0010^\u0093o(\u00ef\u0004\u00da\u007f\u00ec\u00aa\u0011\u00bc\u001f\u00ff\u009d\u00d8F\u00e4\u00af\u00a8\"g\u000e\u00e0\u00b6E\u0011\u00a0\u00bb9\u00cd\u00e8\bC92nG\u00ea\u0017\u00ea\u00a7\u00d1\u001d\tF\u00c6g\u00f3J\u0099\u00f6\u0099\u00ef\u0004J\u00a2E:\rbe\u0091\\\r|D\u00e7\u000f\u0097\u00ed\u009b\u00e6\u001d\u00ca\u00bfVhM&\u00a7\u0080\u00c5\u00cdH\u0086\u00fe5\u00b7!\u0093<\u00d4@\u00bc\u0004\u00ab\r#\u00ee\u00de-w\u000eQf\u00deT\u00d4\u001aW\u008c-\u00a7\u009fA\u008a\u009b\r+\u0018\u00b8+\\f\u00f4\u0084\u00ec\u00da\u00912i\u0016bM\u0091\u0081y3P.x\u008f\u0003\u00869\u0017/{\u00c8\u00d5\u00d6\u000b\u0084Y\u0016G\u00165\u00ea\u00ed^\u00c2\u0083*4] l\"\u0081x\u00bdY\u00f8\u0091\u00ef\u009e\t\u0005\u00de\u000b\u00f4\u00c3}\u00c3\u0001M\u0016\u00dczFg\u0083\u00ef\u000f\u00b5\u0093\u00fc~\u00f6\u0094\u00f8\u00d5#72\u00a9\u00fc\u00c53\bj\u00ab\u0094Y\u00dd,\u00c0\u00c9\r\u0017\u00a2\u00ee:\u0003\u00b4 ^o.\u00fe\u00cd\u008c\u0012\u0011\u0001\u0089\u000f\u0093\u0002\u00c9\u00ee\f\u0081\f\u0085\u00e6\u0001\fC6V\u0017\u0081\u0090\u00c4\u008a\u0097\u00c1?\u00f7 \u00c8>\u00ac\u00a0$\u00c4\u00e7/\u00c2\u00e6\u0089\u0091\u00b7\u00fd\u0016NS\u00ee\u009f\"\u0094pE|\u00e2\u0083+)\u00a2-\u00cd\u0088\u0003\u00d0\u00c5\u008b\u001c\u0016\u00c6\u009e\u0005#\u009f\u0093\u0016\u001aE(\u00a4l\u00cf\u00ab\u00beIZ\u007f\u0004Up\u0006\n3\u00ad\u00ad\u0098U\u00cc6\u00ad\u001bl\r\u00a8\u0098\u00c8;Rd5\u00c4\u00d4\u00dc\u0082=\u0097\u000b\u0086|\u00df\u0010|)\u0081a\u0001\u00ef\u00d2\u0006\u00aep\u00de\u0095X\u009d\b\u0017u\u00c1_\u00c3\u0088H\u00c2\u001b\u00f6\u00a5u\u009b\f\u0090:\u00bcr\u00cb\u00c3\u00cc\u001f(3f\u00d1\u00f29\u0085gx\u0087\u00ea\u00e3U/ \u0097\u00d0\u0006\u0082\u00cf\u00c04\u00d7A\u00cc\u0012,%4t\u00e59\u0082$\u0081\u00c9\u00b6\u00f6\u00a2\u00cf\u00ec\u00ce\u008ay\u007f\u008d\u0015\u0017\u00ad=A?'w)!\u00e2\u0012f\u00f7\u00b5M\u0087\u0085\u00e2.\u00b3\u009a$\u00b4C \\\u0001\u007f\u00b8\u00e0\u0087\u00d1?\u00fd\u00d1\u0085\u008f\u00d7@*k\u00f2S]\u00b5\u00f2\u00ff\r\u008b\u00fb\u00c9H.\u00a9\u00eb\u0097\u0087\r\u00f4\u00b6\u00b9#\u00c8\u0003-\u00b7\u00d7\u00b2\u00e2\u00f0\u009b\u001b\u0098S\u00b8E\u00b5K\r\u00c7\u0094\u00a4\u001f!\u0084\u0095@\u00d1\u00bf\u0004\u00f4[\u00de\u00a3\u00b0\u0091\u0005:\u00f3\u001f\u0005M}\u0081\u00e43\u00e3.\u000e\u008f\u00cd\u0086\u00e0\u0017\u0014{\u00af\u00d5:\u000b\u0019Yyb.k:\u00da\u0002\u00d7\u00a9\u000e{ \u009b\u009c|\u0003B\u00af\u008f\u00c3\u00c5\u00d9\u000e\u0014\r\u00ee\u0004\u0000p?\u00f9\u0002W\u00c7\u008f\u00e0W\u00db\u0014\u0017\u00d3\u00ed\u00e5:\u0097I\u00b8\f\u001b\u00ef\u00bd\u000e\u00f7\t\u0095\u00c4\u00a1\u0090g\u0017\u00b4\u00c3b\u00e0C\u008c\u00a5^s\u00fdT\n\u00ed\u00f0m}\u001a\u0091@\u00edQ\u00f4y\t\u00a8M\u00e55\u00b72?\u008d$\u0016\u00dc*Fm\u0083\u00ae\u000f\u009d\u0093\u00f9~H\u0096\u00ce\u00da@v\u00b2\u000f\u00f3p\u00da\u000b\u00eb\u00c3r\u00e7\u00c9\u00d77\u00b0\u00c3\u001a\u0016\u0016\u0092euYQL\u001e^\u00b1\u008f.W\u0002\u00ccL\u00a5\u0004\u00e2\u00cf\u00e6\tp\u0012\u0019w\u0088\u00c1\u00b3\u00db\u00cd\u00d5\u008c\u00e6\u0016d\u00f5\u009b\u001e]aQ\u001d\u00c1\u00ff7`a'\"\u00a0u\u00c9^\u0006<%\u00ef#\u0096h\u00bbVQ\u008d\u0016<\u0094\u00c8(\u00e9\u00a9\u0017\u0086D$\u0010\u008b\u0092\u00bc\u009dP\u0085>\u0011q\r\u001f\u00c6\u00f1F\u00d1\u0097h\u0015\u00ca\u0006\u00dd\u00ab\u00a4G\u00ad0\u0014:\u00a6HK\u008eB\u00df\f\u00ca\\\u00a9\u00b4\u00c2s0\u00e9c%\u00cac\u0004\u000e\u008d\u0002C\r\u00ee\u00dc\u001ei\u001d\u0095\u00e3z\u0017\u00aa\u00f1]m\u0016\u00a17\u0013\u0013\u009d\u0005\u0087w\u0082\u00a4\\\u00fd\u00d0\u0099]\u000f&\u00b7\u008bL\u0081%\r\u00ab\u00aaR\u00a0\u00b5s\u0082\u00b9\"}H\u00c6R\u0012\u00ec\u00076\u00cfd\u001a7\u00ed\u00d3\u00e1\u00f7\u0089\u0099\u0080\u00e3s\u00cbP\u0012\u00c8&\u00b2\u00eb\u00f4\u009e%}\u0091\u00f3\u00b5\u00c6\u0081\u00cf\u0090\u00d7\u00b0\u0000";
                        var12_3 = "\u0096\u00a7\u00ddk<F\u0089\u008c\u0000R\u00f2\u0094\u00e6\u00d2\u00141g5\u00e4\u00f5\u0014\u000e\u00f7\u00cea^\u0007\u00c5\u00a4\u0089I\u00c1\u0016\u00cf'\u0091cY`BW\u001f\u00bd\u00c1\u0090\u00cd\u00ed\u00de\u0089\fC\u00cbd\u000e\u00d5\u0006\u00b2Y{\u0091\u00ae\u0097DV\u00d2\u00c8[>\u0094p\u00d7\u0082\u0013\u0016\u00e2\u0000\u0081\u00f0\u000f\u00e9\u0004U\u0007\u00cf\u00f8_\u00d8\u00cd\u0017\u0085o\u00e6\u00a2f\u00a4`\u001f$GY\u00c0`\u001bs+\u001c/\u008f\u0092\u00a8\u0095\u001d+\u008e\u00df\u0010^\u0093o(\u00ef\u0004\u00da\u007f\u00ec\u00aa\u0011\u00bc\u001f\u00ff\u009d\u00d8F\u00e4\u00af\u00a8\"g\u000e\u00e0\u00b6E\u0011\u00a0\u00bb9\u00cd\u00e8\bC92nG\u00ea\u0017\u00ea\u00a7\u00d1\u001d\tF\u00c6g\u00f3J\u0099\u00f6\u0099\u00ef\u0004J\u00a2E:\rbe\u0091\\\r|D\u00e7\u000f\u0097\u00ed\u009b\u00e6\u001d\u00ca\u00bfVhM&\u00a7\u0080\u00c5\u00cdH\u0086\u00fe5\u00b7!\u0093<\u00d4@\u00bc\u0004\u00ab\r#\u00ee\u00de-w\u000eQf\u00deT\u00d4\u001aW\u008c-\u00a7\u009fA\u008a\u009b\r+\u0018\u00b8+\\f\u00f4\u0084\u00ec\u00da\u00912i\u0016bM\u0091\u0081y3P.x\u008f\u0003\u00869\u0017/{\u00c8\u00d5\u00d6\u000b\u0084Y\u0016G\u00165\u00ea\u00ed^\u00c2\u0083*4] l\"\u0081x\u00bdY\u00f8\u0091\u00ef\u009e\t\u0005\u00de\u000b\u00f4\u00c3}\u00c3\u0001M\u0016\u00dczFg\u0083\u00ef\u000f\u00b5\u0093\u00fc~\u00f6\u0094\u00f8\u00d5#72\u00a9\u00fc\u00c53\bj\u00ab\u0094Y\u00dd,\u00c0\u00c9\r\u0017\u00a2\u00ee:\u0003\u00b4 ^o.\u00fe\u00cd\u008c\u0012\u0011\u0001\u0089\u000f\u0093\u0002\u00c9\u00ee\f\u0081\f\u0085\u00e6\u0001\fC6V\u0017\u0081\u0090\u00c4\u008a\u0097\u00c1?\u00f7 \u00c8>\u00ac\u00a0$\u00c4\u00e7/\u00c2\u00e6\u0089\u0091\u00b7\u00fd\u0016NS\u00ee\u009f\"\u0094pE|\u00e2\u0083+)\u00a2-\u00cd\u0088\u0003\u00d0\u00c5\u008b\u001c\u0016\u00c6\u009e\u0005#\u009f\u0093\u0016\u001aE(\u00a4l\u00cf\u00ab\u00beIZ\u007f\u0004Up\u0006\n3\u00ad\u00ad\u0098U\u00cc6\u00ad\u001bl\r\u00a8\u0098\u00c8;Rd5\u00c4\u00d4\u00dc\u0082=\u0097\u000b\u0086|\u00df\u0010|)\u0081a\u0001\u00ef\u00d2\u0006\u00aep\u00de\u0095X\u009d\b\u0017u\u00c1_\u00c3\u0088H\u00c2\u001b\u00f6\u00a5u\u009b\f\u0090:\u00bcr\u00cb\u00c3\u00cc\u001f(3f\u00d1\u00f29\u0085gx\u0087\u00ea\u00e3U/ \u0097\u00d0\u0006\u0082\u00cf\u00c04\u00d7A\u00cc\u0012,%4t\u00e59\u0082$\u0081\u00c9\u00b6\u00f6\u00a2\u00cf\u00ec\u00ce\u008ay\u007f\u008d\u0015\u0017\u00ad=A?'w)!\u00e2\u0012f\u00f7\u00b5M\u0087\u0085\u00e2.\u00b3\u009a$\u00b4C \\\u0001\u007f\u00b8\u00e0\u0087\u00d1?\u00fd\u00d1\u0085\u008f\u00d7@*k\u00f2S]\u00b5\u00f2\u00ff\r\u008b\u00fb\u00c9H.\u00a9\u00eb\u0097\u0087\r\u00f4\u00b6\u00b9#\u00c8\u0003-\u00b7\u00d7\u00b2\u00e2\u00f0\u009b\u001b\u0098S\u00b8E\u00b5K\r\u00c7\u0094\u00a4\u001f!\u0084\u0095@\u00d1\u00bf\u0004\u00f4[\u00de\u00a3\u00b0\u0091\u0005:\u00f3\u001f\u0005M}\u0081\u00e43\u00e3.\u000e\u008f\u00cd\u0086\u00e0\u0017\u0014{\u00af\u00d5:\u000b\u0019Yyb.k:\u00da\u0002\u00d7\u00a9\u000e{ \u009b\u009c|\u0003B\u00af\u008f\u00c3\u00c5\u00d9\u000e\u0014\r\u00ee\u0004\u0000p?\u00f9\u0002W\u00c7\u008f\u00e0W\u00db\u0014\u0017\u00d3\u00ed\u00e5:\u0097I\u00b8\f\u001b\u00ef\u00bd\u000e\u00f7\t\u0095\u00c4\u00a1\u0090g\u0017\u00b4\u00c3b\u00e0C\u008c\u00a5^s\u00fdT\n\u00ed\u00f0m}\u001a\u0091@\u00edQ\u00f4y\t\u00a8M\u00e55\u00b72?\u008d$\u0016\u00dc*Fm\u0083\u00ae\u000f\u009d\u0093\u00f9~H\u0096\u00ce\u00da@v\u00b2\u000f\u00f3p\u00da\u000b\u00eb\u00c3r\u00e7\u00c9\u00d77\u00b0\u00c3\u001a\u0016\u0016\u0092euYQL\u001e^\u00b1\u008f.W\u0002\u00ccL\u00a5\u0004\u00e2\u00cf\u00e6\tp\u0012\u0019w\u0088\u00c1\u00b3\u00db\u00cd\u00d5\u008c\u00e6\u0016d\u00f5\u009b\u001e]aQ\u001d\u00c1\u00ff7`a'\"\u00a0u\u00c9^\u0006<%\u00ef#\u0096h\u00bbVQ\u008d\u0016<\u0094\u00c8(\u00e9\u00a9\u0017\u0086D$\u0010\u008b\u0092\u00bc\u009dP\u0085>\u0011q\r\u001f\u00c6\u00f1F\u00d1\u0097h\u0015\u00ca\u0006\u00dd\u00ab\u00a4G\u00ad0\u0014:\u00a6HK\u008eB\u00df\f\u00ca\\\u00a9\u00b4\u00c2s0\u00e9c%\u00cac\u0004\u000e\u008d\u0002C\r\u00ee\u00dc\u001ei\u001d\u0095\u00e3z\u0017\u00aa\u00f1]m\u0016\u00a17\u0013\u0013\u009d\u0005\u0087w\u0082\u00a4\\\u00fd\u00d0\u0099]\u000f&\u00b7\u008bL\u0081%\r\u00ab\u00aaR\u00a0\u00b5s\u0082\u00b9\"}H\u00c6R\u0012\u00ec\u00076\u00cfd\u001a7\u00ed\u00d3\u00e1\u00f7\u0089\u0099\u0080\u00e3s\u00cbP\u0012\u00c8&\u00b2\u00eb\u00f4\u009e%}\u0091\u00f3\u00b5\u00c6\u0081\u00cf\u0090\u00d7\u00b0\u0000".length();
                        var9_4 = 20;
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
                            var10_2 = "F(\u00eb\u00a2W?\u00d9\u00c1\u0086\u0016DE'\u00d5\u0093U\u00ce\u00f5#|\u00e0p\u00cdA99\u0082\u0015\u0017\u009b4\u00c3";
                            var12_3 = "F(\u00eb\u00a2W?\u00d9\u00c1\u0086\u0016DE'\u00d5\u0093U\u00ce\u00f5#|\u00e0p\u00cdA99\u0082\u0015\u0017\u009b4\u00c3".length();
                            var9_4 = 9;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 32;
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
                                    v15 = 72;
                                    break;
                                }
                                case 1: {
                                    v15 = 74;
                                    break;
                                }
                                case 2: {
                                    v15 = 111;
                                    break;
                                }
                                case 3: {
                                    v15 = 60;
                                    break;
                                }
                                case 4: {
                                    v15 = 33;
                                    break;
                                }
                                case 5: {
                                    v15 = 91;
                                    break;
                                }
                                default: {
                                    v15 = 16;
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
                zs.b = var13;
                zs.c = new String[55];
                var0_7 = 8738169109445284831L;
                var6_8 = new long[136];
                var3_9 = 0;
                var4_10 = "x\u0004\u00b3\u0087`\u00ae\u00a7'\u00bfv\u00a4ArS\u00fd\u00ae) \u00bc\u0003\u00cc4\u0012\u00fa\u00f3g<\u00adv\u00c4\\\u00e9?h\u00f4$\u00b7\u00e0\u00e1!P^G\u00ce\u0094\u00ca\u00fb\u0096\u00bc7k\u00b1\u009d\u0098\u001e|\u0003\u00cd|}\u00e2\u00e1\u00c1\u009d?@\u00ba\u00cd\u0094\u00aa\u0090\u00bd\u009cr\u00dav\u00d3G\u00c3\u00cb\u001c\u00cb.\u00f7\u00941n\u007f\u0010\u008be|[<\u00c7d\u00e8\u00c1gT1m\u00c1\u0012\u008b\u0084\u00ce\u00b7ORe\u00ea\u0090L\b*\u00d4\u00cc\u00fa\u00f4\u0090[\u00c9\u009e\u008d\u00dexgx\u00f6k\u00ce?\u00c2\u0004\u00b5\u0088b\u00a3\u00dd\u0002y\u00fcB\u00fe\u00ad]y\u00a4i05t\u00d6\u00c8\u00b4&\u00eb\u001fW\u00cf\u00c5N.\u00ea6e\u00c4\u00fc\"\u008a\u0093\u00e4\u00ec^!)E\u000e\u00b5\u0006'\u0093\u00a3^\u00a0\u009b\u001b2TK\u00b5|bk\u00c4)0\u00b4Y\u0092\u00de\u001c\u00b4\u00afp\u00b5\u0010|!\u0089\u007f\u0012I\u00a91,\u00005\u0084\u00b5\u00e4\u00e5\u00e5\u00ddN\u00be]\u0094%\u00c9\u00dc\u008d\u00e7\t\":\u00ec\u001aG\u001d?R\u009a\u00f6*\u00e7\u00b2\u001e$9\u00da\u00853\b\u00a7\u00d1\u00fc\u001e\u00a6\u00d7`\u0012A\u00bd,jeWU2iF\u001d\u00edW\u000b.\u00c7r\u00d6Z\u00adh2\u00bd\u00a2\u00e7\u0000VCv=\u001c\u00ee0(\u007f\u00de<\u00e2\u001ci[\u0090\u00ef\u00d8\u00ebU\u00c6\u00f0?B\u00e1)\u00fd\u0015an,\u00a2\u0098\u00fe=\u00c6d\u008a/\u0080\u00b5\u00fd`\u00c2f\u0083\u0095\u00f1\u00a1\u00a6N\u008a;\u0019F\u009fifP\u00cel\u00d78\u00fc\u00f9\u00c6b\u00a9W\u001f<S\u008d\u00a6\u00f5X\u00eear\u001d\u00bc\u00d3\u001a\u00c2\u00f2\u00e2\u001c}\u0099\n\u00f1@_\u00e0\u009aV\u008e\u00ce\u00d4\u000b-\u0082\u0004m\u00f6$%\u00a4+SKVh\u00a7\u00c3\u00e2\u00d8@-\t\u00c0KlB\u0097\u008a,LlN\u00d2\u0012 \u00f2\u00ce\tg\u00114\u00d6.\u0084\u0002l\u000bf\u00cf\u00c8QD%\u00d7 \u0083\u00da\u0081\u008aF\u0006\ty%\u00e1\u00c5l\u000bM\u00fc\u0010\u008e^\u00b7\u009dA\u00ea\u00b6\u001d3\u00cc\u00d6i9J\u0098\u0007j\u00d6_\u00f6B\u00d6\u001c\u0099S@[\u00cb\u0011\u00d9|v\u000f\u00e7\u00e0NJ`\t8\u0084\u00cb}\u0087\u00cb\u00a0\u0017\u0092\u008c{]\u00c5Q\u00ef9\u00a7~\u0016\u0098\u00dcs\u001b\u009fX\u00b3\u0090\u0090\u00a6\u009e\u0092\u00eb\u009bbd\u0099q\u0083\u00bej \u00ea\u0017\u00bewAadH?\u00f6\u00c8g8\u0083\u0011u5\u001e\u00f9a\u00a8\u00e5\u0091E\u00ee\u0081\u00daZ\u00f7\u0091Z\u00cb!\u00bc\u00f2\u00c2\u00a9f\u00e1\u00c5a\u00ab\u00a3\u00c7M\u001c\u0015\u000ff\u0010S\u0016\u00b8\u00d7\u00d8F[2G\u0084\u000b\u0092\"\u00f8\u0097W\u00f6x+\b\u00bc\u009c\u00e5\u00e3\u0002{\u00bdr1\u00f6!y\u00d4\u0085\u00d6\u00dd*!^\u00a5r\u0097\u00b2\u00f8\u00e1\u0091\u00b4\u00dd]\u000b\u00e4\u00e0\u00ae\u0002\u00fb\u00bb\u00b3\u00b1{\u008f?\u00c4\u00fc%\u00df\u00b0\u00a1\u00bc\u00c1\u001e~\u00b3\u00f2h\u00af\u0086\u00ea]\u0081\u0007\u0083 vQX\u00bf\u00c7\u0094J\u0096}\b*U}\u0001\u00d2}\u00120 \u00e9e\u00dfr\u00ae\u00d8\u000e-\u00f7\u00a4\u00e9\u001aq\u00e5\b\u00ab\n\u00ae-\u00e1Y\rI9\u00b1\u00ff\u00d8\u0095\u008b\u00a9a\u00a8\u001e\u00d7\u0001\u00e0\u00fc\u00be\fy\u0003\u00f1\u00a5\u00fa1\u00d9P<\u001ac@\u00ad\u0004\u00852\u00fc\u0004\u0094\u0003\u0016|\u0082\u0099F:\u0090\u001b\u00b5#\u0017\u00e6\u00df\u00bd\u001b\u00c7\u001e\u0007{4\u00bdG\u0080\u00a2g\u0091\u0087\n\u00b3~\u001fR\u00bf\u00e3\u00be\u00d4\\t\u00db\u0005<\u00d4\u001d.$\u000f,L\u00f1]\u00c2\u00ec\u00e0;\u00e3\u009c\u0013B.\u0090\n\u0018\u0089\u00de\u0094\b\u00db\u00c7\u00e47y(W\u00ee\u00d5}<\u00d3K\u0086\u00ddJ\u0087\u00ee\u008d\u009d\u00bc\u00a9\u00aa\u009ckrSD\u00b1\u00edC]$q\u0083F_[3uY0`\u00892\u00a0\u00e82\u00a7\u00c1\u0011\u007f\u00be8hv\u00c0\u0084\u000b^8v\u00c8\u00ce\u00ffKo\u00e0\u00fbI\u009f\u00b5\u00a7\b\u0091^\u00cd[\u00da\u00cf\u00f0\u000f\u00f8\u0099\u00b1\u00a9R\u0080\u00e4\u00041\u0099\u0010m\u0015\u0007jsnsx\u00fc?\u00a4\u00e1\u00bd\u00ec\u0090\u00a3`Iu\u00d9>$\u0019\u0011\u00de1\u009aL\u00b4{\u009b3\u00b1\u00c7\u0094\u0012H\u00ec\u000f\u00f4{qb<\u00a5#A\u00af?\u0011\u00bb\u00f9x\u0091\u0096\u0013\u00b7\u00b3\u0005\u008e\u00af\u00cd\u009f\u00ca$\u00f7\u00faj\u00a9Y\u00e0\u007f2\u009c\u00d1\u00de\u0001h\u00a8\u00b5\u00c1\u00f2$ku\u00f6\u0098\u0006\u00e8\u00eft\u0090\u00d3\u0012\u00ab\u00a2\u00f1\u0006\u0012\u00b9h\u00fb\u00e8\u00f4\f\u00fdO\u00b6\u008e\u0088}{\u00aar\u009d\u00f6\u00f8\u007fj\u00d7x\u00dd\u000ee\u008f\u0090\u00d4\u00a9j\u00f4\u001aWS\u00d1ih\f\u00da\u00e0Y\u00e3\u0087\u00d6&!?\u00e3\u00df']x\u00bf\u00ba9\u0013\u00c8\u00af\u00ae\u00de!zz9gW";
                var5_11 = "x\u0004\u00b3\u0087`\u00ae\u00a7'\u00bfv\u00a4ArS\u00fd\u00ae) \u00bc\u0003\u00cc4\u0012\u00fa\u00f3g<\u00adv\u00c4\\\u00e9?h\u00f4$\u00b7\u00e0\u00e1!P^G\u00ce\u0094\u00ca\u00fb\u0096\u00bc7k\u00b1\u009d\u0098\u001e|\u0003\u00cd|}\u00e2\u00e1\u00c1\u009d?@\u00ba\u00cd\u0094\u00aa\u0090\u00bd\u009cr\u00dav\u00d3G\u00c3\u00cb\u001c\u00cb.\u00f7\u00941n\u007f\u0010\u008be|[<\u00c7d\u00e8\u00c1gT1m\u00c1\u0012\u008b\u0084\u00ce\u00b7ORe\u00ea\u0090L\b*\u00d4\u00cc\u00fa\u00f4\u0090[\u00c9\u009e\u008d\u00dexgx\u00f6k\u00ce?\u00c2\u0004\u00b5\u0088b\u00a3\u00dd\u0002y\u00fcB\u00fe\u00ad]y\u00a4i05t\u00d6\u00c8\u00b4&\u00eb\u001fW\u00cf\u00c5N.\u00ea6e\u00c4\u00fc\"\u008a\u0093\u00e4\u00ec^!)E\u000e\u00b5\u0006'\u0093\u00a3^\u00a0\u009b\u001b2TK\u00b5|bk\u00c4)0\u00b4Y\u0092\u00de\u001c\u00b4\u00afp\u00b5\u0010|!\u0089\u007f\u0012I\u00a91,\u00005\u0084\u00b5\u00e4\u00e5\u00e5\u00ddN\u00be]\u0094%\u00c9\u00dc\u008d\u00e7\t\":\u00ec\u001aG\u001d?R\u009a\u00f6*\u00e7\u00b2\u001e$9\u00da\u00853\b\u00a7\u00d1\u00fc\u001e\u00a6\u00d7`\u0012A\u00bd,jeWU2iF\u001d\u00edW\u000b.\u00c7r\u00d6Z\u00adh2\u00bd\u00a2\u00e7\u0000VCv=\u001c\u00ee0(\u007f\u00de<\u00e2\u001ci[\u0090\u00ef\u00d8\u00ebU\u00c6\u00f0?B\u00e1)\u00fd\u0015an,\u00a2\u0098\u00fe=\u00c6d\u008a/\u0080\u00b5\u00fd`\u00c2f\u0083\u0095\u00f1\u00a1\u00a6N\u008a;\u0019F\u009fifP\u00cel\u00d78\u00fc\u00f9\u00c6b\u00a9W\u001f<S\u008d\u00a6\u00f5X\u00eear\u001d\u00bc\u00d3\u001a\u00c2\u00f2\u00e2\u001c}\u0099\n\u00f1@_\u00e0\u009aV\u008e\u00ce\u00d4\u000b-\u0082\u0004m\u00f6$%\u00a4+SKVh\u00a7\u00c3\u00e2\u00d8@-\t\u00c0KlB\u0097\u008a,LlN\u00d2\u0012 \u00f2\u00ce\tg\u00114\u00d6.\u0084\u0002l\u000bf\u00cf\u00c8QD%\u00d7 \u0083\u00da\u0081\u008aF\u0006\ty%\u00e1\u00c5l\u000bM\u00fc\u0010\u008e^\u00b7\u009dA\u00ea\u00b6\u001d3\u00cc\u00d6i9J\u0098\u0007j\u00d6_\u00f6B\u00d6\u001c\u0099S@[\u00cb\u0011\u00d9|v\u000f\u00e7\u00e0NJ`\t8\u0084\u00cb}\u0087\u00cb\u00a0\u0017\u0092\u008c{]\u00c5Q\u00ef9\u00a7~\u0016\u0098\u00dcs\u001b\u009fX\u00b3\u0090\u0090\u00a6\u009e\u0092\u00eb\u009bbd\u0099q\u0083\u00bej \u00ea\u0017\u00bewAadH?\u00f6\u00c8g8\u0083\u0011u5\u001e\u00f9a\u00a8\u00e5\u0091E\u00ee\u0081\u00daZ\u00f7\u0091Z\u00cb!\u00bc\u00f2\u00c2\u00a9f\u00e1\u00c5a\u00ab\u00a3\u00c7M\u001c\u0015\u000ff\u0010S\u0016\u00b8\u00d7\u00d8F[2G\u0084\u000b\u0092\"\u00f8\u0097W\u00f6x+\b\u00bc\u009c\u00e5\u00e3\u0002{\u00bdr1\u00f6!y\u00d4\u0085\u00d6\u00dd*!^\u00a5r\u0097\u00b2\u00f8\u00e1\u0091\u00b4\u00dd]\u000b\u00e4\u00e0\u00ae\u0002\u00fb\u00bb\u00b3\u00b1{\u008f?\u00c4\u00fc%\u00df\u00b0\u00a1\u00bc\u00c1\u001e~\u00b3\u00f2h\u00af\u0086\u00ea]\u0081\u0007\u0083 vQX\u00bf\u00c7\u0094J\u0096}\b*U}\u0001\u00d2}\u00120 \u00e9e\u00dfr\u00ae\u00d8\u000e-\u00f7\u00a4\u00e9\u001aq\u00e5\b\u00ab\n\u00ae-\u00e1Y\rI9\u00b1\u00ff\u00d8\u0095\u008b\u00a9a\u00a8\u001e\u00d7\u0001\u00e0\u00fc\u00be\fy\u0003\u00f1\u00a5\u00fa1\u00d9P<\u001ac@\u00ad\u0004\u00852\u00fc\u0004\u0094\u0003\u0016|\u0082\u0099F:\u0090\u001b\u00b5#\u0017\u00e6\u00df\u00bd\u001b\u00c7\u001e\u0007{4\u00bdG\u0080\u00a2g\u0091\u0087\n\u00b3~\u001fR\u00bf\u00e3\u00be\u00d4\\t\u00db\u0005<\u00d4\u001d.$\u000f,L\u00f1]\u00c2\u00ec\u00e0;\u00e3\u009c\u0013B.\u0090\n\u0018\u0089\u00de\u0094\b\u00db\u00c7\u00e47y(W\u00ee\u00d5}<\u00d3K\u0086\u00ddJ\u0087\u00ee\u008d\u009d\u00bc\u00a9\u00aa\u009ckrSD\u00b1\u00edC]$q\u0083F_[3uY0`\u00892\u00a0\u00e82\u00a7\u00c1\u0011\u007f\u00be8hv\u00c0\u0084\u000b^8v\u00c8\u00ce\u00ffKo\u00e0\u00fbI\u009f\u00b5\u00a7\b\u0091^\u00cd[\u00da\u00cf\u00f0\u000f\u00f8\u0099\u00b1\u00a9R\u0080\u00e4\u00041\u0099\u0010m\u0015\u0007jsnsx\u00fc?\u00a4\u00e1\u00bd\u00ec\u0090\u00a3`Iu\u00d9>$\u0019\u0011\u00de1\u009aL\u00b4{\u009b3\u00b1\u00c7\u0094\u0012H\u00ec\u000f\u00f4{qb<\u00a5#A\u00af?\u0011\u00bb\u00f9x\u0091\u0096\u0013\u00b7\u00b3\u0005\u008e\u00af\u00cd\u009f\u00ca$\u00f7\u00faj\u00a9Y\u00e0\u007f2\u009c\u00d1\u00de\u0001h\u00a8\u00b5\u00c1\u00f2$ku\u00f6\u0098\u0006\u00e8\u00eft\u0090\u00d3\u0012\u00ab\u00a2\u00f1\u0006\u0012\u00b9h\u00fb\u00e8\u00f4\f\u00fdO\u00b6\u008e\u0088}{\u00aar\u009d\u00f6\u00f8\u007fj\u00d7x\u00dd\u000ee\u008f\u0090\u00d4\u00a9j\u00f4\u001aWS\u00d1ih\f\u00da\u00e0Y\u00e3\u0087\u00d6&!?\u00e3\u00df']x\u00bf\u00ba9\u0013\u00c8\u00af\u00ae\u00de!zz9gW".length();
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
                    var4_10 = "\u0006{!\u00b3\u008f\u0083\u00a45*G\u000b\u0083\u00af\u00e4B\u00f4";
                    var5_11 = "\u0006{!\u00b3\u008f\u0083\u00a45*G\u000b\u0083\u00af\u00e4B\u00f4".length();
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
        zs.e = var6_8;
        zs.g = new Integer[136];
        zs.CONTAINER = new zs((Object)zs.a(1052, 11679), 0, (Object)hi.a("G", zs.a(1071, 5172), (long)816778421191718118L), (Object)hi.a("G", zs.a(1070, -6201), (long)816778421191718118L), (Object)zs.x("il0ddVXJDgcST5Yg", D(java.lang.Object ), (Object)zs.a(1044, 6470)), (Object)zs.x("il0ddVXJDgcST5Yg", D(java.lang.Object ), (Object)zs.a(1072, 3308)), (Object)hi.a("G", zs.a(1065, 26113), (long)816778421191718118L), (Object)zs.x("il0ddVXJDgcST5Yg", D(java.lang.Object ), (Object)zs.a(1082, -13297)), (Object)hi.a("G", zs.a(1032, -25173), (long)816778421191718118L), (Object)hi.a("G", zs.a(1025, 29108), (long)816778421191718118L));
        zs.NORMAL = new zs((Object)zs.a(1079, -30533), 1, (Object)zs.x("il0ddVXJDgcST5Yg", D(java.lang.Object ), (Object)zs.a(1053, -8778)), (Object)hi.a("G", zs.a(1035, 8388), (long)816778421191718118L), (Object)hi.a("G", zs.a(1077, 377), (long)816778421191718118L), (Object)hi.a("G", zs.a(1066, -13420), (long)816778421191718118L), (Object)hi.a("G", zs.a(1081, -3180), (long)816778421191718118L), (Object)hi.a("G", zs.a(1049, 26384), (long)816778421191718118L), (Object)hi.a("G", zs.a(1042, 9264), (long)816778421191718118L), (Object)hi.a("G", zs.a(1039, 23181), (long)816778421191718118L));
        zs.POISONED = new zs((Object)zs.a(1034, 9730), 2, (Object)hi.a("G", zs.a(1037, -19038), (long)816778421191718118L), (Object)hi.a("G", zs.a(1047, -11770), (long)816778421191718118L), (Object)hi.a("G", zs.a(1041, 29280), (long)816778421191718118L), (Object)hi.a("G", zs.a(1045, -8330), (long)816778421191718118L), (Object)hi.a("G", zs.a(1046, 17976), (long)816778421191718118L), (Object)hi.a("G", zs.a(1083, -30637), (long)816778421191718118L), (Object)hi.a("G", zs.a(1085, -28810), (long)816778421191718118L), (Object)hi.a("G", zs.a(1054, 9157), (long)816778421191718118L));
        zs.WITHERED = new zs((Object)zs.a(1024, 2965), 3, (Object)hi.a("G", zs.a(1029, -12805), (long)816778421191718118L), (Object)zs.x("il0ddVXJDgcST5Yg", D(java.lang.Object ), (Object)zs.a(1075, -17905)), (Object)hi.a("G", zs.a(1064, -15657), (long)816778421191718118L), (Object)hi.a("G", zs.a(1067, -32004), (long)816778421191718118L), (Object)hi.a("G", zs.a(1068, -1264), (long)816778421191718118L), (Object)hi.a("G", zs.a(1055, 24955), (long)816778421191718118L), (Object)hi.a("G", zs.a(1038, -26730), (long)816778421191718118L), (Object)hi.a("G", zs.a(1048, 20720), (long)816778421191718118L));
        zs.ABSORBING = new zs((Object)zs.a(1084, 19889), 4, (Object)hi.a("G", zs.a(1080, -24840), (long)816778421191718118L), (Object)hi.a("G", zs.a(1078, 8289), (long)816778421191718118L), (Object)hi.a("G", zs.a(1040, -3291), (long)816778421191718118L), (Object)hi.a("G", zs.a(1031, -22246), (long)816778421191718118L), (Object)hi.a("G", zs.a(1087, -19619), (long)816778421191718118L), (Object)hi.a("G", zs.a(1028, -30500), (long)816778421191718118L), (Object)hi.a("G", zs.a(1033, -274), (long)816778421191718118L), (Object)hi.a("G", zs.a(1030, -5978), (long)816778421191718118L));
        zs.FROZEN = new zs((Object)zs.a(1027, -23830), 5, (Object)hi.a("G", zs.a(1074, 19229), (long)816778421191718118L), (Object)zs.x("il0ddVXJDgcST5Yg", D(java.lang.Object ), (Object)zs.a(1086, 30404)), (Object)hi.a("G", zs.a(1026, 2148), (long)816778421191718118L), (Object)hi.a("G", zs.a(1050, 23679), (long)816778421191718118L), (Object)hi.a("G", zs.a(1076, 26348), (long)816778421191718118L), (Object)zs.x("il0ddVXJDgcST5Yg", D(java.lang.Object ), (Object)zs.a(1043, -29975)), (Object)hi.a("G", zs.a(1051, 6275), (long)816778421191718118L), (Object)hi.a("G", zs.a(1073, 18785), (long)816778421191718118L));
        zs.d = hi.a("G", (Object)new Object[0], (long)1067753834135467845L);
    }

    private zs(Identifier identifier, Identifier identifier2, Identifier identifier3, Identifier identifier4, Identifier identifier5, Identifier identifier6, Identifier identifier7, Identifier identifier8) {
        this.l = identifier;
        this.f = identifier2;
        this.A = identifier3;
        this.B = identifier4;
        this.P = identifier5;
        this.V = identifier6;
        this.a = identifier7;
        this.R = identifier8;
    }

    public static /* bridge */ /* synthetic */ CallSite x(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Could not resolve type clashes
     */
    private static zs x(Player var0) {
        block26: {
            block24: {
                block25: {
                    block23: {
                        block21: {
                            block22: {
                                block20: {
                                    block18: {
                                        block19: {
                                            var1_1 = Dl.S();
                                            var2_2 /* !! */  = zs.a(25536, 2442066555403078105L) * zs.a(9113, 407970631914637747L) + zs.a(11071, 6666272602696597847L) - zs.a(28248, 4657327098999145558L) + zs.a(14600, 7189832001332826985L);
                                            if (!var1_1) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    v0 = hi.a("\u00a5", (Object)var0, (Object)hi.a("j", (long)751287444500867280L), (long)1236141459864807135L);
                                                    if (!var1_1) break block18;
                                                    if (v0 == false) break block19;
                                                    break block20;
                                                    break;
                                                }
lbl9:
                                                // 1 sources

                                                return hi.a("j", (long)806383019207199696L);
lbl11:
                                                // 1 sources

                                                while (true) {
                                                    v1 /* !! */  = zs.x("il0ddVXJDgcST5Yg", hasEffect(net.minecraft.core.Holder ), (Player)var0, (Holder)hi.a("j", (long)419267150034404836L));
                                                    if (!var1_1) break block21;
                                                    if (v1 /* !! */  == false) break block22;
                                                    break block23;
                                                    break;
                                                }
lbl16:
                                                // 1 sources

                                                return hi.a("j", (long)713360461772333423L);
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    v2 /* !! */  = hi.a("\u00a5", (Object)var0, (long)410847396130056445L);
                                                    if (!var1_1) break block24;
                                                    if (v2 /* !! */  == false) break block25;
                                                    break block26;
                                                    break;
                                                }
lbl23:
                                                // 1 sources

                                                return hi.a("j", (long)426430203158303208L);
lbl25:
                                                // 1 sources

                                                return hi.a("j", (long)987544231771614749L);
                                            }
lbl27:
                                            // 8 sources

                                            while (true) {
                                                switch (var2_2 /* !! */ ) {
                                                    default: {
                                                        ** continue;
                                                    }
                                                    case -528730074: {
                                                        ** continue;
                                                    }
                                                    case -528730073: {
                                                        ** continue;
                                                    }
                                                    case -528730078: {
                                                        ** continue;
                                                    }
                                                    case -528730075: {
                                                        ** continue;
                                                    }
                                                    case -528730080: {
                                                        ** continue;
                                                    }
                                                    case -528730076: {
                                                        ** continue;
                                                    }
                                                    case -528730077: 
                                                }
                                                hi.a("G", (long)438677556143749811L);
                                                hi.a("G", (long)1026165039297148217L);
                                                return null;
                                            }
                                        }
                                        v0 = hi.a("G", (int)hi.a("G", (int)(zs.a(5756, 4864824903904885980L) - zs.a(13770, 654636497684979674L)), (int)zs.a(10446, 6224443745587151565L), (long)834203424483934088L), (int)zs.a(14092, 5420750277646408977L), (long)834203424483934088L) * zs.a(22511, 6616961527284317642L) - zs.a(25356, 6260299592904116491L);
                                    }
                                    var2_2 /* !! */  = (int)v0;
                                    if (var1_1) ** GOTO lbl27
                                }
                                var2_2 /* !! */  = zs.a(10550, 2747780528547677010L) / 5 + zs.a(22103, 6374479198282202144L);
                                if (var1_1) ** GOTO lbl27
                            }
                            v1 /* !! */  = (CallSite)(zs.a(18404, 6656317620566699459L) - zs.a(24859, 7417968414817618760L) - zs.a(5213, 5480924137893494315L) ^ zs.a(12426, 3562345602881706687L));
                        }
                        var2_2 /* !! */  = (int)v1 /* !! */ ;
                        if (var1_1) ** GOTO lbl27
                    }
                    var2_2 /* !! */  = (int)(zs.x("il0ddVXJDgcST5Yg", max(int int ), (int)zs.a(9289, 6830249644417535552L), (int)zs.a(7890, 5802910794692293840L)) + zs.a(11849, 7445408361395766387L));
                    if (var1_1) ** GOTO lbl27
                }
                v2 /* !! */  = (CallSite)(((zs.a(11071, 3320962375359742245L) ^ zs.a(3908, 5663846526861927785L)) - zs.a(26655, 5191391273042412109L) ^ zs.a(25594, 6438292825202231774L)) + zs.a(1478, 713127903574388725L) + zs.a(18790, 7258753011519070998L));
            }
            var2_2 /* !! */  = (int)v2 /* !! */ ;
            if (var1_1) ** GOTO lbl27
        }
        var2_2 /* !! */  = (zs.a(20716, 7349864630336535117L) ^ zs.a(8626, 1101470495416929231L)) * zs.a(1064, 5757624922536898109L) * zs.a(12230, 272529124308338159L) ^ zs.a(28349, 1735885202679661778L);
        ** while (true)
    }

    public static zs[] values() {
        return (zs[])zs.x("il0ddVXJDgcST5Yg", clone(), (zs[])hi.a("j", (long)785223382321613351L));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Identifier Y(boolean var1_1, boolean var2_2, boolean var3_3) {
        block29: {
            var4_4 = Dl.S();
            var5_5 /* !! */  = hi.a("G", (int)(zs.a(12498, 2091385921814387416L) / zs.a(4901, 3568322888622504319L) / zs.a(7179, 1230253544744154675L) + zs.a(26738, 8011203120671392290L)), (int)zs.a(12077, 47563373540296072L), (long)834203424483934088L) - zs.a(30133, 3872408146814017303L);
            if (var4_4) ** GOTO lbl15
            block23: while (true) {
                block32: {
                    block31: {
                        block30: {
                            v0 = var1_1;
                            if (!var4_4) break block30;
                            if (v0 == 0) break block31;
                            v0 = zs.a(9582, 64810395252772706L) + zs.a(9703, 2179916412156628898L) - zs.a(28860, 6664902013881424543L);
                        }
                        var5_5 /* !! */  = (reference)v0;
                        if (var4_4) break block32;
                    }
                    var5_5 /* !! */  = (reference)(zs.a(24012, 9132729311322847187L) - zs.a(19327, 4792205996844392777L) + zs.a(4873, 811348525392755037L) + zs.a(1722, 3629378554115615925L) ^ zs.a(30999, 4550172982760018688L) ^ zs.a(26231, 4296196126400810083L));
                    if (!var4_4) ** GOTO lbl93
                }
                while (true) {
                    block52: {
                        block50: {
                            block51: {
                                block49: {
                                    block48: {
                                        block46: {
                                            block47: {
                                                block45: {
                                                    block43: {
                                                        block44: {
                                                            block42: {
                                                                block41: {
                                                                    block39: {
                                                                        block40: {
                                                                            block38: {
                                                                                block37: {
                                                                                    block35: {
                                                                                        block36: {
                                                                                            block34: {
                                                                                                block33: {
                                                                                                    switch (var5_5 /* !! */ ) {
                                                                                                        default: {
                                                                                                            continue block23;
                                                                                                        }
                                                                                                        case -1266411835: {
                                                                                                            v1 = var2_2;
                                                                                                            if (!var4_4) break block33;
                                                                                                            if (v1 == 0) break;
                                                                                                            break block34;
                                                                                                        }
                                                                                                        case -1266411832: {
                                                                                                            v2 = var3_3;
                                                                                                            if (!var4_4) break block35;
                                                                                                            if (v2 == 0) break block36;
                                                                                                            break block37;
                                                                                                        }
                                                                                                        case -1266411838: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)873999697563618827L);
                                                                                                            var5_5 /* !! */  = (reference)((zs.a(13020, 1887568610095454458L) * zs.a(26447, 7912385094065294665L) - zs.a(29768, 7556991632380829419L)) / zs.a(14550, 5454164656844198582L) + zs.a(30176, 926931732681007083L));
                                                                                                            if (var4_4) break block29;
                                                                                                            break block38;
                                                                                                        }
                                                                                                        case -1266411830: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)450577983495027350L);
                                                                                                            if (!var4_4) {
                                                                                                                return v3;
                                                                                                            }
                                                                                                            break block38;
                                                                                                        }
                                                                                                        case -1266411834: {
                                                                                                            v4 /* !! */  = var3_3;
                                                                                                            if (!var4_4) break block39;
                                                                                                            if (v4 /* !! */  == 0) break block40;
                                                                                                            break block41;
                                                                                                        }
                                                                                                        case -1266411842: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)1215562786437345322L);
                                                                                                            var5_5 /* !! */  = (zs.x("il0ddVXJDgcST5Yg", max(int int ), (int)zs.a(6443, 5576288743407579962L), (int)zs.a(31240, 2664902129710829641L)) + zs.a(8221, 7474860332970723854L) + zs.a(27699, 4077292411590182473L)) * zs.a(4322, 85300421660670675L) + zs.a(5218, 4358014078157880847L);
                                                                                                            if (var4_4) break block29;
                                                                                                            break block42;
                                                                                                        }
                                                                                                        case -1266411843: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)573156975100739998L);
                                                                                                            if (!var4_4) {
                                                                                                                return v3;
                                                                                                            }
                                                                                                            break block42;
                                                                                                        }
                                                                                                        case -1266411840: {
                                                                                                            v5 = var2_2;
                                                                                                            if (!var4_4) break block43;
                                                                                                            if (v5 == 0) break block44;
                                                                                                            break block45;
                                                                                                        }
                                                                                                        case -1266411831: {
                                                                                                            v6 = var3_3;
                                                                                                            if (!var4_4) break block46;
                                                                                                            if (v6 == 0) break block47;
                                                                                                            break block48;
                                                                                                        }
                                                                                                        case -1266411836: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)1245724772136957879L);
                                                                                                            var5_5 /* !! */  = (reference)(zs.a(16059, 2083911408908784775L) ^ zs.a(3583, 7578115196084217809L) ^ zs.a(28537, 7460880849107289457L));
                                                                                                            if (var4_4) break block29;
                                                                                                            break block49;
                                                                                                        }
                                                                                                        case -1266411844: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)953875135702728429L);
                                                                                                            if (!var4_4) {
                                                                                                                return v3;
                                                                                                            }
                                                                                                            break block49;
                                                                                                        }
                                                                                                        case -1266411841: {
                                                                                                            v7 = var3_3;
                                                                                                            if (!var4_4) break block50;
                                                                                                            if (v7 == 0) break block51;
                                                                                                            break block52;
                                                                                                        }
                                                                                                        case -1266411829: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)1186086459127110524L);
                                                                                                            var5_5 /* !! */  = (reference)(zs.x("il0ddVXJDgcST5Yg", max(int int ), (int)((zs.a(24800, 492541419483859702L) + zs.a(18281, 9058743524613401929L)) / zs.a(16042, 2065916283687916715L)), (int)zs.a(29264, 2355440884997036073L)) ^ zs.a(7301, 4332473889049835186L) ^ zs.a(26686, 6367293772477530744L));
                                                                                                            if (!var4_4) {
                                                                                                                break block23;
                                                                                                            }
                                                                                                            break block29;
                                                                                                        }
                                                                                                        case -1266411839: {
                                                                                                            v3 = hi.a("\u00e9", (Object)this, (long)434941581899290338L);
                                                                                                            if (var4_4) break block23;
                                                                                                            return v3;
                                                                                                        }
                                                                                                        case -1266411837: {
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
lbl93:
                                                                                                    // 2 sources

                                                                                                    v1 = zs.a(18388, 3973851481059962260L) / zs.a(18241, 3202791105752247555L) / zs.a(6205, 1176043311331537516L) + zs.a(19212, 6384551980751298937L) + zs.a(8909, 8204375585027606713L);
                                                                                                }
                                                                                                var5_5 /* !! */  = (reference)v1;
                                                                                                if (var4_4) continue;
                                                                                            }
                                                                                            var5_5 /* !! */  = (hi.a("G", (int)zs.a(28650, 6515943993016518037L), (int)zs.a(5134, 6701404049178820183L), (long)834203424483934088L) + zs.a(26482, 5988219273444035933L) + zs.a(14880, 7259780409900060783L)) * zs.a(18309, 556586997232643538L) - zs.a(21494, 5810228218428209564L);
                                                                                            if (var4_4) continue;
                                                                                        }
                                                                                        v2 = zs.a(25467, 6698059834657048885L) * zs.a(23062, 458623405151105085L) + zs.a(8227, 4934487547720616543L) - zs.a(26005, 8051891265496747946L);
                                                                                    }
                                                                                    var5_5 /* !! */  = (reference)v2;
                                                                                    if (var4_4) continue;
                                                                                }
                                                                                var5_5 /* !! */  = (reference)(zs.x("il0ddVXJDgcST5Yg", max(int int ), (int)zs.a(13872, 5810091523971111997L), (int)zs.a(23914, 1365137789055973208L)) ^ zs.a(7389, 219166268629612262L) ^ zs.a(23327, 1739847355718545772L) ^ zs.a(26935, 2473955018025632601L));
                                                                                continue;
                                                                            }
                                                                            var5_5 /* !! */  = (reference)((zs.a(29064, 8041881411349060591L) * zs.a(19676, 4771398427285235396L) - zs.a(22056, 600450216379431936L)) / zs.a(14550, 5454164656844198582L) + zs.a(14284, 787160857259433323L));
                                                                            break block29;
                                                                        }
                                                                        v4 /* !! */  = (int)(hi.a("G", (int)(zs.a(28273, 86190905169609737L) - zs.a(27239, 2937194770809323637L)), (int)zs.a(22108, 5961601558636051704L), (long)834203424483934088L) * zs.a(25922, 2880487138478821209L) - zs.a(22968, 1694854063833756653L) - zs.a(8415, 1101872385994279609L));
                                                                    }
                                                                    var5_5 /* !! */  = (reference)v4 /* !! */ ;
                                                                    if (var4_4) continue;
                                                                }
                                                                var5_5 /* !! */  = (reference)(zs.a(28677, 6000782491796314714L) + zs.a(20211, 6005561144537490576L) - zs.a(22166, 6910047075991141512L) + zs.a(792, 1592103560438311284L));
                                                                continue;
                                                            }
                                                            var5_5 /* !! */  = (hi.a("G", (int)zs.a(21228, 1478883344389060741L), (int)zs.a(10768, 4495034705553113211L), (long)834203424483934088L) + zs.a(3293, 6506895779709281946L) + zs.a(25249, 4677211499574561001L)) * zs.a(6608, 318877199954211726L) + zs.a(19930, 4342761307107469186L);
                                                            break block29;
                                                        }
                                                        v5 = zs.a(5285, 673992842592616166L) - zs.a(8293, 6321498006110718537L) - zs.a(26959, 4082599293493445378L) - zs.a(28747, 1419791710512716366L);
                                                    }
                                                    var5_5 /* !! */  = (reference)v5;
                                                    if (var4_4) continue;
                                                }
                                                var5_5 /* !! */  = hi.a("G", (int)(hi.a("G", (int)zs.a(22165, 8698879828089912491L), (int)zs.a(17255, 5479546269060049173L), (long)834203424483934088L) ^ zs.a(13561, 3683230305659117305L)), (int)zs.a(1472, 2040971926771363810L), (long)834203424483934088L) - zs.a(267, 8286330597467712349L);
                                                if (var4_4) continue;
                                            }
                                            v6 = zs.a(23473, 7920528343072780751L) / zs.a(27400, 5209450091314872617L) + zs.a(16576, 8913077277385173644L);
                                        }
                                        var5_5 /* !! */  = (reference)v6;
                                        if (var4_4) continue;
                                    }
                                    var5_5 /* !! */  = hi.a("G", (int)zs.a(15102, 806093894985306274L), (int)zs.a(23975, 9000229097377183651L), (long)834203424483934088L) + zs.a(15579, 804978373855991441L);
                                    continue;
                                }
                                var5_5 /* !! */  = (reference)(zs.a(16852, 8343101034659163057L) ^ zs.a(18380, 9049139324581064125L) ^ zs.a(9913, 7501376153236819163L));
                                break block29;
                            }
                            v7 = zs.a(26309, 3778003363376401548L) + zs.a(21140, 3653416437590341840L) + zs.a(29610, 7263513048586885523L);
                        }
                        var5_5 /* !! */  = (reference)v7;
                        if (var4_4) continue;
                    }
                    var5_5 /* !! */  = (reference)(zs.a(960, 7480693949226641904L) - zs.a(18503, 4044603589787951644L) ^ zs.a(11927, 6741876808944108714L));
                }
                break;
            }
            var5_5 /* !! */  = (reference)(hi.a("G", (int)((zs.a(27078, 2044067739923317693L) + zs.a(28825, 7188159741748288210L)) / zs.a(16042, 2065916283687916715L)), (int)zs.a(31478, 656719085125308587L), (long)834203424483934088L) ^ zs.a(13047, 6149577819519867075L) ^ zs.a(25164, 8144423856331360336L));
        }
        switch (var5_5 /* !! */ ) {
            default: {
                return v3;
            }
            case 599138188: {
                return v3;
            }
            case 599138189: {
                return v3;
            }
            case 599138190: {
                return v3;
            }
            case 599138187: 
        }
        hi.a("G", (long)804704677991023612L);
        hi.a("G", (long)1018118041190145658L);
        return null;
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x41A) & 0xFFFF;
        if (c[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 69;
                case 1 -> 186;
                case 2 -> 148;
                case 3 -> 95;
                case 4 -> 42;
                case 5 -> 179;
                case 6 -> 13;
                case 7 -> 196;
                case 8 -> 198;
                case 9 -> 244;
                case 10 -> 203;
                case 11 -> 26;
                case 12 -> 63;
                case 13 -> 22;
                case 14 -> 182;
                case 15 -> 77;
                case 16 -> 253;
                case 17 -> 177;
                case 18 -> 222;
                case 19 -> 193;
                case 20 -> 176;
                case 21 -> 171;
                case 22 -> 201;
                case 23 -> 241;
                case 24 -> 192;
                case 25 -> 100;
                case 26 -> 242;
                case 27 -> 56;
                case 28 -> 156;
                case 29 -> 70;
                case 30 -> 246;
                case 31 -> 123;
                case 32 -> 169;
                case 33 -> 220;
                case 34 -> 190;
                case 35 -> 36;
                case 36 -> 223;
                case 37 -> 110;
                case 38 -> 78;
                case 39 -> 225;
                case 40 -> 254;
                case 41 -> 146;
                case 42 -> 248;
                case 43 -> 29;
                case 44 -> 181;
                case 45 -> 72;
                case 46 -> 231;
                case 47 -> 131;
                case 48 -> 135;
                case 49 -> 16;
                case 50 -> 20;
                case 51 -> 207;
                case 52 -> 189;
                case 53 -> 124;
                case 54 -> 143;
                case 55 -> 130;
                case 56 -> 166;
                case 57 -> 236;
                case 58 -> 2;
                case 59 -> 104;
                case 60 -> 204;
                case 61 -> 133;
                case 62 -> 153;
                case 63 -> 172;
                case 64 -> 35;
                case 65 -> 6;
                case 66 -> 58;
                case 67 -> 114;
                case 68 -> 93;
                case 69 -> 57;
                case 70 -> 89;
                case 71 -> 157;
                case 72 -> 115;
                case 73 -> 197;
                case 74 -> 213;
                case 75 -> 86;
                case 76 -> 64;
                case 77 -> 154;
                case 78 -> 79;
                case 79 -> 32;
                case 80 -> 71;
                case 81 -> 54;
                case 82 -> 144;
                case 83 -> 4;
                case 84 -> 116;
                case 85 -> 51;
                case 86 -> 250;
                case 87 -> 240;
                case 88 -> 167;
                case 89 -> 159;
                case 90 -> 25;
                case 91 -> 185;
                case 92 -> 173;
                case 93 -> 249;
                case 94 -> 82;
                case 95 -> 208;
                case 96 -> 75;
                case 97 -> 180;
                case 98 -> 230;
                case 99 -> 212;
                case 100 -> 9;
                case 101 -> 1;
                case 102 -> 200;
                case 103 -> 112;
                case 104 -> 238;
                case 105 -> 96;
                case 106 -> 84;
                case 107 -> 37;
                case 108 -> 210;
                case 109 -> 60;
                case 110 -> 66;
                case 111 -> 83;
                case 112 -> 134;
                case 113 -> 129;
                case 114 -> 149;
                case 115 -> 80;
                case 116 -> 199;
                case 117 -> 21;
                case 118 -> 178;
                case 119 -> 152;
                case 120 -> 102;
                case 121 -> 48;
                case 122 -> 12;
                case 123 -> 215;
                case 124 -> 233;
                case 125 -> 226;
                case 126 -> 30;
                case 127 -> 211;
                case 128 -> 150;
                case 129 -> 232;
                case 130 -> 125;
                case 131 -> 162;
                case 132 -> 127;
                case 133 -> 109;
                case 134 -> 45;
                case 135 -> 91;
                case 136 -> 39;
                case 137 -> 183;
                case 138 -> 239;
                case 139 -> 237;
                case 140 -> 161;
                case 141 -> 217;
                case 142 -> 90;
                case 143 -> 0;
                case 144 -> 224;
                case 145 -> 235;
                case 146 -> 28;
                case 147 -> 255;
                case 148 -> 18;
                case 149 -> 76;
                case 150 -> 221;
                case 151 -> 113;
                case 152 -> 229;
                case 153 -> 141;
                case 154 -> 15;
                case 155 -> 170;
                case 156 -> 38;
                case 157 -> 234;
                case 158 -> 142;
                case 159 -> 218;
                case 160 -> 160;
                case 161 -> 164;
                case 162 -> 128;
                case 163 -> 214;
                case 164 -> 98;
                case 165 -> 59;
                case 166 -> 68;
                case 167 -> 65;
                case 168 -> 184;
                case 169 -> 55;
                case 170 -> 138;
                case 171 -> 209;
                case 172 -> 74;
                case 173 -> 139;
                case 174 -> 85;
                case 175 -> 101;
                case 176 -> 47;
                case 177 -> 53;
                case 178 -> 168;
                case 179 -> 228;
                case 180 -> 43;
                case 181 -> 10;
                case 182 -> 14;
                case 183 -> 245;
                case 184 -> 94;
                case 185 -> 41;
                case 186 -> 174;
                case 187 -> 187;
                case 188 -> 107;
                case 189 -> 136;
                case 190 -> 120;
                case 191 -> 27;
                case 192 -> 163;
                case 193 -> 24;
                case 194 -> 247;
                case 195 -> 191;
                case 196 -> 73;
                case 197 -> 33;
                case 198 -> 158;
                case 199 -> 147;
                case 200 -> 188;
                case 201 -> 216;
                case 202 -> 52;
                case 203 -> 251;
                case 204 -> 122;
                case 205 -> 106;
                case 206 -> 103;
                case 207 -> 206;
                case 208 -> 140;
                case 209 -> 31;
                case 210 -> 243;
                case 211 -> 202;
                case 212 -> 8;
                case 213 -> 50;
                case 214 -> 219;
                case 215 -> 111;
                case 216 -> 19;
                case 217 -> 151;
                case 218 -> 118;
                case 219 -> 108;
                case 220 -> 88;
                case 221 -> 81;
                case 222 -> 44;
                case 223 -> 99;
                case 224 -> 34;
                case 225 -> 121;
                case 226 -> 17;
                case 227 -> 126;
                case 228 -> 105;
                case 229 -> 46;
                case 230 -> 23;
                case 231 -> 92;
                case 232 -> 145;
                case 233 -> 227;
                case 234 -> 119;
                case 235 -> 61;
                case 236 -> 175;
                case 237 -> 5;
                case 238 -> 62;
                case 239 -> 11;
                case 240 -> 3;
                case 241 -> 205;
                case 242 -> 155;
                case 243 -> 117;
                case 244 -> 194;
                case 245 -> 49;
                case 246 -> 137;
                case 247 -> 252;
                case 248 -> 97;
                case 249 -> 67;
                case 250 -> 40;
                case 251 -> 132;
                case 252 -> 87;
                case 253 -> 195;
                case 254 -> 7;
                default -> 165;
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
            zs.c[n3] = new String(cArray).intern();
        }
        return c[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A23;
        if (g[n2] == null) {
            zs.g[n2] = (int)(e[n2] ^ l);
        }
        return g[n2];
    }
}
