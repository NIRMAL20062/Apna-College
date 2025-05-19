
import java.util.*;
public class Q1_Check_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int num = sc.nextInt();
        System.out.println("Is " + num + " even? " + isEven(num));
        System.out.println("Is " + num + " odd? " + isOdd(num));
        System.out.println("Is " + num + " odd? " + CheckEvenOROdd(num));
        System.out.println("Is " + num + " even or odd? " + CheckEvenOROdd(num));
        sc.close();

    }

    public static boolean isEven(int num) {
        return (num & 1) == 0; // Returns true if even, false if odd
    }

    public static boolean isOdd(int num) {
        return (num & 1)!= 0; // Returns true if odd, false if even
    }

    public static String CheckEvenOROdd(int num) {
        if ((num & 1 )==0) {
            return "Even"; // Even
        } else {
            return "Odd"; // Odd
        }
    }
}
