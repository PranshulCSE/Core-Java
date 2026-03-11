// Program to explain the difference b/w Abstraction & Encapsulation

// Abstraction: Hiding complexity, showing only essential features
abstract class Vehicle {
    abstract void drive();
    abstract void stop();
}

// Encapsulation: Bundling data and methods, controlling access
class Car extends Vehicle {
    private String color;      // Private data
    private int speed;         // Private data
    
    public Car(String color) {
        this.color = color;
        this.speed = 0;
    }
    
    @Override
    void drive() {
        speed = 100;
        System.out.println("Car is driving at " + speed + " km/h");
    }
    
    @Override
    void stop() {
        speed = 0;
        System.out.println("Car stopped");
    }
    
    // Getter - controlled access to private data
    public int getSpeed() {
        return speed;
    }
    
    // Setter - validation before setting private data
    public void setSpeed(int newSpeed) {
        if (newSpeed >= 0 && newSpeed <= 200) {
            speed = newSpeed;
        }
    }
}

public class AVI {
    public static void main(String[] args) {
        Vehicle car = new Car("Red");
        car.drive();      // Only essential methods exposed
        car.stop();
    }
}
