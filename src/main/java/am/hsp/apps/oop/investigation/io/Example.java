package main.java.am.hsp.apps.oop.investigation.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Contains a method, which merges the data from the two given files into a
 * third file.
 * 
 * @author user
 *
 */
public class Example {

    public static void main(String[] args) {

        try {
            createFile("First", "AAA", "BBB", "CCC");
            createFile("Second", "111", "222", "333");

            copyFirstFileIntoSecondOne("First", "Third");
            copyFirstFileIntoSecondOne("Second", "Third");

            delete("First");
            delete("Second");
            delete("Third");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Copies the first file into the second one.
     * 
     * @param fileName
     * @param writer
     * @throws IOException
     */
    private static void copyFirstFileIntoSecondOne(String firstFileName, String secondFileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(firstFileName));
                PrintWriter writer = new PrintWriter(new FileOutputStream(secondFileName, true))) {

            String line = reader.readLine();

            while (line != null) {
                writer.println(line);
                line = reader.readLine();
            }
        }
    }

    /**
     * Creates a file with the given content.
     * 
     * @param fileName
     * @param content
     * @throws FileNotFoundException
     */
    private static void createFile(String fileName, String... content) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(fileName)) {

            for (String line : content) {
                writer.println(line);
            }

            writer.flush();
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
