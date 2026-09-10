/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.yx;
import java.util.function.Consumer;

public class DM
extends Dl<Double> {
    private final double N;
    private final double P;
    private final double T;
    private static int[] Q;

    public void h(Object[] objectArray) {
        Double d = (Double)objectArray[0];
        super.j(d);
    }

    public void W(Double d) {
        super.j(hi.a("G", (double)hi.a("G", (double)hi.a("\u00a5", (Object)d, (long)637262500311742568L), (double)hi.a("\u00e9", (Object)this, (long)1144197231679543335L), (double)hi.a("\u00e9", (Object)this, (long)360199681281395907L), (long)569387319293504539L), (long)1323649220833053453L));
    }

    public double r() {
        return (double)hi.a("\u00e9", (Object)this, (long)510822960999888187L);
    }

    public double d() {
        return (double)hi.a("\u00e9", (Object)this, (long)1144197231679543335L);
    }

    public DM(String string, double d, double d2, double d3, double d4, yx yx2, Consumer<Double> consumer) {
        super(string, yx2, consumer);
        hi.a("\u00f2", (Object)this, (Object)hi.a("G", (double)d, (long)1323649220833053453L), (long)1032787230140776349L);
        hi.a("\u00f2", (Object)this, (Object)hi.a("G", (double)d, (long)1323649220833053453L), (long)1134770596330567404L);
        this.N = d2;
        this.P = d3;
        this.T = d4;
    }

    public double p() {
        return (double)hi.a("\u00e9", (Object)this, (long)360199681281395907L);
    }

    public static void b(int[] nArray) {
        Q = nArray;
    }

    public static int[] C() {
        return Q;
    }

    static {
        if (DM.C() != null) {
            DM.b(new int[2]);
        }
    }
}
