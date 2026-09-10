/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dq;
import com.github.epsilon.Dx;
import com.github.epsilon.Oa;
import com.github.epsilon.Of;
import com.github.epsilon.XG;
import com.github.epsilon.Xg;
import com.github.epsilon.Xn;
import com.github.epsilon.d9;
import com.github.epsilon.dR;
import com.github.epsilon.dx;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.lw;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.yi;
import com.github.epsilon.yo;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class e1
extends e {
    private final DM a;
    private final Dx<dx> Q;
    private final DM x;
    private final XG w;
    public static final e1 D;
    private final DM F;
    private final Map<dx, Oa> J = new EnumMap<dx, Oa>(dx.class);
    private final DV k;
    private final DM u;
    private yo l;
    private final Xn z;
    private final Xn d;
    private final XG n;
    private LivingEntity C;
    private List<Vec3> v;
    private final XG V;
    private static final String[] b;
    private static final String[] c;
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
                        var13 = new String[12];
                        var11_1 = 0;
                        var10_2 = "D\u001aD?\u001c[|pT\u0010\u00a4a\u00ca\u00d9%+\u00a4\u0019\u009ee\b\u00ca\u00db:\u00afL\u0004\u00ed\\m}\u000b5\u00f8\u0080\u00a3{\u0019\u009a\u00b3V\b\u00fe\b\u001cF17\u0005\u0087[\u00e7\u0005\u00d3\f\\\u00ba\u00e0\u000f\u0016\u00fb\u00bcK\u00e0\u00b7M\u00a1\u00c8\u00e7\u0096\u001c\u00fc\u00af\u00e3\n\u00f4\u00fd\u00e0\u008bk\u00a0:\u00af\u00ea6\u0011\u00bae\u00e9\u0000\u00c5n\u0081R\u001d\u00bf\u00f3\u00f7$\u00d5\u00ff\u00a1H\r\u0012\u0088-X\u00a8w9=\u00c9\u00ba\u0095\u00d59";
                        var12_3 = "D\u001aD?\u001c[|pT\u0010\u00a4a\u00ca\u00d9%+\u00a4\u0019\u009ee\b\u00ca\u00db:\u00afL\u0004\u00ed\\m}\u000b5\u00f8\u0080\u00a3{\u0019\u009a\u00b3V\b\u00fe\b\u001cF17\u0005\u0087[\u00e7\u0005\u00d3\f\\\u00ba\u00e0\u000f\u0016\u00fb\u00bcK\u00e0\u00b7M\u00a1\u00c8\u00e7\u0096\u001c\u00fc\u00af\u00e3\n\u00f4\u00fd\u00e0\u008bk\u00a0:\u00af\u00ea6\u0011\u00bae\u00e9\u0000\u00c5n\u0081R\u001d\u00bf\u00f3\u00f7$\u00d5\u00ff\u00a1H\r\u0012\u0088-X\u00a8w9=\u00c9\u00ba\u0095\u00d59".length();
                        var9_4 = 9;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 36;
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
                            var10_2 = "&l\u00b1Z\u00c8\u0095W\u0004\u0092\u00d1\u001aw\u00fe\r\u0089\u00dfJ\u001d;\u0013K\\d\u00dat\u00a5\u00c2";
                            var12_3 = "&l\u00b1Z\u00c8\u0095W\u0004\u0092\u00d1\u001aw\u00fe\r\u0089\u00dfJ\u001d;\u0013K\\d\u00dat\u00a5\u00c2".length();
                            var9_4 = 13;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 30;
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
                                    v15 = 87;
                                    break;
                                }
                                case 1: {
                                    v15 = 78;
                                    break;
                                }
                                case 2: {
                                    v15 = 26;
                                    break;
                                }
                                case 3: {
                                    v15 = 120;
                                    break;
                                }
                                case 4: {
                                    v15 = 78;
                                    break;
                                }
                                case 5: {
                                    v15 = 88;
                                    break;
                                }
                                default: {
                                    v15 = 117;
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
                e1.b = var13;
                e1.c = new String[12];
                var0_7 = 2980330788763841615L;
                var6_8 = new long[332];
                var3_9 = 0;
                var4_10 = "\u00f8o{~\u00acXuG`\u00d0W\u00b4yy?\b\u00a7\u000e \u00b8*\u0097\u00e2e.\"\u00ab\u0096\u000bETw^\u0082\u0011\u00a96\u0093\u0004#\u00df\u00eb,\u00b3\u00f0o\u0080\u00a1\u008a\u00c6A7E\u00be\u00a8\u00a5\u00c2P\u009f\u0088\u00bb\u00f4\u0018\u0088B\u00c2\u0084\u0019\u00afV\u00beU\u00de\u00fc\u00dd,\u00fa\u0012\u0000\u00e9\u008b\u008f\u00ae\u000b=W\u00ffz\u00a6\u009b\u0080\u00e6\u0017\u00b9d\u00ce\u00c5!s\u00bb\u00c9$\u00e4\u00db\u00bf\u00b4\u000e\u0092VO\u0090\u0007\u0001\u00c4+\u0094Pn\u00c10)wf\u0017c\u00f2xu\u00da\u0010\u00d3\u00eej\u009b\u009d/\bxf\u000b\u00e5\u00cc\u0016r\u00da-cm\u00adU\u008b\u00ff4\u00dd4O ,D\n\u009bg\u0013uV=\u001f\u0099\u0087\u0081{.@pT\u00aa\t\u00e6\u0017\u0005\u00d7/\u008cj\u00c7(\u0007o\u0094\u0081\u009b^'\u00cdl\u00aey\u00d6$\u00af[K\u00a4qr\u00b2\u00f2\u00d9.'u\u00a9;J\u00e3\u00ae\u0083\u0005\u00b43\u00e9\u00ff?\u00b5\u00d3x\u00af9\u009d\u00f0\u0089\u00a4D\u00c9\\\u00e2PY\u00f8{\u0097\u00d3?t\u00d9\u0006\u00ed\n\u00bc\u0006\u009c\u0014Kk\u0085\u00b4\u00e5'\u00d3\u00a2\u0017%\u00a5\u0082\u00ac\u00f2\u00a4A\u00b5N\u00abqU\u00b5\u0099\u00c9\u00db\u00beGN\u00c2\u0005\u00eb\u00ab\u0019s\u00db\u00b9h+o\"D<\u009a\u0003\u001d=^D\u0082&:\u000f!\u00ac\u0016}G6\u00f6J\u0090\u00f4d)\u00ea\u001a\u00c2\u0099N\u00aa\u009aK\u00c60\u00c9:3\u00b1Ph\u00ce\u00e7-\u00d3\u00c7B\u0093\u00c7;\u0018X\bZ\u0096\u00ae\u00fdR\u00b7\u00b1\u0015Tz\u00ee\u008d\u00cc~B\u0081\\$w\u00adI\u00da\u0099#0*\u00de\u0098\u007fk\f\u00def\u00d2\u00a3M2.\u00f6Z.\u0095\u0080\u0001[\u00a0\u007fJR\u00f6\u00e5\u001d\u0085\u00e6\u00caj\u001e\u0016\u009f\u0005\u00ee\u0002=\u00deX\u009cZ\u0000U=\u0006\u00d2\u00e9\u0081\u00df\u00df\u00e5\u00bd\u00e9\u00ec\u00c3\u00fb\u00d9GW\u00847w.\u0097\u001b\u00ba\u00eb\u00b1.\u00ba\u009a\u00ce\u00e9\u00b7 \u0093W\u00cbm\u00c5\u00bc\bVi/\u00d551\tpU\u0012\t[\u00bc\u008d\u00ef\u0002R\u00db\u00cb\u008a2\u0012>c\u008a\u0000\u0018\u0017\u00c7\u00a1\u00f3\u0080\u0081\u00c2\u00c0D&\u00e3\u0084\u00cfy|kP\u00d6\u0086\u00da\u008a\u00835)\u00cf\u008ac\u00c9\u00d3\u00f0i\u00b2;[\u008b_N-p\u00b6\u0005o\u00f5S\u00c7\u00ddd< m\f\u00df\u00ad\u001b\u00b2\u00a7\u00c1\u0002\u00a8\u00de\\\u00c3\u00ea\u008b\u00b4+U\u00ca\u0019\u00bc\u00ed\u0089u\u00c6\u00f1C^@\u0086\u00fd\u00af\u00bdMf\u00f2\u00e8%\u00c8\u0091(\u00deq\u00c8\u00c8RS&('\u00bb\u0000\u00aez[\u00f9\u00cc\u0007\u0013{^\u000b\u00ca\u00e8?\u00cf\u00e2$\u00bb\u00a9g\u00d0_\u00fe\u001c\u00ad\u00f5\u00bfJ\u0090\u0095\u00b8\u0097\u00d7|\u0000E\u00d1\u00a1\u00a3\u0087ciQ?\u00a0\u00dbw\u0010\u00c6e\u0092\u00e6\u008a6\u0018\u0085\u00e4\u008ab \u0003\u00deZ\u0089\u00d0{\u00ae\u001d\u0082F\u0010^\u00d5V.\u0084\u0019\"\u001e\u00ea\u001d\u000f(\u0000\u00a8\u0090\u00d9(\u00d0\u00c6F\u009d\u0082h)$\u00a4\u00d6\u00f7\u00e3\u00b5\u001c\u00fc\u009c7\u0082\u00e5)\u000f\u0081\u00e10\u00a3\u00fc\u0092N\u009b7\u00b8Z\u00cf@9\u0096#i\u008c\u00a2\u008b)\u0007m\u00ffD\u00fb\u0016`\u00c6jo\u0093/\u0080\u001cs_\u009aM?l\u008d\u0099n[\u008e\u001a\u00e8@\u00cc\u00b2b\u0016I\u00e16\u00b7C\u0017\u00db\u009ds\t\u00e2\u00bc\u00db\u008e\u008c\u00a4\u000f}\u001d\u00ae0R\u00cb5\u00f1\u00ae\u00e9\u001ek+LQ\u00ba\u00ae\u00c9L\u009f*\u008f\u00c3\u00b8\u009ce9H|\u0005\u0001M\u0096`\u00d1\u00b7\u008a<\u00f9V\u00df\r\u000f&\u0093O\u001f\u00ec\u00earo\u00bc\u00fc\u00bay>\u00b6/\u00e0\\\u00d3zY?\u00d7\u00e5\u009bL\u00b39\u00ba,\u00fc\u00ca\u00bf3\u00ef)k\u00ddy\u00a5\u00ce\u00c9\u00d8\u00ce\u00a6\u00c2\u001c\u00a0\u00b2\u009a\u00e3\u000eu\u0017\u00a7\u00d7~\u00f8\u00c9\u00fb\u00ae\u008a\u009d\u00afIK%\u00d7\u00db'7\u00cb\u00ff(\u00aa\u00f1\u00d5{\u00b1\b[\u00f4\u008d\u00ef\u00b9\u00f9DI\u007f\u0006\u001f\u00fb!\u00992ZU\u0087\u009d\u00deW\u008c\u0095\u00c41i\u00abz\u00ec\u00e89\bx\u00dc>\u00e7\u00f6\u000f`\u00e2\u0091t\u00af\\'\u0094\u0018\u00feqb\u00d56\u0085\u0005\u00bax\u009eP\u009e\u00b1\u0093\u00fc\u00bb)|2mO\u001d\u0012J\u00f8\u00fb\u0081*\u00de\u00d0\u00cf\f\u00d0\u009f\u001c\u0015\u008e\u00fcJ\u00bd\u00c224y\u001c5\u00c7\u009d,\u000eJu\u0085\u00b5\u00f61T\u0014u\u00d3\u00f8\u00f4\u0006\u00fe\u0097\u00f4\u0086\u0001\u0084\u0083\u001f\u00c1\u00ad\u00e9\u0006\u00b9\u00cb\u0018vJ \u0006C.Wi\u0092i\u0007u\u0016G~\u000f\u00b9\u009a\u00f0\u008a<4\u00e8R\u0089[\u0001\u0088\u00d1\u008e\u0014\u00e4~\u00fe\u00fd\u0092\u00e2^\u008a\u00e8\u0095\u00c0\u00a4\u00f3\u009a\u00d8\u00f2H\u00f2\u00da\u00e9\u00ec\u00d2\u00ae\u0083R\u0018\u009cl\u00f5\u0018HM\u0097v\u0082\u00e7\f>\u00fcK\u0093RMT\u00a6\u00d4\u00b2\u00a2\u00e2\u00a8\u00bb\u00dd3\u0089\u00d14\u008c\u00d8\u00e7g\u00947\u0092\u0000\u0099\u00ca\u0087\u00fbV\u00ca6ms\u00dcV\u0087\u000evlob&.\u0015d\u0089\u00ea\u0097Y\u0000K\u00af\u0016\u00c1\u00a5\u00dd\u0015\u0002\u00be\u0092\u008ct{\u00fb\u0095\u00d2\u00eb\u00ea\u00f8\u00e9t{(\u008e\u00f0\u00ab\u00d9\u00a6\u001cx \u008b$CN\u00c7d\u00cbm\u001e\u00a9\u0096\u00e2e\u0006J\u0098\u00c9\u00fb\u00c7\u00b5\"vNb\u0007R\u00ca\u00c6\u00e1H\u00cdW\u00d8\u009a\u00eb\u0080\u00d5e\u00d3\u00d1EZ0\u008d\u00d2\u00a6\u00d7_\u009c\u0011\u0017\u00f2?\u0016+KPU\u0000\u00af<`\u001d\u00f5\t\u0088\u00a2\u0003\u00ad]\u0019;\u00f2D\u00ed\u00a1\u0081\u0090\u00a1\u00c1\u00d0\u00d2\u009e\u0003A\u00929\u00c1\u00b3A)\u00ed\u0018\u00d9 \u00e4#I\u0090\u00ed\u0019\u00d0\u007f\u009e<\u00c5W\u0015\u0017\u00016\u00b4\u0091|\u00eb;\u00b5S\u00a6\u0092H\u00e6\u00b5t\u0086\u00ed;TMC\u00871\u00ee\u009f[Mmci\u000e\u001a\u00b2\u00c9q\u00a6\u008f<W\"\u00bd\u00aa\u0012\u00b5]\u00d2\u00e3\u000b\n3p\u0081\u0080\u0000\u00e9\u008f\u00d8\u008b\u00c9X\u00b1\u00c5\u0018\u00af\u0017H@\u00e9F\u0015\u0005\u00d0N\u0099\u00d1KMh\u0089\u008a\u001b\u00a8VE\u00e6\u00b4K:\u00cfh\u00ba\u00b42Y&\u00aa\u00175\u00f8\u00d4\u0081\u00da\u00ea\u0095v5\u00b5\u00ad|m 9\u001bG\u00c6\u00a1b\u0093\u00f4{\u00da\u00ef\u009f\u00a8&[\u00e1\u00f8\u00bb%H2D\bb\u00a1\u000b\u0012cp\u00b0\u00c6\u0095%\u00adn\t\u00eaN\u009f\u008b\u00cd\u008e\u00fa\u00cc\u00af\u00c7\u0096fFk\u0016\u0083T8\u00e6\u0081V\u00fd)C\u00ac\u009498\u00ca\u00b9\u00d7\u0083\u001f\u00cd\u00b8o\u00df\u008a\u00cc\u00c5\u00138\u00e5\u00a0\u009a\u00a1\u008a\b\u0094\u000fOpY*\u00a2\u00bf\u00c0\u00a2\u00a2\u00b5\u00bf\u009cm1\u0099\u0091\u00ad,V\u0000\u00d1Y)\u00e5)v~P\u00b6\f\u00a1\u007f\u00ccz?t\u00b4\u0086\u00e75\u0083\u00b9\u009bCY\u00eaP\u00d6{\u00ae\\\u00d8Jc\u00c6\u00b6\u009fn1\f\u001c|\u0099~\u00dd\u0092\u0004\u0000\u00d5\u00bc\u00c3\u00c6\u00ffqkR\u0018\u00e7\u00cb\u00f7j\b\u00e5\u0090\u0015\u00ab4&\u00fc\u00ddXV\u0080|\u00b8\u00a5\u00fbK\u00ac\u0018\u00880P\u0002\u00bf\u008f\u00d6\u00fdB-\u00bf1t\u00c5\u00d8\u001b\n\u008c~\u0015\u00b2\u001f\u00e8 .\u00c9*=\u00e0\u007f\u00a3r7\u00dfgi.\u0004.#\u00fd\u00cc\u00b2^o\u0018v\u001d\u00c8\u00ac`.l\u0019\u0002\u000b\u0085\"\u0018\u001a\u00e8\u00b3\u009e\u00fb\u00b7\u00da\u00ed!{j{T\u00d4+\u00d1\u00ab\u00f7\u001f,\u00b5\u00fa\u00b2\u0098\u00b6\u00c4\u0002MC\u0088~\u00da\u00fa\u00be\\-I:\u009e\u00fe\u001e\u00ec6`D\u00ef'Y\u0086)X-C\u00d7J\u00c7]\u0093\u00cd\u00be\u00fc`\u00dcI%\u00da\u00ec\t\u00bf\u00c1\u00b7\u0006kX\u00e2+\u00b7Vs\u00c7\u0002\u00f4\u00ac\u008d\u00ea @\u00ac\u00f8\u00f4)?\u00e4O\u009fB\u00b0Q\u0007~\u000f]\u00c0\u00ea\u00ae\u00e8\u00baID\u00fe\u0003O\u00ea\u00afD;:a_4\u001c\u00c3]\u00e3^$\u00a3\u00c8S=\u00ad-DC\u00beX\u0002\u00f4{\u000fBU\u00c6\u00b6\u0084\u008b\u00a0\u0087\u009d\u00e2\u00d0\u00f7\u00c6\u008el#\u00cez\u00fc\u00f0X\u00fb\u0097 \u00dau|\u0086\u00ea\u00a4(\u0003\f\u00d4\u001e\u0013\u008c\u00e0|'\u00c7\u008618\u0088\u00eeo\u00af/-\u00fd\u00b4\u00d8\\\u00d6e\u00a4\u00c8/Z\u00f2\u00f2\u00e0\u00c2MF\u00ac\u00f3\u008f\u0007\u000b\u00ffZn\u00f7\\\u00d0+\u00ce\u00d0ZP4\u00d6<\u00f4\u00d9\u00f8\u00d3\u0091E\u009f\u00ce\u008d\u00f6c\u0089\u008a\u00f0\u0089\u00fc\u001a\u00f9\u00bc\u0088E7f\u00b3\u000ba\u00b09-\u00ef\u0000v\u00f5\u009a\u00bbw\u00ec\u0095b\u00fde\u00a4\u00e4z\u0014\u00fe\u0083 \u0098m$ \u00e7N\u00a0\u00d0p\u00de\fk\u0089\u0085\u0014S\u00a0\u00a3\u00efI\u00a1\u00ed5T\u00e0ur\u00e1\u00b0G\u0015\u008fl}\u00b3\u00e5B\u00a6T*\u00e2\u00d7\u00eb.\u000e\u0080\u00b1\u00c2\u00cfi\u007f\u0016\u00ff\u00d5\u00c39\u00ec\u00a7!\u0091\u00c7i\u001d\u00e4F0\u00dd\u00986g\u00ed\u009a\u000bj\u00eb\u00bas\u0011E\u00b6\u00ae\u00efm\u00d0\u00ae\u00e3\u009b\u00e5\u00c4\u00df\u00fa\u00bd5\u0003\u00df\u00e4\u009d\u00ab\u00cfs\u00b6V\u0084\u00e8\u00a7\n\u0096\u0089\u009fY\u0000B\u0002\u00a5\u00bc[\u00c1\u0015:\u009c\u00d7\u00b2\r\u00df\u00e8\u0086\u00eft\u00b3\u00de\u00f4O*\u00e6\u00b4\u00a8\u00b1RV\\\u001d\u00be\u0094\u00d07*\u00d2\u0094\u00c1d\u008f\u00db\f\u00ad\u00b8\u00fe}:-E\u009b\u00bb[|\u0000\u008d\f&\u00ff\u00e9\u0089A\u0091\u0001\u001fc\u001a\u00d8\u001f\u0011Z\u00d9nk\u00db\u00caJ\u001b \u00d3\u00d9\u0091>B\u00bf\u00c9\u00b5\u000f\u008a\u00b0\u00e0F\u000eD\b?>\u00de\u008f(\u00e4G\n~\u00ba\u00a0\u00dd\u0095\u008c\u00b3\u00aa-\u00da\u000e\u00da\u007f\u009a\u0016\u0011`\u000b\u007f\u0092\u00e3\u00d0\u0013\u0018\u00ac\u00ec\b\u0006\u00fe\u00ac\u009f\u0000\u00dc\u0097\u00df\u008a\u001e\u009f\u00df\u00c1v\u00ef\u00a9\u00cem\u00f0C\u00ad\u008a\u00efD\u00c3M\u000fG\u0015ve\u00a6\u0087\u0094\u0001\u00c2\u00d4\u00b2\u00b6\u0011^K\u00cc\u00fe\u0094\u0083LV\u00a3,\u001d\u00aa\u00b4\u00b0\u0099\u0097a]\u00f7\u0001\u00f3\u0088\u00ee\u00d2\u0097YK\u00bb\u0017\u00b5\u000f,~4i\u0088\u0019\u00f6\u00e9U#\u00fc\u0087\u00973\u00f5\u00a8v]S\u00f6\u00fb\u00c1CZ\u00d7\u00a2\u0088\u0002\u00df\u00a1%\u0086\u00af\u00a4\u00f5C\u00f5\u00f1-)\u00d5\u00f9\u000e\u00f2\u00b6\u00b4f\u00acG\u00052\u00ed\u0018D\u00bb\u00cd\u008a\u00da\u00e3\u00db\u00bb_-'\u0005\u0016\u00c7L\u0011\u00de\u0092k/]\u0091\u0095\u0098\u00da\u00d7\u00c7\u00ac\u0013\u00ff\u00c0\u000bx\u00adc\u0082A\u000f:\u00bd\u007f+\u0002]\u0086\u00c8\u00a2\u00ae\u009b^\u00ec\u00f9\u00ca[\u0082\u001ee\u00a3\u0091\u000f\u00df\u0013\u00d0S\u00ff)\u00ed\u0088~\u0088aC\u009f@-\u007f\u00e0,\u0004\u00be`\u00dd\u00c3\u0001\u0095\u00e9z\u00c2f=)\u00c2O\u00ee\u0000\u0006\u001eg%^\u0096\u0007a\u008a\u009b\u0086\u00bd\u00cebl\u00c9\u00e4\u001fm\u0003\u00c2\u00a3m\u00f29E\u00d2\u009a\u00bf\u0013\u00e8\u00a2\u00db\u00940\u00fd\u00ef\u00a0\u00ba\u00a0r\u00fa\u000e\u00b8\u00b1\u001e\u000fw?\u0096\u00af\u001d\u009f\u00a0\u00ff\u00a2\u00a9pn\u00eb4WQ\u00f7\u00bc\u00d6\u0019n\u00cd\u00cb\u00065\u00db\u00df \u00b6\u00d6^\u00fa\u00c0\u0081\u00b6\u00c1\u00e3^\u00ed\u009c\u00fa=\u00e2\u00b1\u001b\u00ed7=\n\t\u00b8\u00d7\u00b6\u00db\u00c5\n\u00b0\u00b4\u00bf=\u000f\u00c7%l\u008f&\u00faZ\u0089\u00d3\u00fe\u00a74\u00bc\u00e4\u008c\u00f7\u00b6\u0081Ec'\u00f7\u0094N\u000e\u00a7\u00bbJ\u00cf\u009f>(l{\u0089\u00f6\u0014\u00eb\u0016\u0015\u00114\u0086 \u0012\u00ad\u00f1\u0006P-*X\u00a7\u00fb\u0087v\u0096?\u00ea_+9\u00f3\u00fb^\u0090Y\u00ba\u00f53\u0085\u00ad[-#P\u00d0\u00cc\u00b0\u00ac\u0013N\u00ba\u0002L\u00bb?\u000e\u00f7\u0087p\u00bd\u00c6\u00f4\u00dcN8y\u001d]\u008e&z3\u00ebVx\u00f3\u00ce$At[2\rZ\u00da\u001c\u0011s\u00d0\u00ec\u00dc\u001a\u00ab\t\u0015\u0018\u000b\u00f0\u0015\u0016\u0017.2\u008c}\u0011\u0085\u00f5\u001dd\u001e\u00feX\u00e25\u00db\u00b8<UJ\u00c6\u00eb[h\u009b\u009bu\u0083Q\u008dH\u001c3\u00cc\u0081B\u001d\u00d1jB\u00dd\u00ae\u007f\u0014\u00cc\u00cc";
                var5_11 = "\u00f8o{~\u00acXuG`\u00d0W\u00b4yy?\b\u00a7\u000e \u00b8*\u0097\u00e2e.\"\u00ab\u0096\u000bETw^\u0082\u0011\u00a96\u0093\u0004#\u00df\u00eb,\u00b3\u00f0o\u0080\u00a1\u008a\u00c6A7E\u00be\u00a8\u00a5\u00c2P\u009f\u0088\u00bb\u00f4\u0018\u0088B\u00c2\u0084\u0019\u00afV\u00beU\u00de\u00fc\u00dd,\u00fa\u0012\u0000\u00e9\u008b\u008f\u00ae\u000b=W\u00ffz\u00a6\u009b\u0080\u00e6\u0017\u00b9d\u00ce\u00c5!s\u00bb\u00c9$\u00e4\u00db\u00bf\u00b4\u000e\u0092VO\u0090\u0007\u0001\u00c4+\u0094Pn\u00c10)wf\u0017c\u00f2xu\u00da\u0010\u00d3\u00eej\u009b\u009d/\bxf\u000b\u00e5\u00cc\u0016r\u00da-cm\u00adU\u008b\u00ff4\u00dd4O ,D\n\u009bg\u0013uV=\u001f\u0099\u0087\u0081{.@pT\u00aa\t\u00e6\u0017\u0005\u00d7/\u008cj\u00c7(\u0007o\u0094\u0081\u009b^'\u00cdl\u00aey\u00d6$\u00af[K\u00a4qr\u00b2\u00f2\u00d9.'u\u00a9;J\u00e3\u00ae\u0083\u0005\u00b43\u00e9\u00ff?\u00b5\u00d3x\u00af9\u009d\u00f0\u0089\u00a4D\u00c9\\\u00e2PY\u00f8{\u0097\u00d3?t\u00d9\u0006\u00ed\n\u00bc\u0006\u009c\u0014Kk\u0085\u00b4\u00e5'\u00d3\u00a2\u0017%\u00a5\u0082\u00ac\u00f2\u00a4A\u00b5N\u00abqU\u00b5\u0099\u00c9\u00db\u00beGN\u00c2\u0005\u00eb\u00ab\u0019s\u00db\u00b9h+o\"D<\u009a\u0003\u001d=^D\u0082&:\u000f!\u00ac\u0016}G6\u00f6J\u0090\u00f4d)\u00ea\u001a\u00c2\u0099N\u00aa\u009aK\u00c60\u00c9:3\u00b1Ph\u00ce\u00e7-\u00d3\u00c7B\u0093\u00c7;\u0018X\bZ\u0096\u00ae\u00fdR\u00b7\u00b1\u0015Tz\u00ee\u008d\u00cc~B\u0081\\$w\u00adI\u00da\u0099#0*\u00de\u0098\u007fk\f\u00def\u00d2\u00a3M2.\u00f6Z.\u0095\u0080\u0001[\u00a0\u007fJR\u00f6\u00e5\u001d\u0085\u00e6\u00caj\u001e\u0016\u009f\u0005\u00ee\u0002=\u00deX\u009cZ\u0000U=\u0006\u00d2\u00e9\u0081\u00df\u00df\u00e5\u00bd\u00e9\u00ec\u00c3\u00fb\u00d9GW\u00847w.\u0097\u001b\u00ba\u00eb\u00b1.\u00ba\u009a\u00ce\u00e9\u00b7 \u0093W\u00cbm\u00c5\u00bc\bVi/\u00d551\tpU\u0012\t[\u00bc\u008d\u00ef\u0002R\u00db\u00cb\u008a2\u0012>c\u008a\u0000\u0018\u0017\u00c7\u00a1\u00f3\u0080\u0081\u00c2\u00c0D&\u00e3\u0084\u00cfy|kP\u00d6\u0086\u00da\u008a\u00835)\u00cf\u008ac\u00c9\u00d3\u00f0i\u00b2;[\u008b_N-p\u00b6\u0005o\u00f5S\u00c7\u00ddd< m\f\u00df\u00ad\u001b\u00b2\u00a7\u00c1\u0002\u00a8\u00de\\\u00c3\u00ea\u008b\u00b4+U\u00ca\u0019\u00bc\u00ed\u0089u\u00c6\u00f1C^@\u0086\u00fd\u00af\u00bdMf\u00f2\u00e8%\u00c8\u0091(\u00deq\u00c8\u00c8RS&('\u00bb\u0000\u00aez[\u00f9\u00cc\u0007\u0013{^\u000b\u00ca\u00e8?\u00cf\u00e2$\u00bb\u00a9g\u00d0_\u00fe\u001c\u00ad\u00f5\u00bfJ\u0090\u0095\u00b8\u0097\u00d7|\u0000E\u00d1\u00a1\u00a3\u0087ciQ?\u00a0\u00dbw\u0010\u00c6e\u0092\u00e6\u008a6\u0018\u0085\u00e4\u008ab \u0003\u00deZ\u0089\u00d0{\u00ae\u001d\u0082F\u0010^\u00d5V.\u0084\u0019\"\u001e\u00ea\u001d\u000f(\u0000\u00a8\u0090\u00d9(\u00d0\u00c6F\u009d\u0082h)$\u00a4\u00d6\u00f7\u00e3\u00b5\u001c\u00fc\u009c7\u0082\u00e5)\u000f\u0081\u00e10\u00a3\u00fc\u0092N\u009b7\u00b8Z\u00cf@9\u0096#i\u008c\u00a2\u008b)\u0007m\u00ffD\u00fb\u0016`\u00c6jo\u0093/\u0080\u001cs_\u009aM?l\u008d\u0099n[\u008e\u001a\u00e8@\u00cc\u00b2b\u0016I\u00e16\u00b7C\u0017\u00db\u009ds\t\u00e2\u00bc\u00db\u008e\u008c\u00a4\u000f}\u001d\u00ae0R\u00cb5\u00f1\u00ae\u00e9\u001ek+LQ\u00ba\u00ae\u00c9L\u009f*\u008f\u00c3\u00b8\u009ce9H|\u0005\u0001M\u0096`\u00d1\u00b7\u008a<\u00f9V\u00df\r\u000f&\u0093O\u001f\u00ec\u00earo\u00bc\u00fc\u00bay>\u00b6/\u00e0\\\u00d3zY?\u00d7\u00e5\u009bL\u00b39\u00ba,\u00fc\u00ca\u00bf3\u00ef)k\u00ddy\u00a5\u00ce\u00c9\u00d8\u00ce\u00a6\u00c2\u001c\u00a0\u00b2\u009a\u00e3\u000eu\u0017\u00a7\u00d7~\u00f8\u00c9\u00fb\u00ae\u008a\u009d\u00afIK%\u00d7\u00db'7\u00cb\u00ff(\u00aa\u00f1\u00d5{\u00b1\b[\u00f4\u008d\u00ef\u00b9\u00f9DI\u007f\u0006\u001f\u00fb!\u00992ZU\u0087\u009d\u00deW\u008c\u0095\u00c41i\u00abz\u00ec\u00e89\bx\u00dc>\u00e7\u00f6\u000f`\u00e2\u0091t\u00af\\'\u0094\u0018\u00feqb\u00d56\u0085\u0005\u00bax\u009eP\u009e\u00b1\u0093\u00fc\u00bb)|2mO\u001d\u0012J\u00f8\u00fb\u0081*\u00de\u00d0\u00cf\f\u00d0\u009f\u001c\u0015\u008e\u00fcJ\u00bd\u00c224y\u001c5\u00c7\u009d,\u000eJu\u0085\u00b5\u00f61T\u0014u\u00d3\u00f8\u00f4\u0006\u00fe\u0097\u00f4\u0086\u0001\u0084\u0083\u001f\u00c1\u00ad\u00e9\u0006\u00b9\u00cb\u0018vJ \u0006C.Wi\u0092i\u0007u\u0016G~\u000f\u00b9\u009a\u00f0\u008a<4\u00e8R\u0089[\u0001\u0088\u00d1\u008e\u0014\u00e4~\u00fe\u00fd\u0092\u00e2^\u008a\u00e8\u0095\u00c0\u00a4\u00f3\u009a\u00d8\u00f2H\u00f2\u00da\u00e9\u00ec\u00d2\u00ae\u0083R\u0018\u009cl\u00f5\u0018HM\u0097v\u0082\u00e7\f>\u00fcK\u0093RMT\u00a6\u00d4\u00b2\u00a2\u00e2\u00a8\u00bb\u00dd3\u0089\u00d14\u008c\u00d8\u00e7g\u00947\u0092\u0000\u0099\u00ca\u0087\u00fbV\u00ca6ms\u00dcV\u0087\u000evlob&.\u0015d\u0089\u00ea\u0097Y\u0000K\u00af\u0016\u00c1\u00a5\u00dd\u0015\u0002\u00be\u0092\u008ct{\u00fb\u0095\u00d2\u00eb\u00ea\u00f8\u00e9t{(\u008e\u00f0\u00ab\u00d9\u00a6\u001cx \u008b$CN\u00c7d\u00cbm\u001e\u00a9\u0096\u00e2e\u0006J\u0098\u00c9\u00fb\u00c7\u00b5\"vNb\u0007R\u00ca\u00c6\u00e1H\u00cdW\u00d8\u009a\u00eb\u0080\u00d5e\u00d3\u00d1EZ0\u008d\u00d2\u00a6\u00d7_\u009c\u0011\u0017\u00f2?\u0016+KPU\u0000\u00af<`\u001d\u00f5\t\u0088\u00a2\u0003\u00ad]\u0019;\u00f2D\u00ed\u00a1\u0081\u0090\u00a1\u00c1\u00d0\u00d2\u009e\u0003A\u00929\u00c1\u00b3A)\u00ed\u0018\u00d9 \u00e4#I\u0090\u00ed\u0019\u00d0\u007f\u009e<\u00c5W\u0015\u0017\u00016\u00b4\u0091|\u00eb;\u00b5S\u00a6\u0092H\u00e6\u00b5t\u0086\u00ed;TMC\u00871\u00ee\u009f[Mmci\u000e\u001a\u00b2\u00c9q\u00a6\u008f<W\"\u00bd\u00aa\u0012\u00b5]\u00d2\u00e3\u000b\n3p\u0081\u0080\u0000\u00e9\u008f\u00d8\u008b\u00c9X\u00b1\u00c5\u0018\u00af\u0017H@\u00e9F\u0015\u0005\u00d0N\u0099\u00d1KMh\u0089\u008a\u001b\u00a8VE\u00e6\u00b4K:\u00cfh\u00ba\u00b42Y&\u00aa\u00175\u00f8\u00d4\u0081\u00da\u00ea\u0095v5\u00b5\u00ad|m 9\u001bG\u00c6\u00a1b\u0093\u00f4{\u00da\u00ef\u009f\u00a8&[\u00e1\u00f8\u00bb%H2D\bb\u00a1\u000b\u0012cp\u00b0\u00c6\u0095%\u00adn\t\u00eaN\u009f\u008b\u00cd\u008e\u00fa\u00cc\u00af\u00c7\u0096fFk\u0016\u0083T8\u00e6\u0081V\u00fd)C\u00ac\u009498\u00ca\u00b9\u00d7\u0083\u001f\u00cd\u00b8o\u00df\u008a\u00cc\u00c5\u00138\u00e5\u00a0\u009a\u00a1\u008a\b\u0094\u000fOpY*\u00a2\u00bf\u00c0\u00a2\u00a2\u00b5\u00bf\u009cm1\u0099\u0091\u00ad,V\u0000\u00d1Y)\u00e5)v~P\u00b6\f\u00a1\u007f\u00ccz?t\u00b4\u0086\u00e75\u0083\u00b9\u009bCY\u00eaP\u00d6{\u00ae\\\u00d8Jc\u00c6\u00b6\u009fn1\f\u001c|\u0099~\u00dd\u0092\u0004\u0000\u00d5\u00bc\u00c3\u00c6\u00ffqkR\u0018\u00e7\u00cb\u00f7j\b\u00e5\u0090\u0015\u00ab4&\u00fc\u00ddXV\u0080|\u00b8\u00a5\u00fbK\u00ac\u0018\u00880P\u0002\u00bf\u008f\u00d6\u00fdB-\u00bf1t\u00c5\u00d8\u001b\n\u008c~\u0015\u00b2\u001f\u00e8 .\u00c9*=\u00e0\u007f\u00a3r7\u00dfgi.\u0004.#\u00fd\u00cc\u00b2^o\u0018v\u001d\u00c8\u00ac`.l\u0019\u0002\u000b\u0085\"\u0018\u001a\u00e8\u00b3\u009e\u00fb\u00b7\u00da\u00ed!{j{T\u00d4+\u00d1\u00ab\u00f7\u001f,\u00b5\u00fa\u00b2\u0098\u00b6\u00c4\u0002MC\u0088~\u00da\u00fa\u00be\\-I:\u009e\u00fe\u001e\u00ec6`D\u00ef'Y\u0086)X-C\u00d7J\u00c7]\u0093\u00cd\u00be\u00fc`\u00dcI%\u00da\u00ec\t\u00bf\u00c1\u00b7\u0006kX\u00e2+\u00b7Vs\u00c7\u0002\u00f4\u00ac\u008d\u00ea @\u00ac\u00f8\u00f4)?\u00e4O\u009fB\u00b0Q\u0007~\u000f]\u00c0\u00ea\u00ae\u00e8\u00baID\u00fe\u0003O\u00ea\u00afD;:a_4\u001c\u00c3]\u00e3^$\u00a3\u00c8S=\u00ad-DC\u00beX\u0002\u00f4{\u000fBU\u00c6\u00b6\u0084\u008b\u00a0\u0087\u009d\u00e2\u00d0\u00f7\u00c6\u008el#\u00cez\u00fc\u00f0X\u00fb\u0097 \u00dau|\u0086\u00ea\u00a4(\u0003\f\u00d4\u001e\u0013\u008c\u00e0|'\u00c7\u008618\u0088\u00eeo\u00af/-\u00fd\u00b4\u00d8\\\u00d6e\u00a4\u00c8/Z\u00f2\u00f2\u00e0\u00c2MF\u00ac\u00f3\u008f\u0007\u000b\u00ffZn\u00f7\\\u00d0+\u00ce\u00d0ZP4\u00d6<\u00f4\u00d9\u00f8\u00d3\u0091E\u009f\u00ce\u008d\u00f6c\u0089\u008a\u00f0\u0089\u00fc\u001a\u00f9\u00bc\u0088E7f\u00b3\u000ba\u00b09-\u00ef\u0000v\u00f5\u009a\u00bbw\u00ec\u0095b\u00fde\u00a4\u00e4z\u0014\u00fe\u0083 \u0098m$ \u00e7N\u00a0\u00d0p\u00de\fk\u0089\u0085\u0014S\u00a0\u00a3\u00efI\u00a1\u00ed5T\u00e0ur\u00e1\u00b0G\u0015\u008fl}\u00b3\u00e5B\u00a6T*\u00e2\u00d7\u00eb.\u000e\u0080\u00b1\u00c2\u00cfi\u007f\u0016\u00ff\u00d5\u00c39\u00ec\u00a7!\u0091\u00c7i\u001d\u00e4F0\u00dd\u00986g\u00ed\u009a\u000bj\u00eb\u00bas\u0011E\u00b6\u00ae\u00efm\u00d0\u00ae\u00e3\u009b\u00e5\u00c4\u00df\u00fa\u00bd5\u0003\u00df\u00e4\u009d\u00ab\u00cfs\u00b6V\u0084\u00e8\u00a7\n\u0096\u0089\u009fY\u0000B\u0002\u00a5\u00bc[\u00c1\u0015:\u009c\u00d7\u00b2\r\u00df\u00e8\u0086\u00eft\u00b3\u00de\u00f4O*\u00e6\u00b4\u00a8\u00b1RV\\\u001d\u00be\u0094\u00d07*\u00d2\u0094\u00c1d\u008f\u00db\f\u00ad\u00b8\u00fe}:-E\u009b\u00bb[|\u0000\u008d\f&\u00ff\u00e9\u0089A\u0091\u0001\u001fc\u001a\u00d8\u001f\u0011Z\u00d9nk\u00db\u00caJ\u001b \u00d3\u00d9\u0091>B\u00bf\u00c9\u00b5\u000f\u008a\u00b0\u00e0F\u000eD\b?>\u00de\u008f(\u00e4G\n~\u00ba\u00a0\u00dd\u0095\u008c\u00b3\u00aa-\u00da\u000e\u00da\u007f\u009a\u0016\u0011`\u000b\u007f\u0092\u00e3\u00d0\u0013\u0018\u00ac\u00ec\b\u0006\u00fe\u00ac\u009f\u0000\u00dc\u0097\u00df\u008a\u001e\u009f\u00df\u00c1v\u00ef\u00a9\u00cem\u00f0C\u00ad\u008a\u00efD\u00c3M\u000fG\u0015ve\u00a6\u0087\u0094\u0001\u00c2\u00d4\u00b2\u00b6\u0011^K\u00cc\u00fe\u0094\u0083LV\u00a3,\u001d\u00aa\u00b4\u00b0\u0099\u0097a]\u00f7\u0001\u00f3\u0088\u00ee\u00d2\u0097YK\u00bb\u0017\u00b5\u000f,~4i\u0088\u0019\u00f6\u00e9U#\u00fc\u0087\u00973\u00f5\u00a8v]S\u00f6\u00fb\u00c1CZ\u00d7\u00a2\u0088\u0002\u00df\u00a1%\u0086\u00af\u00a4\u00f5C\u00f5\u00f1-)\u00d5\u00f9\u000e\u00f2\u00b6\u00b4f\u00acG\u00052\u00ed\u0018D\u00bb\u00cd\u008a\u00da\u00e3\u00db\u00bb_-'\u0005\u0016\u00c7L\u0011\u00de\u0092k/]\u0091\u0095\u0098\u00da\u00d7\u00c7\u00ac\u0013\u00ff\u00c0\u000bx\u00adc\u0082A\u000f:\u00bd\u007f+\u0002]\u0086\u00c8\u00a2\u00ae\u009b^\u00ec\u00f9\u00ca[\u0082\u001ee\u00a3\u0091\u000f\u00df\u0013\u00d0S\u00ff)\u00ed\u0088~\u0088aC\u009f@-\u007f\u00e0,\u0004\u00be`\u00dd\u00c3\u0001\u0095\u00e9z\u00c2f=)\u00c2O\u00ee\u0000\u0006\u001eg%^\u0096\u0007a\u008a\u009b\u0086\u00bd\u00cebl\u00c9\u00e4\u001fm\u0003\u00c2\u00a3m\u00f29E\u00d2\u009a\u00bf\u0013\u00e8\u00a2\u00db\u00940\u00fd\u00ef\u00a0\u00ba\u00a0r\u00fa\u000e\u00b8\u00b1\u001e\u000fw?\u0096\u00af\u001d\u009f\u00a0\u00ff\u00a2\u00a9pn\u00eb4WQ\u00f7\u00bc\u00d6\u0019n\u00cd\u00cb\u00065\u00db\u00df \u00b6\u00d6^\u00fa\u00c0\u0081\u00b6\u00c1\u00e3^\u00ed\u009c\u00fa=\u00e2\u00b1\u001b\u00ed7=\n\t\u00b8\u00d7\u00b6\u00db\u00c5\n\u00b0\u00b4\u00bf=\u000f\u00c7%l\u008f&\u00faZ\u0089\u00d3\u00fe\u00a74\u00bc\u00e4\u008c\u00f7\u00b6\u0081Ec'\u00f7\u0094N\u000e\u00a7\u00bbJ\u00cf\u009f>(l{\u0089\u00f6\u0014\u00eb\u0016\u0015\u00114\u0086 \u0012\u00ad\u00f1\u0006P-*X\u00a7\u00fb\u0087v\u0096?\u00ea_+9\u00f3\u00fb^\u0090Y\u00ba\u00f53\u0085\u00ad[-#P\u00d0\u00cc\u00b0\u00ac\u0013N\u00ba\u0002L\u00bb?\u000e\u00f7\u0087p\u00bd\u00c6\u00f4\u00dcN8y\u001d]\u008e&z3\u00ebVx\u00f3\u00ce$At[2\rZ\u00da\u001c\u0011s\u00d0\u00ec\u00dc\u001a\u00ab\t\u0015\u0018\u000b\u00f0\u0015\u0016\u0017.2\u008c}\u0011\u0085\u00f5\u001dd\u001e\u00feX\u00e25\u00db\u00b8<UJ\u00c6\u00eb[h\u009b\u009bu\u0083Q\u008dH\u001c3\u00cc\u0081B\u001d\u00d1jB\u00dd\u00ae\u007f\u0014\u00cc\u00cc".length();
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
                    var4_10 = "\u009c\u00daq\u0099\u00f7\u00f0\u00bcK\u00e1\u00d4\u000b\u0099\u00144Ai";
                    var5_11 = "\u009c\u00daq\u0099\u00f7\u00f0\u00bcK\u00e1\u00d4\u000b\u0099\u00144Ai".length();
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
        e1.e = var6_8;
        e1.h = new Integer[332];
        e1.D = new e1();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void k(d9 var1_1) {
        block19: {
            block18: {
                var2_2 = Dl.S();
                var4_3 /* !! */  = ((e1.c(13280, 3445465017990441694L) + e1.c(10209, 1228791803955805720L)) * e1.c(14764, 9196009749820989937L) ^ e1.c(22125, 7691385382244781865L)) - e1.c(1141, 1528473199765478412L) + e1.c(31000, 4807020664563540065L);
                if (var2_2) break block18;
lbl4:
                // 2 sources

                while (true) {
                    block21: {
                        block20: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)((Boolean)e1.m("a2llLBTV2eo2VDpn", z(), (Xn)hi.a("\u00e9", (Object)this, (long)1051035695385107827L))), (long)1000026253634408124L);
                            if (!var2_2) break block20;
                            if (v0 /* !! */  != false) break block21;
                            v0 /* !! */  = (CallSite)(e1.c(13481, 2978060973956492686L) * e1.c(8065, 8257258325578630755L) + e1.c(29738, 4452585409610132810L) + e1.c(15780, 733210393843393741L));
                        }
                        var4_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) break block18;
                    }
                    var4_3 /* !! */  = (int)(hi.a("G", (int)(e1.c(9201, 6798807118122777512L) * e1.c(15497, 2555131013795308900L) + e1.c(29421, 6246715054813162341L)), (int)e1.c(27252, 4169687637812982757L), (long)834203424483934088L) + e1.c(27931, 7237456192961852570L));
                    if (var2_2) break block18;
                    ** GOTO lbl49
                    break;
                }
