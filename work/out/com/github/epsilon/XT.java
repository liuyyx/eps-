/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  me.sofurry.via.Bi
 *  me.sofurry.via.OD
 *  me.sofurry.via.OK
 *  me.sofurry.via.OR
 *  me.sofurry.via.Ot
 *  me.sofurry.via.W
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.Version
 *  net.fabricmc.loader.api.entrypoint.EntrypointContainer
 *  net.fabricmc.loader.api.metadata.Person
 *  net.minecraft.commands.CommandBuildContext
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.mojang.brigadier.CommandDispatcher;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.sofurry.via.Bi;
import me.sofurry.via.OD;
import me.sofurry.via.OK;
import me.sofurry.via.OR;
import me.sofurry.via.Ot;
import me.sofurry.via.W;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;
import net.fabricmc.loader.api.metadata.Person;
import net.minecraft.commands.CommandBuildContext;

public final class XT
implements W {
    private static final XT H;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "4)Vs\u0018pE+/Y".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 104;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 42;
                                break;
                            }
                            case 1: {
                                v9 = 40;
                                break;
                            }
                            case 2: {
                                v9 = 95;
                                break;
                            }
                            case 3: {
                                v9 = 109;
                                break;
                            }
                            case 4: {
                                v9 = 21;
                                break;
                            }
                            case 5: {
                                v9 = 106;
                                break;
                            }
                            default: {
                                v9 = 94;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                XT.b = new String(v10).intern();
                var0_1 = 3046510909911259726L;
                var6_2 = new long[74];
                var3_3 = 0;
                var4_4 = "\u00b1\u00c2\u000b\u0080=I\u00b95\u00873]M'\u0006=\u00b7b!\u00b9\u0089\u0092\u0090\u008a\u00d6\u0006'#<8m\u00ef\u00b0\u001f\u0005:\u00ad;\u00c9\u00ac\u00a6z\u0005\u00f2 c\u009d\u00e7\u0007\u00b2\u00f1\u00b7\u00fb\u00a0\u0001<\u00a1\u00da`\u00db]\u001bQ6x01\u00fb\u00f9\u00a4\u0019QQ\u00ee(\u00ef\u0089\u0000\u00b2<\u00a6\u00e9\u00fb\u00b7\u00d7\u0083<\u009d\u00da\u00af\u0093)\u00a9X\bm\u00ca\u0015I\u001f\u0082+\u00ee\u00fa\u00ce\u0087\u00fby\u00f1\u00f0\u00a4\t\u00ef\u00c6\u00f1\u0098OtW%\u0018\u00a2nG\u00ba\u0091\u009e\u00ba\u0016w\u00d6\u0086C`\u00df=+.\u00a0\u00f7\u00e6Q\u009b1pag4so\u00d21Q\u00f5e\u008c\u0093\u00c7\u00f9k\u0084\u00e3,\\9\u00fa^\u00ad\u00e4\u00f3\u001d.\u00e6J\b\u001b\u001d\u00fa\u00c9n=\u00875,#\u00f5\u00f7$\u00e94\u00b3S\u00b8y`ci\u0098;\u00ee}\u00fb\u00e1\u00da\u00b2\u00dd zpOk\u009a=\u00ff\u0084\u00d9q\u00ffr\u00be\u00cfcu\u001a\u00be>\u00ddv\u00ec\u00c8\u00f3m[\u00ab\u008a\u00a5\u00f5*l\u00b0\u00c6#.\u0094\u0012\u00f1\u00f3>(\u0086A\u00ea\u00a2\u00b1g&\u0002\u0006\u00e6\u00b6\u000276\u00ae|\u0010\u00fa\u00b3M\u00f8\u00cby}\u00cc'\u00d2\u00e1\u00f1\u00ce\u00a0\u00bb~\u00b4\u0089V\u0011\u00cbynP\u0001\u0098}_\u00aehj=m\u00bew\u00a0\u0082\u00d6l\u00e2\u00e75}\u00d1\u00d0\u00c6\u00e9ZF<NE\u0019/\u000eu\u00c7\u0086w&\u00c9\u009e\u00efK\u0092\u0004\u00ad-?K>\u001ca\u00da\u00fc^\u00e1+\u00a2)d\u0088\u00b6j*V\\\u0097\u0015\u001d s\u00ca\u0006r~0\u00f5\u0081\u0015D,\"\u00e7R\u0090\u0016\u00be7\u009bJ\u0089\u0005\u00b3\u001c7C\u00e1\u0096\u00f0\u00f9\u0088\u00b9\u00fc\u009f/\u008f\u0006>\u00b7\u0092\u0091\u0084\u00de\u00d9vD6\u00da0\u009btQ\u009f\u0012{\u00be\u0003$d\u00e4\n\u00b8u\u0014\u00b6\u0088\u001f\u00c6\u00a8\u00ee\u00f6\u00a2\u008e}\u00a3c\u0004\u00b7q\u0000.\u00cd?\u00d1\u00f8-\u00114\u00e1\u00fe\u00c0\u00b1\u00e7\r\u001b\u0018\u00e6\u00b9zW3\u000f(\u00ad\u0014W@42\u00a9\u00e3\u00f5~T\u0002O\u00a9\u00d7'X\u00a2\u0018v%\u009b\u00d2T\u008f7\u00c8V\u00d6PK\u0085Nq\u0007\u00ab\u00ee\u00da\u0000Z\u00f1\u0006\u00c5|\u00f8\u00d8\u000f\u00f9\u0094G\u0085\u00d0>M\u00ad\u00c8\u0093\u0084\u0016\u0007\u00d8\u0004\u001ah\u000fK\u0015 mavA;+\u001b\u00f4\u00b2\u00f3\u00d8\u00cc\u00a6\u00ec\u0082z\u00f1\u00c1\u00b1+Z)/\u000b\u00ac\u000b\u0000a\f[\u00a6\u0091\u00d0V\u0018\u00e6A\u00cc\u0082\u001eI_\u00d7\u00fa\u008a\u00e6\u00c9\u009f\u001b";
                var5_5 = "\u00b1\u00c2\u000b\u0080=I\u00b95\u00873]M'\u0006=\u00b7b!\u00b9\u0089\u0092\u0090\u008a\u00d6\u0006'#<8m\u00ef\u00b0\u001f\u0005:\u00ad;\u00c9\u00ac\u00a6z\u0005\u00f2 c\u009d\u00e7\u0007\u00b2\u00f1\u00b7\u00fb\u00a0\u0001<\u00a1\u00da`\u00db]\u001bQ6x01\u00fb\u00f9\u00a4\u0019QQ\u00ee(\u00ef\u0089\u0000\u00b2<\u00a6\u00e9\u00fb\u00b7\u00d7\u0083<\u009d\u00da\u00af\u0093)\u00a9X\bm\u00ca\u0015I\u001f\u0082+\u00ee\u00fa\u00ce\u0087\u00fby\u00f1\u00f0\u00a4\t\u00ef\u00c6\u00f1\u0098OtW%\u0018\u00a2nG\u00ba\u0091\u009e\u00ba\u0016w\u00d6\u0086C`\u00df=+.\u00a0\u00f7\u00e6Q\u009b1pag4so\u00d21Q\u00f5e\u008c\u0093\u00c7\u00f9k\u0084\u00e3,\\9\u00fa^\u00ad\u00e4\u00f3\u001d.\u00e6J\b\u001b\u001d\u00fa\u00c9n=\u00875,#\u00f5\u00f7$\u00e94\u00b3S\u00b8y`ci\u0098;\u00ee}\u00fb\u00e1\u00da\u00b2\u00dd zpOk\u009a=\u00ff\u0084\u00d9q\u00ffr\u00be\u00cfcu\u001a\u00be>\u00ddv\u00ec\u00c8\u00f3m[\u00ab\u008a\u00a5\u00f5*l\u00b0\u00c6#.\u0094\u0012\u00f1\u00f3>(\u0086A\u00ea\u00a2\u00b1g&\u0002\u0006\u00e6\u00b6\u000276\u00ae|\u0010\u00fa\u00b3M\u00f8\u00cby}\u00cc'\u00d2\u00e1\u00f1\u00ce\u00a0\u00bb~\u00b4\u0089V\u0011\u00cbynP\u0001\u0098}_\u00aehj=m\u00bew\u00a0\u0082\u00d6l\u00e2\u00e75}\u00d1\u00d0\u00c6\u00e9ZF<NE\u0019/\u000eu\u00c7\u0086w&\u00c9\u009e\u00efK\u0092\u0004\u00ad-?K>\u001ca\u00da\u00fc^\u00e1+\u00a2)d\u0088\u00b6j*V\\\u0097\u0015\u001d s\u00ca\u0006r~0\u00f5\u0081\u0015D,\"\u00e7R\u0090\u0016\u00be7\u009bJ\u0089\u0005\u00b3\u001c7C\u00e1\u0096\u00f0\u00f9\u0088\u00b9\u00fc\u009f/\u008f\u0006>\u00b7\u0092\u0091\u0084\u00de\u00d9vD6\u00da0\u009btQ\u009f\u0012{\u00be\u0003$d\u00e4\n\u00b8u\u0014\u00b6\u0088\u001f\u00c6\u00a8\u00ee\u00f6\u00a2\u008e}\u00a3c\u0004\u00b7q\u0000.\u00cd?\u00d1\u00f8-\u00114\u00e1\u00fe\u00c0\u00b1\u00e7\r\u001b\u0018\u00e6\u00b9zW3\u000f(\u00ad\u0014W@42\u00a9\u00e3\u00f5~T\u0002O\u00a9\u00d7'X\u00a2\u0018v%\u009b\u00d2T\u008f7\u00c8V\u00d6PK\u0085Nq\u0007\u00ab\u00ee\u00da\u0000Z\u00f1\u0006\u00c5|\u00f8\u00d8\u000f\u00f9\u0094G\u0085\u00d0>M\u00ad\u00c8\u0093\u0084\u0016\u0007\u00d8\u0004\u001ah\u000fK\u0015 mavA;+\u001b\u00f4\u00b2\u00f3\u00d8\u00cc\u00a6\u00ec\u0082z\u00f1\u00c1\u00b1+Z)/\u000b\u00ac\u000b\u0000a\f[\u00a6\u0091\u00d0V\u0018\u00e6A\u00cc\u0082\u001eI_\u00d7\u00fa\u008a\u00e6\u00c9\u009f\u001b".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = " \u0099\u0014-4Wl\u00de\u00bf\u00042\u0016\u00db\u0082T\u00ad";
                    var5_5 = " \u0099\u0014-4Wl\u00de\u00bf\u00042\u0016\u00db\u0082T\u00ad".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        XT.c = var6_2;
        XT.d = new Integer[74];
        XT.H = new XT();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public List K(Object[] var1_1) {
        block22: {
            var2_2 = Dl.S();
            var10_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)(hi.a("G", (int)XT.a(20589, 8518067712523963902L), (int)XT.a(9640, 9040259927255808038L), (long)834203424483934088L) * XT.a(18015, 3773627652129102821L)), (int)XT.a(4110, 1069441750650768815L), (long)834203424483934088L), (int)XT.a(7023, 5124458708578060026L), (long)834203424483934088L) ^ XT.a(17982, 3538139790899190714L);
            if (var2_2) break block22;
