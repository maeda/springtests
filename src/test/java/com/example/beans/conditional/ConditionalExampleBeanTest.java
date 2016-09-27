package com.example.beans.conditional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConditionalExampleBean.class)
public class ConditionalExampleBeanTest {

    @Autowired
    private ConditionalExampleBean bean;

    @Test
    public void testConditionalBean() {
        assertNotNull(bean);
    }

}