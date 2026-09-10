/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class vj
extends Record {
    private final String ce;
    private final ih yo;
    private final ih yc;

    public ih Yo() {
        return hi.a("\u00e9", (Object)this, (long)1001032527667123044L);
    }

    public ih Yc() {
        return hi.a("\u00e9", (Object)this, (long)1010795301735835879L);
    }

    public String ce() {
        return hi.a("\u00e9", (Object)this, (long)749125769760139961L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vj.class, "ce;yo;yc", "ce", "yo", "yc"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vj.class, "ce;yo;yc", "ce", "yo", "yc"}, this);
    }

    private vj(String string, ih ih2, ih ih3) {
        this.ce = string;
        this.yo = ih2;
        this.yc = ih3;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vj.class, "ce;yo;yc", "ce", "yo", "yc"}, this);
    }
}
