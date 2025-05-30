public class SumOfAllBinaryString {
    public static void main(String[] args) {
        int n = 3; // Length of the binary string
        System.out.println("Sum of all binary strings of length " + n + ": " + sumBinaryStrings(n, ""));
    }
    // Recursive function to calculate the sum of all binary strings of length n
    public static int sumBinaryStrings(int n, String binaryString) {
        // Base case: if the length of the binary string is equal to n, convert it to an integer and return
        if (binaryString.length() == n) {
            return Integer.parseInt(binaryString, 2);
        }
        
        // Recursive case: either add a 0 or a 1 to the binary string and call the function recursively
        int sum = 0;
        if (binaryString.length() == 0 || binaryString.charAt(binaryString.length() - 1) != '1') {
            sum += sumBinaryStrings(n, binaryString + "0");
        }
        if (binaryString.length() == 0 || binaryString.charAt(binaryString.length() - 1) != '0') {
            sum += sumBinaryStrings(n, binaryString + "1");
        }
        
        return sum;
    }
}
