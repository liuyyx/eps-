/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ServerboundUseItemOnPacket
 *  net.minecraft.network.protocol.game.ServerboundUseItemPacket
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.dQ;
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
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundUseItemOnPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;

public class n
extends e {
    public static final n v;
    private final Queue<Packet<?>> l = new ConcurrentLinkedQueue();
    private int m;
    private int a;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)n.c(13414, 1067342786214598384L), (long)724006202282439440L);
        hi.a("\u00f2", (Object)this, (int)0, (long)1193179019870221635L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1259474678846753224L), (long)646534307489324991L);
    }

    /*
     * Exception decompiling
     */
    @yE
    private void s(dR var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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

    private n() {
        super(b, (vY)((Object)hi.a("j", (long)456237291118568391L)));
    }

    public static /* bridge */ /* synthetic */ CallSite I(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)24, n.class);
        Hidden0.special_clinit_24_40(n.class);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void j(dQ var1_1) {
        block14: {
            block13: {
                block12: {
                    var2_2 = Dl.S();
                    var4_3 /* !! */  = n.c(18397, 9037227696494273902L) ^ n.c(29491, 4112603367990284692L) ^ n.c(27836, 1572302603905060377L);
                    if (var2_2) {
                        switch (var4_3 /* !! */ ) {
                            case 363500530: {
                                hi.a("G", (long)510943974080801881L);
                                break;
                            }
                        }
                    }
                    var3_4 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L);
                    v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)1193179019870221635L);
                    if (!var2_2) break block12;
                    if (v0 /* !! */  == false) break block13;
                    v0 /* !! */  = (CallSite)(n.c(22112, 8606081405536040183L) / n.c(2379, 1405003351548275668L) / n.c(32555, 761173073051704820L) ^ n.c(1814, 2387984438193792499L));
                }
                var4_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) break block14;
            }
            var4_3 /* !! */  = (n.c(8075, 6081356324538334517L) * n.c(23587, 7531352425612443264L) ^ n.c(5192, 2408664841924458209L)) - n.c(28573, 5686748123818020180L);
            if (!var2_2) ** GOTO lbl44
        }
        block9: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    v1 = var3_4 instanceof ServerboundUseItemPacket;
                    if (!var2_2) ** GOTO lbl45
                    if (v1 != 0) ** GOTO lbl44
                    ** GOTO lbl46
                }
                case 498913879: {
                    v2 = var3_4 instanceof ServerboundUseItemOnPacket;
                    if (!var2_2) ** GOTO lbl49
                    if (v2 == 0) ** GOTO lbl48
                    ** GOTO lbl50
                }
                case 498913877: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1259474678846753224L), (Object)var3_4, (long)1313612628732931680L);
                    hi.a("\u00a5", (Object)var1_1, (long)1159641526413061244L);
                    hi.a("\u00f2", (Object)this, (int)1, (long)1193179019870221635L);
                    if (!var2_2) {
                        return;
                    }
                    ** GOTO lbl52
                }
                case 498913876: {
                    return;
                }
lbl44:
                // 2 sources

                v1 = var4_3 /* !! */  = hi.a("G", (int)(n.c(17856, 973960894705690403L) * n.c(590, 1333579405677502631L)), (int)n.c(17485, 8056968397959063177L), (long)834203424483934088L) - n.c(8627, 8171195729502077726L) + n.c(28179, 9183136786495130758L) ^ n.c(32206, 5082398554863558508L);
lbl45:
                // 2 sources

                if (var2_2) continue block9;
lbl46:
                // 2 sources

                var4_3 /* !! */  = (n.c(30165, 1533287455599613697L) ^ n.c(8360, 6010888505496994313L)) + n.c(1186, 8643932024296580688L) - n.c(29661, 2647656431055556877L) + n.c(30455, 5974077949888189452L) ^ n.c(7553, 1318575220298071873L);
                if (var2_2) continue block9;
lbl48:
                // 2 sources

                v2 = var4_3 /* !! */  = n.c(6171, 786554195505330863L) / n.c(32555, 761173073051704820L) / n.c(32555, 761173073051704820L) ^ n.c(32115, 6027186858066960331L);
lbl49:
                // 2 sources

                if (var2_2) continue block9;
lbl50:
                // 2 sources

                var4_3 /* !! */  = hi.a("G", (int)(n.c(17567, 4100320440231028343L) * n.c(8134, 5961370855221575016L)), (int)n.c(4045, 5934436730110750070L), (long)834203424483934088L) - n.c(27639, 7218953148326955309L) + n.c(12367, 4476910163468817142L) ^ n.c(24065, 610555775888162006L);
                if (var2_2) continue block9;
lbl52:
                // 2 sources

                var4_3 /* !! */  = n.c(6171, 786554195505330863L) / n.c(32555, 761173073051704820L) / n.c(32555, 761173073051704820L) ^ n.c(32115, 6027186858066960331L);
                continue block9;
                case 498913875: 
            }
            break;
        }
    }

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1259474678846753224L), (long)646534307489324991L);
    }

    private static int c(int n2, long l) {
        int n3 = n2 ^ (int)(l & 0x7FFFL) ^ 0x22FE;
        if (d[n3] == null) {
            n.d[n3] = (int)(c[n3] ^ l);
        }
        return d[n3];
    }
}
