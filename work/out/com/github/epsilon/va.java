/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.nN;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

final class va
extends Record {
    private final String LO;
    private final List<Dl<?>> nb;
    private final nN qO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private va(Object object, Object object2, Object object3) {
        this.LO = (String)object;
        this.qO = (nN)object2;
        this.nb = (List)object3;
    }

    public String LO() {
        return hi.a("\u00e9", (Object)this, (long)1064976864721759149L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{va.class, "LO;qO;nb", "LO", "qO", "nb"}, this, object);
    }

    public List<Dl<?>> nb() {
        return hi.a("\u00e9", (Object)this, (long)1248067015034413285L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{va.class, "LO;qO;nb", "LO", "qO", "nb"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{va.class, "LO;qO;nb", "LO", "qO", "nb"}, this);
    }

    private static va C(String string, nN nN2) {
        return new va(string, nN2, new ArrayList());
    }

    public nN qO() {
        return hi.a("\u00e9", (Object)this, (long)413048200134863111L);
    }

    private static va n(String string) {
        return new va(string, null, new ArrayList());
    }
}
