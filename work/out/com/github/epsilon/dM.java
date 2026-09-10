/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dM
extends Record {
    private final float sD;
    private final String fF;
    private final float sl;
    private final Color v8;
    private final ih na;
    private final Color vw;

    public dM(ih ih2, float f, Color color, String string, float f2, Color color2) {
        this.na = ih2;
        this.sD = f;
        this.v8 = color;
        this.fF = string;
        this.sl = f2;
        this.vw = color2;
    }

    public float sD() {
        return (float)hi.a("\u00e9", (Object)this, (long)824229698319365493L);
    }

    public String fF() {
        return hi.a("\u00e9", (Object)this, (long)901202727182169719L);
    }

    public float sl() {
        return (float)hi.a("\u00e9", (Object)this, (long)940760294040855096L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dM.class, "na;sD;v8;fF;sl;vw", "na", "sD", "v8", "fF", "sl", "vw"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dM.class, "na;sD;v8;fF;sl;vw", "na", "sD", "v8", "fF", "sl", "vw"}, this, object);
    }

    public Color V8() {
        return hi.a("\u00e9", (Object)this, (long)416337083757333330L);
    }

    public ih na() {
        return hi.a("\u00e9", (Object)this, (long)689222356571812646L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dM.class, "na;sD;v8;fF;sl;vw", "na", "sD", "v8", "fF", "sl", "vw"}, this);
    }

    public Color Vw() {
        return hi.a("\u00e9", (Object)this, (long)1063412974282519174L);
    }
}
