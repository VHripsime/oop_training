package main.java.am.hsp.apps.oop.investigation.generics.inheritance.type_comparison;

public class Demo {

    public static void main(String[] args) {

        A<Integer> integerParentObject = new A<Integer>(88);
        B<Integer> integerChildObject = new B<Integer>(99);
        B<String> stringChildObject = new B<String>("Generics Test");

        /**
         * We can cast one instance of a generic class into another only if the
         * two are compatible and their type arguments are the same.
         */
        A<Integer> firstObject = (A<Integer>) integerChildObject;
        // A<Integer> secondObject = (A<Long>) integerChildObject;
        // A<Number> secondObject = (A<Long>) integerChildObject;

        if (integerChildObject instanceof B<?>) {
            System.out.println("integerChildObject is instance of B<?>");
        }

        if (integerChildObject instanceof A<?>) {
            System.out.println("integerChildObject is instance of A<?>");
        }

        if (stringChildObject instanceof B<?>) {
            System.out.println("stringChildObject is instance of B<?>");
        }

        if (stringChildObject instanceof A<?>) {
            System.out.println("stringChildObject is instance of A<?>");
        }

        if (integerParentObject instanceof A<?>) {
            System.out.println("integerParentObject is instance of A<?>");
        }

        /*
         * The following can't be compiled, because generic type info does not
         * exist at run time. There is no way for instanceof to know if
         * integerChildObject is an instance of B<Integer> or not.
         */
        // if (integerChildObject instanceof B<Integer>) {
        // System.out.println("integerChildObject is instance of B<Integer>");
        // }
    }
}
