/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.vh;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Xd
extends Record {
    private final ih yL;
    private final vh<?> l7;

    public vh<?> l7() {
        return hi.a("\u00e9", (Object)this, (long)1043966093046879271L);
    }

    private Xd(vh<?> vh2, ih ih2) {
        this.l7 = vh2;
        this.yL = ih2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Xd.class, "l7;yL", "l7", "yL"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Xd.class, "l7;yL", "l7", "yL"}, this, object);
    }

    public ih yL() {
        return hi.a("\u00e9", (Object)this, (long)555300059870891296L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Xd.class, "l7;yL", "l7", "yL"}, this);
    }
}
