package main.java.am.hsp.apps.oop.design_pattern.structural.adapter;

/**
 * Contains methods for the adaptation of the robot and attacker classes.
 * 
 * @author hripsime
 *
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot enemyRobot;

    /**
     * Constructor for initializing the robot instance member according to the
     * input object.
     * 
     * @param enemyRobot
     */
    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.adapter.EnemyAttacker#
     * fireWeapon( int)
     */
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.adapter.EnemyAttacker#
     * driveForward( int)
     */
    public void driveForward() {
        enemyRobot.walkForward();
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.adapter.EnemyAttacker#
     * assignDriver( java.lang.String)
     */
    public void assignDriver() {
        enemyRobot.reactToHuman();
    }
}
