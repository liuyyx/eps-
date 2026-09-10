/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

final class _N
extends Record {
    private final String wN;
    private final List<String> pW;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_N.class, "wN;pW", "wN", "pW"}, this);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private _N(Object object, Object object2) {
        this.wN = (String)object;
        this.pW = (List)object2;
    }

    public List<String> pW() {
        return hi.a("\u00e9", (Object)this, (long)902197775705188860L);
    }

    public String wN() {
        return hi.a("\u00e9", (Object)this, (long)1199513752837709808L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_N.class, "wN;pW", "wN", "pW"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_N.class, "wN;pW", "wN", "pW"}, this, object);
    }

    private static _N W(String string, List<e> list) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", list, (long)415197394286909465L), e::G, (long)935650006110027503L), (long)488388473389276598L);
        return new _N(string, callSite);
    }
}
