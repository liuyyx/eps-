/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.model.Model
 *  net.minecraft.client.renderer.SubmitNodeCollector$CustomGeometryRenderer
 *  net.minecraft.client.renderer.SubmitNodeStorage
 *  net.minecraft.client.renderer.feature.ModelFeatureRenderer$CrumblingOverlay
 *  net.minecraft.client.renderer.rendertype.RenderType
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

final class yV
extends SubmitNodeStorage {
    public <S> void submitModel(Model<? super S> model, S s, PoseStack poseStack, RenderType renderType, int n, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4, ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        hi.a("\u00a5", model, s, (long)1171328076513103671L);
        hi.a("\u00a5", model, (Object)poseStack, (Object)hi.a("j", (long)518393038192175515L), (int)n, (int)n2, (int)n3, (long)776731109093906627L);
    }

    private yV() {
    }

    public void submitCustomGeometry(PoseStack poseStack, RenderType renderType, SubmitNodeCollector.CustomGeometryRenderer customGeometryRenderer) {
        hi.a("\u00a5", (Object)customGeometryRenderer, (Object)hi.a("\u00a5", (Object)poseStack, (long)970332505425455960L), (Object)hi.a("j", (long)518393038192175515L), (long)1292890517521116837L);
    }
}
