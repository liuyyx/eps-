/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.screens.inventory.InventoryScreen
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package com.github.epsilon.mixins;

import com.github.epsilon.e0;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={InventoryScreen.class})
public class MixinInventoryScreen {
    @ModifyArgs(method={"extractEntityInInventoryFollowsMouse", "renderEntityInInventoryFollowsAngle"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;entity(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;FLorg/joml/Vector3fc;Lorg/joml/Quaternionfc;Lorg/joml/Quaternionfc;IIII)V"))
    private static void animateInventoryEntity(Args args) {
        float f = e0.B.Q(new Object[0]);
        if (f >= 1.0f) {
            return;
        }
        float f2 = (float)Minecraft.getInstance().getWindow().getGuiScaledWidth() / 2.0f;
        float f3 = (float)Minecraft.getInstance().getWindow().getGuiScaledHeight() / 2.0f;
        args.set(1, (Object)Float.valueOf(((Float)args.get(1)).floatValue() * f));
        args.set(5, (Object)MixinInventoryScreen.epsilon$scaleCoordinate((Integer)args.get(5), f2, f));
        args.set(6, (Object)MixinInventoryScreen.epsilon$scaleCoordinate((Integer)args.get(6), f3, f));
        args.set(7, (Object)MixinInventoryScreen.epsilon$scaleCoordinate((Integer)args.get(7), f2, f));
        args.set(8, (Object)MixinInventoryScreen.epsilon$scaleCoordinate((Integer)args.get(8), f3, f));
    }

    @Unique
    private static int epsilon$scaleCoordinate(int n, float f, float f2) {
        return Math.round(f + ((float)n - f) * f2);
    }
}
