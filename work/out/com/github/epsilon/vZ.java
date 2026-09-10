/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.MutableComponent
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.uT;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import net.minecraft.network.chat.MutableComponent;

public class vZ {
    private static final List<uT> E;
    private static String T;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static MutableComponent W(Object ... var0) {
        var1_1 = (uT)var0[0];
        var2_2 = (Object[])var0[1];
        var3_3 = Dl.S();
        var5_4 = (vZ.Q("Ak8JOF1RJBV5hrzv", max(int int ), (int)(vZ.a(6271, 2172181684325427423L) - vZ.a(11727, 3351843324416105899L)), (int)vZ.a(9249, 1333564252560135383L)) ^ vZ.a(7042, 4215938659338758928L)) - vZ.a(19259, 7767698741873671163L);
        if (!var3_3) ** GOTO lbl-1000
        switch (var5_4) {
            default: lbl-1000:
            // 2 sources

            {
                var4_5 = hi.a("\u00a5", (Object)var1_1, (long)1335171215242130397L);
                v0 = var2_2.length;
                if (!var3_3) ** GOTO lbl29
                if (v0 <= 0) ** GOTO lbl28
                if (true) ** GOTO lbl30
            }
            case -451787303: {
                throw null;
            }
        }
        block7: while (true) {
            switch (var5_4) {
                default: {
                    var4_5 = hi.a("G", (Object)hi.a("j", (long)795501881625394938L), (Object)var4_5, (Object)var2_2, (long)1264245572283041652L);
                    if (!var3_3) {
                        return hi.a("G", (Object)var4_5, (long)1262634304799069784L);
                    }
                    ** GOTO lbl32
                }
                case -1099600537: {
                    hi.a("G", (long)1208540510591910900L);
                    if (var3_3 != false) return hi.a("G", (Object)var4_5, (long)1262634304799069784L);
lbl28:
                    // 2 sources

                    v0 = var5_4 = (vZ.a(2725, 6141436404567030350L) / vZ.a(11467, 1092136332577315919L) + vZ.a(30619, 8659157038756480862L)) / vZ.a(11467, 1092136332577315919L) - vZ.a(5419, 1929959465703023937L);
lbl29:
                    // 2 sources

                    if (var3_3) continue block7;
lbl30:
                    // 2 sources

                    var5_4 = (vZ.a(22941, 3002502869641947632L) + vZ.a(28454, 2232571986199470040L) ^ vZ.a(3872, 8636805642746478578L)) - vZ.a(14429, 7730890393484495052L);
                    if (var3_3) continue block7;
lbl32:
                    // 2 sources

                    var5_4 = (vZ.a(12779, 4682120315647099159L) / vZ.a(11467, 1092136332577315919L) + vZ.a(12903, 7212831290863977125L)) / vZ.a(11467, 1092136332577315919L) - vZ.a(23705, 5617230082740710454L);
                    continue block7;
                }
                case -1099600535: 
            }
            break;
        }
        return hi.a("G", (Object)var4_5, (long)1262634304799069784L);
    }

    public static List<uT> H() {
        return hi.a("j", (long)527478715467717199L);
    }

    private static uT S(String string, String string2) {
        return hi.a("G", string, (Object)string2, (long)985871884373461503L);
    }

