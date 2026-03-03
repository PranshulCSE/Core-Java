public class fibonacci {
    
    // Recursive method to generate fibonacci number
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        int num = 10;
        
        System.out.println("Fibonacci sequence up to " + num + " terms:");
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}