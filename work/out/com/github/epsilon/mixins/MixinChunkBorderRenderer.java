/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.debug.ChunkBorderRenderer
 *  net.minecraft.core.SectionPos
 *  net.minecraft.util.Mth
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.i;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.debug.ChunkBorderRenderer;
import net.minecraft.core.SectionPos;
import net.minecraft.util.Mth;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={ChunkBorderRenderer.class})
public class MixinChunkBorderRenderer {
    @Final
    @Shadow
    private Minecraft minecraft;

    @ModifyExpressionValue(method={"emitGizmos"}, at={@At(value="INVOKE", target="Lnet/minecraft/core/SectionPos;of(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/SectionPos;")})
    private SectionPos emitGizmos$getChunkPos(SectionPos sectionPos) {
        i i2 = i.N;
        if (i2.N()) {
            float f = this.minecraft.getDeltaTracker().getGameTimeDeltaPartialTick(true);
            return SectionPos.of((int)SectionPos.posToSectionCoord((double)Mth.floor((double)i2.J(new Object[]{Float.valueOf(f)}))), (int)SectionPos.posToSectionCoord((double)Mth.floor((double)i2.c(new Object[]{Float.valueOf(f)}))), (int)SectionPos.posToSectionCoord((double)Mth.floor((double)i2.D(new Object[]{Float.valueOf(f)}))));
        }
        return sectionPos;
    }
}
