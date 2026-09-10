/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Font
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.components.ChatComponent
 *  net.minecraft.client.gui.components.ChatComponent$DisplayMode
 *  net.minecraft.client.gui.navigation.ScreenRectangle
 *  net.minecraft.client.multiplayer.chat.GuiMessage
 *  net.minecraft.client.multiplayer.chat.GuiMessage$Line
 *  net.minecraft.client.multiplayer.chat.GuiMessageSource
 *  net.minecraft.client.multiplayer.chat.GuiMessageTag
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.chat.MessageSignature
 *  net.minecraft.util.Mth
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.I;
import com.github.epsilon.dS;
import com.github.epsilon.i8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.multiplayer.chat.GuiMessage;
import net.minecraft.client.multiplayer.chat.GuiMessageSource;
import net.minecraft.client.multiplayer.chat.GuiMessageTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MessageSignature;
import net.minecraft.util.Mth;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ChatComponent.class})
public abstract class MixinChatComponentHash
implements i8 {
    @Shadow
    @Final
    private Minecraft minecraft;
    @Shadow
    @Final
    private List<GuiMessage> allMessages;
    @Shadow
    @Final
    private List<GuiMessage.Line> trimmedMessages;
    @Shadow
    private int chatScrollbarPos;
    @Shadow
    private Predicate<GuiMessage> visibleMessageFilter;
    @Unique
    private Map<Integer, GuiMessage> epsilon$hashedMessages;
    @Unique
    private boolean epsilon$chatScissorPushed;

    @Shadow
    private void logChatMessage(GuiMessage guiMessage) {
    }

    @Shadow
    private void addMessageToDisplayQueue(GuiMessage guiMessage) {
    }

    @Shadow
    private void addMessageToQueue(GuiMessage guiMessage) {
    }

    @Shadow
    private void refreshTrimmedMessages() {
    }

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void initHashedMessages(Minecraft minecraft, CallbackInfo callbackInfo) {
        this.epsilon$hashedMessages = new HashMap<Integer, GuiMessage>();
    }

    @Inject(method={"extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;IIILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;Z)V"}, at={@At(value="HEAD")})
    private void pushBetterChatScissor(GuiGraphicsExtractor guiGraphicsExtractor, Font font, int n, int n2, int n3, ChatComponent.DisplayMode displayMode, boolean bl, CallbackInfo callbackInfo) {
        ScreenRectangle screenRectangle = I.J.q(new Object[0]);
        boolean bl2 = this.epsilon$chatScissorPushed = screenRectangle != null;
        if (this.epsilon$chatScissorPushed) {
            guiGraphicsExtractor.enableScissor(screenRectangle.left(), screenRectangle.top(), screenRectangle.right(), screenRectangle.bottom());
        }
    }

    @Inject(method={"extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;IIILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;Z)V"}, at={@At(value="RETURN")})
    private void popBetterChatScissor(GuiGraphicsExtractor guiGraphicsExtractor, Font font, int n, int n2, int n3, ChatComponent.DisplayMode displayMode, boolean bl, CallbackInfo callbackInfo) {
        if (this.epsilon$chatScissorPushed) {
            guiGraphicsExtractor.disableScissor();
            this.epsilon$chatScissorPushed = false;
        }
    }

    @Override
    public dS epsilon$getVisibility(int n, boolean bl) {
        int n2 = Math.max(0, this.trimmedMessages.size() - this.chatScrollbarPos);
        int n3 = ((ChatComponent)this).getLinesPerPage();
        int n4 = Math.min(n2, n3);
        int n5 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < n4; ++i) {
            float f3;
            GuiMessage.Line line = this.trimmedMessages.get(i + this.chatScrollbarPos);
            float f4 = f3 = bl ? 1.0f : this.epsilon$calculateUnfocusedOpacity(line, n);
            if (!(f3 > 1.0E-5f)) continue;
            ++n5;
            f = Math.max(f, f3);
            f2 += f3;
        }
        return new dS(n5, f, f2);
    }

    @Override
    public void epsilon$addClientSystemMessage(Component component, int n) {
        int n2;
        GuiMessage guiMessage = new GuiMessage(this.minecraft.gui.hud.getGuiTicks(), component, null, GuiMessageSource.SYSTEM_CLIENT, GuiMessageTag.systemSinglePlayer());
        if (!this.visibleMessageFilter.test(guiMessage)) {
            return;
        }
        GuiMessage guiMessage2 = this.epsilon$hashedMessages.put(n, guiMessage);
        if (guiMessage2 != null && (n2 = this.allMessages.indexOf(guiMessage2)) != -1) {
            this.allMessages.remove(n2);
            this.logChatMessage(guiMessage);
            this.addMessageToQueue(guiMessage);
            this.refreshTrimmedMessages();
            this.epsilon$pruneMissingHashedMessages();
            return;
        }
        this.epsilon$addHashedMessage(component, null, GuiMessageSource.SYSTEM_CLIENT, GuiMessageTag.systemSinglePlayer(), n);
        this.epsilon$pruneMissingHashedMessages();
    }

    @Unique
    private float epsilon$calculateUnfocusedOpacity(GuiMessage.Line line, int n) {
        double d = 1.0 - (double)(n - line.addedTime()) / 200.0;
        d = Mth.clamp((double)(d * 10.0), (double)0.0, (double)1.0);
        return (float)(d * d);
    }

    @Unique
    private void epsilon$addHashedMessage(Component component, MessageSignature messageSignature, GuiMessageSource guiMessageSource, GuiMessageTag guiMessageTag, int n) {
        GuiMessage guiMessage = new GuiMessage(this.minecraft.gui.hud.getGuiTicks(), component, messageSignature, guiMessageSource, guiMessageTag);
        if (this.visibleMessageFilter.test(guiMessage)) {
            this.logChatMessage(guiMessage);
            this.addMessageToDisplayQueue(guiMessage);
            this.addMessageToQueue(guiMessage);
            this.epsilon$hashedMessages.put(n, guiMessage);
        }
    }

    @Unique
    private void epsilon$pruneMissingHashedMessages() {
        this.epsilon$hashedMessages.entrySet().removeIf(this::lambda$epsilon$pruneMissingHashedMessages$0);
    }

    private boolean lambda$epsilon$pruneMissingHashedMessages$0(Map.Entry entry) {
        return !this.allMessages.contains(entry.getValue());
    }
}
