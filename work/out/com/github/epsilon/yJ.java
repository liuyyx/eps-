/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class yJ
extends Record {
    private final int b4;
    private final int bw;
    private final int b8;
    private final int bf;

    public int B8() {
        return (int)hi.a("\u00e9", (Object)this, (long)1049188241509376046L);
    }

    public yJ(int n, int n2, int n3, int n4) {
        this.b4 = n;
        this.bw = n2;
        this.bf = n3;
        this.b8 = n4;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yJ.class, "b4;bw;bf;b8", "b4", "bw", "bf", "b8"}, this, object);
    }

    public int B4() {
        return (int)hi.a("\u00e9", (Object)this, (long)1121386478551460085L);
    }

    public int Bw() {
        return (int)hi.a("\u00e9", (Object)this, (long)994439428786983978L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yJ.class, "b4;bw;bf;b8", "b4", "bw", "bf", "b8"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yJ.class, "b4;bw;bf;b8", "b4", "bw", "bf", "b8"}, this);
    }

    public int Bf() {
        return (int)hi.a("\u00e9", (Object)this, (long)373248834036944582L);
    }
}
