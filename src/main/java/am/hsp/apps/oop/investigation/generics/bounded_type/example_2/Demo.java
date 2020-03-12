package main.java.am.hsp.apps.oop.investigation.generics.bounded_type.example_2;

public class Demo {

    public static void main(String[] args) {

        printResult(new Float[] { 56f, 4.5f, 78f, 9f });
        printResult(new Double[] { 56d, 4.5, 78d, 9d });
        printResult(new Integer[] { 56, 4, 78, 9 });
    }

    /**
     * Prints the given array's type and its elements' average.
     * 
     * @param array
     */
    private static <T extends Number> void printResult(T[] array) {
        Operation<T> operation = new Operation<T>(array);

        System.out.println("The type is: " + array.getClass().getSimpleName());
        System.out.println("The result is : " + operation.getAverage());
        System.out.println();
    }
}
