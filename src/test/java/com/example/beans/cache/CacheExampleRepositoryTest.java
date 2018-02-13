package com.example.beans.cache;

import com.example.beans.AbstractConfigurationTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class CacheExampleRepositoryTest extends AbstractConfigurationTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private CacheExampleRepository repository;

    @Autowired
    private CacheManager cacheManager;

    @Before
    public void setup() {
        repository.save(new CacheExampleEntity(null, "My Cache Entry"));
    }

    @After
    public void teardown() {
        repository.removeAll();
    }

    @Test
    public void testPutOnCache() {
        assertEquals(new CacheExampleEntity(1L, "My Cache Entry"), repository.findOne(1L));
        String log = systemOutRule.getLog();
        assertFalse(log.contains("doesn't hit the cache"));
    }

    @Test
    public void testCacheAfterFind() {
        cacheManager.getCache("example").clear();
        assertEquals(new CacheExampleEntity(1L, "My Cache Entry"), repository.findOne(1L));
        String log = systemOutRule.getLog();
        assertTrue(log.contains("doesn't hit the cache"));
    }

    @Test
    public void testDeleteFromCache() {
        repository.remove(1L);
        assertNull(cacheManager.getCache("example").get(1L));
    }
}