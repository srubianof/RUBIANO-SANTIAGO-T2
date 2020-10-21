package edu.eci.arsw.weather.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.services.HttpConnectionServicesI;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class HttpConnectionServices implements HttpConnectionServicesI {
    @Override
    public JSONObject getStatsCity(String place) throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q=" + place + "&appid=e28ceff7d9a3de0119818ad983c808fc")
                .asString();
        System.out.println(response.getBody());
        return new JSONObject(response.getBody());
    }
}
