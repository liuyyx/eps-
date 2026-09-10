/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.phys.AABB
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.phys.AABB;

final class Dr
extends Record {
    private final boolean eQ;
    private final Color CC;
    private final long wc;
    private final boolean eq;
    private final Color c2;
    private final AABB GC;

    private Dr(AABB aABB, Color color, Color color2, long l, boolean bl, boolean bl2) {
        this.GC = aABB;
        this.c2 = color;
        this.CC = color2;
        this.wc = l;
        this.eQ = bl;
        this.eq = bl2;
    }

    public Color C2() {
        return hi.a("\u00e9", (Object)this, (long)1193943931368313001L);
    }

    public AABB GC() {
        return hi.a("\u00e9", (Object)this, (long)599623574744424828L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dr.class, "GC;c2;CC;wc;eQ;eq", "GC", "c2", "CC", "wc", "eQ", "eq"}, this);
    }

    public boolean eq() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1007198646130273097L);
    }

    public Color CC() {
        return hi.a("\u00e9", (Object)this, (long)710457707525324903L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dr.class, "GC;c2;CC;wc;eQ;eq", "GC", "c2", "CC", "wc", "eQ", "eq"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dr.class, "GC;c2;CC;wc;eQ;eq", "GC", "c2", "CC", "wc", "eQ", "eq"}, this);
    }

    public long Wc() {
        return (long)hi.a("\u00e9", (Object)this, (long)843012095843903622L);
    }

    public boolean eQ() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)937192892053648038L);
    }
}
