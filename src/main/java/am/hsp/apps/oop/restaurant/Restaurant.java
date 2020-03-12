package main.java.am.hsp.apps.oop.restaurant;

/**
 * Contains attributes general for restaurants.
 * 
 * @author hripsime
 *
 */
public class Restaurant {

    private Menu menu;
    private Cooker[] cookers;
    private Kitchen kitchen;
    private Table[] tables;
    private Waiter[] waiters;

    /**
     * Returns the chief cooker.
     * 
     * @return
     */
    public Cooker getChiefCooker() {
        for (int i = 0; i < cookers.length; i++) {
            if (cookers[i].isChiefCooker()) {
                return cookers[i];
            }
        }

        return null; /* Based on clean code principles we must throw here an exception.*/

    }

    /**
     * Returns whether a meal is available in the menu with the given id.
     * 
     * @param mealId
     * @return
     */
    public boolean isMealAvailableInMenu(String mealId) {
        return menu.isMealAvailable(mealId);
    }

    /**
     * Returns the most expensive meal from the menu.
     * 
     * @return
     */
    public Meal getMostExpensiveMealFromMenu() {
        return menu.getMostExpensiveMeal();
    }

    /**
     * Returns those meals, which prices are less than the given price.
     * 
     * @param price
     * @return
     */
    public Meal[] getMealsFromMenuWhichPriceIsLessThanGivenOne(double price) {
        return menu.getMealsWhichPriceIsLessThanGivenOne(price);
    }

    /**
     * Returns the meals quantity, which prices are less than the given price.
     * 
     * @param price
     * @return
     */
    public int getNumberOfMealsFromMenuWhichPriceIsLessThanGivenOne(double price) {
        return menu.getNumberOfMealsWhichPriceIsLessThanGivenOne(price);
    }

    /**
     * Returns the count of the free tables.
     * 
     * @return
     */
    public int getFreeTablesCount() {
        int count = 0;

        for (int i = 0; i < tables.length; i++) {
            tables[i].isFree();
            count++;
        }

        return count;
    }

    /**
     * Returns the tables, at which serves the waiter with the given id.
     * 
     * @param id
     * @return
     */
    public Table[] getTablesByWaiterId(String id) {
        Waiter waiter = getWaiterById(id);
        Table[] waiterTables = new Table[waiter.getNumberOfServingTables()];
        int index = 0;

        for (int i = 0; i < tables.length; i++) {
            if (waiter.isServingTable(tables[i])) {
                waiterTables[index++] = tables[i];
            }
        }

        return null;
    }

    /**
     * Returns the waiter of the given table.
     * 
     * @param id
     * @return
     */
    public Waiter getWaiterByTableId(String id) {
        for (int i = 0; i < waiters.length; i++) {
            if (waiters[i].doesServeTableWithGivenId(id)) {
                return waiters[i];
            }
        }

        return null;
    }

    /**
     * Returns how many tables serve the waiter of the given id.
     * 
     * @param id
     * @return
     */
    public int getNumberOfTablesByWaiterId(String id) {
        return getWaiterById(id).getNumberOfServingTables();
    }

    /**
     * Returns the waiter by the given id.
     * 
     * @param id
     * @return
     */
    public Waiter getWaiterById(String id) {
        for (int i = 0; i < waiters.length; i++) {
            if (waiters[i].getId().equals(id)) {
                return waiters[i];
            }
        }

        return null;
    }

    /**
     * Returns the menu of the restaurant.
     * 
     * @return
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Sets the menu of the restaurant.
     * 
     * @param menu
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * Returns the cookers of the restaurant.
     * 
     * @return
     */
    public Cooker[] getCookers() {
        return cookers;
    }

    /**
     * Sets the cookers of the restaurant.
     * 
     * @param cookers
     */
    public void setCookers(Cooker[] cookers) {
        this.cookers = cookers;
    }

    /**
     * Returns the kitchen of the restaurant.
     * 
     * @return
     */
    public Kitchen getKitchen() {
        return kitchen;
    }

    /**
     * Sets the kitchen of the restaurant.
     * 
     * @param kitchen
     */
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    /**
     * Returns the tables of the restaurant.
     * 
     * @return
     */
    public Table[] getTables() {
        return tables;
    }

    /**
     * Sets the tables of the restaurant.
     * 
     * @param tables
     */
    public void setTables(Table[] tables) {
        this.tables = tables;
    }

    /**
     * Returns the waiters of the restaurant.
     * 
     * @return
     */
    public Waiter[] getWaiters() {
        return waiters;
    }

    /**
     * Sets the waiters of the restaurant.
     * 
     * @param waiters
     */
    public void setWaiters(Waiter[] waiters) {
        this.waiters = waiters;
    }
}
