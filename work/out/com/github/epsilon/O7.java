/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uK;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

final class O7
extends Record {
    private final float u5;
    private final BlockPos mL;
    private final LivingEntity gX;
    private final Vec3 pn;
    private final float uk;
    private final Direction WL;
    private final uK HC;

    public float Uk() {
        return (float)hi.a("\u00e9", (Object)this, (long)812378554327770834L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{O7.class, "gX;mL;uk;u5;WL;pn;HC", "gX", "mL", "uk", "u5", "WL", "pn", "HC"}, this);
    }

    private O7(LivingEntity livingEntity, BlockPos blockPos, float f, float f2, Direction direction, Vec3 vec3, uK uK2) {
        this.gX = livingEntity;
        this.mL = blockPos;
        this.uk = f;
        this.u5 = f2;
        this.WL = direction;
        this.pn = vec3;
        this.HC = uK2;
    }

    public LivingEntity gX() {
        return hi.a("\u00e9", (Object)this, (long)1111930187777254345L);
    }

    public Direction WL() {
        return hi.a("\u00e9", (Object)this, (long)1291479501307929799L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{O7.class, "gX;mL;uk;u5;WL;pn;HC", "gX", "mL", "uk", "u5", "WL", "pn", "HC"}, this, object);
    }

    public BlockPos mL() {
        return hi.a("\u00e9", (Object)this, (long)1122183493327069122L);
    }

    public float U5() {
        return (float)hi.a("\u00e9", (Object)this, (long)500154141920814800L);
    }

    public Vec3 Pn() {
        return hi.a("\u00e9", (Object)this, (long)505370440572227124L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{O7.class, "gX;mL;uk;u5;WL;pn;HC", "gX", "mL", "uk", "u5", "WL", "pn", "HC"}, this);
    }

    public uK HC() {
        return hi.a("\u00e9", (Object)this, (long)466251761771812103L);
    }
}
