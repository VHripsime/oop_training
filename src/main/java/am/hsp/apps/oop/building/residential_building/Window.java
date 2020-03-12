package main.java.am.hsp.apps.oop.building.residential_building;

/**
 * Contains attributes general for windows.
 * 
 * @author hripsime
 *
 */
public class Window {
    private double length;
    private double height;
    private boolean windowAllowedToOpen;

    /**
     * Returns the length of the window.
     * 
     * @return
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the window.
     * 
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns the height of the window.
     * 
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the window.
     * 
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the window capability for opening.
     * 
     * @return
     */
    public boolean isWindowAllowedToOpen() {
        return windowAllowedToOpen;
    }

    /**
     * Sets whether the window is capable to open or not.
     * 
     * @param windowAllowedToOpen
     */
    public void setWindowAllowedToOpen(boolean windowAllowedToOpen) {
        this.windowAllowedToOpen = windowAllowedToOpen;
    }
}
