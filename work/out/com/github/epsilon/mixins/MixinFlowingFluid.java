/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.core.Direction
 *  net.minecraft.world.level.material.FlowingFluid
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.Du;
import com.github.epsilon.w;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.Iterator;
import net.minecraft.core.Direction;
import net.minecraft.world.level.material.FlowingFluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={FlowingFluid.class})
public class MixinFlowingFluid {
    @WrapOperation(method={"getFlow"}, at={@At(value="INVOKE", target="Ljava/util/Iterator;hasNext()Z", ordinal=0)})
    private boolean hookGetFlow(Iterator<Direction> iterator, Operation<Boolean> operation) {
        if (w.a.N() && w.a.d.i(Du.Cancel) && ((Boolean)w.a.E.z()).booleanValue()) {
            return false;
        }
        return (Boolean)operation.call(new Object[]{iterator});
    }
}
