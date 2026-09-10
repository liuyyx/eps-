/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class d4
extends Record
implements _Q {
    private final ih MS;
    private final float il;
    private final boolean u4;

    public d4(ih ih2, boolean bl, float f) {
        this.MS = ih2;
        this.u4 = bl;
        this.il = f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{d4.class, "MS;u4;il", "MS", "u4", "il"}, this);
    }

    public float il() {
        return (float)hi.a("\u00e9", (Object)this, (long)1208102000694515945L);
    }

    public ih MS() {
        return hi.a("\u00e9", (Object)this, (long)1131970943555686528L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d4.class, "MS;u4;il", "MS", "u4", "il"}, this, object);
    }

    public boolean U4() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)856945817562573105L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d4.class, "MS;u4;il", "MS", "u4", "il"}, this);
    }
}
