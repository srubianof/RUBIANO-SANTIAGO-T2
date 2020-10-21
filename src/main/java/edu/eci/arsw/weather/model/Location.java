package edu.eci.arsw.weather.model;

/**
 * The type Location.
 */
public class Location {
    private double lat;
    private double lon;

    /**
     * Instantiates a new Location.
     *
     * @param latitude  the latitude
     * @param longitude the longitude
     */
    public Location(double latitude, double longitude) {
        this.lat = latitude;
        this.lon = longitude;
    }

    /**
     * Gets lat.
     *
     * @return the lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * Sets lat.
     *
     * @param lat the lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * Gets lon.
     *
     * @return the lon
     */
    public double getLon() {
        return lon;
    }

    /**
     * Sets lon.
     *
     * @param lon the lon
     */
    public void setLon(double lon) {
        this.lon = lon;
    }
}
