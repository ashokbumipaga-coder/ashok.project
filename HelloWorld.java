// Importing the Scanner class from java.util package (just for demonstration)
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Example usage of imported Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Ashok: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        
        input.close(); // Close the scanner to avoid resource leaks
    }
}
