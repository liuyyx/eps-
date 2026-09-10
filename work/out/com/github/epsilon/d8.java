/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.y4;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class d8
extends Record {
    private final float xE;
    private final float xX;
    private final float xA;
    private final float x3;
    private final y4 cC;

    public y4 cC() {
        return hi.a("\u00e9", (Object)this, (long)1167172067863212901L);
    }

    public float x3() {
        return (float)hi.a("\u00e9", (Object)this, (long)995701655654480770L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d8.class, "cC;xE;xX;x3;xA", "cC", "xE", "xX", "x3", "xA"}, this, object);
    }

    public float xE() {
        return (float)hi.a("\u00e9", (Object)this, (long)699813488722677509L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{d8.class, "cC;xE;xX;x3;xA", "cC", "xE", "xX", "x3", "xA"}, this);
    }

    public float xX() {
        return (float)hi.a("\u00e9", (Object)this, (long)496239485372966377L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d8.class, "cC;xE;xX;x3;xA", "cC", "xE", "xX", "x3", "xA"}, this);
    }

    public float xA() {
        return (float)hi.a("\u00e9", (Object)this, (long)879632279295486899L);
    }

    public d8(y4 y42, float f, float f2, float f3, float f4) {
        this.cC = y42;
        this.xE = f;
        this.xX = f2;
        this.x3 = f3;
        this.xA = f4;
    }
}
