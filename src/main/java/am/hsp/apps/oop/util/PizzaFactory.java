package main.java.am.hsp.apps.oop.util;

import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza.Pizza;
import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza.PlainPizza;
import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza.ThreeCheesePizza;
import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.topping.Mozzarella;
import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.topping.TomatoSauce;

/**
 * Conatins method for making a pizza.
 * 
 * @author user
 *
 */
public final class PizzaFactory {

    private static final char PLAIN = 'P';
    private static final char THREE_CHEESE = 'T';
    private static final char MOZZARELLA = 'M';
    private static final char TOMATO_SAUCE = 'S';

    /**
     * Private constructor for not allowing create an instance of this class.
     */
    private PizzaFactory() {
    }

    /**
     * Creates a pizza according to the input.
     * 
     * @param animalType
     * @return
     */
    public static Pizza makePizza(char pizzaType) {
        switch (pizzaType) {
        case PLAIN:
            return new PlainPizza();

        case THREE_CHEESE:
            return new ThreeCheesePizza();

        default:
            return null;
        }
    }

    /**
     * Creates a pizza with the given topping and pizza.
     * 
     * @param decoratorType
     * @param pizzaType
     * @return
     */
    public static final Pizza makeDecorator(char decoratorType, Pizza pizzaType) {
        switch (decoratorType) {
        case MOZZARELLA:
            return new Mozzarella(pizzaType);

        case TOMATO_SAUCE:
            return new TomatoSauce(pizzaType);

        default:
            return null;
        }
    }
}
