package main.java.am.hsp.apps.oop.investigation.multithreading.producer_consumer;

/**
 * Designs an object, which can consume an element from the given buffer.
 * 
 * @author user
 *
 */
public class Consumer implements Runnable {

    private final SingleElementBuffer buffer;

    /**
     * Constructor for initializing the buffer by the given input.
     * 
     * @param buffer
     */
    public Consumer(SingleElementBuffer buffer) {
        this.buffer = buffer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        while (true) {
            System.out.println("Consumed: " + buffer.get());
        }
    }
}
