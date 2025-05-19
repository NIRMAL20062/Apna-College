public class Bit_Wise_Operators {
    public static void main(String[] args) {
        // Example usage of bitwise operators
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        System.out.println("a & b: " + (a & b)); // Bitwise AND
        System.out.println("a | b: " + (a | b)); // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR
        System.out.println("~a: " + (~a));       // Bitwise NOT
        System.out.println("a << 1: " + (a << 1)); // Left shift
        System.out.println("a >> 1: " + (a >> 1)); // Right shift
    }
}


// ! NOTE: Working of Bitwise Operators
// ? 1. Bitwise AND (&): Compares each bit of two numbers and returns a new number with bits set to 1 where both bits are 1.
// Example: 5 & 3 = 1 (0101 & 0011 = 0001)

// ? 2. Bitwise OR (|): Compares each bit of two numbers and returns a new number with bits set to 1 where at least one bit is 1.
// Example: 5 | 3 = 7 (0101 | 0011 = 0111)

// ? 3. Bitwise XOR (^): Compares each bit of two numbers and returns a new number with bits set to 1 where the bits are different.
// Example: 5 ^ 3 = 6 (0101 ^ 0011 = 0110)

// ? 4. Bitwise NOT (~): Inverts the bits of a number, changing 1s to 0s and 0s to 1s.
// Example: ~5 = -6 (In binary, this is the two's complement representation of -6)
// working of bitwise NOT is that it flips all the bits of the number.
// For example, if the binary representation of 5 is 0101, then the bitwise NOT of 5 will be 1010, which is -6 in two's complement representation.
// more details: then 1010 is subtracted from 1111 (all 1s) to get 0000, which is the two's complement representation of -6.

// ? 5. Left Shift (<<): Shifts the bits of a number to the left by a specified number of positions, filling the rightmost bits with 0s.
// Example: 5 << 1 = 10 (0101 << 1 = 1010)
// This is equivalent to multiplying the number by 2 for each shift.

// ? 6. Right Shift (>>): Shifts the bits of a number to the right by a specified number of positions, filling the leftmost bits with the sign bit (0 for positive numbers, 1 for negative numbers).
// Example: 5 >> 1 = 2 (0101 >> 1 = 0010)
// This is equivalent to dividing the number by 2 for each shift, rounding towards negative infinity.

// ? 7. Unsigned Right Shift (>>>): Shifts the bits of a number to the right by a specified number of positions, filling the leftmost bits with 0s regardless of the sign bit.
// Example: -5 >>> 1 = 2147483645 (In binary, this is the unsigned representation of the number)
// This is equivalent to dividing the number by 2 for each shift, rounding towards zero.

// ? 8. Bitwise Complement (~): Inverts the bits of a number, changing 1s to 0s and 0s to 1s.
// Example: ~5 = -6 (In binary, this is the two's complement representation of -6)
// This operator is often used to find the bitwise negation of a number.

