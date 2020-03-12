package main.java.am.hsp.apps.oop.restaurant;

/**
 * Contains attributes related to a restaurant kitchen.
 * 
 * @author user
 *
 */
public class Kitchen {

    /*
     * It would be better to have here objects array, but for not going into the
     * details, I declared only their numbers.
     */
    private int refrigeratorNumber;
    private int ovenNumber;
    private int cupboardNumber;
    private double surface;

    /**
     * Returns the surface of the kitchen.
     * 
     * @return
     */
    public double getSurface() {
        return surface;
    }

    /**
     * Sets the surface of the kitchen.
     * 
     * @param surface
     */
    public void setSurface(double surface) {
        this.surface = surface;
    }

    /**
     * Returns the refrigerators number of the kitchen.
     * 
     * @return
     */
    public int getRefrigeratorNumber() {
        return refrigeratorNumber;
    }

    /**
     * Sets the refrigerators number of the kitchen.
     * 
     * @param refrigeratorNumber
     */
    public void setRefrigeratorNumber(int refrigeratorNumber) {
        this.refrigeratorNumber = refrigeratorNumber;
    }

    /**
     * Returns the ovens number of the kitchen.
     * 
     * @return
     */
    public int getOvenNumber() {
        return ovenNumber;
    }

    /**
     * Sets the ovens number of the kitchen.
     * 
     * @param օvenNumber
     */
    public void setOvenNumber(int OvenNumber) {
        this.ovenNumber = OvenNumber;
    }

    /**
     * Returns the cupboards number of the kitchen.
     * 
     * @return
     */
    public int getCupboardNumber() {
        return cupboardNumber;
    }

    /**
     * Sets the cupboards number of the kitchen.
     * 
     * @param cupboardNumber
     */
    public void setCupboardNumber(int cupboardNumber) {
        this.cupboardNumber = cupboardNumber;
    }

}
