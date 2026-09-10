/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.vx;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class uS
extends Record
implements _Q {
    private final float nQ;
    private final float nj;
    private final int vX;
    private final float nJ;
    private final int vY;
    private final List<_Q> ln;
    private final vx yT;
    private final ih as;

    public List<_Q> Ln() {
        return hi.a("\u00e9", (Object)this, (long)601464010229432305L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uS.class, "yT;as;nj;nQ;nJ;vX;vY;ln", "yT", "as", "nj", "nQ", "nJ", "vX", "vY", "ln"}, this, object);
    }

    public uS(vx vx2, ih ih2, float f, float f2, float f3, int n, int n2, List<_Q> list) {
        this.yT = vx2;
        this.as = ih2;
        this.nj = f;
        this.nQ = f2;
        this.nJ = f3;
        this.vX = n;
        this.vY = n2;
        this.ln = list;
    }

    public vx yT() {
        return hi.a("\u00e9", (Object)this, (long)760677359880105467L);
    }

    public int vX() {
        return (int)hi.a("\u00e9", (Object)this, (long)1065705893582005523L);
    }

    public float nJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1149439796517931507L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uS.class, "yT;as;nj;nQ;nJ;vX;vY;ln", "yT", "as", "nj", "nQ", "nJ", "vX", "vY", "ln"}, this);
    }

    public float nj() {
        return (float)hi.a("\u00e9", (Object)this, (long)1031570700092711643L);
    }

    public ih as() {
        return hi.a("\u00e9", (Object)this, (long)405405076470217113L);
    }

    public float nQ() {
        return (float)hi.a("\u00e9", (Object)this, (long)515054484396728583L);
    }

    public int vY() {
        return (int)hi.a("\u00e9", (Object)this, (long)375085483539723453L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{uS.class, "yT;as;nj;nQ;nJ;vX;vY;ln", "yT", "as", "nj", "nQ", "nJ", "vX", "vY", "ln"}, this);
    }
}
