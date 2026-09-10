/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class Xg
extends Record {
    private final int HT;
    private final double dp;
    private final int hc;
    private final double dS;

    public Xg(double d, double d2, int n, int n2) {
        this.dS = d;
        this.dp = d2;
        this.HT = n;
        this.hc = n2;
    }

    public int HT() {
        return (int)hi.a("\u00e9", (Object)this, (long)420689090845509898L);
    }

    public int Hc() {
        return (int)hi.a("\u00e9", (Object)this, (long)1198728701136210977L);
    }

    public double dp() {
        return (double)hi.a("\u00e9", (Object)this, (long)386651122962397924L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Xg.class, "dS;dp;HT;hc", "dS", "dp", "HT", "hc"}, this);
    }

    public double dS() {
        return (double)hi.a("\u00e9", (Object)this, (long)1117430338219857183L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Xg.class, "dS;dp;HT;hc", "dS", "dp", "HT", "hc"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Xg.class, "dS;dp;HT;hc", "dS", "dp", "HT", "hc"}, this, object);
    }
}
