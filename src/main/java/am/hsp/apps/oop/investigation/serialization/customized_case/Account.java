package main.java.am.hsp.apps.oop.investigation.serialization.customized_case;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * During the serialization there may be a chance of loss of information because
 * of the transient modifier. To recover this loss of information, we'd go for
 * the customized serialization. For this, we must implement these 2 methods:
 * writeObject() and readObject().
 * 
 * @author user
 *
 */
public class Account implements Serializable {

    private static final long serialVersionUID = -7026364448065819443L;
    private static final String ENCRIPTION = "123";

    private String userName;
    private transient String password;

    /**
     * Constructor for initializing the members by the given inputs.
     * 
     * @param userName
     * @param password
     */
    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * During serialization this method will be executed by JVM automatically. It's
     * a callback method.
     * 
     * @param output
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream output) throws IOException {
        output.defaultWriteObject();

        // Now we'll encrypt the original password and serialize it in this form.
        String encryptedPassword = ENCRIPTION + password;
        output.writeObject(encryptedPassword);
    }

    /**
     * Here is the same scenario as in the above method.
     * 
     * @param input
     * @throws ClassNotFoundException
     * @throws IOException
     */
    private void readObject(ObjectInputStream input) throws ClassNotFoundException, IOException {
        input.defaultReadObject();

        String encryptedPassword = (String) input.readObject();

        /*
         * Here we're decrypting the password and then assigning it to the original
         * password reference.
         */
        password = encryptedPassword.substring(ENCRIPTION.length());
    }

    /**
     * Returns the user name.
     * 
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Returns the password.
     * 
     * @return
     */
    public String getPassword() {
        return password;
    }
}
