// Interface defines the contract (abstraction)
interface Vehicle {
    void start();
    void stop();
    void drive();
}

// Concrete implementation 1
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving on road");
    }
}

// Concrete implementation 2
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike engine started");
    }

    @Override
    public void stop() {
        System.out.println("Bike engine stopped");
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving on road");
    }
}

// Main class
public class I1 {
    public static void main(String[] args) {
        // Using abstraction - we don't need to know internal details
        Vehicle car = new Car();
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        Vehicle bike = new Bike();
        bike.start();
        bike.drive();
        bike.stop();
    }
}