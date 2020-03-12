package main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method;

/**
 * Contains methods for making an Italian sandwich.
 * 
 * @author user
 *
 */
public class ItalianSandwich extends NonVegetarianSandwich {

    private static final String NAME = "Italian Sandwich";
    private static final String[] VEGETABLES = { "Lettuce", "Tomatoes", "Sweet Peppers" };
    private static final String[] CONDIMENTS = { "Oil", "Vinegar" };
    private static final String[] MEATS = { "Pepperoni" };
    private static final String[] CHEESES = { "Provolone" };

    /**
     * The default constructor.
     */
    public ItalianSandwich() {
        this.meatWanted = true;
        this.cheeseWanted = true;
        this.vegetableWanted = true;
        this.condimentWanted = true;

        this.name = NAME;
        this.meats = MEATS;
        this.cheeses = CHEESES;
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

    /**
     * Adds meats to the sandwich.
     */
    protected void addMeat() {
        System.out.print("\nAdded the meat: ");

        for (String meat : this.meats) {
            System.out.print(meat + COMMA);
        }
    }

    /**
     * Adds cheeses to the sandwich.
     */
    protected void addCheese() {
        System.out.print("\nAdded the cheese: ");

        for (String cheese : cheeses) {
            System.out.print(cheese + COMMA);
        }
    }
}
