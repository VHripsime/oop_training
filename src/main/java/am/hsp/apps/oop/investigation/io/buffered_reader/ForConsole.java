package main.java.am.hsp.apps.oop.investigation.io.buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Trying to read the input from the console with help of 'System.in' variable.
 * 'System.in' refers to standard input, which is the keyboard by default.
 * 'System.in' is an object of type InputStream.
 * 
 * @author user
 *
 */
public class ForConsole {

    public static void main(String[] args) {

        System.out.println("Enter lines of text. Enter 'stop' to quit.");

        try {
            readFromConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromConsole() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = "";

            do {
                str = reader.readLine();
                System.out.println(str);
            } while (!str.equals("stop"));
        }
    }
}
