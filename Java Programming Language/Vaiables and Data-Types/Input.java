/* import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input = sc.next();
        System.out.println("Hello, " + input + "!" + "\n" + "How are you?");
        sc.close();
        }
    } */

// Note: closing the Scanner is not necessary, it will be closed when it goes out of scope. if u close it wont take further inputs.


import java.util.*;

public class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Hello " + name);

            // String name = sc.nextLine(); // this will take the whole line
            System.out.println("Enter your name: ");
            String input = sc.nextLine();
            System.out.println("Hello, " + input + "!\nHow are you?");

            System.out.println("Enter an integer: ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);

            System.out.println("Enter a float: ");
            float floatNumber = sc.nextFloat();
            System.out.println("You entered: " + floatNumber);

            int c = number + (int) floatNumber;
            System.out.println("Sum of Both = " + c);

            System.out.println("Enter a double: ");
            double doubleNumber = sc.nextDouble();
            System.out.println("You entered: " + doubleNumber);

            System.out.println("Enter a Float: ");
            float rad = sc.nextFloat();
            float area_of_circle = 3.14f * rad* rad; 
            System.out.println(area_of_circle);
        }
    }
}
// Scanner is a class in java.util package which is used to get user input from the keyboard. Scanner Obj. uses different- different function to capture different types of data-types and store them in variables.

// Examples uges

// if u pass Nirmal Kumar then only Nirmal will be printed and not Nirmal Kumar. because next() function reads only th first word. if u want to read the whole line then use nextLine() function.


// so similarly nextInt() , nextBoolean() and other are below
