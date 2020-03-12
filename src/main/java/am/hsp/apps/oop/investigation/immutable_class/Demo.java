package main.java.am.hsp.apps.oop.investigation.immutable_class;

/**
 * Trials...
 * 
 * @author hripsime
 *
 */
public class Demo {

    public static void main(String[] args) {

        callImmutableStudent();
    }

    public static void callStudent() {
        System.out.println("Demonstraiting a Student:");
        Birthday birthDay = new Birthday(10, 4, 1995);
        Student student = new Student("01A", "Jane", birthDay);
        student.getInfo();

        System.out.println("\n\nChanging the Student id and birth year...");
        student.setId("100B");
        birthDay.setYear(1993);

        System.out.println("\nDemonstrating the Student data after changings: ");
        student.getInfo();
    }

    public static void callImmutableStudent() {
        System.out.println("Demonstraiting an immutable Student:");
        Birthday birthDay = new Birthday(10, 4, 1995);
        ImmutableStudent student = new ImmutableStudent("01A", "Jane", birthDay);
        student.getInfo();

        System.out.println("\n\nChanging the immutable Student birth year...");
       // student.getBirthDay().setYear(1993);
        birthDay.setYear(1993);

        System.out.println("\nDemonstrating the immutable Student data after changings: ");
        student.getInfo();
    }
}
