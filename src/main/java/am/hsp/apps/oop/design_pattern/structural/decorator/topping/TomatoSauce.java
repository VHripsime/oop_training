package main.java.am.hsp.apps.oop.design_pattern.structural.decorator.topping;

import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza.Pizza;

/**
 * One of the pizza topping decorator types.
 * 
 * @author user
 *
 */
public class TomatoSauce extends ToppingDecorator {

    private static final String DESCRIPTION = ", Tomato suace";
    private static final double COST = 0.35;

    /**
     * Constructor for setting the pizza type.
     * 
     * @param pizza
     */
    public TomatoSauce(Pizza pizza) {
        super(pizza);

        this.description = DESCRIPTION;
        this.cost = COST;
    }
}
