package main.java.am.hsp.apps.oop.restaurant;

/**
 * Contains attributes identifying a meal.
 * 
 * @author user
 *
 */
public class Meal {
    
    private String id;
    private double price;
    private String recipe;

    /**
     * Returns the meal id.
     * 
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the meal id.
     * 
     * @param mealId
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the price of the meal.
     * 
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the meal.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the recipe of the meal.
     * 
     * @return
     */
    public String getRecipe() {
        return recipe;
    }

    /**
     * Sets the recipe of the meal.
     * 
     * @param recipe
     */
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
