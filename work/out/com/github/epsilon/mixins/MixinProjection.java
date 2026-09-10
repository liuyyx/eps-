/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.ProjectionType
 *  net.minecraft.client.renderer.Projection
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.el;
import com.mojang.blaze3d.ProjectionType;
import net.minecraft.client.renderer.Projection;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Projection.class})
public class MixinProjection {
    @Shadow
    private ProjectionType projectionType;
    @Shadow
    private float width;
    @Shadow
    private float height;

    @Inject(method={"getMatrix"}, at={@At(value="RETURN")})
    private void sakura$aspectRatio$getMatrix(Matrix4f matrix4f, CallbackInfoReturnable<Matrix4f> callbackInfoReturnable) {
        if (!el.h.N() || this.projectionType != ProjectionType.PERSPECTIVE) {
            return;
        }
        float f = this.width / this.height;
        float f2 = f / ((Double)el.h.C.z()).floatValue();
        Matrix4f matrix4f2 = (Matrix4f)callbackInfoReturnable.getReturnValue();
        matrix4f2.m00(matrix4f2.m00() * f2);
    }
}
