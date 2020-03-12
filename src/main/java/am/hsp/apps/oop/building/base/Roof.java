package main.java.am.hsp.apps.oop.building.base;

/**
 * Contains attributes general for the roofs of the buildings.
 * 
 * @author hripsime
 *
 */
public class Roof {
    private boolean solarSystemLocated;
    private boolean verandaExistance;
    private String color;

    /**
     * Returns whether there is a solar system on the roof.
     * 
     * @return
     */
    public boolean isSolarSystemLocated() {
        return solarSystemLocated;
    }

    /**
     * Sets whether there must be a solar system on the roof.
     * 
     * @param solarSystemLocated
     */
    public void setSolarSystemLocated(boolean solarSystemLocated) {
        this.solarSystemLocated = solarSystemLocated;
    }

    /**
     * Returns whether there is a veranda on the roof.
     * 
     * @return
     */
    public boolean isVerandaExistance() {
        return verandaExistance;
    }

    /**
     * Returns whether there must be a veranda on the roof.
     * 
     * @param verandaExistance
     */
    public void setVerandaExistance(boolean verandaExistance) {
        this.verandaExistance = verandaExistance;
    }

    /**
     * Returns the color of the roof.
     * 
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the roof.
     * 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

}
