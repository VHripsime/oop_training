package main.java.am.hsp.apps.oop.investigation.serialization;

import java.io.Serializable;

/**
 * Contains the attributes for the profile information.
 * 
 * @author hripsime
 *
 */
public class Profile implements Serializable {

    /*
     * Static variable isn't part of the object => it doesn't participate in
     * serialization. Hence, there is no use declaring it as transient.
     */
    private static final transient String MESSAGE = "Personal Information:\n";
    private static final long serialVersionUID = 4494437250395648717L;

    private int id;
    private String firstName;
    private String lastName;
    
    /*
     * JVM will ignore the original value and will save the default value to the
     * file.
     */
    private transient String password;
    
    /*
     * Final variables will participate in serialization directly by value => there
     * is no use to declare it as transient.
     */
    private transient final String profession = "No Matter";

    /**
     * Constructor for setting the fields according to the given inputs.
     * 
     * @param id
     * @param birthDay
     * @param firstName
     * @param lastName
     */
    public Profile(String firstName, String lastName, int id, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return (MESSAGE + this.firstName + " " + this.lastName + ", id = " + this.id + ", password = " + this.password
                + ", profession = " + this.profession);
    }

    /**
     * Returns the id.
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the first name.
     * 
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name.
     * 
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the password.
     * 
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param lastName
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the info about profession.
     * 
     * @return
     */
    public String getProfession() {
        return this.profession;
    }
}