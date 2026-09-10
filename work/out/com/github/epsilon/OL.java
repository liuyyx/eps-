/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Oq;
import com.github.epsilon.hi;
import com.github.epsilon.yn;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class OL
extends Record {
    private final float ey;
    private final yn nH;
    private final Oq gI;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{OL.class, "nH;ey;gI", "nH", "ey", "gI"}, this, object);
    }

    private OL(yn yn2, float f, Oq oq) {
        this.nH = yn2;
        this.ey = f;
        this.gI = oq;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{OL.class, "nH;ey;gI", "nH", "ey", "gI"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{OL.class, "nH;ey;gI", "nH", "ey", "gI"}, this);
    }

    public Oq gI() {
        return hi.a("\u00e9", (Object)this, (long)757551209273271335L);
    }

    public float Ey() {
        return (float)hi.a("\u00e9", (Object)this, (long)938873605849534636L);
    }

    public yn nH() {
        return hi.a("\u00e9", (Object)this, (long)1105564135674209494L);
    }
}
