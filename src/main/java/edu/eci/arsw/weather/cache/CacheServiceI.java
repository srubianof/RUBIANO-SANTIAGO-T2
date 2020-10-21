package edu.eci.arsw.weather.cache;

import edu.eci.arsw.weather.cache.impl.Tuple;
import edu.eci.arsw.weather.model.City;

public interface CacheServiceI {

    void saveCache(String name, City city);

    Tuple<City, Long> getCache(String name);

    long getTime(String name);
}
