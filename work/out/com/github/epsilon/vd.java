/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class vd
extends Record
implements _Q {
    private final List<_Q> y6;
    private final int jo;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vd.class, "jo;y6", "jo", "y6"}, this, object);
    }

    public List<_Q> y6() {
        return hi.a("\u00e9", (Object)this, (long)403099764637221121L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vd.class, "jo;y6", "jo", "y6"}, this);
    }

    public vd(int n, List<_Q> list) {
        this.jo = n;
        this.y6 = list;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vd.class, "jo;y6", "jo", "y6"}, this);
    }

    public int Jo() {
        return (int)hi.a("\u00e9", (Object)this, (long)1171083854640136275L);
    }
}
