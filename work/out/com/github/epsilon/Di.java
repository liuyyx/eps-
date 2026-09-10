/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.gQ;
import com.github.epsilon.hi;
import com.github.epsilon.y1;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Di
extends Record {
    private final gQ e8;
    private final y1 zu;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Di.class, "zu;e8", "zu", "e8"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Di.class, "zu;e8", "zu", "e8"}, this, object);
    }

    private Di(y1 y12, gQ gQ2) {
        this.zu = y12;
        this.e8 = gQ2;
    }

    public gQ E8() {
        return hi.a("\u00e9", (Object)this, (long)1187451610352340674L);
    }

    public y1 Zu() {
        return hi.a("\u00e9", (Object)this, (long)544648573688132178L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Di.class, "zu;e8", "zu", "e8"}, this);
    }
}
