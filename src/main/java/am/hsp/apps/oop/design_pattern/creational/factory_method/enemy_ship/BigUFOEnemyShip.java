package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship;

/**
 * Initializes the Big UFO ship type.
 * 
 * @author user
 *
 */
public class BigUFOEnemyShip extends UFOEnemyShip {

    private static final String SHIP_TYPE_NAME = "Big UFO Enemy Ship";
    private static final int DAMAGE_AMOUNT = 40;

    /**
     * Constructor for initializing its' members.
     */
    public BigUFOEnemyShip() {
        this(SHIP_TYPE_NAME, DAMAGE_AMOUNT);
    }

    /**
     * Constructor for initializing its' members by calling the parent constructor.
     */
    public BigUFOEnemyShip(String name, int amount) {
        super(name, amount);
    }
}
