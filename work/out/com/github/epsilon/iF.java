/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.vz;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

class iF
extends SimpleFileVisitor<Path> {
    public FileVisitResult X(Object[] objectArray) throws IOException {
        Path path = (Path)objectArray[0];
        BasicFileAttributes basicFileAttributes = (BasicFileAttributes)objectArray[1];
        hi.a("G", (Object)path, (long)865639157085003214L);
        return hi.a("j", (long)398111437174590526L);
    }

    public FileVisitResult o(Object[] objectArray) throws IOException {
        Path path = (Path)objectArray[0];
        IOException iOException = (IOException)objectArray[1];
        hi.a("G", (Object)path, (long)865639157085003214L);
        return hi.a("j", (long)398111437174590526L);
    }

    iF(vz vz2) {
        Objects.requireNonNull(vz2);
    }
}
