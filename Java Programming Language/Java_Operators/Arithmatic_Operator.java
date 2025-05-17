public class Arithmatic_Operator {
    public static void main(String[] args) {

        /* int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition of a and b is: "+c); */


        /* int a = 10;
        // int b = a++;
        int b = ++a;      // Note: Ye Yadd Rakho
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b); */

        
       /*  int a = 10;
        int b = a--;
        // int b = --a;      // Note: Ye Yadd Rakho pre and post decrement
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b); */

}
}

//     a/b   ---  Division    jisme do variable usko binary operators
//     a%b   ---  Remainder
//     a++   ---  Increment   jisme ek variable usko Unary operators
//     --a   ---  Decrement

/* 
Version 1: int b = a++; (Post-increment)
Initial value: a = 10

b = a++ means:

First, assign a's current value (10) to b
Then, increment a (so now a becomes 11) 

b = 10
a = 11
*/

/*
✅ Version 2: int b = ++a; (Pre-increment)
Initial value: a = 10

b = ++a means:

First, increment a (so now a becomes 11)
Then, assign a's value (11) to b

Final values:
b = 11
a = 11
*/