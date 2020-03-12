package main.java.am.hsp.apps.oop.investigation.serialization.externalization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * In this example we tried to serialize only the holder name and expiration
 * year.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Card card = new Card("Ann", 2020, "4678-0910", 142);
        System.out.println(card.getHolderName() + ", " + card.getExpirationYear() + ", " + card.getNumber() + ", "
                + card.getCvv());

        try {
            serialize(card, "externalization.ser");
            deserialize("externalization.ser");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializes the given object into the given file.
     * 
     * @param card
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void serialize(Card card, String fileName) throws FileNotFoundException, IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(card);
            
            output.flush();
        }
    }

    /**
     * Deserializes an object from the given file.
     * 
     * @param fileName
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    private static void deserialize(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            Card deserializedCard = (Card) input.readObject();

            System.out.println(deserializedCard.getHolderName() + ", " + deserializedCard.getExpirationYear() + ", "
                    + deserializedCard.getNumber() + ", " + deserializedCard.getCvv());
        }
    }
}
