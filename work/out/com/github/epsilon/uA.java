/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.Holder
 *  net.minecraft.world.effect.MobEffectInstance
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.XC;
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
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;

public class uA
extends e {
    private final Dx<XC> n = hi.a("\u00a5", (Object)this, (Object)uA.b(21389, -30471), (Object)hi.a("j", (long)662170914640071745L), this::lambda$new$0, (long)1045130156176245124L);
    public static final uA W;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    private void lambda$new$0(XC xC) {
        block2: {
            CallSite callSite;
            block3: {
                boolean bl = Dl.S();
                if (xC != hi.a("j", (long)662170914640071745L)) break block2;
                callSite = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L);
                if (!bl) break block3;
                if (callSite == null) break block2;
                callSite = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L);
            }
            hi.a("\u00a5", (Object)callSite, (Object)hi.a("j", (long)999543647938742609L), (long)408600061563701209L);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "C#\u001dx\n\u00fe<\u00c8\u00cb\u00fb\u0092l\u00bcg\u009d";
                    var12_3 = "C#\u001dx\n\u00fe<\u00c8\u00cb\u00fb\u0092l\u00bcg\u009d".length();
                    var9_4 = 4;
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
                    v4 = 106;
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
                                    v11 = 29;
                                    break;
                                }
                                case 1: {
                                    v11 = 46;
                                    break;
                                }
                                case 2: {
                                    v11 = 113;
                                    break;
                                }
                                case 3: {
                                    v11 = 25;
                                    break;
                                }
                                case 4: {
                                    v11 = 104;
                                    break;
                                }
                                case 5: {
                                    v11 = 124;
                                    break;
                                }
                                default: {
                                    v11 = 126;
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
                uA.a = var13;
                uA.b = new String[2];
                var0_7 = 3855797344899326110L;
                var6_8 = new long[76];
                var3_9 = 0;
                var4_10 = "fJ\u00cd\u00de\u0094\u00be\u00bcP6\u001cO\u0086]qah.\u00c03\u00e1x3\u00f3\u00f9\u00b4\u00f8\u00e8M\u0096\u00bar\u00f0h\u00c1\u00d8\u00d5re\u00fc\u00d5\u001c\n\u00a3\r[\u00a7\u0098\u0085f\u0007\u00a9v\u00c2Omq\u009b\u0014\u0000)\u008f,\u00b5\u00f5\u0017\u0099X0m2\u00e5\u00f3b\u00c7\u0006?,\u0086\u00f4\u0084\u0086\u0014\u00f8\u007f3\u00f9\u00e7\u0012\u00e0:\u00c9]Z\u008c4T\u0002\u00f36\u00c0\u000b$q\nZ^\u0092X<\u00877,_!?\u0090#\u0014*\u0091U\u00e6\u0084!v.8t\u00a4\u00a9\u00fb\u00f6\u00d3\r\u00c6\u00fbR\u0088\f^f`\u00fc\u00a0\u00fc-\u0096jM\u0018\r^\u00ffx\u00ba\u00ea\u00be\u00024+d\u0090>\u0018\u0094n\u00c3}S\u0088\u00bf\u00b6\u00a9y\u00fe\u00e8T7\u0016J\u00f1\u0087\u0083\u008b\u00fc\u00c4\u00a2L;\u00f2\u00ce\u00cd\u00cf\u00d5\u0016\u00fe9\u00e9\u0018\u0084\u00ce\u00fe\ba\u00eb\u00d9\"\u0091I\u0098\u00b2\r\u00ac,\u00d4\u0099L&\u0092aK\u0086)R\u0014\u00ce\u009e\u0015CH\u00c0V\u0016\u00a2\u008b\u00d6\u0094\u00af0>\u0083*\u0015\u001f\u0010\u00f7\u00e8\u0016\u00ebC[y\u0087\u00dc\u00a4\u00a4|t\u0086\u00c2D\u00bf`\u00c0\u00fb\u00e5\u00b3\u00fc\u00af\u0019\u0000eDY}\u00d0\u00bfr\u00d1\u00b8\u00a6\u00a6\u0098\u00f4PA\u0085\u009a\r5\u0090z\u0097\u00f4\u0006\u00f6\u00d6\u00fa(d\u008a\u0017\u0097\u00c59\u00beOD\u001cP\u00c6O\u00da\u00c3OR\u0081\u00f4t\u00d3\u0012\u001b\u00dd\u00ff\u00ee\u00e0\u00ecU\u0011\u00f6h\u0000j\u00db\u001d\u000fv\u000f)3\u00ec\u001d\u00b9*\u0002\u001bz8^\u0088\u00b2\u0082<^&\u00ad\u0003\u0095V\u00f3m\u0081H\u00ad\u00a5\u00b1L0\u00a7*~Z\u00b3!\u00ccx\u00d4=\u0096U\u0085\u0089\u00b2ly\u009aD\u00cd\u0081\n\u009fI\u00acEeG~\u00b4\u001f\u008b\u00b2K@Z\\\t8l8\u009a%\u00c3\u009dC&9lv8d\u00aa\u0019\u0017H\u001b\u001a\u00da\u009f,+^\u00f8\u00f4\"\u00ad\u00d2Bv\u008b^\u00b8i\u00883\u0003\u00ec\u00cc\u00d3\u0080\u0086R\u0097\u00e6\u00bar\u001d\u0087\u0091o\u0089?\u00b8\u00ba\u0015\u00f8*_\\\u0094F\u009dS\t\u00f0V\u0001\u0001\u00e8\u00ea\u00c2]\u0013\u00b9\u0095:;\u00b0@\b7\u000e\u0080\u00a7*\u00cb\u00e9^xT\u00a5\u00dd\f\u00c3\u0017\u000f\u00eb\u009a\u00b4\u009bV\u00a4\u00027\u00e1\u0019HH\u00ce\u009f5\u00ac$\u00ba)FT\u009by\u001aP\u00a0X\u00e8\u0010\u00d8\u00a9\u007f\u00b8\u00e5\u001c\u00ac\u00c11<\u00cbEv\u00c7\u0091\\\u00073\u00c3\u00d0\u00d40\u00bb\u0001\u0081[\u00b80\u001a\u00f7\u0086/\u00c1[\u00e2;N\u00f4\u00d2\u0005u\u00d6\u00c9\u00a2\u00edR\u00eb7t\u001a\u0018\u00e0H\u00fe\u0003\u00ca\u00fa\u00a8";
                var5_11 = "fJ\u00cd\u00de\u0094\u00be\u00bcP6\u001cO\u0086]qah.\u00c03\u00e1x3\u00f3\u00f9\u00b4\u00f8\u00e8M\u0096\u00bar\u00f0h\u00c1\u00d8\u00d5re\u00fc\u00d5\u001c\n\u00a3\r[\u00a7\u0098\u0085f\u0007\u00a9v\u00c2Omq\u009b\u0014\u0000)\u008f,\u00b5\u00f5\u0017\u0099X0m2\u00e5\u00f3b\u00c7\u0006?,\u0086\u00f4\u0084\u0086\u0014\u00f8\u007f3\u00f9\u00e7\u0012\u00e0:\u00c9]Z\u008c4T\u0002\u00f36\u00c0\u000b$q\nZ^\u0092X<\u00877,_!?\u0090#\u0014*\u0091U\u00e6\u0084!v.8t\u00a4\u00a9\u00fb\u00f6\u00d3\r\u00c6\u00fbR\u0088\f^f`\u00fc\u00a0\u00fc-\u0096jM\u0018\r^\u00ffx\u00ba\u00ea\u00be\u00024+d\u0090>\u0018\u0094n\u00c3}S\u0088\u00bf\u00b6\u00a9y\u00fe\u00e8T7\u0016J\u00f1\u0087\u0083\u008b\u00fc\u00c4\u00a2L;\u00f2\u00ce\u00cd\u00cf\u00d5\u0016\u00fe9\u00e9\u0018\u0084\u00ce\u00fe\ba\u00eb\u00d9\"\u0091I\u0098\u00b2\r\u00ac,\u00d4\u0099L&\u0092aK\u0086)R\u0014\u00ce\u009e\u0015CH\u00c0V\u0016\u00a2\u008b\u00d6\u0094\u00af0>\u0083*\u0015\u001f\u0010\u00f7\u00e8\u0016\u00ebC[y\u0087\u00dc\u00a4\u00a4|t\u0086\u00c2D\u00bf`\u00c0\u00fb\u00e5\u00b3\u00fc\u00af\u0019\u0000eDY}\u00d0\u00bfr\u00d1\u00b8\u00a6\u00a6\u0098\u00f4PA\u0085\u009a\r5\u0090z\u0097\u00f4\u0006\u00f6\u00d6\u00fa(d\u008a\u0017\u0097\u00c59\u00beOD\u001cP\u00c6O\u00da\u00c3OR\u0081\u00f4t\u00d3\u0012\u001b\u00dd\u00ff\u00ee\u00e0\u00ecU\u0011\u00f6h\u0000j\u00db\u001d\u000fv\u000f)3\u00ec\u001d\u00b9*\u0002\u001bz8^\u0088\u00b2\u0082<^&\u00ad\u0003\u0095V\u00f3m\u0081H\u00ad\u00a5\u00b1L0\u00a7*~Z\u00b3!\u00ccx\u00d4=\u0096U\u0085\u0089\u00b2ly\u009aD\u00cd\u0081\n\u009fI\u00acEeG~\u00b4\u001f\u008b\u00b2K@Z\\\t8l8\u009a%\u00c3\u009dC&9lv8d\u00aa\u0019\u0017H\u001b\u001a\u00da\u009f,+^\u00f8\u00f4\"\u00ad\u00d2Bv\u008b^\u00b8i\u00883\u0003\u00ec\u00cc\u00d3\u0080\u0086R\u0097\u00e6\u00bar\u001d\u0087\u0091o\u0089?\u00b8\u00ba\u0015\u00f8*_\\\u0094F\u009dS\t\u00f0V\u0001\u0001\u00e8\u00ea\u00c2]\u0013\u00b9\u0095:;\u00b0@\b7\u000e\u0080\u00a7*\u00cb\u00e9^xT\u00a5\u00dd\f\u00c3\u0017\u000f\u00eb\u009a\u00b4\u009bV\u00a4\u00027\u00e1\u0019HH\u00ce\u009f5\u00ac$\u00ba)FT\u009by\u001aP\u00a0X\u00e8\u0010\u00d8\u00a9\u007f\u00b8\u00e5\u001c\u00ac\u00c11<\u00cbEv\u00c7\u0091\\\u00073\u00c3\u00d0\u00d40\u00bb\u0001\u0081[\u00b80\u001a\u00f7\u0086/\u00c1[\u00e2;N\u00f4\u00d2\u0005u\u00d6\u00c9\u00a2\u00edR\u00eb7t\u001a\u0018\u00e0H\u00fe\u0003\u00ca\u00fa\u00a8".length();
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
                    var4_10 = "\u000eaR\u00cd5\u0095X\u00e3'\u00bd\u00d9\u00e4\u00d0\u00f0\u00d8\u00c3";
                    var5_11 = "\u000eaR\u00cd5\u0095X\u00e3'\u00bd\u00d9\u00e4\u00d0\u00f0\u00d8\u00c3".length();
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
        uA.c = var6_8;
        uA.d = new Integer[76];
        uA.W = new uA();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void b(Object[] var1_1) {
        block17: {
            block15: {
                block16: {
                    block14: {
                        block12: {
                            block13: {
                                var2_2 = Dl.S();
                                var3_3 /* !! */  = uA.c(11538, 3896736879596651922L) / uA.c(31463, 85244479541613154L) * uA.c(3383, 7715004840757683586L) + uA.c(17350, 7596165809902332781L) - uA.c(5225, 9052143102200282352L);
                                if (!var2_2) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                        if (!var2_2) break block12;
                                        if (v0 /* !! */  != false) break block13;
                                        break block14;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)522440374215381542L), (Object)hi.a("j", (long)662170914640071745L), (long)511460060498514638L);
                                        if (!var2_2) break block15;
                                        if (v1 /* !! */  == false) break block16;
                                        break block17;
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    return;
lbl17:
                                    // 1 sources

                                    while (true) {
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)999543647938742609L), (long)408600061563701209L);
                                        return;
                                    }
                                }
lbl21:
                                // 6 sources

                                while (true) {
                                    switch (var3_3 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case -2051636264: {
                                            ** continue;
                                        }
                                        case -2051636265: {
                                            ** continue;
                                        }
                                        case -2051636261: {
                                            ** continue;
                                        }
                                        case -2051636262: 
                                    }
                                    hi.a("G", (long)672840781314038705L);
                                    return;
                                }
                            }
                            v0 /* !! */  = (CallSite)(uA.c(5096, 3711213425603017550L) * uA.c(26292, 3805399989853785716L) / 3 - uA.c(24400, 3064992404075591660L) + uA.c(23227, 4029425040263688706L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) ** GOTO lbl21
                    }
                    var3_3 /* !! */  = (hi.a("G", (int)uA.c(19418, 7584731723740193630L), (int)uA.c(18194, 8394230950343290757L), (long)834203424483934088L) * uA.c(19257, 8577869262099129255L) ^ uA.c(27576, 3051704819453985657L)) - uA.c(27945, 6043791087890236837L) - uA.c(8528, 1543853054343072150L);
                    if (var2_2) ** GOTO lbl21
                }
                v1 /* !! */  = (CallSite)(hi.a("G", (int)(uA.c(32745, 3755599190668908326L) + uA.c(28472, 175571877658003445L) + uA.c(12311, 1971193749655083144L)), (int)uA.c(19844, 4039254235758175532L), (long)834203424483934088L) + uA.c(674, 1661248769982982708L) ^ uA.c(10217, 7481006047021911902L));
            }
            var3_3 /* !! */  = (int)v1 /* !! */ ;
            if (var2_2) ** GOTO lbl21
        }
        var3_3 /* !! */  = uA.c(13122, 2058850699702033368L) * uA.c(10221, 6911955039866343242L) / 3 - uA.c(22785, 3689140305805717958L) + uA.c(20218, 6146056878906811968L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean I(Object[] var1_1) {
        block12: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = uA.c(14075, 4116650578932522601L) / uA.c(1363, 1045903627619036615L) * uA.c(7233, 2079442699193676992L) + uA.c(9632, 690144459389685033L);
            if (!var2_2) ** GOTO lbl16
            block9: while (true) {
                block15: {
                    block14: {
                        block13: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1099153674733698693L);
                            if (var2_2) break block13;
                            if (v0 /* !! */  != false) break block14;
                            v0 /* !! */  = (CallSite)((uA.c(9528, 8923474230410300827L) ^ uA.c(17863, 5814789898934267208L)) * uA.c(4240, 2212787119569336358L) / uA.c(31291, 7929432296814547589L) ^ uA.c(30095, 8220337354549075275L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block15;
                    }
                    var3_3 /* !! */  = uA.c(13612, 2080881260138683777L) / uA.c(31975, 25846143018210374L) - uA.c(6657, 7029071093202514596L);
                    if (var2_2) ** GOTO lbl39
                }
                while (true) {
                    block17: {
                        block16: {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    continue block9;
                                }
                                case -700120814: {
                                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)522440374215381542L), (Object)hi.a("j", (long)662170914640071745L), (long)511460060498514638L);
                                    if (var2_2) break block16;
                                    if (v1 /* !! */  == false) break;
                                    break block17;
                                }
                                case -700120815: {
                                    v2 = true;
                                    var3_3 /* !! */  = (uA.c(30991, 2811580724576031165L) ^ uA.c(14238, 234536816753368838L) ^ uA.c(31833, 6964697742874252439L) ^ uA.c(27209, 689265843774817012L)) - uA.c(31312, 3846887024789099203L) + uA.c(15763, 1093816367006930178L);
                                    if (var2_2) {
                                        break block9;
                                    }
                                    break block12;
                                }
                                case -700120811: {
                                    v2 = false;
                                    if (!var2_2) break block9;
                                    return v2;
                                }
                                case -700120812: {
                                    throw null;
                                }
                            }
lbl39:
                            // 2 sources

                            v1 /* !! */  = (CallSite)((uA.c(29873, 4574379550908226577L) ^ uA.c(10698, 2311460219078623561L)) * uA.c(13241, 6127157241335864127L) / uA.c(12574, 2837276052123015602L) ^ uA.c(30157, 6018198616735227137L));
                        }
                        var3_3 /* !! */  = (int)v1 /* !! */ ;
                        if (!var2_2) continue;
                    }
                    var3_3 /* !! */  = uA.c(10813, 2831980592064217734L) * uA.c(31049, 441982415437337027L) ^ uA.c(2521, 2087797922594480412L) ^ uA.c(28115, 5370958759805814095L);
                }
                break;
            }
            var3_3 /* !! */  = (uA.c(29525, 5867783512499854330L) ^ uA.c(22852, 5835548243145404902L) ^ uA.c(22214, 9189692039688633973L) ^ uA.c(1991, 5646250613704945413L)) - uA.c(24918, 7908024635060783576L) + uA.c(16650, 6480385974115215779L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v2;
            }
            case -364369927: 
        }
        return false;
    }

    private uA() {
        super(uA.b(21388, 31549), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
    }

    public static /* bridge */ /* synthetic */ CallSite P(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    @yE
    private void B(dR var1_1) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var2_2 = Dl.S();
                        var3_3 /* !! */  = (uA.c(25037, 4998431186249156933L) ^ uA.c(27812, 3371882033719444527L)) - uA.c(13227, 5225572137337412372L) ^ uA.c(26969, 739611792067494363L);
                        if (!var2_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)522440374215381542L), (Object)hi.a("j", (long)648144184065652072L), (long)511460060498514638L);
                                if (!var2_2) break block12;
                                if (v0 /* !! */  == false) break block13;
                                break block14;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                hi.a("G", (double)2.0, (long)514485682373957547L);
                                hi.a("G", (long)393077516895504904L);
