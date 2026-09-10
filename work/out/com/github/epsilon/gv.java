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
import java.util.List;
import net.minecraft.world.phys.Vec3;

public final class gv
extends Record {
    private final List<Vec3> t_;
    private final Vec3 t8;

    public List<Vec3> T_() {
        return hi.a("\u00e9", (Object)this, (long)793953028506645966L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gv.class, "t8;t_", "t8", "t_"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gv.class, "t8;t_", "t8", "t_"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gv.class, "t8;t_", "t8", "t_"}, this);
    }

    public gv(Vec3 vec3, List<Vec3> list) {
        this.t8 = vec3;
        this.t_ = list;
    }

    public Vec3 T8() {
        return hi.a("\u00e9", (Object)this, (long)563259712363637449L);
    }
}
