public class Type_Casting {
    public static void main(String[] args) {
        // Explicit Casting
        int i = 10;
        double d = (double) i; // Explicit casting from int to double
        float f = (float) i; // Explicit casting from double to float
        System.out.println("Explicit Casting: " + d);
        System.out.println("Explicit Casting: " + f);

        char ch='d';
        int a=(int)ch;
        char b= 'e';
        int c=(int)b;
        System.out.println("Explicit Casting: "+a);
        System.out.println("Explicit Casting: "+c);

    }
}
