/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XL;
import com.github.epsilon.Xu;
import com.github.epsilon.hi;
import com.github.epsilon.nK;
import com.github.epsilon.y3;
import com.github.epsilon.yM;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class gj
extends Record
implements yM {
    private final float g7;
    private final String PF;
    private final float GD;
    private final float g9;
    private final float GI;
    private final nK fs;
    private final long sequence;
    private final float GX;
    private final Color up;
    private final float GQ;
    private final XL bounds;
    private final Xu scissor;
    private final int layer;

    public float G7() {
        return (float)hi.a("\u00e9", (Object)this, (long)1300262260374492319L);
    }

    public float GI() {
        return (float)hi.a("\u00e9", (Object)this, (long)916903569465545384L);
    }

    public float GD() {
        return (float)hi.a("\u00e9", (Object)this, (long)812717749046754039L);
    }

    public Color up() {
        return hi.a("\u00e9", (Object)this, (long)850459629794477501L);
    }

    public String PF() {
        return hi.a("\u00e9", (Object)this, (long)875741482849082882L);
    }

    public float GX() {
        return (float)hi.a("\u00e9", (Object)this, (long)728425976399720245L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gj.class, "layer;sequence;bounds;scissor;PF;GI;GX;GQ;up;fs;g9;g7;GD", "layer", "sequence", "bounds", "scissor", "PF", "GI", "GX", "GQ", "up", "fs", "g9", "g7", "GD"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gj.class, "layer;sequence;bounds;scissor;PF;GI;GX;GQ;up;fs;g9;g7;GD", "layer", "sequence", "bounds", "scissor", "PF", "GI", "GX", "GQ", "up", "fs", "g9", "g7", "GD"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gj.class, "layer;sequence;bounds;scissor;PF;GI;GX;GQ;up;fs;g9;g7;GD", "layer", "sequence", "bounds", "scissor", "PF", "GI", "GX", "GQ", "up", "fs", "g9", "g7", "GD"}, this);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)1130919292852837508L);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)888647664320224168L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)1209807959299157616L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)610663490684568735L);
    }

    public nK Fs() {
        return hi.a("\u00e9", (Object)this, (long)863491608159846393L);
    }

    public gj(int n, long l, XL xL, Xu xu, String string, float f, float f2, float f3, Color color, nK nK2, float f4, float f5, float f6) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.PF = string;
        this.GI = f;
        this.GX = f2;
        this.GQ = f3;
        this.up = color;
        this.fs = nK2;
        this.g9 = f4;
        this.g7 = f5;
        this.GD = f6;
    }

    public float GQ() {
        return (float)hi.a("\u00e9", (Object)this, (long)814805298029748568L);
    }

    public float G9() {
        return (float)hi.a("\u00e9", (Object)this, (long)469419441636055766L);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)626711354948772757L);
    }
}
