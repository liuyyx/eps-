/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class nA
extends Record {
    private final String wF;
    private final int lp;
    private final int lj;
    private final float qA;
    private final int LH;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nA.class, "wF;qA;lp;lj;LH", "wF", "qA", "lp", "lj", "LH"}, this);
    }

    public int Lp() {
        return (int)hi.a("\u00e9", (Object)this, (long)383960432045216390L);
    }

    public float qA() {
        return (float)hi.a("\u00e9", (Object)this, (long)1186530877860110318L);
    }

    public int LH() {
        return (int)hi.a("\u00e9", (Object)this, (long)761799416257567389L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nA.class, "wF;qA;lp;lj;LH", "wF", "qA", "lp", "lj", "LH"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nA.class, "wF;qA;lp;lj;LH", "wF", "qA", "lp", "lj", "LH"}, this);
    }

    public int Lj() {
        return (int)hi.a("\u00e9", (Object)this, (long)740484329928997908L);
    }

    public String wF() {
        return hi.a("\u00e9", (Object)this, (long)935267261914904438L);
    }

    private nA(String string, float f, int n, int n2, int n3) {
        this.wF = string;
        this.qA = f;
        this.lp = n;
        this.lj = n2;
        this.LH = n3;
    }
}
