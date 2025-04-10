import java.util.*;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        decimalToBinary(decimal);
        sc.close();
    }

    public static void decimalToBinary(int decimal) {
        int originalDecimal = decimal; // Store original value for output
        long binary = 0; // Use long to handle larger numbers
        int pow = 0;
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + (remainder * (long) Math.pow(10, pow));
            decimal = decimal / 2;
            pow++;
        }

        System.out.println("Binary representation of " + originalDecimal + " is " + binary);
    }
}