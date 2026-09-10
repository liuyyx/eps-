/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class dc
extends Record {
    private final ih yy;
    private final String yb;

    public String yb() {
        return hi.a("\u00e9", (Object)this, (long)883073124853300980L);
    }

    public ih yy() {
        return hi.a("\u00e9", (Object)this, (long)459354056959204746L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dc.class, "yb;yy", "yb", "yy"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dc.class, "yb;yy", "yb", "yy"}, this);
    }

    private dc(String string, ih ih2) {
        this.yb = string;
        this.yy = ih2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dc.class, "yb;yy", "yb", "yy"}, this, object);
    }
}
