package edu.eci.arsw.weather.model;

/**
 * The type Stats.
 */
public class Stats {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;

    /**
     * Instantiates a new Stats.
     */
    public Stats() {
    }

    /**
     * Gets temp.
     *
     * @return the temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     * Sets temp.
     *
     * @param temp the temp
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * Gets feels like.
     *
     * @return the feels like
     */
    public double getFeels_like() {
        return feels_like;
    }

    /**
     * Sets feels like.
     *
     * @param feels_like the feels like
     */
    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    /**
     * Gets temp min.
     *
     * @return the temp min
     */
    public double getTemp_min() {
        return temp_min;
    }

    /**
     * Sets temp min.
     *
     * @param temp_min the temp min
     */
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    /**
     * Gets temp max.
     *
     * @return the temp max
     */
    public double getTemp_max() {
        return temp_max;
    }

    /**
     * Sets temp max.
     *
     * @param temp_max the temp max
     */
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    /**
     * Gets pressure.
     *
     * @return the pressure
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * Sets pressure.
     *
     * @param pressure the pressure
     */
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    /**
     * Gets humidity.
     *
     * @return the humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * Sets humidity.
     *
     * @param humidity the humidity
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
