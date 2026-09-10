/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.client.ClientClockManager
 *  net.minecraft.core.Holder
 *  net.minecraft.world.clock.WorldClock
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eu;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.ClientClockManager;
import net.minecraft.core.Holder;
import net.minecraft.world.clock.WorldClock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={ClientClockManager.class})
public class MixinClientClockManager {
    @ModifyReturnValue(method={"getTotalTicks"}, at={@At(value="RETURN")})
    private long modifyTotalTicks(long l, Holder<WorldClock> holder) {
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = holder;
        return eu.n.g(objectArray);
    }
}
