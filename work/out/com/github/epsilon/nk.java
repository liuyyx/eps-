/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class nk
extends Record {
    private final float ZJ;
    private final float ZQ;
    private final float ZV;
    private final float z4;

    public float ZQ() {
        return (float)hi.a("\u00e9", (Object)this, (long)372425031779196964L);
    }

    public float Z4() {
        return (float)hi.a("\u00e9", (Object)this, (long)680020720682644293L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nk.class, "ZV;ZJ;z4;ZQ", "ZV", "ZJ", "z4", "ZQ"}, this);
    }

    public float ZV() {
        return (float)hi.a("\u00e9", (Object)this, (long)1081908199653078975L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nk.class, "ZV;ZJ;z4;ZQ", "ZV", "ZJ", "z4", "ZQ"}, this, object);
    }

    private nk(float f, float f2, float f3, float f4) {
        this.ZV = f;
        this.ZJ = f2;
        this.z4 = f3;
        this.ZQ = f4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nk.class, "ZV;ZJ;z4;ZQ", "ZV", "ZJ", "z4", "ZQ"}, this);
    }

    public float ZJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)553006072566144200L);
    }
}
