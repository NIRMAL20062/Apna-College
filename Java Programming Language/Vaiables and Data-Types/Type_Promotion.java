public class Type_Promotion {
    public static void main(String[] args) {

        // 1st Definition
        char a = 'A';
        char b = 'B';

        System.out.println(a);
        System.out.println(b);

        System.out.println((int)a);
        System.out.println((int)b);

        System.out.println(a-b);  // ye huaa type promotion


        // char c = (a - b);
        // System.out.println(c);   // error aayega 😂😂  q ki c is a char variable and a-b is an integer value  


        // 2nd Definition
        int d = 5;
        float e = 5.5f;
        long f = 5L;
        double g = 5.5d;
        double h = d+ e+f+g;
        System.out.println(h);   // Balti wala example yadd kro 
    

        /* byte i = 5;
        byte j=i*2;
        System.out.println(j);  // red error , as  conversion of byte to int is done here byte<int , byte chotti balti hai  */


        byte i = 5;
        byte j=(byte)(i*2);   //ye loh pure ecpression ko byte me convert krne k badd kamm krege 
        System.out.println(j);

        // boring student fall in love daily 
        // this is the acronym of the type conversion in Java
        // byte < short < int < long < float < double
    }
}

// 1. Definition - Promotion in Java -- when we do any arithmetic operation on byte , short , char then java automatically promotes them to int typ
// 2.Defination - Promotion in Java -- If any operand is long , float or double then the other operand is promoted to long , float or double type respectively



