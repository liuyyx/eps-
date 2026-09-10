/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.i2;
import com.mojang.blaze3d.vertex.PoseStack;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class lZ {
    private final Vector3f r = new Vector3f();
    private final i2 b;

    public void Y(Matrix4f matrix4f, PoseStack.Pose pose, float f, float f2, float f3, int n, float f4, float f5, float f6, float f7) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1179438907864260709L), (Object)matrix4f, (float)f, (float)f2, (float)f3, (long)1083060486119861636L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1179438907864260709L), (Object)new Object[]{n}, (long)927898986293301949L);
        lZ.q("Bfyj3GD4KgdsLVLv", normalize(), (Vector3f)hi.a("\u00a5", (Object)pose, (float)f4, (float)f5, (float)f6, (Object)hi.a("\u00e9", (Object)this, (long)1150757621560512991L), (long)716090037048330865L));
        Object[] objectArray = new Object[3];
        objectArray[2] = Float.valueOf((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1150757621560512991L), (long)1031437550468343246L));
        objectArray[1] = Float.valueOf((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1150757621560512991L), (long)641683247927396683L));
        objectArray[0] = Float.valueOf((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1150757621560512991L), (long)719578877512501895L));
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1179438907864260709L), (Object)objectArray, (long)624103432565103332L);
        lZ.q("Bfyj3GD4KgdsLVLv", K(float ), (i2)((Object)hi.a("\u00e9", (Object)this, (long)1179438907864260709L)), (float)f7);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1179438907864260709L), (Object)new Object[0], (long)913909293381332519L);
    }

    private lZ(i2 i22) {
        this.b = i22;
    }

    public void k() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1179438907864260709L), (Object)new Object[0], (long)578427324800340770L);
    }

    public static /* bridge */ /* synthetic */ CallSite q(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
