package main.java.am.hsp.apps.oop.util;

import main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method.ItalianSandwich;
import main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method.Sandwich;
import main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method.VegetarianSandwich;

/**
 * Contains a method for creating sandwiches.
 * 
 * @author user
 *
 */
public final class SandwichFactory {

    private static final char ITALIAN_SANDWICH = 'I';
    private static final char VEGETABLE_SANDWICH = 'V';

    /**
     * Returns the specific sandwich according to the input type.
     * 
     * @param sandwichType
     * @return
     */
    public static final Sandwich create(char sandwichType) {
        switch (sandwichType) {

        case ITALIAN_SANDWICH:
            return new ItalianSandwich();

        case VEGETABLE_SANDWICH:
            return new VegetarianSandwich();

        default:
            return null;
        }

    }
}