    public static /* bridge */ /* synthetic */ CallSite Q(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        block8: {
            block7: {
                var0 = 3103111215930568031L;
                var6_1 = new long[157];
                var3_2 = 0;
                var4_3 = "\"\u00b0\u00b3'\u00874\u00b4\u0085L,\u00d4\u00cd\u00e1\u00cb\u00b3\u00d4\u00cc\"_\u000f\u00c5\u00f5\u001d\u00ec\u00a7\u00b8\u0088J1P\u001b\u00c8\\\u001b\u009a\u00c8m\u00e7\u00dc\u00ca\u00eaFR4f\u008c\u0004u\u00d8.\u008c\u00eb\u0006\u00a4\u00cb\u009e\u0089\u001c\u00baFApd\u0093\u0007\u00e1\u0001GZ\u0097\u00c6L\u00b5\u00bcw\u008e\u0002P\u00f0M\u00b4\u00c6\u0094\u00ba\u00d0\u00b31:\u001b$\u00f1\u00e0\u0095\u009b\u0089;\u008b\u00cf\u00a7\u00efC\u00cb\u008a\u00e4\u00e3\u00fb\u00e7S\u00bb\u00aaPbo:8~\"\u00c36\u00f2\u00fe\u0003U\u00cf\u00844\u0007{n\u00ef\u00b1\u0003pF\u0091\u00e6#\u0017:\u00e1\u0017\u00f0+\u00c0ml\u00ff\u008a\u00b3\u00df\u00e9\u00a1+\u00c6\u00e5\u000e,\u00f3\u00b7D,\u001a\u00a9\u0080\u00d9\u00e4\u0007\u00f3\u009a,\u00bd\u00da\u00beE\u00be\u0003\u0010\u009cj.#\u00e2\u0004\u00e4x\u00f2,\u00c4*\u0012\u009a\u009e\u0010(\f&\u009a\u00cf3h\u008f\u00cd\u00a4W\u00b7!\u00e8\u00ea\u00af\u00c4\u00b6K\u008e\u0017\u009dX\u008d\u00cb?\u00c1K\u009f\u00eb\u0099\u00ca+\u001d\u00b3h[\u0084R6@\u00e8\u00can\u009d\u00ff4z\u00b2\u00bf\u00a3_P\u00c3\u00e1\u00b3\u0092DR\u0093\u0080}\u0015A,O\u00ca\u0091\u0002\u0083i\u00e8])c\u00d1\u00d1l\u00a6\u00b21z\u0006\u00ab\u00b5\u00be\u00d57\u00e4\u0092G\b\u00f8\u001d\u0093\u00ef\u00de0\u00c2\u00daA\u00fd1a\u0096)\u00ff\u00bd\u0011\u00af\\\u0099\u00ef0\u00e7\u0000s)]\u00bd\u00d0y+\u00d1\u00cc\u00d1\u00d9\u00d4\u0086\u00b1\u00e1d\u00a3M\u0002\u001c\u0007\u00ab\u0013\u00a6\u001b\u0085m\u00db\u00e3\u0081\u00e1\u0092\u00d3\u0002\u0084\u00fe\u0093\u0005\u00efa\u009apA\u0082}\u00077\u00d3\u00da\u0007\u009f\u0000\u00e6\u008b\u0002\u0004\u0005\t\u0089\u00f1^J\u00f9\u0095C]\u00ad\u00a7Z\u00cfB\u00dcU\u00edf\u00f0\u001b\u00b7\u00e8\u00d0\u00b68\u000b\u001e\u0098\u00f8\u00c3\u008b\u0090\u0086\u0088\u00fc\u009e\u00bd0\u00cc\u00c8\u009e\u0085\u00e2\r\u00e4\u00cb\u0096#\u000e\t\u0003z\u00b5\u0006\u00e4}\u00c3\u00e7\u0003u\u00dfQ\u0019vN\u00f5\u00ee\u00ba7_\n\u00a5\u000e\u000f\u00be\u0093\u0096x\u00b3\u000e\u00acUhY\u00dc\u00d3\u0000\u00ffPNTpC0J|\u00a4\u00a6\u00d3n\u0081\u00a3\\\u000e\u000b\u00b1\u0091\u009b\u0093/\u00e6\u00f1\n\b\u00e1\u0095\u0098=\u00c2.\u00df\"\u00d8ALNE\u0016\u00c6>\u00d0\u00fb\u0007I\u0017;\u0014\u00e7\u00a6\u0001\u0096\u00f7\u001c\u00a93\u00c3 \u00f8N\u000e\u0004\u00a2\u00be\u008054T%\u0013\u00b4\u0019\u0017\u00dcGi\u00dcg\u00b2\u00d5\u0017c\u00d5\u00fe\u00cb\u00cb\u00c6\u00ddA-\u00c4\u00de\u0083t\u0080\u00be)\u00fe@y1\u00d0\b\u009e\u00a6\u0012\u009f\u00fa\u0098\u00ed\u009f\u00dej\u00ca\u00bd@\b\u00c8\u000e\u00d2\u00e5\u009cX!\b?\u00c2\u00ffxb\u001a\u00e4\u00fa\u00a8\u009dS\u0095\u00d1&\u00d7\u00a3\u00cd&Y\u00a60\u00cd\u0017,&\u00ec\u00e3+\b\t\u00da\tG\u0089\u00a5\u00e6\u00ad\u000b\u00cah\u00ce>\u00ba~\t\u0081\u0010\u0015\u00d3\u00d1\u00de\u00be\b\b\u0012\u0005@[\u00b8e5\u00b4|&>N\bQm\u00185\u00ea3v\u00c9$e\u0087A0SN\u00b1|gi}\u00a1\u00eb\u00f1\u001d[\u00f3GZ\u00a7\u00efNT[\u00a1*d\u0015\u00f3\u00eeP\u008c\u00de\u00f5k\u00e7\u00f7!`\u0087\u00f1\u0082\u00b0\u00c4b\u00067f\u008e\u0007\u00b4\u00ca\u00ab\u00abb?\u00f4?q6\u00ad6\u0088B\u00fe\u00021S\u00d9\u00e9\u009c\u00d3\"\u00c7L\u0096|\u00b5\u0088\u00dc\\\u00e20,\u008c%\u00bf\u0088\u00f3t7\u008d.\u00a5(\u0015h/\u00e9\u009a\u00c0X\u00b2>\u00cf\u0007\u0083.wjYA'\u00fb\u00b8zFL\u00fd\u00cd\u0083\u00a37o \u00edC\u0011\u00ac\u0090\u00b9\u00dd\u00d7!\u00d7\u00f3\u00b8Vq\u00d9\u0085=j$\u00f6\u00b3\u00a0\u00ac\u00d4\u0002\fv\u008fn>\u00c9\u0096&\u00ef*\u00d0\u00f2\u00eeA\u00a7\u00ab0DF\u0011\r-\u00f9\u0083\u00f1\u0019\u00c32^D:A\u008d\u00bd{\u00fe\u009e\u00a5\u0080\u00aa\u00f0\u00e1\u00b8\u00f1N\u0094h\u00b5\u000f\u00d5Wj\u009b\u00ef~{\\\u00fc\u00f2)\u0090\u001c\u00d3\u0096\u00b2M\u00bff9\u00bcc/\u001c6n\u0011\u00177\u0085\u00c9'\u00f3 A4\u0019\u00cfgz?\"X?y\u00b9\u00f1n\u00af\u0005\u0085\u0090\u00f0\t\u00a1\u00d0\u00d5\u00c3];\u008cR\u00c5\u00faL\u00c6\"\u0017\u0011\u001d\u00fc\u0093z\u00c9\u00ec\u00f0\u00e7RE\u0013\u00fd\u00b2\u00d4\u00a6\u00c6\u00c4;l\u009f\u00cab\u00b2\u00ac\u00af\u00eew\u00f0\u0010\u00c0\u00c1\u001e^\u0087h\u0098\u00de\u001c\u00f9\u00cd\u009f\u009a\u00aaE\u00daz5\u00bd\u008b\u0012\u0084\u0094\u00c1F\u00b0\u00f3\u0092q2\u009f\u00a1\u00cd\u0084\u00e0u\u00d0#\u00b5\u00e9\u00d2a)\u00f8S2\u00afy\\r\u00d7\u00fa\u009f\u0091B}>\u00e0\u00a6M\u00e1\u00ee,z\u00ee\u00a4\u0097\u00d2\fO{\u007f\u00d6\u00e6\u00fe#\u00b7\u0088\u00e2d\u00da\u00b5\u00d80\u00bf>\u00c1\u008e]\u0013\u009b!\u00fd\u00b4\n\f\u00db\u00f4\u0000\u0088\u00ad\u00e8 \u0007\u00ae\u0093\\!\u00d9\u00c2\u00a8\u00bd\u00a9\u007f\u00a0\u001f\u00f1\u001d!3\u00dc\u00c9n)\u00e6\u000b\u0083\u009c\u00e6\u00be\u00ac\u00e7\u00dazR\u00fbze\u008e\u0013~\u00c4\u0097\u00a0\u001b[\u00e1P\u00cd\u00ec\u0091|\u00ce]\u009b\u001f\u0001\u008bO\u00d7\u00b6dz\u009fM\u009a\u0097Q\u00dc&,mA\u00d8\u00a1\u0016\u00a2\u00dfLK\u00c6\u00de\u0082a^\u00dd\u0016O\u00d2\u008f\u0000\u0086PS\t\u0089H\u00fa\u0018\u00063\u00e0\u00d0\u00aa\u008d\u00e9\u00e6\u00c8\u0019\u00fe\u00f7\u00d0?\u00a8\u00d7~]\u00ee\u0081mM\u00a9\u00f3\u00de\u0088B\u0082\u0084Q\u009b\u00ec\n\u00b2\u0007\u00f4\u00b52#\u00f9ZCu\u0000\u00cfW\u00e7\u009a\u0011\t\u00e5\\\u00ea\u00c8\u009c\u00caU\u009d\u0081\u00ed\u00d9$uEVgW&\u00eeQ\u0019_\u00f8\u0012R\u00c1\u009f\u008f\u0092Am@\u00d3u\u00cdz5\u00c1";
                var5_4 = "\"\u00b0\u00b3'\u00874\u00b4\u0085L,\u00d4\u00cd\u00e1\u00cb\u00b3\u00d4\u00cc\"_\u000f\u00c5\u00f5\u001d\u00ec\u00a7\u00b8\u0088J1P\u001b\u00c8\\\u001b\u009a\u00c8m\u00e7\u00dc\u00ca\u00eaFR4f\u008c\u0004u\u00d8.\u008c\u00eb\u0006\u00a4\u00cb\u009e\u0089\u001c\u00baFApd\u0093\u0007\u00e1\u0001GZ\u0097\u00c6L\u00b5\u00bcw\u008e\u0002P\u00f0M\u00b4\u00c6\u0094\u00ba\u00d0\u00b31:\u001b$\u00f1\u00e0\u0095\u009b\u0089;\u008b\u00cf\u00a7\u00efC\u00cb\u008a\u00e4\u00e3\u00fb\u00e7S\u00bb\u00aaPbo:8~\"\u00c36\u00f2\u00fe\u0003U\u00cf\u00844\u0007{n\u00ef\u00b1\u0003pF\u0091\u00e6#\u0017:\u00e1\u0017\u00f0+\u00c0ml\u00ff\u008a\u00b3\u00df\u00e9\u00a1+\u00c6\u00e5\u000e,\u00f3\u00b7D,\u001a\u00a9\u0080\u00d9\u00e4\u0007\u00f3\u009a,\u00bd\u00da\u00beE\u00be\u0003\u0010\u009cj.#\u00e2\u0004\u00e4x\u00f2,\u00c4*\u0012\u009a\u009e\u0010(\f&\u009a\u00cf3h\u008f\u00cd\u00a4W\u00b7!\u00e8\u00ea\u00af\u00c4\u00b6K\u008e\u0017\u009dX\u008d\u00cb?\u00c1K\u009f\u00eb\u0099\u00ca+\u001d\u00b3h[\u0084R6@\u00e8\u00can\u009d\u00ff4z\u00b2\u00bf\u00a3_P\u00c3\u00e1\u00b3\u0092DR\u0093\u0080}\u0015A,O\u00ca\u0091\u0002\u0083i\u00e8])c\u00d1\u00d1l\u00a6\u00b21z\u0006\u00ab\u00b5\u00be\u00d57\u00e4\u0092G\b\u00f8\u001d\u0093\u00ef\u00de0\u00c2\u00daA\u00fd1a\u0096)\u00ff\u00bd\u0011\u00af\\\u0099\u00ef0\u00e7\u0000s)]\u00bd\u00d0y+\u00d1\u00cc\u00d1\u00d9\u00d4\u0086\u00b1\u00e1d\u00a3M\u0002\u001c\u0007\u00ab\u0013\u00a6\u001b\u0085m\u00db\u00e3\u0081\u00e1\u0092\u00d3\u0002\u0084\u00fe\u0093\u0005\u00efa\u009apA\u0082}\u00077\u00d3\u00da\u0007\u009f\u0000\u00e6\u008b\u0002\u0004\u0005\t\u0089\u00f1^J\u00f9\u0095C]\u00ad\u00a7Z\u00cfB\u00dcU\u00edf\u00f0\u001b\u00b7\u00e8\u00d0\u00b68\u000b\u001e\u0098\u00f8\u00c3\u008b\u0090\u0086\u0088\u00fc\u009e\u00bd0\u00cc\u00c8\u009e\u0085\u00e2\r\u00e4\u00cb\u0096#\u000e\t\u0003z\u00b5\u0006\u00e4}\u00c3\u00e7\u0003u\u00dfQ\u0019vN\u00f5\u00ee\u00ba7_\n\u00a5\u000e\u000f\u00be\u0093\u0096x\u00b3\u000e\u00acUhY\u00dc\u00d3\u0000\u00ffPNTpC0J|\u00a4\u00a6\u00d3n\u0081\u00a3\\\u000e\u000b\u00b1\u0091\u009b\u0093/\u00e6\u00f1\n\b\u00e1\u0095\u0098=\u00c2.\u00df\"\u00d8ALNE\u0016\u00c6>\u00d0\u00fb\u0007I\u0017;\u0014\u00e7\u00a6\u0001\u0096\u00f7\u001c\u00a93\u00c3 \u00f8N\u000e\u0004\u00a2\u00be\u008054T%\u0013\u00b4\u0019\u0017\u00dcGi\u00dcg\u00b2\u00d5\u0017c\u00d5\u00fe\u00cb\u00cb\u00c6\u00ddA-\u00c4\u00de\u0083t\u0080\u00be)\u00fe@y1\u00d0\b\u009e\u00a6\u0012\u009f\u00fa\u0098\u00ed\u009f\u00dej\u00ca\u00bd@\b\u00c8\u000e\u00d2\u00e5\u009cX!\b?\u00c2\u00ffxb\u001a\u00e4\u00fa\u00a8\u009dS\u0095\u00d1&\u00d7\u00a3\u00cd&Y\u00a60\u00cd\u0017,&\u00ec\u00e3+\b\t\u00da\tG\u0089\u00a5\u00e6\u00ad\u000b\u00cah\u00ce>\u00ba~\t\u0081\u0010\u0015\u00d3\u00d1\u00de\u00be\b\b\u0012\u0005@[\u00b8e5\u00b4|&>N\bQm\u00185\u00ea3v\u00c9$e\u0087A0SN\u00b1|gi}\u00a1\u00eb\u00f1\u001d[\u00f3GZ\u00a7\u00efNT[\u00a1*d\u0015\u00f3\u00eeP\u008c\u00de\u00f5k\u00e7\u00f7!`\u0087\u00f1\u0082\u00b0\u00c4b\u00067f\u008e\u0007\u00b4\u00ca\u00ab\u00abb?\u00f4?q6\u00ad6\u0088B\u00fe\u00021S\u00d9\u00e9\u009c\u00d3\"\u00c7L\u0096|\u00b5\u0088\u00dc\\\u00e20,\u008c%\u00bf\u0088\u00f3t7\u008d.\u00a5(\u0015h/\u00e9\u009a\u00c0X\u00b2>\u00cf\u0007\u0083.wjYA'\u00fb\u00b8zFL\u00fd\u00cd\u0083\u00a37o \u00edC\u0011\u00ac\u0090\u00b9\u00dd\u00d7!\u00d7\u00f3\u00b8Vq\u00d9\u0085=j$\u00f6\u00b3\u00a0\u00ac\u00d4\u0002\fv\u008fn>\u00c9\u0096&\u00ef*\u00d0\u00f2\u00eeA\u00a7\u00ab0DF\u0011\r-\u00f9\u0083\u00f1\u0019\u00c32^D:A\u008d\u00bd{\u00fe\u009e\u00a5\u0080\u00aa\u00f0\u00e1\u00b8\u00f1N\u0094h\u00b5\u000f\u00d5Wj\u009b\u00ef~{\\\u00fc\u00f2)\u0090\u001c\u00d3\u0096\u00b2M\u00bff9\u00bcc/\u001c6n\u0011\u00177\u0085\u00c9'\u00f3 A4\u0019\u00cfgz?\"X?y\u00b9\u00f1n\u00af\u0005\u0085\u0090\u00f0\t\u00a1\u00d0\u00d5\u00c3];\u008cR\u00c5\u00faL\u00c6\"\u0017\u0011\u001d\u00fc\u0093z\u00c9\u00ec\u00f0\u00e7RE\u0013\u00fd\u00b2\u00d4\u00a6\u00c6\u00c4;l\u009f\u00cab\u00b2\u00ac\u00af\u00eew\u00f0\u0010\u00c0\u00c1\u001e^\u0087h\u0098\u00de\u001c\u00f9\u00cd\u009f\u009a\u00aaE\u00daz5\u00bd\u008b\u0012\u0084\u0094\u00c1F\u00b0\u00f3\u0092q2\u009f\u00a1\u00cd\u0084\u00e0u\u00d0#\u00b5\u00e9\u00d2a)\u00f8S2\u00afy\\r\u00d7\u00fa\u009f\u0091B}>\u00e0\u00a6M\u00e1\u00ee,z\u00ee\u00a4\u0097\u00d2\fO{\u007f\u00d6\u00e6\u00fe#\u00b7\u0088\u00e2d\u00da\u00b5\u00d80\u00bf>\u00c1\u008e]\u0013\u009b!\u00fd\u00b4\n\f\u00db\u00f4\u0000\u0088\u00ad\u00e8 \u0007\u00ae\u0093\\!\u00d9\u00c2\u00a8\u00bd\u00a9\u007f\u00a0\u001f\u00f1\u001d!3\u00dc\u00c9n)\u00e6\u000b\u0083\u009c\u00e6\u00be\u00ac\u00e7\u00dazR\u00fbze\u008e\u0013~\u00c4\u0097\u00a0\u001b[\u00e1P\u00cd\u00ec\u0091|\u00ce]\u009b\u001f\u0001\u008bO\u00d7\u00b6dz\u009fM\u009a\u0097Q\u00dc&,mA\u00d8\u00a1\u0016\u00a2\u00dfLK\u00c6\u00de\u0082a^\u00dd\u0016O\u00d2\u008f\u0000\u0086PS\t\u0089H\u00fa\u0018\u00063\u00e0\u00d0\u00aa\u008d\u00e9\u00e6\u00c8\u0019\u00fe\u00f7\u00d0?\u00a8\u00d7~]\u00ee\u0081mM\u00a9\u00f3\u00de\u0088B\u0082\u0084Q\u009b\u00ec\n\u00b2\u0007\u00f4\u00b52#\u00f9ZCu\u0000\u00cfW\u00e7\u009a\u0011\t\u00e5\\\u00ea\u00c8\u009c\u00caU\u009d\u0081\u00ed\u00d9$uEVgW&\u00eeQ\u0019_\u00f8\u0012R\u00c1\u009f\u008f\u0092Am@\u00d3u\u00cdz5\u00c1".length();
                vZ.E(null);
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
                    var4_3 = "N\u00c7\u00eb\u000f\u00e6\u00c2%\u001aHOAw\t\u000e\u00c3\u00bd";
                    var5_4 = "N\u00c7\u00eb\u000f\u00e6\u00c2%\u001aHOAw\t\u000e\u00c3\u00bd".length();
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
        vZ.a = var6_1;
        vZ.b = new Integer[157];
        v5 = new uT[vZ.a(28619, 442429942058409810L)];
        v5[0] = hi.a("j", (long)863310461756277359L);
        v5[1] = hi.a("j", (long)1168610726217518155L);
        v5[2] = hi.a("j", (long)674350085502239805L);
        v5[3] = hi.a("j", (long)1117515383570576647L);
        v5[4] = hi.a("j", (long)959084147276378170L);
        v5[5] = hi.a("j", (long)1198513292742297397L);
        v5[vZ.a((int)57, (long)6524185654099783924L)] = hi.a("j", (long)967828403965770594L);
        v5[vZ.a((int)30314, (long)1201350777036228248L)] = hi.a("j", (long)603483818671210262L);
        v5[vZ.a((int)29909, (long)7320351857772053668L)] = hi.a("j", (long)848119418545201163L);
        v5[vZ.a((int)13287, (long)4840483835197227898L)] = hi.a("j", (long)1129073613587931611L);
        v5[vZ.a((int)1435, (long)3511751498798446068L)] = hi.a("j", (long)1018553056761631704L);
        v5[vZ.a((int)16875, (long)4986487388942037406L)] = hi.a("j", (long)1019847631423852325L);
        v5[vZ.a((int)382, (long)2384006980822217113L)] = hi.a("j", (long)755104003626433524L);
        v5[vZ.a((int)11577, (long)5964864480217701811L)] = hi.a("j", (long)951424616591445509L);
        v5[vZ.a((int)293, (long)7682410702856335789L)] = hi.a("j", (long)1191934962197622408L);
        v5[vZ.a((int)3525, (long)2821634654391319838L)] = hi.a("j", (long)623943762964016765L);
        v5[vZ.a((int)21512, (long)6179298717474448582L)] = hi.a("j", (long)419667788728302624L);
        v5[vZ.a((int)20132, (long)189472734087937588L)] = hi.a("j", (long)1067035023700970955L);
        v5[vZ.a((int)23113, (long)6533208427923401406L)] = hi.a("j", (long)1126386911526547087L);
        v5[vZ.a((int)22186, (long)6099212428828239567L)] = hi.a("j", (long)1266526161100819523L);
        v5[vZ.a((int)23067, (long)1371126821739326164L)] = hi.a("j", (long)847196240166291447L);
        v5[vZ.a((int)28538, (long)2082481067171864549L)] = hi.a("j", (long)603660171042448042L);
        v5[vZ.a((int)16333, (long)360892495824490358L)] = hi.a("j", (long)456908466547608019L);
        v5[vZ.a((int)20921, (long)1516201028638236990L)] = hi.a("j", (long)399598208116170578L);
        v5[vZ.a((int)852, (long)2163542627084121081L)] = hi.a("j", (long)1114245006349218235L);
        v5[vZ.a((int)24331, (long)2480084034990993346L)] = hi.a("j", (long)1261596173348931151L);
        v5[vZ.a((int)26915, (long)8547671157022054848L)] = hi.a("j", (long)1289313755308796202L);
        v5[vZ.a((int)20014, (long)6896413310260313785L)] = hi.a("j", (long)1229098656392065138L);
        v5[vZ.a((int)13331, (long)5909871069666051298L)] = hi.a("j", (long)1325628630792334057L);
        v5[vZ.a((int)22867, (long)5518607230820182438L)] = hi.a("j", (long)1128987428624806782L);
        v5[vZ.a((int)27794, (long)3619132091895209083L)] = hi.a("j", (long)1098983042690321515L);
        v5[vZ.a((int)27380, (long)1815712562279471620L)] = hi.a("j", (long)647474527563138458L);
        v5[vZ.a((int)17279, (long)368276310526194649L)] = hi.a("j", (long)1216913069930577832L);
        v5[vZ.a((int)16441, (long)1482960203268976735L)] = hi.a("j", (long)1136483652689837335L);
        v5[vZ.a((int)13681, (long)608017302462727653L)] = hi.a("j", (long)557877925898328062L);
        v5[vZ.a((int)30976, (long)7606746050127120858L)] = hi.a("j", (long)698551092662602826L);
        v5[vZ.a((int)12658, (long)5057898762759373284L)] = hi.a("j", (long)465558151615581630L);
        v5[vZ.a((int)28091, (long)343154710455868734L)] = hi.a("j", (long)1011262624126738305L);
        v5[vZ.a((int)28394, (long)8187043321434955281L)] = hi.a("j", (long)650051663254394632L);
        v5[vZ.a((int)3394, (long)7317977391521611252L)] = hi.a("j", (long)1191715274700850196L);
        v5[vZ.a((int)28597, (long)5585772336604569402L)] = hi.a("j", (long)1193672482831390879L);
        v5[vZ.a((int)922, (long)1116658502884176884L)] = hi.a("j", (long)1095846340608677629L);
        v5[vZ.a((int)10182, (long)4875491402835105610L)] = hi.a("j", (long)1086737293243383048L);
        v5[vZ.a((int)10769, (long)1935840746753759876L)] = hi.a("j", (long)924353054980639537L);
        v5[vZ.a((int)17495, (long)7982260329461806124L)] = hi.a("j", (long)361617621454431721L);
        v5[vZ.a((int)3891, (long)7865472000223657879L)] = hi.a("j", (long)758690517182339816L);
        v5[vZ.a((int)24283, (long)7845307664447893016L)] = hi.a("j", (long)947786168011879488L);
        v5[vZ.a((int)25598, (long)7597451748719121241L)] = hi.a("j", (long)725100703576721224L);
        v5[vZ.a((int)12485, (long)1755951634888228873L)] = hi.a("j", (long)595186367207968955L);
        v5[vZ.a((int)27505, (long)2053279504441367452L)] = hi.a("j", (long)1295691688874963103L);
        v5[vZ.a((int)13836, (long)919822191813297908L)] = hi.a("j", (long)1019045005372125211L);
        v5[vZ.a((int)19632, (long)8400021576125119534L)] = hi.a("j", (long)1184596468337502437L);
        v5[vZ.a((int)31253, (long)2115803716792306328L)] = hi.a("j", (long)1222571576909970534L);
        v5[vZ.a((int)8889, (long)1601976632721052178L)] = hi.a("j", (long)875672539380516218L);
        v5[vZ.a((int)26033, (long)7617783886132827490L)] = hi.a("j", (long)1068124173668512875L);
        v5[vZ.a((int)18164, (long)3312365473534047876L)] = hi.a("j", (long)585535041644912750L);
        v5[vZ.a((int)4736, (long)5897520239953715740L)] = hi.a("j", (long)929990067067274688L);
        v5[vZ.a((int)26893, (long)2316313850073307500L)] = hi.a("j", (long)1212748363486004387L);
        v5[vZ.a((int)26549, (long)1553990320036566811L)] = hi.a("j", (long)992731116537355045L);
        v5[vZ.a((int)13144, (long)8749817726104699851L)] = hi.a("j", (long)1004120490460771804L);
        v5[vZ.a((int)8237, (long)2170909052372947118L)] = hi.a("j", (long)375653611194560462L);
        v5[vZ.a((int)671, (long)686015186774831680L)] = hi.a("j", (long)449319850911336390L);
        v5[vZ.a((int)13601, (long)283754707581633857L)] = hi.a("j", (long)784497744710347732L);
        v5[vZ.a((int)28643, (long)1686885005005610846L)] = hi.a("j", (long)1229791502555926266L);
        v5[vZ.a((int)3074, (long)2991969014460103878L)] = hi.a("j", (long)557630255365930219L);
        v5[vZ.a((int)22713, (long)6869098710560270451L)] = hi.a("j", (long)378404503752226283L);
        v5[vZ.a((int)10284, (long)263610792085428312L)] = hi.a("j", (long)942078002554372553L);
        v5[vZ.a((int)21446, (long)8041998447151637267L)] = hi.a("j", (long)486691295236651470L);
        v5[vZ.a((int)15095, (long)5460566742839691905L)] = hi.a("j", (long)651091966392302316L);
        v5[vZ.a((int)19471, (long)3788809818820902140L)] = hi.a("j", (long)1144077588295116432L);
        v5[vZ.a((int)13577, (long)3660559742775035379L)] = hi.a("j", (long)644923098965614158L);
        v5[vZ.a((int)7160, (long)3033649561278393126L)] = hi.a("j", (long)1275222721436734325L);
        v5[vZ.a((int)26799, (long)8363884340490819798L)] = hi.a("j", (long)511995798946343709L);
        v5[vZ.a((int)29079, (long)5418731607917642051L)] = hi.a("j", (long)864821098406590967L);
        v5[vZ.a((int)20515, (long)5526366505422545064L)] = hi.a("j", (long)1324027733569753492L);
        v5[vZ.a((int)18734, (long)4311614278578305523L)] = hi.a("j", (long)1123720017542224897L);
        v5[vZ.a((int)27870, (long)4492169903072926831L)] = hi.a("j", (long)557802451451972394L);
        v5[vZ.a((int)30832, (long)5207735920522971144L)] = hi.a("j", (long)425846269046611263L);
        v5[vZ.a((int)13444, (long)6840577146950223095L)] = hi.a("j", (long)412809737747466148L);
        v5[vZ.a((int)1261, (long)2885299955591296081L)] = hi.a("j", (long)507094361375337843L);
        v5[vZ.a((int)4908, (long)7949541205571019770L)] = hi.a("j", (long)930501830888110226L);
        v5[vZ.a((int)11655, (long)5822244493214621007L)] = hi.a("j", (long)630012809145891568L);
        v5[vZ.a((int)21900, (long)1396141639787210223L)] = hi.a("j", (long)539022282797394239L);
        v5[vZ.a((int)30674, (long)3731590900167001929L)] = hi.a("j", (long)698442582356769755L);
        v5[vZ.a((int)14255, (long)4168666873018124079L)] = hi.a("j", (long)1269435215494876008L);
        v5[vZ.a((int)17599, (long)3596730819208967197L)] = hi.a("j", (long)982892920691550700L);
        v5[vZ.a((int)10109, (long)3281163751555503889L)] = hi.a("j", (long)1122981531626676873L);
        v5[vZ.a((int)5278, (long)7515524864336503852L)] = hi.a("j", (long)1126660001837443040L);
        v5[vZ.a((int)22049, (long)5763868439207994952L)] = hi.a("j", (long)488759994362387176L);
        v5[vZ.a((int)28208, (long)6376341997205708498L)] = hi.a("j", (long)1286966166481979483L);
        v5[vZ.a((int)17233, (long)7429193697597256576L)] = hi.a("j", (long)1335380492207525936L);
        v5[vZ.a((int)2678, (long)298877962654300919L)] = hi.a("j", (long)639691281275256011L);
        v5[vZ.a((int)16827, (long)4898083563980550453L)] = hi.a("j", (long)979246128202833610L);
        v5[vZ.a((int)32396, (long)7712145003151118075L)] = hi.a("j", (long)954905996801424115L);
        v5[vZ.a((int)16544, (long)2088377769200578649L)] = hi.a("j", (long)1064916239192943236L);
        v5[vZ.a((int)7728, (long)4468584723289976551L)] = hi.a("j", (long)649114220244877509L);
        v5[vZ.a((int)22324, (long)7133061533207750619L)] = hi.a("j", (long)1253717097267795345L);
        v5[vZ.a((int)14665, (long)7652572878845643181L)] = hi.a("j", (long)1123535853976219280L);
        v5[vZ.a((int)15631, (long)7006747886326320570L)] = hi.a("j", (long)514937301842398459L);
        v5[vZ.a((int)3587, (long)4405679763550584489L)] = hi.a("j", (long)1172021334748851300L);
        v5[vZ.a((int)1076, (long)7653925254321157277L)] = hi.a("j", (long)1019233311979072790L);
        v5[vZ.a((int)12950, (long)5022341667805757968L)] = hi.a("j", (long)1239756093759870008L);
        v5[vZ.a((int)23214, (long)4846702510932912706L)] = hi.a("j", (long)510141340540648496L);
        v5[vZ.a((int)1015, (long)87592462051029842L)] = hi.a("j", (long)575824983184108093L);
        v5[vZ.a((int)32282, (long)5625373615919877762L)] = hi.a("j", (long)1165896072404871689L);
        v5[vZ.a((int)5709, (long)658860128211478184L)] = hi.a("j", (long)415802043522414150L);
        v5[vZ.a((int)21484, (long)6105161210128327484L)] = hi.a("j", (long)724691955164508083L);
        v5[vZ.a((int)22937, (long)2216202398153173350L)] = hi.a("j", (long)1278696562305226007L);
        v5[vZ.a((int)30102, (long)2195944659168904676L)] = hi.a("j", (long)1041681201798056750L);
        v5[vZ.a((int)3518, (long)5647728913145150800L)] = hi.a("j", (long)1274384273906120862L);
        v5[vZ.a((int)8391, (long)6923287429450534912L)] = hi.a("j", (long)935452132528232976L);
        v5[vZ.a((int)16730, (long)5023625718001299939L)] = hi.a("j", (long)1051221958446941268L);
        v5[vZ.a((int)22972, (long)8009956634516154714L)] = hi.a("j", (long)700466190429693599L);
        v5[vZ.a((int)11657, (long)4386350111463218531L)] = hi.a("j", (long)540452266423085863L);
        v5[vZ.a((int)22085, (long)7760929740681930396L)] = hi.a("j", (long)467663201815827425L);
        v5[vZ.a((int)16047, (long)7838752317837839879L)] = hi.a("j", (long)754263009851174663L);
        v5[vZ.a((int)29361, (long)8861674179242738295L)] = hi.a("j", (long)512969305532378644L);
        v5[vZ.a((int)20241, (long)1364805826897641323L)] = hi.a("j", (long)1152149514765526907L);
        v5[vZ.a((int)25405, (long)4526273773735236604L)] = hi.a("j", (long)1118649897863241210L);
        v5[vZ.a((int)21108, (long)3895236209452475133L)] = hi.a("j", (long)1128777016540035857L);
        v5[vZ.a((int)4334, (long)3514994147690881061L)] = hi.a("j", (long)1313278429996939883L);
        v5[vZ.a((int)7738, (long)3401883362334518983L)] = hi.a("j", (long)1324191591625106608L);
        v5[vZ.a((int)16590, (long)4410927609125499006L)] = hi.a("j", (long)555894629747692350L);
        v5[vZ.a((int)25479, (long)2333379077700670437L)] = hi.a("j", (long)436236387038672937L);
        v5[vZ.a((int)17931, (long)2500484194929637099L)] = hi.a("j", (long)964602808788838800L);
        v5[vZ.a((int)21830, (long)4277788469430314494L)] = hi.a("j", (long)917927983609278510L);
        v5[vZ.a((int)21955, (long)3572024598899484016L)] = hi.a("j", (long)836238345609589224L);
        v5[vZ.a((int)22830, (long)6411751927440271796L)] = hi.a("j", (long)1231758154856780112L);
        v5[vZ.a((int)2355, (long)1569244243763673476L)] = hi.a("j", (long)1234432929393677227L);
        v5[vZ.a((int)18356, (long)2988652419912628032L)] = hi.a("j", (long)1057393260728015852L);
        v5[vZ.a((int)27151, (long)7776892325905849019L)] = hi.a("j", (long)412143778893867416L);
        v5[vZ.a((int)6432, (long)8509668012732492107L)] = hi.a("j", (long)1165551774295917271L);
        v5[vZ.a((int)2157, (long)2886712712339962060L)] = hi.a("j", (long)652603903901736758L);
        v5[vZ.a((int)7957, (long)8869688590847422322L)] = hi.a("j", (long)989415785723186936L);
        v5[vZ.a((int)21514, (long)4025308835874464994L)] = hi.a("j", (long)575141322162114344L);
        v5[vZ.a((int)22280, (long)7672577257531205584L)] = hi.a("j", (long)1260269013489499510L);
        v5[vZ.a((int)30076, (long)4823113946472334786L)] = hi.a("j", (long)1167588851641545853L);
        v5[vZ.a((int)25589, (long)5704699191984444246L)] = hi.a("j", (long)1185771839816196263L);
        v5[vZ.a((int)25884, (long)3712595801051616688L)] = hi.a("j", (long)1169851781128078887L);
        v5[vZ.a((int)7751, (long)2646755160499367621L)] = hi.a("j", (long)1306264748987010974L);
        v5[vZ.a((int)16606, (long)9124610451339440191L)] = hi.a("j", (long)1239493996327335075L);
        v5[vZ.a((int)7696, (long)3997843458661068399L)] = hi.a("j", (long)823074072514125474L);
        v5[vZ.a((int)25318, (long)8059291774230188633L)] = hi.a("j", (long)1234517257993282707L);
        v5[vZ.a((int)28367, (long)3636512111724289555L)] = hi.a("j", (long)785632349621551408L);
        v5[vZ.a((int)18224, (long)8135029635334272856L)] = hi.a("j", (long)579132822087898298L);
        v5[vZ.a((int)21814, (long)7342877132653389196L)] = hi.a("j", (long)740922121519805975L);
        vZ.E = hi.a("G", (Object)v5, (long)766237327738552430L);
    }

    private vZ() {
    }

    public static void E(String string) {
        T = string;
    }

    public static String Y() {
        return T;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x30E3;
        if (b[n2] == null) {
            vZ.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
