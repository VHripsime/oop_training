package main.java.am.hsp.apps.oop.design_pattern.structural.adapter;

/**
 * Demonstrating the enemy attackers.
 * 
 * @author hripsime
 *
 */
public class Demo {

    private static final char TANK_ATTACKER = 'T';
    private static final char ROBOT_ATTACKER = 'R';

    public static void main(String[] args) throws Throwable{

        EnemyAttacker tank = makeEnemyAttacker('T', 3, 4, "TankDriver");
        launchAttacker(tank);

        System.out.println();

        EnemyAttacker robot = makeEnemyAttacker('R', 1, 2, "RobotCommander");
        launchAttacker(robot);
    }

    /**
     * Returns an object corresponding to the input attacker type.
     * 
     * @param attackerType
     * @param attackDamage
     * @param movement
     * @param driverName
     * @return
     */
    private static EnemyAttacker makeEnemyAttacker(char attackerType, int attackDamage, int movement,
            String driverName) {
        switch (attackerType) {

        case TANK_ATTACKER:
            return new EnemyTank(attackDamage, movement, driverName);

        case ROBOT_ATTACKER:
            return new EnemyRobotAdapter(new EnemyRobot(attackDamage, movement, driverName));

        default:
            return null;
        }
    }

    /**
     * Shows the features of the attacker.
     * 
     * @param attacker
     */
    private static void launchAttacker(EnemyAttacker attacker) {
        attacker.fireWeapon();
        attacker.driveForward();
        attacker.assignDriver();
    }
}
