/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Font
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.components.Button
 *  net.minecraft.client.gui.components.Button$Builder
 *  net.minecraft.client.gui.components.CycleButton
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.gui.screens.TitleScreen
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.chat.MutableComponent
 *  net.minecraft.network.chat.Style
 *  net.minecraft.util.FormattedCharSequence
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.OM;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;

public class iS
extends Screen {
    private static final int m;
    private static final int r;
    private final List<Component> K = hi.a("G", (Object)hi.a("G", iS.a(-2616, 6773), (long)1262634304799069784L), (Object)hi.a("G", (Object)new Object[]{iS.a(-2618, -2352)}, (long)452771195589142049L), (Object)hi.a("G", (Object)new Object[]{iS.a(-2619, 22329)}, (long)452771195589142049L), (long)1020205439673982949L);
    private static final int l;
    private static final int B;
    private static final int G;
    private static final String Z;
    private static final int q;
    public static final iS Y;
    private long X;
    private static final String e;
    private static final int T;
    private static final int g;
    private static final String p;
    private static final String U;
    private static final String J;
    private static final String Q;
    private static final String O;
    private static final int I;
    private static final String d;
    private static final Component V;
    private static final int c;
    private static final String k;
    private static final String f;
    private static final String[] a;
    private static final String[] b;
    private static final long[] h;
    private static final Integer[] i;

    private void lambda$init$2(Button button) {
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)1141844276265879329L);
    }

    public boolean shouldCloseOnEsc() {
        return true;
    }

    private static Style lambda$static$0(Style style) {
        return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)style, (int)iS.a(27992, 5095844592140834552L), (long)1067874061528227759L), (Object)hi.a("G", (boolean)true, (long)827866887164769227L), (long)513891686411172555L);
    }

    public boolean isPauseScreen() {
        return false;
    }

    private static Component lambda$init$0(OM oM) {
        return iS.f("JiIeLqdwBBoYWZ5M", literal(java.lang.String ), (String)((Object)hi.a("\u00a5", (Object)((Object)oM), (long)689843723259586273L)));
    }

    private int l(int n) {
        return (int)((hi.a("\u00e9", (Object)((Object)this), (long)452410749453116798L) - n) / 2);
    }

    protected void init() {
        super.init();
        hi.a("\u00f2", (Object)((Object)this), (long)iS.f("JiIeLqdwBBoYWZ5M", getMillis()), (long)1335720976043316726L);
        CallSite callSite = hi.a("G", (long)((long)(hi.a("\u00e9", (Object)((Object)this), (long)792886182141853653L) - iS.a(15653, 3737760692695860870L))), (int)iS.a(17009, 960778455138531795L), (int)iS.a(208, 8333874768366189333L), (long)947942842291830811L);
        reference var2_2 = (hi.a("\u00e9", (Object)((Object)this), (long)792886182141853653L) - callSite) / 2;
        CallSite callSite2 = hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)492277042632561259L);
        reference var4_4 = hi.a("\u00a5", (Object)((Object)this), (int)callSite2, (long)1048081377434938736L) + callSite2 - iS.a(30121, 9167605717975158335L) - iS.a(9120, 5896544789789906945L);
        Function<OM, Component> function = iS::lambda$init$0;
        CallSite callSite3 = hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)541963199848730431L);
        hi.a("G", (Object)callSite3, (long)374764797691957710L);
        hi.a("\u00a5", (Object)((Object)this), (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", function, ((Dx)((Object)callSite3))::z, (long)1307970341901611331L), (Object)hi.a("G", (long)730492167824053819L), (long)400464453518145184L), (int)var2_2, (int)var4_4, (int)callSite, (int)iS.a(616, 2721479442155485652L), (Object)hi.a("G", iS.a(-2620, 9450), (long)1262634304799069784L), iS::lambda$init$1, (long)1200829605145945390L), (long)758199541703596701L);
        hi.a("\u00a5", (Object)((Object)this), (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)hi.a("G", iS.a(-2613, 29396), (long)1262634304799069784L), this::lambda$init$2, (long)1155708025393362200L), (int)var2_2, (int)(var4_4 + iS.a(10221, 2580538534195993662L) + iS.a(4227, 7068896601615117135L)), (int)callSite, (int)iS.a(10221, 2580538534195993662L), (long)883724366850993011L), (long)797469697506059064L), (long)758199541703596701L);
        hi.a("\u00a5", (Object)((Object)this), (Object)iS.f("JiIeLqdwBBoYWZ5M", build(), (Button.Builder)hi.a("\u00a5", (Object)hi.a("G", (Object)hi.a("G", iS.a(-2615, 10232), (long)1262634304799069784L), this::lambda$init$3, (long)1155708025393362200L), (int)var2_2, (int)(var4_4 + iS.a(25965, 2768331623267950324L)), (int)callSite, (int)iS.a(10221, 2580538534195993662L), (long)883724366850993011L)), (long)758199541703596701L);
        hi.a("\u00a5", (Object)((Object)this), (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)hi.a("G", iS.a(-2607, -6355), (long)1262634304799069784L), iS::lambda$init$4, (long)1155708025393362200L), (int)var2_2, (int)(var4_4 + iS.a(24057, 4428293821233128960L)), (int)callSite, (int)iS.a(10221, 2580538534195993662L), (long)883724366850993011L), (long)797469697506059064L), (long)758199541703596701L);
    }

    private static void lambda$init$1(CycleButton cycleButton, OM oM) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)541963199848730431L), (Object)((Object)oM), (long)841911929517394792L);
        hi.a("\u00a5", (Object)hi.a("j", (long)1240307117545218967L), (long)419984540593063660L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private int h(Object[] var1_1) {
        block15: {
            block16: {
                var2_2 = Dl.S();
                var8_3 /* !! */  = (iS.a(30911, 1137408938669130500L) - iS.a(22974, 5096665015902298650L) + iS.a(8992, 8591136187147032813L) ^ iS.a(5971, 398579060948348120L) ^ iS.a(18519, 970014395132474328L)) + iS.a(21141, 4956267905429203292L);
                if (!var2_2) ** GOTO lbl-1000
                v0 /* !! */  = var8_3 /* !! */ ;
                if (var2_2 == false) return v0 /* !! */ ;
                switch (v0 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var3_4 = hi.a("G", (int)iS.a(4952, 9127116622031235258L), (int)(hi.a("\u00e9", (Object)this, (long)792886182141853653L) - iS.a(15022, 4894772550247973241L)), (long)476721548361853495L);
                        var4_5 = var3_4 - iS.a(3437, 9079906480536565465L);
                        var5_6 = 0;
                        var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)729100649580409695L), (long)1240653736693366367L);
                        if (var2_2) break;
                        break block16;
                    }
                    case -93328817: {
                        v0 /* !! */  = (int)iS.f("JiIeLqdwBBoYWZ5M", O(int int ), (int)1, (int)-1);
                        return v0 /* !! */ ;
                    }
                }
                var8_3 /* !! */  = (int)(hi.a("G", (int)(iS.a(2878, 6854822853416530132L) + iS.a(22705, 1798688177779991302L)), (int)iS.a(16700, 7942244272551951030L), (long)834203424483934088L) / 5 + iS.a(14497, 490100252708438811L) + iS.a(20992, 5467430528632252826L));
                if (var2_2) break block15;
                ** GOTO lbl26
            }
