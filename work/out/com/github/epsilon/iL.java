/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 */
package com.github.epsilon;

import com.github.epsilon.D7;
import com.github.epsilon.d2;
import com.github.epsilon.hi;
import com.github.epsilon.iR;
import com.github.epsilon.nq;
import com.github.epsilon.u5;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.minecraft.core.BlockPos;

final class iL
extends Record {
    private final long t4;
    private final d2 ko;
    private final D7 nn;
    private final List<nq> fn;
    private final List<iR> fT;
    private final u5 qw;
    private final long t5;
    private static final iL N;
    private final List<BlockPos> fu;

    public List<iR> fT() {
        return hi.a("\u00e9", (Object)this, (long)1030009232339056572L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = 5735350169707058664L;
        long l2 = 0xB067F16868226A17L ^ l;
        N = new iL(l2, null, null, (List<iR>)((Object)hi.a("G", (long)1104179098836104202L)), (List<BlockPos>)((Object)hi.a("G", (long)1104179098836104202L)), (List<nq>)((Object)hi.a("G", (long)1104179098836104202L)), (d2)((Object)hi.a("j", (long)1091535588108520888L)), 0L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iL.class, "t4;nn;qw;fT;fu;fn;ko;t5", "t4", "nn", "qw", "fT", "fu", "fn", "ko", "t5"}, this, object);
    }

    public D7 Nn() {
        return hi.a("\u00e9", (Object)this, (long)1039809087223762318L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iL.class, "t4;nn;qw;fT;fu;fn;ko;t5", "t4", "nn", "qw", "fT", "fu", "fn", "ko", "t5"}, this);
    }

    public u5 Qw() {
        return hi.a("\u00e9", (Object)this, (long)993759256721480321L);
    }

    public List<nq> fn() {
        return hi.a("\u00e9", (Object)this, (long)1240763601744921841L);
    }

    public d2 ko() {
        return hi.a("\u00e9", (Object)this, (long)580027503043699739L);
    }

    public List<BlockPos> fu() {
        return hi.a("\u00e9", (Object)this, (long)898555268358005245L);
    }

    public long T5() {
        return (long)hi.a("\u00e9", (Object)this, (long)854254962228104285L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iL.class, "t4;nn;qw;fT;fu;fn;ko;t5", "t4", "nn", "qw", "fT", "fu", "fn", "ko", "t5"}, this);
    }

    private iL(long l, D7 d7, u5 u52, List<iR> list, List<BlockPos> list2, List<nq> list3, d2 d22, long l2) {
        this.t4 = l;
        this.nn = d7;
        this.qw = u52;
        this.fT = list;
        this.fu = list2;
        this.fn = list3;
        this.ko = d22;
        this.t5 = l2;
    }

    public long T4() {
        return (long)hi.a("\u00e9", (Object)this, (long)786435312696382588L);
    }
}
