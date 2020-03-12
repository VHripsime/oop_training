package main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy;

/**
 * Contains a method indicating the flying inabilities of the animals.
 * 
 * @author user
 *
 */
public class FlyingInability implements FlyingCapability {

    private static final String STATEMENT_FOR_FLYING_INABILITY = "I can't fly!";

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.strategy.Flight#fly()
     */
    public void fly() {
        System.out.println(STATEMENT_FOR_FLYING_INABILITY);
    }
}
