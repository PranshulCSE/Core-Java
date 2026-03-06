public class param {
    private String name;
    private int age;
    private double salary;

    // Parametrized constructor
    public param(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating objects using parametrized constructor
        param emp1 = new param("John", 25, 50000);
        param emp2 = new param("Alice", 30, 60000);

        System.out.println("Employee 1:");
        emp1.display();

        System.out.println("\nEmployee 2:");
        emp2.display();
    }
}