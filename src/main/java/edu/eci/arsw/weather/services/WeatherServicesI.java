package edu.eci.arsw.weather.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.model.City;

public interface WeatherServicesI {
    City getStatsByCity(String city) throws UnirestException;
}
