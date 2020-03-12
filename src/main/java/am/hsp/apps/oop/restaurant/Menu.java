package main.java.am.hsp.apps.oop.restaurant;

/**
 * Contains different meals.
 * 
 * @author hripsime
 *
 */
public class Menu {

    private Meal[] meals;

    /**
     * Returns whether a meal is available in the menu with the given id.
     * 
     * @param mealId
     * @return
     */
    public boolean isMealAvailable(String mealId) {
        for (int i = 0; i < meals.length; i++) {
            if (meals[i].getId().equals(mealId)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns the most expensive meal from the menu.
     * 
     * @return
     */
    public Meal getMostExpensiveMeal() {
        Meal mealOfMaxPrice = meals[0];
        double maxPrice = meals[0].getPrice();

        for (int i = 1; i < meals.length; i++) {
            if (meals[i].getPrice() > maxPrice) {
                maxPrice = meals[i].getPrice();
                mealOfMaxPrice = meals[i];
            }
        }

        return mealOfMaxPrice;
    }
    
    /**
     * Returns those meals, which prices are less than the given price.
     * 
     * @param price
     * @return
     */
    public Meal[] getMealsWhichPriceIsLessThanGivenOne(double price) {
        Meal[] meals = new Meal[getNumberOfMealsWhichPriceIsLessThanGivenOne(price)];
        int index = 0;

        for (int i = 0; i < meals.length; i++) {
            if (meals[i].getPrice() < price) {
                meals[index++] = meals[i];
            }
        }

        return meals;
    }

    /**
     * Returns the meals quantity, which prices are less than the given price.
     * 
     * @param price
     * @return
     */
    public int getNumberOfMealsWhichPriceIsLessThanGivenOne(double price) {        
        int count = 0;

        for (int i = 0; i < meals.length; i++) {
            if (meals[i].getPrice() < price) {
                count++;
            }
        }

        return count;
    }

    /**
     * Returns the meals of the menu.
     * 
     * @return
     */
    public Meal[] getMeals() {
        return meals;
    }

    /**
     * Sets the meals in the menu.
     * 
     * @param meals
     */
    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }

}
