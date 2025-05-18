/* public class While {
    public static void main(String[] args) {
        int i = 0;
        int counter =0;
        while (i < 5) {
            System.out.println(i+" ");
            // i++;
            i=++i;
            counter++;
            // i=i++; // isse bhul kar bhi na karna G i hamesa 0 rhega
        }
        // System.out.println("Count is : "+ counter);
        System.out.println("Count is : "+ counter);
}
} */

import java.util.*;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int counter = 0;

        while (i < 5) {
            System.out.print(i + " "); // Print on the same line
            i = ++i; // Increment i
            // i = i++; // This will not work as expected
            counter++;
        }

        System.out.println("\nCount is: " + counter); // Move to the next line

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        // Call the function and print the result
        System.out.println("Sum of first " + x + " natural numbers: " + sum_of_natural(x));

        sc.close(); // Close Scanner to prevent memory leaks
    }

    // Corrected function
    static int sum_of_natural(int n) {
        int sum = 0;
         int i = 1;
        while (i <= n) {
            sum += i; // Shorter way to write sum = sum + i
            i++;
        }
        return sum;
    }
}