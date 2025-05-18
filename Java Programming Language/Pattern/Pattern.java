import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // STAR- PRINT
        /* System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
            System.out.print('*');
        }
        System.out.println();
        } */

        // Inverted-STAR
        /* System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for (int j=i; j>0; j--){
            System.out.print('*');
        }
        System.out.println();
        } */


        // PYRAMID    
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
                }
                for(int k=0; k<=i; k++){
                    System.out.print("* ");
                    }
                    System.out.println();
                    }
        sc.close();

        // Half Pyramid
        /* System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
                }
            System.out.println();
        } */

        // Character Pyramid
        /* String s = "ABCDEFG";
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(s.charAt(j)+" ");
                }
                System.out.println();
                } */

        /* String s = "ABCDEFG";
        for(int i=0; i<s.length(); i++){
                System.out.print(s.charAt(0)+" ");
                System.out.print(s.charAt(i)+" ");
                // System.out.println();
                } */
        
        // "A" is a String (double quotes " " are used for Strings).

        // 'A' is a char (single quotes ' ' are used for a single character).

        /* char ch = 'A';
        System.out.println(ch);       // Prints A
        System.out.println(ch + 1);   // Prints 66 (65 + 1)
        System.out.println((char)(ch + 1));  // Prints B */

        /* char ch = 'A';
        ch++;
        System.out.println(ch);       // Prints B
        ++ch;
        System.out.println(ch);       // Prints C */

        /* System.out.println("Enter Number of ROWS you Want : ");
        int n = sc.nextInt();
        for(int i = 0 ; i<=n; i++){
            char ch ='A';
            for(int j = 1 ; j<=i; j++){
            
                System.out.print(ch);
                ch++;
        }
        System.out.println();
    } */
}
}