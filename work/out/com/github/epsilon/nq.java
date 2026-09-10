/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.boss.enderdragon.EndCrystal
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

final class nq
extends Record {
    private final int GF;
    private final boolean FJ;
    private final EndCrystal jc;
    private final boolean fv;
    private final AABB c8;
    private final Vec3 HK;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nq.class, "jc;GF;HK;c8;fv;FJ", "jc", "GF", "HK", "c8", "fv", "FJ"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nq.class, "jc;GF;HK;c8;fv;FJ", "jc", "GF", "HK", "c8", "fv", "FJ"}, this);
    }

    public boolean Fv() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1250756291787535913L);
    }

    private nq(EndCrystal endCrystal, int n, Vec3 vec3, AABB aABB, boolean bl, boolean bl2) {
        this.jc = endCrystal;
        this.GF = n;
        this.HK = vec3;
        this.c8 = aABB;
        this.fv = bl;
        this.FJ = bl2;
    }

    public int GF() {
        return (int)hi.a("\u00e9", (Object)this, (long)599320682663081988L);
    }

    public EndCrystal jc() {
        return hi.a("\u00e9", (Object)this, (long)866334942822695247L);
    }

    public boolean FJ() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)636938327089939598L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nq.class, "jc;GF;HK;c8;fv;FJ", "jc", "GF", "HK", "c8", "fv", "FJ"}, this, object);
    }

    public Vec3 HK() {
        return hi.a("\u00e9", (Object)this, (long)1160461406499065560L);
    }

    public AABB c8() {
        return hi.a("\u00e9", (Object)this, (long)501759951819875581L);
    }
}
