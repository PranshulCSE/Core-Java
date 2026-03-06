public class CallByReference {
    
    // Class to hold an integer value
    static class Wrapper {
        int value;
        
        Wrapper(int value) {
            this.value = value;
        }
    }
    
    // Method that modifies object properties
    static void modifyObject(Wrapper obj) {
        obj.value = 100;
        System.out.println("Inside method: " + obj.value);
    }
    
    // Method that modifies array elements
    static void modifyArray(int[] arr) {
        arr[0] = 999;
        System.out.println("Inside method: " + arr[0]);
    }
    
    public static void main(String[] args) {
        // Example 1: Object reference
        System.out.println("--- Call by Reference (Object) ---");
        Wrapper w = new Wrapper(10);
        System.out.println("Before method: " + w.value);
        modifyObject(w);
        System.out.println("After method: " + w.value);
        
        System.out.println("\n--- Call by Reference (Array) ---");
        int[] numbers = {5, 15, 25};
        System.out.println("Before method: " + numbers[0]);
        modifyArray(numbers);
        System.out.println("After method: " + numbers[0]);
    }
}