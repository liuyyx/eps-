/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.textures.GpuSampler
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.client.renderer.texture.AbstractTexture
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.ij;
import com.github.epsilon.nG;
import com.github.epsilon.y4;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.textures.GpuSampler;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.Identifier;

public class yn {
    private int J;
    private int X;
    private final y4 j;
    private final Identifier i;
    private int a;
    private static final int m;
    private static final int b;
    private final Identifier T;
    private static final AtomicInteger B;
    private final y4 f;
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] g;
    private static final long h;

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var15 = new String[6];
                            var13_1 = 0;
                            var12_2 = "\rrG\u00b0\u0089\u00c7q\u0012#\u0002\u0013*J\u00a3\u00b8\u0004\u0013\u00a6\u00c3\u0006\u0091\u00c4R\u0012\u00d5\u00e8}\u0080\u00d3\u00889M$\u00d6D\u00e2\u0018\u0001\u00f8\u00f2\u00f6Z\u00be\u00c1H\u0092\u00ce\u00cf\u00a5a\u00f7p\u00e5mn\u0018\u00e0Gza\u00a7\u0007\u0007\u0018 O\u00df\u00cb\t";
                            var14_3 = "\rrG\u00b0\u0089\u00c7q\u0012#\u0002\u0013*J\u00a3\u00b8\u0004\u0013\u00a6\u00c3\u0006\u0091\u00c4R\u0012\u00d5\u00e8}\u0080\u00d3\u00889M$\u00d6D\u00e2\u0018\u0001\u00f8\u00f2\u00f6Z\u00be\u00c1H\u0092\u00ce\u00cf\u00a5a\u00f7p\u00e5mn\u0018\u00e0Gza\u00a7\u0007\u0007\u0018 O\u00df\u00cb\t".length();
                            var11_4 = 16;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 108;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "?\u00eee\u00d35\u001a\u0016\n\u00b7\u00c8R\u00a5i?3]\u00a4\u00f1";
                                var14_3 = "?\u00eee\u00d35\u001a\u0016\n\u00b7\u00c8R\u00a5i?3]\u00a4\u00f1".length();
                                var11_4 = 7;
                                var10_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 110;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 79;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 116;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 114;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 52;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 5;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 110;
                                        break;
                                    }
                                    default: {
                                        v15 = 60;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    yn.c = var15;
                    yn.d = new String[6];
                    var2_7 = 7255005744049916477L;
                    var8_8 = new long[84];
                    var5_9 = 0;
                    var6_10 = "\u0090\u00ff/\u00d8x\u00ba\u00c2v\u00c1\u00d9T\u00cf\u008f\u0011&\u009b\u001f\u00e0[\u00ae8\u0007\u00a1\u00a54\u0087\u0086\u00beP\u0080\u008b\u009e`\u0096\"\u00cfC\u0012;\u00a7\u0017k\u00f4y\u00d5M\u00b6\u00fe\u001a\u00f1,d\u00a7\u00ba\u00f2w\u00e2)QmV\u00a95/\u007f\u009e\u0092\u00f2\u0011\u00cdGK\\\u0002@\u00e5\u0087\u00b1\u00bc!Y\u00d7\u00fe\u00cd\u00d1r\u009f\u00af\u00e0G\u00c4G\u00b2?1\u00a3Gy2\u00e0\u00c9\u0003i}c\u009a!*\f\u0003\u00cd\u001f.\u009c\u00d5\u00da\u00fb\u0094\u00bf\\\u00e6MS\u00dfdd\u0016\u00bb\u008b&\u001a\u001axB\u00e4`\u00f0\\-|P\u00dcX\u00d0\u00d9?\u000b\u00d1K\u0098\u0017I\u001a\u00fc\u00d6\u00cf\u0006\u00f4\u00c6\u00c03~\u00cf\ra\u0015\u00bb\u00ef]2\u0099\u00de\u008e\u0015\u00e9\u00df=L\u00a9\u008c\u00fb\u009c\u0018\u00b9\r\u00c2\u00fa\u00f4 \u009ataBu\u00a7\u00a3;\u00c9\u008e\u00ba \u00b2\u00db\u00ee\u00d5q\u00ad\u00f20K\u00bd\u0092\u00f1\u00b9\u00b7\u00e0\u00d4%=\u0084@\u00d7\u00f2\u00d0K\u0018X\u00b2\u00fe\u008d\u00ca\u00b4\u00cd\u009a\u00d2\u00ae3$}-g\u00b1kA\u0093\u000f\u00e9\u009f\u00db8j>\u0019[\u0007\u00c3d6\u001a8\u00c1S\u0081\u00b7\u00f0\u00c9\bs\u00ff\u00c0}\u00f9\u00ffJ\u001b>\u0085y\u0098\u00ffYR\u00941\u00dc\u00c7\u0093\u00156\u0088\u00d0\u009e\u0092\u0019\u00fc\u00c9\u0094+\u0084\u00f1c>\u0017\u0017%\u00c3\u001b\u00ea@\u0002\u0099\u0085\u0010\u008cv%\u00a6\u00da\u00d0\u00baY\u008a\u00e3\u00d1\u00b4\u00ce\u00db9O\u00f7\u0011\u0002M\u00e8\u00f3\u00ed.\u00d7\u00b5\u0098\u00b6\u001e+\u00c4\u00c9R\u00eb9\u009d1\u0096g\u0087\u00ea%/\u00f1\u000f\u0014pT\u00fa\u0094C)Q_\u00c1Y\u0085\u0090\u00b0}\u0012\u001a\u00a8\u00c5\u007f\u0096\u00c2\u00ac\u00a1\u00d0\u009e\u00aa\u00e2\u00c6u\u00d6T\u00b2<h\u0011;\rw-\u00e1\u001d\u0093o\u0081\u00a8Q\u00e9T\u0081\u009a\u008d\u00c7\u00acW\u00c6:{\u00bb\u0087\b\u0018g\u00b2SC<\u00ebE\u0019\u00cd?\u0006\t\u00e6\u008d\u00e3i\u0098\u0082]\u008eu\u00e76Q\u0085?H\u00adV\u00aa,\u00ec\u0098_A\u00c5\u0002\u00fb\\\u001c\u0092\u0012\nI6=k\u00efD\u00b0\u008b\u00f6\u00dcx\u00e9\u00d0\u00bc\u00a2\u001dG\u00a0Y\u00f4\u0012#\u0097\u0097\u00fa\u00a0\u00aa\u00b9s\u0004\u009f\u008e\u007f\u00c5H\u00d4\u00dd.%\u008f \u00bd\u00d4\u00ba\u00f2'\u00a9T\u00e4{\u00ff\u001fy\u0001\u0090J\u00de\u00f7\u008bF\u008a=Tj\u00fa\u0087\u0091\u0001't\u00de\u000f9\u00ddT\u00d6r\u009b\u00e1|#\u00d0h\u008bL=\u009d3\u00d6x\u00b38j\u0017\u00dd\u00ba\u0002\u0007\u0085\u00b3)e7\u00d4\u0095t\u0088o\u00ab\u0092\u00c9-\u00b2\u00e8\u00ab#\fSU\u00e8}v\u00e9Z@\u0086\u008cD\u00a3\\\u0011\\\u00bdC\u008a\u0095\r\u009ba\u00a43\u00b4\u00a6\u0096t)\u00e5\u0081\u00aawJ\u00a44h\u0011\u00a8Co}\bfG\u0098\u00c4\u0005\u00da\u00b0\u00f6m\u00f4*\u00a3vS\u0010\u0016\u00b3GW\u0015\u0098\u0088\u00e3\u00df\u00c2\u00cd\\\u00a0Q\u00a3}\u0010\n";
                    var7_11 = "\u0090\u00ff/\u00d8x\u00ba\u00c2v\u00c1\u00d9T\u00cf\u008f\u0011&\u009b\u001f\u00e0[\u00ae8\u0007\u00a1\u00a54\u0087\u0086\u00beP\u0080\u008b\u009e`\u0096\"\u00cfC\u0012;\u00a7\u0017k\u00f4y\u00d5M\u00b6\u00fe\u001a\u00f1,d\u00a7\u00ba\u00f2w\u00e2)QmV\u00a95/\u007f\u009e\u0092\u00f2\u0011\u00cdGK\\\u0002@\u00e5\u0087\u00b1\u00bc!Y\u00d7\u00fe\u00cd\u00d1r\u009f\u00af\u00e0G\u00c4G\u00b2?1\u00a3Gy2\u00e0\u00c9\u0003i}c\u009a!*\f\u0003\u00cd\u001f.\u009c\u00d5\u00da\u00fb\u0094\u00bf\\\u00e6MS\u00dfdd\u0016\u00bb\u008b&\u001a\u001axB\u00e4`\u00f0\\-|P\u00dcX\u00d0\u00d9?\u000b\u00d1K\u0098\u0017I\u001a\u00fc\u00d6\u00cf\u0006\u00f4\u00c6\u00c03~\u00cf\ra\u0015\u00bb\u00ef]2\u0099\u00de\u008e\u0015\u00e9\u00df=L\u00a9\u008c\u00fb\u009c\u0018\u00b9\r\u00c2\u00fa\u00f4 \u009ataBu\u00a7\u00a3;\u00c9\u008e\u00ba \u00b2\u00db\u00ee\u00d5q\u00ad\u00f20K\u00bd\u0092\u00f1\u00b9\u00b7\u00e0\u00d4%=\u0084@\u00d7\u00f2\u00d0K\u0018X\u00b2\u00fe\u008d\u00ca\u00b4\u00cd\u009a\u00d2\u00ae3$}-g\u00b1kA\u0093\u000f\u00e9\u009f\u00db8j>\u0019[\u0007\u00c3d6\u001a8\u00c1S\u0081\u00b7\u00f0\u00c9\bs\u00ff\u00c0}\u00f9\u00ffJ\u001b>\u0085y\u0098\u00ffYR\u00941\u00dc\u00c7\u0093\u00156\u0088\u00d0\u009e\u0092\u0019\u00fc\u00c9\u0094+\u0084\u00f1c>\u0017\u0017%\u00c3\u001b\u00ea@\u0002\u0099\u0085\u0010\u008cv%\u00a6\u00da\u00d0\u00baY\u008a\u00e3\u00d1\u00b4\u00ce\u00db9O\u00f7\u0011\u0002M\u00e8\u00f3\u00ed.\u00d7\u00b5\u0098\u00b6\u001e+\u00c4\u00c9R\u00eb9\u009d1\u0096g\u0087\u00ea%/\u00f1\u000f\u0014pT\u00fa\u0094C)Q_\u00c1Y\u0085\u0090\u00b0}\u0012\u001a\u00a8\u00c5\u007f\u0096\u00c2\u00ac\u00a1\u00d0\u009e\u00aa\u00e2\u00c6u\u00d6T\u00b2<h\u0011;\rw-\u00e1\u001d\u0093o\u0081\u00a8Q\u00e9T\u0081\u009a\u008d\u00c7\u00acW\u00c6:{\u00bb\u0087\b\u0018g\u00b2SC<\u00ebE\u0019\u00cd?\u0006\t\u00e6\u008d\u00e3i\u0098\u0082]\u008eu\u00e76Q\u0085?H\u00adV\u00aa,\u00ec\u0098_A\u00c5\u0002\u00fb\\\u001c\u0092\u0012\nI6=k\u00efD\u00b0\u008b\u00f6\u00dcx\u00e9\u00d0\u00bc\u00a2\u001dG\u00a0Y\u00f4\u0012#\u0097\u0097\u00fa\u00a0\u00aa\u00b9s\u0004\u009f\u008e\u007f\u00c5H\u00d4\u00dd.%\u008f \u00bd\u00d4\u00ba\u00f2'\u00a9T\u00e4{\u00ff\u001fy\u0001\u0090J\u00de\u00f7\u008bF\u008a=Tj\u00fa\u0087\u0091\u0001't\u00de\u000f9\u00ddT\u00d6r\u009b\u00e1|#\u00d0h\u008bL=\u009d3\u00d6x\u00b38j\u0017\u00dd\u00ba\u0002\u0007\u0085\u00b3)e7\u00d4\u0095t\u0088o\u00ab\u0092\u00c9-\u00b2\u00e8\u00ab#\fSU\u00e8}v\u00e9Z@\u0086\u008cD\u00a3\\\u0011\\\u00bdC\u008a\u0095\r\u009ba\u00a43\u00b4\u00a6\u0096t)\u00e5\u0081\u00aawJ\u00a44h\u0011\u00a8Co}\bfG\u0098\u00c4\u0005\u00da\u00b0\u00f6m\u00f4*\u00a3vS\u0010\u0016\u00b3GW\u0015\u0098\u0088\u00e3\u00df\u00c2\u00cd\\\u00a0Q\u00a3}\u0010\n".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v17 = var8_8;
                        v18 = var5_9++;
                        v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "\u0088~2&\u00eb\u00df\u00d6]q}\u00d0=b>\u00ebM";
                        var7_11 = "\u0088~2&\u00eb\u00df\u00d6]q}\u00d0=b>\u00ebM".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v17 = var8_8;
                            v18 = var5_9++;
                            v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var2_7;
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
            yn.e = var8_8;
            yn.g = new Integer[84];
            yn.m = yn.a(9788, 7014272308509520280L);
            yn.b = yn.a(27628, 763648993761262666L);
            break block31;
lbl143:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 3458974594239049648L;
        ** while (true)
        yn.h = 3458974594238001072L ^ var0_14;
        yn.B = new AtomicInteger();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void Q(Object[] var0) {
        block19: {
            block17: {
                block18: {
                    var1_1 = var0[0];
                    var2_2 = (Integer)var0[1];
                    var3_3 = Dl.t();
                    var6_4 = yn.b("k13T2dQ6PdAiKQBy", max(int int ), (int)(hi.a("G", (int)yn.a(24011, 7653094092065262119L), (int)yn.a(20924, 3423518792965506563L), (long)834203424483934088L) / yn.a(16437, 3134691937668421539L)), (int)yn.a(10216, 5488129834697895947L)) - yn.a(26904, 7112520420861509285L);
                    if (var3_3) break block17;
                    v0 /* !! */  = var6_4;
                    if (var3_3) break block18;
                    switch (v0 /* !! */ ) {
                        default: {
                            break block17;
                        }
                        case -1636287393: {
                            hi.a("G", (long)736398430265084806L);
                            v0 /* !! */  = (reference)-1;
                        }
                    }
                }
                hi.a("G", (int)v0 /* !! */ , (int)1, (long)737592949251754456L);
            }
            var4_5 = hi.a("G", (int)yn.a(15111, 8374631191101484198L), (long)879579088446029901L);
            if (var3_3) break block19;
            var6_4 = (reference)((yn.a(10823, 3755042821938429430L) + yn.a(13139, 4581525214995817652L)) / yn.a(24551, 6054330032585263175L) ^ yn.a(11186, 7928834637308279810L) ^ yn.a(21327, 6544785379548939479L) ^ yn.a(915, 6401089749517309054L));
            if (!var3_3) ** GOTO lbl47
            ** GOTO lbl31
        }
        block13: while (true) {
            block16: {
                try {
                    hi.a("G", (long)hi.a("G", (Object)var4_5, (long)517346999203462081L), (int)(var2_2 & yn.a(22524, 4266332191095767068L)), (long)yn.h, (long)395258062256442379L);
                    yn.b("k13T2dQ6PdAiKQBy", writeToTexture(com.mojang.blaze3d.textures.GpuTexture java.nio.ByteBuffer int int int int int int ), (CommandEncoder)hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), (long)1321271933459544209L), (GpuTexture)((GpuTexture)var1_1), (ByteBuffer)var4_5, (int)0, (int)0, (int)0, (int)0, (int)yn.a(795, 4844660873204176021L), (int)yn.a(19758, 6273058401428363964L));
                    if (var3_3) break block16;
                }
                catch (Throwable v1) {
                    var6_4 = (reference)((yn.a(15876, 8678554599564323225L) - yn.a(32677, 4813111322495346737L) + yn.a(21336, 8667307122119886069L)) * yn.a(8230, 6418587631091464081L) ^ yn.a(22699, 6066793112779181862L));
                }
lbl31:
                // 2 sources

                var6_4 = (reference)(yn.a(25473, 5517484128465089632L) - yn.a(15754, 7238971311733516819L) - yn.a(26984, 9208596112063331974L) - yn.a(2510, 5265262134057344584L) + yn.a(1779, 245666785717293411L));
                if (!var3_3) ** GOTO lbl47
                ** GOTO lbl46
                switch (var6_4) {
                    default: {
                        var5_6 = v1;
                        hi.a("G", (Object)var4_5, (long)1318854674658491067L);
                        throw var5_6;
                    }
                    case 1646891164: 
                }
                return;
            }
            block14: while (true) {
                hi.a("G", (Object)var4_5, (long)1318854674658491067L);
lbl46:
                // 2 sources

                var6_4 = (reference)((yn.a(13797, 4827195655196713578L) + yn.a(19732, 6799401686448986767L)) * yn.a(29182, 9038501983650408011L) ^ yn.a(18304, 1840846638333317163L));
lbl47:
                // 3 sources

                block15: while (true) {
                    switch (var6_4) {
                        default: {
                            continue block13;
                        }
                        case 1853162204: {
                            continue block14;
                        }
                        case 1853162206: {
                            hi.a("G", (long)0L, (float)2.0f, (float)10.0f, (float)2.0f, (float)0.0f, (int)1, (long)375734786785774161L);
                            hi.a("G", (double)2.0, (long)1273198203909826830L);
                            var6_4 = yn.b("k13T2dQ6PdAiKQBy", max(int int ), (int)yn.a(7462, 2207943300893182602L), (int)yn.a(22815, 5445085838587580058L)) - yn.a(28121, 1119794881473772112L);
                            continue block15;
                        }
                        case 1853162203: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    public yn(int n) {
        hi.a("\u00f2", (Object)this, (int)0, (long)1042127092841899537L);
        hi.a("\u00f2", (Object)this, (int)0, (long)1024327326544919270L);
        hi.a("\u00f2", (Object)this, (int)0, (long)636688756290691241L);
        this.i = yn.b("k13T2dQ6PdAiKQBy", fromNamespaceAndPath(java.lang.String java.lang.String ), (String)yn.a(11324, 26938), (String)(yn.a(11322, 60) + (int)hi.a("\u00a5", (Object)hi.a("j", (long)699104067325467623L), (long)921329526900247059L)));
        this.T = yn.b("k13T2dQ6PdAiKQBy", fromNamespaceAndPath(java.lang.String java.lang.String ), (String)yn.a(11323, 10528), (String)(yn.a(11327, 6485) + (int)hi.a("\u00a5", (Object)hi.a("j", (long)699104067325467623L), (long)921329526900247059L)));
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), yn::lambda$new$0, (int)5, (Object)hi.a("j", (long)653104695922825474L), (int)yn.a(19758, 6273058401428363964L), (int)yn.a(19758, 6273058401428363964L), (int)1, (int)1, (long)1064052014558428045L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), yn::lambda$new$1, (int)5, (Object)hi.a("j", (long)653104695922825474L), (int)yn.a(19758, 6273058401428363964L), (int)yn.a(19758, 6273058401428363964L), (int)1, (int)1, (long)1064052014558428045L);
        CallSite callSite3 = hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), (Object)callSite, (long)945219191554763342L);
        CallSite callSite4 = hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), (Object)hi.a("j", (long)712572987024995497L), (Object)hi.a("j", (long)712572987024995497L), (Object)hi.a("j", (long)1088975585553782485L), (Object)hi.a("j", (long)1088975585553782485L), (int)1, (Object)hi.a("G", (long)421151000146399293L), (long)789031108339859886L);
        this.j = new y4((GpuTexture)callSite, (GpuTextureView)callSite3, (GpuSampler)callSite4);
        CallSite callSite5 = hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), (Object)callSite2, (long)945219191554763342L);
        CallSite callSite6 = hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), (Object)hi.a("j", (long)712572987024995497L), (Object)hi.a("j", (long)712572987024995497L), (Object)hi.a("j", (long)1088975585553782485L), (Object)hi.a("j", (long)1088975585553782485L), (int)1, (Object)hi.a("G", (long)421151000146399293L), (long)789031108339859886L);
        this.f = new y4((GpuTexture)callSite2, (GpuTextureView)callSite5, (GpuSampler)callSite6);
        Object[] objectArray = new Object[2];
        objectArray[1] = -1;
        objectArray[0] = callSite;
        hi.a("G", (Object)objectArray, (long)1214820993985255932L);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = 0;
        objectArray2[0] = callSite2;
        hi.a("G", (Object)objectArray2, (long)1214820993985255932L);
        yn.b("k13T2dQ6PdAiKQBy", register(net.minecraft.resources.Identifier net.minecraft.client.renderer.texture.AbstractTexture ), (TextureManager)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1152294147867586175L), (Identifier)hi.a("\u00e9", (Object)this, (long)857984521196595002L), (AbstractTexture)hi.a("\u00e9", (Object)this, (long)718588955927733822L));
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1152294147867586175L), (Object)hi.a("\u00e9", (Object)this, (long)477894000440461305L), (Object)hi.a("\u00e9", (Object)this, (long)785669494267638356L), (long)490710308225590317L);
    }

    private static String lambda$new$1() {
        return yn.a(11325, -13147);
    }

    public static /* bridge */ /* synthetic */ CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public y4 s(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)785669494267638356L);
    }

    public y4 K() {
        return hi.a("\u00e9", (Object)this, (long)718588955927733822L);
    }

    public Identifier q(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)857984521196595002L);
    }

    public void E() {
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1152294147867586175L), (Object)hi.a("\u00e9", (Object)this, (long)857984521196595002L), (long)1241263594850878727L);
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1152294147867586175L), (Object)hi.a("\u00e9", (Object)this, (long)477894000440461305L), (long)1241263594850878727L);
    }

    public static int c() {
        return yn.a(19758, 6273058401428363964L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public nG l(Object[] var1_1) {
        block21: {
            block26: {
                block25: {
                    block24: {
                        var2_2 = (ij)var1_1[0];
                        var3_3 = Dl.S();
                        var9_4 /* !! */  = (yn.a(20896, 6356826299509655079L) / yn.a(2994, 2121796203126791257L) - yn.a(201, 2948668940194158426L)) / 2 - yn.a(29789, 5314325335667401665L) + yn.a(30710, 4776866258475475052L);
                        if (var3_3) ** GOTO lbl12
                        block15: while (true) {
                            block23: {
                                block22: {
                                    if (hi.a("\u00a5", (Object)var2_2, (long)1300041588912442121L) == null) break block22;
                                    var9_4 /* !! */  = (yn.a(26582, 4038760419627069556L) ^ yn.a(5627, 7791995884251808329L)) / yn.a(16897, 27060031570597361L) - yn.a(17611, 7147491393935594344L);
                                    if (var3_3) break block23;
                                }
                                var9_4 /* !! */  = yn.a(5448, 5369708159502418624L) / 3 + yn.a(16585, 4092583846455236408L);
                            }
                            switch (var9_4 /* !! */ ) {
                                default: {
                                    continue block15;
                                }
                                case 2094426363: {
                                    return null;
                                }
                                case 2094426362: {
                                    break block15;
                                }
                                case 2094426361: {
                                    hi.a("G", (int)yn.a(10039, 3705507277084766368L), (int)0, (long)737592949251754456L);
                                    hi.a("G", (long)712024856725125908L);
                                }
                            }
                            break;
                        }
                        var4_5 = hi.a("\u00a5", (Object)var2_2, (long)1167296375482403378L) + 4;
                        var5_6 = yn.b("k13T2dQ6PdAiKQBy", C5(), (ij)var2_2) + 4;
                        v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)1042127092841899537L) + var4_5;
                        v1 = yn.a(19758, 6273058401428363964L);
                        if (!var3_3) break block24;
                        if (v0 /* !! */  >= v1) break block25;
                        v0 /* !! */  = (reference)((yn.a(8614, 3137797927572747788L) ^ yn.a(7520, 2656159935467686636L)) - yn.a(5144, 8725755448737596400L) ^ yn.a(5501, 3506074721405240011L) ^ yn.a(23258, 2994939728397749602L));
                        v1 = yn.a(22610, 3605749546540093383L);
                    }
                    var9_4 /* !! */  = (int)(v0 /* !! */  + v1);
                    if (var3_3) break block26;
                }
                var9_4 /* !! */  = yn.a(9476, 7683005672531538656L) / yn.a(2263, 5114804738168790845L) / yn.a(2994, 2121796203126791257L) + yn.a(23294, 1412059386788433241L) ^ yn.a(21373, 6020365001043494086L) ^ yn.a(27988, 7925704251817655021L);
                if (var3_3) break block26;
                ** GOTO lbl64
lbl39:
                // 2 sources

                while (true) {
                    v2 /* !! */  = hi.a("\u00e9", (Object)this, (long)1024327326544919270L) + var5_6;
                    v3 = yn.a(19758, 6273058401428363964L);
                    if (!var3_3) ** GOTO lbl68
                    if (v2 /* !! */  < v3) ** GOTO lbl66
                    ** GOTO lbl70
                    break;
                }
            }
            block17: while (true) {
                switch (var9_4 /* !! */ ) {
                    default: {
                        hi.a("\u00f2", (Object)this, (int)0, (long)1042127092841899537L);
                        v4 = this;
                        hi.a("\u00f2", (Object)v4, (int)(hi.a("\u00e9", (Object)v4, (long)1024327326544919270L) + hi.a("\u00e9", (Object)this, (long)636688756290691241L)), (long)1024327326544919270L);
                        hi.a("\u00f2", (Object)this, (int)0, (long)636688756290691241L);
                        if (var3_3) ** GOTO lbl64
                        ** GOTO lbl39
                    }
                    case 1485656088: {
                        ** continue;
                    }
                    case 1485656090: {
                        var6_7 = hi.a("\u00e9", (Object)this, (long)1042127092841899537L) + 2;
                        var7_8 = hi.a("\u00e9", (Object)this, (long)1024327326544919270L) + 2;
                        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), (long)1321271933459544209L), (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)718588955927733822L), (long)1064845888571236229L), (Object)hi.a("\u00a5", (Object)var2_2, (long)1300041588912442121L), (int)0, (int)0, (int)var6_7, (int)var7_8, (int)hi.a("\u00a5", (Object)var2_2, (long)1167296375482403378L), (int)hi.a("\u00a5", (Object)var2_2, (long)811182367265474181L), (long)758795330550367668L);
                        if (!var3_3) ** GOTO lbl73
                        if (yn.b("k13T2dQ6PdAiKQBy", hR(), (ij)var2_2) == null) ** GOTO lbl72
                        ** GOTO lbl74
                    }
