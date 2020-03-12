package main.java.am.hsp.apps.oop.investigation.multithreading.producer_consumer;

/**
 * Demonstrating how Producer-Consumer work.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {

        SingleElementBuffer buffer = new SingleElementBuffer();

        launchProducers(buffer);
        launchConsumers(buffer, 2);
    }

    /**
     * Launches three producers.
     * 
     * @param buffer
     */
    private static void launchProducers(SingleElementBuffer buffer) {
        new Thread(new Producer(1, 300, buffer)).start();
        new Thread(new Producer(100, 500, buffer)).start();
        new Thread(new Producer(1000, 700, buffer)).start();

    }

    /**
     * Launches the consumers by the given number.
     * 
     * @param buffer
     */
    private static void launchConsumers(SingleElementBuffer buffer, int count) {
        for (int i = 0; i < count; i++) {
            new Thread(new Consumer(buffer)).start();
        }
    }
}
