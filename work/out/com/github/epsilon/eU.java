/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuSampler
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.DeltaTracker
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.player.AbstractClientPlayer
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemStack
 *  org.joml.Matrix3x2fStack
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.Xn;
import com.github.epsilon._j;
import com.github.epsilon.eh;
import com.github.epsilon.hi;
import com.github.epsilon.lH;
import com.github.epsilon.y4;
import com.github.epsilon.zK;
import com.github.epsilon.zU;
import com.mojang.blaze3d.textures.GpuSampler;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.joml.Matrix3x2fStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eU
extends eh {
    private long d;
    private float C;
    private float Q;
    private static final float D = 0.85f;
    private final DM X;
    private final DM n;
    private static final float y = 28.0f;
    private final DM _8;
    private final DM z;
    public static final eU _j;
    private final DM h;
    private final DM _x;
    private float M;
    private final DV x;
    private final Xn _V;
    private final DM _G;
    private final DM N;
    private static final float J = 0.08f;
    private int _m;
    private final Xn o;
    private final DM w;
    private final Dx<zK> _4 = hi.a("\u00a5", (Object)this, (Object)eU.b(21670, 10994), (Object)hi.a("j", (long)1011131828181797283L), (long)426795652261052192L);
    private final DV _z;
    private final DV t;
    private final DV E;
    private final Supplier<_j> u;
    private final Xn W;
    private final DV l;
    private static final float P = 0.15f;
    private final DM _L;
    private static final long _t;
    private final DM b;
    private float _u;
    private final Xn F;
    private final DM _A;
    private float T;
    private long _N;
    private LivingEntity m;
    private final DV _T;
    private final DV _B;
    private static final String[] db;
    private static final String[] eb;
    private static final long[] lb;
    private static final Integer[] mb;
    private static final long[] nb;
    private static final Long[] ob;

    private eU() {
        super(eU.b(21691, -7479), 0.0f, 0.0f, 180.0f, 80.0f);
        this.w = hi.a("\u00a5", (Object)this, (Object)eU.b(21672, 20369), (double)0.9, (double)0.5, (double)2.0, (double)0.1, (long)1077996338587307774L);
        this._L = hi.a("\u00a5", (Object)this, (Object)eU.b(21673, -7), (double)150.0, (double)100.0, (double)300.0, (double)1.0, (long)1077996338587307774L);
        this.b = hi.a("\u00a5", (Object)this, (Object)eU.b(21669, 28332), (double)52.0, (double)30.0, (double)100.0, (double)1.0, (long)1077996338587307774L);
        this.z = hi.a("\u00a5", (Object)this, (Object)eU.b(21678, -25705), (double)5.0, (double)0.0, (double)20.0, (double)1.0, (long)1077996338587307774L);
        this.h = hi.a("\u00a5", (Object)this, (Object)eU.b(21683, 18846), (double)5.0, (double)1.0, (double)20.0, (double)1.0, (long)1077996338587307774L);
        this._A = hi.a("\u00a5", (Object)this, (Object)eU.b(21668, -7112), (double)5.0, (double)2.0, (double)20.0, (double)1.0, (long)1077996338587307774L);
        this._G = hi.a("\u00a5", (Object)this, (Object)eU.b(21676, -31104), (double)2.0, (double)0.0, (double)15.0, (double)1.0, (long)1077996338587307774L);
        this.N = hi.a("\u00a5", (Object)this, (Object)eU.b(21693, -964), (double)10.5, (double)8.0, (double)18.0, (double)0.5, (long)1077996338587307774L);
        this.F = hi.a("\u00a5", (Object)this, (Object)eU.b(21679, -30007), (boolean)true, (long)1230617056439551805L);
        String string = eU.b(21690, -14888);
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)861801881865887736L);
        hi.a("G", (Object)callSite, (long)374764797691957710L);
        this._V = hi.a("\u00a5", (Object)this, (Object)string, (boolean)true, ((Xn)((Object)callSite))::z, (long)1197648209052129808L);
        this.X = hi.a("\u00a5", (Object)this, (Object)eU.b(21688, -7906), (double)250.0, (double)0.0, (double)500.0, (double)50.0, this::lambda$new$0, (long)988474938581310011L);
        String string2 = eU.b(21684, -3562);
        CallSite callSite2 = hi.a("\u00e9", (Object)this, (long)861801881865887736L);
        eU.A("eCTG1TBSqF5Di6Wa", requireNonNull(T ), (Object)callSite2);
        this._8 = eU.A("eCTG1TBSqF5Di6Wa", H(java.lang.String double double double double com.github.epsilon.yx ), (eU)this, (String)string2, (double)2.0, (double)0.1, (double)10.0, (double)0.1, ((Xn)((Object)callSite2))::z);
        this.o = eU.A("eCTG1TBSqF5Di6Wa", U(java.lang.String boolean ), (eU)this, (String)eU.b(21671, -11506), (boolean)true);
        String string3 = eU.b(21689, -20698);
        CallSite callSite3 = hi.a("\u00e9", (Object)this, (long)992928298417881272L);
        hi.a("G", (Object)callSite3, (long)374764797691957710L);
        this.n = hi.a("\u00a5", (Object)this, (Object)string3, (double)1.0, (double)0.5, (double)5.0, (double)0.5, ((Xn)((Object)callSite3))::z, (long)988474938581310011L);
        this._z = hi.a("\u00a5", (Object)this, (Object)eU.b(21686, 1918), (Object)new Color(eU.d(26121, 7254028923093687524L), eU.d(26121, 7254028923093687524L), eU.d(26121, 7254028923093687524L), eU.d(7292, 4892237607432742561L)), (long)1301745618538958839L);
        this.x = eU.A("eCTG1TBSqF5Di6Wa", Z(java.lang.String java.awt.Color ), (eU)this, (String)eU.b(21692, -22283), (Color)new Color(eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(31941, 7519762527526324032L)));
        this._T = hi.a("\u00a5", (Object)this, (Object)eU.b(21677, 8199), (Object)new Color(eU.d(28811, 9161923349768669799L), eU.d(9069, 5804192419529054569L), eU.d(5154, 6272993304460881713L), eU.d(330, 122165081474890349L)), (long)1301745618538958839L);
        String string4 = eU.b(21685, 4466);
        Color color = new Color(eU.d(22705, 4172691431329965040L), eU.d(338, 3960364210851084904L), eU.d(338, 3960364210851084904L), eU.d(26131, 3040451648184065412L));
        CallSite callSite4 = hi.a("\u00e9", (Object)this, (long)861801881865887736L);
        hi.a("G", (Object)callSite4, (long)374764797691957710L);
        this.t = hi.a("\u00a5", (Object)this, (Object)string4, (Object)color, ((Xn)((Object)callSite4))::z, (long)1241661680830497550L);
        String string5 = eU.b(21675, -23954);
        Color color2 = new Color(eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(21459, 6242335601111640516L));
        CallSite callSite5 = hi.a("\u00e9", (Object)this, (long)992928298417881272L);
        hi.a("G", (Object)callSite5, (long)374764797691957710L);
        this._B = hi.a("\u00a5", (Object)this, (Object)string5, (Object)color2, ((Xn)((Object)callSite5))::z, (long)1241661680830497550L);
        this.E = eU.A("eCTG1TBSqF5Di6Wa", Z(java.lang.String java.awt.Color ), (eU)this, (String)eU.b(21687, 19533), (Color)new Color(eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(11603, 7958746116614608875L)));
        this.W = hi.a("\u00a5", (Object)this, (Object)eU.b(21674, 15484), (boolean)true, (long)1230617056439551805L);
        String string6 = eU.b(21694, -17015);
        CallSite callSite6 = hi.a("\u00e9", (Object)this, (long)451062727385313251L);
        hi.a("G", (Object)callSite6, (long)374764797691957710L);
        this._x = hi.a("\u00a5", (Object)this, (Object)string6, (double)10.0, (double)2.0, (double)32.0, (double)1.0, ((Xn)((Object)callSite6))::z, (long)988474938581310011L);
        String string7 = eU.b(21695, 16699);
        Color color3 = new Color(eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(28811, 9161923349768669799L), eU.d(24033, 1071824502392792938L));
        CallSite callSite7 = hi.a("\u00e9", (Object)this, (long)451062727385313251L);
        hi.a("G", (Object)callSite7, (long)374764797691957710L);
        this.l = hi.a("\u00a5", (Object)this, (Object)string7, (Object)color3, ((Xn)((Object)callSite7))::z, (long)1241661680830497550L);
        hi.a("\u00f2", (Object)this, (int)eU.d(23969, 1302336229615577042L), (long)673049027372087023L);
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)1045443192939327510L);
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)381731491466580439L);
        hi.a("\u00f2", (Object)this, (float)-1.0f, (long)809124875620626604L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)1305837781349990202L);
        hi.a("\u00f2", (Object)this, (long)0L, (long)623597984369644287L);
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)390948447503963330L);
        hi.a("\u00f2", (Object)this, (long)0L, (long)1243413131342024767L);
        this.u = hi.a("G", _j::S, (long)906022743474534178L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float F(Object var1_1, float var2_2, float var3_3, float var4_4) {
        block34: {
            block33: {
                block32: {
                    block30: {
                        block31: {
                            block29: {
                                block27: {
                                    block28: {
                                        block26: {
                                            block25: {
                                                block23: {
                                                    block24: {
                                                        var5_5 = Dl.t();
                                                        var8_6 /* !! */  = eU.d(30587, 3999291857106767150L) + eU.d(10973, 2425065488838512704L) - eU.d(9197, 6165832295361108107L);
                                                        if (var5_5) lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                v0 /* !! */  = (int)eU.A("eCTG1TBSqF5Di6Wa", getId(), (LivingEntity)((LivingEntity)var1_1));
lbl6:
                                                                // 2 sources

                                                                while (true) {
                                                                    v1 /* !! */  = var6_7 /* !! */  = v0 /* !! */ ;
                                                                    v2 /* !! */  = hi.a("\u00e9", (Object)this, (long)673049027372087023L);
                                                                    if (var5_5) break block23;
                                                                    if (v1 /* !! */  == v2 /* !! */ ) break block24;
                                                                    break block25;
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl12:
                                                            // 1 sources

                                                            while (true) {
                                                                eU.A("eCTG1TBSqF5Di6Wa", values());
lbl15:
                                                                // 2 sources

                                                                while (true) {
                                                                    hi.a("\u00f2", (Object)this, (int)var6_7 /* !! */ , (long)673049027372087023L);
                                                                    hi.a("\u00f2", (Object)this, (float)var2_2, (long)1045443192939327510L);
                                                                    hi.a("\u00f2", (Object)this, (float)var2_2, (long)381731491466580439L);
                                                                    hi.a("\u00f2", (Object)this, (float)var2_2, (long)809124875620626604L);
                                                                    hi.a("\u00f2", (Object)this, (float)var3_3, (long)1305837781349990202L);
                                                                    hi.a("\u00f2", (Object)this, (long)0L, (long)623597984369644287L);
                                                                    if (!var5_5) break block26;
lbl23:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)809124875620626604L) - 0.0f;
                                                                        v3 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                        if (var5_5) break block27;
                                                                        if (v3 /* !! */  < 0) break block28;
                                                                        break block29;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl29:
                                                            // 1 sources

                                                            while (true) {
                                                                cfr_temp_1 = var2_2 - hi.a("\u00e9", (Object)this, (long)809124875620626604L);
                                                                v4 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                if (var5_5) break block30;
                                                                if (v4 >= 0) break block31;
                                                                break block32;
                                                                break;
                                                            }
lbl35:
                                                            // 1 sources

                                                            while (true) {
                                                                hi.a("\u00f2", (Object)this, (long)hi.a("G", (long)658960450018995719L), (long)623597984369644287L);
                                                                if (!var5_5) break block33;
lbl38:
                                                                // 2 sources

                                                                while (true) {
                                                                    var7_8 = hi.a("G", (float)(var4_4 * 10.0f), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                                                                    hi.a("\u00f2", (Object)this, (float)eU.A("eCTG1TBSqF5Di6Wa", lerp(float float float ), (float)var7_8, (float)hi.a("\u00e9", (Object)this, (long)1045443192939327510L), (float)var2_2), (long)1045443192939327510L);
                                                                    v5 = new Object[2];
                                                                    v5[1] = Float.valueOf(var4_4);
                                                                    v5[0] = Float.valueOf(var2_2);
                                                                    hi.a("\u00f2", (Object)this, (float)hi.a("\u00a5", (Object)this, (Object)v5, (long)738301839821777633L), (long)381731491466580439L);
                                                                    hi.a("\u00f2", (Object)this, (float)var2_2, (long)809124875620626604L);
                                                                    hi.a("\u00f2", (Object)this, (float)var3_3, (long)1305837781349990202L);
                                                                    if (var5_5) lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        while (true) {
                                                                            hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)1045443192939327510L), (float)0.0f, (float)var3_3, (long)390336973585993938L), (long)1045443192939327510L);
                                                                            hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)381731491466580439L), (float)0.0f, (float)var3_3, (long)390336973585993938L), (long)381731491466580439L);
                                                                            return (float)hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)1045443192939327510L) / var3_3), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                                                                        }
                                                                    }
                                                                    break block34;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        v0 /* !! */  = var8_6 /* !! */ ;
                                                        ** while (var5_5)
lbl55:
                                                        // 1 sources

                                                        switch (v0 /* !! */ ) {
                                                            default: {
                                                                ** continue;
                                                            }
                                                            case 334588885: {
                                                                return 2.0f;
                                                            }
                                                        }
lbl60:
                                                        // 9 sources

                                                        while (true) {
                                                            switch (var8_6 /* !! */ ) {
                                                                case 1102455218: {
                                                                    ** continue;
                                                                }
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case 1102455222: {
                                                                    ** continue;
                                                                }
                                                                case 1102455220: {
                                                                    ** continue;
                                                                }
                                                                case 1102455223: {
                                                                    ** continue;
                                                                }
                                                                case 1102455219: {
                                                                    ** continue;
                                                                }
                                                                ** case 1102455221:
lbl75:
                                                                // 1 sources

                                                                ** continue;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    v1 /* !! */  = eU.d(31907, 1443378901233272680L) / eU.d(26121, 7254028923093687524L);
                                                    v2 /* !! */  = (CallSite)eU.d(31144, 6638606994369675811L);
                                                }
                                                var8_6 /* !! */  = v1 /* !! */  + v2 /* !! */ ;
                                                if (!var5_5) ** GOTO lbl60
                                            }
                                            var8_6 /* !! */  = hi.a("G", (int)eU.d(4197, 1920957895690185268L), (int)eU.d(16674, 851077338799913722L), (long)834203424483934088L) ^ eU.d(19195, 6571431322251538926L) ^ eU.d(20917, 246226223855741825L);
                                            if (!var5_5) ** GOTO lbl60
                                        }
                                        var8_6 /* !! */  = eU.d(7124, 8275562190799331548L) - eU.d(11563, 9024963021783127837L) + eU.d(492, 499338867576305802L);
                                        if (!var5_5) ** GOTO lbl60
                                    }
                                    v3 /* !! */  = (reference)((hi.a("G", (int)hi.a("G", (int)(eU.d(16739, 2001748859101592547L) ^ eU.d(27048, 8646423022188958542L)), (int)eU.d(23076, 5891306824786911700L), (long)834203424483934088L), (int)eU.d(1276, 9157083549971218114L), (long)834203424483934088L) ^ eU.d(26971, 5238958821618946618L)) + eU.d(3085, 1394314698083530697L));
                                }
                                var8_6 /* !! */  = (int)v3 /* !! */ ;
                                if (!var5_5) ** GOTO lbl60
                            }
                            var8_6 /* !! */  = (int)(hi.a("G", (int)(eU.d(12845, 3704752594741971416L) + eU.d(29606, 2628250276600842583L)), (int)eU.d(9599, 874020238714986168L), (long)834203424483934088L) - eU.d(29453, 7079528522685188564L));
                            if (!var5_5) ** GOTO lbl60
                        }
                        v4 = (hi.a("G", (int)hi.a("G", (int)(eU.d(8390, 2423113947353143941L) ^ eU.d(26464, 6189170245431303281L)), (int)eU.d(11820, 289527734617397108L), (long)834203424483934088L), (int)eU.d(28882, 9164958328341072389L), (long)834203424483934088L) ^ eU.d(2673, 9017162392279478352L)) + eU.d(18298, 3830424802751790264L);
                    }
                    var8_6 /* !! */  = (int)v4;
                    if (!var5_5) ** GOTO lbl60
                }
                var8_6 /* !! */  = (eU.d(21971, 3721573504263630635L) / 2 ^ eU.d(25655, 2503077948976766667L)) * eU.d(14391, 5066546259417809500L) ^ eU.d(21783, 729991628379598578L);
                if (!var5_5) ** GOTO lbl60
            }
            var8_6 /* !! */  = (hi.a("G", (int)hi.a("G", (int)(eU.d(8390, 2423113947353143941L) ^ eU.d(26464, 6189170245431303281L)), (int)eU.d(11820, 289527734617397108L), (long)834203424483934088L), (int)eU.d(28882, 9164958328341072389L), (long)834203424483934088L) ^ eU.d(2673, 9017162392279478352L)) + eU.d(18298, 3830424802751790264L);
            ** GOTO lbl60
        }
        var8_6 /* !! */  = eU.d(31711, 6355510751315066957L) - eU.d(14399, 9167964192090374483L) + eU.d(27388, 8206729900259807435L);
        ** while (true)
    }

    private void J(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f2 = ((Float)objectArray[4]).floatValue();
        float f3 = ((Float)objectArray[5]).floatValue();
        int n = (Integer)objectArray[6];
        eU.A("eCTG1TBSqF5Di6Wa", pushMatrix(), (Matrix3x2fStack)hi.a("\u00a5", (Object)((GuiGraphicsExtractor)object), (long)1227623791103851245L));
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((GuiGraphicsExtractor)object), (long)1227623791103851245L), (float)(f + f3), (float)(f2 + f3), (long)414794773377747500L);
        eU.A("eCTG1TBSqF5Di6Wa", scale(float float ), (Matrix3x2fStack)hi.a("\u00a5", (Object)((GuiGraphicsExtractor)object), (long)1227623791103851245L), (float)f3, (float)f3);
        hi.a("\u00a5", (Object)((GuiGraphicsExtractor)object), (Object)((LivingEntity)object2), (Object)((ItemStack)object3), (int)0, (int)0, (int)n, (long)514082630073819117L);
        hi.a("\u00a5", (Object)eU.A("eCTG1TBSqF5Di6Wa", pose(), (GuiGraphicsExtractor)((GuiGraphicsExtractor)object)), (long)759265041509996590L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void e(Object[] var1_1) {
        block71: {
            block70: {
                block72: {
                    var2_2 = (DeltaTracker)var1_1[0];
                    var3_3 = Dl.t();
                    var79_4 /* !! */  = (eU.d(18116, 5019117196276121534L) + eU.d(4353, 4169860995692653064L)) * eU.d(806, 8206378637791623247L) / eU.d(7440, 6310372715341833985L) ^ eU.d(6087, 3482900766598393207L);
                    if (!var3_3) break block72;
lbl6:
                    // 2 sources

                    while (true) {
                        v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)479428842643033123L), (Object)hi.a("j", (long)1081054146114906732L), (long)511460060498514638L);
                        if (var3_3) ** GOTO lbl304
                        if (v0 == false) ** GOTO lbl303
                        ** GOTO lbl306
                        break;
                    }
lbl11:
                    // 2 sources

                    while (true) {
                        v1 /* !! */  = (float)(hi.a("\u00a5", (Object)var2_2, (long)525704291177296093L) / 20.0f);
                        if (!var3_3) ** GOTO lbl178
lbl14:
                        // 2 sources

                        while (true) {
                            block74: {
                                block73: {
                                    var7_8 /* !! */  = v1 /* !! */ ;
                                    var8_9 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1244788720934724271L)}, (long)690142576283117660L);
                                    var9_10 = hi.a("\u00a5", (Object)((Float)hi.a("\u00a5", (Object)eU.A("eCTG1TBSqF5Di6Wa", Y(), (lH)hi.a("j", (long)447210230030827536L)), (Object)hi.a("G", (float)eU.A("eCTG1TBSqF5Di6Wa", clamp(float float float ), (float)hi.a("\u00e9", (Object)this, (long)390948447503963330L), (float)0.0f, (float)1.0f), (long)1097085248186378937L), (long)1109315089994431641L)), (long)1263586790430806583L);
                                    if (var3_3) break block73;
                                    if (var8_9 != null) break block74;
                                    var79_4 /* !! */  = eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)(eU.d(17716, 6768214230323707538L) * eU.d(11078, 2907893579691511835L)), (int)eU.d(29803, 6689840984916725315L)) ^ eU.d(20915, 2786689666258840342L);
                                }
                                if (!var3_3) break block70;
                            }
                            var79_4 /* !! */  = (eU.d(29699, 1350393020045397562L) ^ eU.d(29932, 805905528259874492L) ^ eU.d(18286, 5561717206645849482L)) + eU.d(776, 205799185639995470L) - eU.d(24678, 5505373787716524780L) + eU.d(26983, 3038418576168326110L);
                            if (!var3_3) break block70;
                            ** GOTO lbl206
                            break;
                        }
                        break;
                    }
