/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Xu;
import com.github.epsilon.hi;
import com.github.epsilon.y3;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class uM
extends Record {
    private final Xu ef;
    private final y3 rM;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uM.class, "rM;ef", "rM", "ef"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{uM.class, "rM;ef", "rM", "ef"}, this);
    }

    public Xu Ef() {
        return hi.a("\u00e9", (Object)this, (long)846103144488187140L);
    }

    private uM(y3 y32, Xu xu) {
        this.rM = y32;
        this.ef = xu;
    }

    public y3 rM() {
        return hi.a("\u00e9", (Object)this, (long)1295827858797687889L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uM.class, "rM;ef", "rM", "ef"}, this, object);
    }
}
