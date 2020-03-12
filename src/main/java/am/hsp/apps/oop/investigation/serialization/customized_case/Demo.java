package main.java.am.hsp.apps.oop.investigation.serialization.customized_case;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Using customized serialization, we can retrieve the value of the transient
 * variable. Here is the demonstration.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Account account = new Account("Anna", "AA");
        System.out.println(account.getUserName() + " - " + account.getPassword());

        try {
            serialize(account, "customized.ser");
            deserialize("customized.ser");
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
    private static void serialize(Account account, String fileName) throws FileNotFoundException, IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {

            /*
             * Whenever we serialize an object, JVM will check whether the corresponding
             * class contains writeObject() and readObject() methods. If it contains, JVM
             * will simply execute that ones.
             */
            output.writeObject(account);
            
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
            Account deserializedAccount = (Account) input.readObject();

            System.out.println(deserializedAccount.getUserName() + " - " + deserializedAccount.getPassword());
        }
    }
}