lbl16:
                // 2 sources

                while (true) {
                    v1 = var3_4;
                    v2 /* !! */  = e1.m("a2llLBTV2eo2VDpn", size(), (List)hi.a("\u00e9", (Object)this, (long)1138341977127091030L));
                    if (!var2_2) ** GOTO lbl64
                    if (v1 >= v2 /* !! */ ) ** GOTO lbl62
                    ** GOTO lbl66
                    break;
                }
            }
            block14: while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1844349790: {
                        v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1138341977127091030L), (long)417939159730395915L);
                        v4 = 2;
                        if (!var2_2) ** GOTO lbl51
                        if (v3 /* !! */  < v4) ** GOTO lbl49
                        ** GOTO lbl53
                    }
                    case -1844349787: {
                        v5 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1213239988097005382L);
                        if (!var2_2) ** GOTO lbl56
                        if (v5 != false) ** GOTO lbl55
                        ** GOTO lbl58
                    }
                    case -1844349788: {
                        var3_4 = 1;
                        if (var2_2) ** GOTO lbl60
                        ** GOTO lbl16
                    }
                    case -1844349786: {
                        hi.a("G", (long)979875262789802604L);
                        hi.a("G", (long)1058499983070318781L);
                        var4_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)e1.c(6465, 5556661459873218716L), (int)e1.c(21969, 4621430960119450651L), (long)834203424483934088L), (int)e1.c(23026, 2679035845947293800L), (long)834203424483934088L) / e1.c(16136, 8008627652417906397L) + e1.c(22444, 5329721231405059779L) ^ e1.c(9147, 5354785756345039510L);
                        continue block14;
                    }
