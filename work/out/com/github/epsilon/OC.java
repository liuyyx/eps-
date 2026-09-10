/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._j;
import com.github.epsilon.hi;
import com.github.epsilon.l5;
import com.github.epsilon.vx;
import com.github.epsilon.zP;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class OC
extends Record {
    private final zP w5;
    private final _j JP;
    private final l5 d0;
    private final vx cY;

    public vx cY() {
        return hi.a("\u00e9", (Object)this, (long)998666763708756633L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{OC.class, "w5;JP;cY;d0", "w5", "JP", "cY", "d0"}, this);
    }

    public zP w5() {
        return hi.a("\u00e9", (Object)this, (long)383563725775890716L);
    }

    private OC(Object object, Object object2, Object object3, Object object4) {
        this.w5 = (zP)object;
        this.JP = (_j)object2;
        this.cY = (vx)object3;
        this.d0 = (l5)object4;
    }

    private static OC R(vx vx2) {
        return new OC(hi.a("\u00a5", (Object)vx2, (Object)new Object[0], (long)668786376310993130L), hi.a("\u00a5", (Object)vx2, (long)1069982846687233763L), vx2, hi.a("\u00a5", (Object)vx2, (Object)new Object[0], (long)727673419329972500L));
    }

    public _j JP() {
        return hi.a("\u00e9", (Object)this, (long)979978624465875577L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{OC.class, "w5;JP;cY;d0", "w5", "JP", "cY", "d0"}, this, object);
    }

    public l5 d0() {
        return hi.a("\u00e9", (Object)this, (long)537435489430262891L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{OC.class, "w5;JP;cY;d0", "w5", "JP", "cY", "d0"}, this);
    }

    private static OC Y(zP zP2, _j _j2, vx vx2, l5 l52) {
        return new OC(zP2, _j2, vx2, l52);
    }
}
