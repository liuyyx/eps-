/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.input.MouseButtonEvent
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.XJ;
import com.github.epsilon._E;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.lH;
import com.github.epsilon.lm;
import com.github.epsilon.zU;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.MouseButtonEvent;

public class lB
implements XJ {
    private final _E o = new _E((lH)((Object)hi.a("j", (long)611443736556992631L)), lB.b(18100, 37960333646329661L));
    private final Supplier<String> Q;
    private final _E O = new _E((lH)((Object)hi.a("j", (long)611443736556992631L)), lB.b(9763, 3183659857053063083L));
    private final String B;
    private boolean x;
    private final Supplier<String> H;
    private final ih V;
    private final Supplier<String> W;
    private ih l;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    @Override
    public boolean w(Object[] objectArray) {
        return (boolean)hi.a("\u00e9", (Object)this, (long)944088457421407660L);
    }

    private void lambda$extractGui$1(ih ih2, float f, zU zU2) {
        lB lB2;
        String string;
        block4: {
            block5: {
                hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00a5", (Object)ih2, (long)528740727804334177L), (float)9.0f, (float)14.0f, (Object)hi.a("G", (Object)hi.a("j", (long)1292984830373578835L), (int)((int)(112.0f * f)), (long)950630386023407477L), (Object)lB.m("kYP8vQNFhe2NJLHJ", t(java.awt.Color int ), (Color)((Object)hi.a("j", (long)384449307072329239L)), (int)lB.a(18900, 2186313630336802887L)), (long)425251131662313535L);
                float f2 = 0.66f;
                float f3 = 0.56f;
                float f4 = 0.52f;
                String string2 = (String)((Object)lB.m("kYP8vQNFhe2NJLHJ", get(), (Supplier)((Object)hi.a("\u00e9", (Object)this, (long)703855312394734181L))));
                boolean bl = Dl.t();
                String string3 = (String)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1010211926264831091L), (long)876941681548788276L));
                string = (String)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1127527317769774102L), (long)876941681548788276L));
                hi.a("\u00a5", (Object)zU2, (Object)string2, (float)12.0f, (float)10.0f, (float)f2, (Object)hi.a("j", (long)692578069409858836L), (long)487875072643634565L);
                boolean bl2 = bl;
                hi.a("\u00a5", (Object)zU2, (Object)string3, (float)12.0f, (float)25.0f, (float)f3, (Object)hi.a("j", (long)788934673226527174L), (long)487875072643634565L);
                lB2 = this;
                if (bl2) break block4;
                if (hi.a("\u00e9", (Object)lB2, (long)411719630421058488L) == null) break block5;
                lB2 = this;
                if (bl2) break block4;
                if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)lB2, (long)411719630421058488L), (long)601063317567675907L) == false) {
                    hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00e9", (Object)this, (long)411719630421058488L), (float)12.0f, (float)38.0f, (float)f4, (Object)hi.a("j", (long)574625695807352444L), (long)487875072643634565L);
                }
            }
            lB2 = this;
        }
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)lB2, (long)617634018354416025L), (long)1167668381225401548L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)945299721745206799L), (Object)ih2, (long)698030497329722378L);
        Object[] objectArray = new Object[6];
        objectArray[5] = hi.a("j", (long)433333639448026825L);
        objectArray[4] = Float.valueOf(0.56f);
        objectArray[3] = string;
        objectArray[2] = hi.a("G", (Object)hi.a("j", (long)817827339599640798L), (Object)hi.a("j", (long)501800615308669146L), (float)(callSite * 0.35f), (long)1032418514208893637L);
        objectArray[1] = Float.valueOf((float)(hi.a("\u00a5", (Object)callSite2, (long)665954777623212870L) / 2.0f));
        objectArray[0] = callSite2;
        hi.a("\u00a5", (Object)zU2, (Object)objectArray, (long)1029089622126568491L);
    }

    private void lambda$extractGui$0(float f, float f2, zU zU2) {
        ih ih2 = new ih((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (long)906597334513960415L), f, (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (long)1210563473410659836L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (long)665954777623212870L));
        hi.a("\u00a5", (Object)zU2, (Object)ih2, arg_0 -> this.lambda$extractGui$1(ih2, f2, arg_0), (long)449141544506485015L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void V(Object[] var1_1) {
        block15: {
            var2_2 = (GuiGraphicsExtractor)var1_1[0];
            var5_3 = (lm)var1_1[1];
            var3_4 = (Integer)var1_1[2];
            var4_5 = (Integer)var1_1[3];
            var6_6 = ((Float)var1_1[4]).floatValue();
            var7_7 = Dl.t();
            var11_8 /* !! */  = (lB.a(3599, 7072585398142314399L) ^ lB.a(23297, 7763867230216647320L)) - lB.a(7025, 404382859988579054L) - lB.a(9021, 1419804617643723432L);
            if (!var7_7) break block15;
lbl10:
            // 2 sources

            while (true) {
                lB.m("kYP8vQNFhe2NJLHJ", g(float ), (_E)hi.a("\u00e9", (Object)this, (long)1278207304760416919L), (float)1.0f);
                while (true) {
                    block19: {
                        block20: {
                            block18: {
                                block17: {
                                    block16: {
                                        var8_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1278207304760416919L), (long)1167668381225401548L);
                                        var9_10 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (long)1092110395291557528L) - (1.0f - var8_9) * 6.0f;
                                        hi.a("\u00a5", (Object)this, (Object)new Object[]{Float.valueOf((float)var9_10)}, (long)733515481237382396L);
                                        v0 = hi.a("\u00e9", (Object)this, (long)617634018354416025L);
                                        v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)945299721745206799L), (double)var3_4, (double)var4_5, (long)700074705642999773L);
                                        if (var7_7) break block16;
                                        if (v1 /* !! */  != false) break block17;
                                        v1 /* !! */  = (CallSite)((lB.a(5793, 1518775775089278774L) - lB.a(8605, 2416000914391140378L)) / 4 ^ lB.a(6193, 7932429784178930101L) ^ lB.a(1027, 8782395556266552755L));
                                    }
                                    var11_8 /* !! */  = (int)v1 /* !! */ ;
                                    if (!var7_7) break block18;
                                }
                                var11_8 /* !! */  = (lB.a(22421, 854805668427300360L) * lB.a(3476, 4982887976678106137L) - lB.a(26713, 4935694161276748226L)) * lB.a(30940, 712411864679502170L) + lB.a(2067, 7024465428070146477L);
                            }
                            switch (var11_8 /* !! */ ) {
                                default: {
                                    v2 = 1.0f;
                                    var11_8 /* !! */  = lB.a(23364, 3949479251970683588L) - lB.a(17580, 8780902815615151387L) ^ lB.a(24387, 8191011880422962890L);
                                    if (!var7_7) break block19;
                                    break block20;
                                }
                                case -622152914: {
                                    lB.m("kYP8vQNFhe2NJLHJ", j());
                                    hi.a("G", (long)517921721709175203L);
                                    break;
                                }
                                case -622152915: 
                            }
                            v2 = 0.0f;
                            if (var7_7) ** GOTO lbl-1000
                        }
                        var11_8 /* !! */  = lB.a(4116, 6379947360542538118L) - lB.a(9444, 445659900176600426L) ^ lB.a(30953, 7731661213293171063L);
                    }
                    switch (var11_8 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            hi.a("\u00a5", (Object)v0, (float)v2, (long)439674605800943152L);
                            var10_11 = hi.a("G", (Consumer<zU>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$extractGui$0(float float com.github.epsilon.zU ), (Lcom/github/epsilon/zU;)V)((lB)this, (float)var9_10, (float)var8_9), (long)463082481935039768L);
                            hi.a("\u00a5", (Object)var5_3, (Object)var10_11, (long)890980577028068197L);
                            return;
                        }
                        case 1433974103: 
                    }
                    throw null;
                }
                break;
            }
        }
        while (true) {
            switch (var11_8 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 79393524: 
            }
            hi.a("G", (long)1052312102167579273L);
            var11_8 /* !! */  = lB.a(2907, 1339262070159647443L) * lB.a(29913, 5475013102871108943L) + lB.a(21998, 4803285722617314426L);
            if (var7_7) ** continue;
        }
    }

    public lB(ih ih2, String string, String string2, String string3, String string4) {
        this(ih2, () -> lB.lambda$new$0(string), () -> lB.lambda$new$1(string2), string3, () -> lB.lambda$new$2(string4));
    }

    private static String lambda$new$2(String string) {
        return string;
    }

    private void S(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = 68.0f;
        float f3 = 24.0f;
        hi.a("\u00f2", (Object)this, (ih)new ih((float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (long)906597334513960415L) + hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (long)1210563473410659836L) - f2 - 12.0f), f + hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (long)665954777623212870L) - f3 - 10.0f, f2, f3), (long)945299721745206799L);
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

    public lB(ih ih2, Supplier<String> supplier, Supplier<String> supplier2, String string, Supplier<String> supplier3) {
        this.V = ih2;
        this.W = supplier;
        this.H = supplier2;
        this.B = string;
        this.Q = supplier3;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1278207304760416919L), (float)0.0f, (long)1165334323158006666L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)617634018354416025L), (float)0.0f, (long)1165334323158006666L);
        hi.a("\u00a5", (Object)this, (Object)new Object[]{Float.valueOf((float)hi.a("\u00a5", (Object)ih2, (long)1092110395291557528L))}, (long)733515481237382396L);
    }

    @Override
    public ih r(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)852627365235384109L);
    }

    private static String lambda$new$0(String string) {
        return string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean V(MouseButtonEvent var1_1, boolean var2_2) {
        block17: {
            block15: {
                block16: {
                    block14: {
                        block12: {
                            block13: {
                                var3_3 = Dl.t();
                                var4_4 /* !! */  = (lB.a(1853, 4198225667989286539L) * lB.a(26888, 8669269136246653115L) ^ lB.a(19498, 66965022252197281L) ^ lB.a(24496, 5625958216342042163L)) - lB.a(7910, 7413007363873716071L);
                                if (var3_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1304202693631103201L);
                                        if (var3_3) break block12;
                                        if (v0 /* !! */  != false) break block13;
                                        break block14;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)852627365235384109L), (double)lB.m("kYP8vQNFhe2NJLHJ", x(), (MouseButtonEvent)var1_1), (double)hi.a("\u00a5", (Object)var1_1, (long)1045026150751632794L), (long)700074705642999773L);
                                        if (var3_3) break block15;
                                        if (v1 != false) break block16;
                                        break block17;
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    return false;
lbl16:
                                    // 1 sources

                                    while (true) {
                                        hi.a("\u00f2", (Object)this, (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)945299721745206799L), (double)hi.a("\u00a5", (Object)var1_1, (long)1321164245525494063L), (double)hi.a("\u00a5", (Object)var1_1, (long)1045026150751632794L), (long)700074705642999773L), (long)944088457421407660L);
                                        return true;
                                    }
                                }
lbl19:
                                // 6 sources

                                while (true) {
                                    switch (var4_4 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 595598279: {
                                            ** continue;
                                        }
                                        case 595598276: {
                                            ** continue;
                                        }
                                        case 595598280: {
                                            ** continue;
                                        }
                                        case 595598277: 
                                    }
                                    hi.a("G", (float)2.0f, (long)1257120842392389918L);
                                    lB.m("kYP8vQNFhe2NJLHJ", h(double ), (double)0.5);
                                    return false;
                                }
                            }
                            v0 /* !! */  = (CallSite)(lB.a(12195, 6111124078013679122L) - lB.a(27281, 1494311832220189459L) + lB.a(11569, 7636431292791850153L));
                        }
                        var4_4 /* !! */  = (int)v0 /* !! */ ;
                        if (!var3_3) ** GOTO lbl19
                    }
                    var4_4 /* !! */  = lB.a(29995, 9185747085175676052L) * lB.a(26505, 6546357753359683133L) + lB.a(29597, 2906434963624319495L) + lB.a(22791, 471871452980244616L);
                    if (!var3_3) ** GOTO lbl19
                }
                v1 = hi.a("G", (int)hi.a("G", (int)(lB.a(5808, 1216004639375137L) * lB.a(27426, 365731026353930926L)), (int)lB.a(32173, 1468248083452023832L), (long)834203424483934088L), (int)lB.a(5737, 2493644772552753115L), (long)834203424483934088L) * lB.a(13362, 4977421730862308782L) - lB.a(1381, 2200733081044856025L);
            }
            var4_4 /* !! */  = (int)v1;
            if (!var3_3) ** GOTO lbl19
        }
        var4_4 /* !! */  = lB.a(6709, 2384921752159826879L) - lB.a(22827, 7484143815657156782L) + lB.a(20802, 8646303446513318143L);
        ** while (true)
    }

    private static String lambda$new$1(String string) {
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    block9: {
                        var8 = 7086816547594492295L;
                        var14_1 = new long[44];
                        var11_2 = 0;
                        var12_3 = "9\u0017\u00e3\u0090\u00fc_N\u00a3\u00a8\u0094fM/\u00d6\u0090\u0099Xa\u00dc/\u00c4M\u008f\u0015H\"B\u00a8K\u0012\u00a5w\u00a96\\\u008d\u00940d\u00ef5`\u00b5\u00ad.k\u00a1{t\u00d6\u00cbo\u00e6\u00e6\u00abu\u00bb\u00b3\u0094:\u00fck9?\u00db\"j^\u0002\u0001\u00eb\u00c6\u00be\u00d1\u00ca\u00b5\u00f4 \u00e7\u00bf\u00fcp\u0001\u001cP_\u00cbQ\u00a2\u00e2fr\u000b\u001f\u00ccfd\u000e\u00c4\u00f2.\u007f\n\u00db^=R\u00ef\u00fb\u00f9lP\u00f6\u00cf\u00cbM\u0088\u00f7\u008c\u0090i\u00e3+\u0082<\u00e3q\u00e2\u00c1T\u001c\u00d6\u001ft\u0013\u00c9\u0083\u00d6hDP\u00e6\u007f\u0013\re\u00a1\u00f9\u00fbq\u0086\u000e5N+\u0003\u00fb'\u0090\u00d9\u0003\u00c4\n0\u00ddN`7\u00c0%\u0010\"\u008c\u007f\u00b2W\u0099\u00db\u00be\u0003+\u00ed\u00cc\u00aepe<\\\u0083X\u00d3LB\u0090\u00e9\u00ae\u0015c\u00fc\\\u0088\u00c1\u000b\u00fc\u00c3dD\u000f\u00059\u008f\u0002\u0091\u00f8\u0000\u0090\u00d4\u00bb\u00a5t\u00be\u00e1_\u00d7U\u00d4\u00f2\u00d4\u00e2Z\u00f25\u001b\u00b1\u0001\u0099\u00d5\u00c3\u00ec\u00ec;:\u0013x\u001a\u008ap16\u00dd\u00b5\u0089\u00f7_\t\u00e5\u00b8\u00d6|\u00bb\u0002\u00a1\u00e6{\u0096\u00ae\u0016\u00ad\u00b3\u0016\u008d\u0013V{\n\u001er\u00c6\u008b~w \u0082Y\u0092\u00a6`\u00e1\u00eb\u00dfIni\u00d8\u00dcC\u00c6c\u0000\u001b\fKE\u009c\u0085\u00d6.\u001aUId\u00bc\u00a3\u0001\u00e6p\u00c5\u00e8T\u0087\u00b2\u008a\u00186\u0002\u0091\u00c6\u0006\u008a\u00f4\u00feb\u009d_v\u008d";
                        var13_4 = "9\u0017\u00e3\u0090\u00fc_N\u00a3\u00a8\u0094fM/\u00d6\u0090\u0099Xa\u00dc/\u00c4M\u008f\u0015H\"B\u00a8K\u0012\u00a5w\u00a96\\\u008d\u00940d\u00ef5`\u00b5\u00ad.k\u00a1{t\u00d6\u00cbo\u00e6\u00e6\u00abu\u00bb\u00b3\u0094:\u00fck9?\u00db\"j^\u0002\u0001\u00eb\u00c6\u00be\u00d1\u00ca\u00b5\u00f4 \u00e7\u00bf\u00fcp\u0001\u001cP_\u00cbQ\u00a2\u00e2fr\u000b\u001f\u00ccfd\u000e\u00c4\u00f2.\u007f\n\u00db^=R\u00ef\u00fb\u00f9lP\u00f6\u00cf\u00cbM\u0088\u00f7\u008c\u0090i\u00e3+\u0082<\u00e3q\u00e2\u00c1T\u001c\u00d6\u001ft\u0013\u00c9\u0083\u00d6hDP\u00e6\u007f\u0013\re\u00a1\u00f9\u00fbq\u0086\u000e5N+\u0003\u00fb'\u0090\u00d9\u0003\u00c4\n0\u00ddN`7\u00c0%\u0010\"\u008c\u007f\u00b2W\u0099\u00db\u00be\u0003+\u00ed\u00cc\u00aepe<\\\u0083X\u00d3LB\u0090\u00e9\u00ae\u0015c\u00fc\\\u0088\u00c1\u000b\u00fc\u00c3dD\u000f\u00059\u008f\u0002\u0091\u00f8\u0000\u0090\u00d4\u00bb\u00a5t\u00be\u00e1_\u00d7U\u00d4\u00f2\u00d4\u00e2Z\u00f25\u001b\u00b1\u0001\u0099\u00d5\u00c3\u00ec\u00ec;:\u0013x\u001a\u008ap16\u00dd\u00b5\u0089\u00f7_\t\u00e5\u00b8\u00d6|\u00bb\u0002\u00a1\u00e6{\u0096\u00ae\u0016\u00ad\u00b3\u0016\u008d\u0013V{\n\u001er\u00c6\u008b~w \u0082Y\u0092\u00a6`\u00e1\u00eb\u00dfIni\u00d8\u00dcC\u00c6c\u0000\u001b\fKE\u009c\u0085\u00d6.\u001aUId\u00bc\u00a3\u0001\u00e6p\u00c5\u00e8T\u0087\u00b2\u008a\u00186\u0002\u0091\u00c6\u0006\u008a\u00f4\u00feb\u009d_v\u008d".length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block9;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 = "\u009b#~\u00f5c\u0098in\u0092\u00f3\u00b9\u00d2\u0093{*\u008c";
                            var13_4 = "\u009b#~\u00f5c\u0098in\u0092\u00f3\u00b9\u00d2\u0093{*\u008c".length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block9;
                                break;
                            }
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block10;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
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
                lB.a = var14_1;
                lB.b = new Integer[44];
                var0_7 = 3671095318523867819L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u001e\u00dc\u00f8x\\gex2t\u0085\u0005\u0007\u00bd\u00856";
                var5_11 = "\u001e\u00dc\u00f8x\\gex2t\u0085\u0005\u0007\u00bd\u00856".length();
                var2_12 = 0;
                while (true) {
                    break block11;
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var6_8[v5] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block12;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v5 = var3_9++;
            ** while (true)
        }
        lB.c = var6_8;
        lB.d = new Long[2];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2994;
        if (b[n2] == null) {
            lB.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    private static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x3188) & Short.MAX_VALUE;
        if (d[n2] == null) {
            lB.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }
}
