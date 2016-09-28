package com.example.beans.conditional;

import com.example.beans.AbstractConfigurationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class ConditionalExampleBeanTest extends AbstractConfigurationTest {

    @Autowired
    private ConditionalExampleBean bean;

    @Test
    public void testConditionalBean() {
        assertNotNull(bean);
    }

}