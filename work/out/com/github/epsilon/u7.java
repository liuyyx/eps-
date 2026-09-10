/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class u7
extends Record {
    private final float EM;
    private final float[] LK;
    private final float e6;
    private final float[] LN;
    private final float EW;
    private final float EJ;
    private final int ej;
    private final Color[] hr;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{u7.class, "EW;e6;EM;EJ;LN;LK;hr;ej", "EW", "e6", "EM", "EJ", "LN", "LK", "hr", "ej"}, this, object);
    }

    public float E6() {
        return (float)hi.a("\u00e9", (Object)this, (long)992365785973811755L);
    }

    public float EJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1171470903771854089L);
    }

    public float EM() {
        return (float)hi.a("\u00e9", (Object)this, (long)858581136810999782L);
    }

    public float[] LN() {
        return hi.a("\u00e9", (Object)this, (long)1123076111750954953L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{u7.class, "EW;e6;EM;EJ;LN;LK;hr;ej", "EW", "e6", "EM", "EJ", "LN", "LK", "hr", "ej"}, this);
    }

    private u7(float f, float f2, float f3, float f4, float[] fArray, float[] fArray2, Color[] colorArray, int n) {
        this.EW = f;
        this.e6 = f2;
        this.EM = f3;
        this.EJ = f4;
        this.LN = fArray;
        this.LK = fArray2;
        this.hr = colorArray;
        this.ej = n;
    }

    public Color[] hr() {
        return hi.a("\u00e9", (Object)this, (long)1252324845321044416L);
    }

    public int Ej() {
        return (int)hi.a("\u00e9", (Object)this, (long)535635170766057817L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{u7.class, "EW;e6;EM;EJ;LN;LK;hr;ej", "EW", "e6", "EM", "EJ", "LN", "LK", "hr", "ej"}, this);
    }

    public float[] LK() {
        return hi.a("\u00e9", (Object)this, (long)595867139806473876L);
    }

    public float EW() {
        return (float)hi.a("\u00e9", (Object)this, (long)734188310662868479L);
    }
}
