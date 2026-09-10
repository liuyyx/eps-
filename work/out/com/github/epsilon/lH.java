/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Function;

public final class lH
extends Enum<lH> {
    public static final /* enum */ lH EASE_IN_OUT_SINE;
    public static final /* enum */ lH EASE_IN_OUT_QUART;
    private static final lH[] U;
    public static final /* enum */ lH EASE_IN_BACK;
    public static final /* enum */ lH EASE_IN_CUBIC;
    public static final /* enum */ lH EASE_IN_OUT_EXPO;
    public static final /* enum */ lH EASE_IN_QUAD;
    public static final /* enum */ lH SIGMOID;
    public static final /* enum */ lH EASE_IN_OUT_QUAD;
    public static final /* enum */ lH EASE_OUT_ELASTIC;
    public static final /* enum */ lH EASE_IN_OUT_QUINT;
    public static final /* enum */ lH DECELERATE;
    public static final /* enum */ lH DYNAMIC_ISLAND;
    public static final /* enum */ lH EASE_OUT_EXPO;
    public static final /* enum */ lH LINEAR;
    public static final /* enum */ lH EASE_IN_SINE;
    public static final /* enum */ lH EASE_OUT_QUAD;
    public static final /* enum */ lH EASE_IN_OUT_CIRC;
    public static final /* enum */ lH EASE_OUT_CUBIC;
    public static final /* enum */ lH EASE_IN_CIRC;
    public static final /* enum */ lH EASE_OUT_QUART;
    public static final /* enum */ lH EASE_OUT_SINE;
    public static final /* enum */ lH EASE_IN_QUART;
    public static final /* enum */ lH EASE_OUT_QUINT;
    public static final /* enum */ lH EASE_IN_OUT_CUBIC;
    public static final /* enum */ lH EASE_OUT_CIRC;
    public static final /* enum */ lH EASE_IN_QUINT;
    public static final /* enum */ lH EASE_OUT_BACK;
    public static final /* enum */ lH SMOOTH_STEP;
    public static final /* enum */ lH EASE_IN_EXPO;
    private final Function<Float, Float> i;
    private static final long[] a;
    private static final Integer[] b;

    private static Float lambda$static$15(Float f) {
        return hi.a("G", (float)(1.0f - lH.h("bbgczUQqPbVWfIad", cos(double ), (double)((float)((double)hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * Math.PI * 0.5)))), (long)1097085248186378937L);
    }

    private static Float lambda$static$17(Float f) {
        return hi.a("G", (float)(1.0f - hi.a("G", (double)((float)(Math.PI * (double)hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * 0.5)), (long)665261795861296096L)), (long)1097085248186378937L);
    }

    private static Float lambda$static$9(Float f) {
        return hi.a("G", (float)(hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)1097085248186378937L);
    }

    public Function<Float, Float> Y() {
        return hi.a("\u00e9", (Object)((Object)this), (long)960064348578284275L);
    }

    private static Float lambda$static$6(Float f) {
        return hi.a("G", (float)(hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)1097085248186378937L);
    }

    private static Float lambda$static$24(Float f) {
        return hi.a("G", (float)(1.0f / (1.0f + (float)hi.a("G", (double)((double)(-hi.a("\u00a5", (Object)f, (long)1263586790430806583L))), (long)646017948905649334L))), (long)1097085248186378937L);
    }

    private static Float lambda$static$3(Float f) {
        return hi.a("G", (float)(lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f)), (long)1097085248186378937L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Float lambda$static$19(Float f) {
        Object object;
        boolean bl = Dl.S();
        Object object2 = hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
        float f2 = 1.0f;
        if (bl) {
            if (object2 == f2) {
                object = 1.0f;
                return lH.h("bbgczUQqPbVWfIad", valueOf(float ), (float)object);
            }
            object2 = 1.0f;
            f2 = (float)hi.a("G", (double)2.0, (double)(-10.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)679604324721902255L);
        }
        object = object2 - f2;
        return lH.h("bbgczUQqPbVWfIad", valueOf(float ), (float)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Float lambda$static$14(Float object) {
        Object object2;
        boolean bl = Dl.t();
        Object object3 = hi.a("\u00a5", (Object)object, (long)1263586790430806583L);
        if (!bl) {
            if ((double)object3 < 0.5) {
                object2 = 16.0f * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L);
                return hi.a("G", (float)object2, (long)1097085248186378937L);
            }
            object3 = 1.0f;
        }
        object = hi.a("G", (float)(hi.a("\u00a5", (Object)object, (long)1263586790430806583L) - 1.0f), (long)1097085248186378937L);
        object2 = object3 + 16.0f * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L);
        return hi.a("G", (float)object2, (long)1097085248186378937L);
    }

    private static Float lambda$static$12(Float f) {
        return hi.a("G", (float)(hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)1097085248186378937L);
    }

    public static /* bridge */ /* synthetic */ CallSite h(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static Float lambda$static$4(Float f) {
        return hi.a("G", (float)(hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * (2.0f - hi.a("\u00a5", (Object)f, (long)1263586790430806583L))), (long)1097085248186378937L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Float lambda$static$11(Float object) {
        Object object2;
        boolean bl = Dl.t();
        Object object3 = hi.a("\u00a5", (Object)object, (long)1263586790430806583L);
        if (!bl) {
            if ((double)object3 < 0.5) {
                object2 = 8.0f * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L);
                return hi.a("G", (float)object2, (long)1097085248186378937L);
            }
            object3 = 1.0f;
        }
        object = hi.a("G", (float)(hi.a("\u00a5", (Object)object, (long)1263586790430806583L) - 1.0f), (long)1097085248186378937L);
        object2 = object3 - 8.0f * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L);
        return hi.a("G", (float)object2, (long)1097085248186378937L);
    }

    private static Float lambda$static$2(Float f) {
        return hi.a("G", (float)((float)(-2.0 * hi.a("G", (double)((double)lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f)), (double)3.0, (long)679604324721902255L) + 3.0 * hi.a("G", (double)((double)hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (double)2.0, (long)679604324721902255L))), (long)1097085248186378937L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[29];
                        var12_1 = 0;
                        var11_2 = ">r\u0012>\u001e|L/l\u0004#\u0011|\r>r\u0012>\u001ezW$b\u00142\u000fg\f>r\u0012>\u001ezW$b\u0014:\u0005\f>r\u0012>\u001ezW$p\b)\u0002\u000e>r\u0012>\u001e|L/l\u0010.\b}M\r>r\u0012>\u001ezW$b\u0014:\u0013g\r>r\u0012>\u001e|L/l\u0010.\u0000w\u0011>r\u0012>\u001ezW$|\u0014/\u001ebL2}\u0015\u0010>r\u0012>\u001e|L/l\u00047\u0000`M2p\r>r\u0012>\u001e|L/l\u00022\u0013p\u0010>r\u0012>\u001ezW$|\u0014/\u001ebL:w\n?v\u0002>\rvK:g\u0004\f>r\u0012>\u001ezW$q\u00008\n\r>r\u0012>\u001ezW$p\u00149\bp\r>r\u0012>\u001e|L/l\u00122\u000fv\u0010>r\u0012>\u001ezW$|\u0014/\u001epP)p\f>r\u0012>\u001ezW$v\u0019+\u000e\f>r\u0012>\u001ezW$`\b5\u0004\u000e>r\u0012>\u001e|L/l\u0010.\u0000aM\u0010>r\u0012>\u001ezW$|\u0014/\u001evA+|\u000e?j\u000f:\fzZ$z\u00127\u0000}]\u0007(z\u00066\u000ez]\r>r\u0012>\u001e|L/l\u0003:\u0002x\u00067z\u000f>\u0000a\u0010>r\u0012>\u001ezW$|\u0014/\u001e`P5v\u000b(~\u000e4\u0015{F(g\u0004+\u0011>r\u0012>\u001ezW$|\u0014/\u001ebL:a\u0015";
                        var13_3 = ">r\u0012>\u001e|L/l\u0004#\u0011|\r>r\u0012>\u001ezW$b\u00142\u000fg\f>r\u0012>\u001ezW$b\u0014:\u0005\f>r\u0012>\u001ezW$p\b)\u0002\u000e>r\u0012>\u001e|L/l\u0010.\b}M\r>r\u0012>\u001ezW$b\u0014:\u0013g\r>r\u0012>\u001e|L/l\u0010.\u0000w\u0011>r\u0012>\u001ezW$|\u0014/\u001ebL2}\u0015\u0010>r\u0012>\u001e|L/l\u00047\u0000`M2p\r>r\u0012>\u001e|L/l\u00022\u0013p\u0010>r\u0012>\u001ezW$|\u0014/\u001ebL:w\n?v\u0002>\rvK:g\u0004\f>r\u0012>\u001ezW$q\u00008\n\r>r\u0012>\u001ezW$p\u00149\bp\r>r\u0012>\u001e|L/l\u00122\u000fv\u0010>r\u0012>\u001ezW$|\u0014/\u001epP)p\f>r\u0012>\u001ezW$v\u0019+\u000e\f>r\u0012>\u001ezW$`\b5\u0004\u000e>r\u0012>\u001e|L/l\u0010.\u0000aM\u0010>r\u0012>\u001ezW$|\u0014/\u001evA+|\u000e?j\u000f:\fzZ$z\u00127\u0000}]\u0007(z\u00066\u000ez]\r>r\u0012>\u001e|L/l\u0003:\u0002x\u00067z\u000f>\u0000a\u0010>r\u0012>\u001ezW$|\u0014/\u001e`P5v\u000b(~\u000e4\u0015{F(g\u0004+\u0011>r\u0012>\u001ezW$|\u0014/\u001ebL:a\u0015".length();
                        var10_4 = 13;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 107;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "L\u0000`Ll\u000e>]\u001ep\\q\b(\u0011L\u0000`Ll\b%V\u000ef]l\u0002>K\bp";
                            var13_3 = "L\u0000`Ll\u000e>]\u001ep\\q\b(\u0011L\u0000`Ll\b%V\u000ef]l\u0002>K\bp".length();
                            var10_4 = 14;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 25;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
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
                                    v15 = 16;
                                    break;
                                }
                                case 1: {
                                    v15 = 88;
                                    break;
                                }
                                case 2: {
                                    v15 = 42;
                                    break;
                                }
                                case 3: {
                                    v15 = 16;
                                    break;
                                }
                                case 4: {
                                    v15 = 42;
                                    break;
                                }
                                case 5: {
                                    v15 = 88;
                                    break;
                                }
                                default: {
                                    v15 = 114;
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
                var0_7 = 895412318178715010L;
                var6_8 = new long[47];
                var3_9 = 0;
                var4_10 = "\u00f3\u00c6m G\u0099v\u00a8\u009c[]\u001f\u0001\u00aah\u008b0\u00b5\u00c6\u0084L~2\u00bd\u0080\u00f0;3.f\r\u0092\u00fc>\u0097\u0087\u00c7\u00a8\u00ddx\n\u008f\u00c6Eq\u00ab\u00ee%\u009f\u00b6\u0092\u00f3]6\u00d1\u00fa\u00b2\u0001\u00f7\u0015-dp\u00b9`/\u00a4\u00c4\u001f\u000e\u001dy~\u00a0X\u009aw\u0001&\u00a9\u00da\u0099a\u0095R\u00ecl\u00df\u0016A+NX\u00fe-6k\u0083E\u0005\u00df\u00a9qx/\u0083\u0084\u009c\u00b0q?\u00b2\u00c3\u0000\u0093\u0001\u00aa3\u00b2\u0094;\b\u001f\u00b10\u0011\u0010VSg=\u0092\u00bd7\u00bc\u00e0\u0099\u00a1\u00adUw\u001a\u00e5?R\u00e8\b\u00eb\"{q$bz\u0085\u0096\u00f0\u00a4\u008eTR\u0002\u00a6\u001d\u00b6)\u00fb\u00f1S\u00c8z\u00d0\u00c6J\u0097\u0014\u00eb\f\u00a7\u008db?v\u00db\u00db<\u0089Z\u00c4|\u009a\u0090\u00ac\u00afg\u0083\u00af5\u00a1G]\u00a4f\u0088\u00b2\u00ce(\u0003\u00a4\u0093<\u00b9\u00a8`>_b\u00fc\u00ba\u0019,\u009f\u0013\u00e9\u00ba\u009bu\u00ee\u00ff\u0012\u00a4\u001d\u00fc%V\u00e5\u00ae_\u0094\u0085\u00cct\u00bbe\u00d9\nH\u00a8\u008a\u00e4\u00c3\u0091\u0018\u001f|=e\u00e5\u00d7\u0017\u00c8o\u008e\u00ad!_\u00f9\u00d5\u008c\u00ec\u00c3k.3I3\u00b7\u00c0*o\u0012\u00f8\u00a95N\u00e8O\u00d5*\u0016\u00f9jc)_\u00d7\u00a7\u00c1\f\u0095,\u0085\u00a8\\_\u00ed\u00fbs\u0003\u00f3\u00c8\u00ab>:\u00f2~.\u0000\u00fcO$\u00e2x\u00af\u00a3c\u00ea\u00d5\u00daQ\u00e8\u00c9_\u009e\u0001\u0093\u0019\u0083\u00aa\u00e4\u00fb\u00c5B\u00c5e6\u00ca\u00e9\u0089(\u00e3nM]\u0093\u0091B<6\u0082";
                var5_11 = "\u00f3\u00c6m G\u0099v\u00a8\u009c[]\u001f\u0001\u00aah\u008b0\u00b5\u00c6\u0084L~2\u00bd\u0080\u00f0;3.f\r\u0092\u00fc>\u0097\u0087\u00c7\u00a8\u00ddx\n\u008f\u00c6Eq\u00ab\u00ee%\u009f\u00b6\u0092\u00f3]6\u00d1\u00fa\u00b2\u0001\u00f7\u0015-dp\u00b9`/\u00a4\u00c4\u001f\u000e\u001dy~\u00a0X\u009aw\u0001&\u00a9\u00da\u0099a\u0095R\u00ecl\u00df\u0016A+NX\u00fe-6k\u0083E\u0005\u00df\u00a9qx/\u0083\u0084\u009c\u00b0q?\u00b2\u00c3\u0000\u0093\u0001\u00aa3\u00b2\u0094;\b\u001f\u00b10\u0011\u0010VSg=\u0092\u00bd7\u00bc\u00e0\u0099\u00a1\u00adUw\u001a\u00e5?R\u00e8\b\u00eb\"{q$bz\u0085\u0096\u00f0\u00a4\u008eTR\u0002\u00a6\u001d\u00b6)\u00fb\u00f1S\u00c8z\u00d0\u00c6J\u0097\u0014\u00eb\f\u00a7\u008db?v\u00db\u00db<\u0089Z\u00c4|\u009a\u0090\u00ac\u00afg\u0083\u00af5\u00a1G]\u00a4f\u0088\u00b2\u00ce(\u0003\u00a4\u0093<\u00b9\u00a8`>_b\u00fc\u00ba\u0019,\u009f\u0013\u00e9\u00ba\u009bu\u00ee\u00ff\u0012\u00a4\u001d\u00fc%V\u00e5\u00ae_\u0094\u0085\u00cct\u00bbe\u00d9\nH\u00a8\u008a\u00e4\u00c3\u0091\u0018\u001f|=e\u00e5\u00d7\u0017\u00c8o\u008e\u00ad!_\u00f9\u00d5\u008c\u00ec\u00c3k.3I3\u00b7\u00c0*o\u0012\u00f8\u00a95N\u00e8O\u00d5*\u0016\u00f9jc)_\u00d7\u00a7\u00c1\f\u0095,\u0085\u00a8\\_\u00ed\u00fbs\u0003\u00f3\u00c8\u00ab>:\u00f2~.\u0000\u00fcO$\u00e2x\u00af\u00a3c\u00ea\u00d5\u00daQ\u00e8\u00c9_\u009e\u0001\u0093\u0019\u0083\u00aa\u00e4\u00fb\u00c5B\u00c5e6\u00ca\u00e9\u0089(\u00e3nM]\u0093\u0091B<6\u0082".length();
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
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00e4v\u00e8V,\u00c6^\u0083>\u00f8\u0003\u0014\u00d5\u00f1\u0093\u00be";
                    var5_11 = "\u00e4v\u00e8V,\u00c6^\u0083>\u00f8\u0003\u0014\u00d5\u00f1\u0093\u00be".length();
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
lbl123:
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
lbl134:
                // 1 sources

                ** continue;
            }
        }
        lH.a = var6_8;
        lH.b = new Integer[47];
        lH.LINEAR = new lH((Object)var8[23], 0, (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.DECELERATE = new lH((Object)var8[11], 1, (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$1(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.SMOOTH_STEP = new lH((Object)var8[25], 2, (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$2(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_QUAD = new lH((Object)var8[2], 3, (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$3(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_QUAD = new lH((Object)var8[6], 4, (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$4(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_OUT_QUAD = new lH((Object)var8[10], 5, (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$5(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_CUBIC = new lH((Object)var8[13], lH.a(31491, 473843485240372009L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$6(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_CUBIC = new lH((Object)var8[27], lH.a(14021, 3152340076053260014L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$7(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_OUT_CUBIC = new lH((Object)var8[28], lH.a(6485, 3114385614441630037L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$8(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_QUART = new lH((Object)var8[5], lH.a(8060, 7405234833815687006L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$9(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_QUART = new lH((Object)var8[18], lH.a(20867, 3214294677362540949L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$10(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_OUT_QUART = new lH((Object)var8[26], lH.a(1341, 2229660164819604784L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$11(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_QUINT = new lH((Object)var8[1], lH.a(18804, 3303706637557733742L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$12(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_QUINT = new lH((Object)var8[4], lH.a(23967, 901990994508189068L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$13(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_OUT_QUINT = new lH((Object)var8[7], lH.a(19395, 378737284753464275L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$14(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_SINE = new lH((Object)var8[17], lH.a(18205, 7050951339689285401L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$15(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_SINE = new lH((Object)var8[14], lH.a(26857, 3944899168270760171L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$16(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_OUT_SINE = new lH((Object)var8[24], lH.a(10858, 8050218122493590084L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$17(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_EXPO = new lH((Object)var8[16], lH.a(21701, 4822361284541973719L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$18(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_EXPO = new lH((Object)var8[0], lH.a(22694, 7717960239339997351L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$19(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_OUT_EXPO = new lH((Object)var8[19], lH.a(5849, 7963319363017492216L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$20(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_CIRC = new lH((Object)var8[3], lH.a(1257, 6812114397211940079L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$21(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_CIRC = new lH((Object)var8[9], lH.a(3707, 1603076077018996325L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$22(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_OUT_CIRC = new lH((Object)var8[15], lH.a(26054, 5173952029723997635L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$23(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.SIGMOID = new lH((Object)var8[21], lH.a(17214, 7267899442184917784L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$24(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_ELASTIC = new lH((Object)var8[8], lH.a(14951, 6789240773354547790L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$25(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_IN_BACK = new lH((Object)var8[12], lH.a(26114, 7883607522202662438L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$26(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.EASE_OUT_BACK = new lH((Object)var8[22], lH.a(2481, 3178312067766704548L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$27(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.DYNAMIC_ISLAND = new lH((Object)var8[20], lH.a(15650, 254117872098831670L), (Function<Float, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$28(java.lang.Float ), (Ljava/lang/Float;)Ljava/lang/Float;)());
        lH.U = hi.a("G", (Object)new Object[0], (long)464167261584690682L);
    }

    private static Float lambda$static$0(Float f) {
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Float lambda$static$5(Float f) {
        Object object;
        boolean bl = Dl.t();
        Object object2 = hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
        if (!bl) {
            if ((double)object2 < 0.5) {
                object = 2.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
                return hi.a("G", (float)object, (long)1097085248186378937L);
            }
            object2 = -1.0f;
        }
        object = object2 + (4.0f - 2.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
        return hi.a("G", (float)object, (long)1097085248186378937L);
    }

    private static Float lambda$static$13(Float object) {
        object = hi.a("G", (float)(hi.a("\u00a5", (Object)object, (long)1263586790430806583L) - 1.0f), (long)1097085248186378937L);
        return lH.h("bbgczUQqPbVWfIad", valueOf(float ), (float)(1.0f + hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L)));
    }

    private static Float lambda$static$27(Float object) {
        object = lH.h("bbgczUQqPbVWfIad", valueOf(float ), (float)(hi.a("\u00a5", (Object)object, (long)1263586790430806583L) - 1.0f));
        return hi.a("G", (float)(1.0f + hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) * (2.70158f * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) + 1.70158f)), (long)1097085248186378937L);
    }

    private static Float lambda$static$25(Float f) {
        float f2;
        block4: {
            Object object;
            block2: {
                boolean bl;
                block3: {
                    bl = Dl.S();
                    reference cfr_temp_0 = hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 0.0f;
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (!bl) break block2;
                    if (object != false) break block3;
                    f2 = 0.0f;
                    break block4;
                }
                f2 = (float)hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
                if (!bl) break block4;
                float f3 = f2 - 1.0f;
                object = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
            }
            f2 = object == false ? 1.0f : (float)(hi.a("G", (double)2.0, (double)(-10.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)679604324721902255L) * hi.a("G", (double)(((double)(lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f) * 10.0f) - 0.75) * 2.0943951023931953), (long)920621527924433365L) * 0.5 + 1.0);
        }
        return hi.a("G", (float)f2, (long)1097085248186378937L);
    }

    private static Float lambda$static$18(Float f) {
        boolean bl = Dl.t();
        float f2 = hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
        if (!bl) {
            f2 = f2 == 0.0f ? (float)0.0f : (float)hi.a("G", (double)2.0, (double)(10.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 10.0f), (long)679604324721902255L);
        }
        return hi.a("G", (float)f2, (long)1097085248186378937L);
    }

    private static Float lambda$static$21(Float f) {
        return lH.h("bbgczUQqPbVWfIad", valueOf(float ), (float)(1.0f - (float)hi.a("G", (double)(1.0f - lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)1236096628704034685L)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Float lambda$static$20(Float f) {
        Object object;
        float f2;
        block8: {
            Object object2;
            block7: {
                boolean bl = Dl.t();
                reference cfr_temp_0 = hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 0.0f;
                object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                if (!bl) {
                    if (object2 == false) {
                        f2 = 0.0f;
                        return hi.a("G", (float)f2, (long)1097085248186378937L);
                    }
                    reference cfr_temp_1 = hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 1.0f;
                    object2 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                }
                if (bl) break block7;
                if (object2 == false) {
                    f2 = 1.0f;
                    return hi.a("G", (float)f2, (long)1097085248186378937L);
                }
                object = lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f);
                if (bl) break block8;
                double d = (double)object - 0.5;
                object2 = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
            }
            if (object2 < 0) {
                f2 = (float)hi.a("G", (double)2.0, (double)(20.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 10.0f), (long)679604324721902255L) * 0.5f;
                return hi.a("G", (float)f2, (long)1097085248186378937L);
            }
            object = 2.0f - (float)hi.a("G", (double)2.0, (double)(-20.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) + 10.0f), (long)679604324721902255L);
        }
        f2 = (float)(object * 0.5f);
        return hi.a("G", (float)f2, (long)1097085248186378937L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Float lambda$static$8(Float f) {
        Object object;
        boolean bl = Dl.t();
        reference v0 = hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
        if (!bl) {
            if ((double)v0 < 0.5) {
                object = 4.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
                return hi.a("G", (float)object, (long)1097085248186378937L);
            }
            v0 = (hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 1.0f) * (2.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 2.0f) * (2.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 2.0f);
        }
        object = v0 + 1.0f;
        return hi.a("G", (float)object, (long)1097085248186378937L);
    }

    private static lH[] H(Object[] objectArray) {
        lH[] lHArray = new lH[lH.a(9321, 7406650865101829221L)];
        lHArray[0] = hi.a("j", (long)854163340964625499L);
        lHArray[1] = hi.a("j", (long)1067701384709836011L);
        lHArray[2] = hi.a("j", (long)1134504607802496720L);
        lHArray[3] = hi.a("j", (long)878157442020696100L);
        lHArray[4] = hi.a("j", (long)1289784726731582334L);
        lHArray[5] = hi.a("j", (long)782429841078036588L);
        lHArray[lH.a((int)4256, (long)7613537940166656187L)] = hi.a("j", (long)1141070949785232968L);
        lHArray[lH.a((int)28424, (long)5523729172678164245L)] = hi.a("j", (long)611443736556992631L);
        lHArray[lH.a((int)808, (long)535954237785658146L)] = hi.a("j", (long)358218834295740519L);
        lHArray[lH.a((int)14190, (long)4720911265617700686L)] = hi.a("j", (long)829053366185264252L);
        lHArray[lH.a((int)2538, (long)4582566549500320199L)] = hi.a("j", (long)393748583139932828L);
        lHArray[lH.a((int)21283, (long)3724704791785112352L)] = hi.a("j", (long)787281025959962629L);
        lHArray[lH.a((int)10488, (long)181278451970734326L)] = hi.a("j", (long)680149250987633368L);
        lHArray[lH.a((int)840, (long)6713783256702145364L)] = hi.a("j", (long)672306716171251617L);
        lHArray[lH.a((int)30743, (long)3856542133874534430L)] = hi.a("j", (long)687065509554262140L);
        lHArray[lH.a((int)25222, (long)9172735161212056217L)] = hi.a("j", (long)1198086359087985206L);
        lHArray[lH.a((int)7096, (long)393002019111488439L)] = hi.a("j", (long)447210230030827536L);
        lHArray[lH.a((int)26219, (long)5227608463371286138L)] = hi.a("j", (long)1148411336717451103L);
        lHArray[lH.a((int)24834, (long)1066837762030874901L)] = hi.a("j", (long)725606897976408460L);
        lHArray[lH.a((int)24034, (long)8249329457476177357L)] = hi.a("j", (long)838248865710441676L);
        lHArray[lH.a((int)18211, (long)5061749831038605099L)] = hi.a("j", (long)1040600083952144213L);
        lHArray[lH.a((int)18978, (long)6644989231384762917L)] = hi.a("j", (long)1166011765294290954L);
        lHArray[lH.a((int)15635, (long)8852147406561537343L)] = hi.a("j", (long)825352871754616586L);
        lHArray[lH.a((int)31704, (long)5568390011799841729L)] = hi.a("j", (long)437905233229151846L);
        lHArray[lH.a((int)29738, (long)5757977340127945737L)] = hi.a("j", (long)1263689423369837526L);
        lHArray[lH.a((int)1191, (long)2658321767909971135L)] = hi.a("j", (long)495597323750066957L);
        lHArray[lH.a((int)11068, (long)5120167902255479579L)] = hi.a("j", (long)1201335900290250195L);
        lHArray[lH.a((int)7449, (long)4357126452339494162L)] = hi.a("j", (long)638894564722629820L);
        lHArray[lH.a((int)24537, (long)8693927071087136753L)] = hi.a("j", (long)612526800685390404L);
        return lHArray;
    }

    private lH(Function<Float, Float> function) {
        this.i = function;
    }

    public static lH[] values() {
        return (lH[])((Enum)((Object)hi.a("j", (long)942448496666410514L))).clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Float lambda$static$23(Float f) {
        float f2;
        boolean bl = Dl.S();
        Object object = (double)hi.a("\u00a5", (Object)f, (long)1263586790430806583L);
        if (bl) {
            if (object < 0.5) {
                f2 = (1.0f - (float)lH.h("bbgczUQqPbVWfIad", sqrt(double ), (double)(1.0f - 4.0f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)))) * 0.5f;
                return hi.a("G", (float)f2, (long)1097085248186378937L);
            }
            object = hi.a("G", (double)(1.0f - 4.0f * (hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 1.0f) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)1236096628704034685L);
        }
        f2 = ((float)object + 1.0f) * 0.5f;
        return hi.a("G", (float)f2, (long)1097085248186378937L);
    }

    private static Float lambda$static$7(Float object) {
        object = hi.a("G", (float)(hi.a("\u00a5", (Object)object, (long)1263586790430806583L) - 1.0f), (long)1097085248186378937L);
        return hi.a("G", (float)(hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) + 1.0f), (long)1097085248186378937L);
    }

    private static Float lambda$static$1(Float f) {
        return hi.a("G", (float)(1.0f - (lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)f) - 1.0f) * (hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 1.0f)), (long)1097085248186378937L);
    }

    private static Float lambda$static$16(Float f) {
        return hi.a("G", (float)hi.a("G", (double)((float)((double)hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * Math.PI * 0.5)), (long)651411597689335820L), (long)1097085248186378937L);
    }

    public static lH valueOf(String string) {
        return (lH)((Object)hi.a("G", lH.class, (Object)string, (long)703426484721789552L));
    }

    private static Float lambda$static$10(Float object) {
        object = hi.a("G", (float)(lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) - 1.0f), (long)1097085248186378937L);
        return hi.a("G", (float)(1.0f - hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * lH.h("bbgczUQqPbVWfIad", floatValue(), (Float)object) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L)), (long)1097085248186378937L);
    }

    private static Float lambda$static$22(Float object) {
        object = hi.a("G", (float)(hi.a("\u00a5", (Object)object, (long)1263586790430806583L) - 1.0f), (long)1097085248186378937L);
        return hi.a("G", (float)((float)hi.a("G", (double)(1.0f - hi.a("\u00a5", (Object)object, (long)1263586790430806583L) * hi.a("\u00a5", (Object)object, (long)1263586790430806583L)), (long)1236096628704034685L)), (long)1097085248186378937L);
    }

    private static Float lambda$static$28(Float f) {
        return lH.h("bbgczUQqPbVWfIad", valueOf(float ), (float)((float)(1.0 - hi.a("G", (double)((double)hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * Math.PI * (0.2 + 2.5 * hi.a("G", (double)((double)hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (double)3.0, (long)679604324721902255L))), (long)892033460936563353L) * hi.a("G", (double)((double)(-hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * 5.0f)), (long)646017948905649334L))));
    }

    private static Float lambda$static$26(Float f) {
        return hi.a("G", (float)(2.70158f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) - 1.70158f * hi.a("\u00a5", (Object)f, (long)1263586790430806583L) * hi.a("\u00a5", (Object)f, (long)1263586790430806583L)), (long)1097085248186378937L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x500A;
        if (b[n2] == null) {
            lH.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
