package com.example.beans.autowired;

import org.springframework.stereotype.Component;

@Component
@Cold
@Fruity
public class Popsicle implements Dessert{
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
