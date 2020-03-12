package main.java.am.hsp.apps.oop.building.residential_building;

/**
 * Contains attributes describing the elevators.
 * 
 * @author user
 *
 */
public class Elevator {

    private final double AVERAGE_WEIGHT = 62;

    private double maxCapacity;
    private double surface;
    private double height;

    /**
     * Returns the maximum number of passengers allowed to access the elevator
     * simultaneously.
     * 
     * @return
     */
    public int getMaxPassengerNumber() {
        return ((int) (maxCapacity / AVERAGE_WEIGHT));
    }

    /**
     * Returns maximum capacity of the elevator.
     * 
     * @return
     */
    public double getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets maximum capacity of the elevator.
     * 
     * @param maxCapacity
     */
    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * Returns the surface capacity of the elevator.
     * 
     * @return
     */
    public double getSurface() {
        return surface;
    }

    /**
     * Sets the surface capacity of the elevator.
     * 
     * @param surface
     */
    public void setSurface(double surface) {
        this.surface = surface;
    }

    /**
     * Returns the height of the elevator.
     * 
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the elevator.
     * 
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
