/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class _e
extends Record {
    private final String dE;
    private final String d_;
    private final boolean je;
    private final Color eJ;
    private final Color e0;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_e.class, "dE;d_;e0;eJ;je", "dE", "d_", "e0", "eJ", "je"}, this);
    }

    private _e(String string, String string2, Color color, Color color2, boolean bl) {
        this.dE = string;
        this.d_ = string2;
        this.e0 = color;
        this.eJ = color2;
        this.je = bl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_e.class, "dE;d_;e0;eJ;je", "dE", "d_", "e0", "eJ", "je"}, this);
    }

    public Color eJ() {
        return hi.a("\u00e9", (Object)this, (long)727531249633915436L);
    }

    public String dE() {
        return hi.a("\u00e9", (Object)this, (long)557386086873723154L);
    }

    public boolean Je() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1131025174177512448L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_e.class, "dE;d_;e0;eJ;je", "dE", "d_", "e0", "eJ", "je"}, this, object);
    }

    public String d_() {
        return hi.a("\u00e9", (Object)this, (long)1128608174762410241L);
    }

    public Color e0() {
        return hi.a("\u00e9", (Object)this, (long)816105281472761190L);
    }
}
