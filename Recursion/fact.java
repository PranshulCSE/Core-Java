public class fact {
    
    // Method to calculate factorial using recursion
    static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}