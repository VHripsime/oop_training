package main.java.am.hsp.apps.oop.investigation.multithreading.play_accordion;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * A simple thread class, which prints the given symbol.
 * 
 * @author user
 *
 */
public class PrintThread implements Runnable {

    private int milliseconds;
    private String symbol;

    /**
     * Constructor for initializing the instance variable by the given input.
     * 
     * @param symbol
     */
    public PrintThread(String symbol, int milliseconds) {
        this.symbol = symbol;
        this.milliseconds = milliseconds;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(symbol);
            ThreadUtil.sleep(milliseconds);
        }
    }
}
