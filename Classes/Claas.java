public class Student {
    // Private variables - can only be accessed within this class
    private String name;
    private int rollNumber;
    private double gpa;
    private String email;
    
    // Public constructor - can be called from anywhere
    public Student(String name, int rollNumber, double gpa, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
        this.email = email;
    }
    
    // Public getter methods - allow controlled access to private variables
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Public setter methods - allow controlled modification
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
    
    // Public method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("GPA: " + gpa);
        System.out.println("Email: " + email);
    }
    
    public static void main(String[] args) {
        // Create student object
        Student student1 = new Student("Raj Kumar", 101, 3.8, "raj@email.com");
        
        // Access using public methods (getters)
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Roll: " + student1.getRollNumber());
        
        // Modify using public methods (setters)
        student1.setGpa(3.9);
        
        // Display all details
        System.out.println("\n--- Student Details ---");
        student1.displayDetails();
        
        // Create another student
        Student student2 = new Student("Priya Singh", 102, 3.6, "priya@email.com");
        System.out.println("\n--- Another Student ---");
        student2.displayDetails();
    }
}