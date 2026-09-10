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

public final class g2
extends Record
implements _Q {
    private final float kI;
    private final Color m1;
    private final float kO;
    private final ih tp;
    private final Color MN;
    private final String oi;
    private final String oJ;
    private final nK ta;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{g2.class, "tp;oJ;kO;MN;m1;oi;kI;ta", "tp", "oJ", "kO", "MN", "m1", "oi", "kI", "ta"}, this);
    }

    public float kI() {
        return (float)hi.a("\u00e9", (Object)this, (long)1153330686496217813L);
    }

    public float kO() {
        return (float)hi.a("\u00e9", (Object)this, (long)1219845096621245685L);
    }

    public g2(ih ih2, String string, float f, Color color, Color color2, String string2, float f2, nK nK2) {
        this.tp = ih2;
        this.oJ = string;
        this.kO = f;
        this.MN = color;
        this.m1 = color2;
        this.oi = string2;
        this.kI = f2;
        this.ta = nK2;
    }

    public Color M1() {
        return hi.a("\u00e9", (Object)this, (long)700837809903221367L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g2.class, "tp;oJ;kO;MN;m1;oi;kI;ta", "tp", "oJ", "kO", "MN", "m1", "oi", "kI", "ta"}, this, object);
    }

    public ih Tp() {
        return hi.a("\u00e9", (Object)this, (long)655966614881738995L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g2.class, "tp;oJ;kO;MN;m1;oi;kI;ta", "tp", "oJ", "kO", "MN", "m1", "oi", "kI", "ta"}, this);
    }

    public String oi() {
        return hi.a("\u00e9", (Object)this, (long)737893072070118129L);
    }

    public Color MN() {
        return hi.a("\u00e9", (Object)this, (long)998709997010429377L);
    }

    public String oJ() {
        return hi.a("\u00e9", (Object)this, (long)811308205972650004L);
    }

    public nK Ta() {
        return hi.a("\u00e9", (Object)this, (long)671782138115052976L);
    }
}
