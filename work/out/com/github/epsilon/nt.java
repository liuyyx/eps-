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

public final class nt
extends Record
implements yM {
    private final Color YT;
    private final String hX;
    private final float gc;
    private final float gh;
    private final int layer;
    private final long sequence;
    private final float gF;
    private final XL bounds;
    private final nK mv;
    private final Color ys;
    private final Xu scissor;

    public nK Mv() {
        return hi.a("\u00e9", (Object)this, (long)576615703674807824L);
    }

    public nt(int n, long l, XL xL, Xu xu, String string, float f, float f2, float f3, Color color, Color color2, nK nK2) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.hX = string;
        this.gh = f;
        this.gF = f2;
        this.gc = f3;
        this.ys = color;
        this.YT = color2;
        this.mv = nK2;
    }

    public Color Ys() {
        return hi.a("\u00e9", (Object)this, (long)690687596440555808L);
    }

    public String hX() {
        return hi.a("\u00e9", (Object)this, (long)668102207120110572L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)721957279488731733L);
    }

    public float gF() {
        return (float)hi.a("\u00e9", (Object)this, (long)893749698639164420L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nt.class, "layer;sequence;bounds;scissor;hX;gh;gF;gc;ys;YT;mv", "layer", "sequence", "bounds", "scissor", "hX", "gh", "gF", "gc", "ys", "YT", "mv"}, this);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)880880257565140391L);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)713855777627303784L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nt.class, "layer;sequence;bounds;scissor;hX;gh;gF;gc;ys;YT;mv", "layer", "sequence", "bounds", "scissor", "hX", "gh", "gF", "gc", "ys", "YT", "mv"}, this);
    }

    public float gh() {
        return (float)hi.a("\u00e9", (Object)this, (long)621123884381621881L);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)1130919292852837508L);
    }

    public Color YT() {
        return hi.a("\u00e9", (Object)this, (long)1006370919610564974L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nt.class, "layer;sequence;bounds;scissor;hX;gh;gF;gc;ys;YT;mv", "layer", "sequence", "bounds", "scissor", "hX", "gh", "gF", "gc", "ys", "YT", "mv"}, this, object);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)1196192143129527725L);
    }

    public float gc() {
        return (float)hi.a("\u00e9", (Object)this, (long)649325742858721498L);
    }
}
