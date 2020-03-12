package main.java.am.hsp.apps.oop.building.residential_building;

import main.java.am.hsp.apps.oop.building.base.Building;
import main.java.am.hsp.apps.oop.building.residential_building.Flat;
import main.java.am.hsp.apps.oop.building.residential_building.Floor;
import main.java.am.hsp.apps.oop.building.residential_building.Upstairs;

/**
 * Contains attributes general for all residential building types.
 * 
 * @author hripsime
 *
 */
public class ResidentialBuilding extends Building {
    private static final int NOT_FOUND = -1;

    private boolean ventilationSystemAvailable;
    private boolean lighteningSystemAvailable;
    private boolean garbageSystemAvailable;
    private boolean securityLocated;
    private boolean mailboxLocated;
    private Elevator elevator;
    private Upstairs[] upstairs;
    private Parking parking;
    private Floor[] floors;

    /**
     * Returns how many floors are in the building.
     * 
     * @return
     */
    public int getNumberOfFloors() {
        return floors.length;
    }

    /**
     * Returns total number of flats in the building.
     * 
     * @return
     */
    public int getTotalNumberOfFlats() {
        int count = 0;

        for (Floor floor : floors) {
            count += floor.getFlats().length;
        }

        return count;
    }

    /**
     * Returns total number of flats, which have open balcony.
     * 
     * @return
     */
    public int getTotalNumberOfFlatsWithOpenBalcony() {
        int count = 0;

        for (Floor floor : floors) {
            count += floor.getNumberOfFlatsWithOpenBalcony();
        }

        return count;
    }

    /**
     * Returns total number of flats, which are for rent.
     * 
     * @return
     */
    public int getTotalNumberOfFlatsForRent() {
        int count = 0;

        for (Floor floor : floors) {
            count += floor.getNumberOfFlatsForRent();
        }

        return count;
    }

    /**
     * Returns total number of flats, which are for sale.
     * 
     * @return
     */
    public int getTotalNumberOfFlatsForSale() {
        int count = 0;

        for (Floor floor : floors) {
            count += floor.getNumberOfFlatsForSale();
        }

        return count;
    }

    /**
     * Returns total number of flats, which are already sold.
     * 
     * @return
     */
    public int getTotalNumberOfSoldFlats() {
        int count = 0;

        for (Floor floor : floors) {
            count += floor.getNumberOfSoldFlats();
        }

        return count;
    }

    /**
     * Returns total number of entrance windows of the building.
     * 
     * @return
     */
    public int getNumberOfEntranceWindows() {
        int count = 0;

        for (Floor floor : floors) {
            count += floor.getWindow().length;
        }

        return count;
    }

    /**
     * Returns those flats, which have open balcony.
     * 
     * @return
     */
    public Flat[] getTotalFlatsWithOpenBalcony() {
        Flat[] flats = new Flat[getTotalNumberOfFlatsWithOpenBalcony()];
        int index = 0;

        for (Floor floor : floors) {
            for (Flat flat : floor.getFlats()) {
                if (flat.isOpenBalcony()) {
                    flats[index++] = flat;
                }
            }
        }

        return flats;
    }

    /**
     * Returns those flats, which are for sale.
     * 
     * @return
     */
    public Flat[] getFlatsForSale() {
        Flat[] flats = new Flat[getTotalNumberOfFlatsForSale()];
        int index = 0;

        for (Floor floor : floors) {
            for (Flat flat : floor.getFlats()) {
                if (flat.isForSale()) {
                    flats[index++] = flat;
                }
            }
        }

        return flats;
    }

    /**
     * Returns those flats, which are for rent.
     * 
     * @return
     */
    public Flat[] getFlatsForRent() {
        Flat[] flats = new Flat[getTotalNumberOfFlatsForRent()];
        int index = 0;

        for (Floor floor : floors) {
            for (Flat flat : floor.getFlats()) {
                if (flat.isForRent()) {
                    flats[index++] = flat;
                }
            }
        }

        return flats;
    }

