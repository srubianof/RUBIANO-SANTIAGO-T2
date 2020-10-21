package edu.eci.arsw.weather.services.impl;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.model.*;
import edu.eci.arsw.weather.services.HttpConnectionServicesI;
import edu.eci.arsw.weather.services.WeatherServicesI;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServices implements WeatherServicesI {
    @Autowired
    HttpConnectionServicesI httpConnectionService;


    @Override
    public City getStatsByCity(String city) throws UnirestException {
        return addDetails(city);
    }

    private City addDetails(String city) throws UnirestException {
        City city1 = new City();
        JSONObject jsonObject = httpConnectionService.getStatsCity(city);

        Gson gson = new Gson();
        city1.setName(gson.fromJson(String.valueOf(jsonObject.get("name")), String.class));
        city1.setCoord(gson.fromJson(String.valueOf(jsonObject.getJSONObject("coord")), Location.class));
        city1.setWeather(gson.fromJson(String.valueOf(jsonObject.getJSONArray("weather").getJSONObject(0)), Weather.class));
        city1.setMain(gson.fromJson(String.valueOf(jsonObject.getJSONObject("main")), Stats.class));
        city1.setWind(gson.fromJson(String.valueOf(jsonObject.getJSONObject("wind")), Wind.class));
        city1.setClouds(gson.fromJson(String.valueOf(jsonObject.getJSONObject("clouds")), Clouds.class));
        city1.setVisibility(gson.fromJson(String.valueOf(jsonObject.get("visibility")), Long.class));
        return city1;
    }

}
