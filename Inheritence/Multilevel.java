// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class inheriting from Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Main class to test multilevel inheritance
public class Multilevel {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        
        // Accessing methods from all levels
        puppy.eat();      // From Animal class
        puppy.bark();     // From Dog class
        puppy.play();     // From Puppy class
    }
}