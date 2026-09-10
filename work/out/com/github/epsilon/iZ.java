/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import net.minecraft.resources.Identifier;

final class iZ
extends Record {
    private final Identifier cg;
    private final Color co;
    private final String s2;
    private final String sg;
    private final Color c3;
    private final String sw;
    private final String s9;
    private final String sQ;
    private final UUID fz;

    public Color Co() {
        return hi.a("\u00e9", (Object)this, (long)847057654893357196L);
    }

    public UUID Fz() {
        return hi.a("\u00e9", (Object)this, (long)625929692410388194L);
    }

    public String sw() {
        return hi.a("\u00e9", (Object)this, (long)931820026440786228L);
    }

    public Identifier cg() {
        return hi.a("\u00e9", (Object)this, (long)380062498332274302L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iZ.class, "fz;cg;s9;sw;s2;sQ;sg;co;c3", "fz", "cg", "s9", "sw", "s2", "sQ", "sg", "co", "c3"}, this);
    }

    public String sQ() {
        return hi.a("\u00e9", (Object)this, (long)873228924430653041L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iZ.class, "fz;cg;s9;sw;s2;sQ;sg;co;c3", "fz", "cg", "s9", "sw", "s2", "sQ", "sg", "co", "c3"}, this);
    }

    public String s9() {
        return hi.a("\u00e9", (Object)this, (long)688682947857045391L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iZ.class, "fz;cg;s9;sw;s2;sQ;sg;co;c3", "fz", "cg", "s9", "sw", "s2", "sQ", "sg", "co", "c3"}, this, object);
    }

    public Color C3() {
        return hi.a("\u00e9", (Object)this, (long)698148769605193348L);
    }

    private iZ(UUID uUID, Identifier identifier, String string, String string2, String string3, String string4, String string5, Color color, Color color2) {
        this.fz = uUID;
        this.cg = identifier;
        this.s9 = string;
        this.sw = string2;
        this.s2 = string3;
        this.sQ = string4;
        this.sg = string5;
        this.co = color;
        this.c3 = color2;
    }

    public String s2() {
        return hi.a("\u00e9", (Object)this, (long)1186851582515831029L);
    }

    public String sg() {
        return hi.a("\u00e9", (Object)this, (long)896993897997205783L);
    }
}
