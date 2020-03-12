package main.java.am.hsp.apps.oop.data_structures.list;

/**
 * Contains methods for working with list data structures.
 * 
 * @author hripsime
 *
 */
public interface MyList {

    /**
     * Adds given element to the current data structure.
     * 
     * @param element
     */
    public void add(String element);

    /**
     * Adds given element at the given index in the current data structure.
     * 
     * @param index
     * @param element
     */
    public void add(int index, String element);

    /**
     * Returns the element of the given index.
     * 
     * @param index
     * @return
     */
    public String get(int index);

    /**
     * Returns the elements count of the current data structure.
     * 
     * @return
     */
    public int getSize();

    /**
     * Replaces the element of the given index with the given one.
     * 
     * @param index
     * @param element
     */
    public void set(int index, String element);

    /**
     * Checks whether the current data structure contains the given element.
     * 
     * @param element
     * @return
     */
    public boolean contains(String element);

    /**
     * Removes the element of the given index from the current data structure.
     * 
     * @param index
     */
    public void remove(int index);

    /**
     * Removes the given element from the current data structure.
     * 
     * @param element
     */
    public void remove(String element);

    /**
     * Removes all the elements from the current data structure.
     */
    public void removeAll();

    /**
     * Checks whether the current data structure is empty.
     * 
     * @return
     */
    public boolean isEmpty();
}
