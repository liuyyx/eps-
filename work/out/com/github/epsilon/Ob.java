/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record Ob(Color gv, Color gB, Color gZ) {
    private final Color gv;
    private final Color gB;
    private final Color gZ;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Ob.class, "gZ;gB;gv", "gZ", "gB", "gv"}, this);
    }

    public Ob(Color color, Color color2, Color color3) {
        this.gZ = color;
        this.gB = color2;
        this.gv = color3;
    }

    public Color gZ() {
        return hi.a("\u00e9", (Object)this, (long)627735385605037138L);
    }

    public Color gB() {
        return hi.a("\u00e9", (Object)this, (long)930356839311452351L);
    }

    public Color gv() {
        return hi.a("\u00e9", (Object)this, (long)1044562170859243295L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Ob.class, "gZ;gB;gv", "gZ", "gB", "gv"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Ob.class, "gZ;gB;gv", "gZ", "gB", "gv"}, this, object);
    }
}
