/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Oq;
import com.github.epsilon.XL;
import com.github.epsilon.Xu;
import com.github.epsilon.hi;
import com.github.epsilon.nK;
import com.github.epsilon.y3;
import com.github.epsilon.yM;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class v3
extends Record
implements yM {
    private final Color wr;
    private final float eE;
    private final float ed;
    private final nK cz;
    private final float eC;
    private final int layer;
    private final long sequence;
    private final Oq FE;
    private final String lu;
    private final XL bounds;
    private final Xu scissor;

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)651874777787081704L);
    }

    public String lu() {
        return hi.a("\u00e9", (Object)this, (long)410556833716311187L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{v3.class, "layer;sequence;bounds;scissor;lu;eE;ed;eC;wr;FE;cz", "layer", "sequence", "bounds", "scissor", "lu", "eE", "ed", "eC", "wr", "FE", "cz"}, this);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)490925869034129166L);
    }

    public v3(int n, long l, XL xL, Xu xu, String string, float f, float f2, float f3, Color color, Oq oq, nK nK2) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.lu = string;
        this.eE = f;
        this.ed = f2;
        this.eC = f3;
        this.wr = color;
        this.FE = oq;
        this.cz = nK2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{v3.class, "layer;sequence;bounds;scissor;lu;eE;ed;eC;wr;FE;cz", "layer", "sequence", "bounds", "scissor", "lu", "eE", "ed", "eC", "wr", "FE", "cz"}, this);
    }

    public float eE() {
        return (float)hi.a("\u00e9", (Object)this, (long)1298047554472742424L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)731481205342722678L);
    }

    public float ed() {
        return (float)hi.a("\u00e9", (Object)this, (long)613422936482440955L);
    }

    public Oq FE() {
        return hi.a("\u00e9", (Object)this, (long)692150460515134444L);
    }

    public Color Wr() {
        return hi.a("\u00e9", (Object)this, (long)503608247179033586L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{v3.class, "layer;sequence;bounds;scissor;lu;eE;ed;eC;wr;FE;cz", "layer", "sequence", "bounds", "scissor", "lu", "eE", "ed", "eC", "wr", "FE", "cz"}, this, object);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)1195100004519955288L);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)711410073112213145L);
    }

    public nK Cz() {
        return hi.a("\u00e9", (Object)this, (long)1286260243868629552L);
    }

    public float eC() {
        return (float)hi.a("\u00e9", (Object)this, (long)1144993908998850239L);
    }
}
