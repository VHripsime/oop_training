package main.java.am.hsp.apps.oop.investigation.generics.inheritance.generic_superclass;

/**
 * B uses the type parameter T to support the A superclass. Thus, even if a
 * subclass not need to be generic, it still must specify the type parameter(s)
 * required by its generic superclass. Of course, a subclass is free to add its
 * own type parameters, if needed.
 * 
 * @author hripsime
 *
 * @param <T>
 * @param <V>
 */
public class B<T, V> extends A<T> {

    protected V objectOfTypeV;

    /**
     * Constructor for initializing the instance members by the given inputs.
     * 
     * @param objectOfTypeT
     * @param objectOfTypeV
     */
    public B(T objectOfTypeT, V objectOfTypeV) {
        super(objectOfTypeT);

        this.objectOfTypeV = objectOfTypeV;
    }

    /**
     * Returns the object.
     * 
     * @return
     */
    public V getObjectOfTypeV() {
        return this.objectOfTypeV;
    }
}