lbl49:
                    // 2 sources

                    v3 /* !! */  = (CallSite)(e1.c(12123, 3781852426951030456L) * e1.c(14888, 8802788669796377209L) + e1.c(28664, 603370808908166895L));
                    v4 = e1.c(8881, 457840991534873472L);
lbl51:
                    // 2 sources

                    var4_3 /* !! */  = (int)(v3 /* !! */  + v4);
                    if (var2_2) continue block14;
lbl53:
                    // 2 sources

                    var4_3 /* !! */  = (e1.c(24344, 477925635505358506L) ^ e1.c(24546, 3524729194807002665L)) / 5 - e1.c(5565, 9043678359325166706L) + e1.c(5604, 4826470295605464144L) + e1.c(1337, 7971790176313760783L);
                    if (var2_2) continue block14;
lbl55:
                    // 2 sources

                    v5 = hi.a("G", (int)(e1.c(5173, 4177397418717138414L) / e1.c(15812, 2490718993451148405L)), (int)e1.c(13533, 5994411367779462292L), (long)834203424483934088L) + e1.c(14422, 6313899321297854791L);
lbl56:
                    // 2 sources

                    var4_3 /* !! */  = (int)v5;
                    if (var2_2) continue block14;
lbl58:
                    // 2 sources

                    var4_3 /* !! */  = e1.c(12123, 3781852426951030456L) * e1.c(14888, 8802788669796377209L) + e1.c(28664, 603370808908166895L) + e1.c(8881, 457840991534873472L);
                    continue block14;
