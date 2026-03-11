// Abstract class example demonstrating key concepts

// 1. Abstract class definition
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();
    
    abstract void move();
    
    // Concrete method (has implementation)
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// 2. Concrete class implementing abstract class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
    
    @Override
    void move() {
        System.out.println("Dog runs on four legs");
    }
}

// 3. Another concrete class
class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird chirps: Tweet Tweet!");
    }
    
    @Override
    void move() {
        System.out.println("Bird flies in the sky");
    }
}

// 4. Main class to demonstrate
public class ABC {
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Animal animal = new Animal(); // ERROR!
        
        // Create objects of concrete classes
        Animal dog = new Dog();
        Animal bird = new Bird();
        
        // Call methods
        dog.makeSound();  // Dog barks: Woof Woof!
        dog.move();       // Dog runs on four legs
        dog.sleep();      // Animal is sleeping...
        
        System.out.println();
        
        bird.makeSound(); // Bird chirps: Tweet Tweet!
        bird.move();      // Bird flies in the sky
        bird.sleep();     // Animal is sleeping...
    }
}