lbl27:
                    // 2 sources

                    while (true) {
                        var13_14 = hi.a("G", (float)1.0f, (float)hi.a("\u00e9", (Object)this, (long)1305837781349990202L), (long)1021203527991582354L);
                        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)1045443192939327510L), (float)0.0f, (float)var13_14, (long)390336973585993938L), (long)1045443192939327510L);
                        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)381731491466580439L), (float)0.0f, (float)var13_14, (long)390336973585993938L), (long)381731491466580439L);
                        var14_15 = hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)1045443192939327510L) / var13_14), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                        if (!var3_3) ** GOTO lbl232
lbl33:
                        // 2 sources

                        while (true) {
                            block76: {
                                block75: {
                                    var15_16 = hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)381731491466580439L) / var13_14), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                                    var16_17 = 5.0f * var4_5;
                                    var17_18 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)624914860978869827L), (long)789438897355831922L)), (long)371266768739483732L) * var4_5;
                                    var18_19 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)696680859015798029L), (long)789438897355831922L)), (long)371266768739483732L) * var4_5;
                                    var19_20 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)611583483801259311L), (long)789438897355831922L)), (long)371266768739483732L) * var4_5;
                                    var20_21 = hi.a("G", (float)1.0f, (float)(var5_6 - var16_17 * 2.0f), (long)1021203527991582354L);
                                    var21_22 = hi.a("G", (float)var20_21, (float)0.0f, (float)(var20_21 * var15_16), (long)390336973585993938L);
                                    var22_23 = hi.a("G", (float)var20_21, (float)0.0f, (float)(var20_21 * var14_15), (long)390336973585993938L);
                                    var23_24 = hi.a("G", (float)1.0f, (float)(var6_7 - var16_17 * 2.0f), (long)1021203527991582354L);
                                    var24_25 = hi.a("G", (float)1.0f, (float)(var23_24 - var16_17 - var18_19), (long)1021203527991582354L);
                                    var25_26 = hi.a("G", (float)var24_25, (float)(hi.a("G", (float)(26.0f * var4_5), (float)(var6_7 * 0.6f), (long)1021203527991582354L) * 1.05f), (long)971000971621905228L);
                                    var26_27 = hi.a("G", (float)0.45f, (float)(eU.A("eCTG1TBSqF5Di6Wa", floatValue(), (Double)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)487466320430048729L), (long)789438897355831922L))) / 14.0f), (long)1021203527991582354L) * var4_5;
                                    var27_28 = eU.A("eCTG1TBSqF5Di6Wa", i(float ), (_j)var10_11, (float)var26_27);
                                    var28_29 = hi.a("G", (float)var25_26, (float)var27_28, (long)1021203527991582354L);
                                    var29_30 = var28_29 + var16_17 + var18_19;
                                    var30_31 = hi.a("\u00e9", (Object)this, (long)423210454345410312L) + var16_17 + eU.A("eCTG1TBSqF5Di6Wa", max(float float ), (float)0.0f, (float)((var23_24 - var29_30) / 2.0f));
                                    var31_32 = var30_31 + (var28_29 - var25_26) / 2.0f;
                                    var32_33 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + var16_17;
                                    var33_34 = var30_31 + var28_29 + var16_17;
                                    var34_35 = var32_33 + var25_26 + var16_17;
                                    var35_36 = hi.a("\u00a5", (Object)eU.A("eCTG1TBSqF5Di6Wa", getName(), (LivingEntity)var8_9), (long)445233814433577985L);
                                    var36_37 = hi.a("G", (Object)hi.a("j", (long)795501881625394938L), (Object)eU.b(21681, -14117), (Object)new Object[]{eU.A("eCTG1TBSqF5Di6Wa", valueOf(float ), (float)hi.a("\u00e9", (Object)this, (long)1045443192939327510L))}, (long)1264245572283041652L);
                                    var37_38 = var31_32 + 2.0f * var4_5;
                                    var38_39 = hi.a("\u00a5", (Object)var10_11, (Object)var36_37, (float)var26_27, (long)665434286926928221L);
                                    var39_40 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + var5_6 - var16_17 - var38_39;
                                    var40_41 = var37_38 + var27_28 + 2.8f * var4_5;
                                    var41_42 = 0.85f * var4_5;
                                    var42_43 = 1.5f * var4_5;
                                    var43_44 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + var5_6 / 2.0f;
                                    var44_45 = hi.a("\u00e9", (Object)this, (long)423210454345410312L) + var6_7 / 2.0f;
                                    var45_46 = hi.a("G", (float)var9_10, (float)var43_44, (float)hi.a("\u00e9", (Object)this, (long)934067547881438154L), (long)899322658622726380L);
                                    var46_47 = hi.a("G", (float)var9_10, (float)var44_45, (float)hi.a("\u00e9", (Object)this, (long)423210454345410312L), (long)899322658622726380L);
                                    var47_48 = var5_6 * var9_10;
                                    var48_49 = var6_7 * var9_10;
                                    var49_50 = var17_18 * var9_10;
                                    var50_51 = var18_19 * var9_10;
                                    var51_52 = var19_20 * var9_10;
                                    var52_53 = eU.A("eCTG1TBSqF5Di6Wa", floatValue(), (Double)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)955773111950513663L), (long)789438897355831922L))) * var4_5 * var9_10;
                                    var53_54 = var26_27 * var9_10;
                                    var54_55 = var25_26 * 0.23f * var9_10;
                                    var55_56 = hi.a("G", (float)var9_10, (float)var43_44, (float)(hi.a("\u00e9", (Object)this, (long)934067547881438154L) + var16_17), (long)899322658622726380L);
                                    var56_57 = eU.A("eCTG1TBSqF5Di6Wa", lerp(float float float ), (float)var9_10, (float)var44_45, (float)var33_34);
                                    var57_58 = var20_21 * var9_10;
                                    var58_59 = var21_22 * var9_10;
                                    var59_60 = var22_23 * var9_10;
                                    var60_61 = hi.a("G", (float)var9_10, (float)var43_44, (float)var32_33, (long)899322658622726380L);
                                    var61_62 = eU.A("eCTG1TBSqF5Di6Wa", lerp(float float float ), (float)var9_10, (float)var44_45, (float)var31_32);
                                    var62_63 = var25_26 * var9_10;
                                    var63_64 = hi.a("G", (float)var9_10, (float)var43_44, (float)var34_35, (long)899322658622726380L);
                                    var64_65 = eU.A("eCTG1TBSqF5Di6Wa", lerp(float float float ), (float)var9_10, (float)var44_45, (float)var37_38);
                                    var65_66 = hi.a("G", (float)var9_10, (float)var43_44, (float)var39_40, (long)899322658622726380L);
                                    var66_67 = eU.A("eCTG1TBSqF5Di6Wa", lerp(float float float ), (float)var9_10, (float)var43_44, (float)var34_35);
                                    var67_68 = hi.a("G", (float)var9_10, (float)var44_45, (float)var40_41, (long)899322658622726380L);
                                    var68_69 = var41_42 * var9_10;
                                    var69_70 = var42_43 * var9_10;
                                    var70_71 = hi.a("\u00a5", (Object)((Float)hi.a("\u00a5", (Object)eU.A("eCTG1TBSqF5Di6Wa", Y(), (lH)hi.a("j", (long)447210230030827536L)), (Object)hi.a("G", (float)hi.a("G", (float)((float)hi.a("\u00e9", (Object)var8_9, (long)1318121655272835893L) / 10.0f), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)1097085248186378937L), (long)1109315089994431641L)), (long)1263586790430806583L);
                                    var71_72 = 1.0f - var70_71 * 0.15f;
                                    var72_73 = var62_63 * var71_72;
                                    var73_74 = var60_61 + (var62_63 - var72_73) / 2.0f;
                                    var74_75 = var61_62 + (var62_63 - var72_73) / 2.0f;
                                    var75_76 = var54_55 * var71_72;
                                    var76_77 = eU.A("eCTG1TBSqF5Di6Wa", X(java.lang.Object float ), (eU)this, (Object)hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)1173447058378651714L), (float)var70_71, (long)659025384590521254L), (float)var9_10);
                                    hi.a("\u00a5", (Object)hi.a("j", (long)889421552268440488L), (float)var45_46, (float)var46_47, (float)var47_48, (float)var48_49, (float)var49_50, (float)hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)699399334917911312L), (long)789438897355831922L)), (long)371266768739483732L), (long)1070709360778150966L);
                                    v2 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)451062727385313251L), (long)789438897355831922L)), (long)1000026253634408124L);
                                    if (var3_3) break block75;
                                    if (v2 != false) break block76;
                                    v2 = hi.a("G", (int)(eU.d(31994, 4437412835756934981L) ^ eU.d(7886, 5842995368716559550L)), (int)eU.d(12019, 6039676008461621121L), (long)834203424483934088L) + eU.d(16944, 6577293882720073802L);
                                }
                                var79_4 /* !! */  = (int)v2;
                                if (!var3_3) break block71;
                            }
                            var79_4 /* !! */  = (eU.d(7631, 4465326060867380855L) ^ eU.d(12081, 2837260997562455057L)) + eU.d(19059, 7535619014960918916L);
                            if (!var3_3) break block71;
                            ** GOTO lbl308
                            break;
                        }
                        break;
                    }
