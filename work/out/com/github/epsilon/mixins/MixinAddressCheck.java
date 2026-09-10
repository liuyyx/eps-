/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  net.minecraft.client.multiplayer.resolver.AddressCheck
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package com.github.epsilon.mixins;

import com.google.common.collect.ImmutableList;
import java.util.function.Predicate;
import net.minecraft.client.multiplayer.resolver.AddressCheck;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value={AddressCheck.class})
public interface MixinAddressCheck {
    @ModifyVariable(method={"createFromService"}, at=@At(value="STORE"), name={"blockLists"})
    private static ImmutableList<Predicate<String>> clearBlockLists(ImmutableList<Predicate<String>> immutableList) {
        return ImmutableList.of();
    }
}
