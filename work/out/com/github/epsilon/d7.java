/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.X6;
import com.github.epsilon.XL;
import com.github.epsilon.Xu;
import com.github.epsilon.hi;
import com.github.epsilon.y3;
import com.github.epsilon.yM;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class d7
extends Record
implements yM {
    private final float xY;
    private final float xU;
    private final float xl;
    private final Xu scissor;
    private final int layer;
    private final XL bounds;
    private final long sequence;
    private final float xx;
    private final float xg;
    private final Color OA;
    private final float xr;
    private final float xN;
    private final float xD;
    private final X6 dH;
    private final float xJ;
    private final float x9;
    private final float xR;

    @Override
    public y3 a() {
        return hi.a("j", (long)1260416271742983282L);
    }

    public float xg() {
        return (float)hi.a("\u00e9", (Object)this, (long)817586331818566392L);
    }

    public float xN() {
        return (float)hi.a("\u00e9", (Object)this, (long)1102661947678490384L);
    }

    public float xr() {
        return (float)hi.a("\u00e9", (Object)this, (long)1300997601382896798L);
    }

    public d7(int n, long l, XL xL, Xu xu, X6 x6, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color, float f9, float f10, float f11) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.dH = x6;
        this.xr = f;
        this.xg = f2;
        this.xl = f3;
        this.xD = f4;
        this.xY = f5;
        this.xU = f6;
        this.xN = f7;
        this.xx = f8;
        this.OA = color;
        this.xJ = f9;
        this.xR = f10;
        this.x9 = f11;
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)1330442864643023070L);
    }

    public float xD() {
        return (float)hi.a("\u00e9", (Object)this, (long)1330852505132407527L);
    }

    public float xU() {
        return (float)hi.a("\u00e9", (Object)this, (long)455221553341904682L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{d7.class, "layer;sequence;bounds;scissor;dH;xr;xg;xl;xD;xY;xU;xN;xx;OA;xJ;xR;x9", "layer", "sequence", "bounds", "scissor", "dH", "xr", "xg", "xl", "xD", "xY", "xU", "xN", "xx", "OA", "xJ", "xR", "x9"}, this);
    }

    public float xR() {
        return (float)hi.a("\u00e9", (Object)this, (long)676214650423786738L);
    }

    public float xJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1084267128732777228L);
    }

    public Color OA() {
        return hi.a("\u00e9", (Object)this, (long)1282991138549672018L);
    }

    public float x9() {
        return (float)hi.a("\u00e9", (Object)this, (long)497646718137251567L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d7.class, "layer;sequence;bounds;scissor;dH;xr;xg;xl;xD;xY;xU;xN;xx;OA;xJ;xR;x9", "layer", "sequence", "bounds", "scissor", "dH", "xr", "xg", "xl", "xD", "xY", "xU", "xN", "xx", "OA", "xJ", "xR", "x9"}, this);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)600787917579126334L);
    }

    public float xl() {
        return (float)hi.a("\u00e9", (Object)this, (long)778366269651292132L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)916298665517775913L);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)979681580403837939L);
    }

    public float xx() {
        return (float)hi.a("\u00e9", (Object)this, (long)591550634771124120L);
    }

    public X6 dH() {
        return hi.a("\u00e9", (Object)this, (long)667259998868547150L);
    }

    public float xY() {
        return (float)hi.a("\u00e9", (Object)this, (long)1001570211749252002L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d7.class, "layer;sequence;bounds;scissor;dH;xr;xg;xl;xD;xY;xU;xN;xx;OA;xJ;xR;x9", "layer", "sequence", "bounds", "scissor", "dH", "xr", "xg", "xl", "xD", "xY", "xU", "xN", "xx", "OA", "xJ", "xR", "x9"}, this, object);
    }
}
