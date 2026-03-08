// Final class - cannot be extended
final class ImmutableClass {
    private final int id;
    private final String name;
    
    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}

// Regular class with final methods and variables
class Parent {
    // Final variable - cannot be reassigned    
    // Final method - cannot be overridden
    public final void protectedMethod() {
        System.out.println("This method cannot be overridden");
    }
    
    public void normalMethod() {
        System.out.println("This method can be overridden");
    }
}

class Child extends Parent {
    @Override
    public void normalMethod() {
        System.out.println("Overridden normalMethod");
    }
}

public class demo {
    public static void main(String[] args) {
        // Final variable in local scope
        final int finalVar = 100;
        // finalVar = 200; // Error: cannot reassign
        
        System.out.println("Final Variable: " + finalVar);
        
        // Using immutable class
        ImmutableClass obj = new ImmutableClass(1, "John");
        System.out.println("ID: " + obj.getId() + ", Name: " + obj.getName());
        
        // Using parent class
        Parent parent = new Child();
        parent.protectedMethod();
        parent.normalMethod();
    }
}