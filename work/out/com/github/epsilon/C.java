/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.ColorTargetState
 *  com.mojang.blaze3d.pipeline.DepthStencilState
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.CompareOp
 *  net.minecraft.client.renderer.chunk.ChunkSectionLayer
 *  net.minecraft.client.renderer.rendertype.OutputTarget
 *  net.minecraft.client.renderer.rendertype.RenderSetup$RenderSetupBuilder
 *  net.minecraft.client.renderer.rendertype.RenderType
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 *  net.minecraft.client.resources.model.geometry.BakedQuad
 *  net.minecraft.client.resources.model.geometry.BakedQuad$MaterialInfo
 *  net.minecraft.core.Direction
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.player.Player
 *  org.joml.Vector3fc
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xn;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.rendertype.OutputTarget;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import org.joml.Vector3fc;

public class C
extends e {
    private final Xn y = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.C.b(13499, -21425), (boolean)true, (long)1230617056439551805L);
    private final Xn B;
    private static final RenderPipeline l;
    private static final ThreadLocal<Boolean> c;
    private static final Function<Identifier, RenderType> u;
    private final Xn C;
    private static final Function<Identifier, RenderType> H;
    private static final RenderPipeline L;
    public static final C S;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public List W(Object[] var1_1) {
        block13: {
            var2_2 = (List)var1_1[0];
            var3_3 = (C)var1_1[1];
            var4_4 = Dl.S();
            var10_5 /* !! */  = com.github.epsilon.C.c(31491, 4952325373103563975L) + com.github.epsilon.C.c(21210, 3979057892864445725L) - com.github.epsilon.C.c(15906, 2459053060174062009L);
            if (var4_4) break block13;
lbl7:
            // 2 sources

            while (true) {
                block14: {
                    var5_6 = new ArrayList<E>((int)hi.a("\u00a5", (Object)var2_2, (long)417939159730395915L));
                    var6_7 = hi.a("\u00a5", (Object)var2_2, (long)1240653736693366367L);
                    if (!var4_4) break block14;
                    var10_5 /* !! */  = com.github.epsilon.C.c(10776, 3270671070715131354L) - com.github.epsilon.C.c(8866, 4391564948866022708L) - com.github.epsilon.C.c(20221, 5473581649477980538L) - com.github.epsilon.C.c(22915, 2556580450458125905L);
                    if (var4_4) ** GOTO lbl35
                    ** GOTO lbl19
                }
lbl15:
                // 2 sources

                while (true) {
                    block16: {
                        block15: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)var6_7, (long)984088978567310565L);
                            if (!var4_4) break block15;
                            if (v0 /* !! */  != false) break block16;
lbl19:
                            // 2 sources

                            v0 /* !! */  = (CallSite)(hi.a("G", (int)hi.a("G", (int)com.github.epsilon.C.c(25649, 7852165198756248549L), (int)com.github.epsilon.C.c(27241, 1675044863905265090L), (long)834203424483934088L), (int)com.github.epsilon.C.c(12198, 5156145442741399610L), (long)834203424483934088L) ^ com.github.epsilon.C.c(7481, 3588604904341209830L));
                        }
                        var10_5 /* !! */  = (int)v0 /* !! */ ;
                        if (var4_4) ** GOTO lbl35
                    }
                    var10_5 /* !! */  = com.github.epsilon.C.c(19133, 2174092574460400993L) * com.github.epsilon.C.c(30937, 8688892058495641361L) ^ com.github.epsilon.C.c(11401, 8889230584063144737L);
                    if (true) ** GOTO lbl35
                    break;
                }
                block10: while (true) {
                    var7_8 = (BakedQuad)hi.a("\u00a5", (Object)var6_7, (long)470012372636416268L);
                    var8_9 = hi.a("\u00a5", (Object)var7_8, (long)928867034119722364L);
                    var9_10 = new BakedQuad.MaterialInfo((TextureAtlasSprite)hi.a("\u00a5", (Object)var8_9, (long)506913434598779867L), (ChunkSectionLayer)hi.a("\u00a5", (Object)var8_9, (long)681964939444162299L), (RenderType)hi.a("\u00a5", (Object)var3_3, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var8_9, (long)506913434598779867L), (long)1003135347370256301L)}, (long)988032337477797627L), (int)hi.a("\u00a5", (Object)var8_9, (long)442635368724150555L), (boolean)hi.a("\u00a5", (Object)var8_9, (long)578482519514755816L), (int)hi.a("\u00a5", (Object)var8_9, (long)1015701075173332610L));
                    hi.a("\u00a5", var5_6, (Object)new BakedQuad((Vector3fc)com.github.epsilon.C.b("skvCcpSYYWAAcbYi", position0(), (BakedQuad)var7_8), (Vector3fc)hi.a("\u00a5", (Object)var7_8, (long)1066605473134335609L), (Vector3fc)hi.a("\u00a5", (Object)var7_8, (long)783374481220231458L), (Vector3fc)hi.a("\u00a5", (Object)var7_8, (long)735992362368960913L), (long)com.github.epsilon.C.b("skvCcpSYYWAAcbYi", packedUV0(), (BakedQuad)var7_8), (long)hi.a("\u00a5", (Object)var7_8, (long)897393708438802105L), (long)hi.a("\u00a5", (Object)var7_8, (long)1180496205187279176L), (long)hi.a("\u00a5", (Object)var7_8, (long)1066732625444776027L), (Direction)hi.a("\u00a5", (Object)var7_8, (long)878280493282285225L), var9_10), (long)615358212536192384L);
                    if (!var4_4) {
                        return var5_6;
                    }
                    var10_5 /* !! */  = com.github.epsilon.C.c(14226, 8469801021262833689L) - com.github.epsilon.C.c(22399, 6487184016707209439L) - com.github.epsilon.C.c(11308, 4059412598499718031L) - com.github.epsilon.C.c(22641, 4443092789146372002L);
