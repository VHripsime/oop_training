package main.java.am.hsp.apps.oop.investigation.collections.sort.comparators;

import java.util.Comparator;

import main.java.am.hsp.apps.oop.investigation.collections.sort.Student;

/**
 * Contains a method for comparing two students by their scores.
 * 
 * @author hripsime
 *
 */
public class ScoreComparator implements Comparator<Student> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Student firstStudent, Student secondStudent) {
        return (secondStudent.getScore() - firstStudent.getScore());
    }
}
