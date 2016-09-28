package com.example.beans.autowired;

import com.example.beans.AbstractConfigurationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class PrimaryDessertTest extends AbstractConfigurationTest {

    @Autowired
    private Dessert dessert;

    @Test
    public void testDessertType() {
        assertEquals(IceCream.class.getSimpleName(), dessert.name());
    }

}