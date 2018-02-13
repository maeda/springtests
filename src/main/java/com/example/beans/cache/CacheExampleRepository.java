package com.example.beans.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * Class based proxies and weaving based aspects don't work with cache annotations on java interfaces.
 */
public interface CacheExampleRepository {

    @Cacheable("example")
    CacheExampleEntity findOne(Long id);

    @CachePut(value = "example", key="#result.id")
    CacheExampleEntity save(CacheExampleEntity entity);

    @CacheEvict("example")
    void remove(Long id);

    @CacheEvict(value = "example", allEntries = true)
    void removeAll();
}
