/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.phys.AABB
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.phys.AABB;

final class zX
extends Record {
    private final long PE;
    private final AABB ku;
    private final Color UW;
    private final Color UF;

    public long PE() {
        return (long)hi.a("\u00e9", (Object)this, (long)1069705214091703515L);
    }

    public AABB ku() {
        return hi.a("\u00e9", (Object)this, (long)892283441836094990L);
    }

    public Color UW() {
        return hi.a("\u00e9", (Object)this, (long)1169192108952814421L);
    }

    public Color UF() {
        return hi.a("\u00e9", (Object)this, (long)972500632594161095L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zX.class, "ku;UW;UF;PE", "ku", "UW", "UF", "PE"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zX.class, "ku;UW;UF;PE", "ku", "UW", "UF", "PE"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zX.class, "ku;UW;UF;PE", "ku", "UW", "UF", "PE"}, this);
    }

    private zX(AABB aABB, Color color, Color color2, long l) {
        this.ku = aABB;
        this.UW = color;
        this.UF = color2;
        this.PE = l;
    }
}
