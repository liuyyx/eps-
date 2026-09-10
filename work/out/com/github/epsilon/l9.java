/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.protocol.game.ClientboundSetScorePacket
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.dP;
import com.github.epsilon.hi;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.network.protocol.game.ClientboundSetScorePacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class l9 {
    public static final l9 H;
    private final Map<String, Integer> B = new ConcurrentHashMap<String, Integer>();
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00ea\u00d2\u0013@\u0013/\u000b\u00c4\u00c2\u0090A\u00ccL=\u0013\u00bb\u0011A";
                    var12_3 = "\u00ea\u00d2\u0013@\u0013/\u000b\u00c4\u00c2\u0090A\u00ccL=\u0013\u00bb\u0011A".length();
                    var9_4 = 6;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 111;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 117;
                                    break;
                                }
                                case 1: {
                                    v11 = 120;
                                    break;
                                }
                                case 2: {
                                    v11 = 102;
                                    break;
                                }
                                case 3: {
                                    v11 = 50;
                                    break;
                                }
                                case 4: {
                                    v11 = 6;
                                    break;
                                }
                                case 5: {
                                    v11 = 106;
                                    break;
                                }
                                default: {
                                    v11 = 26;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                l9.a = var13;
                l9.b = new String[2];
                var0_7 = 5722829630140779627L;
                var6_8 = new long[101];
                var3_9 = 0;
                var4_10 = "B\u009e\u0012\u001e\u009e\u00c4D+\u00de\u00fe\u001fi\rO}\u00af\u00e0\u001f\u00a5\u0017\u0018(Rg\u00f7\u00cc\u00ee\u008b\u00b0\u007f\u00f3\u0094\u009cRO|in\u0091\u00a3hz\u0097\u0081vl\u0007Q\u00d6\u00e7\u0002\u00dbUT\u008cc\u00d9\u0084\u00fe:f\u00186b\u00f6\u0096b\u00a8\u00a0\u00a8\u00f9\n\u00ca\u00fd\u0013Z\u0085\u0090[\u00cfR\t\u00d0+\u00dc\u0019\u001f\u00b6\b\u0083Hb#z8\u001bW\u008a\u00fc8<g\u001f&\u00e4p\u00b7\u00c8{\f[7\na\u00ff\u009a<\u0093\u007fL\u009c&&\u00f7\u00f6\u000b\u00e9\u00d4\u00d8\u00ac\u009e\u00ceJ@R\tf^\u00a2\u00a4\u00d0\u00da\u00c7d\u001d\u0095\u00ec\u0000\u00c0\u00b1bz\u008f\u0003J\u00fa\u00b6E?\u008e\u00bfQ\u0096\u008e\u0083\u00ce\u0093\u00f4QYq\u0090c\u0090\u00c0\u00c1\u009c6\u000f\t\u000eN\u00f2\u009c\u0080T\u0091\u00a4\u0084\u00fah\u00a7\u001c&\f\u0002iK\t\u000e\u00dbV\u0002\u0085>\u0087us\u00bd\u00a9\u00b4\u0085\u00f5Up\u00ad\u00ba\u00c8\u00fc\u00a2P\u0097\u00d0&\u0093B\u000f\u00f4K\u008c\u0095d\u00da8\u00f0=\u00f4]\u008b\u00c9{q\u00ed\u00b4UA\u001d\u00a1\u0085yf\u00a5C_\u00b8\u001dK\u0015La2\u00f1m\n.\u001c\u00c6e\u009a\u00a6\u00c9<\u00dd\u0083\u00d0\u00b0|G\u0091BU\u00be\u008b\u00f2X\u008e\u00bf\u009b\u0004\u007f\u00132\u00e7\u00b3\u0001\u0081\u00bc\u001bg@S\u00dd?\u008b\u0098\u00dc>icg\u00b4\u0082\u00e7\u00cf\u0086P\u00fb\u001c\u001aj\u0015\u00d3\u00fe\u00b8\u00d1U5\r\u00e0\u00d1\u0080\u00f7\u0095aM\u00feR\u0005\u00f3\u00e6\u00d4[K\u00b3\u00b2\u009d\u00b9vj\u00d58\u00c7wn\u00b5\u00b2;H\u00161\u0085B\u00c3Qw\u00ce\u00dc}/\u0081\u00e9\u007f\u001c\u007f\u0087C\u00eb\u00f8/@\u00aa\u0004a\u00a1;\n\u00f6\u0099\b\u0089l6<\u0007\u00d4\u00d7\u00a6l)\u0004j\u000fF\u00f95\u00f1\u00cd\u008c&\u00c1\u0088\u00dd\u00bc\u0086B+\u0082\u00a8\u009b\u00ffeYHL\u001e\u00de{\u009e\u00e6\u00ac\u00ec\u00e0\u00a9[\u0006\u00f6\u00e8\u0001\u0096K\u00b4f8$\u00b7\u009dM\u00fc\u0005\u0094\u00a8\u00fae\u00cc\u0003\u00e6t\u000by\u00d5\u001a\u0004\u00cbx\u00df]\u00a2q\u00c1B\u00e5\u0006Z\u00851\u00f5\u00f0z\u009a\u00fb\u009c\u00e1N\u0087\u00dc\u00ba\u0019\u00d5|\u0093\u0017s6\u00e7\u00d7J[j\u00af\u00c1!\u0091\u00e1\u0016n\bk\u00f6\u00a2\u0084\u00dc\u00f3\u00c1\u001b\u00e0\u00dd\u008dW02\u0018\u0095d\u00fck\u00d5\"$\u00842?\u00dd\u00e2n/\u00f9]\u0094\u007f\u008bV\u00ceF\n\u00de\u0084d\u00c08\u00ee\u00e5}\u00c4\u009b|\u00b1D+\u0087M\u00b4\u00b8\u009f;\u00f2\u00b6\u001e\u00f7\u000b\u0082s\u00d0\u001f\u00bbg\u00e7,J\\b'\u000e^w\u0084`\u0081\u00db\u00f2\u00fc]l\u00c1\u0002v\u00f6\u0017\u0099\u0019DN\u00f3\u00bb\u0018\u0087d[\u00c4\u00aa=\u0090\u00c8\u00fa\u00aa\u009b\u00fc\u00ad\u00b8\u008b\u001b7\f5\u001b\u0018\fgP\u0093\u00d6\u001f\u00c0x\r\u00ffO\u00a4\u00dd{n\u009cVv\u009a\u00a1\u0000 \u00a1\u00854X\u00f1\u00ef\u00ceT\u00e1\u000e\u00d7WZ\u00aesf=|\u00fb\u0011\u008d\u00d5\u0002,\u0019-\u00a5]E\b\u00ec \u0004\u008a\u0093\u00ed\u0090\u009f$\u00dc\u00ce\u00bd3\u0016\u000b\u00e2t\u0018\u00d7\u00c3\u00b1~\u0088\u00ecf\u00aeC\u0001k\u008c<\t\u0093\u00fe\u00dcz\u0091\u00d6ni\u000b6{\u0085\u00a0\u00ad\u00cd\t\u00a7_\u0010\u00cf\u0086\u00e4\u0011)\u009c\u00a7\u0017\u00bc~\u0001\u0001\u00aa\u00ee\u0082\u00da\u0090n\u009e\u0089hH\u0083\u0016\u0095\u00ad\u0004\u00c0\u001b\u00fe\u0019Y\u00ff\u0095\u007f\u00c2\u0011\\\u001a\u0098\u00e1F #\u0005)&\u00e0P\u00ca}d:\u00c3\u00c9\u00a6.\u00d7L\u001ag\u00b7\u00f0\u00dd";
                var5_11 = "B\u009e\u0012\u001e\u009e\u00c4D+\u00de\u00fe\u001fi\rO}\u00af\u00e0\u001f\u00a5\u0017\u0018(Rg\u00f7\u00cc\u00ee\u008b\u00b0\u007f\u00f3\u0094\u009cRO|in\u0091\u00a3hz\u0097\u0081vl\u0007Q\u00d6\u00e7\u0002\u00dbUT\u008cc\u00d9\u0084\u00fe:f\u00186b\u00f6\u0096b\u00a8\u00a0\u00a8\u00f9\n\u00ca\u00fd\u0013Z\u0085\u0090[\u00cfR\t\u00d0+\u00dc\u0019\u001f\u00b6\b\u0083Hb#z8\u001bW\u008a\u00fc8<g\u001f&\u00e4p\u00b7\u00c8{\f[7\na\u00ff\u009a<\u0093\u007fL\u009c&&\u00f7\u00f6\u000b\u00e9\u00d4\u00d8\u00ac\u009e\u00ceJ@R\tf^\u00a2\u00a4\u00d0\u00da\u00c7d\u001d\u0095\u00ec\u0000\u00c0\u00b1bz\u008f\u0003J\u00fa\u00b6E?\u008e\u00bfQ\u0096\u008e\u0083\u00ce\u0093\u00f4QYq\u0090c\u0090\u00c0\u00c1\u009c6\u000f\t\u000eN\u00f2\u009c\u0080T\u0091\u00a4\u0084\u00fah\u00a7\u001c&\f\u0002iK\t\u000e\u00dbV\u0002\u0085>\u0087us\u00bd\u00a9\u00b4\u0085\u00f5Up\u00ad\u00ba\u00c8\u00fc\u00a2P\u0097\u00d0&\u0093B\u000f\u00f4K\u008c\u0095d\u00da8\u00f0=\u00f4]\u008b\u00c9{q\u00ed\u00b4UA\u001d\u00a1\u0085yf\u00a5C_\u00b8\u001dK\u0015La2\u00f1m\n.\u001c\u00c6e\u009a\u00a6\u00c9<\u00dd\u0083\u00d0\u00b0|G\u0091BU\u00be\u008b\u00f2X\u008e\u00bf\u009b\u0004\u007f\u00132\u00e7\u00b3\u0001\u0081\u00bc\u001bg@S\u00dd?\u008b\u0098\u00dc>icg\u00b4\u0082\u00e7\u00cf\u0086P\u00fb\u001c\u001aj\u0015\u00d3\u00fe\u00b8\u00d1U5\r\u00e0\u00d1\u0080\u00f7\u0095aM\u00feR\u0005\u00f3\u00e6\u00d4[K\u00b3\u00b2\u009d\u00b9vj\u00d58\u00c7wn\u00b5\u00b2;H\u00161\u0085B\u00c3Qw\u00ce\u00dc}/\u0081\u00e9\u007f\u001c\u007f\u0087C\u00eb\u00f8/@\u00aa\u0004a\u00a1;\n\u00f6\u0099\b\u0089l6<\u0007\u00d4\u00d7\u00a6l)\u0004j\u000fF\u00f95\u00f1\u00cd\u008c&\u00c1\u0088\u00dd\u00bc\u0086B+\u0082\u00a8\u009b\u00ffeYHL\u001e\u00de{\u009e\u00e6\u00ac\u00ec\u00e0\u00a9[\u0006\u00f6\u00e8\u0001\u0096K\u00b4f8$\u00b7\u009dM\u00fc\u0005\u0094\u00a8\u00fae\u00cc\u0003\u00e6t\u000by\u00d5\u001a\u0004\u00cbx\u00df]\u00a2q\u00c1B\u00e5\u0006Z\u00851\u00f5\u00f0z\u009a\u00fb\u009c\u00e1N\u0087\u00dc\u00ba\u0019\u00d5|\u0093\u0017s6\u00e7\u00d7J[j\u00af\u00c1!\u0091\u00e1\u0016n\bk\u00f6\u00a2\u0084\u00dc\u00f3\u00c1\u001b\u00e0\u00dd\u008dW02\u0018\u0095d\u00fck\u00d5\"$\u00842?\u00dd\u00e2n/\u00f9]\u0094\u007f\u008bV\u00ceF\n\u00de\u0084d\u00c08\u00ee\u00e5}\u00c4\u009b|\u00b1D+\u0087M\u00b4\u00b8\u009f;\u00f2\u00b6\u001e\u00f7\u000b\u0082s\u00d0\u001f\u00bbg\u00e7,J\\b'\u000e^w\u0084`\u0081\u00db\u00f2\u00fc]l\u00c1\u0002v\u00f6\u0017\u0099\u0019DN\u00f3\u00bb\u0018\u0087d[\u00c4\u00aa=\u0090\u00c8\u00fa\u00aa\u009b\u00fc\u00ad\u00b8\u008b\u001b7\f5\u001b\u0018\fgP\u0093\u00d6\u001f\u00c0x\r\u00ffO\u00a4\u00dd{n\u009cVv\u009a\u00a1\u0000 \u00a1\u00854X\u00f1\u00ef\u00ceT\u00e1\u000e\u00d7WZ\u00aesf=|\u00fb\u0011\u008d\u00d5\u0002,\u0019-\u00a5]E\b\u00ec \u0004\u008a\u0093\u00ed\u0090\u009f$\u00dc\u00ce\u00bd3\u0016\u000b\u00e2t\u0018\u00d7\u00c3\u00b1~\u0088\u00ecf\u00aeC\u0001k\u008c<\t\u0093\u00fe\u00dcz\u0091\u00d6ni\u000b6{\u0085\u00a0\u00ad\u00cd\t\u00a7_\u0010\u00cf\u0086\u00e4\u0011)\u009c\u00a7\u0017\u00bc~\u0001\u0001\u00aa\u00ee\u0082\u00da\u0090n\u009e\u0089hH\u0083\u0016\u0095\u00ad\u0004\u00c0\u001b\u00fe\u0019Y\u00ff\u0095\u007f\u00c2\u0011\\\u001a\u0098\u00e1F #\u0005)&\u00e0P\u00ca}d:\u00c3\u00c9\u00a6.\u00d7L\u001ag\u00b7\u00f0\u00dd".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00e2\u00b5\u0003C\u00b1\u0012N\u00e0\u001c\u00ab\u00cal\u00e1Q9F";
                    var5_11 = "\u00e2\u00b5\u0003C\u00b1\u0012N\u00e0\u001c\u00ab\u00cal\u00e1Q9F".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        l9.c = var6_8;
        l9.d = new Integer[101];
        l9.H = new l9();
    }

    public static /* bridge */ /* synthetic */ CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean k(Object[] var1_1) {
        block13: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = (l9.a(6428, 529337239472525049L) ^ l9.a(8968, 5459884478749766830L)) * l9.a(3236, 7249497777034222430L) - l9.a(3026, 7771325933899013192L);
            if (var3_3) ** GOTO lbl17
            block9: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 /* !! */  = hi.a("\u00a5", l9.a(21008, -29544), (Object)((String)var2_2), (long)400117547248019748L);
                            if (!var3_3) break block14;
                            if (v0 /* !! */  == false) break block15;
                            v0 /* !! */  = (CallSite)(l9.a(5248, 9022664770290729778L) - l9.a(20954, 4203445460881606253L) + l9.a(21896, 6746375611590771304L));
                        }
                        var4_4 /* !! */  = (int)v0 /* !! */ ;
                        if (var3_3) break block16;
                    }
                    var4_4 /* !! */  = (l9.a(13458, 2708377889769841466L) - l9.a(21342, 5590250163824854256L)) / l9.a(245, 8890235098462639962L) / l9.a(29435, 2650211343431574888L) / 3 ^ l9.a(565, 1658968601420027278L);
                    if (!var3_3) ** GOTO lbl37
                }
                block10: while (true) {
                    switch (var4_4 /* !! */ ) {
                        default: {
                            continue block9;
                        }
                        case 896660612: {
                            v1 = l9.i("egvV1Y2i9PTedUTL", equalsIgnoreCase(java.lang.String ), (String)l9.a(21009, -25195), (String)((String)var2_2));
                            if (!var3_3) ** GOTO lbl38
                            if (v1 == false) ** GOTO lbl37
                            ** GOTO lbl40
                        }
                        case 896660611: {
                            v2 = true;
                            var4_4 /* !! */  = (int)(hi.a("G", (int)l9.i("egvV1Y2i9PTedUTL", max(int int ), (int)l9.a(20283, 7853996673213733078L), (int)l9.a(25692, 4861584108969964487L)), (int)l9.a(11314, 3344296694321904523L), (long)834203424483934088L) - l9.a(31594, 8212930092228488323L) - l9.a(25262, 1805612819272742146L));
                            if (var3_3) break block13;
                            ** GOTO lbl42
                        }
                        case 896660610: {
                            v2 = false;
                            if (!var3_3) {
                                return v2;
                            }
                            ** GOTO lbl42
                        }
lbl37:
                        // 2 sources

                        v1 = (hi.a("G", (int)l9.a(2748, 4200056554477051192L), (int)l9.a(29642, 1885564952593736828L), (long)834203424483934088L) - l9.a(27767, 8475357271277648835L)) / l9.a(13169, 6714465481247777988L) - l9.a(6630, 7081582408042565143L) + l9.a(25358, 4450129978753594521L);
lbl38:
                        // 2 sources

                        var4_4 /* !! */  = (int)v1;
                        if (var3_3) continue block10;
lbl40:
                        // 2 sources

                        var4_4 /* !! */  = l9.a(13870, 313874536288838038L) - l9.a(19499, 6459152953679748032L) + l9.a(14379, 2453139911827681210L);
                        continue block10;
lbl42:
                        // 2 sources

                        var4_4 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)l9.a(8711, 2944633633418540425L), (int)l9.a(18977, 1797702446098718137L), (long)834203424483934088L), (int)l9.a(24170, 5764373738633234825L), (long)834203424483934088L) - l9.a(18058, 3786802062087557498L) - l9.a(9710, 3284085211463709267L));
                        break block13;
                        case 896660613: 
                    }
                    break;
                }
                break;
            }
            return (boolean)hi.a("G", (int)l9.a(9048, 8136934262367548628L), (int)2, (long)589346929323904906L);
        }
        block11: while (true) {
            switch (var4_4 /* !! */ ) {
                case 1308372609: {
                    hi.a("G", (long)986682684396269627L);
                    var4_4 /* !! */  = (l9.a(28676, 2699557159737337834L) - l9.a(2028, 6923490064580268152L)) * l9.a(8456, 3214394356172060309L) + l9.a(29998, 4136313758199259852L) - l9.a(5901, 5856493991382368487L);
                    continue block11;
                }
            }
            break;
        }
        return v2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void R(dP var1_1) {
        var2_2 = Dl.t();
        var5_3 /* !! */  = ((l9.a(29098, 7528493552473744980L) ^ l9.a(21368, 3440130123479844082L)) - l9.a(3370, 4253398953666239137L) + l9.a(12114, 3075715218375735478L)) / l9.a(3249, 1066663848766397230L) + l9.a(207, 3257129453142890349L);
        if (!var2_2) ** GOTO lbl11
        block15: while (true) {
            block22: {
                block21: {
                    if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) != null) break block21;
                    var5_3 /* !! */  = l9.a(18520, 7719846783622488006L) * l9.a(11646, 3393928066888694411L) + l9.a(7318, 7970704595605015403L);
                    if (!var2_2) break block22;
                }
                var5_3 /* !! */  = (int)(hi.a("G", (int)l9.a(942, 8273405419427320848L), (int)l9.a(27947, 3286831824620632772L), (long)834203424483934088L) / l9.a(22671, 2463542135821406064L) - l9.a(28077, 1014980583175174767L));
                if (var2_2) ** GOTO lbl25
            }
            block16: while (true) {
                switch (var5_3 /* !! */ ) {
                    default: {
                        continue block15;
                    }
                    case -761411582: {
                        if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L) != null) ** GOTO lbl25
                        ** GOTO lbl27
                    }
                    case -761411585: {
                        var4_4 = hi.a("\u00a5", (Object)var1_1, (long)634364534990057548L);
                        v0 /* !! */  = var4_4 instanceof ClientboundSetScorePacket;
                        if (var2_2) ** GOTO lbl30
                        if (v0 /* !! */  == 0) ** GOTO lbl29
                        ** GOTO lbl31
                    }
