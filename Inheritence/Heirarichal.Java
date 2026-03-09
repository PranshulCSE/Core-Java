// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        
        System.out.println("Dog is barking");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Child class 3
class Bird extends Animal {
    void chirp() {
        System.out.println("Bird is chirping");
    }
}

// Main class
public class Heirarichal {
    public static void main(String[] args) {
        // Dog object
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        
        System.out.println();
        
        // Cat object
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.meow();
        
        System.out.println();
        
        // Bird object
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.chirp();
    }
}