/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record _2(ih oR, float oq, float o2) {
    private final ih oR;
    private final float oq;
    private final float o2;

    public float oq() {
        return (float)hi.a("\u00e9", (Object)this, (long)846353746945515348L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_2.class, "oR;o2;oq", "oR", "o2", "oq"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_2.class, "oR;o2;oq", "oR", "o2", "oq"}, this);
    }

    public ih oR() {
        return hi.a("\u00e9", (Object)this, (long)1267747187496619402L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_2.class, "oR;o2;oq", "oR", "o2", "oq"}, this);
    }

    public _2(ih ih2, float f, float f2) {
        this.oR = ih2;
        this.o2 = f;
        this.oq = f2;
    }

    public float o2() {
        return (float)hi.a("\u00e9", (Object)this, (long)1101737989002581039L);
    }
}