lbl25:
                    // 2 sources

                    var5_3 /* !! */  = l9.i("egvV1Y2i9PTedUTL", max(int int ), (int)(l9.a(3289, 4189907318359317354L) / l9.a(25555, 1989440939388908666L) - l9.a(11981, 2039027139100309884L)), (int)l9.a(22549, 4490536540259389409L)) ^ l9.a(8891, 8599026488895632712L);
                    if (!var2_2) continue block16;
lbl27:
                    // 2 sources

                    var5_3 /* !! */  = l9.a(18614, 6093682000081100618L) * l9.a(24378, 1106634276172499125L) + l9.a(20300, 6560048174346967247L);
                    continue block16;
lbl29:
                    // 1 sources

                    v0 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)l9.a(13534, 1604615974721446773L), (int)l9.a(27935, 2777423596852361945L), (long)834203424483934088L) + l9.a(17976, 4614018694181360049L));
lbl30:
                    // 2 sources

                    if (!var2_2) ** GOTO lbl60
lbl31:
                    // 2 sources

                    var5_3 /* !! */  = (l9.a(27431, 5248985110538042561L) - l9.a(22483, 4565269329579671651L)) / l9.a(21200, 169508667485586794L) + l9.a(30683, 2576194644590207100L) ^ l9.a(18735, 8192361596036783754L);
                    switch (var5_3 /* !! */ ) {
                        default: {
                            var3_5 = (ClientboundSetScorePacket)var4_4;
                            var4_4 = hi.a("\u00a5", (Object)var3_5, (long)1294774063853173229L);
                            v1 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var4_4}, (long)1100348063276848936L);
                            if (var2_2) ** GOTO lbl46
                            if (v1 == false) break;
                            ** GOTO lbl48
                        }
                        case 568507409: {
                            hi.a("G", (long)437292628650123400L);
                            hi.a("G", (long)856052782530482102L);
                            return;
                        }
                    }
                    v1 = l9.i("egvV1Y2i9PTedUTL", max(int int ), (int)l9.a(798, 8001558955017458828L), (int)l9.a(11583, 7921973669605538453L)) + l9.a(16748, 3510459141102147309L);
