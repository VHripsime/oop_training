package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship;

/**
 * Initializes the Rocket ship type.
 * 
 * @author user
 *
 */
public class RocketEnemyShip extends EnemyShip {

    private static final String SHIP_TYPE_NAME = "Rocket Enemy Ship";
    private static final int DAMAGE_AMOUNT = 60;

    /**
     * Constructor for initializing its' members.
     */
    public RocketEnemyShip() {
        this(SHIP_TYPE_NAME, DAMAGE_AMOUNT);        
    }
    
    /**
     * Constructor for initializing its' members by calling the parent constructor.
     */
    public RocketEnemyShip(String name, int amount) {
        super(name, amount);
    }
}