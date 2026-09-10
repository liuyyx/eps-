/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class D9
extends Record
implements _Q {
    private final float hK;
    private final Color u_;
    private final ih ja;
    private final float hD;
    private final Color ua;

    public Color U_() {
        return hi.a("\u00e9", (Object)this, (long)1027520238289138195L);
    }

    public float hK() {
        return (float)hi.a("\u00e9", (Object)this, (long)895958823072460344L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{D9.class, "ja;hD;hK;u_;ua", "ja", "hD", "hK", "u_", "ua"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{D9.class, "ja;hD;hK;u_;ua", "ja", "hD", "hK", "u_", "ua"}, this);
    }

    public ih ja() {
        return hi.a("\u00e9", (Object)this, (long)1075655208166376848L);
    }

    public D9(ih ih2, float f, float f2, Color color, Color color2) {
        this.ja = ih2;
        this.hD = f;
        this.hK = f2;
        this.u_ = color;
        this.ua = color2;
    }

    public float hD() {
        return (float)hi.a("\u00e9", (Object)this, (long)840937468342864575L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{D9.class, "ja;hD;hK;u_;ua", "ja", "hD", "hK", "u_", "ua"}, this);
    }

    public Color Ua() {
        return hi.a("\u00e9", (Object)this, (long)1034502243177586080L);
    }
}
