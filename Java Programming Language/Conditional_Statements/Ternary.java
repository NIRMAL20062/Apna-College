import java.util.Scanner;

public class Ternary {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int var = (5>3)?5:3;
        System.out.println(var);

        System.out.println("Enter a number to check if it is even or odd");
        int x = sc.nextInt();
        String arr = (x%2==0)?"Even":"Odd";
        System.out.println(arr);

    }
}
