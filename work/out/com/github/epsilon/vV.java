/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class vV
extends Record {
    private final long oa;
    private final String vQ;
    private final String vA;

    public long Oa() {
        return (long)hi.a("\u00e9", (Object)this, (long)1177268167097119754L);
    }

    private vV(String string, long l, String string2) {
        this.vQ = string;
        this.oa = l;
        this.vA = string2;
    }

    public String vQ() {
        return hi.a("\u00e9", (Object)this, (long)1081610737612588828L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vV.class, "vQ;oa;vA", "vQ", "oa", "vA"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vV.class, "vQ;oa;vA", "vQ", "oa", "vA"}, this, object);
    }

    public String vA() {
        return hi.a("\u00e9", (Object)this, (long)1048344157179464681L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vV.class, "vQ;oa;vA", "vQ", "oa", "vA"}, this);
    }
}
