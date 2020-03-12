package main.java.am.hsp.apps.oop.restaurant_producer_consumer;

/**
 * Contains methods for getting and setting the meal id. We distinguish meals by
 * their ids.
 * 
 * @author user
 *
 */
public class Meal {

    private int orderId;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param orderId
     */
    public Meal(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Returns the meal's order id.
     * 
     * @return
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the meal id by the given input.
     * 
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
