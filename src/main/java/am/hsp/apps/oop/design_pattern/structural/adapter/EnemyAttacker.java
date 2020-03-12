package main.java.am.hsp.apps.oop.design_pattern.structural.adapter;

/**
 * Contains methods for describing the enemy attacker features. These are the
 * functionalities that the Client expects to work with.
 * 
 * @author hripsime
 *
 */
public interface EnemyAttacker {

    /**
     * Shows how much damages does the weapon.
     */
    public void fireWeapon();

    /**
     * Shows how the enemy attacker drives forward.
     */
    public void driveForward();

    /**
     * Shows the driver name of the enemy attacker.
     * 
     * @param driverName
     */
    public void assignDriver();
}
