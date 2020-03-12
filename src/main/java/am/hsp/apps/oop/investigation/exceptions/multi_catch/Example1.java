package main.java.am.hsp.apps.oop.investigation.exceptions.multi_catch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.InputMismatchException;

/**
 * As we see the caught exception is IOException, though we called mightThrow()
 * method to reassign it to another exception type. The reason is, that in
 * multi-catch block the exception(e) is final.
 * 
 * @author hripsime
 *
 */
public class Example1 {

    public static void main(String[] args) {

        try {
            call();
        } catch (FileNotFoundException | IllegalStateException e) {
            System.out.println(e.toString());
        } catch (InputMismatchException | IOException e) {
            mightThrow(e);
            System.out.println(e.toString());
        }
    }

    public static void call() throws IOException, DateTimeException {
        throw new IOException();
    }

    public static void mightThrow(Exception e) {
        System.out.println("Inside mightThrow() method");
        e = new Exception();
    }
}
