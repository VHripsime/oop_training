package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship;

import java.util.Scanner;

import main.java.am.hsp.apps.oop.util.EnemyShipFactory;

/**
 * Demonstrates the result of the ship, which is being made dynamically.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        char shipType = getUserInput();
        EnemyShip ship = EnemyShipFactory.makeShip(shipType);

        ship.call();
    }

    /**
     * Returns the user's input for ship type.
     * 
     * @return
     */
    public static char getUserInput() {
        System.out.println("Please enter the ship type: U(UFO), B(Big UFO) or R(Rocket):");

        Scanner scanner = new Scanner(System.in);

        return scanner.next().charAt(0);
    }
}