lbl14:
                                // 2 sources

                                while (true) {
                                    uA.P("eZLxHignWKRHaJdC", addEffect(net.minecraft.world.effect.MobEffectInstance ), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (MobEffectInstance)new MobEffectInstance((Holder)hi.a("j", (long)999543647938742609L), -1, 0));
                                    if (!var2_2) lbl-1000:
                                    // 2 sources

                                    {
                                        return;
                                    }
                                    break block15;
                                    break;
                                }
                                break;
                            }
                        }
lbl21:
                        // 5 sources

                        while (true) {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case -1620962646: {
                                    ** continue;
                                }
                                case -1620962649: {
                                    ** continue;
                                }
                                ** case -1620962647:
lbl30:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    v0 /* !! */  = (CallSite)((hi.a("G", (int)uA.c(30044, 70686305652645356L), (int)uA.c(15074, 4782311298525581894L), (long)834203424483934088L) ^ uA.c(29455, 7650241234026306434L)) - uA.c(9788, 7305803292003126951L) - uA.c(9663, 1950056382135913749L));
                }
                var3_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) ** GOTO lbl21
            }
            var3_3 /* !! */  = (uA.c(9931, 1343707061618200155L) ^ uA.c(6418, 472682190672163238L)) + uA.c(13590, 8868284105468403157L) ^ uA.c(14056, 4713388179806707270L);
            if (var2_2) ** GOTO lbl21
        }
        var3_3 /* !! */  = (hi.a("G", (int)uA.c(15645, 2434354252900160933L), (int)uA.c(16945, 5134785131701119660L), (long)834203424483934088L) ^ uA.c(2996, 9168273013698716421L)) - uA.c(8743, 7629134111840717490L) - uA.c(4617, 922618914734996110L);
        ** while (true)
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x538D) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 140;
                case 1 -> 209;
                case 2 -> 179;
                case 3 -> 60;
                case 4 -> 135;
                case 5 -> 49;
                case 6 -> 202;
                case 7 -> 119;
                case 8 -> 5;
                case 9 -> 145;
                case 10 -> 111;
                case 11 -> 72;
                case 12 -> 233;
                case 13 -> 7;
                case 14 -> 142;
                case 15 -> 90;
                case 16 -> 115;
                case 17 -> 249;
                case 18 -> 14;
                case 19 -> 126;
                case 20 -> 138;
                case 21 -> 16;
                case 22 -> 99;
                case 23 -> 1;
                case 24 -> 71;
                case 25 -> 57;
                case 26 -> 167;
                case 27 -> 242;
                case 28 -> 2;
                case 29 -> 220;
                case 30 -> 152;
                case 31 -> 174;
                case 32 -> 155;
                case 33 -> 199;
                case 34 -> 55;
                case 35 -> 180;
                case 36 -> 217;
                case 37 -> 63;
                case 38 -> 130;
                case 39 -> 106;
                case 40 -> 189;
                case 41 -> 27;
                case 42 -> 17;
                case 43 -> 182;
                case 44 -> 67;
                case 45 -> 188;
                case 46 -> 254;
                case 47 -> 31;
                case 48 -> 41;
                case 49 -> 87;
                case 50 -> 205;
                case 51 -> 21;
                case 52 -> 128;
                case 53 -> 197;
                case 54 -> 69;
                case 55 -> 24;
                case 56 -> 183;
                case 57 -> 19;
                case 58 -> 148;
                case 59 -> 43;
                case 60 -> 96;
                case 61 -> 147;
                case 62 -> 117;
                case 63 -> 195;
                case 64 -> 151;
                case 65 -> 172;
                case 66 -> 245;
                case 67 -> 44;
                case 68 -> 133;
                case 69 -> 225;
                case 70 -> 3;
                case 71 -> 208;
                case 72 -> 103;
                case 73 -> 213;
                case 74 -> 50;
                case 75 -> 73;
                case 76 -> 91;
                case 77 -> 236;
                case 78 -> 186;
                case 79 -> 201;
                case 80 -> 181;
                case 81 -> 45;
                case 82 -> 206;
                case 83 -> 26;
                case 84 -> 191;
                case 85 -> 247;
                case 86 -> 234;
                case 87 -> 92;
                case 88 -> 129;
                case 89 -> 170;
                case 90 -> 134;
                case 91 -> 20;
                case 92 -> 176;
                case 93 -> 196;
                case 94 -> 219;
                case 95 -> 102;
                case 96 -> 86;
                case 97 -> 187;
                case 98 -> 4;
                case 99 -> 168;
                case 100 -> 28;
                case 101 -> 175;
                case 102 -> 153;
                case 103 -> 112;
                case 104 -> 212;
                case 105 -> 61;
                case 106 -> 164;
                case 107 -> 255;
                case 108 -> 77;
                case 109 -> 162;
                case 110 -> 251;
                case 111 -> 40;
                case 112 -> 58;
                case 113 -> 54;
                case 114 -> 238;
                case 115 -> 198;
                case 116 -> 173;
                case 117 -> 89;
                case 118 -> 22;
                case 119 -> 48;
                case 120 -> 250;
                case 121 -> 66;
                case 122 -> 171;
                case 123 -> 237;
                case 124 -> 184;
                case 125 -> 13;
                case 126 -> 124;
                case 127 -> 107;
                case 128 -> 244;
                case 129 -> 227;
                case 130 -> 194;
                case 131 -> 30;
                case 132 -> 158;
                case 133 -> 104;
                case 134 -> 70;
                case 135 -> 141;
                case 136 -> 53;
                case 137 -> 110;
                case 138 -> 18;
                case 139 -> 252;
                case 140 -> 223;
                case 141 -> 76;
                case 142 -> 169;
                case 143 -> 216;
                case 144 -> 228;
                case 145 -> 166;
                case 146 -> 94;
                case 147 -> 47;
                case 148 -> 193;
                case 149 -> 146;
                case 150 -> 161;
                case 151 -> 108;
                case 152 -> 192;
                case 153 -> 81;
                case 154 -> 79;
                case 155 -> 132;
                case 156 -> 0;
                case 157 -> 85;
                case 158 -> 116;
                case 159 -> 33;
                case 160 -> 65;
                case 161 -> 229;
                case 162 -> 154;
                case 163 -> 222;
                case 164 -> 139;
                case 165 -> 226;
                case 166 -> 80;
                case 167 -> 113;
                case 168 -> 46;
                case 169 -> 218;
                case 170 -> 62;
                case 171 -> 75;
                case 172 -> 56;
                case 173 -> 215;
                case 174 -> 42;
                case 175 -> 10;
                case 176 -> 211;
                case 177 -> 143;
                case 178 -> 241;
                case 179 -> 160;
                case 180 -> 200;
                case 181 -> 122;
                case 182 -> 136;
                case 183 -> 190;
                case 184 -> 231;
                case 185 -> 38;
                case 186 -> 100;
                case 187 -> 204;
                case 188 -> 203;
                case 189 -> 150;
                case 190 -> 97;
                case 191 -> 118;
                case 192 -> 123;
                case 193 -> 232;
                case 194 -> 159;
                case 195 -> 83;
                case 196 -> 109;
                case 197 -> 105;
                case 198 -> 64;
                case 199 -> 240;
                case 200 -> 15;
                case 201 -> 25;
                case 202 -> 68;
                case 203 -> 52;
                case 204 -> 78;
                case 205 -> 84;
                case 206 -> 39;
                case 207 -> 165;
                case 208 -> 207;
                case 209 -> 210;
                case 210 -> 163;
                case 211 -> 12;
                case 212 -> 34;
                case 213 -> 23;
                case 214 -> 221;
                case 215 -> 120;
                case 216 -> 127;
                case 217 -> 253;
                case 218 -> 246;
                case 219 -> 8;
                case 220 -> 239;
                case 221 -> 6;
                case 222 -> 224;
                case 223 -> 59;
                case 224 -> 114;
                case 225 -> 243;
                case 226 -> 121;
                case 227 -> 37;
                case 228 -> 248;
                case 229 -> 82;
                case 230 -> 93;
                case 231 -> 156;
                case 232 -> 9;
                case 233 -> 214;
                case 234 -> 98;
                case 235 -> 51;
                case 236 -> 131;
                case 237 -> 36;
                case 238 -> 125;
                case 239 -> 29;
                case 240 -> 149;
                case 241 -> 235;
                case 242 -> 74;
                case 243 -> 157;
                case 244 -> 101;
                case 245 -> 178;
                case 246 -> 35;
                case 247 -> 88;
                case 248 -> 144;
                case 249 -> 177;
                case 250 -> 230;
                case 251 -> 95;
                case 252 -> 32;
                case 253 -> 11;
                case 254 -> 137;
                default -> 185;
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
            uA.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6886;
        if (d[n2] == null) {
            uA.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
