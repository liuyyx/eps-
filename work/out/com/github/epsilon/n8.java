/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class n8
extends Record
implements _Q {
    private final int a;
    private final _Q f;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{n8.class, "a;f", "a", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{n8.class, "a;f", "a", "f"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{n8.class, "a;f", "a", "f"}, this, object);
    }

    public n8(int n, _Q _Q2) {
        this.a = n;
        this.f = _Q2;
    }

    public _Q F() {
        return hi.a("\u00e9", (Object)this, (long)1329238618195321811L);
    }

    public int a() {
        return (int)hi.a("\u00e9", (Object)this, (long)979794409573231724L);
    }
}
