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

public final class u6
extends Record
implements yM {
    private final float bn;
    private final Color zH;
    private final Color zA;
    private final long sequence;
    private final float BH;
    private final float BL;
    private final XL bounds;
    private final int layer;
    private final Xu scissor;
    private final float b7;
    private final float BG;
    private final float BM;
    private final float bh;
    private final Color z6;
    private final boolean xt;

    public float Bn() {
        return (float)hi.a("\u00e9", (Object)this, (long)1084652573084197501L);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)686586743204655656L);
    }

    public float B7() {
        return (float)hi.a("\u00e9", (Object)this, (long)643879150944148208L);
    }

    public Color zH() {
        return hi.a("\u00e9", (Object)this, (long)915815579054992243L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{u6.class, "layer;sequence;bounds;scissor;BM;BG;bh;b7;bn;BH;xt;BL;z6;zH;zA", "layer", "sequence", "bounds", "scissor", "BM", "BG", "bh", "b7", "bn", "BH", "xt", "BL", "z6", "zH", "zA"}, this);
    }

    public float BG() {
        return (float)hi.a("\u00e9", (Object)this, (long)1231899687459333445L);
    }

    public Color z6() {
        return hi.a("\u00e9", (Object)this, (long)862201625490906817L);
    }

    public u6(int n, long l, XL xL, Xu xu, float f, float f2, float f3, float f4, float f5, float f6, boolean bl, float f7, Color color, Color color2, Color color3) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.BM = f;
        this.BG = f2;
        this.bh = f3;
        this.b7 = f4;
        this.bn = f5;
        this.BH = f6;
        this.xt = bl;
        this.BL = f7;
        this.z6 = color;
        this.zH = color2;
        this.zA = color3;
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)1161638314680404514L);
    }

    public float BM() {
        return (float)hi.a("\u00e9", (Object)this, (long)936623173698218398L);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)899200862337730217L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{u6.class, "layer;sequence;bounds;scissor;BM;BG;bh;b7;bn;BH;xt;BL;z6;zH;zA", "layer", "sequence", "bounds", "scissor", "BM", "BG", "bh", "b7", "bn", "BH", "xt", "BL", "z6", "zH", "zA"}, this);
    }

    public float BH() {
        return (float)hi.a("\u00e9", (Object)this, (long)1218794228905525261L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{u6.class, "layer;sequence;bounds;scissor;BM;BG;bh;b7;bn;BH;xt;BL;z6;zH;zA", "layer", "sequence", "bounds", "scissor", "BM", "BG", "bh", "b7", "bn", "BH", "xt", "BL", "z6", "zH", "zA"}, this, object);
    }

    public float BL() {
        return (float)hi.a("\u00e9", (Object)this, (long)389847925128106064L);
    }

    public Color zA() {
        return hi.a("\u00e9", (Object)this, (long)605696609599396987L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)599769262662249761L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)784837004660479060L);
    }

    public float Bh() {
        return (float)hi.a("\u00e9", (Object)this, (long)651213032273914353L);
    }

    public boolean Xt() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1202976869711286627L);
    }
}
