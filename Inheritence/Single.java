// Single Inheritance Example - A child class inherits from one parent class

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to demonstrate single inheritance
public class Single {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling inherited methods from Animal class
        dog.eat();
        dog.sleep();
        
        // Calling Dog's own method
        dog.bark();
    }
}