lbl108:
                    // 2 sources

                    while (true) {
                        hi.a("\u00a5", (Object)var11_12, (float)var45_46, (float)var46_47, (float)var47_48, (float)var48_49, (float)var49_50, (Object)hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1183267707007384581L), (long)789438897355831922L)), (float)var9_10, (long)1273874858379492098L), (long)776507817655946365L);
                        hi.a("\u00a5", (Object)var11_12, (float)var55_56, (float)var56_57, (float)var57_58, (float)var50_51, (float)var51_52, (Object)hi.a("\u00a5", (Object)this, (Object)((Color)eU.A("eCTG1TBSqF5Di6Wa", z(), (DV)hi.a("\u00e9", (Object)this, (long)1130578451198113230L))), (float)var9_10, (long)1273874858379492098L), (long)776507817655946365L);
                        v3 /* !! */  = eU.A("eCTG1TBSqF5Di6Wa", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)861801881865887736L), (long)789438897355831922L)));
                        if (var3_3) ** GOTO lbl312
                        if (v3 /* !! */  == false) ** GOTO lbl311
                        ** GOTO lbl314
                        break;
                    }
lbl115:
                    // 2 sources

                    while (true) {
                        hi.a("\u00a5", (Object)var11_12, (float)var55_56, (float)var56_57, (float)var59_60, (float)var50_51, (float)var51_52, (Object)hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1055555136854899342L), (long)789438897355831922L)), (float)var9_10, (long)1273874858379492098L), (long)776507817655946365L);
                        v4 = var8_9 instanceof AbstractClientPlayer;
                        if (var3_3) ** GOTO lbl328
                        if (v4 != 0) ** GOTO lbl327
                        ** GOTO lbl329
                        break;
                    }
lbl121:
                    // 2 sources

                    while (true) {
                        v5 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)992928298417881272L), (long)789438897355831922L)), (long)1000026253634408124L);
                        if (var3_3) ** GOTO lbl335
                        if (v5 /* !! */  == false) ** GOTO lbl334
                        ** GOTO lbl337
                        break;
                    }
lbl126:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = var52_53 - 0.0f;
                        v6 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                        if (var3_3) ** GOTO lbl340
                        if (v6 /* !! */  <= 0) ** GOTO lbl339
                        ** GOTO lbl342
                        break;
                    }
lbl132:
                    // 2 sources

                    while (true) {
                        v7 = var8_9 instanceof AbstractClientPlayer;
                        if (var3_3) ** GOTO lbl348
                        if (v7 == 0) ** GOTO lbl347
                        ** GOTO lbl349
                        break;
                    }
                }
lbl138:
                // 3 sources

                while (true) {
                    block80: {
                        block79: {
                            block78: {
                                block77: {
                                    switch (var79_4 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case -916062862: {
                                            hi.a("\u00a5", (Object)this, (Object)new Object[]{var2_2}, (long)524867720556477348L);
                                            return;
                                        }
                                        case -916062860: {
                                            var4_5 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)993008789601857786L), (long)789438897355831922L)), (long)371266768739483732L);
                                            var5_6 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1163543391156029653L), (long)789438897355831922L)), (long)371266768739483732L) * var4_5;
                                            var6_7 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)481110443182687327L), (long)789438897355831922L)), (long)371266768739483732L) * var4_5;
                                            hi.a("\u00a5", (Object)this, (float)var5_6, (float)var6_7, (long)1276984734984451677L);
                                            if (var3_3) break block77;
                                            if (var2_2 != null) break;
                                            break block78;
                                        }
                                        case -916062859: {
                                            throw null;
                                        }
                                    }
                                    var79_4 /* !! */  = (int)(hi.a("G", (int)(eU.d(32472, 5078344958063543409L) + eU.d(16015, 2169807030075311481L)), (int)eU.d(1909, 5427857139560512953L), (long)834203424483934088L) - eU.d(12457, 2005255824024685369L) - eU.d(7644, 665789661378143885L));
                                }
                                if (!var3_3) break block79;
                            }
                            var79_4 /* !! */  = hi.a("G", (int)eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)eU.d(13604, 154553174337179164L), (int)eU.d(28907, 3000925074351295148L)), (int)eU.d(17043, 3747500580257479674L), (long)834203424483934088L) ^ eU.d(16407, 6130824456490728150L);
                        }
                        switch (var79_4 /* !! */ ) {
                            default: {
                                v1 /* !! */  = 0.05f;
                                var79_4 /* !! */  = (eU.d(29696, 424753919996006320L) / eU.d(2090, 2693172639478805060L) ^ eU.d(31763, 7810231210053830342L)) * eU.d(15601, 719882900276266375L) / 4 - eU.d(28402, 8643830249572570437L);
                                if (var3_3) {
                                    break;
                                }
                                break block80;
                            }
                            case -912138498: {
                                ** GOTO lbl11
                            }
                            case -912138496: {
                                hi.a("G", (long)1325413874281312291L);
                                hi.a("G", (long)1301756410258456892L);
                                ** continue;
                            }
                        }
lbl178:
                        // 2 sources

                        var79_4 /* !! */  = (eU.d(12028, 5930586322946446707L) / eU.d(2090, 2693172639478805060L) ^ eU.d(27787, 2689908495711967033L)) * eU.d(167, 235347435371657812L) / 4 - eU.d(14062, 5944437234089675971L);
                    }
                    switch (var79_4 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 280532535: 
                    }
                    hi.a("G", (float)10.0f, (float)-1.0f, (float)2.0f, (float)0.0f, (double)-1.0, (long)754865965182321349L);
                    hi.a("G", (long)eU.e(12174, 8990724952959336370L), (float)10.0f, (float)0.5f, (float)-1.0f, (float)-0.5f, (int)eU.d(2674, 4574274324859285708L), (long)375734786785774161L);
                    return;
                }
            }
            block49: while (true) {
                switch (var79_4 /* !! */ ) {
                    default: {
                        cfr_temp_1 = var9_10 - 0.01f;
                        v8 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        if (var3_3) ** GOTO lbl207
                        if (v8 /* !! */  > 0) ** GOTO lbl206
                        ** GOTO lbl209
                    }
                    case 2124033754: {
                        var10_11 = (_j)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1206978054368327437L), (long)876941681548788276L);
                        var11_12 = hi.a("\u00a5", (Object)this, (long)567689278082192432L);
                        var12_13 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1244788720934724271L);
                        if (var3_3) ** GOTO lbl212
                        if (var12_13 != var8_9) ** GOTO lbl211
                        ** GOTO lbl213
                    }
                    case 2124033756: {
                        ** GOTO lbl239
                    }