lbl22:
            // 2 sources

            while (true) {
                block18: {
                    block17: {
                        v1 = hi.a("\u00a5", (Object)var6_7, (long)984088978567310565L);
                        if (!var2_2) break block17;
                        if (v1 != false) break block18;
lbl26:
                        // 2 sources

                        v1 = hi.a("G", (int)iS.a(4115, 6981990377909660641L), (int)iS.a(2623, 7436769414195491281L), (long)834203424483934088L) * iS.a(9581, 6715856322883624669L) + iS.a(24592, 83265741788863419L);
                    }
                    var8_3 /* !! */  = (int)v1;
                    if (var2_2) break block15;
                }
                var8_3 /* !! */  = (iS.a(3759, 5802331515505063213L) - iS.a(18008, 6114180081751195020L)) / 5 + iS.a(27676, 7441039012919171057L) ^ iS.a(6276, 8750145699496993605L);
                break block15;
                break;
            }
lbl33:
            // 2 sources

            while (true) {
                v2 = var5_6;
                if (!var2_2) ** GOTO lbl62
                if (v2 <= 0) ** GOTO lbl61
                ** GOTO lbl63
                break;
            }
        }
        block12: while (true) {
            switch (var8_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1648224860: {
                    var7_8 = (Component)hi.a("\u00a5", (Object)var6_7, (long)470012372636416268L);
                    var5_6 += hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)528627800389326457L), (Object)var7_8, (int)var4_5, (long)376263318346254955L), (long)417939159730395915L) * iS.a(30121, 9167605717975158335L);
                    var5_6 += 4;
                    if (var2_2) ** GOTO lbl59
                    ** GOTO lbl33
                }
                case 1648224859: {
                    ** continue;
                }
                case 1648224861: {
                    var5_6 -= 4;
                    if (!var2_2) {
                        return (int)iS.f("JiIeLqdwBBoYWZ5M", min(int int ), (int)(hi.a("\u00e9", (Object)this, (long)452410749453116798L) - iS.a(8530, 3155309695798450869L)), (int)(iS.a(23303, 3381701862085550289L) + var5_6 + iS.a(30121, 9167605717975158335L) + iS.a(922, 3156588399306586117L)));
                    }
                    ** GOTO lbl65
                }
                case 1648224862: {
                    throw null;
                }
lbl59:
                // 1 sources

                var8_3 /* !! */  = (int)(hi.a("G", (int)(iS.a(16015, 4008291161856378183L) + iS.a(12816, 2942481635302967713L)), (int)iS.a(19034, 3141339526001422824L), (long)834203424483934088L) / 5 + iS.a(28458, 1830862217697121330L) + iS.a(15608, 8679794559853102887L));
                if (var2_2) continue block12;
lbl61:
                // 2 sources

                v2 = var8_3 /* !! */  = hi.a("G", (int)iS.a(5738, 3155765095815917036L), (int)iS.a(4999, 713995852826683454L), (long)834203424483934088L) ^ iS.a(1279, 4574496922119618314L);
lbl62:
                // 2 sources

                if (var2_2) continue block12;
lbl63:
                // 2 sources

                var8_3 /* !! */  = (iS.a(20329, 8789614337813083381L) + iS.a(980, 8639384165407897615L) ^ iS.a(30229, 2422424563057315251L) ^ iS.a(3526, 6495225265209095728L)) * iS.a(12413, 6964480179096259469L) + iS.a(15249, 1928062124079513714L);
                if (var2_2) continue block12;