lbl60:
                    // 1 sources

                    var4_3 /* !! */  = (e1.c(32047, 8271229274709370193L) * e1.c(4144, 6565255345991928190L) ^ e1.c(18862, 4326746079051616391L)) - e1.c(10688, 7286320058010071503L);
                    if (var2_2) break block19;
lbl62:
                    // 2 sources

                    v1 = (e1.c(11715, 3952936190239929779L) / e1.c(23341, 2832890552455463647L) + e1.c(24584, 1321060068258953712L)) * e1.c(16656, 5022630577483192403L) - e1.c(9965, 7720456246994862032L);
                    v2 /* !! */  = (CallSite)e1.c(21105, 6243371682802371452L);
lbl64:
                    // 2 sources

                    var4_3 /* !! */  = v1 ^ v2 /* !! */ ;
                    if (var2_2) break block19;
lbl66:
                    // 2 sources

                    var4_3 /* !! */  = (hi.a("G", (int)e1.c(17345, 5964880412501187224L), (int)e1.c(27816, 890392456731768256L), (long)834203424483934088L) ^ e1.c(28965, 4364753869892397092L) ^ e1.c(30208, 6805531062412586587L)) * e1.c(18842, 2613678965956120615L) + e1.c(23491, 7487177609151578688L);
                    if (var2_2) break block19;
                    ** GOTO lbl90
                    case -1844349789: 
                }
                break;
            }
            return;
        }
        block15: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1014175032: {
                    v6 = new Object[4];
                    v6[3] = Float.valueOf((float)hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)570041811359927594L), (long)789438897355831922L)), (long)371266768739483732L));
                    v6[2] = (Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)408729345255114052L), (long)789438897355831922L);
                    v6[1] = (Vec3)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1138341977127091030L), (int)var3_4, (long)516183098926246296L);
                    v6[0] = (Vec3)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1138341977127091030L), (int)(var3_4 - 1), (long)516183098926246296L);
                    hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)v6, (long)791898671907604080L);
                    ++var3_4;
                    if (!var2_2) {
                        return;
                    }
                    ** GOTO lbl90
                }
                case 1014175033: {
                    throw null;
                }
