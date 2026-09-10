/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.renderer.SubmitNodeStorage
 *  net.minecraft.client.renderer.feature.FeatureRenderDispatcher
 *  net.minecraft.client.renderer.feature.FeatureRenderDispatcher$PreparedFrame
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.fabric.mixins.iris;

import com.github.epsilon.u;
import com.github.epsilon.z2;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.feature.FeatureRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;

@Pseudo
@Mixin(targets={"net.irisshaders.iris.pathways.HandRenderer"}, remap=false)
public abstract class MixinIrisHandRenderer {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WrapOperation(method={"renderSolid", "renderTranslucent"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/feature/FeatureRenderDispatcher;renderAllFeatures(Lnet/minecraft/client/renderer/SubmitNodeStorage;)V")}, remap=true)
    private void epsilon$renderFeaturesWithOutline(FeatureRenderDispatcher featureRenderDispatcher, SubmitNodeStorage submitNodeStorage, Operation<Void> operation) {
        block10: {
            if (u.H.N() && ((Boolean)u.H.W.z()).booleanValue()) {
                try (FeatureRenderDispatcher.PreparedFrame preparedFrame = featureRenderDispatcher.prepareFrame(submitNodeStorage);){
                    preparedFrame.executeSolid();
                    preparedFrame.executeTranslucent();
                    preparedFrame.executeOutline();
                    preparedFrame.executeTranslucentAfterTerrain();
                    preparedFrame.executeAlwaysOnTop();
                    break block10;
                }
                finally {
                    z2.a.h(new Object[0]);
                }
            }
            operation.call(new Object[]{featureRenderDispatcher, submitNodeStorage});
        }
    }
}
