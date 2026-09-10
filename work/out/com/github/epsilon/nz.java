/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.is;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class nz
extends Record {
    private final is uv;
    private final ih oz;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nz.class, "uv;oz", "uv", "oz"}, this);
    }

    public ih Oz() {
        return hi.a("\u00e9", (Object)this, (long)742490970560198032L);
    }

    public is Uv() {
        return hi.a("\u00e9", (Object)this, (long)706734854583872475L);
    }

    private nz(is is2, ih ih2) {
        this.uv = is2;
        this.oz = ih2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nz.class, "uv;oz", "uv", "oz"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nz.class, "uv;oz", "uv", "oz"}, this, object);
    }
}
