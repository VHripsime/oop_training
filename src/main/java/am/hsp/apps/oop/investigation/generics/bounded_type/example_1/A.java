package main.java.am.hsp.apps.oop.investigation.generics.bounded_type.example_1;

/**
 * After the compilation T inside the class will be replaced with Number. T can
 * only be replaced by Number, or subclasses of Number.
 * 
 * @author user
 *
 * @param <T>
 */
public class A<T extends Number> {
}

/**
 * We cannot define the lower bound for type parameters with 'super' clause, as
 * it wouldn't get us anything. If it were possible, we would have to erase type
 * parameters to Object anyway. In this case it can take any value in place of
 * T, not only superclasses of Integer. So there's no point in using super
 * bound. Thus it is not allowed.
 */
// class B<T super Integer> {
// }

/**
 * In case of bounding with interfaces, we have still to use 'extends' keyword,
 * but not 'implements'.
 * 
 * @author user
 *
 * @param <T>
 */
class C<T extends Runnable> {
}

/**
 * We can also define bounded types in combination. In this case, the class must
 * be the first in declaration, after which we can define as many interfaces as
 * we want. Any type argument passed to T must be a subclass of Number and
 * implement Runnable & Comparable.
 * 
 * @author user
 *
 * @param <T>
 */
class D<T extends Number & Runnable & Comparable<T>> {
}

/**
 * As it expected, we can't bound type parameter with more than one class type,
 * as in Java multiple inheritance is not allowed.
 * 
 * @author user
 *
 * @param <T>
 */
// class E<T extends Number & Thread> {
// }