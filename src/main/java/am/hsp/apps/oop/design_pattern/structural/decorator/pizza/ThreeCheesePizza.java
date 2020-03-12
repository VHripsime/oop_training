package main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza;

/**
 * Contains attributes specifying the Three Cheese Pizza.
 * 
 * @author user
 *
 */
public class ThreeCheesePizza extends Pizza {

    private static final String DESCRIPTION = "Mozzarella, Fontina, Parmesan Cheeses";
    private static final double COST = 10.5;

    /**
     * The default constructor.
     */
    public ThreeCheesePizza() {
        this.description = DESCRIPTION;
        this.cost = COST;
    }
}