lbl90:
                // 2 sources

                var4_3 /* !! */  = (e1.c(291, 206654873423927393L) * e1.c(423, 7588309855636183139L) ^ e1.c(24339, 2221048644738385490L)) - e1.c(8892, 1868053997345340335L);
                continue block15;
                case 1014175031: 
            }
            break;
        }
    }

    private boolean lambda$new$0() {
        return (boolean)e1.m("a2llLBTV2eo2VDpn", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)1220198117365628765L)), (Enum)((Object)hi.a("j", (long)1116138719707845554L)));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean i(Object[] var1_1) {
        block13: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = hi.a("G", (int)((e1.c(19863, 5619718883874345989L) ^ e1.c(23747, 6925356391205700905L)) * e1.c(31304, 3132839209153799053L)), (int)e1.c(3544, 4661008076033676509L), (long)834203424483934088L) + e1.c(9779, 5482229869593329492L);
            if (!var2_2) ** GOTO lbl15
            block9: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("j", (long)609899922991887918L), (long)1099153674733698693L);
                            if (var2_2) break block14;
                            if (v0 /* !! */  != false) break block15;
                            v0 /* !! */  = var3_3 /* !! */  = (CallSite)((e1.c(27628, 6910366049847620490L) * e1.c(8155, 5961439533528794817L) * e1.c(14793, 3907024506247176435L) ^ e1.c(19656, 3257950044182156480L)) - e1.c(14874, 5654720724405903889L) ^ e1.c(29699, 5419174019176508683L));
                        }
                        if (!var2_2) break block16;
                    }
                    var3_3 /* !! */  = (CallSite)((e1.c(12620, 5632018784802334869L) * e1.c(13641, 371846312390356135L) ^ e1.c(14853, 8041907874567283595L)) + e1.c(14144, 8303931812995002010L) - e1.c(27195, 6147162444992590423L));
                    if (var2_2) ** GOTO lbl35
                }
                block10: while (true) {
                    switch (var3_3 /* !! */ ) {
                        default: {
                            continue block9;
                        }
                        case 929696098: {
                            v1 /* !! */  = e1.m("a2llLBTV2eo2VDpn", i(E ), (Dx)hi.a("\u00e9", (Object)hi.a("j", (long)609899922991887918L), (long)1247627757208379336L), (Enum)hi.a("j", (long)1241595054848115486L));
                            if (var2_2) ** GOTO lbl36
                            if (v1 /* !! */  == false) ** GOTO lbl35
                            ** GOTO lbl37
                        }
                        case 929696096: {
                            v2 = true;
                            var3_3 /* !! */  = (CallSite)(hi.a("G", (int)(hi.a("G", (int)e1.c(19477, 8038036567430305226L), (int)e1.c(24067, 919650468739123190L), (long)834203424483934088L) * e1.c(5086, 3702050502738790914L) ^ e1.c(7899, 814833345742358333L)), (int)e1.c(14165, 7111188301481963201L), (long)834203424483934088L) ^ e1.c(18796, 5321723358040559805L));
                            if (!var2_2) break block13;
                            ** GOTO lbl39
                        }
                        case 929696095: {
                            v2 = false;
                            if (var2_2) {
                                return v2;
                            }
                            ** GOTO lbl39
                        }
lbl35:
                        // 2 sources

                        v1 /* !! */  = var3_3 /* !! */  = (CallSite)((e1.c(1218, 1107033358477221044L) * e1.c(29094, 3863742804131752024L) * e1.c(22820, 3995087004434759715L) ^ e1.c(31725, 7682863570579202602L)) - e1.c(4848, 6075658316719901610L) ^ e1.c(6287, 4643063547663335821L));
lbl36:
                        // 2 sources

                        if (!var2_2) continue block10;
lbl37:
                        // 2 sources

                        var3_3 /* !! */  = (CallSite)((e1.c(10180, 3658523204774362771L) ^ e1.c(29796, 7077183712685272538L)) * e1.c(2517, 7406851770468126920L) ^ e1.c(12739, 2818195523241207910L));
                        continue block10;
lbl39:
                        // 2 sources

                        var3_3 /* !! */  = (CallSite)(hi.a("G", (int)(hi.a("G", (int)e1.c(18032, 5724688566369525600L), (int)e1.c(27664, 7391419358503548165L), (long)834203424483934088L) * e1.c(24669, 2663226411014207509L) ^ e1.c(18246, 4462031167034859060L)), (int)e1.c(29954, 4422829590689623153L), (long)834203424483934088L) ^ e1.c(29455, 3960229473239346035L));
                        break block13;
                        case 929696097: 
                    }
                    break;
                }
                break;
            }
            return true;
        }
        block11: while (true) {
            switch (var3_3 /* !! */ ) {
                case -1499496348: {
                    hi.a("G", (int)1, (long)1235507535267189928L);
                    var3_3 /* !! */  = (CallSite)(e1.c(3787, 4881891740516046619L) * e1.c(13091, 2522152343028755009L) ^ e1.c(25981, 275383614057069650L) ^ e1.c(2271, 5064796126650356182L) ^ e1.c(15052, 8636038965592024042L));
                    continue block11;
                }
            }
            break;
        }
        return v2;
    }

    private float T(Object[] objectArray) {
        Object object = objectArray[0];
        return (float)hi.a("G", (float)((float)hi.a("G", (double)e1.m("a2llLBTV2eo2VDpn", atan2(double double ), (double)hi.a("\u00e9", (Object)((Vec3)object), (long)1282612456329596420L), (double)hi.a("\u00e9", (Object)((Vec3)object), (long)1300412705618690751L)), (long)1261399724580134246L) - 90.0f), (long)604508068528351008L);
    }

    private e1() {
        super(e1.b(-27942, -24442), (vY)((Object)hi.a("j", (long)456237291118568391L)));
        this.Q = hi.a("\u00a5", (Object)this, (Object)e1.b(-27940, 6804), (Object)hi.a("j", (long)596012569370412339L), (long)426795652261052192L);
        this.F = hi.a("\u00a5", (Object)this, (Object)e1.b(-27941, 14371), (double)96.0, (double)8.0, (double)256.0, (double)1.0, (long)1077996338587307774L);
        this.x = hi.a("\u00a5", (Object)this, (Object)e1.b(-27947, 10432), (double)6.0, (double)1.0, (double)32.0, (double)0.5, (long)1077996338587307774L);
        this.d = hi.a("\u00a5", (Object)this, (Object)e1.b(-27937, -9459), (boolean)true, (long)1230617056439551805L);
        this.V = e1.m("a2llLBTV2eo2VDpn", b(java.lang.String int int int int ), (e1)this, (String)e1.b(-27945, -6778), (int)4, (int)0, (int)e1.c(10063, 5366282490800209457L), (int)1);
        this.u = hi.a("\u00a5", (Object)this, (Object)e1.b(-27946, -3288), (double)1.5, (double)0.0, (double)12.0, (double)0.5, (long)1077996338587307774L);
        this.w = e1.m("a2llLBTV2eo2VDpn", m(java.lang.String int int int int com.github.epsilon.yx ), (e1)this, (String)e1.b(-27948, -18791), (int)e1.c(23212, 6789072020452278998L), (int)e1.c(10858, 7027550804023440135L), (int)e1.c(15091, 3850736381955531436L), (int)1, this::lambda$new$0);
        this.n = e1.m("a2llLBTV2eo2VDpn", m(java.lang.String int int int int com.github.epsilon.yx ), (e1)this, (String)e1.b(-27938, 12698), (int)e1.c(21681, 4166396557423086772L), (int)e1.c(30928, 3388144383309193711L), (int)e1.c(3647, 3685960756303681420L), (int)e1.c(8053, 2835519575950837465L), this::lambda$new$1);
        this.z = hi.a("\u00a5", (Object)this, (Object)e1.b(-27939, -25672), (boolean)true, (long)1230617056439551805L);
        this.k = hi.a("\u00a5", (Object)this, (Object)e1.b(-27943, 19501), (Object)new Color(e1.c(26887, 272781203228799124L), e1.c(15931, 5715237434370156462L), e1.c(4409, 7997710594285291741L), e1.c(5544, 3526210192286928104L)), this::lambda$new$2, (long)1241661680830497550L);
        this.a = hi.a("\u00a5", (Object)this, (Object)e1.b(-27944, 1868), (double)2.5, (double)0.5, (double)8.0, (double)0.5, this::lambda$new$3, (long)988474938581310011L);
        hi.a("\u00f2", (Object)this, (List)((Object)hi.a("G", (long)1104179098836104202L)), (long)1138341977127091030L);
        e1.m("a2llLBTV2eo2VDpn", put(K V ), (Map)((Object)hi.a("\u00e9", (Object)this, (long)631074956408371750L)), (Object)hi.a("j", (long)596012569370412339L), (Object)new Of());
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)631074956408371750L), (Object)hi.a("j", (long)1116138719707845554L), (Object)new lw(), (long)1121879748672195632L);
    }

    public static /* bridge */ /* synthetic */ CallSite m(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    @yE(P=100)
    private void n(yi var1_1) {
        block14: {
            block12: {
                block13: {
                    block11: {
                        block16: {
                            block15: {
                                var2_2 = Dl.S();
                                var3_3 /* !! */  = e1.c(8769, 4135451665451416338L) + e1.c(8936, 1592199449722649598L) ^ e1.c(7642, 519347320108958928L);
                                if (var2_2) break block15;
lbl4:
                                // 2 sources

                                while (hi.a("\u00e9", (Object)this, (long)1184029253421754293L) != null) {
                                    break block11;
                                }
                                break block16;
lbl7:
                                // 1 sources

                                while (true) {
                                    v0 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1213239988097005382L);
                                    if (!var2_2) break block12;
                                    if (v0 /* !! */  != false) break block13;
                                    break block14;
                                    break;
                                }
lbl12:
                                // 1 sources

                                return;
lbl14:
                                // 1 sources

                                while (true) {
                                    hi.a("\u00a5", (Object)var1_1, (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1184029253421754293L), (long)1156776542310522770L), (long)402574539375266373L);
                                    hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{Float.valueOf((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1184029253421754293L), (long)898253011238143258L))}, (long)382049764311173290L);
                                    hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{(boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1184029253421754293L), (long)582266953697513980L)}, (long)795320219994177176L);
                                    hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{(boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1184029253421754293L), (long)359915755748350775L)}, (long)374643115609907404L);
                                    e1.m("a2llLBTV2eo2VDpn", E(boolean ), (yi)var1_1, (boolean)false);
                                    return;
                                }
                            }
