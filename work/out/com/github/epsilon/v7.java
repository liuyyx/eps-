/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.input.MouseButtonEvent
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xe;
import com.github.epsilon._j;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.vh;
import com.github.epsilon.zU;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.MouseButtonEvent;

public class v7
extends vh<Xe<?>> {
    private static final long[] a;
    private static final Integer[] b;

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
        String string = (int)hi.a("\u00a5", (Object)((Xe)((Object)hi.a("\u00e9", (Object)this, (long)368556895492636452L))), (Object)new Object[0], (long)1108734320825965490L) + (String)((Object)hi.a("G", (Object)new Object[]{hi.a("\u00a5", (Object)((Xe)((Object)hi.a("\u00e9", (Object)this, (long)368556895492636452L))), (Object)new Object[0], (long)1152704581652356143L)}, (long)913615289072975054L));
        float f4 = 0.58f;
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)hi.a("\u00a5", (Object)ih2, (long)1210563473410659836L), (float)hi.a("\u00a5", (Object)ih2, (long)665954777623212870L), (float)9.0f, (Object)v7.N("99Z2TKq4NxbcVgbw", Y(float ), (float)f), (long)776507817655946365L);
        hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00a5", (Object)((Xe)((Object)hi.a("\u00e9", (Object)this, (long)368556895492636452L))), (long)465467115463800692L), (float)5.0f, (float)var11_11, (float)f3, (Object)hi.a("j", (long)692578069409858836L), (long)487875072643634565L);
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("G", (Object)_j2, (Object)ih2, (Object)string, (float)f4, (float)8.0f, (float)12.0f, (float)94.0f, (long)1021318755957231379L), (Object)ih2, (long)698030497329722378L);
        Object[] objectArray2 = new Object[8];
        objectArray2[7] = hi.a("j", (long)1254631756863587562L);
        objectArray2[6] = Float.valueOf(0.58f);
        objectArray2[5] = "\ue145";
        objectArray2[4] = hi.a("j", (long)892696799870358639L);
        objectArray2[3] = hi.a("j", (long)970606960436247839L);
        objectArray2[2] = Float.valueOf(f4);
        objectArray2[1] = string;
        objectArray2[0] = callSite;
        hi.a("\u00a5", (Object)zU2, (Object)objectArray2, (long)412667454678744159L);
    }

    public static /* bridge */ /* synthetic */ CallSite N(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean E(ih var1_1, MouseButtonEvent var2_2, boolean var3_3) {
        block12: {
            var4_4 = Dl.S();
            var5_5 /* !! */  = (v7.a(32412, 8361339200653443306L) + v7.a(14698, 6749999306943792957L)) * v7.a(7002, 3497022601883493640L) - v7.a(25845, 6785836905453640328L);
            if (var4_4) ** GOTO lbl15
            block9: while (true) {
                block15: {
                    block14: {
                        block13: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (double)v7.N("99Z2TKq4NxbcVgbw", x(), (MouseButtonEvent)var2_2), (double)hi.a("\u00a5", (Object)var2_2, (long)1045026150751632794L), (long)700074705642999773L);
                            if (!var4_4) break block13;
                            if (v0 /* !! */  != false) break block14;
                            v0 /* !! */  = (CallSite)(v7.N("99Z2TKq4NxbcVgbw", max(int int ), (int)(v7.a(27752, 4043283689215480344L) * v7.a(18787, 3627614029936326405L)), (int)v7.a(14383, 2680613741077038668L)) - v7.a(20608, 6665460478696615657L) ^ v7.a(12769, 1268360622714064773L) ^ v7.a(17991, 7771759266910468119L));
                        }
                        var5_5 /* !! */  = (int)v0 /* !! */ ;
                        if (var4_4) break block15;
                    }
                    var5_5 /* !! */  = (int)(hi.a("G", (int)((v7.a(11393, 3932997338435195646L) + v7.a(18715, 1561740249080002422L) + v7.a(19355, 316733374367528428L)) * v7.a(4489, 6509037888206811115L)), (int)v7.a(9911, 4395514019204896982L), (long)834203424483934088L) - v7.a(28067, 4317513073110733773L));
                    if (!var4_4) ** GOTO lbl39
                }
                while (true) {
                    block17: {
                        block16: {
                            switch (var5_5 /* !! */ ) {
                                default: {
                                    continue block9;
                                }
                                case -545497118: {
                                    v1 /* !! */  = v7.N("99Z2TKq4NxbcVgbw", button(), (MouseButtonEvent)var2_2);
                                    if (!var4_4) break block16;
                                    if (v1 /* !! */  != false) break;
                                    break block17;
                                }
                                case -545497120: {
                                    v2 = true;
                                    var5_5 /* !! */  = (int)(v7.N("99Z2TKq4NxbcVgbw", max(int int ), (int)(hi.a("G", (int)v7.a(16071, 293480049049772L), (int)v7.a(15186, 5639457002008216835L), (long)834203424483934088L) + v7.a(28446, 7171681789977448827L)), (int)v7.a(22551, 3013275151350294117L)) + v7.a(8339, 1178378929675214566L));
                                    if (!var4_4) {
                                        break block9;
                                    }
                                    break block12;
                                }
                                case -545497121: {
                                    v2 = false;
                                    if (var4_4) break block9;
                                    return v2;
                                }
                                case -545497117: {
                                    hi.a("G", (long)661981318591720701L);
                                    return (boolean)hi.a("G", (long)870284539248200401L);
                                }
                            }
lbl39:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(hi.a("G", (int)(v7.a(30029, 914937900678368054L) * v7.a(27582, 3308708369134835158L)), (int)v7.a(29999, 3080446818094041928L), (long)834203424483934088L) - v7.a(30523, 3846618558555212106L) ^ v7.a(14174, 3182652511503157536L) ^ v7.a(14586, 7273384630227732102L));
                        }
                        var5_5 /* !! */  = (int)v1 /* !! */ ;
                        if (var4_4) continue;
                    }
                    var5_5 /* !! */  = ((v7.a(30587, 1220545854838589711L) ^ v7.a(13831, 8761173094656084052L)) + v7.a(8363, 8134996417181621956L) ^ v7.a(14597, 6685959139433416559L)) + v7.a(8510, 6639352233049005895L);
                }
                break;
            }
            var5_5 /* !! */  = (int)(hi.a("G", (int)(v7.N("99Z2TKq4NxbcVgbw", max(int int ), (int)v7.a(26263, 8291598941774633211L), (int)v7.a(17368, 1089979367946190242L)) + v7.a(2790, 3338090365826970773L)), (int)v7.a(29245, 2846766855094717533L), (long)834203424483934088L) + v7.a(9810, 4992164844779804714L));
        }
        switch (var5_5 /* !! */ ) {
            default: {
                return v2;
            }
            case 1276610167: 
        }
        throw null;
    }

    public v7(Xe<?> xe) {
        super(xe);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6263731187078809966L;
                var6_1 = new long[37];
                var3_2 = 0;
                var4_3 = "`\u0007w\u00ad\u0086\t\u00e4\u00fb\u009bcGS\u0088\u00cd\u00c16(le\u001b\u009e\u00aduK\u0096\u00bf'[\u00e3\u00f0\u00abC\u00c0\u009fJ\\\u00b4q\u00a2\u00f5\u000f\u0092\u00d6\u00c1\u008f\u00de\u00d3(\u0010\u001d\u000b\u0016h\u009f\u009a\u00af\u00c8\u0013\u00bc\u001bd\u008b\u00cf\u00dfm\u0082\u00da\u00a0gX\u00b2mOnq\u008b,\u009a\u0014\u009dS\u00fd\u0095\u0006\u00e7\u0080\u00d9T\u00dfs/\u009f\u00cb\u00cc\u001cc\u0007\u00a6\u0089\u0002wQg\u0096\u0004\u00fb\u00f5\u0082y\u00dd`1H\u00aa\u00d6/\u00d3\u00c9\u00a1\u00c0\u00ea\u0088\u00d1\u00a4H\u0082\u00ca2\u008b\u0095\u009d%v\u00af^\u00fd\u00a7h\u008cC\u00b5\u00f6\u00aaBw]\u00a8\u0018\u00b57\u00eb,!D}\u00b0B5\u00eb\u000e\u00d7\u0007M\u00ae\u00ab\u00b8\u0093\u00f9%FW\u00e8\u0003\u0007!\u000e\u008aZN\u00a7\u00c8\u00f2\u0081\u0015\u000f\u00fc\u008b\u00d2\u0095\u008c\u00e6\u0094\u007f7\u00aei2d?\u0017\u00f3I\u00b2\u0005|#\u00ecq=\u0018\"J\u00fe\u00abR\u00e8ea\n\u00ed\u00b80\u0003\u00dd\u00b7\u00e6\u00c0@Q/\u0019K\u00a8]\u00ce\u00a4\u0018\u00a0\u00c0\u0011\u0092\u00ae!\u00f5\u00dd\u00af\u00b6\u00e9s0e\u001a\u009c\r\u00e7@\u00c4\u00c4H\u00efb\u0005\u00ad\u00b6\u0096\u009a.~(F\u00bfg\u00e4\u0094\u0007\u009b@\u00bf\u00ec<";
                var5_4 = "`\u0007w\u00ad\u0086\t\u00e4\u00fb\u009bcGS\u0088\u00cd\u00c16(le\u001b\u009e\u00aduK\u0096\u00bf'[\u00e3\u00f0\u00abC\u00c0\u009fJ\\\u00b4q\u00a2\u00f5\u000f\u0092\u00d6\u00c1\u008f\u00de\u00d3(\u0010\u001d\u000b\u0016h\u009f\u009a\u00af\u00c8\u0013\u00bc\u001bd\u008b\u00cf\u00dfm\u0082\u00da\u00a0gX\u00b2mOnq\u008b,\u009a\u0014\u009dS\u00fd\u0095\u0006\u00e7\u0080\u00d9T\u00dfs/\u009f\u00cb\u00cc\u001cc\u0007\u00a6\u0089\u0002wQg\u0096\u0004\u00fb\u00f5\u0082y\u00dd`1H\u00aa\u00d6/\u00d3\u00c9\u00a1\u00c0\u00ea\u0088\u00d1\u00a4H\u0082\u00ca2\u008b\u0095\u009d%v\u00af^\u00fd\u00a7h\u008cC\u00b5\u00f6\u00aaBw]\u00a8\u0018\u00b57\u00eb,!D}\u00b0B5\u00eb\u000e\u00d7\u0007M\u00ae\u00ab\u00b8\u0093\u00f9%FW\u00e8\u0003\u0007!\u000e\u008aZN\u00a7\u00c8\u00f2\u0081\u0015\u000f\u00fc\u008b\u00d2\u0095\u008c\u00e6\u0094\u007f7\u00aei2d?\u0017\u00f3I\u00b2\u0005|#\u00ecq=\u0018\"J\u00fe\u00abR\u00e8ea\n\u00ed\u00b80\u0003\u00dd\u00b7\u00e6\u00c0@Q/\u0019K\u00a8]\u00ce\u00a4\u0018\u00a0\u00c0\u0011\u0092\u00ae!\u00f5\u00dd\u00af\u00b6\u00e9s0e\u001a\u009c\r\u00e7@\u00c4\u00c4H\u00efb\u0005\u00ad\u00b6\u0096\u009a.~(F\u00bfg\u00e4\u0094\u0007\u009b@\u00bf\u00ec<".length();
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
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00a1x\"\u00ed\u00c7\f4\u00a3)d.8:\u009b<\b";
                    var5_4 = "\u00a1x\"\u00ed\u00c7\f4\u00a3)d.8:\u009b<\b".length();
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
lbl27:
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
lbl38:
                // 1 sources

                ** continue;
            }
        }
        v7.a = var6_1;
        v7.b = new Integer[37];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3E73;
        if (b[n2] == null) {
            v7.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
