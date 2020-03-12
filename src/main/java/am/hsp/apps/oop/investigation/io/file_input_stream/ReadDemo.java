package main.java.am.hsp.apps.oop.investigation.io.file_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Trying to read a file using FileInputStream class, which creates byte streams
 * linked to the file. The difference between FileInputStream and FileReader is,
 * that FileInputStream reads the file byte by byte and FileReader reads the
 * file character by character.
 * 
 * @author user
 *
 */
public class ReadDemo {

    public static void main(String[] args) {

        try {
            write("FileInputStream");
            read("FileInputStream");
            delete("FileInputStream");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(String fileName) throws IOException {
        try (FileWriter file = new FileWriter(fileName)) {
            file.write("Investigating:" + "\n" + "the FileInputStream class.");
        }
    }

    private static void read(String fileName) throws IOException {
        try (FileInputStream input = new FileInputStream(fileName)) {
            int symbol = input.read();

            while (symbol != -1) {
                System.out.print((char) symbol);
                symbol = input.read();
            }
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
