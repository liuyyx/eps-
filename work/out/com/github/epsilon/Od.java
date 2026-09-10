/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XL;
import com.github.epsilon.Xu;
import com.github.epsilon.hi;
import com.github.epsilon.y3;
import com.github.epsilon.yM;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class Od
extends Record
implements yM {
    private final int layer;
    private final long sequence;
    private final Xu scissor;
    private final Color VF;
    private final Color VP;
    private final XL bounds;
    private final Color vb;
    private final Color VN;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Od.class, "layer;sequence;bounds;scissor;vb;VP;VN;VF", "layer", "sequence", "bounds", "scissor", "vb", "VP", "VN", "VF"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Od.class, "layer;sequence;bounds;scissor;vb;VP;VN;VF", "layer", "sequence", "bounds", "scissor", "vb", "VP", "VN", "VF"}, this);
    }

    public Color Vb() {
        return hi.a("\u00e9", (Object)this, (long)711283904013433733L);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)821051268431359116L);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)782532932628703987L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)772074783267406029L);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)866644956285896161L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Od.class, "layer;sequence;bounds;scissor;vb;VP;VN;VF", "layer", "sequence", "bounds", "scissor", "vb", "VP", "VN", "VF"}, this);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)357705256635589984L);
    }

    public Color VN() {
        return hi.a("\u00e9", (Object)this, (long)571354325666319183L);
    }

    public Od(int n, long l, XL xL, Xu xu, Color color, Color color2, Color color3, Color color4) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.vb = color;
        this.VP = color2;
        this.VN = color3;
        this.VF = color4;
    }

    public Color VP() {
        return hi.a("\u00e9", (Object)this, (long)584417571950759093L);
    }

    public Color VF() {
        return hi.a("\u00e9", (Object)this, (long)1324480314889557326L);
    }
}
