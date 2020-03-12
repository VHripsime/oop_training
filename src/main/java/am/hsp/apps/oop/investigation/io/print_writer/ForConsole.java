package main.java.am.hsp.apps.oop.investigation.io.print_writer;

import java.io.PrintWriter;

/**
 * Trying to write on console using 'System.out' variable.System.out refers to
 * the standard output stream. By default, this is the console. 'System.out' is
 * an object of type PrintStream.
 * 
 * @author user
 *
 */
public class ForConsole {

    public static void main(String[] args) {

        writeInConsole();
    }

    /**
     * Printing on console...
     */
    private static void writeInConsole() {
        /*
         * The second argument guarantees that the data will be written properly. It's
         * equivalent to flush() method.
         */
        try (PrintWriter pw = new PrintWriter(System.out, true)) {

            pw.println("This is a string");
            pw.println(100);
            pw.println(4.5e-7);
        }
    }
}
