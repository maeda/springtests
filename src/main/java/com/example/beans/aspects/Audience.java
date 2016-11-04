package com.example.beans.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

    @Pointcut("execution(** com.example.beans.aspects.Performance.perform(..))")
    public void performance(){}

//    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

//    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

//    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

//    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try{
            silenceCellPhones();
            takeSeats();
            jp.proceed();
            applause();
        } catch (Throwable e) {
            demandRefund();
        }
    }

}
