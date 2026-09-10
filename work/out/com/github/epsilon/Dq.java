/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class Dq
extends Record {
    private final boolean QB;
    private final boolean qa;
    private final boolean QW;
    private final boolean QQ;

    private Dq(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.qa = bl;
        this.QB = bl2;
        this.QW = bl3;
        this.QQ = bl4;
    }

    public boolean QQ() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1085934463423527100L);
    }

    public boolean Qa() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1308257033551678712L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dq.class, "qa;QB;QW;QQ", "qa", "QB", "QW", "QQ"}, this);
    }

    public boolean QW() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)835824453314138543L);
    }

    public boolean QB() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)618897848616580128L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dq.class, "qa;QB;QW;QQ", "qa", "QB", "QW", "QQ"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dq.class, "qa;QB;QW;QQ", "qa", "QB", "QW", "QQ"}, this, object);
    }
}
