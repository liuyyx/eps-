/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

final class DH
extends Record {
    private final boolean ka;
    private final List<_Q> XM;

    public boolean ka() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)739576344131372114L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{DH.class, "XM;ka", "XM", "ka"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{DH.class, "XM;ka", "XM", "ka"}, this);
    }

    private DH(List<_Q> list, boolean bl) {
        this.XM = list;
        this.ka = bl;
    }

    public List<_Q> XM() {
        return hi.a("\u00e9", (Object)this, (long)1198766717099469999L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{DH.class, "XM;ka", "XM", "ka"}, this, object);
    }
}
