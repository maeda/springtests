package com.example.beans.autowired;

import com.example.beans.AbstractConfigurationTest;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

public class PrimaryDessertTest extends AbstractConfigurationTest {

    @Inject
    private Dessert dessert;

    @Test
    public void testDessertType() {
        assertEquals(IceCream.class.getSimpleName(), dessert.name());
    }

}