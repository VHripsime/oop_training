package main.java.am.hsp.apps.oop.investigation.io.buffered_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * In case of FileWriter, we've to insert the line separator(\n) manually, which
 * is varied from system to system. To overcome this issue, w'd use the
 * BufferedWriter class, which has a special method for it.
 * 
 * @author user
 *
 */
public class WriteDemo {

    public static void main(String[] args) {

        try {
            write("BufferedWriter");
            delete("BufferedWriter");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(String fileName) throws IOException {
        /*
         * BufferedWriter can't communicate directly with the file. It can communicate
         * via some Writer object.
         */
        try (FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            char[] symbols = { 't', 'h', 'e', ' ' };

            bufferedWriter.write("Investigating: ");
            bufferedWriter.newLine();
            bufferedWriter.write(symbols);
            bufferedWriter.write("BufferedWriter ");
            bufferedWriter.write(99);
            bufferedWriter.write('l');
            bufferedWriter.write(97);
            bufferedWriter.write("ss.");

            bufferedWriter.flush();
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
