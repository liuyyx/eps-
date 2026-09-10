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

final class yY
extends Record {
    private final Vec3 tw;
    private final BlockPos jN;
    private final Direction _h;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yY.class, "jN;_h;tw", "jN", "_h", "tw"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yY.class, "jN;_h;tw", "jN", "_h", "tw"}, this);
    }

    private yY(BlockPos blockPos, Direction direction, Vec3 vec3) {
        this.jN = blockPos;
        this._h = direction;
        this.tw = vec3;
    }

    public Vec3 tw() {
        return hi.a("\u00e9", (Object)this, (long)766118781366177141L);
    }

    public Direction _h() {
        return hi.a("\u00e9", (Object)this, (long)1105392197558060085L);
    }

    public BlockPos jN() {
        return hi.a("\u00e9", (Object)this, (long)590812056264317151L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yY.class, "jN;_h;tw", "jN", "_h", "tw"}, this);
    }
}
