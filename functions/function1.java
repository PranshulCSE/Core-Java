public class function1 {
    
    // Simple function without parameters
    public static void greet() {
        System.out.println("Hello! This is a simple function.");
    }
    
    // Function with parameters
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
    
    // Function with return type
    public static int multiply(int x, int y) {
        return x * y;
    }
    
    // Function with multiple parameters and return
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
    
    public static void main(String[] args) {
        // Calling function without parameters
        greet();
        
        // Calling function with parameters
        add(10, 20);
        
        // Calling function with return type
        int result = multiply(5, 4);
        System.out.println("Product: " + result);
        
        // Calling function with multiple parameters
        double average = calculateAverage(10, 20, 30);
        System.out.println("Average: " + average);
    }
}