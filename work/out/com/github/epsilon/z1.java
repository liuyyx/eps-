/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.GpuFormat
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.pipeline.RenderTarget
 *  com.mojang.blaze3d.pipeline.TextureTarget
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.resources.Identifier;

public class z1 {
    public static final z1 M;
    private static final int q;
    private static final Identifier D;
    private RenderPipeline u;
    private RenderTarget g;
    private static final Identifier r;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public void S(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)1229368878430606156L)}, (long)979634316504276495L);
    }

    public static /* bridge */ /* synthetic */ CallSite n(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "\u0014\u001c\u0093\u0082\u00c5\u009dc\u0011\u008c\u00d1H\u00ee\u00a6\u00a9\u009e \u008a\u0018\u0004\u00a0\u00d4P\u009a\u0010\u00f9l.\u008cr\\\u0095)R\u00d6\u0093\u000e\u00dd\u00a9\u00dd\u0080\t2\u009e\u0002\u00d3\u0094\u00b8\u001c5J\r\u00cf\u00a9x\u0002\u00db\u0006\u00a0\u00e1\u009d\u001c\u0017\u008e\u0012\u000f\u0091\u00e3\u00c0\u008d\u00cd\u00edD\u00d2\u00e7\u008cM\u00ef\u0099\u0097\u008c\b\u00fb\u00a8\u001f\u0015!gv ";
                        var12_3 = "\u0014\u001c\u0093\u0082\u00c5\u009dc\u0011\u008c\u00d1H\u00ee\u00a6\u00a9\u009e \u008a\u0018\u0004\u00a0\u00d4P\u009a\u0010\u00f9l.\u008cr\\\u0095)R\u00d6\u0093\u000e\u00dd\u00a9\u00dd\u0080\t2\u009e\u0002\u00d3\u0094\u00b8\u001c5J\r\u00cf\u00a9x\u0002\u00db\u0006\u00a0\u00e1\u009d\u001c\u0017\u008e\u0012\u000f\u0091\u00e3\u00c0\u008d\u00cd\u00edD\u00d2\u00e7\u008cM\u00ef\u0099\u0097\u008c\b\u00fb\u00a8\u001f\u0015!gv ".length();
                        var9_4 = 18;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 71;
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
                            var10_2 = "D\u00a1\u00c3o\u0095z3\u00b7\u00dc_\u0018e\f\u00ba\u00ca\u0092\u00c3\u00c4L\r\u0087\u00c3\u0089/>";
                            var12_3 = "D\u00a1\u00c3o\u0095z3\u00b7\u00dc_\u0018e\f\u00ba\u00ca\u0092\u00c3\u00c4L\r\u0087\u00c3\u0089/>".length();
                            var9_4 = 12;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 23;
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
                                    v15 = 66;
                                    break;
                                }
                                case 1: {
                                    v15 = 68;
                                    break;
                                }
                                case 2: {
                                    v15 = 104;
                                    break;
                                }
                                case 3: {
                                    v15 = 49;
                                    break;
                                }
                                case 4: {
                                    v15 = 100;
                                    break;
                                }
                                case 5: {
                                    v15 = 111;
                                    break;
                                }
                                default: {
                                    v15 = 119;
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
                z1.a = var13;
                z1.b = new String[9];
                var0_7 = 2488770068176930877L;
                var6_8 = new long[175];
                var3_9 = 0;
                var4_10 = "\u000f\u0091\u00da\u00c7\u00bel\u0016\u0093\u00bd\u001b@\u00f1\u00a1\u008cQ\u00b0\u00d8\u00f0;k`z\tL\u0005\u00ee\u00f0#m\u0083\u00e0=<!\u0012{Wj\u0086\u00ebV\u001e\u00d9\u00a1\u0094\u00b4\u00cdO\tD\u00abf7\u0015gJ\u00a4\u00f9-\u00ab?\u00f2\u0091\u00a4\u009f*\u00a1\"\u00aa\u0099\u00a8\u00bd\b\f\u00ebZ\u00ac\u00b6Hd\u00day\u00b5\u00d6Z-\u0003\u00ea0\u00f3r:\u0087\u00c6\u0087\u00e0W\u00c4t\u00eb\u00bb\u00a4\u00f2\u00fe\u001b\u009e\u0087E\u00be/o\u00ec\u00cf\u00eb\u009dx\u00b5\u00b8\u00d5K/\u00e9h\u0099X\u00fbx$\u001dZm\u0081\u0092\u00c1\u001a\u0013\u0017\u001b\u00ab\u0015Z@S0\u0011\u00c2a\u00c7\u0085\u008b\u00dd\u008b\u00cb\u00faX\u0088F\u0001\u00a7\u00bc(\t40N=\u009e\u008e\u001d\u0016\u0088\u00ec\u000b\u00bds\u000f\u0090'\u008e0\u001a\u00a7%\u001b\u001at\u0010\u009c\u00cd\u00fa\u00a5\u00f1?\u00a6\u00c8\u00ce)\u00a9\u00bf\u0081FjE\u00c63\u0002\u00f8\f\u00ffBc\u0016\u00b1\\\u0082\u00ca\u00df\"\u001b\u00e9\u00e7\u00d1\u00c9\u009cB\u001b\u00c2\u008fO+=\u00004\u00f0\u0099\u0001\u0094\u00aew\u008e\u00b8\u00f5\u00cb\u0006\u0003\u00ab9\u00b0\u00ec\u00be\u0000\u00c8\u0088\u00d8n\u00dc\u00eb\u00bdU\b\u00c2,\u008b\u00d9}\u00c8\u00ed\u009a\u0003{\u0093\u001b\u00c2\u00e0G\u00f3a\u00a1F\u00bb\u00cb\u0081\u0099]\u000eFk\u00dd\u0018\u00e5Y\u008bX\u001c]\u00ad\u00c6\u0095BS\u00a6\u00c3(/C\u00cb\u00adcXIo#\u00a7#|z\u00d8)&\u00fc\u00c8#Y{\u0017\\\u00b8\u0081Z3D\t\u0096\u0098\u00b3\u00cf\u00cdl\u00ae\u0082DJX\u009a\u009c\u00f4m\u00f5\u00dfK:\u00d5\u00eb\u00c3\u00db0%7(U\u00bc\u00e0\u00f2(\u001f\u00e1\u00ec3\u0016SP\u0090\u0086\u00f1\u00c0\u0000\u00cav\u00eepmZ8/\u0013\u008c\u00bd\u00b2NK\u0090\u00fb\u008d\u00abdH\u001d\u001c\u0014s\u0011\u00e6\u001c\u00e6\u0003\u00cd\u00f4\u00e7\u00d9\u00fb\u0003\u008a\u00b9\u0080\u0081\u0098\u00e11N<?\u00cd1\u008d6\u00d4\u00ce\u00b5\u00e7N!<\u008d-$Xv\u001f\u00cf\u00c2\u00c5\u0013.\u00f4\u00ecP\u00d8\u0007p\u00b2BT\u0084\u009c\u00c3\u0097O7\u00b2a3\u001d\u00f5}\u00f8\u00e8?>\u00e2\u008e\u0017\u0093N<\u0015\u00ff\u009b\u009a\u001b\u0014z\u00a0\u0089\u00db:@\u00d7\u0081HS\u008f\u00d2\u007fr\r\u0002\u009e\u0003<\u00a3I\u00b8\u00cb\r\u0094X\u00cf\u0095\u00bdg\u0018\u00c1Z\u00af\u0006\u00e7\u00b2^z\u007f5\u00d9\u00a8D\u00dc\u00f3\u00b1\u0098\u0082\u00e5I\u00ac\u0098\u00b1\u00c9%\u00dc\u00c9\u00c1\u001b\u00be\u00c6(W\u0092\u00fb\u0082\f9L\u0004\u00e1\u00fe\u0019\u001a\u00c3\u00da*\u00aaP\u00d0\u00d7\u00a9\u001e\u00a0\u00fb\u0000\u00c9\u00db'\u00ced\u00ae\u009f\u00c2\b\b\u00c7\u00ea\u00acm\u00c4a\u00d7;-\u0014\u00bf\u00fde\u00d1\u00a5\u00e4\u00b3U#\u00ae\f|\u007fr\u00a2-g)w\u0011\u0089\u00c0\u0086>\u001b7\u00c2\u00b8\u000bv\u00d45\u00a9\u008a\u00cfPm\u00e9\u0004\u00bf\u0091\u00ad\u00ea\u0085\u001d\u0006\u00f1\u00a0Ubi\u0007\u0019`H\u00ff\u009c\u0018na\u00fd\u008d\u00d5\u00c1\u00a71\u00e8ne\u0099f\u0097Rk2\u00ccT\u00acD\u001bla\u0097\u009a\u0018\u007f\u00f7^%?\u00f6\u00b3\u0082\u0089c\u00bd\f\u0000\u00c3\u009b\u00c3\u00b8\u00f3\u00e6fH\u00b4\u0012\u00ca\n Ghif\u0016\u008c0\u000bjUA\u0015\u00aaK\u001b\u0083\u0001\u00edWD\u00ed\u0017]y]\u00ef\r\u00da\u00af;t\u00a8\u00d6\u0083\u00b8C\u0093y_\u0093=\u00ea)\u00b3\u00ca%\u0016Su\u001b\u00b4anW\u00a1w\u00e8\u000fR\u00ae\u00c4\u0084\t\u0017-lv\u001fX\u00ea\u00bf\u00f7O\u00ad\u0000\u00cf\u00a3\u00f2T\u009fL\u0092\u0091\u00fc\f8v\u0097\u0098F\u00b6R\u00e2\u00be%_\u0007f1\u00ee\u00d0\u00eb\u00e3\u0083\u00fd,\u00e5T.\\\u00edC\u00cd\u0097\u00ea\u00cf\u00a7\u00b4<\u00deR&\u0015\u00be\u00b7[\u00dc\u00e4\u007f\u0086\u00b7}\u00c7@m\u0012\u00ae\u00f4z\u007f\u0094\u0086\u008b\u00c1hR\u00cd\u0088KJ\u00dd\u00a3\u00b6\u00b2\u00fbh>j\u00d8\u00bc\u009d\u00f0R\u00b2\u00d5\u00adM\u009aMA:\u0019\u00ec\u0087v\u0081\u00ff\u00de\u00cb',8\u00aa,$\u00de\\\u001d\u00ecR\u00e4ZH\u00ed\u0003\u00afoR\u0096\u00b7\u00b8y\u0093\b\u0017\u00e5\u00e3\u00cc\r+\u0097\u00ab\u00e1d\u00c1\u00e5iyT\u00d7\u00ae8K\u00b4\u00f5zI~\u007fVH\u0000}t\u009c\bFii\u00d7\u0090jg\u00a0\u00a4-8\u0091\u001f\u00b9\u00dd\u0087v\u00ad\u00cc\u00af-&\u00cfd\u008e3Q\u00b5n\u00e9\u00a3\u001aK\u0091\u0006\u0094\u001a\u00ab\u000b}`\u00be>\u00fc\u00a3{\u00c2_\u00ff{/\u000b)nB\u00e2\u001f\u0017\u0085\u008d\u008ba!|\u00ca\u00ff\u00d4\u0017l\u0017m\u00dc\u0016\u0080\u0097\u001a\u00ccM\u000e%\u00a2\u00fa\u00df\u0094\u00ef\u0015\u00d6f\u00c5\u00bc\u00fd\u00a0\u008cq\u00b3\u00daum\u0017>\u00b7\u00d2\u00b3\u00d8\u00dd\u00fb\u00ae_\u00e8u\u00f3\u009b\u0018F:\u009b8\u0083\u00abA\t\u0096=\u0018\u00f2\u00903h(:[\u0093\u00f5\u00ec\u00f8\u0093\u00d0\u00be<O\u00dbB\u00b7#\u00e7 1\u0087\u00bd\u00e9\u00ba\u008b\u0080\u00bb\u00c6\u00d7t\u00ecf\u0011k\u00d2X\u00e4\u00ec\u0010\u000f\u00a5#0\u00f0\u00c1e\u00c5\u00b1t\u00d0\u009e\u001c\u001b:4#?\u008d&u\u00ba\u009c\u00b1\u00d1X\u0081R\u00c0\u00fc*\u00a6\u0082Jg\u00d43e\u00f4\u00ad`\u00f9e\u00d9\u0085}\u00baM\u00b8\u00b4\u00162\u009a&6\u00ad\u0010\u00e8~|N!|\u00e9\u00d8P\u00b8\u00e8b\u00cd\u00f4x\u00eb\r\u00d9\u00db\u00a9\u00ce\u00c1p\u00e90\u00dd\u00a6\b\u00bd\u0098\u0097\u00c2V\u001a\u009e\u00cdA\u0006J\u001f\u0018a\u0018\u00b8:\u00d5n\u00de\u009b:\u0091B\u001d\u001c\u00a9mp*\u008a@\u00fd\u009c\u0015\u0095\u00cc\u00b1\u008b\u00c8\u008d'\u00e9\u00a0\u009f\u008e\u00a1(\nF\u0000\u00d8\u00ed\u0092*\u0089z\u000b\u00d1\u00fe\u0092\n\u000b\u00b1\u00bb\u00d5\u00eeJ\u00cd6x\u00c2\u00f4}C\u00a09#\u00c2*\u0014\u00a8\u00bf\u0013Z\u00ea\u00ebL2\u00a9\u00ee\u00d6\u00ea\u00c8[\u0094/E\u0005\u0016\u0010\u000e\u0003\u00cc\u00cd\u0006\u0080{\u0012;[\u00c0K\u00c8\u001c\u0086T\u00b1\u0007otS\u00d6$\u0007\u0007=\u0094\u000f(\u00f3\u00895\"d\u0097\u00f8\u00ad\u00a6\u008d\u001c\u00ae\u0093\u009e\nt\u00c6\u00acm;\u00bc\u00b9\u00cbJ\u00db\u00cd\u0018\u00c9\u008b\u00d0\u0003P@^\u009b\u0007\u00c9\u00ef\u00bcZo\u00af\u00ac\u00b2\u00f6\u00dc\u0004\u001c;\u00c5u\u00d8\u0010\u001a\u009a\u0097_\"\u00e5\u001aU\u00baT\u00bb\u00be\u009b/~\u0097";
                var5_11 = "\u000f\u0091\u00da\u00c7\u00bel\u0016\u0093\u00bd\u001b@\u00f1\u00a1\u008cQ\u00b0\u00d8\u00f0;k`z\tL\u0005\u00ee\u00f0#m\u0083\u00e0=<!\u0012{Wj\u0086\u00ebV\u001e\u00d9\u00a1\u0094\u00b4\u00cdO\tD\u00abf7\u0015gJ\u00a4\u00f9-\u00ab?\u00f2\u0091\u00a4\u009f*\u00a1\"\u00aa\u0099\u00a8\u00bd\b\f\u00ebZ\u00ac\u00b6Hd\u00day\u00b5\u00d6Z-\u0003\u00ea0\u00f3r:\u0087\u00c6\u0087\u00e0W\u00c4t\u00eb\u00bb\u00a4\u00f2\u00fe\u001b\u009e\u0087E\u00be/o\u00ec\u00cf\u00eb\u009dx\u00b5\u00b8\u00d5K/\u00e9h\u0099X\u00fbx$\u001dZm\u0081\u0092\u00c1\u001a\u0013\u0017\u001b\u00ab\u0015Z@S0\u0011\u00c2a\u00c7\u0085\u008b\u00dd\u008b\u00cb\u00faX\u0088F\u0001\u00a7\u00bc(\t40N=\u009e\u008e\u001d\u0016\u0088\u00ec\u000b\u00bds\u000f\u0090'\u008e0\u001a\u00a7%\u001b\u001at\u0010\u009c\u00cd\u00fa\u00a5\u00f1?\u00a6\u00c8\u00ce)\u00a9\u00bf\u0081FjE\u00c63\u0002\u00f8\f\u00ffBc\u0016\u00b1\\\u0082\u00ca\u00df\"\u001b\u00e9\u00e7\u00d1\u00c9\u009cB\u001b\u00c2\u008fO+=\u00004\u00f0\u0099\u0001\u0094\u00aew\u008e\u00b8\u00f5\u00cb\u0006\u0003\u00ab9\u00b0\u00ec\u00be\u0000\u00c8\u0088\u00d8n\u00dc\u00eb\u00bdU\b\u00c2,\u008b\u00d9}\u00c8\u00ed\u009a\u0003{\u0093\u001b\u00c2\u00e0G\u00f3a\u00a1F\u00bb\u00cb\u0081\u0099]\u000eFk\u00dd\u0018\u00e5Y\u008bX\u001c]\u00ad\u00c6\u0095BS\u00a6\u00c3(/C\u00cb\u00adcXIo#\u00a7#|z\u00d8)&\u00fc\u00c8#Y{\u0017\\\u00b8\u0081Z3D\t\u0096\u0098\u00b3\u00cf\u00cdl\u00ae\u0082DJX\u009a\u009c\u00f4m\u00f5\u00dfK:\u00d5\u00eb\u00c3\u00db0%7(U\u00bc\u00e0\u00f2(\u001f\u00e1\u00ec3\u0016SP\u0090\u0086\u00f1\u00c0\u0000\u00cav\u00eepmZ8/\u0013\u008c\u00bd\u00b2NK\u0090\u00fb\u008d\u00abdH\u001d\u001c\u0014s\u0011\u00e6\u001c\u00e6\u0003\u00cd\u00f4\u00e7\u00d9\u00fb\u0003\u008a\u00b9\u0080\u0081\u0098\u00e11N<?\u00cd1\u008d6\u00d4\u00ce\u00b5\u00e7N!<\u008d-$Xv\u001f\u00cf\u00c2\u00c5\u0013.\u00f4\u00ecP\u00d8\u0007p\u00b2BT\u0084\u009c\u00c3\u0097O7\u00b2a3\u001d\u00f5}\u00f8\u00e8?>\u00e2\u008e\u0017\u0093N<\u0015\u00ff\u009b\u009a\u001b\u0014z\u00a0\u0089\u00db:@\u00d7\u0081HS\u008f\u00d2\u007fr\r\u0002\u009e\u0003<\u00a3I\u00b8\u00cb\r\u0094X\u00cf\u0095\u00bdg\u0018\u00c1Z\u00af\u0006\u00e7\u00b2^z\u007f5\u00d9\u00a8D\u00dc\u00f3\u00b1\u0098\u0082\u00e5I\u00ac\u0098\u00b1\u00c9%\u00dc\u00c9\u00c1\u001b\u00be\u00c6(W\u0092\u00fb\u0082\f9L\u0004\u00e1\u00fe\u0019\u001a\u00c3\u00da*\u00aaP\u00d0\u00d7\u00a9\u001e\u00a0\u00fb\u0000\u00c9\u00db'\u00ced\u00ae\u009f\u00c2\b\b\u00c7\u00ea\u00acm\u00c4a\u00d7;-\u0014\u00bf\u00fde\u00d1\u00a5\u00e4\u00b3U#\u00ae\f|\u007fr\u00a2-g)w\u0011\u0089\u00c0\u0086>\u001b7\u00c2\u00b8\u000bv\u00d45\u00a9\u008a\u00cfPm\u00e9\u0004\u00bf\u0091\u00ad\u00ea\u0085\u001d\u0006\u00f1\u00a0Ubi\u0007\u0019`H\u00ff\u009c\u0018na\u00fd\u008d\u00d5\u00c1\u00a71\u00e8ne\u0099f\u0097Rk2\u00ccT\u00acD\u001bla\u0097\u009a\u0018\u007f\u00f7^%?\u00f6\u00b3\u0082\u0089c\u00bd\f\u0000\u00c3\u009b\u00c3\u00b8\u00f3\u00e6fH\u00b4\u0012\u00ca\n Ghif\u0016\u008c0\u000bjUA\u0015\u00aaK\u001b\u0083\u0001\u00edWD\u00ed\u0017]y]\u00ef\r\u00da\u00af;t\u00a8\u00d6\u0083\u00b8C\u0093y_\u0093=\u00ea)\u00b3\u00ca%\u0016Su\u001b\u00b4anW\u00a1w\u00e8\u000fR\u00ae\u00c4\u0084\t\u0017-lv\u001fX\u00ea\u00bf\u00f7O\u00ad\u0000\u00cf\u00a3\u00f2T\u009fL\u0092\u0091\u00fc\f8v\u0097\u0098F\u00b6R\u00e2\u00be%_\u0007f1\u00ee\u00d0\u00eb\u00e3\u0083\u00fd,\u00e5T.\\\u00edC\u00cd\u0097\u00ea\u00cf\u00a7\u00b4<\u00deR&\u0015\u00be\u00b7[\u00dc\u00e4\u007f\u0086\u00b7}\u00c7@m\u0012\u00ae\u00f4z\u007f\u0094\u0086\u008b\u00c1hR\u00cd\u0088KJ\u00dd\u00a3\u00b6\u00b2\u00fbh>j\u00d8\u00bc\u009d\u00f0R\u00b2\u00d5\u00adM\u009aMA:\u0019\u00ec\u0087v\u0081\u00ff\u00de\u00cb',8\u00aa,$\u00de\\\u001d\u00ecR\u00e4ZH\u00ed\u0003\u00afoR\u0096\u00b7\u00b8y\u0093\b\u0017\u00e5\u00e3\u00cc\r+\u0097\u00ab\u00e1d\u00c1\u00e5iyT\u00d7\u00ae8K\u00b4\u00f5zI~\u007fVH\u0000}t\u009c\bFii\u00d7\u0090jg\u00a0\u00a4-8\u0091\u001f\u00b9\u00dd\u0087v\u00ad\u00cc\u00af-&\u00cfd\u008e3Q\u00b5n\u00e9\u00a3\u001aK\u0091\u0006\u0094\u001a\u00ab\u000b}`\u00be>\u00fc\u00a3{\u00c2_\u00ff{/\u000b)nB\u00e2\u001f\u0017\u0085\u008d\u008ba!|\u00ca\u00ff\u00d4\u0017l\u0017m\u00dc\u0016\u0080\u0097\u001a\u00ccM\u000e%\u00a2\u00fa\u00df\u0094\u00ef\u0015\u00d6f\u00c5\u00bc\u00fd\u00a0\u008cq\u00b3\u00daum\u0017>\u00b7\u00d2\u00b3\u00d8\u00dd\u00fb\u00ae_\u00e8u\u00f3\u009b\u0018F:\u009b8\u0083\u00abA\t\u0096=\u0018\u00f2\u00903h(:[\u0093\u00f5\u00ec\u00f8\u0093\u00d0\u00be<O\u00dbB\u00b7#\u00e7 1\u0087\u00bd\u00e9\u00ba\u008b\u0080\u00bb\u00c6\u00d7t\u00ecf\u0011k\u00d2X\u00e4\u00ec\u0010\u000f\u00a5#0\u00f0\u00c1e\u00c5\u00b1t\u00d0\u009e\u001c\u001b:4#?\u008d&u\u00ba\u009c\u00b1\u00d1X\u0081R\u00c0\u00fc*\u00a6\u0082Jg\u00d43e\u00f4\u00ad`\u00f9e\u00d9\u0085}\u00baM\u00b8\u00b4\u00162\u009a&6\u00ad\u0010\u00e8~|N!|\u00e9\u00d8P\u00b8\u00e8b\u00cd\u00f4x\u00eb\r\u00d9\u00db\u00a9\u00ce\u00c1p\u00e90\u00dd\u00a6\b\u00bd\u0098\u0097\u00c2V\u001a\u009e\u00cdA\u0006J\u001f\u0018a\u0018\u00b8:\u00d5n\u00de\u009b:\u0091B\u001d\u001c\u00a9mp*\u008a@\u00fd\u009c\u0015\u0095\u00cc\u00b1\u008b\u00c8\u008d'\u00e9\u00a0\u009f\u008e\u00a1(\nF\u0000\u00d8\u00ed\u0092*\u0089z\u000b\u00d1\u00fe\u0092\n\u000b\u00b1\u00bb\u00d5\u00eeJ\u00cd6x\u00c2\u00f4}C\u00a09#\u00c2*\u0014\u00a8\u00bf\u0013Z\u00ea\u00ebL2\u00a9\u00ee\u00d6\u00ea\u00c8[\u0094/E\u0005\u0016\u0010\u000e\u0003\u00cc\u00cd\u0006\u0080{\u0012;[\u00c0K\u00c8\u001c\u0086T\u00b1\u0007otS\u00d6$\u0007\u0007=\u0094\u000f(\u00f3\u00895\"d\u0097\u00f8\u00ad\u00a6\u008d\u001c\u00ae\u0093\u009e\nt\u00c6\u00acm;\u00bc\u00b9\u00cbJ\u00db\u00cd\u0018\u00c9\u008b\u00d0\u0003P@^\u009b\u0007\u00c9\u00ef\u00bcZo\u00af\u00ac\u00b2\u00f6\u00dc\u0004\u001c;\u00c5u\u00d8\u0010\u001a\u009a\u0097_\"\u00e5\u001aU\u00baT\u00bb\u00be\u009b/~\u0097".length();
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
                    var4_10 = "\u00d2E\u0081R2\u000e\u00f0\u0090\u0015\u001f@\u0001F\u00e8\u00ed\u009f";
                    var5_11 = "\u00d2E\u0081R2\u000e\u00f0\u0090\u0015\u001f@\u0001F\u00e8\u00ed\u009f".length();
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
        z1.c = var6_8;
        z1.d = new Integer[175];
        z1.M = new z1();
        z1.r = hi.a("G", z1.a(-31448, -1438), (long)490867849634283930L);
        z1.D = z1.n("WvPzNarKeNUpxW6O", G(java.lang.String ), (String)z1.a(-31444, -12317));
        z1.q = (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)new Std140SizeCalculator(), (long)730172894715575436L), (long)764590848553612036L);
    }

    /*
     * Exception decompiling
     */
    public void B(Object[] var1_1) {
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

    private static String lambda$render$0() {
        return z1.a(-31446, 19486);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void f(Object[] var1_1) {
        block11: {
            block10: {
                block13: {
                    block12: {
                        var2_2 = Dl.S();
                        var3_3 = hi.a("G", (int)z1.a(18276, 91626023844172510L), (int)z1.a(4976, 7128289731414820500L), (long)834203424483934088L) + z1.a(4032, 1650044654115330760L);
                        if (var2_2) break block12;
lbl5:
                        // 2 sources

                        while (hi.a("\u00e9", (Object)this, (long)1311899699787561766L) == null) {
                            break block10;
                        }
                        break block13;
lbl8:
                        // 1 sources

                        while (true) {
                            hi.a("\u00f2", (Object)this, (RenderPipeline)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)z1.n("WvPzNarKeNUpxW6O", builder(com.mojang.blaze3d.pipeline.RenderPipeline$Snippet[] ), (RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{hi.a("j", (long)1310054174759614142L)}), (Object)hi.a("G", z1.a(-31447, 3589), (long)1218614314410685839L), (long)438264672872939574L), (Object)hi.a("j", (long)405507347804558870L), (long)1132382657535976613L), (Object)hi.a("j", (long)381173649354373410L), (long)700916747502292664L), (Object)hi.a("j", (long)1312078703351544896L), (long)717252947959573292L), (Object)hi.a("j", (long)697127477247188542L), (long)717252947959573292L), (boolean)false, (long)801787097910002170L), (long)974970866675039906L), (long)1311899699787561766L);
                            if (!var2_2) lbl-1000:
                            // 2 sources

                            {
                                return;
                            }
                            break block11;
                            break;
                        }
                    }
