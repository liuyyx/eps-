/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.phys.AABB
 */
package com.github.epsilon;

import com.github.epsilon.Oy;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;

final class nD
extends Record {
    private final boolean xP;
    private final AABB EI;
    private final List<BlockPos> nh;
    private final Oy xQ;

    private nD(Oy oy, List<BlockPos> list, AABB aABB, boolean bl) {
        this.xQ = oy;
        this.nh = list;
        this.EI = aABB;
        this.xP = bl;
    }

    public Oy xQ() {
        return hi.a("\u00e9", (Object)this, (long)672706767280469983L);
    }

    public AABB EI() {
        return hi.a("\u00e9", (Object)this, (long)589035510746207271L);
    }

    public boolean xP() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)985763432564612640L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nD.class, "xQ;nh;EI;xP", "xQ", "nh", "EI", "xP"}, this);
    }

    public List<BlockPos> nh() {
        return hi.a("\u00e9", (Object)this, (long)372012487966114539L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nD.class, "xQ;nh;EI;xP", "xQ", "nh", "EI", "xP"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nD.class, "xQ;nh;EI;xP", "xQ", "nh", "EI", "xP"}, this, object);
    }
}
