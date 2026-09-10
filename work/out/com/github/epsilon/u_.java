/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class u_
extends Record {
    private final int ho;
    private final int ha;

    public int Ha() {
        return (int)hi.a("\u00e9", (Object)this, (long)796025780251056778L);
    }

    public int Ho() {
        return (int)hi.a("\u00e9", (Object)this, (long)660550051555285674L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{u_.class, "ho;ha", "ho", "ha"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{u_.class, "ho;ha", "ho", "ha"}, this);
    }

    public u_(int n, int n2) {
        this.ho = n;
        this.ha = n2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{u_.class, "ho;ha", "ho", "ha"}, this);
    }
}
