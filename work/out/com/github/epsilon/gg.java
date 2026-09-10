/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class gg
extends Record {
    @SerializedName(value="clientToken")
    private final String wU;
    @SerializedName(value="requestUser")
    private final boolean cW;
    @SerializedName(value="password")
    private final String wf;
    @SerializedName(value="username")
    private final String wI;
    @SerializedName(value="agent")
    private final String wo;

    @SerializedName(value="clientToken")
    public String wU() {
        return hi.a("\u00e9", (Object)this, (long)1234880313884075105L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gg.class, "wo;wI;wf;wU;cW", "wo", "wI", "wf", "wU", "cW"}, this);
    }

    @SerializedName(value="requestUser")
    public boolean cW() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)567460641723866703L);
    }

    @SerializedName(value="agent")
    public String wo() {
        return hi.a("\u00e9", (Object)this, (long)1128127784009226223L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gg.class, "wo;wI;wf;wU;cW", "wo", "wI", "wf", "wU", "cW"}, this, object);
    }

    private gg(String string, String string2, String string3, String string4, boolean bl) {
        this.wo = string;
        this.wI = string2;
        this.wf = string3;
        this.wU = string4;
        this.cW = bl;
    }

    @SerializedName(value="username")
    public String wI() {
        return hi.a("\u00e9", (Object)this, (long)893370457382979362L);
    }

    @SerializedName(value="password")
    public String wf() {
        return hi.a("\u00e9", (Object)this, (long)889181483669493900L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gg.class, "wo;wI;wf;wU;cW", "wo", "wI", "wf", "wU", "cW"}, this);
    }
}
