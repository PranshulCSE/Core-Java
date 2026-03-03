public class MO {
    
    // Method 1: add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: add three integers (different number of parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: add two doubles (different parameter types)
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method 4: add int and double (different parameter types)
    public double add(int a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MO obj = new MO();
        
        System.out.println("Adding two integers: " + obj.add(10, 20));
        System.out.println("Adding three integers: " + obj.add(10, 20, 30));
        System.out.println("Adding two doubles: " + obj.add(10.5, 20.5));
        System.out.println("Adding int and double: " + obj.add(10, 20.5));
    }
}