lbl22:
                            // 5 sources

                            while (true) {
                                switch (var3_3 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl4
                                    }
                                    case 1261038121: {
                                        ** continue;
                                    }
                                    case 1261038122: {
                                        ** continue;
                                    }
                                    case 1261038125: {
                                        ** continue;
                                    }
                                    case 1261038124: 
                                }
                                throw null;
                            }
                        }
                        var3_3 /* !! */  = (e1.c(10503, 809455975197438326L) * e1.c(13947, 3490554927518510894L) ^ e1.c(29711, 5348734920888724937L)) - e1.c(28529, 3191425670478542421L);
                        if (var2_2) ** GOTO lbl22
                    }
                    var3_3 /* !! */  = hi.a("G", (int)e1.c(30826, 5834984533283742040L), (int)e1.c(27717, 9066071025212438000L), (long)834203424483934088L) ^ e1.c(11615, 8056567066509308996L) ^ e1.c(31493, 4874343954627404499L) ^ e1.c(16289, 1720009257207949311L);
                    if (var2_2) ** GOTO lbl22
                }
                v0 /* !! */  = (CallSite)((hi.a("G", (int)(e1.c(24152, 4457708140886165046L) + e1.c(11982, 964601129263986334L)), (int)e1.c(22669, 1934138492440969644L), (long)834203424483934088L) ^ e1.c(24144, 7995949496407852926L)) - e1.c(22513, 306994882054426160L) + e1.c(28271, 7485332188534552091L));
            }
            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (var2_2) ** GOTO lbl22
        }
        var3_3 /* !! */  = (e1.c(12596, 4336679570511423825L) * e1.c(25477, 2670470409170631343L) ^ e1.c(6821, 7806817408588170206L)) - e1.c(26770, 7039832674962878969L);
        ** while (true)
    }

    private static boolean lambda$onPlayerTick$0(LivingEntity livingEntity) {
        return livingEntity instanceof Player;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private yo J(Object var1_1, Object var2_2) {
        block32: {
            block31: {
                block30: {
                    var3_3 = Dl.S();
                    var10_4 = (e1.c(6184, 6809931630335344745L) ^ e1.c(14668, 4879402777247670501L)) + e1.c(14292, 627062781446614744L) ^ e1.c(4965, 6017776270545373922L);
                    if (!var3_3) ** GOTO lbl-1000
                    switch (var10_4) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var4_5 = hi.a("\u00a5", (Object)((Vec3)var2_2), (Object)hi.a("\u00a5", (Object)((LocalPlayer)var1_1), (long)1045344535518524325L), (long)1082050008038634828L);
                            cfr_temp_0 = hi.a("\u00a5", (Object)var4_5, (long)1192650552822508582L) - 0.01;
                            v0 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (!var3_3) break block30;
                            if (v0 >= 0) break;
                            break block31;
                        }
                        case -1400623905: {
                            throw null;
                        }
                    }
                    v0 = hi.a("G", (int)e1.c(29037, 8488961020529715556L), (int)e1.c(6241, 1789536774861275481L), (long)834203424483934088L) - e1.c(888, 5960417615672564507L);
                }
                var10_4 = (boolean)v0;
                if (var3_3) break block32;
            }
            var10_4 = (e1.c(9171, 1421433743704095445L) - e1.c(25756, 3120650543991143641L)) / e1.c(25282, 2317042591515261573L) * e1.c(2120, 4722655018714059208L) - e1.c(15921, 6335061452173174745L) ^ e1.c(31559, 6294084988372787927L);
            if (var3_3) break block32;
            ** GOTO lbl86
lbl23:
            // 2 sources

            while (true) {
                block37: {
                    block38: {
                        block36: {
                            block35: {
                                block34: {
                                    block33: {
                                        var8_9 = v1;
                                        cfr_temp_1 = hi.a("\u00e9", (Object)var4_5, (long)1294071886475894755L) - -e1.m("a2llLBTV2eo2VDpn", doubleValue(), (Double)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)927558510679801413L), (long)789438897355831922L)));
                                        v2 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                        if (!var3_3) break block33;
                                        if (v2 /* !! */  < 0) break block34;
                                        v2 /* !! */  = (reference)((hi.a("G", (int)(e1.c(18109, 2652947175586111210L) / 4), (int)e1.c(10520, 2541514864959516788L), (long)834203424483934088L) * e1.c(3849, 6213004397550917365L) ^ e1.c(26836, 8115468102390395175L)) - e1.c(23679, 6292366232650974684L));
                                    }
                                    var10_4 = (boolean)v2 /* !! */ ;
                                    if (var3_3) break block35;
                                }
                                var10_4 = e1.c(19128, 1307103512657990588L) / e1.c(2200, 563829109608960366L) - e1.c(26434, 7297553925615107660L);
                            }
                            v3 = var10_4;
                            if (!var3_3) break block36;
                            switch (v3) {
                                default: {
                                    v3 = true;
                                    var10_4 = (e1.c(17425, 6521330539127053775L) ^ e1.c(21578, 9174671303471074773L)) / e1.c(31763, 6841192541983090148L) * e1.c(23791, 3238871246286128600L) - e1.c(17146, 2060851044484094807L);
                                    if (var3_3) break block37;
                                    break block38;
                                }
                                case 1653393291: {
                                    hi.a("G", (long)1201432730590593927L);
                                    break;
                                }
                                case 1653393290: 
                            }
                            v3 = false;
                        }
                        if (!var3_3) ** GOTO lbl-1000
                    }
                    var10_4 = (e1.c(16348, 8850882282815514535L) ^ e1.c(14501, 5188135306907902350L)) / e1.c(10858, 7027550804023440135L) * e1.c(20946, 4660375484055717963L) - e1.c(11114, 30392251074310751L);
                }
                switch (var10_4 ? 1 : 0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var9_10 = v3;
                        return new yo((boolean)hi.a("\u00a5", (Object)var7_8, (long)858829626560254931L), (boolean)hi.a("\u00a5", (Object)var7_8, (long)649454972553546623L), (boolean)hi.a("\u00a5", (Object)var7_8, (long)1150884637714093633L), (boolean)e1.m("a2llLBTV2eo2VDpn", QQ(), (Dq)var7_8), var8_9, var9_10, (float)var5_6, (float)var6_7);
                    }
                    case -1355766933: 
                }
                throw null;
            }
        }
        block23: while (true) {
            switch (var10_4) {
                default: {
                    cfr_temp_2 = hi.a("G", (double)hi.a("\u00e9", (Object)var4_5, (long)1294071886475894755L), (long)1220789442640140846L) - hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)927558510679801413L), (long)789438897355831922L)), (long)637262500311742568L);
                    v4 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                    if (!var3_3) ** GOTO lbl87
                    if (v4 > 0) ** GOTO lbl86
                    ** GOTO lbl89
                }
                case -1704752942: {
                    var5_6 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var4_5}, (long)1266147330548898736L);
                    var6_7 = e1.m("a2llLBTV2eo2VDpn", X(java.lang.Object ), (e1)this, (Object)var4_5);
                    var7_8 = hi.a("\u00a5", (Object)this, (Object)new Object[]{Float.valueOf((float)e1.m("a2llLBTV2eo2VDpn", wrapDegrees(float ), (float)(var5_6 - e1.m("a2llLBTV2eo2VDpn", getYRot(), (LocalPlayer)((LocalPlayer)var1_1)))))}, (long)782654791516281053L);
                    cfr_temp_3 = hi.a("\u00e9", (Object)var4_5, (long)1294071886475894755L) - hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)927558510679801413L), (long)789438897355831922L)), (long)637262500311742568L);
                    v5 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                    if (!var3_3) ** GOTO lbl92
                    if (v5 <= 0) ** GOTO lbl91
                    ** GOTO lbl94
                }
                case -1704752943: {
                    hi.a("G", (long)421642512486132857L);
                    hi.a("G", (long)479976060357653372L);
                    var10_4 = e1.c(14462, 8729125962811073012L) / e1.c(29990, 8067223883631930450L) + e1.c(5102, 2414650229477034657L);
                    continue block23;
                }
lbl86:
                // 2 sources

                v4 = hi.a("G", (int)e1.c(19278, 4732717160079004394L), (int)e1.c(20017, 362333079624422988L), (long)834203424483934088L) - e1.c(10232, 1726079061135785667L);
lbl87:
                // 2 sources

                var10_4 = (boolean)v4;
                if (var3_3) continue block23;
lbl89:
                // 2 sources

                var10_4 = (hi.a("G", (int)(e1.c(4679, 7289587291263224397L) * e1.c(23848, 3088098086149227555L)), (int)e1.c(32603, 5540462949901248063L), (long)834203424483934088L) ^ e1.c(31124, 5002157149152420351L)) + e1.c(13168, 6564641521961495259L);
                continue block23;
lbl91:
                // 1 sources

                v5 = hi.a("G", (int)e1.c(16427, 4031804816007075955L), (int)e1.c(9142, 3619572995093101194L), (long)834203424483934088L) * e1.c(7054, 1805525953832895185L) - e1.c(15287, 8331044357310603784L);
lbl92:
                // 2 sources

                var10_4 = (boolean)v5;
                if (var3_3) ** GOTO lbl95
lbl94:
                // 2 sources

                var10_4 = (boolean)(hi.a("G", (int)(e1.c(21665, 2991308539254443369L) - e1.c(11474, 3836236979457521063L)), (int)e1.c(14664, 559413418777370857L), (long)834203424483934088L) + e1.c(10646, 8408410622867828854L) + e1.c(4260, 5191792249215338892L));
lbl95:
                // 2 sources

                v1 = var10_4;
                if (!var3_3) ** GOTO lbl108
                switch (v1) {
                    default: {
                        v1 = true;
                        break;
                    }
                    case 1538322080: {
                        v1 = false;
                        if (var3_3) ** GOTO lbl110
                        ** GOTO lbl23
                    }
                    case 1538322079: {
                        throw null;
                    }
                }
lbl108:
                // 2 sources

                var10_4 = e1.c(610, 4741062029252188719L) * e1.c(13603, 1276126426777054447L) - e1.c(12190, 6747832534446569052L) - e1.c(3040, 8179342162996941462L) - e1.c(31563, 510073433185166140L) - e1.c(29929, 4782770565432782165L);
                if (var3_3) ** GOTO lbl111
lbl110:
                // 2 sources

                var10_4 = e1.c(28715, 5878243391606761579L) * e1.c(9322, 4146362468106141097L) - e1.c(17430, 1783341606587342286L) - e1.c(5511, 1491346358973124082L) - e1.c(27619, 728649397170549417L) - e1.c(275, 1446848665225091442L);
lbl111:
                // 2 sources

                switch (var10_4) {
                    default: {
                        ** continue;
                    }
                    case 2106898569: 
                }
                return null;
                case -1704752941: 
            }
            break;
        }
        return null;
    }

    public yo B(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)1184029253421754293L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE(P=100)
    private void A(dR var1_1) {
        var2_2 = Dl.t();
        var6_3 /* !! */  = e1.c(22347, 9163457209792696135L) * e1.c(18073, 8312219120483540939L) / 5 - e1.c(7823, 7484372084990363603L);
        if (!var2_2) ** GOTO lbl59
lbl4:
        // 2 sources

        while (true) {
            block29: {
                block28: {
                    v0 = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                    if (var2_2) break block28;
                    if (v0 == false) break block29;
                    v0 = hi.a("G", (int)e1.c(15663, 167058417430029514L), (int)e1.c(14694, 5335114865553629304L), (long)834203424483934088L) + e1.c(31066, 6698339088633602271L) + e1.c(32258, 2085372614287927114L);
                }
                var6_3 /* !! */  = (int)v0;
                if (!var2_2) ** GOTO lbl59
            }
            var6_3 /* !! */  = e1.c(26498, 2147290278171525101L) * e1.c(1049, 8601904485761146217L) / e1.c(23660, 4081446931272172878L) ^ e1.c(17572, 4929413852009503990L);
            if (!var2_2) ** GOTO lbl59
            if (true) ** GOTO lbl111
            break;
        }
        block18: while (true) {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block32: {
                                block31: {
                                    block30: {
                                        if (var2_2) break block30;
                                        if (v1 == false) break block31;
                                        v1 = e1.m("a2llLBTV2eo2VDpn", max(int int ), (int)(e1.c(1817, 8234101162000211509L) - e1.c(28850, 8201578406907586886L)), (int)e1.c(18831, 1889517202857791543L)) + e1.c(32080, 1410589352164041889L);
                                    }
                                    var6_3 /* !! */  = (int)v1;
                                    if (!var2_2) break block32;
                                }
                                var6_3 /* !! */  = e1.c(10038, 597349923778527032L) / e1.c(23743, 1368527531238655284L) - e1.c(23703, 8036538190176519511L);
                            }
                            v2 = var6_3 /* !! */ ;
                            if (var2_2) break block33;
                            switch (v2) {
                                default: {
                                    v2 = true;
                                    break;
                                }
                                case -1723827424: {
                                    v2 = false;
                                    if (!var2_2) break block34;
                                    break block35;
                                }
                                case -1723827423: {
                                    hi.a("G", (long)919703241060757748L);
                                    hi.a("G", (long)1288142874633235773L);
                                    return;
                                }
                            }
                        }
                        var6_3 /* !! */  = (e1.c(9389, 6451832703576046871L) - e1.c(31592, 8417789891606094638L) - e1.c(14566, 4428039902166966538L) ^ e1.c(3596, 4749920697417848823L)) / e1.c(30286, 2750251553040117526L) ^ e1.c(31230, 5454597921000595586L);
                        if (!var2_2) break block36;
                    }
                    var6_3 /* !! */  = (e1.c(10288, 4247488664260866414L) - e1.c(10398, 1818400484835881154L) - e1.c(13369, 2111873913224719412L) ^ e1.c(802, 5852735677270481702L)) / e1.c(6829, 4948307354067551010L) ^ e1.c(32063, 597149901677733028L);
                    break block36;
                }
