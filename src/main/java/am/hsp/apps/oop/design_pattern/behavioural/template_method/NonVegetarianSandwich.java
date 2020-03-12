package main.java.am.hsp.apps.oop.design_pattern.behavioural.template_method;

/**
 * Contains methods necessary for making a non vegetarian sandwich.
 * 
 * @author hripsime
 *
 */
public abstract class NonVegetarianSandwich extends Sandwich {

    protected boolean meatWanted;
    protected boolean cheeseWanted;
    protected String[] meats;
    protected String[] cheeses;

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.template_method.Sandwich#
     * addComponents()
     */
    protected void addComponents() {
        super.addComponents();

        if (meatWanted) {
            addMeat();
        }

        if (cheeseWanted) {
            addCheese();
        }
    }

    /**
     * Adds vegetables to the sandwich.
     */
    protected abstract void addMeat();

    /**
     * Adds condiments to the sandwich.
     */
    protected abstract void addCheese();

    /**
     * Checks whether the customer wants meat.
     * 
     * @return
     */
    public boolean isMeatWanted() {
        return meatWanted;
    }

    /**
     * Checks whether the customer wants cheese.
     * 
     * @return
     */
    public boolean isCheeseWanted() {
        return cheeseWanted;
    }

    /**
     * Returns the meats used in sandwich.
     * 
     * @return
     */
    public String[] getMeats() {
        return meats;
    }

    /**
     * Returns the cheeses used in sandwich.
     * 
     * @return
     */
    public String[] getCheeses() {
        return cheeses;
    }
}
