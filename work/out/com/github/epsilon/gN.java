/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.EntityType
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.n0;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.entity.EntityType;

final class gN
extends Record {
    private final double UV;
    private final EntityType<?> si;
    private final double ub;
    private final double u3;
    private final n0 ny;
    private final double um;
    private final double uf;

    private gN(double d, double d2, double d3, double d4, double d5, EntityType<?> entityType, n0 n02) {
        this.UV = d;
        this.uf = d2;
        this.u3 = d3;
        this.ub = d4;
        this.um = d5;
        this.si = entityType;
        this.ny = n02;
    }

    public double UV() {
        return (double)hi.a("\u00e9", (Object)this, (long)435255120361897808L);
    }

    public n0 Ny() {
        return hi.a("\u00e9", (Object)this, (long)1334187910075471696L);
    }

    public double Ub() {
        return (double)hi.a("\u00e9", (Object)this, (long)1123656775062266744L);
    }

    public double U3() {
        return (double)hi.a("\u00e9", (Object)this, (long)415124209890758179L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gN.class, "UV;uf;u3;ub;um;si;ny", "UV", "uf", "u3", "ub", "um", "si", "ny"}, this);
    }

    private gN F(double d) {
        return new gN(d, (double)hi.a("\u00e9", (Object)this, (long)712697503429715877L), (double)hi.a("\u00e9", (Object)this, (long)415124209890758179L), (double)hi.a("\u00e9", (Object)this, (long)1123656775062266744L), (double)hi.a("\u00e9", (Object)this, (long)1214086191069000738L), (EntityType<?>)hi.a("\u00e9", (Object)this, (long)868144304668761040L), (n0)((Object)hi.a("\u00e9", (Object)this, (long)1334187910075471696L)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gN.class, "UV;uf;u3;ub;um;si;ny", "UV", "uf", "u3", "ub", "um", "si", "ny"}, this);
    }

    public double Um() {
        return (double)hi.a("\u00e9", (Object)this, (long)1214086191069000738L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gN.class, "UV;uf;u3;ub;um;si;ny", "UV", "uf", "u3", "ub", "um", "si", "ny"}, this, object);
    }

    public double Uf() {
        return (double)hi.a("\u00e9", (Object)this, (long)712697503429715877L);
    }

    public EntityType<?> si() {
        return hi.a("\u00e9", (Object)this, (long)868144304668761040L);
    }
}
