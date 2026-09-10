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

public final class v1
extends Record
implements yM {
    private final Xu scissor;
    private final float qu;
    private final int layer;
    private final long sequence;
    private final float qI;
    private final Color ns;
    private final float qf;
    private final XL bounds;
    private final float qQ;

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)364639781056886215L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{v1.class, "layer;sequence;bounds;scissor;qu;qf;qI;qQ;ns", "layer", "sequence", "bounds", "scissor", "qu", "qf", "qI", "qQ", "ns"}, this);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)484453552281059368L);
    }

    public Color ns() {
        return hi.a("\u00e9", (Object)this, (long)488070101173801184L);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)554725441122586021L);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)767575397789638518L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)948066530505520337L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{v1.class, "layer;sequence;bounds;scissor;qu;qf;qI;qQ;ns", "layer", "sequence", "bounds", "scissor", "qu", "qf", "qI", "qQ", "ns"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{v1.class, "layer;sequence;bounds;scissor;qu;qf;qI;qQ;ns", "layer", "sequence", "bounds", "scissor", "qu", "qf", "qI", "qQ", "ns"}, this);
    }

    public float qu() {
        return (float)hi.a("\u00e9", (Object)this, (long)419769555755572966L);
    }

    public float qf() {
        return (float)hi.a("\u00e9", (Object)this, (long)1318220168390354494L);
    }

    public float qI() {
        return (float)hi.a("\u00e9", (Object)this, (long)709521816093349873L);
    }

    public v1(int n, long l, XL xL, Xu xu, float f, float f2, float f3, float f4, Color color) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.qu = f;
        this.qf = f2;
        this.qI = f3;
        this.qQ = f4;
        this.ns = color;
    }

    public float qQ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1131463363508253627L);
    }
}