lbl5:
            // 2 sources

            while (true) {
                var3_4 = new ArrayList<E>();
                var4_5 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)755637638058133330L), (long)359607998555771027L), (long)752227520890008894L);
                if (var2_2) ** GOTO lbl81
lbl10:
                // 2 sources

                while (true) {
                    hi.a("G", (int)XT.a(20969, 4105257266295213149L), (int)XT.a(18259, 2196826577019476725L), (long)1169154015991105135L);
                    XT.V("rbgST7nYWAZuJ26G", values());
lbl14:
                    // 2 sources

                    while (true) {
                        v0 /* !! */  = XT.V("rbgST7nYWAZuJ26G", hasNext(), (Iterator)var4_5);
                        if (!var2_2) ** GOTO lbl84
                        if (v0 /* !! */  == false) ** GOTO lbl83
                        ** GOTO lbl86
                        break;
                    }
                    break;
                }
                break;
            }
lbl19:
            // 2 sources

            while (true) {
                v1 = hi.a("\u00a5", (Object)var8_9, (long)984088978567310565L);
                if (!var2_2) ** GOTO lbl56
                if (v1 == false) ** GOTO lbl55
                ** GOTO lbl58
                break;
            }
lbl24:
            // 2 sources

            while (true) {
                hi.a("\u00a5", var3_4, (Object)new Bi((String)hi.a("\u00a5", (Object)var6_7, (long)552107938360828649L), (String)hi.a("\u00a5", (Object)var6_7, (long)1274941869958764584L), (String)XT.V("rbgST7nYWAZuJ26G", getFriendlyString(), (Version)hi.a("\u00a5", (Object)var6_7, (long)655480147597492058L)), var7_8), (long)615358212536192384L);
                if (!var2_2) {
                    return hi.a("G", var3_4, (long)497368790579535219L);
                }
                ** GOTO lbl91
                break;
            }
        }
        while (true) {
            switch (var10_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -720704772: 
            }
            hi.a("G", (int)2, (boolean)true, (long)541412231224622628L);
            hi.a("G", (float)0.0f, (long)855506680013936433L);
            var10_3 /* !! */  = (XT.a(27005, 4567523770219279531L) - XT.a(985, 168955535423757891L)) * XT.a(18587, 1569729029764420919L) - XT.a(26751, 3408741927169275332L);
        }
