/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon._Z;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.phys.Vec3;

final class Dp
extends Record {
    private final Vec3 hI;
    private final _Z jh;

    private Dp(Vec3 vec3, _Z _Z2) {
        this.hI = vec3;
        this.jh = _Z2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dp.class, "hI;jh", "hI", "jh"}, this);
    }

    public Vec3 hI() {
        return hi.a("\u00e9", (Object)this, (long)1075081383750289744L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dp.class, "hI;jh", "hI", "jh"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dp.class, "hI;jh", "hI", "jh"}, this, object);
    }

    public _Z Jh() {
        return hi.a("\u00e9", (Object)this, (long)665352895526054996L);
    }
}
