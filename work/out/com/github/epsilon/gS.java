/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uK;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;

final class gS
extends Record {
    private final Direction sd;
    private final double td;
    private final Direction SU;
    private final uK HM;
    private final BlockPos g_;
    private final BlockPos g2;
    private final boolean pj;
    private final int _3;

    private gS(BlockPos blockPos, Direction direction, uK uK2, double d, int n, boolean bl, BlockPos blockPos2, Direction direction2) {
        this.g2 = blockPos;
        this.SU = direction;
        this.HM = uK2;
        this.td = d;
        this._3 = n;
        this.pj = bl;
        this.g_ = blockPos2;
        this.sd = direction2;
    }

    public BlockPos G2() {
        return hi.a("\u00e9", (Object)this, (long)1308133533609771254L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gS.class, "g2;SU;HM;td;_3;pj;g_;sd", "g2", "SU", "HM", "td", "_3", "pj", "g_", "sd"}, this);
    }

    public double Td() {
        return (double)hi.a("\u00e9", (Object)this, (long)820757672291679713L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gS.class, "g2;SU;HM;td;_3;pj;g_;sd", "g2", "SU", "HM", "td", "_3", "pj", "g_", "sd"}, this);
    }

    public Direction Sd() {
        return hi.a("\u00e9", (Object)this, (long)953176385684135845L);
    }

    public Direction SU() {
        return hi.a("\u00e9", (Object)this, (long)663299948912303095L);
    }

    public BlockPos G_() {
        return hi.a("\u00e9", (Object)this, (long)1113063844268027983L);
    }

    public int _3() {
        return (int)hi.a("\u00e9", (Object)this, (long)432993925346405848L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gS.class, "g2;SU;HM;td;_3;pj;g_;sd", "g2", "SU", "HM", "td", "_3", "pj", "g_", "sd"}, this, object);
    }

    public uK HM() {
        return hi.a("\u00e9", (Object)this, (long)1003212546260988148L);
    }

    public boolean pj() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)386464517022785108L);
    }
}
