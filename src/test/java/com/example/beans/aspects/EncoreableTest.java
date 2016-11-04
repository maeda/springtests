package com.example.beans.aspects;

import com.example.beans.AbstractConfigurationTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.beans.factory.annotation.Autowired;

public class EncoreableTest extends AbstractConfigurationTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private Performance performance;

    @Test
    public void test(){
        Encoreable e = (Encoreable) performance;
        e.performEncore();
    }
}
