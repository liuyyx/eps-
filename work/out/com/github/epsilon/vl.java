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

final class vl
extends Record {
    private final int jf;
    private final int jq;
    private final AABB cf;

    public int Jf() {
        return (int)hi.a("\u00e9", (Object)this, (long)1214684531072508800L);
    }

    public AABB Cf() {
        return hi.a("\u00e9", (Object)this, (long)1261923244201315393L);
    }

    private vl(AABB aABB, int n, int n2) {
        this.cf = aABB;
        this.jf = n;
        this.jq = n2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vl.class, "cf;jf;jq", "cf", "jf", "jq"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vl.class, "cf;jf;jq", "cf", "jf", "jq"}, this);
    }

    public int Jq() {
        return (int)hi.a("\u00e9", (Object)this, (long)1199073636629190344L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vl.class, "cf;jf;jq", "cf", "jf", "jq"}, this, object);
    }
}
