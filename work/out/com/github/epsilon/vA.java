/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XL;
import com.github.epsilon.Xu;
import com.github.epsilon.hi;
import com.github.epsilon.y3;
import com.github.epsilon.yM;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class vA
extends Record
implements yM {
    private final float OL;
    private final int layer;
    private final Color sU;
    private final float OQ;
    private final Xu scissor;
    private final long sequence;
    private final float om;
    private final float ON;
    private final XL bounds;
    private final float oj;

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)649707219157145881L);
    }

    public float ON() {
        return (float)hi.a("\u00e9", (Object)this, (long)580563092018732956L);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)800092727942453261L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vA.class, "layer;sequence;bounds;scissor;om;oj;ON;OQ;OL;sU", "layer", "sequence", "bounds", "scissor", "om", "oj", "ON", "OQ", "OL", "sU"}, this);
    }

    public float OL() {
        return (float)hi.a("\u00e9", (Object)this, (long)1287189860686302110L);
    }

    public Color sU() {
        return hi.a("\u00e9", (Object)this, (long)1000277390189613271L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vA.class, "layer;sequence;bounds;scissor;om;oj;ON;OQ;OL;sU", "layer", "sequence", "bounds", "scissor", "om", "oj", "ON", "OQ", "OL", "sU"}, this);
    }

    public float OQ() {
        return (float)hi.a("\u00e9", (Object)this, (long)913154506271538775L);
    }

    @Override
    public XL g() {
        CallSite callSite = hi.a("G", (float)0.0f, (float)hi.a("\u00e9", (Object)this, (long)1287189860686302110L), (long)1021203527991582354L);
        return hi.a("G", (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)375279287646520110L), (long)1000184271683925771L) - callSite), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)375279287646520110L), (long)1126301546035170366L) - callSite), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)375279287646520110L), (long)1144554771357166897L) + callSite * 2.0f), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)375279287646520110L), (long)787161521195921883L) + callSite * 2.0f), (long)1261564879016344598L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)380428412555798046L);
    }

    public float Om() {
        return (float)hi.a("\u00e9", (Object)this, (long)1327876112132726781L);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)1073215605179372184L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vA.class, "layer;sequence;bounds;scissor;om;oj;ON;OQ;OL;sU", "layer", "sequence", "bounds", "scissor", "om", "oj", "ON", "OQ", "OL", "sU"}, this, object);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)375279287646520110L);
    }

    public float Oj() {
        return (float)hi.a("\u00e9", (Object)this, (long)889747251075166739L);
    }

    public vA(int n, long l, XL xL, Xu xu, float f, float f2, float f3, float f4, float f5, Color color) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.om = f;
        this.oj = f2;
        this.ON = f3;
        this.OQ = f4;
        this.OL = f5;
        this.sU = color;
    }
}
