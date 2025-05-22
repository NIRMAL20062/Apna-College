public class FastExponent {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        System.out.println("Result: " + fastExponent(base, exponent));
    }
    public static int fastExponent(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) { // Check if the last bit is set
                result *= base; // Multiply the result by the base
            }
            base *= base; // Square the base
            exponent >>= 1; // Right shift to check the next bit
        }
        return result;
    }
}
