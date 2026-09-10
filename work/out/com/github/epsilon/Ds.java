/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Ds
extends Record {
    private final String rw;
    private final boolean io;
    private final Color zr;
    private final String r0;
    private final Color zx;

    public String Rw() {
        return hi.a("\u00e9", (Object)this, (long)525962625504732838L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Ds.class, "rw;r0;io;zx;zr", "rw", "r0", "io", "zx", "zr"}, this);
    }

    public String R0() {
        return hi.a("\u00e9", (Object)this, (long)1247713398709926708L);
    }

    public boolean Io() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1290661077080561201L);
    }

    public Color zx() {
        return hi.a("\u00e9", (Object)this, (long)394860736932669658L);
    }

    private Ds(String string, String string2, boolean bl, Color color, Color color2) {
        this.rw = string;
        this.r0 = string2;
        this.io = bl;
        this.zx = color;
        this.zr = color2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Ds.class, "rw;r0;io;zx;zr", "rw", "r0", "io", "zx", "zr"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Ds.class, "rw;r0;io;zx;zr", "rw", "r0", "io", "zx", "zr"}, this, object);
    }

    public Color zr() {
        return hi.a("\u00e9", (Object)this, (long)1253012567363076961L);
    }
}
