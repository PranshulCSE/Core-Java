// Encapsulation Demo with All Access Modifiers

// Public Class - accessible from anywhere
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation with Access Modifiers ===\n");
        
        // Create instance
        Student student = new Student("John", 20, 85.5f);
        
        // Public - accessible from anywhere
        System.out.println("Public field - schoolName: " + student.schoolName);
        
        // Protected - accessible within same package and subclasses
        student.displayProtectedInfo();
        
        // Private - accessible only within the class (via getter/setter)
        System.out.println("Private field - rollNumber (via getter): " + student.getRollNumber());
        student.setRollNumber(101);
        System.out.println("After setter: " + student.getRollNumber());
        
        // Default (Package-private) - accessible only within same package
        System.out.println("Default field - age: " + student.age);
    }
}

// Class demonstrating all access modifiers
class Student {
    
    // PUBLIC - Accessible from anywhere
    public String schoolName = "ABC School";
    
    // PROTECTED - Accessible within same package and by subclasses
    protected String name;
    
    // PRIVATE - Accessible only within this class (Encapsulation)
    private int rollNumber;
    private float gpa;
    
    // DEFAULT/PACKAGE-PRIVATE - Accessible only within same package
    int age;
    
    // Constructor
    public Student(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.rollNumber = 0;
    }
    
    // Getter for private field
    public int getRollNumber() {
        return rollNumber;
    }
    
    // Setter for private field with validation
    public void setRollNumber(int rollNumber) {
        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("Invalid roll number!");
        }
    }
    
    // Getter for private gpa
    public float getGpa() {
        return gpa;
    }
    
    // Protected method - accessible in package and subclasses
    protected void displayProtectedInfo() {
        System.out.println("Protected info - Name: " + name + ", Age: " + age);
    }
    
    // Private method - only accessible within this class
    private void validateData() {
        System.out.println("Data validation in progress...");
    }
}