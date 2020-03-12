package main.java.am.hsp.apps.oop.restaurant_producer_consumer;

/**
 * Demonstrating the cooker and waiter cooperation.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Dishes dishes = new Dishes();

        Thread cooker = new Thread(new Cooker(dishes), "cooker");
        Thread waiter = new Thread(new Waiter(dishes), "waiter");

        cooker.start();
        waiter.start();
    }
}
