/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.df;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Oo
extends Record {
    private final String mu;
    private final ih jE;
    private final df aI;

    public df aI() {
        return hi.a("\u00e9", (Object)this, (long)1297572409177253148L);
    }

    private Oo(df df2, String string, ih ih2) {
        this.aI = df2;
        this.mu = string;
        this.jE = ih2;
    }

    public String mu() {
        return hi.a("\u00e9", (Object)this, (long)902499606325593756L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Oo.class, "aI;mu;jE", "aI", "mu", "jE"}, this);
    }

    public ih jE() {
        return hi.a("\u00e9", (Object)this, (long)435032874897133201L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Oo.class, "aI;mu;jE", "aI", "mu", "jE"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Oo.class, "aI;mu;jE", "aI", "mu", "jE"}, this);
    }
}