lbl46:
                    // 2 sources

                    var5_3 /* !! */  = (int)v1;
                    if (!var2_2) ** GOTO lbl60
lbl48:
                    // 2 sources

                    var5_3 /* !! */  = ((l9.a(1877, 3536440592524235000L) + l9.a(4585, 2542276639233918588L) ^ l9.a(14923, 3709165018716696043L)) + l9.a(15606, 602400402897333088L)) * l9.a(18726, 2656719997476773529L) + l9.a(12041, 2541005651812808846L);
                    if (!var2_2) {
                        switch (var5_3 /* !! */ ) {
                            default: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1113711058066997964L), (Object)hi.a("\u00a5", (Object)var3_5, (long)987583318763258618L), (Object)hi.a("G", (int)hi.a("\u00a5", (Object)var3_5, (long)1306168675725084477L), (long)777027428917046763L), (long)1121879748672195632L);
                                if (!var2_2) break;
                                return;
                            }
                            case -2103191581: {
                                l9.i("egvV1Y2i9PTedUTL", L());
                                return;
                            }
                        }
                    }
                    var5_3 /* !! */  = (int)(hi.a("G", (int)l9.a(798, 8001558955017458828L), (int)l9.a(11583, 7921973669605538453L), (long)834203424483934088L) + l9.a(16748, 3510459141102147309L));