lbl-1000:
        // 4 sources

        {
            switch (var10_3 /* !! */ ) {
                case 1260903570: {
                    ** continue;
                }
                default: {
                    ** continue;
                }
                case 1260903571: {
                    var5_6 = (ModContainer)XT.V("rbgST7nYWAZuJ26G", next(), (Iterator)var4_5);
                    var6_7 = XT.V("rbgST7nYWAZuJ26G", getMetadata(), (ModContainer)var5_6);
                    var7_8 = new ArrayList<E>();
                    var8_9 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var6_7, (long)1115439211965006796L), (long)752227520890008894L);
                    if (!var2_2) ** GOTO lbl19
                    var10_3 /* !! */  = (hi.a("G", (int)XT.a(27703, 6865625795100520857L), (int)XT.a(8531, 4435975567617850499L), (long)834203424483934088L) ^ XT.a(29458, 4977753973834395279L) ^ XT.a(15682, 7165744310725697781L)) / XT.a(6659, 869328802174486424L) + XT.a(2096, 1099064983766128057L);
                    if (var2_2) break;
lbl55:
                    // 2 sources

                    v1 = hi.a("G", (int)(XT.a(24783, 6291414705293376854L) ^ XT.a(1336, 9112378525429881066L)), (int)XT.a(31129, 8552631516968789034L), (long)834203424483934088L) + XT.a(23275, 3118706344776927097L);
lbl56:
                    // 2 sources

                    var10_3 /* !! */  = (int)v1;
                    if (var2_2) break;
lbl58:
                    // 2 sources

                    var10_3 /* !! */  = XT.a(6666, 644876536208017301L) / XT.a(22842, 6291298991499379866L) + XT.a(7686, 8702937943279059857L) + XT.a(259, 3102758635479424189L) + XT.a(6040, 5758927502315080212L);
                    break;
                }
                case 1260903572: {
                    return hi.a("G", var3_4, (long)497368790579535219L);
                }
            }
            do lbl-1000:
            // 3 sources

            {
                block23: {
                    switch (var10_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -85000031: {
                            var9_10 = (Person)XT.V("rbgST7nYWAZuJ26G", next(), (Iterator)var8_9);
                            hi.a("\u00a5", var7_8, (Object)new OK((String)hi.a("\u00a5", (Object)var9_10, (long)1114541827642946472L), (Map)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var9_10, (long)1084746085310468935L), (long)527166876649615553L)), (long)615358212536192384L);
                            if (var2_2) break block23;
                            ** GOTO lbl24
                        }
                        case -85000029: {
                            ** continue;
                        }
                        case -85000030: {
                            hi.a("G", (long)1031195239253115725L);
                            hi.a("G", (long)889012284371480360L);
                            var10_3 /* !! */  = XT.a(7945, 942507890151670490L) - XT.a(9899, 2943515888180394778L) - XT.a(30161, 1794132835527043154L) ^ XT.a(28042, 1513829680023482405L) ^ XT.a(21389, 5959818357543439878L) ^ XT.a(12655, 6107542155384810711L);
                            if (var2_2) ** GOTO lbl-1000
                        }
                    }
