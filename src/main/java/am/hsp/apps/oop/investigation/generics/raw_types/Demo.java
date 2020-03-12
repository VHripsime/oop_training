package main.java.am.hsp.apps.oop.investigation.generics.raw_types;

public class Demo {

    public static void main(String[] args) {

        Raw<Integer> integerObject = new Raw<Integer>(88);
        System.out.println(integerObject.getElement());

        Raw<String> firstStringObject = new Raw<String>("Generics Test");
        System.out.println(firstStringObject.getElement());

        /*
         * In essence, this creates a Raw object, whose type T is replaced by
         * Object.
         */
        Raw raw = new Raw(new Double(98.6));

        // Cast here is necessary because type is unknown.
        double doubleType = (Double) raw.getElement();
        System.out.println(doubleType);

        // The use of a raw type can lead to run-time exceptions.
        // int intType = (Integer) raw.getElement(); /* run-time error */

        /*
         * A variable of a generic Raw type can be assigned a reference to a raw
         * Raw object.
         */
        firstStringObject = raw; // well, but potentially wrong
        String secondStringObject = firstStringObject.getElement(); // run-time
                                                                    // error

        /*
         * A variable of a raw type can be assigned a reference to any type of
         * Raw object.
         */
        raw = integerObject; // well, but potentially wrong
        doubleType = (Double) raw.getElement(); // run-time error
    }
}
