package edu.eci.arsw.weather.model;

import java.util.*;

/**
 * The type Weather.
 */
public class Weather {
    //    private List<WeatherStats> weatherStats;
    private int id;
    private String main;
    private String description;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets main.
     *
     * @return the main
     */
    public String getMain() {
        return main;
    }

    /**
     * Sets main.
     *
     * @param main the main
     */
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Instantiates a new Weather.
     */
    public Weather() {
    }
}
