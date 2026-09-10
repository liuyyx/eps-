/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.phys.AABB
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.phys.AABB;

final class dV
extends Record {
    private final double ET;
    private final AABB r6;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dV.class, "r6;ET", "r6", "ET"}, this, object);
    }

    public double ET() {
        return (double)hi.a("\u00e9", (Object)this, (long)708875518766965732L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dV.class, "r6;ET", "r6", "ET"}, this);
    }

    private dV(AABB aABB, double d) {
        this.r6 = aABB;
        this.ET = d;
    }

    public AABB r6() {
        return hi.a("\u00e9", (Object)this, (long)380928091178942566L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dV.class, "r6;ET", "r6", "ET"}, this);
    }
}
