/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

final class n3 {
    private Vec3 x;
    private final LivingEntity D;
    private long Z;
    private final long A;
    private final long c;
    private static final long a;

    private n3(LivingEntity livingEntity, long l) {
        hi.a("\u00f2", (Object)this, (long)a, (long)1038519792223648401L);
        this.D = livingEntity;
        this.c = l;
        this.A = l;
    }

    private void y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        hi.a("\u00f2", (Object)this, (long)l, (long)1038519792223648401L);
        hi.a("\u00f2", (Object)this, (Vec3)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)645323418385832173L), (float)f, (long)1301201725970972810L), (long)908941900615586113L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = 5842718192673536226L;
        a = 0xAEEA7EC282FB471DL ^ l;
    }
}
