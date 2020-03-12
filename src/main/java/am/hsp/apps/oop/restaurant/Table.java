package main.java.am.hsp.apps.oop.restaurant;

/**
 * Contains attributes general to the restaurant tables.
 * 
 * @author user
 *
 */
public class Table {

    /*
     * I haven't added some features as table size, color, material type in order to
     * avoid from the unnecessary details.
     */
    private String tableId;
    private boolean reserved;
    private int seatingCapacity;

    /**
     * Checks whether the table is free or reserved.
     * 
     * @return
     */
    public boolean isFree() {
        return !isReserved();
    }

    /**
     * Returns whether the table is reserved or not.
     * 
     * @return
     */
    public boolean isReserved() {
        return reserved;
    }

    /**
     * Returns the table id.
     * 
     * @return
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * Sets the table id.
     * 
     * @param tableId
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * Sets whether the table is reserved or free.
     * 
     * @param reserved
     */
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    /**
     * Returns how many people can seat around the table.
     * 
     * @return
     */
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    /**
     * Sets for how many people is designed the table.
     * 
     * @param seatingCapacity
     */
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
