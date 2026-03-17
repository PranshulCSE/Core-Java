// Program to explain Immutable classes & objects

public class Demo {

    public static void main(String[] args) {

        Student s = new Student(101, "Pranshul");

        System.out.println("Student ID: " + s.getSid());
        System.out.println("Student Name: " + s.getName());

    }
}

// Immutable class
final class Student {

    private final int sid;
    private final String name;

    // Constructor
    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    // Getter methods only
    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }
}