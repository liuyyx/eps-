/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.network.protocol.game.ServerboundContainerClickPacket
 *  net.minecraft.network.protocol.game.ServerboundContainerClosePacket
 *  net.minecraft.network.protocol.game.ServerboundPlayerInputPacket
 *  net.minecraft.world.entity.player.Input
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.dQ;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.network.protocol.game.ServerboundContainerClickPacket;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.network.protocol.game.ServerboundPlayerInputPacket;
import net.minecraft.world.entity.player.Input;

public class x
extends e {
    private boolean n;
    public static final x X;
    private Input M;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    static {
        IlilIlIlil.registerNativesForClass((int)30, x.class);
        Hidden0.special_clinit_30_00(x.class);
    }

    public static /* bridge */ /* synthetic */ CallSite F(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private x() {
        super(a, (vY)((Object)hi.a("j", (long)526176563220736169L)));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void k(Object[] objectArray) {
        boolean bl = Dl.t();
        int n = (x.c(17282, 7628432483619878203L) ^ x.c(10072, 4246468746468708854L) ^ x.c(27565, 8660762643215457559L)) - x.c(32325, 2275611622134483165L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && !bl) break block8;
                        Object object2 = hi.a("\u00e9", (Object)this, (long)556512512893774593L);
                        if (bl) break block9;
                        if (object2 == false) break block10;
                        object2 = object = (Object)(x.c(2038, 3287350521643168095L) + x.c(24138, 756350400040872149L) + x.c(22732, 817495480922812024L));
                    }
                    if (!bl) break block8;
                }
                object = x.c(11422, 365586624763812411L) * x.c(13948, 6867434901083209923L) + x.c(767, 6436290192904975470L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case 903509243: {
                    return;
                }
                case 903509241: {
                    hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)959566543608578921L), (Input)hi.a("\u00e9", (Object)this, (long)1290792428755754254L), (long)662593254462645476L);
                    hi.a("\u00f2", (Object)this, null, (long)1290792428755754254L);
                    hi.a("\u00f2", (Object)this, (boolean)false, (long)556512512893774593L);
                    return;
                }
                case 903509242: 
            }
            break;
        }
        hi.a("G", (long)767645364166240833L);
        hi.a("G", (long)1134434820933353061L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void r(dQ var1_1) {
        block12: {
            var2_2 = Dl.S();
            var4_3 /* !! */  = (x.c(15982, 7230876276886194427L) * x.c(23859, 5693397211113565107L) - x.c(15703, 8917136599791619028L)) * x.c(5793, 3207660680829919261L) ^ x.c(7758, 7432947490678991050L);
            if (var2_2) break block12;
lbl4:
            // 2 sources

            while (true) {
                var3_4 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L);
                v0 /* !! */  = var3_4 instanceof ServerboundContainerClickPacket;
                if (!var2_2) ** GOTO lbl47
                if (v0 /* !! */  != 0) ** GOTO lbl46
                if (true) ** GOTO lbl48
                break;
            }
        }
        while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1391692379: 
            }
            x.F("VVEsyw3OYSarys6k", s(boolean ), (boolean)false);
            hi.a("G", (long)1255795479521008361L);
            var4_3 /* !! */  = x.c(5026, 4360117751419266366L) / x.c(24770, 5309836799561438819L) + x.c(19312, 6183413417857924586L) ^ x.c(16597, 4719462401291105885L);
        }
        block10: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    v1 = var3_4 instanceof ServerboundContainerClosePacket;
                    if (!var2_2) ** GOTO lbl51
                    if (v1 == 0) ** GOTO lbl50
                    ** GOTO lbl52
                }
                case -215859894: {
                    hi.a("\u00a5", (Object)var1_1, (long)1159641526413061244L);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)891050026241140333L);
                    hi.a("G", (Object)var3_4, (long)862951805677234099L);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)423356828849803983L);
                    if (!var2_2) {
                        return;
                    }
                    ** GOTO lbl54
                }
                case -215859892: {
                    hi.a("G", (long)941950898065809316L);
                    hi.a("G", (long)1327200575414382593L);
                    var4_3 /* !! */  = x.c(22904, 5792897768601333745L) - x.c(18814, 857983441427349451L) + x.c(22147, 1493283823743442959L);
                    if (var2_2) continue block10;
lbl46:
                    // 2 sources

                    v0 /* !! */  = var4_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)x.c(16898, 7055942092066698371L), (int)x.c(232, 5393018788010227295L), (long)834203424483934088L), (int)x.c(15325, 4029208227746696555L), (long)834203424483934088L) - x.c(18170, 5425408383269711962L) - x.c(132, 4458574148264457762L));
