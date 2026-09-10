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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ve
extends Record
implements yM {
    private final Xu scissor;
    private final long sequence;
    private final float rj;
    private final Color ic;
    private final XL bounds;
    private final int layer;
    private final Color iq;
    private final float rx;
    private final Color iH;
    private final float RK;
    private final float RP;
    private final Color im;

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)1283456763131039897L);
    }

    public float RP() {
        return (float)hi.a("\u00e9", (Object)this, (long)1141736908639555440L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)734353714525981216L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ve.class, "layer;sequence;bounds;scissor;RP;rx;RK;rj;ic;iq;iH;im", "layer", "sequence", "bounds", "scissor", "RP", "rx", "RK", "rj", "ic", "iq", "iH", "im"}, this);
    }

    public float Rj() {
        return (float)hi.a("\u00e9", (Object)this, (long)1267003907020994135L);
    }

    public float Rx() {
        return (float)hi.a("\u00e9", (Object)this, (long)685981832765777952L);
    }

    public ve(int n, long l, XL xL, Xu xu, float f, float f2, float f3, float f4, Color color, Color color2, Color color3, Color color4) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.RP = f;
        this.rx = f2;
        this.RK = f3;
        this.rj = f4;
        this.ic = color;
        this.iq = color2;
        this.iH = color3;
        this.im = color4;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ve.class, "layer;sequence;bounds;scissor;RP;rx;RK;rj;ic;iq;iH;im", "layer", "sequence", "bounds", "scissor", "RP", "rx", "RK", "rj", "ic", "iq", "iH", "im"}, this, object);
    }

    public float RK() {
        return (float)hi.a("\u00e9", (Object)this, (long)1041833415496775352L);
    }

    public Color iH() {
        return hi.a("\u00e9", (Object)this, (long)894729591519524899L);
    }

    public Color ic() {
        return hi.a("\u00e9", (Object)this, (long)1023211625204903704L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)1108727117180504285L);
    }

    public Color iq() {
        return hi.a("\u00e9", (Object)this, (long)1075870729994708318L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ve.class, "layer;sequence;bounds;scissor;RP;rx;RK;rj;ic;iq;iH;im", "layer", "sequence", "bounds", "scissor", "RP", "rx", "RK", "rj", "ic", "iq", "iH", "im"}, this);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)1247478983906742691L);
    }

    public Color im() {
        return hi.a("\u00e9", (Object)this, (long)1077093261184362632L);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)764219923971064544L);
    }
}
