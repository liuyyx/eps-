/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.n_;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class v6
extends Record {
    private final n_ KW;
    private final float EY;
    private final float EG;
    private final float ea;
    private final float EB;
    private final float eu;
    private final Color TU;

    public float EG() {
        return (float)hi.a("\u00e9", (Object)this, (long)901122854058108237L);
    }

    public Color TU() {
        return hi.a("\u00e9", (Object)this, (long)1000837757772456951L);
    }

    public float EY() {
        return (float)hi.a("\u00e9", (Object)this, (long)1166122850637181079L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{v6.class, "KW;eu;EY;EB;ea;EG;TU", "KW", "eu", "EY", "EB", "ea", "EG", "TU"}, this);
    }

    private v6(n_ n_2, float f, float f2, float f3, float f4, float f5, Color color) {
        this.KW = n_2;
        this.eu = f;
        this.EY = f2;
        this.EB = f3;
        this.ea = f4;
        this.EG = f5;
        this.TU = color;
    }

    public float Ea() {
        return (float)hi.a("\u00e9", (Object)this, (long)515691669554645267L);
    }

    public float EB() {
        return (float)hi.a("\u00e9", (Object)this, (long)762751399375268289L);
    }

    public float Eu() {
        return (float)hi.a("\u00e9", (Object)this, (long)1251306320098299945L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{v6.class, "KW;eu;EY;EB;ea;EG;TU", "KW", "eu", "EY", "EB", "ea", "EG", "TU"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{v6.class, "KW;eu;EY;EB;ea;EG;TU", "KW", "eu", "EY", "EB", "ea", "EG", "TU"}, this);
    }

    public n_ KW() {
        return hi.a("\u00e9", (Object)this, (long)667102031176528965L);
    }
}
