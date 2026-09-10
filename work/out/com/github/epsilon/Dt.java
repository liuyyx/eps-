/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Dt
extends Record {
    private final ih wX;
    private final ih wG;
    private final String AF;

    private Dt(String string, ih ih2, ih ih3) {
        this.AF = string;
        this.wX = ih2;
        this.wG = ih3;
    }

    public String AF() {
        return hi.a("\u00e9", (Object)this, (long)1068029393868919505L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dt.class, "AF;wX;wG", "AF", "wX", "wG"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dt.class, "AF;wX;wG", "AF", "wX", "wG"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dt.class, "AF;wX;wG", "AF", "wX", "wG"}, this);
    }

    public ih wX() {
        return hi.a("\u00e9", (Object)this, (long)1259451381574520472L);
    }

    public ih wG() {
        return hi.a("\u00e9", (Object)this, (long)378778989624173919L);
    }
}
