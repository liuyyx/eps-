/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class i7
extends Record {
    private final e k8;
    private final String fe;
    private final String fU;
    private final float KG;
    private final float KX;
    private final float k3;
    private final String fw;

    public float KG() {
        return (float)hi.a("\u00e9", (Object)this, (long)378531331777804019L);
    }

    public String fe() {
        return hi.a("\u00e9", (Object)this, (long)504063034047317422L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i7.class, "k8;fw;fU;fe;k3;KX;KG", "k8", "fw", "fU", "fe", "k3", "KX", "KG"}, this);
    }

    public float KX() {
        return (float)hi.a("\u00e9", (Object)this, (long)1065251625673366538L);
    }

    public e k8() {
        return hi.a("\u00e9", (Object)this, (long)1128561568696473200L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i7.class, "k8;fw;fU;fe;k3;KX;KG", "k8", "fw", "fU", "fe", "k3", "KX", "KG"}, this, object);
    }

    public String fw() {
        return hi.a("\u00e9", (Object)this, (long)980185563751617139L);
    }

    private i7(e e2, String string, String string2, String string3, float f, float f2, float f3) {
        this.k8 = e2;
        this.fw = string;
        this.fU = string2;
        this.fe = string3;
        this.k3 = f;
        this.KX = f2;
        this.KG = f3;
    }

    public String fU() {
        return hi.a("\u00e9", (Object)this, (long)809605576537028531L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{i7.class, "k8;fw;fU;fe;k3;KX;KG", "k8", "fw", "fU", "fe", "k3", "KX", "KG"}, this);
    }

    public float K3() {
        return (float)hi.a("\u00e9", (Object)this, (long)929662683854783562L);
    }
}
