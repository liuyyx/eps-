/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;

final class zD
extends Record {
    private final BlockPos m0;
    private final Vec3 kp;
    private final Direction NX;

    public Direction NX() {
        return hi.a("\u00e9", (Object)this, (long)486041239945182565L);
    }

    public Vec3 Kp() {
        return hi.a("\u00e9", (Object)this, (long)589596535130829797L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zD.class, "m0;NX;kp", "m0", "NX", "kp"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zD.class, "m0;NX;kp", "m0", "NX", "kp"}, this);
    }

    private BlockPos M() {
        return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)480871679356885655L), (Object)hi.a("\u00e9", (Object)this, (long)486041239945182565L), (long)531922423199390482L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zD.class, "m0;NX;kp", "m0", "NX", "kp"}, this);
    }

    public BlockPos M0() {
        return hi.a("\u00e9", (Object)this, (long)480871679356885655L);
    }

    private zD(BlockPos blockPos, Direction direction, Vec3 vec3) {
        this.m0 = blockPos;
        this.NX = direction;
        this.kp = vec3;
    }
}
