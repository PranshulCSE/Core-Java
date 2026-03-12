public class Demo {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive to wrapper object
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt;  // Autoboxing
        System.out.println("Autoboxing - primitive int to Integer: " + wrappedInt);

        // Unboxing: Converting wrapper object to primitive
        Integer wrappedValue = 20;
        int primitiveValue = wrappedValue;  // Unboxing
        System.out.println("Unboxing - Integer to primitive int: " + primitiveValue);

        // Autoboxing with other wrapper classes
        double primitiveDouble = 15.5;
        Double wrappedDouble = primitiveDouble;  // Autoboxing
        System.out.println("Autoboxing - double to Double: " + wrappedDouble);

        boolean primitiveBoolean = true;
        Boolean wrappedBoolean = primitiveBoolean;  // Autoboxing
        System.out.println("Autoboxing - boolean to Boolean: " + wrappedBoolean);

        // Autoboxing in Collections
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(5);      // Autoboxing: int to Integer
        numbers.add(10);
        numbers.add(15);
        System.out.println("ArrayList with autoboxing: " + numbers);

        // Unboxing in Collections
        int firstNumber = numbers.get(0);  // Unboxing: Integer to int
        System.out.println("Unboxing from ArrayList: " + firstNumber);

        // Autoboxing in method arguments
        displayNumber(25);  // Autoboxing
        System.out.println("Method call with autoboxing: 25");

        // Null handling (potential NullPointerException)
        Integer nullValue = null;
        try {
            int result = nullValue;  // Unboxing null causes NPE
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException during unboxing of null value");
        }
    }

    // Method expects Integer wrapper class
    static void displayNumber(Integer num) {
        System.out.println("Number received: " + num);
    }
}