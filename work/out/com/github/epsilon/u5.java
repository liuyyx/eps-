/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.Difficulty
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.im;
import com.github.epsilon.uK;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

final class u5
extends Record {
    private final im zf;
    private final boolean LX;
    private final uK DK;
    private final Player ol;
    private final boolean LQ;
    private final Vec3 JI;
    private final Difficulty k7;
    private final float qm;
    private final AABB fV;
    private final boolean lt;
    private final Vec3 jl;

    public boolean Lt() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)487866356271336542L);
    }

    public Player Ol() {
        return hi.a("\u00e9", (Object)this, (long)843631348662135106L);
    }

    public boolean LQ() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)590102452518824559L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{u5.class, "ol;JI;jl;fV;qm;LX;lt;LQ;zf;k7;DK", "ol", "JI", "jl", "fV", "qm", "LX", "lt", "LQ", "zf", "k7", "DK"}, this, object);
    }

    public boolean LX() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)860192634658582095L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{u5.class, "ol;JI;jl;fV;qm;LX;lt;LQ;zf;k7;DK", "ol", "JI", "jl", "fV", "qm", "LX", "lt", "LQ", "zf", "k7", "DK"}, this);
    }

    private u5(Player player, Vec3 vec3, Vec3 vec32, AABB aABB, float f, boolean bl, boolean bl2, boolean bl3, im im2, Difficulty difficulty, uK uK2) {
        this.ol = player;
        this.JI = vec3;
        this.jl = vec32;
        this.fV = aABB;
        this.qm = f;
        this.LX = bl;
        this.lt = bl2;
        this.LQ = bl3;
        this.zf = im2;
        this.k7 = difficulty;
        this.DK = uK2;
    }

    public AABB fV() {
        return hi.a("\u00e9", (Object)this, (long)579971789613577503L);
    }

    public float Qm() {
        return (float)hi.a("\u00e9", (Object)this, (long)495766494072302256L);
    }

    public Difficulty k7() {
        return hi.a("\u00e9", (Object)this, (long)976403773054402141L);
    }

    public Vec3 Jl() {
        return hi.a("\u00e9", (Object)this, (long)827454156172982602L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{u5.class, "ol;JI;jl;fV;qm;LX;lt;LQ;zf;k7;DK", "ol", "JI", "jl", "fV", "qm", "LX", "lt", "LQ", "zf", "k7", "DK"}, this);
    }

    public Vec3 JI() {
        return hi.a("\u00e9", (Object)this, (long)582609789452145743L);
    }

    public im Zf() {
        return hi.a("\u00e9", (Object)this, (long)1284423054595069648L);
    }

    public uK DK() {
        return hi.a("\u00e9", (Object)this, (long)1139705784359095329L);
    }
}
