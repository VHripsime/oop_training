package main.java.am.hsp.apps.oop.design_pattern.structural.adapter;

/**
 * Contains methods which represent the tank features.
 * 
 * @author hripsime
 *
 */
public class EnemyTank implements EnemyAttacker {

    private int attackDamage;
    private int movement;
    private String driverName;

    /**
     * The default constructor.
     */
    public EnemyTank() {
    }

    /**
     * Constructor for initializing the tank instance members according to the
     * input features.
     * 
     * @param attackDamage
     * @param movement
     * @param driverName
     */
    public EnemyTank(int attackDamage, int movement, String driverName) {
        this.attackDamage = attackDamage;
        this.movement = movement;
        this.driverName = driverName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.design_pattern.adapter.EnemyAttacker#fireWeapon
     * ()
     */
    public void fireWeapon() {
        System.out.println("Enemy tank does " + this.attackDamage + " damages.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.adapter.EnemyAttacker#
     * driveForward()
     */
    public void driveForward() {
        System.out.println("Enemy tank moves " + this.movement + " spaces.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.adapter.EnemyAttacker#
     * assignDriver( java.lang.String)
     */
    public void assignDriver() {
        System.out.println(this.driverName + " is driving the tank.");
    }

    /**
     * Returns the damage measure of the tank.
     * 
     * @return
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * Returns the how the tank moves.
     * 
     * @return
     */
    public int getMovement() {
        return movement;
    }

    /**
     * Returns the tank driver's name.
     * 
     * @return
     */
    public String getDriverName() {
        return driverName;
    }

}
