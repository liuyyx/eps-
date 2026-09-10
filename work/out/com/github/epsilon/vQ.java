/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Ds;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class vQ
extends Record {
    private final float ik;
    private final float iw;
    private final Ds kw;
    private final float iY;
    private final float ia;
    private final float iN;
    private final float ip;

    private vQ(Ds ds, float f, float f2, float f3, float f4, float f5, float f6) {
        this.kw = ds;
        this.iY = f;
        this.ia = f2;
        this.iN = f3;
        this.ik = f4;
        this.iw = f5;
        this.ip = f6;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vQ.class, "kw;iY;ia;iN;ik;iw;ip", "kw", "iY", "ia", "iN", "ik", "iw", "ip"}, this);
    }

    public float ip() {
        return (float)hi.a("\u00e9", (Object)this, (long)1168350740157819493L);
    }

    public Ds kw() {
        return hi.a("\u00e9", (Object)this, (long)668535566711385399L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vQ.class, "kw;iY;ia;iN;ik;iw;ip", "kw", "iY", "ia", "iN", "ik", "iw", "ip"}, this, object);
    }

    public float iw() {
        return (float)hi.a("\u00e9", (Object)this, (long)1147973611868105130L);
    }

    public float iN() {
        return (float)hi.a("\u00e9", (Object)this, (long)1322352487687463294L);
    }

    public float iY() {
        return (float)hi.a("\u00e9", (Object)this, (long)843932326826264423L);
    }

    public float ia() {
        return (float)hi.a("\u00e9", (Object)this, (long)381102042503820564L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vQ.class, "kw;iY;ia;iN;ik;iw;ip", "kw", "iY", "ia", "iN", "ik", "iw", "ip"}, this);
    }

    public float ik() {
        return (float)hi.a("\u00e9", (Object)this, (long)544156922282753525L);
    }
}
