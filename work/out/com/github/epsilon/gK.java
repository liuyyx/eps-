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

final class gK
extends gs {
    private static final long a;

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (float)((1.0f - (float)hi.a("\u00e9", (Object)this, (long)932224973340092472L) / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)) * 0.35f), (long)737001268924615182L);
    }

    private gK(iJ iJ2, Vec3 vec3, Vec3 vec32, Identifier identifier) {
        Objects.requireNonNull(iJ2);
        super(iJ2, vec3, (int)a, identifier);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)592263982715586114L);
        hi.a("\u00f2", (Object)this, (boolean)true, (long)839845615772263865L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)1041393923578088373L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)vec32, (long)1300412705618690751L), (long)609409853844784478L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)vec32, (long)1294071886475894755L), (long)1078706094324596397L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)vec32, (long)1282612456329596420L), (long)669321080678999846L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = 9168220456987976482L;
        a = 0xE9C55F9A293CE336L ^ l;
    }
}
