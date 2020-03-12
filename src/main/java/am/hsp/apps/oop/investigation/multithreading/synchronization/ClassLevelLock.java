package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization;

/**
 * While a thread is executing static synch method, the remaining threads are
 * not allowed to execute any static synch method of that class simultaneously.
 * But they are allowed to execute normal static methods, synch instance methods
 * and normal instance methods.
 * 
 * @author user
 *
 */
public class ClassLevelLock {
    
    // The following two methods are equivalent.
    public static void s1() {
        Class<?> currentClass = ClassLevelLock.class;
        synchronized (currentClass) {
            currentClass.notify();
        }
    }

    /*
     * When we write synchronized in static method declaration, then we are
     * synchronizing by the current class.
     */
    public static synchronized void s2() {
        Class<?> c = ClassLevelLock.class;
        c.notify();
    }


    /*
     * t1 thread executes this method. t2 thread can't execute this method
     * simultaneously.
     */
    public static synchronized void m1() {
    }

    // t2 thread can't execute this method until t1 releases m1().
    public static synchronized void m2() {
    }

    // t2 can execute this method.
    public static void m3() {
    }

    // t2 can execute this method.
    public synchronized void m4() {
    }

    // t2 can execute this method.
    public void m5() {
    }
}
