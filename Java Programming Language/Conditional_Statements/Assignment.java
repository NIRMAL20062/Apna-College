import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1: Check if the number is positive or negative
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println("The number is " + result);
        
        // Q2: Check for fever
        System.out.print("Enter your temperature: ");
        double temperature = sc.nextDouble();
        feverCheck(temperature);

        // Close the scanner to avoid memory leaks
        sc.close();
    }

    // Q2: Method to check if the user has a fever
    public static void feverCheck(double temperature) {
        if (temperature > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }

        {int a=63,b=36;boolean x= (a<b)?true:false;int y= (a>b)?a:b;}

    }
}