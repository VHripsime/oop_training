package main.java.am.hsp.apps.oop.building.residential_building;

/**
 * Contains attributes describing the upstairs.
 * 
 * @author user
 *
 */
public class Upstairs {
    private int staircaseNumber;
    private boolean cageAvailable;
    private boolean rampAvailable;

    /**
     * Returns the number of stairs in one upstairs.
     * 
     * @return
     */
    public int getStaircaseNumber() {
        return staircaseNumber;
    }

    /**
     * Sets the number of stairs.
     * 
     * @param staircaseNumber
     */
    public void setStaircaseNumber(int staircaseNumber) {
        this.staircaseNumber = staircaseNumber;
    }

    /**
     * Returns whether the upstairs contain a cage.
     * 
     * @return
     */
    public boolean isCageAvailable() {
        return cageAvailable;
    }

    /**
     * Sets whether the upstairs contain a cage.
     * 
     * @param cageAvailable
     */
    public void setCageAvailable(boolean cageAvailable) {
        this.cageAvailable = cageAvailable;
    }

    /**
     * Returns whether the upstairs contain a ramp.
     * 
     * @return
     */
    public boolean isRampAvailable() {
        return rampAvailable;
    }

    /**
     * Sets whether the upstairs contain a ramp.
     * 
     * @param rampAvailable
     */
    public void setRampAvailable(boolean rampAvailable) {
        this.rampAvailable = rampAvailable;
    }
}
