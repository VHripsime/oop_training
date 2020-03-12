package main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method;

import main.java.am.hsp.apps.oop.util.SandwichFactory;

/**
 * Demonstrating different types of sandwiches.
 * 
 * @author user
 *
 */
public class SandwichDemo {

    private static final char ITALIAN_SANDWICH = 'I';
    private static final char VEGETABLE_SANDWICH = 'V';

    public static void main(String[] args) {
        Sandwich italianSandwich = SandwichFactory.create(ITALIAN_SANDWICH);
        italianSandwich.make();

        System.out.println();

        Sandwich vegetableSandwich = SandwichFactory.create(VEGETABLE_SANDWICH);
        vegetableSandwich.make();
    }
}