lbl81:
                    // 2 sources

                    var10_3 /* !! */  = (hi.a("G", (int)XT.a(7210, 5378439968639959448L), (int)XT.a(32076, 5881458798927716557L), (long)834203424483934088L) ^ XT.a(10450, 3726263027936359803L)) / 2 + XT.a(16611, 4718588002502876466L);
                    if (var2_2) continue block19;
lbl83:
                    // 2 sources

                    v0 /* !! */  = (CallSite)((XT.a(5203, 6443996329847933316L) * XT.a(3344, 7899539747471347840L) * XT.a(2150, 1234590309088875990L) - XT.a(19479, 3441397589600866731L)) / XT.a(11232, 3553988794412299879L) - XT.a(27981, 920208670985367785L));
lbl84:
                    // 2 sources

                    var10_3 /* !! */  = (int)v0 /* !! */ ;
                    if (var2_2) continue block19;
lbl86:
                    // 2 sources

                    var10_3 /* !! */  = XT.a(10224, 831804859816704637L) ^ XT.a(31033, 1864386733957457030L) ^ XT.a(10050, 6393167896248384154L);
                    continue block19;
                }
                var10_3 /* !! */  = (hi.a("G", (int)XT.a(14302, 853806047546272267L), (int)XT.a(30561, 4552062476264483531L), (long)834203424483934088L) ^ XT.a(18909, 8432511579056608373L) ^ XT.a(25930, 5217664302152792307L)) / XT.a(10490, 1762836849317246284L) + XT.a(25632, 9143648602384284043L);
            } while (var2_2);
