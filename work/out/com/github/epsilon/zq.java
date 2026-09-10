/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.LivingEntity
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import net.minecraft.world.entity.LivingEntity;

public final class zq
extends Record {
    private final boolean x1;
    private final boolean xb;
    private final boolean x5;
    private final boolean xe;
    private final boolean XR;
    private final boolean XS;
    private final Predicate<LivingEntity> MP;
    private final double th;
    private final boolean xp;
    private final boolean xd;
    private final int or;
    private final float ac;

    public boolean Xb() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1276473020331987795L);
    }

    public boolean X1() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)656811888818383593L);
    }

    public static zq o(double d, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, int n) {
        return new zq(d, f, bl, bl2, bl3, bl4, bl5, bl6, bl7, bl8, zq::lambda$of$0, n);
    }

    public boolean Xp() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)513513464787414256L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zq.class, "th;ac;XR;xd;xp;x1;xb;XS;x5;xe;MP;or", "th", "ac", "XR", "xd", "xp", "x1", "xb", "XS", "x5", "xe", "MP", "or"}, this);
    }

    public boolean XR() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)784326947412977332L);
    }

    public double th() {
        return (double)hi.a("\u00e9", (Object)this, (long)782156357466861616L);
    }

    public int or() {
        return (int)hi.a("\u00e9", (Object)this, (long)841245656565526241L);
    }

    public boolean X5() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)755769600065966649L);
    }

    public Predicate<LivingEntity> MP() {
        return hi.a("\u00e9", (Object)this, (long)1096768473206739311L);
    }

    private static boolean lambda$new$0(LivingEntity livingEntity) {
        return true;
    }

    public boolean Xe() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)946852361086814235L);
    }

    public boolean XS() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1257377802547613864L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zq.class, "th;ac;XR;xd;xp;x1;xb;XS;x5;xe;MP;or", "th", "ac", "XR", "xd", "xp", "x1", "xb", "XS", "x5", "xe", "MP", "or"}, this, object);
    }

    private static boolean lambda$of$0(LivingEntity livingEntity) {
        return true;
    }

    public zq(double d, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, Predicate<LivingEntity> predicate, int n) {
        block18: {
            int n2;
            block17: {
                boolean bl9;
                block16: {
                    Predicate<LivingEntity> predicate2;
                    block15: {
                        block14: {
                            float f2;
                            block13: {
                                double d2;
                                block12: {
                                    boolean bl10 = Dl.t();
                                    bl9 = bl10;
                                    double d3 = d - 0.0;
                                    d2 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                                    if (!bl9) {
                                        float f3;
                                        if (d2 < 0) {
                                            d = 0.0;
                                        }
                                        d2 = (f3 = f - 0.0f) == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                                    }
                                    if (bl9) break block12;
                                    if (d2 < 0) {
                                        f = 0.0f;
                                    }
                                    f2 = f;
                                    if (bl9) break block13;
                                    float f4 = f2 - 360.0f;
                                    d2 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                                }
                                if (d2 <= 0) break block14;
                                f2 = 360.0f;
                            }
                            f = f2;
                        }
                        predicate2 = predicate;
                        if (bl9) break block15;
                        if (predicate2 != null) break block16;
                        predicate2 = zq::lambda$new$0;
                    }
                    predicate = predicate2;
                }
                n2 = n;
                if (bl9) break block17;
                if (n2 >= 1) break block18;
                n2 = 1;
            }
            n = n2;
        }
        this.th = d;
        this.ac = f;
        this.XR = bl;
        this.xd = bl2;
        this.xp = bl3;
        this.x1 = bl4;
        this.xb = bl5;
        this.XS = bl6;
        this.x5 = bl7;
        this.xe = bl8;
        this.MP = predicate;
        this.or = n;
    }

    public float Ac() {
        return (float)hi.a("\u00e9", (Object)this, (long)1188357685867169845L);
    }

    public boolean Xd() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1247192547810115289L);
    }

    public static zq v(double d, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, Predicate<LivingEntity> predicate, int n) {
        return new zq(d, f, bl, bl2, bl3, bl4, bl5, bl6, bl7, bl8, predicate, n);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zq.class, "th;ac;XR;xd;xp;x1;xb;XS;x5;xe;MP;or", "th", "ac", "XR", "xd", "xp", "x1", "xb", "XS", "x5", "xe", "MP", "or"}, this);
    }
}
