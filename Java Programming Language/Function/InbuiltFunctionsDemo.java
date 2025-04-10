import java.util.Arrays;

public class InbuiltFunctionsDemo {
    public static void main(String[] args) {
        // 1. Math Functions
        System.out.println("Math.max(5, 10): " + Math.max(5, 10));
        System.out.println("Math.min(5, 10): " + Math.min(5, 10));
        System.out.println("Math.sqrt(25): " + Math.sqrt(25));
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));

        // 2. String Functions
        String str = "Hello, Java!";
        System.out.println("String length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring (7, 11): " + str.substring(7, 11));

        // 3. Array Functions
        int[] arr = {5, 2, 9, 1};
        Arrays.sort(arr);  // Sorting the array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // 4. Wrapper Class Functions
        int num = Integer.parseInt("123");
        double value = Double.parseDouble("45.67");
        System.out.println("Parsed Integer: " + num);
        System.out.println("Parsed Double: " + value);

        // 5. System Functions
        System.out.println("Printing with System.out.println()");
        
        // Uncomment below line to terminate the program
        // System.exit(0);  
    }
}
