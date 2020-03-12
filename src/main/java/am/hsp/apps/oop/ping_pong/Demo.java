package main.java.am.hsp.apps.oop.ping_pong;

/**
 * Demonstrating how the two players play the ping-pong game.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Ball ball = new Ball();

        Thread firstPlayer = new Thread(new Player(ball, FieldNumber.FIRST), "First player");
        Thread secondPlayer = new Thread(new Player(ball, FieldNumber.SECOND), "Second player");

        firstPlayer.start();
        secondPlayer.start();
    }
}
