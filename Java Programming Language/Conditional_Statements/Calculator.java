import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        // Switch case for different operations
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please enter one of (+, -, *, /, %)");
        }

        sc.close();
    }
}
