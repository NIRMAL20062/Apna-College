public class Data_Type {
    public static void main(String[] args) {
        // Primitive Data Types - means they are not objects
        int a = 10;
        float b = 20.5f;
        char c = 'A'; //  NOTE: 'ab' print n karana
        boolean d = true;
        // Non-Primitive Data Types - means they are objects
        String e = "Hello"; // String /end{code}
        // print them
        System.out.println("Primitive Data Types: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        long l = 1000000000L;
        System.out.println(l);
        double d1 = 1000000000.0;
        System.out.println(d1);
        short s = 10000;
        System.out.println(s);

        /* byte bb=128;   // 128 is not a valid byte value. It is out of range for byte data type. It should be in the range of -128 to 127. total 256 values.
        System.out.println(bb); */

        // Q. Sum of a and b
        int ax= 2;
        int bx=3;
        int sum = ax+bx;
        System.out.println(sum);

    }
}
// "A" is a String (double quotes " " are used for Strings).
// 'A' is a char (single quotes ' ' are used for a single character).
// In Java, char can only store a single character inside single quote