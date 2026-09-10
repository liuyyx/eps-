/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.inventory.ContainerInput
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import net.minecraft.world.inventory.ContainerInput;

public class ir {
    private static String[] U;

    public static void c(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        ContainerInput containerInput = (ContainerInput)objectArray[3];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)395593892412342457L), (int)n, (int)n2, (int)n3, (Object)containerInput, (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)752330954666826462L);
    }

    public static void J(int n) {
        Object[] objectArray = new Object[3];
        objectArray[2] = hi.a("j", (long)561945042800112720L);
        objectArray[1] = 0;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)526710312164041209L);
    }

    public static void i(int n) {
        Object[] objectArray = new Object[3];
        objectArray[2] = hi.a("j", (long)369027023869662260L);
        objectArray[1] = 0;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)526710312164041209L);
    }

    public static void Y(int n) {
        Object[] objectArray = new Object[3];
        objectArray[2] = hi.a("j", (long)369027023869662260L);
        objectArray[1] = 1;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)526710312164041209L);
    }

    public static void E(int n, int n2, int n3) {
        Object[] objectArray = new Object[4];
        objectArray[3] = hi.a("j", (long)939699683316897504L);
        objectArray[2] = n3;
        objectArray[1] = n2;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)929026160556835444L);
    }

    public static void H(int n) {
        Object[] objectArray = new Object[3];
        objectArray[2] = hi.a("j", (long)536132043132099800L);
        objectArray[1] = 0;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)526710312164041209L);
    }

    public static void m(int n, int n2) {
        Object[] objectArray = new Object[4];
        objectArray[3] = hi.a("j", (long)369027023869662260L);
        objectArray[2] = 1;
        objectArray[1] = n2;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)929026160556835444L);
    }

    public static void t(int n, int n2) {
        Object[] objectArray = new Object[3];
        objectArray[2] = hi.a("j", (long)939699683316897504L);
        objectArray[1] = n2;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)526710312164041209L);
    }

    public static void N(int n, int n2) {
        Object[] objectArray = new Object[4];
        objectArray[3] = hi.a("j", (long)536132043132099800L);
        objectArray[2] = 0;
        objectArray[1] = n2;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)929026160556835444L);
    }

    public static void q(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        ContainerInput containerInput = (ContainerInput)objectArray[2];
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = containerInput;
        objectArray2[2] = n2;
        objectArray2[1] = n;
        objectArray2[0] = (int)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1223784520533413643L), (long)836509641775052142L);
        hi.a("G", (Object)objectArray2, (long)929026160556835444L);
    }

    public static void c(int n, int n2) {
        Object[] objectArray = new Object[4];
        objectArray[3] = hi.a("j", (long)369027023869662260L);
        objectArray[2] = 0;
        objectArray[1] = n2;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)929026160556835444L);
    }

    public static void K(int n, int n2) {
        Object[] objectArray = new Object[4];
        objectArray[3] = hi.a("j", (long)561945042800112720L);
        objectArray[2] = 0;
        objectArray[1] = n2;
        objectArray[0] = n;
        hi.a("G", (Object)objectArray, (long)929026160556835444L);
    }

    public static void j(String[] stringArray) {
        U = stringArray;
    }

    public static String[] V() {
        return U;
    }

    static {
        if (ir.V() != null) {
            ir.j(new String[4]);
        }
    }
}
