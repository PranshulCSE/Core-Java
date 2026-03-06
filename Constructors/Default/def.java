// Example 1: Class without explicit constructor
class Student {
    String name;
    int rollNo;
    
    // Default constructor (implicitly provided by Java)
    // Initializes variables to default values
}

// Example 2: Class with explicit default constructor
class Car {
    String model;
    int year;
    
    // Explicit default constructor
    public Car() {
        model = "Unknown";
        year = 0;
        System.out.println("Default constructor called");
    }
}

// Example 3: Demonstrating default constructor behavior
class Book {
    String title;
    double price;
    
    public Book() {
        title = "No Title";
        price = 0.0;
    }
}

public class def {
    public static void main(String[] args) {
        // Creating objects using default constructor
        Student s = new Student();
        System.out.println("Student name: " + s.name); // null
        System.out.println("Student rollNo: " + s.rollNo); // 0
        
        Car c = new Car(); // Calls explicit default constructor
        System.out.println("Car model: " + c.model);
        
        Book b = new Book();
        System.out.println("Book title: " + b.title);
        System.out.println("Book price: " + b.price);
    }
}
