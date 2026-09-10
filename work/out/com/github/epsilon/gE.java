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

final class gE
extends gs {
    private final float W;
    private float x;
    private static final long a;

    private gE(iJ iJ2, Vec3 vec3, float f) {
        Objects.requireNonNull(iJ2);
        super(iJ2, vec3, (int)a, new Identifier[]{hi.a("j", (long)604325751910678859L)});
        this.W = f;
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)1041393923578088373L);
        hi.a("\u00f2", (Object)this, (double)((double)hi.a("\u00a5", (Object)iJ2, (float)-0.04f, (float)0.04f, (long)473750441824029793L)), (long)609409853844784478L);
        hi.a("\u00f2", (Object)this, (double)((double)hi.a("\u00a5", (Object)iJ2, (float)0.02f, (float)0.1f, (long)473750441824029793L)), (long)1078706094324596397L);
        hi.a("\u00f2", (Object)this, (double)((double)hi.a("\u00a5", (Object)iJ2, (float)-0.04f, (float)0.04f, (long)473750441824029793L)), (long)669321080678999846L);
    }

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (float)(hi.a("G", (float)((1.0f - hi.a("\u00e9", (Object)this, (long)526512486171128142L)) * 1.5f), (float)0.2f, (float)1.0f, (long)390336973585993938L) - 0.2f), (long)813589640703568556L);
        gE gE2 = this;
        hi.a("\u00f2", (Object)gE2, (float)(hi.a("\u00e9", (Object)gE2, (long)526512486171128142L) + 1.0f / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)), (long)526512486171128142L);
        hi.a("\u00f2", (Object)this, (float)(hi.a("\u00e9", (Object)this, (long)813589640703568556L) * hi.a("\u00e9", (Object)this, (long)704813785784574634L)), (long)737001268924615182L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = 994940600495600104L;
        a = 0xD3ADAD5C692771FCL ^ l;
    }
}
