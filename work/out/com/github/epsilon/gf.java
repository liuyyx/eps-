/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.e8;
import com.github.epsilon.gs;
import com.github.epsilon.hi;
import com.github.epsilon.iJ;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.resources.Identifier;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.Vec3;

final class gf
extends gs {
    final iJ d;
    private final int a;
    private static final long[] e;
    private static final Integer[] f;

    /*
     * Exception decompiling
     */
    @Override
    protected void M(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* bridge */ /* synthetic */ CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private gf(iJ iJ2, Vec3 vec3, int n) {
        block4: {
            block2: {
                block3: {
                    boolean bl = Dl.S();
                    iJ iJ3 = iJ2;
                    Objects.requireNonNull(iJ3);
                    this.d = iJ3;
                    boolean bl2 = bl;
                    super(iJ2, vec3, iJ2.k(gf.b(1168, 5703268132404838636L), gf.b(31814, 4148533119500859413L)), new Identifier[]{hi.a("j", (long)760717945844067253L)[hi.a("\u00e9", (Object)iJ2, (long)997764946395687615L).nextInt(((CallSite)hi.a("j", (long)760717945844067253L)).length)]});
                    this.a = n;
                    hi.a("\u00f2", (Object)this, (float)gf.g("TgA4Nduw7BoNFepd", d(), (e8)((Object)hi.a("\u00e9", (Object)iJ2, (long)996942242067786222L))), (long)813589640703568556L);
                    hi.a("\u00f2", (Object)this, (float)0.1f, (long)737001268924615182L);
                    hi.a("\u00f2", (Object)this, (double)((float)hi.a("\u00a5", (Object)iJ2, (int)gf.b(27556, 3618707634420494292L), (int)gf.b(16218, 2324910024490285836L), (long)402873961194657983L) / 25.0f), (long)609409853844784478L);
                    hi.a("\u00f2", (Object)this, (double)((float)hi.a("\u00a5", (Object)iJ2, (int)gf.b(15680, 8002312874796316951L), (int)gf.b(23456, 2228061778315517894L), (long)402873961194657983L) / 25.0f), (long)1078706094324596397L);
                    hi.a("\u00f2", (Object)this, (double)((float)gf.g("TgA4Nduw7BoNFepd", k(int int ), (iJ)iJ2, (int)gf.b(15680, 8002312874796316951L), (int)gf.b(23456, 2228061778315517894L)) / 25.0f), (long)669321080678999846L);
                    hi.a("\u00f2", (Object)this, (float)1.0f, (long)1041393923578088373L);
                    hi.a("\u00f2", (Object)this, (boolean)true, (long)839845615772263865L);
                    if (!bl2) break block2;
                    if (gf.g("TgA4Nduw7BoNFepd", nextBoolean(), (RandomSource)hi.a("\u00e9", (Object)iJ2, (long)997764946395687615L)) == false) break block3;
                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)1009326797419192685L);
                    hi.a("\u00f2", (Object)this, (float)1.0f, (long)748132799987884835L);
                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)1334802402800276645L);
                    if (bl2) break block4;
                }
                hi.a("\u00f2", (Object)this, (float)1.0f, (long)1009326797419192685L);
                hi.a("\u00f2", (Object)this, (float)1.0f, (long)748132799987884835L);
            }
            hi.a("\u00f2", (Object)this, (float)0.0f, (long)1334802402800276645L);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 735371026900212807L;
                var6_1 = new long[58];
                var3_2 = 0;
                var4_3 = "\u00cf\u00c2\u00f3\u009c*ks \u009f\u008abQL\u00e75`\u001e\u0080~\u0019\u00daXDW\txNuG\u0004\u00d6\u00b0\u00e7\u00a6Dt\u00a9\u0097\u0019\u0093|\u0094\u008d\u0088\u00e1\u00f6\u00ef\u008eh\f\u0006\u001b\u00cc\u00df\fe\u008d\u00bd\u00b5\u000b\u00b7\u0084\u00f0\u00bfW\u00bdVEMY\u00a7\u0019t\u00b6\u00eep_\u00f9\u001c\u00edw\u00ac\u009d\u00ab\u00b6K\u009c\u00b5\u0082\u00f6\u00ed\\\u00d7!\u0005\u0091J\u00bd\u00f0CAr\u0099\u00e3\u00e9\u0017\u00c1\u00a6\u0082RO\u00a0\u00a6Q\u00f7c)_\u00a7B\u0096>vE^w1\u00c6~Wd>v\u009fC\u008b\u0087:)t\u009bsS\u00c8\u0001g\u00d2\u00b1\u00b5\u00da\u009c\u00dd\u00bb\u0006\u00c5\u00d6/\u00da\u0086$\u00ef\u00c4HR\u00be\u00067\u0090\u00a2\u0088G\u00f2A\u00ab)\u0096\u0005\u0001Mji\u009c\u001au\u00cdt\u00d9h0z,t\u00fblU\u00d9\u00c3\u00c7\u00a4\u00f5@KU\u00cas&BJ{\u0091\u00fc\u0090\u0086\u0099^\u00f9\u00f3\u0087\u00c1\f3_\u00ce\u0017\u00ca\u0097\u0012u\u00a5\u00cf\u00a0\u0019/\u0018\"\u0007\u00f8 7\u00f8]\u00d2Z(\u00915v\u00156-F\u001e\r\u00ff\u00a6P\u00c7\u00ba\u00a5\u00c7\u00f4\u00fc\u00a7A\b\u00d0\u00adP \u00bbZ\u00a6\u0017\u0013u\u00f6x\u00f3\u00d1\u00d6\u00e9w\u00cf\u00fd\u009fP~\u00cd\u00e5\u00e2h^<\u00c3\n\u00cb<\u00a08\u007f\u00eaJ\u00e4b\u00b3f6\u00ac\u00a7\u00fdcTK\u0007Vr\u0002\u0017\u0099\u00e9\bPN\u00bc\u0081\u0097d\u00a6\n\u0094\u00e1f\u008a\u00cb\u0012#\u0094\u00c4\u00ff\u0088{\u00e1|\u0002\rR\u008a9\u00f3\u0010,\u00c9\u0086=LX\u00dc\u0099\u00d5\u00dd~\u00d1\u00ff\u0000\u00c4L\u00c7\u00dc\rGG-\u00eb\u00f8\u001b\u0081\u0017;\u00cdk0E\u008d\u00de\u001d\u00a6U\u00f9:\u0007[5\u00ef-\u0011\u000e\u00bfVH\r\u008e\u008d\u00f4C:\u00df\n\u0006\u00cc\u00d0ED\u001f\u00ee\u0013\u0099H\u00e2\u0019\u00a9\u0018\u00fd\u008e\u009c&\u00c9\\,\u00a2\u00b7z\u00d0\u0015\u00b3\u0083 \u009c\u009c\u00c6\u008d!\u00a1E#\u0094\u00dd\u00f0\u00c3";
                var5_4 = "\u00cf\u00c2\u00f3\u009c*ks \u009f\u008abQL\u00e75`\u001e\u0080~\u0019\u00daXDW\txNuG\u0004\u00d6\u00b0\u00e7\u00a6Dt\u00a9\u0097\u0019\u0093|\u0094\u008d\u0088\u00e1\u00f6\u00ef\u008eh\f\u0006\u001b\u00cc\u00df\fe\u008d\u00bd\u00b5\u000b\u00b7\u0084\u00f0\u00bfW\u00bdVEMY\u00a7\u0019t\u00b6\u00eep_\u00f9\u001c\u00edw\u00ac\u009d\u00ab\u00b6K\u009c\u00b5\u0082\u00f6\u00ed\\\u00d7!\u0005\u0091J\u00bd\u00f0CAr\u0099\u00e3\u00e9\u0017\u00c1\u00a6\u0082RO\u00a0\u00a6Q\u00f7c)_\u00a7B\u0096>vE^w1\u00c6~Wd>v\u009fC\u008b\u0087:)t\u009bsS\u00c8\u0001g\u00d2\u00b1\u00b5\u00da\u009c\u00dd\u00bb\u0006\u00c5\u00d6/\u00da\u0086$\u00ef\u00c4HR\u00be\u00067\u0090\u00a2\u0088G\u00f2A\u00ab)\u0096\u0005\u0001Mji\u009c\u001au\u00cdt\u00d9h0z,t\u00fblU\u00d9\u00c3\u00c7\u00a4\u00f5@KU\u00cas&BJ{\u0091\u00fc\u0090\u0086\u0099^\u00f9\u00f3\u0087\u00c1\f3_\u00ce\u0017\u00ca\u0097\u0012u\u00a5\u00cf\u00a0\u0019/\u0018\"\u0007\u00f8 7\u00f8]\u00d2Z(\u00915v\u00156-F\u001e\r\u00ff\u00a6P\u00c7\u00ba\u00a5\u00c7\u00f4\u00fc\u00a7A\b\u00d0\u00adP \u00bbZ\u00a6\u0017\u0013u\u00f6x\u00f3\u00d1\u00d6\u00e9w\u00cf\u00fd\u009fP~\u00cd\u00e5\u00e2h^<\u00c3\n\u00cb<\u00a08\u007f\u00eaJ\u00e4b\u00b3f6\u00ac\u00a7\u00fdcTK\u0007Vr\u0002\u0017\u0099\u00e9\bPN\u00bc\u0081\u0097d\u00a6\n\u0094\u00e1f\u008a\u00cb\u0012#\u0094\u00c4\u00ff\u0088{\u00e1|\u0002\rR\u008a9\u00f3\u0010,\u00c9\u0086=LX\u00dc\u0099\u00d5\u00dd~\u00d1\u00ff\u0000\u00c4L\u00c7\u00dc\rGG-\u00eb\u00f8\u001b\u0081\u0017;\u00cdk0E\u008d\u00de\u001d\u00a6U\u00f9:\u0007[5\u00ef-\u0011\u000e\u00bfVH\r\u008e\u008d\u00f4C:\u00df\n\u0006\u00cc\u00d0ED\u001f\u00ee\u0013\u0099H\u00e2\u0019\u00a9\u0018\u00fd\u008e\u009c&\u00c9\\,\u00a2\u00b7z\u00d0\u0015\u00b3\u0083 \u009c\u009c\u00c6\u008d!\u00a1E#\u0094\u00dd\u00f0\u00c3".length();
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
                    var4_3 = "s\u0098\u00a0>\u00c7\u0017P7\u001a\u00e0\u00fbySr\u00dc\u0011";
                    var5_4 = "s\u0098\u00a0>\u00c7\u0017P7\u001a\u00e0\u00fbySr\u00dc\u0011".length();
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
        gf.e = var6_1;
        gf.f = new Integer[58];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4476;
        if (f[n2] == null) {
            gf.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }
}
