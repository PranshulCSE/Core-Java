public class chain {
    private String name;
    private int age;
    private String city;

    // Constructor 1: Default constructor
    public chain() {
        this("Unknown", 0, "Not Specified");
        System.out.println("Default constructor called");
    }

    // Constructor 2: Single parameter constructor
    public chain(String name) {
        this(name, 0, "Not Specified");
        System.out.println("Single parameter constructor called");
    }

    // Constructor 3: Two parameter constructor
    public chain(String name, int age) {
        this(name, age, "Not Specified");
        System.out.println("Two parameter constructor called");
    }

    // Constructor 4: Three parameter constructor (main constructor)
    public chain(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Three parameter constructor called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        System.out.println("--- Constructor Chaining Demo ---\n");
        
        chain obj1 = new chain();
        obj1.display();
        System.out.println();
        
        chain obj2 = new chain("Alice");
        obj2.display();
        System.out.println();
        
        chain obj3 = new chain("Bob", 25);
        obj3.display();
        System.out.println();
        
        chain obj4 = new chain("Charlie", 30, "New York");
        obj4.display();
    }
}