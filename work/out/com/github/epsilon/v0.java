/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class v0
extends Record {
    private final float JB;
    private final Color TI;
    private final String q8;

    public String q8() {
        return hi.a("\u00e9", (Object)this, (long)906982162297577742L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{v0.class, "q8;TI;JB", "q8", "TI", "JB"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{v0.class, "q8;TI;JB", "q8", "TI", "JB"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{v0.class, "q8;TI;JB", "q8", "TI", "JB"}, this);
    }

    public float JB() {
        return (float)hi.a("\u00e9", (Object)this, (long)1097180311804645135L);
    }

    public Color TI() {
        return hi.a("\u00e9", (Object)this, (long)976732922106258033L);
    }

    private v0(String string, Color color, float f) {
        this.q8 = string;
        this.TI = color;
        this.JB = f;
    }
}
