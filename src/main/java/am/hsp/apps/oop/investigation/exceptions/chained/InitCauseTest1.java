package main.java.am.hsp.apps.oop.investigation.exceptions.chained;

import java.io.IOException;

public class InitCauseTest1 {

    public static void main(String[] args) throws Throwable {
        try {
            throw new ArithmeticException("Top Level Exception.").initCause(new IOException("IO cause."));
        } catch (ArithmeticException ae) {
            System.out.println("Caught : " + ae);
            System.out.println("Actual cause: " + ae.getCause());
        }
    }
}
