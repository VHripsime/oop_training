package main.java.am.hsp.apps.oop.investigation.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrating how Comparable works.
 * 
 * @author hripsime
 *
 */
public class DemoComparable {

    public static void main(String[] args) {
        Student firstStudent = new Student("Avetisyan", "Economics", 16);
        Student secondStudent = new Student("Nersisyan", "Geography", 19);
        Student thirdStudent = new Student("Arakelyan", "Mechanics", 20);
        Student forthStudent = new Student("Ghazaryan", "Chemistry", 18);
        Student fifthStudent = new Student("Stepanyan", "Languages", 18);

        List<Student> list = new ArrayList<Student>();
        list.add(firstStudent);
        list.add(secondStudent);
        list.add(thirdStudent);
        list.add(forthStudent);
        list.add(fifthStudent);
        
        printStudents(list);
        
        System.out.println("\nSorting students by their scores in descending order:");
        Collections.sort(list);
        printStudents(list);        
    }

    /**
     * Prints the given student list.
     * 
     * @param list
     */
    private static void printStudents(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
