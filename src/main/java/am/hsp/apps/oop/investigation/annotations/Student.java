package main.java.am.hsp.apps.oop.investigation.annotations;

/**
 * Contains main information about a student.
 * 
 * @author user
 *
 */
@MyAnnotation(info = "1st course")
public class Student {

    final int j = 9;

    @MyAnnotation(info = "Mike")
    String name;

    @MyAnnotation(18)
    public int age;

    @OtherAnnotation(description = "from 15 - 17")
    @MyAnnotation()
    Mark GOOD;

    // @MyAnnotation() => Blocks are not allowed to be annotated.
    // {
    // System.out.println("Non-static block");
    // }

    @MyAnnotation(info = "no arg")
    public Student() {
    }

    public Student(@MyAnnotation(info = "about name") String name) {
        this.name = name;
    }

    @MyAnnotation(info = "with args")
    public Student(@MyAnnotation() @OtherAnnotation(description = "first name") String name,
            @OtherAnnotation(description = "about age") int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation(info = "course", value = 2)
    public void getInfo(int i) {
        System.out.println("Studying at University in the " + i + "th building");
    }

    @MyAnnotation(info = "Mike", value = 18)
    @Override
    public String toString() {
        return (this.name + this.age);
    }
}
