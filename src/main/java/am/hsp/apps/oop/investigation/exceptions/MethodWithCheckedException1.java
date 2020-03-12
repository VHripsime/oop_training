package main.java.am.hsp.apps.oop.investigation.exceptions;

public class MethodWithCheckedException1 {

    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    /**
     * As throwOne() method throws checked exception, we can either enclose it
     * within the try-catch block or just write throws clause with that exception in
     * front of the main() method:
     * 
     * @param args
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws IllegalAccessException {
        throwOne();
    }

}
