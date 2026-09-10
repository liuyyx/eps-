/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class zw
extends Record {
    private final Color qt;
    private final float[] XY;
    private final float[] XG;
    private final float[] XB;
    private final int vj;
    private final float PL;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zw.class, "PL;qt;XG;XB;XY;vj", "PL", "qt", "XG", "XB", "XY", "vj"}, this);
    }

    public float[] XG() {
        return hi.a("\u00e9", (Object)this, (long)1073122838843033722L);
    }

    public int Vj() {
        return (int)hi.a("\u00e9", (Object)this, (long)777425087499158693L);
    }

    public Color Qt() {
        return hi.a("\u00e9", (Object)this, (long)586571326323514023L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zw.class, "PL;qt;XG;XB;XY;vj", "PL", "qt", "XG", "XB", "XY", "vj"}, this);
    }

    public float[] XB() {
        return hi.a("\u00e9", (Object)this, (long)743195314423990852L);
    }

    public float[] XY() {
        return hi.a("\u00e9", (Object)this, (long)714035393953095044L);
    }

    private zw(float f, Color color, float[] fArray, float[] fArray2, float[] fArray3, int n) {
        this.PL = f;
        this.qt = color;
        this.XG = fArray;
        this.XB = fArray2;
        this.XY = fArray3;
        this.vj = n;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zw.class, "PL;qt;XG;XB;XY;vj", "PL", "qt", "XG", "XB", "XY", "vj"}, this, object);
    }

    public float PL() {
        return (float)hi.a("\u00e9", (Object)this, (long)1149087856671792948L);
    }
}