lbl64:
                    // 2 sources

                    var9_4 /* !! */  = ((yn.a(26636, 7456072722486099966L) ^ yn.a(20095, 5592755232366877143L)) - yn.a(17279, 7667784874961294545L) ^ yn.a(18298, 3458629128134578374L) ^ yn.a(4779, 1270268238544438552L)) + yn.a(26005, 9101002991542399521L);
                    if (var3_3) continue block17;
lbl66:
                    // 2 sources

                    v2 /* !! */  = (reference)(yn.a(12047, 7143979869303912606L) * yn.a(3773, 8611404231906498911L));
                    v3 = yn.a(2563, 420365554282405257L);
lbl68:
                    // 2 sources

                    var9_4 /* !! */  = (int)(v2 /* !! */  - v3);
                    if (var3_3) continue block17;
lbl70:
                    // 2 sources

                    var9_4 /* !! */  = (int)(hi.a("G", (int)(yn.a(16146, 6411372563892218107L) * yn.a(29556, 2416851844207568007L) - yn.a(10950, 323744963420568903L)), (int)yn.a(31858, 8304261836976942045L), (long)834203424483934088L) - yn.a(16228, 4396164599839336577L) + yn.a(29756, 405051001088959422L));
                    continue block17;
lbl72:
                    // 1 sources

                    var9_4 /* !! */  = (yn.a(2832, 9118132975883230352L) + yn.a(28043, 3012158572260293173L)) / 3 / yn.a(10856, 6395033254817840594L) - yn.a(19098, 1709835605726354718L);
