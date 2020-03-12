package main.java.am.hsp.apps.oop.investigation.io.print_writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * The main advantage of the PrintWriter class is, that its' object can write
 * any type of primitive data to the file.
 * 
 * @author user
 *
 */
public class ForFile {

    public static void main(String[] args) {

        try {
            write("PrintWriter");
            delete("PrintWriter");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(String fileName) throws IOException {
        /*
         * PrintWriter can communicate with the file both directly or via some Writer
         * object.
         */
        try (PrintWriter out = new PrintWriter(fileName)) {
            char[] symbols = { 't', 'h', 'e', ' ' };

            out.println("Investigating:");
            out.print(symbols);
            out.print("PrintWriter ");
            out.write("cl");
            out.write(97);
            out.println("ss.");
            out.println();
            out.println("Can this method recieve boolean type?: " + true);
            out.println("Trying to recieve double type: " + 10.23);

            out.flush();
        }
    }

    /**
     * Deletes the file with the given name.
     * 
     * @param fileName
     */
    private static void delete(String fileName) {
        new File(fileName).delete();
    }
}
