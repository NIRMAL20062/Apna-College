public class Power_of_two {
    public static void main(String[] args) {
        int num = 16; // Example number
        System.out.println("Is " + num + " a power of two? " + isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int num) {
        return (num > 0) && ((num & (num - 1)) == 0); // Check if num is positive and only one bit is set
    }
}

// ! Working of above code
// If num = 16 (binary 10000), then (num & (num - 1)) = 10000 & 01111 = 00000 = 0, so it is a power of two.
// take 3 and 4 
// todo: Take and of 3 and 4  = 0000

