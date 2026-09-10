/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class n_
extends Record {
    private final String LV;
    private final e v3;
    private final float gN;
    private final String ll;
    private final float gm;
    private final float gL;

    private n_(e e2, String string, String string2, float f, float f2, float f3) {
        this.v3 = e2;
        this.ll = string;
        this.LV = string2;
        this.gm = f;
        this.gN = f2;
        this.gL = f3;
    }

    public float gL() {
        return (float)hi.a("\u00e9", (Object)this, (long)1277264755450488000L);
    }

    public e V3() {
        return hi.a("\u00e9", (Object)this, (long)399120786539150329L);
    }

    public String Ll() {
        return hi.a("\u00e9", (Object)this, (long)414894262663300713L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{n_.class, "v3;ll;LV;gm;gN;gL", "v3", "ll", "LV", "gm", "gN", "gL"}, this);
    }

    public float gm() {
        return (float)hi.a("\u00e9", (Object)this, (long)1227090444208356693L);
    }

    public String LV() {
        return hi.a("\u00e9", (Object)this, (long)839643879083142689L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{n_.class, "v3;ll;LV;gm;gN;gL", "v3", "ll", "LV", "gm", "gN", "gL"}, this);
    }

    public float gN() {
        return (float)hi.a("\u00e9", (Object)this, (long)370985768439678891L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{n_.class, "v3;ll;LV;gm;gN;gL", "v3", "ll", "LV", "gm", "gN", "gL"}, this, object);
    }
}
