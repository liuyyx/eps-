/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.nK;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class Xz
extends Record
implements _Q {
    private final Color f5;
    private final float aG;
    private final float ak;
    private final nK ud;
    private final float aU;
    private final Color FW;
    private final String fb;

    public String fb() {
        return hi.a("\u00e9", (Object)this, (long)684743883469431597L);
    }

    public Xz(String string, float f, float f2, float f3, Color color, Color color2, nK nK2) {
        this.fb = string;
        this.aG = f;
        this.ak = f2;
        this.aU = f3;
        this.f5 = color;
        this.FW = color2;
        this.ud = nK2;
    }

    public float aU() {
        return (float)hi.a("\u00e9", (Object)this, (long)865032393073793802L);
    }

    public float ak() {
        return (float)hi.a("\u00e9", (Object)this, (long)896490313174063250L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Xz.class, "fb;aG;ak;aU;f5;FW;ud", "fb", "aG", "ak", "aU", "f5", "FW", "ud"}, this);
    }

    public float aG() {
        return (float)hi.a("\u00e9", (Object)this, (long)492099132194602306L);
    }

    public nK Ud() {
        return hi.a("\u00e9", (Object)this, (long)1222182633711575751L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Xz.class, "fb;aG;ak;aU;f5;FW;ud", "fb", "aG", "ak", "aU", "f5", "FW", "ud"}, this);
    }

    public Color FW() {
        return hi.a("\u00e9", (Object)this, (long)997331549581314907L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Xz.class, "fb;aG;ak;aU;f5;FW;ud", "fb", "aG", "ak", "aU", "f5", "FW", "ud"}, this, object);
    }

    public Color F5() {
        return hi.a("\u00e9", (Object)this, (long)590394287432593501L);
    }
}
