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

public final class yF
extends Record {
    private final PoseStack x_;
    private final InteractionHand OM;

    public yF(InteractionHand interactionHand, PoseStack poseStack) {
        this.OM = interactionHand;
        this.x_ = poseStack;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yF.class, "OM;x_", "OM", "x_"}, this);
    }

    public InteractionHand OM() {
        return hi.a("\u00e9", (Object)this, (long)1156643269463139397L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yF.class, "OM;x_", "OM", "x_"}, this, object);
    }

    public PoseStack X_() {
        return hi.a("\u00e9", (Object)this, (long)1062695838355054574L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yF.class, "OM;x_", "OM", "x_"}, this);
    }
}