    /**
     * Returns those flats, which are sold.
     * 
     * @return
     */
    public Flat[] getSoldFlats() {
        Flat[] flats = new Flat[getTotalNumberOfSoldFlats()];
        int index = 0;

        for (Floor floor : floors) {
            for (Flat flat : floor.getFlats()) {
                if (flat.isSold()) {
                    flats[index++] = flat;
                }
            }
        }

        return flats;
    }

    /**
     * Given a flat number. Returns in which floor is situated that flat.
     * 
     * @param flatNumber
     * @return
     */
    public int getFloorOfGivenFlat(int flatNumber) {
        for (int i = 0; i < floors.length; i++) {
            if (floors[i].containsFlatByNumber(flatNumber)) {
                return i;
            }
        }

        return NOT_FOUND;
    }

    /**
     * Returns whether a ventilation system is available in the building.
     * 
     * @return
     */
    public boolean isVentilationSystemAvailable() {
        return ventilationSystemAvailable;
    }

    /**
     * Sets whether there will be a ventilation system in the building.
     * 
     * @param ventilationSystemAvailable
     */
    public void setVentilationSystemAvailable(boolean ventilationSystemAvailable) {
        this.ventilationSystemAvailable = ventilationSystemAvailable;
    }

    /**
     * Returns whether a lightening system is available in the building.
     * 
     * @return
     */
    public boolean isLighteningSystemAvailable() {
        return lighteningSystemAvailable;
    }

    /**
     * Sets whether there will be a lightening system in the building.
     * 
     * @param lightingSystemAvailable
     */
    public void setLighteningSystemAvailable(boolean lighteningSystemAvailable) {
        this.lighteningSystemAvailable = lighteningSystemAvailable;
    }

    /**
     * Returns whether a garbage system is available in the building.
     * 
     * @return
     */
    public boolean isGarbageSystemAvailable() {
        return garbageSystemAvailable;
    }

    /**
     * Sets whether there will be a garbage system in the building.
     * 
     * @param garbageSystemAvailable
     */
    public void setGarbageSystemAvailable(boolean garbageSystemAvailable) {
        this.garbageSystemAvailable = garbageSystemAvailable;
    }

    /**
     * Returns whether a security is located in the building.
     * 
     * @return
     */
    public boolean isSecurityLocated() {
        return securityLocated;
    }

    /**
     * Sets whether there will be a security in the building.
     * 
     * @param securityLocated
     */
    public void setSecurityLocated(boolean securityLocated) {
        this.securityLocated = securityLocated;
    }

    /**
     * Returns whether a mailbox is located in the building.
     * 
     * @return
     */
    public boolean isMailboxLocated() {
        return mailboxLocated;
    }

    /**
     * Sets whether there will be a mailbox in the building.
     * 
     * @param mailboxLocated
     */
    public void setMailboxLocated(boolean mailboxLocated) {
        this.mailboxLocated = mailboxLocated;
    }

    /**
     * Returns the upstairs of the building.
     * 
     * @return
     */
    public Upstairs[] getUpstairs() {
        return upstairs;
    }

    /**
     * Sets upstairs in the building.
     * 
     * @param upstairs
     */
    public void setUpstairs(Upstairs[] upstairs) {
        this.upstairs = upstairs;
    }

    /**
     * Returns the elevator of the building.
     * 
     * @return
     */
    public Elevator getElevator() {
        return elevator;
    }

    /**
     * Sets an elevator in the building.
     * 
     * @param elevator
     */
    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    /**
     * Returns the parking of the building.
     * 
     * @return
     */
    public Parking getParking() {
        return parking;
    }

    /**
     * Sets a parking of the building.
     * 
     * @param parking
     */
    public void setParking(Parking parking) {
        this.parking = parking;
    }

    /**
     * Returns the floors of the building.
     * 
     * @return
     */
    public Floor[] getFloor() {
        return floors;
    }

    /**
     * Sets floors in the building.
     * 
     * @param floor
     */
    public void setFloor(Floor[] floor) {
        this.floors = floor;
    }
}
