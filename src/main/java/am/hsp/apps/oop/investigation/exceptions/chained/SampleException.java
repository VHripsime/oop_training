package main.java.am.hsp.apps.oop.investigation.exceptions.chained;

public class SampleException extends RuntimeException {

    private static final long serialVersionUID = 3053874402794674345L;

    public SampleException(String message, Throwable e) {
        super(message, e);
    }

    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            throw new SampleException("My Exception", e);
        }
    }
}
