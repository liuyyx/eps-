/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.vt;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class gQ
extends Record {
    private final vt EK;
    private final float GU;
    private final float gq;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gQ.class, "EK;GU;gq", "EK", "GU", "gq"}, this);
    }

    public vt EK() {
        return hi.a("\u00e9", (Object)this, (long)1013641419412981070L);
    }

    private gQ(vt vt2, float f, float f2) {
        this.EK = vt2;
        this.GU = f;
        this.gq = f2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gQ.class, "EK;GU;gq", "EK", "GU", "gq"}, this, object);
    }

    public float Gq() {
        return (float)hi.a("\u00e9", (Object)this, (long)687822776098210209L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gQ.class, "EK;GU;gq", "EK", "GU", "gq"}, this);
    }

    public float GU() {
        return (float)hi.a("\u00e9", (Object)this, (long)613111646263805176L);
    }
}