lbl15:
                    // 4 sources

                    while (true) {
                        switch (var3_3) {
                            default: {
                                ** GOTO lbl5
                            }
                            case -1762024353: {
                                ** continue;
                            }
                            case -1762024356: {
                                ** continue;
                            }
                            case -1762024355: 
                        }
                        hi.a("G", (long)801548298614655873L);
                        hi.a("G", (long)930884602760909661L);
                        return;
                    }
                }
                var3_3 = hi.a("G", (int)z1.a(20843, 8110018332657665095L), (int)z1.a(4566, 7578015147064296563L), (long)834203424483934088L) / z1.a(28088, 5450230531990059197L) * z1.a(1644, 6917341959808979803L) - z1.a(12700, 4175697210032497679L) + z1.a(15964, 8297417709162769320L);
                if (var2_2) ** GOTO lbl15
            }
            var3_3 = (reference)(z1.a(3224, 3066950942355003653L) / z1.a(5730, 4853562264846009322L) + z1.a(10373, 7189755667632078159L));
            if (var2_2) ** GOTO lbl15
        }
        var3_3 = hi.a("G", (int)z1.a(10340, 4974480149229813197L), (int)z1.a(28687, 1353047074802558270L), (long)834203424483934088L) / z1.a(14224, 4739258466649318013L) * z1.a(29782, 4145443261964640725L) - z1.a(6934, 4433602294790819356L) + z1.a(19851, 7213989367674984509L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void e(Object[] var1_1) {
        block17: {
            block16: {
                block15: {
                    block13: {
                        block14: {
                            var2_2 = var1_1[0];
                            var3_3 = Dl.t();
                            var6_4 /* !! */  = (z1.a(1551, 3724204957138490248L) ^ z1.a(31789, 6264592328672864731L) ^ z1.a(9116, 8136877051278145129L)) / 2 - z1.a(864, 6390549192977454785L);
                            if (var3_3) break block13;
                            v0 = var6_4 /* !! */ ;
                            if (var3_3) break block14;
                            switch (v0) {
                                default: {
                                    break block13;
                                }
                                case 1674745062: {
                                    hi.a("G", (long)963057718638705759L);
                                    v0 = 1;
                                }
                            }
                        }
                        hi.a("G", (boolean)v0, (float)-5.0f, (long)499998531297741759L);
                    }
                    var4_5 = hi.a("\u00e9", (Object)((RenderTarget)var2_2), (long)1210422352401432666L);
                    var5_6 = hi.a("\u00e9", (Object)((RenderTarget)var2_2), (long)562886578875678956L);
                    if (var3_3) break block15;
                    if (hi.a("\u00e9", (Object)this, (long)779039779946094344L) == null) break block16;
                    var6_4 /* !! */  = (int)(z1.n("WvPzNarKeNUpxW6O", max(int int ), (int)(z1.a(14022, 8885457029439267641L) * z1.a(6683, 6345043266678394682L) + z1.a(17964, 7223394621874033614L)), (int)z1.a(23875, 7582374711099639909L)) + z1.a(19868, 3708343195319392312L) - z1.a(20889, 2364240874765173771L));
                }
                if (!var3_3) break block17;
            }
            var6_4 /* !! */  = (hi.a("G", (int)(z1.a(9721, 191925561153761325L) / 2), (int)z1.a(18332, 1963960967542231645L), (long)834203424483934088L) ^ z1.a(30426, 5503097797238645611L)) - z1.a(14358, 6394245995074104638L) - z1.a(7829, 7773067071844223802L);
            if (!var3_3) break block17;
            ** GOTO lbl56
lbl30:
            // 2 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)779039779946094344L), (long)1210422352401432666L);
                v2 /* !! */  = var4_5;
                if (var3_3) ** GOTO lbl60
                if (v1 /* !! */  != v2 /* !! */ ) ** GOTO lbl58
                ** GOTO lbl62
                break;
            }
        }
        block11: while (true) {
            switch (var6_4 /* !! */  ? 1 : 0) {
                default: {
                    hi.a("\u00f2", (Object)this, (RenderTarget)new TextureTarget(z1.a(-31443, 14622), (int)var4_5, (int)var5_6, false, (GpuFormat)hi.a("j", (long)916145123275436280L)), (long)779039779946094344L);
                    if (!var3_3) ** GOTO lbl56
                    ** GOTO lbl30
                }
                case -1165998310: {
                    ** continue;
                }
                case -1165998307: {
                    v3 /* !! */  = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)779039779946094344L), (long)562886578875678956L);
                    v4 /* !! */  = var5_6;
                    if (var3_3) ** GOTO lbl66
                    if (v3 /* !! */  == v4 /* !! */ ) ** GOTO lbl64
                    ** GOTO lbl68
                }
                case -1165998312: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)779039779946094344L), (int)var4_5, (int)var5_6, (long)1069240254110877265L);
                    if (var3_3) {
                        return;
                    }
                    ** GOTO lbl70
                }
