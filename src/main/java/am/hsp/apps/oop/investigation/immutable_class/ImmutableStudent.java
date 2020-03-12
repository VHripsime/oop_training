package main.java.am.hsp.apps.oop.investigation.immutable_class;

/**
 * Making the class immutable:
 * 
 * 1. make class final -> no other class can extend it. 2. make fields final ->
 * they're initialized only once. 3. don't create setter methods.
 * 
 * 
 * @author hripsime
 *
 */
public final class ImmutableStudent {

    private final String name;
    private final String id;
    private final Birthday birthDay;

    public ImmutableStudent(String id, String name, Birthday birthDay) {
        this.name = name;
        this.id = id;

        Birthday clonedBirthDay = new Birthday(birthDay.getDay(), birthDay.getMonth(), birthDay.getYear());
        this.birthDay = clonedBirthDay;
    }

    public void getInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.print("Birthday: " + this.birthDay.getDay() + "/");
        System.out.print(this.birthDay.getMonth() + "/");
        System.out.print(this.birthDay.getYear());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Birthday getBirthDay() {
        Birthday clonedBirthDay = new Birthday(birthDay.getDay(), birthDay.getMonth(), birthDay.getYear());

        return clonedBirthDay;
    }
}
