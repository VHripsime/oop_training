package main.java.am.hsp.apps.oop.investigation.io.file;

import java.io.File;

/**
 * Contains a method, which shows the names of the files and directories present
 * in "oop_training" directory. Also specifies the number of files and
 * directories in it.
 * 
 * @author user
 *
 */
public class GettingFiles {

    public static void main(String[] args) {

        printFilesAndDirectories("C:/Users/user/workspace/oop_training");
    }

    private static void printFilesAndDirectories(String path) {
        File directory = new File(path);
        String[] files = directory.list();
        int filesCount = 0;
        int directoriesCount = 0;

        for (String name : files) {
            System.out.println(name);

            if (isFile(name)) {
                filesCount++;
            } else {
                directoriesCount++;
            }
        }

        System.out.println("\nTotal number of files: " + filesCount);
        System.out.println("Total number of directories: " + directoriesCount);
    }

    /**
     * Checks whether there is a file with the given name.
     * 
     * @param name
     * @return
     */
    private static boolean isFile(String name) {
        return new File(name).isFile();
    }
}
