package main.java.am.hsp.apps.oop.investigation.collections.map.hashmap.with_hashcode_equals_contract;

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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + birthYear;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeKey other = (EmployeeKey) obj;
        if (birthYear != other.birthYear)
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
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
     * Returns the employee birth year.
     * 
     * @return
     */
    public int getBirthYear() {
        return birthYear;
    }
}
