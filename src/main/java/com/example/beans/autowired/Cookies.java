package com.example.beans.autowired;

import org.springframework.stereotype.Component;

@Component
@Crispy
public class Cookies implements Dessert {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
