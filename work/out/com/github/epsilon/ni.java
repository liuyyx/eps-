/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ni(ih sT, ih sv, ih sb, ih sY) {
    private final ih sT;
    private final ih sv;
    private final ih sb;
    private final ih sY;

    public ni(ih ih2, ih ih3, ih ih4, ih ih5) {
        this.sY = ih2;
        this.sv = ih3;
        this.sT = ih4;
        this.sb = ih5;
    }

    public ih sb() {
        return hi.a("\u00e9", (Object)this, (long)567832785517394517L);
    }

    public ih sY() {
        return hi.a("\u00e9", (Object)this, (long)728345971697037553L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ni.class, "sY;sv;sT;sb", "sY", "sv", "sT", "sb"}, this);
    }

    public ih sT() {
        return hi.a("\u00e9", (Object)this, (long)1116580458845164793L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ni.class, "sY;sv;sT;sb", "sY", "sv", "sT", "sb"}, this);
    }

    public ih sv() {
        return hi.a("\u00e9", (Object)this, (long)519814119670197110L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ni.class, "sY;sv;sT;sb", "sY", "sv", "sT", "sb"}, this, object);
    }
}
