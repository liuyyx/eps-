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

final class Dm
extends Record {
    private final AABB z;
    private final Direction x;
    private final int h;

    private Dm(AABB aABB, int n, Direction direction) {
        this.z = aABB;
        this.h = n;
        this.x = direction;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dm.class, "z;h;x", "z", "h", "x"}, this);
    }

    public int h() {
        return (int)hi.a("\u00e9", (Object)this, (long)753882937005156649L);
    }

    public AABB z() {
        return hi.a("\u00e9", (Object)this, (long)852674427633071438L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dm.class, "z;h;x", "z", "h", "x"}, this, object);
    }

    public Direction x() {
        return hi.a("\u00e9", (Object)this, (long)1112441242017210102L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dm.class, "z;h;x", "z", "h", "x"}, this);
    }
}