lbl206:
                    // 2 sources

                    v8 /* !! */  = (reference)((eU.d(26366, 2316640685902503328L) / eU.d(26121, 7254028923093687524L) * eU.d(4044, 3934947492880151570L) - eU.d(3815, 6683661382463288767L) ^ eU.d(7531, 3403608679164241844L)) + eU.d(12454, 2254891128674503280L));
lbl207:
                    // 2 sources

                    var79_4 /* !! */  = (int)v8 /* !! */ ;
                    if (!var3_3) continue block49;
lbl209:
                    // 2 sources

                    var79_4 /* !! */  = hi.a("G", (int)(eU.d(12676, 5886651966115760811L) * eU.d(1323, 3280559470532296661L)), (int)eU.d(922, 6452539424406042884L), (long)834203424483934088L) ^ eU.d(30917, 7505470753550467503L);
                    continue block49;
lbl211:
                    // 1 sources

                    var79_4 /* !! */  = eU.d(14254, 5813140929322929483L) + eU.d(23563, 646005261997483834L) - eU.d(32547, 889892529275471281L);
lbl212:
                    // 2 sources

                    if (!var3_3) ** GOTO lbl214
lbl213:
                    // 2 sources

                    var79_4 /* !! */  = (eU.d(21982, 2999230806013553849L) ^ eU.d(17538, 3724333197330333574L)) / 3 ^ eU.d(8224, 1475413487242336847L) ^ eU.d(2745, 4805554466521575931L) ^ eU.d(15146, 5200568294033244450L);
lbl214:
                    // 2 sources

                    switch (var79_4 /* !! */ ) {
                        default: {
                            var15_16 = hi.a("\u00a5", (Object)hi.a("j", (long)710376259427890788L), (Object)var8_9, (long)449255995392705669L);
                            var13_14 = hi.a("G", (float)1.0f, (float)(hi.a("\u00a5", (Object)var8_9, (long)1223930668913322686L) + hi.a("G", (float)0.0f, (float)hi.a("\u00a5", (Object)var8_9, (long)766073733819801286L), (long)1021203527991582354L)), (long)1021203527991582354L);
                            hi.a("\u00f2", (Object)this, (float)var13_14, (long)1305837781349990202L);
                            var14_15 = hi.a("\u00a5", (Object)this, (Object)var8_9, (float)var15_16, (float)var13_14, (float)var7_8 /* !! */ , (long)419060431707960547L);
                            if (!var3_3) break;
                            ** GOTO lbl27
                        }
                        case -919134291: {
                            ** continue;
                        }
                        case -919134289: {
                            hi.a("G", (float)10.0f, (float)-1.0f, (float)0.0f, (float)1.0f, (double)100.0, (int)-1, (long)1270986612680661754L);
                            hi.a("G", (long)989880202519854622L);
                            return;
                        }
                    }
                    var79_4 /* !! */  = eU.d(9811, 5602224962341198920L) * eU.d(12080, 274792228593259878L) * eU.d(17882, 813129161553100661L) - eU.d(29766, 2882272131093204973L);
                    if (!var3_3) ** GOTO lbl233
lbl232:
                    // 2 sources

                    var79_4 /* !! */  = eU.d(24672, 5716876879287032378L) * eU.d(16251, 6154630530252326228L) * eU.d(16289, 7557451840427115838L) - eU.d(12341, 3518115014760646996L);
lbl233:
                    // 2 sources

                    v9 = var79_4 /* !! */ ;
                    if (var3_3) ** GOTO lbl240
                    switch (v9) {
                        default: {
                            ** continue;
                        }
                        case 744552664: 
                    }
lbl239:
                    // 2 sources

                    v9 = 2;
lbl240:
                    // 2 sources

                    hi.a("G", (int)v9, (long)407949291996956271L);
                    return;
                    case 2124033757: 
                }
                break;
            }
            return;
        }
        while (true) {
            block88: {
                block87: {
                    block86: {
                        block85: {
                            block84: {
                                block82: {
                                    block83: {
                                        block81: {
                                            switch (var79_4 /* !! */ ) {
                                                default: {
                                                    hi.a("\u00a5", (Object)var11_12, (float)var45_46, (float)var46_47, (float)var47_48, (float)var48_49, (float)var49_50, (float)(hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)710942097551545031L), (long)789438897355831922L)), (long)371266768739483732L) * var9_10), (Object)hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1113257090936787130L), (long)789438897355831922L)), (float)var9_10, (long)1273874858379492098L), (long)1008283404322600030L);
                                                    if (!var3_3) break block81;
                                                    ** GOTO lbl108
                                                }
                                                case 201531063: {
                                                    ** continue;
                                                }
                                                case 201531058: {
                                                    cfr_temp_2 = hi.a("\u00e9", (Object)this, (long)381731491466580439L) - hi.a("\u00e9", (Object)this, (long)1045443192939327510L);
                                                    v10 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                                    if (var3_3) break block82;
                                                    if (v10 /* !! */  <= 0) break block83;
                                                    break block84;
                                                }
                                                case 201531067: {
                                                    hi.a("\u00a5", (Object)var11_12, (float)var55_56, (float)var56_57, (float)var58_59, (float)var50_51, (float)var51_52, (Object)hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1026639580513637408L), (long)789438897355831922L)), (float)var9_10, (long)1273874858379492098L), (long)776507817655946365L);
                                                    if (!var3_3) break block85;
                                                    ** GOTO lbl115
                                                }
                                                case 201531065: {
                                                    ** continue;
                                                }
                                                case 201531056: {
                                                    hi.a("\u00a5", (Object)var11_12, (float)var73_74, (float)var74_75, (float)var72_73, (float)var72_73, (float)var75_76, (Object)hi.a("\u00a5", (Object)this, (Object)hi.a("\u00a5", (Object)this, (Object)new Color(eU.d(5554, 345059062866636592L), eU.d(4938, 7983268261828159964L), eU.d(4938, 7983268261828159964L), eU.d(16145, 1792844489217394052L)), (float)var70_71, (long)659025384590521254L), (float)var9_10, (long)1273874858379492098L), (long)776507817655946365L);
                                                    if (!var3_3) break block86;
                                                    ** GOTO lbl121
                                                }
                                                case 201531062: {
                                                    ** continue;
                                                }
                                                case 201531057: {
                                                    ** GOTO lbl126
                                                }
                                                case 201531064: {
                                                    eU.A("eCTG1TBSqF5Di6Wa", a(float float float float float float java.awt.Color ), (zU)var11_12, (float)var55_56, (float)var56_57, (float)var57_58, (float)var50_51, (float)var51_52, (float)var52_53, (Color)hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1072803148861567827L), (long)789438897355831922L)), (float)var9_10, (long)1273874858379492098L));
                                                    if (!var3_3) break block87;
                                                    ** GOTO lbl132
                                                }
                                                case 201531061: {
                                                    ** continue;
                                                }
                                                case 201531066: {
                                                    var77_78 = (AbstractClientPlayer)var8_9;
                                                    var78_79 = eU.A("eCTG1TBSqF5Di6Wa", getTexture(net.minecraft.resources.Identifier ), (TextureManager)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1152294147867586175L), (Identifier)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var77_78, (long)1119149936291176659L), (long)709844567398076201L), (long)626461247043783440L));
                                                    v11 = new Object[6];
                                                    v11[5] = var76_77;
                                                    v11[4] = Float.valueOf((float)var75_76);
                                                    v11[3] = Float.valueOf((float)var72_73);
                                                    v11[2] = Float.valueOf((float)var74_75);
                                                    v11[1] = Float.valueOf((float)var73_74);
                                                    v11[0] = new y4((GpuTexture)hi.a("\u00a5", (Object)var78_79, (long)488964255375896105L), (GpuTextureView)hi.a("\u00a5", (Object)var78_79, (long)1328129469622809937L), (GpuSampler)hi.a("\u00a5", (Object)var78_79, (long)1138865435669659618L));
                                                    hi.a("\u00a5", (Object)var11_12, (Object)v11, (long)530608305532789425L);
                                                    if (!var3_3) break block88;
                                                    ** GOTO lbl-1000
                                                }
                                                case 201531059: lbl-1000:
                                                // 2 sources

                                                {
                                                    hi.a("\u00a5", (Object)var11_12, (Object)var35_36, (float)var63_64, (float)var64_65, (float)var53_54, (Object)hi.a("\u00a5", (Object)this, (Object)((Color)eU.A("eCTG1TBSqF5Di6Wa", z(), (DV)hi.a("\u00e9", (Object)this, (long)533939027579071869L))), (float)var9_10, (long)1273874858379492098L), (long)487875072643634565L);
                                                    hi.a("\u00a5", (Object)var11_12, (Object)var36_37, (float)var65_66, (float)var64_65, (float)var53_54, (Object)eU.A("eCTG1TBSqF5Di6Wa", X(java.lang.Object float ), (eU)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)533939027579071869L), (long)789438897355831922L)), (float)var9_10), (long)487875072643634565L);
                                                    return;
                                                }
                                                case 201531068: 
                                            }
                                            hi.a("G", (long)979899430926065004L);
                                            if (var3_3) ** break;
                                            ** continue;
lbl303:
                                            // 2 sources

                                            v0 = hi.a("G", (int)eU.d(10173, 5185687891605052502L), (int)eU.d(11448, 7300850255494109010L), (long)834203424483934088L) + eU.d(20801, 1288163751928998454L) + eU.d(15381, 5600281496575526428L);
lbl304:
                                            // 2 sources

                                            var79_4 /* !! */  = (int)v0;
                                            if (!var3_3) ** GOTO lbl138
lbl306:
                                            // 2 sources

                                            var79_4 /* !! */  = eU.d(24893, 2152053121963957009L) - eU.d(763, 6032227748193957996L) ^ eU.d(1161, 3798618959152349170L);
                                            ** continue;
                                        }
                                        var79_4 /* !! */  = (int)(hi.a("G", (int)(eU.d(30554, 7099467517466316065L) ^ eU.d(18000, 4982464695092624393L)), (int)eU.d(30128, 4766183079888981998L), (long)834203424483934088L) + eU.d(32131, 6075340481029211740L));
                                        if (!var3_3) continue;
lbl311:
                                        // 2 sources

                                        v3 /* !! */  = (CallSite)(eU.d(15325, 8812594163420643361L) / eU.d(17286, 1110767985439324200L) / 2 + eU.d(27714, 716488404457723892L) - eU.d(15992, 4627746946855486771L) - eU.d(3856, 5951076806132594001L));
lbl312:
                                        // 2 sources

                                        var79_4 /* !! */  = (int)v3 /* !! */ ;
                                        if (!var3_3) continue;
lbl314:
                                        // 2 sources

                                        var79_4 /* !! */  = (int)(hi.a("G", (int)eU.d(27729, 4348672312387213288L), (int)eU.d(17548, 479232609071513586L), (long)834203424483934088L) + eU.d(29821, 4340436533676609253L));
                                        if (!var3_3) continue;
                                    }
                                    v10 /* !! */  = (reference)(eU.d(8800, 7501568121268557894L) / eU.d(17286, 1110767985439324200L) / 2 + eU.d(19212, 998282977665167782L) - eU.d(17752, 3446457217910226776L) - eU.d(26944, 1524348065594676022L));
                                }
                                var79_4 /* !! */  = (int)v10 /* !! */ ;
                                if (!var3_3) continue;
                            }
                            var79_4 /* !! */  = (eU.d(18601, 6303223060299428725L) * eU.d(28845, 1594191560543833056L) ^ eU.d(26122, 4866301681769880665L) ^ eU.d(12854, 8096474399880267835L)) / eU.d(31675, 3258483301985222880L) - eU.d(3590, 7071444959603946728L);
                            if (!var3_3) continue;
                        }
                        var79_4 /* !! */  = eU.d(8800, 7501568121268557894L) / eU.d(17286, 1110767985439324200L) / 2 + eU.d(19212, 998282977665167782L) - eU.d(17752, 3446457217910226776L) - eU.d(26944, 1524348065594676022L);
                        if (!var3_3) continue;
lbl327:
                        // 2 sources

                        v4 = var79_4 /* !! */  = hi.a("G", (int)eU.d(21154, 1846670477385968048L), (int)eU.d(28140, 827221545045399094L), (long)834203424483934088L) ^ eU.d(30900, 8063591033287934509L) ^ eU.d(13103, 4747855895673620803L) ^ eU.d(29377, 1033685644294719802L);
lbl328:
                        // 2 sources

                        if (!var3_3) continue;
