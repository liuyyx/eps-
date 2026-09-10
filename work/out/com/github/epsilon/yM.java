/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Od;
import com.github.epsilon.XL;
import com.github.epsilon.Xu;
import com.github.epsilon.d7;
import com.github.epsilon.ds;
import com.github.epsilon.gU;
import com.github.epsilon.gj;
import com.github.epsilon.hi;
import com.github.epsilon.nt;
import com.github.epsilon.u6;
import com.github.epsilon.v1;
import com.github.epsilon.v3;
import com.github.epsilon.vA;
import com.github.epsilon.ve;
import com.github.epsilon.y3;
import com.github.epsilon.yX;

sealed interface yM
permits vA, gU, ve, yX, Od, v1, u6, d7, ds, v3, gj, nt {
    public XL bounds();

    public y3 a();

    public int layer();

    public Xu scissor();

    default public XL g() {
        return hi.a("\u00a5", (Object)this, (long)625447055057376053L);
    }

    public long sequence();
}
