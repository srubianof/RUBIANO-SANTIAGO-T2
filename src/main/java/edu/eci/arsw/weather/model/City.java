package edu.eci.arsw.weather.model;

/**
 * The type City.
 */
public class City {
    private String name;
    private Location coord;
    private Weather weather;
    private Stats main;
    private long visibility;
    private Wind wind;
    private Clouds clouds;

    /**
     * Instantiates a new City.
     */
    public City() {
    }

    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets coord.
     *
     * @return the coord
     */
    public Location getCoord() {
        return coord;
    }

    /**
     * Sets coord.
     *
     * @param coord the coord
     */
    public void setCoord(Location coord) {
        this.coord = coord;
    }

    /**
     * Gets weather.
     *
     * @return the weather
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * Sets weather.
     *
     * @param weather the weather
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    /**
     * Gets main.
     *
     * @return the main
     */
    public Stats getMain() {
        return main;
    }

    /**
     * Sets main.
     *
     * @param main the main
     */
    public void setMain(Stats main) {
        this.main = main;
    }

    /**
     * Gets visibility.
     *
     * @return the visibility
     */
    public long getVisibility() {
        return visibility;
    }

    /**
     * Sets visibility.
     *
     * @param visibility the visibility
     */
    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    /**
     * Gets wind.
     *
     * @return the wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Sets wind.
     *
     * @param wind the wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * Gets clouds.
     *
     * @return the clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * Sets clouds.
     *
     * @param clouds the clouds
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }
}
