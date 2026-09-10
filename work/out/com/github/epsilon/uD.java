/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.yc;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class uD
extends Record {
    private final yc nk;
    private final String se;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uD.class, "se;nk", "se", "nk"}, this, object);
    }

    private uD(String string, yc yc2) {
        this.se = string;
        this.nk = yc2;
    }

    public String Se() {
        return hi.a("\u00e9", (Object)this, (long)719488640051740560L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uD.class, "se;nk", "se", "nk"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{uD.class, "se;nk", "se", "nk"}, this);
    }

    public yc Nk() {
        return hi.a("\u00e9", (Object)this, (long)789249949293958216L);
    }
}
