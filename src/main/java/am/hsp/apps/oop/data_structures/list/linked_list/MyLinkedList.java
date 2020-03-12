package main.java.am.hsp.apps.oop.data_structures.list.linked_list;

import main.java.am.hsp.apps.oop.data_structures.list.MyList;

/**
 * Contains methods for working with a collection of String objects, which are
 * connected to each other.
 * 
 * @author hripsime
 *
 */
public class MyLinkedList implements MyList {

    private static final int COUNT_OF_EMPTY_LIST_ELEMENTS = 0;
    private static final String MESSAGE = "The index is invalid.";

    private Node first;
    private int size;

    /**
     * The default constructor.
     */
    public MyLinkedList() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.data_structures.list.MyList#add(java.lang.String)
     */
    public void add(String element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            first = newNode;
        } else {
            insertAtEnd(newNode);
        }

        size++;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#add(int,
     * java.lang.String)
     */
    public void add(int index, String element) {
        validateForAddition(index);

        Node newNode = new Node(element);
        insert(index, newNode);

        size++;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#get(int)
     */
    public String get(int index) {
        validate(index);

        return getNode(index).getElement();
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#set(int,
     * java.lang.String)
     */
    public void set(int index, String element) {
        validate(index);

        getNode(index).setElement(element);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.data_structures.list.MyList#contains(java.lang.
     * String)
     */
    public boolean contains(String element) {
        Node currentNode = first;

        while (currentNode != null) {
            if (currentNode.getElement().equals(element)) {
                return true;
            }

            currentNode = currentNode.getNext();
        }

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#remove(int)
     */
    public void remove(int index) {
        validate(index);
        removeByIndex(index);

        size--;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#remove(java.lang.
     * String)
     */
    public void remove(String element) {
        Node current = first;
        int count = -1;

        while (current != null) {
            count++;

            if (current.getElement().equals(element)) {
                current = current.getNext();
                removeByIndex(count--);
                size--;
            } else {
                current = current.getNext();
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#removeAll()
     */
    public void removeAll() {
        Node current = first.getNext();

        while (current != null) {
            first.setNext(null);
            first = current;
            current = current.getNext();
        }

        first = null;
        size = COUNT_OF_EMPTY_LIST_ELEMENTS;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#isEmpty()
     */
    public boolean isEmpty() {
        return (size == COUNT_OF_EMPTY_LIST_ELEMENTS);
    }

    /**
     * Prints the elements of the linked list.
     */
    public String toString() {
        StringBuilder elements = new StringBuilder();
        Node current = first;

        while (current != null) {
            elements = elements.append(current.getElement() + " ");
            current = current.getNext();
        }

        return elements.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#getSize()
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Returns the Node of the given index.
     * 
     * @param index
     * @return
     */
    private Node getNode(int index) {
        Node required = first;
        int count = 0;

        while (count != index) {
            required = required.getNext();
            count++;
        }

        return required;
    }

    /**
     * Inserts the given node at the given index.
     * 
     * @param index
     * @param node
     */
    private void insert(int index, Node node) {
        if (index == 0) {
            insertAtBeginning(node);
        } else if (index == size) {
            insertAtEnd(node);
        } else {
            insertAtMiddle(index, node);
        }
    }

    /**
     * Inserts the given node at the beginning of the list.
     * 
     * @param node
     */
    private void insertAtBeginning(Node node) {
        node.setNext(first);
        first = node;
    }

    /**
     * Inserts the given node at the given index of the list.
     * 
     * @param node
     */
    private void insertAtMiddle(int index, Node node) {
        Node previous = getNode(index - 1);
        Node nextNode = previous.getNext();
        previous.setNext(node);
        node.setNext(nextNode);
    }

    /**
     * Inserts the given node at the end of the list.
     * 
     * @param node
     */
    private void insertAtEnd(Node node) {
        Node last = getNode(size - 1);
        last.setNext(node);
    }

    /**
     * Removes the node of the given index.
     * 
     * @param index
     */
    private void removeByIndex(int index) {
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            removeFromMiddle(index);
        }
    }

    /**
     * Removes the first node.
     */
    private void removeFirst() {
        Node second = first.getNext();
        first.setNext(null);
        first = second;
    }

    /**
     * Removes the element of the given index from the list.
     * 
     * @param index
     */
    private void removeFromMiddle(int index) {
        Node previous = getNode(index - 1);
        Node current = previous.getNext();
        Node nextNode = previous.getNext().getNext();

        previous.setNext(nextNode);
        current.setNext(null);
    }

    /**
     * Removes the last node.
     */
    private void removeLast() {
        if (size == 1) {
            first = null;
        } else {
            getNode(size - 2).setNext(null);
        }

        size--;
    }

    /**
     * Validates the given index, if it's invalid shows a message to the user.
     * 
     * @param index
     */
    private void validate(int index) {
        if (isIndexOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(MESSAGE);
        }
    }

    /**
     * Validates the given index for adding a node, if it's invalid shows a message
     * to the user.
     * 
     * @param index
     */
    private void validateForAddition(int index) {
        if (isIndexOutOfBoundsForAddition(index)) {
            throw new IndexOutOfBoundsException(MESSAGE);
        }
    }

    /**
     * Checks whether the index is out of the bounds.
     * 
     * @param index
     * @return
     */
    private boolean isIndexOutOfBounds(int index) {
        return (index < 0 || index >= size);
    }

    /**
     * Checks whether the index for addition is out of the bounds.
     * 
     * @param index
     * @return
     */
    private boolean isIndexOutOfBoundsForAddition(int index) {
        return (index < 0 || index > size);
    }
}
