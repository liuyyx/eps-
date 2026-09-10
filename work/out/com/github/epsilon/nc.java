/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.nK;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class nc
extends Record
implements _Q {
    private final float vD;
    private final Color eW;
    private final nK c9;
    private final float vi;
    private final String cv;
    private final float vq;

    public float vq() {
        return (float)hi.a("\u00e9", (Object)this, (long)905142993336159245L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nc.class, "cv;vi;vD;vq;eW;c9", "cv", "vi", "vD", "vq", "eW", "c9"}, this);
    }

    public nc(String string, float f, float f2, float f3, Color color, nK nK2) {
        this.cv = string;
        this.vi = f;
        this.vD = f2;
        this.vq = f3;
        this.eW = color;
        this.c9 = nK2;
    }

    public float vD() {
        return (float)hi.a("\u00e9", (Object)this, (long)1062237420401631017L);
    }

    public nK C9() {
        return hi.a("\u00e9", (Object)this, (long)650506721582552921L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nc.class, "cv;vi;vD;vq;eW;c9", "cv", "vi", "vD", "vq", "eW", "c9"}, this, object);
    }

    public Color eW() {
        return hi.a("\u00e9", (Object)this, (long)1142033314716802311L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nc.class, "cv;vi;vD;vq;eW;c9", "cv", "vi", "vD", "vq", "eW", "c9"}, this);
    }

    public float vi() {
        return (float)hi.a("\u00e9", (Object)this, (long)615908497699691535L);
    }

    public String cv() {
        return hi.a("\u00e9", (Object)this, (long)546628651200043965L);
    }
}
