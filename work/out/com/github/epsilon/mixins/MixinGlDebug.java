/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.llamalad7.mixinextras.sugar.Local
 *  com.mojang.blaze3d.opengl.GlDebug
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.opengl.GlDebug;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={GlDebug.class})
public class MixinGlDebug {
    @WrapOperation(method={"printDebugLog"}, at={@At(value="INVOKE", target="Lorg/slf4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;)V")})
    private static void avoidSpam(Logger logger, String string, Object object, Operation<Void> operation, @Local(argsOnly=true, index=3) int n) {
        if (n != 37190) {
            return;
        }
        logger.error(string, object, (Object)new RuntimeException());
    }
}
