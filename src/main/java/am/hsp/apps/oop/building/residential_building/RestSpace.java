package main.java.am.hsp.apps.oop.building.residential_building;

/**
 * Contains attributes describing the rest spaces.
 * 
 * @author hripsime
 *
 */
public class RestSpace {
    private double surface;
    private boolean openSpace;
    private boolean benchAvailable;

    /**
     * Returns the surface of the rest space.
     * 
     * @return
     */
    public double getSurface() {
        return surface;
    }

    /**
     * Sets the surface of the rest space.
     * 
     * @param surface
     */
    public void setSurface(double surface) {
        this.surface = surface;
    }

    /**
     * Returns whether the rest space is in open air or closed.
     * 
     * @return
     */
    public boolean isOpenSpace() {
        return openSpace;
    }

    /**
     * Sets whether the rest space must be in open air or closed.
     * 
     * @param openSpace
     */
    public void setOpenSpace(boolean openSpace) {
        this.openSpace = openSpace;
    }

    /**
     * Returns whether there is a bench in the rest space.
     * 
     * @return
     */
    public boolean isBenchAvailable() {
        return benchAvailable;
    }

    /**
     * Sets whether there must be a bench in the rest space.
     * 
     * @param benchAvailable
     */
    public void setBenchAvailable(boolean benchAvailable) {
        this.benchAvailable = benchAvailable;
    }
}
