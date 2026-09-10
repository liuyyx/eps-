/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Oq;
import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.nK;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class li
extends Record
implements _Q {
    private final float n9;
    private final float nt;
    private final String m4;
    private final nK yV;
    private final Oq eD;
    private final float nu;
    private final Color by;

    public Color by() {
        return hi.a("\u00e9", (Object)this, (long)940906945513623975L);
    }

    public float N9() {
        return (float)hi.a("\u00e9", (Object)this, (long)1245053010243786520L);
    }

    public float Nu() {
        return (float)hi.a("\u00e9", (Object)this, (long)471733988253259011L);
    }

    public li(String string, float f, float f2, float f3, Color color, Oq oq, nK nK2) {
        this.m4 = string;
        this.n9 = f;
        this.nt = f2;
        this.nu = f3;
        this.by = color;
        this.eD = oq;
        this.yV = nK2;
    }

    public nK yV() {
        return hi.a("\u00e9", (Object)this, (long)714947221337012239L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{li.class, "m4;n9;nt;nu;by;eD;yV", "m4", "n9", "nt", "nu", "by", "eD", "yV"}, this);
    }

    public float Nt() {
        return (float)hi.a("\u00e9", (Object)this, (long)864506152485308310L);
    }

    public Oq eD() {
        return hi.a("\u00e9", (Object)this, (long)1078071074691087139L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{li.class, "m4;n9;nt;nu;by;eD;yV", "m4", "n9", "nt", "nu", "by", "eD", "yV"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{li.class, "m4;n9;nt;nu;by;eD;yV", "m4", "n9", "nt", "nu", "by", "eD", "yV"}, this);
    }

    public String m4() {
        return hi.a("\u00e9", (Object)this, (long)1055751184879889329L);
    }
}
