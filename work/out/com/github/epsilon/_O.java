/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.nK;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class _O
extends Record
implements _Q {
    private final float b2;
    private final ih uA;
    private final String oC;
    private final float bD;
    private final nK PB;
    private final float b1;
    private final Color vU;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_O.class, "oC;b1;b2;bD;vU;PB;uA", "oC", "b1", "b2", "bD", "vU", "PB", "uA"}, this);
    }

    public float b2() {
        return (float)hi.a("\u00e9", (Object)this, (long)624319303048659170L);
    }

    public ih uA() {
        return hi.a("\u00e9", (Object)this, (long)741978886055232460L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_O.class, "oC;b1;b2;bD;vU;PB;uA", "oC", "b1", "b2", "bD", "vU", "PB", "uA"}, this, object);
    }

    public Color vU() {
        return hi.a("\u00e9", (Object)this, (long)573766865611968110L);
    }

    public _O(String string, float f, float f2, float f3, Color color, nK nK2, ih ih2) {
        this.oC = string;
        this.b1 = f;
        this.b2 = f2;
        this.bD = f3;
        this.vU = color;
        this.PB = nK2;
        this.uA = ih2;
    }

    public float bD() {
        return (float)hi.a("\u00e9", (Object)this, (long)541823795152745987L);
    }

    public String oC() {
        return hi.a("\u00e9", (Object)this, (long)365877291941400758L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_O.class, "oC;b1;b2;bD;vU;PB;uA", "oC", "b1", "b2", "bD", "vU", "PB", "uA"}, this);
    }

    public float b1() {
        return (float)hi.a("\u00e9", (Object)this, (long)377778394886859996L);
    }

    public nK PB() {
        return hi.a("\u00e9", (Object)this, (long)535732279586200090L);
    }
}
