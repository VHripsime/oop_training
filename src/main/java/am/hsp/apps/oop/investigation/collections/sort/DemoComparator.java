package main.java.am.hsp.apps.oop.investigation.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.am.hsp.apps.oop.investigation.collections.sort.comparators.FacultyComparator;
import main.java.am.hsp.apps.oop.investigation.collections.sort.comparators.NameComparator;
import main.java.am.hsp.apps.oop.investigation.collections.sort.comparators.ScoreComparator;

/**
 * Demonstrating how Comparator works.
 * 
 * @author hripsime
 *
 */
public class DemoComparator {

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

        System.out.println("Our students list before any type of sorting:");
        printStudents(list);

        System.out.println("\nSorting students by their scores in descending order:");
        Collections.sort(list, new ScoreComparator());
        printStudents(list);

        System.out.println("\nSorting students by their faculties:");
        Collections.sort(list, new FacultyComparator());
        printStudents(list);

        System.out.println("\nSorting students by their last names:");
        Collections.sort(list, new NameComparator());
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
