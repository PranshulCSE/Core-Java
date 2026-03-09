// Parent class
class Animal {
    String name = "Animal";
    
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";
    
    void eat() {
        System.out.println("Dog is eating");
    }
    
    void display() {
        // Access parent class variable
        System.out.println(super.name);
        
        // Call parent class method
        super.eat();
        
        // Access child class variable
        System.out.println(name);
        this.eat();
    }
}

// Main class
public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}