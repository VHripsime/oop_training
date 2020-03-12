package main.java.am.hsp.apps.oop.investigation.io.file_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Trying to write in a file using FileOutputStream class, which creates byte
 * streams linked to the file. FileOutputStream is meant for writing streams of
 * raw bytes such as image data. If we want to write streams of characters, we
 * can go for the FileWriter.
 * 
 * @author user
 *
 */
public class WriteDemo {

    public static void main(String[] args) {

        try {
            write("FileOutputStream");
            delete("FileOutputStream");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(String fileName) throws IOException {
        try (FileOutputStream out = new FileOutputStream(fileName)) {
            out.write(99);
            out.write('l');
            out.write(97);
            out.write('s');
            out.write('s');

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
