/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class O4
extends Record {
    private final float JF;
    private final float jn;
    private final float j7;

    public float J7() {
        return (float)hi.a("\u00e9", (Object)this, (long)1121284424791155355L);
    }

    public float JF() {
        return (float)hi.a("\u00e9", (Object)this, (long)820431578038215679L);
    }

    private O4(float f, float f2, float f3) {
        this.j7 = f;
        this.JF = f2;
        this.jn = f3;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{O4.class, "j7;JF;jn", "j7", "JF", "jn"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{O4.class, "j7;JF;jn", "j7", "JF", "jn"}, this, object);
    }

    public float Jn() {
        return (float)hi.a("\u00e9", (Object)this, (long)914129872965245373L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{O4.class, "j7;JF;jn", "j7", "JF", "jn"}, this);
    }
}
