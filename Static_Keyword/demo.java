public class demo {
    // Static variable (class variable)
    static int count = 0;
    static String company = "TechCorp";
    
    // Instance variable
    int employeeId;
    String employeeName;
    
    // Constructor
    public demo(int id, String name) {
        this.employeeId = id;
        this.employeeName = name;
        count++; // Increment static variable
    }
    
    // Static method
    static void displayCompany() {
        System.out.println("Company: " + company);
        // System.out.println(employeeName); // Error: Cannot access instance variable
    }
    
    // Instance method
    void displayEmployee() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName);
        System.out.println("Total Employees: " + count); // Can access static variable
    }
    
    // Static method to get count
    static int getEmployeeCount() {
        return count;
    }
    
    public static void main(String[] args) {
        // Call static method without object
        demo.displayCompany();
        
        // Create objects
        demo emp1 = new demo(101, "Alice");
        demo emp2 = new demo(102, "Bob");
        demo emp3 = new demo(103, "Charlie");
        
        // Call instance methods
        emp1.displayEmployee();
        emp2.displayEmployee();
        
        // Access static variable via class and object
        System.out.println("Total Employees: " + demo.getEmployeeCount());
        System.out.println("Total Employees: " + emp3.count);
    }
}