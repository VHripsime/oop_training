package main.java.am.hsp.apps.oop.investigation.generics.generic_classes.with_one_type_parameter;

public class Demo {

    public static void main(String[] args) {

        printData("address: 41-2");
        printData(412);
        printData(41.201);

        /*
         * The type argument passed to the type parameter must be a reference
         * type. We cannot use a primitive type.
         */
        // Information<int> info = new Information<int>(1);
    }

    /**
     * Prints the details of the data.
     * 
     * @param <T>
     * 
     * @param type
     * @param argument
     */
    private static <T> void printData(T argument) {
        System.out.println("generic");
        Information<T> info = new Information<T>(argument);

        info.showType();
        System.out.println(info.getData() + "\n");
    }

    /**
     * This is a non-genereic overloaded method of the above one. For the 3-rd
     * row in the main method, this version of print data will be called.
     * 
     * @param argument
     */
    private static void printData(Double argument) {
        System.out.println("non-generic");
        Information<Double> info = new Information<Double>(argument);

        info.showType();
        System.out.println(info.getData() + "\n");
    }
}
