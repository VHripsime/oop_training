package main.java.am.hsp.apps.oop.investigation.multithreading.interrupt_method.example_1;

/**
 * From the output we can see, that though we interrupted the thread, it
 * continues to execute.
 * 
 * @author hripsime
 *
 */
public class Demo {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.start();

        thread.interrupt();
        System.out.println("End of main");
    }
}
