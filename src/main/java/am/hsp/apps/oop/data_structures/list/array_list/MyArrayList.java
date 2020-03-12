package main.java.am.hsp.apps.oop.data_structures.list.array_list;

import java.util.Arrays;

import main.java.am.hsp.apps.oop.data_structures.list.MyList;

/**
 * Contains methods allowing to work with objects in an ordered collection.
 * 
 * @author hripsime
 *
 */
public class MyArrayList implements MyList {

    private static final int DEFAULT_SIZE = 16;
    private static final double GROWTH_FACTOR = 1.5;
    private static final int COUNT_OF_EMPTY_ARRAY_ELEMENTS = 0;
    private static final String MESSAGE_FOR_INVALID_INDEX = "There is no element with the given index.";

    private String[] array;
    private int size;

    /**
     * The default constructor.
     */
    public MyArrayList() {
        this.array = new String[DEFAULT_SIZE];
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.data_structures.list.MyList#add(java.lang.String)
     */
    public void add(String element) {
        if (size == array.length) {
            enlargeArray();
        }

        array[size++] = element;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#add(int,
     * java.lang.String)
     */
    public void add(int index, String element) {
        validate(index);

        if (isArrayFull()) {
            enlargeArray();
        }

        moveElementsToRight(index, size - 1);
        array[index] = element;
        size++;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#get(int)
     */
    public String get(int index) {
        validate(index);

        return array[index];
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#getSize()
     */
    public int getSize() {
        return size;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#set(int,
     * java.lang.String)
     */
    public void set(int index, String element) {
        validate(index);

        array[index] = element;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.data_structures.list.MyList#contains(java.lang.
     * String)
     */
    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
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

        moveElementsToLeft(index + 1, size - 1);
        size--;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#remove(java.lang.
     * String)
     */
    public void remove(String element) {
        int countOfRemovedElements = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                moveElementsToLeft(i + 1, size - 1);
                countOfRemovedElements++;
                i--;
            }
        }

        size -= countOfRemovedElements;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#removeAll()
     */
    public void removeAll() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }

        size = COUNT_OF_EMPTY_ARRAY_ELEMENTS;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.list.MyList#isEmpty()
     */
    public boolean isEmpty() {
        return (size == COUNT_OF_EMPTY_ARRAY_ELEMENTS);
    }

    /**
     * Prints the array.
     */
    public String toString() {
        StringBuilder elements = new StringBuilder();

        for (int i = 0; i < size; i++) {
            elements = elements.append(array[i] + " ");
        }

        return elements.toString();
    }

    /**
     * Enlarges the array by the given growth factor.
     */
    private void enlargeArray() {
        this.array = Arrays.copyOf(array, getNewLength());
    }

    /**
     * Returns the length for the enlarged array.
     * 
     * @return
     */
    private int getNewLength() {
        return (int) (size * GROWTH_FACTOR);
    }

    /**
     * Moves the elements of the given indexes to the right.
     * 
     * @param startIndex
     * @param endIndex
     */
    private void moveElementsToRight(int startIndex, int endIndex) {
        for (int i = endIndex; i >= startIndex; i--) {
            array[i + 1] = array[i];
        }
    }

    /**
     * Moves the elements of the given indexes to the left.
     * 
     * @param startIndex
     * @param endIndex
     */
    private void moveElementsToLeft(int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            array[i - 1] = array[i];
        }

        array[endIndex] = null;
    }

    /**
     * Validates the given index, if it's invalid shows a message to the user.
     * 
     * @param index
     */
    private void validate(int index) {
        if (isIndexOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(MESSAGE_FOR_INVALID_INDEX);
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
     * Returns whether the array is full.
     * 
     * @return
     */
    private boolean isArrayFull() {
        return (size == array.length);
    }
}