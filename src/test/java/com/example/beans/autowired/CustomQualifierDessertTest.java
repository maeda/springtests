package com.example.beans.autowired;

import com.example.SpringTestsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringTestsConfiguration.class)
public class CustomQualifierDessertTest {

    @Autowired
    @Cold
    @Creamy
    private Dessert desert;

    @Test
    public void testCustomQualifier() {
        assertEquals(IceCream.class.getSimpleName(), desert.name());
    }
}
