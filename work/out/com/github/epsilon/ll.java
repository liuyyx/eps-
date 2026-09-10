/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class ll
extends Record
implements _Q {
    private final List<_Q> q2;
    private final ih zC;

    public List<_Q> q2() {
        return hi.a("\u00e9", (Object)this, (long)1237731938104723418L);
    }

    public ll(ih ih2, List<_Q> list) {
        this.zC = ih2;
        this.q2 = list;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ll.class, "zC;q2", "zC", "q2"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ll.class, "zC;q2", "zC", "q2"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ll.class, "zC;q2", "zC", "q2"}, this, object);
    }

    public ih zC() {
        return hi.a("\u00e9", (Object)this, (long)462585869906943969L);
    }
}