lbl56:
                // 2 sources

                var6_4 /* !! */  = (int)(hi.a("G", (int)(z1.a(14216, 693656342331105872L) * z1.a(18055, 4408284809248559964L) + z1.a(2826, 5138706539275886138L)), (int)z1.a(2477, 1841977299412163633L), (long)834203424483934088L) + z1.a(11948, 1909797682275957583L) - z1.a(279, 5067492441173890264L));
                if (!var3_3) continue block11;
lbl58:
                // 2 sources

                v1 /* !! */  = (CallSite)((z1.a(11333, 907955396268702144L) + z1.a(7454, 7060756199266125971L)) * z1.a(25735, 3432200270129885552L));
                v2 /* !! */  = (CallSite)z1.a(17936, 5451973570998915890L);
lbl60:
                // 2 sources

                var6_4 /* !! */  = v1 /* !! */  ^ v2 /* !! */ ;
                if (!var3_3) continue block11;
lbl62:
                // 2 sources

                var6_4 /* !! */  = hi.a("G", (int)((z1.a(20093, 4512461819733433306L) ^ z1.a(15303, 4207541023185579538L)) / 2), (int)z1.a(29243, 8876705326362912677L), (long)834203424483934088L) ^ z1.a(4675, 608318958303184825L) ^ z1.a(20113, 4686346095824821028L);
                if (!var3_3) continue block11;
