package main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method;

/**
 * Contains methods necessary for making a sandwich.
 * 
 * @author user
 *
 */
public abstract class Sandwich {

    protected static final String COMMA = ", ";

    protected String name;
    protected boolean vegetableWanted;
    protected boolean condimentWanted;
    protected String[] vegetables;
    protected String[] condiments;

    /**
     * Shows how the sandwich has been made.
     */
    public final void make() {
        System.out.println("The " + this.name + " is being made...");

        cutBun();
        addComponents();
        wrapSandwich();
    }

    /**
     * Prints the message about the bun cutting.
     */
    private void cutBun() {
        System.out.print("The bun is cut.");
    }

    /**
     * Adds the ingredients in the sandwich.
     */
    protected void addComponents() {
        if (vegetableWanted) {
            addVegetables();
        }

        if (condimentWanted) {
            addCondiments();
        }
    }

    /**
     * Adds vegetables to the sandwich.
     */
    protected abstract void addVegetables();

    /**
     * Adds condiments to the sandwich.
     */
    protected abstract void addCondiments();

    /**
     * Wraps the sandwich.
     */
    private void wrapSandwich() {
        System.out.println("\nThe sandwich is ready.");
    }

    /**
     * Returns the sandwich name.
     * 
     * @return
     */
    public String getSandwichName() {
        return name;
    }

    /**
     * Returns the vegetables types used in sandwich.
     * 
     * @return
     */
    public String[] getVegetables() {
        return vegetables;
    }

    /**
     * Returns the condiment types used in sandwich.
     * 
     * @return
     */
    public String[] getCondiments() {
        return condiments;
    }

    /**
     * Checks whether the customer wants vegetable.
     * 
     * @return
     */
    public boolean isVegetableWanted() {
        return vegetableWanted;
    }

    /**
     * Checks whether the customer wants condiments.
     * 
     * @return
     */
    public boolean isCondimentWanted() {
        return condimentWanted;
    }
}
