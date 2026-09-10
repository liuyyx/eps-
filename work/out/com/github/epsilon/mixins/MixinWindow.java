/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.IconSet
 *  com.mojang.blaze3d.platform.Window
 *  net.minecraft.server.packs.PackResources
 *  net.minecraft.server.packs.resources.IoSupplier
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.github.epsilon.mixins;

import com.github.epsilon.Xh;
import com.github.epsilon._p;
import com.github.epsilon.uc;
import com.mojang.blaze3d.platform.IconSet;
import com.mojang.blaze3d.platform.Window;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.resources.IoSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={Window.class})
public class MixinWindow {
    @Redirect(method={"setIcon"}, at=@At(value="INVOKE", target="Lcom/mojang/blaze3d/platform/IconSet;getStandardIcons(Lnet/minecraft/server/packs/PackResources;)Ljava/util/List;"))
    private List<IoSupplier<InputStream>> onSetIcon(IconSet iconSet, PackResources packResources) throws IOException {
        InputStream inputStream = Xh.class.getResourceAsStream("/assets/epsilon/textures/icons/icon_16x16.png");
        InputStream inputStream2 = Xh.class.getResourceAsStream("/assets/epsilon/textures/icons/icon_32x32.png");
        InputStream inputStream3 = Xh.class.getResourceAsStream("/assets/epsilon/textures/icons/table_16x16.png");
        InputStream inputStream4 = Xh.class.getResourceAsStream("/assets/epsilon/textures/icons/table_32x32.png");
        if (uc.v.u0.i(_p.Epsilon)) {
            if (inputStream != null && inputStream2 != null) {
                return List.of(() -> MixinWindow.lambda$onSetIcon$0(inputStream), () -> MixinWindow.lambda$onSetIcon$1(inputStream2));
            }
        } else if (uc.v.u0.i(_p.Minecraft_1_8_9) && inputStream3 != null && inputStream4 != null) {
            return List.of(() -> MixinWindow.lambda$onSetIcon$2(inputStream3), () -> MixinWindow.lambda$onSetIcon$3(inputStream4));
        }
        return iconSet.getStandardIcons(packResources);
    }

    private static InputStream lambda$onSetIcon$3(InputStream inputStream) throws IOException {
        return inputStream;
    }

    private static InputStream lambda$onSetIcon$2(InputStream inputStream) throws IOException {
        return inputStream;
    }

    private static InputStream lambda$onSetIcon$1(InputStream inputStream) throws IOException {
        return inputStream;
    }

    private static InputStream lambda$onSetIcon$0(InputStream inputStream) throws IOException {
        return inputStream;
    }
}
