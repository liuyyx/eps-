/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.nZ;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class nE
extends Record {
    private final boolean QZ;
    private final double xi;
    private final double xa;
    private final Float fy;
    private final nZ e1;
    private final boolean QA;
    private final boolean QS;

    public boolean QZ() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)463783491883635738L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nE.class, "QS;e1;xi;QA;xa;QZ;fy", "QS", "e1", "xi", "QA", "xa", "QZ", "fy"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nE.class, "QS;e1;xi;QA;xa;QZ;fy", "QS", "e1", "xi", "QA", "xa", "QZ", "fy"}, this, object);
    }

    public boolean QS() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1326498782690622597L);
    }

    public double xa() {
        return (double)hi.a("\u00e9", (Object)this, (long)514232392059446661L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nE.class, "QS;e1;xi;QA;xa;QZ;fy", "QS", "e1", "xi", "QA", "xa", "QZ", "fy"}, this);
    }

    public boolean QA() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1071067509937529227L);
    }

    public Float fy() {
        return hi.a("\u00e9", (Object)this, (long)868789482189622270L);
    }

    public nE(boolean bl, nZ nZ2, double d, boolean bl2, double d2, boolean bl3, Float f) {
        this.QS = bl;
        this.e1 = nZ2;
        this.xi = d;
        this.QA = bl2;
        this.xa = d2;
        this.QZ = bl3;
        this.fy = f;
    }

    public double xi() {
        return (double)hi.a("\u00e9", (Object)this, (long)455149584348213005L);
    }

    public nZ e1() {
        return hi.a("\u00e9", (Object)this, (long)959871022002030924L);
    }
}