lbl329:
                        // 2 sources

                        var79_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(eU.d(31716, 1217245152000278596L) - eU.d(21131, 474458433043540372L)), (int)eU.d(1363, 5090873496113839642L), (long)834203424483934088L) + eU.d(10342, 5145296527900463658L)), (int)eU.d(14630, 7136676717503005441L), (long)834203424483934088L) - eU.d(17456, 8999955309453524297L));
                        if (!var3_3) continue;
                    }
                    var79_4 /* !! */  = hi.a("G", (int)eU.d(15062, 6797381789895869345L), (int)eU.d(4969, 3691849603377948829L), (long)834203424483934088L) ^ eU.d(30833, 1317211590409749255L) ^ eU.d(1894, 1974064110093728876L) ^ eU.d(20264, 6805833234023199828L);
                    if (!var3_3) continue;
lbl334:
                    // 2 sources

                    v5 /* !! */  = (CallSite)(hi.a("G", (int)((eU.d(7876, 1587262237518619911L) - eU.d(18832, 7752586033720767365L)) * eU.d(3145, 1957072200218670967L)), (int)eU.d(28026, 7246346834448750330L), (long)834203424483934088L) ^ eU.d(31291, 876980227510272846L));
lbl335:
                    // 2 sources

                    var79_4 /* !! */  = (int)v5 /* !! */ ;
                    if (!var3_3) continue;
lbl337:
                    // 2 sources

                    var79_4 /* !! */  = eU.d(27880, 1627594001443297030L) / eU.d(4225, 7196271374081714928L) - eU.d(30248, 143582228607995004L);
                    if (!var3_3) continue;
lbl339:
                    // 2 sources

                    v6 /* !! */  = (reference)(hi.a("G", (int)((eU.d(14037, 1015502161376988435L) - eU.d(21598, 2288765520587468668L)) * eU.d(7282, 2282559628243986390L)), (int)eU.d(16673, 886399041545680986L), (long)834203424483934088L) ^ eU.d(2546, 2956934428057170531L));
lbl340:
                    // 2 sources

                    var79_4 /* !! */  = (int)v6 /* !! */ ;
                    if (!var3_3) continue;
lbl342:
                    // 2 sources

                    var79_4 /* !! */  = (eU.d(17179, 7784562283229657457L) - eU.d(26424, 9079191391707372980L)) * eU.d(15297, 3450802637256769769L) + eU.d(10571, 9210122705870803515L) ^ eU.d(11340, 4282814234904942387L);
                    if (!var3_3) continue;
                }
                var79_4 /* !! */  = hi.a("G", (int)((eU.d(14037, 1015502161376988435L) - eU.d(21598, 2288765520587468668L)) * eU.d(7282, 2282559628243986390L)), (int)eU.d(16673, 886399041545680986L), (long)834203424483934088L) ^ eU.d(2546, 2956934428057170531L);
                if (!var3_3) continue;
lbl347:
                // 2 sources

                v7 = var79_4 /* !! */  = eU.d(19401, 5128655804336189944L) + eU.d(12025, 3831068052267160710L) + eU.d(11446, 6329954899665213341L);
lbl348:
                // 2 sources

                if (!var3_3) continue;
lbl349:
                // 2 sources

                var79_4 /* !! */  = eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)eU.d(28680, 1185779301691984450L), (int)eU.d(30190, 2688306236431044098L)), (int)eU.d(6888, 4985092922229514279L)) + eU.d(25024, 5951574329842605024L) ^ eU.d(21082, 339937574820653151L);
                continue;
            }
            var79_4 /* !! */  = eU.d(5467, 8531421314157276791L) + eU.d(26717, 1747433897013449616L) + eU.d(22100, 590606845646155137L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$0() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)861801881865887736L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1181308168549073724L), (long)789438897355831922L))), (long)1000026253634408124L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void T(Object[] var1_1) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var3_2 = var1_1[0];
                        var2_3 = var1_1[1];
                        var4_4 = Dl.t();
                        var5_5 /* !! */  = eU.d(6964, 7885022235750588877L) * eU.d(14660, 8474504932374627298L) + eU.d(29329, 8637509356624644255L);
                        if (var4_4) {
lbl8:
                            // 2 sources

                            while (true) {
                                hi.a("G", (float)0.0f, (long)1329648085340989328L);
                                eU.A("eCTG1TBSqF5Di6Wa", Q());
lbl13:
                                // 2 sources

                                while (true) {
                                    v0 /* !! */  = hi.a("\u00a5", (Object)((ItemStack)var2_3), (long)675687955611242108L);
                                    if (var4_4) break block12;
                                    if (v0 /* !! */  != false) break block13;
                                    break block14;
                                    break;
                                }
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                hi.a("\u00a5", (Object)((List)var3_2), (Object)((ItemStack)var2_3), (long)615358212536192384L);
                                if (var4_4) lbl-1000:
                                // 2 sources

                                {
                                    return;
                                }
                                break block15;
                                break;
                            }
                        }
lbl25:
                        // 5 sources

                        while (true) {
                            switch (var5_5 /* !! */ ) {
                                case -994069613: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                case -994069615: {
                                    ** continue;
                                }
                                ** case -994069612:
lbl34:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    v0 /* !! */  = (CallSite)(hi.a("G", (int)eU.d(8854, 9198777334541179202L), (int)eU.d(3766, 8961002849109964245L), (long)834203424483934088L) ^ eU.d(27779, 2990591511113013144L));
                }
                var5_5 /* !! */  = (int)v0 /* !! */ ;
                if (!var4_4) ** GOTO lbl25
            }
            var5_5 /* !! */  = (int)(hi.a("G", (int)((eU.d(27000, 6463427851588538924L) ^ eU.d(22306, 1680470829626666286L)) - eU.d(4140, 6659925902223469314L)), (int)eU.d(32292, 6667391342707148052L), (long)834203424483934088L) - eU.d(25582, 9070255778587122037L));
            if (!var4_4) ** GOTO lbl25
        }
        var5_5 /* !! */  = hi.a("G", (int)eU.d(11917, 2619793214802613614L), (int)eU.d(31841, 173896581077796377L), (long)834203424483934088L) ^ eU.d(5691, 1241427895074614586L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void j(Object[] var1_1) {
        block19: {
            block15: {
                block14: {
                    var2_2 = (GuiGraphicsExtractor)var1_1[0];
                    var3_3 = (DeltaTracker)var1_1[1];
                    var4_4 = Dl.S();
                    var34_5 /* !! */  = (eU.d(7089, 3758656833962303911L) / 5 - eU.d(9332, 8832163287335329469L)) * eU.d(2597, 5302996807738322956L) + eU.d(21046, 3498819410436467122L);
                    if (var4_4) ** GOTO lbl17
                    block10: while (true) {
                        block18: {
                            block17: {
                                block16: {
                                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)479428842643033123L), (Object)hi.a("j", (long)1081054146114906732L), (long)511460060498514638L);
                                    if (!var4_4) break block16;
                                    if (v0 /* !! */  != false) break block17;
                                    v0 /* !! */  = (CallSite)((eU.d(32253, 5959026129304389465L) - eU.d(8264, 6940266237166082945L) ^ eU.d(526, 6615675634113837098L)) / eU.d(25136, 9152305825981438256L) ^ eU.d(11647, 2066750321744336558L));
                                }
                                var34_5 /* !! */  = (int)v0 /* !! */ ;
                                if (var4_4) break block18;
                            }
                            var34_5 /* !! */  = (eU.d(19791, 1719145421002684057L) * eU.d(20582, 6250749652067330901L) - eU.d(11191, 3358451657570177412L)) * eU.d(20840, 2268228830947453744L) * eU.d(18477, 8392729638936032140L) ^ eU.d(19935, 5283380686010791642L);
                        }
                        switch (var34_5 /* !! */ ) {
                            default: {
                                continue block10;
                            }
                            case 1832407484: {
                                return;
                            }
                            case 1832407485: {
                                var5_6 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)993008789601857786L), (long)789438897355831922L)), (long)371266768739483732L);
                                var6_7 = hi.a("\u00e9", (Object)this, (long)1163995629683877408L);
                                if (!var4_4) break block14;
                                if (var6_7 == null) break block10;
                                break block15;
                            }
                            case 1832407486: {
                                hi.a("G", (long)487615547825844238L);
                                return;
                            }
                        }
                        break;
                    }
                    var34_5 /* !! */  = eU.d(5354, 8336549859569397514L) * eU.d(5207, 6126311797255106292L) ^ eU.d(16507, 3112003166470683235L);
                }
                if (var4_4) break block19;
            }
            var34_5 /* !! */  = eU.d(27844, 516094104964175477L) + eU.d(13472, 2250508907857497690L) - eU.d(23731, 4259473130133038894L) - eU.d(19319, 7975691909033439595L);
            if (!var4_4) ** GOTO lbl85
        }
        block11: while (true) {
            switch (var34_5 /* !! */ ) {
                default: {
                    cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)390948447503963330L) - 0.01f;
                    v1 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (!var4_4) ** GOTO lbl86
                    if (v1 /* !! */  > 0) ** GOTO lbl85
                    ** GOTO lbl88
                }
                case -481703027: {
                    var7_8 = (_j)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1206978054368327437L), (long)876941681548788276L);
                    var8_9 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1163543391156029653L), (long)789438897355831922L)), (long)371266768739483732L) * var5_6;
                    var9_10 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)481110443182687327L), (long)789438897355831922L)), (long)371266768739483732L) * var5_6;
                    var10_11 = hi.a("\u00a5", (Object)((Float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)447210230030827536L), (long)1141210563691722787L), (Object)hi.a("G", (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)390948447503963330L), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)1097085248186378937L), (long)1109315089994431641L)), (long)1263586790430806583L);
                    var11_12 = 5.0f * var5_6;
                    var12_13 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)696680859015798029L), (long)789438897355831922L)), (long)371266768739483732L) * var5_6;
                    var13_14 = hi.a("G", (float)1.0f, (float)(var9_10 - var11_12 * 2.0f), (long)1021203527991582354L);
                    var14_15 = hi.a("G", (float)1.0f, (float)(var13_14 - var11_12 - var12_13), (long)1021203527991582354L);
                    var15_16 = hi.a("G", (float)var14_15, (float)(hi.a("G", (float)(26.0f * var5_6), (float)(var9_10 * 0.6f), (long)1021203527991582354L) * 1.05f), (long)971000971621905228L);
                    var16_17 = hi.a("G", (float)0.45f, (float)(hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)487466320430048729L), (long)789438897355831922L)), (long)371266768739483732L) / 14.0f), (long)1021203527991582354L) * var5_6;
                    var17_18 = hi.a("\u00a5", (Object)var7_8, (float)var16_17, (long)441868902805229185L);
                    var18_19 = hi.a("G", (float)var15_16, (float)var17_18, (long)1021203527991582354L);
                    var19_20 = var18_19 + var11_12 + var12_13;
                    var20_21 = hi.a("\u00e9", (Object)this, (long)423210454345410312L) + var11_12 + hi.a("G", (float)0.0f, (float)((var13_14 - var19_20) / 2.0f), (long)1021203527991582354L);
                    var21_22 = var20_21 + (var18_19 - var15_16) / 2.0f;
                    var22_23 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + var11_12;
                    var23_24 = var22_23 + var15_16 + var11_12;
                    var24_25 = var21_22 + 2.0f * var5_6;
                    var25_26 = var24_25 + var17_18 + 2.8f * var5_6;
                    var26_27 = 0.85f * var5_6;
                    var27_28 = 1.5f * var5_6;
                    var28_29 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + var8_9 / 2.0f;
                    var29_30 = hi.a("\u00e9", (Object)this, (long)423210454345410312L) + var9_10 / 2.0f;
                    var30_31 = hi.a("G", (float)var10_11, (float)var28_29, (float)var23_24, (long)899322658622726380L);
                    var31_32 = hi.a("G", (float)var10_11, (float)var29_30, (float)var25_26, (long)899322658622726380L);
                    var32_33 = var26_27 * var10_11;
                    var33_34 = var27_28 * var10_11;
                    v2 = new Object[6];
                    v2[5] = Float.valueOf(var33_34);
                    v2[4] = Float.valueOf(var32_33);
                    v2[3] = Float.valueOf((float)var31_32);
                    v2[2] = Float.valueOf((float)var30_31);
                    v2[1] = var6_7;
                    v2[0] = var2_2;
                    hi.a("\u00a5", (Object)this, (Object)v2, (long)1249994446380421975L);
                    return;
                }
