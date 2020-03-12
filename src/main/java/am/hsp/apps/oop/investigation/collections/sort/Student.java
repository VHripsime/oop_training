package main.java.am.hsp.apps.oop.investigation.collections.sort;

/**
 * Contains attributes characterizing the students.
 * 
 * @author hripsime
 *
 */
public class Student implements Comparable<Student> {

    private static final String COMMA = ", ";

    private String lastName;
    private String faculty;
    private int score;

    /**
     * Constructor for the members by the given inputs.
     * 
     * @param lastName
     * @param faculty
     * @param score
     */
    public Student(String lastName, String faculty, int score) {
        this.lastName = lastName;
        this.faculty = faculty;
        this.score = score;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Student o) {
        return (o.score - this.score);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return (this.lastName + COMMA + this.faculty + COMMA + this.score);
    }

    /**
     * Returns the last name of the student.
     * 
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the faculty of the student.
     * 
     * @return
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * Returns the score of the student.
     * 
     * @return
     */
    public int getScore() {
        return score;
    }

}
