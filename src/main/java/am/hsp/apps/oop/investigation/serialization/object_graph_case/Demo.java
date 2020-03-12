package main.java.am.hsp.apps.oop.investigation.serialization.object_graph_case;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Whenever we're serializing an object, the set of all objects reachable from
 * that object will be serialized automatically.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Beehive beehive = new Beehive();

        try {
            serialize(beehive, "graph");
            deserialize("graph");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializes the object into the given file.
     * 
     * @param beehive
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void serialize(Beehive beehive, String fileName) throws FileNotFoundException, IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(beehive);
            
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
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("graph"))) {

            Beehive deserializedBeehive = (Beehive) input.readObject();
            System.out.println("The sucrose proportion in nectar is: "
                    + deserializedBeehive.getBee().getNectar().getSucroseProportion() + "%");
        }
    }
}
