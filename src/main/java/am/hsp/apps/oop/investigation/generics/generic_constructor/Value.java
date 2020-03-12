package main.java.am.hsp.apps.oop.investigation.generics.generic_constructor;

/**
 * It is possible for constructors to be generic, even if their class is not.
 * 
 * @author hripsime
 *
 */
public class Value {

    private double number;

    /**
     * Constructor for initializing the member by the given input.
     * 
     * @param number
     */
    public <T extends Number> Value(T number) {
        this.number = number.doubleValue();
    }

    /**
     * Returns the number.
     * 
     * @return
     */
    public double getNumber() {
        return this.number;
    }
}
