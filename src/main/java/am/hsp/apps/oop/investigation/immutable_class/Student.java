package main.java.am.hsp.apps.oop.investigation.immutable_class;

/**
 * A simple Student class.
 * 
 * @author user
 *
 */
public class Student {

    private String name;
    private String id;
    private Birthday birthDay;

    public Student(String id, String name, Birthday birthDay) {
        this.name = name;
        this.id = id;
        this.birthDay = birthDay;
    }

    public void getInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.print("Birthday: " + this.birthDay.getDay() + "/");
        System.out.print(this.birthDay.getMonth() + "/");
        System.out.print(this.birthDay.getYear());
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Birthday getAge() {
        return this.birthDay;
    }

    public void setBirthDay(Birthday birthDay) {
        this.birthDay = birthDay;
    }
}
