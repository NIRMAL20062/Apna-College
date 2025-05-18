/* public class Reversing_Digit {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        int remainder = 0;
        int original = num;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        
        }
        System.out.println(reversed);
}
}

 */
public class Reversing_Digit {
    public static void main(String[] args) {
        int num = 12345;
        while (num > 0) {
            int remainder = num % 10;
            System.out.print(remainder);
            num = num / 10;
        }
}
}