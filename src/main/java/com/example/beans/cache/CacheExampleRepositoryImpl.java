package com.example.beans.cache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class CacheExampleRepositoryImpl implements CacheExampleRepository {

    private Map<Long, CacheExampleEntity> database = new HashMap<>();
    @Override
    public CacheExampleEntity findOne(Long id) {
        log.info("doesn't hit the cache");
        return database.get(id);
    }

    @Override
    public CacheExampleEntity save(CacheExampleEntity entity) {
        Long entityId = Optional.ofNullable(entity.getId())
                .orElseGet(() -> database.keySet().stream()
                        .max(Long::compareTo)
                        .map(key -> key + 1)
                        .orElse(1L));
        CacheExampleEntity toSave = new CacheExampleEntity(entityId, entity.getName());

        database.put(entityId, toSave);

        return toSave;
    }

    @Override
    public void remove(Long id) {
        database.remove(id);
    }

    @Override
    public void removeAll() {
        database.clear();
    }
}
