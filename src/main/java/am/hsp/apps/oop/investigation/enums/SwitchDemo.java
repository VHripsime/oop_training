package main.java.am.hsp.apps.oop.investigation.enums;

/**
 * The only types applicable for switch are byte, short, char, int, Byte, Short,
 * Character, Integer, String and Enum!
 * 
 * @author hripsime
 *
 */
public class SwitchDemo {

    public static void main(String[] args) {

        /**
         * If we call the constant by the class name, we'll get a CE. *
         */
        switch (Fruit.Apple) {
        // case Fruit.Apple:
        // System.out.println("Green");
        case Apple:
            System.out.println("Green");
        case Grape:
            System.out.println("Yellow");
        default:
            break;
        }
    }
}
