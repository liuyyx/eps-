/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;

public class gC {
    private static e[] N;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Exception decompiling
     */
    public static double C(double var0, double var2_1) {
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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static float I(float f, float f2) {
        Object object;
        Object object2 = (gC.a(31432, 5178142037626955404L) * gC.a(9496, 3320926196675410300L) + gC.a(5131, 5968360119785244781L) + gC.a(23378, 1927234147427649309L) ^ gC.a(17810, 3416354427131763151L)) + gC.a(31382, 7635747656110352087L);
        block8: while (true) {
            switch (object2) {
                default: {
                    if (!(f >= f2)) break;
                    object2 = (gC.a(15557, 7802454334356873468L) - gC.a(19976, 6927733270395458136L) - gC.a(9203, 5554189036663340945L)) / gC.a(7340, 3276374105937068188L) - gC.a(28077, 4108286627792597446L) - gC.a(8885, 1016260298132848324L);
                    continue block8;
                }
                case -59161971: {
                    object = f;
                    object2 = (gC.a(28359, 6113062634293768880L) ^ gC.a(774, 8563766717110968186L)) * gC.a(4936, 952372724897369861L) / gC.a(28734, 6928994636887436300L) + gC.a(6136, 2729982608508210061L);
                    break block8;
                }
                case -59161970: {
                    object = hi.a("\u00a5", (Object)hi.a("G", (long)1023248923640009163L), (float)f, (float)hi.a("G", (float)f2, (long)562509816713192926L), (long)1026499604371883680L);
                    object2 = (gC.a(28376, 307229380153881216L) ^ gC.a(30459, 8779222353515195082L)) * gC.a(26494, 6277960047422651223L) / gC.a(4475, 3759242754974338309L) + gC.a(17895, 3587293021618805133L);
                    break block8;
                }
                case -59161969: {
                    throw null;
                }
            }
            object2 = gC.U("XMULi1pI9ZwJurQA", max(int int ), (int)(gC.a(15121, 7637806800207177576L) * gC.a(6689, 1538004288614254163L) ^ gC.a(30592, 2174537111817628606L)), (int)gC.a(5433, 2943057586656528759L)) / 3 - gC.a(30049, 6667545670473951540L);
        }
        block9: while (true) {
            switch (object2) {
                case -286662797: {
                    gC.U("XMULi1pI9ZwJurQA", x());
                    object2 = (gC.a(2125, 7432749180901381173L) - gC.a(4172, 7148290367539301397L) + gC.a(23135, 8483889980989801987L) + gC.a(22232, 1117003369688435339L)) * gC.a(10222, 2255409888690928529L) - gC.a(7075, 9179484951696230379L);
                    continue block9;
                }
            }
            break;
        }
        return object;
    }

    public static /* bridge */ /* synthetic */ CallSite U(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private gC() {
    }

    /*
     * Exception decompiling
     */
    public static int H(int var0, int var1_1) {
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

    public static void F(e[] eArray) {
        N = eArray;
    }

    public static e[] P() {
        return N;
    }

    static {
        IlilIlIlil.registerNativesForClass((int)19, gC.class);
        Hidden0.special_clinit_19_70(gC.class);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5C79;
        if (b[n2] == null) {
            gC.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
