/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.input.MouseButtonEvent
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon._E;
import com.github.epsilon._j;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.lH;
import com.github.epsilon.vh;
import com.github.epsilon.zU;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.MouseButtonEvent;

public class vi
extends vh<Dx<?>> {
    private boolean T;
    private final _E O = new _E((lH)((Object)hi.a("j", (long)611443736556992631L)), c);
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    public static /* bridge */ /* synthetic */ CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public vi(Dx<?> dx) {
        super(dx);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)368297118216395761L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)629041411521304167L), (float)0.0f, (long)1165334323158006666L);
    }

    @Override
    public void K(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        GuiGraphicsExtractor guiGraphicsExtractor = (GuiGraphicsExtractor)objectArray[1];
        _j _j2 = (_j)objectArray[2];
        ih ih2 = (ih)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        int n2 = (Integer)objectArray[6];
        float f2 = ((Float)objectArray[7]).floatValue();
        float f3 = 0.68f;
        reference var11_11 = (hi.a("\u00a5", (Object)ih2, (long)665954777623212870L) - hi.a("\u00a5", (Object)_j2, (float)f3, (long)441868902805229185L)) / 2.0f;
        float f4 = 0.6f;
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)hi.a("\u00a5", (Object)ih2, (long)1210563473410659836L), (float)hi.a("\u00a5", (Object)ih2, (long)665954777623212870L), (float)9.0f, (Object)hi.a("G", (float)f, (long)1329648085340989328L), (long)776507817655946365L);
        hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00a5", (Object)((Dx)((Object)hi.a("\u00e9", (Object)this, (long)368556895492636452L))), (long)465467115463800692L), (float)5.0f, (float)var11_11, (float)f3, (Object)hi.a("j", (long)692578069409858836L), (long)487875072643634565L);
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)_j2, (Object)ih2, (long)428962805154159973L), (Object)ih2, (long)698030497329722378L);
        Object[] objectArray2 = new Object[8];
        objectArray2[7] = null;
        objectArray2[6] = Float.valueOf(0.58f);
        objectArray2[5] = null;
        objectArray2[4] = hi.a("j", (long)892696799870358639L);
        objectArray2[3] = hi.a("j", (long)970606960436247839L);
        objectArray2[2] = Float.valueOf(f4);
        objectArray2[1] = hi.a("\u00a5", (Object)((Dx)((Object)hi.a("\u00e9", (Object)this, (long)368556895492636452L))), (long)707858863375179869L);
        objectArray2[0] = callSite;
        hi.a("\u00a5", (Object)zU2, (Object)objectArray2, (long)412667454678744159L);
        CallSite callSite2 = hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00e9", (Object)this, (long)629041411521304167L), (boolean)hi.a("\u00e9", (Object)this, (long)368297118216395761L), (long)383918299594751932L);
        float f5 = 3.0f;
        reference var16_16 = hi.a("\u00a5", (Object)callSite, (long)889595511813135488L) - 7.5f;
        reference var17_17 = hi.a("\u00a5", (Object)callSite, (long)1092110395291557528L) + vi.c("xGoJrQjsWjS6VbVI", K5(), (ih)((Object)callSite)) / 2.0f;
        vi.c("xGoJrQjsWjS6VbVI", I(float float float float java.awt.Color ), (zU)zU2, (float)var16_16, (float)var17_17, (float)f5, (float)callSite2, (Color)((Object)hi.a("j", (long)892696799870358639L)));
    }

    public ih j(_j _j2, ih ih2) {
        return hi.a("G", (Object)_j2, (Object)ih2, (Object)vi.c("xGoJrQjsWjS6VbVI", a(), (Dx)((Dx)((Object)hi.a("\u00e9", (Object)this, (long)368556895492636452L)))), (float)0.6f, (float)8.0f, (float)10.0f, (float)96.0f, (long)1021318755957231379L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean E(ih var1_1, MouseButtonEvent var2_2, boolean var3_3) {
        block12: {
            var4_4 = Dl.S();
            var5_5 = hi.a("G", (int)vi.a(21925, 5480713100390356060L), (int)vi.a(31025, 5213840568571984100L), (long)834203424483934088L) - vi.a(24753, 7248031024371032391L);
            if (var4_4) ** GOTO lbl14
            block9: while (true) {
                block15: {
                    block14: {
                        block13: {
                            v0 = hi.a("\u00a5", (Object)var1_1, (double)hi.a("\u00a5", (Object)var2_2, (long)1321164245525494063L), (double)hi.a("\u00a5", (Object)var2_2, (long)1045026150751632794L), (long)700074705642999773L);
                            if (!var4_4) break block13;
                            if (v0 != false) break block14;
                            v0 = var5_5 = vi.c("xGoJrQjsWjS6VbVI", max(int int ), (int)vi.a(8047, 8863588647249485485L), (int)vi.a(29088, 8912778989737046082L)) - vi.a(10041, 258987801583888093L) - vi.a(8620, 4006296481908334674L);
                        }
                        if (var4_4) break block15;
                    }
                    var5_5 = hi.a("G", (int)vi.a(24174, 4961360486134800301L), (int)vi.a(6306, 4418624157408860530L), (long)834203424483934088L) + vi.a(13093, 3621913552188388035L) + vi.a(13321, 2630606108548609524L);
                    if (!var4_4) ** GOTO lbl38
                }
                while (true) {
                    block17: {
                        block16: {
                            switch (var5_5) {
                                default: {
                                    continue block9;
                                }
                                case -198089179: {
                                    v1 = hi.a("\u00a5", (Object)var2_2, (long)1304202693631103201L);
                                    if (!var4_4) break block16;
                                    if (v1 != false) break;
                                    break block17;
                                }
                                case -198089183: {
                                    v2 = true;
                                    var5_5 = (reference)(hi.a("G", (int)(vi.a(16081, 1503262158424850230L) - vi.a(16779, 8130824127941394531L) ^ vi.a(30541, 6752116948072167042L)), (int)vi.a(7196, 4530602587686477275L), (long)834203424483934088L) ^ vi.a(3301, 5881840404684541229L) ^ vi.a(1916, 9142086957258966665L));
                                    if (!var4_4) {
                                        break block9;
                                    }
                                    break block12;
                                }
                                case -198089181: {
                                    v2 = false;
                                    if (var4_4) break block9;
                                    return v2;
                                }
                                case -198089182: {
                                    hi.a("G", (long)1272073180734162189L);
                                    return false;
                                }
                            }
lbl38:
                            // 2 sources

                            v1 = var5_5 = hi.a("G", (int)vi.a(30861, 1406800861035100508L), (int)vi.a(3613, 8219961553065152482L), (long)834203424483934088L) - vi.a(958, 8370075857738072667L) - vi.a(12485, 1821410164819472677L);
                        }
                        if (var4_4) continue;
                    }
                    var5_5 = (reference)(vi.a(3843, 7516655468262461175L) + vi.a(6218, 1151954021764503937L) - vi.a(15311, 7837795186691553847L) + vi.a(13607, 8533788386516415721L) ^ vi.a(11443, 8034037623125552472L));
                }
                break;
            }
            var5_5 = (reference)(vi.c("xGoJrQjsWjS6VbVI", max(int int ), (int)(vi.a(16474, 759293239867425193L) - vi.a(10382, 7899042376428104010L) ^ vi.a(5461, 5693733940260246708L)), (int)vi.a(28399, 4904826565900168997L)) ^ vi.a(11191, 4703174847850621558L) ^ vi.a(4978, 3917189093750575771L));
        }
        switch (var5_5) {
            default: {
                return v2;
            }
            case 1307179104: 
        }
        hi.a("G", (long)660349619478157975L);
        vi.c("xGoJrQjsWjS6VbVI", values());
        return (boolean)hi.a("G", (long)713677872092862225L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean d() {
        block20: {
            block19: {
                block17: {
                    block18: {
                        var1_1 = Dl.S();
                        var2_2 /* !! */  = (vi.a(29358, 6711247071953679188L) * vi.a(31666, 6349514560984644174L) / 4 ^ vi.a(103, 8194770889846849954L)) + vi.a(25008, 5526104261632352374L) - vi.a(3923, 7424043400878395012L);
                        if (!var1_1) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)629041411521304167L), (long)1048531528246468125L);
                                if (!var1_1) break block17;
                                if (v0 != false) break block18;
                                break block19;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                hi.a("G", (long)1031195239253115725L);
lbl12:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                v1 = false;
                                if (!var1_1) lbl-1000:
                                // 2 sources

                                {
                                    return v1;
                                }
                                break block20;
                                break;
                            }
                        }
lbl20:
                        // 4 sources

                        while (true) {
                            switch (var2_2 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 532934974: {
                                    ** continue;
                                }
                                case 532934977: {
                                    ** continue;
                                }
                                ** case 532934975:
lbl29:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
lbl30:
                        // 2 sources

                        while (true) {
                            switch (var2_2 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 2062040226: 
                            }
                            hi.a("G", (long)919703241060757748L);
                            vi.c("xGoJrQjsWjS6VbVI", Q());
                            var2_2 /* !! */  = (hi.a("G", (int)vi.a(9617, 2049358086125298811L), (int)vi.a(16097, 647270480386899729L), (long)834203424483934088L) / vi.a(11960, 8779720985947385699L) * vi.a(9574, 6118726580143137972L) ^ vi.a(32692, 7327886988853378649L)) + vi.a(18104, 3623350083002419054L);
                            continue;
                            break;
                        }
                    }
                    v0 = hi.a("G", (int)vi.a(12752, 849936094901153826L), (int)vi.a(11079, 8463532623470766727L), (long)834203424483934088L) / vi.a(7771, 4726929186429476739L) - vi.a(7865, 6795085382718431075L);
                }
                var2_2 /* !! */  = (int)v0;
                if (var1_1) ** GOTO lbl20
            }
            var2_2 /* !! */  = (vi.a(23646, 7124754050808274322L) ^ vi.a(27519, 3646135706107898550L)) / 4 ^ vi.a(12032, 8037650472484843225L);
            ** while (true)
            v1 = true;
            var2_2 /* !! */  = vi.c("xGoJrQjsWjS6VbVI", max(int int ), (int)((vi.a(18884, 6894898728535967787L) ^ vi.a(31956, 5887514294618422563L)) / 4 * vi.a(5983, 4873550602469217956L)), (int)vi.a(17469, 7035081652662126028L)) ^ vi.a(9077, 4326074850751226518L);
            if (var1_1) ** GOTO lbl30
        }
        var2_2 /* !! */  = vi.c("xGoJrQjsWjS6VbVI", max(int int ), (int)((vi.a(23290, 8826231162364320553L) ^ vi.a(12489, 5357832871936930085L)) / 4 * vi.a(7361, 7115691201019288879L)), (int)vi.a(30813, 1752516054326540688L)) ^ vi.a(31446, 7355599368175909634L);
        ** while (true)
    }

    public void b(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        hi.a("\u00f2", (Object)this, (boolean)bl, (long)368297118216395761L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 2437577905181025604L;
                    var8_1 = new long[60];
                    var5_2 = 0;
                    var6_3 = "k\u008fd\u0000\f\u00c3\n\u008ehn+\u00ad)\u00d4uAg~}\u001e\u008d\rP\u008dh\b\u00f3\u00bd=\u00f9\u0019\u0085\"s'\u00ab\u00d4\u001d\u0010\u00a0\u00ebT?\u00849=\u0093eh\u00f68\u00d2z\u00b9\u00f7\u00e0\b\u00d9\u00f0\u00b1\u0093\u00a5\u00d3frw\u0093%f\u00bc\u00c0\u00c4np\u000bh\u00cd)\u00de\u00c9q(\u0003\u00ef$\u00d5*\u00efZ?\u00aa\u008a!X\u0092\u00b3\u009a0-\u008e\u00b9v`\u00ce\u0010\u008e\r\u00bf!\u00e9\u0015NlV\u00c8G\u0000\u009f\u00fc\u001a5\u009eO\f\f\u00b0m\u00f6\u00cd\u00e6P\u0097B_\u00a4\u009c\u00f2\u00a5\u0091\u00ef\u0016\u00a9\u00ed\u00fa0\bq\u009c'\u001e\u00dc\u007f\u00cc\u0086\u009d\"\u00f50.\u00ba}\u00b6\u0098\u00dbRy\u0014cI\u0013>\u0011\u0095\u00ea0\u001c1\u0019\u00ec\u0007\u0099\u00beNg\u007f\u0099g\u001d\u00bbv\u0006\u00a1&X\u0013\u009b\u00ad\u00aa\u00c6M\u009d\u0093@\u00ec~GkE\u00fa\u0012t\u0002\u001f\u00c5\u001d!\u00d4?\u00d1\u00bb&\u0093\u00c7\u009c@#\u00f4M\b_\u00c1\u00fa\u00c1e|\u008c\u00d5\u00c5u.\u00e8\u00e1s\u00aba)\u0004\u00d9VE\u00cay)\u00adW\u0097\u00d8\u00ed\u0080\u00beS`u\u00d5\u00e6pR\u00f3\u00eao\u00f2\u00da\u001eEPv1\u00e7\u00d9\u0092eH0_w\u00a1\u0083\u0005c\u000b\u00f8D\u00ca\u00b4>\u0094\u00d2\u00f2\u00cb-\u00bd]\u009a@\u00b9\u009ew\u00c8\u00c1\u000bC\u00c6\u00a0\u00dd\u00f6\u009fp`\u008eQzm\u0094\u00a8E\u00b9\u00e8\u00be\u0087\u000e\u0007a\u009e\u0000\u00db\u00f6\u00e7K\"\u008c7\u00d2\u00a4^k\u0099\u009e5\u00e3\u008e\u00e8.\u00c0\u009c\u00caS\u0081^7\u0092\u00e3\u00dc\u00e2(,\u0089{\u00b3\u00e9\u00c4\u00c8\u00ce2\u0089~\u009d\u00aa\u00fa\u0006\u00e7\\\u00b6\u0012\u00e6\u0084\u0087Ri\u00dd^WI\u001f\u0017\u001a\u00a5Wq\u0086L\u00d4\u00ae\u008f^e\u00b6\u00eb\u00e1\u0090\u00b7\u00d0;v\u00a8\u0012$\u00ad\u00ad\u0088\u00bc\u0011\u00f1\u00b1\u00be\u00dcIm\u0006J\u00b3\u00b9\u0004Z\u00e9V\u00db\u008d%,\u00d5\u00e6\u0012EM\u00d4C\u0001\u009d\u00f1x\u00a3\u008b\u0017\u00f0S\u00ff\u0094\u0091\u00c5\u0097\u00dc\u00c8J7";
                    var7_4 = "k\u008fd\u0000\f\u00c3\n\u008ehn+\u00ad)\u00d4uAg~}\u001e\u008d\rP\u008dh\b\u00f3\u00bd=\u00f9\u0019\u0085\"s'\u00ab\u00d4\u001d\u0010\u00a0\u00ebT?\u00849=\u0093eh\u00f68\u00d2z\u00b9\u00f7\u00e0\b\u00d9\u00f0\u00b1\u0093\u00a5\u00d3frw\u0093%f\u00bc\u00c0\u00c4np\u000bh\u00cd)\u00de\u00c9q(\u0003\u00ef$\u00d5*\u00efZ?\u00aa\u008a!X\u0092\u00b3\u009a0-\u008e\u00b9v`\u00ce\u0010\u008e\r\u00bf!\u00e9\u0015NlV\u00c8G\u0000\u009f\u00fc\u001a5\u009eO\f\f\u00b0m\u00f6\u00cd\u00e6P\u0097B_\u00a4\u009c\u00f2\u00a5\u0091\u00ef\u0016\u00a9\u00ed\u00fa0\bq\u009c'\u001e\u00dc\u007f\u00cc\u0086\u009d\"\u00f50.\u00ba}\u00b6\u0098\u00dbRy\u0014cI\u0013>\u0011\u0095\u00ea0\u001c1\u0019\u00ec\u0007\u0099\u00beNg\u007f\u0099g\u001d\u00bbv\u0006\u00a1&X\u0013\u009b\u00ad\u00aa\u00c6M\u009d\u0093@\u00ec~GkE\u00fa\u0012t\u0002\u001f\u00c5\u001d!\u00d4?\u00d1\u00bb&\u0093\u00c7\u009c@#\u00f4M\b_\u00c1\u00fa\u00c1e|\u008c\u00d5\u00c5u.\u00e8\u00e1s\u00aba)\u0004\u00d9VE\u00cay)\u00adW\u0097\u00d8\u00ed\u0080\u00beS`u\u00d5\u00e6pR\u00f3\u00eao\u00f2\u00da\u001eEPv1\u00e7\u00d9\u0092eH0_w\u00a1\u0083\u0005c\u000b\u00f8D\u00ca\u00b4>\u0094\u00d2\u00f2\u00cb-\u00bd]\u009a@\u00b9\u009ew\u00c8\u00c1\u000bC\u00c6\u00a0\u00dd\u00f6\u009fp`\u008eQzm\u0094\u00a8E\u00b9\u00e8\u00be\u0087\u000e\u0007a\u009e\u0000\u00db\u00f6\u00e7K\"\u008c7\u00d2\u00a4^k\u0099\u009e5\u00e3\u008e\u00e8.\u00c0\u009c\u00caS\u0081^7\u0092\u00e3\u00dc\u00e2(,\u0089{\u00b3\u00e9\u00c4\u00c8\u00ce2\u0089~\u009d\u00aa\u00fa\u0006\u00e7\\\u00b6\u0012\u00e6\u0084\u0087Ri\u00dd^WI\u001f\u0017\u001a\u00a5Wq\u0086L\u00d4\u00ae\u008f^e\u00b6\u00eb\u00e1\u0090\u00b7\u00d0;v\u00a8\u0012$\u00ad\u00ad\u0088\u00bc\u0011\u00f1\u00b1\u00be\u00dcIm\u0006J\u00b3\u00b9\u0004Z\u00e9V\u00db\u008d%,\u00d5\u00e6\u0012EM\u00d4C\u0001\u009d\u00f1x\u00a3\u008b\u0017\u00f0S\u00ff\u0094\u0091\u00c5\u0097\u00dc\u00c8J7".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "y&Ine)\u00fa\u00c8r\u00db\u00b5\u0002~\u00d7\u00d2\u00b9";
                        var7_4 = "y&Ine)\u00fa\u00c8r\u00db\u00b5\u0002~\u00d7\u00d2\u00b9".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl38:
                    // 1 sources

                    ** continue;
                }
            }
            vi.a = var8_1;
            vi.b = new Integer[60];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 6195445630160084384L;
        ** while (true)
        vi.c = 6195445630160084244L ^ var0_7;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1E2;
        if (b[n2] == null) {
            vi.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
