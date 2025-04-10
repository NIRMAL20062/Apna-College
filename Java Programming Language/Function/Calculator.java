public class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }

    // Method to add two float values
    float add(float a, float b) {
        System.out.println("Adding two floats: " + a + " + " + b);
        return a + b;
    }

    // Method to add an integer and a double
    double add(int a, double b) {
        System.out.println("Adding integer and double: " + a + " + " + b);
        return a + b;
    }

    // Method to add a double and an integer (different parameter order)
    double add(double a, int b) {
        System.out.println("Adding double and integer: " + a + " + " + b);
        return a + b;
    }

    // Method to concatenate two strings
    String add(String a, String b) {
        System.out.println("Concatenating two strings: \"" + a + "\" + \"" + b + "\"");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Result: " + calc.add(10, 20));          // int, int
        System.out.println("Result: " + calc.add(10, 20, 30));      // int, int, int
        System.out.println("Result: " + calc.add(5.5, 2.2));        // double, double
        System.out.println("Result: " + calc.add(3.3f, 7.2f));      // float, float
        System.out.println("Result: " + calc.add(10, 3.5));         // int, double
        System.out.println("Result: " + calc.add(5.5, 2));          // double, int
        System.out.println("Result: " + calc.add("Hello", " Java")); // String, String
    }
}
