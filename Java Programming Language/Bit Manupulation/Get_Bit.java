import java.util.Scanner;

public class Get_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter the position of the bit to get:");
        int pos = sc.nextInt();
        int bit = getBit(num, pos);
        System.out.println("The bit at position " + pos + " is " + bit);
        sc.close();
        System.out.println("Pinky");
    }

    public static int getBit(int num, int pos) {
        if ((num & (1<<pos)) != 0) {  
            return 1; // Right shift num by pos and AND with 1
    }else         {
            return 0; // If the bit is 0, return 0
        }
    }
    public static int setBit(int num, int pos) {
        return num | (1<<pos); // OR with 1 shifted left by pos
    }

    public static int clearBit(int num, int pos) {
        return num & ~(1<<pos); // AND with NOT of 1 shifted left by pos
    }

    public static int updateBit(int num, int pos, int bit) {
        if (bit == 0) {
            return clearBit(num, pos); // Clear the bit at pos
        } else {
            return setBit(num, pos); // Set the bit at pos
        }
    }

    public static int updateBit2(String[] args) {
        // short implementation using bitwise operators
        int num = Integer.parseInt(args[0]);
        int pos = Integer.parseInt(args[1]);
        int bit = Integer.parseInt(args[2]);
        return (bit == 0)? (num & ~(1 << pos)) : (num | (1 << pos));
        
        
    }

    public static int Clear_Last_I_Bit(int num) {
        // Clear last i bits of a number
        int i = 3; // Number of bits to clear
        return num & (~0 << i); // AND with NOT of 0 shifted left by i
    }

    public static int Set_Last_I_Bit(int num, int i) {
        // Set last i bits of a number
        return num | ((1 << i) - 1); // OR with (1 shifted left by i) - 1
    }


    public static int clear_bit_in_range(int num, int i, int j) {
        // Clear bits from i to j (inclusive)
        int a = (~0) << (j + 1); // Create mask for bits before j
        int b = (1 << i) - 1; // Create mask for bits after i
        return num & (a | b); // AND with the masks
    }

    public static int set_bit_in_range(int num, int i, int j) {
        // Set bits from i to j (inclusive)
        int a = (~0) << (j + 1); // Create mask for bits before j
        int b = (1 << i) - 1; // Create mask for bits after i
        return num | (a | b); // OR with the masks
    }


}
// ! Working of above code
// todo if num = 5 (binary 101) and pos = 1, then (num & (1<<pos)) = 00101 & 00001 = 00001 = 1
