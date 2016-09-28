package com.example.beans.autowired;

import org.springframework.stereotype.Component;

@Component
@Crispy
@Cold
public class Cake implements Dessert{
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