lbl91:
            // 2 sources

            var10_3 /* !! */  = (hi.a("G", (int)XT.a(432, 219520996118584338L), (int)XT.a(31960, 1923835271955325248L), (long)834203424483934088L) ^ XT.a(10452, 254638341919110492L)) / 2 + XT.a(4497, 5192171912901741628L);
            ** while (true)
        }
    }

    private XT() {
    }

    public static /* bridge */ /* synthetic */ CallSite V(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public boolean j(Object[] objectArray) {
        return true;
    }

    public void p(Object[] objectArray) {
        OD oD = (OD)objectArray[0];
        hi.a("\u00a5", (Object)hi.a("j", (long)609036646325003283L), (arg_0, arg_1) -> XT.lambda$registerClientCommands$0(oD, arg_0, arg_1), (long)452580658695756002L);
    }

    public static void u() {
        hi.a("G", (Object)new Object[]{hi.a("j", (long)733273026435495395L)}, (long)810740188252619900L);
    }

    public boolean Z(String string) {
        return (boolean)hi.a("\u00a5", (Object)hi.a("G", (long)755637638058133330L), (Object)string, (long)458629616665842939L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void z(Object[] var1_1) {
        block15: {
            var2_2 = (Ot)var1_1[0];
            var3_3 = Dl.t();
            var6_4 /* !! */  = XT.a(10818, 96098087243020228L) * XT.a(9875, 3050737180484827917L) - XT.a(13009, 5460758961880690526L);
            if (var3_3) ** GOTO lbl-1000
            switch (var6_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var4_5 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)755637638058133330L), (Object)XT.b, OR.class, (long)1071337289818644931L), (long)1240653736693366367L);
                    if (!var3_3) break;
                    break block15;
                }
                case -1828249247: {
                    XT.V("rbgST7nYWAZuJ26G", R(float float ), (float)1.0f, (float)-1.0f);
                    return;
                }
            }
            var6_4 /* !! */  = (XT.a(19757, 7409519176249020558L) / 3 + XT.a(6813, 8333167637063223069L)) / XT.a(14384, 3155228893453084055L) + XT.a(4554, 2433145373409823855L);
            if (!var3_3) ** GOTO lbl29
            ** GOTO lbl23
        }
        block8: while (true) {
            block18: {
                block17: {
                    block16: {
                        v0 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)984088978567310565L);
                        if (var3_3) break block16;
                        if (v0 /* !! */  != false) break block17;
lbl23:
                        // 2 sources

                        v0 /* !! */  = (CallSite)(XT.a(16106, 3476479867527193468L) * XT.a(24676, 1154659040911998448L) - XT.a(28760, 7021040459612335597L));
                    }
                    var6_4 /* !! */  = (int)v0 /* !! */ ;
                    if (!var3_3) break block18;
                }
                var6_4 /* !! */  = XT.a(20557, 7073687099333086684L) - XT.a(1934, 5551770327851719255L) + XT.a(17175, 4750260503159479947L) + XT.a(29154, 1500405971233320032L);
            }
            block9: while (true) {
                switch (var6_4 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case -711037772: {
                        var5_6 = (EntrypointContainer)hi.a("\u00a5", (Object)var4_5, (long)470012372636416268L);
                        hi.a("\u00a5", (Object)((OR)hi.a("\u00a5", (Object)var5_6, (long)643702492655885884L)), (Object)new Object[]{var2_2}, (long)518099647463770191L);
                        if (var3_3) {
                            return;
                        }
                        ** GOTO lbl44
                    }
                    case -711037773: {
                        hi.a("G", (long)596429899407897303L);
                        hi.a("G", (long)785752490276612505L);
                        return;
                    }
lbl44:
                    // 1 sources

                    var6_4 /* !! */  = (XT.a(16144, 7391928324912964269L) / 3 + XT.a(1548, 5382625424849951625L)) / XT.a(5698, 8855076264797162390L) + XT.a(5277, 878670781822224663L);
                    continue block9;
                    case -711037775: 
                }
                break;
            }
            break;
        }
    }

    private static void lambda$registerClientCommands$0(OD oD, CommandDispatcher commandDispatcher, CommandBuildContext commandBuildContext) {
        hi.a("\u00a5", (Object)oD, (Object)new Object[]{commandDispatcher}, (long)1181659924561212834L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5D91;
        if (d[n2] == null) {
            XT.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
