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

public final class ln
extends Record
implements _Q {
    private final Color zZ;
    private final float gx;
    private final String aL;
    private final float gn;
    private final float gK;
    private final float ge;
    private final float gj;
    private final float gV;
    private final nK rP;

    public ln(String string, float f, float f2, float f3, Color color, nK nK2, float f4, float f5, float f6) {
        this.aL = string;
        this.gV = f;
        this.gK = f2;
        this.gx = f3;
        this.zZ = color;
        this.rP = nK2;
        this.gn = f4;
        this.gj = f5;
        this.ge = f6;
    }

    public float gV() {
        return (float)hi.a("\u00e9", (Object)this, (long)1236665418684290787L);
    }

    public float gj() {
        return (float)hi.a("\u00e9", (Object)this, (long)846896051389044460L);
    }

    public Color zZ() {
        return hi.a("\u00e9", (Object)this, (long)1320112925388292824L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ln.class, "aL;gV;gK;gx;zZ;rP;gn;gj;ge", "aL", "gV", "gK", "gx", "zZ", "rP", "gn", "gj", "ge"}, this);
    }

    public float ge() {
        return (float)hi.a("\u00e9", (Object)this, (long)695683196891496504L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ln.class, "aL;gV;gK;gx;zZ;rP;gn;gj;ge", "aL", "gV", "gK", "gx", "zZ", "rP", "gn", "gj", "ge"}, this);
    }

    public float gn() {
        return (float)hi.a("\u00e9", (Object)this, (long)1234144041554213339L);
    }

    public String aL() {
        return hi.a("\u00e9", (Object)this, (long)682573962379335177L);
    }

    public float gx() {
        return (float)hi.a("\u00e9", (Object)this, (long)833363463927306055L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ln.class, "aL;gV;gK;gx;zZ;rP;gn;gj;ge", "aL", "gV", "gK", "gx", "zZ", "rP", "gn", "gj", "ge"}, this, object);
    }

    public float gK() {
        return (float)hi.a("\u00e9", (Object)this, (long)714733899697784464L);
    }

    public nK rP() {
        return hi.a("\u00e9", (Object)this, (long)1237231327992309971L);
    }
}
