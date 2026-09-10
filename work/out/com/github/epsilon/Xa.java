/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.O7;
import com.github.epsilon.hi;
import com.github.epsilon.iR;
import com.github.epsilon.nh;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Xa
extends Record {
    private final long DV;
    private final nh ow;
    private final nh op;
    private final iR xM;
    private final long DE;
    private final O7 br;
    private static final Xa h;
    private final O7 bi;

    public long DE() {
        return (long)hi.a("\u00e9", (Object)this, (long)1132540988148540264L);
    }

    public nh ow() {
        return hi.a("\u00e9", (Object)this, (long)591284618754974037L);
    }

    private Xa(long l, O7 o7, O7 o72, nh nh2, nh nh3, iR iR2, long l2) {
        this.DV = l;
        this.br = o7;
        this.bi = o72;
        this.ow = nh2;
        this.op = nh3;
        this.xM = iR2;
        this.DE = l2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Xa.class, "DV;br;bi;ow;op;xM;DE", "DV", "br", "bi", "ow", "op", "xM", "DE"}, this);
    }

    public long DV() {
        return (long)hi.a("\u00e9", (Object)this, (long)911814772084043771L);
    }

    public iR xM() {
        return hi.a("\u00e9", (Object)this, (long)755995472425982878L);
    }

    public O7 br() {
        return hi.a("\u00e9", (Object)this, (long)1177143409193174934L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = 2413585333901007414L;
        long l2 = 0xDE8138ED31BCE5C9L ^ l;
        h = new Xa(l2, null, null, null, null, null, 0L);
    }

    public O7 bi() {
        return hi.a("\u00e9", (Object)this, (long)960888250686385745L);
    }

    public nh op() {
        return hi.a("\u00e9", (Object)this, (long)1298227941123568694L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Xa.class, "DV;br;bi;ow;op;xM;DE", "DV", "br", "bi", "ow", "op", "xM", "DE"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Xa.class, "DV;br;bi;ow;op;xM;DE", "DV", "br", "bi", "ow", "op", "xM", "DE"}, this, object);
    }
}
