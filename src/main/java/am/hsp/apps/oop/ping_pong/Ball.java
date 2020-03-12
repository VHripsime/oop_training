package main.java.am.hsp.apps.oop.ping_pong;

/**
 * Contains methods for setting and getting the field number in which the ball
 * is currently situated.
 * 
 * @author hripsime
 *
 */
public class Ball {

    private FieldNumber currentFieldNumber;

    /**
     * The default constructor.
     */
    public Ball() {
        this.currentFieldNumber = FieldNumber.FIRST;
    }

    /**
     * Returns the number of those field in which currently is the ball.
     * 
     * @return
     */
    public FieldNumber getCurrentFieldNumber() {
        return currentFieldNumber;
    }

    /**
     * Changes the current field number by the given input.
     * 
     * @param currentFieldNumber
     */
    public void setCurrentFieldNumber(FieldNumber currentFieldNumber) {
        this.currentFieldNumber = currentFieldNumber;
    }
}
