package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_serialization;

import java.io.Serializable;

/**
 * Serialization destroys the singleton pattern. To overcome this scenario all
 * we need to do is it provide the implementation of readResolve() method.
 * 
 * 
 * @author user
 *
 */
public class RecoveredSerializableSingleton implements Serializable {

    private static final long serialVersionUID = 3300467794134010383L;

    private RecoveredSerializableSingleton() {
    }

    private static class SingletonHelper {
        private static final RecoveredSerializableSingleton INSTANCE = new RecoveredSerializableSingleton();
    }

    public static RecoveredSerializableSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private Object readResolve() {
        return getInstance();
    }
}
