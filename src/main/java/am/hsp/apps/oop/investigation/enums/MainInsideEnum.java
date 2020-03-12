package main.java.am.hsp.apps.oop.investigation.enums;

/**
 * We can run the main() method from the enum class.
 * 
 * @author user
 *
 */
public enum MainInsideEnum {
    WORD1, WORD2;

    public void test() {
        System.out.println("In enum");
    }

    public static void main(String[] args) {
        MainInsideEnum.WORD1.test();        
    }
}
