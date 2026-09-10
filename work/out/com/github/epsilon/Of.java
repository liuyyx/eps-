/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Oa;
import com.github.epsilon.Xg;
import com.github.epsilon.gv;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class Of
implements Oa {
    @Override
    public gv w(Object[] objectArray) {
        LocalPlayer localPlayer = (LocalPlayer)objectArray[0];
        LivingEntity livingEntity = (LivingEntity)objectArray[1];
        Vec3 vec3 = (Vec3)objectArray[2];
        Xg xg = (Xg)objectArray[3];
        return new gv(vec3, (List<Vec3>)((Object)hi.a("G", (Object)Of.x("i2ljcI4i9tqLNSto", position(), (LocalPlayer)localPlayer), (Object)vec3, (long)836702404835957224L)));
    }

    public static /* bridge */ /* synthetic */ CallSite x(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }
}
