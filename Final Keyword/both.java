public class both {
    // Static final variable - constant that belongs to class
    static final double PI = 3.14159;
    
    // Static final variable - immutable class-level constant
    static final String APP_NAME = "MyApplication";
    
    // Static final method - cannot be overridden
    static final void printInfo() {
        System.out.println("App: " + APP_NAME);
        System.out.println("Pi Value: " + PI);
    }
    
    // Instance final variable - must be initialized
    final int maxAttempts = 5;
    
    public static void main(String[] args) {
        // Access static final variables without object
        System.out.println("PI = " + PI);
        System.out.println("APP_NAME = " + APP_NAME);
        
        // Call static final method
        printInfo();
        
        // Create object to access instance final
        both obj = new both();
        System.out.println("Max Attempts: " + obj.maxAttempts);
        
        // PI = 3.5;  // Error: cannot reassign final variable
    }
}