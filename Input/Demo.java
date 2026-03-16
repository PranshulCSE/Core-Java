import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {
            // Using InputStreamReader
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String ageStr = br.readLine();
            int age = Integer.parseInt(ageStr);

            System.out.println("Hello, " + name + ". You are " + age + " years old.");

            br.close();
            isr.close();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}