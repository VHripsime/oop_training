package main.java.am.hsp.apps.oop.design_pattern.structural.decorator.topping;

import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza.Pizza;

/**
 * Contains attribute characterizing the pizza topping decorators.
 * 
 * @author user
 *
 */
public abstract class ToppingDecorator extends Pizza {

    protected Pizza pizza;
    
    /**
     * Constructor for setting the pizza type.
     * 
     * @param pizza
     */
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.design_pattern.decorator.Pizza#getDescription()
     */
    public String getDescription() {
        return (this.pizza.getDescription() + this.description);
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.decorator.Pizza#getCost()
     */
    public double getCost() {
        return (this.pizza.getCost() + this.cost);
    }

    /**
     * Returns the pizza.
     * 
     * @return
     */
    public Pizza getPizza() {
        return this.pizza;
    }
}
