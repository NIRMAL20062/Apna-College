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
}
// ! Working of above code
// if num = 5 (binary 101) and pos = 1, then (num & (1<<pos)) = 00101 & 00001 = 00001 = 1
// So, the bit at position 1 is 1.