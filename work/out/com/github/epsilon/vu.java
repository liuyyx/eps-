/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Direction
 *  net.minecraft.world.phys.AABB
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;

final class vu
extends Record {
    private final Direction bx;
    private final float iK;
    private final AABB FH;
    private final int hn;

    public float iK() {
        return (float)hi.a("\u00e9", (Object)this, (long)688860395323733436L);
    }

    public AABB FH() {
        return hi.a("\u00e9", (Object)this, (long)451088083808792108L);
    }

    private vu(AABB aABB, int n, float f, Direction direction) {
        this.FH = aABB;
        this.hn = n;
        this.iK = f;
        this.bx = direction;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vu.class, "FH;hn;iK;bx", "FH", "hn", "iK", "bx"}, this);
    }

    public Direction bx() {
        return hi.a("\u00e9", (Object)this, (long)361809657645050783L);
    }

    public int hn() {
        return (int)hi.a("\u00e9", (Object)this, (long)526231735982360034L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vu.class, "FH;hn;iK;bx", "FH", "hn", "iK", "bx"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vu.class, "FH;hn;iK;bx", "FH", "hn", "iK", "bx"}, this, object);
    }
}
