package main.java.am.hsp.apps.oop.investigation.multithreading.play_accordion;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * 
 * @author hripsime
 *
 */
public class Demo {

    public static void main(String[] args) {

        playAccordion();
    }

    /**
     * Prints the combined columns.
     */
    private static void playAccordion() {
        for (int i = 0; i < 3; i++) {
            printFirstColumn();
            printSecondColumn();
        }
    }

    /**
     * Prints the first column.
     */
    private static void printFirstColumn() {
        Thread threadA = new Thread(new PrintThread("A     .", 99));
        Thread threadB = new Thread(new PrintThread(".     B", 100));

        ThreadUtil.start(threadA, threadB);
        ThreadUtil.join(threadA, threadB);

        System.out.println("-------");
    }

    /**
     * Prints the second column.
     */
    private static void printSecondColumn() {
        Runnable threadC = new PrintThread("   C   ", 1);
        threadC.run();

        System.out.println("-------");
    }
}
