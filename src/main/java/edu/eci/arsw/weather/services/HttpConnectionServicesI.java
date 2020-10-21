package edu.eci.arsw.weather.services;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public interface HttpConnectionServicesI {
    JSONObject getStatsCity(String city) throws UnirestException;
}
