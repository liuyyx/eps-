/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;

final class Dy
extends Record {
    private final int bj;
    private final int BA;
    private final ByteBuffer hu;
    private final long uX;

    public ByteBuffer hu() {
        return hi.a("\u00e9", (Object)this, (long)1252211794873079874L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dy.class, "hu;BA;bj;uX", "hu", "BA", "bj", "uX"}, this, object);
    }

    public int Bj() {
        return (int)hi.a("\u00e9", (Object)this, (long)408661366467353464L);
    }

    public long uX() {
        return (long)hi.a("\u00e9", (Object)this, (long)1310172834510288332L);
    }

    private Dy(ByteBuffer byteBuffer, int n, int n2, long l) {
        this.hu = byteBuffer;
        this.BA = n;
        this.bj = n2;
        this.uX = l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dy.class, "hu;BA;bj;uX", "hu", "BA", "bj", "uX"}, this);
    }

    public int BA() {
        return (int)hi.a("\u00e9", (Object)this, (long)533720955775428531L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dy.class, "hu;BA;bj;uX", "hu", "BA", "bj", "uX"}, this);
    }
}
