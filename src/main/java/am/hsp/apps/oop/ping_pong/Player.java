package main.java.am.hsp.apps.oop.ping_pong;

/**
 * Contains methods for enabling the current object to play the ping-pong game.
 * 
 * @author hripsime
 *
 */
public class Player implements Runnable {

    private Ball ball;
    private FieldNumber fieldNumber;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param fieldNumber
     * @param ball
     */
    public Player(Ball ball, FieldNumber fieldNumber) {
        this.ball = ball;
        this.fieldNumber = fieldNumber;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        while (true) {
            try {
                hit();
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Throws the ball to the opponent field.
     * 
     * @throws InterruptedException
     */
    private void hit() throws InterruptedException {
        synchronized (ball) {

            while (checkWhetherBallIsInOpponentField()) {
                ball.wait();
            }

            System.out.println(Thread.currentThread().getName() + " hits the ball");
            indicateThatBallNowIsInOpponentField();
            ball.notify();
        }
    }

    /**
     * Checks whether the ball is in the opponent field.
     * 
     * @return
     */
    private boolean checkWhetherBallIsInOpponentField() {
        return ball.getCurrentFieldNumber() != fieldNumber;
    }

    /**
     * Indicates that the ball is now in the opponent field.
     */
    private void indicateThatBallNowIsInOpponentField() {
        if (this.fieldNumber == FieldNumber.FIRST) {
            ball.setCurrentFieldNumber(FieldNumber.SECOND);
        } else {
            ball.setCurrentFieldNumber(FieldNumber.FIRST);
        }
    }
}
