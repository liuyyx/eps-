/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.via.O
 *  me.sofurry.via.OO
 *  org.objectweb.asm.tree.ClassNode
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package com.github.epsilon.fabric.mixins;

import com.github.epsilon.XT;
import java.util.List;
import java.util.Set;
import me.sofurry.via.O;
import me.sofurry.via.OO;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class FabricMixinPlugin
implements IMixinConfigPlugin {
    public void onLoad(String string) {
        XT.u();
        O.g();
        OO.R();
    }

    public String getRefMapperConfig() {
        return null;
    }

    public boolean shouldApplyMixin(String string, String string2) {
        return true;
    }

    public void acceptTargets(Set<String> set, Set<String> set2) {
    }

    public List<String> getMixins() {
        return null;
    }

    public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }
}
