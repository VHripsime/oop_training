package main.java.am.hsp.apps.oop.investigation.collections.map.hashmap;

/**
 * Contains attributes characterizing the player.
 * 
 * @author hripsime
 *
 */
public class Player {

    private String name;
    private int score;

    /**
     * Constructor for initializing its members by the given inputs.
     * 
     * @param name
     * @param score
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Returns the player's name.
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the player's name.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the player's score.
     * 
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the player's score.
     * 
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }
}