lbl64:
                // 2 sources

                v3 /* !! */  = (CallSite)((z1.a(24259, 2971637286674582526L) + z1.a(21770, 3373276539834843322L)) / z1.a(4550, 5659757121142752271L));
                v4 /* !! */  = (CallSite)z1.a(16069, 15417294111288316L);
lbl66:
                // 2 sources

                var6_4 /* !! */  = v3 /* !! */  ^ v4 /* !! */ ;
                if (!var3_3) continue block11;
lbl68:
                // 2 sources

                var6_4 /* !! */  = (z1.a(32071, 4971611042451056883L) + z1.a(3517, 4236741481995081789L)) * z1.a(6463, 6231348999583894657L) ^ z1.a(4951, 6222968845102679729L);
                if (!var3_3) continue block11;
lbl70:
                // 2 sources

                var6_4 /* !! */  = (z1.a(14753, 2409017995142212621L) + z1.a(11406, 3847123506762496338L)) / z1.a(31882, 4430456048551487827L) ^ z1.a(4143, 3085494815544706439L);
                continue block11;
                case -1165998311: {
                    return;
                }
                case -1165998309: 
            }
            break;
        }
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF852D) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 3;
                case 1 -> 229;
                case 2 -> 160;
                case 3 -> 49;
                case 4 -> 156;
                case 5 -> 177;
                case 6 -> 141;
                case 7 -> 6;
                case 8 -> 220;
                case 9 -> 59;
                case 10 -> 207;
                case 11 -> 195;
                case 12 -> 142;
                case 13 -> 17;
                case 14 -> 149;
                case 15 -> 221;
                case 16 -> 193;
                case 17 -> 202;
                case 18 -> 252;
                case 19 -> 97;
                case 20 -> 103;
                case 21 -> 201;
                case 22 -> 152;
                case 23 -> 86;
                case 24 -> 136;
                case 25 -> 175;
                case 26 -> 119;
                case 27 -> 244;
                case 28 -> 236;
                case 29 -> 188;
                case 30 -> 218;
                case 31 -> 240;
                case 32 -> 79;
                case 33 -> 182;
                case 34 -> 81;
                case 35 -> 137;
                case 36 -> 14;
                case 37 -> 248;
                case 38 -> 147;
                case 39 -> 82;
                case 40 -> 77;
                case 41 -> 148;
                case 42 -> 132;
                case 43 -> 134;
                case 44 -> 98;
                case 45 -> 26;
                case 46 -> 8;
                case 47 -> 88;
                case 48 -> 185;
                case 49 -> 83;
                case 50 -> 5;
                case 51 -> 104;
                case 52 -> 1;
                case 53 -> 180;
                case 54 -> 176;
                case 55 -> 224;
                case 56 -> 71;
                case 57 -> 16;
                case 58 -> 146;
                case 59 -> 43;
                case 60 -> 41;
                case 61 -> 238;
                case 62 -> 68;
                case 63 -> 47;
                case 64 -> 64;
                case 65 -> 76;
                case 66 -> 210;
                case 67 -> 233;
                case 68 -> 20;
                case 69 -> 15;
                case 70 -> 186;
                case 71 -> 253;
                case 72 -> 120;
                case 73 -> 235;
                case 74 -> 133;
                case 75 -> 34;
                case 76 -> 10;
                case 77 -> 208;
                case 78 -> 70;
                case 79 -> 154;
                case 80 -> 226;
                case 81 -> 135;
                case 82 -> 40;
                case 83 -> 150;
                case 84 -> 60;
                case 85 -> 164;
                case 86 -> 213;
                case 87 -> 91;
                case 88 -> 169;
                case 89 -> 118;
                case 90 -> 190;
                case 91 -> 173;
                case 92 -> 99;
                case 93 -> 241;
                case 94 -> 245;
                case 95 -> 197;
                case 96 -> 73;
                case 97 -> 100;
                case 98 -> 29;
                case 99 -> 7;
                case 100 -> 127;
                case 101 -> 124;
                case 102 -> 209;
                case 103 -> 87;
                case 104 -> 42;
                case 105 -> 19;
                case 106 -> 61;
                case 107 -> 242;
                case 108 -> 151;
                case 109 -> 53;
                case 110 -> 0;
                case 111 -> 38;
                case 112 -> 125;
                case 113 -> 198;
                case 114 -> 216;
                case 115 -> 130;
                case 116 -> 196;
                case 117 -> 247;
                case 118 -> 131;
                case 119 -> 36;
                case 120 -> 48;
                case 121 -> 2;
                case 122 -> 45;
                case 123 -> 140;
                case 124 -> 123;
                case 125 -> 237;
                case 126 -> 189;
                case 127 -> 199;
                case 128 -> 255;
                case 129 -> 145;
                case 130 -> 174;
                case 131 -> 179;
                case 132 -> 31;
                case 133 -> 57;
                case 134 -> 191;
                case 135 -> 121;
                case 136 -> 165;
                case 137 -> 215;
                case 138 -> 138;
                case 139 -> 187;
                case 140 -> 56;
                case 141 -> 102;
                case 142 -> 113;
                case 143 -> 44;
                case 144 -> 231;
                case 145 -> 33;
                case 146 -> 159;
                case 147 -> 158;
                case 148 -> 107;
                case 149 -> 126;
                case 150 -> 21;
                case 151 -> 192;
                case 152 -> 155;
                case 153 -> 84;
                case 154 -> 217;
                case 155 -> 39;
                case 156 -> 111;
                case 157 -> 183;
                case 158 -> 227;
                case 159 -> 52;
                case 160 -> 249;
                case 161 -> 251;
                case 162 -> 128;
                case 163 -> 167;
                case 164 -> 219;
                case 165 -> 32;
                case 166 -> 106;
                case 167 -> 13;
                case 168 -> 90;
                case 169 -> 23;
                case 170 -> 37;
                case 171 -> 109;
                case 172 -> 51;
                case 173 -> 112;
                case 174 -> 246;
                case 175 -> 108;
                case 176 -> 18;
                case 177 -> 72;
                case 178 -> 211;
                case 179 -> 254;
                case 180 -> 203;
                case 181 -> 67;
                case 182 -> 166;
                case 183 -> 205;
                case 184 -> 206;
                case 185 -> 115;
                case 186 -> 9;
                case 187 -> 200;
                case 188 -> 62;
                case 189 -> 232;
                case 190 -> 223;
                case 191 -> 50;
                case 192 -> 250;
                case 193 -> 101;
                case 194 -> 239;
                case 195 -> 4;
                case 196 -> 92;
                case 197 -> 74;
                case 198 -> 157;
                case 199 -> 172;
                case 200 -> 153;
                case 201 -> 234;
                case 202 -> 75;
                case 203 -> 24;
                case 204 -> 30;
                case 205 -> 116;
                case 206 -> 11;
                case 207 -> 85;
                case 208 -> 230;
                case 209 -> 89;
                case 210 -> 163;
                case 211 -> 80;
                case 212 -> 95;
                case 213 -> 143;
                case 214 -> 170;
                case 215 -> 243;
                case 216 -> 122;
                case 217 -> 66;
                case 218 -> 144;
                case 219 -> 54;
                case 220 -> 114;
                case 221 -> 225;
                case 222 -> 161;
                case 223 -> 63;
                case 224 -> 55;
                case 225 -> 204;
                case 226 -> 184;
                case 227 -> 168;
                case 228 -> 194;
                case 229 -> 35;
                case 230 -> 110;
                case 231 -> 46;
                case 232 -> 105;
                case 233 -> 181;
                case 234 -> 214;
                case 235 -> 228;
                case 236 -> 28;
                case 237 -> 178;
                case 238 -> 162;
                case 239 -> 93;
                case 240 -> 212;
                case 241 -> 171;
                case 242 -> 78;
                case 243 -> 22;
                case 244 -> 27;
                case 245 -> 58;
                case 246 -> 222;
                case 247 -> 25;
                case 248 -> 65;
                case 249 -> 12;
                case 250 -> 69;
                case 251 -> 96;
                case 252 -> 94;
                case 253 -> 117;
                case 254 -> 139;
                default -> 129;
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
            z1.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x15A8;
        if (d[n2] == null) {
            z1.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
