package com.example.beans.runtimevalueinjection;


import com.example.beans.AbstractConfigurationTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

public class ValueInjectionBeanTest extends AbstractConfigurationTest {

    private static final String MY_PROPERTY = "my incredible property";

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("my.property", MY_PROPERTY);
    }

    @Autowired
    private ValueInjectionBean bean;

    @Test
    public void environmentTest() {
        assertTrue(!"".equals(bean.getEnv().getProperty("java.vendor")));
    }

    @Test
    public void propertyPlaceholderTest() {
        assertTrue(MY_PROPERTY.equals(bean.getMyProperty()));
    }

    @Test
    public void getCurrentTimeMillisFromSpringEL() {
        assertTrue(bean.getCurrentTimeMillis() > 0);
    }

    @Test
    public void getCurrentTimeMillisFromSpringELFromBean() {
        System.out.println(bean.getCurrentTimeMillisFromSpEL());
    }

}