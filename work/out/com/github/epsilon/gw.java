/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.gs;
import com.github.epsilon.hi;
import com.github.epsilon.iJ;
import java.util.Objects;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;

final class gw
extends gs {
    private float B;
    private static final long a;

    private gw(iJ iJ2, Vec3 vec3) {
        Objects.requireNonNull(iJ2);
        super(iJ2, vec3, (int)a, new Identifier[]{hi.a("j", (long)574422492623707714L)});
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)672760379245108670L);
        hi.a("\u00f2", (Object)this, (float)0.3f, (long)737001268924615182L);
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)1041393923578088373L);
    }

    @Override
    protected void M(Object[] objectArray) {
        gw gw2 = this;
        hi.a("\u00f2", (Object)gw2, (float)(hi.a("\u00e9", (Object)gw2, (long)737001268924615182L) + hi.a("\u00e9", (Object)this, (long)672760379245108670L) * 0.2f), (long)737001268924615182L);
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)672760379245108670L) - 1.0f / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)672760379245108670L);
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)813589640703568556L) - 1.0f / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)813589640703568556L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = 964268577891279837L;
        a = 0xAA4D057FA547E3C3L ^ l;
    }
}
