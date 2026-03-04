public class Neww {
    public static void main(String[] args) {
        // Creating object of String class using new keyword
        String str = new String("Hello, World!");
        System.out.println("String: " + str);
        
        // Creating object of Integer class using new keyword
        Integer num = new Integer(42);
        System.out.println("Integer: " + num);
        
        // Creating object of custom class using new keyword
        Person person = new Person("John", 25);
        person.display();
        
        // Creating array using new keyword
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println("Array element: " + arr[0]);
    }
}

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}