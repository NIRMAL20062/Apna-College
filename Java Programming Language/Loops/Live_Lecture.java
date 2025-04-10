import java.util.Scanner;

public class Live_Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        // Q1.
        /* System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int odd = 0, even = 0;
        System.out.println("Enter " + n + " numbers:");
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
        
        sc.close(); */

        // Q2. Factorial
        /* System.out.print("Enter the number: ");
        int num = sc.nextInt(); 
        int factorial = 1; // Initialize factorial as 1
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiply i with factorial
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        sc.close();  */

        // /* Q3. Prime Number
        
       /*  System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("2 is a prime number");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
        
        sc.close(); */


    }
}