lbl47:
                    // 2 sources

                    if (var2_2) continue block10;
lbl48:
                    // 2 sources

                    var4_3 /* !! */  = ((x.c(31742, 5058744026405440845L) + x.c(17131, 6905536328134243399L)) / x.c(18432, 8418723495477067405L) + x.c(8965, 7602610107251316114L)) / x.c(2544, 5590785364010696535L) - x.c(29738, 6803160918966764160L);
                    if (var2_2) continue block10;
lbl50:
                    // 2 sources

                    v1 = var4_3 /* !! */  = hi.a("G", (int)(x.c(25201, 3820961646928696540L) - x.c(20624, 498349985867408909L)), (int)x.c(20535, 2957751409403864752L), (long)834203424483934088L) + x.c(7858, 5570883405344335889L) ^ x.c(27714, 863091002845633243L);
lbl51:
                    // 2 sources

                    if (var2_2) continue block10;
lbl52:
                    // 2 sources

                    var4_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)x.c(28528, 6056386329427057096L), (int)x.c(21937, 7775112892947145523L), (long)834203424483934088L), (int)x.c(4361, 7817431622108702595L), (long)834203424483934088L) - x.c(16993, 7998718062593160435L) - x.c(23654, 6830820680727079669L));
                    if (var2_2) continue block10;
lbl54:
                    // 2 sources

                    var4_3 /* !! */  = hi.a("G", (int)(x.c(23875, 6983572197262994408L) - x.c(5423, 5263991818454393761L)), (int)x.c(6109, 8467993447440310614L), (long)834203424483934088L) + x.c(32721, 2240097434492602730L) ^ x.c(31165, 6075535740463386411L);
                    continue block10;
                }
                case -215859893: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void n(Object[] var1_1) {
        block9: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = (x.c(6786, 1725906613233839142L) ^ x.c(12139, 6850400327763155396L)) - x.c(342, 1375933460407187428L);
            if (!var2_2) break block9;
lbl5:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)556512512893774593L);
                if (var2_2) ** GOTO lbl35
                if (v0 /* !! */  == false) ** GOTO lbl34
                ** GOTO lbl37
                break;
            }
lbl10:
            // 1 sources

            return;
lbl12:
            // 1 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (Input)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)959566543608578921L), (long)662593254462645476L), (long)1290792428755754254L);
                hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)959566543608578921L), (Input)hi.a("j", (long)752285069541530699L), (long)662593254462645476L);
                hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (Object)new ServerboundPlayerInputPacket((Input)hi.a("j", (long)752285069541530699L)), (long)367302555785540234L);
                hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Input)hi.a("j", (long)752285069541530699L), (long)401083118936917402L);
                hi.a("\u00f2", (Object)this, (boolean)true, (long)556512512893774593L);
                return;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1123966647: {
                    ** continue;
                }
                case -1123966646: {
                    ** continue;
                }
                case -1123966645: 
            }
            hi.a("G", (long)355962802566144244L);
            var3_3 /* !! */  = x.c(32109, 1047647792844147702L) * x.c(23774, 4444710629366737504L) ^ x.c(7881, 3578717449552619627L);
            if (!var2_2) continue;
lbl34:
            // 2 sources

            v0 /* !! */  = (CallSite)(((x.c(30349, 8792350529485799461L) - x.c(15121, 1285875535767195052L)) / 5 ^ x.c(15040, 2202838977802914929L)) / x.c(1973, 307342465127575866L) + x.c(19942, 3706415441406737272L));
lbl35:
            // 2 sources

            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (!var2_2) continue;
lbl37:
            // 2 sources

            var3_3 /* !! */  = x.c(565, 6824044358083933349L) - x.c(27239, 2957925380093975767L) - x.c(11345, 1750496263619959508L) - x.c(29913, 4698270028332859981L);
        }
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x76B9;
        if (c[n2] == null) {
            x.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
