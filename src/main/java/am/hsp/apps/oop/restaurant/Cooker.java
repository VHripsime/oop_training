package main.java.am.hsp.apps.oop.restaurant;

/**
 * Contains attributes identifying a cooker.
 * 
 * @author user
 *
 */
public class Cooker extends Staff{

    private boolean chiefCooker;
    private String[] certificates;
    private boolean awarenessOfSanitationStandards;

    /**
     * Checks whether the cooker is chief or not.
     * 
     * @return
     */
    public boolean isChiefCooker() {
        return chiefCooker;
    }

    /**
     * Sets whether the cooker is the chief.
     * 
     * @param chiefCooker
     */
    public void setChiefCooker(boolean chiefCooker) {
        this.chiefCooker = chiefCooker;
    }

    /**
     * Checks whether the cooker is aware of the sanitation standards.
     * 
     * @return
     */
    public boolean isAwarenessOfSanitationStandards() {
        return awarenessOfSanitationStandards;
    }

    /**
     * Sets whether the cooker is aware of the sanitation standards or not.
     * 
     * @param awarenessOfSanitationStandards
     */
    public void setAwarenessOfSanitationStandards(boolean awarenessOfSanitationStandards) {
        this.awarenessOfSanitationStandards = awarenessOfSanitationStandards;
    }

    /**
     * Returns the cooker certificates.
     * 
     * @return
     */
    public String[] getCertificates() {
        return certificates;
    }

    /**
     * Sets the cooker certificates.
     * 
     * @param certificates
     */
    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

}
