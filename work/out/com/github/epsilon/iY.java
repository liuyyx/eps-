/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class iY
extends Record {
    private final float yE;
    private final double m;
    private final float y3;
    private final double u;
    private final double ew;

    public double u() {
        return (double)hi.a("\u00e9", (Object)this, (long)808079552216289779L);
    }

    public double m() {
        return (double)hi.a("\u00e9", (Object)this, (long)715705633275835084L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iY.class, "m;ew;u;y3;yE", "m", "ew", "u", "y3", "yE"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iY.class, "m;ew;u;y3;yE", "m", "ew", "u", "y3", "yE"}, this);
    }

    public float y3() {
        return (float)hi.a("\u00e9", (Object)this, (long)1055035650802332202L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iY.class, "m;ew;u;y3;yE", "m", "ew", "u", "y3", "yE"}, this, object);
    }

    private iY(double d, double d2, double d3, float f, float f2) {
        this.m = d;
        this.ew = d2;
        this.u = d3;
        this.y3 = f;
        this.yE = f2;
    }

    public float yE() {
        return (float)hi.a("\u00e9", (Object)this, (long)1308574007226670424L);
    }

    public double ew() {
        return (double)hi.a("\u00e9", (Object)this, (long)448969348897687934L);
    }
}
