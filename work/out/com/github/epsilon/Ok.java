/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.nK;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Ok
extends Record {
    private final String vt;
    private final float eb;
    private final nK yA;

    public float Eb() {
        return (float)hi.a("\u00e9", (Object)this, (long)732678950551919693L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Ok.class, "yA;vt;eb", "yA", "vt", "eb"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Ok.class, "yA;vt;eb", "yA", "vt", "eb"}, this);
    }

    public nK yA() {
        return hi.a("\u00e9", (Object)this, (long)727077182052354946L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Ok.class, "yA;vt;eb", "yA", "vt", "eb"}, this);
    }

    public String Vt() {
        return hi.a("\u00e9", (Object)this, (long)680908772163045302L);
    }

    private Ok(nK nK2, String string, float f) {
        this.yA = nK2;
        this.vt = string;
        this.eb = f;
    }
}
