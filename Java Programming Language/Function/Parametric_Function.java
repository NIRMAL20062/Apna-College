import java.util.*;

public class Parametric_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int m = sc.nextInt();
        
        // Store the sum in a variable and print it in main
        int result = SumX(n, m); // argument
        System.out.println("Sum of two numbers is: " + result);
        
        sc.close();
    }

    public static int SumX(int num1, int num2) {
        return num1 + num2; // Just return the sum, no print statement here
    }  // parametric function 


    // To swap two numbers
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, a = " + a + " and b = " + b);
        }


}