lbl85:
                // 2 sources

                v1 /* !! */  = (reference)((eU.d(6046, 8626656124923899330L) / eU.d(7440, 6310372715341833985L) ^ eU.d(7982, 4842476266220479618L)) * eU.d(10581, 7326514011294618412L) - eU.d(26752, 2752815381563511517L));
lbl86:
                // 2 sources

                var34_5 /* !! */  = (int)v1 /* !! */ ;
                if (var4_4) continue block11;
lbl88:
                // 2 sources

                var34_5 /* !! */  = eU.d(29678, 1737359219660425300L) * eU.d(7267, 2784062363621156561L) ^ eU.d(20323, 1978447667582350353L);
                continue block11;
                case -481703028: {
                    return;
                }
                case -481703025: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private LivingEntity j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean E(Object var1_1) {
        block27: {
            block26: {
                block24: {
                    block25: {
                        block23: {
                            block21: {
                                block22: {
                                    block20: {
                                        block29: {
                                            block28: {
                                                var2_2 = Dl.t();
                                                var3_3 /* !! */  = (eU.d(16284, 6759687550227039442L) / eU.d(10221, 4922927456570105502L) - eU.d(23909, 5848487144082351899L)) * eU.d(25422, 2862184267771975860L) ^ eU.d(24491, 8614814292824171649L);
                                                if (!var2_2) break block28;
lbl4:
                                                // 2 sources

                                                while ((LivingEntity)var1_1 != null) {
                                                    break block20;
                                                }
                                                break block29;
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    v0 = hi.a("\u00a5", (Object)((LivingEntity)var1_1), (long)938038053496602901L);
                                                    if (var2_2) break block21;
                                                    if (v0 == false) break block22;
                                                    break block23;
                                                    break;
                                                }
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    v1 = eU.A("eCTG1TBSqF5Di6Wa", isDeadOrDying(), (LivingEntity)((LivingEntity)var1_1));
                                                    if (var2_2) break block24;
                                                    if (v1 != false) break block25;
                                                    break block26;
                                                    break;
                                                }
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl19:
                                                // 1 sources

                                                while (true) {
                                                    v2 = false;
                                                    if (var2_2) {
lbl23:
                                                        // 2 sources

                                                        while (true) {
                                                            eU.A("eCTG1TBSqF5Di6Wa", H());
                                                            v3 /* !! */  = hi.a("G", (long)1296298356484719498L);
lbl27:
                                                            // 3 sources

                                                            return v2;
                                                        }
                                                    }
                                                    break block27;
                                                    break;
                                                }
                                            }
lbl31:
                                            // 7 sources

                                            while (true) {
                                                switch (var3_3 /* !! */ ) {
                                                    default: {
                                                        ** GOTO lbl4
                                                    }
                                                    case -1910545189: {
                                                        ** continue;
                                                    }
                                                    case -1910545190: {
                                                        ** continue;
                                                    }
                                                    case -1910545188: {
                                                        ** continue;
                                                    }
                                                    case -1910545187: {
                                                        ** continue;
                                                    }
                                                    case -1910545191: {
                                                        return true;
                                                    }
                                                }
                                                break;
                                            }
lbl45:
                                            // 2 sources

                                            while (true) {
                                                v3 /* !! */  = (CallSite)var3_3 /* !! */ ;
                                                if (var2_2) ** GOTO lbl27
                                                switch (v3 /* !! */ ) {
                                                    case 1038570780: {
                                                        ** continue;
                                                    }
                                                    ** default:
lbl52:
                                                    // 1 sources

                                                    ** continue;
                                                }
                                                break;
                                            }
                                        }
                                        var3_3 /* !! */  = (int)(hi.a("G", (int)eU.d(29205, 4396171492259203091L), (int)eU.d(19365, 2149006791144485127L), (long)834203424483934088L) / eU.d(26121, 7254028923093687524L) / eU.d(23244, 4960852649210782643L) - eU.d(6709, 3278488150292848805L));
                                        if (!var2_2) ** GOTO lbl31
                                    }
                                    var3_3 /* !! */  = eU.d(15907, 4639128661985576368L) - eU.d(16626, 2777321747798932090L) ^ eU.d(22215, 698583573780966772L);
                                    if (!var2_2) ** GOTO lbl31
                                }
                                v0 = eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)eU.d(1473, 7556411143938768736L), (int)eU.d(26470, 6450677712452918280L)) / eU.d(26121, 7254028923093687524L) / eU.d(17286, 1110767985439324200L) - eU.d(26268, 5728568428262169707L);
                            }
                            var3_3 /* !! */  = (int)v0;
                            if (!var2_2) ** GOTO lbl31
                        }
                        var3_3 /* !! */  = (hi.a("G", (int)eU.d(14868, 1389609915169980832L), (int)eU.d(2278, 8320541805958984487L), (long)834203424483934088L) ^ eU.d(2113, 4593525997353595536L)) + eU.d(27565, 7589647579618021563L) + eU.d(25364, 3578069524382914661L) - eU.d(19175, 9087363097027588372L);
                        if (!var2_2) ** GOTO lbl31
                    }
                    v1 = hi.a("G", (int)eU.d(1473, 7556411143938768736L), (int)eU.d(26470, 6450677712452918280L), (long)834203424483934088L) / eU.d(26121, 7254028923093687524L) / eU.d(17286, 1110767985439324200L) - eU.d(26268, 5728568428262169707L);
                }
                var3_3 /* !! */  = (int)v1;
                if (!var2_2) ** GOTO lbl31
            }
            var3_3 /* !! */  = hi.a("G", (int)eU.d(3410, 7234108487006844738L), (int)eU.d(19902, 8872636921791428486L), (long)834203424483934088L) ^ eU.d(23289, 2419835645300941284L);
            ** while (true)
            v2 = true;
            var3_3 /* !! */  = eU.d(32754, 4563507138146206927L) / eU.d(17286, 1110767985439324200L) - eU.d(19855, 2401847113352426750L) + eU.d(15972, 5392623483306427608L) ^ eU.d(27075, 7002180585085014672L);
            if (!var2_2) ** GOTO lbl45
        }
        var3_3 /* !! */  = eU.d(24697, 8446640825322412754L) / eU.d(17286, 1110767985439324200L) - eU.d(21188, 6682512800916449283L) + eU.d(8883, 2543229889088805263L) ^ eU.d(17255, 5723106101382592956L);
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite A(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float z(Object[] var1_1) {
        block31: {
            block29: {
                block30: {
                    block28: {
                        block26: {
                            block27: {
                                block25: {
                                    block23: {
                                        block24: {
                                            block22: {
                                                block20: {
                                                    block21: {
                                                        var3_2 = ((Float)var1_1[0]).floatValue();
                                                        var2_3 = ((Float)var1_1[1]).floatValue();
                                                        var4_4 = Dl.S();
                                                        var6_5 /* !! */  = hi.a("G", (int)eU.d(29648, 7348220827043170414L), (int)eU.d(8303, 8550090198710147727L), (long)834203424483934088L) - eU.d(29723, 6362449720431709737L) + eU.d(20409, 5694432102454277594L);
                                                        if (!var4_4) lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                v0 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)861801881865887736L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                if (!var4_4) break block20;
                                                                if (v0 /* !! */  != false) break block21;
                                                                break block22;
                                                                break;
                                                            }
lbl12:
                                                            // 1 sources

                                                            return var3_2;
lbl14:
                                                            // 1 sources

                                                            while (true) {
                                                                cfr_temp_0 = var3_2 - hi.a("\u00e9", (Object)this, (long)381731491466580439L);
                                                                v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                if (!var4_4) break block23;
                                                                if (v1 < 0) break block24;
                                                                break block25;
                                                                break;
                                                            }
lbl20:
                                                            // 1 sources

                                                            return var3_2;
lbl22:
                                                            // 1 sources

                                                            while (true) {
                                                                v2 /* !! */  = eU.A("eCTG1TBSqF5Di6Wa", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1181308168549073724L), (long)789438897355831922L)));
                                                                if (!var4_4) break block26;
                                                                if (v2 /* !! */  == false) break block27;
                                                                break block28;
                                                                break;
                                                            }
lbl27:
                                                            // 1 sources

                                                            while (true) {
                                                                cfr_temp_1 = hi.a("G", (long)658960450018995719L) - hi.a("\u00e9", (Object)this, (long)623597984369644287L) - hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)691665339428232864L), (long)789438897355831922L)), (long)1283122622052954325L);
                                                                v3 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                if (!var4_4) break block29;
                                                                if (v3 /* !! */  >= 0) break block30;
                                                                break block31;
                                                                break;
                                                            }
lbl33:
                                                            // 1 sources

                                                            return (float)hi.a("\u00e9", (Object)this, (long)381731491466580439L);
lbl35:
                                                            // 1 sources

                                                            while (true) {
                                                                var5_6 = hi.a("G", (float)(var2_3 * eU.A("eCTG1TBSqF5Di6Wa", floatValue(), (Double)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1295318516775777856L), (long)789438897355831922L))) * 2.0f), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                                                                return (float)hi.a("G", (float)var5_6, (float)hi.a("\u00e9", (Object)this, (long)381731491466580439L), (float)var3_2, (long)899322658622726380L);
                                                            }
                                                        }
lbl38:
                                                        // 10 sources

                                                        while (true) {
                                                            switch (var6_5 /* !! */ ) {
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case 652744267: {
                                                                    ** continue;
                                                                }
                                                                case 652744268: {
                                                                    ** continue;
                                                                }
                                                                case 652744272: {
                                                                    ** continue;
                                                                }
                                                                case 652744274: {
                                                                    ** continue;
                                                                }
                                                                case 652744269: {
                                                                    ** continue;
                                                                }
                                                                case 652744275: {
                                                                    ** continue;
                                                                }
                                                                case 652744270: {
                                                                    ** continue;
                                                                }
                                                                case 652744273: 
                                                            }
                                                            hi.a("G", (long)1208540510591910900L);
                                                            return (float)hi.a("G", (long)1101389884075884739L);
                                                        }
                                                    }
                                                    v0 /* !! */  = var6_5 /* !! */  = (reference)(((eU.d(23319, 6095543990533431542L) * eU.d(6537, 2248360536780726927L) ^ eU.d(17326, 4026478321618729084L)) - eU.d(26386, 9123821476234665200L)) * eU.d(26716, 7972808681830486623L) + eU.d(7126, 774764650964738220L));
                                                }
                                                if (var4_4) ** GOTO lbl38
                                            }
                                            var6_5 /* !! */  = eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)(hi.a("G", (int)eU.d(1456, 6178453560696700434L), (int)eU.d(31452, 2610238826123362650L), (long)834203424483934088L) * eU.d(28664, 5721266491806848269L)), (int)eU.d(13382, 7328700426408119811L)) + eU.d(3230, 9214307457240364935L);
                                            if (var4_4) ** GOTO lbl38
                                        }
                                        v1 = (eU.d(14463, 4044650131768820552L) * eU.d(9849, 6366760031807298651L) / 4 + eU.d(28972, 6098006626166803363L)) / 5 - eU.d(9347, 903877988307230491L);
                                    }
                                    var6_5 /* !! */  = (reference)v1;
                                    if (var4_4) ** GOTO lbl38
                                }
                                var6_5 /* !! */  = (reference)((eU.d(27415, 7208978788908634729L) - eU.d(15922, 97379025955996855L) ^ eU.d(7673, 7566807466352404381L)) * eU.d(2817, 459847603306557826L) ^ eU.d(30359, 7008819172665691347L));
                                if (var4_4) ** GOTO lbl38
                            }
                            v2 /* !! */  = var6_5 /* !! */  = (reference)((eU.d(15946, 5545126003009144104L) * eU.d(11911, 2609546191184942191L) - eU.d(12611, 6376216571224869822L)) / eU.d(12066, 3880674377366623719L) / 5 ^ eU.d(19067, 1960786338788520142L));
                        }
                        if (var4_4) ** GOTO lbl38
                    }
                    var6_5 /* !! */  = (reference)((eU.d(13758, 7635429229137285067L) / 5 ^ eU.d(17208, 2130399244157335707L)) * eU.d(5947, 3629707640890256384L) + eU.d(5601, 5146150099455175833L));
                    if (var4_4) ** GOTO lbl38
                }
                v3 /* !! */  = var6_5 /* !! */  = (reference)((eU.d(6993, 2763440256097378528L) * eU.d(10374, 5951769486476825375L) - eU.d(14694, 1931039045085152210L)) / eU.d(28177, 5715181290481325144L) / 5 ^ eU.d(19279, 4756884161224126945L));
            }
            if (var4_4) ** GOTO lbl38
        }
        var6_5 /* !! */  = (reference)((eU.d(4701, 2442329239635355990L) ^ eU.d(8081, 4494563453655246581L)) + eU.d(2997, 7440130053852328088L) + eU.d(30221, 2267936168837615048L));
        ** while (true)
    }

    private Color X(Object object, float f) {
        CallSite callSite = hi.a("G", (int)eU.A("eCTG1TBSqF5Di6Wa", round(float ), (float)((float)eU.A("eCTG1TBSqF5Di6Wa", getAlpha(), (Color)((Color)object)) * f)), (int)0, (int)eU.d(28811, 9161923349768669799L), (long)1051766797435725461L);
        return new Color((int)hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L), (int)hi.a("\u00a5", (Object)((Color)object), (long)791634218836538619L), (int)hi.a("\u00a5", (Object)((Color)object), (long)505295769199362574L), (int)callSite);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void I(Object[] var1_1) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        var2_2 = var1_1[0];
                        var5_3 = var1_1[1];
                        var3_4 = ((Float)var1_1[2]).floatValue();
                        var7_5 = ((Float)var1_1[3]).floatValue();
                        var6_6 = ((Float)var1_1[4]).floatValue();
                        var4_7 = ((Float)var1_1[5]).floatValue();
                        var8_8 = Dl.S();
                        var13_9 /* !! */  = (eU.d(9547, 6776255554533154308L) / eU.d(18078, 1752533311493390321L) + eU.d(13286, 7520285332467894647L)) / eU.d(17433, 994949092392811897L) * eU.d(1028, 1349484264896888169L) + eU.d(12351, 204336767007509059L);
                        if (!var8_8) ** GOTO lbl-1000
                        switch (var13_9 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var9_10 = new ArrayList<E>(5);
                                v0 = new Object[2];
                                v0[1] = hi.a("\u00a5", (Object)((LivingEntity)var5_3), (long)669185067891207596L);
                                v0[0] = var9_10;
                                hi.a("\u00a5", (Object)this, (Object)v0, (long)1073338579211088452L);
                                v1 = new Object[2];
                                v1[1] = hi.a("\u00a5", (Object)((LivingEntity)var5_3), (Object)hi.a("j", (long)775170544810875557L), (long)442358856152524576L);
                                v1[0] = var9_10;
                                hi.a("\u00a5", (Object)this, (Object)v1, (long)1073338579211088452L);
                                v2 = new Object[2];
                                v2[1] = eU.A("eCTG1TBSqF5Di6Wa", getItemBySlot(net.minecraft.world.entity.EquipmentSlot ), (LivingEntity)((LivingEntity)var5_3), (EquipmentSlot)hi.a("j", (long)1054923417099375911L));
                                v2[0] = var9_10;
                                hi.a("\u00a5", (Object)this, (Object)v2, (long)1073338579211088452L);
                                v3 = new Object[2];
                                v3[1] = eU.A("eCTG1TBSqF5Di6Wa", getItemBySlot(net.minecraft.world.entity.EquipmentSlot ), (LivingEntity)((LivingEntity)var5_3), (EquipmentSlot)hi.a("j", (long)519683754008057371L));
                                v3[0] = var9_10;
                                hi.a("\u00a5", (Object)this, (Object)v3, (long)1073338579211088452L);
                                v4 = new Object[2];
                                v4[1] = hi.a("\u00a5", (Object)((LivingEntity)var5_3), (Object)hi.a("j", (long)1176677532982660135L), (long)442358856152524576L);
                                v4[0] = var9_10;
                                hi.a("\u00a5", (Object)this, (Object)v4, (long)1073338579211088452L);
                                v5 /* !! */  = hi.a("\u00a5", var9_10, (long)1256913436411747171L);
                                if (!var8_8) break block19;
                                if (v5 /* !! */  == false) break;
                                break block20;
                            }
                            case -808310120: {
                                hi.a("G", (long)441264294682620418L);
                                return;
                            }
                        }
                        v5 /* !! */  = (CallSite)(((hi.a("G", (int)eU.d(9352, 6749752531338944427L), (int)eU.d(15350, 5566366152722268375L), (long)834203424483934088L) ^ eU.d(22021, 1730077455133125768L)) * eU.d(24180, 5344096488040146269L) ^ eU.d(28731, 6639199548716256212L)) + eU.d(21636, 29448872958799691L));
                    }
                    var13_9 /* !! */  = (int)v5 /* !! */ ;
                    if (var8_8) break block21;
                }
                var13_9 /* !! */  = eU.d(8075, 8692801483207042787L) + eU.d(6024, 6777722572015332370L) - eU.d(26792, 6235676018128131070L) + eU.d(11820, 7706401040011744649L);
            }
            switch (var13_9 /* !! */ ) {
                default: {
                    return;
                }
                case 1518381483: {
                    var10_11 = 16.0f * var6_6;
                    var11_12 = var3_4;
                    var12_13 = 0;
                    if (var8_8) break;
                    break block22;
                }
                case 1518381484: {
                    throw null;
                }
            }
            var13_9 /* !! */  = (int)(hi.a("G", (int)eU.d(12893, 8651911793740892201L), (int)eU.d(17310, 5260658583786731992L), (long)834203424483934088L) - eU.d(8399, 3765057704828394281L) - eU.d(17573, 2619757955009527752L) + eU.d(10206, 7249413387203042419L));
            if (var8_8) ** GOTO lbl78
            ** GOTO lbl70
        }
        block12: while (true) {
            block25: {
                block24: {
                    block23: {
                        v6 = var12_13;
                        v7 /* !! */  = eU.A("eCTG1TBSqF5Di6Wa", size(), var9_10);
                        if (!var8_8) break block23;
                        if (v6 < v7 /* !! */ ) break block24;
lbl70:
                        // 2 sources

                        v6 = (eU.d(6823, 1286218109754073423L) - eU.d(29010, 1877941693935225742L) ^ eU.d(26717, 8563179056800633625L)) / eU.d(28227, 5704625830018389805L);
                        v7 /* !! */  = (CallSite)eU.d(20541, 8090319423974976318L);
                    }
                    var13_9 /* !! */  = v6 - v7 /* !! */ ;
                    if (var8_8) break block25;
                }
                var13_9 /* !! */  = (int)(hi.a("G", (int)(eU.d(9714, 8230614752607723157L) / eU.d(6900, 2157367885753737338L)), (int)eU.d(9734, 8828206458105060625L), (long)834203424483934088L) / eU.d(13477, 8186360483786772121L) - eU.d(3562, 4732382097754421031L));
                if (!var8_8) ** GOTO lbl101
            }
            block13: while (true) {
                switch (var13_9 /* !! */ ) {
                    default: {
                        continue block12;
                    }
                    case 1157034187: {
                        v8 = new Object[7];
                        v8[6] = (int)(hi.a("\u00a5", (Object)((LivingEntity)var5_3), (long)416893968063577858L) + var12_13);
                        v8[5] = Float.valueOf(var6_6);
                        v8[4] = Float.valueOf(var7_5);
                        v8[3] = Float.valueOf(var11_12);
                        v8[2] = (ItemStack)hi.a("\u00a5", var9_10, (int)var12_13, (long)516183098926246296L);
                        v8[1] = (LivingEntity)var5_3;
                        v8[0] = (GuiGraphicsExtractor)var2_2;
                        hi.a("\u00a5", (Object)this, (Object)v8, (long)496752613445855576L);
                        var11_12 += var10_11 + var4_7;
                        ++var12_13;
                        if (!var8_8) {
                            return;
                        }
                        ** GOTO lbl101
                    }
                    case 1157034186: {
                        throw null;
                    }
lbl101:
                    // 2 sources

                    var13_9 /* !! */  = (int)(eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)eU.d(1782, 1786510587217968201L), (int)eU.d(30118, 6204080998939004518L)) - eU.d(7489, 1674810373778663291L) - eU.d(27213, 1191416534698168663L) + eU.d(26230, 7047371044630830511L));
                    continue block13;
                    case 1157034185: 
                }
                break;
            }
            break;
        }
    }

    private void z(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)eU.d(18909, 7259853652278817555L), (long)673049027372087023L);
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)1045443192939327510L);
        hi.a("\u00f2", (Object)this, (float)0.0f, (long)381731491466580439L);
        hi.a("\u00f2", (Object)this, (float)-1.0f, (long)809124875620626604L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)1305837781349990202L);
        hi.a("\u00f2", (Object)this, (long)0L, (long)623597984369644287L);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)10, eU.class);
        Hidden0.special_clinit_10_140(eU.class);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private LivingEntity k(Object[] var1_1) {
        block20: {
            block23: {
                block22: {
                    block21: {
                        var2_2 = var1_1[0];
                        var3_3 = Dl.t();
                        var7_4 /* !! */  = eU.d(24183, 1260432825206744853L) * eU.d(26508, 314140392526978061L) ^ eU.d(16869, 4331933590902389601L);
                        if (var3_3) ** GOTO lbl-1000
                        switch (var7_4 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var4_5 = hi.a("G", (long)658960450018995719L);
                                cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)1243413131342024767L) - 0L;
                                v0 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (var3_3) break block21;
                                if (v0 /* !! */  != false) break;
                                break block22;
                            }
                            case -321907884: {
                                hi.a("G", (long)402106174180480612L);
                                hi.a("G", (long)703609663147646272L);
                                return null;
                            }
                        }
                        v0 /* !! */  = (reference)(eU.d(26687, 3808504439492940434L) - eU.d(642, 1155183596151503115L) - eU.d(20817, 3790857315306940990L));
                    }
                    var7_4 /* !! */  = (int)v0 /* !! */ ;
                    if (!var3_3) break block23;
                }
                var7_4 /* !! */  = (eU.d(4725, 1900175296948299878L) / eU.d(7440, 6310372715341833985L) / eU.d(26121, 7254028923093687524L) - eU.d(2603, 2313581033815535689L)) / eU.d(15062, 4981503304033255752L) ^ eU.d(14729, 4693286546465539001L);
                if (!var3_3) break block23;
                ** GOTO lbl56
