/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.chunk.VisGraph
 *  net.minecraft.core.BlockPos
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dH;
import com.github.epsilon.vy;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.core.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={VisGraph.class})
public class MixinVisGraph {
    @Inject(method={"setOpaque"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMarkClosed(BlockPos blockPos, CallbackInfo callbackInfo) {
        dH dH2 = (dH)vy.j.d(new Object[]{new dH()});
        if (dH2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }
}
