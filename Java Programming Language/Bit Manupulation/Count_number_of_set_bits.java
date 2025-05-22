public class Count_number_of_set_bits {
    public static void main(String[] args) {
        int num = 15; // Example number
        System.out.println("Number of set bits in " + num + " is: " + countSetBits(num));

        int n = 15; // Example number
        System.out.println("Number of set bits in " + n + " is: " + countSetBitsOptimized(n));
    }
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += (num & 1); // Increment count if the last bit is set
            num >>= 1; // Right shift to check the next bit
        }
        return count;
    }

    public static int countSetBitsOptimized(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1){ // Check if the last bit is set
                count++; // Increment count if the last bit is set
            }
            n = n >> 1; // Right shift to check the next bit
        }
        return count;
    }
    public static int countSetBitsOptimized1(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0){ // Check if the last bit is set
                count++; // Increment count if the last bit is set
            }
            n = n >> 1; // Right shift to check the next bit
        }
        return count;
    }
}

// ! Note: The optimized code is more efficient than the original code as it uses bitwise operators to check the last bit of the number.
// The original code uses logical operators to check the last bit of the number, which is less efficient.
// Todo: explain the working of the code.
//  countSetBitsOptimized(15)  , 15 in binary is 1111, so the last bit is set, so count = 1
//  countSetBitsOptimized(7)   , 7 in binary is 111, so the last bit is set, so count = 1
//  countSetBitsOptimized(3)   , 3 in binary is 11, so the last bit is set, so count = 1
//  countSetBitsOptimized(1)   , 1 in binary is 1, so the last bit is set, so count = 1
//  countSetBitsOptimized(0)   , 0 in binary is 0, so the last bit is not set, so count = 0
//  so the final count is 4.

// here n & 1 = 1111 & 1 = 1, so the last bit is set, so count = 1
// here n = 1111 >> 1 = 1110, so the next bit is checked, and n = 1110, and so on.

// ! n & 1
// = 101
// & 001
// = 001
//   001  → which is 1