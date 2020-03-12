package main.java.am.hsp.apps.oop.util;

import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship.BigUFOEnemyShip;
import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship.EnemyShip;
import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship.RocketEnemyShip;
import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship.UFOEnemyShip;

/**
 * Utility class for creating a ship object.
 * 
 * @author user
 *
 */
public final class EnemyShipFactory {
    
    private static final char UFO_SHIP_TYPE = 'U';
    private static final char BIG_UFO_SHIP_TYPE = 'B';
    private static final char ROCKET_SHIP_TYPE = 'R';

    /**
     * Constructor for not allowing to initialize an object.
     */
    private EnemyShipFactory() {
    }

    /**
     * Returns an object corresponding to the input ship type.
     * 
     * @param shipType
     * @return
     */
    public static EnemyShip makeShip(char shipType) {
        switch (shipType) {

        case UFO_SHIP_TYPE:
            return new UFOEnemyShip();

        case BIG_UFO_SHIP_TYPE:
            return new BigUFOEnemyShip();

        case ROCKET_SHIP_TYPE:
            return new RocketEnemyShip();

        default:
            return null;
        }
    }
}
