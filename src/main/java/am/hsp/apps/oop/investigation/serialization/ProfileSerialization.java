package main.java.am.hsp.apps.oop.investigation.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Demonstrating how serialize and deserialize an object.
 * 
 * @author hripsime
 *
 */
public class ProfileSerialization {

    public static void main(String[] args) {

        Profile profile = new Profile("Anna", "Avetisyan", 5468147, "AA");
        System.out.println("The original object is:\n" + profile + "\n");

        try {
            serialize(profile);
            System.out.println("The deserialized object is:\n" + getDeserializedObject("restore"));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializing the given object in the file called "restore".
     * 
     * @param profile
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void serialize(Profile profile) throws FileNotFoundException, IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("restore"))) {
            output.writeObject(profile);
            
            output.flush();
        }
    }

    /**
     * Deserializing the object from the given file.
     * 
     * @param fileName
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static Profile getDeserializedObject(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Profile deserializedObject = (Profile) in.readObject();

            return deserializedObject;
        }
    }
}
