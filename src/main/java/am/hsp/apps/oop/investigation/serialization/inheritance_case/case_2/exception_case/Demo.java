package main.java.am.hsp.apps.oop.investigation.serialization.inheritance_case.case_2.exception_case;

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

        B b = new B(1);
        b.j = 2;
        System.out.println(b.i + " ... " + b.j);

        try {
            serialize(b, "inheritance");
            deserialize("inheritance");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializes the given object into the given file.
     * 
     * @param b
     * @param fileName
     * @throws IOException
     */
    private static void serialize(B b, String fileName) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {

            /*
             * During serialization JVM sets non-serializable parent members to their
             * default values.
             */
            output.writeObject(b);
            output.flush();
        }
    }

    /**
     * Deserializes the object from the given file.
     * 
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void deserialize(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {

            /*
             * During deserialization JVM executes instance control flow in every
             * non-serializable parent class.
             */
            B deserializedB = (B) input.readObject();
            System.out.println(deserializedB.i + " ... " + deserializedB.j);
        }
    }
}
