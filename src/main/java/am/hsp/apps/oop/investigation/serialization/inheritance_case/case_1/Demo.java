package main.java.am.hsp.apps.oop.investigation.serialization.inheritance_case.case_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Demonstrating serialization in case of inheritance.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.i + " ... " + b.j);

        try {
            serialize(b, "inheritance");
            deserialize("inheritance");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializes the given object into the given file.
     * 
     * @param b
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void serialize(B b, String fileName) throws FileNotFoundException, IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(b);
            
            output.flush();
        }
    }

    /**
     * Deserializes the object from the given file.
     * 
     * @param fileName
     */
    private static void deserialize(String fileName) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {

            B deserializedB = (B) input.readObject();
            System.out.println(deserializedB.i + " ... " + deserializedB.j);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
