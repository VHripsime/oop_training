package main.java.am.hsp.apps.oop.building.residential_building;

/**
 * Contains attributes general for parking areas.
 * 
 * @author user
 *
 */
public class Parking {
    private double areaSurface;
    private boolean openSpace;
    private int carsMaxNumber;
    private boolean surveillanceSystemAvailable;

    /**
     * Returns the surface of the parking area.
     * 
     * @return
     */
    public double getAreaSurface() {
        return areaSurface;
    }

    /**
     * Sets the surface of the parking area.
     * 
     * @param areaSurface
     */
    public void setAreaSurface(double areaSurface) {
        this.areaSurface = areaSurface;
    }

    /**
     * Returns whether the parking is in open or closed space.
     * 
     * @return
     */
    public boolean isOpenSpace() {
        return openSpace;
    }

    /**
     * Sets whether the parking is in open or closed space.
     * 
     * @param openSpace
     */
    public void setOpenSpace(boolean openSpace) {
        this.openSpace = openSpace;
    }

    /**
     * Returns the number of cars can park in the parking area.
     * 
     * @return
     */
    public int getCarsMaxNumber() {
        return carsMaxNumber;
    }

    /**
     * Sets the maximum number of cars can park in the parking area.
     * 
     * @param carsNumber
     */
    public void setCarsMaxNumber(int carsNumber) {
        this.carsMaxNumber = carsNumber;
    }

    /**
     * Returns whether a surveillance system is available in the parking.
     * 
     * @return
     */
    public boolean isSurveillanceSystemAvailable() {
        return surveillanceSystemAvailable;
    }

    /**
     * Sets whether there must be a surveillance system in the parking.
     * 
     * @param surveillanceSystemAvailable
     */
    public void setSurveillanceSystemAvailable(boolean surveillanceSystemAvailable) {
        this.surveillanceSystemAvailable = surveillanceSystemAvailable;
    }
}
