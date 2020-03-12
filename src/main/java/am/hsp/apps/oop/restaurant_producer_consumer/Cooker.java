package main.java.am.hsp.apps.oop.restaurant_producer_consumer;

/**
 * Provides methods for realizing the cooking process.
 * 
 * @author user
 *
 */
public class Cooker implements Runnable {

    private Dishes dishes;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param dishes
     */
    public Cooker(Dishes dishes) {
        this.dishes = dishes;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        while (true) {
            // sleep(100);
            synchronized (dishes) {
                while (dishes.checkWhetherDishesAreFull()) {
                    wait(dishes);
                }

                cook();
                dishes.notifyAll();
            }
        }
    }

    /**
     * Does the cooking process.
     */
    private void cook() {
        dishes.addMeal();

        System.out.println(getThreadName() + ": number " + dishes.getLatestMealId() + " meal is cooked");
        sleep(500);
    }

    /**
     * Returns the current thread id.
     * 
     * @return
     */
    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    /**
     * Sleeps the thread by the given time.
     * 
     * @param milliseconds
     */
    private void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Makes the thread to wait in the given object's monitor.
     * 
     * @param dish
     */
    private void wait(Dishes dish) {
        try {
            dishes.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
