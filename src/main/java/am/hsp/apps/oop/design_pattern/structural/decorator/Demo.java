package main.java.am.hsp.apps.oop.design_pattern.structural.decorator;

import main.java.am.hsp.apps.oop.design_pattern.structural.decorator.pizza.Pizza;
import main.java.am.hsp.apps.oop.util.PizzaFactory;

/**
 * Demonstrating how decorative design pattern works.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Pizza pizzaWithMozzarella = PizzaFactory.makeDecorator('M', PizzaFactory.makePizza('P'));

        System.out.println("Making a pizza with mozzarella... ");
        System.out.println("Ingredients: " + pizzaWithMozzarella.getDescription());
        System.out.println("Total cost: " + pizzaWithMozzarella.getCost());

        Pizza pizzaWithSauce = PizzaFactory.makeDecorator('S', PizzaFactory.makePizza('T'));

        System.out.println("\nMaking a 3 cheese pizza with tomato suace... ");
        System.out.println("Ingredients: " + pizzaWithSauce.getDescription());
        System.out.println("Total cost: " + pizzaWithSauce.getCost());

        Pizza pizza = PizzaFactory.makeDecorator('S', PizzaFactory.makeDecorator('M', PizzaFactory.makePizza('P')));

        System.out.println("\nMaking a pizza with tomato suace and mozzarella... ");
        System.out.println("Ingredients: " + pizza.getDescription());
        System.out.println("Total cost: " + pizza.getCost());
    }
}
