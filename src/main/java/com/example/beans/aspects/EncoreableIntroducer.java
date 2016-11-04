package com.example.beans.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value="com.example.beans.aspects.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
