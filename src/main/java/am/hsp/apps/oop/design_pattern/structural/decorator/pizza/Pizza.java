package main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza;

/**
 * Contains some attributes characterizing a pizza.
 * 
 * @author user
 *
 */
public abstract class Pizza {

    protected String description;
    protected double cost;

    /**
     * Returns the description of a pizza.
     * 
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets a description for a pizza.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the cost of a pizza.
     * 
     * @return
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the cost for a pizza.
     * 
     * @param cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
}
