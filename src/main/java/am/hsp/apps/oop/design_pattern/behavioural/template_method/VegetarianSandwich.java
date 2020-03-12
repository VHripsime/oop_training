package main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method;

/**
 * Contains methods for making a vegetable sandwich.
 * 
 * @author user
 *
 */
public class VegetarianSandwich extends Sandwich {

    private static final String NAME = "Vegetarian Sandwich";
    private static final String[] VEGETABLES = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    private static final String[] CONDIMENTS = { "Oil", "Vinegar" };

    /**
     * The default constructor.
     */
    public VegetarianSandwich() {
        this.vegetableWanted = true;
        this.condimentWanted = true;

        this.name = NAME;
        this.vegetables = VEGETABLES;
        this.condiments = CONDIMENTS;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.template_method.Sandwich#
     * addVegetables()
     */
    protected void addVegetables() {
        System.out.print("\nAdded the vegetables: ");

        for (String vegetable : vegetables) {
            System.out.print(vegetable + COMMA);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.template_method.Sandwich#
     * addCondiments()
     */
    protected void addCondiments() {
        System.out.print("\nAdded the condiments: ");

        for (String condiment : condiments) {
            System.out.print(condiment + COMMA);
        }
    }
}
