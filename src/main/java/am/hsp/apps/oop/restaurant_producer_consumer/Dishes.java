package main.java.am.hsp.apps.oop.restaurant_producer_consumer;

/**
 * This provides the maximum number of dishes that the cookers are able to cook
 * and the waiters are able to serve at at once. Contains methods for indicating
 * number of currently available ready dishes.
 * 
 * @author user
 *
 */
public class Dishes {

    private static final int MAX_SIZE_OF_DISHES = 5;

    private int tail;
    private int totalCookedMeals;
    private Meal[] meals;

    /**
     * The default constructor.
     */
    public Dishes() {
        this.tail = -1;
        this.meals = new Meal[MAX_SIZE_OF_DISHES];
    }

    /**
     * This increments the ready dishes number along with each new cooked meal.
     * Also counts all the meals that have been cooked in total.
     */
    public void addMeal() {
        meals[++tail] = new Meal(++totalCookedMeals);
    }

    /**
     * Consumes the latest cooked meal.
     */
    public void consumeMeal() {
        meals[tail--] = null;
    }

    /**
     * Returns the latest cooked meal's id.
     * 
     * @return
     */
    public int getLatestMealId() {
        return meals[tail].getOrderId();
    }

    /**
     * Checks whether there is no room for new dishes.
     * 
     * @return
     */
    public boolean checkWhetherDishesAreFull() {
        return tail == meals.length - 1;
    }

    /**
     * Checks whether there are no dishes for serving.
     * 
     * @return
     */
    public boolean checkWhetherDishesAreEmpty() {
        return tail == -1;
    }
}
