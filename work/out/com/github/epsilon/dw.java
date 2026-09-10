/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dw
extends Record {
    private final boolean j9;
    private final int bv;
    private final boolean j1;
    private final boolean jS;
    private final int BU;
    private final float ov;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dw.class, "ov;BU;bv;j1;jS;j9", "ov", "BU", "bv", "j1", "jS", "j9"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dw.class, "ov;BU;bv;j1;jS;j9", "ov", "BU", "bv", "j1", "jS", "j9"}, this);
    }

    public int BU() {
        return (int)hi.a("\u00e9", (Object)this, (long)1080301184627013799L);
    }

    public int Bv() {
        return (int)hi.a("\u00e9", (Object)this, (long)1033274870412255092L);
    }

    public dw(float f, int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        this.ov = f;
        this.BU = n;
        this.bv = n2;
        this.j1 = bl;
        this.jS = bl2;
        this.j9 = bl3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dw.class, "ov;BU;bv;j1;jS;j9", "ov", "BU", "bv", "j1", "jS", "j9"}, this);
    }

    public boolean j9() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)783834137018711149L);
    }

    public boolean jS() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)694442530414832196L);
    }

    public boolean j1() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)586046073776004218L);
    }

    public float Ov() {
        return (float)hi.a("\u00e9", (Object)this, (long)556011729237170076L);
    }
}
