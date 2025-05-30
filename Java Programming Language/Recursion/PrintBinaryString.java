public class PrintBinaryString {
    public static void main(String[] args) {
        int n = 3; // Length of the binary string
        printBinaryStrings(n, "");
    }
    // ChatGPT
    //w Recursive function to print all binary strings of length n with no consecutive 1s
    public static void printBinaryStrings(int n, String binaryString) {
        if (binaryString.length() == n) {
            System.out.println(binaryString);
            return;
        }

        // Always safe to add '0'
        printBinaryStrings(n, binaryString + "0");

        // Add '1' only if the last character is not '1'
        if (binaryString.length() == 0 || binaryString.charAt(binaryString.length() - 1) != '1') {
            printBinaryStrings(n, binaryString + "1");
        }
    }

    //w Get number of all binary strings of length n considering no consecutive 1s
    public static int getBinaryStringCount(int n) {
        if (n == 0) return 1; // Base case: empty string
        if (n == 1) return 2; // Base case: "0", "1"

        //w Recursive case: count strings ending with '0' and '1'
        return getBinaryStringCount(n - 1) + getBinaryStringCount(n - 2);
    }





    //w APNA College
    public static void PrintBinaryString1(int n, String binaryString) {
        if (n == 0) {
            System.out.println(binaryString);
            return;
        }

        //w Include '0' in the binary string
        PrintBinaryString1(n - 1, binaryString + "0");

        //w Include '1' in the binary string
        PrintBinaryString1(n - 1, binaryString + "1");
    }
}
