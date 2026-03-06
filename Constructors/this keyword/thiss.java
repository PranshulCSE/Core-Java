public class ThisKeywordDemo {
    
    // Instance variables
    private String name;
    private int age;
    private double salary;
    
    // Constructor using 'this' to refer to instance variables
    public ThisKeywordDemo(String name, int age, double salary) {
        this.name = name;      // 'this.name' refers to instance variable
        this.age = age;        // 'this.age' refers to instance variable
        this.salary = salary;  // 'this.salary' refers to instance variable
    }
    
    // Method using 'this' to refer to current object
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
    
    // Method using 'this' to call another constructor
    public ThisKeywordDemo(String name) {
        this(name, 0, 0.0);  // Calls the main constructor
    }
    
    // Method using 'this' to return current object
    public ThisKeywordDemo getObject() {
        return this;
    }
    
    public static void main(String[] args) {
        ThisKeywordDemo employee = new ThisKeywordDemo("John", 30, 50000);
        employee.display();
        
        ThisKeywordDemo employee2 = new ThisKeywordDemo("Alice");
        employee2.display();
    }
}