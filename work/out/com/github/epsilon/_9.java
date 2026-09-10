/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.BlockHitResult
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

final class _9
extends Record {
    private final List<Entity> fo;
    private final BlockHitResult wY;
    private final List<Vec3> f4;
    private final int sy;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_9.class, "f4;sy;wY;fo", "f4", "sy", "wY", "fo"}, this, object);
    }

    public List<Vec3> f4() {
        return hi.a("\u00e9", (Object)this, (long)496016559476249045L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_9.class, "f4;sy;wY;fo", "f4", "sy", "wY", "fo"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_9.class, "f4;sy;wY;fo", "f4", "sy", "wY", "fo"}, this);
    }

    public int sy() {
        return (int)hi.a("\u00e9", (Object)this, (long)688275105187350481L);
    }

    public List<Entity> fo() {
        return hi.a("\u00e9", (Object)this, (long)570209857720245113L);
    }

    public BlockHitResult wY() {
        return hi.a("\u00e9", (Object)this, (long)700623310225819280L);
    }

    private _9(List<Vec3> list, int n, BlockHitResult blockHitResult, List<Entity> list2) {
        this.f4 = list;
        this.sy = n;
        this.wY = blockHitResult;
        this.fo = list2;
    }
}
