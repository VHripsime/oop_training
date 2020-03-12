package main.java.am.hsp.apps.oop.investigation.io.file_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Contains methods which represent how to read a file in two ways.
 * 
 * @author user
 *
 */
public class ReadDemo {

    public static void main(String[] args) {

        try {
            writeFile("FileReader");

            System.out.println("Reading the file with read() method:");
            readFileWithFirstApproach("FileReader");

            System.out.println("\nReading the file with read(char[] array) method:");
            readFileWithSecondApproach("FileReader");

            delete("FileReader");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(String fileName) throws IOException {
        try (FileWriter file = new FileWriter(fileName)) {
            file.write("Investigating the FileReader class.\n");
        }
    }

    /**
     * Trying to read the file using read() method.
     * 
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void readFileWithFirstApproach(String fileName) throws IOException {
        try (FileReader fileReader = new FileReader(fileName)) {
            int i = fileReader.read();

            while (i != -1) {
                System.out.print((char) i);
                i = fileReader.read();
            }
        }
    }

    /**
     * Trying to read the file using read(char[] array) method.
     * 
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void readFileWithSecondApproach(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);

        try (FileReader fileReader = new FileReader(file)) {
            char[] symbols = new char[(int) file.length()];

            // Fills the characters from the file into the symbols array.
            fileReader.read(symbols);
            printCharArray(symbols);
        }
    }

    /**
     * Prints the given array of characters.
     * 
     * @param array
     */
    private static void printCharArray(char[] array) {
        for (char symbol : array) {
            System.out.print(symbol);
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
