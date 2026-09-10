/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.entity.player.Inventory
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.ItemStack
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.lz;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class X3 {
    public static int[] L;
    public static int J;
    private static boolean F;
    private static final long[] a;
    private static final Integer[] b;

    private static boolean lambda$find$0(Item[] itemArray, ItemStack itemStack) {
        Item[] itemArray2 = itemArray;
        int n = itemArray2.length;
        int n2 = 0;
        boolean bl = Dl.t();
        while (n2 < n) {
            Item item = itemArray2[n2];
            if (!bl) {
                if (hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) == item) {
                    return true;
                }
                ++n2;
            }
            if (!bl) continue;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static lz R(Predicate<ItemStack> var0) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        block14: {
                            block15: {
                                var1_1 = Dl.t();
                                var2_2 /* !! */  = hi.a("G", (int)(X3.a(30213, 3132550006574402653L) + X3.a(28773, 1910834211133082333L) + X3.a(14652, 2080458438196364142L)), (int)X3.a(1470, 8579336960961888152L), (long)834203424483934088L) + X3.a(999, 6272009931794561402L) + X3.a(9470, 4509699874131943037L);
                                if (var1_1) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 /* !! */  = hi.a("G", (Object)new Object[]{var0}, (long)605156143219789781L);
                                        if (var1_1) break block14;
                                        if (v0 /* !! */  == false) break block15;
                                        break block16;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    return new lz(X3.a(5480, 8077321286148370196L), (int)X3.m("rJpyM87F77rb2wFl", getCount(), (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1175532240973568599L)), (int)hi.a("\u00a5", (Object)X3.m("rJpyM87F77rb2wFl", getOffhandItem(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L)), (long)1262789791163377495L));
lbl11:
                                    // 1 sources

                                    while (true) {
                                        v1 /* !! */  = X3.m("rJpyM87F77rb2wFl", V(java.util.function.Predicate<net.minecraft.world.item.ItemStack> ), var0);
                                        if (var1_1) break block17;
                                        if (v1 /* !! */  == false) break block18;
                                        break block19;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    return new lz((int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (long)588501882833882098L), (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1062363401682879978L), (long)1254473531759764347L), (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1062363401682879978L), (long)1262789791163377495L));
lbl18:
                                    // 1 sources

                                    return X3.m("rJpyM87F77rb2wFl", b(java.util.function.Predicate<net.minecraft.world.item.ItemStack> int int ), var0, (int)0, (int)X3.a(20920, 2423266950933670798L));
                                }
lbl20:
                                // 6 sources

                                while (true) {
                                    switch (var2_2 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 1505711372: {
                                            ** continue;
                                        }
                                        case 1505711376: {
                                            ** continue;
                                        }
                                        case 1505711374: {
                                            ** continue;
                                        }
                                        case 1505711373: {
                                            ** continue;
                                        }
                                        case 1505711375: 
                                    }
                                    throw null;
                                }
                            }
                            v0 /* !! */  = var2_2 /* !! */  = (CallSite)((X3.a(3194, 4036502877158684167L) * X3.a(17849, 7586115836538814442L) + X3.a(631, 4364112500100380724L) ^ X3.a(20178, 8305451310013772892L)) + X3.a(29882, 7904796347686112958L) ^ X3.a(20177, 6014351116369917005L));
                        }
                        if (!var1_1) ** GOTO lbl20
                    }
                    var2_2 /* !! */  = (CallSite)(X3.a(23251, 9033414296196309233L) * X3.a(3752, 5980410200527877185L) + X3.a(20288, 3959561447508735290L) + X3.a(13613, 7134627569426108284L));
                    if (!var1_1) ** GOTO lbl20
                }
                v1 /* !! */  = var2_2 /* !! */  = (CallSite)(X3.a(7594, 5588728803908429593L) - X3.a(2833, 4073838098253722029L) ^ X3.a(22027, 4043104671610399837L));
            }
            if (!var1_1) ** GOTO lbl20
        }
        var2_2 /* !! */  = (CallSite)((X3.a(430, 7055619022265367499L) ^ X3.a(14269, 4987691640651156983L)) + X3.a(26873, 6372192453212394132L) - X3.a(6536, 2260713210302702447L) ^ X3.a(9698, 9006379901142179704L));
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5816816964197735506L;
                var6_1 = new long[204];
                var3_2 = 0;
                var4_3 = "\u00adK\u00ca\u0095\u00f9\u00a2d\u0011\u0006\u00ceP\u00f7?f\u008efs\u0016\u00f3\u00b6\u0082\u009b\u00bd\u0086\u00b7yv\u00a5j\u00c2\u009a\u00a6'\u0097\u00cb\u00c8\u00acNv\u0083nO5\u00b5\u00b1\u0086\u00aa<\u00a7\u00f8\u000f\u00dc#\u0017cJ\u0003r\u0087\u00b1\u00e5\u00f5\u00f9\u00a9\u00d8k\u00ee\u0083}\u00a0cZ,N\u00da&Y\u0086\u009bZ\u00df\u00fdx\u00davlf\u0016\u00d7\u0082\u00f2\u00cb\u00d1D\u0091%W\u00cd\u00aa\u009d)qO]23jA\u008b1\u0098'\u009c\u00d4l\n\u00d37J\u00e9mO\\\u00e4A\u00bf\u00a3\u00eb\u00c0\u0083l\u0017\u00f0\u00b7\u00e0^;P8\u0093Mi\u00ef\u00e2\u00ff\u009d\u00f5\r3\t\u00ab\u00c3\u0018\u00cf\u00b9\u00e3e\u00a9P~\u00f8o\u000f\u00d9\u0094\u00b5\u009e\u009f\u0000k\u00a4Ii6\f\u0002WyE\u0099$ \u00b7\u00d4n1>z\u0004\u00bez\u0098\u008c\u00af\u00e0\u00009uS\u0089\u0097\u00e6\u00f7V\u00e8ZaQ*G\u008db\u00f2\u00ed\u00a6>\"Y\u001fN\u001d?W\u0095\u00bf\u00e0\u00a2\u008c\\\u0004\u00a6\u001a\u0099\u0084\u0010\u00f6\u00cb\u008cS\u00fb\u00b5\u00b2\u00c0Rh\u0081\u00d1U\u00a3\u00a1\u00c5\u0011%\u00b6+\u00d8,q{\u00a3<2f\u00c6\u0014\u00ee\u007f#\u0016\u0084\u009a\u00f5\u00dfG8\u000f<-U\u00d4T\u00fdp\u00da=\u00c6\u0005FN'\u00bdZ\u00aa\t\u00ee\u00c7u\u001ceu0;\u00cf\u00f6\u008c`\u00d9\u008fk\u00d6I\u0089|O\u0084\u009a\u00a2\u00d4\u001fM}]\u00a5\u00e2\u00ecN\u00b48%_\u0086\u00c4\u001b\u009a\u0091>\u00ba\\J\u008d\u009a\u00ea\u0017\u00d4\u0099\u0088\u0086tM^\u00cb\u0090<\b\u00ado\u0082\u001f\u00a56{\u00c4\u00d0\u00ed\u00f3\u00e6\u00ce\u00e3J\u00c6\u0092\u00a0\u00d5~\u00a24\u00fb\u00ad\u009f\u00c6\u00f2\u001bmQV$\u00cd\u00b2\u00bfC\u0089l/\u00e8\u00c9\u00b1\u0096z\u00b8.\u00a2\u009c\u0013\u001d\u009c\u00d8lK\u00be\u00fa\u008a\u00ac\u008e\u001c\u000b\bT`\u00ebXhy\u0094 \u00de\u009e\u00f4\u0016\u00b4+\u00fb/\u00f6\u00c9\u001f\u00d8\u00a4;#\u00c2d\u009eg\u0007\u0083\u0015B\u00b2\u00b6|\u001cY\u008e& \u00f0Rv\u00fbL\u0080'\u0013\u00ef\u0090aG\u0017W\u000e!l\u0091V\u00fb!\u0013\u00e0Y\u00f4\u00e9-_\t\u00bbO\u0004UM\u00d4\u00c48`[\u0084\u00e0's\\B\u001b\u0016\u00cd\u00eaJ=p\u00b0\u00b6,\u00ba\u0010=\u00db\u00b2T\u00daX%\u00bb\u00acx\u00106S\u0091\u00ac\u007f\u00c5L\u0089\u00ccQlQ\u0019P\u0019\u00ec\u008a\u00bc;\u008d\u00e1ug\u00da\u00bf\u00f0Y\u00bfm~\u00ea4\u00c2p\u00ef\u00ad\u00fdj\u00c8\u00a9\u00a7e\u00f5\u00a7\u00e9\u00f5\u00e6\t*Z\u00abh\u00d0S\u009e\u00b1=\u00b1\u00b8<\u001c\u00be,\fn\u00f1a1\u00c8i\u00c4v\u008b\\\u00da\u00fe\u00ec\u00ce#\u00b4z\u00cf>:,.\u00d0`\u00ed9\u000f\u0080\u000f\u00be\n[dV?\u00f9{\u000e\u009c\u0081\u00b7\u000bQ3^\u000f\u008eE\u00e2\u00d7\u00b5x\u00cbi\u0081\u0088<\\\u0004\u001f\u00c5n\u00d0\u0086mOT\r\u00c6r\u000f\u00f6\u0010\u008cIr\u001b\u00d8!Y\u0090\u00a6\u00b6\u00a9\u0088\u00bb\u00d21\u00e4\u00e7\u00e2,\u000e\u000f\u008dUJZ\u0081h{\u0003P\u00e2e\\\u0099\u00fc;\u00bek{$WH~\u00bfvS\u00cd\u00bfG\u001f\u0004\u00b5\u00b8\u0083(pp\u00b8\u00ab\u00ad\u00ebz\u00e2\u001e}\u00a6`!\u00ad\u00bd\u00e2b\u0001\u00e2DB]I\u00c0\u00d5\u00c7\u00eb\u00f3n\u00bb\u00c0\u00d8KXA96\u0017$\u00e1UAJ\u00aa\u0000\u00be\u0091\u00dfb\u00b4\u00a5\u00bb'\u00a6A\u0096\u00dfWi\\\u00f1\u0015A\r\u0006e\u00167\n\u00dd\u00c6\u00a7(\u00ce\u00f23\u00df\u000e3\u00d2t\u0004\u00124\u00ff\u0018\u008c\u0095\u0081\u00ff\u00b6S\"\u0019\u0002\u00aa\u00be\u0016\u00998\n\u00cd\u00a6\b&\u00c9d1\nf\u0003O$N\u00faGM\u000e\u008f\u0013}\u001dx\u00191S\u00c1^@\f|H}\u009d\u000e\\\u009e/\u00c7pe\u00fa\u009eRT\u00db\u00c3\u00dc\u0014R\u0001\u00a4^\u00b4\u00eeS\u00fbg 7\u00b7VA\u0095\u008c\u0087.WS\u009c1\u0096\u00c2\u0093 A-\u0094V\u0097\u000el\u00c9\u00a0d\u00fc\u0012\u00cc\r\u00a7\u00a6\u00e0\u0097GF\u001e\u0006-\u00c6\u00ca\u009c,S\u00f2\u009c7\u00eb\u001e\u00d2>\u0006/\u00b5Qg\u00bd\u000bj\u0006>\u008a\u00e3%z5\u0006\u00d4'B\u00d3\u0082S\u00863\u00fa\u00f8)\u00c9\u00e3\u0004\u0090).\u00bb\u0011a\u00d2\u009f\u00d90\u00eb\u0087\u00d4R\u00a0w\u0091\n\u001f)3\u00cb\u00f3?\u00e4-\u0006\u001e\u00cd\u0012\u00eb\u0084\u00be\u00a2\u001a\u0019\u0088\u0019\u0006\u0092{/\u00d4U\u00b6\u00fc\u0005\u0091;\u0096\u00ad\u000e\u00da\u008f,$\u0010#~c\u00de\u007fmxI\u00c9/\u00fe\u00c2\u0015\u00c6\u007f \u00a0\u00ff\u0016y;\u00e9\u008f\u00cc\n\u00f2qI\u0080B\u00fe\u008e\u0095\u00e9#\b1:\u00a8\u0016C\u000e\u00e1\u00d3$\u0003\u0091Z\u00b8\u00d3\u00deF!6lS8\u000f3\u00a3\u00ddp\u00d1\u000b\n\u00bb\u00bd\u000f8\u0001\u00b6\u0097\u00fe\u00a5\u00e7V\u00b3K\u00b7\u0011\u00c6\u00b4\u008c\u00e5\u009c\u00ddM\u00a8\u00a6\u00fa\u0088\u000b\u00dd\u008c\u0018\u00af\u0086\u009d\u00f3\u001af``\u00ba\u0093\u00e3\u00b8\u0001\u00f3\u00b47\u00c6\u00c2uXm\u0010\u00d7\u000f\u00f0~u\u00e2w\u00dc\b\u0005\u00b8\u0007\u009fD\u0002\u0016MZ\u00e9\u0017\u0016\u00bb\u00a8\u00c8szF\u00c42\u00dd$?\u00b4\u00f7\u008a>\u000el;\u008b\u00bb\u00eb\u00a0\u00abl\u009b\u00daR\u00a6\u00f2\u0014\u00c7\u00bd\u00eew\u0006!H\u008d\u0086l\u00f8\u001e\u0089d\u0005\u00ee\u00c5su\u00d8\u00bd\u0005\"k\u001f>\u0006R&\u0004\u00eaNv\u00c6\u0080\u00a9\u001c\u00deF\u008a\u00b15\u001a\u0015\u00c6\b~\u008ff\u00d5U\u00f0\u00e7\u000fK\u00a6\u0080\u0003\u00b3\u00f4\u001e?\u0011\u00d3\u00b3\u0017\u009d\u00eak\u00a2\u0080\u00d8\u00a1Z\u0015\u00eej^\u0088\u009d0\u00e7\u00eb\u00c2C\u008cH\u00f4iv\r\u007f\u0088\u00ad\u0005\u0011\u009ag\u001e\u00101\u00b9\u008c\u00a6\u00d0\u00d2\u007fM\u008d\u00c7\u0010r\u00bb\u009c\u00b4\u0015q\u0019\u00a7\u00d5\u0003[\u0013\u0095f\u0091\u00bd\u0098\u008a\u0000\u0010\u0010\u00c3\u001b\u00b9e(\u00dd@T\u00bc\u00df\u00f6\u00819\u0083I\u00bf\u001b~\u00aae\u00dfT\u00f1\u00c4g\u009fYN\u0092\u001e\u00e2\u00c2i\u00ec\u00d5\u00f3\u00a6\u00a1\u00e8\u0083\u00e1\u00a7n\u0099\u0085\u009e\u00ff\u0005]o\u00e1\rcJ\u008b\u00b6`\u00fdU\u0002\u0012\u0095D[\u001f\u0002G\u0080\u001ce\u00b4\u0087\u00d4l_\u00e9v\u00d6\u00f7\u00e9\u00f8h\u00ee\u008a]\u00d7Kx\u0087u\u00ecX1\u00cc2\u0001\u00c3\u00eaN\u00d68\u00ef\u00a8\u00f5W[\u00d6}t\u00db!,FU\u001d~=\u00ef\u0083\u00a4\u00e4\u00dd>P\u00f7\u009f#\u0087\u008e\u00fb\r\u00fd\u0089R\u00aei\u00b5i\u00ed\u0011z\u001a'\u0090!\u008c\u00a5\u0001\u00bd\u00d7\u001e\u0096k\u00dc\u0018\u00d6\u00fd\u000e+\n\t|\u00a8s\u001f\u00ec\u00d9\u00dc\u008b)!\u00bb4\u0091\u00fa\u0014\u0019\u009f\u0004J\u0015\u00ba\u0097\u00c6)\u000445\u008d\u00d7VQ\u0095\u00dd\u001cR\u0084\u0006\u00ad\u000e\u00c0OQ\u0097F\u00b6\u00e7zx\u0002\u0095:sk\u0003\u00e8\u00e0\u00b1\u00c9ev\u00b9\u00e1\u00d0\u00b9\u00da\u00b9\u0098\u00c1[\u0092\u009eo\u0011$=\u008f\u0098 \u007f\u00eb\u00ff\u0099Rc'\u008e\u00edGdhi0 ft\u00a1Kd\u008a\u00ab#Jx\u0005\u00e5%\u00ed\b\u00beD\u00d9(\tE\u00e8<\u00d8\u0002u\u00fe5\u00bc\u00ac\u00ff`\u009eBG\u00d3@\u00dfm\u009a\u00a9&\u0016\u00df2\u00c6|b|\u00ac";
                var5_4 = "\u00adK\u00ca\u0095\u00f9\u00a2d\u0011\u0006\u00ceP\u00f7?f\u008efs\u0016\u00f3\u00b6\u0082\u009b\u00bd\u0086\u00b7yv\u00a5j\u00c2\u009a\u00a6'\u0097\u00cb\u00c8\u00acNv\u0083nO5\u00b5\u00b1\u0086\u00aa<\u00a7\u00f8\u000f\u00dc#\u0017cJ\u0003r\u0087\u00b1\u00e5\u00f5\u00f9\u00a9\u00d8k\u00ee\u0083}\u00a0cZ,N\u00da&Y\u0086\u009bZ\u00df\u00fdx\u00davlf\u0016\u00d7\u0082\u00f2\u00cb\u00d1D\u0091%W\u00cd\u00aa\u009d)qO]23jA\u008b1\u0098'\u009c\u00d4l\n\u00d37J\u00e9mO\\\u00e4A\u00bf\u00a3\u00eb\u00c0\u0083l\u0017\u00f0\u00b7\u00e0^;P8\u0093Mi\u00ef\u00e2\u00ff\u009d\u00f5\r3\t\u00ab\u00c3\u0018\u00cf\u00b9\u00e3e\u00a9P~\u00f8o\u000f\u00d9\u0094\u00b5\u009e\u009f\u0000k\u00a4Ii6\f\u0002WyE\u0099$ \u00b7\u00d4n1>z\u0004\u00bez\u0098\u008c\u00af\u00e0\u00009uS\u0089\u0097\u00e6\u00f7V\u00e8ZaQ*G\u008db\u00f2\u00ed\u00a6>\"Y\u001fN\u001d?W\u0095\u00bf\u00e0\u00a2\u008c\\\u0004\u00a6\u001a\u0099\u0084\u0010\u00f6\u00cb\u008cS\u00fb\u00b5\u00b2\u00c0Rh\u0081\u00d1U\u00a3\u00a1\u00c5\u0011%\u00b6+\u00d8,q{\u00a3<2f\u00c6\u0014\u00ee\u007f#\u0016\u0084\u009a\u00f5\u00dfG8\u000f<-U\u00d4T\u00fdp\u00da=\u00c6\u0005FN'\u00bdZ\u00aa\t\u00ee\u00c7u\u001ceu0;\u00cf\u00f6\u008c`\u00d9\u008fk\u00d6I\u0089|O\u0084\u009a\u00a2\u00d4\u001fM}]\u00a5\u00e2\u00ecN\u00b48%_\u0086\u00c4\u001b\u009a\u0091>\u00ba\\J\u008d\u009a\u00ea\u0017\u00d4\u0099\u0088\u0086tM^\u00cb\u0090<\b\u00ado\u0082\u001f\u00a56{\u00c4\u00d0\u00ed\u00f3\u00e6\u00ce\u00e3J\u00c6\u0092\u00a0\u00d5~\u00a24\u00fb\u00ad\u009f\u00c6\u00f2\u001bmQV$\u00cd\u00b2\u00bfC\u0089l/\u00e8\u00c9\u00b1\u0096z\u00b8.\u00a2\u009c\u0013\u001d\u009c\u00d8lK\u00be\u00fa\u008a\u00ac\u008e\u001c\u000b\bT`\u00ebXhy\u0094 \u00de\u009e\u00f4\u0016\u00b4+\u00fb/\u00f6\u00c9\u001f\u00d8\u00a4;#\u00c2d\u009eg\u0007\u0083\u0015B\u00b2\u00b6|\u001cY\u008e& \u00f0Rv\u00fbL\u0080'\u0013\u00ef\u0090aG\u0017W\u000e!l\u0091V\u00fb!\u0013\u00e0Y\u00f4\u00e9-_\t\u00bbO\u0004UM\u00d4\u00c48`[\u0084\u00e0's\\B\u001b\u0016\u00cd\u00eaJ=p\u00b0\u00b6,\u00ba\u0010=\u00db\u00b2T\u00daX%\u00bb\u00acx\u00106S\u0091\u00ac\u007f\u00c5L\u0089\u00ccQlQ\u0019P\u0019\u00ec\u008a\u00bc;\u008d\u00e1ug\u00da\u00bf\u00f0Y\u00bfm~\u00ea4\u00c2p\u00ef\u00ad\u00fdj\u00c8\u00a9\u00a7e\u00f5\u00a7\u00e9\u00f5\u00e6\t*Z\u00abh\u00d0S\u009e\u00b1=\u00b1\u00b8<\u001c\u00be,\fn\u00f1a1\u00c8i\u00c4v\u008b\\\u00da\u00fe\u00ec\u00ce#\u00b4z\u00cf>:,.\u00d0`\u00ed9\u000f\u0080\u000f\u00be\n[dV?\u00f9{\u000e\u009c\u0081\u00b7\u000bQ3^\u000f\u008eE\u00e2\u00d7\u00b5x\u00cbi\u0081\u0088<\\\u0004\u001f\u00c5n\u00d0\u0086mOT\r\u00c6r\u000f\u00f6\u0010\u008cIr\u001b\u00d8!Y\u0090\u00a6\u00b6\u00a9\u0088\u00bb\u00d21\u00e4\u00e7\u00e2,\u000e\u000f\u008dUJZ\u0081h{\u0003P\u00e2e\\\u0099\u00fc;\u00bek{$WH~\u00bfvS\u00cd\u00bfG\u001f\u0004\u00b5\u00b8\u0083(pp\u00b8\u00ab\u00ad\u00ebz\u00e2\u001e}\u00a6`!\u00ad\u00bd\u00e2b\u0001\u00e2DB]I\u00c0\u00d5\u00c7\u00eb\u00f3n\u00bb\u00c0\u00d8KXA96\u0017$\u00e1UAJ\u00aa\u0000\u00be\u0091\u00dfb\u00b4\u00a5\u00bb'\u00a6A\u0096\u00dfWi\\\u00f1\u0015A\r\u0006e\u00167\n\u00dd\u00c6\u00a7(\u00ce\u00f23\u00df\u000e3\u00d2t\u0004\u00124\u00ff\u0018\u008c\u0095\u0081\u00ff\u00b6S\"\u0019\u0002\u00aa\u00be\u0016\u00998\n\u00cd\u00a6\b&\u00c9d1\nf\u0003O$N\u00faGM\u000e\u008f\u0013}\u001dx\u00191S\u00c1^@\f|H}\u009d\u000e\\\u009e/\u00c7pe\u00fa\u009eRT\u00db\u00c3\u00dc\u0014R\u0001\u00a4^\u00b4\u00eeS\u00fbg 7\u00b7VA\u0095\u008c\u0087.WS\u009c1\u0096\u00c2\u0093 A-\u0094V\u0097\u000el\u00c9\u00a0d\u00fc\u0012\u00cc\r\u00a7\u00a6\u00e0\u0097GF\u001e\u0006-\u00c6\u00ca\u009c,S\u00f2\u009c7\u00eb\u001e\u00d2>\u0006/\u00b5Qg\u00bd\u000bj\u0006>\u008a\u00e3%z5\u0006\u00d4'B\u00d3\u0082S\u00863\u00fa\u00f8)\u00c9\u00e3\u0004\u0090).\u00bb\u0011a\u00d2\u009f\u00d90\u00eb\u0087\u00d4R\u00a0w\u0091\n\u001f)3\u00cb\u00f3?\u00e4-\u0006\u001e\u00cd\u0012\u00eb\u0084\u00be\u00a2\u001a\u0019\u0088\u0019\u0006\u0092{/\u00d4U\u00b6\u00fc\u0005\u0091;\u0096\u00ad\u000e\u00da\u008f,$\u0010#~c\u00de\u007fmxI\u00c9/\u00fe\u00c2\u0015\u00c6\u007f \u00a0\u00ff\u0016y;\u00e9\u008f\u00cc\n\u00f2qI\u0080B\u00fe\u008e\u0095\u00e9#\b1:\u00a8\u0016C\u000e\u00e1\u00d3$\u0003\u0091Z\u00b8\u00d3\u00deF!6lS8\u000f3\u00a3\u00ddp\u00d1\u000b\n\u00bb\u00bd\u000f8\u0001\u00b6\u0097\u00fe\u00a5\u00e7V\u00b3K\u00b7\u0011\u00c6\u00b4\u008c\u00e5\u009c\u00ddM\u00a8\u00a6\u00fa\u0088\u000b\u00dd\u008c\u0018\u00af\u0086\u009d\u00f3\u001af``\u00ba\u0093\u00e3\u00b8\u0001\u00f3\u00b47\u00c6\u00c2uXm\u0010\u00d7\u000f\u00f0~u\u00e2w\u00dc\b\u0005\u00b8\u0007\u009fD\u0002\u0016MZ\u00e9\u0017\u0016\u00bb\u00a8\u00c8szF\u00c42\u00dd$?\u00b4\u00f7\u008a>\u000el;\u008b\u00bb\u00eb\u00a0\u00abl\u009b\u00daR\u00a6\u00f2\u0014\u00c7\u00bd\u00eew\u0006!H\u008d\u0086l\u00f8\u001e\u0089d\u0005\u00ee\u00c5su\u00d8\u00bd\u0005\"k\u001f>\u0006R&\u0004\u00eaNv\u00c6\u0080\u00a9\u001c\u00deF\u008a\u00b15\u001a\u0015\u00c6\b~\u008ff\u00d5U\u00f0\u00e7\u000fK\u00a6\u0080\u0003\u00b3\u00f4\u001e?\u0011\u00d3\u00b3\u0017\u009d\u00eak\u00a2\u0080\u00d8\u00a1Z\u0015\u00eej^\u0088\u009d0\u00e7\u00eb\u00c2C\u008cH\u00f4iv\r\u007f\u0088\u00ad\u0005\u0011\u009ag\u001e\u00101\u00b9\u008c\u00a6\u00d0\u00d2\u007fM\u008d\u00c7\u0010r\u00bb\u009c\u00b4\u0015q\u0019\u00a7\u00d5\u0003[\u0013\u0095f\u0091\u00bd\u0098\u008a\u0000\u0010\u0010\u00c3\u001b\u00b9e(\u00dd@T\u00bc\u00df\u00f6\u00819\u0083I\u00bf\u001b~\u00aae\u00dfT\u00f1\u00c4g\u009fYN\u0092\u001e\u00e2\u00c2i\u00ec\u00d5\u00f3\u00a6\u00a1\u00e8\u0083\u00e1\u00a7n\u0099\u0085\u009e\u00ff\u0005]o\u00e1\rcJ\u008b\u00b6`\u00fdU\u0002\u0012\u0095D[\u001f\u0002G\u0080\u001ce\u00b4\u0087\u00d4l_\u00e9v\u00d6\u00f7\u00e9\u00f8h\u00ee\u008a]\u00d7Kx\u0087u\u00ecX1\u00cc2\u0001\u00c3\u00eaN\u00d68\u00ef\u00a8\u00f5W[\u00d6}t\u00db!,FU\u001d~=\u00ef\u0083\u00a4\u00e4\u00dd>P\u00f7\u009f#\u0087\u008e\u00fb\r\u00fd\u0089R\u00aei\u00b5i\u00ed\u0011z\u001a'\u0090!\u008c\u00a5\u0001\u00bd\u00d7\u001e\u0096k\u00dc\u0018\u00d6\u00fd\u000e+\n\t|\u00a8s\u001f\u00ec\u00d9\u00dc\u008b)!\u00bb4\u0091\u00fa\u0014\u0019\u009f\u0004J\u0015\u00ba\u0097\u00c6)\u000445\u008d\u00d7VQ\u0095\u00dd\u001cR\u0084\u0006\u00ad\u000e\u00c0OQ\u0097F\u00b6\u00e7zx\u0002\u0095:sk\u0003\u00e8\u00e0\u00b1\u00c9ev\u00b9\u00e1\u00d0\u00b9\u00da\u00b9\u0098\u00c1[\u0092\u009eo\u0011$=\u008f\u0098 \u007f\u00eb\u00ff\u0099Rc'\u008e\u00edGdhi0 ft\u00a1Kd\u008a\u00ab#Jx\u0005\u00e5%\u00ed\b\u00beD\u00d9(\tE\u00e8<\u00d8\u0002u\u00fe5\u00bc\u00ac\u00ff`\u009eBG\u00d3@\u00dfm\u009a\u00a9&\u0016\u00df2\u00c6|b|\u00ac".length();
                X3.n(true);
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00c6\u0002\u00dc\u00c3\u00844k\u00b4\u00c5\u00dcU\u009e\u00d3i\u00ab\f";
                    var5_4 = "\u00c6\u0002\u00dc\u00c3\u00844k\u00b4\u00c5\u00dcU\u009e\u00d3i\u00ab\f".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl39:
                // 1 sources

                ** continue;
            }
        }
        X3.a = var6_1;
        X3.b = new Integer[204];
        hi.a("\u00d2", (int)-1, (long)513376909200157754L);
    }

    public static boolean Y(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        return (boolean)hi.a("\u00a5", (Object)predicate, (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1175532240973568599L), (long)1216458259878311960L);
    }

    public static boolean V(Predicate<ItemStack> predicate) {
        return (boolean)hi.a("\u00a5", predicate, (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1062363401682879978L), (long)1216458259878311960L);
    }

    public static lz F(Item ... itemArray) {
        return hi.a("G", (Object)new Object[]{arg_0 -> X3.lambda$find$0(itemArray, arg_0)}, (long)402614237701564139L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static lz b(Predicate<ItemStack> var0, int var1_1, int var2_2) {
        block21: {
            block24: {
                block23: {
                    block22: {
                        var3_3 = Dl.S();
                        var9_4 /* !! */  = (X3.a(21881, 8472337968184848245L) - X3.a(1021, 6925286671546497425L) + X3.a(21923, 948564057236041701L) ^ X3.a(8276, 7522694364253067835L)) - X3.a(16660, 1552129759138347915L);
                        if (!var3_3) ** GOTO lbl-1000
                        v0 = var9_4 /* !! */ ;
                        if (!var3_3) break block22;
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var4_5 = -1;
                                var5_6 = 0;
                                var6_7 = 0;
                                var7_8 = var1_1;
                                if (var3_3) break block23;
                                break block24;
                            }
                            case 823183254: {
                                hi.a("G", (long)740307216543007282L);
                                v0 = 0;
                            }
                        }
                    }
                    hi.a("G", (int)v0, (boolean)true, (long)1190895299724682476L);
                    return null;
                }
                var9_4 /* !! */  = (int)(hi.a("G", (int)(X3.a(12250, 3719717005574018461L) / X3.a(16859, 126404403749813181L) * X3.a(2583, 2724070988785430552L)), (int)X3.a(21421, 5277439075552651769L), (long)834203424483934088L) / X3.a(620, 5056191009602058316L) + X3.a(27795, 9049382385505359494L));
                if (var3_3) break block21;
                ** GOTO lbl31
            }
lbl26:
            // 2 sources

            while (true) {
                block26: {
                    block25: {
                        v1 = var7_8;
                        v2 = var2_2;
                        if (!var3_3) break block25;
                        if (v1 <= v2) break block26;
lbl31:
                        // 2 sources

                        v1 = X3.a(3269, 8280441570492724897L) * X3.a(30822, 3611835107829826064L);
                        v2 = X3.a(23099, 4439537033759252635L);
                    }
                    var9_4 /* !! */  = v1 ^ v2;
                    if (var3_3) break block21;
                }
                var9_4 /* !! */  = X3.a(20738, 6996591414672878519L) * X3.a(5387, 7997896752313511701L) + X3.a(10174, 8840077152001105244L);
                break block21;
                break;
            }
lbl39:
            // 2 sources

            while (true) {
                var5_6 += hi.a("\u00a5", (Object)var8_9, (long)1254473531759764347L);
                var6_7 += hi.a("\u00a5", (Object)var8_9, (long)1262789791163377495L);
                if (var3_3) ** GOTO lbl104
lbl43:
                // 2 sources

                while (true) {
                    ++var7_8;
                    if (!var3_3) {
                        return new lz(var4_5, var5_6, var6_7);
                    }
                    ** GOTO lbl106
                    break;
                }
                break;
            }
        }
        block17: while (true) {
            block27: {
                switch (var9_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 172415260: {
                        var8_9 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (int)var7_8, (long)449627806291078247L);
                        v3 /* !! */  = hi.a("\u00a5", var0, (Object)var8_9, (long)1216458259878311960L);
                        if (!var3_3) ** GOTO lbl66
                        if (v3 /* !! */  == false) ** GOTO lbl65
                        ** GOTO lbl68
                    }
                    case 172415261: {
                        hi.a("G", (int)-1, (int)0, (int)X3.a(31722, 4999156409948553581L), (long)1066719768155535037L);
                        hi.a("G", (long)785752490276612505L);
                        var9_4 /* !! */  = (hi.a("G", (int)X3.a(8054, 2470915630031906104L), (int)X3.a(15116, 4095530992673620408L), (long)834203424483934088L) + X3.a(13392, 6609648576090443354L) ^ X3.a(5346, 8787213488034623122L)) * X3.a(28627, 8738653156410906077L) - X3.a(2418, 7359366306840884066L);
                        continue block17;
                    }
lbl65:
                    // 1 sources

                    v3 /* !! */  = (CallSite)((hi.a("G", (int)X3.a(22759, 8245102036210082417L), (int)X3.a(23708, 5360284310245729811L), (long)834203424483934088L) / X3.a(13198, 3641486462678305164L) + X3.a(14202, 1392482826216476107L)) * X3.a(28624, 2290728473696359899L) ^ X3.a(10635, 8843461461426606887L));
lbl66:
                    // 2 sources

                    var9_4 /* !! */  = (int)v3 /* !! */ ;
                    if (var3_3) break block27;
lbl68:
                    // 2 sources

                    var9_4 /* !! */  = X3.a(14034, 4988950207050419410L) + X3.a(5060, 6275836719745247602L) - X3.a(27654, 2980491738645124718L);
                    if (var3_3) break block27;
                    ** GOTO lbl93
                    case 172415262: 
                }
                return new lz(var4_5, var5_6, var6_7);
            }
            do lbl-1000:
            // 5 sources

            {
                block30: {
                    block29: {
                        block28: {
                            switch (var9_4 /* !! */ ) {
                                default: {
                                    v4 = var4_5;
                                    v5 = -1;
                                    if (!var3_3) break block28;
                                    if (v4 != v5) break;
                                    break block29;
                                }
                                case -765070439: {
                                    var4_5 = var7_8;
                                    if (var3_3) break block30;
                                    ** GOTO lbl39
                                }
                                case -765070442: {
                                    ** continue;
                                }
                                case -765070441: {
                                    ** continue;
                                }
                                case -765070443: {
                                    throw null;
                                }
                            }
lbl93:
                            // 2 sources

                            v4 = ((X3.a(26603, 3451021068732521954L) ^ X3.a(7016, 6292801501414597088L)) - X3.a(25692, 3951113323393310228L)) / X3.a(7408, 9087811014057436871L) ^ X3.a(9657, 6974757021188333511L);
                            v5 = X3.a(18602, 7566426516146025113L);
                        }
                        var9_4 /* !! */  = v4 - v5;
                        if (var3_3) ** GOTO lbl-1000
                    }
                    var9_4 /* !! */  = (int)(X3.m("rJpyM87F77rb2wFl", max(int int ), (int)(X3.a(14332, 4609687573555252591L) / 5 + X3.a(2350, 1789811147038798644L)), (int)X3.a(7104, 8380788980138123596L)) - X3.a(15177, 5041126398966071642L));
                    if (var3_3) ** GOTO lbl-1000
                }
                var9_4 /* !! */  = (((X3.a(20939, 295687941265451934L) ^ X3.a(25634, 2596735357897399917L)) - X3.a(4854, 5259654241403414727L)) / X3.a(8947, 2261024698221959261L) ^ X3.a(27829, 5865332282943690397L)) - X3.a(8408, 2957015620013071049L);
                if (var3_3) ** GOTO lbl-1000
lbl104:
                // 2 sources

                var9_4 /* !! */  = (hi.a("G", (int)X3.a(8411, 3989041246006778609L), (int)X3.a(23828, 418791403733706673L), (long)834203424483934088L) / X3.a(13198, 3641486462678305164L) + X3.a(1967, 2008705903053422052L)) * X3.a(5893, 6747883352354074047L) ^ X3.a(6109, 7181614084480412990L);
            } while (var3_3);
lbl106:
            // 2 sources

            var9_4 /* !! */  = (int)(hi.a("G", (int)(X3.a(9790, 9019050826741881907L) / X3.a(15077, 7106013966413955237L) * X3.a(26894, 72813162016887599L)), (int)X3.a(8832, 8786626470096738437L), (long)834203424483934088L) / X3.a(23813, 3981730119140861818L) + X3.a(30425, 9031030961161915514L));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void u() {
        block14: {
            block12: {
                block13: {
                    block11: {
                        block16: {
                            block15: {
                                var0 = Dl.S();
                                var1_1 /* !! */  = X3.a(6903, 7283738901219352817L) / X3.a(15077, 7106013966413955237L) * X3.a(2052, 609412552505307737L) * X3.a(8063, 4064352488964728166L) + X3.a(26592, 4819470688456367613L);
                                if (var0) break block15;
lbl4:
                                // 2 sources

                                while (hi.a("j", (long)606262548384095845L) != null) {
                                    break block11;
                                }
                                break block16;
lbl7:
                                // 1 sources

                                while (true) {
                                    v0 /* !! */  = ((CallSite)hi.a("j", (long)606262548384095845L)).length;
                                    v1 = 2;
                                    if (!var0) break block12;
                                    if (v0 /* !! */  >= v1) break block13;
                                    break block14;
                                    break;
                                }
lbl13:
                                // 1 sources

                                return;
lbl15:
                                // 1 sources

                                while (true) {
                                    X3.m("rJpyM87F77rb2wFl", E(int int int ), (int)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)922837473480332621L), (long)758229236411088228L), (int)hi.a("j", (long)606262548384095845L)[0], (int)hi.a("j", (long)606262548384095845L)[1]);
                                    return;
                                }
                            }
lbl19:
                            // 5 sources

                            while (true) {
                                switch (var1_1 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl4
                                    }
                                    case 785638749: {
                                        ** continue;
                                    }
                                    case 785638752: {
                                        ** continue;
                                    }
                                    case 785638750: {
                                        ** continue;
                                    }
                                    case 785638751: 
                                }
                                X3.m("rJpyM87F77rb2wFl", R());
                                var1_1 /* !! */  = (int)((hi.a("G", (int)X3.a(2808, 1045671633071255622L), (int)X3.a(18051, 5876617169661820071L), (long)834203424483934088L) + X3.a(17349, 8895711794441320884L) - X3.a(27426, 1020443279494304168L)) / X3.a(23813, 3981730119140861818L) + X3.a(6930, 7707154085273149829L));
                                if (var0) continue;
                                break;
                            }
                        }
                        var1_1 /* !! */  = hi.a("G", (int)X3.a(13051, 8226295013825743034L), (int)X3.a(29362, 8097093443466741963L), (long)834203424483934088L) - X3.a(14774, 5324655842203009932L) ^ X3.a(17111, 4711460884797978856L);
                        if (var0) ** GOTO lbl19
                    }
                    var1_1 /* !! */  = X3.m("rJpyM87F77rb2wFl", max(int int ), (int)X3.a(32400, 4482207119750874114L), (int)X3.a(20615, 2571986624489122322L)) - X3.a(15359, 6842224111679537431L) ^ X3.a(25678, 7651414929000586954L);
                    if (var0) ** GOTO lbl19
                }
                v0 /* !! */  = (int)hi.a("G", (int)X3.a(14876, 6492267828253327430L), (int)X3.a(21998, 2046148153366605718L), (long)834203424483934088L);
                v1 = X3.a(25227, 845716055621425168L);
            }
            var1_1 /* !! */  = v0 /* !! */  - v1;
            if (var0) ** GOTO lbl19
        }
        var1_1 /* !! */  = hi.a("G", (int)X3.a(11085, 702599097481302489L), (int)X3.a(20932, 4674291501788359533L), (long)834203424483934088L) - X3.a(32474, 8595109825242711267L) ^ X3.a(5885, 607255984282512509L);
        ** while (true)
    }

    public static lz q(Item ... itemArray) {
        return hi.a("G", arg_0 -> X3.lambda$findInHotbar$0(itemArray, arg_0), (long)597481681569354723L);
    }

    public static lz J(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        return hi.a("G", (Object)predicate, (int)0, (int)X3.m("rJpyM87F77rb2wFl", getContainerSize(), (Inventory)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L)), (long)1093708157891199069L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void j(int var0) {
        block13: {
            block12: {
                block11: {
                    var1_1 = Dl.t();
                    var4_2 = (hi.a("G", (int)X3.a(26715, 6727366916403188474L), (int)X3.a(12877, 6006075157296253038L), (long)834203424483934088L) - X3.a(8343, 2187753830686366248L) ^ X3.a(10083, 1385065896955321674L)) * X3.a(30841, 8610950537722315516L) - X3.a(24826, 4684589301618629316L);
                    if (var1_1) ** GOTO lbl-1000
                    v0 = var4_2;
                    if (var1_1) ** GOTO lbl9
                    switch (v0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            v0 = var0;
lbl9:
                            // 2 sources

                            var2_3 = v0;
                            v1 = var0;
                            v2 = X3.a(15311, 5075164761441304959L);
                            if (var1_1) break block11;
                            if (v1 >= v2) break;
                            break block12;
                        }
                        case 1518393806: {
                            throw null;
                        }
                    }
                    v1 = X3.a(24973, 49837870197300022L) + X3.a(29103, 1620741455284030404L);
                    v2 = X3.a(18251, 8953093649385684239L);
                }
                var4_2 = v1 + v2;
                if (!var1_1) break block13;
            }
            var4_2 = X3.a(637, 2777676502693755126L) / X3.a(8947, 2261024698221959261L) / 5 - X3.a(15837, 1547670671998781421L);
            if (!var1_1) break block13;
            ** GOTO lbl51
lbl27:
            // 2 sources

            while (true) {
                v3 = var0;
                v4 = X3.a(5480, 8077321286148370196L);
                if (var1_1) ** GOTO lbl55
                if (v3 != v4) ** GOTO lbl53
                ** GOTO lbl57
                break;
            }
        }
        block10: while (true) {
            switch (var4_2) {
                default: {
                    var2_3 += 36;
                    if (!var1_1) ** GOTO lbl51
                    ** GOTO lbl27
                }
                case 2106145479: {
                    ** continue;
                }
                case 2106145477: {
                    var2_3 = X3.a(4379, 6051514210610719638L);
                    if (!var1_1) ** GOTO lbl59
                    ** GOTO lbl-1000
                }
                case 2106145481: lbl-1000:
                // 2 sources

                {
                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (long)588501882833882098L);
                    hi.a("G", (int)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)922837473480332621L), (long)758229236411088228L), (int)var2_3, (int)var3_4, (long)1066719768155535037L);
                    hi.a("\u00d2", (int[])new int[]{var2_3, (int)var3_4}, (long)606262548384095845L);
                    return;
                }
