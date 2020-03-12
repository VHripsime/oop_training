package main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza;

/**
 * Contains attributes specifying the Plain Pizza.
 * 
 * @author user
 *
 */
public class PlainPizza extends Pizza {

    private static final String DESCRIPTION = "Thin dough";
    private static final double COST = 4.0;

    /**
     * The default constructor.
     */
    public PlainPizza() {
        this.description = DESCRIPTION;
        this.cost = COST;
    }
}
