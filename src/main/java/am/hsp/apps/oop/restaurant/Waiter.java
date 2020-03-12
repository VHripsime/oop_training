package main.java.am.hsp.apps.oop.restaurant;

/**
 * Contains features general for waiters.
 * 
 * @author user
 *
 */
public class Waiter extends Staff {

    private String id;
    private String[] tablesId;

    /**
     * Checks whether there is a table with the given id, which serves the
     * waiter.
     * 
     * @param id
     * @return
     */
    public boolean isServingTable(Table table) {
        String tableId = table.getTableId();

        for (int i = 0; i < tablesId.length; i++) {
            if (tablesId[i].equals(tableId)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks whether the waiter serves at table with the given id.
     * 
     * @param id
     * @return
     */
    public boolean doesServeTableWithGivenId(String id) {
        for (int i = 0; i < tablesId.length; i++) {
            if (tablesId[i].equals(id)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns how many tables the waiter serves.
     * 
     * @return
     */
    public int getNumberOfServingTables() {
        return tablesId.length;
    }

    /**
     * Returns the waiters id.
     * 
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the waiters id.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the waiter's serving tables' ids.
     * 
     * @return
     */
    public String[] getTablesId() {
        return tablesId;
    }

    /**
     * Sets the those tables' ids, at which serves the waiter.
     * 
     * @param tablesId
     */
    public void setTablesId(String[] tablesId) {
        this.tablesId = tablesId;
    }
}
