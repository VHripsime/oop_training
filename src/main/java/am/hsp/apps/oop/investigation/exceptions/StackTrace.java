package main.java.am.hsp.apps.oop.investigation.exceptions;

/**
 * The stack trace starts with the method, which has thrown the exception at
 * first.
 * 
 * @author hripsime
 *
 */
public class StackTrace {

    public static void method1() throws Exception {
        throw new Exception();
    }

    public static void method2() {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        method2();
    }

}
