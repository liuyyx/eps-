/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.v0;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.minecraft.resources.Identifier;

final class ug
extends Record {
    private final String eM;
    private final Identifier yD;
    private final float e5;
    private final List<v0> qW;
    private final int QD;

    private ug(Identifier identifier, List<v0> list, int n, String string, float f) {
        this.yD = identifier;
        this.qW = list;
        this.QD = n;
        this.eM = string;
        this.e5 = f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ug.class, "yD;qW;QD;eM;e5", "yD", "qW", "QD", "eM", "e5"}, this);
    }

    public int QD() {
        return (int)hi.a("\u00e9", (Object)this, (long)686431314261058287L);
    }

    public List<v0> qW() {
        return hi.a("\u00e9", (Object)this, (long)718044172041706989L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ug.class, "yD;qW;QD;eM;e5", "yD", "qW", "QD", "eM", "e5"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ug.class, "yD;qW;QD;eM;e5", "yD", "qW", "QD", "eM", "e5"}, this);
    }

    public float E5() {
        return (float)hi.a("\u00e9", (Object)this, (long)1047918123620549876L);
    }

    public String eM() {
        return hi.a("\u00e9", (Object)this, (long)591346706238945712L);
    }

    public Identifier yD() {
        return hi.a("\u00e9", (Object)this, (long)916082266535087542L);
    }
}