lbl35:
                    // 4 sources

                    switch (var10_5 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -365510774: {
                            hi.a("G", (long)1326027102069805806L);
                            hi.a("G", (long)850375381118395903L);
                            continue block10;
                        }
                        case -365510772: {
                            continue block10;
                        }
                        case -365510773: 
                    }
                    break;
                }
                return var5_6;
            }
        }
        while (true) {
            switch (var10_5 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 2092315293: 
            }
            hi.a("G", (long)964250018269559427L);
            var10_5 /* !! */  = com.github.epsilon.C.c(1259, 7735483589589539678L) + com.github.epsilon.C.c(4177, 6010761312697454472L) - com.github.epsilon.C.c(17079, 3863704727956020527L);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[13];
                        var11_1 = 0;
                        var10_2 = "\u00dfZ\u00a6\u008c\u00d3\u000f\u00e7Bbo\u00bd\f\u009400<\u00e9i\u00d4\u00f1N\u00db\u00cf\u00a2\u00e6J\u00eb\u00e5bU\u0005\u00ba\u00ea\u00fa\u0085\u0017\u0006\u00d1\u00ab\u0093\u00b3\u00b9\u00ad\u0011\u00f3\u0097\u0091\u0090\u001aR\u009c\u0018\u00b3E[\\\u00f6b\u00a8\u0088\u00d5\b\u00eb\u00fe=\u00c9\u00900\u00bdn\fX\u001e\u00d5\u009e\u00d7x\u00c2\u0090sE5,\u0007\u00f7C\" \u001a\u0095\u00eb\b\u00b9\u00ba\u0084\u00baJ\u00f9\u00c8\u00b8\b\u00ac\u0005&M\u001e\u0007Bg\f\u0089z\u00ef\u0012\u0090\u00e9*\u00a2n\u0003\u0096\u00e4'\u00af\u008a\u001c\u00a0\u00e7\u0001a\u007f\u00f4\u00a4\u00f4X<h\u00d2\u00d6`\u00c0\u00ba\u008c\u00d2y\u00ad\u0014\u000b\u00fc\u00ea\u0012J\u00d05\u0098\u00eei\u00a7\u00d1\u001e\u00bc\u00ae";
                        var12_3 = "\u00dfZ\u00a6\u008c\u00d3\u000f\u00e7Bbo\u00bd\f\u009400<\u00e9i\u00d4\u00f1N\u00db\u00cf\u00a2\u00e6J\u00eb\u00e5bU\u0005\u00ba\u00ea\u00fa\u0085\u0017\u0006\u00d1\u00ab\u0093\u00b3\u00b9\u00ad\u0011\u00f3\u0097\u0091\u0090\u001aR\u009c\u0018\u00b3E[\\\u00f6b\u00a8\u0088\u00d5\b\u00eb\u00fe=\u00c9\u00900\u00bdn\fX\u001e\u00d5\u009e\u00d7x\u00c2\u0090sE5,\u0007\u00f7C\" \u001a\u0095\u00eb\b\u00b9\u00ba\u0084\u00baJ\u00f9\u00c8\u00b8\b\u00ac\u0005&M\u001e\u0007Bg\f\u0089z\u00ef\u0012\u0090\u00e9*\u00a2n\u0003\u0096\u00e4'\u00af\u008a\u001c\u00a0\u00e7\u0001a\u007f\u00f4\u00a4\u00f4X<h\u00d2\u00d6`\u00c0\u00ba\u008c\u00d2y\u00ad\u0014\u000b\u00fc\u00ea\u0012J\u00d05\u0098\u00eei\u00a7\u00d1\u001e\u00bc\u00ae".length();
                        var9_4 = 30;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 106;
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
                            var10_2 = "\u00e4\u00d7\u001fa\u00edSJ_\u00fb\u00ca\u007f\u00ff'\u00f6\u00dbo+\u0091\u00a3P\u00c6\u0090\u00db:\u00f4\u0087/\u0080\u00cf\u0014\u00ab\u00a7BY%\u00dfS2\u0092\u0011U\u00f4\u00fb\u00db\u00cep\u0088\u00da\u0005\u00ba";
                            var12_3 = "\u00e4\u00d7\u001fa\u00edSJ_\u00fb\u00ca\u007f\u00ff'\u00f6\u00dbo+\u0091\u00a3P\u00c6\u0090\u00db:\u00f4\u0087/\u0080\u00cf\u0014\u00ab\u00a7BY%\u00dfS2\u0092\u0011U\u00f4\u00fb\u00db\u00cep\u0088\u00da\u0005\u00ba".length();
                            var9_4 = 29;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 97;
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
                                    v15 = 94;
                                    break;
                                }
                                case 1: {
                                    v15 = 21;
                                    break;
                                }
                                case 2: {
                                    v15 = 11;
                                    break;
                                }
                                case 3: {
                                    v15 = 85;
                                    break;
                                }
                                case 4: {
                                    v15 = 48;
                                    break;
                                }
                                case 5: {
                                    v15 = 56;
                                    break;
                                }
                                default: {
                                    v15 = 51;
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
                com.github.epsilon.C.a = var13;
                com.github.epsilon.C.b = new String[13];
                var0_7 = 5591189915479316192L;
                var6_8 = new long[99];
                var3_9 = 0;
                var4_10 = "\u007fr3\u00c5\u0097\\\u009f\u00fc /x\u0090Z\u0001\u00e2\u00b0E\u008e6'Kz\u00a4\u00f8S0\u00a8\u00a8lU\u00e0&\u00e7\u00f6\u00eb\u00f2rz\u00eb\u000b\u00ae\u000e\u00e1\u000e\u0092\u00c3\u008em?Q\u00fe\u00cb\u0013\u00fb\u00a8\u00fb\"\u00c5\u00f0\u0006\u00c2c\u00e0\u00f7\u00e2\u00b7l\u00a8\u0093\u00b0\"k\u008ar\u00d1j]O\u00eaJ-u|o\u00b9\u00b7k\u00c7A9/R/\u008fu\u0013\u00fdN\u0087\u0004\u009b\u009c\u00f1\u0006\u00c3<\u0092\u00c3\u0017I!\u009d\u008c\u00e1p\u00cdE\u00f5\u00cb\u00bejN\u001d\u00ae\u0004\u00c6\u00b7\u00de\u00ff\u00aa\u0081\u00c9\u00d8\u00da\u0001b\u0087PC\u0093\u00df\u00f1\u008a\u00c4w\u00eak\u00b9H5Y*\u00cf\u00a2\u00d6\u00be\u00fa\u009a\n\u00c3\u00cfpi\u0014=\u00be\b\u000fn(g\u00a2\u00ea\u00cb\u00e0\u00f1\u0081<\u00e2\n\u0013\u00a0\u00e2\u00d3\u00fd\u00d4!\u0098\u0082Ao)\u008d\u00f6\u00ad\u00ac,\u00d8\u0004\u0096\u00bf\u001c2\u00df\u00a7Wdk\u0080\u00c1u9\u009a\u0082\u00a81\u00f8V\u00da$\u00e4P.%\u00e6\u00a2w\u00e3?\u00d2hA\u0004:s\u0084\u00dc\u00c3V\u00c1\u0004\u001b\u0081\r\u00b3\u001d\u008b\u0094\u00c8.?\u00e5h\u00b2\"F\u00fd\u0010\u00c2\u00a55\u00a5\u008c\b|\u00b2,N\u00d8n\u00b9\u00cb\u0018\u00cae\u008a7\u00fc\u00e6\u0081\u00e5\u00af\u00fd\u00c3J\u0003\t^\u00f4]\u00d10\u00e5V\u00bf\u00f3\u00898\u00bf\u00d73uS\u000f\u00d9\u00b3\u0081r\u00c3\u00cc\u000f\u00d2[\u00de%kVTw\u00d5\u00c6\u00d8P\u0090\u008f\u00d9\u00e8\u00bc\u009d#iB\u00b5\u00a3q?\u008c\u001a\u00d4\u00e96_\u0019\u00e0\u00b2\u0094.\u0019{\u00b5J1\u0096\u00b4\u00d6\u001d7\u00d9]\u00da2H;\u00c5\u001b\u0018k\u0000\u0005\u0085\u00e2\u0098\u00f7xT\u00ef\u00b6a~\u0016\u008f\u00e6\u0017\u00e6\u00c3\u001cD\u00e0o\u0082\u00022\u00ea\u00d4\u0099 \u008f\u00a5`\u00ebI\b\u0084cr\u00cf\u0098\u00ce_Q\u00c9ZG\u00ddH.\u001c7\u00a8\u0003\u0006{\"\u0092$\u00f2\\\u00b6A,%\u0086W\u0095\u00b5v\u00f6\u001b\u00b5\u00ac\u0017\u00a1`>z\u0087\u009ax\u0098\u00cf\r\u00e2pA\u0007\u0014\u0015\u00da\u00de\u00e6\u00ba\u00d7\u00b2D\u0080\u00fd\u00ec\u00b0w\u00e1\u00a5\u00f2\u001ev\u0091c\u00ff\u0007\u0098\u00b6/\u008e7Z\u00a8\u00d7O2\u00b1\u00fe\u0080{\u00a6\u0018u\u0090\u00ca\u00c3\u00bc\u00fa\u00f0\n\u00de\u00f7\u00bf\u00d55#\u0004A\u00c6\u0014j\u00079E\u00c3\u00d0\u00bb\u00cda\u009f\u00adw\u000b\u0001\u00d5\u00e0'\u000foZr\u0013\u00e0\u00a5\u00daR\u00e8\u00a1\u0018\u0090\u00d9@(\u00f2m\u00ca]\u008c!\u0080\u00dd\u00f0\u00f5\u00fc\u00e79\"F\u0018\u00ab\u00dc=W\u00ba\u0011@\u0089N\u0097\u00e3\u00b5\u00fc]\u00d0V\u00c9L\u00a4s\u008d!85A\u0018O\u0092\u00b7'\u0012VI9\u00f6\u00e6L\u00d3\u00ed3?\u00bf\u00da\u00ecE\u00ec\u0012\u00fa(@H\"\u00d3\u00e2\u00b9\n\u00bf\u00be\r\u0080\u000e\u000fT\u00d5f@@7\u00e0}4\u0094u\u00b7\u00cds\u00a8\u00a9%\u00e1\u00b0\u00d3\u00df\u0002\u00c3C\u001f\r\u00dask\u00de\b\u00b7\u0006\u00b1(\u00a3\u00d6\u00e7\u0086>P\u00cb&\u00a7O\u00c1\u00f3?z\u00f4\u00fe\u0097\u00c2Q\u00dcv\u008bc\u00fe.*\u00e3~[\u00f6,>\u00e5\u00ba\u008cN\u00eb\u00ffr-MU\u00f9\u00daS\u00f9\\\u000b\u00d1\u00c1s\u00da\u0001\u00da\u00f6'\u0089\u00f7\u0005)\u00ad\u0084?\u00dc{0te\u0003\u0016@uB\u008e\u0007\u00b0\u0080}\u00d5\u00db7B\u00fcT0_\u00e8\u00d7K\u0088\u00b2\u00a9\u0096,\u00dd\u0094b\u00b3(\u00e58\u00a6F\u00a4d\u0018\u0014\u008d\u00b9Uy\u0007\u0007\u00a0\u0085A\u00b3\u0001";
                var5_11 = "\u007fr3\u00c5\u0097\\\u009f\u00fc /x\u0090Z\u0001\u00e2\u00b0E\u008e6'Kz\u00a4\u00f8S0\u00a8\u00a8lU\u00e0&\u00e7\u00f6\u00eb\u00f2rz\u00eb\u000b\u00ae\u000e\u00e1\u000e\u0092\u00c3\u008em?Q\u00fe\u00cb\u0013\u00fb\u00a8\u00fb\"\u00c5\u00f0\u0006\u00c2c\u00e0\u00f7\u00e2\u00b7l\u00a8\u0093\u00b0\"k\u008ar\u00d1j]O\u00eaJ-u|o\u00b9\u00b7k\u00c7A9/R/\u008fu\u0013\u00fdN\u0087\u0004\u009b\u009c\u00f1\u0006\u00c3<\u0092\u00c3\u0017I!\u009d\u008c\u00e1p\u00cdE\u00f5\u00cb\u00bejN\u001d\u00ae\u0004\u00c6\u00b7\u00de\u00ff\u00aa\u0081\u00c9\u00d8\u00da\u0001b\u0087PC\u0093\u00df\u00f1\u008a\u00c4w\u00eak\u00b9H5Y*\u00cf\u00a2\u00d6\u00be\u00fa\u009a\n\u00c3\u00cfpi\u0014=\u00be\b\u000fn(g\u00a2\u00ea\u00cb\u00e0\u00f1\u0081<\u00e2\n\u0013\u00a0\u00e2\u00d3\u00fd\u00d4!\u0098\u0082Ao)\u008d\u00f6\u00ad\u00ac,\u00d8\u0004\u0096\u00bf\u001c2\u00df\u00a7Wdk\u0080\u00c1u9\u009a\u0082\u00a81\u00f8V\u00da$\u00e4P.%\u00e6\u00a2w\u00e3?\u00d2hA\u0004:s\u0084\u00dc\u00c3V\u00c1\u0004\u001b\u0081\r\u00b3\u001d\u008b\u0094\u00c8.?\u00e5h\u00b2\"F\u00fd\u0010\u00c2\u00a55\u00a5\u008c\b|\u00b2,N\u00d8n\u00b9\u00cb\u0018\u00cae\u008a7\u00fc\u00e6\u0081\u00e5\u00af\u00fd\u00c3J\u0003\t^\u00f4]\u00d10\u00e5V\u00bf\u00f3\u00898\u00bf\u00d73uS\u000f\u00d9\u00b3\u0081r\u00c3\u00cc\u000f\u00d2[\u00de%kVTw\u00d5\u00c6\u00d8P\u0090\u008f\u00d9\u00e8\u00bc\u009d#iB\u00b5\u00a3q?\u008c\u001a\u00d4\u00e96_\u0019\u00e0\u00b2\u0094.\u0019{\u00b5J1\u0096\u00b4\u00d6\u001d7\u00d9]\u00da2H;\u00c5\u001b\u0018k\u0000\u0005\u0085\u00e2\u0098\u00f7xT\u00ef\u00b6a~\u0016\u008f\u00e6\u0017\u00e6\u00c3\u001cD\u00e0o\u0082\u00022\u00ea\u00d4\u0099 \u008f\u00a5`\u00ebI\b\u0084cr\u00cf\u0098\u00ce_Q\u00c9ZG\u00ddH.\u001c7\u00a8\u0003\u0006{\"\u0092$\u00f2\\\u00b6A,%\u0086W\u0095\u00b5v\u00f6\u001b\u00b5\u00ac\u0017\u00a1`>z\u0087\u009ax\u0098\u00cf\r\u00e2pA\u0007\u0014\u0015\u00da\u00de\u00e6\u00ba\u00d7\u00b2D\u0080\u00fd\u00ec\u00b0w\u00e1\u00a5\u00f2\u001ev\u0091c\u00ff\u0007\u0098\u00b6/\u008e7Z\u00a8\u00d7O2\u00b1\u00fe\u0080{\u00a6\u0018u\u0090\u00ca\u00c3\u00bc\u00fa\u00f0\n\u00de\u00f7\u00bf\u00d55#\u0004A\u00c6\u0014j\u00079E\u00c3\u00d0\u00bb\u00cda\u009f\u00adw\u000b\u0001\u00d5\u00e0'\u000foZr\u0013\u00e0\u00a5\u00daR\u00e8\u00a1\u0018\u0090\u00d9@(\u00f2m\u00ca]\u008c!\u0080\u00dd\u00f0\u00f5\u00fc\u00e79\"F\u0018\u00ab\u00dc=W\u00ba\u0011@\u0089N\u0097\u00e3\u00b5\u00fc]\u00d0V\u00c9L\u00a4s\u008d!85A\u0018O\u0092\u00b7'\u0012VI9\u00f6\u00e6L\u00d3\u00ed3?\u00bf\u00da\u00ecE\u00ec\u0012\u00fa(@H\"\u00d3\u00e2\u00b9\n\u00bf\u00be\r\u0080\u000e\u000fT\u00d5f@@7\u00e0}4\u0094u\u00b7\u00cds\u00a8\u00a9%\u00e1\u00b0\u00d3\u00df\u0002\u00c3C\u001f\r\u00dask\u00de\b\u00b7\u0006\u00b1(\u00a3\u00d6\u00e7\u0086>P\u00cb&\u00a7O\u00c1\u00f3?z\u00f4\u00fe\u0097\u00c2Q\u00dcv\u008bc\u00fe.*\u00e3~[\u00f6,>\u00e5\u00ba\u008cN\u00eb\u00ffr-MU\u00f9\u00daS\u00f9\\\u000b\u00d1\u00c1s\u00da\u0001\u00da\u00f6'\u0089\u00f7\u0005)\u00ad\u0084?\u00dc{0te\u0003\u0016@uB\u008e\u0007\u00b0\u0080}\u00d5\u00db7B\u00fcT0_\u00e8\u00d7K\u0088\u00b2\u00a9\u0096,\u00dd\u0094b\u00b3(\u00e58\u00a6F\u00a4d\u0018\u0014\u008d\u00b9Uy\u0007\u0007\u00a0\u0085A\u00b3\u0001".length();
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
                    var4_10 = "pN0\u008bI\u00a2\u0095\u00c7\u00d8~O\u0019$\u00ff\u00e2\u00c6";
                    var5_11 = "pN0\u008bI\u00a2\u0095\u00c7\u00d8~O\u0019$\u00ff\u00e2\u00c6".length();
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
        com.github.epsilon.C.d = var6_8;
        com.github.epsilon.C.e = new Integer[99];
        com.github.epsilon.C.S = new C();
        com.github.epsilon.C.l = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)475826230246413735L)}, (long)731833861383729593L), (Object)com.github.epsilon.C.b(13492, 739), (long)774963328677840218L), (Object)com.github.epsilon.C.b(13494, 21511), (float)0.1f, (long)1209296447843834126L), (Object)com.github.epsilon.C.b(13500, -20326), (long)1223091264084554469L), (Object)hi.a("j", (long)1047952436841905043L), (long)717252947959573292L), (Object)new ColorTargetState((BlendFunction)hi.a("j", (long)852805897089623173L)), (long)725018889764347121L), (boolean)false, (long)801787097910002170L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), true), (long)685240794813097508L), (long)974970866675039906L);
        com.github.epsilon.C.L = com.github.epsilon.C.b("skvCcpSYYWAAcbYi", build(), (RenderPipeline.Builder)com.github.epsilon.C.b("skvCcpSYYWAAcbYi", withDepthStencilState(com.mojang.blaze3d.pipeline.DepthStencilState ), (RenderPipeline.Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)1305370455260988660L)}, (long)731833861383729593L), (Object)com.github.epsilon.C.b(13493, 28349), (long)774963328677840218L), (Object)com.github.epsilon.C.b(13498, 26214), (float)0.1f, (long)1209296447843834126L), (Object)new ColorTargetState((BlendFunction)hi.a("j", (long)852805897089623173L)), (long)725018889764347121L), (DepthStencilState)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), true)));
        com.github.epsilon.C.u = hi.a("G", (Function<Identifier, RenderType>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(net.minecraft.resources.Identifier ), (Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;)(), (long)847646543443408438L);
        com.github.epsilon.C.H = hi.a("G", (Function<Identifier, RenderType>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$1(net.minecraft.resources.Identifier ), (Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;)(), (long)847646543443408438L);
        com.github.epsilon.C.c = hi.a("G", (Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$static$2(), ()Ljava/lang/Boolean;)(), (long)442080038558134342L);
    }

    private C() {
        super(com.github.epsilon.C.b(13502, 12030), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        String string = com.github.epsilon.C.b(13497, 31421);
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)477012699582306136L);
        hi.a("G", (Object)callSite, (long)374764797691957710L);
        this.B = hi.a("\u00a5", (Object)this, (Object)string, (boolean)true, ((Xn)((Object)callSite))::z, (long)1197648209052129808L);
        String string2 = com.github.epsilon.C.b(13501, 22080);
        CallSite callSite2 = hi.a("\u00e9", (Object)this, (long)477012699582306136L);
        hi.a("G", (Object)callSite2, (long)374764797691957710L);
        this.C = hi.a("\u00a5", (Object)this, (Object)string2, (boolean)true, ((Xn)((Object)callSite2))::z, (long)1197648209052129808L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean d(Object[] var1_1) {
        block34: {
            block33: {
                block36: {
                    block32: {
                        block30: {
                            block31: {
                                block29: {
                                    block27: {
                                        block28: {
                                            block26: {
                                                block24: {
                                                    block25: {
                                                        block35: {
                                                            var2_2 = (Player)var1_1[0];
                                                            var3_3 = Dl.t();
                                                            var4_4 /* !! */  = hi.a("G", (int)com.github.epsilon.C.c(16468, 327064773117861856L), (int)com.github.epsilon.C.c(14252, 4195614075730471028L), (long)834203424483934088L) + com.github.epsilon.C.c(14776, 8359616503284966917L);
                                                            if (!var3_3) break block35;
lbl6:
                                                            // 2 sources

                                                            while (true) {
                                                                v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1099153674733698693L);
                                                                if (var3_3) break block24;
                                                                if (v0 /* !! */  == false) break block25;
                                                                break block26;
                                                                break;
                                                            }
lbl11:
                                                            // 1 sources

                                                            while (true) {
                                                                hi.a("G", (boolean)false, (long)1096505374926936287L);
lbl14:
                                                                // 2 sources

                                                                while (true) {
                                                                    v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)477012699582306136L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                    if (var3_3) break block27;
                                                                    if (v1 /* !! */  == false) break block28;
                                                                    break block29;
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl19:
                                                            // 1 sources

                                                            while (true) {
                                                                v2 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)459902689127874748L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                if (var3_3) break block30;
                                                                if (v2 /* !! */  == false) break block31;
                                                                break block32;
                                                                break;
                                                            }
lbl24:
                                                            // 1 sources

                                                            while (var2_2 != hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)) {
                                                                break block33;
                                                            }
                                                            break block36;
lbl27:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl29:
                                                            // 1 sources

                                                            while (true) {
                                                                v3 = false;
                                                                if (var3_3) {
lbl33:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        hi.a("G", (long)613240806595753225L);
                                                                        v4 /* !! */  = 2;
                                                                        while (true) {
                                                                            hi.a("G", (int)v4 /* !! */ , (long)907855111017068855L);
lbl39:
                                                                            // 2 sources

                                                                            return v3;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                break block34;
                                                                break;
                                                            }
                                                        }
lbl43:
                                                        // 9 sources

                                                        while (true) {
                                                            switch (var4_4 /* !! */ ) {
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case -1052927958: {
                                                                    ** continue;
                                                                }
                                                                case -1052927957: {
                                                                    ** continue;
                                                                }
                                                                case -1052927956: {
                                                                    ** continue;
                                                                }
                                                                case -1052927954: {
                                                                    ** GOTO lbl24
                                                                }
                                                                case -1052927960: {
                                                                    ** continue;
                                                                }
                                                                ** case -1052927959:
lbl58:
                                                                // 1 sources

                                                                ** continue;
                                                            }
                                                            break;
                                                        }
lbl59:
                                                        // 2 sources

                                                        while (true) {
                                                            v4 /* !! */  = (int)var4_4 /* !! */ ;
                                                            if (var3_3) ** continue;
                                                            switch (v4 /* !! */ ) {
                                                                case 63157887: {
                                                                    ** continue;
                                                                }
                                                                ** default:
lbl66:
                                                                // 1 sources

                                                                ** continue;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    v0 /* !! */  = var4_4 /* !! */  = (CallSite)(com.github.epsilon.C.c(11698, 8363249257751818808L) / com.github.epsilon.C.c(31, 315128792205434800L) + com.github.epsilon.C.c(31533, 5520651711545533589L) + com.github.epsilon.C.c(22201, 2237087462227691812L) + com.github.epsilon.C.c(7137, 1017337627250787380L) ^ com.github.epsilon.C.c(10371, 3362005734776354671L));
                                                }
                                                if (!var3_3) ** GOTO lbl43
                                            }
                                            var4_4 /* !! */  = (CallSite)(com.github.epsilon.C.c(10396, 4357962879582353196L) + com.github.epsilon.C.c(24064, 4026665742904967631L) - com.github.epsilon.C.c(28514, 4266870416625103028L));
                                            if (!var3_3) ** GOTO lbl43
                                        }
                                        v1 /* !! */  = var4_4 /* !! */  = (CallSite)(com.github.epsilon.C.c(12501, 6025115145288068975L) / com.github.epsilon.C.c(31951, 2601734900130014078L) + com.github.epsilon.C.c(1052, 6638853660146506711L) + com.github.epsilon.C.c(16041, 1365208361135415603L) + com.github.epsilon.C.c(25341, 3166217658538261855L) ^ com.github.epsilon.C.c(27380, 1040014798785967441L));
                                    }
                                    if (!var3_3) ** GOTO lbl43
                                }
                                var4_4 /* !! */  = (CallSite)(com.github.epsilon.C.c(17567, 2918327215946128158L) / com.github.epsilon.C.c(2913, 547686497040864477L) / com.github.epsilon.C.c(15915, 206210322303590902L) + com.github.epsilon.C.c(26992, 5259389491780810398L) - com.github.epsilon.C.c(22047, 5782427008213731729L));
                                if (!var3_3) ** GOTO lbl43
                            }
                            v2 /* !! */  = var4_4 /* !! */  = (CallSite)(com.github.epsilon.C.c(12501, 6025115145288068975L) / com.github.epsilon.C.c(31951, 2601734900130014078L) + com.github.epsilon.C.c(1052, 6638853660146506711L) + com.github.epsilon.C.c(16041, 1365208361135415603L) + com.github.epsilon.C.c(25341, 3166217658538261855L) ^ com.github.epsilon.C.c(27380, 1040014798785967441L));
                        }
                        if (!var3_3) ** GOTO lbl43
                    }
                    var4_4 /* !! */  = (CallSite)((com.github.epsilon.C.c(12598, 5499830457295580815L) / 5 - com.github.epsilon.C.c(31162, 5515992774598190622L)) / com.github.epsilon.C.c(27540, 6350077595991143508L) - com.github.epsilon.C.c(3916, 3557156642981351561L) + com.github.epsilon.C.c(24258, 2325768253458497903L));
                    if (!var3_3) ** GOTO lbl43
                }
                var4_4 /* !! */  = (CallSite)(com.github.epsilon.C.c(12501, 6025115145288068975L) / com.github.epsilon.C.c(31951, 2601734900130014078L) + com.github.epsilon.C.c(1052, 6638853660146506711L) + com.github.epsilon.C.c(16041, 1365208361135415603L) + com.github.epsilon.C.c(25341, 3166217658538261855L) ^ com.github.epsilon.C.c(27380, 1040014798785967441L));
                if (!var3_3) ** GOTO lbl43
            }
            var4_4 /* !! */  = (CallSite)((com.github.epsilon.C.c(29977, 203455672466205324L) / com.github.epsilon.C.c(25294, 8031150895430040852L) * com.github.epsilon.C.c(11500, 3399298495901250336L) ^ com.github.epsilon.C.c(4523, 6628251259084967429L)) / com.github.epsilon.C.c(31951, 2601734900130014078L) + com.github.epsilon.C.c(13380, 6738582593426008965L));
            ** while (true)
            v3 = true;
            var4_4 /* !! */  = (CallSite)((com.github.epsilon.C.c(15861, 4875783680162013774L) / com.github.epsilon.C.c(24894, 6494226963466976942L) ^ com.github.epsilon.C.c(24344, 7359851484456829079L)) - com.github.epsilon.C.c(9854, 4933363406928427411L));
            if (!var3_3) ** GOTO lbl59
        }
        var4_4 /* !! */  = (CallSite)((com.github.epsilon.C.c(31091, 1973921842476967617L) / com.github.epsilon.C.c(24894, 6494226963466976942L) ^ com.github.epsilon.C.c(30496, 6619335849813665951L)) - com.github.epsilon.C.c(14418, 8569062363378886592L));
        ** while (true)
    }

    public RenderType x(Object[] objectArray) {
        Identifier identifier = (Identifier)objectArray[0];
        return (RenderType)hi.a("\u00a5", (Object)hi.a("j", (long)616836993112857094L), (Object)identifier, (long)1109315089994431641L);
    }

    public RenderType c(Object[] objectArray) {
        Identifier identifier = (Identifier)objectArray[0];
        return (RenderType)hi.a("\u00a5", (Object)hi.a("j", (long)1037883009481899737L), (Object)identifier, (long)1109315089994431641L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean I(Object[] var1_1) {
        block14: {
            block15: {
                block16: {
                    var2_2 = Dl.S();
                    var3_3 /* !! */  = (hi.a("G", (int)com.github.epsilon.C.c(8771, 2860875567229582730L), (int)com.github.epsilon.C.c(27245, 6980723116036453825L), (long)834203424483934088L) ^ com.github.epsilon.C.c(25435, 4834240146660293777L)) - com.github.epsilon.C.c(8642, 991444100568039016L) - com.github.epsilon.C.c(9731, 6715296793407109532L) + com.github.epsilon.C.c(23665, 5864807833819759551L);
                    if (var2_2) break block16;
lbl5:
                    // 2 sources

                    while (true) {
                        v0 = hi.a("\u00a5", (Object)this, (long)1099153674733698693L);
                        if (!var2_2) ** GOTO lbl52
                        if (v0 == false) ** GOTO lbl51
                        ** GOTO lbl54
                        break;
                    }
lbl10:
                    // 2 sources

                    while (true) {
                        v1 = true;
                        var3_3 /* !! */  = (com.github.epsilon.C.c(27167, 2422930330665547161L) - com.github.epsilon.C.c(21191, 3952918675734646085L)) * com.github.epsilon.C.c(25345, 4404223802072333471L) - com.github.epsilon.C.c(7408, 1302568363386405744L);
                        if (var2_2) break block14;
                        break block15;
                        break;
                    }
lbl15:
                    // 2 sources

                    while (true) {
                        hi.a("G", (long)661981318591720701L);
                        hi.a("G", (long)1035524593561344502L);
                        return v1;
                    }
                }
                block13: while (true) {
                    block22: {
                        block20: {
                            block21: {
                                block19: {
                                    block17: {
                                        block18: {
                                            switch (var3_3 /* !! */ ) {
                                                default: {
                                                    ** continue;
                                                }
                                                case -1927840521: {
                                                    v2 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)477012699582306136L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                    if (!var2_2) break block17;
                                                    if (v2 == false) break block18;
                                                    break block19;
                                                }
                                                case -1927840516: {
                                                    v3 = com.github.epsilon.C.b("skvCcpSYYWAAcbYi", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)559994982848704717L), (long)789438897355831922L)));
                                                    if (!var2_2) break block20;
                                                    if (v3 == false) break block21;
                                                    break block22;
                                                }
                                                case -1927840517: {
                                                    ** GOTO lbl10
                                                }
                                                case -1927840518: {
                                                    v1 = false;
                                                    if (var2_2) break block13;
                                                    ** GOTO lbl15
                                                }
                                                case -1927840520: {
                                                    hi.a("G", (long)919703241060757748L);
                                                    com.github.epsilon.C.b("skvCcpSYYWAAcbYi", P());
                                                    if (!var2_2) break;
                                                    ** continue;
                                                }
                                            }
lbl51:
                                            // 2 sources

                                            v0 = hi.a("G", (int)(com.github.epsilon.C.c(7319, 2807147339556553508L) ^ com.github.epsilon.C.c(11289, 953760124414145425L)), (int)com.github.epsilon.C.c(21047, 2806120912343322086L), (long)834203424483934088L) * com.github.epsilon.C.c(30651, 5277985916012161052L) - com.github.epsilon.C.c(15989, 6220527430041215480L);
lbl52:
                                            // 2 sources

                                            var3_3 /* !! */  = (int)v0;
                                            if (var2_2) continue;
lbl54:
                                            // 2 sources

                                            var3_3 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.C.c(18515, 3077555545344694215L), (int)com.github.epsilon.C.c(16453, 2518594914505514966L), (long)834203424483934088L) * com.github.epsilon.C.c(15272, 666170391139853355L) - com.github.epsilon.C.c(14622, 2323470917905032850L));
                                            if (var2_2) continue;
                                        }
                                        v2 = hi.a("G", (int)(com.github.epsilon.C.c(29654, 3921590303749499925L) ^ com.github.epsilon.C.c(5180, 8925911539386190741L)), (int)com.github.epsilon.C.c(23948, 6374610937884852778L), (long)834203424483934088L) * com.github.epsilon.C.c(15751, 788686564588692048L) - com.github.epsilon.C.c(14313, 606103126867945544L);
                                    }
                                    var3_3 /* !! */  = (int)v2;
                                    if (var2_2) continue;
                                }
                                var3_3 /* !! */  = hi.a("G", (int)(com.github.epsilon.C.c(31367, 1008328760913487153L) * com.github.epsilon.C.c(29655, 2988851443591212137L) - com.github.epsilon.C.c(9263, 2686896960285588457L) - com.github.epsilon.C.c(30893, 4845520290104960809L)), (int)com.github.epsilon.C.c(32115, 2119098577376797347L), (long)834203424483934088L) ^ com.github.epsilon.C.c(25122, 3930251550408932857L);
                                if (var2_2) continue;
                            }
                            v3 = com.github.epsilon.C.b("skvCcpSYYWAAcbYi", max(int int ), (int)(com.github.epsilon.C.c(29654, 3921590303749499925L) ^ com.github.epsilon.C.c(5180, 8925911539386190741L)), (int)com.github.epsilon.C.c(23948, 6374610937884852778L)) * com.github.epsilon.C.c(15751, 788686564588692048L) - com.github.epsilon.C.c(14313, 606103126867945544L);
                        }
                        var3_3 /* !! */  = (int)v3;
                        if (var2_2) continue;
                    }
                    var3_3 /* !! */  = (hi.a("G", (int)com.github.epsilon.C.c(1819, 6238480398300780758L), (int)com.github.epsilon.C.c(17938, 1393918850787531173L), (long)834203424483934088L) ^ com.github.epsilon.C.c(28284, 4455924259098718626L)) - com.github.epsilon.C.c(26342, 6939721450957764963L);
                }
            }
            var3_3 /* !! */  = (com.github.epsilon.C.c(24886, 7067705137093574319L) - com.github.epsilon.C.c(5919, 8968519038080485526L)) * com.github.epsilon.C.c(27877, 6473298701386347380L) - com.github.epsilon.C.c(17348, 5186220224705453139L);
        }
        switch (var3_3 /* !! */ ) {
            case 28418696: {
                ** continue;
            }
        }
        return v1;
    }

    public void z(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("j", (long)1213529935125772807L), (Object)hi.a("G", (boolean)true, (long)827866887164769227L), (long)885705605163192186L);
    }

    public boolean v(Object[] objectArray) {
        return (boolean)hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)1213529935125772807L), (long)416099483204829120L))), (long)1000026253634408124L);
    }

    public void k(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("j", (long)1213529935125772807L), (Object)hi.a("G", (boolean)false, (long)827866887164769227L), (long)885705605163192186L);
    }

    private static Boolean lambda$static$2() {
        return com.github.epsilon.C.b("skvCcpSYYWAAcbYi", valueOf(boolean ), (boolean)false);
    }

    private static RenderType lambda$static$0(Identifier identifier) {
        return hi.a("G", com.github.epsilon.C.b(13491, -3263), (Object)com.github.epsilon.C.b("skvCcpSYYWAAcbYi", createRenderSetup(), (RenderSetup.RenderSetupBuilder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)hi.a("j", (long)621692641334810616L), (long)1192842454365816254L), (Object)com.github.epsilon.C.b(13496, -25900), (Object)identifier, (long)1195566499667059605L), (long)1248967660070311785L), (long)1142738175070365527L), (long)1009971392143609077L), (long)868680327435086622L), (Object)hi.a("j", (long)734753797940705798L), (long)1210402519811945697L)), (long)1312096923321906450L);
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

    private static RenderType lambda$static$1(Identifier identifier) {
        return hi.a("G", com.github.epsilon.C.b(13503, -10223), (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)com.github.epsilon.C.b("skvCcpSYYWAAcbYi", affectsCrumbling(), (RenderSetup.RenderSetupBuilder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)com.github.epsilon.C.b("skvCcpSYYWAAcbYi", setOutputTarget(net.minecraft.client.renderer.rendertype.OutputTarget ), (RenderSetup.RenderSetupBuilder)hi.a("\u00a5", (Object)hi.a("G", (Object)hi.a("j", (long)527333807065558316L), (long)1192842454365816254L), (Object)com.github.epsilon.C.b(13495, 2746), (Object)identifier, (long)1195566499667059605L), (OutputTarget)hi.a("j", (long)622171063192483957L)), (long)1248967660070311785L), (long)1142738175070365527L)), (long)868680327435086622L), (Object)hi.a("j", (long)734753797940705798L), (long)1210402519811945697L), (long)1027214412893225677L), (long)1312096923321906450L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x34BF) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 122;
                case 1 -> 14;
                case 2 -> 96;
                case 3 -> 36;
                case 4 -> 250;
                case 5 -> 123;
                case 6 -> 238;
                case 7 -> 8;
                case 8 -> 129;
                case 9 -> 165;
                case 10 -> 134;
                case 11 -> 142;
                case 12 -> 19;
                case 13 -> 140;
                case 14 -> 172;
                case 15 -> 120;
                case 16 -> 141;
                case 17 -> 67;
                case 18 -> 71;
                case 19 -> 107;
                case 20 -> 21;
                case 21 -> 223;
                case 22 -> 75;
                case 23 -> 121;
                case 24 -> 213;
                case 25 -> 214;
                case 26 -> 9;
                case 27 -> 212;
                case 28 -> 234;
                case 29 -> 138;
                case 30 -> 26;
                case 31 -> 104;
                case 32 -> 37;
                case 33 -> 178;
                case 34 -> 86;
                case 35 -> 116;
                case 36 -> 25;
                case 37 -> 179;
                case 38 -> 6;
                case 39 -> 69;
                case 40 -> 98;
                case 41 -> 137;
                case 42 -> 136;
                case 43 -> 106;
                case 44 -> 66;
                case 45 -> 220;
                case 46 -> 70;
                case 47 -> 185;
                case 48 -> 216;
                case 49 -> 243;
                case 50 -> 83;
                case 51 -> 168;
                case 52 -> 233;
                case 53 -> 245;
                case 54 -> 41;
                case 55 -> 198;
                case 56 -> 162;
                case 57 -> 193;
                case 58 -> 217;
                case 59 -> 205;
                case 60 -> 1;
                case 61 -> 248;
                case 62 -> 28;
                case 63 -> 208;
                case 64 -> 163;
                case 65 -> 191;
                case 66 -> 78;
                case 67 -> 230;
                case 68 -> 200;
                case 69 -> 132;
                case 70 -> 167;
                case 71 -> 174;
                case 72 -> 68;
                case 73 -> 147;
                case 74 -> 20;
                case 75 -> 63;
                case 76 -> 2;
                case 77 -> 94;
                case 78 -> 12;
                case 79 -> 155;
                case 80 -> 89;
                case 81 -> 22;
                case 82 -> 47;
                case 83 -> 224;
                case 84 -> 73;
                case 85 -> 139;
                case 86 -> 45;
                case 87 -> 15;
                case 88 -> 62;
                case 89 -> 27;
                case 90 -> 166;
                case 91 -> 207;
                case 92 -> 52;
                case 93 -> 16;
                case 94 -> 184;
                case 95 -> 202;
                case 96 -> 229;
                case 97 -> 226;
                case 98 -> 235;
                case 99 -> 92;
                case 100 -> 215;
                case 101 -> 79;
                case 102 -> 108;
                case 103 -> 100;
                case 104 -> 255;
                case 105 -> 232;
                case 106 -> 177;
                case 107 -> 64;
                case 108 -> 57;
                case 109 -> 114;
                case 110 -> 33;
                case 111 -> 35;
                case 112 -> 254;
                case 113 -> 153;
                case 114 -> 156;
                case 115 -> 61;
                case 116 -> 46;
                case 117 -> 182;
                case 118 -> 110;
                case 119 -> 236;
                case 120 -> 231;
                case 121 -> 90;
                case 122 -> 48;
                case 123 -> 176;
                case 124 -> 43;
                case 125 -> 77;
                case 126 -> 150;
                case 127 -> 196;
                case 128 -> 95;
                case 129 -> 125;
                case 130 -> 74;
                case 131 -> 203;
                case 132 -> 164;
                case 133 -> 50;
                case 134 -> 252;
                case 135 -> 143;
                case 136 -> 144;
                case 137 -> 103;
                case 138 -> 170;
                case 139 -> 157;
                case 140 -> 58;
                case 141 -> 246;
                case 142 -> 49;
                case 143 -> 135;
                case 144 -> 65;
                case 145 -> 237;
                case 146 -> 32;
                case 147 -> 152;
                case 148 -> 80;
                case 149 -> 53;
                case 150 -> 199;
                case 151 -> 24;
                case 152 -> 239;
                case 153 -> 55;
                case 154 -> 105;
                case 155 -> 210;
                case 156 -> 87;
                case 157 -> 30;
                case 158 -> 126;
                case 159 -> 101;
                case 160 -> 117;
                case 161 -> 72;
                case 162 -> 102;
                case 163 -> 60;
                case 164 -> 186;
                case 165 -> 183;
                case 166 -> 97;
                case 167 -> 158;
                case 168 -> 4;
                case 169 -> 118;
                case 170 -> 181;
                case 171 -> 175;
                case 172 -> 180;
                case 173 -> 253;
                case 174 -> 113;
                case 175 -> 76;
                case 176 -> 119;
                case 177 -> 124;
                case 178 -> 130;
                case 179 -> 242;
                case 180 -> 206;
                case 181 -> 244;
                case 182 -> 187;
                case 183 -> 211;
                case 184 -> 81;
                case 185 -> 228;
                case 186 -> 59;
                case 187 -> 241;
                case 188 -> 109;
                case 189 -> 11;
                case 190 -> 54;
                case 191 -> 111;
                case 192 -> 169;
                case 193 -> 38;
                case 194 -> 173;
                case 195 -> 42;
                case 196 -> 218;
                case 197 -> 219;
                case 198 -> 5;
                case 199 -> 3;
                case 200 -> 51;
                case 201 -> 29;
                case 202 -> 99;
                case 203 -> 160;
                case 204 -> 192;
                case 205 -> 194;
                case 206 -> 115;
                case 207 -> 171;
                case 208 -> 13;
                case 209 -> 34;
                case 210 -> 39;
                case 211 -> 133;
                case 212 -> 88;
                case 213 -> 31;
                case 214 -> 112;
                case 215 -> 93;
                case 216 -> 251;
                case 217 -> 17;
                case 218 -> 197;
                case 219 -> 56;
                case 220 -> 225;
                case 221 -> 82;
                case 222 -> 204;
                case 223 -> 190;
                case 224 -> 189;
                case 225 -> 44;
                case 226 -> 151;
                case 227 -> 127;
                case 228 -> 7;
                case 229 -> 154;
                case 230 -> 209;
                case 231 -> 148;
                case 232 -> 85;
                case 233 -> 222;
                case 234 -> 195;
                case 235 -> 131;
                case 236 -> 10;
                case 237 -> 91;
                case 238 -> 161;
                case 239 -> 240;
                case 240 -> 23;
                case 241 -> 159;
                case 242 -> 188;
                case 243 -> 18;
                case 244 -> 84;
                case 245 -> 145;
                case 246 -> 0;
                case 247 -> 128;
                case 248 -> 201;
                case 249 -> 221;
                case 250 -> 227;
                case 251 -> 247;
                case 252 -> 40;
                case 253 -> 249;
                case 254 -> 146;
                default -> 149;
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
            com.github.epsilon.C.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1F8C;
        if (e[n2] == null) {
            com.github.epsilon.C.e[n2] = (int)(d[n2] ^ l);
        }
        return e[n2];
    }
}
