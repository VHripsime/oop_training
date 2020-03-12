package main.java.am.hsp.apps.oop.investigation.io.file;

import java.io.File;
import java.io.IOException;

/**
 * Trying to create and delete files and directories...
 * 
 * @author user
 *
 */
public class CreatingFiles {

    public static void main(String[] args) {

        try {
            createFile("abc.txt");
            createDirectory("Library");
            createFileInGivenDirectory("C:/Users/user/Desktop", "Invest");

            System.out.println();

            delete("abc.txt");
            delete("Library");
            delete("C:/Users/user/Desktop/Invest");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(String fileName) throws IOException {
        /*
         * This line won't create an abc.txt file. If there is a file with this name,
         * then it will refer to that file, otherwise we just create a File object,
         * which can represent a file named abc.txt.
         */
        File file = new File(fileName);
        System.out.println("Is there already a file named " + fileName + "?: " + file.exists());

        // The file physically will be created at this line.
        file.createNewFile();
        System.out.println("Did we succeed in creating a file named " + fileName + "?: " + file.exists());
    }

    private static void createDirectory(String directoryName) {
        // Java File can be also used to create directories.
        File directory = new File(directoryName);
        System.out.println("\nIs there already a directory named " + directoryName + "?: " + directory.exists());

        // This line makes a directory named "Library".
        directory.mkdir();
        System.out
                .println("Did we succeed in creating a directory named " + directoryName + "?: " + directory.exists());
    }

    private static void createFileInGivenDirectory(String directoryName, String fileName) throws IOException {
        File file = new File(directoryName, fileName);
        file.createNewFile();
        System.out.println("\nDid we succeed in creating " + fileName + " in " + directoryName + "?: " + file.exists());
        System.out.println("Show the file path: " + file.getAbsolutePath());
    }

    private static void delete(String fileName) {
        File file = new File(fileName);
        System.out.println("Is " + fileName + " file deleted?: " + file.delete());
    }
}
