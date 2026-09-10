/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.im;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

final class iR
extends Record {
    private final LivingEntity wu;
    private final Vec3 ZT;
    private final Vec3 zt;
    private final im y0;
    private final Vec3 zb;
    private final float YI;
    private final boolean ba;
    private final double tJ;
    private final int OZ;
    private final AABB qJ;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iR.class, "wu;zt;qJ;ZT;zb;YI;ba;tJ;OZ;y0", "wu", "zt", "qJ", "ZT", "zb", "YI", "ba", "tJ", "OZ", "y0"}, this);
    }

    public boolean Ba() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1049771113810660737L);
    }

    public Vec3 Zt() {
        return hi.a("\u00e9", (Object)this, (long)1285822354213892309L);
    }

    public LivingEntity Wu() {
        return hi.a("\u00e9", (Object)this, (long)1105528648261366872L);
    }

    public AABB qJ() {
        return hi.a("\u00e9", (Object)this, (long)455054180165979225L);
    }

    public Vec3 Zb() {
        return hi.a("\u00e9", (Object)this, (long)1114500009361135314L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iR.class, "wu;zt;qJ;ZT;zb;YI;ba;tJ;OZ;y0", "wu", "zt", "qJ", "ZT", "zb", "YI", "ba", "tJ", "OZ", "y0"}, this, object);
    }

    public im y0() {
        return hi.a("\u00e9", (Object)this, (long)558997135559728979L);
    }

    private iR(LivingEntity livingEntity, Vec3 vec3, AABB aABB, Vec3 vec32, Vec3 vec33, float f, boolean bl, double d, int n, im im2) {
        this.wu = livingEntity;
        this.zt = vec3;
        this.qJ = aABB;
        this.ZT = vec32;
        this.zb = vec33;
        this.YI = f;
        this.ba = bl;
        this.tJ = d;
        this.OZ = n;
        this.y0 = im2;
    }

    public double tJ() {
        return (double)hi.a("\u00e9", (Object)this, (long)869829111705290754L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iR.class, "wu;zt;qJ;ZT;zb;YI;ba;tJ;OZ;y0", "wu", "zt", "qJ", "ZT", "zb", "YI", "ba", "tJ", "OZ", "y0"}, this);
    }

    public int OZ() {
        return (int)hi.a("\u00e9", (Object)this, (long)893156833557222070L);
    }

    public float YI() {
        return (float)hi.a("\u00e9", (Object)this, (long)815903629249689260L);
    }

    public Vec3 ZT() {
        return hi.a("\u00e9", (Object)this, (long)588909562691707844L);
    }
}
