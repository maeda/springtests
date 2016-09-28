package com.example.beans.autowired;

import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
