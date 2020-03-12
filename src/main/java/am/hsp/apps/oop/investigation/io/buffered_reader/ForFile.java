package main.java.am.hsp.apps.oop.investigation.io.buffered_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * In case of FileReader we can read the file only character by character, which
 * decreases the performance. That's why we'd go for BufferedReader class, which
 * object can also read the file line by line.
 * 
 * @author user
 *
 */
public class ForFile {

    public static void main(String[] args) {

        try {
            write("BufferedReader");
            read("BufferedReader");
            delete("BufferedReader");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(String fileName) throws IOException {
        try (FileWriter file = new FileWriter(fileName)) {
            file.write("Investigating:" + "\n" + "the BufferedReader class.");
        }
    }

    private static void read(String fileName) throws IOException {
        // BufferedReader can't communicate directly with the file. It can
        // communicate via some Reader object.
        try (FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
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
