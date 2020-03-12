package main.java.am.hsp.apps.oop.investigation.serialization.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Here we're observing the externalization. Externalizable is the child of the
 * Serializable interface. When we want to save only part of the object, then
 * externalization is the best choice.
 * 
 * @author user
 *
 */
public class Card implements Externalizable {

    private String holderName;

    /*
     * In externalization transient keyword doesn't play any role. As those
     * variables, which we don't want to save, we can simply skip them in
     * writeExternal() method.
     */
    private transient int expirationYear;
    private String number;
    private int cvv;

    /**
     * At the time of deserialization JVM will create will create a separate new
     * object by executing public no-arg constructor.
     */
    public Card() {
        this.cvv = 777;
    }

    /**
     * Constructor for initializing the members by the given inputs.
     * 
     * @param holderName
     * @param expirationYear
     * @param number
     * @param cvv
     */
    public Card(String holderName, int expirationYear, String number, int cvv) {
        this.holderName = holderName;
        this.expirationYear = expirationYear;
        this.number = number;
        this.cvv = cvv;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.Externalizable#writeExternal(java.io.ObjectOutput)
     */
    public void writeExternal(ObjectOutput output) throws IOException {
        output.writeObject(holderName);
        output.writeInt(expirationYear);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.Externalizable#readExternal(java.io.ObjectInput)
     */
    public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException {
        holderName = (String) input.readObject();
        expirationYear = input.readInt();
    }

    /**
     * Returns the cardholder's name.
     * 
     * @return
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * Returns the card's expiration year.
     * 
     * @return
     */
    public int getExpirationYear() {
        return expirationYear;
    }

    /**
     * Returns the card's cvv.
     * 
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     * Returns the card's cvv.
     * 
     * @return
     */
    public int getCvv() {
        return cvv;
    }
}