lbl65:
                // 2 sources

                var8_3 /* !! */  = hi.a("G", (int)iS.a(158, 7393817609644391261L), (int)iS.a(19219, 8324630039196758157L), (long)834203424483934088L) ^ iS.a(31238, 413216799005950378L);
                continue block12;
                case 1648224863: 
            }
            break;
        }
        return (int)iS.f("JiIeLqdwBBoYWZ5M", min(int int ), (int)(hi.a("\u00e9", (Object)this, (long)452410749453116798L) - iS.a(8530, 3155309695798450869L)), (int)(iS.a(23303, 3381701862085550289L) + var5_6 + iS.a(30121, 9167605717975158335L) + iS.a(922, 3156588399306586117L)));
    }

    private static void lambda$init$4(Button button) {
        hi.a("\u00a5", (Object)hi.a("G", (long)1082108509869241844L), (Object)hi.a("G", iS.a(-2609, -14257), (long)1312634763390987132L), (long)711591136613085460L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[19];
                        var11_1 = 0;
                        var10_2 = "\u6bfa\u8f8a\u4fa9\u750d\u0000\u0007\u00f5\u00c1p\u00a6F\u00de\u00a4\u00f6/\u009aK\u00e1F|\u000b\u00d7X\u00a8#Jm\u00bc\u008cY\u000fc\u00eb\r\u8b66\u8a07S\u00ac\u00eb\u00dd\u0099\u00af\u00c0\u00cc\u0091\u00a0\u00d4\u0012\u008eU\u00fe\n\u0093\u00a2\u00bd\u00c3\u0003\u0001B^<-Q]\u0005!!\u6bdc\u8fe0\u4f6d\u7540\u0098\u00ae\u00e6\u00f4\u0012\u0000\n\n-l\u001e\u00c9m\u008b\u00821\u0093~K\u009dA\u00ec!h\u0005\u00c3>0\u00cd\u0013\u00fd\u00b8A\u00fe$U\u0017G\u0082\u00a2H&\u001f\u00cc\u0019R\u00f7\u00a7\u0094\u0004\u5bf7\u7f76\u00a0\u00f6\u0012\u00c7\u00e2\u00d7\u00fc\u00b6|\u0019\u0018\u0097z\u00d01n\u00c0\u001b\u00e0L\u0096\r\u8bc5\u8ac0'Te\u00c2HL\u00fa\u00b0\u00d6/<\u001a\u4e6c\u6b96\u4e05\u5139\u66b7\u79ef\u008e\u0010\fc\u00a9\u0005\u0017J\u008a27i\u0011\u00f1!y\u00be\u00ecV;\u0013\"y\u00ba\u00c6[R\u00f8\u00a7\u007f\u00be\u00f7\u00a5\u00e8\u00bc\u00e7\\(fo\r\u7ec8\u7e33\u00cdz8\b\u00ed\u00fb\u0092Z\u00a5\u00ff\u00bcb\u6714\u5bcf\u62f3\u7a83\u4e10\u4e74\u8de7\u988b\u76d5\uffc4\u8b1d\u908a\u8fa3\u5b31\u654d\u6e54\u909b\u8de0\u4ebf\u3058\u0007\u00d6\u00a7y \u00bc\u00aeH\"\u00b6/\u009f\u00dd\u00be\u0089?\u008ct\u00f66Up<\u00b3\u00f0C\u008a\u00fe\u0007\u00eb\u0096\u00b3kH\u00eb\u0097B\u0091\u008fl\u00cd\u0012\u0014E\u000f)\u0094\u0088a\u0010\u00c3\u00bf\u0019\u00d8.\u00df-\u00a1\u00cfp\u0090\u00c98[q\u009f\u00af\u00b8\u001d[N\u00ba\u001b\u009b\u00c69\u00acI\u0013\u001a\u0093\u00bd\u009b\u00bb\u00f9\u00e4\u00d2\u00fc\u0010\u0087p\u00e6\u0006&\u000b\u0010\u008ch\u001a\u4eda\u6be5\u4ed3\u5157\u666d\u7922\u00d5\u00a9gT\u00c4\u00e3\u00ba\u0096?\u00a9\u0081\u001a\u00c7\u009f\u00fb\u00b4\u00e5U=\f\u0004\u5bb3\u7f07(\u00d8\u0013\u62c0\u5fc5\u5b56\u7f8a\u00e4\u00cb9C\u00aaD&\u00e4\u00fe|\u00bf\u00ec_\u0097O\r\u7e25\u7e38p\u001b\u008f$\u001b~L\u00ea~\u00e9\u00c7";
                        var12_3 = "\u6bfa\u8f8a\u4fa9\u750d\u0000\u0007\u00f5\u00c1p\u00a6F\u00de\u00a4\u00f6/\u009aK\u00e1F|\u000b\u00d7X\u00a8#Jm\u00bc\u008cY\u000fc\u00eb\r\u8b66\u8a07S\u00ac\u00eb\u00dd\u0099\u00af\u00c0\u00cc\u0091\u00a0\u00d4\u0012\u008eU\u00fe\n\u0093\u00a2\u00bd\u00c3\u0003\u0001B^<-Q]\u0005!!\u6bdc\u8fe0\u4f6d\u7540\u0098\u00ae\u00e6\u00f4\u0012\u0000\n\n-l\u001e\u00c9m\u008b\u00821\u0093~K\u009dA\u00ec!h\u0005\u00c3>0\u00cd\u0013\u00fd\u00b8A\u00fe$U\u0017G\u0082\u00a2H&\u001f\u00cc\u0019R\u00f7\u00a7\u0094\u0004\u5bf7\u7f76\u00a0\u00f6\u0012\u00c7\u00e2\u00d7\u00fc\u00b6|\u0019\u0018\u0097z\u00d01n\u00c0\u001b\u00e0L\u0096\r\u8bc5\u8ac0'Te\u00c2HL\u00fa\u00b0\u00d6/<\u001a\u4e6c\u6b96\u4e05\u5139\u66b7\u79ef\u008e\u0010\fc\u00a9\u0005\u0017J\u008a27i\u0011\u00f1!y\u00be\u00ecV;\u0013\"y\u00ba\u00c6[R\u00f8\u00a7\u007f\u00be\u00f7\u00a5\u00e8\u00bc\u00e7\\(fo\r\u7ec8\u7e33\u00cdz8\b\u00ed\u00fb\u0092Z\u00a5\u00ff\u00bcb\u6714\u5bcf\u62f3\u7a83\u4e10\u4e74\u8de7\u988b\u76d5\uffc4\u8b1d\u908a\u8fa3\u5b31\u654d\u6e54\u909b\u8de0\u4ebf\u3058\u0007\u00d6\u00a7y \u00bc\u00aeH\"\u00b6/\u009f\u00dd\u00be\u0089?\u008ct\u00f66Up<\u00b3\u00f0C\u008a\u00fe\u0007\u00eb\u0096\u00b3kH\u00eb\u0097B\u0091\u008fl\u00cd\u0012\u0014E\u000f)\u0094\u0088a\u0010\u00c3\u00bf\u0019\u00d8.\u00df-\u00a1\u00cfp\u0090\u00c98[q\u009f\u00af\u00b8\u001d[N\u00ba\u001b\u009b\u00c69\u00acI\u0013\u001a\u0093\u00bd\u009b\u00bb\u00f9\u00e4\u00d2\u00fc\u0010\u0087p\u00e6\u0006&\u000b\u0010\u008ch\u001a\u4eda\u6be5\u4ed3\u5157\u666d\u7922\u00d5\u00a9gT\u00c4\u00e3\u00ba\u0096?\u00a9\u0081\u001a\u00c7\u009f\u00fb\u00b4\u00e5U=\f\u0004\u5bb3\u7f07(\u00d8\u0013\u62c0\u5fc5\u5b56\u7f8a\u00e4\u00cb9C\u00aaD&\u00e4\u00fe|\u00bf\u00ec_\u0097O\r\u7e25\u7e38p\u001b\u008f$\u001b~L\u00ea~\u00e9\u00c7".length();
                        var9_4 = 33;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 50;
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
                            var10_2 = "\u67e9\u5be8\u6262\u7a49\u4e0c\u4e03\u8d4a\u984b\u764e\ufff2\u8b40\u9062\u8f26\u5b02\u65d3\u6e1c\u9066\u8dc7\u4e2e\u3092\u001b\u00a1\n\u00b9\u00bb\u008a\u00f3\u00a0\u00a7\u0085\u00b1\u00d7 \u0099\u0018\u00f5\u0090\u0003[\u00f6\u00ceFa[up\u0014\u00b6\u00fa\u00cc\u0007yw?FW\u00d9\u00a7\u00d2\u0084H!\u008a\r\u00f2\u000e\u0005B}gn\u007f\u0082\u00ees7\u00a8\u0092Q8m\u00ee\u00a9\u0091m\u00e8\u0002x\u0086m\u0013R\u009e\u00a8XqQn\u0013\u624c\u5fff\u5be9\u7fe3=\u00c8,\r&\u00a3\u00996'\b\u00aaL\u00d3\u00ad\u00f0";
                            var12_3 = "\u67e9\u5be8\u6262\u7a49\u4e0c\u4e03\u8d4a\u984b\u764e\ufff2\u8b40\u9062\u8f26\u5b02\u65d3\u6e1c\u9066\u8dc7\u4e2e\u3092\u001b\u00a1\n\u00b9\u00bb\u008a\u00f3\u00a0\u00a7\u0085\u00b1\u00d7 \u0099\u0018\u00f5\u0090\u0003[\u00f6\u00ceFa[up\u0014\u00b6\u00fa\u00cc\u0007yw?FW\u00d9\u00a7\u00d2\u0084H!\u008a\r\u00f2\u000e\u0005B}gn\u007f\u0082\u00ees7\u00a8\u0092Q8m\u00ee\u00a9\u0091m\u00e8\u0002x\u0086m\u0013R\u009e\u00a8XqQn\u0013\u624c\u5fff\u5be9\u7fe3=\u00c8,\r&\u00a3\u00996'\b\u00aaL\u00d3\u00ad\u00f0".length();
                            var9_4 = 98;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 80;
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
                                    v15 = 101;
                                    break;
                                }
                                case 1: {
                                    v15 = 75;
                                    break;
                                }
                                case 2: {
                                    v15 = 55;
                                    break;
                                }
                                case 3: {
                                    v15 = 126;
                                    break;
                                }
                                case 4: {
                                    v15 = 23;
                                    break;
                                }
                                case 5: {
                                    v15 = 117;
                                    break;
                                }
                                default: {
                                    v15 = 55;
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
                iS.a = var13;
                iS.b = new String[19];
                iS.f = iS.a(-2623, 11127);
                iS.Z = iS.a(-2610, 7140);
                iS.p = iS.a(-2605, -16986);
                iS.U = iS.a(-2614, -18592);
                iS.e = iS.a(-2614, -18592);
                iS.O = iS.a(-2612, 19283);
                iS.Q = iS.a(-2622, 1636);
                iS.k = iS.a(-2606, -23999);
                iS.J = iS.a(-2621, 32464);
                iS.d = iS.a(-2611, 21922);
                var0_7 = 8203273518616876246L;
                var6_8 = new long[134];
                var3_9 = 0;
                var4_10 = "W\u00ce\u00f1_\u0002\u00bd\u0000\u00a9\u00d6\u009eq\u00ff4n\u00e8\u00d4\u0003G\u00f5\u0082\u00d9\u00da\u00ca\u0016\u00bdQx\u00b93\u00f04\u0015i\u00ee{\u00f7\u00aaN\u00ac\u00b1]\u0097^\u001f\u008e\u00a3\u001b`>ys7\u008e\u0011\t\u00b0b3\u00c6\u00d72E\u0090\u00b4\u00c8\u00be\u00c50\u00f7\u0012\u00d3\fM\u00ce\u0088\u001e!~'I7Uo\u00a0I\n@\u0083\u00dd\u0002\u00c1w\u00a2,e\u00b3C\u00adGk\u007f\u00fc\u00c9\u00a4\u00ef3\u0080\f|8\u00da\u00e5\u00d2k\u00c3wq\n\u00b3\u000b\u00c6\u00a75\u0088\u001b\u00e3j\u001a\u00a0\u008dGJlSL[E`co{\u00b2\u00bfv\u00aa)%i]G\u00fd\u00d3\u00b9\u00af\u0088\u0082\u0081>\u00b8\u00abB\u00f2\u00dc8\u00ec-[\u00d7D\u0096\u00a5\u00a0\u00d4h2\u0092\u0090E\u00b3\u008c]v\u00a2\u0004\u00b7\u008b\u00db\u009dG\u0086\u00f6\\\ti\u0085\u00be\u0018\u00e3\u00c5\u0086\u0082\u00dd\u0097%p\u00f2R\u00dc\u00f0\u00ccoI\u00c22\f\u00aa\u0082\u00f0$Jk\u00986\u00c2\u00dae\u00a8\u00b5\u00c79\u0007\u0084\u009d0I\u00dc\u00c8~\u00a1\u00b2r\u0093\u0016\u00a1\u009a3m\u00b3\u001ee\u00f7M\u000es\u009b\u00a0\u008e[\u0088\u00b7\u0005\u00d9\u00b8_Q\u00d7\u001f\u00ce8\u0083`s\u00938L\u008f@\u00abC\u00d3ei%\u00c8\u008c(\u0085\u00c51\u0087\u0003n\u00b1\u00fb\u00b8\u00ac}\u0005N\b\u000e\u0089&\u0093\u00b6B\u00e9\u00d3\u00d7\u00ba\u00e3T\u00dbC\u00b8?]\u00b3\u00ad\u0016\u0095\u00acj\u0004{\u0097:B\u000fht\u00eb\u00b5Q4(\u00ecH\u00cf\u0000\u00b1\u00ae\t2\u00ee\u00b8\u00c9\u00dd\u00d3t7@^U\u0094w\u008d\u00b3c\u0095\u008c\u00c6t@8\u0010Xn\u00a60g\u009aw\u00f6\u0097\"\u00af\u0099*\u0001F\u00a1\"'\rQ\u000b\u008af\u00d8\u008ab5\u00d9\u009d^\u00b3\u00dd\u0092\u0095=\u0085Ja\u00d7M#\u00d425\u00f7\u00fai\u00d8\u001eG\u00f8\u00dc#\u00eb\u0090\u00a2\n_\u00d9\u00d3A<\u00b6_\u00f3\u00fcS:\u00a4\u0019\u00fa\u0095@E'\u0016\u00cd\u00a0\u0097\u0015'\u00abg\u00f7K\u00ea\u008f\t\u0012x\u0080\u001f\u00eacv\u00e6m\u00a5_$\u00b7\u00b6\u00d5\u001c\u008c\u00b5z\u0012\u0012\u00a01\u00ce\u00ea\u00d1&\u00ac<O8\u0088\u008d\u00ea\u00e8\u001e\u001b\u0091\u009eTZ\u009a6\u0097\u00ea\u00e0\u00bcZz5\u0013g\u00bdv\u00ed\u0015\u000fX\u00f4\u00a2W\u00c8\u00d6\u0013\u00d5\u00e6\u00f1\u00b3~\u00b1\u009e\u00c1j\u00f3\u00e2Q\u009f\u00f2\u001d\u00caPzT\u00b4M\u008b\u00b77\u009c\u009f\u00a4\u0014m_\u000eG\u0006i\u001a\\\u0011\u008e\r\u0015\u00ea\u0006f\u0090\u00d4\u00f2/3&cP\u00d5\u00ec\u00c2\u0019\u0090`\fAiA(\u008br\u0088\u00fc\u0007m 1\u009fc\u00a7\u00fb-#\u00184'\u00a7]\u0015s\u00aa\u00fe?\u00df\u00e7f\u00fb\u00ca\u00f97.\u0001Z\u0015\u008f\u00dc&\u00fe\u00a7Ye\u00f4+\u0011\u001d\u0012\u0018\u00d3\\\u00c8H\u00f6\u008dA\u00bbJN\\\u0098\u00bf \u00a9H\u00f8\u008bQ\u00c4\u0081\u0094Q\u00c6\u0017;\n\u00e1\u00df\u000f\u00b3+D\u0083\u00d5\u001fp\u008f\u0080\u001b\u0006\u00f7\u00d0\u00cf\u009b\u00c9\u00e2\u00f0n~\u001bZK\u00de\u0018\u00c4\u00c8\u00b1\u00868\u0012\u00ae\u00b6\u00d4\u00a1^\u009f\u0007\u008d)?\u00e8\u00c5\u00bb?\u009f\u0091#\u00d7\u00a7\u00ae07\u0003\u001f8\u00bb\u00a7\u0006\u008f\u0099\u0081\u00dcz\u00bb.o\u0086\u0082\u00d5\u00ae>\u0084Md\u00c7\u008fV=\u0089\u0010;?-x\u00bb\u0007\u00a10\u00b8\u0003\u00863\u000e\u00daI\u008f\u00a9\u001b\u0089\u00af\u000b\u00f5Uz\u0013\u00cb\u009c\u00deD\u009f~B\u00ff-\u00ff\u008b[M\u00b3\u00b9NfT\r/+a\u0000\u0010\u00c7/r\u0098/\u00f9\u009d\u0012\u0094\u0002\u00b5u\u00ad\u0019I\u00c2\u00e0\u00ce+c\u00a7Z\u00b4\u001fV\u008c\u00db\u0082\u0011B,\u0012\u00fcV\u0000n\u0019\u00cf\u008fq\u008e\u00e1\u0014\u001f\u001e\u0093\u008c|a\u00ec\u008e\u00e7\u009fI\u0086F_J\u00e7\u008b\u00ebt\u00ef\u00f3|\u00df|\u009aS\u000b\u00efM'\u00b7\u00a7\f\u001b\u00db\u00dc\u009b\u00d0\u00ba\u00c1\u001d\u00c8\u0088P\u0003/\u00f8\u0080W\u0083\u00a5o\u00f2\u0015\u00e2\u00d9\u000b\u00e8\u0014^\u00fcf\u001b\u00af\u00dd\u008a\u0081+lV#\u0083\u00fcP\u00e5z+4!e\\\u00d8\u00f9\u00a1\u008c:P\u00c7Hc\u0094q):jC\u00c2y\u00fc>{)/uo(\u00c8\u0084\u00b4:\u00a89c\u00bfo\u00a3\u0088\u00b0Z\\\u0087\u00ea\u0003\u0082\u00eeX\u008c\u00f6\u009f\u00fe\u00e9\u00cd\u0011\u00a4Ej\u0011/\u00df\u00f1\u00bf\u00a7;>\\Sv\u00e3\u00a1b4qS\u00f2\u00cdo\u00aa\u0010\u00fa\u0012\u0084\u00e4b\u00dd\u00f4\u000e\u00ee\u008eC\u00b8\u0083\u001d\u00d2\u00fb_\u00ca5\u00b1\u0096\u00a5e\u0000\u00fcl\u0012\u00dc\u008f4\u0006\u00a6\u00e1Y\u009d\r\u00c0\u00b7\u009e\u0013_\u0095\u0081\u00d1\u00e1\u00d8\fB\u0097T\u0088a\u0004\u0088\u0097\u00c6/\u001a\u00f1\u00a5\u00f15\u001a\u00e5\u00027Z";
                var5_11 = "W\u00ce\u00f1_\u0002\u00bd\u0000\u00a9\u00d6\u009eq\u00ff4n\u00e8\u00d4\u0003G\u00f5\u0082\u00d9\u00da\u00ca\u0016\u00bdQx\u00b93\u00f04\u0015i\u00ee{\u00f7\u00aaN\u00ac\u00b1]\u0097^\u001f\u008e\u00a3\u001b`>ys7\u008e\u0011\t\u00b0b3\u00c6\u00d72E\u0090\u00b4\u00c8\u00be\u00c50\u00f7\u0012\u00d3\fM\u00ce\u0088\u001e!~'I7Uo\u00a0I\n@\u0083\u00dd\u0002\u00c1w\u00a2,e\u00b3C\u00adGk\u007f\u00fc\u00c9\u00a4\u00ef3\u0080\f|8\u00da\u00e5\u00d2k\u00c3wq\n\u00b3\u000b\u00c6\u00a75\u0088\u001b\u00e3j\u001a\u00a0\u008dGJlSL[E`co{\u00b2\u00bfv\u00aa)%i]G\u00fd\u00d3\u00b9\u00af\u0088\u0082\u0081>\u00b8\u00abB\u00f2\u00dc8\u00ec-[\u00d7D\u0096\u00a5\u00a0\u00d4h2\u0092\u0090E\u00b3\u008c]v\u00a2\u0004\u00b7\u008b\u00db\u009dG\u0086\u00f6\\\ti\u0085\u00be\u0018\u00e3\u00c5\u0086\u0082\u00dd\u0097%p\u00f2R\u00dc\u00f0\u00ccoI\u00c22\f\u00aa\u0082\u00f0$Jk\u00986\u00c2\u00dae\u00a8\u00b5\u00c79\u0007\u0084\u009d0I\u00dc\u00c8~\u00a1\u00b2r\u0093\u0016\u00a1\u009a3m\u00b3\u001ee\u00f7M\u000es\u009b\u00a0\u008e[\u0088\u00b7\u0005\u00d9\u00b8_Q\u00d7\u001f\u00ce8\u0083`s\u00938L\u008f@\u00abC\u00d3ei%\u00c8\u008c(\u0085\u00c51\u0087\u0003n\u00b1\u00fb\u00b8\u00ac}\u0005N\b\u000e\u0089&\u0093\u00b6B\u00e9\u00d3\u00d7\u00ba\u00e3T\u00dbC\u00b8?]\u00b3\u00ad\u0016\u0095\u00acj\u0004{\u0097:B\u000fht\u00eb\u00b5Q4(\u00ecH\u00cf\u0000\u00b1\u00ae\t2\u00ee\u00b8\u00c9\u00dd\u00d3t7@^U\u0094w\u008d\u00b3c\u0095\u008c\u00c6t@8\u0010Xn\u00a60g\u009aw\u00f6\u0097\"\u00af\u0099*\u0001F\u00a1\"'\rQ\u000b\u008af\u00d8\u008ab5\u00d9\u009d^\u00b3\u00dd\u0092\u0095=\u0085Ja\u00d7M#\u00d425\u00f7\u00fai\u00d8\u001eG\u00f8\u00dc#\u00eb\u0090\u00a2\n_\u00d9\u00d3A<\u00b6_\u00f3\u00fcS:\u00a4\u0019\u00fa\u0095@E'\u0016\u00cd\u00a0\u0097\u0015'\u00abg\u00f7K\u00ea\u008f\t\u0012x\u0080\u001f\u00eacv\u00e6m\u00a5_$\u00b7\u00b6\u00d5\u001c\u008c\u00b5z\u0012\u0012\u00a01\u00ce\u00ea\u00d1&\u00ac<O8\u0088\u008d\u00ea\u00e8\u001e\u001b\u0091\u009eTZ\u009a6\u0097\u00ea\u00e0\u00bcZz5\u0013g\u00bdv\u00ed\u0015\u000fX\u00f4\u00a2W\u00c8\u00d6\u0013\u00d5\u00e6\u00f1\u00b3~\u00b1\u009e\u00c1j\u00f3\u00e2Q\u009f\u00f2\u001d\u00caPzT\u00b4M\u008b\u00b77\u009c\u009f\u00a4\u0014m_\u000eG\u0006i\u001a\\\u0011\u008e\r\u0015\u00ea\u0006f\u0090\u00d4\u00f2/3&cP\u00d5\u00ec\u00c2\u0019\u0090`\fAiA(\u008br\u0088\u00fc\u0007m 1\u009fc\u00a7\u00fb-#\u00184'\u00a7]\u0015s\u00aa\u00fe?\u00df\u00e7f\u00fb\u00ca\u00f97.\u0001Z\u0015\u008f\u00dc&\u00fe\u00a7Ye\u00f4+\u0011\u001d\u0012\u0018\u00d3\\\u00c8H\u00f6\u008dA\u00bbJN\\\u0098\u00bf \u00a9H\u00f8\u008bQ\u00c4\u0081\u0094Q\u00c6\u0017;\n\u00e1\u00df\u000f\u00b3+D\u0083\u00d5\u001fp\u008f\u0080\u001b\u0006\u00f7\u00d0\u00cf\u009b\u00c9\u00e2\u00f0n~\u001bZK\u00de\u0018\u00c4\u00c8\u00b1\u00868\u0012\u00ae\u00b6\u00d4\u00a1^\u009f\u0007\u008d)?\u00e8\u00c5\u00bb?\u009f\u0091#\u00d7\u00a7\u00ae07\u0003\u001f8\u00bb\u00a7\u0006\u008f\u0099\u0081\u00dcz\u00bb.o\u0086\u0082\u00d5\u00ae>\u0084Md\u00c7\u008fV=\u0089\u0010;?-x\u00bb\u0007\u00a10\u00b8\u0003\u00863\u000e\u00daI\u008f\u00a9\u001b\u0089\u00af\u000b\u00f5Uz\u0013\u00cb\u009c\u00deD\u009f~B\u00ff-\u00ff\u008b[M\u00b3\u00b9NfT\r/+a\u0000\u0010\u00c7/r\u0098/\u00f9\u009d\u0012\u0094\u0002\u00b5u\u00ad\u0019I\u00c2\u00e0\u00ce+c\u00a7Z\u00b4\u001fV\u008c\u00db\u0082\u0011B,\u0012\u00fcV\u0000n\u0019\u00cf\u008fq\u008e\u00e1\u0014\u001f\u001e\u0093\u008c|a\u00ec\u008e\u00e7\u009fI\u0086F_J\u00e7\u008b\u00ebt\u00ef\u00f3|\u00df|\u009aS\u000b\u00efM'\u00b7\u00a7\f\u001b\u00db\u00dc\u009b\u00d0\u00ba\u00c1\u001d\u00c8\u0088P\u0003/\u00f8\u0080W\u0083\u00a5o\u00f2\u0015\u00e2\u00d9\u000b\u00e8\u0014^\u00fcf\u001b\u00af\u00dd\u008a\u0081+lV#\u0083\u00fcP\u00e5z+4!e\\\u00d8\u00f9\u00a1\u008c:P\u00c7Hc\u0094q):jC\u00c2y\u00fc>{)/uo(\u00c8\u0084\u00b4:\u00a89c\u00bfo\u00a3\u0088\u00b0Z\\\u0087\u00ea\u0003\u0082\u00eeX\u008c\u00f6\u009f\u00fe\u00e9\u00cd\u0011\u00a4Ej\u0011/\u00df\u00f1\u00bf\u00a7;>\\Sv\u00e3\u00a1b4qS\u00f2\u00cdo\u00aa\u0010\u00fa\u0012\u0084\u00e4b\u00dd\u00f4\u000e\u00ee\u008eC\u00b8\u0083\u001d\u00d2\u00fb_\u00ca5\u00b1\u0096\u00a5e\u0000\u00fcl\u0012\u00dc\u008f4\u0006\u00a6\u00e1Y\u009d\r\u00c0\u00b7\u009e\u0013_\u0095\u0081\u00d1\u00e1\u00d8\fB\u0097T\u0088a\u0004\u0088\u0097\u00c6/\u001a\u00f1\u00a5\u00f15\u001a\u00e5\u00027Z".length();
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
lbl122:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u001a\u00be\u00b5\u001b\u00ba\u009b\u00e5\u008f\u00a21\u00c3\u009d\u0090l4g";
                    var5_11 = "\u001a\u00be\u00b5\u001b\u00ba\u009b\u00e5\u008f\u00a21\u00c3\u009d\u0090l4g".length();
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
lbl135:
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
lbl146:
                // 1 sources

                ** continue;
            }
        }
        iS.h = var6_8;
        iS.i = new Integer[134];
        iS.r = iS.a(15161, 7659944305060348101L);
        iS.l = iS.a(13604, 2403004475278626365L);
        iS.m = iS.a(9193, 193603891478468712L);
        iS.c = iS.a(9526, 8542019034770906777L);
        iS.I = iS.a(23108, 1507317751430537643L);
        iS.B = iS.a(9981, 5423780203855224160L);
        iS.g = iS.a(9193, 193603891478468712L);
        iS.T = iS.a(28508, 2732832811803366641L);
        iS.G = iS.a(15161, 7659944305060348101L);
        iS.q = iS.a(17674, 1122187961586351828L);
        iS.V = iS.f("JiIeLqdwBBoYWZ5M", withStyle(java.util.function.UnaryOperator ), (MutableComponent)hi.a("G", iS.a(-2617, -19006), (long)1262634304799069784L), (UnaryOperator)(UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(net.minecraft.network.chat.Style ), (Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Style;)());
        iS.Y = new iS();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void extractRenderState(GuiGraphicsExtractor var1_1, int var2_2, int var3_3, float var4_4) {
        block23: {
            block22: {
                block21: {
                    block25: {
                        block24: {
                            var5_5 = Dl.t();
                            var27_6 /* !! */  = iS.a(5311, 8337459281246203671L) - iS.a(17928, 8177129660109225397L) - iS.a(6162, 7987989613483074541L);
                            if (!var5_5) break block24;
                            ** GOTO lbl-1000
                        }
                        switch (var27_6 /* !! */ ) {
                            case 1730445048: lbl-1000:
                            // 2 sources

                            {
                                hi.a("G", (long)459480616877844027L);
                                hi.a("G", (long)602162150318222526L);
                                break;
                            }
                        }
                        var6_7 = hi.a("G", (float)((float)(hi.a("G", (long)1328720830485890884L) - hi.a("\u00e9", (Object)this, (long)1335720976043316726L)) / 250.0f), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                        var7_8 = hi.a("G", (float)(255.0f * var6_7), (long)400355798406630015L);
                        var8_9 = hi.a("G", (int)iS.a(28706, 1442277258006907891L), (int)(hi.a("\u00e9", (Object)this, (long)792886182141853653L) - iS.a(8530, 3155309695798450869L)), (long)476721548361853495L);
                        var9_10 = var8_9 - iS.a(15653, 3737760692695860870L);
                        var10_11 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)492277042632561259L);
                        var11_12 = (hi.a("\u00e9", (Object)this, (long)792886182141853653L) - var8_9) / 2;
                        var12_13 = iS.f("JiIeLqdwBBoYWZ5M", l(int ), (iS)this, (int)var10_11);
                        var13_14 = hi.a("\u00a5", (Object)new Color(iS.a(10221, 2580538534195993662L), iS.a(10221, 2580538534195993662L), iS.a(30486, 6078302027196615840L), (int)hi.a("G", (int)iS.a(20, 8044568840524053472L), (int)var7_8, (long)476721548361853495L)), (long)921162811333111485L);
                        var14_15 = hi.a("\u00a5", (Object)new Color(iS.a(7216, 8931851252326573989L), iS.a(13375, 7278093757050327024L), iS.a(12128, 342840294397056251L), (int)hi.a("G", (int)iS.a(8248, 5135760651100134392L), (int)var7_8, (long)476721548361853495L)), (long)921162811333111485L);
                        var15_16 = iS.f("JiIeLqdwBBoYWZ5M", getRGB(), (Color)new Color(iS.a(26558, 7654140201506954347L), iS.a(15644, 4784974668167284406L), iS.a(15644, 4784974668167284406L), (int)var7_8));
                        var16_17 = hi.a("\u00a5", (Object)new Color(iS.a(9505, 7501678722735152875L), iS.a(23001, 6242832250828874325L), iS.a(29772, 1944995109473603506L), (int)var7_8), (long)921162811333111485L);
                        hi.a("\u00a5", (Object)var1_1, (int)var11_12, (int)var12_13, (int)(var11_12 + var8_9), (int)(var12_13 + var10_11), (int)var13_14, (long)839469956321370720L);
                        hi.a("\u00a5", (Object)var1_1, (int)var11_12, (int)var12_13, (int)var8_9, (int)var10_11, (int)var14_15, (long)926493374367926932L);
                        var17_18 = iS.f("JiIeLqdwBBoYWZ5M", getString(), (Component)hi.a("\u00a5", (Object)this, (long)1057886686337786910L));
                        var18_19 = hi.a("\u00e9", (Object)this, (long)792886182141853653L) / 2 - hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)528627800389326457L), (Object)var17_18, (long)543225627640100603L) / 2;
                        var19_20 = var12_13 + iS.a(10937, 7837176216400400641L);
                        hi.a("\u00a5", (Object)var1_1, (Object)hi.a("\u00e9", (Object)this, (long)528627800389326457L), (Object)var17_18, (int)var18_19, (int)var19_20, (int)var15_16, (boolean)false, (long)903824814162714536L);
                        var20_21 = var11_12 + iS.a(10221, 2580538534195993662L);
                        var21_22 = var19_20 + iS.a(24190, 4680979930038887839L);
                        var22_23 = iS.f("JiIeLqdwBBoYWZ5M", iterator(), (List)hi.a("\u00e9", (Object)this, (long)729100649580409695L));
                        if (var5_5) break block25;
                        var27_6 /* !! */  = (iS.a(1665, 6797657571332668761L) ^ iS.a(8162, 6044200260063536130L)) / iS.a(17912, 8614783709243407906L) - iS.a(21907, 7611339196433329745L);
                        if (!var5_5) break block21;
                        ** GOTO lbl42
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        block27: {
                            block26: {
                                v0 /* !! */  = hi.a("\u00a5", (Object)var22_23, (long)984088978567310565L);
                                if (var5_5) break block26;
                                if (v0 /* !! */  != false) break block27;
lbl42:
                                // 2 sources

                                v0 /* !! */  = (CallSite)((iS.a(2263, 8524039176649978693L) ^ iS.a(31124, 6245607442925371984L)) / iS.a(30121, 9167605717975158335L) + iS.a(10066, 7339394325648186444L) - iS.a(5204, 8460247000938622904L) ^ iS.a(2582, 5693145739428606355L));
                            }
                            var27_6 /* !! */  = (int)v0 /* !! */ ;
                            if (!var5_5) break block21;
                        }
                        var27_6 /* !! */  = (iS.a(8497, 1441209841461762792L) ^ iS.a(20226, 2448538765874164981L)) - iS.a(8999, 2509098412965370038L);
                        break block21;
                        break;
                    }
lbl49:
                    // 2 sources

                    while (true) {
                        block28: {
                            var23_24 = (Component)hi.a("\u00a5", (Object)var22_23, (long)470012372636416268L);
                            var24_25 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)528627800389326457L), (Object)var23_24, (int)var9_10, (long)376263318346254955L);
                            var25_26 = hi.a("\u00a5", (Object)var24_25, (long)1240653736693366367L);
                            if (var5_5) break block28;
                            var27_6 /* !! */  = (iS.a(24246, 4861952701746439480L) + iS.a(10554, 7680373996100686588L) - iS.a(11822, 5451791444965791161L)) * iS.a(8549, 1905170056532269804L) ^ iS.a(4464, 9147003082912574200L);
                            if (!var5_5) break block22;
                            ** GOTO lbl62
                        }
