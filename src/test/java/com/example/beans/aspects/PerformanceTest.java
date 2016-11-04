package com.example.beans.aspects;

import com.example.beans.AbstractConfigurationTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

public class PerformanceTest extends AbstractConfigurationTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private Performance performance;

    @Test
    public void testPointcuts() {
        performance.perform();
        String log = systemOutRule.getLog();
        assertTrue(log.contains("Silencing cell phones\nTaking seats\nPerforming...\nCLAP CLAP CLAP!!!"));
    }

}