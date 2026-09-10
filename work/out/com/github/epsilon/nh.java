/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.boss.enderdragon.EndCrystal
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.phys.Vec3;

final class nh
extends Record {
    private final int qh;
    private final EndCrystal iA;
    private final float p8;
    private final Vec3 lc;
    private final float pA;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nh.class, "iA;qh;lc;pA;p8", "iA", "qh", "lc", "pA", "p8"}, this);
    }

    public Vec3 Lc() {
        return hi.a("\u00e9", (Object)this, (long)1206461678158481942L);
    }

    public int Qh() {
        return (int)hi.a("\u00e9", (Object)this, (long)1079950686230485411L);
    }

    public EndCrystal iA() {
        return hi.a("\u00e9", (Object)this, (long)1190044496474641313L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nh.class, "iA;qh;lc;pA;p8", "iA", "qh", "lc", "pA", "p8"}, this, object);
    }

    private nh(EndCrystal endCrystal, int n, Vec3 vec3, float f, float f2) {
        this.iA = endCrystal;
        this.qh = n;
        this.lc = vec3;
        this.pA = f;
        this.p8 = f2;
    }

    public float pA() {
        return (float)hi.a("\u00e9", (Object)this, (long)759072511438649223L);
    }

    public float p8() {
        return (float)hi.a("\u00e9", (Object)this, (long)1068355181015158122L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nh.class, "iA;qh;lc;pA;p8", "iA", "qh", "lc", "pA", "p8"}, this);
    }
}
