package com.example.beans.autowired;

import com.example.beans.AbstractConfigurationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class CustomQualifierDessertTest extends AbstractConfigurationTest {

    @Autowired
    @Crispy
    @Cold
    private Dessert desert;

    @Test
    public void testCustomQualifier() {
        assertEquals(Cake.class.getSimpleName(), desert.name());
    }
}
