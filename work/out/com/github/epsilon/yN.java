/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.phys.AABB
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.phys.AABB;

final class yN
extends Record {
    private final int lD;
    private final AABB qj;
    private final float c1;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yN.class, "qj;lD;c1", "qj", "lD", "c1"}, this);
    }

    public int lD() {
        return (int)hi.a("\u00e9", (Object)this, (long)934654065996054733L);
    }

    public float c1() {
        return (float)hi.a("\u00e9", (Object)this, (long)449889149352890624L);
    }

    private yN(AABB aABB, int n, float f) {
        this.qj = aABB;
        this.lD = n;
        this.c1 = f;
    }

    public AABB qj() {
        return hi.a("\u00e9", (Object)this, (long)864474923553089886L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yN.class, "qj;lD;c1", "qj", "lD", "c1"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yN.class, "qj;lD;c1", "qj", "lD", "c1"}, this, object);
    }
}
