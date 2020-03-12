package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_serialization;

import java.io.Serializable;

/**
 * Sometimes we need to implement Serializable interface in Singleton class, so
 * that we can store its state in the file system and retrieve it at a later
 * point of time.
 * 
 * @author user
 *
 */
public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = 3300467794134010383L;

    private SerializableSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}