lbl58:
                        // 2 sources

                        while (true) {
                            block30: {
                                block29: {
                                    v1 /* !! */  = hi.a("\u00a5", (Object)var25_26, (long)984088978567310565L);
                                    if (var5_5) break block29;
                                    if (v1 /* !! */  != false) break block30;
lbl62:
                                    // 2 sources

                                    v1 /* !! */  = (CallSite)(hi.a("G", (int)(iS.a(9873, 4176497311901851002L) / 3), (int)iS.a(5825, 6419071987312373092L), (long)834203424483934088L) ^ iS.a(6810, 2361820469548065150L) ^ iS.a(31333, 4545295714789736862L));
                                }
                                var27_6 /* !! */  = (int)v1 /* !! */ ;
                                if (!var5_5) break block22;
                            }
                            var27_6 /* !! */  = iS.a(11035, 8075473402017485034L) / 3 ^ iS.a(27464, 524271293005025434L);
                            break block22;
                            break;
                        }
                        break;
                    }
lbl69:
                    // 2 sources

                    while (true) {
                        var21_22 += 4;
                        if (!var5_5) break block23;
                        ** GOTO lbl87
                        break;
                    }
                }
lbl74:
                // 2 sources

                while (true) {
                    switch (var27_6 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -1172163945: {
                            ** GOTO lbl49
                        }
                        case -1172163947: {
                            break;
                        }
                        case -1172163948: {
                            hi.a("G", (long)976103121275918466L);
                            ** continue;
                        }
                    }
lbl87:
                    // 2 sources

                    super.extractRenderState(var1_1, var2_2, var3_3, var4_4);
                    return;
                }
            }
            do {
                switch (var27_6 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1748480341: {
                        var26_27 = (FormattedCharSequence)hi.a("\u00a5", (Object)var25_26, (long)470012372636416268L);
                        iS.f("JiIeLqdwBBoYWZ5M", text(net.minecraft.client.gui.Font net.minecraft.util.FormattedCharSequence int int int boolean ), (GuiGraphicsExtractor)var1_1, (Font)hi.a("\u00e9", (Object)this, (long)528627800389326457L), (FormattedCharSequence)var26_27, (int)var20_21, (int)var21_22, (int)var16_17, (boolean)false);
                        var21_22 += 12;
                        if (!var5_5) break;
                        ** GOTO lbl69
                    }
                    case 1748480342: {
                        ** continue;
                    }
                    case 1748480343: {
                        hi.a("G", (long)397288152806896377L);
                        hi.a("G", (long)818835474660401656L);
                        return;
                    }
                }
                var27_6 /* !! */  = (iS.a(23272, 2442821294319264104L) + iS.a(20513, 130882771716631495L) - iS.a(31801, 764818197759936445L)) * iS.a(3376, 4137262866524649211L) ^ iS.a(12197, 2047427819388474475L);
            } while (!var5_5);
        }
        var27_6 /* !! */  = (iS.a(27028, 5680290252702306874L) ^ iS.a(20140, 2416757334630561092L)) / iS.a(19009, 7817790279902884190L) - iS.a(6210, 3540477234746925912L);
        ** while (true)
    }

    private iS() {
        super((Component)iS.f("JiIeLqdwBBoYWZ5M", literal(java.lang.String ), (String)iS.a(-2624, -19707)));
    }

    private void J(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)593811617682224349L), (Object)hi.a("G", (boolean)false, (long)827866887164769227L), (long)841911929517394792L);
        hi.a("\u00a5", (Object)hi.a("j", (long)1240307117545218967L), (long)419984540593063660L);
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)833235119314633061L);
    }

    private void lambda$init$3(Button button) {
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)833235119314633061L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void m(Object[] var1_1) {
        block17: {
            block16: {
                block15: {
                    block13: {
                        block14: {
                            var2_2 = Dl.t();
                            var3_3 = hi.a("G", (int)iS.a(17844, 8694533066425695799L), (int)iS.a(9864, 492105763871923579L), (long)834203424483934088L) - iS.a(4058, 1621613682373768231L) + iS.a(12927, 6400057884074346915L);
                            if (var2_2) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    v0 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)897986363229628823L), (long)789438897355831922L)), (long)1000026253634408124L);
                                    if (var2_2) break block13;
                                    if (v0 == false) break block14;
                                    break block15;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)471501407810427151L), (long)907159218940561824L), (Object)hi.a("j", (long)481735495424126142L), (long)413629821670745698L);
                                    if (!var2_2) break block16;
