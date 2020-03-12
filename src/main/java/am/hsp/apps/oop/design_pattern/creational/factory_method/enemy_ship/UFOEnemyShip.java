package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship;

/**
 * Initializes the UFO ship type.
 * 
 * @author user
 *
 */
public class UFOEnemyShip extends EnemyShip {
    
    private static final String SHIP_TYPE_NAME = "UFO Enemy Ship";
    private static final int DAMAGE_AMOUNT = 20;

    /**
     * Constructor for initializing its' members.
     */
    public UFOEnemyShip() {
        this(SHIP_TYPE_NAME, DAMAGE_AMOUNT);
    }

    /**
     * Constructor for initializing its' members by calling the parent constructor.
     */
    public UFOEnemyShip(String name, int amount) {
        super(name, amount);
    }
}
