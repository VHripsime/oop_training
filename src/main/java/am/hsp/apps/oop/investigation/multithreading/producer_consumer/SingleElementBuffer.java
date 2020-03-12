package main.java.am.hsp.apps.oop.investigation.multithreading.producer_consumer;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Designs a single element buffer.
 * 
 * @author user
 *
 */
public class SingleElementBuffer {

    private Integer element;

    /**
     * Puts the given element in the buffer, if it's empty. Otherwise waits until it
     * gets empty.
     * 
     * @param element
     */
    public synchronized void put(int element) {
        waitUntilEmptied();

        this.element = element;
        this.notifyAll();
    }

    /**
     * Returns the element from the buffer. If it's empty, waits until it gets full.
     * 
     * @return
     */
    public synchronized int get() {
        waitUntilFilled();

        Integer value = this.element;
        this.element = null;
        this.notifyAll();

        return value;
    }

    /**
     * Waits until the buffer emptied.
     * 
     */
    private void waitUntilEmptied() {
        while (this.element != null) {
            ThreadUtil.wait(this);
        }
    }

    /**
     * Waits until the buffer filled.
     * 
     */
    private void waitUntilFilled() {
        while (this.element == null) {
            ThreadUtil.wait(this);
        }
    }
}
