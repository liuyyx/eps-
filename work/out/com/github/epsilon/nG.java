/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class nG
extends Record {
    private final float wp;
    private final float w_;
    private final float wh;
    private final float WN;

    public float Wh() {
        return (float)hi.a("\u00e9", (Object)this, (long)1022632391032686089L);
    }

    public nG(float f, float f2, float f3, float f4) {
        this.w_ = f;
        this.wp = f2;
        this.WN = f3;
        this.wh = f4;
    }

    public float W_() {
        return (float)hi.a("\u00e9", (Object)this, (long)873301441921585911L);
    }

    public float WN() {
        return (float)hi.a("\u00e9", (Object)this, (long)1093621181587009332L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nG.class, "w_;wp;WN;wh", "w_", "wp", "WN", "wh"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nG.class, "w_;wp;WN;wh", "w_", "wp", "WN", "wh"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nG.class, "w_;wp;WN;wh", "w_", "wp", "WN", "wh"}, this, object);
    }

    public float Wp() {
        return (float)hi.a("\u00e9", (Object)this, (long)626322837615944493L);
    }
}
