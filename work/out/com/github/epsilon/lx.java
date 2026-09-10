/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.world.InteractionHand
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.vertex.PoseStack;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.InteractionHand;

public final class lx
extends Record {
    private final PoseStack es;
    private final InteractionHand bu;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lx.class, "bu;es", "bu", "es"}, this);
    }

    public lx(InteractionHand interactionHand, PoseStack poseStack) {
        this.bu = interactionHand;
        this.es = poseStack;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lx.class, "bu;es", "bu", "es"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lx.class, "bu;es", "bu", "es"}, this, object);
    }

    public PoseStack es() {
        return hi.a("\u00e9", (Object)this, (long)1296443052013641778L);
    }

    public InteractionHand bu() {
        return hi.a("\u00e9", (Object)this, (long)1253498573858414873L);
    }
}
