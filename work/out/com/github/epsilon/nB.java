/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class nB
extends Record {
    private final boolean q1;
    private final int VR;
    private final int vx;
    private final int VG;

    private nB(boolean bl, int n, int n2, int n3) {
        this.q1 = bl;
        this.vx = n;
        this.VR = n2;
        this.VG = n3;
    }

    public boolean q1() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)684364902407299058L);
    }

    public int Vx() {
        return (int)hi.a("\u00e9", (Object)this, (long)1184236822327091403L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nB.class, "q1;vx;VR;VG", "q1", "vx", "VR", "VG"}, this);
    }

    public int VR() {
        return (int)hi.a("\u00e9", (Object)this, (long)1331313291948823209L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nB.class, "q1;vx;VR;VG", "q1", "vx", "VR", "VG"}, this);
    }

    public int VG() {
        return (int)hi.a("\u00e9", (Object)this, (long)724850460841953845L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nB.class, "q1;vx;VR;VG", "q1", "vx", "VR", "VG"}, this, object);
    }
}
