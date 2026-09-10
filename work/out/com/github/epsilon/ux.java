/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ux
extends Record
implements _Q {
    private final ih b9;
    private final float hg;
    private final String o0;
    private final String oc;
    private final float hJ;

    public float hJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)1266614853986787200L);
    }

    public String oc() {
        return hi.a("\u00e9", (Object)this, (long)1289528043785296073L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ux.class, "b9;oc;o0;hJ;hg", "b9", "oc", "o0", "hJ", "hg"}, this, object);
    }

    public float hg() {
        return (float)hi.a("\u00e9", (Object)this, (long)1310992754932120324L);
    }

    public ux(ih ih2, String string, String string2, float f, float f2) {
        this.b9 = ih2;
        this.oc = string;
        this.o0 = string2;
        this.hJ = f;
        this.hg = f2;
    }

    public String o0() {
        return hi.a("\u00e9", (Object)this, (long)564124668532980404L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ux.class, "b9;oc;o0;hJ;hg", "b9", "oc", "o0", "hJ", "hg"}, this);
    }

    public ih b9() {
        return hi.a("\u00e9", (Object)this, (long)794522858581698494L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ux.class, "b9;oc;o0;hJ;hg", "b9", "oc", "o0", "hJ", "hg"}, this);
    }
}
