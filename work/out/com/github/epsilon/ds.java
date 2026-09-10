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

public final class ds
extends Record
implements yM {
    private final String r7;
    private final nK qe;
    private final float tB;
    private final XL bounds;
    private final Color rZ;
    private final Xu scissor;
    private final float ti;
    private final int layer;
    private final float t3;
    private final int p1;
    private final long sequence;
    private final float tA;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ds.class, "layer;sequence;bounds;scissor;r7;tA;ti;t3;rZ;tB;p1;qe", "layer", "sequence", "bounds", "scissor", "r7", "tA", "ti", "t3", "rZ", "tB", "p1", "qe"}, this);
    }

    public ds(int n, long l, XL xL, Xu xu, String string, float f, float f2, float f3, Color color, float f4, int n2, nK nK2) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.r7 = string;
        this.tA = f;
        this.ti = f2;
        this.t3 = f3;
        this.rZ = color;
        this.tB = f4;
        this.p1 = n2;
        this.qe = nK2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ds.class, "layer;sequence;bounds;scissor;r7;tA;ti;t3;rZ;tB;p1;qe", "layer", "sequence", "bounds", "scissor", "r7", "tA", "ti", "t3", "rZ", "tB", "p1", "qe"}, this, object);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)355867542790411538L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)936894626155007932L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ds.class, "layer;sequence;bounds;scissor;r7;tA;ti;t3;rZ;tB;p1;qe", "layer", "sequence", "bounds", "scissor", "r7", "tA", "ti", "t3", "rZ", "tB", "p1", "qe"}, this);
    }

    public int p1() {
        return (int)hi.a("\u00e9", (Object)this, (long)1197812888397807558L);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)1331058891406816160L);
    }

    public nK Qe() {
        return hi.a("\u00e9", (Object)this, (long)375391959280691724L);
    }

    public float tA() {
        return (float)hi.a("\u00e9", (Object)this, (long)680365934322733255L);
    }

    public String r7() {
        return hi.a("\u00e9", (Object)this, (long)1168144578825895598L);
    }

    public Color rZ() {
        return hi.a("\u00e9", (Object)this, (long)911140845115682963L);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)555470498943839798L);
    }

    public float tB() {
        return (float)hi.a("\u00e9", (Object)this, (long)675386487377629618L);
    }

    public float ti() {
        return (float)hi.a("\u00e9", (Object)this, (long)701833509443675760L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)767823893886074002L);
    }

    public float t3() {
        return (float)hi.a("\u00e9", (Object)this, (long)1171231238292055196L);
    }
}
