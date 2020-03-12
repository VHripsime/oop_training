package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.enemy_ship;

/**
 * Contains attributes general to the ships.
 * 
 * @author user
 *
 */
public abstract class EnemyShip {

    protected String name;
    protected int damageAmount;

    /**
     * Default constructor
     */
    public EnemyShip() {
    }

    /**
     * Constructor for initializing its' members.
     */
    public EnemyShip(String name, int amount) {
        this.name = name;
        this.damageAmount = amount;
    }

    /**
     * Shows the opportunities of the given ship.
     */
    public void call() {
        display();
        followHeroShip();
        shoot();
    }

    /**
     * Prints that the ship follows the hero one.
     */
    public void followHeroShip() {
        System.out.println(name + " is following the hero.");
    }

    /**
     * Prints the current ship name.
     */
    public void display() {
        System.out.println(name + " is on the screen.");
    }

    /**
     * Prints the current ship name and how much it can damage.
     */
    public void shoot() {
        System.out.println(name + " attacks and does " + damageAmount + " damages.");
    }
}