lbl49:
                // 2 sources

                while (true) {
                    block39: {
                        block38: {
                            block37: {
                                hi.a("\u00f2", (Object)this, (LivingEntity)hi.a("\u00a5", (Object)v3, (Object)new Object[]{hi.a("G", (double)v4, (float)360.0f, (boolean)true, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (boolean)v2, (Predicate<LivingEntity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onPlayerTick$0(net.minecraft.world.entity.LivingEntity ), (Lnet/minecraft/world/entity/LivingEntity;)Z)(), (int)1, (long)565380348239629269L)}, (long)607766364284685583L), (long)561176457683615671L);
                                if (var2_2) break block37;
                                if (hi.a("\u00e9", (Object)this, (long)561176457683615671L) != null) break block38;
                                var6_3 /* !! */  = (int)(hi.a("G", (int)((e1.c(13054, 428506752177597289L) ^ e1.c(1327, 1726811356214746455L)) + e1.c(30920, 5068833566639661511L)), (int)e1.c(10634, 8604427213454962725L), (long)834203424483934088L) + e1.c(18444, 3657853597181317546L));
                            }
                            if (!var2_2) break block39;
                        }
                        var6_3 /* !! */  = (e1.c(10919, 9206888477792531446L) * e1.c(24596, 440393363887733178L) * e1.c(4358, 2254455365437409633L) ^ e1.c(30888, 7143408497586053512L)) - e1.c(2272, 5917706718097199577L) + e1.c(21855, 8234967471349730440L);
                        if (var2_2) ** GOTO lbl118
                    }
                    block20: while (true) {
                        block47: {
                            block45: {
                                block46: {
                                    block44: {
                                        block42: {
                                            block43: {
                                                block41: {
                                                    block40: {
                                                        switch (var6_3 /* !! */ ) {
                                                            default: {
                                                                ** continue;
                                                            }
                                                            case -218764438: {
                                                                v5 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1213239988097005382L);
                                                                if (var2_2) break block40;
                                                                if (v5 /* !! */  != false) break;
                                                                break block41;
                                                            }
                                                            case -218764444: {
                                                                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)984646602830175325L);
                                                                return;
                                                            }
                                                            case -218764445: {
                                                                v3 = hi.a("j", (long)900154664388565012L);
                                                                v4 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)378942234786081044L), (long)789438897355831922L)), (long)637262500311742568L);
                                                                v1 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1326150127270850884L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                continue block18;
                                                            }
                                                            case -218764441: {
                                                                v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1220198117365628765L), (Object)hi.a("j", (long)596012569370412339L), (long)511460060498514638L);
                                                                if (var2_2) break block42;
                                                                if (v6 /* !! */  == false) break block43;
                                                                break block44;
                                                            }
                                                            case -218764440: {
                                                                cfr_temp_0 = (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("\u00e9", (Object)this, (long)561176457683615671L), (long)381917422772525830L) - hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)631673766320394656L), (long)789438897355831922L)), (long)637262500311742568L);
                                                                v7 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                if (var2_2) break block45;
                                                                if (v7 > 0) break block46;
                                                                break block47;
                                                            }
                                                            case -218764443: {
                                                                hi.a("\u00f2", (Object)this, null, (long)1184029253421754293L);
                                                                hi.a("\u00f2", (Object)this, (List)e1.m("a2llLBTV2eo2VDpn", of()), (long)1138341977127091030L);
                                                                return;
                                                            }
                                                            case -218764439: {
                                                                var3_4 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)561176457683615671L)}, (long)740719835344030967L);
                                                                var4_5 = new Xg((double)hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)631673766320394656L), (long)789438897355831922L)), (long)637262500311742568L), (double)hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)927558510679801413L), (long)789438897355831922L)), (long)637262500311742568L), (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)639917490770439902L), (long)789438897355831922L)), (long)1260538186742955956L), (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1139873793411894328L), (long)789438897355831922L)), (long)1260538186742955956L));
                                                                v8 = new Object[4];
                                                                v8[3] = var4_5;
                                                                v8[2] = var3_4;
                                                                v8[1] = hi.a("\u00e9", (Object)this, (long)561176457683615671L);
                                                                v8[0] = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L);
                                                                var5_6 = hi.a("\u00a5", (Object)((Oa)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)631074956408371750L), (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1220198117365628765L), (long)789438897355831922L), (long)717569244418368117L)), (Object)v8, (long)1185238100925584526L);
                                                                hi.a("\u00f2", (Object)this, (List)hi.a("\u00a5", (Object)var5_6, (long)569701128362668879L), (long)1138341977127091030L);
                                                                hi.a("\u00f2", (Object)this, (yo)e1.m("a2llLBTV2eo2VDpn", J(java.lang.Object java.lang.Object ), (e1)this, (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("\u00a5", (Object)var5_6, (long)969976277979937997L)), (long)1184029253421754293L);
                                                                return;
                                                            }
                                                            case -218764442: {
                                                                e1.m("a2llLBTV2eo2VDpn", p(float ), (float)1.0f);
                                                                hi.a("G", (int)2, (long)902898246708732704L);
                                                                var6_3 /* !! */  = hi.a("G", (int)e1.m("a2llLBTV2eo2VDpn", max(int int ), (int)(e1.c(30031, 2981220871081798747L) * e1.c(13479, 824043614745750770L)), (int)e1.c(19106, 8510914129544778478L)), (int)e1.c(14288, 6699478366098255516L), (long)834203424483934088L) ^ e1.c(11005, 875415375095493552L);
                                                                continue block20;
                                                            }
                                                        }
lbl111:
                                                        // 2 sources

                                                        v5 /* !! */  = (CallSite)(e1.c(7648, 3358119833583699008L) * e1.c(32429, 7190100719277156291L) - e1.c(8571, 949528128770504779L) + e1.c(14693, 8593655181952540982L));
                                                    }
                                                    var6_3 /* !! */  = (int)v5 /* !! */ ;
                                                    if (!var2_2) continue;
                                                }
                                                var6_3 /* !! */  = (int)(hi.a("G", (int)e1.c(1035, 6374601836483534326L), (int)e1.c(29667, 8133466832364776186L), (long)834203424483934088L) + e1.c(1994, 4715570145301061233L) + e1.c(30976, 7574669649262714971L));
                                                continue;
                                            }
                                            v6 /* !! */  = (CallSite)(e1.c(12610, 5508268290742085922L) / e1.c(26887, 6175037062954791251L) / e1.c(12364, 1167105134068165074L) + e1.c(570, 2154876858537761406L));
                                        }
                                        var6_3 /* !! */  = (int)v6 /* !! */ ;
                                        if (!var2_2) continue;
                                    }
                                    var6_3 /* !! */  = e1.c(3827, 4213268641773999963L) * e1.c(30803, 7067454399516615156L) + e1.c(31491, 1277756216361231056L) ^ e1.c(5264, 2875962826781281529L);
                                    if (!var2_2) continue;
                                }
                                v7 = e1.c(9209, 5938699715392633387L) / e1.c(26887, 6175037062954791251L) / e1.c(20706, 3102466895596456351L) + e1.c(27790, 3321666955050824938L);
                            }
                            var6_3 /* !! */  = (int)v7;
                            if (!var2_2) continue;
                        }
                        var6_3 /* !! */  = (int)(hi.a("G", (int)((e1.c(28288, 4117274888349267714L) ^ e1.c(20531, 8306020732915222985L)) + e1.c(162, 411316187825756509L)), (int)e1.c(32667, 856288566006851560L), (long)834203424483934088L) + e1.c(15987, 4413875257245853552L));
                    }
                    break;
                }
            }
            while (true) {
                switch (var6_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1531365014: 
                }
                e1.m("a2llLBTV2eo2VDpn", R());
                hi.a("G", (long)1206926475581937118L);
                var6_3 /* !! */  = e1.c(25207, 5493944865612839476L) / e1.c(25282, 2317042591515261573L) ^ e1.c(6333, 2418943812157882676L);
                if (!var2_2) ** break;
                continue block18;
            }
            break;
        }
    }

    private void S(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, null, (long)1184029253421754293L);
        hi.a("\u00f2", (Object)this, null, (long)561176457683615671L);
        hi.a("\u00f2", (Object)this, (List)((Object)hi.a("G", (long)1104179098836104202L)), (long)1138341977127091030L);
    }

    private Vec3 h(Object[] objectArray) {
        Object object = objectArray[0];
        return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((LivingEntity)object), (long)696157270322254464L), (Object)hi.a("\u00a5", (Object)e1.m("a2llLBTV2eo2VDpn", getDeltaMovement(), (LivingEntity)((LivingEntity)object)), (double)((double)hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)797101410224016120L), (long)789438897355831922L))), (long)1260538186742955956L)), (long)1080829230854482551L), (long)701637995304699260L);
    }

    private boolean lambda$new$3() {
        return (boolean)hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1051035695385107827L), (long)789438897355831922L))), (long)1000026253634408124L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Dq I(Object[] var1_1) {
        block43: {
            block49: {
                block48: {
                    block47: {
                        block50: {
                            block46: {
                                block45: {
                                    block44: {
                                        block42: {
                                            block41: {
                                                block40: {
                                                    block39: {
                                                        var2_2 = ((Float)var1_1[0]).floatValue();
                                                        var3_3 = Dl.S();
                                                        var5_4 /* !! */  = (e1.c(25303, 3455320592575642264L) + e1.c(25548, 7168830922617993894L) + e1.c(29407, 5516576103227534005L) ^ e1.c(17347, 2795796376992127897L)) - e1.c(1073, 7284337918491090343L);
                                                        if (var3_3) break block39;
                                                        ** GOTO lbl-1000
                                                    }
                                                    v0 /* !! */  = var5_4 /* !! */ ;
                                                    if (!var3_3) break block40;
                                                    switch (v0 /* !! */ ) {
                                                        case 1450381376: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            hi.a("G", (long)836611189179038322L);
                                                            hi.a("G", (long)1312880410300115507L);
                                                            break;
                                                        }
                                                    }
                                                    v0 /* !! */  = (int)hi.a("G", (int)hi.a("G", (float)(var2_2 / 45.0f), (long)400355798406630015L), (int)e1.c(17835, 5815086435208994018L), (long)458763840760618681L);
                                                }
                                                v1 /* !! */  = var4_5 = v0 /* !! */ ;
                                                if (!var3_3) break block41;
                                                switch (v1 /* !! */ ) {
                                                    case 0: {
                                                        var5_4 /* !! */  = e1.c(18837, 7037717544994115779L) / e1.c(23660, 4081446931272172878L) * e1.c(4346, 8700335983847197151L) + e1.c(20352, 1430917880058123849L) - e1.c(25167, 774279521310751683L) + e1.c(22081, 8828973043617926966L);
                                                        if (var3_3) break block42;
                                                    }
                                                    case 1: {
                                                        var5_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)e1.c(19238, 7175127086358794823L), (int)e1.c(7276, 7159290402741634360L), (long)834203424483934088L) * e1.c(5490, 5567080739872853230L)), (int)e1.c(7426, 8772808136610464890L), (long)834203424483934088L) ^ e1.c(23245, 6506021249711244117L);
                                                        if (var3_3) break block42;
                                                    }
                                                    case 2: {
                                                        var5_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(e1.c(18108, 8631606838104661750L) / 5), (int)e1.c(5495, 5067646061651414064L), (long)834203424483934088L) + e1.c(6045, 2831740912972222076L)), (int)e1.c(28648, 4381348015192782580L), (long)834203424483934088L) ^ e1.c(31630, 1704219562406945453L);
                                                        if (var3_3) break block42;
                                                    }
                                                    case 3: {
                                                        var5_4 /* !! */  = (int)(e1.m("a2llLBTV2eo2VDpn", max(int int ), (int)(e1.c(21104, 7151549922179681091L) ^ e1.c(31937, 6246690979811468651L)), (int)e1.c(18660, 7818539955387404586L)) - e1.c(11567, 2893296982274798843L));
                                                        if (var3_3) break block42;
                                                    }
                                                    case 4: {
                                                        var5_4 /* !! */  = (int)(hi.a("G", (int)e1.c(24842, 1837295597807122791L), (int)e1.c(3316, 1449611215919863117L), (long)834203424483934088L) * e1.c(20918, 1414205629376006145L) + e1.c(3265, 6294532449877218736L));
                                                        if (var3_3) break block42;
                                                    }
                                                    case 5: {
                                                        var5_4 /* !! */  = (int)(hi.a("G", (int)e1.c(8132, 6365456897186317967L), (int)e1.c(10037, 2722497246181326691L), (long)834203424483934088L) + e1.c(29198, 1789286998363319147L));
                                                        if (var3_3) break block42;
                                                    }
                                                    case 6: {
                                                        var5_4 /* !! */  = e1.c(8938, 1852734494300896149L) * e1.c(5552, 6577142743059418584L) / e1.c(23660, 4081446931272172878L) ^ e1.c(38, 8513795577648273824L);
                                                        if (var3_3) ** break;
                                                        break;
                                                    }
                                                    {
                                                    }
                                                }
                                                v1 /* !! */  = (int)(hi.a("G", (int)e1.c(17513, 1572862654132133262L), (int)e1.c(17145, 3676029326675319561L), (long)834203424483934088L) - e1.c(20696, 1280851941845830080L));
                                            }
                                            var5_4 /* !! */  = v1 /* !! */ ;
                                        }
                                        switch (var5_4 /* !! */ ) {
                                            default: {
                                                v2 = new Dq(true, false, false, false);
                                                var5_4 /* !! */  = e1.c(28963, 2138754497496623153L) / 5 - e1.c(30588, 5819210396353179358L);
                                                if (var3_3) break block43;
                                                break block44;
                                            }
                                            case -888816116: {
                                                v2 = new Dq(true, false, false, true);
                                                break block44;
                                            }
                                            case -888816112: {
                                                v2 = new Dq(false, false, false, true);
                                                break block45;
                                            }
                                            case -888816111: {
                                                v2 = new Dq(false, true, false, true);
                                                break block46;
                                            }
                                            case -888816110: {
                                                break;
                                            }
                                            case -888816113: {
                                                v2 = new Dq(false, true, true, false);
                                                break block47;
                                            }
                                            case -888816118: {
                                                v2 = new Dq(false, false, true, false);
                                                break block48;
                                            }
                                            case -888816115: {
                                                v2 = new Dq(true, false, true, false);
                                                if (!var3_3) {
                                                    return v2;
                                                }
                                                break block49;
                                            }
                                            case -888816117: {
                                                hi.a("G", (long)421642512486132857L);
                                                hi.a("G", (float)2.0f, (long)450110752184348458L);
                                            }
                                        }
                                        v2 = new Dq(false, true, false, false);
                                        break block50;
                                    }
                                    var5_4 /* !! */  = e1.c(15698, 3080652684140897552L) / 5 - e1.c(745, 2101731284216568692L);
                                    if (var3_3) break block43;
                                }
                                var5_4 /* !! */  = e1.c(15698, 3080652684140897552L) / 5 - e1.c(745, 2101731284216568692L);
                                if (var3_3) break block43;
                            }
                            var5_4 /* !! */  = e1.c(15698, 3080652684140897552L) / 5 - e1.c(745, 2101731284216568692L);
                            if (var3_3) break block43;
                        }
                        var5_4 /* !! */  = e1.c(15698, 3080652684140897552L) / 5 - e1.c(745, 2101731284216568692L);
                        if (var3_3) break block43;
                    }
                    var5_4 /* !! */  = e1.c(15698, 3080652684140897552L) / 5 - e1.c(745, 2101731284216568692L);
                    if (var3_3) break block43;
                }
                var5_4 /* !! */  = e1.c(15698, 3080652684140897552L) / 5 - e1.c(745, 2101731284216568692L);
                if (var3_3) break block43;
            }
            var5_4 /* !! */  = e1.c(15698, 3080652684140897552L) / 5 - e1.c(745, 2101731284216568692L);
        }
        switch (var5_4 /* !! */ ) {
            default: {
                return v2;
            }
            case 1275935090: 
        }
        throw null;
    }

    private float X(Object object) {
        CallSite callSite = e1.m("a2llLBTV2eo2VDpn", max(double double ), (double)0.001, (double)hi.a("\u00a5", (Object)((Vec3)object), (long)494256544832194443L));
        return (float)hi.a("G", (float)((float)(-hi.a("G", (double)e1.m("a2llLBTV2eo2VDpn", atan2(double double ), (double)hi.a("\u00e9", (Object)((Vec3)object), (long)1294071886475894755L), (double)callSite), (long)1261399724580134246L))), (float)-90.0f, (float)90.0f, (long)390336973585993938L);
    }

    private boolean lambda$new$1() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1220198117365628765L), (Object)hi.a("j", (long)1116138719707845554L), (long)511460060498514638L);
    }

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)984646602830175325L);
    }

    private boolean lambda$new$2() {
        return (boolean)hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1051035695385107827L), (long)789438897355831922L))), (long)1000026253634408124L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String g(Object[] var1_1) {
        block14: {
            block12: {
                block13: {
                    block11: {
                        block16: {
                            block15: {
                                var2_2 = Dl.t();
                                var3_3 /* !! */  = e1.c(30733, 777453298867708235L) - e1.c(22679, 4998473159200768275L) + e1.c(16007, 5763568024623671268L) + e1.c(22091, 6790881988869885856L);
                                if (!var2_2) break block15;
lbl5:
                                // 2 sources

                                while (hi.a("\u00e9", (Object)this, (long)561176457683615671L) != null) {
                                    break block11;
                                }
                                break block16;
lbl8:
                                // 1 sources

                                while (true) {
                                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)561176457683615671L), (long)938038053496602901L);
                                    if (var2_2) break block12;
                                    if (v0 /* !! */  == false) break block13;
                                    break block14;
                                    break;
                                }
lbl13:
                                // 2 sources

                                return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)561176457683615671L), (long)575194872422435314L), (long)445233814433577985L);
