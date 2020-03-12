package main.java.am.hsp.apps.oop.building.residential_building;

/**
 * Contains attributes general to flats.
 * 
 * @author user
 *
 */
public class Flat {
    public static final int STATUS_FOR_RENT = 2;
    public static final int STATUS_FOR_SALE = 1;
    public static final int STATUS_FOR_SOLD = 0;

    private int flatNumber;
    private double surface;
    private int roomsNumber;
    private boolean openBalcony;
    private int flatStatus;

    /**
     * Checks whether the given flat is sold.
     * 
     * @param flat
     * @return
     */
    public boolean isSold() {
        return flatStatus == STATUS_FOR_SOLD;
    }

    /**
     * Checks whether the given flat is for rent.
     * 
     * @param flat
     * @return
     */
    public boolean isForRent() {
        return flatStatus == STATUS_FOR_RENT;
    }

    /**
     * Checks whether the given flat is for sale.
     * 
     * @param flat
     * @return
     */
    public boolean isForSale() {
        return flatStatus == STATUS_FOR_SALE;
    }

    /**
     * Returns the number of the flat.
     * 
     * @return
     */
    public int getFlatNumber() {
        return flatNumber;
    }

    /**
     * Sets the number of the flat.
     * 
     * @param flatNumber
     */
    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    /**
     * Returns the surface of the flat.
     * 
     * @return
     */
    public double getSurface() {
        return surface;
    }

    /**
     * Sets the surface of the flat.
     * 
     * @param surface
     */
    public void setSurface(double surface) {
        this.surface = surface;
    }

    /**
     * Returns the rooms number of the flat.
     * 
     * @return
     */
    public int getRoomsNumber() {
        return roomsNumber;
    }

    /**
     * Sets the rooms number of the flat.
     * 
     * @param roomsNumber
     */
    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    /**
     * Returns whether the flat has an open balcony.
     * 
     * @return
     */
    public boolean isOpenBalcony() {
        return openBalcony;
    }

    /**
     * Sets whether the flat must have an open balcony.
     * 
     * @param openBalcony
     */
    public void setOpenBalcony(boolean openBalcony) {
        this.openBalcony = openBalcony;
    }

    /**
     * Returns the flat status.
     * 
     * @return
     */
    public int getFlatStatus() {
        return flatStatus;
    }

    /**
     * Sets the flat status.
     * 
     * @param flatStatus
     */
    public void setFlatStatus(int flatStatus) {
        this.flatStatus = flatStatus;
    }
}
