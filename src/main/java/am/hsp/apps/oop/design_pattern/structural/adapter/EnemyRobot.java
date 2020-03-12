package main.java.am.hsp.apps.oop.design_pattern.structural.adapter;

/**
 * Contains methods which describe the robot opportunities.
 * 
 * @author hripsime
 *
 */
public class EnemyRobot {

    private int attackDamage;
    private int movement;
    private String robotCommander;

    /**
     * Constructor for initializing the robot instance members according to the
     * input features.
     * 
     * @param attackDamage
     * @param movement
     * @param driverName
     */
    public EnemyRobot(int attackDamage, int movement, String driverName) {
        this.attackDamage = attackDamage;
        this.movement = movement;
        this.robotCommander = driverName;
    }

    /**
     * Shows how much damages can the robot cause.
     * 
     * @param attackDamage
     */
    public void smashWithHands() {
        System.out.println("Enemy robot causes " + this.attackDamage + " damages with hands.");
    }

    /**
     * Shows the how many steps the robot has done.
     * 
     * @param movement
     */
    public void walkForward() {
        System.out.println("Enemy robot walks forward by " + this.movement + " steps.");
    }

    /**
     * Shows whom the robot obeys.
     */
    public void reactToHuman() {
        System.out.println("The robot follows to the " + this.robotCommander + "'s commandments.");
    }

    /**
     * Returns the damage measure of the robot.
     * 
     * @return
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * Returns the many steps the robot does in one movement.
     * 
     * @return
     */
    public int getMovement() {
        return movement;
    }

    /**
     * Returns the robot commander's name.
     * 
     * @return
     */
    public String getRobotCommander() {
        return robotCommander;
    }
}
