package main.java.am.hsp.apps.oop.restaurant_producer_consumer;

/**
 * Provides methods for realizing the serving process.
 * 
 * @author user
 *
 */
public class Waiter implements Runnable {

    private Dishes dishes;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param dishes
     */
    public Waiter(Dishes dishes) {
        this.dishes = dishes;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        while (true) {
            synchronized (dishes) {
                while (dishes.checkWhetherDishesAreEmpty()) {
                    wait(dishes);
                }

                serve();
                dishes.notifyAll();
            }
        }
    }

    /**
     * Serves the latest ready meal.
     */
    private void serve() {
        System.out.println(getThreadName() + ": number " + dishes.getLatestMealId() + " meal is served");

        dishes.consumeMeal();
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
