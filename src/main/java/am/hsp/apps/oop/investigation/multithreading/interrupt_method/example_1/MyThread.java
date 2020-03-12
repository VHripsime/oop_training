package main.java.am.hsp.apps.oop.investigation.multithreading.interrupt_method.example_1;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Whenever we're calling interrupt() on thread with a non-sleeping or
 * non-waiting state, then there will be no impact.
 * 
 * Interrupt call will be waited until target thread enter into sleeping or
 * waiting state.
 * 
 * If the target thread never enters into sleeping or waiting state in his
 * lifetime, then there is no impact of the interrupt call.
 * 
 * @author user
 *
 */
public class MyThread implements Runnable {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");            
        }

        System.out.println("Going to sleep.");
        ThreadUtil.sleep(1000);
    }
}
