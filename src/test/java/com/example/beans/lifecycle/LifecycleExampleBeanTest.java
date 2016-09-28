package com.example.beans.lifecycle;

import com.example.SpringTestsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringTestsConfiguration.class)
public class LifecycleExampleBeanTest {

    @Autowired
    private LifecycleExampleBean bean;

    @Test
    public void lifecycleTest() {
        assertNotNull(bean);
    }

}