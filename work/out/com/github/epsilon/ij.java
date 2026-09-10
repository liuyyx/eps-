/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;

public final class ij
extends Record {
    private final int cp;
    private final ByteBuffer hy;
    private final int CN;
    private final ByteBuffer hR;
    private final int CT;
    private final int c5;
    private final int CQ;

    public int CQ() {
        return (int)hi.a("\u00e9", (Object)this, (long)866528498622063103L);
    }

    public int C5() {
        return (int)hi.a("\u00e9", (Object)this, (long)1210860900925453239L);
    }

    public ij(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int n, int n2, int n3, int n4, int n5) {
        this.hy = byteBuffer;
        this.hR = byteBuffer2;
        this.cp = n;
        this.c5 = n2;
        this.CT = n3;
        this.CN = n4;
        this.CQ = n5;
    }

    public int CN() {
        return (int)hi.a("\u00e9", (Object)this, (long)1045572734413772229L);
    }

    public ByteBuffer hR() {
        return hi.a("\u00e9", (Object)this, (long)1242380147600763912L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ij.class, "hy;hR;cp;c5;CT;CN;CQ", "hy", "hR", "cp", "c5", "CT", "CN", "CQ"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ij.class, "hy;hR;cp;c5;CT;CN;CQ", "hy", "hR", "cp", "c5", "CT", "CN", "CQ"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ij.class, "hy;hR;cp;c5;CT;CN;CQ", "hy", "hR", "cp", "c5", "CT", "CN", "CQ"}, this);
    }

    public ByteBuffer hy() {
        return hi.a("\u00e9", (Object)this, (long)374796225346231694L);
    }

    public int Cp() {
        return (int)hi.a("\u00e9", (Object)this, (long)673953986456708118L);
    }

    public int CT() {
        return (int)hi.a("\u00e9", (Object)this, (long)663936637043743514L);
    }
}
