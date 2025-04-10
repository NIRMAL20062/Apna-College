public class Binary_To_Decimal {
    public static void main(String[] args) {
        DecimalConversion(101); // This will correctly output 5
    }

    public static void DecimalConversion(int binaryNumber) {
        int pow = 0;
        int decimalNumber = 0;
        int originalBinary = binaryNumber; // Store original for output
        
        while (binaryNumber > 0) {
            int remainder = binaryNumber % 10;
            decimalNumber += remainder * (int) Math.pow(2, pow);
            binaryNumber /= 10;
            pow++;
        }
        
        System.out.println("Decimal of " + originalBinary + " is: " + decimalNumber);
    }
}