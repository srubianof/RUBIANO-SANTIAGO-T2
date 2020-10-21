package edu.eci.arsw.weather.model;

/**
 * The type Wind.
 */
public class Wind {
    private double speed;
    private int deg;

    /**
     * Instantiates a new Wind.
     */
    public Wind() {
    }

    /**
     * Gets speed.
     *
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Sets speed.
     *
     * @param speed the speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Gets deg.
     *
     * @return the deg
     */
    public int getDeg() {
        return deg;
    }

    /**
     * Sets deg.
     *
     * @param ged the ged
     */
    public void setDeg(int ged) {
        this.deg = ged;
    }
}
