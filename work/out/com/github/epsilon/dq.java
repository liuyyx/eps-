/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.X6;
import com.github.epsilon.hi;
import com.github.epsilon.y4;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dq
extends Record
implements X6 {
    private final y4 i1;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dq.class, "i1", "i1"}, this, object);
    }

    public dq(y4 y42) {
        this.i1 = y42;
    }

    public y4 I1() {
        return hi.a("\u00e9", (Object)this, (long)1251960827076639213L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dq.class, "i1", "i1"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dq.class, "i1", "i1"}, this);
    }
}
