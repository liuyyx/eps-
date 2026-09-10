/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.nD;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.minecraft.core.BlockPos;

final class yl
extends Record {
    private final List<nD> q7;
    private final List<nD> QV;
    private final List<BlockPos> q_;
    private final List<BlockPos> QP;
    private final List<BlockPos> qc;

    public List<nD> Q7() {
        return hi.a("\u00e9", (Object)this, (long)384602603333711012L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yl.class, "QV;q7;qc;q_;QP", "QV", "q7", "qc", "q_", "QP"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yl.class, "QV;q7;qc;q_;QP", "QV", "q7", "qc", "q_", "QP"}, this);
    }

    public List<BlockPos> QP() {
        return hi.a("\u00e9", (Object)this, (long)1203773097814636755L);
    }

    public List<BlockPos> Q_() {
        return hi.a("\u00e9", (Object)this, (long)710830257740417576L);
    }

    public List<BlockPos> Qc() {
        return hi.a("\u00e9", (Object)this, (long)1121928918539476979L);
    }

    private yl(List<nD> list, List<nD> list2, List<BlockPos> list3, List<BlockPos> list4, List<BlockPos> list5) {
        this.QV = list;
        this.q7 = list2;
        this.qc = list3;
        this.q_ = list4;
        this.QP = list5;
    }

    public List<nD> QV() {
        return hi.a("\u00e9", (Object)this, (long)1150105862387705718L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yl.class, "QV;q7;qc;q_;QP", "QV", "q7", "qc", "q_", "QP"}, this);
    }
}
