/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.world.entity.player.Player
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import net.minecraft.world.entity.player.Player;

public class DU {
    private final HashSet<String> X = new HashSet();
    public static final DU H = new DU();

    public void c(String string) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1237529879214965778L), (Object)string, (long)633830611428089132L);
    }

    public List<String> g() {
        return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1237529879214965778L), (long)1227172947055353427L), (long)488388473389276598L);
    }

    public boolean B(Player player) {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1237529879214965778L), (Object)DU.z("lIyqOmFwVNiZYNiS", name(), (GameProfile)hi.a("\u00a5", (Object)player, (long)1086787193149074427L)), (long)518943434508923118L);
    }

    public boolean v(Object[] objectArray) {
        String string = (String)objectArray[0];
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1237529879214965778L), (Object)string, (long)518943434508923118L);
    }

    public void L(String string) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1237529879214965778L), (Object)string, (long)1134284152195660482L);
    }

    public static /* bridge */ /* synthetic */ CallSite z(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private DU() {
    }

    public void T(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1237529879214965778L), (long)781903464525472688L);
    }
}
