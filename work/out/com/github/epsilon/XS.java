/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class XS
extends Record
implements _Q {
    private final Color u2;
    private final float u0;
    private final float UE;
    private final float UX;
    private final float UB;
    private final float UN;

    public float UX() {
        return (float)hi.a("\u00e9", (Object)this, (long)1307893890178464819L);
    }

    public float U0() {
        return (float)hi.a("\u00e9", (Object)this, (long)614314971034864645L);
    }

    public Color U2() {
        return hi.a("\u00e9", (Object)this, (long)1171884603908098482L);
    }

    public XS(float f, float f2, float f3, float f4, float f5, Color color) {
        this.u0 = f;
        this.UN = f2;
        this.UB = f3;
        this.UE = f4;
        this.UX = f5;
        this.u2 = color;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{XS.class, "u0;UN;UB;UE;UX;u2", "u0", "UN", "UB", "UE", "UX", "u2"}, this);
    }

    public float UB() {
        return (float)hi.a("\u00e9", (Object)this, (long)609814825496988312L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{XS.class, "u0;UN;UB;UE;UX;u2", "u0", "UN", "UB", "UE", "UX", "u2"}, this, object);
    }

    public float UN() {
        return (float)hi.a("\u00e9", (Object)this, (long)816241101396915780L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{XS.class, "u0;UN;UB;UE;UX;u2", "u0", "UN", "UB", "UE", "UX", "u2"}, this);
    }

    public float UE() {
        return (float)hi.a("\u00e9", (Object)this, (long)1038031016765375278L);
    }
}