lbl73:
                    // 2 sources

                    if (var3_3) break block21;
lbl74:
                    // 2 sources

                    var9_4 /* !! */  = (int)(hi.a("G", (int)yn.a(9186, 1413963155769799785L), (int)yn.a(29389, 8079785970931098984L), (long)834203424483934088L) + yn.a(6328, 3743272453303013137L) + yn.a(32163, 2345570746980297292L));
                    if (var3_3) break block21;
                    ** GOTO lbl99
                    case 1485656089: {
                        return null;
                    }
                    case 1485656091: 
                }
                break;
            }
            return null;
        }
        while (true) {
            block27: {
                switch (var9_4 /* !! */ ) {
                    default: {
                        yn.b("k13T2dQ6PdAiKQBy", writeToTexture(com.mojang.blaze3d.textures.GpuTexture java.nio.ByteBuffer int int int int int int ), (CommandEncoder)hi.a("\u00a5", (Object)hi.a("G", (long)1092604591448045776L), (long)1321271933459544209L), (GpuTexture)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)785669494267638356L), (long)1064845888571236229L), (ByteBuffer)hi.a("\u00a5", (Object)var2_2, (long)1233016722170857447L), (int)0, (int)0, (int)var6_7, (int)var7_8, (int)hi.a("\u00a5", (Object)var2_2, (long)1167296375482403378L), (int)hi.a("\u00a5", (Object)var2_2, (long)811182367265474181L));
                        if (var3_3) break block27;
                        ** GOTO lbl-1000
                    }
                    case -335194109: lbl-1000:
                    // 2 sources

                    {
                        var8_9 = new nG((float)var6_7 / 1024.0f, (float)var7_8 / 1024.0f, (float)(var6_7 + yn.b("k13T2dQ6PdAiKQBy", Cp(), (ij)var2_2)) / 1024.0f, (float)(var7_8 + hi.a("\u00a5", (Object)var2_2, (long)811182367265474181L)) / 1024.0f);
                        v5 = this;
                        hi.a("\u00f2", (Object)v5, (int)(hi.a("\u00e9", (Object)v5, (long)1042127092841899537L) + var4_5), (long)1042127092841899537L);
                        hi.a("\u00f2", (Object)this, (int)hi.a("G", (int)hi.a("\u00e9", (Object)this, (long)636688756290691241L), (int)var5_6, (long)834203424483934088L), (long)636688756290691241L);
                        return var8_9;
                    }
                    case -335194111: 
                }
                hi.a("G", (long)1029333450919054036L);
                hi.a("G", (long)713677872092862225L);
                return null;
            }
            var9_4 /* !! */  = (yn.a(6577, 396561845288144434L) + yn.a(2836, 4719791301293415562L)) / 3 / yn.a(18761, 1661424373408128726L) - yn.a(25252, 8577780403242038594L);
        }
    }

    private static String lambda$new$0() {
        return yn.a(11326, 10307);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x2C3F) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 233;
                case 1 -> 63;
                case 2 -> 140;
                case 3 -> 130;
                case 4 -> 226;
                case 5 -> 70;
                case 6 -> 46;
                case 7 -> 134;
                case 8 -> 114;
                case 9 -> 69;
                case 10 -> 118;
                case 11 -> 59;
                case 12 -> 65;
                case 13 -> 168;
                case 14 -> 235;
                case 15 -> 128;
                case 16 -> 67;
                case 17 -> 113;
                case 18 -> 28;
                case 19 -> 225;
                case 20 -> 170;
                case 21 -> 227;
                case 22 -> 209;
                case 23 -> 181;
                case 24 -> 103;
                case 25 -> 66;
                case 26 -> 53;
                case 27 -> 14;
                case 28 -> 37;
                case 29 -> 243;
                case 30 -> 165;
                case 31 -> 144;
                case 32 -> 93;
                case 33 -> 48;
                case 34 -> 55;
                case 35 -> 177;
                case 36 -> 249;
                case 37 -> 163;
                case 38 -> 229;
                case 39 -> 101;
                case 40 -> 217;
                case 41 -> 135;
                case 42 -> 13;
                case 43 -> 147;
                case 44 -> 117;
                case 45 -> 125;
                case 46 -> 251;
                case 47 -> 211;
                case 48 -> 146;
                case 49 -> 245;
                case 50 -> 11;
                case 51 -> 84;
                case 52 -> 154;
                case 53 -> 129;
                case 54 -> 185;
                case 55 -> 36;
                case 56 -> 88;
                case 57 -> 210;
                case 58 -> 82;
                case 59 -> 169;
                case 60 -> 137;
                case 61 -> 247;
                case 62 -> 223;
                case 63 -> 149;
                case 64 -> 22;
                case 65 -> 230;
                case 66 -> 244;
                case 67 -> 43;
                case 68 -> 162;
                case 69 -> 109;
                case 70 -> 58;
                case 71 -> 139;
                case 72 -> 30;
                case 73 -> 111;
                case 74 -> 76;
                case 75 -> 238;
                case 76 -> 54;
                case 77 -> 133;
                case 78 -> 47;
                case 79 -> 191;
                case 80 -> 252;
                case 81 -> 219;
                case 82 -> 131;
                case 83 -> 7;
                case 84 -> 85;
                case 85 -> 20;
                case 86 -> 216;
                case 87 -> 98;
                case 88 -> 100;
                case 89 -> 190;
                case 90 -> 26;
                case 91 -> 203;
                case 92 -> 182;
                case 93 -> 215;
                case 94 -> 160;
                case 95 -> 16;
                case 96 -> 102;
                case 97 -> 9;
                case 98 -> 242;
                case 99 -> 60;
                case 100 -> 115;
                case 101 -> 192;
                case 102 -> 15;
                case 103 -> 86;
                case 104 -> 73;
                case 105 -> 201;
                case 106 -> 159;
                case 107 -> 45;
                case 108 -> 174;
                case 109 -> 254;
                case 110 -> 123;
                case 111 -> 35;
                case 112 -> 51;
                case 113 -> 142;
                case 114 -> 212;
                case 115 -> 200;
                case 116 -> 213;
                case 117 -> 241;
                case 118 -> 197;
                case 119 -> 236;
                case 120 -> 38;
                case 121 -> 1;
                case 122 -> 32;
                case 123 -> 106;
                case 124 -> 152;
                case 125 -> 207;
                case 126 -> 105;
                case 127 -> 204;
                case 128 -> 39;
                case 129 -> 94;
                case 130 -> 186;
                case 131 -> 107;
                case 132 -> 188;
                case 133 -> 122;
                case 134 -> 44;
                case 135 -> 150;
                case 136 -> 124;
                case 137 -> 151;
                case 138 -> 255;
                case 139 -> 132;
                case 140 -> 24;
                case 141 -> 56;
                case 142 -> 120;
                case 143 -> 161;
                case 144 -> 17;
                case 145 -> 29;
                case 146 -> 224;
                case 147 -> 196;
                case 148 -> 8;
                case 149 -> 0;
                case 150 -> 90;
                case 151 -> 248;
                case 152 -> 202;
                case 153 -> 166;
                case 154 -> 179;
                case 155 -> 40;
                case 156 -> 222;
                case 157 -> 74;
                case 158 -> 158;
                case 159 -> 92;
                case 160 -> 87;
                case 161 -> 167;
                case 162 -> 12;
                case 163 -> 2;
                case 164 -> 218;
                case 165 -> 91;
                case 166 -> 42;
                case 167 -> 178;
                case 168 -> 95;
                case 169 -> 194;
                case 170 -> 187;
                case 171 -> 97;
                case 172 -> 199;
                case 173 -> 237;
                case 174 -> 72;
                case 175 -> 195;
                case 176 -> 80;
                case 177 -> 27;
                case 178 -> 138;
                case 179 -> 19;
                case 180 -> 193;
                case 181 -> 78;
                case 182 -> 71;
                case 183 -> 34;
                case 184 -> 239;
                case 185 -> 31;
                case 186 -> 62;
                case 187 -> 232;
                case 188 -> 77;
                case 189 -> 121;
                case 190 -> 171;
                case 191 -> 153;
                case 192 -> 126;
                case 193 -> 136;
                case 194 -> 183;
                case 195 -> 52;
                case 196 -> 141;
                case 197 -> 253;
                case 198 -> 104;
                case 199 -> 57;
                case 200 -> 205;
                case 201 -> 112;
                case 202 -> 25;
                case 203 -> 246;
                case 204 -> 79;
                case 205 -> 41;
                case 206 -> 175;
                case 207 -> 176;
                case 208 -> 21;
                case 209 -> 180;
                case 210 -> 164;
                case 211 -> 83;
                case 212 -> 81;
                case 213 -> 208;
                case 214 -> 116;
                case 215 -> 206;
                case 216 -> 23;
                case 217 -> 228;
                case 218 -> 33;
                case 219 -> 75;
                case 220 -> 234;
                case 221 -> 6;
                case 222 -> 250;
                case 223 -> 89;
                case 224 -> 64;
                case 225 -> 3;
                case 226 -> 184;
                case 227 -> 172;
                case 228 -> 4;
                case 229 -> 49;
                case 230 -> 189;
                case 231 -> 61;
                case 232 -> 119;
                case 233 -> 99;
                case 234 -> 231;
                case 235 -> 220;
                case 236 -> 18;
                case 237 -> 148;
                case 238 -> 110;
                case 239 -> 173;
                case 240 -> 108;
                case 241 -> 155;
                case 242 -> 156;
                case 243 -> 5;
                case 244 -> 145;
                case 245 -> 50;
                case 246 -> 127;
                case 247 -> 198;
                case 248 -> 143;
                case 249 -> 157;
                case 250 -> 221;
                case 251 -> 96;
                case 252 -> 10;
                case 253 -> 68;
                case 254 -> 240;
                default -> 214;
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
            yn.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17A0;
        if (g[n2] == null) {
            yn.g[n2] = (int)(e[n2] ^ l);
        }
        return g[n2];
    }
}
