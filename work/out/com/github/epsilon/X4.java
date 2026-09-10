/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.g8;
import com.github.epsilon.hi;
import com.github.epsilon.uT;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class X4
extends Record {
    private final g8 YO;
    private final uT pm;

    private X4(g8 g82, uT uT2) {
        this.YO = g82;
        this.pm = uT2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{X4.class, "YO;pm", "YO", "pm"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{X4.class, "YO;pm", "YO", "pm"}, this);
    }

    public g8 YO() {
        return hi.a("\u00e9", (Object)this, (long)891253583016056378L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{X4.class, "YO;pm", "YO", "pm"}, this);
    }

    public uT Pm() {
        return hi.a("\u00e9", (Object)this, (long)1116341307017664809L);
    }
}
