package main.java.am.hsp.apps.oop.building.residential_building;

/**
 * Contains all items descriptive to a floor of a residential building.
 * 
 * @author hripsime
 *
 */
public class Floor {
    private boolean fireExtinguisherAvailable;
    private RestSpace restSpace;
    private Window[] window;
    private Flat[] flats;

    /**
     * Returns sold flats number on the floor.
     * 
     * @return
     */
    public int getNumberOfSoldFlats() {
        int count = 0;

        for (Flat flat : flats) {
            if (flat.isSold()) {
                count++;
            }
        }

        return count;
    }

    /**
     * Returns flats number on the floor which are for sale.
     * 
     * @return
     */
    public int getNumberOfFlatsForSale() {
        int count = 0;

        for (Flat flat : flats) {
            if (flat.isForSale()) {
                count++;
            }
        }

        return count;
    }

    /**
     * Returns flats number on the floor which are for rent.
     * 
     * @return
     */
    public int getNumberOfFlatsForRent() {
        int count = 0;

        for (Flat flat : flats) {
            if (flat.isForRent()) {
                count++;
            }
        }

        return count;
    }

    /**
     * Returns number of flats, which have open balcony.
     * 
     * @return
     */
    public int getNumberOfFlatsWithOpenBalcony() {
        int count = 0;

        for (Flat flat : flats) {
            if (flat.isOpenBalcony()) {
                count++;
            }
        }

        return count;
    }

    /**
     * Checks whether there is a flat with the given number in this floor.
     * 
     * @param flatNumber
     * @return
     */
    public boolean containsFlatByNumber(int flatNumber) {
        for (Flat flat : flats) {
            if (flat.getFlatNumber() == flatNumber) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns whether there is a fire extinguisher or not.
     * 
     * @return
     */
    public boolean isFireExtinguisher() {
        return fireExtinguisherAvailable;
    }

    /**
     * Sets whether there is available a fire extinguisher.
     * 
     * @param fireExtinguisher
     */
    public void setFireExtinguisher(boolean fireExtinguisher) {
        this.fireExtinguisherAvailable = fireExtinguisher;
    }

    /**
     * Returns the rest space of the floor.
     * 
     * @return
     */
    public RestSpace getRestSpace() {
        return restSpace;
    }

    /**
     * Sets whether there must be a rest space in the floor.
     * 
     * @param restSpace
     */
    public void setRestSpace(RestSpace restSpace) {
        this.restSpace = restSpace;
    }

    /**
     * Returns the window of the floor.
     * 
     * @return
     */
    public Window[] getWindow() {
        return window;
    }

    /**
     * Sets a window in the floor.
     * 
     * @param window
     */
    public void setWindow(Window[] window) {
        this.window = window;
    }

    /**
     * Returns the flats of the floor.
     * 
     * @return
     */
    public Flat[] getFlats() {
        return flats;
    }

    /**
     * Sets flats on the floor.
     * 
     * @param flats
     */
    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }
}
