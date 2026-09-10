/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class gi
extends Record
implements _Q {
    private final Color g1;
    private final float g3;
    private final float g8;
    private final float GZ;
    private final float GO;
    private final boolean NR;
    private final float gk;
    private final Color GK;
    private final float gu;
    private final float gz;
    private final Color GN;

    public gi(float f, float f2, float f3, float f4, float f5, float f6, boolean bl, float f7, Color color, Color color2, Color color3) {
        this.gu = f;
        this.GO = f2;
        this.gk = f3;
        this.gz = f4;
        this.g3 = f5;
        this.GZ = f6;
        this.NR = bl;
        this.g8 = f7;
        this.GN = color;
        this.GK = color2;
        this.g1 = color3;
    }

    public float G3() {
        return (float)hi.a("\u00e9", (Object)this, (long)1313804153715246427L);
    }

    public float G8() {
        return (float)hi.a("\u00e9", (Object)this, (long)474170594708760155L);
    }

    public float GZ() {
        return (float)hi.a("\u00e9", (Object)this, (long)685542501436940544L);
    }

    public float Gu() {
        return (float)hi.a("\u00e9", (Object)this, (long)427609738995757662L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gi.class, "gu;GO;gk;gz;g3;GZ;NR;g8;GN;GK;g1", "gu", "GO", "gk", "gz", "g3", "GZ", "NR", "g8", "GN", "GK", "g1"}, this);
    }

    public boolean NR() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1189563137578216095L);
    }

    public float Gk() {
        return (float)hi.a("\u00e9", (Object)this, (long)782450645154768263L);
    }

    public float Gz() {
        return (float)hi.a("\u00e9", (Object)this, (long)1142474814563557259L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gi.class, "gu;GO;gk;gz;g3;GZ;NR;g8;GN;GK;g1", "gu", "GO", "gk", "gz", "g3", "GZ", "NR", "g8", "GN", "GK", "g1"}, this, object);
    }

    public Color G1() {
        return hi.a("\u00e9", (Object)this, (long)705292956381667337L);
    }

    public Color GK() {
        return hi.a("\u00e9", (Object)this, (long)697557917831304325L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gi.class, "gu;GO;gk;gz;g3;GZ;NR;g8;GN;GK;g1", "gu", "GO", "gk", "gz", "g3", "GZ", "NR", "g8", "GN", "GK", "g1"}, this);
    }

    public Color GN() {
        return hi.a("\u00e9", (Object)this, (long)1066254177105372427L);
    }

    public float GO() {
        return (float)hi.a("\u00e9", (Object)this, (long)1111083905353305159L);
    }
}
