/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dS
extends Record {
    private final float sq;
    private final int LE;
    private final float SB;

    public int LE() {
        return (int)hi.a("\u00e9", (Object)this, (long)952111472799237307L);
    }

    public dS(int n, float f, float f2) {
        this.LE = n;
        this.sq = f;
        this.SB = f2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dS.class, "LE;sq;SB", "LE", "sq", "SB"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dS.class, "LE;sq;SB", "LE", "sq", "SB"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dS.class, "LE;sq;SB", "LE", "sq", "SB"}, this, object);
    }

    public float SB() {
        return (float)hi.a("\u00e9", (Object)this, (long)1089375437563280434L);
    }

    public float Sq() {
        return (float)hi.a("\u00e9", (Object)this, (long)861831244715369212L);
    }
}
