/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class Xs
extends Record {
    private final boolean tN;
    private final boolean tL;
    private final double cS;
    private final boolean tD;
    private final double cB;
    private final boolean tC;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Xs.class, "tN;tL;tC;tD;cB;cS", "tN", "tL", "tC", "tD", "cB", "cS"}, this, object);
    }

    public boolean tN() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)529957454823394027L);
    }

    public Xs(boolean bl, boolean bl2, boolean bl3, boolean bl4, double d, double d2) {
        this.tN = bl;
        this.tL = bl2;
        this.tC = bl3;
        this.tD = bl4;
        this.cB = d;
        this.cS = d2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Xs.class, "tN;tL;tC;tD;cB;cS", "tN", "tL", "tC", "tD", "cB", "cS"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Xs.class, "tN;tL;tC;tD;cB;cS", "tN", "tL", "tC", "tD", "cB", "cS"}, this);
    }

    public boolean tC() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)561781259386884356L);
    }

    public double cS() {
        return (double)hi.a("\u00e9", (Object)this, (long)1103135463804915836L);
    }

    public boolean tD() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)431923503026253532L);
    }

    public double cB() {
        return (double)hi.a("\u00e9", (Object)this, (long)567764811895961340L);
    }

    public boolean tL() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)664012171384505691L);
    }
}