lbl15:
                                // 1 sources

                                return hi.a("\u00a5", (Object)((dx)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1220198117365628765L), (long)789438897355831922L)), (long)1175495002059560279L);
                            }
lbl18:
                            // 5 sources

                            while (true) {
                                switch (var3_3 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl5
                                    }
                                    case -950645022: {
                                        ** continue;
                                    }
                                    case -950645024: {
                                        ** GOTO lbl13
                                    }
                                    case -950645021: {
                                        ** continue;
                                    }
                                    case -950645023: 
                                }
                                hi.a("G", (long)561066160558538168L);
                                hi.a("G", (long)1124891203117124897L);
                                if (var2_2) ** break;
                                break;
                            }
                            ** while (true)
                        }
                        var3_3 /* !! */  = hi.a("G", (int)((e1.c(5708, 8347769673840250678L) + e1.c(14031, 168867576155893506L)) * e1.c(1518, 8384079052193389758L)), (int)e1.c(18854, 1247017115721863656L), (long)834203424483934088L) / e1.c(18480, 5728729696897929661L) ^ e1.c(11199, 1384311751701164794L);
                        if (!var2_2) ** GOTO lbl18
                    }
                    var3_3 /* !! */  = ((e1.c(19013, 8000884731262472984L) * e1.c(20437, 3830484657239824286L) - e1.c(12349, 1978365791096596948L)) / e1.c(28866, 5032088492516288989L) ^ e1.c(15170, 7290013662014267940L)) + e1.c(21274, 6227925722633603630L);
                    if (!var2_2) ** GOTO lbl18
                }
                v0 /* !! */  = (CallSite)(hi.a("G", (int)((e1.c(322, 4541700715539650626L) + e1.c(10548, 6673500394853560651L)) * e1.c(4662, 2894992657489087044L)), (int)e1.c(29377, 4305187405815687878L), (long)834203424483934088L) / e1.c(23660, 4081446931272172878L) ^ e1.c(15505, 6560326962485191975L));
            }
            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (!var2_2) ** GOTO lbl18
        }
        var3_3 /* !! */  = (int)(hi.a("G", (int)e1.c(11166, 4097559752534454897L), (int)e1.c(2966, 1444107268835955600L), (long)834203424483934088L) * e1.c(26402, 4276015919955689106L) + e1.c(31015, 1655616205998563653L));
        ** while (true)
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFF92DE) & 0xFFFF;
        if (c[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 31;
                case 1 -> 237;
                case 2 -> 150;
                case 3 -> 182;
                case 4 -> 94;
                case 5 -> 22;
                case 6 -> 212;
                case 7 -> 18;
                case 8 -> 81;
                case 9 -> 151;
                case 10 -> 44;
                case 11 -> 36;
                case 12 -> 114;
                case 13 -> 160;
                case 14 -> 154;
                case 15 -> 84;
                case 16 -> 95;
                case 17 -> 129;
                case 18 -> 89;
                case 19 -> 83;
                case 20 -> 217;
                case 21 -> 98;
                case 22 -> 224;
                case 23 -> 10;
                case 24 -> 58;
                case 25 -> 37;
                case 26 -> 88;
                case 27 -> 222;
                case 28 -> 109;
                case 29 -> 55;
                case 30 -> 34;
                case 31 -> 152;
                case 32 -> 14;
                case 33 -> 64;
                case 34 -> 228;
                case 35 -> 163;
                case 36 -> 8;
                case 37 -> 125;
                case 38 -> 235;
                case 39 -> 124;
                case 40 -> 13;
                case 41 -> 57;
                case 42 -> 11;
                case 43 -> 66;
                case 44 -> 145;
                case 45 -> 1;
                case 46 -> 148;
                case 47 -> 67;
                case 48 -> 101;
                case 49 -> 61;
                case 50 -> 28;
                case 51 -> 121;
                case 52 -> 74;
                case 53 -> 227;
                case 54 -> 226;
                case 55 -> 32;
                case 56 -> 146;
                case 57 -> 232;
                case 58 -> 214;
                case 59 -> 130;
                case 60 -> 50;
                case 61 -> 190;
                case 62 -> 233;
                case 63 -> 106;
                case 64 -> 110;
                case 65 -> 127;
                case 66 -> 252;
                case 67 -> 218;
                case 68 -> 39;
                case 69 -> 143;
                case 70 -> 164;
                case 71 -> 178;
                case 72 -> 175;
                case 73 -> 210;
                case 74 -> 103;
                case 75 -> 211;
                case 76 -> 221;
                case 77 -> 157;
                case 78 -> 156;
                case 79 -> 25;
                case 80 -> 79;
                case 81 -> 171;
                case 82 -> 205;
                case 83 -> 6;
                case 84 -> 91;
                case 85 -> 176;
                case 86 -> 250;
                case 87 -> 219;
                case 88 -> 207;
                case 89 -> 112;
                case 90 -> 180;
                case 91 -> 26;
                case 92 -> 46;
                case 93 -> 216;
                case 94 -> 97;
                case 95 -> 115;
                case 96 -> 187;
                case 97 -> 85;
                case 98 -> 102;
                case 99 -> 53;
                case 100 -> 30;
                case 101 -> 23;
                case 102 -> 82;
                case 103 -> 168;
                case 104 -> 59;
                case 105 -> 87;
                case 106 -> 192;
                case 107 -> 199;
                case 108 -> 253;
                case 109 -> 162;
                case 110 -> 70;
                case 111 -> 93;
                case 112 -> 229;
                case 113 -> 80;
                case 114 -> 40;
                case 115 -> 73;
                case 116 -> 191;
                case 117 -> 197;
                case 118 -> 202;
                case 119 -> 131;
                case 120 -> 195;
                case 121 -> 165;
                case 122 -> 230;
                case 123 -> 7;
                case 124 -> 144;
                case 125 -> 238;
                case 126 -> 139;
                case 127 -> 43;
                case 128 -> 105;
                case 129 -> 254;
                case 130 -> 99;
                case 131 -> 170;
                case 132 -> 236;
                case 133 -> 118;
                case 134 -> 184;
                case 135 -> 86;
                case 136 -> 215;
                case 137 -> 132;
                case 138 -> 48;
                case 139 -> 179;
                case 140 -> 42;
                case 141 -> 63;
                case 142 -> 77;
                case 143 -> 206;
                case 144 -> 92;
                case 145 -> 255;
                case 146 -> 122;
                case 147 -> 17;
                case 148 -> 135;
                case 149 -> 108;
                case 150 -> 153;
                case 151 -> 76;
                case 152 -> 208;
                case 153 -> 47;
                case 154 -> 209;
                case 155 -> 149;
                case 156 -> 12;
                case 157 -> 15;
                case 158 -> 193;
                case 159 -> 173;
                case 160 -> 49;
                case 161 -> 174;
                case 162 -> 239;
                case 163 -> 16;
                case 164 -> 69;
                case 165 -> 41;
                case 166 -> 183;
                case 167 -> 169;
                case 168 -> 247;
                case 169 -> 134;
                case 170 -> 27;
                case 171 -> 35;
                case 172 -> 198;
                case 173 -> 167;
                case 174 -> 243;
                case 175 -> 71;
                case 176 -> 223;
                case 177 -> 116;
                case 178 -> 24;
                case 179 -> 155;
                case 180 -> 234;
                case 181 -> 19;
                case 182 -> 186;
                case 183 -> 201;
                case 184 -> 56;
                case 185 -> 147;
                case 186 -> 4;
                case 187 -> 140;
                case 188 -> 62;
                case 189 -> 68;
                case 190 -> 29;
                case 191 -> 5;
                case 192 -> 45;
                case 193 -> 90;
                case 194 -> 251;
                case 195 -> 65;
                case 196 -> 172;
                case 197 -> 72;
                case 198 -> 128;
                case 199 -> 38;
                case 200 -> 119;
                case 201 -> 137;
                case 202 -> 246;
                case 203 -> 213;
                case 204 -> 52;
                case 205 -> 75;
                case 206 -> 3;
                case 207 -> 33;
                case 208 -> 166;
                case 209 -> 225;
                case 210 -> 133;
                case 211 -> 220;
                case 212 -> 200;
                case 213 -> 177;
                case 214 -> 240;
                case 215 -> 111;
                case 216 -> 9;
                case 217 -> 60;
                case 218 -> 203;
                case 219 -> 2;
                case 220 -> 196;
                case 221 -> 117;
                case 222 -> 78;
                case 223 -> 158;
                case 224 -> 248;
                case 225 -> 54;
                case 226 -> 159;
                case 227 -> 161;
                case 228 -> 107;
                case 229 -> 142;
                case 230 -> 21;
                case 231 -> 96;
                case 232 -> 104;
                case 233 -> 242;
                case 234 -> 126;
                case 235 -> 194;
                case 236 -> 100;
                case 237 -> 123;
                case 238 -> 20;
                case 239 -> 188;
                case 240 -> 120;
                case 241 -> 189;
                case 242 -> 138;
                case 243 -> 185;
                case 244 -> 245;
                case 245 -> 141;
                case 246 -> 231;
                case 247 -> 51;
                case 248 -> 0;
                case 249 -> 181;
                case 250 -> 204;
                case 251 -> 244;
                case 252 -> 249;
                case 253 -> 241;
                case 254 -> 113;
                default -> 136;
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
            e1.c[n3] = new String(cArray).intern();
        }
        return c[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x594F;
        if (h[n2] == null) {
            e1.h[n2] = (int)(e[n2] ^ l);
        }
        return h[n2];
    }
}
