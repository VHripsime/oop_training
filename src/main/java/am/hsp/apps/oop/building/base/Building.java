package main.java.am.hsp.apps.oop.building.base;

/**
 * Contains attributes general for all building types.
 * 
 * @author hripsime
 *
 */
public abstract class Building {
    protected double surface;
    protected double height;
    protected String materialType;
    protected int constructionYear;
    protected double seismicResistanceDegree;
    protected int amortizationYears;    
    protected Roof roof;
}