lbl60:
                    // 3 sources

                    switch (var5_3 /* !! */ ) {
                        default: {
                            return;
                        }
                        case -1327680240: 
                    }
                    return;
                    case -761411584: {
                        return;
                    }
                    case -761411581: 
                }
                break;
            }
            break;
        }
    }

    private l9() {
        hi.a("\u00a5", (Object)hi.a("j", (long)519102950410566293L), (Object)this, (long)817797371366047544L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float H(Entity var1_1) {
        block28: {
            block27: {
                block23: {
                    block22: {
                        var2_2 = Dl.S();
                        var6_3 = l9.a(24557, 2470866345367603227L) / l9.a(16770, 7917179189906839047L) + l9.a(12035, 371987443932821754L);
                        if (var2_2) ** GOTO lbl13
                        block12: while (true) {
                            block26: {
                                block25: {
                                    block24: {
                                        v0 /* !! */  = var1_1 instanceof LivingEntity;
                                        if (!var2_2) break block24;
                                        if (v0 /* !! */  != 0) break block25;
                                        v0 /* !! */  = var6_3 = (int)(hi.a("G", (int)l9.a(26942, 4324176319084510877L), (int)l9.a(29993, 8677378614454690445L), (long)834203424483934088L) + l9.a(2742, 2755747904686022006L));
                                    }
                                    if (var2_2) break block26;
                                }
                                var6_3 = l9.a(7472, 1872939278154189511L) / 5 - l9.a(10520, 7133961375050530521L) + l9.a(24108, 7537825365309721071L) ^ l9.a(7257, 5944429476559735761L);
                            }
                            switch (var6_3) {
                                default: {
                                    continue block12;
                                }
                                case 1617806403: {
                                    var3_4 = (LivingEntity)var1_1;
                                    var4_5 = hi.a("\u00a5", (Object)l9.i("egvV1Y2i9PTedUTL", getName(), (LivingEntity)var3_4), (long)445233814433577985L);
                                    var5_6 = (Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1113711058066997964L), (Object)var4_5, (long)717569244418368117L);
                                    if (!var2_2) break block22;
                                    if (var5_6 != null) break block12;
                                    break block23;
                                }
                                case 1617806405: {
                                    return 0.0f;
                                }
                                case 1617806406: {
                                    throw null;
                                }
                            }
                            break;
                        }
                        var6_3 = hi.a("G", (int)l9.a(5832, 86920249118048584L), (int)l9.a(29509, 1004641369186477246L), (long)834203424483934088L) / l9.a(14067, 6181452333334815089L) ^ l9.a(26781, 6472762960768548732L);
                    }
                    if (var2_2) break block27;
                }
                var6_3 = (l9.a(31446, 7219300626544569679L) - l9.a(7401, 6591309662479567716L)) * l9.a(17994, 1695376154836406690L) - l9.a(29601, 8693261132653732953L);
            }
            switch (var6_3) {
                default: {
                    v1 /* !! */  = (float)(l9.i("egvV1Y2i9PTedUTL", getHealth(), (LivingEntity)var3_4) + l9.i("egvV1Y2i9PTedUTL", getAbsorptionAmount(), (LivingEntity)var3_4));
                    var6_3 = l9.a(26359, 4424031302371488107L) * l9.a(1097, 8765168231641371624L) / l9.a(16770, 7917179189906839047L) / l9.a(5753, 1885435467570004457L) + l9.a(32582, 571513579509885178L);
                    if (!var2_2) {
                        break;
                    }
                    break block28;
                }
                case -1135511334: {
                    v1 /* !! */  = (float)hi.a("\u00a5", (Object)var5_6, (long)1260538186742955956L);
                    if (var2_2) break;
                    return v1 /* !! */ ;
                }
                case -1135511332: {
                    return (float)hi.a("G", (long)877399517904373040L);
                }
            }
            var6_3 = l9.a(215, 4076367177831536432L) * l9.a(26704, 1802048697864568764L) / l9.a(16770, 7917179189906839047L) / l9.a(31542, 3708788900741721284L) + l9.a(25436, 2802580141019870426L);
        }
        switch (var6_3) {
            case -2010930169: {
                l9.i("egvV1Y2i9PTedUTL", G());
                return v1 /* !! */ ;
            }
        }
        return v1 /* !! */ ;
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x5211) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 183;
                case 1 -> 7;
                case 2 -> 228;
                case 3 -> 146;
                case 4 -> 128;
                case 5 -> 145;
                case 6 -> 179;
                case 7 -> 240;
                case 8 -> 69;
                case 9 -> 78;
                case 10 -> 138;
                case 11 -> 2;
                case 12 -> 9;
                case 13 -> 144;
                case 14 -> 80;
                case 15 -> 175;
                case 16 -> 1;
                case 17 -> 177;
                case 18 -> 97;
                case 19 -> 65;
                case 20 -> 160;
                case 21 -> 74;
                case 22 -> 73;
                case 23 -> 172;
                case 24 -> 164;
                case 25 -> 127;
                case 26 -> 236;
                case 27 -> 108;
                case 28 -> 157;
                case 29 -> 113;
                case 30 -> 55;
                case 31 -> 211;
                case 32 -> 88;
                case 33 -> 238;
                case 34 -> 246;
                case 35 -> 255;
                case 36 -> 101;
                case 37 -> 155;
                case 38 -> 137;
                case 39 -> 229;
                case 40 -> 133;
                case 41 -> 49;
                case 42 -> 208;
                case 43 -> 15;
                case 44 -> 199;
                case 45 -> 142;
                case 46 -> 63;
                case 47 -> 190;
                case 48 -> 207;
                case 49 -> 112;
                case 50 -> 64;
                case 51 -> 58;
                case 52 -> 87;
                case 53 -> 56;
                case 54 -> 27;
                case 55 -> 62;
                case 56 -> 96;
                case 57 -> 178;
                case 58 -> 167;
                case 59 -> 169;
                case 60 -> 48;
                case 61 -> 225;
                case 62 -> 81;
                case 63 -> 70;
                case 64 -> 203;
                case 65 -> 29;
                case 66 -> 14;
                case 67 -> 60;
                case 68 -> 46;
                case 69 -> 13;
                case 70 -> 205;
                case 71 -> 150;
                case 72 -> 59;
                case 73 -> 216;
                case 74 -> 75;
                case 75 -> 223;
                case 76 -> 53;
                case 77 -> 104;
                case 78 -> 33;
                case 79 -> 189;
                case 80 -> 230;
                case 81 -> 3;
                case 82 -> 16;
                case 83 -> 92;
                case 84 -> 198;
                case 85 -> 215;
                case 86 -> 162;
                case 87 -> 181;
                case 88 -> 130;
                case 89 -> 159;
                case 90 -> 117;
                case 91 -> 103;
                case 92 -> 219;
                case 93 -> 185;
                case 94 -> 22;
                case 95 -> 182;
                case 96 -> 173;
                case 97 -> 161;
                case 98 -> 204;
                case 99 -> 28;
                case 100 -> 132;
                case 101 -> 218;
                case 102 -> 140;
                case 103 -> 91;
                case 104 -> 227;
                case 105 -> 121;
                case 106 -> 109;
                case 107 -> 10;
                case 108 -> 131;
                case 109 -> 123;
                case 110 -> 180;
                case 111 -> 111;
                case 112 -> 37;
                case 113 -> 19;
                case 114 -> 86;
                case 115 -> 76;
                case 116 -> 31;
                case 117 -> 202;
                case 118 -> 197;
                case 119 -> 249;
                case 120 -> 115;
                case 121 -> 141;
                case 122 -> 23;
                case 123 -> 114;
                case 124 -> 24;
                case 125 -> 42;
                case 126 -> 168;
                case 127 -> 147;
                case 128 -> 224;
                case 129 -> 8;
                case 130 -> 94;
                case 131 -> 105;
                case 132 -> 83;
                case 133 -> 34;
                case 134 -> 134;
                case 135 -> 156;
                case 136 -> 252;
                case 137 -> 90;
                case 138 -> 79;
                case 139 -> 89;
                case 140 -> 237;
                case 141 -> 176;
                case 142 -> 66;
                case 143 -> 107;
                case 144 -> 201;
                case 145 -> 110;
                case 146 -> 135;
                case 147 -> 139;
                case 148 -> 118;
                case 149 -> 30;
                case 150 -> 152;
                case 151 -> 4;
                case 152 -> 195;
                case 153 -> 148;
                case 154 -> 84;
                case 155 -> 71;
                case 156 -> 166;
                case 157 -> 124;
                case 158 -> 82;
                case 159 -> 5;
                case 160 -> 171;
                case 161 -> 186;
                case 162 -> 163;
                case 163 -> 102;
                case 164 -> 72;
                case 165 -> 54;
                case 166 -> 235;
                case 167 -> 231;
                case 168 -> 38;
                case 169 -> 116;
                case 170 -> 52;
                case 171 -> 217;
                case 172 -> 36;
                case 173 -> 100;
                case 174 -> 143;
                case 175 -> 25;
                case 176 -> 154;
                case 177 -> 67;
                case 178 -> 6;
                case 179 -> 226;
                case 180 -> 233;
                case 181 -> 222;
                case 182 -> 26;
                case 183 -> 241;
                case 184 -> 153;
                case 185 -> 21;
                case 186 -> 77;
                case 187 -> 40;
                case 188 -> 106;
                case 189 -> 41;
                case 190 -> 193;
                case 191 -> 125;
                case 192 -> 210;
                case 193 -> 129;
                case 194 -> 165;
                case 195 -> 214;
                case 196 -> 85;
                case 197 -> 206;
                case 198 -> 232;
                case 199 -> 17;
                case 200 -> 126;
                case 201 -> 196;
                case 202 -> 43;
                case 203 -> 50;
                case 204 -> 250;
                case 205 -> 47;
                case 206 -> 61;
                case 207 -> 151;
                case 208 -> 99;
                case 209 -> 239;
                case 210 -> 248;
                case 211 -> 68;
                case 212 -> 243;
                case 213 -> 221;
                case 214 -> 51;
                case 215 -> 192;
                case 216 -> 45;
                case 217 -> 209;
                case 218 -> 245;
                case 219 -> 212;
                case 220 -> 119;
                case 221 -> 98;
                case 222 -> 220;
                case 223 -> 194;
                case 224 -> 188;
                case 225 -> 20;
                case 226 -> 35;
                case 227 -> 242;
                case 228 -> 184;
                case 229 -> 213;
                case 230 -> 18;
                case 231 -> 234;
                case 232 -> 247;
                case 233 -> 254;
                case 234 -> 32;
                case 235 -> 12;
                case 236 -> 200;
                case 237 -> 149;
                case 238 -> 251;
                case 239 -> 0;
                case 240 -> 253;
                case 241 -> 158;
                case 242 -> 93;
                case 243 -> 170;
                case 244 -> 122;
                case 245 -> 136;
                case 246 -> 174;
                case 247 -> 39;
                case 248 -> 95;
                case 249 -> 120;
                case 250 -> 191;
                case 251 -> 44;
                case 252 -> 57;
                case 253 -> 11;
                case 254 -> 244;
                default -> 187;
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
            l9.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57A2;
        if (d[n2] == null) {
            l9.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
