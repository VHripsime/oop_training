package main.java.am.hsp.apps.oop.investigation.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Trying to serialize several objects in one file and then getting them. In
 * which order we serialize the objects, in the same order only we have to
 * deserialize them. If we violate the order we will get ClassCastException.
 * 
 * @author user
 *
 */
public class SeveralObjectsSerialization {

    public static void main(String[] args) {

        Profile profile = new Profile("Anna", "Avetisyan", 5468147, "AA");
        Integer number = new Integer(724);
        String word = new String("third object");

        try {
            serializeObjects(profile, number, word);
            deserializeObjects();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializes the given objects.
     * 
     * @param profile
     * @param number
     * @param word
     * @throws IOException
     */
    private static void serializeObjects(Profile profile, Integer number, String word) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("several_objects"))) {

            output.writeObject(profile);
            output.writeObject(number);
            output.writeObject(word);

            output.flush();
        }
    }

    /**
     * Deserializes the above 3 objects.
     * 
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void deserializeObjects() throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("several_objects"))) {

            /*
             * If we try to deserialize at first Integer object and then the profile object,
             * we'll get ClassCastException.
             */
            Profile deserializedProfile = (Profile) in.readObject();
            Integer deserializedNumber = (Integer) in.readObject();
            String deserializedWord = (String) in.readObject();

            System.out.println(deserializedProfile + "\n");
            System.out.println(deserializedNumber + "\n");
            System.out.println(deserializedWord + "\n");
        }
    }
}