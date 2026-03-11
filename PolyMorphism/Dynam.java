// Program to explain Run-time polymorphism

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Dynam {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();
        
        animal1.sound();  // Output: Dog barks
        animal2.sound();  // Output: Cat meows
        animal3.sound();  // Output: Animal makes a sound
    }
}
