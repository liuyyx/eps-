/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ud
extends Record
implements _Q {
    private final float wM;
    private final float wy;
    private final ih PM;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ud.class, "PM;wy;wM", "PM", "wy", "wM"}, this);
    }

    public float wM() {
        return (float)hi.a("\u00e9", (Object)this, (long)745974468422165298L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ud.class, "PM;wy;wM", "PM", "wy", "wM"}, this);
    }

    public float wy() {
        return (float)hi.a("\u00e9", (Object)this, (long)941201087155496945L);
    }

    public ud(ih ih2, float f, float f2) {
        this.PM = ih2;
        this.wy = f;
        this.wM = f2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ud.class, "PM;wy;wM", "PM", "wy", "wM"}, this, object);
    }

    public ih PM() {
        return hi.a("\u00e9", (Object)this, (long)428187729299409452L);
    }
}
