/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.PrimitiveTopology
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.De;
import com.github.epsilon.Xi;
import com.github.epsilon.g0;
import com.github.epsilon.hi;
import com.github.epsilon.i2;
import com.github.epsilon.lO;
import com.github.epsilon.lZ;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.function.Consumer;
import net.minecraft.resources.Identifier;

public class Oe {
    private static final i2 q;
    private static final i2 x;
    private static final i2 U;
    private static final i2 Z;
    private static final long y;
    private static final i2 p;
    private static final boolean X;

    public static Xi U(RenderPipeline renderPipeline, Identifier identifier) {
        Object[] objectArray = new Object[2];
        objectArray[1] = identifier;
        objectArray[0] = renderPipeline;
        return new Xi((i2)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)407919805227163966L), (Object)objectArray, (long)699900871959252284L)));
    }

    public static g0 P(RenderPipeline renderPipeline, Consumer<RenderPass> consumer) {
        Object[] objectArray = new Object[3];
        objectArray[2] = consumer;
        objectArray[1] = null;
        objectArray[0] = renderPipeline;
        return new g0((i2)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)1062733781279411654L), (Object)objectArray, (long)1114835836629727420L)));
    }

    public static lZ s(RenderPipeline renderPipeline) {
        Object[] objectArray = new Object[2];
        objectArray[1] = null;
        objectArray[0] = renderPipeline;
        return new lZ((i2)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)1055128769966149198L), (Object)objectArray, (long)699900871959252284L)));
    }

    public static lO W(Object[] objectArray) {
        RenderPipeline renderPipeline = (RenderPipeline)objectArray[0];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = null;
        objectArray2[0] = renderPipeline;
        return new lO((i2)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)1265055042595836233L), (Object)objectArray2, (long)699900871959252284L)));
    }

    public static g0 q(Object[] objectArray) {
        RenderPipeline renderPipeline = (RenderPipeline)objectArray[0];
        return hi.a("G", (Object)renderPipeline, null, (long)556638798134228838L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l;
        long l2 = 4333527045729290598L;
        y = l = 0x3C23C7E3592E0966L ^ l2;
        X = hi.a("G", (long)924688272568522509L) == hi.a("j", (long)1071618625487137094L);
        x = new i2((VertexFormat)hi.a("j", (long)409278652241869602L), (PrimitiveTopology)hi.a("j", (long)1302937374850483722L));
        p = new i2((VertexFormat)hi.a("j", (long)409278652241869602L), (PrimitiveTopology)hi.a("j", (long)989844084367066487L));
        U = new i2((VertexFormat)hi.a("j", (long)409278652241869602L), (PrimitiveTopology)hi.a("j", (long)1290928122288440342L));
        q = new i2((VertexFormat)hi.a("j", (long)1239053747272452080L), (PrimitiveTopology)hi.a("j", (long)1302937374850483722L));
        Z = new i2((VertexFormat)hi.a("j", (long)901243023636526247L), (PrimitiveTopology)hi.a("j", (long)688056551634139482L));
    }

    public static De Q(Object[] objectArray) {
        RenderPipeline renderPipeline = (RenderPipeline)objectArray[0];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = null;
        objectArray2[0] = renderPipeline;
        return new De((i2)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)979177009011236926L), (Object)objectArray2, (long)699900871959252284L)));
    }

    private Oe() {
    }

    public static void B() {
        hi.a("\u00a5", (Object)hi.a("j", (long)1062733781279411654L), (Object)new Object[0], (long)839397825976659995L);
        hi.a("\u00a5", (Object)hi.a("j", (long)1265055042595836233L), (Object)new Object[0], (long)839397825976659995L);
        hi.a("\u00a5", (Object)hi.a("j", (long)979177009011236926L), (Object)new Object[0], (long)839397825976659995L);
        hi.a("\u00a5", (Object)hi.a("j", (long)407919805227163966L), (Object)new Object[0], (long)839397825976659995L);
        hi.a("\u00a5", (Object)hi.a("j", (long)1055128769966149198L), (Object)new Object[0], (long)839397825976659995L);
    }
}
