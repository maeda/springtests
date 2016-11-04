package com.example.beans.aspects;

public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("perform encore");
    }
}
