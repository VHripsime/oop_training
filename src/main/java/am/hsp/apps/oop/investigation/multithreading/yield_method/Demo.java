package main.java.am.hsp.apps.oop.investigation.multithreading.yield_method;

/**
 * In the below program, the main thread execution completion is high. Though
 * some platforms don't provide proper support for the yield() method.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.start();

        for (int i = 0; i < 10; i++) {
            Thread.yield();
            System.out.println("Main thread");
        }
    }
}
