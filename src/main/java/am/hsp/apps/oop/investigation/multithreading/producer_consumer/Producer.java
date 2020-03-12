package main.java.am.hsp.apps.oop.investigation.multithreading.producer_consumer;

/**
 * Designs an object, which can produce an element and put it in the given
 * buffer.
 * 
 * @author user
 *
 */
public class Producer implements Runnable {

    private int startValue;
    private int period;
    private final SingleElementBuffer buffer;

    /**
     * Constructor for initializing the members by the given inputs.
     * 
     * @param startValue
     * @param period
     * @param buffer
     */
    public Producer(int startValue, int period, SingleElementBuffer buffer) {
        this.startValue = startValue;
        this.period = period;
        this.buffer = buffer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        while (true) {
            try {
                System.out.println("Produced: " + startValue);
                buffer.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