lbl51:
                // 2 sources

                var4_2 = (X3.a(17832, 3116024815459270623L) - X3.a(20212, 8090319067806037165L)) / X3.a(15077, 7106013966413955237L) * X3.a(23481, 666143200017473881L) + X3.a(21226, 4023942681229781150L) ^ X3.a(6007, 1015422014955302385L);
                if (!var1_1) continue block10;
lbl53:
                // 2 sources

                v3 = (X3.a(14125, 7473775340225858949L) - X3.a(30932, 4543536454943294163L)) / X3.a(15077, 7106013966413955237L) * X3.a(8560, 4588313556367547159L) + X3.a(28574, 9004216530037986741L);
                v4 = X3.a(27575, 2864794782711599572L);
lbl55:
                // 2 sources

                var4_2 = v3 ^ v4;
                if (!var1_1) continue block10;
lbl57:
                // 2 sources

                var4_2 = hi.a("G", (int)X3.a(17903, 7834509341824745459L), (int)X3.a(20066, 8796414015351223390L), (long)834203424483934088L) ^ X3.a(26056, 5279518594705842172L);
                if (!var1_1) continue block10;
lbl59:
                // 2 sources

                var4_2 = (X3.a(14125, 7473775340225858949L) - X3.a(30932, 4543536454943294163L)) / X3.a(15077, 7106013966413955237L) * X3.a(8560, 4588313556367547159L) + X3.a(28574, 9004216530037986741L) ^ X3.a(27575, 2864794782711599572L);
                continue block10;
                case 2106145478: 
            }
            break;
        }
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

    private static boolean lambda$findInHotbar$0(Item[] itemArray, ItemStack itemStack) {
        Item[] itemArray2 = itemArray;
        boolean bl = Dl.S();
        int n = itemArray2.length;
        int n2 = 0;
        while (n2 < n) {
            Item item = itemArray2[n2];
            if (bl) {
                if (hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) == item) {
                    return true;
                }
                ++n2;
            }
            if (bl) continue;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void l() {
        int n = (X3.a(9347, 5857673993821560469L) ^ X3.a(27855, 7393695475384342112L) ^ X3.a(32151, 92948192283609004L) ^ X3.a(13722, 8131682558700162991L)) / X3.a(15077, 7106013966413955237L) - X3.a(16716, 2834531784795126763L);
        block5: while (true) {
            switch (n) {
                default: {
                    if (hi.a("j", (long)513376909200157754L) != -1) break;
                    n = (X3.a(1860, 2509027293339860398L) - X3.a(2095, 4935921664149729821L) - X3.a(24068, 2835413994256262149L) - X3.a(1250, 498377376183533126L)) / X3.a(23813, 3981730119140861818L) ^ X3.a(21072, 748810352820414641L);
                    continue block5;
                }
                case 759848849: {
                    return;
                }
                case 759848851: {
                    hi.a("G", (int)hi.a("j", (long)513376909200157754L), (boolean)false, (long)541412231224622628L);
                    hi.a("\u00d2", (int)-1, (long)513376909200157754L);
                    return;
                }
                case 759848848: {
                    hi.a("G", (long)1217681287799928622L);
                    hi.a("G", (int)X3.a(13198, 3641486462678305164L), (int)-1, (long)656208795491924261L);
                    n = (X3.a(1958, 1503888141972061496L) / 2 - X3.a(9898, 8381308906805861508L)) * X3.a(10547, 5275124197663314777L) / X3.a(1158, 3027315771849915947L) ^ X3.a(17121, 777648023577032714L);
                    continue block5;
                }
            }
            n = X3.a(19152, 7003497796767805602L) * X3.a(22422, 2262243090823507374L) - X3.a(21951, 3654736248417939396L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void C(int n, boolean bl) {
        int n2 = X3.a(30404, 6272337341692136656L) * X3.a(7053, 5765844757952897343L) ^ X3.a(22663, 927255828454925017L) ^ X3.a(2014, 6882947961242762554L);
        block11: while (true) {
            Object object;
            block19: {
                block18: {
                    block17: {
                        block16: {
                            switch (object) {
                                default: {
                                    if (n == X3.a(3700, 6957192288547746817L)) break;
                                    object = X3.a(2259, 4140152364790297201L) + X3.a(6034, 853556040946625925L) - X3.a(17700, 7681489310783405898L) - X3.a(15589, 470020609586071209L) + X3.a(23264, 2368125801211945081L);
                                    continue block11;
                                }
                                case 619457929: {
                                    if (hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (long)588501882833882098L) == n) {
                                        object = X3.a(12883, 6970320653308135672L) * X3.a(28090, 9070808383246391287L) - X3.a(28922, 4349818147770583619L);
                                        continue block11;
                                    }
                                    break block16;
                                }
                                case 619457922: {
                                    return;
                                }
                                case 619457925: {
                                    if (bl) {
                                        object = X3.m("rJpyM87F77rb2wFl", max(int int ), (int)(X3.a(29301, 9112466645706557565L) - X3.a(20632, 117103982036347442L) + X3.a(29140, 2423825854901504925L)), (int)X3.a(15366, 8857012489135523361L)) / X3.a(26204, 7467143441487387883L) + X3.a(17647, 6665305618395266716L);
                                        continue block11;
                                    }
                                    break block17;
                                }
                                case 619457924: {
                                    if (hi.a("j", (long)513376909200157754L) == -1) {
                                        object = (X3.m("rJpyM87F77rb2wFl", max(int int ), (int)(X3.a(1776, 7853512502358981745L) ^ X3.a(23506, 3414733385569690048L)), (int)X3.a(6972, 8366994229468340652L)) ^ X3.a(9345, 3185612241360592538L)) / X3.a(6341, 7313503331393413786L) + X3.a(8227, 1771851716418968076L);
                                        continue block11;
                                    }
                                    break block18;
                                }
                                case 619457927: {
                                    hi.a("\u00d2", (int)X3.m("rJpyM87F77rb2wFl", getSelectedSlot(), (Inventory)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L)), (long)513376909200157754L);
                                    object = hi.a("G", (int)X3.a(1960, 8820607157415689643L), (int)X3.a(16577, 2640842269159586428L), (long)834203424483934088L) - X3.a(24772, 7254228748786260653L);
                                    continue block11;
                                }
                                case 619457926: {
                                    if (!bl) {
                                        object = X3.a(13167, 1067798660857596242L) * X3.a(25844, 1109415602075131510L) * X3.a(25382, 4820531936346822982L) - X3.a(15966, 4635299634885821454L) ^ X3.a(7871, 125484457024660708L);
                                        continue block11;
                                    }
                                    break block19;
                                }
                                case 619457930: {
                                    hi.a("\u00d2", (int)-1, (long)513376909200157754L);
                                    object = X3.m("rJpyM87F77rb2wFl", max(int int ), (int)X3.a(14763, 245859814938182652L), (int)X3.a(1952, 8568333888053689793L)) - X3.a(29069, 8701318228201425813L);
                                    continue block11;
                                }
                                case 619457928: {
                                    hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (int)n, (long)834003343560719361L);
                                    return;
                                }
                                case 619457923: {
                                    hi.a("G", (long)373721845012904719L);
                                    hi.a("G", (float)0.5f, (long)671146500863747464L);
                                    return;
                                }
                            }
                            object = X3.a(11076, 5524007298172228053L) * X3.a(8511, 4937478439568677799L) - X3.a(23103, 8248022622141571254L);
                            continue;
                        }
                        object = X3.m("rJpyM87F77rb2wFl", max(int int ), (int)X3.a(12469, 4029324888965122713L), (int)X3.a(182, 570169637500533395L)) + X3.a(13639, 5397057211389284101L);
                        continue;
                    }
                    object = hi.a("G", (int)X3.a(14678, 8674604684709954483L), (int)X3.a(17399, 6390904003995269393L), (long)834203424483934088L) * X3.a(7973, 6613495378242086265L) ^ X3.a(10117, 7954294548143021504L);
                    continue;
                }
                object = hi.a("G", (int)X3.a(16579, 5605861563980741221L), (int)X3.a(31595, 3174829767685226868L), (long)834203424483934088L) * X3.a(7092, 5441334439080010198L) ^ X3.a(1984, 3487918592531152365L);
                continue;
            }
            object = X3.m("rJpyM87F77rb2wFl", max(int int ), (int)X3.a(14763, 245859814938182652L), (int)X3.a(1952, 8568333888053689793L)) - X3.a(29069, 8701318228201425813L);
        }
    }

    public static void n(boolean bl) {
        F = bl;
    }

    public static boolean U() {
        return F;
    }

    public static boolean F() {
        boolean bl = X3.U();
        return !bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A20;
        if (b[n2] == null) {
            X3.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
