package main.java.am.hsp.apps.oop.data_structures.list.linked_list;

/**
 * Contains attributes necessary for keeping an object into a node.
 * 
 * @author hripsime
 *
 */
public class Node {

    private String element;
    private Node next;

    /**
     * The default constructor.
     */
    public Node() {
    }

    /**
     * Constructor for initializing its' member by the given element.
     * 
     * @param element
     */
    public Node(String element) {
        this.element = element;
    }

    /**
     * Returns the element.
     * 
     * @return
     */
    public String getElement() {
        return element;
    }

    /**
     * Sets the elements value by the given one.
     * 
     * @param element
     */
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * Returns the next node.
     * 
     * @return
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the node by the given one.
     * 
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

}
