package main.java.am.hsp.apps.oop.investigation.serialization.inheritance_case.case_3;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * To make subclass not Serializable, we've to implement writeObject() and
 * readObject() methods.
 * 
 * @author user
 *
 */
public class B extends A {

    private static final long serialVersionUID = 5602955474876996091L;

    public int j = 20;

    // Preventing subclass from serialization
    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException();
    }

    // Preventing subclass from deserialization
    private void readObject(ObjectInputStream in) throws IOException {
        throw new NotSerializableException();
    }
}