lbl13:
                                    // 2 sources

                                    while (true) {
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)471501407810427151L), (long)907159218940561824L), (Object)new TitleScreen(), (long)413629821670745698L);
                                        if (var2_2) lbl-1000:
                                        // 2 sources

                                        {
                                            return;
                                        }
                                        break block17;
                                        break;
                                    }
                                    break;
                                }
                            }
lbl19:
                            // 6 sources

                            while (true) {
                                switch (var3_3) {
                                    default: {
                                        ** continue;
                                    }
                                    case 996150336: {
                                        ** continue;
                                    }
                                    case 996150335: {
                                        ** continue;
                                    }
                                    case 996150334: {
                                        ** continue;
                                    }
                                    case 996150338: 
                                }
                                return;
                            }
                        }
                        v0 = var3_3 = (reference)((iS.a(26326, 5428200524826434882L) + iS.a(3145, 7358960998244726610L) ^ iS.a(7288, 7677494650656434125L)) / iS.a(19193, 7579009094760755561L) - iS.a(5868, 554834708939976043L));
                    }
                    if (!var2_2) ** GOTO lbl19
                }
                var3_3 = iS.f("JiIeLqdwBBoYWZ5M", max(int int ), (int)iS.a(25154, 8325170999492827621L), (int)iS.a(32107, 8513548022092547729L)) / iS.a(5417, 1839642438609677978L) / 5 - iS.a(8606, 2906983237180168737L) + iS.a(2220, 3371795890490716980L);
                if (!var2_2) ** GOTO lbl19
            }
            var3_3 = (reference)((iS.a(15310, 7323109842529943619L) * iS.a(3160, 5860611339223644093L) ^ iS.a(15910, 5198088398681867663L)) - iS.a(28291, 1199167008065574227L) ^ iS.a(5840, 2941190672650448141L));
            if (!var2_2) ** GOTO lbl19
        }
        var3_3 = (reference)((iS.a(24294, 5564704623707317519L) * iS.a(13104, 8344597601766836387L) ^ iS.a(15222, 3579139323775615176L)) - iS.a(28884, 7244758964038519571L) ^ iS.a(1507, 1860724379067104795L));
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public void onClose() {
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)833235119314633061L);
    }

    private static Component C(Object[] objectArray) {
        Object object = objectArray[0];
        return hi.a("\u00a5", (Object)hi.a("G", (String)object, (long)1262634304799069784L), (Object)hi.a("j", (long)1198615335403330454L), (long)1224058718624515155L);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFF5C3) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 64;
                case 1 -> 5;
                case 2 -> 244;
                case 3 -> 23;
                case 4 -> 110;
                case 5 -> 167;
                case 6 -> 208;
                case 7 -> 118;
                case 8 -> 251;
                case 9 -> 93;
                case 10 -> 240;
                case 11 -> 75;
                case 12 -> 74;
                case 13 -> 220;
                case 14 -> 83;
                case 15 -> 2;
                case 16 -> 159;
                case 17 -> 146;
                case 18 -> 172;
                case 19 -> 122;
                case 20 -> 40;
                case 21 -> 119;
                case 22 -> 223;
                case 23 -> 8;
                case 24 -> 26;
                case 25 -> 131;
                case 26 -> 34;
                case 27 -> 246;
                case 28 -> 18;
                case 29 -> 100;
                case 30 -> 82;
                case 31 -> 57;
                case 32 -> 45;
                case 33 -> 85;
                case 34 -> 41;
                case 35 -> 51;
                case 36 -> 21;
                case 37 -> 191;
                case 38 -> 229;
                case 39 -> 166;
                case 40 -> 39;
                case 41 -> 59;
                case 42 -> 22;
                case 43 -> 123;
                case 44 -> 169;
                case 45 -> 133;
                case 46 -> 19;
                case 47 -> 89;
                case 48 -> 77;
                case 49 -> 136;
                case 50 -> 148;
                case 51 -> 173;
                case 52 -> 239;
                case 53 -> 72;
                case 54 -> 11;
                case 55 -> 156;
                case 56 -> 33;
                case 57 -> 174;
                case 58 -> 235;
                case 59 -> 164;
                case 60 -> 140;
                case 61 -> 215;
                case 62 -> 203;
                case 63 -> 129;
                case 64 -> 13;
                case 65 -> 62;
                case 66 -> 213;
                case 67 -> 6;
                case 68 -> 217;
                case 69 -> 115;
                case 70 -> 15;
                case 71 -> 142;
                case 72 -> 226;
                case 73 -> 253;
                case 74 -> 175;
                case 75 -> 68;
                case 76 -> 165;
                case 77 -> 42;
                case 78 -> 86;
                case 79 -> 147;
                case 80 -> 182;
                case 81 -> 195;
                case 82 -> 134;
                case 83 -> 138;
                case 84 -> 245;
                case 85 -> 176;
                case 86 -> 135;
                case 87 -> 127;
                case 88 -> 183;
                case 89 -> 158;
                case 90 -> 181;
                case 91 -> 50;
                case 92 -> 99;
                case 93 -> 104;
                case 94 -> 237;
                case 95 -> 228;
                case 96 -> 145;
                case 97 -> 125;
                case 98 -> 98;
                case 99 -> 233;
                case 100 -> 205;
                case 101 -> 48;
                case 102 -> 47;
                case 103 -> 117;
                case 104 -> 163;
                case 105 -> 157;
                case 106 -> 70;
                case 107 -> 32;
                case 108 -> 102;
                case 109 -> 238;
                case 110 -> 211;
                case 111 -> 202;
                case 112 -> 141;
                case 113 -> 7;
                case 114 -> 17;
                case 115 -> 153;
                case 116 -> 121;
                case 117 -> 67;
                case 118 -> 130;
                case 119 -> 101;
                case 120 -> 170;
                case 121 -> 3;
                case 122 -> 216;
                case 123 -> 54;
                case 124 -> 190;
                case 125 -> 250;
                case 126 -> 24;
                case 127 -> 160;
                case 128 -> 186;
                case 129 -> 84;
                case 130 -> 210;
                case 131 -> 189;
                case 132 -> 161;
                case 133 -> 232;
                case 134 -> 106;
                case 135 -> 230;
                case 136 -> 112;
                case 137 -> 12;
                case 138 -> 252;
                case 139 -> 92;
                case 140 -> 224;
                case 141 -> 94;
                case 142 -> 120;
                case 143 -> 9;
                case 144 -> 90;
                case 145 -> 10;
                case 146 -> 107;
                case 147 -> 187;
                case 148 -> 155;
                case 149 -> 255;
                case 150 -> 78;
                case 151 -> 143;
                case 152 -> 196;
                case 153 -> 207;
                case 154 -> 44;
                case 155 -> 206;
                case 156 -> 178;
                case 157 -> 109;
                case 158 -> 144;
                case 159 -> 128;
                case 160 -> 152;
                case 161 -> 184;
                case 162 -> 79;
                case 163 -> 63;
                case 164 -> 212;
                case 165 -> 194;
                case 166 -> 200;
                case 167 -> 198;
                case 168 -> 91;
                case 169 -> 151;
                case 170 -> 0;
                case 171 -> 14;
                case 172 -> 219;
                case 173 -> 65;
                case 174 -> 254;
                case 175 -> 4;
                case 176 -> 49;
                case 177 -> 69;
                case 178 -> 28;
                case 179 -> 60;
                case 180 -> 150;
                case 181 -> 154;
                case 182 -> 31;
                case 183 -> 168;
                case 184 -> 43;
                case 185 -> 36;
                case 186 -> 139;
                case 187 -> 71;
                case 188 -> 204;
                case 189 -> 149;
                case 190 -> 243;
                case 191 -> 25;
                case 192 -> 231;
                case 193 -> 103;
                case 194 -> 248;
                case 195 -> 96;
                case 196 -> 126;
                case 197 -> 242;
                case 198 -> 87;
                case 199 -> 214;
                case 200 -> 185;
                case 201 -> 76;
                case 202 -> 221;
                case 203 -> 53;
                case 204 -> 114;
                case 205 -> 111;
                case 206 -> 56;
                case 207 -> 162;
                case 208 -> 180;
                case 209 -> 88;
                case 210 -> 105;
                case 211 -> 201;
                case 212 -> 247;
                case 213 -> 222;
                case 214 -> 52;
                case 215 -> 234;
                case 216 -> 58;
                case 217 -> 225;
                case 218 -> 171;
                case 219 -> 95;
                case 220 -> 81;
                case 221 -> 192;
                case 222 -> 37;
                case 223 -> 66;
                case 224 -> 29;
                case 225 -> 227;
                case 226 -> 179;
                case 227 -> 35;
                case 228 -> 38;
                case 229 -> 137;
                case 230 -> 132;
                case 231 -> 197;
                case 232 -> 193;
                case 233 -> 46;
                case 234 -> 73;
                case 235 -> 108;
                case 236 -> 27;
                case 237 -> 16;
                case 238 -> 209;
                case 239 -> 236;
                case 240 -> 116;
                case 241 -> 113;
                case 242 -> 177;
                case 243 -> 61;
                case 244 -> 249;
                case 245 -> 124;
                case 246 -> 188;
                case 247 -> 97;
                case 248 -> 241;
                case 249 -> 80;
                case 250 -> 30;
                case 251 -> 55;
                case 252 -> 199;
                case 253 -> 218;
                case 254 -> 1;
                default -> 20;
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
            iS.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B9B;
        if (i[n2] == null) {
            iS.i[n2] = (int)(h[n2] ^ l);
        }
        return i[n2];
    }
}
