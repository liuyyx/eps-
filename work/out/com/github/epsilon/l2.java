/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class l2
extends Record
implements _Q {
    private final float rk;
    private final float rJ;
    private final float rB;
    private final Color kl;
    private final float r5;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{l2.class, "rJ;rB;r5;rk;kl", "rJ", "rB", "r5", "rk", "kl"}, this);
    }

    public float rB() {
        return (float)hi.a("\u00e9", (Object)this, (long)585712918966359242L);
    }

    public Color Kl() {
        return hi.a("\u00e9", (Object)this, (long)468112099608946954L);
    }

    public float r5() {
        return (float)hi.a("\u00e9", (Object)this, (long)934220410066261048L);
    }

    public l2(float f, float f2, float f3, float f4, Color color) {
        this.rJ = f;
        this.rB = f2;
        this.r5 = f3;
        this.rk = f4;
        this.kl = color;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l2.class, "rJ;rB;r5;rk;kl", "rJ", "rB", "r5", "rk", "kl"}, this, object);
    }

    public float rk() {
        return (float)hi.a("\u00e9", (Object)this, (long)1082712133597273648L);
    }

    public float rJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)376819629085980274L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l2.class, "rJ;rB;r5;rk;kl", "rJ", "rB", "r5", "rk", "kl"}, this);
    }
}
