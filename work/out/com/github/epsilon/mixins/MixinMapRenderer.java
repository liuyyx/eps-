/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.renderer.MapRenderer
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.state.MapRenderState
 *  net.minecraft.world.level.saveddata.maps.MapDecoration
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eC;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;
import net.minecraft.client.renderer.MapRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.state.MapRenderState;
import net.minecraft.world.level.saveddata.maps.MapDecoration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MapRenderer.class})
public abstract class MixinMapRenderer {
    @ModifyExpressionValue(method={"render"}, at={@At(value="FIELD", target="Lnet/minecraft/client/renderer/state/MapRenderState;decorations:Ljava/util/List;", opcode=180)})
    private List<MapDecoration> getDecorationsProxy(List<MapDecoration> list) {
        return eC.T.N() && (Boolean)eC.T.B.z() != false ? List.of() : list;
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRender(MapRenderState mapRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, boolean bl, int n, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.V.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }
}
