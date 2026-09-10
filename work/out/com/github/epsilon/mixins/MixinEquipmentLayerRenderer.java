/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.model.Model
 *  net.minecraft.client.renderer.entity.layers.EquipmentLayerRenderer
 *  net.minecraft.client.renderer.entity.state.EntityRenderState
 *  net.minecraft.client.renderer.rendertype.RenderType
 *  net.minecraft.client.resources.model.EquipmentClientInfo$LayerType
 *  net.minecraft.resources.Identifier
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.equipment.EquipmentAsset
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.C;
import com.github.epsilon.Xr;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.entity.layers.EquipmentLayerRenderer;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.EquipmentAsset;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={EquipmentLayerRenderer.class})
public class MixinEquipmentLayerRenderer {
    @WrapOperation(method={"renderLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lnet/minecraft/world/item/ItemStack;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;II)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/rendertype/RenderTypes;armorCutoutNoCull(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;")})
    private RenderType redirectRenderType(Identifier identifier, Operation<RenderType> operation, EquipmentClientInfo.LayerType layerType, ResourceKey<EquipmentAsset> resourceKey, Model<?> model, Object object, ItemStack itemStack) {
        Player player;
        EntityRenderState entityRenderState;
        Object object2;
        if (object instanceof EntityRenderState && (object2 = ((Xr)(entityRenderState = (EntityRenderState)object)).epsilon$getEntity()) instanceof Player && ((C)(object2 = C.S)).d(new Object[]{player = (Player)object2})) {
            return ((C)object2).c(new Object[]{identifier});
        }
        return (RenderType)operation.call(new Object[]{identifier});
    }
}
