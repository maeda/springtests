package com.example.beans.lifecycle;

import com.example.beans.AbstractConfigurationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class LifecycleExampleBeanTest extends AbstractConfigurationTest {

    @Autowired
    private LifecycleExampleBean bean;

    @Test
    public void lifecycleTest() {
        assertNotNull(bean);
    }

}