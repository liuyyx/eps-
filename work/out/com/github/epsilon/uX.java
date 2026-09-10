/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.phys.Vec3;

final class uX
extends Record {
    private final float iT;
    private final Vec3 rG;
    private final Vec3 rc;
    private final int fk;

    private uX(Vec3 vec3, Vec3 vec32, int n, float f) {
        this.rc = vec3;
        this.rG = vec32;
        this.fk = n;
        this.iT = f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{uX.class, "rc;rG;fk;iT", "rc", "rG", "fk", "iT"}, this);
    }

    public float iT() {
        return (float)hi.a("\u00e9", (Object)this, (long)500500325496145936L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uX.class, "rc;rG;fk;iT", "rc", "rG", "fk", "iT"}, this, object);
    }

    public Vec3 rc() {
        return hi.a("\u00e9", (Object)this, (long)736506673738413187L);
    }

    public int Fk() {
        return (int)hi.a("\u00e9", (Object)this, (long)681023790183707129L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uX.class, "rc;rG;fk;iT", "rc", "rG", "fk", "iT"}, this);
    }

    public Vec3 rG() {
        return hi.a("\u00e9", (Object)this, (long)444206548468059688L);
    }
}
