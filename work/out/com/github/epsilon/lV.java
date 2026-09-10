/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

record lV(double vN, double vl) {
    private final double vN;
    private final double vl;

    public double vl() {
        return (double)hi.a("\u00e9", (Object)this, (long)456598589316573744L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lV.class, "vl;vN", "vl", "vN"}, this);
    }

    public double vN() {
        return (double)hi.a("\u00e9", (Object)this, (long)752756720791085364L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lV.class, "vl;vN", "vl", "vN"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lV.class, "vl;vN", "vl", "vN"}, this);
    }

    private lV(double d, double d2) {
        this.vl = d;
        this.vN = d2;
    }
}
