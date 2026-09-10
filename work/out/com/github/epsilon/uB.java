/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class uB
extends Record
implements _Q {
    private final Color HX;
    private final float aa;
    private final ih mo;
    private final float AJ;
    private final String CF;

    public Color HX() {
        return hi.a("\u00e9", (Object)this, (long)424726970038369627L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uB.class, "mo;CF;aa;HX;AJ", "mo", "CF", "aa", "HX", "AJ"}, this);
    }

    public float AJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)426082673124365595L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uB.class, "mo;CF;aa;HX;AJ", "mo", "CF", "aa", "HX", "AJ"}, this, object);
    }

    public String CF() {
        return hi.a("\u00e9", (Object)this, (long)877271571371043728L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{uB.class, "mo;CF;aa;HX;AJ", "mo", "CF", "aa", "HX", "AJ"}, this);
    }

    public uB(ih ih2, String string, float f, Color color, float f2) {
        this.mo = ih2;
        this.CF = string;
        this.aa = f;
        this.HX = color;
        this.AJ = f2;
    }

    public ih Mo() {
        return hi.a("\u00e9", (Object)this, (long)385314333502694879L);
    }

    public float Aa() {
        return (float)hi.a("\u00e9", (Object)this, (long)497947271796988806L);
    }
}
