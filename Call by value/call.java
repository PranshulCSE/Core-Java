public class call {
    
    // Method that modifies the parameter
    public static void modifyValue(int num) {
        num = num + 10;
        System.out.println("Inside method: " + num);
    }
    
    // Method that modifies object reference
    public static void modifyObject(Person person) {
        person.age = person.age + 5;
        System.out.println("Inside method - age modified: " + person.age);
    }
    
    public static void main(String[] args) {
        // Primitive type example
        int value = 20;
        System.out.println("Before method call: " + value);
        modifyValue(value);
        System.out.println("After method call: " + value);
        System.out.println();
        
        // Object example
        Person p = new Person("John", 25);
        System.out.println("Before method call: " + p.age);
        modifyObject(p);
        System.out.println("After method call: " + p.age);
    }
}

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}