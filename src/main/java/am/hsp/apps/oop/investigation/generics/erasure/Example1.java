package main.java.am.hsp.apps.oop.investigation.generics.erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic concept is applicable only in compile time, but not in runtime, as at
 * compile time generic syntax in last step is being removed. Hence, generic
 * syntax won't be available for the JVM. When Java code is compiled, all
 * generic type information is removed (erased). This means replacing type
 * parameters with their bound type, which is Object if no explicit bound is
 * specified
 * 
 * @author user
 *
 */
public class Example1 {

    public static void main(String[] args) {

        /*
         * In this case the compiler sees that the list is not a generic type,
         * hence it's valid to add any type of element.
         */
        List list = new ArrayList<String>();
        list.add("winter");
        list.add(10);
        list.add(10.5);
        list.add(true);

        /*
         * The following 4 declarations are equivalent, as after the compilation
         * they all will look as the last declaration.
         */
        List stringList = new ArrayList<String>();
        List integerList = new ArrayList<Integer>();
        List doubleList = new ArrayList<Double>();
        List noTypeList = new ArrayList();

        // These two are also equivalent.
        List<String> firstStringList = new ArrayList<String>();
        List<String> secondStringList = new ArrayList();
    }
}
