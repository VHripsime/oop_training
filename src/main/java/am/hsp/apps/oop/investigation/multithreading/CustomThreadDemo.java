package main.java.am.hsp.apps.oop.investigation.multithreading;

/**
 * When we start a new thread, the JVM applies to the OS thread, which calls the
 * run() method of the thread we started. This run() method in its turn calls
 * the Runnable argument's run().
 * 
 * @author user
 *
 */
public class CustomThreadDemo extends Thread {

    /**
     * One argument constructor.
     * 
     * @param target
     */
    public CustomThreadDemo(Runnable target) {
        super(target);
    }

    public static void main(String[] args) {        

        Thread thread = new CustomThreadDemo(new Runnable() {
            public void run() {
                System.out.println("Runnable argument's run()");
            }
        });

        /*
         * CustomThreadDemo run() will be called, as we've overriden the run()
         * in CustomThreadDemo class.
         */
        thread.start();

        /*
         * In this case the main thread is calling the Thread's run(). But this
         * scenario has no any concern with multithreading.
         */
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Calls: " + Thread.currentThread().getClass().getSimpleName());
            }
        }).run();

        /*
         * After start(), the JVM calls the Thread run() method, which in its
         * turn calls the Runnable argument's run().
         */
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Runnable argument's run()");
            }
        }).start();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Thread#run()
     */
    public void run() {
        System.out.println("Customized thread's run()");
    }
}
