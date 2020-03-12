package main.java.am.hsp.apps.oop.investigation.collections.map.hashmap.no_hashcode_equals_contract;

/**
 * Contains attributes describing the employee key.
 * 
 * @author hripsime
 *
 */
public class EmployeeKey {

    private String id;
    private int birthYear;

    /**
     * Constructor for setting the members by the given inputs.
     * 
     * @param id
     * @param birthYear
     */
    public EmployeeKey(String id, int birthYear) {
        this.id = id;
        this.birthYear = birthYear;
    }

    /**
     * Returns the employee id.
     * 
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the employee id.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the employee birth year.
     * 
     * @return
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the employee birth year.
     * 
     * @param birthYear
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
