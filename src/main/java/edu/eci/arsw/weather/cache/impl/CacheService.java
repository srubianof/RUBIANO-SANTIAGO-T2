package edu.eci.arsw.weather.cache.impl;

import edu.eci.arsw.weather.cache.CacheServiceI;
import edu.eci.arsw.weather.model.City;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class CacheService implements CacheServiceI {
    private ConcurrentHashMap<String, Tuple<City, Long>> concurrentCache;

    public CacheService() {
        concurrentCache = new ConcurrentHashMap<>();
    }

    @Override
    public void saveCache(String name, City city) {
        concurrentCache.put(name, new Tuple<City, Long>(city, System.currentTimeMillis()));
    }

    @Override
    public Tuple<City, Long> getCache(String name) {
        return concurrentCache.get(name);
    }

    @Override
    public long getTime(String name) {
        return this.concurrentCache.get(name) != null ? concurrentCache.get(name).getO2() : Long.valueOf(System.currentTimeMillis());
    }
}
