/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class Dd
extends Record
implements _Q {
    private final Color wW;
    private final float v_;
    private final float vh;
    private final float vI;
    private final float v2;
    private final Color ww;
    private final Color wT;
    private final Color wg;

    public float vI() {
        return (float)hi.a("\u00e9", (Object)this, (long)1111527871943158378L);
    }

    public Dd(float f, float f2, float f3, float f4, Color color, Color color2, Color color3, Color color4) {
        this.v2 = f;
        this.vh = f2;
        this.v_ = f3;
        this.vI = f4;
        this.wW = color;
        this.ww = color2;
        this.wg = color3;
        this.wT = color4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dd.class, "v2;vh;v_;vI;wW;ww;wg;wT", "v2", "vh", "v_", "vI", "wW", "ww", "wg", "wT"}, this);
    }

    public Color wW() {
        return hi.a("\u00e9", (Object)this, (long)1123842960158860037L);
    }

    public float v_() {
        return (float)hi.a("\u00e9", (Object)this, (long)1020569123884372998L);
    }

    public float v2() {
        return (float)hi.a("\u00e9", (Object)this, (long)845407756721340264L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dd.class, "v2;vh;v_;vI;wW;ww;wg;wT", "v2", "vh", "v_", "vI", "wW", "ww", "wg", "wT"}, this, object);
    }

    public float vh() {
        return (float)hi.a("\u00e9", (Object)this, (long)1164041741936967366L);
    }

    public Color wg() {
        return hi.a("\u00e9", (Object)this, (long)831985295839341527L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dd.class, "v2;vh;v_;vI;wW;ww;wg;wT", "v2", "vh", "v_", "vI", "wW", "ww", "wg", "wT"}, this);
    }

    public Color wT() {
        return hi.a("\u00e9", (Object)this, (long)1219183007368966433L);
    }

    public Color ww() {
        return hi.a("\u00e9", (Object)this, (long)1226571412836343425L);
    }
}
