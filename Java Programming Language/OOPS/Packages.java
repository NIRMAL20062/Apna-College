import java.util.Scanner;

public class Packages {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Java Packages example.");
        // Example of using a package
        // Here we are using the Scanner class from the java.util package
        System.out.println("You can use the Scanner class from the java.util package to read input.");
        
    }
}