lbl28:
                // 2 sources

                while (true) {
                    block25: {
                        block24: {
                            var6_6 = hi.a("G", (float)((float)(var4_5 - hi.a("\u00e9", (Object)this, (long)1243413131342024767L)) / 300.0f), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                            hi.a("\u00f2", (Object)this, (long)var4_5, (long)1243413131342024767L);
                            if (var3_3) break block24;
                            if ((LivingEntity)var2_2 != null) break block25;
                            var7_4 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)eU.d(20352, 3687068299348980819L), (int)eU.d(27055, 6625375240724058823L), (long)834203424483934088L), (int)eU.d(4654, 4300943988355164624L), (long)834203424483934088L) / eU.d(6158, 9098600574621639221L) + eU.d(18698, 1765382508818510501L));
                        }
                        if (!var3_3) break block20;
                    }
                    var7_4 /* !! */  = (eU.d(26267, 2455539033418996910L) ^ eU.d(13582, 6586271919572012902L)) + eU.d(16342, 4167987526371820901L) + eU.d(28246, 1098277730172048491L) ^ eU.d(10821, 7453534021871259932L);
                    if (!var3_3) break block20;
                    ** GOTO lbl83
                    break;
                }
lbl40:
                // 2 sources

                while (true) {
                    hi.a("\u00f2", (Object)this, null, (long)1163995629683877408L);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)906190289332042917L);
                    return null;
                }
            }
            while (true) {
                switch (var7_4 /* !! */ ) {
                    default: {
                        hi.a("\u00f2", (Object)this, (long)var4_5, (long)1243413131342024767L);
                        if (!var3_3) break;
                        ** GOTO lbl28
                    }
                    case -2079302483: {
                        ** continue;
                    }
                    case -2079302484: {
                        eU.A("eCTG1TBSqF5Di6Wa", P());
                        return null;
                    }
                }
lbl56:
                // 2 sources

                var7_4 /* !! */  = eU.d(26815, 3030803981565432653L) - eU.d(16527, 5249136870280903362L) - eU.d(27239, 8750008573714042906L);
            }
        }
        block18: while (true) {
            switch (var7_4 /* !! */ ) {
                default: {
                    hi.a("\u00f2", (Object)this, (LivingEntity)((LivingEntity)var2_2), (long)1163995629683877408L);
                    hi.a("\u00f2", (Object)this, (float)eU.A("eCTG1TBSqF5Di6Wa", min(float float ), (float)1.0f, (float)(hi.a("\u00e9", (Object)this, (long)390948447503963330L) + var6_6)), (long)390948447503963330L);
                    return hi.a("\u00e9", (Object)this, (long)1163995629683877408L);
                }
                case 1993329097: {
                    if (hi.a("\u00e9", (Object)this, (long)1163995629683877408L) != null) ** GOTO lbl83
                    ** GOTO lbl85
                }
                case 1993329098: {
                    hi.a("\u00f2", (Object)this, (float)0.0f, (long)390948447503963330L);
                    return null;
                }
                case 1993329099: {
                    hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)0.0f, (float)(hi.a("\u00e9", (Object)this, (long)390948447503963330L) - var6_6), (long)1021203527991582354L), (long)390948447503963330L);
                    cfr_temp_1 = hi.a("\u00e9", (Object)this, (long)390948447503963330L) - 0.01f;
                    v1 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                    if (var3_3) ** GOTO lbl88
                    if (v1 > 0) ** GOTO lbl87
                    ** GOTO lbl90
                }
                case 1993329101: {
                    eU.A("eCTG1TBSqF5Di6Wa", e());
                    ** GOTO lbl40
                }
                case 1993329102: {
                    ** continue;
                }
