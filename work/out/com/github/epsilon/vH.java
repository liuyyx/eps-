/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._G;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

final class vH
extends Record {
    private final float an;
    private final float aJ;
    private final float aQ;
    private final float aA;
    private final List<_G> w7;
    private final double yU;
    private final float aK;
    private final float aw;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vH.class, "aA;aQ;aw;aK;aJ;an;yU;w7", "aA", "aQ", "aw", "aK", "aJ", "an", "yU", "w7"}, this);
    }

    public float aJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1034621438930589428L);
    }

    private vH(float f, float f2, float f3, float f4, float f5, float f6, double d, List<_G> list) {
        this.aA = f;
        this.aQ = f2;
        this.aw = f3;
        this.aK = f4;
        this.aJ = f5;
        this.an = f6;
        this.yU = d;
        this.w7 = list;
    }

    public double yU() {
        return (double)hi.a("\u00e9", (Object)this, (long)569011827232557116L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vH.class, "aA;aQ;aw;aK;aJ;an;yU;w7", "aA", "aQ", "aw", "aK", "aJ", "an", "yU", "w7"}, this, object);
    }

    public float aw() {
        return (float)hi.a("\u00e9", (Object)this, (long)457831001247590616L);
    }

    public float an() {
        return (float)hi.a("\u00e9", (Object)this, (long)606013142330734374L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vH.class, "aA;aQ;aw;aK;aJ;an;yU;w7", "aA", "aQ", "aw", "aK", "aJ", "an", "yU", "w7"}, this);
    }

    public float aQ() {
        return (float)hi.a("\u00e9", (Object)this, (long)538257187835533153L);
    }

    public float aK() {
        return (float)hi.a("\u00e9", (Object)this, (long)920502294799318278L);
    }

    public List<_G> w7() {
        return hi.a("\u00e9", (Object)this, (long)890300875600805989L);
    }

    public float aA() {
        return (float)hi.a("\u00e9", (Object)this, (long)774977019210866372L);
    }
}
