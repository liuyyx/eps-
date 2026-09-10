/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.ItemStack
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.item.ItemStack;

final class _1
extends Record {
    private final float gf;
    private final ItemStack fE;
    private final float gy;
    private final float GY;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_1.class, "fE;gy;gf;GY", "fE", "gy", "gf", "GY"}, this);
    }

    private _1(ItemStack itemStack, float f, float f2, float f3) {
        this.fE = itemStack;
        this.gy = f;
        this.gf = f2;
        this.GY = f3;
    }

    public float GY() {
        return (float)hi.a("\u00e9", (Object)this, (long)881204369780505783L);
    }

    public float Gy() {
        return (float)hi.a("\u00e9", (Object)this, (long)534519900481024236L);
    }

    public float Gf() {
        return (float)hi.a("\u00e9", (Object)this, (long)580756771191507788L);
    }

    public ItemStack fE() {
        return hi.a("\u00e9", (Object)this, (long)674451666646892962L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_1.class, "fE;gy;gf;GY", "fE", "gy", "gf", "GY"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_1.class, "fE;gy;gf;GY", "fE", "gy", "gf", "GY"}, this);
    }
}
