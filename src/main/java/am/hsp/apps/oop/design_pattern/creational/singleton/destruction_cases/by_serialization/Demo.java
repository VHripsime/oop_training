package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Destroying the singleton pattern by serializing the class and trying to do
 * the same after recovering the issue.
 * 
 * @author hripsime
 *
 */
public class Demo {

    private static final String FILE_NAME_FOR_DESTROYABLE_OBJECT = "destroyableSingleton.ser";
    private static final String FILE_NAME_FOR_UNDESTROYABLE_OBJECT = "undestroyableSingleton.ser";

    public static void main(String[] args) throws Exception {

        System.out.println("Showing how serialization destroys the singleton pattern:");
        destroy();

        System.out.println("\nDestruction test after the recovery:");
        destroyAfterRecovery();
    }

    /**
     * Shows how the serialization destroys the singleton pattern.
     * 
     * @throws Exception
     */
    private static void destroy() throws Exception {
        SerializableSingleton instanceOne = SerializableSingleton.getInstance();
        storeState(instanceOne, FILE_NAME_FOR_DESTROYABLE_OBJECT);
        SerializableSingleton instanceTwo = (SerializableSingleton) deserializeObject(FILE_NAME_FOR_DESTROYABLE_OBJECT);

        System.out.println("Hashcode of the serialized object: " + instanceOne.hashCode());
        System.out.println("Hashcode of the deserialized object: " + instanceTwo.hashCode());
    }

    /**
     * Shows, that the issue is recovered after implementing the readResolve()
     * method.
     * 
     * @throws Exception
     */
    private static void destroyAfterRecovery() throws Exception {
        RecoveredSerializableSingleton instanceOne = RecoveredSerializableSingleton.getInstance();
        storeState(instanceOne, FILE_NAME_FOR_UNDESTROYABLE_OBJECT);
        RecoveredSerializableSingleton instanceTwo = (RecoveredSerializableSingleton) deserializeObject(
                FILE_NAME_FOR_UNDESTROYABLE_OBJECT);

        System.out.println("Hashcode of the serialized object: " + instanceOne.hashCode());
        System.out.println("Hashcode of the object after deserialization: " + instanceTwo.hashCode());
    }

    /**
     * Serializing the object...
     * 
     * @param instance
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void storeState(Object instance, String fileName) throws FileNotFoundException, IOException {
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(fileName));

        out.writeObject(instance);
        out.close();
    }

    /**
     * Deserializing the object...
     * 
     * @param fileName
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static Object deserializeObject(String fileName)
            throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInput in = new ObjectInputStream(new FileInputStream(fileName));
        Object deserializedObject = (Object) in.readObject();

        in.close();
        return deserializedObject;
    }
}