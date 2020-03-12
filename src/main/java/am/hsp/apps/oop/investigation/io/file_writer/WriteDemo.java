package main.java.am.hsp.apps.oop.investigation.io.file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

    public static void main(String[] args) {

        try {
            writeUsingOverwritingOperation("OverWriting");
            delete("OverWriting");

            writeUsingAppendingOperation("Appending");
            delete("Appending");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * If we run this method several time we'll get the same output, as this
     * constructor uses overwriting operation.
     * 
     * @param fileName
     * @throws IOException
     */
    private static void writeUsingOverwritingOperation(String fileName) throws IOException {

        // If there is no file with this name, the constructor will create it..
        try (FileWriter file = new FileWriter(fileName)) {
            char[] symbols = { 't', 'h', 'e', ' ' };

            file.write("Investigating: ");
            file.write('\n');
            file.write(symbols);
            file.write("FileWritter");
            file.write(' ');
            file.write(99);
            file.write('l');
            file.write(97);
            file.write("ss.");

            file.flush();
        }
    }

    /**
     * Now if we run this method several time we'll get the same output appended
     * to the previous output, as this constructor uses appending operation.
     * 
     * @param fileName
     * @throws IOException
     */
    private static void writeUsingAppendingOperation(String fileName) throws IOException {
        try (FileWriter file = new FileWriter(fileName, true)) {
            char[] symbols = { 't', 'h', 'e', ' ' };

            file.write("Investigating: ");
            file.write('\n');
            file.write(symbols);
            file.write("FileWritter");
            file.write(' ');
            file.write(99);
            file.write('l');
            file.write(97);
            file.write("ss.");

            file.flush();
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