lbl83:
                // 2 sources

                var7_4 /* !! */  = (eU.A("eCTG1TBSqF5Di6Wa", max(int int ), (int)eU.d(21710, 7252491237525729211L), (int)eU.d(26648, 7981558245477651186L)) ^ eU.d(20283, 6593818902789502129L)) * eU.d(19492, 6123384251847947838L) + eU.d(29756, 6114117699439267593L);
                if (!var3_3) continue block18;
lbl85:
                // 2 sources

                var7_4 /* !! */  = (eU.d(16371, 3596914004594247073L) - eU.d(8368, 6607059478986218159L)) / eU.d(6158, 9098600574621639221L) * eU.d(25009, 6367270046878898849L) + eU.d(14755, 7396205755736867720L);
                if (!var3_3) continue block18;
lbl87:
                // 2 sources

                v1 = hi.a("G", (int)(hi.a("G", (int)(eU.d(15711, 7073412526372177436L) * eU.d(2927, 4553230597504135434L)), (int)eU.d(30625, 2385546698352757769L), (long)834203424483934088L) + eU.d(8696, 6498493604455275296L)), (int)eU.d(31253, 6593894993022550365L), (long)834203424483934088L) + eU.d(27088, 8033877736804749864L);
lbl88:
                // 2 sources

                var7_4 /* !! */  = (int)v1;
                if (!var3_3) continue block18;
lbl90:
                // 2 sources

                var7_4 /* !! */  = (eU.d(8558, 8413420470120143774L) - eU.d(24700, 5152487728203012806L) - eU.d(10407, 7083832399026705086L) + eU.d(6360, 1078047967646966383L)) / eU.d(25136, 9152305825981438256L) + eU.d(30690, 3067979500727668037L);
                continue block18;
                case 1993329096: 
            }
            break;
        }
        return hi.a("\u00e9", (Object)this, (long)1163995629683877408L);
    }

    private Color c(Object object, float f) {
        CallSite callSite = hi.a("G", (int)hi.a("G", (float)(255.0f - 155.0f * f), (long)400355798406630015L), (int)eU.d(18069, 2680665249362492704L), (int)eU.d(22030, 5422821076131491036L), (long)1051766797435725461L);
        CallSite callSite2 = hi.a("G", (int)hi.a("G", (float)((float)hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L) + (float)(eU.d(28811, 9161923349768669799L) - hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L)) * f), (long)400355798406630015L), (int)0, (int)eU.d(28811, 9161923349768669799L), (long)1051766797435725461L);
        CallSite callSite3 = hi.a("G", (int)hi.a("G", (float)((float)(hi.a("\u00a5", (Object)((Color)object), (long)791634218836538619L) * callSite) / 255.0f), (long)400355798406630015L), (int)0, (int)eU.d(28811, 9161923349768669799L), (long)1051766797435725461L);
        CallSite callSite4 = hi.a("G", (int)hi.a("G", (float)((float)(hi.a("\u00a5", (Object)((Color)object), (long)505295769199362574L) * callSite) / 255.0f), (long)400355798406630015L), (int)0, (int)eU.d(28811, 9161923349768669799L), (long)1051766797435725461L);
        return new Color((int)callSite2, (int)callSite3, (int)callSite4, (int)hi.a("\u00a5", (Object)((Color)object), (long)999912139159319168L));
    }

    /*
     * Exception decompiling
     */
    private void W(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x54BE) & 0xFFFF;
        if (eb[n3] == null) {
            int n4;
            char[] cArray = db[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 132;
                case 1 -> 2;
                case 2 -> 208;
                case 3 -> 191;
                case 4 -> 158;
                case 5 -> 8;
                case 6 -> 157;
                case 7 -> 183;
                case 8 -> 88;
                case 9 -> 44;
                case 10 -> 211;
                case 11 -> 100;
                case 12 -> 9;
                case 13 -> 204;
                case 14 -> 185;
                case 15 -> 77;
                case 16 -> 189;
                case 17 -> 65;
                case 18 -> 181;
                case 19 -> 127;
                case 20 -> 176;
                case 21 -> 177;
                case 22 -> 227;
                case 23 -> 82;
                case 24 -> 16;
                case 25 -> 11;
                case 26 -> 12;
                case 27 -> 122;
                case 28 -> 154;
                case 29 -> 71;
                case 30 -> 149;
                case 31 -> 61;
                case 32 -> 201;
                case 33 -> 43;
                case 34 -> 244;
                case 35 -> 151;
                case 36 -> 120;
                case 37 -> 91;
                case 38 -> 94;
                case 39 -> 207;
                case 40 -> 106;
                case 41 -> 17;
                case 42 -> 4;
                case 43 -> 187;
                case 44 -> 197;
                case 45 -> 57;
                case 46 -> 14;
                case 47 -> 33;
                case 48 -> 224;
                case 49 -> 119;
                case 50 -> 160;
                case 51 -> 83;
                case 52 -> 69;
                case 53 -> 5;
                case 54 -> 140;
                case 55 -> 3;
                case 56 -> 21;
                case 57 -> 188;
                case 58 -> 40;
                case 59 -> 210;
                case 60 -> 150;
                case 61 -> 10;
                case 62 -> 200;
                case 63 -> 193;
                case 64 -> 213;
                case 65 -> 172;
                case 66 -> 218;
                case 67 -> 184;
                case 68 -> 116;
                case 69 -> 70;
                case 70 -> 6;
                case 71 -> 153;
                case 72 -> 86;
                case 73 -> 212;
                case 74 -> 170;
                case 75 -> 134;
                case 76 -> 216;
                case 77 -> 165;
                case 78 -> 114;
                case 79 -> 245;
                case 80 -> 145;
                case 81 -> 226;
                case 82 -> 97;
                case 83 -> 179;
                case 84 -> 115;
                case 85 -> 190;
                case 86 -> 50;
                case 87 -> 75;
                case 88 -> 64;
                case 89 -> 35;
                case 90 -> 123;
                case 91 -> 56;
                case 92 -> 129;
                case 93 -> 241;
                case 94 -> 243;
                case 95 -> 128;
                case 96 -> 34;
                case 97 -> 233;
                case 98 -> 52;
                case 99 -> 55;
                case 100 -> 23;
                case 101 -> 240;
                case 102 -> 223;
                case 103 -> 222;
                case 104 -> 109;
                case 105 -> 217;
                case 106 -> 130;
                case 107 -> 31;
                case 108 -> 203;
                case 109 -> 239;
                case 110 -> 105;
                case 111 -> 235;
                case 112 -> 234;
                case 113 -> 242;
                case 114 -> 124;
                case 115 -> 60;
                case 116 -> 93;
                case 117 -> 254;
                case 118 -> 238;
                case 119 -> 78;
                case 120 -> 232;
                case 121 -> 22;
                case 122 -> 155;
                case 123 -> 53;
                case 124 -> 133;
                case 125 -> 195;
                case 126 -> 169;
                case 127 -> 39;
                case 128 -> 147;
                case 129 -> 173;
                case 130 -> 205;
                case 131 -> 111;
                case 132 -> 186;
                case 133 -> 248;
                case 134 -> 7;
                case 135 -> 80;
                case 136 -> 45;
                case 137 -> 209;
                case 138 -> 1;
                case 139 -> 20;
                case 140 -> 107;
                case 141 -> 62;
                case 142 -> 228;
                case 143 -> 37;
                case 144 -> 32;
                case 145 -> 66;
                case 146 -> 68;
                case 147 -> 72;
                case 148 -> 98;
                case 149 -> 142;
                case 150 -> 206;
                case 151 -> 180;
                case 152 -> 225;
                case 153 -> 90;
                case 154 -> 13;
                case 155 -> 58;
                case 156 -> 252;
                case 157 -> 63;
                case 158 -> 249;
                case 159 -> 28;
                case 160 -> 89;
                case 161 -> 108;
                case 162 -> 25;
                case 163 -> 253;
                case 164 -> 30;
                case 165 -> 156;
                case 166 -> 174;
                case 167 -> 230;
                case 168 -> 246;
                case 169 -> 251;
                case 170 -> 175;
                case 171 -> 131;
                case 172 -> 161;
                case 173 -> 221;
                case 174 -> 148;
                case 175 -> 74;
                case 176 -> 164;
                case 177 -> 51;
                case 178 -> 38;
                case 179 -> 36;
                case 180 -> 79;
                case 181 -> 81;
                case 182 -> 231;
                case 183 -> 229;
                case 184 -> 104;
                case 185 -> 110;
                case 186 -> 49;
                case 187 -> 46;
                case 188 -> 182;
                case 189 -> 87;
                case 190 -> 15;
                case 191 -> 137;
                case 192 -> 85;
                case 193 -> 84;
                case 194 -> 166;
                case 195 -> 214;
                case 196 -> 144;
                case 197 -> 18;
                case 198 -> 152;
                case 199 -> 194;
                case 200 -> 196;
                case 201 -> 168;
                case 202 -> 162;
                case 203 -> 159;
                case 204 -> 192;
                case 205 -> 139;
                case 206 -> 96;
                case 207 -> 113;
                case 208 -> 41;
                case 209 -> 19;
                case 210 -> 27;
                case 211 -> 26;
                case 212 -> 48;
                case 213 -> 163;
                case 214 -> 92;
                case 215 -> 202;
                case 216 -> 121;
                case 217 -> 250;
                case 218 -> 125;
                case 219 -> 117;
                case 220 -> 236;
                case 221 -> 135;
                case 222 -> 67;
                case 223 -> 102;
                case 224 -> 76;
                case 225 -> 143;
                case 226 -> 167;
                case 227 -> 215;
                case 228 -> 146;
                case 229 -> 99;
                case 230 -> 42;
                case 231 -> 255;
                case 232 -> 47;
                case 233 -> 118;
                case 234 -> 171;
                case 235 -> 198;
                case 236 -> 199;
                case 237 -> 24;
                case 238 -> 59;
                case 239 -> 101;
                case 240 -> 138;
                case 241 -> 29;
                case 242 -> 103;
                case 243 -> 219;
                case 244 -> 247;
                case 245 -> 112;
                case 246 -> 126;
                case 247 -> 95;
                case 248 -> 136;
                case 249 -> 54;
                case 250 -> 178;
                case 251 -> 0;
                case 252 -> 73;
                case 253 -> 141;
                case 254 -> 220;
                default -> 237;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                char[] cArray2 = cArray;
                char c = cArray[n10];
                if (n9 == 0) {
                    cArray2[n10] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                } else {
                    cArray2[n10] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n8]) & 0xFF;
                }
                ++n8;
            }
            eU.eb[n3] = new String(cArray).intern();
        }
        return eb[n3];
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B78;
        if (mb[n2] == null) {
            eU.mb[n2] = (int)(lb[n2] ^ l);
        }
        return mb[n2];
    }

    private static long e(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x103C) & Short.MAX_VALUE;
        if (ob[n2] == null) {
            eU.ob[n2] = nb[n2] ^ l;
        }
        return ob[n2];
    }
}
