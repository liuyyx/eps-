/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.block.Block
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;

class i9 {
    private int w;
    private final Block r;
    private final Set<BlockPos> g;
    private final BlockPos l;

    private i9(Block block, BlockPos blockPos, Set<BlockPos> set, int n) {
        this.r = block;
        this.l = blockPos;
        this.g = set;
        hi.a("\u00f2", (Object)this, (int)n, (long)1067286225137188879L);
    }
}
