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

public final class nU
extends Record
implements _Q {
    private final float fg;
    private final String MV;
    private final Color cs;
    private final int p3;
    private final nK PR;
    private final float FY;
    private final float ff;
    private final float fr;

    public float Fr() {
        return (float)hi.a("\u00e9", (Object)this, (long)968086269880193933L);
    }

    public float Fg() {
        return (float)hi.a("\u00e9", (Object)this, (long)773291189669713136L);
    }

    public Color cs() {
        return hi.a("\u00e9", (Object)this, (long)818423248624828420L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nU.class, "MV;fr;fg;ff;cs;FY;p3;PR", "MV", "fr", "fg", "ff", "cs", "FY", "p3", "PR"}, this);
    }

    public int p3() {
        return (int)hi.a("\u00e9", (Object)this, (long)840670395298023473L);
    }

    public nK PR() {
        return hi.a("\u00e9", (Object)this, (long)1234944407574695351L);
    }

    public float Ff() {
        return (float)hi.a("\u00e9", (Object)this, (long)1232303842680740365L);
    }

    public nU(String string, float f, float f2, float f3, Color color, float f4, int n, nK nK2) {
        this.MV = string;
        this.fr = f;
        this.fg = f2;
        this.ff = f3;
        this.cs = color;
        this.FY = f4;
        this.p3 = n;
        this.PR = nK2;
    }

    public String MV() {
        return hi.a("\u00e9", (Object)this, (long)597758971348076277L);
    }

    public float FY() {
        return (float)hi.a("\u00e9", (Object)this, (long)809226580310412642L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nU.class, "MV;fr;fg;ff;cs;FY;p3;PR", "MV", "fr", "fg", "ff", "cs", "FY", "p3", "PR"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nU.class, "MV;fr;fg;ff;cs;FY;p3;PR", "MV", "fr", "fg", "ff", "cs", "FY", "p3", "PR"}, this);
    }
}
