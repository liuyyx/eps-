/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class _0
extends Record
implements _Q {
    private final float pG;
    private final float pX;
    private final Color ND;
    private final float pJ;
    private final float pN;

    public float pX() {
        return (float)hi.a("\u00e9", (Object)this, (long)1240072823536279223L);
    }

    public _0(float f, float f2, float f3, float f4, Color color) {
        this.pJ = f;
        this.pN = f2;
        this.pG = f3;
        this.pX = f4;
        this.ND = color;
    }

    public float pJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1281679470256599596L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_0.class, "pJ;pN;pG;pX;ND", "pJ", "pN", "pG", "pX", "ND"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_0.class, "pJ;pN;pG;pX;ND", "pJ", "pN", "pG", "pX", "ND"}, this);
    }

    public float pN() {
        return (float)hi.a("\u00e9", (Object)this, (long)357623827659291207L);
    }

    public float pG() {
        return (float)hi.a("\u00e9", (Object)this, (long)1031012170899631602L);
    }

    public Color ND() {
        return hi.a("\u00e9", (Object)this, (long)893512782993276522L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_0.class, "pJ;pN;pG;pX;ND", "pJ", "pN", "pG", "pX", "ND"}, this, object);
    }
}
