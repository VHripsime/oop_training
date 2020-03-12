package main.java.am.hsp.apps.oop.design_pattern.structural.decorator.topping;

import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza.Pizza;

/**
 * A topping decorator type.
 * 
 * @author user
 *
 */
public class Mozzarella extends ToppingDecorator {

    private static final String DESCRIPTION = ", Mozzarella";
    private static final double COST = 0.5;

    /**
     * Constructor for setting the pizza type.
     * 
     * @param pizza
     */
    public Mozzarella(Pizza pizza) {
        super(pizza);

        this.description = DESCRIPTION;
        this.cost = COST;
    }
}