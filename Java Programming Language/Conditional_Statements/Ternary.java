import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ternary operator for simple conditional logic
        int var = (5 > 3) ? 5 : 3;
        System.out.println(var); // Output: 5

        // Input to check if a number is even or odd
        System.out.println("Enter a number to check if it is even or odd:");
        int x = sc.nextInt();  // Read input AFTER asking
        String result = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        sc.close(); // Now it's safe to close the scanner
    }
}
